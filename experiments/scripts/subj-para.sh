# Usage: subj-para.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL true false ...
# Usage: subj-para.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL false false $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

source ./constants.sh

DT_SUBJ=$1
DT_ROOT=$2
SUBJ_NAME=$3
SUBJ_NAME_FORMAL=$4

PRESET_CP=$5
if [ "$PRESET_CP" = "true" ]; then
  CLASSPATH=$7
else
  DT_TOOLS=$7
  DT_LIBS=$8
  DT_CLASS=$9
  DT_RANDOOP=$10
  DT_TESTS=$11

  CLASSPATH=$DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:$DT_TESTS
fi

PRECOMPUTE_DEPENDENCES=$6
PRECOMPUTE_FLAG=""
if [ "$PRECOMPUTE_DEPENDENCES" = "true" ]; then
  PRECOMPUTE_FLAG="-resolveDependences $DT_ROOT/$paraList/parallelization-$SUBJ_NAME_FORMAL-$j-$k-time.txt"
fi

for j in "${testTypes[@]}"; do
  for k in "${machines[@]}"; do
    echo '[INFO] Running parallelization...'

    # [INFO] Running parallelization with resolveDependences and without dependentTestFile for original order
    echo '[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
      -technique parallelization \
      -order original \
      -origOrder $SUBJ_NAME-$j-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$j \
      -filesToDelete $SUBJ_NAME-env-files \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $j \
      -numOfMachines $k \
      -outputDir $DT_ROOT/$paraDir \
      -timesToRun $medianTimes \
      $PRECOMPUTE_FLAG'
    java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
      -technique parallelization \
      -order original \
      -origOrder $SUBJ_NAME-$j-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$j \
      -filesToDelete $SUBJ_NAME-env-files \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $j \
      -numOfMachines $k \
      -outputDir $DT_ROOT/$paraDir \
      -timesToRun $medianTimes \
      $PRECOMPUTE_FLAG

    if [ "$PRECOMPUTE_DEPENDENCES" = "false" ]; then
      echo '[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
        -technique parallelization \
        -order original \
        -origOrder $SUBJ_NAME-$j-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$j \
        -filesToDelete $SUBJ_NAME-env-files \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $j \
        -numOfMachines $k \
        -outputDir $DT_ROOT/$paraDir \
        -timesToRun $medianTimes \
        -dependentTestFile $DT_ROOT/$paraList/"parallelization-$SUBJ_NAME_FORMAL-$j-$k-original.txt"'
      java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
        -technique parallelization \
        -order original \
        -origOrder $SUBJ_NAME-$j-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$j \
        -filesToDelete $SUBJ_NAME-env-files \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $j \
        -numOfMachines $k \
        -outputDir $DT_ROOT/$paraDir \
        -timesToRun $medianTimes \
        -dependentTestFile $DT_ROOT/$paraList/"parallelization-$SUBJ_NAME_FORMAL-$j-$k-original.txt"
    fi

    # [INFO] Running parallelization with resolveDependences and without dependentTestFile for time order
    echo '[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
      -technique parallelization \
      -order time \
      -timeOrder $DT_SUBJ/$SUBJ_NAME-$j-time.txt \
      -origOrder $SUBJ_NAME-$j-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$j \
      -filesToDelete $SUBJ_NAME-env-files \
      -numOfMachines $k \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $j \
      -timesToRun $medianTimes \
      -outputDir $DT_ROOT/$paraDir \
      $PRECOMPUTE_FLAG'
    java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
      -technique parallelization \
      -order time \
      -timeOrder $DT_SUBJ/$SUBJ_NAME-$j-time.txt \
      -origOrder $SUBJ_NAME-$j-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$j \
      -filesToDelete $SUBJ_NAME-env-files \
      -numOfMachines $k \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $j \
      -timesToRun $medianTimes \
      -outputDir $DT_ROOT/$paraDir \
      $PRECOMPUTE_FLAG

    if [ "$PRECOMPUTE_DEPENDENCES" = "false" ]; then
      echo '[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
        -technique parallelization \
        -order time \
        -timeOrder $DT_SUBJ/$SUBJ_NAME-$j-time.txt \
        -origOrder $SUBJ_NAME-$j-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$j \
        -filesToDelete $SUBJ_NAME-env-files \
        -numOfMachines $k \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $j \
        -timesToRun $medianTimes \
        -outputDir $DT_ROOT/$paraDir \
        -dependentTestFile $DT_ROOT/$paraList/"parallelization-$SUBJ_NAME_FORMAL-$j-$k-time.txt"'
      java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
        -technique parallelization \
        -order time \
        -timeOrder $DT_SUBJ/$SUBJ_NAME-$j-time.txt \
        -origOrder $SUBJ_NAME-$j-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$j \
        -filesToDelete $SUBJ_NAME-env-files \
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
