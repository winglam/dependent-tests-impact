function clearTemp() {
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
  rm -rf dtFixerOutput
}

function clearInstrumentation() {
  rm -rf variableToType.dat
}

testTypes=(orig auto)
coverages=(statement function)
machines=(2 4 8 16)
priorOrders=(absolute relative)
seleOrders=(original absolute relative)

echo -e "Starting experiment: $1"
cd $2

for k in "${testTypes[@]}"; do
  for i in "${coverages[@]}"; do
    for j in "${priorOrders[@]}"; do
      echo 'Running prioritization without resolveDependences and without dependentTestFile'
      java -cp ${3}/*:${4}/*:${5}:${6}:${8} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder $1-$k-order -testInputDir sootTestOutput-$k -filesToDelete $1-env-files -getCoverage -project "${1}" -testType $k -outputDir ${7} -timesToRun 1
    done
  done
  clearTemp $1 $k
done

clearInstrumentation
cd /home/user/dependent-tests-impact/experiments
