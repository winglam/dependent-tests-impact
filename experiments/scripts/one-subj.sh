# Usage: one-subj.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS true $NEW_DT_SUBJ

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
PRECOMPUTE_DEPENDENCES=$10
NEW_DT_SUBJ=$11

startTime=`date`

# ======================================================

echo "[INFO] Running prioritization-runner script"
rm -rf $DT_ROOT/${prioDir}
mkdir $DT_ROOT/${prioDir}

./subj-prio.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL false $PRECOMPUTE_DEPENDENCES $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

# ======================================================
# Only run selection if we are not calculating precomputed dependences since the selection precomputed dependences are generated from priorization and parallelization 
if [ "$PRECOMPUTE_DEPENDENCES" = "false" ]; then
  echo "[INFO] Running selection-runner script"
  rm -rf $DT_ROOT/${seleDir}
  mkdir $DT_ROOT/${seleDir}

  ./subj-sele.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL $NEW_DT_SUBJ false $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS
fi

# ======================================================

echo "[INFO] Running parallelization-runner script"
rm -rf $DT_ROOT/${paraDir}
mkdir $DT_ROOT/${paraDir}

./subj-para.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL false $PRECOMPUTE_DEPENDENCES $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

# ======================================================

echo "[INFO] Script has finished running."

echo "[INFO] Start time was ${startTime}"

endTime=`date`
echo "[INFO] End time is ${endTime}"
