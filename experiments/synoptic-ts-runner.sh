testType=auto
experiment=synoptic
oldVersCP=impact-tools/*:bin/:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/
newVersCP=impact-tools/*:bin/:../synoptic/lib/*:../synoptic-ea407ba0a750/bin/:../daikonizer-ea407ba0a750/bin/
oldVers=dynoptic
newVers=dynoptic-ea407ba0a750
dependentFree=false

function clearEnv() {
  rm -rf test.dot
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
java -cp impact-tools/*:sootOutput:../synoptic/lib/*:../synoptic/bin/:../daikonizer/bin/  edu.washington.cs.dt.main.ImpactMain ../$newVers/$experiment-$testType-order
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
