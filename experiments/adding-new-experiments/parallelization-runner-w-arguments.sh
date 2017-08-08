function clearTemp() {
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
  rm -rf dtFixerOutput
}

testTypes=(orig auto)
coverages=(statement function)
machines=(2 4 8 16)
priorOrders=(absolute relative)
seleOrders=(original absolute relative)

echo -e "Starting experiment: $1"
cd $2

for j in "${testTypes[@]}"; do
  for k in "${machines[@]}"; do
    echo 'Running parallelization without resolveDependences and without dependentTestFile for time order'
    java -cp ${3}/*:${4}/*:$5:$6:$8 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $2/$1-$j-time.txt -origOrder $1-$j-order -testInputDir $2/sootTestOutput-$j -filesToDelete $1-env-files -numOfMachines $k -project "$1" -testType $j -timesToRun 1 -outputDir $7
  done
 clearTemp $1 $j
done

cd /home/user/dependent-tests-impact/experiments

