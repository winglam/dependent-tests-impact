experiment=xml-security
experimentCP=impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*

function clearEnv() {
 rm -rf '4444444444  4 444444444444 444444444444444444444'
}
i=0
while [ $i -le 0 ] 
do
  java -cp $experimentCP edu.washington.cs.dt.impact.Main.DTFinderMain -dependentTestFile blah -currentOrderFile $experiment-tp-statement-absolute.txt -originalOrderFile $experiment-auto-order -dtFile $experiment-auto-dt -filesToDelete $experiment-env-files

  java -cp $experimentCP edu.washington.cs.dt.impact.tools.TestListGenerator -technique prioritization -coverage function -order relative -outputFile $experiment-tp-statement-absolute.txt -dependentTestFile $experiment-auto-dt

  clearEnv
  java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-tp-statement-absolute.txt > $experiment-tp-statement-absolute-results.txt
  java -cp $experimentCP edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder $experiment-auto-order-results.txt -testOrder $experiment-tp-statement-absolute-results.txt > blah
  echo '======================= Ive finished! ======================='
  i=$(($i+1))
done

