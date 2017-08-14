# This file is to share variables and functions. Please do not run this
# file.
currDir=`pwd`
expName=(ambari-server zeppelin-zengine zeppelin-server)
expDirectories=(ambari/ambari-server/target zeppelin/zeppelin-zengine/target zeppelin/zeppelin-server/target)
expCP=(${currDir}/impact-tools/*:classes/:test-classes/:dependency/*:randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*: ${currDir}/impact-tools/*:classes/:test-classes/:dependency/*:randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*: ${currDir}/impact-tools/*:classes/:test-classes/:dependency/*:randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:)
expNameFormal=("Ambari-Server" "Zeppelin-Zengine" "Zeppelin-Server")
nextExpDirectories=(ambari-new/ambari-server/target zeppelin-zengine-new/zeppelin-zengine/target zeppelin-new/zeppelin-server/target)
nextExpCP=(${initialDir}/impact-tools/*:${initialDir}/ambari-new/ambari-server/target/classes/:${initialDir}/ambari-new/ambari-server/target/test-classes/:${initialDir}/ambari-new/ambari-server/target/dependency/*:${initialDir}/ambari-new/ambari-server/target/randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*: ${initialDir}/impact-tools/*:${initialDir}/zeppelin-zengine-new/zeppelin-zengine/target/classes/:${initialDir}/zeppelin-zengine-new/zeppelin-zengine/target/test-classes/:${initialDir}/zeppelin-zengine-new/zeppelin-zengine/target/dependency/*:${initialDir}/zeppelin-zengine-new/zeppelin-zengine/target/randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*: ${initialDir}/impact-tools/*:${initialDir}/zeppelin-new/zeppelin-server/target/classes/:${initialDir}/zeppelin-new/zeppelin-server/target/test-classes/:${initialDir}/zeppelin-new/zeppelin-server/target/dependency/*:${initialDir}/zeppelin-new/zeppelin-server/target/randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:)
