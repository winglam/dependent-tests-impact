source ~/.bashrc

# 1. In the old-subj, get the list of public classes in your subject. Make sure that the jar file used as input to the command contains only your source files and contains no test files.
cd $DT_SUBJ
#java -cp $DT_LIBS:$DT_TOOLS: edu.washington.cs.dt.util.PublicClassFinder $SUBJ_NAME.jar > $SUBJ_NAME-classes
# 2. In the old-subj, generate the randoop tests. For some of our subjects we noticed that randoop either exited unexpectedly or threw some exceptions and was unable to generate tests.  In those cases, we simply removed the class that is causing the problem from old-subj-classes. See our Experiments caveats page for more details on what we omitted.
java -ea -cp $DT_LIBS:$DT_CLASS:/home/user/dependent-tests-impact/experiments/impact-tools/randoop.jar: randoop.main.Main gentests --classlist=$SUBJ_NAME-classes --outputlimit=5000 --ignore-flaky-tests=true
# 3. Compile the  randoop tests that were generated
mkdir randoop/
mv *.java randoop/
cd randoop/
javac -cp $DT_LIBS:$DT_CLASS:$DT_TOOLS: ErrorTest*.java RegressionTest*.java
mkdir bin
mv *.class ./bin
cd $DT_SUBJ

