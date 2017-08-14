# Usage: all-subj-precomputed-dependences.sh $DT_ROOT

source ./constants.sh
source ./subj-constants.sh

#!/bin/bash

DT_ROOT=$1

startTime=`date`

# ======================================================

echo "Running prioritization-runner script to generate precomputed dependences"
rm -rf $DT_ROOT/${priorDir}
mkdir $DT_ROOT/${priorDir}

index=0
count=${#expName[@]}

while [ "$index" -lt "$count" ]; do
  DT_SUBJ=${expDirectories[$index]}
  SUBJ_NAME=${expName[$index]}
  SUBJ_NAME_FORMAL=${expNameFormal[$index]}
  CLASSPATH=${expCP[$index]}

  echo -e "Starting experiment: $DT_SUBJ"
  ./subj-prio-precomputed-dependences.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL true $CLASSPATH

  let "index++"
done

# ======================================================

echo "Running parallelization-runner script to generate precomputed dependences"
rm -rf $DT_ROOT/${paraDir}
mkdir $DT_ROOT/${paraDir}

index=0
while [ "$index" -lt "$count" ]; do
  DT_SUBJ=${expDirectories[$index]}
  SUBJ_NAME=${expName[$index]}
  SUBJ_NAME_FORMAL=${expNameFormal[$index]}
  CLASSPATH=${expCP[$index]}

  echo -e "Starting experiment: $DT_SUBJ"
  ./subj-para-precomputed-dependences.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL true $CLASSPATH

  let "index++"
done

# ======================================================

echo "Script has finished running."

echo "Start time was ${startTime}"

endTime=`date`
echo "End time is ${endTime}"
