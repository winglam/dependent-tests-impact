testType=orig
experiment=xml-security
oldVersCP=impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*
newVersCP=impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*
oldVers=xml-security-orig-v1
newVers=xml-security-1_2_0
dependentFree=true

function clearEnv() {
  rm -rf '4444444444  4 444444444444 444444444444444444444'
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
java -cp impact-tools/*:sootOutput/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/* edu.washington.cs.dt.main.ImpactMain ../$newVers/$experiment-$testType-order
cd ..

# generate test orders
rm -rf $experiment-ts-summary.txt
cd $newVers
java -cp $newVersCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt
clearEnv
cd ..

selectionRunCoveragesOrders $experiment $newVersCP $testType $oldVers $newVers $dependentFree
selectionRunOrigOrder $experiment $newVersCP $testType $oldVers $newVers $dependentFree

clearSelectionTemp $oldVers $newVers
