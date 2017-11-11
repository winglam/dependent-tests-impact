# This file is to share variables and functions. Please do not run this file.
rootDir=$1
# The name of the subject you wish to add (e.g., xml_security).
expName=(
  #crystal
  #jfreechart
  #jodatime
  #synoptic
  #xml_security
  #ambari-server
  #zeppelin-zengine
  #zeppelin-server
  xstream
)
# Directory for where all of the old subject's information is stored.
expDirectories=(
  #${rootDir}/crystalvc
  #${rootDir}/jfreechart-1.0.15
  #${rootDir}/jodatime-b609d7d66d
  #${rootDir}/dynoptic
  #${rootDir}/xml-security-orig-v1
  #${rootDir}/ambari/ambari-server/target
  #${rootDir}/zeppelin/zeppelin-zengine/target
  #${rootDir}/zeppelin/zeppelin-server/target
  ${rootDir}/xstream-1.2/xstream/target
)
# Classpath to run the old subject's automatically-generated and human-written tests.
expCP=(
  #${rootDir}/impact-tools/*:${rootDir}/crystalvc/bin/:${rootDir}/crystalvc/lib/*
  #${rootDir}/impact-tools/*:${rootDir}/jfreechart-1.0.15/bin/:${rootDir}/jfreechart-1.0.15/lib/*
  #${rootDir}/impact-tools/*:${rootDir}/jodatime-b609d7d66d/bin/:${rootDir}/jodatime-b609d7d66d/resources/:${rootDir}/jodatime-b609d7d66d/lib/*
  #${rootDir}/impact-tools/*:${rootDir}/dynoptic/bin/:${rootDir}/synoptic/lib/*:${rootDir}/synoptic/bin/:${rootDir}/daikonizer/bin/
  #${rootDir}/impact-tools/*:${rootDir}/xml-security-orig-v1/bin/:${rootDir}/xml-security-commons/bin/:${rootDir}/xml-security-orig-v1/data/:${rootDir}/xml-security-commons/libs/*
  #${rootDir}/impact-tools/*:${rootDir}/ambari/ambari-server/target/classes/:${rootDir}/ambari/ambari-server/target/test-classes/:${rootDir}/ambari/ambari-server/target/dependency/*:${rootDir}/ambari/ambari-server/target/randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:
  #${rootDir}/impact-tools/*:${rootDir}/zeppelin/zeppelin-zengine/target/classes/:${rootDir}/zeppelin/zeppelin-zengine/target/test-classes/:${rootDir}/zeppelin/zeppelin-zengine/target/dependency/*:${rootDir}/zeppelin/zeppelin-zengine/target/randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:
  #${rootDir}/impact-tools/*:${rootDir}/zeppelin/zeppelin-server/target/classes/:${rootDir}/zeppelin/zeppelin-server/target/test-classes/:${rootDir}/zeppelin/zeppelin-server/target/dependency/*:${rootDir}/zeppelin/zeppelin-server/target/randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:
  ${rootDir}/impact-tools/*:${rootDir}/xstream-1.2/xstream/target/dependency/*:${rootDir}/xstream-1.2/xstream/target/classes:${rootDir}/xstream-1.2/xstream/target/randoop/bin:${rootDir}/xstream-1.2/xstream/target/test-classes:
)
# The name of the subject you want to be displayed in the paper (e.g., XML Security).
expNameFormal=(
  #"Crystal"
  #"JFreechart"
  #"Joda-Time"
  #"Synoptic"
  #"XML Security"
  #"Ambari-Server"
  #"Zeppelin-Zengine"
  #"Zeppelin-Server"
  "XStream"
)
# Directory for where all of the new subject's information is stored.
nextExpDirectories=(
  #${rootDir}/crystal
  #${rootDir}/jfreechart-1.0.16
  #${rootDir}/jodatime-d6791cb5f9
  #${rootDir}/dynoptic-ea407ba0a750
  #${rootDir}/xml-security-1_2_0
  #${rootDir}/ambari-new/ambari-server/target
  #${rootDir}/zeppelin-zengine-new/zeppelin-zengine/target
  #${rootDir}/zeppelin-new/zeppelin-server/target
  ${rootDir}/xstream-1.2.1/xstream/target
)
# Classpath to run the new subject's automatically-generated and human-written tests.
nextExpCP=(
  #${rootDir}/impact-tools/*:${rootDir}/crystal/bin/:${rootDir}/crystal/libs/lib/*
  #${rootDir}/impact-tools/*:${rootDir}/jfreechart-1.0.16/bin/:${rootDir}/jfreechart-1.0.16/lib/*
  #${rootDir}/impact-tools/*:${rootDir}/jodatime-d6791cb5f9/bin/:${rootDir}/jodatime-d6791cb5f9/resources/:${rootDir}/jodatime-d6791cb5f9/lib/*
  #${rootDir}/impact-tools/*:${rootDir}/dynoptic-ea407ba0a750/bin/:${rootDir}/synoptic/lib/*:${rootDir}/synoptic-ea407ba0a750/bin/:${rootDir}/daikonizer-ea407ba0a750/bin/
  #${rootDir}/impact-tools/*:${rootDir}/xml-security-1_2_0/bin/:${rootDir}/xml-security-commons/bin/:${rootDir}/xml-security-1_2_0/data/:${rootDir}/xml-security-commons/libs/*
  #${rootDir}/impact-tools/*:${rootDir}/ambari-new/ambari-server/target/classes/:${rootDir}/ambari-new/ambari-server/target/test-classes/:${rootDir}/ambari-new/ambari-server/target/dependency/*:${rootDir}/ambari-new/ambari-server/target/randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:
  #${rootDir}/impact-tools/*:${rootDir}/zeppelin-zengine-new/zeppelin-zengine/target/classes/:${rootDir}/zeppelin-zengine-new/zeppelin-zengine/target/test-classes/:${rootDir}/zeppelin-zengine-new/zeppelin-zengine/target/dependency/*:${rootDir}/zeppelin-zengine-new/zeppelin-zengine/target/randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:
  #${rootDir}/impact-tools/*:${rootDir}/zeppelin-new/zeppelin-server/target/classes/:${rootDir}/zeppelin-new/zeppelin-server/target/test-classes/:${rootDir}/zeppelin-new/zeppelin-server/target/dependency/*:${rootDir}/zeppelin-new/zeppelin-server/target/randoop/bin/:/usr/lib/jvm/java-7-oracle/jre/lib/*:
  ${rootDir}/impact-tools/*:${rootDir}/xstream-1.2.1/xstream/target/dependency/*:${rootDir}/xstream-1.2.1/xstream/target/classes:${rootDir}/xstream-1.2.1/xstream/target/randoop/bin:${rootDir}/xstream-1.2.1/xstream/target/test-classes:
)
# Directory containing the old subject's src directory. These directories contain projects that were originally built with Ant.
antExp=(
  #${rootDir}/crystalvc
  #${rootDir}/jfreechart-1.0.15
  #${rootDir}/jodatime-b609d7d66d
  #${rootDir}/dynoptic
  #${rootDir}/xml-security-orig-v1
)
# Directory containing the new subject's src directory. These directories contain projects that were originally built with Ant.
antNextExp=(
  #${rootDir}/crystal
  #${rootDir}/jfreechart-1.0.16
  #${rootDir}/jodatime-d6791cb5f9
  #${rootDir}/dynoptic-ea407ba0a750
  #${rootDir}/xml-security-1_2_0
)
# Directory containing the old subject's src directory. These directories contain projects that were originally built with Maven.
antMvnExp=(
  #${rootDir}/ambari/ambari-server
  #${rootDir}/zeppelin/zeppelin-zengine
  #${rootDir}/zeppelin/zeppelin-server
  ${rootDir}/xstream-1.2/xstream
)
# Directory containing the new subject's src directory. These directories contain projects that were originally built with Maven.
antMvnNextExp=(
  #${rootDir}/ambari-new/ambari-server
  #${rootDir}/zeppelin-zengine-new/zeppelin-zengine
  #${rootDir}/zeppelin-new/zeppelin-server
  ${rootDir}/xstream-1.2.1/xstream
)
