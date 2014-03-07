testType=auto
experiment=jfreechart
oldVersCP=impact-tools/*:bin/:lib/*
newVersCP=impact-tools/*:bin/:lib/*
oldVers=jfreechart-1.0.15
newVers=jfreechart-1.0.16

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
java -cp impact-tools/*:sootOutput/:lib/* edu.washington.cs.dt.main.ImpactMain ../$newVers/$experiment-$testType-order
cd ..

# generate test orders
rm -rf $experiment-ts-summary.txt
cd $newVers
java -cp $newVersCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt
clearEnv
cd ..

selectionRunCoveragesOrders $experiment $newVersCP $testType $oldVers $newVers
selectionRunOrigOrder $experiment $newVersCP $testType $oldVers $newVers

clearSelectionTemp $oldVers $newVers

