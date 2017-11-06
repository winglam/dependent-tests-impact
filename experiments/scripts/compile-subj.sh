#!/bin/bash

# 1. Compile the old subject.
cd $DT_SUBJ_ROOT
mvn compile
mvn test-compile

# 2. Gather the dependencies of the old subject. 
mvn install -fn -DskipTests dependency:copy-dependencies

# 1. Compile the new subject.
cd $NEW_DT_SUBJ_ROOT
mvn compile
mvn test-compile

# 2. Gather the dependencies of the new subject. 
mvn install -fn -DskipTests dependency:copy-dependencies
