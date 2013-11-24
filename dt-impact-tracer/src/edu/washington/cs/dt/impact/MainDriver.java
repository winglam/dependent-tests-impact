package edu.washington.cs.dt.impact;
/* Usage: java MainDriver [soot-options] appClass
 */

/* import necessary soot packages */
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import soot.Pack;
import soot.PackManager;
import soot.Transform;
public class MainDriver {
    public static void main(String[] args) {
        /* check the arguments */
        if (args.length == 0) {
            System.err.println("Usage: java MainDriver [options] classname");
            System.exit(0);}

        // list to parse the arguments
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        // get list of files to instrument
        int inputDirIndex = argsList.indexOf("-inputDir");
        if (inputDirIndex != -1) {
            // get index of input directory
            int inputDirNameIndex = inputDirIndex + 1;
            if (inputDirNameIndex >= argsList.size()) {
                System.err.println("Input directory argument is specified but a directory path is not. Please use the format: -inputDir adirpath");
                System.exit(0);
            }
            String inputDirName = argsList.get(inputDirNameIndex);
            File f = new File(inputDirName);
            if (!f.isDirectory()) {
                System.err.println("Input directory argument is specified but the directory path is invalid. Please check the directory path.");
                System.exit(0);
            }
            argsList.remove(inputDirNameIndex);
            argsList.remove(inputDirIndex);
            argsList.add("-process-path");
            argsList.add(inputDirName);
        }

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");
        jtp.add(new Transform("jtp.instrumenter",
                new Instrumenter()));

        argsList.add("-keep-line-number");
        String[] sootArgs = argsList.toArray(new String[argsList.size()]);

        /* Give control to Soot to process all options,
         * Instrumenter.internalTransform will get called.
         */
        soot.Main.main(sootArgs);
    }
}