# Usage: subj-para.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL $NEW_DT_SUBJ true false true ...
# Usage: subj-para.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL $NEW_DT_SUBJ false false true $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

source ./constants.sh

DT_SUBJ=$1
DT_ROOT=$2
SUBJ_NAME=$3
SUBJ_NAME_FORMAL=$4
NEW_DT_SUBJ=$5

PRESET_CP=$6
if [ "$PRESET_CP" = "true" ]; then
  CLASSPATH=$9
else
  DT_TOOLS=$9
  DT_LIBS=$10
  DT_CLASS=$11
  DT_RANDOOP=$12
  DT_TESTS=$13

  CLASSPATH=$DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:$DT_TESTS
fi

PRECOMPUTE_DEPENDENCES=$7
PRECOMPUTE_FLAG=""
if [ "$PRECOMPUTE_DEPENDENCES" = "true" ]; then
  PRECOMPUTE_FLAG="-resolveDependences $DT_ROOT/$prioList/prioritization-$SUBJ_NAME_FORMAL-$k-$i-$j.txt"
fi

GEN_ENHANCED_RESULTS=$8

for j in "${testTypes[@]}"; do

  if [ "$GEN_ENHANCED_RESULTS" = "true" ]; then
    echo "[INFO] Running prioritization for $j test type"
    java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
      -technique prioritization \
      -coverage statement \
      -order original \
      -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$j-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$j \
      -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $j \
      -outputDir $DT_ROOT/$paraDir \
      -timesToRun $medianTimes \
      -getCoverage
  fi

  for k in "${machines[@]}"; do

    # [INFO] Running parallelization with resolveDependences and without dependentTestFile for original order
    echo "[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
      -technique parallelization \
      -order original \
      -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$j-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$j \
      -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $j \
      -numOfMachines $k \
      -outputDir $DT_ROOT/$paraDir \
      -timesToRun $medianTimes \
      $PRECOMPUTE_FLAG"
    java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
      -technique parallelization \
      -order original \
      -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$j-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$j \
      -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $j \
      -numOfMachines $k \
      -outputDir $DT_ROOT/$paraDir \
      -timesToRun $medianTimes \
      $PRECOMPUTE_FLAG

    if [ "$GEN_ENHANCED_RESULTS" = "true" ]; then
      echo "[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
        -technique parallelization \
        -order original \
        -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$j-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$j \
        -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $j \
        -numOfMachines $k \
        -outputDir $DT_ROOT/$paraDir \
        -timesToRun $medianTimes \
        -dependentTestFile $DT_ROOT/$paraList/\"parallelization-$SUBJ_NAME_FORMAL-$j-$k-original.txt\""
      java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
        -technique parallelization \
        -order original \
        -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$j-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$j \
        -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $j \
        -numOfMachines $k \
        -outputDir $DT_ROOT/$paraDir \
        -timesToRun $medianTimes \
        -dependentTestFile $DT_ROOT/$paraList/"parallelization-$SUBJ_NAME_FORMAL-$j-$k-original.txt"
    fi

    # [INFO] Running parallelization with resolveDependences and without dependentTestFile for time order
    echo "[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
      -technique parallelization \
      -order time \
      -timeOrder $DT_SUBJ/$SUBJ_NAME-$j-time.txt \
      -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$j-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$j \
      -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
      -numOfMachines $k \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $j \
      -timesToRun $medianTimes \
      -outputDir $DT_ROOT/$paraDir \
      $PRECOMPUTE_FLAG"
    java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
      -technique parallelization \
      -order time \
      -timeOrder $DT_SUBJ/$SUBJ_NAME-$j-time.txt \
      -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$j-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$j \
      -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
      -numOfMachines $k \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $j \
      -timesToRun $medianTimes \
      -outputDir $DT_ROOT/$paraDir \
      $PRECOMPUTE_FLAG

    if [ "$GEN_ENHANCED_RESULTS" = "true" ]; then
      echo "[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
        -technique parallelization \
        -order time \
        -timeOrder $DT_SUBJ/$SUBJ_NAME-$j-time.txt \
        -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$j-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$j \
        -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
        -numOfMachines $k \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $j \
        -timesToRun $medianTimes \
        -outputDir $DT_ROOT/$paraDir \
        -dependentTestFile $DT_ROOT/$paraList/\"parallelization-$SUBJ_NAME_FORMAL-$j-$k-time.txt\""
      java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
        -technique parallelization \
        -order time \
        -timeOrder $DT_SUBJ/$SUBJ_NAME-$j-time.txt \
        -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$j-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$j \
        -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
        -numOfMachines $k \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $j \
        -timesToRun $medianTimes \
        -outputDir $DT_ROOT/$paraDir \
        -dependentTestFile $DT_ROOT/$paraList/"parallelization-$SUBJ_NAME_FORMAL-$j-$k-time.txt"
    fi
  done

  clearTemp
done
