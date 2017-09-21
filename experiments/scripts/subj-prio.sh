# Usage: subj-prio.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL $NEW_DT_SUBJ true false true ...
# Usage: subj-prio.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL $NEW_DT_SUBJ false false true $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

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
  DT_LIBS=${10}
  DT_CLASS=${11}
  DT_RANDOOP=${12}
  DT_TESTS=${13}

  CLASSPATH=$DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:$DT_TESTS
fi

PRECOMPUTE_DEPENDENCES=$7
PRECOMPUTE_FLAG=""
if [ "$PRECOMPUTE_DEPENDENCES" = "true" ]; then
  PRECOMPUTE_FLAG="-resolveDependences $DT_ROOT/$prioList/prioritization-$SUBJ_NAME_FORMAL-$k-$i-$j.txt"
fi

GEN_ENHANCED_RESULTS=$8

for k in "${testTypes[@]}"; do

  if [ "$GEN_ENHANCED_RESULTS" = "true" ]; then
    echo "[INFO] Running prioritization for ${testTypes[@]} test type"
    java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
      -technique prioritization \
      -coverage statement \
      -order original \
      -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$k-order \
      -testInputDir $DT_SUBJ/sootTestOutput-$k \
      -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
      -project "$SUBJ_NAME_FORMAL" \
      -testType $k \
      -outputDir $DT_ROOT/$prioDir \
      -timesToRun $medianTimes \
      -getCoverage
  fi

  for i in "${coverages[@]}"; do
    for j in "${priorOrders[@]}"; do

      # Running prioritization with resolveDependences and without dependentTestFile
      echo "[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
        -technique prioritization \
        -coverage $i \
        -order $j \
        -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$k-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$k \
        -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
        -getCoverage \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $k \
        -outputDir $DT_ROOT/$prioDir \
        -timesToRun $medianTimes \
        $PRECOMPUTE_FLAG"
      java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
        -technique prioritization \
        -coverage $i \
        -order $j \
        -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$k-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$k \
        -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
        -getCoverage \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $k \
        -outputDir $DT_ROOT/$prioDir \
        -timesToRun $medianTimes \
        $PRECOMPUTE_FLAG

      if [ "$GEN_ENHANCED_RESULTS" = "true" ]; then
        echo "[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
          -technique prioritization \
          -coverage $i \
          -order $j \
          -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$k-order \
          -testInputDir $DT_SUBJ/sootTestOutput-$k \
          -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
          -getCoverage \
          -project "$SUBJ_NAME_FORMAL" \
          -testType $k \
          -outputDir $DT_ROOT/$prioDir \
          -timesToRun $medianTimes \
          -dependentTestFile $DT_ROOT/$prioList/\"prioritization-$SUBJ_NAME_FORMAL-$k-$i-$j.txt\""
        java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
          -technique prioritization \
          -coverage $i \
          -order $j \
          -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$k-order \
          -testInputDir $DT_SUBJ/sootTestOutput-$k \
          -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
          -getCoverage \
          -project "$SUBJ_NAME_FORMAL" \
          -testType $k \
          -outputDir $DT_ROOT/$prioDir \
          -timesToRun $medianTimes \
          -dependentTestFile $DT_ROOT/$prioList/"prioritization-$SUBJ_NAME_FORMAL-$k-$i-$j.txt"
      fi
    done
  done
  clearTemp
done
