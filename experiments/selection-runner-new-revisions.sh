#source ./config.sh

function instrumentSelectionFiles() {
  cd $1
  echo 'Enhanced instrumenting new subject'
  java -cp $2 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection

  cd ../$3
  echo 'Enhanced instrumenting old subject'
  java -cp $4 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin -technique selection

  echo 'Generating sootTestOutput on old subject'
  java -cp $5 edu.washington.cs.dt.main.ImpactMain -inputTests ../$1/$6
  mv sootTestOutput sootTestOutput-$7-selection
  cd ..
}

function instrumentFiles() {
  echo 'Instrumenting files'
  java -cp $1 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir bin
}

function clearSelectionTemp() {
  rm -rf $1/sootOutput
  rm -rf $1/sootTestOutput
  rm -rf $1/tmpfile.txt
#  rm -rf $1/selectionOutput
  rm -rf $1/tmptestfiles.txt
  rm -rf $2/sootOutput
#  rm -rf $2/selectionOutput
  rm -rf $2/tmpfile.txt
  rm -rf $2/tmptestfiles.txt
}
#have not tested this script to automatically instrument subject programs and generate sootTestOutput 

#from config.sh
initialDir=`pwd`
experiments=(xml-security) #remember to change this to appropriate experiment name
testTypes=(auto) #add auto
coverages=(statement function)
seleOrders=(original absolute relative)

#can list multiple newDirectories=(crystalvc-74d3207 crystalvc-e99d047 crystalvc-bef197c)
#can list multiple newExperimentsCP=(impact-tools/*:crystalvc-74d3207/bin/:crystalvc-74d3207/lib/* impact-tools/*:crystalvc-e99d047/bin/:crystalvc-e99d047/lib/* impact-tools/*:crystalvc-bef197c/bin/:crystalvc-bef197c/lib/*)

#crystal
#oldDirectories=(crystalvc-33e36ee)
#oldExperimentsCP=(impact-tools/*:crystalvc-33e36ee/bin/:crystalvc-33e36ee/lib/*)
#newDirectories=(crystalvc)
#newExperimentsCP=(impact-tools/*:crystalvc/bin/:crystalvc/lib/*)

#jodatime
#oldDirectories=(jodatime-fc896e3/target)
#oldExperimentsCP=(impact-tools/*:jodatime-fc896e3/target/classes/:jodatime-fc896e3/target/test-classes/:jodatime-fc896e3/target/dependency/*:./*)
#newDirectories=(jodatime-b609d7d66d)
#newExperimentsCP=(impact-tools/*:jodatime-b609d7d66d/bin/:jodatime-b609d7d66d/lib/*:jodatime-b609d7d66d/resources/)
#jodatime-auto
#oldDirectories=(jodatime-fc896e3)
#oldExperimentsCP=(impact-tools/*:jodatime-fc896e3/bin/:jodatime-fc896e3/lib/*:jodatime-fc896e3/resources/)
#newDirectories=(jodatime-b609d7d66d)
#newExperimentsCP=(impact-tools/*:jodatime-b609d7d66d/bin/:jodatime-b609d7d66d/lib/*:jodatime-b609d7d66d/resources/)

#jfreechart
#oldDirectories=(jfreechart-1.0.14/target)
#oldExperimentsCP=(impact-tools/*:jfreechart-1.0.14/target/classes/:jfreechart-1.0.14/target/test-classes/:jfreechart-1.0.14/target/dependency/*:jfreechart-1.0.14/lib/*)
#newDirectories=(jfreechart-1.0.15)
#newExperimentsCP=(impact-tools/*:jfreechart-1.0.15/bin/:jfreechart-1.0.15/lib/*)
#jfreechart-auto
#oldDirectories=(jfreechart-1.0.14/target)
#oldExperimentsCP=(impact-tools/*:jfreechart-1.0.14/target/classes/:jfreechart-1.0.14/lib/*)
#newDirectories=(jfreechart-1.0.15)
#newExperimentsCP=(impact-tools/*:jfreechart-1.0.15/bin/:jfreechart-1.0.15/lib/*)

#synoptic
#oldDirectories=(synoptic-ab2d415/dynoptic)
#oldExperimentsCP=(impact-tools/*:synoptic-ab2d415/dynoptic/bin/:synoptic/lib/*:synoptic-ab2d415/synoptic/bin/:synoptic-ab2d415/daikonizer/bin/)
#newDirectories=(dynoptic)
#newExperimentsCP=(impact-tools/*:dynoptic/bin2/:synoptic/lib/*:synoptic/bin/:daikonizer/bin/)

