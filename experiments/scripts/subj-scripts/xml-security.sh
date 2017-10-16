# The root directory for the old subject
export DT_SUBJ_ROOT=/home/user/dependent-tests-impact/experiments/xml-security-orig-v1

# The root directory for the new subject
export NEW_DT_SUBJ_ROOT=/home/user/dependent-tests-impact/experiments/xml-security-1_2_0

# The name of the subject you wish to add (e.g., xml_security)
export SUBJ_NAME=xml_security
# The name of the subject you want to be displayed in the paper (e.g., XML Security)
export SUBJ_NAME_FORMAL="XML Security"

source ../setup-vars-ant.sh

# Override some of the variables we just set because xml security setup is a little different.
export DT_LIBS=/home/user/dependent-tests-impact/experiments/xml-security-commons/libs/*
export NEW_DT_LIBS=/home/user/dependent-tests-impact/experiments/xml-security-commons/libs/*
