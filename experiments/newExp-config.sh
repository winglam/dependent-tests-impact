source ./config.sh

newExperiments=(httpcore)
newExpTestTypes=(orig)

newExpDirectories=(httpcore/httpcore/target)
newExpCompileDirectories=(httpcore)
newExpCP=(../../../impact-tools/*:classes/:test-classes/:dependency/*)
newExpSootCP=(../../../impact-tools/*:sootOutput/:dependency/*)

function compileNewExpSource() {
  index=0
  count=${#newExperiments[@]}
  while [ "$index" -lt "$count" ]; do
    echo ""
    echo -e "Compiling experiment: ${newExperiments[$index]} in ${newExpCompileDirectories[$index]}/"
    cd ${newExpCompileDirectories[$index]}
    mvn test-compile
    let "index++"
    cd ..
  done
}

function instrumentNewExpFiles() {
  echo 'Instrumenting new experiment files'
  java -cp $1 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir classes
  java -cp $1 edu.washington.cs.dt.impact.Main.InstrumentationMain -inputDir test-classes
}
