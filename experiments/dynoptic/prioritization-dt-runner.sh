testType=auto
experiment=synoptic
experimentCP=impact-tools/*:bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/

function clearEnv() {
  :
}

source ../config.sh

instrumentFiles $experimentCP

# generate sootTestOutput
java -cp impact-tools/*:sootOutput:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/ edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

# generate test orders
clearEnv
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt

buildDTChainPrioritization $experiment $experimentCP $testType

clearTemp
clearEnv

