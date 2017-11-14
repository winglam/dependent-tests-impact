package edu.washington.cs.dt.fixer.Main;

import soot.SootMethod;
import soot.jimple.internal.JAssignStmt;

public class MethodAndStaticStmt {
    public SootMethod method;
    public JAssignStmt staticSmt;

    public MethodAndStaticStmt(SootMethod method, JAssignStmt staticStmt) {
        this.method = method;
        this.staticSmt = staticStmt;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.method.hashCode();
        hash = 53 * hash + this.staticSmt.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MethodAndStaticStmt)) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        MethodAndStaticStmt rhs = (MethodAndStaticStmt) obj;
        return rhs.method.equals(method) && rhs.staticSmt.equals(staticSmt);
    }
}