testType=orig
experiment=crystal
oldVersCP=impact-tools/*:bin/:lib/*
newVersCP=impact-tools/*:bin/:libs/lib/*
oldVers=crystalvc
newVers=crystal
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
  rm -rf testDataFile\\testSave.xml
}

source ./config.sh

# instrument class and test files
cd $oldVers
#java -cp $oldVersCP edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection
cd ../$newVers
#java -cp $newVersCP edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection
cd ..

# generate sootTestOutput
# newVers may have less test than oldVers's orders
cd $oldVers
#java -cp impact-tools/*:sootOutput/:lib/* edu.washington.cs.dt.main.ImpactMain ../$newVers/$experiment-$testType-order
cd ..

# generate test orders
#rm -rf $experiment-ts-summary.txt
cd $newVers
clearEnv
java -cp $newVersCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt
clearEnv
cd ..

#selectionRunCoveragesOrders $experiment $newVersCP $testType $oldVers $newVers $dependentFree
#selectionRunOrigOrder $experiment $newVersCP $testType $oldVers $newVers $dependentFree
#buildDTChainSelectionOrigOrder $experiment $newVersCP $testType $oldVers $newVers
#buildDTChainSelectionCoverages $experiment $newVersCP $testType $oldVers $newVers

#clearSelectionTemp $oldVers $newVers

