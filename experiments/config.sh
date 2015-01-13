coverages=(statement function)
orders=(absolute relative)
impactJarCP=impact-tools/impact.jar
testListGenClass=edu.washington.cs.dt.impact.tools.TestListGenerator
crossReferenceClass=edu.washington.cs.dt.impact.tools.CrossReferencer
machines=(2 4 8 16)
parallelOrders=($testType-order time)
selectionOrders=(absolute relative)

function clearTemp() {
  rm -rf sootOutput
  rm -rf sootTestOutput
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
}

function clearSelectionTemp() {
  rm -rf $1/sootOutput
  rm -rf $1/sootTestOutput
  rm -rf $1/tmpfile.txt
  rm -rf $1/selectionOutput
  rm -rf $1/tmptestfiles.txt
  rm -rf $2/sootOutput
  rm -rf $2/selectionOutput
  rm -rf $2/tmpfile.txt
  rm -rf $2/tmptestfiles.txt
  cd $1
  clearEnv
  cd ../$2
  clearEnv
  cd ..
}

function instrumentFiles() {
  # instrument class and test files
  java -cp $1 edu.washington.cs.dt.impact.Main.MainDriver -inputDir bin
}

function runRandom() {
  if [ "$4" = true ] ; then 
    java -cp $impactJarCP $testListGenClass -technique prioritization -order random -outputFile $1-random.txt -dependentTestFile $1-$2-dt
  else
    java -cp $impactJarCP $testListGenClass -technique prioritization -order random -outputFile $1-random.txt
  fi
  java -cp $3 edu.washington.cs.dt.main.ImpactMain $1-random.txt > $1-random-results.txt
  rm -rf $1-random.txt

  echo $1"-random-results.txt" >> $1-tp-summary.txt
  java -cp $impactJarCP $crossReferenceClass -origOrder $1-$2-order-results.txt -testOrder $1-random-results.txt >> $1-tp-summary.txt 
  echo "" >> $1-tp-summary.txt
}

function runCoveragesOrders() {
  DTChainCoverages=(statement)
  for i in "${DTChainCoverages[@]}"; do 
    for j in "${orders[@]}"; do  
      if [ "$4" = true ] ; then 
        java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $1-tp-$i-$j.txt -dependentTestFile $1-$3-dt
      else
        java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $1-tp-$i-$j.txt
      fi
      clearEnv
      java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-tp-$i-$j.txt > $1-tp-$i-$j-results.txt
      rm -rf $1-tp-$i-$j.txt

      echo $1"-tp-"$i"-"$j"-results.txt" >> $1-tp-summary.txt
      java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-tp-$i-$j-results.txt >> $1-tp-summary.txt 
      echo "" >> $1-tp-summary.txt
    done
  done
}

function getCoveragesOrders() {
  DTChainCoverages=(statement)
  for i in "${DTChainCoverages[@]}"; do 
    for j in "${orders[@]}"; do  
      if [ "$4" = true ] ; then 
        java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $1-tp-$i-$j-coverage.txt -dependentTestFile $1-$3-dt -getCoverage
      else
        java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $1-tp-$i-$j-coverage.txt -getCoverage
      fi
    done
  done
}

function parallelExec() {
  java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-$3-order -getTime > $1-$3-time.txt
  for k in "${machines[@]}"; do 
    rm -rf $1-parallel-time-order-results.txt
    rm -rf $1-parallel-$3-order-results-$k.txt
    if [ "$4" = true ] ; then 
      java -cp $impactJarCP $testListGenClass -technique parallelization -origOrder $1-$3-order -outputFile $1-parallel-$3-order.txt -numOfMachines $k -dependentTestFile $1-$3-dt
      java -cp $impactJarCP $testListGenClass -technique parallelization -timeOrder $1-$3-time.txt -outputFile $1-parallel-time.txt -numOfMachines $k -dependentTestFile $1-$3-dt
    else
      java -cp $impactJarCP $testListGenClass -technique parallelization -origOrder $1-$3-order -outputFile $1-parallel-$3-order.txt -numOfMachines $k
      java -cp $impactJarCP $testListGenClass -technique parallelization -timeOrder $1-$3-time.txt -outputFile $1-parallel-time.txt -numOfMachines $k
    fi
    for j in "${parallelOrders[@]}"; do 
      for ((i=0; i < $k; i++)); do
        clearEnv
        java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-parallel-$j.txt$i >> $1-parallel-$j-results-$k.txt
        echo "" >> $1-parallel-$j-results-$k.txt
        rm -rf $1-parallel-$j.txt$i
      done
      echo $1"-parallel-"$j"-results.txt k="$k >> $1-parallel-summary.txt
      java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-parallel-$j-results-$k.txt >> $1-parallel-summary.txt 
      echo "" >> $1-parallel-summary.txt
    done
  done
}

