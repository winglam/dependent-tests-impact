#!/bin/bash

# Runs commands for "Instructions to setup a subject for test parallelization" section.

# 1. Get the time each test took to run.
cd $DT_SUBJ
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP: edu.washington.cs.dt.main.ImpactMain \
  -inputTests $SUBJ_NAME-auto-order -getTime > $DT_SUBJ/$SUBJ_NAME-auto-time.txt
java -cp $DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_TESTS: edu.washington.cs.dt.main.ImpactMain \
  -inputTests $SUBJ_NAME-orig-order -getTime > $DT_SUBJ/$SUBJ_NAME-orig-time.txt
