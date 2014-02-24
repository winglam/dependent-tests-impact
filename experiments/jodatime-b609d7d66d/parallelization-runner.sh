testType=auto
experiment=jodatime
experimentCP=impact-tools/*:bin/:resources/:lib/*

function clearEnv() {
  :
}

source ../config.sh

instrumentFiles $experimentCP

# generate sootTestOutput
java -cp impact-tools/*:sootOutput:resources/ edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

# generate test orders
clearEnv
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt

parallelExec $experiment $experimentCP $testType

clearTemp
clearEnv
