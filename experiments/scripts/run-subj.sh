#!/bin/bash

# Setup the environment variables
source ./setup-vars.sh

# Runs commands for "Instructions to setup a subject for test prioritization" section.
bash ./setup-prio.sh

# Instructions to generate automatically-generated tests for a subject
/home/user/dependent-tests-impact/experiments/generate-sootTestOutput-auto.sh

# Runs commands for "Instructions to setup a subject for test selection" section.
bash ./setup-sele.sh

# Runs commands for "Instructions to setup a subject for test parallelization" section.
bash ./setup-para.sh

# Generating the number of dependent tests specifically for the new subject
bash ./generate-num-dependencies.sh
