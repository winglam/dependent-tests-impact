#!/bin/bash

# instrument class and test files
cd dynoptic
java -cp impact-tools/*:bin/:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ../dynoptic-ea407ba0a750
java -cp impact-tools/*:bin/:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ..

# generate sootTestOutput
cd dynoptic
#java -cp impact-tools/*:sootOutput:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-orig-order
java -cp impact-tools/*:sootOutput:../lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain ../dynoptic-ea407ba0a750/synoptic-auto-order
cd ..

# generate test order
#java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput -origOrder dynoptic/synoptic-orig-order -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-function-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput -origOrder dynoptic-ea407ba0a750/synoptic-auto-order -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-function-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order absolute -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput  -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-function-absolute.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order random -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput  -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-function-random.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage function -order relative -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput  -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-function-relative.txt

#java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput -origOrder dynoptic/synoptic-orig-order -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-statement-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput -origOrder dynoptic-ea407ba0a750/synoptic-auto-order -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-statement-orig-order.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order absolute -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-statement-absolute.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order random -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-statement-random.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique selection -coverage statement -order relative -oldVersCFG dynoptic/selectionOutput -newVersCFG dynoptic-ea407ba0a750/selectionOutput -testInputDir dynoptic/sootTestOutput -outputFile dynoptic-ea407ba0a750/synoptic-ts-statement-relative.txt

cd dynoptic-ea407ba0a750
java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-ts-function-orig-order.txt > synoptic-ts-function-orig-order-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-ts-function-absolute.txt > synoptic-ts-function-absolute-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-ts-function-random.txt > synoptic-ts-function-random-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-ts-function-relative.txt > synoptic-ts-function-relative-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-ts-statement-relative.txt > synoptic-ts-statement-relative-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-ts-statement-random.txt > synoptic-ts-statement-random-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-ts-statement-orig-order.txt > synoptic-ts-statement-orig-order-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-ts-statement-absolute.txt > synoptic-ts-statement-absolute-results.txt

#java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-orig-order > synoptic-orig-order-results.txt
java -cp impact-tools/*:bin:../lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ edu.washington.cs.dt.main.ImpactMain synoptic-auto-order > synoptic-orig-order-results.txt

rm -rf synoptic-ts-summary.txt
echo "synoptic-ts-function-orig-order.txt" >> synoptic-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-ts-function-orig-order-results.txt >> synoptic-ts-summary.txt 
echo "" >> synoptic-ts-summary.txt
echo "synoptic-ts-function-absolute.txt" >> synoptic-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-ts-function-absolute-results.txt >> synoptic-ts-summary.txt 
echo "" >> synoptic-ts-summary.txt
echo "synoptic-ts-function-random.txt" >> synoptic-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-ts-function-random-results.txt >> synoptic-ts-summary.txt 
echo "" >> synoptic-ts-summary.txt
echo "synoptic-ts-function-relative.txt" >> synoptic-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-ts-function-relative-results.txt >> synoptic-ts-summary.txt 
echo "" >> synoptic-ts-summary.txt
echo "synoptic-ts-statement-relative.txt" >> synoptic-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-ts-statement-relative-results.txt >> synoptic-ts-summary.txt 
echo "" >> synoptic-ts-summary.txt
echo "synoptic-ts-statement-random.txt" >> synoptic-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-ts-statement-random-results.txt >> synoptic-ts-summary.txt 
echo "" >> synoptic-ts-summary.txt
echo "synoptic-ts-statement-orig-order.txt" >> synoptic-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-ts-statement-orig-order-results.txt >> synoptic-ts-summary.txt 
echo "" >> synoptic-ts-summary.txt
echo "synoptic-ts-statement-absolute.txt" >> synoptic-ts-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder synoptic-orig-order-results.txt -testOrder synoptic-ts-statement-absolute-results.txt >> synoptic-ts-summary.txt 
echo "" >> synoptic-ts-summary.txt

rm -rf synoptic-ts-function-absolute.txt
rm -rf synoptic-ts-function-orig-order.txt
rm -rf synoptic-ts-function-random.txt
rm -rf synoptic-ts-function-relative.txt
rm -rf synoptic-ts-statement-relative.txt
rm -rf synoptic-ts-statement-random.txt
rm -rf synoptic-ts-statement-absolute.txt
rm -rf synoptic-ts-statement-orig-order.txt
cd ..

rm -rf dynoptic/sootOutput
rm -rf dynoptic-ea407ba0a750/sootOutput 
rm -rf dynoptic-ea407ba0a750/sootTestOutput
rm -rf dynoptic/sootTestOutput
rm -rf dynoptic/tmpfile.txt
rm -rf dynoptic/selectionOutput
rm -rf dynoptic-ea407ba0a750/selectionOutput
