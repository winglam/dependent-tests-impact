testType=orig
experiment=crystal
experimentCP=impact-tools/*:bin/:lib/*
dependentFree=true

source ../config.sh

#clearTemp
#instrumentFiles $experimentCP

# generate sootTestOutput
#java -cp impact-tools/*:sootOutput/:lib/* edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

runPrioritizationWrapper $experiment $experimentCP $testType $dependentFree

#clearTemp