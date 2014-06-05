experiment=xml-security
experimentCP=impact-tools/*:bin/:../xml-security-commons/bin/:data/:../xml-security-commons/libs/*
function clearEnv() {
  rm -rf '4444444444  4 444444444444 444444444444444444444'
}

clearEnv
java -cp $experimentCP edu.washington.cs.dt.main.ImpactMain $experiment-tp-statement-absolute.txt > $experiment-tp-statement-absolute-results.txt
java -cp $experimentCP edu.washington.cs.dt.impact.tools.CrossReferencer -origOrder $experiment-auto-order-results.txt -testOrder $experiment-tp-statement-absolute-results.txt > blah
