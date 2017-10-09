source ~/.bashrc

# 1. In the old-subj, get the list of public classes in your subject. Make sure that the jar file used as input to the command contains only your source files and contains no test files.
cd $DT_SUBJ
jar -cf ./$SUBJ_NAME.jar -C classes/ .
java -cp $DT_LIBS:$DT_TOOLS: edu.washington.cs.dt.util.PublicClassFinder $SUBJ_NAME.jar > $SUBJ_NAME-classes
# 2. In the old-subj, generate the randoop tests. For some of our subjects we noticed that randoop either exited unexpectedly or threw some exceptions and was unable to generate tests.  In those cases, we simply removed the class that is causing the problem from old-subj-classes. See our Experiments caveats page for more details on what we omitted.
java -ea -cp $DT_LIBS:$DT_CLASS:$DT_TOOLS_DIR/randoop.jar: randoop.main.Main gentests --classlist=$SUBJ_NAME-classes --outputlimit=5000 --ignore-flaky-tests=true
# 3. Compile the  randoop tests that were generated
mkdir -p randoop/
mv *.java randoop/
cd randoop/

#see if ErrorTest exists, then execute the appropriate compile line
count=`ls -1 ErrorTest*.java 2>/dev/null | wc -l`
if [ $count != 0 ];
then
   javac -cp $DT_LIBS:$DT_CLASS:$DT_TOOLS: ErrorTest*.java RegressionTest*.java
else
   javac -cp $DT_LIBS:$DT_CLASS:$DT_TOOLS: RegressionTest*.java
fi

mkdir -p bin
mv *.class ./bin

#get sootTestOutput-auto
cd $DT_SUBJ
# 4. Find the automatically-generated tests in the subject.
java -cp $DT_TOOLS:$DT_CLASS:$DT_RANDOOP:$DT_LIBS: edu.washington.cs.dt.tools.UnitTestFinder --pathOrJarFile $DT_RANDOOP --junit3and4=true
mv allunittests.txt $SUBJ_NAME-auto-order
# 5.  Instrument the source and test files.
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_RANDOOP
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir $DT_CLASS
# 6. Run the instrumented tests.
java -cp $DT_TOOLS:$DT_LIBS:$DT_SUBJ/sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests $SUBJ_NAME-auto-order
mv sootTestOutput/ sootTestOutput-auto
rm -rf sootOutput/

# 7. Move auto tests to new subject
# Move auto tests to the new subject/remove the compiled files from the old version
cd $DT_SUBJ
cp -R randoop/ $NEW_DT_SUBJ/
cd $NEW_DT_RANDOOP
rm -rf *.class
cd ..

echo Trying to compile tests with new subject.
mkdir -p out
# Only look for the ones with the numbers (the others just reference the files with numbers after them, which messes with everything)
# ErrorTest.java and RegressionTest.java will get compiled later (in "execute the correct javac line..." below)
java -cp $DT_TOOLS: edu.washington.cs.dt.impact.tools.FailedTestRemover $NEW_DT_LIBS:$NEW_DT_CLASS:$DT_TOOLS: $(ls | grep -E "[0-9]+\.java$")

# Move the java files from the out dir to the randoop dir
cd out
mv *.java ..
cd ..
rm -rf out/

#execute the correct javac line depending on situation to compile auto tests with NEW_DT_CLASS
tcount=`ls -1 ErrorTest*.java 2>/dev/null | wc -l`
if [ $tcount != 0 ];
then
   javac -cp $NEW_DT_LIBS:$NEW_DT_CLASS:$DT_TOOLS: ErrorTest*.java RegressionTest*.java
else
   javac -cp $NEW_DT_LIBS:$NEW_DT_CLASS:$DT_TOOLS: RegressionTest*.java
fi
mv *.class bin/

# Find the automatically generated tests in the subject.
cd $NEW_DT_SUBJ
java -cp $DT_TOOLS:$NEW_DT_CLASS:$NEW_DT_RANDOOP:$NEW_DT_LIBS: edu.washington.cs.dt.tools.UnitTestFinder --pathOrJarFile $NEW_DT_RANDOOP \
  --junit3and4=true
mv allunittests.txt $SUBJ_NAME-auto-order

