#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
cp -r bin/org/apache/xml/security/resource sootOutput/org/apache/xml/security/
java -cp impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-orig-order
#java -cp impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-auto-order

# generate test orders
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -order random -outputFile xml-security-parallel-random-results.txt -numOfMachines 4
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.impact.tools.TestListGenerator -technique parallelization -origOrder xml-security-orig-order -outputFile xml-security-parallel-orig-order-results.txt -numOfMachines 4

java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-orig-order > xml-security-orig-order-results.txt
#java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-auto-order > xml-security-auto-order-results.txt

rm -rf xml-security-parallel-summary.txt
echo "xml-security-parallel-random-results.txt" >> xml-security-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-parallel-random-results.txt >> xml-security-parallel-summary.txt 
echo "" >> xml-security-parallel-summary.txt
echo "xml-security-parallel-orig-order-results.txt" >> xml-security-parallel-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-parallel-orig-order-results.txt >> xml-security-parallel-summary.txt 
echo "" >> xml-security-parallel-summary.txt

rm -rf sootOutput
rm -rf sootTestOutput
rm -rf tmpfile.txt
rm -rf tmptestfiles.txt
