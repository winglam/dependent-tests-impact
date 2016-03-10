# This file is to share variables and functions. Please do not run this file.

#coverages=(statement function)
#orders=(absolute relative)
impactJarCP=impact-tools/impact.jar
testListGenClass=edu.washington.cs.dt.impact.tools.TestListGenerator
crossReferenceClass=edu.washington.cs.dt.impact.tools.CrossReferencer
#machines=(2 4 8 16)
parallelOrders=($testType-order time)

#experiments=(crystal synoptic jfreechart jodatime xml_security)
#testTypes=(orig auto)
experiments=(crystal)
testTypes=(orig)
orders=(absolute relative)
coverages=(statement)
machines=(2 4)

#directories=(crystalvc dynoptic jfreechart-1.0.15 jodatime-b609d7d66d xml-security-orig-v1)
#experimentsCP=(impact-tools/*:bin/:lib/* impact-tools/*:bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:bin/:lib/* impact-tools/*:bin/:resources/:lib/* impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
#sootCP=(impact-tools/*:sootOutput/:lib/* impact-tools/*:sootOutput/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:sootOutput/:lib/* impact-tools/*:sootOutput/:resources/:lib/* impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
directories=(crystalvc dynoptic jfreechart-1.0.15 jodatime-b609d7d66d xml-security-orig-v1)
experimentsCP=(impact-tools/*:bin/:lib/* impact-tools/*:bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:bin/:lib/* impact-tools/*:bin/:resources/:lib/* impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
sootCP=(impact-tools/*:sootOutput/:lib/* impact-tools/*:sootOutput/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:sootOutput/:lib/* impact-tools/*:sootOutput/:resources/:lib/* impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)

#newDirectories=(crystal dynoptic-ea407ba0a750 jfreechart-1.0.16 jodatime-d6791cb5f9 xml-security-1_2_0)
#newExperimentsCP=(crystal/impact-tools/*:crystal/bin/:crystal/libs/lib/* dynoptic-ea407ba0a750/impact-tools/*:dynoptic-ea407ba0a750/bin/:synoptic/lib/*:synoptic-ea407ba0a750/bin/:daikonizer-ea407ba0a750/bin/ jfreechart-1.0.16/impact-tools/*:jfreechart-1.0.16/bin/:jfreechart-1.0.16/lib/* jodatime-d6791cb5f9/impact-tools/*:jodatime-d6791cb5f9/bin/:jodatime-d6791cb5f9/resources/:jodatime-d6791cb5f9/lib/* xml-security-1_2_0/impact-tools/*:xml-security-1_2_0/bin/:xml-security-commons/bin/:xml-security-1_2_0/data/:xml-security-commons/libs/*)
#instrumentNewExperimentsCP=(impact-tools/*:bin/:libs/lib/* impact-tools/*:bin/:../synoptic/lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ impact-tools/*:bin/:lib/* impact-tools/*:bin/:resources/:lib/* impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
#oldExperimentsCP=(crystalvc/impact-tools/*:crystalvc/bin/:crystalvc/lib/* dynoptic/impact-tools/*:dynoptic/bin/:synoptic/lib/*:synoptic/bin/:daikonizer/bin/ jfreechart-1.0.15/impact-tools/*:jfreechart-1.0.15/bin/:jfreechart-1.0.15/lib/* jodatime-b609d7d66d/impact-tools/*:jodatime-b609d7d66d/bin/:jodatime-b609d7d66d/resources/:jodatime-b609d7d66d/lib/* xml-security-orig-v1/impact-tools/*:xml-security-orig-v1/bin/:xml-security-commons/bin/:xml-security-orig-v1/data/:xml-security-commons/libs/*)

newDirectories=(crystal dynoptic-ea407ba0a750 jfreechart-1.0.16 jodatime-d6791cb5f9 xml-security-1_2_0)
newExperimentsCP=(crystal/impact-tools/*:crystal/bin/:crystal/libs/lib/* dynoptic-ea407ba0a750/impact-tools/*:dynoptic-ea407ba0a750/bin/:synoptic/lib/*:synoptic-ea407ba0a750/bin/:daikonizer-ea407ba0a750/bin/ jfreechart-1.0.16/impact-tools/*:jfreechart-1.0.16/bin/:jfreechart-1.0.16/lib/* jodatime-d6791cb5f9/impact-tools/*:jodatime-d6791cb5f9/bin/:jodatime-d6791cb5f9/resources/:jodatime-d6791cb5f9/lib/* xml-security-1_2_0/impact-tools/*:xml-security-1_2_0/bin/:xml-security-commons/bin/:xml-security-1_2_0/data/:xml-security-commons/libs/*)
instrumentNewExperimentsCP=(impact-tools/*:bin/:libs/lib/* impact-tools/*:bin/:../synoptic/lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ impact-tools/*:bin/:lib/* impact-tools/*:bin/:resources/:lib/* impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
sootNewExperimentsCP=(impact-tools/*:sootOutput/:libs/lib/* impact-tools/*:sootOutput/:../synoptic/lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/ impact-tools/*:sootOutput/:lib/* impact-tools/*:sootOutput/:resources/:lib/* impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
oldExperimentsCP=(crystalvc/impact-tools/*:crystalvc/bin/:crystalvc/lib/* dynoptic/impact-tools/*:dynoptic/bin/:synoptic/lib/*:synoptic/bin/:daikonizer/bin/ jfreechart-1.0.15/impact-tools/*:jfreechart-1.0.15/bin/:jfreechart-1.0.15/lib/* jodatime-b609d7d66d/impact-tools/*:jodatime-b609d7d66d/bin/:jodatime-b609d7d66d/resources/:jodatime-b609d7d66d/lib/* xml-security-orig-v1/impact-tools/*:xml-security-orig-v1/bin/:xml-security-commons/bin/:xml-security-orig-v1/data/:xml-security-commons/libs/*)

#compileCP=(bin/:lib/* bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:bin/:lib/* bin/:resources/:lib/* bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
#newCompileCP=(bin/:lib/* bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:bin/:lib/* bin/:resources/:lib/* bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)

compileCP=(bin/:lib/* bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:bin/:lib/* bin/:resources/:lib/* bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)
newCompileCP=(bin/:lib/* bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ impact-tools/*:bin/:lib/* bin/:resources/:lib/* bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*)


function clearTemp() {
  rm -rf sootOutput
  rm -rf sootTestOutput
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
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
  # instrument class and test files
  echo 'Instrumenting files'
  java -cp $1 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin
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
    #echo 'Running parallelization with resolveDependences for time order'
    #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $1-$3-time.txt -resolveDependences -origOrder $1-$3-order -testInputDir sootTestOutput -filesToDelete $1-env-files -project $1 -testType $3 -numOfMachines $k
    #echo 'Running parallelization with resolveDependences for original order'
    #java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -resolveDependences -origOrder $1-$3-order -testInputDir sootTestOutput -filesToDelete $1-env-files -project $1 -testType $3 -numOfMachines $k
    echo 'Running parallelization without resolveDependences for time order'
    java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order time -timeOrder $1-$3-time.txt -origOrder $1-$3-order -testInputDir sootTestOutput -filesToDelete $1-env-files -numOfMachines $k -project $1 -testType $3
    echo 'Running parallelization without resolveDependences for original order'
    java -cp $2 edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique parallelization -order original -origOrder $1-$3-order -testInputDir sootTestOutput -filesToDelete $1-env-files -project $1 -testType $3 -numOfMachines $k
  done
}