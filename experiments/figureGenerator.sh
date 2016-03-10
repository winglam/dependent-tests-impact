source ./config.sh

#!/bin/bash

echo "Running random-runner script"

sh ./random-runner.sh

echo "Running prioritization-runner script"
rm -rf ${priorDir}
mkdir ${priorDir}

orders=(absolute relative)
sh ./prioritization-runner.sh
java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.ResultsParser -directory ${priorDir}

echo "Running selection-runner script"
rm -rf ${seleDir}
mkdir ${seleDir}

orders=(absolute relative original)
sh ./selection-runner.sh
java -cp ${impactJarCP} edu.washington.cs.dt.impact.Main.ResultsParser -directory ${seleDir}