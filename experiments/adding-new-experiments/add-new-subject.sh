# The root directory for the old subject
export DT_SUBJ_ROOT=/home/user/dependent-tests-impact/experiments/ignite-old/modules/hadoop
# Directory for where all of the old subject's information is stored.
export DT_SUBJ=$DT_SUBJ_ROOT/target

# The root directory for the new subject
export NEW_DT_SUBJ_ROOT=/home/user/dependent-tests-impact/experiments/ignite-new/modules/hadoop
# Directory for where all of the new subject's information is stored.
export NEW_DT_SUBJ=$NEW_DT_SUBJ_ROOT/target

# The name of the subject you wish to add (e.g., Zeppelin-Server) 
export SUBJ_NAME=hadoop

#FILL ABOVE FIRST

# Directory for all the jar files containing the DT-impact tools and its dependences
export DT_TOOLS=/home/user/dependent-tests-impact/experiments/impact-tools/*

# Directory for libraries of the old subject
export DT_LIBS=$DT_SUBJ/dependency/*
# Compiled class files of the old subject
export DT_CLASS=$DT_SUBJ/classes
# Compiled automatically-generated test files of the old subject
export DT_RANDOOP=$DT_SUBJ/randoop/bin
# Compiled human-written test files of the old subject
export DT_TESTS=$DT_SUBJ/test-classes

# Directory for libraries of the new subject
export NEW_DT_LIBS=$NEW_DT_SUBJ/dependency/*
# Compiled class files of the new subject
export NEW_DT_CLASS=$NEW_DT_SUBJ/classes
# Compiled automatically-generated test files of the new subject
export NEW_DT_RANDOOP=$NEW_DT_SUBJ/randoop/bin

# Directory for all the jar files containing the DT-impact tools and its dependences
export PRIO_RESULTS=/home/user/dependent-tests-impact/experiments/prioritization-results
export SELE_RESULTS=/home/user/dependent-tests-impact/experiments/selection-results
export PARA_RESULTS=/home/user/dependent-tests-impact/experiments/parallelization-results

# Directory for all the jar files containing the DT-impact tools and its dependences
export PRIO_DT_LISTS=/home/user/dependent-tests-impact/experiments/prioritization-dt-list
export SELE_DT_LISTS=/home/user/dependent-tests-impact/experiments/selection-dt-list
export PARA_DT_LISTS=/home/user/dependent-tests-impact/experiments/parallelization-dt-list

#for passing these into prioritization-runner.sh, selection-runner.sh, etc 
export DT_TOOLS_DIR=/home/user/dependent-tests-impact/experiments/impact-tools
export DT_LIBS_DIR=$DT_SUBJ/dependency
export NEW_DT_LIBS_DIR=$NEW_DT_SUBJ/dependency




#PRIORITIZATION

#cd $DT_SUBJ
#
##get orig order of tests
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS: edu.washington.cs.dt.tools.UnitTestFinder --pathOrJarFile $DT_TESTS --junit3and4=true
#mv allunittests.txt $SUBJ_NAME-orig-order
#
##instrument files
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_TESTS
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_CLASS
#
#
##run instrumented tests
#java -cp $DT_TOOLS:$DT_LIBS:$DT_SUBJ/sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-orig-order
#mv sootTestOutput/ sootTestOutput-orig
#rm -rf sootOutput/
##create env files
#touch $SUBJ_NAME-env-files
#cd $NEW_DT_SUBJ
#touch $SUBJ_NAME-env-files
#cd /home/user/dependent-tests-impact/experiments
#
##start generating results
#./henry-prioritization-runner.sh $SUBJ_NAME $DT_SUBJ $DT_TOOLS_DIR $DT_LIBS_DIR $DT_TESTS $DT_CLASS $PRIO_RESULTS $DT_RANDOOP



#AUTOS

## get the list of public classes in subject, make sure that the jar file contains only your source files and contains no test files.
#cd $DT_SUBJ
#
#jar -cf ./$SUBJ_NAME.jar -C classes/ .
#
#java -cp $DT_LIBS:$DT_TOOLS: edu.washington.cs.dt.util.PublicClassFinder $SUBJ_NAME.jar > $SUBJ_NAME-classes
#
## 2. In the old-subj, generate the randoop tests. remove any classes that do not compile 
#java -ea -cp $DT_LIBS:$DT_CLASS:/home/user/dependent-tests-impact/experiments/impact-tools/randoop.jar: randoop.main.Main gentests --classlist=$SUBJ_NAME-classes --outputlimit=5000 --ignore-flaky-tests=true
#
## 3. Compile the  randoop tests that were generated
#mkdir randoop/
#mv *.java randoop/
#cd randoop/
#javac -cp $DT_LIBS:$DT_CLASS:$DT_TOOLS: ErrorTest*.java RegressionTest*.java
#mkdir bin
#mv *.class ./bin
#cd $DT_SUBJ
#
## 4. Find the automatically-generated tests in the subject.
#java -cp $DT_TOOLS:$DT_CLASS:$DT_RANDOOP:$DT_LIBS: edu.washington.cs.dt.tools.UnitTestFinder --pathOrJarFile $DT_RANDOOP --junit3and4=true
#mv allunittests.txt $SUBJ_NAME-auto-order
#
## 5.  Instrument the source and test files.
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:/usr/lib/jvm/java-7-oracle/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_RANDOOP
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:/usr/lib/jvm/java-7-oracle/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_CLASS
#
## 6. Run the instrumented tests.
#java -cp $DT_TOOLS:$DT_LIBS:$DT_SUBJ/sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-auto-order
#mv sootTestOutput/ sootTestOutput-auto
#rm -rf sootOutput/




#SELECTION
#cd $DT_SUBJ
#
##instrument tests to get selectionOutput for old human written tests
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_CLASS -technique selection
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_TESTS -technique selection
#
##run instrumented tests for old human written tests
#java -cp $DT_TOOLS:$DT_LIBS:sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-orig-order
#mv sootTestOutput/ sootTestOutput-orig-selection
#rm -rf sootOutput/
#mv selectionOutput selectionOutput-orig
#
##instrument tests to get selectionOutput for old auto tests
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_CLASS -technique selection
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_RANDOOP -technique selection
#
##run instrumented tests for old auto tests
#java -cp $DT_TOOLS:$DT_LIBS:sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-auto-order
#mv sootTestOutput/ sootTestOutput-auto-selection
#rm -rf sootOutput/
#mv selectionOutput selectionOutput-auto
#
#cd $NEW_DT_SUBJ
#
##instrument new human written tests
#java -cp $DT_TOOLS:$NEW_DT_LIBS:$NEW_DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $NEW_DT_CLASS -technique selection
#java -cp $DT_TOOLS:$NEW_DT_LIBS:$NEW_DT_CLASS:$DT_TESTS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_TESTS -technique selection
#
#
#rm -rf sootOutput/
#mv selectionOutput selectionOutput-orig
#
##instrument new auto tests
#java -cp $DT_TOOLS:$NEW_DT_LIBS:$NEW_DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $NEW_DT_CLASS -technique selection
#java -cp $DT_TOOLS:$NEW_DT_LIBS:$NEW_DT_CLASS:$NEW_DT_RANDOOP:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $NEW_DT_RANDOOP -technique selection
#
#
#rm -rf sootOutput/
#mv selectionOutput selectionOutput-auto
#
#cd /home/user/dependent-tests-impact/experiments
#./henry-selection-runner.sh $SUBJ_NAME $NEW_DT_SUBJ $DT_TOOLS_DIR $NEW_DT_LIBS_DIR $DT_TESTS $NEW_DT_CLASS $SELE_RESULTS $DT_SUBJ $DT_RANDOOP


#PARALLELIZATION

#cd $DT_SUBJ
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-auto-order -getTime > $DT_SUBJ/$SUBJ_NAME-auto-time.txt
#java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-orig-order -getTime > $DT_SUBJ/$SUBJ_NAME-orig-time.txt
#cd /home/user/dependent-tests-impact/experiments/
##run parallelization-runner.sh
#./henry-parallelization-runner.sh $SUBJ_NAME $DT_SUBJ $DT_TOOLS_DIR $DT_LIBS_DIR $DT_TESTS $DT_CLASS $PARA_RESULTS $DT_RANDOOP