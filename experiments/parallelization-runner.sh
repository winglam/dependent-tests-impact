source ./config.sh

index=0
count=${#experiments[@]}
while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"
  cd ${directories[$index]}

  for j in "${testTypes[@]}"; do
    instrumentFiles ${experimentsCP[$index]}

    echo 'Generating sootTestOutput'
  	java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests ${experiments[$index]}-$j-order

    runParallelizationOneConfigurationRunner ${experiments[$index]} ${experimentsCP[$index]} $j
    clearTemp
  done

  cd ..
  let "index++"
done
