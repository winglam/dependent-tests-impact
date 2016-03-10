source ./config.sh

compileSource

index=0
count=${#experiments[@]}
ARRAY=()

while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"
  cd ${directories[$index]}

  for k in "${testTypes[@]}"; do
    instrumentFiles ${experimentsCP[$index]}

	  # generate sootTestOutput
    echo 'Generating sootTestOutput'
  	java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests ${experiments[$index]}-$k-order

    for i in "${coverages[@]}"; do
      for j in "${orders[@]}"; do
        echo 'Running prioritization without resolveDependences and with dependentTestFile'
        java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -getCoverage -project ${experiments[$index]} -testType $k -outputDir ../${priorDir} -dependentTestFile ../
        #echo 'Running prioritization with resolveDependences and with dependentTestFile'
        #java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -project ${experiments[$index]} -testType $k -dependentTestFile ../${experiments[$index]}-$k-DT-prioritization-with-gods-eye
        echo 'Running prioritization without resolveDependences and without dependentTestFile'
        java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -getCoverage -project ${experiments[$index]} -testType $k -outputDir ../${priorDir}

        ARRAY+=(${directories[$index]}/${experiments[$index]}-$k-prioritization-$i-$j)
      done
    done
    clearTemp
  done

  cd ..
  let "index++"
done
