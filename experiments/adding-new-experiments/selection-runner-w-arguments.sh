function clearSelectionTemp() {
  rm -rf $1/tmpfile.txt
  rm -rf $1/tmptestfiles.txt
  rm -rf $2/tmpfile.txt
  rm -rf $2/tmptestfiles.txt
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
    for j in "${seleOrders[@]}"; do
      echo 'Running selection without resolveDependences and without dependentTestFile'
      java -Xms1g -Xmx2g -cp ${3}/*:${4}/*:${5}:${6}:${9} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${8}/${1}-$k-order -testInputDir ${8}/sootTestOutput-$k-selection -filesToDelete ${2}/${1}-env-files -project "${1}" -testType $k -oldVersCFG ${8}/selectionOutput-$k -newVersCFG ${2}/selectionOutput-$k -getCoverage -outputDir ${7} -timesToRun 1
    done
  done
  clearSelectionTemp $8 $2
done

cd /home/user/dependent-tests-impact/experiments