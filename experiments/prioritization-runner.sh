source ./config.sh

compileSource

index=0
count=${#experiments[@]}

while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"
  cd ${directories[$index]}

  for k in "${testTypes[@]}"; do
    fixerInstrumentFiles ${fixerCP[$index]}
    #instrumentFiles ${experimentsCP[$index]}

    echo 'Generating sootTestOutput'
  	java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests ${experiments[$index]}-$k-order

    java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage statement -order original -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -outputDir ../${priorDir} -timesToRun ${medianTimes} -getCoverage

    for i in "${coverages[@]}"; do
      for j in "${priorOrders[@]}"; do
        #echo 'Running prioritization without resolveDependences and with dependentTestFile'
        #java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -getCoverage -project ${experiments[$index]} -testType $k -outputDir ../${priorDir} -dependentTestFile ../ -timesToRun ${medianTimes}
        echo 'Running prioritization without resolveDependences and without dependentTestFile'
        java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -getCoverage -project ${experiments[$index]} -testType $k -outputDir ../${priorDir} -timesToRun ${medianTimes}
      done
    done
    clearTemp ${experiments[$index]} $k
  done

  cd ..
  let "index++"
done
