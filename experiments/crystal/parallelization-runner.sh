#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
java -cp impact-tools/*:sootOutput/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-orig-order
#java -cp impact-tools/*:sootOutput/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-auto-order

# generate test orders
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -order random -numOfMachines 2 -outputFile crystal-parallel-random-results.txt

rm -rf 2013-08-28T20-44-41.156-0700
rm -rf hi!
rm -rf ./'-1 ms'
rm -rf 0\ ms
rm -rf 1\ ms
rm -rf 10\ ms
rm -rf 100\ ms
rm -rf 382707\ hours\ 44\ min
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -origOrder crystal-orig-order -numOfMachines 2 -outputFile crystal-parallel-orig-order-results.txt

rm -rf 2013-08-28T20-44-41.156-0700
rm -rf hi!
rm -rf ./'-1 ms'
rm -rf 0\ ms
rm -rf 1\ ms
rm -rf 10\ ms
rm -rf 100\ ms
rm -rf 382707\ hours\ 44\ min
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-orig-order > crystal-orig-order-results.txt
#java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-auto-order > crystal-auto-order-results.txt

rm -rf crystal-parallel-summary.txt
echo "crystal-parallel-random-results.txt" >> crystal-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder crystal-orig-order-results.txt -testOrder crystal-parallel-random-results.txt >> crystal-parallel-summary.txt 
echo "" >> crystal-parallel-summary.txt
echo "crystal-parallel-orig-order-results.txt" >> crystal-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder crystal-orig-order-results.txt -testOrder crystal-parallel-orig-order-results.txt >> crystal-parallel-summary.txt 
echo "" >> crystal-parallel-summary.txt

rm -rf sootOutput
rm -rf sootTestOutput
rm -rf tmpfile.txt
rm -rf tmptestfiles.txt

rm -rf 2013-08-28T20-44-41.156-0700
rm -rf hi!
rm -rf ./'-1 ms'
rm -rf 0\ ms
rm -rf 1\ ms
rm -rf 10\ ms
rm -rf 100\ ms
rm -rf 382707\ hours\ 44\ min




