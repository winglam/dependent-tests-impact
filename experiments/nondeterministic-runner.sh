source ./config.sh

testType=orig
numTimesToRun=1
crossReferenceClass=edu.washington.cs.dt.impact.tools.CrossReferencer

compileSource

index=0
count=${#experiments[@]}

while [ "$index" -lt "$count" ]; do
  j=0
  k=0
  echo -e "Starting experiment: ${experiments[$index]}"
  cd ${directories[$index]}
  mkdir nondeterministic-output/
  cp ${experiments[$index]}-$testType-order nondeterministic-output/deterministic-order

  while [ $k -le $numTimesToRun ] 
  do
    echo '======================= Start ' $k ' ======================='
    clearProjectFiles
    java -cp ${experimentsCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests nondeterministic-output/deterministic-order > nondeterministic-output/${experiments[$index]}-$testType-order-results.txt
    clearProjectFiles
    java -cp ${experimentsCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests nondeterministic-output/deterministic-order > nondeterministic-output/${experiments[$index]}-$testType-rerun-results.txt

    java -cp ${experimentsCP[$index]} $crossReferenceClass -origOrder nondeterministic-output/${experiments[$index]}-$testType-order-results.txt -testOrder nondeterministic-output/${experiments[$index]}-$testType-rerun-results.txt > nondeterministic-output/cross-referencer-file.txt

    if [ $(($k % 100)) = 0 ] ; then
      j=$(($j+1))
      echo "" > nondeterministic-output/debug.log$j
    fi

    echo '======================= Start ' $k ' =======================' >> nondeterministic-output/debug.log$j
    cat nondeterministic-output/cross-referencer-file.txt >> nondeterministic-output/debug.log$j
    echo "" >> nondeterministic-output/debug.log$j

    java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.tools.UndeterministicTestFinder -undeterministicTestFile nondeterministic-output/undeterminisitic-order -deterministicTestFile nondeterministic-output/deterministic-order -crossReferenceFile nondeterministic-output/cross-referencer-file.txt -randomizeDeterministicTests
    k=$(($k+1))
  done
  clearProjectFiles
  cd ..
  let "index++"
done
