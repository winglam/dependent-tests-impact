# Usage: one-subj-precomputed-dependences.sh $DT_SUBJ $DT_ROOT $DT_TOOLS $SUBJ_NAME $SUBJ_NAME_FORMAL $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

source ./constants.sh

#!/bin/bash

DT_SUBJ=$1
DT_ROOT=$2
SUBJ_NAME=$3
SUBJ_NAME_FORMAL=$4

DT_TOOLS=$5
DT_LIBS=$6
DT_CLASS=$7
DT_RANDOOP=$8
DT_TESTS=$9

startTime=`date`

echo "Running prioritization-runner script to generate precomputed dependences"
rm -rf $DT_ROOT/${priorDir}
mkdir $DT_ROOT/${priorDir}

./subj-prio-precomputed-dependences.sh $DT_SUBj $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL false $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

echo "Running parallelization-runner script to generate precomputed dependences"
rm -rf $DT_ROOT/${paraDir}
mkdir $DT_ROOT/${paraDir}

./subj-para-precomputed-dependences.sh $DT_SUBj $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL false $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

echo "Script has finished running."

echo "Start time was ${startTime}"

endTime=`date`
echo "End time is ${endTime}"
