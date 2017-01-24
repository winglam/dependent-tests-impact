source ./config.sh

#!/bin/bash

function runPrioritization() {
    rm -rf ${priorDir}
    mkdir ${priorDir}

    ./prioritization-runner.sh
    ./newExperimentsPrioritizationRunner.sh
    #java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.EnhancedResultsFigureGenerator -directory ${priorDir} -outputDirectory ${priorDir} -allowNegatives
    #java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.NumDependentTestsFigureGenerator -directory ${priorDir} -outputDirectory ${priorDir}
}

function runSelection() {
    rm -rf ${seleDir}
    mkdir ${seleDir}

    ./selection-runner.sh
    ./newExperimentsSelectionRunner.sh
    #java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.EnhancedResultsFigureGenerator -directory ${seleDir} -outputDirectory ${seleDir} -allowNegatives
    #java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.NumDependentTestsFigureGenerator -directory ${seleDir} -outputDirectory ${seleDir}
}

function runParallelization() {
    rm -rf ${paraDir}
    mkdir ${paraDir}

    ./parallelization-runner.sh
    ./newExperimentsParallelizationRunner.sh
    #java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.EnhancedResultsFigureGenerator -directory ${paraDir} -outputDirectory ${paraDir} -allowNegatives
    #java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.NumDependentTestsFigureGenerator -directory ${paraDir} -outputDirectory ${paraDir}
}

#echo "Running random-runner script"
#./random-runner.sh

echo "Running prioritization-runner script"
runPrioritization

echo "Running selection-runner script"
runSelection

echo "Running paralleization-runner script"
runParallelization

#java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.NumDependentTestsFigureGenerator -priorDirectory ${priorDir} -seleDirectory ${seleDir} -paraDirectory ${paraDir} -outputDirectory ./ -minBoundOrigDTFile ORIG_MIN_DTs.txt -minBoundAutoDTFile AUTO_MIN_DTs.txt

echo "Script has finished running."
