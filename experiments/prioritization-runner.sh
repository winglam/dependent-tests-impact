source ./config.sh

#compileSource

index=0
count=${#experiments[@]}
ARRAY=()

while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"
  cd ${directories[$index]}

  for k in "${testTypes[@]}"; do
    #instrumentFiles ${experimentsCP[$index]}

	  # generate sootTestOutput
  	#java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain ${experiments[$index]}-$k-order

    DTChainCoverages=(statement)
    for i in "${DTChainCoverages[@]}"; do
      for j in "${orders[@]}"; do
        #  java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique prioritization -coverage $i -order $j -resolveDependences -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-DT-prioritization-$i-$j
        #  java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique prioritization -coverage $i -order $j -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-prioritization-$i-$j
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
