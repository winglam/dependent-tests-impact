package edu.washington.cs.dt.impact.Main;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import soot.Pack;
import soot.PackManager;
import soot.Transform;
import edu.washington.cs.dt.impact.util.Constants.TECHNIQUE;
import edu.washington.cs.dt.impact.util.Instrumenter;

public class SelectionDriver {

    public static void main(String[] args) {
        /* check the arguments */
        if (args.length == 0) {
            System.err.println("Usage: java MainDriver [options] classname");
            System.exit(0);}

        // list to parse the arguments
        List<String> argsList1 = new ArrayList<String>(Arrays.asList(args));

        // get list of files to instrument
        int inputDir1Index = argsList1.indexOf("-inputDir1");
        // get index of input directory
        int inputDir1NameIndex = inputDir1Index + 1;

        if (inputDir1Index != -1) {
            if (inputDir1NameIndex >= argsList1.size()) {
                System.err.println("Input directory 1 argument is specified but a directory path is not. Please use the format: -inputDir1 adirpath");
                System.exit(0);
            }
            String inputDir1Name = argsList1.get(inputDir1NameIndex);
            File f = new File(inputDir1Name);
            if (!f.isDirectory()) {
                System.err.println("Input directory 1 argument is specified but the directory path is invalid. Please check the directory path.");
                System.exit(0);
            }

            argsList1.add("-process-path");
            argsList1.add(inputDir1Name);
        } else {
            System.err.println("Input directory 1 argument is not specified. Please use the format: -inputDir1 adirpath");
            System.exit(0);
        }

        // list to parse the arguments
        List<String> argsList2 = new ArrayList<String>(Arrays.asList(args));

        // get list of files to instrument
        int inputDir2Index = argsList2.indexOf("-inputDir2");
        // get index of input directory
        int inputDir2NameIndex = inputDir2Index + 1;

        if (inputDir2Index != -1) {
            if (inputDir2NameIndex >= argsList2.size()) {
                System.err.println("Input directory 2 argument is specified but a directory path is not. Please use the format: -inputDir2 adirpath");
                System.exit(0);
            }
            String inputDir2Name = argsList2.get(inputDir2NameIndex);
            File f = new File(inputDir2Name);
            if (!f.isDirectory()) {
                System.err.println("Input directory 2 argument is specified but the directory path is invalid. Please check the directory path.");
                System.exit(0);
            }
            argsList2.add("-process-path");
            argsList2.add(inputDir2Name);
        } else {
            System.err.println("Input directory 2 argument is not specified. Please use the format: -inputDir2 adirpath");
            System.exit(0);
        }

        argsList1.remove(inputDir2NameIndex);
        argsList1.remove(inputDir2Index);
        argsList1.remove(inputDir1NameIndex);
        argsList1.remove(inputDir1Index);

        argsList2.remove(inputDir2NameIndex);
        argsList2.remove(inputDir2Index);
        argsList2.remove(inputDir1NameIndex);
        argsList2.remove(inputDir1Index);

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");
        Transform t = new Transform("jtp.instrumenter", new Instrumenter(TECHNIQUE.SELECTION, "inputDir1"));
        jtp.add(t);
        argsList1.add("-keep-line-number");

        /* Give control to Soot to process all options,
         * Instrumenter.internalTransform will get called.
         */
        soot.Main.main(argsList1.toArray(new String[argsList1.size()]));

        //        for (Pack p : PackManager.v().allPacks()) {
        //            System.out.println(p.getPhaseName());
        //        }

        /* add a phase to transformer pack by call Pack.add */
        //        Pack jtp2 = PackManager.v().getPack("jop");
        //        jtp2.add(new Transform("jtp.instrumenter2",
        //                new Instrumenter(TECHNIQUE.SELECTION, "inputDir2")));
        //        Iterator it = jtp.iterator();
        //        while (it.hasNext()) {
        //            Transform t = (Transform) it.next();
        //            System.out.println(t.getPhaseName());
        //            //            if ("jtp.instrumenter".equals(t.getPhaseName())) {
        //            it.remove();
        //            //                break;
        //            //        }
        //        }

        //        jtp.add(new Transform("jtp.instrumenter",
        //                new Instrumenter(TECHNIQUE.SELECTION, "inputDir2")));
        //        t.setDefaultOptions(t.getDefaultOptions());
        //        t = new Transform("jtp.instrumenter", new Instrumenter(TECHNIQUE.SELECTION, "inputDir2"));
        argsList2.add("-keep-line-number");

        /* Give control to Soot to process all options,
         * Instrumenter.internalTransform will get called.
         */
        soot.Main.main(argsList2.toArray(new String[argsList2.size()]));
    }

}
