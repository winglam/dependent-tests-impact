#!/usr/bin/env bash

# Usage: bash lifetime-figure.sh PATH

LOG_FILE="$(basename $1)-log.txt"

mvn package -DskipTests exec:java -Dexec.mainClass="edu.washington.cs.dt.impact.figure.generator.LifetimeFigureGenerator" -Dexec.args="'--lifetime-paths' '$1'" |& tee "$LOG_FILE"

