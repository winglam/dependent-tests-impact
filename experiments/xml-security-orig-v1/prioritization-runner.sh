testType=orig
experiment=xml-security
experimentCP=impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*
dependentFree=false

function clearEnv() {
  rm -rf '4444444444  4 444444444444 444444444444444444444'
}

source ../config.sh

instrumentFiles $experimentCP

# generate sootTestOutput
java -cp impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

# generate test orders
getCoveragesOrders $experiment $experimentCP $testType
clearEnv
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt
rm -rf $experiment-tp-summary.txt

runCoveragesOrders $experiment $experimentCP $testType $dependentFree

clearEnv
runRandom $experiment $testType $experimentCP $dependentFree

clearTemp
clearEnv
