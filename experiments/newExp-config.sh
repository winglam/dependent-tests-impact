source ./config.sh

newExperiments=(ambari-logfeeder)
newExpTestTypes=(orig)

newExpDirectories=(ambari/ambari-logsearch/ambari-logsearch-logfeeder/target)
newExpCompileDirectories=(ambari)
newExpCP=(../../../../impact-tools/*:classes/:test-classes/:dependency/*)
newExpSootCP=(../../../../impact-tools/*:sootOutput/:dependency/*)

function compileNewExpSource() {
  index=0
  count=${#newExperiments[@]}
  while [ "$index" -lt "$count" ]; do
    echo ""
    echo -e "Compiling experiment: ${newExperiments[$index]} in ${newExpCompileDirectories[$index]}/"
    cd ${newExpCompileDirectories[$index]}
    mvn compile
    mvn test-compile
    mvn install -fn -DskipTests dependency:copy-dependencies
    let "index++"
    cd ..
  done
}

function instrumentNewExpFiles() {
  echo 'Instrumenting new experiment files'
  java -cp $1 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir classes
  java -cp $1 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir test-classes
}

function runNewExpParallelizationOneConfigurationRunner() {
  #java -cp $2 edu.washington.cs.dt.main.ImpactMain -inputTests $1-$3-order -getTime > $1-$3-time.txt
  for k in "${machines[@]}"; do
    echo 'Running parallelization without resolveDependences and without dependentTestFile for time order'
    java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $1-$3-time.txt -origOrder $1-$3-order -testInputDir sootTestOutput-$3 -filesToDelete $1-env-files -numOfMachines $k -project $1 -testType $3 -timesToRun ${medianTimes} -outputDir ${initialDir}/${paraDir}
    echo 'Running parallelization without resolveDependences and without dependentTestFile for original order'
    java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $1-$3-order -testInputDir sootTestOutput-$3 -filesToDelete $1-env-files -project $1 -testType $3 -numOfMachines $k -outputDir ${initialDir}/${paraDir} -timesToRun ${medianTimes}
    #echo 'Running parallelization without resolveDependences and with dependentTestFile for time order'
    #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $1-$3-time.txt -origOrder $1-$3-order -testInputDir sootTestOutput-$3 -filesToDelete $1-env-files -numOfMachines $k -project $1 -testType $3 -timesToRun ${medianTimes} -outputDir ${initialDir}/${paraDir} -dependentTestFile ${initialDir}/
    #echo 'Running parallelization without resolveDependences and with dependentTestFile for original order'
    #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $1-$3-order -testInputDir sootTestOutput-$3 -filesToDelete $1-env-files -project $1 -testType $3 -numOfMachines $k -outputDir ${initialDir}/${paraDir} -timesToRun ${medianTimes} -dependentTestFile ${initialDir}/
  done
}
