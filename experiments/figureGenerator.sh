source ./config.sh

#!/bin/bash

function runPrioritization() {
    rm -rf ${priorDir}
    mkdir ${priorDir}

    ./prioritization-runner.sh
    java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.ResultsParser -directory ${priorDir} -outputDirectory ${priorDir} -allowNegatives
}

function runSelection() {
    rm -rf ${seleDir}
    mkdir ${seleDir}

    ./selection-runner.sh
    java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.ResultsParser -directory ${seleDir} -outputDirectory ${seleDir} -allowNegatives
}

function runParallelization() {
    rm -rf ${paraDir}
    mkdir ${paraDir}

    ./parallelization-runner.sh
    java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.ResultsParser -directory ${paraDir} -outputDirectory ${paraDir} -allowNegatives
}

echo "Running random-runner script"
#./random-runner.sh

echo "Running prioritization-runner script"
runPrioritization

echo "Running selection-runner script"
runSelection

echo "Running paralleization-runner script"
runParallelization