function parallelCoveragesOrders() {
  for k in "${machines[@]}"; do 
    for m in "${coverages[@]}"; do
      for j in "${orders[@]}"; do 
        rm -rf $1-parallel-$m-$j-results-$k.txt
        if [ "$4" = true ] ; then 
          java -cp $impactJarCP $testListGenClass -technique parallelization -order $j -coverage $m -outputFile $1-parallel-$m-$j.txt -numOfMachines $k -dependentTestFile $1-$3-dt
        else
          java -cp $impactJarCP $testListGenClass -technique parallelization -order $j -coverage $m -outputFile $1-parallel-$m-$j.txt -numOfMachines $k
        fi
        for ((i=0; i < $k; i++)); do
          clearEnv
          java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-parallel-$m-$j.txt$i >> $1-parallel-$m-$j-results-$k.txt
          echo "" >> $1-parallel-$m-$j-results-$k.txt
          rm -rf $1-parallel-$m-$j.txt$i
        done
        echo $1"-parallel-"$m"-"$j"-results.txt k="$k >> $1-parallel-summary.txt
        java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-parallel-$m-$j-results-$k.txt >> $1-parallel-summary.txt 
        echo "" >> $1-parallel-summary.txt
      done
    done
  done
}

function selectionRunCoveragesOrders() {
  for i in "${coverages[@]}"; do 
    for j in "${selectionOrders[@]}"; do
      if [ "$6" = true ] ; then 
        java -Xms512m -Xmx1g -cp $impactJarCP $testListGenClass -technique selection -coverage $i -order $j -outputFile $5/$1-ts-$i-$j.txt -oldVersCFG $4/selectionOutput -newVersCFG $5/selectionOutput -testInputDir $4/sootTestOutput -dependentTestFile $4/$1-$3-dt
      else
        java -Xms512m -Xmx1g -cp $impactJarCP $testListGenClass -technique selection -coverage $i -order $j -outputFile $5/$1-ts-$i-$j.txt -oldVersCFG $4/selectionOutput -newVersCFG $5/selectionOutput -testInputDir $4/sootTestOutput 
      fi
      cd $5
      clearEnv
      java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-ts-$i-$j.txt > $1-ts-$i-$j-results.txt
      rm -rf $1-ts-$i-$j.txt

      echo $1"-ts-"$i"-"$j"-results.txt" >> $1-ts-summary.txt
      java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-ts-$i-$j-results.txt >> $1-ts-summary.txt 
      echo "" >> $1-ts-summary.txt
      cd ..
    done
  done
}

function selectionRunOrigOrder() {
  for i in "${coverages[@]}"; do 
   if [ "$6" = true ] ; then 
      java -Xms512m -Xmx1g -cp $impactJarCP $testListGenClass -technique selection -coverage $i -origOrder $5/$1-$3-order -outputFile $5/$1-ts-$i-$3-order.txt -oldVersCFG $4/selectionOutput -newVersCFG $5/selectionOutput -testInputDir $4/sootTestOutput -dependentTestFile $4/$1-$3-dt
    else
      java -Xms512m -Xmx1g -cp $impactJarCP $testListGenClass -technique selection -coverage $i -origOrder $5/$1-$3-order -outputFile $5/$1-ts-$i-$3-order.txt -oldVersCFG $4/selectionOutput -newVersCFG $5/selectionOutput -testInputDir $4/sootTestOutput
    fi 
    cd $5
    clearEnv
    java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-ts-$i-$3-order.txt > $1-ts-$i-$3-order-results.txt
    rm -rf $1-ts-$i-$3-order.txt

    echo $1"-ts-"$i"-"$3"-order-results.txt" >> $1-ts-summary.txt
    java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-ts-$i-$3-order-results.txt >> $1-ts-summary.txt 
    echo "" >> $1-ts-summary.txt
    cd ..
  done
}

