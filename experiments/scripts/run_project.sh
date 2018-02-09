#!/bin/bash

if [[ "$1" == "--help" ]]; then
    echo "Usage: ./run_project.sh project-url [new commit] [old commit] [autoremove directory if exists (Y/N)]"
    exit 1
fi

if [[ "$#" -lt 1 ]]; then
    echo "Usage: ./run_project.sh project-url [new commit] [old commit] [autoremove directory if exists (Y/N)]"
    exit 1
fi

NEW_VERSION="HEAD"
OLD_VERSION="HEAD~50"

if [[ ! -z "$2" ]]; then
    NEW_VERSION=$2
fi

if [[ ! -z "$3" ]]; then
    OLD_VERSION=$3
fi

AUTOREMOVE="N"
if [[ ! -z "$4" ]]; then
    AUTOREMOVE=$4
fi

. ./setup-vars.sh # Set up the basic environment variables (e.g. $DT_ROOT)

PROJ_NAME=$(echo $1 | grep -Eo "([^/]+)\$") # Detect the project name

# Download the project
cd $DT_ROOT

echo
echo "[INFO] Running for project: ${PROJ_NAME}"

echo
echo "[INFO] Cloning projects into $DT_ROOT/${PROJ_NAME}-new and $DT_ROOT/${PROJ_NAME}-old"

if [[ -d "$DT_ROOT/${PROJ_NAME}-new" ]]; then
    if [[ "$AUTOREMOVE" == "Y" ]]; then
        echo "[INFO] Autoremoving $DT_ROOT/${PROJ_NAME}-new because it already exists"
        rm -rf "$DT_ROOT/${PROJ_NAME}-new"
    else
        echo "$DT_ROOT/${PROJ_NAME}-new already exists."
        echo "Should I remove via 'rm -rf $DT_ROOT/${PROJ_NAME}-new' (Y/N)?"
        read input

        if [[ "$input" == "Y" ]]; then
            rm -rf "$DT_ROOT/${PROJ_NAME}-new"
        else
            exit 1
        fi
    fi
fi
git clone "$1" "${PROJ_NAME}-new"

if [[ -d "$DT_ROOT/${PROJ_NAME}-old" ]]; then
    if [[ "$AUTOREMOVE" == "Y" ]]; then
        echo "[INFO] Autoremoving $DT_ROOT/${PROJ_NAME}-old because it already exists"
        rm -rf "$DT_ROOT/${PROJ_NAME}-old"
    else
        echo "$DT_ROOT/${PROJ_NAME}-old already exists."
        echo "Should I remove via 'rm -rf $DT_ROOT/${PROJ_NAME}-old' (Y/N)?"
        read input

        if [[ "$input" == "Y" ]]; then
            rm -rf "$DT_ROOT/${PROJ_NAME}-old"
        else
            exit 1
        fi
    fi
fi
git clone "$1" "${PROJ_NAME}-old"

export DT_SUBJ_ROOT="$DT_ROOT/${PROJ_NAME}-old"
export NEW_DT_SUBJ_ROOT="$DT_ROOT/${PROJ_NAME}-new"

echo
echo "[INFO] Resetting old version to $OLD_VERSION."
cd $DT_SUBJ_ROOT
git reset --hard "$OLD_VERSION"

echo
echo "[INFO] Resetting new version to $NEW_VERSION."
cd $NEW_DT_SUBJ_ROOT
git reset --hard "$NEW_VERSION"

IFS=$'\n'

