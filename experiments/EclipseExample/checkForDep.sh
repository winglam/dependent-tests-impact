mvn compile
mvn test-compile
mvn install -fn -DskipTests dependency:copy-dependencies

cd target/

java -cp ../../impact-tools/*:dependency/*:classes/:test-classes/ edu.washington.cs.dt.tools.UnitTestFinder --pathOrJarFile test-classes/ --junit3and4=true

mv allunittests.txt calc-orig-order-1

java -cp ../../impact-tools/*:dependency/*:classes/:test-classes/:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir test-classes/

java -cp ../../impact-tools/*:dependency/*:classes/:$JAVA_HOME/jre/lib/*: edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir classes/

java -cp ../../impact-tools/*:dependency/*:sootOutput/: edu.washington.cs.dt.main.ImpactMain -inputTests calc-orig-order-1 

mv sootTestOutput/ sootTestOutput-orig

touch calc-env-files

#statement absolute
java -cp ../../impact-tools/*:dependency/*:classes/:test-classes/ edu.washington.cs.dt.impact.runner.OneConfigurationRunner -technique prioritization -coverage statement -order absolute -origOrder calc-orig-order-1 -testInputDir sootTestOutput-orig/ -filesToDelete calc-env-files -getCoverage -project "CALC1" -testType orig -outputDir . -timesToRun 1

#statement original
java -cp ../../impact-tools/*:dependency/*:classes/:test-classes/ edu.washington.cs.dt.impact.runner.OneConfigurationRunner -technique prioritization -coverage statement -order original -origOrder calc-orig-order-1 -testInputDir sootTestOutput-orig/ -filesToDelete calc-env-files -getCoverage -project "CALC1" -testType orig -outputDir . -timesToRun 1 -getCoverage

#precompute dependecies
java -cp ../../impact-tools/*:dependency/*:classes/:test-classes/ edu.washington.cs.dt.impact.runner.OneConfigurationRunner -technique prioritization -coverage statement -order absolute -origOrder calc-orig-order-1 -testInputDir sootTestOutput-orig/ -filesToDelete calc-env-files -getCoverage -project "CALC1" -testType orig -outputDir . -timesToRun 1 -resolveDependences "prioritization-CALC1-orig-statement-absolute.txt"