#xml-security
oldDirectories=(xml-security-orig-v1)
oldExperimentsCP=(impact-tools/*:xml-security-orig-v1/bin/:xml-security-commons/libs/*:xml-security-orig-v1/data/)
newDirectories=(xml-security-src-1_0_5D2)
newExperimentsCP=(impact-tools/*:xml-security-src-1_0_5D2/bin/:xml-security-commons/libs/*:xml-security-src-1_0_5D2/data/)

index=0
count=${#experiments[@]}

#cd crystalvc-74d3207
#cd crystal

while [ "$index" -lt "$count" ]; do
  echo -e "Starting experiment: ${experiments[$index]}"

  newRevisionCounter=0

  #generate coverage for new projects (maybe want to generate for old tests as well)
    #instrumentFiles ${newExperimentsCP[$index]}
    #echo 'Generating sootTestOutput'
    #java -cp ${sootCP[$index]} edu.washington.cs.dt.main.ImpactMain -inputTests ${experiments[$index]}-$k-order
    #mv sootTestOutput sootTestOutput-$k
  for h in "${newDirectories[@]}"; do
    for k in "${testTypes[@]}"; do
      #instrumentSelectionFiles ${newDirectories[$index]} ${instrumentNewExperimentsCP[$index]} ${directories[$index]} ${experimentsCP[$index]} ${sootCP[$index]} ${experiments[$index]}-$k-order $k
      #fixerInstrumentSelectionFiles ${newDirectories[$index]} ${fixerNewExperimentsCP[$index]} ${directories[$index]} ${fixerCP[$index]} ${sootCP[$index]} ${experiments[$index]}-$k-order

      echo "Running prioritization for $k"
      #do i need to run this line? cannot find where this outputs 
      #java -Xms1g -Xmx2g -cp ../impact-tools/*:bin/:lib/* edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique prioritization -coverage statement -order original -origOrder allunittests.txt -testInputDir sootTestOutput-$k-selection -filesToDelete crystalvc-74d3207-env-files -project "crystalvc-74d3207" -testType $k -outputDir ${initialDir}/${seleDir} -timesToRun 1 -getCoverage
  
      for i in "${coverages[@]}"; do
        for j in "${seleOrders[@]}"; do
          #echo 'Running selection without resolveDependences and with dependentTestFile'
          #java -Xms1g -Xmx2g -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput-$k-selection -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -project "${experimentsName[$index]}" -testType $k -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput -getCoverage -outputDir ${initialDir}/${seleDir} -timesToRun ${medianTimes} #-dependentTestFile ${initialDir}/selection-dt-list/"selection-${experimentsName[$index]}-$k-$i-$j.txt"
  
          echo 'Running selection without resolveDependences and without dependentTestFile'
          #java -Xms1g -Xmx2g -cp ../impact-tools/*:bin/:lib/* edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order original -origOrder allunittests.txt -testInputDir ../crystalvc/sootTestOutput-$k-selection -filesToDelete crystalvc-74d3207-env-files -project "crystalvc-74d3207" -testType $k -oldVersCFG ../crystalvc/selectionOutput -newVersCFG selectionOutput -getCoverage -outputDir ${initialDir}/${seleDir} -timesToRun 1
          #java -Xms1g -Xmx2g -cp impact-tools/*:crystal/bin/:crystal/libs/lib/* edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order original -origOrder crystal/crystal-orig-order -testInputDir crystalvc/sootTestOutput-orig-selection -filesToDelete crystal/crystal-env-files -project "crystal" -testType $k -oldVersCFG crystalvc/selectionOutput -newVersCFG crystal/selectionOutput -getCoverage -outputDir ${initialDir}/selection-results -timesToRun 1
  
          java -Xms1g -Xmx2g -cp ${newExperimentsCP[$newRevisionCounter]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${newDirectories[$newRevisionCounter]}/${experiments[$index]}-$k-order -testInputDir ${oldDirectories[$index]}/sootTestOutput-$k-selection -filesToDelete ${newDirectories[$newRevisionCounter]}/${experiments[$index]}-env-files -project "${newDirectories[$newRevisionCounter]}" -testType $k -oldVersCFG ${oldDirectories[$index]}/selectionOutput -newVersCFG ${newDirectories[$newRevisionCounter]}/selectionOutput -getCoverage -outputDir ${initialDir}/selection-results -timesToRun 1
          #for jodatime
          #java -Xms1g -Xmx2g -cp ${newExperimentsCP[$newRevisionCounter]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${newDirectories[$newRevisionCounter]}/${experiments[$index]}-$k-order -testInputDir ${oldDirectories[$index]}/sootTestOutput-$k-selection -filesToDelete ${newDirectories[$newRevisionCounter]}/${experiments[$index]}-env-files -project "jodatime" -testType $k -oldVersCFG ${oldDirectories[$index]}/selectionOutput -newVersCFG ${newDirectories[$newRevisionCounter]}/selectionOutput -getCoverage -outputDir ${initialDir}/selection-results -timesToRun 1
          echo 'done'
          #echo 'Running selection with resolveDependences and without dependentTestFile'
          #java -Xms1g -Xmx2g -cp ${newExperimentsCP[$index]} edu.washington.cs.dt.impact.Main.OneConfigurationRunner -technique selection -coverage $i -order $j -origOrder ${newDirectories[$index]}/${experiments[$index]}-$k-order -testInputDir ${directories[$index]}/sootTestOutput-$k-selection -filesToDelete ${newDirectories[$index]}/${experiments[$index]}-env-files -project "${experimentsName[$index]}" -testType $k -oldVersCFG ${directories[$index]}/selectionOutput -newVersCFG ${newDirectories[$index]}/selectionOutput -getCoverage -outputDir ${initialDir}/${seleDir} -timesToRun ${medianTimes} -resolveDependences
        done
      done
      #clearSelectionTemp ${oldDirectories[$index]} crystal
      #clearSelectionTemp ${oldDirectories[$index]} ${newDirectories[$index]}

    done
    let "newRevisionCounter++"
    
  done

  let "index++"
done
