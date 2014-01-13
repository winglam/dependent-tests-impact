package edu.washington.cs.dt.impact.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tracer {
    private static Map<String, Set<String>> statements = new HashMap<String, Set<String>>();

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
    }
}
