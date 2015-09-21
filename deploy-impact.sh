#!/bin/bash
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
