#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
#java -cp impact-tools/*:sootOutput:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-orig-order
java -cp impact-tools/*:sootOutput:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-auto-order

# generate test orders
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order absolute -outputFile synoptic-tp-statement-absolute.txt
java -cp impact-tools/*:bin/:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-tp-statement-absolute.txt > synoptic-tp-statement-absolute-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order relative -outputFile synoptic-tp-statement-relative.txt
java -cp impact-tools/*:bin/:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-tp-statement-relative.txt > synoptic-tp-statement-relative-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order absolute -outputFile synoptic-tp-function-absolute.txt
java -cp impact-tools/*:bin/:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-tp-function-absolute.txt > synoptic-tp-function-absolute-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order relative -outputFile synoptic-tp-function-relative.txt
java -cp impact-tools/*:bin/:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-tp-function-relative.txt > synoptic-tp-function-relative-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -order random -outputFile synoptic-random.txt
java -cp impact-tools/*:bin/:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-random.txt > synoptic-random-results.txt

#java -cp impact-tools/*:bin:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-orig-order > synoptic-orig-order-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-auto-order > synoptic-auto-order-results.txt

rm -rf synoptic-tp-summary.txt
echo "synoptic-tp-statement-absolute-results.txt" >> synoptic-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-auto-order-results.txt -testOrder synoptic-tp-statement-absolute-results.txt >> synoptic-tp-summary.txt 
echo "" >> synoptic-tp-summary.txt
echo "synoptic-tp-statement-relative-results.txt" >> synoptic-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-auto-order-results.txt -testOrder synoptic-tp-statement-relative-results.txt >> synoptic-tp-summary.txt 
echo "" >> synoptic-tp-summary.txt
echo "synoptic-tp-function-absolute-results.txt" >> synoptic-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-auto-order-results.txt -testOrder synoptic-tp-function-absolute-results.txt >> synoptic-tp-summary.txt 
echo "" >> synoptic-tp-summary.txt
echo "synoptic-tp-function-relative-results.txt" >> synoptic-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-auto-order-results.txt -testOrder synoptic-tp-function-relative-results.txt >> synoptic-tp-summary.txt 
echo "" >> synoptic-tp-summary.txt
echo "synoptic-random-results.txt" >> synoptic-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-auto-order-results.txt -testOrder synoptic-random-results.txt >> synoptic-tp-summary.txt 
echo "" >> synoptic-tp-summary.txt

rm -rf synoptic-random.txt
rm -rf synoptic-tp-function-relative.txt
rm -rf synoptic-tp-function-absolute.txt
rm -rf synoptic-tp-statement-relative.txt
rm -rf synoptic-tp-statement-absolute.txt

rm -rf sootOutput
rm -rf sootTestOutput
rm -rf tmpfile.txt
rm -rf tmptestfiles.txt
