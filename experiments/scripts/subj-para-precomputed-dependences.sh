# Usage: subj-para-precomputed-dependences.sh $DT_SUBJ $DT_ROOT $DT_TOOLS $SUBJ_NAME $SUBJ_NAME_FORMAL true ...
# Usage: subj-para-precomputed-dependences.sh $DT_SUBJ $DT_ROOT $DT_TOOLS $SUBJ_NAME $SUBJ_NAME_FORMAL false $DT_TOOLS $DT_LIBS $DT_CLASS $DT_RANDOOP $DT_TESTS

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

for j in "${testTypes[@]}"; do
  for k in "${machines[@]}"; do

    echo 'Running parallelization with resolveDependences and without dependentTestFile for original order'
    java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $SUBJ_NAME-$j-order -testInputDir $DT_SUBJ/sootTestOutput-$j -filesToDelete $SUBJ_NAME-env-files -project "$SUBJ_NAME_FORMAL" -testType $j -numOfMachines $k -outputDir $DT_ROOT/${paraDir} -timesToRun ${medianTimes} -resolveDependences $DT_ROOT/parallelization-dt-list/"parallelization-$SUBJ_NAME_FORMAL-$j-$k-original.txt"

    echo 'Running parallelization with resolveDependences and without dependentTestFile for time order'
    java -cp $CLASSPATH edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $DT_SUBJ/$SUBJ_NAME-$j-time.txt -origOrder $SUBJ_NAME-$j-order -testInputDir $DT_SUBJ/sootTestOutput-$j -filesToDelete $SUBJ_NAME-env-files -numOfMachines $k -project "$SUBJ_NAME_FORMAL" -testType $j -timesToRun ${medianTimes} -outputDir $DT_ROOT/${paraDir} -resolveDependences $DT_ROOT/parallelization-dt-list/"parallelization-$SUBJ_NAME_FORMAL-$j-$k-time.txt"
  done

  clearTemp
done

cd $DT_ROOT
