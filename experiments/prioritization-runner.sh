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
        #echo 'Running prioritization without resolveDependences and with dependentTestFile'
        #java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-DT-prioritization-$i-$j-with-DT -dependentTestFile ../${experiments[$index]}-$k-DT-prioritization-with-gods-eye
        #echo 'Running prioritization with resolveDependences and with dependentTestFile'
        #java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-DT-prioritization-$i-$j-fixed-DT -dependentTestFile ../${experiments[$index]}-$k-DT-prioritization-with-gods-eye
        echo 'Running prioritization without resolveDependences and without dependentTestFile'
        java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-prioritization-$i-$j-no-DT -getCoverage

        ARRAY+=(${directories[$index]}/${experiments[$index]}-$k-prioritization-$i-$j)
      done
    done
    clearTemp
  done

  cd ..
  let "index++"
done

arguments=''
for k in "${ARRAY[@]}"; do
  arguments="$arguments $k"
done

java -cp $impactJarCP edu.washington.cs.dt.impact.Main.ResultsParser $arguments
