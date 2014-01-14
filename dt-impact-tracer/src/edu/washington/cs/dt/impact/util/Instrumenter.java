package edu.washington.cs.dt.impact.util;
/*
 * InvokeStaticInstrumenter inserts count instructions before
 * INVOKESTATIC bytecode in a program. The instrumented program will
 * report how many static invocations happen in a run.
 *
 * Goal:
 *   Insert counter instruction before static invocation instruction.
 *   Report counters before program's normal exit point.
 *
 * Approach:
 *   1. Create a counter class which has a counter field, and
 *      a reporting method.
 *   2. Take each method body, go through each instruction, and
 *      insert count instructions before INVOKESTATIC.
 *   3. Make a call of reporting method of the counter class.
 *
 * Things to learn from this example:
 *   1. How to use Soot to examine a Java class.
 *   2. How to insert profiling instructions in a class.
 */

/* InvokeStaticInstrumenter extends the abstract class BodyTransformer,
 * and implements <pre>internalTransform</pre> method.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import soot.Body;
import soot.BodyTransformer;
import soot.Local;
import soot.PatchingChain;
import soot.RefType;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.Type;
import soot.Unit;
import soot.jimple.IdentityStmt;
import soot.jimple.InvokeExpr;
import soot.jimple.Jimple;
import soot.jimple.RetStmt;
import soot.jimple.ReturnStmt;
import soot.jimple.ReturnVoidStmt;
import soot.jimple.Stmt;
import soot.jimple.StringConstant;
import soot.tagkit.AnnotationTag;
import soot.tagkit.LineNumberTag;
import soot.tagkit.VisibilityAnnotationTag;
import soot.util.Chain;
import edu.washington.cs.dt.impact.util.Constants.TECHNIQUE;

public class Instrumenter extends BodyTransformer{

    /* some internal fields */
    static SootClass tracerClass;
    static SootMethod trace, output, reset;
    private static final String JUNIT4_TAG = "VisibilityAnnotationTag";
    private static final String JUNIT4_TYPE = "Lorg/junit/Test;";
    private static final String JUNIT3_CLASS = "junit.framework.TestCase";
    private static final String JUNIT3_RETURN = "void";
    private static final String JUNIT3_METHOD_PREFIX = "test";
    private static TECHNIQUE technique = Constants.DEFAULT_TECHNIQUE;

    static {
        tracerClass    = Scene.v().loadClassAndSupport("edu.washington.cs.dt.impact.util.Tracer");
        trace = tracerClass.getMethodByName("trace");
        output   = tracerClass.getMethodByName("output");
        reset   = tracerClass.getMethodByName("reset");
    }

    public Instrumenter() {
    }

    public Instrumenter(TECHNIQUE t) {
        technique = t;
    }

    /* internalTransform goes through a method body and inserts
     * counter instructions before an INVOKESTATIC instruction
     */
    @Override
    protected void internalTransform(Body body, String phase, Map options) {
        // body's method
        SootMethod method = body.getMethod();

        if (method.getName().equals("<init>") || method.getName().equals("<clinit>")) {
            return;
        }

        boolean isJUnit4 = false;
        VisibilityAnnotationTag vat = (VisibilityAnnotationTag) method.getTag(JUNIT4_TAG);
        if (vat != null) {
            List<AnnotationTag> tags = vat.getAnnotations();
            for (AnnotationTag at : tags) {
                isJUnit4 = at.getType().equals(JUNIT4_TYPE);
                if (isJUnit4) {
                    break;
                }
            }
        }

        boolean isJUnit3 = false;
        if (!isJUnit4 && method.getName().length() > 3) {
            String retType = method.getReturnType().toString();
            String name = method.getName().substring(0, 4);
            boolean extendsJUnit = false;
            SootClass superClass = method.getDeclaringClass().getSuperclass();
            while(superClass.hasSuperclass()) {
                if (superClass.getName().equals(JUNIT3_CLASS)) {
                    extendsJUnit = true;
                    break;
                }
                superClass = superClass.getSuperclass();
            }
            isJUnit3 = method.isPublic() && retType.equals(JUNIT3_RETURN)
                    && extendsJUnit && name.equals(JUNIT3_METHOD_PREFIX);
        }

        // get body's unit as a chain
        Chain<Unit> units = body.getUnits();

        // get a snapshot iterator of the unit since we are going to
        // mutate the chain when iterating over it.
        Iterator<Unit> stmtIt = units.snapshotIterator();

        if (isJUnit4 || isJUnit3) {
            // label0:
            //   ... (method body -- before final return)
            // label1:
            //   goto label3
            // label2:
            //   local1 := @caughtexception;
            //   local1.printStackTrace(System.out);
            // label3:
            //   return  (end of old method body)
            //
            // catch java.lang.Throwable from label0 to label1 with label2;

            // get access to Throwable class and toString method
            SootClass thrwCls = Scene.v().getSootClass("java.lang.Throwable");
            //            SootMethod initThrow = thrwCls.getMethod("java.lang.Throwable initCause(java.lang.Throwable)");

            // create probe from label1 to label3 (excluding return)
            List<Stmt> probe = new ArrayList<Stmt>();
            PatchingChain<Unit> pchain = body.getUnits();

            Stmt sFirstNonId = getFirstNonIdStmt(pchain);
            Stmt sLast = (Stmt) pchain.getLast();

            // Don't instrument empty methods
            if (sFirstNonId == sLast) {
                return;
            }

            // FOR NOW, no other returns allowed apart from last stmt
            for (Unit u : pchain) {
                assert (!(u instanceof ReturnStmt) && !(u instanceof RetStmt)) || u == sLast;
            }

            // label1:
            //   goto label3
            Stmt sGotoLast = Jimple.v().newGotoStmt(sLast);
            probe.add(sGotoLast);
            // label2:
            //   local1 := @caughtexception;
            Local lException1 = getCreateLocal(body, "<ex1>", RefType.v(thrwCls));
            Stmt sCatch = Jimple.v().newIdentityStmt(lException1, Jimple.v().newCaughtExceptionRef());
            probe.add(sCatch);

            // TODO after catching an exception in a test, throw the exception back
            //            Type throwType = thrwCls.getType();
            //            Local lSysOut = getCreateLocal(body, "<throw>", throwType);
            //            Stmt callThrow = Jimple.v().newInvokeStmt(Jimple.v().newVirtualInvokeExpr(lException1, initThrow.makeRef(),
            //                    lSysOut));
            //            probe.add(callThrow);

            insertRightBeforeNoRedirect(pchain, probe, sLast);

            // insert trap (catch)
            body.getTraps().add(Jimple.v().newTrap(thrwCls, sFirstNonId, sGotoLast, sCatch));

            // Do not forget to insert instructions to report the counter
            stmtIt = units.snapshotIterator();
            while (stmtIt.hasNext()) {
                Stmt stmt = (Stmt)stmtIt.next();

                if ((stmt instanceof ReturnStmt)
                        ||(stmt instanceof ReturnVoidStmt)) {
                    // output the contents of the tracer
                    InvokeExpr reportExpr= Jimple.v().newStaticInvokeExpr(output.makeRef(),
                            StringConstant.v(method.getDeclaringClass().getName() + "." + method.getName()));
                    Stmt reportStmt = Jimple.v().newInvokeStmt(reportExpr);
                    units.insertBefore(reportStmt, stmt);

                    // reset the tracer
                    InvokeExpr resetExpr= Jimple.v().newStaticInvokeExpr(reset.makeRef());
                    Stmt resetStmt = Jimple.v().newInvokeStmt(resetExpr);
                    units.insertAfter(resetStmt, reportStmt);
                }
            }
        } else {
            StringBuffer sb = new StringBuffer();
            Set<Integer> lines = new HashSet<Integer>();
            while (stmtIt.hasNext()) {
                // cast back to a statement.
                Stmt stmt = (Stmt)stmtIt.next();

                if (stmt instanceof ReturnVoidStmt) {
                    continue;
                }

                if (stmt instanceof IdentityStmt) {
                    continue;
                }

                if (technique == TECHNIQUE.SELECTION) {
                    sb.append(stmt + "\n");
                }

                LineNumberTag t = (LineNumberTag) stmt.getTag("LineNumberTag");
                if (stmt.hasTag("LineNumberTag") && !lines.contains(t.getLineNumber())) {
                    lines.add(t.getLineNumber());

                    InvokeExpr incExpr= Jimple.v().newStaticInvokeExpr(trace.makeRef(),
                            StringConstant.v(stmt.toString()), StringConstant.v(method.getDeclaringClass().getName() + "." + method.getName()));
                    Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
                    units.insertBefore(incStmt, stmt);
                }
            }

            if (technique == TECHNIQUE.SELECTION) {
                output(method.getDeclaringClass().getName() + "." + method.getName(), sb);
            }
        }
    }

    private static void output(String packageMethodName, StringBuffer sb) {
        File theDir = new File("selectionOutput");
        // if the directory does not exist, create it
        if (!theDir.exists()) {
            if (!theDir.mkdir()) {
                throw new RuntimeException("selectionOutput directory could not be created.");
            }
        }

        FileWriter output = null;
        BufferedWriter writer = null;
        try {
            output = new FileWriter("selectionOutput" + File.separator + packageMethodName);
            writer = new BufferedWriter(output);
            writer.write(sb.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                // Ignore issues during closing
            }
        }
    }

    private void insertRightBeforeNoRedirect(PatchingChain<Unit> pchain, List<Stmt> instrumCode, Stmt s) {
        assert !(s instanceof IdentityStmt);
        for (Object stmt : instrumCode) {
            pchain.insertBeforeNoRedirect((Unit) stmt, s);
        }
    }

    private static Stmt getFirstNonIdStmt(PatchingChain<Unit> pchain) {
        Stmt sFirstNonId = null;
        for (Iterator<Unit> it = pchain.iterator(); it.hasNext(); ) {
            sFirstNonId = (Stmt) it.next();
            if (!(sFirstNonId instanceof IdentityStmt)) {
                break;
            }
        }
        return sFirstNonId;
    }

    private static Local getCreateLocal(Body b, String localName, Type t) {
        // try getting it
        Local l = getLocal(b, localName);
        if (l != null) {
            assert l.getType().equals(t); // ensure type is correct
            return l;
        }
        // no luck; create it
        Chain<Local> locals = b.getLocals();
        l = Jimple.v().newLocal(localName, t);
        locals.add(l);
        return l;
    }

    private static Local getLocal(Body b, String localName) {
        // look for existing bs local, and return it if found
        Chain<Local> locals = b.getLocals();
        for (Iterator<Local> itLoc = locals.iterator(); itLoc.hasNext(); ) {
            Local l = itLoc.next();
            if (l.getName().equals(localName)) {
                return l;
            }
        }
        return null;
    }
}