source ./config.sh

compileSource
compileNewSource

index=0
count=${#experiments[@]}
ARRAY=()

while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"

  for k in "${testTypes[@]}"; do
    echo 'Instrumenting new subject'
    cd ${newDirectories[$index]}
    java -cp ${instrumentNewExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection
    echo 'Instrumenting old subject'
    cd ../${directories[$index]}
    java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection

    echo 'Generating sootTestOutput on old subject'
    java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests ../${directories[$index]}/${experiments[$index]}-$k-order
    cd ..

    for i in "${coverages[@]}"; do
      #java -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique prioritization -coverage $i -order original -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order  -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-selection-$i-original
      for j in "${selectionOrders[@]}"; do
        # run selection on V1
        echo 'Running selection on V1 with resolveDependences'
        java -cp ${oldExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique selection -coverage $i -order $j -resolveDependences -origOrder ${directories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${directories[$index]}/${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-DT-selection-oldVers-$i-$j -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput
        #echo 'Running selection on V1 without resolveDependences'
        #java -cp ${oldExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique selection -coverage $i -order $j -origOrder ${directories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${directories[$index]}/${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-selection-oldVers-$i-$j -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput

        # run selection on V2
        #java -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique selection -coverage $i -order $j -resolveDependences -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-DT-selection-newVers-$i-$j -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput -dependentTestFile crystal-auto-dt-statement-relative
        #java -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique selection -coverage $i -order $j -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-selection-newVers-$i-$j -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput

        ARRAY+=(${directories[$index]}/${experiments[$index]}-$k-selection-$i-$j)
      done
    done
    clearSelectionTemp ${directories[$index]} ${newDirectories[$index]}
  done

  let "index++"
done

arguments=''
for k in "${ARRAY[@]}"; do
  arguments="$arguments $k"
done

java -cp $impactJarCP edu.washington.cs.dt.impact.Main.ResultsParser $arguments
