/**
 * Copyright 2014 University of Washington. All Rights Reserved.
 * @author Wing Lam
 *
 *         Main class to instrument a project.
 */

package edu.washington.cs.dt.fixer.Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import soot.Pack;
import soot.PackManager;
import soot.Transform;
import soot.Value;
import soot.jimple.internal.JAssignStmt;

public class InstrumentationMain {
    public static boolean parseVariables = true;
    public static final String VARIABLE_TO_TYPE = "variableToType.dat";
    public static Map<JAssignStmt, Value> parsedStaticFields = new HashMap<>();

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /* check the arguments */
        if (args.length == 0) {
            System.err.println("Usage: java InstrumentationMain [options] classname");
            System.exit(0);
        }

        // list to parse the arguments
        List<String> argsList = new ArrayList<String>(Arrays.asList(args));

        // get list of files to instrument
        int cpDirIndex = argsList.indexOf("-cpDir");
        if (cpDirIndex != -1) {
            // get index of input directory
            int cpDirNameIndex = cpDirIndex + 1;
            if (cpDirNameIndex >= argsList.size()) {
                System.err.println("CP directory argument is specified but a directory"
                        + " path is not. Please use the format: -cpDir adirpath");
                System.exit(0);
            }
            String cpDirName = argsList.get(cpDirNameIndex);
            argsList.remove(cpDirNameIndex);
            argsList.remove(cpDirIndex);

            StringBuffer sb = new StringBuffer();
            File cpDir = new File(cpDirName);
            for (File fileEntry : cpDir.listFiles()) {
                if (fileEntry.isFile() && !fileEntry.getName().startsWith(".") && !fileEntry.isHidden()) {
                    sb.append(fileEntry.getAbsolutePath());
                    sb.append(":");
                }
            }

            argsList.add("-cp");
            argsList.add(sb.toString());
        } else {
            System.err.println("No cp directory argument is specified." + " Please use the format: -cpDir adirpath");
            System.exit(0);
        }

        // get list of files to instrument
        int parsedStaticFieldsIndex = argsList.indexOf("-parsedStaticFields");
        if (parsedStaticFieldsIndex != -1) {
            // get index of input directory
            int parsedStaticFieldsNameIndex = parsedStaticFieldsIndex + 1;
            if (parsedStaticFieldsNameIndex >= argsList.size()) {
                System.err.println("Parsed static fields argument is specified but a file"
                        + " path is not. Please use the format: -parsedStaticFields afilepath");
                System.exit(0);
            }
            File f = new File(VARIABLE_TO_TYPE);
            if (f.exists() && f.isFile()) {
                parseVariables = false;
                XStream xstream = new XStream(new StaxDriver());
                parsedStaticFields = (HashMap<JAssignStmt, Value>) xstream.fromXML(f);
                Instrumenter.staticStmts = parsedStaticFields;
            }
            argsList.remove(parsedStaticFieldsNameIndex);
            argsList.remove(parsedStaticFieldsIndex);
        }

        // get list of files to instrument
        int inputDirIndex = argsList.indexOf("-inputDir");
        String inputDirName = "";
        if (inputDirIndex != -1) {
            // get index of input directory
            int inputDirNameIndex = inputDirIndex + 1;
            if (inputDirNameIndex >= argsList.size()) {
                System.err.println("Input directory argument is specified but a directory"
                        + " path is not. Please use the format: -inputDir adirpath");
                System.exit(0);
            }
            inputDirName = argsList.get(inputDirNameIndex);
            argsList.remove(inputDirNameIndex);
            argsList.remove(inputDirIndex);
            argsList.add("-process-path");
            argsList.add(inputDirName);
        } else {
            System.err.println(
                    "No input directory argument is specified." + " Please use the format: -inputDir adirpath");
            System.exit(0);
        }

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");
        Transform transform = new Transform("jtp.instrumenter", new Instrumenter());
        jtp.add(transform);

        argsList.add("-keep-line-number");
        argsList.add("-pp");
        argsList.add("-f");
        if (parseVariables) {
            argsList.add("n");
        } else {
            argsList.add("c");
        }

        String[] sootArgs = argsList.toArray(new String[argsList.size()]);

        /*
         * Give control to Soot to process all options,
         * Instrumenter.internalTransform will get called.
         */
        soot.Main.main(sootArgs);

        if (parseVariables) {
            XStream xstream = new XStream(new StaxDriver());
            File xmlFile = new File(VARIABLE_TO_TYPE);
            try {
                Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(xmlFile), "UTF-8"));
                parsedStaticFields = Instrumenter.staticStmts;
                xstream.toXML(parsedStaticFields, out);
            } catch (UnsupportedEncodingException | FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}