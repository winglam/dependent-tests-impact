#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
java -cp impact-tools/*:sootOutput:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-orig-order
#java -cp impact-tools/*:sootOutput:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-auto-order

# generate test orders
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -order random -numOfMachines 2 -outputFile jfreechart-parallel-random-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -origOrder jfreechart-orig-order -numOfMachines 2 -outputFile jfreechart-parallel-orig-order-results.txt

java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-orig-order > jfreechart-orig-order-results.txt
#java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-auto-order > jfreechart-auto-order-results.txt

rm -rf jfreechart-parallel-summary.txt
echo "jfreechart-parallel-random-results.txt" >> jfreechart-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-parallel-random-results.txt >> jfreechart-parallel-summary.txt 
echo "" >> jfreechart-parallel-summary.txt
echo "jfreechart-parallel-orig-order-results.txt" >> jfreechart-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-parallel-orig-order-results.txt >> jfreechart-parallel-summary.txt 
echo "" >> jfreechart-parallel-summary.txt

rm -rf sootOutput
rm -rf sootTestOutput
rm -rf tmpfile.txt
rm -rf tmptestfiles.txt
