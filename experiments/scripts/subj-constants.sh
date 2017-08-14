# This file is to share variables and functions. Please do not run this
# file.
currDir=`pwd`
expName=(ambari-server zeppelin-zengine zeppelin-server)
expDirectories=(ambari/ambari-server/target zeppelin/zeppelin-zengine/target zeppelin/zeppelin-server/target)
expCP=(${currDir}/impact-tools/*:classes/:test-classes/:dependency/*:randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*: ${currDir}/impact-tools/*:classes/:test-classes/:dependency/*:randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*: ${currDir}/impact-tools/*:classes/:test-classes/:dependency/*:randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:)
expNameFormal=("Ambari-Server" "Zeppelin-Zengine" "Zeppelin-Server")
