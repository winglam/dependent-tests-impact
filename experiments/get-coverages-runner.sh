source ./config.sh

#compileSource

index=0
count=${#experiments[@]}
ARRAY=()

while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"
  cd ${directories[$index]}

  for k in "${testTypes[@]}"; do
    echo 'Instrumenting new subject'
    instrumentFiles ${experimentsCP[$index]}

    # generate sootTestOutput
    java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests ${experiments[$index]}-$k-order

    #java -cp $impactJarCP $testListGenClass -technique prioritization -coverage statement -outputFile ${experiments[$index]}-$k-statement-original-no-DT-coverage.txt -origOrder ${experiments[$index]}-$k-order -getCoverage

    for i in "${coverages[@]}"; do
      echo ''
      java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -outputFile ${experiments[$index]}-$k-$i-orig-with-DT-coverage.txt -getCoverage -origOrder ../testing-orders/${experiments[$index]}-$k-selection-newVers-$i-original-with-DT
      #java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -outputFile ${experiments[$index]}-$k-$i-orig-no-DT-coverage.txt -getCoverage -origOrder ../testing-orders/${experiments[$index]}-$k-selection-newVers-$i-original-no-DT

      for j in "${orders[@]}"; do
        echo ''
        #java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -outputFile ${experiments[$index]}-$k-$i-$j-no-DT-coverage.txt -origOrder ../prioritization-orders/${experiments[$index]}-$k-prioritization-$i-$j-no-DT -getCoverage
        #java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -outputFile ${experiments[$index]}-$k-$i-$j-with-DT-coverage.txt -origOrder ../prioritization-orders/${experiments[$index]}-$k-DT-prioritization-$i-$j-fixed-DT -getCoverage
        #java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -outputFile ${experiments[$index]}-$k-$i-$j-no-DT-coverage.txt -origOrder ../testing-orders/${experiments[$index]}-$k-selection-newVers-$i-$j-no-DT -getCoverage
        #java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -outputFile ${experiments[$index]}-$k-$i-$j-with-DT-coverage.txt -origOrder ../testing-orders/${experiments[$index]}-$k-selection-newVers-$i-$j-with-DT -getCoverage

      done
    done
    clearTemp
  done

  cd ..
  let "index++"
done