function buildDTChainPrioritization() {
  DTChainCoverages=(statement)
  for i in "${DTChainCoverages[@]}"; do 
    for j in "${orders[@]}"; do
        echo "" > $1-$3-dt-$i-$j
        java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $1-tp-$i-$j.txt
        
        clearEnv
        java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-tp-$i-$j.txt > $1-tp-$i-$j-results-dt.txt
        java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-tp-$i-$j-results-dt.txt > $1-tp-$i-$j-summary.txt 
        rm -rf $1-tp-$i-$j-results-dt.txt
      
        while [ true ] 
        do
            rm -rf $1-tp-$i-$j-results-dt.txt
            java -cp $2 edu.washington.cs.dt.impact.Main.DTFinderMain -dependentTestFile $1-tp-$i-$j-summary.txt  -currentOrderFile $1-tp-$i-$j.txt -originalOrderFile $1-$3-order -dtFile $1-$3-dt-$i-$j -filesToDelete $1-env-files > dtChainTemp

            java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $1-tp-$i-$j.txt -dependentTestFile $1-$3-dt-$i-$j
            
            clearEnv
            java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-tp-$i-$j.txt > $1-tp-$i-$j-results-dt.txt
            java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-tp-$i-$j-results-dt.txt > $1-tp-$i-$j-summary.txt 

            if grep -q 'There are no dependent tests left!' "dtChainTemp"; then
              echo '======================= There are no more dependent tests left! ======================='
              break
            fi
        done
        echo '======================= Finish ' $i ' - ' $j ' ======================='
        rm -rf $1-tp-$i-$j.txt 
        rm -rf dtChainTemp
	java -cp $impactJarCP $testListGenClass -technique prioritization -coverage $i -order $j -outputFile $1-tp-$i-$j-coverage-dt.txt -dependentTestFile $1-$3-dt-$i-$j -getCoverage
    done
  done
  clearEnv
}

function buildDTChainSelectionCoverages() {
  for i in "${coverages[@]}"; do
    for j in "${selectionOrders[@]}"; do
      java -Xms512m -Xmx1g -cp $impactJarCP $testListGenClass -technique selection -coverage $i -order $j -outputFile $5/$1-ts-$i-$j.txt -oldVersCFG $4/selectionOutput -newVersCFG $5/selectionOutput -testInputDir $4/sootTestOutput 

      cd $5
      echo "" > $1-$3-dt-$i-$j
      clearEnv
      java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-ts-$i-$j.txt > $1-ts-$i-$j-$3-order-results-dt.txt
      java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-ts-$i-$j-$3-order-results-dt.txt > $1-ts-$i-$j-$3-summary.txt
      rm -rf $1-ts-$i-$j-$3-order-results-dt.txt

      while [ true ] 
      do
        rm -rf $1-ts-$i-$j-$3-order-results-dt.txt
        java -cp $2 edu.washington.cs.dt.impact.Main.DTFinderMain -dependentTestFile $1-ts-$i-$j-$3-summary.txt -currentOrderFile $1-ts-$i-$j.txt -originalOrderFile $1-$3-order -dtFile $1-$3-dt-$i-$j -filesToDelete $1-env-files > dtChainTemp

        cd ..
        java -Xms512m -Xmx1g -cp $impactJarCP $testListGenClass -technique selection -coverage $i -order $j -outputFile $5/$1-ts-$i-$j.txt -oldVersCFG $4/selectionOutput -newVersCFG $5/selectionOutput -testInputDir $4/sootTestOutput -dependentTestFile $5/$1-$3-dt-$i-$j
        
        cd $5
        clearEnv
        java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-ts-$i-$j.txt > $1-ts-$i-$j-$3-order-results-dt.txt
        java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-ts-$i-$j-$3-order-results-dt.txt > $1-ts-$i-$j-$3-summary.txt
      
        if grep -q 'The remaining tests are not dependent tests!' "dtChainTemp"; then
          echo '======================= There are no more dependent tests left! ======================='
          break
        fi
      done
      rm -rf dtChainTemp
      cd ..
      echo '======================= Finish ' $i ' - ' $j ' ======================='
      rm -rf $1-ts-$i-$j.txt
    done
  done
}

