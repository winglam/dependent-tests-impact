# Usage: subj-prio.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL true false ...
# Usage: subj-prio.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL false false $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

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
  PRECOMPUTE_FLAG="-resolveDependences $DT_ROOT/$prioList/prioritization-$SUBJ_NAME_FORMAL-$k-$i-$j.txt"
fi

for k in "${testTypes[@]}"; do
  for i in "${coverages[@]}"; do
    for j in "${priorOrders[@]}"; do
      echo '[INFO] Running prioritization...'

      # Running prioritization with resolveDependences and without dependentTestFile
      echo '[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
        -technique prioritization \
        -coverage $i \
        -order $j \
        -origOrder $SUBJ_NAME-$k-order \
        -testInputDir sootTestOutput-$k \
        -filesToDelete $SUBJ_NAME-env-files \
        -getCoverage \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $k \
        -outputDir $DT_ROOT/$prioDir \
        -timesToRun $medianTimes \
        $PRECOMPUTE_FLAG'
      java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
        -technique prioritization \
        -coverage $i \
        -order $j \
        -origOrder $SUBJ_NAME-$k-order \
        -testInputDir sootTestOutput-$k \
        -filesToDelete $SUBJ_NAME-env-files \
        -getCoverage \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $k \
        -outputDir $DT_ROOT/$prioDir \
        -timesToRun $medianTimes \
        $PRECOMPUTE_FLAG

      if [ "$PRECOMPUTE_DEPENDENCES" = "false" ]; then
        echo '[DEBUG] java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
          -technique prioritization \
          -coverage $i \
          -order $j \
          -origOrder $SUBJ_NAME-$k-order \
          -testInputDir sootTestOutput-$k \
          -filesToDelete $SUBJ_NAME-env-files \
          -getCoverage \
          -project "$SUBJ_NAME_FORMAL" \
          -testType $k \
          -outputDir $DT_ROOT/$prioDir \
          -timesToRun $medianTimes \
          -dependentTestFile $DT_ROOT/$prioList/"prioritization-$SUBJ_NAME_FORMAL-$k-$i-$j.txt"'
        java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner \
          -technique prioritization \
          -coverage $i \
          -order $j \
          -origOrder $SUBJ_NAME-$k-order \
          -testInputDir sootTestOutput-$k \
          -filesToDelete $SUBJ_NAME-env-files \
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
