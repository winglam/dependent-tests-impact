experiment=jfreechart
experimentCP=impact-tools/*:bin/:lib/*
function clearEnv() {
  :
}

clearEnv
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-tp-statement-absolute.txt > $experiment-tp-statement-absolute-results.txt
java -cp $experimentCP edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder $experiment-auto-order-results.txt -testOrder $experiment-tp-statement-absolute-results.txt > blah
