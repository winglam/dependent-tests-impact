package edu.washington.cs.dt.impact;

import org.junit.Test;

public class TestStringPermute {

    @Test
    public void stringPermute1Letter() {
        StringPermute sp = new StringPermute();
        sp.permute("a");
    }

    @Test
    public void stringPermute2Letter() {
        StringPermute sp = new StringPermute();
        sp.permute("ab");
    }

    @Test
    public void nothing() {
        System.out.print("");
    }

    @Test
    public void throwExceptionMethod() {
        StringPermute sp = new StringPermute();
        sp.doNothing(5);
    }

    @Test
    public void exceptionMethod() {
        StringPermute sp = new StringPermute();
        sp.doNothing(6);
    }
}

