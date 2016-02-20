package edu.washington.cs.dt.impact.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class ResultsParser {


    public static final String PARALLELIZATION = "New order time:"; //name of line to get values from in Parallelization technique
    public static final String APFD_VALUE = "APFD value:"; //name of line to get values from in selection and prioritization
    
    /*
     * A method to search a file for a keyword and return the value that follows that keyword
     * @return the data value without any leading or trailing whitespaces
     */
    public static String parseFile(File file, String keyword) throws FileNotFoundException{
        
        Scanner scanner = new Scanner(file); 
        while(scanner.hasNextLine()){
            String currLine = scanner.nextLine();
            //lineNum++;
            if(currLine.contains(keyword)){
                String data = currLine.substring(keyword.length(), currLine.length()); //gets numeric value of data
                scanner.close(); //close Scanner before returning
                return data.trim(); //trim away any whitespaces leading or after the data value
                
            }
        }
        scanner.close();
        return null; //none of the lines contained the keyword
    }

    /**
     * @param args
     */
    public static void main(String[] args) { //args: technique, directory...optional args
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));
        //System.out.println(argsList);

        String technique = args[0];
        String directoryName = args[1];
        //need to use as a List<String>

        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        
        for(File file: fList){
            if(file.isFile()){
                //do something with the file here
		//figure out how to generate the LaTeX needed for the diagrams...see Constants.java
                
            }
        }
        
        //write to output file
    }

}

// LaTeX stuff needed to generate diagrams for figure 17 and 18

/*******************FIGURE 17**********
\begin{figure}
\smaller
\centering
\begin{tabular}{|l|c|c|c|c|}
\hline
\textbf{Subject program} & T3 & T4 & T5 & T7 \\
\hline
\multicolumn{5}{|l|}{}  \\
\multicolumn{5}{|l|}{\textbf{Human-written test suites}}  \\
\hline
Crystal & 0.026  & 0.001 & 0.000 & 0.000 \\
JFreechart & 0.001 & 0.000 & 0.000 & 0.000 \\
\jt & 0.000 & 0.016 & 0.008 & 0.004 \\
Synoptic & 0.000 & 0.000 & 0.000 & 0.000 \\
XML Security & 0.000 & 0.000 & 0.000 & 0.000 \\
\hline
\multicolumn{5}{|l|}{}  \\
\multicolumn{5}{|l|}{\textbf{Automatically-generated test suites}}  \\
\hline
Crystal & 0.011 & 0.075 & 0.000 & 0.067 \\
JFreechart & 0.000 & 0.000 & 0.006 & 0.000 \\
\jt & 0.014 & 0.063 & 0.000 & 0.040 \\
Synoptic & 0.000 & 0.002 & 0.000 & 0.001 \\
XML Security & 0.120 & 0.164 & 0.118 & 0.203 \\
\hline
\end{tabular}
\caption{
The \prionum \dependenceaware test prioritization algorithms may choose a
different test order than the original prioritization.
This table shows the decrease in the APFD value (a metric of
prioritization quality) between the original
unsound prioritization algorithm and the sound \dependenceaware
prioritization algorithm.}
\label{tab:enhancedprioresult}
\end{figure}

%%  LocalWords:  T3 T4 T7 JFreechart
*/

/******FIGURE 18**********
% Real asterisk
\newcommand{\ra}{*$\!\!$}
% Phantom asterisk
\newcommand{\pa}{\phantom{\ra}}

\begin{figure}
\smaller
\centering
  \setlength{\tabcolsep}{.5\tabcolsep}
\begin{tabular}{|l|c|r|c|c|c|c|c|c|}
\hline
\textbf{Subject} & \multicolumn{2}{c|}{Run time} & \multicolumn{6}{c|}{APFD} \\
\textbf{program} & S1--S3 & S4--S6 & S1 & S2 & S3 & S4 & S5 & S6 \\
\hline
\multicolumn{9}{|l|}{}  \\
\multicolumn{9}{|l|}{\textbf{Human-written test suites}}  \\
\hline
Crystal        & 5.4\%\pa &  1.3\%\pa & 0.000 & 0.000 & 0.008 & 0.015 & 0.036 & 0.000 \\
JFreechart     & 0.7\%\pa &  0.6\%\pa & 0.001 & 0.001 & 0.000 & 0.000 & 0.004 & 0.003 \\
\jt            & 1.8\%\pa & 11.4\%\pa & 0.013 & 0.000 & 0.001 & 0.000 & 0.008 & 0.037 \\
Synoptic       & 2.4\%\pa &  0.0\%\pa & 0.000 & 0.033 & 0.023 & 0.000 & 0.000 & 0.048 \\
XML Security   & 0.0\%\pa &  0.0\%\pa & 0.000 & 0.000 & 0.000 & 0.000 & 0.000 & 0.000 \\
\hline
\multicolumn{9}{|l|}{}  \\
\multicolumn{9}{|l|}{\textbf{Automatically-generated test suites}}  \\
\hline
Crystal        & 0.0\%\ra &  0.7\%\ra & 0.000 & 0.561 & 0.781 & 0.006 & 0.851 & 0.900 \\
JFreechart     & 3.3\%\pa &  2.0\%\pa & 0.000 & 0.000 & 0.016 & 0.000 & 0.000 & 0.008 \\
\jt            & 7.2\%\pa &  7.3\%\pa & 0.000 & 0.018 & 0.074 & 0.000 & 0.000 & 0.056 \\
Synoptic       & 0.0\%\pa &  0.0\%\pa & 0.001 & 0.007 & 0.006 & 0.006 & 0.006 & 0.000 \\
XML Security   & 8.0\%\pa & 10.9\%\pa & 0.000 & 0.075 & 0.102 & 0.000 & 0.047 & 0.055 \\
\hline
\end{tabular}
\caption{
The \selnum \dependenceaware test selection algorithms may reorder the selected test suite,
increase the number of selected tests (the size and run time of the resulting suite), or do both.
This table shows the increase in the run time and the decrease in APFD\@.
An asterisk indicates a value for algorithm S1 or S4; algorithms S2, S3,
S5, and S6 timed out and did not select a subsuite for Crystal's
automatically-generated test suite.
}
\label{tab:enhancedselresult}
\end{figure}

%%  LocalWords:  S1 S3 S4 S6 S2 S5 JFreechart
*/

