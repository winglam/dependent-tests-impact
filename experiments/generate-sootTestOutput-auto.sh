source ~/.bashrc

# 1. In the old-subj, get the list of public classes in your subject. Make sure that the jar file used as input to the command contains only your source files and contains no test files.
cd $DT_SUBJ
java -cp $DT_LIBS:$DT_TOOLS: edu.washington.cs.dt.util.PublicClassFinder $SUBJ_NAME.jar > $SUBJ_NAME-classes
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
# 4. Find the automatically-generated tests in the subject.
java -cp $DT_TOOLS:$DT_CLASS:$DT_RANDOOP:$DT_LIBS: edu.washington.cs.dt.tools.UnitTestFinder --pathOrJarFile $DT_RANDOOP --junit3and4=true
mv allunittests.txt $SUBJ_NAME-auto-order
# 5.  Instrument the source and test files.
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:/usr/lib/jvm/java-7-oracle/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_RANDOOP
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:/usr/lib/jvm/java-7-oracle/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_CLASS
# 6. Run the instrumented tests.
java -cp $DT_TOOLS:$DT_LIBS:$DT_SUBJ/sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-auto-order
mv sootTestOutput/ sootTestOutput-auto
rm -rf sootOutput/
