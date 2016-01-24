testType=auto
experiment=jfreechart
oldVersCP=impact-tools/*:bin/:lib/*
newVersCP=impact-tools/*:bin/:lib/*
oldVers=jfreechart-1.0.15
newVers=jfreechart-1.0.16
dependentFree=true

function clearEnv() {
  :
}

source ./config.sh

# instrument class and test files
cd $oldVers
java -cp $oldVersCP edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection
cd ../$newVers
java -cp $newVersCP edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection
cd ..

# generate sootTestOutput
# newVers may have less test than oldVers's orders
cd $oldVers
java -cp impact-tools/*:sootOutput/:lib/* edu.washington.cs.dt.main.ImpactMain -inputTests ../$newVers/$experiment-$testType-order
cd ..

# generate test orders
#rm -rf $experiment-ts-summary.txt
cd $newVers
java -cp $newVersCP edu.washington.cs.dt.main.ImpactMain -inputTests $experiment-$testType-order > $experiment-$testType-order-results.txt
#clearEnv
cd ..

selectionRunCoveragesOrders $experiment $newVersCP $testType $oldVers $newVers $dependentFree
#selectionRunOrigOrder $experiment $newVersCP $testType $oldVers $newVers $dependentFree
#buildDTChainSelectionOrigOrder $experiment $newVersCP $testType $oldVers $newVers
#buildDTChainSelectionCoverages $experiment $newVersCP $testType $oldVers $newVers

#clearSelectionTemp $oldVers $newVers

