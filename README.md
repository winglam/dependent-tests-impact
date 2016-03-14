To reproduce figures 17, 18 and 19 in our paper do the following:

```
git clone https://github.com/winglam/dependent-tests-impact.git
cd dependent-tests-impact/experiments
./figureGenerator.sh
```

Once the script finishes running, the results for prioritization,
selection and parallelization can be found in dependent-tests-impact/experiments/prioritization-results, dependent-tests-impact/experiments/selection-results and dependent-tests-impact/experiments/parallelization-results (respectively).
Due to the calculation for APFD values (for figures 17 and 18) and runtime
differences (for figures 18 and 19) being dependent on the time it takes
for a test order to run and how the time it takes for a test
order to run may vary depending on external factors such as OS scheduling,
the results generated will most likely not match the figures in the paper
exactly. Nevertheless, the results generated should convey the same
overall message and should not differ significantly.

The `figureGenerator.sh` script
takes on average 9 hours to complete on a machine with the following
configuration:
Intel(R) Core(TM) i5-4590T CPU @ 2.00GHz 8GB RAM

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

You can re-generate these pre-computed test dependences instead of using the provided ones:
delete the files listed above and uncomment line 30 in
dependent-tests-impact/experiments/figureGenerator.sh.
`#./random-runner.sh` -> `./random-runner.sh`
However, note that doing so will require even more run time.

Another way to significantly affect run time is with two variables
in `dependent-tests-impact/experiments/config.sh`:
 * `medianTimes=3` represents the number of times to run the test order before
   taking the median.
 * `randomTimes=100` represents the number of times to randomize the test
   order when calculating the precomputed dependences.
