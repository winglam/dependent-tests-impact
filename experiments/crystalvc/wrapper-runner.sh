testType=orig
experiment=crystal
experimentCP=impact-tools/*:bin/:lib/*
dependentFree=false

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

# instrumentFiles $experimentCP

# generate sootTestOutput
# java -cp impact-tools/*:sootOutput/:lib/* edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

java -cp impact-tools/*:bin/:lib/* edu.washington.cs.dt.impact.Main.Wrapper -technique prioritization -coverage statement -order absolute -resolveDependences -origOrder $experiment-$testType-order -testInputDir sootTestOutput -filesToDelete $experiment-env-files -outputFile $experiment-$testType-wrapper-results

#clearTemp