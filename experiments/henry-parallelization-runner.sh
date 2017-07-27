#source ./config.sh

function runParallelizationOneConfigurationRunner() {
  #java -cp $2 edu.washington.cs.dt.main.ImpactMain -inputTests $1-$3-order -getTime > $1-$3-time.txt
  for k in "${machines[@]}"; do
    echo 'Running parallelization without resolveDependences and without dependentTestFile for time order'
    java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $5/$1-$3-time.txt -origOrder $1-$3-order -testInputDir $5/sootTestOutput-$3 -filesToDelete $1-env-files -numOfMachines $k -project "$4" -testType $3 -timesToRun ${medianTimes} -outputDir ${initialDir}/${paraDir}
    echo 'Running parallelization without resolveDependences and without dependentTestFile for original order'
    java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $1-$3-order -testInputDir $5/sootTestOutput-$3 -filesToDelete $1-env-files -project "$4" -testType $3 -numOfMachines $k -outputDir ${initialDir}/${paraDir} -timesToRun 1

    #echo 'Running parallelization with resolveDependences and without dependentTestFile for original order'
    #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $1-$3-order -testInputDir $5/sootTestOutput-$3 -filesToDelete $1-env-files -project "$4" -testType $3 -numOfMachines $k -outputDir ${initialDir}/${paraDir} -timesToRun ${medianTimes} -resolveDependences ${initialDir}/parallelization-dt-list/"parallelization-$4-$3-$k-original.txt"
    #echo 'Running parallelization with resolveDependences and without dependentTestFile for time order'
    #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $5/$1-$3-time.txt -origOrder $1-$3-order -testInputDir $5/sootTestOutput-$3 -filesToDelete $1-env-files -numOfMachines $k -project "$4" -testType $3 -timesToRun ${medianTimes} -outputDir ${initialDir}/${paraDir} -resolveDependences ${initialDir}/parallelization-dt-list/"parallelization-$4-$3-$k-time.txt"
  done
}

function clearTemp() {
#  rm -rf sootTestOutput
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
  rm -rf dtFixerOutput
}

testTypes=(orig)
coverages=(statement function)
machines=(2 4 8 16)
priorOrders=(absolute relative)
seleOrders=(original absolute relative)

#compileSource

#index=0
#count=${#experiments[@]}

#while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: $1"
  cd $2

  for j in "${testTypes[@]}"; do
    #fixerInstrumentFiles ${fixerCP[$index]}
    #instrumentFiles ${experimentsCP[$index]}

    #echo 'Generating sootTestOutput'
    #java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests ${experiments[$index]}-$j-order

    #echo 'Running prioritization for original order'
    #java -Xms1g -Xmx2g -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage statement -order original -origOrder ${experiments[$index]}-$j-order -testInputDir sootTestOutput-$j -filesToDelete ${experiments[$index]}-env-files -project "${experimentsName[$index]}" -testType $j -outputDir ${initialDir}/${paraDir} -timesToRun ${medianTimes} -getCoverage

    #runParallelizationOneConfigurationRunner ${experiments[$index]} ${experimentsCP[$index]} $j "${experimentsName[$index]}" ${initialDir}/${directories[$index]}/
    
    #java -cp $2 edu.washington.cs.dt.main.ImpactMain -inputTests $1-$3-order -getTime > $1-$3-time.txt
    for k in "${machines[@]}"; do
      echo 'Running parallelization without resolveDependences and without dependentTestFile for time order'
      java -cp ${3}/*:${4}/*:$5:$6 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $2/$1-$j-time.txt -origOrder $1-$j-order -testInputDir $2/sootTestOutput-$j -filesToDelete $1-env-files -numOfMachines $k -project "$1" -testType $3 -timesToRun $1 -outputDir $7
      echo 'Running parallelization without resolveDependences and without dependentTestFile for original order'
      java -cp ${3}/*:${4}/*:$5:$6 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $1-$j-order -testInputDir $2/sootTestOutput-$j -filesToDelete $1-env-files -project "$1" -testType $j -numOfMachines $k -outputDir $7 -timesToRun 1
  
      #echo 'Running parallelization with resolveDependences and without dependentTestFile for original order'
      #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $1-$3-order -testInputDir $5/sootTestOutput-$3 -filesToDelete $1-env-files -project "$4" -testType $3 -numOfMachines $k -outputDir ${initialDir}/${paraDir} -timesToRun ${medianTimes} -resolveDependences ${initialDir}/parallelization-dt-list/"parallelization-$4-$3-$k-original.txt"
      #echo 'Running parallelization with resolveDependences and without dependentTestFile for time order'
      #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $5/$1-$3-time.txt -origOrder $1-$3-order -testInputDir $5/sootTestOutput-$3 -filesToDelete $1-env-files -numOfMachines $k -project "$4" -testType $3 -timesToRun ${medianTimes} -outputDir ${initialDir}/${paraDir} -resolveDependences ${initialDir}/parallelization-dt-list/"parallelization-$4-$3-$k-time.txt"
    done


    clearTemp $1 $j
  done

  cd ..
  let "index++"
#done