function buildDTChainSelectionOrigOrder() {
  for i in "${coverages[@]}"; do 
    java -Xms512m -Xmx1g -cp $impactJarCP $testListGenClass -technique selection -coverage $i -origOrder $5/$1-$3-order -outputFile $5/$1-ts-$i-$3-order.txt -oldVersCFG $4/selectionOutput -newVersCFG $5/selectionOutput -testInputDir $4/sootTestOutput

    cd $5
    echo "" > $1-$3-dt-$i
    clearEnv
    java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-ts-$i-$3-order.txt > $1-ts-$i-$3-order-results-dt.txt
    java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-ts-$i-$3-order-results-dt.txt > $1-ts-$i-$3-summary.txt
    rm -rf $1-ts-$i-$3-order-results-dt.txt

    while [ true ] 
    do
      rm -rf $1-ts-$i-$3-order-results-dt.txt
      java -cp $2 edu.washington.cs.dt.impact.Main.DTFinderMain -dependentTestFile $1-ts-$i-$3-summary.txt -currentOrderFile $1-ts-$i-$3-order.txt -originalOrderFile $1-$3-order -dtFile $1-$3-dt-$i -filesToDelete $1-env-files > dtChainTemp

      cd ..
      java -Xms512m -Xmx1g -cp $impactJarCP $testListGenClass -technique selection -coverage $i -origOrder $5/$1-$3-order -outputFile $5/$1-ts-$i-$3-order.txt -oldVersCFG $4/selectionOutput -newVersCFG $5/selectionOutput -testInputDir $4/sootTestOutput -dependentTestFile $5/$1-$3-dt-$i
        
      cd $5
      clearEnv
      java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-ts-$i-$3-order.txt > $1-ts-$i-$3-order-results-dt.txt
      java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-ts-$i-$3-order-results-dt.txt > $1-ts-$i-$3-summary.txt
      
      if grep -q 'The remaining tests are not dependent tests!' "dtChainTemp"; then
        echo '======================= There are no more dependent tests left! ======================='
        break
      fi
    done
    rm -rf dtChainTemp
    cd ..
    echo '======================= Finish ' $i ' ======================='
    rm -rf $1-ts-$i-$3-order.txt
  done
}

function buildDTChainParallelOrig() {
  for k in "${machines[@]}"; do 
    java -cp $impactJarCP $testListGenClass -technique parallelization -origOrder $1-$3-order -outputFile $1-parallel-$3-order.txt -numOfMachines $k

    echo "" > $1-$3-dt-orig-$k
    for ((i=0; i < $k; i++)); do
      clearEnv
      java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-parallel-$3-order.txt$i > $1-parallel-$3-order-results-$k.txt$i
      java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-parallel-$3-order-results-$k.txt$i > $1-parallel-$3-order-$k-summary.txt$i

      c=0
      while [ true ] 
      do
        rm -rf $1-parallel-$3-order-results-$k.txt$i
        java -cp $2 edu.washington.cs.dt.impact.Main.DTFinderMain -dependentTestFile $1-parallel-$3-order-$k-summary.txt$i -currentOrderFile $1-parallel-$3-order.txt$i -originalOrderFile $1-$3-order -dtFile $1-$3-dt-orig-$k -filesToDelete $1-env-files > dtChainTemp

        java -cp $impactJarCP $testListGenClass -technique parallelization -origOrder $1-$3-order -outputFile $1-parallel-$3-order.txt -numOfMachines $k -dependentTestFile $1-$3-dt-orig-$k
            
        clearEnv
        java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-parallel-$3-order.txt$i > $1-parallel-$3-order-results-$k.txt$i
        java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-parallel-$3-order-results-$k.txt$i > $1-parallel-$3-order-$k-summary.txt$i
      
        if grep -q 'The remaining tests are not dependent tests!' "dtChainTemp"; then
          echo '======================= There are no more dependent tests left! ======================='
          break
        fi
      done
      rm -rf dtChainTemp
      rm -rf $1-parallel-$3-order-results-$k.txt$i
      rm -rf $1-parallel-$3-order-$k-summary.txt$i
    done
    echo "" > $1-$3-orig-parallel-results.txt$k
    for ((j=0; j < $k; j++)); do
      clearEnv
      java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-parallel-$3-order.txt$j >> $1-$3-orig-parallel-results.txt$k
      echo "" >> $1-$3-orig-parallel-results.txt$k
      rm -rf $1-parallel-$3-order.txt$j
      rm -rf $1-parallel-$3-order-results-$k.txt$j
    done
    echo '======================= Finish ' $k ' ======================='
    java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-$3-orig-parallel-results.txt$k > $1-$3-orig-parallel-summary.txt$k
  done
}

