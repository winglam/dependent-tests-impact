source ./config.sh

compileSource
compileNewSource

index=0
count=${#experiments[@]}
ARRAY=()

while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"

  for k in "${testTypes[@]}"; do
    # instrument new subject
    cd ${newDirectories[$index]}
    java -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection
    # instrument old subject
    cd ../${directories[$index]}
    java -cp ${experimentsCP[$index]} edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection

    # generate sootTestOutput on old subject
    java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain ../${directories[$index]}/${experiments[$index]}-$k-order
    cd ..

    for i in "${coverages[@]}"; do
      for j in "${selectionOrders[@]}"; do
        java -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.Wrapper -technique selection -coverage $i -order $j -resolveDependences -origOrder ${experiments[$index]}-$k-order -testInputDir sootTestOutput -filesToDelete ${experiments[$index]}-env-files -outputFile ${experiments[$index]}-$k-DT-selection-$i-$j -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput

        ARRAY+=(${directories[$index]}/${experiments[$index]}-$k-selection-$i-$j)
      done
    done
    clearTemp

  done

  cd ..
  let "index++"
done

arguments=''
for k in "${ARRAY[@]}"; do
  arguments="$arguments $k"
done

java -cp $impactJarCP edu.washington.cs.dt.impact.Main.ResultsParser $arguments
