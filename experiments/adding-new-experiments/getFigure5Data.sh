# The root directory for the old subject
export DT_SUBJ_ROOT=/home/user/dependent-tests-impact/experiments/old_subj
# Directory for where all of the old subject's information is stored.
export DT_SUBJ=$DT_SUBJ_ROOT/possibly_some_other_dir/target
# Directory containing the old subject's src directory.
export DT_SUBJ_SRC=$DT_SUBJ_ROOT/possibly_some_other_dir/

# The root directory for the new subject
export NEW_DT_SUBJ_ROOT=/home/user/dependent-tests-impact/experiments/new_subj
# Directory for where all of the new subject's information is stored.
export NEW_DT_SUBJ=$NEW_DT_SUBJ_ROOT/possibly_some_other_dir/target
# Directory containing the new subject's src directory.
export NEW_DT_SUBJ_SRC=$NEW_DT_SUBJ_ROOT/possibly_some_other_dir/

# The name of the subject you wish to add (e.g., xml_security) 
export SUBJ_NAME=name
# The name of the subject you want to be displayed in the paper (e.g., XML Security) 
export SUBJ_NAME_FORMAL=formal_name

#FILL ABOVE FIRST
# Root directory for our tools and results
export DT_ROOT=/home/user/dependent-tests-impact/experiments
# Directory for all the jar files containing the DT-impact tools and its dependences
export DT_TOOLS=$DT_ROOT/impact-tools/*

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
# Compiled human-written test files of the new subject
export NEW_DT_TESTS=$NEW_DT_SUBJ/test-classes

# Directory for all the jar files containing the DT-impact tools and its dependences
export PRIO_RESULTS=$DT_ROOT/prioritization-results
export SELE_RESULTS=$DT_ROOT/selection-results
export PARA_RESULTS=$DT_ROOT/parallelization-results

# Directory for all the scripts used to generate the figures in our paper
export DT_SCRIPTS=$DT_ROOT/scripts

# Directory for all the hardcoded data related to our subjects
export DT_DATA=$DT_SCRIPTS/data

# Directory for all the jar files containing the DT-impact tools and its dependencies
export PRIO_DT_LISTS=$DT_DATA/prioritization-dt-list
export SELE_DT_LISTS=$DT_DATA/selection-dt-list
export PARA_DT_LISTS=$DT_DATA/parallelization-dt-list

# Files containing the minimum number of dependent tests a subject has
export AUTO_MIN_DTS=$DT_DATA/AUTO_MIN_DTs.txt
export ORIG_MIN_DTS=$DT_DATA/ORIG_MIN_DTs.txt 

#for passing these into prioritization-runner.sh, selection-runner.sh, etc 
export DT_TOOLS_DIR=/home/user/dependent-tests-impact/experiments/impact-tools
export DT_LIBS_DIR=$DT_SUBJ/dependency
export NEW_DT_LIBS_DIR=$NEW_DT_SUBJ/dependency


#compile old and new subjects and get libs
cd $DT_SUBJ_ROOT
mvn compile
mvn test-compile
mvn install -fn -DskipTests dependency:copy-dependencies

cd $NEW_DT_SUBJ_ROOT
mvn compile
mvn test-compile
mvn install -fn -DskipTests dependency:copy-dependencies

#generate auto tests and sootTestOutput-auto folder for subj
cd $DT_ROOT
./generate-sootTestOutput-auto.sh


#PRIORITIZATION

#get orig order of tests
cd $DT_SUBJ
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS: edu.washington.cs.dt.tools.UnitTestFinder --pathOrJarFile $DT_TESTS --junit3and4=true
mv allunittests.txt $SUBJ_NAME-orig-order

#instrument files
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_TESTS
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_CLASS

#run instrumented tests
java -cp $DT_TOOLS:$DT_LIBS:$DT_SUBJ/sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-orig-order
mv sootTestOutput/ sootTestOutput-orig
rm -rf sootOutput/

#create env files
touch $SUBJ_NAME-env-files
cd $NEW_DT_SUBJ
touch $SUBJ_NAME-env-files

#get prioritization results
cd $DT_ROOT/adding-new-experiments
./prioritization-runner-w-arguments.sh $SUBJ_NAME $NEW_DT_SUBJ $DT_TOOLS_DIR $NEW_DT_LIBS_DIR $NEW_DT_TESTS $NEW_DT_CLASS $PRIO_RESULTS $NEW_DT_RANDOOP $DT_SUBJ



#SELECTION

#instrument tests to get selectionOutput
cd $DT_SUBJ
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_CLASS -technique selection
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_TESTS -technique selection
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_RANDOOP -technique selection

#run instrumented tests
java -cp $DT_TOOLS:$DT_LIBS:sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-orig-order
mv sootTestOutput/ sootTestOutput-orig-selection
java -cp $DT_TOOLS:$DT_LIBS:sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-auto-order
mv sootTestOutput/ sootTestOutput-auto-selection
rm -rf sootOutput/

#instrument NEW_DT_SUBJ
cd $NEW_DT_SUBJ
java -cp $DT_TOOLS:$NEW_DT_LIBS:$NEW_DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $NEW_DT_CLASS -technique selection
rm -rf sootOutput/

#get selection results
cd $DT_ROOT/adding-new-experiments
./selection-runner-w-arguments.sh $SUBJ_NAME $NEW_DT_SUBJ $DT_TOOLS_DIR $NEW_DT_LIBS_DIR $NEW_DT_TESTS $NEW_DT_CLASS $SELE_RESULTS $NEW_DT_RANDOOP $DT_SUBJ 



#PARALLELIZATION

#get the time each test took to run
cd $DT_SUBJ
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-auto-order -getTime > $DT_SUBJ/$SUBJ_NAME-auto-time.txt
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-orig-order -getTime > $DT_SUBJ/$SUBJ_NAME-orig-time.txt

#run parallelization-runner.sh
cd $DT_ROOT/adding-new-experiments
./parallelization-runner-w-arguments.sh $SUBJ_NAME $NEW_DT_SUBJ $DT_TOOLS_DIR $NEW_DT_LIBS_DIR $NEW_DT_TESTS $NEW_DT_CLASS $PARA_RESULTS $NEW_DT_RANDOOP $DT_SUBJ
cd $DT_ROOT/adding-new-experiments