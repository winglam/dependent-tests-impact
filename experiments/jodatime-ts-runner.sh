testType=auto
experiment=jodatime
oldVersCP=impact-tools/*:bin/:resources/:lib/*
newVersCP=impact-tools/*:bin/:resources/:lib/*
oldVers=jodatime-b609d7d66d
newVers=jodatime-d6791cb5f9
dependentFree=false

function clearEnv() {
  :
}

source ./config.sh

# instrument class and test files
cd $oldVers
java -cp $oldVersCP edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ../$newVers
java -cp $newVersCP edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin -technique selection
cd ..

# generate sootTestOutput
# newVers may have less test than oldVers's orders
cd $oldVers
java -cp impact-tools/*:sootOutput/:resources/:lib/* edu.washington.cs.dt.main.ImpactMain ../$newVers/$experiment-$testType-order
cd ..

# generate test orders
rm -rf $experiment-ts-summary.txt
cd $newVers
java -cp $newVersCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt
clearEnv
cd ..

#selectionRunCoveragesOrders $experiment $newVersCP $testType $oldVers $newVers $dependentFree
#selectionRunOrigOrder $experiment $newVersCP $testType $oldVers $newVers $dependentFree
buildDTChainSelectionOrigOrder $experiment $newVersCP $testType $oldVers $newVers
buildDTChainSelectionCoverages $experiment $newVersCP $testType $oldVers $newVers

clearSelectionTemp $oldVers $newVers


