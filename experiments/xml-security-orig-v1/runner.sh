#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
cp -r bin/org/apache/xml/security/resource sootOutput/org/apache/xml/security/
#java -cp impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-orig-order
java -cp impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-auto-order

# generate test orders
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order absolute -outputFile xml-security-tp-statement-absolute.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-tp-statement-absolute.txt > xml-security-tp-statement-absolute-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order relative -outputFile xml-security-tp-statement-relative.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-tp-statement-relative.txt > xml-security-tp-statement-relative-results.txt 
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order absolute -outputFile xml-security-tp-function-absolute.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-tp-function-absolute.txt > xml-security-tp-function-absolute-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order relative -outputFile xml-security-tp-function-relative.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-tp-function-relative.txt > xml-security-tp-function-relative-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -order random -outputFile xml-security-random.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-random.txt > xml-security-random-results.txt

#java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-orig-order > xml-security-orig-order-results.txt
java -cp impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain xml-security-auto-order > xml-security-auto-order-results.txt

rm -rf xml-security-tp-summary.txt
echo "xml-security-tp-statement-absolute-results.txt" >> xml-security-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-auto-order-results.txt -testOrder xml-security-tp-statement-absolute-results.txt >> xml-security-tp-summary.txt 
echo "" >> xml-security-tp-summary.txt
echo "xml-security-tp-statement-relative-results.txt" >> xml-security-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-auto-order-results.txt -testOrder xml-security-tp-statement-relative-results.txt >> xml-security-tp-summary.txt 
echo "" >> xml-security-tp-summary.txt
echo "xml-security-tp-function-absolute-results.txt" >> xml-security-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-auto-order-results.txt -testOrder xml-security-tp-function-absolute-results.txt >> xml-security-tp-summary.txt 
echo "" >> xml-security-tp-summary.txt
echo "xml-security-tp-function-relative-results.txt" >> xml-security-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-auto-order-results.txt -testOrder xml-security-tp-function-relative-results.txt >> xml-security-tp-summary.txt 
echo "" >> xml-security-tp-summary.txt
echo "xml-security-random-results.txt" >> xml-security-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder xml-security-auto-order-results.txt -testOrder xml-security-random-results.txt >> xml-security-tp-summary.txt 
echo "" >> xml-security-tp-summary.txt

rm -rf xml-security-random.txt
rm -rf xml-security-tp-function-relative.txt
rm -rf xml-security-tp-function-absolute.txt
rm -rf xml-security-tp-statement-relative.txt
rm -rf xml-security-tp-statement-absolute.txt

rm -rf sootOutput
rm -rf sootTestOutput
rm -rf tmpfile.txt
rm -rf tmptestfiles.txt
