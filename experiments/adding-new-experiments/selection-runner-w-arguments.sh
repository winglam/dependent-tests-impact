function clearSelectionTemp() {
  rm -rf $1/tmpfile.txt
  rm -rf $1/tmptestfiles.txt
  rm -rf $2/tmpfile.txt
  rm -rf $2/tmptestfiles.txt
}

testTypes=(orig auto)
coverages=(statement function)
seleOrders=(original absolute relative)

echo -e "Starting experiment: $1"

for k in "${testTypes[@]}"; do
  for i in "${coverages[@]}"; do
    for j in "${seleOrders[@]}"; do
      echo 'Running selection without resolveDependences and without dependentTestFile'
      java -Xms1g -Xmx2g -cp ${3}/*:${4}/*:${5}:${6}:${8}:/usr/lib/jvm/java-7-oracle/jre/lib/* edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${9}/${1}-$k-order -testInputDir ${9}/sootTestOutput-$k-selection -filesToDelete ${2}/${1}-env-files -project "${1}" -testType $k -oldVersCFG ${9}/selectionOutput -newVersCFG ${2}/selectionOutput -getCoverage -outputDir ${7} -timesToRun 1
    done
  done
  clearSelectionTemp $9 $2
done