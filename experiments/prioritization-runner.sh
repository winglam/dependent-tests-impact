directories=(crystalvc dynoptic jfreechart-1.0.15 jodatime-b609d7d66d xml-security-orig-v1)
experiments=(crystal synoptic jfreechart jodatime xml-security)
testTypes=(orig auto)
experimentsCP=(impact-tools/*:bin/:lib/* impact-tools/*:bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:bin/:lib/* impact-tools/*:bin/:resources/:lib/* impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
sootCP=(impact-tools/*:sootOutput/:lib/* impact-tools/*:sootOutput/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:sootOutput/:lib/* impact-tools/*:sootOutput/:resources/:lib/* impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
dependentFree=true

source ./config.sh

index=0
count=${#experiments[@]}
while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"
  cd ${directories[$index]}

  for j in "${testTypes[@]}"; do
    instrumentFiles ${experimentsCP[$index]}

	# generate sootTestOutput
  	java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain ${experiments[$index]}-$j-order
    runPrioritizationWrapper ${experiments[$index]} ${experimentsCP[$index]} $j $dependentFree
    clearTemp
  done

  cd ..
  let "index++"
done
