function clearTemp() {
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
  rm -rf dtFixerOutput
}

testTypes=(orig auto)
machines=(2 4 8 16)

echo -e "Starting experiment: $1"
cd $2

for j in "${testTypes[@]}"; do
  for k in "${machines[@]}"; do
    echo 'Running parallelization without resolveDependences and without dependentTestFile for time order'
    java -Xms1g -Xmx2g -cp ${3}/*:${4}/*:$5:$6:$8:/usr/lib/jvm/java-7-oracle/jre/lib/* edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $9/$1-$j-time.txt -origOrder $9/$1-$j-order -testInputDir $9/sootTestOutput-$j -filesToDelete $1-env-files -numOfMachines $k -project "$1" -testType $j -timesToRun 1 -outputDir $7

    echo 'Running parallelization without resolveDependences and without dependentTestFile for original order'
    java -Xms1g -Xmx2g -cp ${3}/*:${4}/*:$5:$6:$8:/usr/lib/jvm/java-7-oracle/jre/lib/* edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $9/$1-$j-order -testInputDir $9/sootTestOutput-$j -filesToDelete $1-env-files -project "$1" -testType $j -numOfMachines $k -outputDir $7 -timesToRun 1
  done
 clearTemp
done


