To reproduce figures 17, 18, and 19 in our paper do the following:

```
git clone https://github.com/winglam/dependent-tests-impact.git
cd dependent-tests-impact/experiments
./figureGenerator.sh
```

You must use Java 7; the version of Soot that we use does not work with Java 8.
We ran our experiments on a machine with Java version "1.7.0_91".
Ant is also required in order to build the subject programs.

We have tested the scripts on multiple machines and operating systems, and
it worked on all but one.  In case you have trouble running the experiments
on your machine, we have also provided the artifact pre-installed in a
virtual machine that runs Ubuntu version 14.04 with Java 7 and ant installed.
- Username for the VM: user
- Password for the VM: asdf
- Download link: https://drive.google.com/folderview?id=0B66sUcs7lhDVUWh2NVFrSTNjY28

The `figureGenerator.sh` script takes 9 hours to complete on a
machine with the following configuration:
Intel(R) Core(TM) i5-4590T CPU @ 2.00GHz 8GB RAM

The subject programs does print some error messages to the console;
this is expected and normal.

Once the script finishes running, the results for prioritization,
selection and parallelization can be found in .tex files in directories:

    dependent-tests-impact/experiments/prioritization-results/
    dependent-tests-impact/experiments/selection-results/
    dependent-tests-impact/experiments/parallelization-results/

The results are not identical with those in the submitted paper.  For the
submitted paper, some of the data was computed on a loaded machine that was
running other jobs, though we don't know exactly which data.  (That was a
methodological error.)  You should run your computation on an unloaded
machine; using the median of at least three runs further mitigates run-time
variance. While the numerical results differ, they still support the
paper's claims.

The following files contain the results of pre-computed test dependences:
- CRYSTAL-AUTO-DT_LIST.txt
- CRYSTAL-ORIG-DT_LIST.txt
- JFREECHART-AUTO-DT_LIST.txt
- JFREECHART-ORIG-DT_LIST.txt
- JODATIME-AUTO-DT_LIST.txt
- JODATIME-ORIG-DT_LIST.txt
- SYNOPTIC-AUTO-DT_LIST.txt
- SYNOPTIC-ORIG-DT_LIST.txt
- XML_SECURITY-AUTO-DT_LIST.txt
- XML_SECURITY-ORIG-DT_LIST.txt

You can re-generate these pre-computed test dependences instead of using
the provided ones:
 * delete the files listed above, and
 * uncomment line 30 (`#./random-runner.sh` -> `./random-runner.sh`) in
   dependent-tests-impact/experiments/figureGenerator.sh.
However, note that doing so will require even more run time.

Another way to significantly affect run time is with two variables
in `dependent-tests-impact/experiments/config.sh`:
 * `medianTimes=3` represents the number of times to run the test order before
   taking the median.
 * `randomTimes=100` represents the number of times to randomize the test
   order when calculating the precomputed dependences.
