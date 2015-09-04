

# Getting Started #
This wiki is meant to explain how to navigate and make use of the [experiments/](https://code.google.com/p/dependent-tests-impact/source/browse/experiments/) directory inside this repository. Since most of the scripts relies on relative file paths, the user is expected to execute scripts only if they are in their current directory.

# Projects #
There are 5 different projects inside the repository. Each project's hyperlink is the directory to where that project's contents are kept. To attain the test prioritization or parallelization results for any of the projects, navigate to the directory indicated by the hyperlink with your terminal.
  * [Crystal](https://code.google.com/p/dependent-tests-impact/source/browse/experiments/crystal/)
  * [JFreeChart](https://code.google.com/p/dependent-tests-impact/source/browse/experiments/jfreechart-1.0.15/)
  * [Jodatime](https://code.google.com/p/dependent-tests-impact/source/browse/experiments/jodatime-b609d7d66d/)
  * [Synoptic](https://code.google.com/p/dependent-tests-impact/source/browse/experiments/dynoptic/)
  * [XML-Security](https://code.google.com/p/dependent-tests-impact/source/browse/experiments/xml-security-orig-v1/)

To attain the projects' test selection results, navigate to the [experiments/](https://code.google.com/p/dependent-tests-impact/source/browse/experiments/) directory.

# Test Prioritization & Parallelization Results #
To attain test prioritization or parallelization results for a project, navigate to that project's directory and execute its prioritization-runner.sh or parallelization-runner.sh (respectively).

As an example, to attain test prioritization results for XML-Security I will need to be inside experiments/xml-security-orig-v1/ and execute the script experiments/xml-security-orig-v1/prioritization-runner.sh.

# Test Selection Results #
To attain test selection results for a project, navigate to [experiments/](https://code.google.com/p/dependent-tests-impact/source/browse/experiments/) and execute _projectName_-ts-runner.sh.

As an example, to attain test selection results for Jodatime I will need to be inside experiments/ and execute the script experiments/jodatime-ts-runner.sh.

# Customizations #
To customize your prioritization, parallelization, or selection results you can change the variables at the top of prioritization-runner.sh, parallelization-runner.sh, or _projectName_-ts.runner.sh (respectively).

To attain XML-Security's test automated results I would set:

`testType=auto`

To attain XML-Security's test original results I would set:

`testType=orig`

To attain XML-Security's test results without consider test dependence I would set:

`dependentFree=false`

To attain XML-Security's test results with test dependence considered I would set:

`dependentFree=true`