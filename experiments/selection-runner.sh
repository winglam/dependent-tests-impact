source ./config.sh

compileSource
compileNewSource

index=0
count=${#experiments[@]}

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

    echo 'Running prioritization for original order'
    java -Xms1g -Xmx2g -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage statement -order original -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -outputDir ./${seleDir} -timesToRun ${medianTimes}

    for i in "${coverages[@]}"; do
      for j in "${seleOrders[@]}"; do
        echo 'Running selection without resolveDependences and with dependentTestFile'
        java -Xms1g -Xmx2g -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput -getCoverage -outputDir ./${seleDir} -timesToRun ${medianTimes} -dependentTestFile ./
        echo 'Running selection without resolveDependences and without dependentTestFile'
        java -Xms1g -Xmx2g -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput -getCoverage -outputDir ./${seleDir} -timesToRun ${medianTimes}
      done
    done
    clearSelectionTemp ${directories[$index]} ${newDirectories[$index]}
  done

  let "index++"
done
