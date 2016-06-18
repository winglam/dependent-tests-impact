package edu.washington.cs.dt.fixer.Main;

import java.io.Serializable;

import soot.jimple.Constant;

public class ValueData implements Serializable {
    private static final long serialVersionUID = 716791973016634481L;
    public String valueString;
    public Constant type;
    public String varName;

    public ValueData(String valueString, Constant type, String varName) {
        this.valueString = valueString;
        this.type = type;
        this.varName = varName;
    }

    @Override
    public String toString() {
        return valueString + type.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.valueString.hashCode();
        hash = 53 * hash + this.type.hashCode();
        hash = 53 * hash + this.varName.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ValueData)) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ValueData rhs = (ValueData) obj;
        return rhs.valueString.equals(valueString) && rhs.type.equals(type) && rhs.varName.equals(varName);
    }
}