function buildDTChainParallelTime() {
  java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-$3-order -getTime > $1-$3-time.txt
  for k in "${machines[@]}"; do 
    java -cp $impactJarCP $testListGenClass -technique parallelization -timeOrder $1-$3-time.txt -outputFile $1-parallel-$3-time.txt -numOfMachines $k

    echo "" > $1-$3-dt-time-$k
    for ((i=0; i < $k; i++)); do
      clearEnv
      java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-parallel-$3-time.txt$i > $1-parallel-$3-time-results-$k.txt$i
      java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-parallel-$3-time-results-$k.txt$i > $1-parallel-$3-time-$k-summary.txt$i

      c=0
      while [ true ] 
      do
        rm -rf $1-parallel-$3-time-results-$k.txt$i
        java -cp $2 edu.washington.cs.dt.impact.Main.DTFinderMain -dependentTestFile $1-parallel-$3-time-$k-summary.txt$i -currentOrderFile $1-parallel-$3-time.txt$i -originalOrderFile $1-$3-order -dtFile $1-$3-dt-time-$k -filesToDelete $1-env-files > dtChainTemp

        java -cp $impactJarCP $testListGenClass -technique parallelization -timeOrder $1-$3-time.txt -outputFile $1-parallel-$3-time.txt -numOfMachines $k -dependentTestFile $1-$3-dt-time-$k
            
        clearEnv
        java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-parallel-$3-time.txt$i > $1-parallel-$3-time-results-$k.txt$i
        java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-parallel-$3-time-results-$k.txt$i > $1-parallel-$3-time-$k-summary.txt$i
        
        if grep -q 'The remaining tests are not dependent tests!' "dtChainTemp"; then
          echo '======================= There are no more dependent tests left! ======================='
          break
        fi
      done
      rm -rf dtChainTemp
      rm -rf $1-parallel-$3-time-results-$k.txt$
      rm -rf $1-parallel-$3-time-$k-summary.txt$i  
    done
    echo "" > $1-$3-time-parallel-results.txt$k
    for ((j=0; j < $k; j++)); do
      clearEnv
      java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-parallel-$3-time.txt$j >> $1-$3-time-parallel-results.txt$k
      echo "" >> $1-$3-time-parallel-results.txt$k
      rm -rf $1-parallel-$3-time.txt$j
      rm -rf $1-parallel-$3-time-results-$k.txt$j
    done
    echo '======================= Finish ' $k ' ======================='
    java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-$3-time-parallel-results.txt$k > $1-$3-time-parallel-summary.txt$k
  done
}

function buildDTChainParallelCoveragesOrders() {
  for k in "${machines[@]}"; do 
    for m in "${coverages[@]}"; do
      for j in "${orders[@]}"; do 
        rm -rf $1-parallel-$m-$j-results-$k.txt
        if [ "$4" = true ] ; then 
          java -cp $impactJarCP $testListGenClass -technique parallelization -order $j -coverage $m -outputFile $1-parallel-$m-$j.txt -numOfMachines $k -dependentTestFile $1-$3-dt
        else
          java -cp $impactJarCP $testListGenClass -technique parallelization -order $j -coverage $m -outputFile $1-parallel-$m-$j.txt -numOfMachines $k
        fi
        for ((i=0; i < $k; i++)); do
          clearEnv
          java -cp $2 edu.washington.cs.dt.main.ImpactMain $1-parallel-$m-$j.txt$i >> $1-parallel-$m-$j-results-$k.txt
          echo "" >> $1-parallel-$m-$j-results-$k.txt
          rm -rf $1-parallel-$m-$j.txt$i
        done
        echo $1"-parallel-"$m"-"$j"-results.txt k="$k >> $1-parallel-summary.txt
        java -cp $impactJarCP $crossReferenceClass -origOrder $1-$3-order-results.txt -testOrder $1-parallel-$m-$j-results-$k.txt >> $1-parallel-summary.txt 
        echo "" >> $1-parallel-summary.txt
      done
    done
  done
}