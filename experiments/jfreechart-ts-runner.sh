#!/bin/bash

# instrument class and test files
cd jfreechart-1.0.15
java -cp impact-tools/*:bin/:lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ../jfreechart-1.0.16
java -cp impact-tools/*:bin/:lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ..

# generate sootTestOutput
cd jfreechart-1.0.15
#java -cp impact-tools/*:sootOutput:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-orig-order
java -cp impact-tools/*:sootOutput:lib/* edu.washington.cs.dt.main.ImpactMain ../jfreechart-1.0.16/jfreechart-auto-order
cd ..

# generate test orders
#java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -origOrder jfreechart-1.0.15/jfreechart-orig-order -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-function-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -origOrder jfreechart-1.0.16/jfreechart-auto-order -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-function-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order absolute -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-function-absolute.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order random -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-function-random.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order relative -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-function-relative.txt

#java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -origOrder jfreechart-1.0.15/jfreechart-orig-order -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-statement-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -origOrder jfreechart-1.0.16/jfreechart-auto-order -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-statement-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order absolute -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-statement-absolute.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order random -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-statement-random.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order relative -oldVersCFG jfreechart-1.0.15/selectionOutput -newVersCFG jfreechart-1.0.16/selectionOutput -testInputDir jfreechart-1.0.15/sootTestOutput -outputFile jfreechart-1.0.16/jfreechart-ts-statement-relative.txt

cd jfreechart-1.0.16/
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-ts-function-absolute.txt > jfreechart-ts-function-absolute-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-ts-function-orig-order.txt > jfreechart-ts-function-orig-order-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-ts-function-random.txt > jfreechart-ts-function-random-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-ts-function-relative.txt > jfreechart-ts-function-relative-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-ts-statement-relative.txt > jfreechart-ts-statement-relative-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-ts-statement-random.txt > jfreechart-ts-statement-random-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-ts-statement-absolute.txt > jfreechart-ts-statement-absolute-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-ts-statement-orig-order.txt > jfreechart-ts-statement-orig-order-results.txt

#java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-orig-order > jfreechart-orig-order-results.txt
java -cp impact-tools/*:bin:lib/* edu.washington.cs.dt.main.ImpactMain jfreechart-auto-order > jfreechart-orig-order-results.txt

rm -rf jfreechart-ts-summary.txt
echo "jfreechart-ts-function-orig-order.txt" >> jfreechart-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-ts-function-orig-order-results.txt >> jfreechart-ts-summary.txt 
echo "" >> jfreechart-ts-summary.txt
echo "jfreechart-ts-function-absolute.txt" >> jfreechart-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-ts-function-absolute-results.txt >> jfreechart-ts-summary.txt 
echo "" >> jfreechart-ts-summary.txt
echo "jfreechart-ts-function-random.txt" >> jfreechart-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-ts-function-random-results.txt >> jfreechart-ts-summary.txt 
echo "" >> jfreechart-ts-summary.txt
echo "jfreechart-ts-function-relative.txt" >> jfreechart-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-ts-function-relative-results.txt >> jfreechart-ts-summary.txt 
echo "" >> jfreechart-ts-summary.txt
echo "jfreechart-ts-statement-relative.txt" >> jfreechart-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-ts-statement-relative-results.txt >> jfreechart-ts-summary.txt 
echo "" >> jfreechart-ts-summary.txt
echo "jfreechart-ts-statement-random.txt" >> jfreechart-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-ts-statement-random-results.txt >> jfreechart-ts-summary.txt 
echo "" >> jfreechart-ts-summary.txt
echo "jfreechart-ts-statement-orig-order.txt" >> jfreechart-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-ts-statement-orig-order-results.txt >> jfreechart-ts-summary.txt 
echo "" >> jfreechart-ts-summary.txt
echo "jfreechart-ts-statement-absolute.txt" >> jfreechart-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jfreechart-orig-order-results.txt -testOrder jfreechart-ts-statement-absolute-results.txt >> jfreechart-ts-summary.txt 
echo "" >> jfreechart-ts-summary.txt

rm -rf jfreechart-ts-function-absolute.txt
rm -rf jfreechart-ts-function-orig-order.txt
rm -rf jfreechart-ts-function-random.txt
rm -rf jfreechart-ts-function-relative.txt
rm -rf jfreechart-ts-statement-relative.txt
rm -rf jfreechart-ts-statement-random.txt
rm -rf jfreechart-ts-statement-absolute.txt
rm -rf jfreechart-ts-statement-orig-order.txt
cd ..

rm -rf jfreechart-1.0.15/sootOutput
rm -rf jfreechart-1.0.16/sootOutput
rm -rf jfreechart-1.0.15/sootTestOutput
rm -rf jfreechart-1.0.15/tmpfile.txt
rm -rf jfreechart-1.0.15/selectionOutput
rm -rf jfreechart-1.0.16/selectionOutput
