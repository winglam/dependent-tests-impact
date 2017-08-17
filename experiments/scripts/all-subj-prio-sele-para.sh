# Usage: all-subj-prio-sele-para.sh $DT_ROOT

source ./constants.sh

#!/bin/bash

DT_ROOT=$1

source ./subj-constants.sh $DT_ROOT

startTime=`date`

# ======================================================

echo "[INFO] Running prioritization-runner script"
rm -rf $DT_ROOT/${prioDir}
mkdir $DT_ROOT/${prioDir}

index=0
count=${#expName[@]}

while [ "$index" -lt "$count" ]; do
  SUBJ_NAME=${expName[$index]}
  SUBJ_NAME_FORMAL=${expNameFormal[$index]}

  DT_SUBJ=${nextExpDirectories[$index]}
  CLASSPATH=${nextExpCP[$index]}

  echo -e "[INFO] Starting experiment: $DT_SUBJ"
  ./subj-prio.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL true false $CLASSPATH 

  let "index++"
done

# ======================================================

echo "[INFO] Running selection-runner script"
rm -rf $DT_ROOT/${seleDir}
mkdir $DT_ROOT/${seleDir}

index=0
count=${#expName[@]}

while [ "$index" -lt "$count" ]; do
  SUBJ_NAME=${expName[$index]}
  SUBJ_NAME_FORMAL=${expNameFormal[$index]}

  DT_SUBJ=${expDirectories[$index]}
  NEW_DT_SUBJ=${nextExpDirectories[$index]}
  CLASSPATH=${nextExpCP[$index]}

  echo -e "[INFO] Starting experiment: $DT_SUBJ"
  ./subj-sele.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL $NEW_DT_SUBJ true $CLASSPATH 

  let "index++"
done

# ======================================================

echo "[INFO] Running parallelization-runner script"
rm -rf $DT_ROOT/${paraDir}
mkdir $DT_ROOT/${paraDir}

index=0
while [ "$index" -lt "$count" ]; do
  SUBJ_NAME=${expName[$index]}
  SUBJ_NAME_FORMAL=${expNameFormal[$index]}

  DT_SUBJ=${nextExpDirectories[$index]}
  CLASSPATH=${nextExpCP[$index]}

  echo -e "[INFO] Starting experiment: $DT_SUBJ"
  ./subj-para.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL true false $CLASSPATH

  let "index++"
done

# ======================================================

echo "[INFO] Script has finished running."

echo "[INFO] Start time was ${startTime}"

endTime=`date`
echo "[INFO] End time is ${endTime}"
