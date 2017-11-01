#!/bin/bash

# Runs commands for "Instructions to setup a subject for test selection" section.

# 1. Compile the new subject.
cd $NEW_DT_SUBJ_ROOT
mvn compile
mvn test-compile

# 2. Gather the dependencies of the new subject.
mvn install -fn -DskipTests dependency:copy-dependencies

# 3. Generate the static information needed by test selection for the old version of the subject.
cd $DT_SUBJ
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS:$JAVA_HOME/jre/lib/*: \
  edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_TESTS -technique selection
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:$JAVA_HOME/jre/lib/*: \
  edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_RANDOOP -technique selection
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain \
  -inputDir $DT_CLASS -technique selection

# 4. Run the instrumented tests.
java -cp $DT_TOOLS:$DT_LIBS:sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-auto-order
mv sootTestOutput/ sootTestOutput-auto-selection
java -cp $DT_TOOLS:$DT_LIBS:sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-orig-order
mv sootTestOutput/ sootTestOutput-orig-selection
rm -rf sootOutput/

# 5. Generate the static information needed by test selection for the new version of the subject.
cd $NEW_DT_SUBJ
java -cp $DT_TOOLS:$NEW_DT_LIBS:$NEW_DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain \
  -inputDir $NEW_DT_CLASS -technique selection
rm -rf sootOutput/
