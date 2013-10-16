package edu.washington.cs.dt.impact;
/* Usage: java MainDriver [soot-options] appClass
 */

/* import necessary soot packages */
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
		
		int testClassIndex = argsList.indexOf("-testClass");
		Instrumenter.testClass = testClassIndex != -1;
		if (Instrumenter.testClass) {
			argsList.remove(testClassIndex);
		}

		/* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");
        jtp.add(new Transform("jtp.instrumenter",
                new Instrumenter()));
        /* Give control to Soot to process all options,
         * Instrumenter.internalTransform will get called.
         */
        
        argsList.add("-keep-line-number");
        String[] sootArgs = argsList.toArray(new String[argsList.size()]);
        soot.Main.main(sootArgs);
    }

}