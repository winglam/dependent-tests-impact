# Usage: subj-prio-precomputed-dependences.sh $DT_SUBJ $DT_ROOT $DT_TOOLS $SUBJ_NAME $SUBJ_NAME_FORMAL true ...
# Usage: subj-prio-precomputed-dependences.sh $DT_SUBJ $DT_ROOT $DT_TOOLS $SUBJ_NAME $SUBJ_NAME_FORMAL false $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

source ./constants.sh

DT_SUBJ=$1
DT_ROOT=$2
SUBJ_NAME=$3
SUBJ_NAME_FORMAL=$4

PRESET_CP=$5
if [ "$PRESET_CP" = "true" ]; then
  CLASSPATH=$6
else 
  DT_TOOLS=$6
  DT_LIBS=$7
  DT_CLASS=$8
  DT_RANDOOP=$9
  DT_TESTS=$10

  CLASSPATH=$DT_TOOLS:$DT_LIBS:$DT_CLASS:$DT_RANDOOP:$DT_TESTS
fi

echo -e "Starting experiment: ${newExperiments[$index]}"
cd $DT_SUBJ

for k in "${testTypes[@]}"; do
  for i in "${coverages[@]}"; do
    for j in "${priorOrders[@]}"; do
      echo 'Running prioritization with resolveDependences and without dependentTestFile'
      java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder $SUBJ_NAME-$k-order -testInputDir sootTestOutput-$k -filesToDelete $SUBJ_NAME-env-files -getCoverage -project "$SUBJ_NAME_FORMAL" -testType $k -outputDir $DT_ROOT/${priorDir} -timesToRun ${medianTimes} -resolveDependences $DT_ROOT/prioritization-dt-list/"prioritization-$SUBJ_NAME_FORMAL-$k-$i-$j.txt"
    done
  done
  clearTemp
done

cd $DT_ROOT