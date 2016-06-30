# This file is to share variables and functions. Please do not run this
# file.

# Number of times to run the test order before taking the median
medianTimes=1
# Number of times to randomize the test order when calculating the
# precomputed dependences
randomTimes=100

# If you would like to run only a subset of the experiments, you must
# remove experiments starting from the back of the list and not
# leave any gaps. Ex. You can run only Crystal and JFreechart but
# cannot run JFreechart and Jodatime. You can run Crystal, JFreechart
# and Jodatime but cannot run Crystal and Jodatime.
experiments=(crystal jfreechart jodatime synoptic xml_security)
testTypes=(orig auto)
coverages=(statement function)
machines=(2 4 8 16)

# Ordering for the three techniques
priorOrders=(absolute relative)
seleOrders=(original absolute relative)

# Directory to output the results
priorDir=prioritization-results
seleDir=selection-results
paraDir=parallelization-results

# Do not change the values below unless you know specifically what you
# are doing
impactJarCP=impact-tools/impact.jar
testListGenClass=edu.washington.cs.dt.impact.tools.TestListGenerator
crossReferenceClass=edu.washington.cs.dt.impact.tools.CrossReferencer

directories=(crystalvc jfreechart-1.0.15 jodatime-b609d7d66d dynoptic xml-security-orig-v1)
fixerCP=(../fixer-libs/*:lib/* ../fixer-libs/*:lib/* ../fixer-libs/*:resources/:lib/* ../fixer-libs/*:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ ../fixer-libs/*:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
experimentsCP=(impact-tools/*:bin/:lib/* impact-tools/*:bin/:lib/* impact-tools/*:bin/:resources/:lib/* impact-tools/*:bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
sootCP=(impact-tools/*:sootOutput/:lib/* impact-tools/*:sootOutput/:lib/* impact-tools/*:sootOutput/:resources/:lib/* impact-tools/*:sootOutput/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)

newDirectories=(crystal jfreechart-1.0.16 jodatime-d6791cb5f9 dynoptic-ea407ba0a750 xml-security-1_2_0)
newExperimentsCP=(crystal/impact-tools/*:crystal/bin/:crystal/libs/lib/* jfreechart-1.0.16/impact-tools/*:jfreechart-1.0.16/bin/:jfreechart-1.0.16/lib/* jodatime-d6791cb5f9/impact-tools/*:jodatime-d6791cb5f9/bin/:jodatime-d6791cb5f9/resources/:jodatime-d6791cb5f9/lib/* dynoptic-ea407ba0a750/impact-tools/*:dynoptic-ea407ba0a750/bin/:synoptic/lib/*:synoptic-ea407ba0a750/bin/:daikonizer-ea407ba0a750/bin/ xml-security-1_2_0/impact-tools/*:xml-security-1_2_0/bin/:xml-security-commons/bin/:xml-security-1_2_0/data/:xml-security-commons/libs/*)
instrumentNewExperimentsCP=(impact-tools/*:bin/:libs/lib/* impact-tools/*:bin/:lib/* impact-tools/*:bin/:resources/:lib/* impact-tools/*:bin/:../synoptic/lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
fixerNewExperimentsCP=(impact-tools/*:libs/lib/* impact-tools/*:lib/* impact-tools/*:resources/:lib/* impact-tools/*:../synoptic/lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ impact-tools/*:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)

compileCP=(bin/:lib/* impact-tools/*:bin/:lib/* bin/:resources/:lib/* bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
newCompileCP=(bin/:lib/* impact-tools/*:bin/:lib/* bin/:resources/:lib/* bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)

function clearTemp() {
  rm -rf sootTestOutput
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
  rm -rf $1-$2-time.txt
  rm -rf dtFixerOutput
}

function clearInstrumentation() {
  rm -rf sootOutput
  rm -rf variableToType.dat
}

function clearSelectionTemp() {
  rm -rf $1/sootOutput
  rm -rf $1/sootTestOutput
  rm -rf $1/tmpfile.txt
  rm -rf $1/selectionOutput
  rm -rf $1/tmptestfiles.txt
  rm -rf $2/sootOutput
  rm -rf $2/selectionOutput
  rm -rf $2/tmpfile.txt
  rm -rf $2/tmptestfiles.txt
}

function instrumentFiles() {
  echo 'Instrumenting files'
  java -cp $1 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin
}

function fixerInstrumentFiles() {
  echo 'Enhanced instrumenting files'
  # Enable the following command to take an output argument
  java -cp $1:bin/ edu.washington.cs.dt.fixer.Main.InstrumentationMain -inputDir bin -cpDir $1
  # Enable the following command to output to a particular directory
  java -cp $1:bin/ edu.washington.cs.dt.fixer.Main.InstrumentationMain -inputDir bin -cpDir $1  -parsedStaticFields variableToType.dat

  mv sootOutput dtFixerOutput
  java -cp $1:dtFixerOutput edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir dtFixerOutput
}

function compileNewSource() {
  index=0
  count=${#experiments[@]}
  while [ "$index" -lt "$count" ]; do
    echo ""
    echo -e "Compiling new experiment: ${experiments[$index]} in ${newDirectories[$index]}/"
    cd ${newDirectories[$index]}
    ant
    let "index++"
    cd ..
  done
}

function compileSource() {
  index=0
  count=${#experiments[@]}
  while [ "$index" -lt "$count" ]; do
    echo ""
    echo -e "Compiling experiment: ${experiments[$index]} in ${directories[$index]}/"
    cd ${directories[$index]}
    ant
    let "index++"
    cd ..
  done
}

function runParallelizationOneConfigurationRunner() {
  java -cp $2 edu.washington.cs.dt.main.ImpactMain -inputTests $1-$3-order -getTime > $1-$3-time.txt
  for k in "${machines[@]}"; do
    echo 'Running parallelization without resolveDependences and without dependentTestFile for time order'
    java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $1-$3-time.txt -origOrder $1-$3-order -testInputDir sootTestOutput -filesToDelete $1-env-files -numOfMachines $k -project $1 -testType $3 -timesToRun ${medianTimes} -outputDir ../${paraDir}
    echo 'Running parallelization without resolveDependences and without dependentTestFile for original order'
    java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $1-$3-order -testInputDir sootTestOutput -filesToDelete $1-env-files -project $1 -testType $3 -numOfMachines $k -outputDir ../${paraDir} -timesToRun ${medianTimes}
    #echo 'Running parallelization without resolveDependences and with dependentTestFile for time order'
    #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $1-$3-time.txt -origOrder $1-$3-order -testInputDir sootTestOutput -filesToDelete $1-env-files -numOfMachines $k -project $1 -testType $3 -timesToRun ${medianTimes} -outputDir ../${paraDir} -dependentTestFile ../
    #echo 'Running parallelization without resolveDependences and with dependentTestFile for original order'
    #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $1-$3-order -testInputDir sootTestOutput -filesToDelete $1-env-files -project $1 -testType $3 -numOfMachines $k -outputDir ../${paraDir} -timesToRun ${medianTimes} -dependentTestFile ../
  done
}
