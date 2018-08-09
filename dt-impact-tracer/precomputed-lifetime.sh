#!/usr/bin/env bash

# Usage: bash results.sh LIFETIME_DIRECTORY

LOG_FILE="$(basename "$1")-log.txt"

mvn package -DskipTests exec:java -Dexec.mainClass="edu.washington.cs.dt.impact.tools.lifetime.PrecomputedLifetime" -Dexec.args="'--paths' '$1'" |& tee "$LOG_FILE"

