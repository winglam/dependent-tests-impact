testType=orig
experiment=crystal
crystalCP=impact-tools/*:bin/:libs/lib/*

function clearEnv() {
  rm -rf 2013-08-28T20-44-41.156-0700
  rm -rf hi!
  rm -rf ./'-1 ms'
  rm -rf 0\ ms
  rm -rf 1\ ms
  rm -rf 10\ ms
  rm -rf 100\ ms
  rm -rf 382707\ hours\ 44\ min
}

source ../prioritization.config

instrumentFiles $crystalCP

# generate sootTestOutput
java -cp impact-tools/*:sootOutput/:libs/lib/* edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order

# generate test orders
clearEnv
java -cp $crystalCP edu.washington.cs.dt.main.ImpactMain $experiment-$testType-order > $experiment-$testType-order-results.txt
rm -rf $experiment-tp-summary.txt

for i in "${coverages[@]}"; do 
  for j in "${orders[@]}"; do  
    java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $experiment-tp-$i-$j.txt  
    clearEnv
    java -cp $crystalCP edu.washington.cs.dt.main.ImpactMain $experiment-tp-$i-$j.txt > $experiment-tp-$i-$j-results.txt
    rm -rf $experiment-tp-$i-$j.txt

    echo $experiment"-tp-"$i"-"$j"-results.txt" >> $experiment-tp-summary.txt
    java -cp $impactJarCP $crossReferenceClass -origOrder $experiment-$testType-order-results.txt -testOrder $experiment-tp-$i-$j-results.txt >> $experiment-tp-summary.txt 
    echo "" >> $experiment-tp-summary.txt
  done
done

clearEnv
runRandom $experiment $testType $crystalCP

clearTemp
clearEnv



