#!/usr/bin/env bash

# Usage: bash results.sh START_DATE PATHS

LOG_FILE="$(basename "$2")-log.txt"

mvn exec:java -Dexec.mainClass="edu.washington.cs.dt.impact.tools.lifetime.PrecomputedLifetime" -Dexec.args="'--start-date' '$1' '--paths' '$2'" |& tee "$LOG_FILE"