# Detect the maven modules inside the old and new projects.
echo
echo "[INFO] Detecting modules in old version."
cd $DT_SUBJ_ROOT
OLD_SUBJ_MODULES=(`mvn --also-make dependency:tree | grep maven-dependency-plugin | awk '{ print $(NF-1) }'`)
OLD_SUBJ_MODULE_DIRS=(`mvn -q --also-make exec:exec -Dexec.executable="pwd"`)
OLD_MODULE_COUNT=${#OLD_SUBJ_MODULES[@]}

echo "[INFO] Found:"
for (( i=0; i<${OLD_MODULE_COUNT}; i++ ));
do
    echo "[INFO] ${OLD_SUBJ_MODULES[$i]}: ${OLD_SUBJ_MODULE_DIRS[$i]}"
done

cd $NEW_DT_SUBJ_ROOT
echo
echo "[INFO] Detecting modules in new version."
NEW_SUBJ_MODULES=(`mvn --also-make dependency:tree | grep maven-dependency-plugin | awk '{ print $(NF-1) }'`)
NEW_SUBJ_MODULE_DIRS=(`mvn -q --also-make exec:exec -Dexec.executable="pwd"`)
NEW_MODULE_COUNT=${#NEW_SUBJ_MODULES[@]}

echo "[INFO] Found:"
for (( i=0; i<${NEW_MODULE_COUNT}; i++ ));
do
    echo "[INFO] ${NEW_SUBJ_MODULES[$i]}: ${NEW_SUBJ_MODULE_DIRS[$i]}"
done

for (( i=0; i<${OLD_MODULE_COUNT}; i++ ));
do
    module="${OLD_SUBJ_MODULES[$i]}"
    if grep -q "${PROJ_NAME}-$module" "$DT_SCRIPTS/modules-tried.txt"; then
        echo "[INFO] Already tried ${PROJ_NAME}-$module, skipping."
        continue
    fi

    for (( j=0; j<${NEW_MODULE_COUNT}; j++ ));
    do
        new_module="${NEW_SUBJ_MODULES[$j]}"

        if [[ "${new_module}" == "${module}" ]]; then
            echo
            echo "[INFO] ${module} is in both the old and new versions, running tools."

            if [[ ! -d "${OLD_SUBJ_MODULE_DIRS[$i]}/src/test/java" ]]; then
                echo "[INFO] $module in the old subject has no test files, skipping."
                break
            fi

            if [[ ! -d "${NEW_SUBJ_MODULE_DIRS[$j]}/src/test/java" ]]; then
                echo "[INFO] $module in the new subject has no test files, skipping."
                break
            fi

            echo "[INFO] Setting environment variables."
            export DT_SUBJ=${OLD_SUBJ_MODULE_DIRS[$i]}/target
            export DT_SUBJ_SRC=${OLD_SUBJ_MODULE_DIRS[$i]}

            export NEW_DT_SUBJ=${NEW_SUBJ_MODULE_DIRS[$j]}/target
            export NEW_DT_SUBJ_SRC=${NEW_SUBJ_MODULE_DIRS[$j]}

            export SUBJ_NAME="${PROJ_NAME}-$module"
            export SUBJ_NAME_FORMAL="${PROJ_NAME}-$module"

            . $DT_SCRIPTS/setup-vars.sh

            echo "DT_SUBJ: $DT_SUBJ"
            echo "DT_SUBJ_SRC: $DT_SUBJ_SRC"
            echo "DT_CLASS: $DT_CLASS"
            echo "DT_TESTS: $DT_TESTS"
            echo "NEW_DT_SUBJ: $NEW_DT_SUBJ"
            echo "NEW_DT_SUBJ_SRC: $NEW_DT_SUBJ_SRC"
            echo "NEW_DT_CLASS: $NEW_DT_CLASS"
            echo "NEW_DT_TESTS: $NEW_DT_TESTS"
            echo "SUBJ_NAME: $SUBJ_NAME"
            echo "SUBJ_NAME_FORMAL: $SUBJ_NAME_FORMAL"

            # Keep track that we tried this one:
            echo "${PROJ_NAME}-$module" >> "$DT_SCRIPTS/modules-tried.txt"

            echo
            echo "[INFO] Calling main script: $DT_SCRIPTS/run-subj.sh"

            # Save the results if we already did it.
            if [[ -d "$DT_SCRIPTS/${SUBJ_NAME}-results" ]]; then
                echo "Moving from $DT_SCRIPTS/${SUBJ_NAME}-results to $DT_SCRIPTS/${SUBJ_NAME}-old-results"
                mv "$DT_SCRIPTS/${SUBJ_NAME}-results" "$DT_SCRIPTS/${SUBJ_NAME}-old-results"
            fi

            mkdir "$DT_SCRIPTS/${SUBJ_NAME}-results"
            cd $DT_SCRIPTS
            bash run-subj.sh |& grep --line-buffered -v "Test being executed" |& tee "$DT_SCRIPTS/${SUBJ_NAME}-results/output.txt"

            if [[ $? -eq 1 ]]; then
                echo "[INFO] Build failed. Continuing."
                break
            fi

            echo
            echo "[INFO] Finished, copying results to ${SUBJ_NAME}-results"
            mv figure* "$DT_SCRIPTS/${SUBJ_NAME}-results"
            break
        fi
    done
done

