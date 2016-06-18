/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 *
 *         Tool used to instrument class and test files.
 */

package edu.washington.cs.dt.fixer.Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import soot.Body;
import soot.BodyTransformer;
import soot.Local;
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

    public static Map<MethodAndStaticStmt, Local> methodToStaticStmt = new HashMap<MethodAndStaticStmt, Local>();

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
                        JimpleLocal local = (JimpleLocal) staticStmt.leftBox.getValue();
                        localToStatic.put(local, staticStmt.rightBox.getValue());
                    } else {
                        Value rightVal = staticStmt.rightBox.getValue();
                        while (rightVal instanceof JimpleLocal) {
                            JimpleLocal rightLocal = (JimpleLocal) rightVal;
                            rightVal = localToStatic.get(rightLocal);
                        }
                        if ((staticStmt.leftBox.getValue() instanceof StaticFieldRef)
                                && !(rightVal instanceof JVirtualInvokeExpr) && !(rightVal instanceof JCastExpr)) {
                            InstrumentationMain.staticStmts.put(staticStmt.leftBox.getValue(), rightVal);
                        }
                    }
                }
            }
        } else if (!InstrumentationMain.parseVariables) {
            if (!method.getName().equals("<clinit>")) {
                Chain<Unit> units = body.getUnits();
                // get a snapshot iterator of the unit since we are going to
                // mutate the chain when iterating over it.
                Iterator<Unit> stmtIt = units.snapshotIterator();
                while (stmtIt.hasNext()) {
                    // cast back to a statement.
                    Stmt stmt = (Stmt) stmtIt.next();
                    if (stmt instanceof JAssignStmt) {
                        JAssignStmt jStmt = (JAssignStmt) stmt;
                        for (ValueData valueData : InstrumentationMain.parsedStaticFields) {
                            if (jStmt.rightBox.getValue().toString().equals(valueData.valueString)) {
                                // jStmt is using the static variable
                                MethodAndStaticStmt mAndS = new MethodAndStaticStmt(method, valueData);
                                Local tmpLocal;
                                if (methodToStaticStmt.containsKey(mAndS)) {
                                    // Case of static variable set to something else and later used in the same method
                                    tmpLocal = methodToStaticStmt.get(mAndS);
                                } else {
                                    String name = valueData.varName;
                                    tmpLocal = Jimple.v().newLocal("$" + name, jStmt.rightBox.getValue().getType());
                                    body.getLocals().add(tmpLocal);
                                    methodToStaticStmt.put(mAndS, tmpLocal);
                                    AssignStmt assignStmt = Jimple.v().newAssignStmt(tmpLocal, valueData.type);
                                    units.insertBefore(assignStmt, stmt);
                                }

                                jStmt.setRightOp(tmpLocal);
                            }
                        }
                    }
                }
            }
        }
    }
}