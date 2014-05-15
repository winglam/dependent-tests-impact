/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 * 
 * Used by the Instrumenter to record the statements and functions a test case covers.
 */

package edu.washington.cs.dt.impact.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tracer {
    private static Map<String, Set<String>> statements = new HashMap<String, Set<String>>();
    private static List<String> selectionStatements = new LinkedList<String>();
    private static Set<String> duplicates = new HashSet<String>();
    private static boolean printLastElement = true;

    public static void trace(String str, String methodName) {
        if (statements.containsKey(methodName)) {
            Set<String> currSet = statements.get(methodName);
            currSet.add(str);
            statements.put(methodName, currSet);
        } else {
            statements.put(methodName, new HashSet<String>(Arrays.asList(str)));
        }
    }

    public static void output(String packageMethodName) {
        File theDir = new File("sootTestOutput");
        // if the directory does not exist, create it
        if (!theDir.exists()) {
            if (!theDir.mkdir()) {
                throw new RuntimeException("Output directory could not be created.");
            }
        }

        FileWriter output = null;
        BufferedWriter writer = null;
        try {
            output = new FileWriter("sootTestOutput" + File.separator + packageMethodName);
            writer = new BufferedWriter(output);

            for (String key : statements.keySet()) {
                for (String s : statements.get(key)) {
                    writer.write(key + " : " + s + "\n");
                }
            }
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

    public static void reset() {
        statements.clear();
        selectionStatements.clear();
        duplicates.clear();
    }

    public static void selectionTrace(String str, String packageMethodName) {
        String s = packageMethodName + " : " + str.split(" goto")[0];
        if (str.contains("staticinvoke <edu.washington.cs.dt.impact.util.Tracer:"
                + " void selectionTrace(java.lang.String,java.lang.String)>")
                || duplicates.contains(s)) {
            return;
        }

        duplicates.add(s);
        selectionStatements.add(s);
        printLastElement = true;
    }

    public static void selectionOutput(String packageMethodName) {
        if (!printLastElement) {
            return;
        }

        File theDir = new File("sootTestOutput");
        // if the directory does not exist, create it
        if (!theDir.exists()) {
            if (!theDir.mkdir()) {
                throw new RuntimeException("Output directory could not be created.");
            }
        }

        FileWriter output = null;
        BufferedWriter writer = null;
        try {
            output = new FileWriter("sootTestOutput" + File.separator + packageMethodName, true);
            writer = new BufferedWriter(output);

            if (selectionStatements.size() > 1) {
                String prev = selectionStatements.get(0);
                for (int i = 1; i < selectionStatements.size(); i++) {
                    writer.write(prev + " >>>>>>>> " + selectionStatements.get(i) + "\n");
                    prev = selectionStatements.get(i);
                }
            } else if (selectionStatements.size() == 1) {
                writer.write(selectionStatements.get(0) + "\n");
            }

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
}
