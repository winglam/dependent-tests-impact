#!/bin/bash

mvn clean package

mv dt-impact-tracer/target/dt-impact-tracer-1.0.jar ./impact.jar

rm -rf ./experiments/impact-tools/impact.jar
cp ./impact.jar ./experiments/impact-tools/

rm -rf ./experiments/fixer-libs/impact.jar
cp ./impact.jar ./experiments/fixer-libs/

rm -rf ./impact.jar

