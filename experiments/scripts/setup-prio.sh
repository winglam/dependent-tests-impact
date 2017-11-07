#!/bin/bash

# Runs commands for "Instructions to setup a subject for test prioritization" section.

# 1. Find the human-written tests in the old subject.
cd $DT_SUBJ
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS: edu.washington.cs.dt.tools.UnitTestFinder \
  --pathOrJarFile $DT_TESTS --junit3and4=true
mv allunittests.txt $SUBJ_NAME-orig-order

# 2. Instrument the source and test files.
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain \
  -inputDir $DT_TESTS
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain \
  -inputDir $DT_CLASS

# 3. Run the instrumented tests.
java -cp $DT_TOOLS:$DT_LIBS:$DT_SUBJ/sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-orig-order
mv sootTestOutput/ sootTestOutput-orig
rm -rf sootOutput/
