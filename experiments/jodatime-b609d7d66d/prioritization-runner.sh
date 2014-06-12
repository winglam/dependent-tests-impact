testType=auto
experiment=jodatime
experimentCP=impact-tools/*:bin/:resources/:lib/*
dependentFree=false

function clearEnv() {
  :
}

source ../config.sh

instrumentFiles $experimentCP

# generate sootTestOutput
java -cp impact-tools/*:sootOutput:resources/:lib/* edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

# generate test orders
getCoveragesOrders $experiment $experimentCP $testType $dependentFree
clearEnv
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt
rm -rf $experiment-tp-summary.txt

runCoveragesOrders $experiment $experimentCP $testType $dependentFree

clearEnv
runRandom $experiment $testType $experimentCP $dependentFree

clearTemp
clearEnv