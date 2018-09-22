/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 *
 *         Tool used to instrument class and test files.
 */

package edu.washington.cs.dt.fixer.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import soot.Body;
import soot.BodyTransformer;
import soot.Local;
import soot.SootClass;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.AssignStmt;
import soot.jimple.Constant;
import soot.jimple.Expr;
import soot.jimple.Jimple;
import soot.jimple.StaticFieldRef;
import soot.jimple.Stmt;
import soot.jimple.internal.JAssignStmt;
import soot.jimple.internal.JimpleLocal;
import soot.tagkit.AnnotationTag;
import soot.tagkit.VisibilityAnnotationTag;
import soot.util.Chain;

public class Instrumenter extends BodyTransformer {

    public static Set<MethodAndStaticStmt> methodToStaticStmt = new HashSet<MethodAndStaticStmt>();
    public static List<Body> sootBodies = new ArrayList<Body>();
    public static Map<JAssignStmt, Value> staticStmts = new HashMap<JAssignStmt, Value>();
    private static final String JUNIT4_TAG = "VisibilityAnnotationTag";
    private static final String JUNIT4_TYPE = "Lorg/junit/Test;";
    private static final String JUNIT4_BEFORE = "Lorg/junit/Before;";
    private static final String JUNIT4_AFTER = "Lorg/junit/After;";
    private static final String JUNIT3_CLASS = "junit.framework.TestCase";
    private static final String JUNIT3_RETURN = "void";
    private static final String JUNIT3_METHOD_PREFIX = "test";

    public Instrumenter() {
    }

    /*
     * internalTransform goes through a method body and inserts
     * counter instructions before an INVOKESTATIC instruction
     */
    @Override
    protected void internalTransform(Body body, String phase, @SuppressWarnings("rawtypes") Map options) {
        transformBody(body);
    }

    public static void transformBody(Body body) {
        if (body == null) {
            return;
        }
        SootMethod method = body.getMethod();

        if (method.getName().equals("<clinit>") && InstrumentationMain.parseVariables) {
            Chain<Unit> units = body.getUnits();
            // get a snapshot iterator of the unit since we are going to
            // mutate the chain when iterating over it.
            Iterator<Unit> stmtIt = units.snapshotIterator();
            Map<JimpleLocal, Value> localToStatic = new HashMap<>();
            while (stmtIt.hasNext()) {
                // cast back to a statement.
                Stmt stmt = (Stmt) stmtIt.next();
                if (stmt instanceof JAssignStmt) {
                    JAssignStmt staticStmt = (JAssignStmt) stmt;
                    if (staticStmt.leftBox.getValue() instanceof JimpleLocal) {
                        // staticStmts.add(staticStmt);
                        JimpleLocal local = (JimpleLocal) staticStmt.leftBox.getValue();
                        localToStatic.put(local, staticStmt.rightBox.getValue());
                    } else {
                        // while right value is a local variable, look for the variable in localToStatic
                        Value rightVal = staticStmt.rightBox.getValue();
                        while (rightVal instanceof JimpleLocal) {
                            JimpleLocal rightLocal = (JimpleLocal) rightVal;
                            rightVal = localToStatic.get(rightLocal);
                        }
                        // TODO Depending on the expression of rightVal, we should check for other locals and resolve
                        // them to primitives
                        if ((staticStmt.leftBox.getValue() instanceof StaticFieldRef) && !(rightVal instanceof Expr)) {
                            staticStmts.put(staticStmt, rightVal);
                            // InstrumentationMain.staticStmts.put(staticStmt.leftBox.getValue(), rightVal);
                        }
                    }
                }
            }
        } else if (!method.getName().equals("<clinit>") && !InstrumentationMain.parseVariables) {

            boolean isSetupOrTeardown = false;

            boolean isJUnit4 = false;
            VisibilityAnnotationTag vat = (VisibilityAnnotationTag) method.getTag(JUNIT4_TAG);
            if (vat != null) {
                List<AnnotationTag> tags = vat.getAnnotations();
                for (AnnotationTag at : tags) {
                    if (!isJUnit4) {
                        isJUnit4 = at.getType().equals(JUNIT4_TYPE);
                    }
                    if (!isSetupOrTeardown) {
                        isSetupOrTeardown = at.getType().equals(JUNIT4_BEFORE) || at.getType().equals(JUNIT4_AFTER);
                    }
                }
            }

            boolean isJUnit3 = false;
            boolean extendsJUnit = false;
            if (!isJUnit4 && method.getName().length() > 3) {
                String retType = method.getReturnType().toString();
                String prefix = method.getName().substring(0, 4);
                SootClass superClass = method.getDeclaringClass().getSuperclass();
                while (superClass.hasSuperclass()) {
                    if (superClass.getName().equals(JUNIT3_CLASS)) {
                        extendsJUnit = true;
                        break;
                    }
                    superClass = superClass.getSuperclass();
                }
                isJUnit3 = method.isPublic() && retType.equals(JUNIT3_RETURN) && extendsJUnit
                        && prefix.equals(JUNIT3_METHOD_PREFIX);
            }

            // exclude the instrumentation of setups/teardowns
            // and JUnit3 methods that are not tests
            if ((extendsJUnit && !isJUnit3) || isSetupOrTeardown) {
                return;
            }

            // if (isJUnit3 || isJUnit4) {
            if (true) {
                Chain<Unit> units = body.getUnits();
                // get a snapshot iterator of the unit since we are going to
                // mutate the chain when iterating over it.
                Iterator<Unit> stmtIt = units.snapshotIterator();
                Stmt firstStmt = null;
                while (stmtIt.hasNext()) {
                    // cast back to a statement.
                    Stmt stmt = (Stmt) stmtIt.next();
                    if (stmt instanceof JAssignStmt) {
                        if (firstStmt == null) {
                            firstStmt = stmt;
                        }
                        JAssignStmt jStmt = (JAssignStmt) stmt;
                        for (JAssignStmt staticStmt : staticStmts.keySet()) {
                            if (jStmt.rightBox.getValue().toString().equals(staticStmt.leftBox.getValue().toString())) {
                                // jStmt is using the static variable
                                MethodAndStaticStmt mAndS = new MethodAndStaticStmt(method, staticStmt);
                                if (!methodToStaticStmt.contains(mAndS)) {
                                    methodToStaticStmt.add(mAndS);
                                    Value rightVal = staticStmts.get(staticStmt);
                                    if (!(rightVal instanceof Constant) && !(rightVal instanceof Local)) {
                                        // Soot assign statements requires the left or right side to be a local or
                                        // constant. If a static variable's right side is not a constant or local,
                                        // create a local and assign it to the static variable's value then assign the
                                        // static variable to the created local
                                        String name = staticStmt.leftBox.getValue().toString();
                                        Local tmpLocal =
                                                Jimple.v().newLocal("$" + name, jStmt.rightBox.getValue().getType());
                                        body.getLocals().add(tmpLocal);
                                        AssignStmt assignStmt = Jimple.v().newAssignStmt(tmpLocal, rightVal);
                                        units.insertBefore(assignStmt, firstStmt);
                                        rightVal = tmpLocal;
                                    }
                                    AssignStmt assignStmt = Jimple.v().newAssignStmt(
                                            Jimple.v().newStaticFieldRef(staticStmt.getFieldRef().getField().makeRef()),
                                            rightVal);
                                    units.insertBefore(assignStmt, firstStmt);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}