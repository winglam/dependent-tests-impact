

# Getting Started #

This tutorial assumes you have checked out the latest version of the [source code](https://code.google.com/p/dependent-tests-impact//source/checkout). The commands used throughout the tutorial relies on the jars residing in dt-impact-tracer/lib and dt-detector/lib and assumes you have merged and copied the contents of those folders into a lib folder in the root level of your project.

In the examples below, the tutorial will assume you are conducting these operations on crystal inside experiments/crystal. To utilize these tools with another project besides crystal simply replace the variables that are used in each code example with ones corresponding to your project.

# Instrumenting Class/Test Files #
To instrument your class files so that before each statement is executed a counter is incremented and to instrument your test files so that each test case will be wrapped in a try/catch clause and print out the statements it executed, you would need execute the following command in the root level of your project:

```
experimentCP=impact-tools/*:bin/:libs/lib/*
technique=prioritization
java -cp $experimentCP edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique $technique
```

**`-technique aTechniqueName`**: specify the test technique you wish to be using the instrumented files with.
  * -technique prioritization: Test prioritization.
  * -technique selection: Test selection.
  * -technique parallelization: Test parallelization.

Please keep in mind to amend the classpath with JARs that are used by the project and if applicable add any necessary resources folder.

This should generate directory called sootOutput in the root level of your project that contains instrumented versions of the classes in your bin folder. If selection was the technique specified then an extra directory, selectionOutput/ will also be generated.

# Impact Main Test Runner #
To generate a file for each test containing the statements executed by it, run the following command substituting package.testclass with each of your test classes:

```
testType=orig
experiment=crystal
experimentCP=impact-tools/*:sootOutput/:libs/lib/*
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order -getTime
```

The argument $experiment-$testType-order is a list of tests where each test is separated by a line break. The test results from running the tests in this particular order will be known as the original order for these tests to be ran in.

The argument -getTime is only applicable if the desired technique you wish to apply is parallelization. With this argument specified the results outputted with be the time it took to execute each test as opposed to the test execution result.

Please keep in mind to amend the classpath with JARs that are used by the project and if applicable add any necessary resources folder.

Following the command above a directory sootTestOutput should be created in the root level of your project.

# Test List Generator #
Arguments supported by the `TestListGenerator`:

**`-testInputDir aDirName`**: change the input directory containing the statements executed by each test. The default is ./sootTestOutput.

**`-technique aTechniqueName`**: specify the test technique you wish to generate the test order with.
  * -technique prioritization: Test prioritization.
  * -technique selection: Test selection.
  * -technique parallelization: Test parallelization.

**`-coverage aCoverageName`**: specify the coverage you wish to generate the test order with.
  * -coverage statement : Statement coverage.
  * -coverage function : Function coverage.

**`-order aOrderName`**: specify the order you wish to generate the test order with.
  * -order absolute : Test order will be sorted by total number of coverage elements.
  * -order relative : Test order will be sorted by number of additional of coverage elements.
  * -order random : Test order will be sorted randomly.

**`-outputFile aFileName`**: specify the name of the file you wish the test order to be saved to. The default is to print the test order to the console.

**`-dependentTestFile aFileName`**: specify the name of the file you wish the test list generator to take into consideration when generating a test order. This argument is optional.

**`-getCoverage`**: only applicable when -technique is prioritization. This will generate a test order based on -coverage and -order along with the coverage elements each test contributes. This argument is optional.

**`-oldVersCFG aDirPath`**: required and applicable only when -technique is selection. The directory of the older version's instrumented files. This directory should be called selectionOutput/

**`-newVersCFG aDirPath`**: required and applicable only when -technique is selection. The directory of the newer version's instrumented files. This directory should be called selectionOutput/

**`-origOrder aFilePath`**: required and applicable only when -technique is selection and optional when the -technique is parallelization. The file containing the original order in which the tests were ran in.

**`-timeOrder aFilePath`**: required and applicable only when -technique is parallelization. The file containing the time each test took to run.

**` -numOfMachines aInteger`**: required and applicable only when -technique is parallelization. This number represents the number of files to split the test list in to after an ordering has been determined.


Examples of the `TestListGenerator`:
```
impactJarCP=impact-tools/impact.jar
testListGenClass=edu.washington.cs.dt.impact.tools.TestListGenerator
i=statement
j=absolute
experiment=crystal
testType=auto
java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $experiment-tp-$i-$j.txt -dependentTestFile $experiment-$testType-dt
```
This will generate a file named crystal-tp-statement-absolute.txt that will take the list of dependent tests specified in crystal-auto-dt into consideration when generating an order to run crystal's automated tests in statement absolute order.

```
impactJarCP=impact-tools/impact.jar
testListGenClass=edu.washington.cs.dt.impact.tools.TestListGenerator
i=statement
j=absolute
experiment=crystal
testType=auto
java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $experiment-tp-$i-$j-coverage.txt -getCoverage
```
With the getCoverage argument specified, this will generate a file named crystal-tp-statement-absolute-coverage.txt that will contain an order to run crystal's automated tests in statement absolute order along with the number of statements each test covers.

```
impactJarCP=impact-tools/impact.jar
testListGenClass=edu.washington.cs.dt.impact.tools.TestListGenerator
i=statement
j=absolute
experiment=jodatime
testType=auto
k=4
java -cp $impactJarCP $testListGenClass -technique parallelization -order $i -coverage $j -outputFile $experiment-parallel-$i-$j.txt -numOfMachines $k -dependentTestFile $1-$3-dt
```
This will generate four files named jodatime-parallel-statement-absolute.txt0, jodatime-parallel-statement-absolute.txt1, jodatime-parallel-statement-absolute.txt2, and jodatime-parallel-statement-absolute.txt3. Each file will contain a subset of the test list. As opposed to sorting all the test then splitting that list into fourths, the generation of these files work by putting the test with the highest coverage elements into the first file, the test with the second highest coverage elements into the second file and so on.

```
impactJarCP=impact-tools/impact.jar
testListGenClass=edu.washington.cs.dt.impact.tools.TestListGenerator
i=statement
experiment=jfreechart
testType=auto
oldVers=jfreechart-1.0.15
newVers=jfreechart-1.0.16
java -cp $impactJarCP $testListGenClass -technique selection -coverage $i -origOrder $newVers/$experiment-$testType-order -outputFile $newVers/$experiment-ts-$i-$testType-order.txt -oldVersCFG $oldVers/selectionOutput -newVersCFG $newVers/selectionOutput -testInputDir $oldVers/sootTestOutput
```
This command expects the user to be in the experiments/ directory. Once jfreechart-1.0.15 and jfreechart-1.0.16 has been instrumented and have had the statements executed by each of their tests documented, this command may be used. The output will be a file in jfreechart-1.0.16 named jfreechart-ts-statement-auto-order.txt. This file will contain a subset of tests from jfreechart-1.0.16/jfreechart-auto-order and the tests have to be testing for something that has been changed between jfreechart-1.0.15 and jfreechart-1.0.16.

# Cross Referencer #
After you have generated your desired regression test list you can run them in that particular order by using the Impact Main Test Runner. The Cross Referencer can then see whether your test results have changed from the original order.
```
impactJarCP=impact-tools/impact.jar
originalOrderResults=crystal-auto-order-results.txt
testOrderResults=crystal-tp-statement-absolute-results.txt
java -cp $impactJarCP edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder $originalOrderResults -testOrder $testOrderResults
```
This will print to the console the number of tests that have inconsistent results, the number of additional tests the -testOrder argument has and the number of tests it is missing.

# Dependent Test Finder #
If your results from the Cross Referencer indicated that your test suite has tests that revealed inconsistent behaviors then the Dependent Test Finder can help determine a regression testing order that will not reveal those inconsistent behaviors.

Arguments supported by the `DependentTestFinder`:

**`-dependentTestName aTestName`**: the name of the test that is revealing inconsistent results.

**`-dependentTestResult aTestResult`**: the current result the test is getting in the regression testing order.
  * -dependentTestResult pass: The dependent test **passed** in the regression testing order when it did not in the original order.
  * -dependentTestResult  error: The dependent test received an **error** in the regression testing order when it did not in the original order.
  * -dependentTestResult fail: The dependent test **failed** in the regression testing order when it did not in the original order.

**`-currentOrderFile aFileName`**: the regression testing order that -dependentTestName was ran in and attained -dependentTestResult.

**`-originalOrderFile aFileName`**: the original order where -dependentTestName revealed a different behavior than -dependentTestResult.

**`-filesToDelete aFileName`**: name of the temporary files that should be deleted each time before the test suite is executed.

**`-dtFile aFileName`**: file containing the current known information about what test should execute before/after other tests.

An example usage of the Dependent Test Finder:
```
experimentCP=impact-tools/*:bin/:libs/lib/* 
testName=randoop.crystal.RandoopTest2.test96
currentOrder=crystal-tp-statement-absolute.txt
originalOrder=crystal-auto-order
dependentTests=crystal-auto-dt
deleteFiles=crystal-env-files
testResult=pass
java -cp $experimentCP edu.washington.cs.dt.impact.tools.DependentTestFinder -dependentTestName $testName -dependentTestResult $testResult -currentOrderFile $currentOrder -originalOrderFile $originalOrder -dtFile $dependentTests -filesToDelete $deleteFiles
```

# Errata #
When generating the statements executed by each test, test cases that expect an exception to be thrown will fail because currently each test case is wrapped in a try/catch clause. I will look to address this in the future by catching the exception and throwing it later.