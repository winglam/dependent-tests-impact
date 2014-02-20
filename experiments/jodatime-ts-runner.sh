#!/bin/bash

# instrument class and test files
cd jodatime-b609d7d66d
java -cp impact-tools/*:bin/:resources/:lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ../jodatime-d6791cb5f9
java -cp impact-tools/*:bin/:resources/:lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ..

# generate sootTestOutput
cd jodatime-b609d7d66d
#java -cp impact-tools/*:sootOutput:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-orig-order
java -cp impact-tools/*:sootOutput:resources/ edu.washington.cs.dt.main.ImpactMain ../jodatime-d6791cb5f9/jodatime-auto-order
cd ..

# generate test orders
#java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -origOrder jodatime-b609d7d66d/jodatime-orig-order -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-function-orig-order.txt
java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -origOrder jodatime-d6791cb5f9/jodatime-auto-order -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-function-orig-order.txt
java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order absolute -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-function-absolute.txt
java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order random -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-function-random.txt
java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order relative -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-function-relative.txt

#java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -origOrder jodatime-b609d7d66d/jodatime-orig-order -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-statement-orig-order.txt
java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -origOrder jodatime-d6791cb5f9/jodatime-auto-order -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-statement-orig-order.txt
java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order absolute -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-statement-absolute.txt
java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order random -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-statement-random.txt
java -Xms512m -Xmx1g -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order relative -oldVersCFG jodatime-b609d7d66d/selectionOutput -newVersCFG jodatime-d6791cb5f9/selectionOutput -testInputDir jodatime-b609d7d66d/sootTestOutput -outputFile jodatime-d6791cb5f9/jodatime-ts-statement-relative.txt

cd jodatime-d6791cb5f9
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-ts-function-orig-order.txt > jodatime-ts-function-orig-order-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-ts-function-absolute.txt > jodatime-ts-function-absolute-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-ts-function-random.txt > jodatime-ts-function-random-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-ts-function-relative.txt > jodatime-ts-function-relative-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-ts-statement-relative.txt > jodatime-ts-statement-relative-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-ts-statement-random.txt > jodatime-ts-statement-random-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-ts-statement-orig-order.txt > jodatime-ts-statement-orig-order-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-ts-statement-absolute.txt > jodatime-ts-statement-absolute-results.txt

#java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-orig-order > jodatime-orig-order-results.txt
java -cp impact-tools/*:bin:resources/ edu.washington.cs.dt.main.ImpactMain jodatime-auto-order > jodatime-orig-order-results.txt

rm -rf jodatime-ts-summary.txt
echo "jodatime-ts-function-orig-order.txt" >> jodatime-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-ts-function-orig-order-results.txt >> jodatime-ts-summary.txt 
echo "" >> jodatime-ts-summary.txt
echo "jodatime-ts-function-absolute.txt" >> jodatime-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-ts-function-absolute-results.txt >> jodatime-ts-summary.txt 
echo "" >> jodatime-ts-summary.txt
echo "jodatime-ts-function-random.txt" >> jodatime-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-ts-function-random-results.txt >> jodatime-ts-summary.txt 
echo "" >> jodatime-ts-summary.txt
echo "jodatime-ts-function-relative.txt" >> jodatime-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-ts-function-relative-results.txt >> jodatime-ts-summary.txt 
echo "" >> jodatime-ts-summary.txt
echo "jodatime-ts-statement-relative.txt" >> jodatime-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-ts-statement-relative-results.txt >> jodatime-ts-summary.txt 
echo "" >> jodatime-ts-summary.txt
echo "jodatime-ts-statement-random.txt" >> jodatime-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-ts-statement-random-results.txt >> jodatime-ts-summary.txt 
echo "" >> jodatime-ts-summary.txt
echo "jodatime-ts-statement-orig-order.txt" >> jodatime-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-ts-statement-orig-order-results.txt >> jodatime-ts-summary.txt 
echo "" >> jodatime-ts-summary.txt
echo "jodatime-ts-statement-absolute.txt" >> jodatime-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder jodatime-orig-order-results.txt -testOrder jodatime-ts-statement-absolute-results.txt >> jodatime-ts-summary.txt 
echo "" >> jodatime-ts-summary.txt

rm -rf jodatime-ts-statement-absolute.txt
rm -rf jodatime-ts-statement-orig-order.txt
rm -rf jodatime-ts-statement-random.txt
rm -rf jodatime-ts-statement-relative.txt
rm -rf jodatime-ts-function-relative.txt
rm -rf jodatime-ts-function-random.txt
rm -rf jodatime-ts-function-absolute.txt
rm -rf jodatime-ts-function-orig-order.txt
cd ..

rm -rf jodatime-b609d7d66d/sootOutput
rm -rf jodatime-d6791cb5f9/sootOutput
rm -rf jodatime-b609d7d66d/sootTestOutput
rm -rf jodatime-b609d7d66d/tmpfile.txt
rm -rf jodatime-b609d7d66d/selectionOutput
rm -rf jodatime-d6791cb5f9/selectionOutput
