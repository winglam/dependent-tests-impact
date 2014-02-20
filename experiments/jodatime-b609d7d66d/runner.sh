#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:resources/:lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
#java -cp impact-tools/*:sootOutput:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-orig-order
java -cp impact-tools/*:sootOutput:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-auto-order

# generate test orders
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order absolute -outputFile jodatime-tp-statement-absolute.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-tp-statement-absolute.txt > jodatime-tp-statement-absolute-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order relative -outputFile jodatime-tp-statement-relative.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-tp-statement-relative.txt > jodatime-tp-statement-relative-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order absolute -outputFile jodatime-tp-function-absolute.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-tp-function-absolute.txt > jodatime-tp-function-absolute-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order relative -outputFile jodatime-tp-function-relative.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-tp-function-relative.txt > jodatime-tp-function-relative-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -order random -outputFile jodatime-random.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-random.txt > jodatime-random-results.txt

#java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-orig-order > jodatime-orig-order-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-auto-order > jodatime-auto-order-results.txt

rm -rf jodatime-tp-summary.txt
echo "jodatime-tp-statement-absolute-results.txt" >> jodatime-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-auto-order-results.txt -testOrder jodatime-tp-statement-absolute-results.txt >> jodatime-tp-summary.txt 
echo "" >> jodatime-tp-summary.txt
echo "jodatime-tp-statement-relative-results.txt" >> jodatime-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-auto-order-results.txt -testOrder jodatime-tp-statement-relative-results.txt >> jodatime-tp-summary.txt 
echo "" >> jodatime-tp-summary.txt
echo "jodatime-tp-function-absolute-results.txt" >> jodatime-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-auto-order-results.txt -testOrder jodatime-tp-function-absolute-results.txt >> jodatime-tp-summary.txt 
echo "" >> jodatime-tp-summary.txt
echo "jodatime-tp-function-relative-results.txt" >> jodatime-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-auto-order-results.txt -testOrder jodatime-tp-function-relative-results.txt >> jodatime-tp-summary.txt 
echo "" >> jodatime-tp-summary.txt
echo "jodatime-random-results.txt" >> jodatime-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-auto-order-results.txt -testOrder jodatime-random-results.txt >> jodatime-tp-summary.txt 
echo "" >> jodatime-tp-summary.txt

rm -rf jodatime-random.txt
rm -rf jodatime-tp-function-relative.txt
rm -rf jodatime-tp-function-absolute.txt
rm -rf jodatime-tp-statement-relative.txt
rm -rf jodatime-tp-statement-absolute.txt

rm -rf sootOutput
rm -rf sootTestOutput
rm -rf tmpfile.txt
rm -rf tmptestfiles.txt

