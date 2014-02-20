#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:resources/:lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
java -cp impact-tools/*:sootOutput:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-orig-order
#java -cp impact-tools/*:sootOutput:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-auto-order

# generate test orders
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -order random -numOfMachines 2 -outputFile jodatime-parallel-random-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -origOrder jodatime-orig-order -numOfMachines 2 -outputFile jodatime-parallel-orig-order-results.txt

java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-orig-order > jodatime-orig-order-results.txt
#java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-auto-order > jodatime-auto-order-results.txt

rm -rf jodatime-parallel-summary.txt
echo "jodatime-parallel-random-results.txt" >> jodatime-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-parallel-random-results.txt >> jodatime-parallel-summary.txt 
echo "" >> jodatime-parallel-summary.txt
echo "jodatime-parallel-orig-order-results.txt" >> jodatime-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-parallel-orig-order-results.txt >> jodatime-parallel-summary.txt 
echo "" >> jodatime-parallel-summary.txt

rm -rf sootOutput
rm -rf sootTestOutput
rm -rf tmpfile.txt
rm -rf tmptestfiles.txt
