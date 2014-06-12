experiment=jfreechart
experimentCP=impact-tools/*:bin/:resources/:lib/*

function clearEnv() {
 :
}
i=0
while [ $i -le 9 ] 
do
  java -cp $experimentCP edu.washington.cs.dt.impact.Main.DTFinderMain -dependentTestFile blah -currentOrderFile $experiment-tp-statement-absolute.txt -originalOrderFile $experiment-auto-order -dtFile $experiment-auto-dt -filesToDelete $experiment-env-files

  java -cp $experimentCP edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage statement -order relative -outputFile $experiment-tp-statement-absolute.txt -dependentTestFile $experiment-auto-dt

  clearEnv
  java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-tp-statement-absolute.txt > $experiment-tp-statement-absolute-results.txt
  java -cp $experimentCP edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder $experiment-auto-order-results.txt -testOrder $experiment-tp-statement-absolute-results.txt > blah
  echo '======================= Ive finished! ======================='
  i=$(($i+1))
done

