#!/bin/bash
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