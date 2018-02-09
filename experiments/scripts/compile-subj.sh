#!/bin/bash

# Automates the "Instructions for compiling subjects" section.

# 1. Compile the old subject.

# Try to compile just the module we need.
(
    cd $DT_SUBJ_SRC
    mvn compile test-compile -DskipTests -Dcobertura.skip

    # 2. Gather the dependencies of the old subject.
    mvn install -fn -DskipTests dependency:copy-dependencies -Dcobertura.skip

    # 3. Compile the new subject.
    cd $NEW_DT_SUBJ_SRC
    mvn compile test-compile -DskipTests -Dcobertura.skip

    # 4. Gather the dependencies of the new subject.
    mvn install -fn -DskipTests dependency:copy-dependencies -Dcobertura.skip
) | tee "$DT_SCRIPTS/compile-output/${SUBJ_NAME}-module.txt"

if grep -q "BUILD FAILURE" "$DT_SCRIPTS/compile-output/${SUBJ_NAME}-module.txt"; then
    >&2 echo "[INFO] One or more builds failed. See ${SUBJ_NAME}-module.txt for more information. Trying to compile from root."

    (
        cd $DT_SUBJ_ROOT
        mvn compile test-compile -DskipTests -Dcobertura.skip

        # 2. Gather the dependencies of the old subject.
        mvn install -fn -DskipTests dependency:copy-dependencies -Dcobertura.skip

        # 3. Compile the new subject.
        cd $NEW_DT_SUBJ_ROOT
        mvn compile test-compile -DskipTests -Dcobertura.skip

        # 4. Gather the dependencies of the new subject.
        mvn install -fn -DskipTests dependency:copy-dependencies -Dcobertura.skip
    ) | tee "$DT_SCRIPTS/compile-output/${SUBJ_NAME}-root.txt"

    if grep -q "BUILD FAILURE" "$DT_SCRIPTS/compile-output/${SUBJ_NAME}-root.txt"; then
        >&2 echo "[INFO] Compiling from root failed. See ${SUBJ_NAME}-root.txt for more information."
        exit 1
    fi
fi

