function clearTemp() {
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
  rm -rf dtFixerOutput
}

testTypes=(orig auto)
coverages=(statement function)
priorOrders=(absolute relative)

echo -e "Starting experiment: $1"
cd $2

for k in "${testTypes[@]}"; do
  for i in "${coverages[@]}"; do
    for j in "${priorOrders[@]}"; do
      echo 'Running prioritization without resolveDependences and without dependentTestFile'
      java -Xms1g -Xmx2g -cp ${3}/*:${4}/*:${5}:${6}:${8}:/usr/lib/jvm/java-7-oracle/jre/lib/* edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage $i -order $j -origOrder ${9}/$1-$k-order -testInputDir ${9}/sootTestOutput-$k -filesToDelete ${9}/$1-env-files -getCoverage -project "${1}" -testType $k -outputDir ${7} -timesToRun 1
    done
  done
  clearTemp
done

