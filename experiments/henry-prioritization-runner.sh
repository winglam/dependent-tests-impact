#source ./henry-config.sh

#compileSource


testTypes=(orig)
coverages=(statement function)
machines=(2 4 8 16)
priorOrders=(absolute relative)
seleOrders=(original absolute relative)

function clearTemp() {
#  rm -rf sootTestOutput
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
  rm -rf dtFixerOutput
}

function clearInstrumentation() {
  rm -rf sootOutput
  rm -rf variableToType.dat
}



#index=0
#count=${#experiments[@]}

#while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: $1"
  cd $2

  #fixerInstrumentFiles ${fixerCP[$index]}
  #instrumentFiles ${experimentsCP[$index]}
  for k in "${testTypes[@]}"; do
    #echo 'Generating sootTestOutput'
    #java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests ${experiments[$index]}-$k-order
    #mv sootTestOutput sootTestOutput-$k
    #java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage statement -order original -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput-$k -filesToDelete ${experiments[$index]}-env-files -project "${experimentsName[$index]}" -testType $k -outputDir ${initialDir}/${priorDir} -timesToRun ${medianTimes} -getCoverage

    for i in "${coverages[@]}"; do
      for j in "${priorOrders[@]}"; do
        #echo 'Running prioritization without resolveDependences and with dependentTestFile'
        #java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput-$k -filesToDelete ${experiments[$index]}-env-files -getCoverage -project "${experimentsName[$index]}" -testType $k -outputDir ${initialDir}/${priorDir} -dependentTestFile ${initialDir}/prioritization-dt-list/"prioritization-${experimentsName[$index]}-$k-$i-$j.txt" -timesToRun ${medianTimes}

        #echo 'Running prioritization with resolveDependences and with dependentTestFile'
        #java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput-$k -filesToDelete ${experiments[$index]}-env-files -getCoverage -project "${experimentsName[$index]}" -testType $k -outputDir ${initialDir}/${priorDir} -dependentTestFile ${initialDir}/prioritization-dt-list/"prioritization-${experimentsName[$index]}-$k-$i-$j.txt" -timesToRun ${medianTimes} -resolveDependences ${initialDir}/prioritization-dt-list/"prioritization-${experimentsName[$index]}-$k-$i-$j.txt"

        echo 'Running prioritization without resolveDependences and without dependentTestFile'
        java -cp ${3}/*:${4}/*:${5}:${6} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder $1-$k-order -testInputDir sootTestOutput-$k -filesToDelete $1-env-files -getCoverage -project "${1}" -testType $k -outputDir ${7} -timesToRun 1

        #echo 'Running prioritization with resolveDependences and without dependentTestFile'
        #java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput-$k -filesToDelete ${experiments[$index]}-env-files -getCoverage -project "${experimentsName[$index]}" -testType $k -outputDir ${initialDir}/${priorDir} -timesToRun ${medianTimes} -resolveDependences ${initialDir}/prioritization-dt-list/"prioritization-${experimentsName[$index]}-$k-$i-$j.txt"
      done
    done
    clearTemp $1 $k
  done
  clearInstrumentation
  cd ..
  #let "index++"
#done
