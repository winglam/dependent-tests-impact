package edu.washington.cs.dt.impact;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
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

    public static void output(String methodName) {
        File theDir = new File("sootTestOutput");
        // if the directory does not exist, create it
        if (!theDir.exists()) {
            if(!theDir.mkdir()) {
                throw new RuntimeException("Output directory could not be created.");
            }
        }

        FileWriter output = null;
        BufferedWriter writer = null;
        try {
            output = new FileWriter("sootTestOutput" + File.separator + methodName);
            writer = new BufferedWriter(output);
            Collection<Set<String>> statementsCalled= statements.values();

            for (Set<String> statementsPerClass : statementsCalled) {
                for (String s : statementsPerClass) {
                    writer.write(s + "\n");
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
