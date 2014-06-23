testType=auto
experiment=xml-security
experimentCP=impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*
dependentFree=true

function clearEnv() {
  rm -rf '4444444444  4 444444444444 444444444444444444444'
}

source ../config.sh

instrumentFiles $experimentCP

# generate sootTestOutput
cp -r bin/org/apache/xml/security/resource sootOutput/org/apache/xml/security/
java -cp impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

# generate test orders
clearEnv
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt

rm -rf $experiment-parallel-summary.txt
parallelExec $experiment $experimentCP $testType $dependentFree
parallelCoveragesOrders $experiment $experimentCP $testType $dependentFree

clearTemp
clearEnv
