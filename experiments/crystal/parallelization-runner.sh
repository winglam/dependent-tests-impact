testType=auto
experiment=crystal
experimentCP=impact-tools/*:bin/:libs/lib/*

function clearEnv() {
  rm -rf 2013-08-28T20-44-41.156-0700
  rm -rf hi!
  rm -rf ./'-1 ms'
  rm -rf 0\ ms
  rm -rf 1\ ms
  rm -rf 10\ ms
  rm -rf 100\ ms
  rm -rf 382707\ hours\ 44\ min
}

source ../config.sh

instrumentFiles $experimentCP

# generate sootTestOutput
java -cp impact-tools/*:sootOutput/:libs/lib/* edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

# generate test orders
clearEnv
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt

parallelExec $experiment $experimentCP $testType

clearTemp
clearEnv




