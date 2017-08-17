# Usage: subj-sele.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL $NEW_DT_SUBJ true ...
# Usage: subj-sele.sh $DT_SUBJ $DT_ROOT $SUBJ_NAME $SUBJ_NAME_FORMAL $NEW_DT_SUBJ false $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

source ./constants.sh

DT_SUBJ=$1
DT_ROOT=$2
SUBJ_NAME=$3
SUBJ_NAME_FORMAL=$4
NEW_DT_SUBJ=$5

PRESET_CP=$6
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

for k in "${testTypes[@]}"; do

  echo "[INFO] Running prioritization for ${testTypes[@]} test type"
  java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
    -technique prioritization \
    -coverage statement \
    -order original \
    -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$k-order \
    -testInputDir $DT_SUBJ/sootTestOutput-$k-selection \
    -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
    -project "$SUBJ_NAME_FORMAL" \
    -testType $k \
    -outputDir $DT_ROOT/$seleDir \
    -timesToRun $medianTimes \
    -getCoverage

  for i in "${coverages[@]}"; do
    for j in "${seleOrders[@]}"; do

      # [INFO] Running selection without resolveDependences and with dependentTestFile
      java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
        -technique selection \
        -coverage $i \
        -order $j \
        -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$k-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$k-selection \
        -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $k \
        -oldVersCFG $DT_SUBJ/selectionOutput \
        -newVersCFG $NEW_DT_SUBJ/selectionOutput \
        -getCoverage \
        -outputDir $DT_ROOT/$seleDir \
        -timesToRun $medianTimes \
        -dependentTestFile $DT_ROOT/$seleList/"selection-$SUBJ_NAME-$k-$i-$j.txt"

      # [INFO] Running selection without resolveDependences and without dependentTestFile
      java -cp $CLASSPATH edu.washington.cs.dt.impact.runner.OneConfigurationRunner \
        -technique selection \
        -coverage $i \
        -order $j \
        -origOrder $NEW_DT_SUBJ/$SUBJ_NAME-$k-order \
        -testInputDir $DT_SUBJ/sootTestOutput-$k-selection \
        -filesToDelete $NEW_DT_SUBJ/$SUBJ_NAME-env-files \
        -project "$SUBJ_NAME_FORMAL" \
        -testType $k \
        -oldVersCFG $DT_SUBJ/selectionOutput \
        -newVersCFG $NEW_DT_SUBJ/selectionOutput \
        -getCoverage \
        -outputDir $DT_ROOT/$seleDir \
        -timesToRun $medianTimes
    done
  done
done
