#!/bin/bash

cd dt-impact-tracer/
ant
cd ..

# DT-Impact
jar -cf ./impact.jar -C ./dt-impact-tracer/bin .

rm -rf ./experiments/impact-tools/impact.jar
cp ./impact.jar ./experiments/impact-tools/

rm -rf ./experiments/jodatime-b609d7d66d/impact-tools/impact.jar
cp ./impact.jar ./experiments/jodatime-b609d7d66d/impact-tools/

rm -rf ./experiments/jodatime-d6791cb5f9/impact-tools/impact.jar
cp ./impact.jar ./experiments/jodatime-d6791cb5f9/impact-tools/

rm -rf ./experiments/crystal/impact-tools/impact.jar
cp ./impact.jar ./experiments/crystal/impact-tools/

rm -rf ./experiments/crystalvc/impact-tools/impact.jar
cp ./impact.jar ./experiments/crystalvc/impact-tools/

rm -rf ./experiments/dynoptic/impact-tools/impact.jar
cp ./impact.jar ./experiments/dynoptic/impact-tools/

rm -rf ./experiments/dynoptic-ea407ba0a750/impact-tools/impact.jar
cp ./impact.jar ./experiments/dynoptic-ea407ba0a750/impact-tools/

rm -rf ./experiments/xml-security-orig-v1/impact-tools/impact.jar
cp ./impact.jar ./experiments/xml-security-orig-v1/impact-tools/

rm -rf ./experiments/xml-security-1_2_0/impact-tools/impact.jar
cp ./impact.jar ./experiments/xml-security-1_2_0/impact-tools/

rm -rf ./dt-impact-tracer/lib/impact.jar
cp ./impact.jar ./dt-impact-tracer/lib/

rm -rf ./experiments/jfreechart-1.0.15/impact-tools/impact.jar
cp ./impact.jar ./experiments/jfreechart-1.0.15/impact-tools/

rm -rf ./experiments/jfreechart-1.0.16/impact-tools/impact.jar
cp ./impact.jar ./experiments/jfreechart-1.0.16/impact-tools/

rm -rf ./impact.jar

# DTDetector

jar -cf ./dt-detector.jar -C ./dt-detector/bin .

rm -rf ./dt-impact/experiments/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/impact-tools/

rm -rf ./dt-impact/experiments/jodatime-b609d7d66d/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/jodatime-b609d7d66d/impact-tools/

rm -rf ./dt-impact/experiments/jodatime-d6791cb5f9/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/jodatime-d6791cb5f9/impact-tools/

rm -rf ./dt-impact/experiments/crystal/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/crystal/impact-tools/

rm -rf ./dt-impact/experiments/crystalvc/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/crystalvc/impact-tools/

rm -rf ./dt-impact/experiments/dynoptic/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/dynoptic/impact-tools/

rm -rf ./dt-impact/experiments/dynoptic-ea407ba0a750/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/dynoptic-ea407ba0a750/impact-tools/

rm -rf ./dt-impact/experiments/xml-security-orig-v1/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/xml-security-orig-v1/impact-tools/

rm -rf ./dt-impact/experiments/xml-security-1_2_0/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/xml-security-1_2_0/impact-tools/

rm -rf ./dt-impact/experiments/jfreechart-1.0.15/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/jfreechart-1.0.15/impact-tools/

rm -rf ./dt-impact/experiments/jfreechart-1.0.16/impact-tools/dt-detector.jar
cp ./dt-detector.jar ./experiments/jfreechart-1.0.16/impact-tools/

rm -rf ./dt-detector/lib/dt-detector.jar
cp ./dt-detector.jar ./dt-detector/lib/dt-detector.jar

rm -rf ./dt-detector.jar

# DT-Fixer
cd dt-fixer/
ant
cd ..

jar -cf ./dt-fixer.jar -C ./dt-fixer/bin .

rm -rf ./dt-impact/experiments/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/impact-tools/

rm -rf ./dt-impact/experiments/jodatime-b609d7d66d/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/jodatime-b609d7d66d/impact-tools/

rm -rf ./dt-impact/experiments/jodatime-d6791cb5f9/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/jodatime-d6791cb5f9/impact-tools/

rm -rf ./dt-impact/experiments/crystal/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/crystal/impact-tools/

rm -rf ./dt-impact/experiments/crystalvc/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/crystalvc/impact-tools/

rm -rf ./dt-impact/experiments/dynoptic/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/dynoptic/impact-tools/

rm -rf ./dt-impact/experiments/dynoptic-ea407ba0a750/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/dynoptic-ea407ba0a750/impact-tools/

rm -rf ./dt-impact/experiments/xml-security-orig-v1/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/xml-security-orig-v1/impact-tools/

rm -rf ./dt-impact/experiments/xml-security-1_2_0/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/xml-security-1_2_0/impact-tools/

rm -rf ./dt-impact/experiments/jfreechart-1.0.15/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/jfreechart-1.0.15/impact-tools/

rm -rf ./dt-impact/experiments/jfreechart-1.0.16/impact-tools/dt-fixer.jar
cp ./dt-fixer.jar ./experiments/jfreechart-1.0.16/impact-tools/

rm -rf ./dt-fixer.jar