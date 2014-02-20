#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
java -cp impact-tools/*:sootOutput:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-orig-order
#java -cp impact-tools/*:sootOutput:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-auto-order

# generate test orders
java -cp impact-tools/*:bin:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -order random -numOfMachines 4 -outputFile synoptic-parallel-random-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -origOrder synoptic-orig-order -numOfMachines 4 -outputFile synoptic-parallel-orig-order-results.txt

java -cp impact-tools/*:bin:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-orig-order > synoptic-orig-order-results.txt
#java -cp impact-tools/*:bin:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-auto-order > synoptic-auto-order-results.txt

rm -rf synoptic-parallel-summary.txt
echo "synoptic-parallel-random-results.txt" >> synoptic-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-parallel-random-results.txt >> synoptic-parallel-summary.txt 
echo "" >> synoptic-parallel-summary.txt
echo "synoptic-parallel-orig-order-results.txt" >> synoptic-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-parallel-orig-order-results.txt >> synoptic-parallel-summary.txt 
echo "" >> synoptic-parallel-summary.txt

rm -rf sootOutput
rm -rf sootTestOutput
rm -rf tmpfile.txt
rm -rf tmptestfiles.txt
