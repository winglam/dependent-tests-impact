#!/bin/bash

# instrument class and test files
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin

# generate sootTestOutput
#java -cp impact-tools/*:sootOutput/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-orig-order
java -cp impact-tools/*:sootOutput/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-auto-order

# generate test orders
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order absolute -outputFile crystal-tp-statement-absolute.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order relative -outputFile crystal-tp-statement-relative.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order absolute -outputFile crystal-tp-function-absolute.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order relative -outputFile crystal-tp-function-relative.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -order random -outputFile crystal-random.txt

rm -rf 2013-08-28T20-44-41.156-0700
rm -rf hi!
rm -rf ./'-1 ms'
rm -rf 0\ ms
rm -rf 1\ ms
rm -rf 10\ ms
rm -rf 100\ ms
rm -rf 382707\ hours\ 44\ min
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-tp-statement-absolute.txt > crystal-tp-statement-absolute-results.txt

rm -rf 2013-08-28T20-44-41.156-0700
rm -rf hi!
rm -rf ./'-1 ms'
rm -rf 0\ ms
rm -rf 1\ ms
rm -rf 10\ ms
rm -rf 100\ ms
rm -rf 382707\ hours\ 44\ min
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-tp-statement-relative.txt > crystal-tp-statement-relative-results.txt

rm -rf 2013-08-28T20-44-41.156-0700
rm -rf hi!
rm -rf ./'-1 ms'
rm -rf 0\ ms
rm -rf 1\ ms
rm -rf 10\ ms
rm -rf 100\ ms
rm -rf 382707\ hours\ 44\ min
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-tp-function-absolute.txt > crystal-tp-function-absolute-results.txt

rm -rf 2013-08-28T20-44-41.156-0700
rm -rf hi!
rm -rf ./'-1 ms'
rm -rf 0\ ms
rm -rf 1\ ms
rm -rf 10\ ms
rm -rf 100\ ms
rm -rf 382707\ hours\ 44\ min
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-tp-function-relative.txt > crystal-tp-function-relative-results.txt

rm -rf 2013-08-28T20-44-41.156-0700
rm -rf hi!
rm -rf ./'-1 ms'
rm -rf 0\ ms
rm -rf 1\ ms
rm -rf 10\ ms
rm -rf 100\ ms
rm -rf 382707\ hours\ 44\ min
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-random.txt > crystal-random-results.txt


rm -rf 2013-08-28T20-44-41.156-0700
rm -rf hi!
rm -rf ./'-1 ms'
rm -rf 0\ ms
rm -rf 1\ ms
rm -rf 10\ ms
rm -rf 100\ ms
rm -rf 382707\ hours\ 44\ min
#java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-orig-order > crystal-orig-order-results.txt
java -cp impact-tools/*:bin/:libs/lib/* edu.washington.cs.dt.main.ImpactMain crystal-auto-order > crystal-auto-order-results.txt

rm -rf crystal-tp-summary.txt
echo "crystal-tp-statement-absolute-results.txt" >> crystal-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder crystal-auto-order-results.txt -testOrder crystal-tp-statement-absolute-results.txt >> crystal-tp-summary.txt 
echo "" >> crystal-tp-summary.txt
echo "crystal-tp-statement-relative-results.txt" >> crystal-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder crystal-auto-order-results.txt -testOrder crystal-tp-statement-relative-results.txt >> crystal-tp-summary.txt 
echo "" >> crystal-tp-summary.txt
echo "crystal-tp-function-absolute-results.txt" >> crystal-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder crystal-auto-order-results.txt -testOrder crystal-tp-function-absolute-results.txt >> crystal-tp-summary.txt 
echo "" >> crystal-tp-summary.txt
echo "crystal-tp-function-relative-results.txt" >> crystal-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder crystal-auto-order-results.txt -testOrder crystal-tp-function-relative-results.txt >> crystal-tp-summary.txt 
echo "" >> crystal-tp-summary.txt
echo "crystal-random-results.txt" >> crystal-tp-summary.txt
java -cp impact-tools/impact.jar edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder crystal-auto-order-results.txt -testOrder crystal-random-results.txt >> crystal-tp-summary.txt 
echo "" >> crystal-tp-summary.txt

rm -rf crystal-random.txt
rm -rf crystal-tp-function-relative.txt
rm -rf crystal-tp-function-absolute.txt
rm -rf crystal-tp-statement-relative.txt
rm -rf crystal-tp-statement-absolute.txt

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




