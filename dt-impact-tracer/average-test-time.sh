#!/usr/bin/env bash

# Usage: bash average-test-time.sh PATH

LOG_FILE="average-time.txt"

mvn package -DskipTests exec:java -Dexec.mainClass="edu.washington.cs.dt.impact.tools.SubjectTestRuntime" -Dexec.args="'--paths' '$1'" |& tee "$LOG_FILE"

