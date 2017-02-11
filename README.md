To reproduce figures 5, 10, 11, and 12 in our paper do the following:

```
git clone https://github.com/winglam/dependent-tests-impact.git
cd dependent-tests-impact/experiments
./figureGenerator.sh
```

You must use Java 7; the version of Soot that we use does not work with Java 8.
We ran our experiments on a machine with Java version "1.7.0_91".
Ant and Maven is also required in order to build the subject programs.

In case you have trouble running the experiments
on your machine, we have also provided the artifact pre-installed in a
virtual machine that runs Ubuntu version 14.04 with Java 7, Ant and Maven installed.
The dependent-tests-impact folder is under `/home/user/dependent-tests-impact`.
- Username for the VM: user
- Password for the VM: asdf
- Download link: https://drive.google.com/drive/folders/0B7jf_fJmMJFpQUpXNV9iREMxQTQ

The `figureGenerator.sh` script takes about 2 hours to complete in the VM.

The subject programs does print some error messages to the console;
this is expected and normal as some tests do fail or get errors.

Once the script finishes running, the results for prioritization,
selection and parallelization can be found in .tex files in directories:

    dependent-tests-impact/experiments/prioritization-results/
    dependent-tests-impact/experiments/selection-results/
    dependent-tests-impact/experiments/parallelization-results/

Since figures 10, 11, and 12 depends on the execution time of the tests, 
the results may not be identical to those in the submitted paper. 
While the numerical results differ, they still support the
paper's claims.
The results used to generate figure 5 in our paper can be found in
`/home/user/dependent-tests-impact/results/issta17/figure5` while 
the results used to generate figures 10, 11, and 12 can be found in
`/home/user/dependent-tests-impact/results/issta17/enhanced-figures/results-in-paper`.

The files inside `/home/user/dependent-tests-impact/experiments/prioritization-dt-list`,
`/home/user/dependent-tests-impact/experiments/selection-dt-list`, and
`/home/user/dependent-tests-impact/experiments/parallelization-dt-list` contains
the pre-computed test dependences for prioritization, selection and parallelziation (respectively).

The pre-computed test dependences should be the same, but you can re-generate them if you would like to do so:
 * delete the files in the directories listed above, and
 * uncomment line 32 in `prioritization-runner.sh`, line 69 in `selection-runner.sh`,
   and lines 154 and 156 in `config.sh` (`#java -cp...` -> `java -cp...`)

However, note that doing so may take approximately 200 hours.
Our results for these pre-computed dependences can be found in
`/home/user/dependent-tests-impact/results/issta17/fixed-dt-results/results-in-paper`.
These results were also used to generate Figure 9 in our paper.

Figure 4 is generated from running [cloc](https://github.com/AlDanial/cloc) on the
subjects' source and test directories and 
[ExamDiff Pro](http://www.prestosoft.com/edp_examdiffpro.asp) between the two 
revisions of our subjects.

