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
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.AssignStmt;
import soot.jimple.Jimple;
import soot.jimple.StaticFieldRef;
import soot.jimple.Stmt;
import soot.jimple.internal.JAssignStmt;
import soot.jimple.internal.JCastExpr;
import soot.jimple.internal.JVirtualInvokeExpr;
import soot.jimple.internal.JimpleLocal;
import soot.util.Chain;

public class Instrumenter extends BodyTransformer {

    public static Set<MethodAndStaticStmt> methodToStaticStmt = new HashSet<MethodAndStaticStmt>();
    public static List<Body> sootBodies = new ArrayList<Body>();
    public static Map<JAssignStmt, Value> staticStmts = new HashMap<JAssignStmt, Value>();

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
                        // if (method.getName().equals("testProjectPreferences")) {
                        // System.out.println("yay");
                        // }
                        if ((staticStmt.leftBox.getValue() instanceof StaticFieldRef)
                                && !(rightVal instanceof JVirtualInvokeExpr) && !(rightVal instanceof JCastExpr)) {
                            staticStmts.put(staticStmt, rightVal);
                            // InstrumentationMain.staticStmts.put(staticStmt.leftBox.getValue(), rightVal);
                        }
                    }
                }
            }
        } else if (!method.getName().equals("<clinit>") && !InstrumentationMain.parseVariables) {
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
                                // Local tmpLocal = Jimple.v()
                                // .newLocal("$"
                                // + ((StaticFieldRef) staticStmt.leftBox.getValue()).getFieldRef().name(),
                                // staticStmts.get(staticStmt).getType());
                                // body.getLocals().add(tmpLocal);
                                // AssignStmt assignLocalStmt =
                                // Jimple.v().newAssignStmt(tmpLocal, staticStmts.get(staticStmt));
                                // AssignStmt assignStmt = Jimple.v().newAssignStmt(
                                // Jimple.v().newStaticFieldRef(staticStmt.getFieldRef().getField().makeRef()),
                                // tmpLocal);
                                // units.insertBefore(assignStmt, firstStmt);
                                // units.insertBefore(assignLocalStmt, assignStmt);
                                AssignStmt assignStmt = Jimple.v().newAssignStmt(
                                        Jimple.v().newStaticFieldRef(staticStmt.getFieldRef().getField().makeRef()),
                                        staticStmts.get(staticStmt));
                                units.insertBefore(assignStmt, firstStmt);
                            }
                        }
                    }
                }
            }
        }
    }
}