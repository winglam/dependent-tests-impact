testType=orig
experiment=jfreechart
experimentCP=impact-tools/*:bin/:lib/*

function clearEnv() {
  :
}

source ../config.sh

instrumentFiles $experimentCP

# generate sootTestOutput
java -cp impact-tools/*:sootOutput:lib/* edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

# generate test orders
clearEnv
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt

rm -rf $experiment-parallel-summary.txt
parallelExec $experiment $experimentCP $testType
parallelCoveragesOrders $experiment $experimentCP $testType

clearTemp
clearEnv
