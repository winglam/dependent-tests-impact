# The root directory for the old subject
export DT_SUBJ_ROOT=/home/user/dependent-tests-impact/experiments/dynoptic

# The root directory for the new subject
export NEW_DT_SUBJ_ROOT=/home/user/dependent-tests-impact/experiments/dynoptic-ea407ba0a750

# The name of the subject you wish to add (e.g., xml_security)
export SUBJ_NAME=dynoptic
# The name of the subject you want to be displayed in the paper (e.g., XML Security)
export SUBJ_NAME_FORMAL=Dynoptic

source ../setup-vars-ant.sh

# Override some of the variables we just set because dynoptic setup is a little different.
export DT_CLASS=$DT_SUBJ/bin/:/home/user/dependent-tests-impact/experiments/synoptic/bin/:/home/user/dependent-tests-impact/experiments/daikonizer/bin/
export NEW_DT_CLASS=$NEW_DT_SUBJ/bin/:/home/user/dependent-tests-impact/experiments/synoptic/bin/:/home/user/dependent-tests-impact/experiments/daikonizer/bin/

export DT_LIBS=/home/user/dependent-tests-impact/experiments/synoptic/lib/*
export NEW_DT_LIBS=/home/user/dependent-tests-impact/experiments/synoptic/lib/*
