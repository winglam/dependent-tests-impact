source ./config.sh

compileSource

index=0
count=${#experiments[@]}
while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"
  cd ${directories[$index]}

  for j in "${testTypes[@]}"; do
    instrumentFiles ${experimentsCP[$index]}

	# generate sootTestOutput
  	java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain ${experiments[$index]}-$j-order
    runPrioritizationWrapper ${experiments[$index]} ${experimentsCP[$index]} $j
    clearTemp
  done

  cd ..
  let "index++"
done
