source ./config.sh

compileSource
compileNewSource

index=0
count=${#experiments[@]}
ARRAY=()

while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"

  for k in "${testTypes[@]}"; do
    cd ${newDirectories[$index]}
    echo 'Instrumenting new subject'
    java -cp ${instrumentNewExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection

    cd ../${directories[$index]}
    echo 'Instrumenting old subject'
    java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection

    echo 'Generating sootTestOutput on old subject'
    java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests ../${newDirectories[$index]}/${experiments[$index]}-$k-order
    cd ..

    echo 'Running selection on V2 for original order'
    java -Xms1g -Xmx2g -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage statement -order original -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -getCoverage -outputDir ./${seleDir}

    for i in "${coverages[@]}"; do
      for j in "${orders[@]}"; do
        # run selection on V1
        #echo 'Running selection on V1 with resolveDependences'
        #java -cp ${oldExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -resolveDependences -origOrder ${directories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${directories[$index]}/${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput
        #echo 'Running selection on V1 without resolveDependences'
        #java -cp ${oldExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${directories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${directories[$index]}/${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput

        #echo 'Running selection on V2 without resolveDependences and with dependentTestFile'
        #java -Xms1g -Xmx2g -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput -dependentTestFile crystal-auto-DT-selection-100-prioritization-250-selection-100
        echo 'Running selection on V2 without resolveDependences and without dependentTestFile'
        java -Xms1g -Xmx2g -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput -getCoverage -outputDir ./${seleDir}
        #echo 'Running selection on V2 with resolveDependences and with dependentTestFile'
        #java -Xms1g -Xmx2g -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -resolveDependences -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput -dependentTestFile ${experiments[$index]}-$k-DT-selection
        #-dependentTestFile ${experiments[$index]}-$k-DT-selection-oldVers-$i-$j

        ARRAY+=(${directories[$index]}/${experiments[$index]}-$k-selection-$i-$j)
      done
    done
    clearSelectionTemp ${directories[$index]} ${newDirectories[$index]}
  done

  let "index++"
done

arguments=''
for k in "${ARRAY[@]}"; do
  arguments="$arguments $k"
done

java -cp $impactJarCP edu.washington.cs.dt.impact.Main.ResultsParser $arguments
