#!/bin/bash

cd dt-impact-tracer/
ant
cd ..

# DT-Impact
jar -cf ./impact.jar -C ./dt-impact-tracer/bin .

rm -rf ./experiments/impact-tools/impact.jar
cp ./impact.jar ./experiments/impact-tools/

rm -rf ./experiments/fixer-libs/impact.jar
cp ./impact.jar ./experiments/fixer-libs/

rm -rf ./impact.jar

