source ./newExp-config.sh

function instrumentNewSelectionFiles() {
  cd $1
  echo 'Enhanced instrumenting new subject'
  java -cp $2 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir classes -technique selection
  java -cp $2 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir test-classes -technique selection

  cd ${initialDir}/$3
  echo 'Enhanced instrumenting old subject'
  java -cp $4 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir classes -technique selection
  java -cp $4 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir test-classes -technique selection

  echo 'Generating sootTestOutput on old subject'
  java -cp $5 edu.washington.cs.dt.main.ImpactMain -inputTests ${initialDir}/$1/$6
  mv sootTestOutput sootTestOutput-$7-selection
  cd ..
}

#compileSource
#compileNewSource

index=0
count=${#newExperiments[@]}

while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${newExperiments[$index]}"

  for k in "${newExpTestTypes[@]}"; do
    instrumentNewSelectionFiles ${nextExpDirectories[$index]} ${nextExpCP[$index]} ${newExpDirectories[$index]} ${newExpCP[$index]} ${newExpSootCP[$index]} ${newExperiments[$index]}-$k-order $k

    echo 'Running prioritization for original order'
    java -Xms1g -Xmx2g -cp ${nextExpCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage statement -order original -origOrder ${nextExpDirectories[$index]}/${newExperiments[$index]}-$k-order -testInputDir ${newExpDirectories[$index]}/sootTestOutput-$k-selection -filesToDelete ${nextExpDirectories[$index]}/${newExperiments[$index]}-env-files -project ${newExperimentsName[$index]} -testType $k -outputDir ${initialDir}/${seleDir} -timesToRun ${medianTimes} -getCoverage

    for i in "${coverages[@]}"; do
      for j in "${seleOrders[@]}"; do
        #echo 'Running selection without resolveDependences and with dependentTestFile'
        #java -Xms1g -Xmx2g -cp ${nextExpCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${nextExpDirectories[$index]}/${newExperiments[$index]}-$k-order -testInputDir ${newExpDirectories[$index]}/sootTestOutput-$k-selection -filesToDelete ${nextExpDirectories[$index]}/${newExperiments[$index]}-env-files -project "${newExperimentsName[$index]}" -testType $k -oldVersCFG ${newExpDirectories[$index]}/selectionOutput -newVersCFG ${nextExpDirectories[$index]}/selectionOutput -getCoverage -outputDir ${initialDir}/${seleDir} -timesToRun ${medianTimes} -dependentTestFile ${initialDir}/
        #echo 'Running selection without resolveDependences and without dependentTestFile'
        #java -Xms1g -Xmx2g -cp ${nextExpCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${nextExpDirectories[$index]}/${newExperiments[$index]}-$k-order -testInputDir ${newExpDirectories[$index]}/sootTestOutput-$k-selection -filesToDelete ${nextExpDirectories[$index]}/${newExperiments[$index]}-env-files -project "${newExperimentsName[$index]}" -testType $k -oldVersCFG ${newExpDirectories[$index]}/selectionOutput -newVersCFG ${nextExpDirectories[$index]}/selectionOutput -getCoverage -outputDir ${initialDir}/${seleDir} -timesToRun ${medianTimes}
        #echo 'Running selection with resolveDependences and without dependentTestFile'
        #java -Xms1g -Xmx2g -cp ${nextExpCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${nextExpDirectories[$index]}/${newExperiments[$index]}-$k-order -testInputDir ${newExpDirectories[$index]}/sootTestOutput-$k-selection -filesToDelete ${nextExpDirectories[$index]}/${newExperiments[$index]}-env-files -project "${newExperimentsName[$index]}" -testType $k -oldVersCFG ${newExpDirectories[$index]}/selectionOutput -newVersCFG ${nextExpDirectories[$index]}/selectionOutput -getCoverage -outputDir ${initialDir}/${seleDir} -timesToRun ${medianTimes} -resolveDependences
      done
    done
    clearSelectionTemp ${newExpDirectories[$index]} ${nextExpDirectories[$index]}
  done

  let "index++"
done
