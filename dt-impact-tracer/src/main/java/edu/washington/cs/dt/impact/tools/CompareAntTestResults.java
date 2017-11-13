package edu.washington.cs.dt.impact.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.washington.cs.dt.impact.figure.generator.FigureGenerator;

public class CompareAntTestResults {

	public static void main(String[] args) {
        // list to parse the arguments
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        // get directory for the input of text files
        int file1Index = argsList.indexOf("-ant");
        File antFolder = null;
        if (file1Index != -1) {
            // get index of output directory
            int file1NameIndex = file1Index + 1;
            if (file1NameIndex >= argsList.size()) {
                FigureGenerator.exitWithError("Ant folder argument is specified but a file name is not."
                        + " Please use the format: -ant aFolderName");
            }
            antFolder = new File(argsList.get(file1NameIndex));
            if (!antFolder.isDirectory()) {
            	FigureGenerator.exitWithError("Ant folder argument is specified but the folder path is"
                        + " invalid. Please check the folder path.");
            }
        } else {
        	FigureGenerator.exitWithError("No Ant folder argument is specified."
                    + " Please use the format: -ant aFolderName");
        }

        // get directory for the input of text files
        int file2Index = argsList.indexOf("-vmvm");
        File vmvmFolder = null;
        if (file2Index != -1) {
            // get index of output directory
            int file2NameIndex = file2Index + 1;
            if (file2NameIndex >= argsList.size()) {
            	FigureGenerator.exitWithError("VMVM folder argument is specified but a file name is not."
                        + " Please use the format: -vmvm aFolderName");
            }
            vmvmFolder = new File(argsList.get(file2NameIndex));
            if (!vmvmFolder.isDirectory()) {
            	FigureGenerator.exitWithError("VMVM folder argument is specified"
                        + " but the file path is invalid. Please check the file path.");
            }
        } else {
        	FigureGenerator.exitWithError("No VMVM folder argument is specified."
                    + " Please use the format: -vmvm aFolderName");
        }
        
        StringBuilder sb = new StringBuilder();
        boolean misMatchResults = false;
		File[] fList = antFolder.listFiles();
		for (File file : fList) {
			if (file.getName().toLowerCase().contains(".ds_store")) {
				continue;
			}
			String line = FigureGenerator.getFlagsLine(file, "Tests run: ", true);
			
			String vmFileName = vmvmFolder.getAbsolutePath() + File.separator + file.getName();
			File vmvmFile = new File(vmFileName);
			if (vmvmFile == null || !vmvmFile.isFile()) {
				FigureGenerator.exitWithError(vmFileName + " could not be found.");
			}
			String vmLine = FigureGenerator.getFlagsLine(vmvmFile, "Tests run: ", true);
			
			int[] antResults = getTestResults(line);
			int[] vmResults = getTestResults(vmLine);
			
			if (!Arrays.equals(antResults, vmResults)) {
				misMatchResults = true;
				sb.append(file + " has different results.\n");
				sb.append("Ant: " + Arrays.toString(antResults) + "\n");
				sb.append("VMVM: " + Arrays.toString(vmResults) + "\n");
				sb.append("=======\n");
			}
		}
		
		if (misMatchResults) {
			System.out.print(sb.toString());
		} else {
			System.out.println("Done.");			
		}
	}
	
	// 0: Runs
	// 1: Failures
	// 2 : Errors
	// 3: Skipped
	private static int[] getTestResults(String line) {
		int[] results = new int[4];
		
		String[] commaSep = line.split(", ");
		
		// Tests run: 
		results[0] = Integer.parseInt(commaSep[0].substring(11));

		// Failures: 
		results[1] = Integer.parseInt(commaSep[1].substring(10));

		// Errors: 
		results[2] = Integer.parseInt(commaSep[2].substring(8));
		
		// Skipped: 
		results[3] = Integer.parseInt(commaSep[3].substring(9));

		return results;
	}

}
