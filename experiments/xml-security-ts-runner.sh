#!/bin/bash

# instrument class and test files
cd xml-security-orig-v1
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ../xml-security-1_2_0
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ..

# generate sootTestOutput
cd xml-security-orig-v1
#java -cp impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain ../xml-security-1_2_0/xml-security-orig-order
java -cp impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain ../xml-security-1_2_0/xml-security-auto-order
cd ..

# generate test order
#java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -origOrder xml-security-orig-v1/xml-security-orig-order -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-function-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -origOrder xml-security-1_2_0/xml-security-auto-order -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-function-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order absolute -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-function-absolute.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order random -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-function-random.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order relative -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-function-relative.txt

#java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -origOrder xml-security-1_2_0/xml-security-auto-order -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-statement-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -origOrder xml-security-1_2_0/xml-security-auto-order -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-statement-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order absolute -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-statement-absolute.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order random -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-statement-random.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order relative -oldVersCFG xml-security-orig-v1/selectionOutput -newVersCFG xml-security-1_2_0/selectionOutput -testInputDir xml-security-orig-v1/sootTestOutput -outputFile xml-security-1_2_0/xml-security-ts-statement-relative.txt

cd xml-security-1_2_0
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-ts-function-orig-order.txt > xml-security-ts-function-orig-order-results.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-ts-function-absolute.txt > xml-security-ts-function-absolute-results.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-ts-function-random.txt > xml-security-ts-function-random-results.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-ts-function-relative.txt > xml-security-ts-function-relative-results.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-ts-statement-relative.txt > xml-security-ts-statement-relative-results.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-ts-statement-random.txt > xml-security-ts-statement-random-results.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-ts-statement-orig-order.txt > xml-security-ts-statement-orig-order-results.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-ts-statement-absolute.txt > xml-security-ts-statement-absolute-results.txt

#java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-orig-order > xml-security-orig-order-results.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-auto-order > xml-security-orig-order-results.txt

rm -rf xml-security-ts-summary.txt
echo "xml-security-ts-function-orig-order.txt" >> xml-security-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-ts-function-orig-order-results.txt >> xml-security-ts-summary.txt 
echo "" >> xml-security-ts-summary.txt
echo "xml-security-ts-function-absolute.txt" >> xml-security-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-ts-function-absolute-results.txt >> xml-security-ts-summary.txt 
echo "" >> xml-security-ts-summary.txt
echo "xml-security-ts-function-random.txt" >> xml-security-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-ts-function-random-results.txt >> xml-security-ts-summary.txt 
echo "" >> xml-security-ts-summary.txt
echo "xml-security-ts-function-relative.txt" >> xml-security-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-ts-function-relative-results.txt >> xml-security-ts-summary.txt 
echo "" >> xml-security-ts-summary.txt
echo "xml-security-ts-statement-relative.txt" >> xml-security-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-ts-statement-relative-results.txt >> xml-security-ts-summary.txt 
echo "" >> xml-security-ts-summary.txt
echo "xml-security-ts-statement-random.txt" >> xml-security-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-ts-statement-random-results.txt >> xml-security-ts-summary.txt 
echo "" >> xml-security-ts-summary.txt
echo "xml-security-ts-statement-orig-order.txt" >> xml-security-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-ts-statement-orig-order-results.txt >> xml-security-ts-summary.txt 
echo "" >> xml-security-ts-summary.txt
echo "xml-security-ts-statement-absolute.txt" >> xml-security-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-orig-order-results.txt -testOrder xml-security-ts-statement-absolute-results.txt >> xml-security-ts-summary.txt 
echo "" >> xml-security-ts-summary.txt

rm -rf xml-security-ts-function-absolute.txt
rm -rf xml-security-ts-function-orig-order.txt
rm -rf xml-security-ts-function-random.txt
rm -rf xml-security-ts-function-relative.txt
rm -rf xml-security-ts-statement-relative.txt
rm -rf xml-security-ts-statement-random.txt
rm -rf xml-security-ts-statement-absolute.txt
rm -rf xml-security-ts-statement-orig-order.txt
cd ..

rm -rf xml-security-orig-v1/sootOutput
rm -rf xml-security-orig-v1/sootTestOutput
rm -rf xml-security-orig-v1/tmpfile.txt
rm -rf xml-security-orig-v1/tmptestfiles.txt
rm -rf xml-security-orig-v1/selectionOutput
rm -rf xml-security-orig-v1/'4444444444  4 444444444444 444444444444444444444'
rm -rf xml-security-1_2_0/sootTestOutput
rm -rf xml-security-1_2_0/sootOutput
rm -rf xml-security-1_2_0/selectionOutput
rm -rf xml-security-1_2_0/tmpfile.txt
rm -rf xml-security-1_2_0/tmptestfiles.txt
rm -rf xml-security-1_2_0/'4444444444  4 444444444444 444444444444444444444'

