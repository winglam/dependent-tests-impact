#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
#java -cp impact-tools/*:sootOutput:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-orig-order
java -cp impact-tools/*:sootOutput:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-auto-order

# generate test orders
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order absolute -outputFile jfreechart-tp-statement-absolute.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-tp-statement-absolute.txt > jfreechart-tp-statement-absolute-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order relative -outputFile jfreechart-tp-statement-relative.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-tp-statement-relative.txt > jfreechart-tp-statement-relative-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order absolute -outputFile jfreechart-tp-function-absolute.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-tp-function-absolute.txt > jfreechart-tp-function-absolute-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order relative -outputFile jfreechart-tp-function-relative.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-tp-function-relative.txt > jfreechart-tp-function-relative-results.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -order random -outputFile jfreechart-random.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-random.txt > jfreechart-random-results.txt

#java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-orig-order > jfreechart-orig-order-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-auto-order > jfreechart-auto-order-results.txt

rm -rf jfreechart-tp-summary.txt
echo "jfreechart-tp-statement-absolute-results.txt" >> jfreechart-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-auto-order-results.txt -testOrder jfreechart-tp-statement-absolute-results.txt >> jfreechart-tp-summary.txt 
echo "" >> jfreechart-tp-summary.txt
echo "jfreechart-tp-statement-relative-results.txt" >> jfreechart-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-auto-order-results.txt -testOrder jfreechart-tp-statement-relative-results.txt >> jfreechart-tp-summary.txt 
echo "" >> jfreechart-tp-summary.txt
echo "jfreechart-tp-function-absolute-results.txt" >> jfreechart-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-auto-order-results.txt -testOrder jfreechart-tp-function-absolute-results.txt >> jfreechart-tp-summary.txt 
echo "" >> jfreechart-tp-summary.txt
echo "jfreechart-tp-function-relative-results.txt" >> jfreechart-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-auto-order-results.txt -testOrder jfreechart-tp-function-relative-results.txt >> jfreechart-tp-summary.txt 
echo "" >> jfreechart-tp-summary.txt
echo "jfreechart-random-results.txt" >> jfreechart-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-auto-order-results.txt -testOrder jfreechart-random-results.txt >> jfreechart-tp-summary.txt 
echo "" >> jfreechart-tp-summary.txt

rm -rf jfreechart-random.txt
rm -rf jfreechart-tp-function-relative.txt
rm -rf jfreechart-tp-function-absolute.txt
rm -rf jfreechart-tp-statement-relative.txt
rm -rf jfreechart-tp-statement-absolute.txt

rm -rf sootOutput
rm -rf sootTestOutput
rm -rf tmpfile.txt
rm -rf tmptestfiles.txt

