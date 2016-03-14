To reproduce figures 17, 18 and 19 in our paper do the following:

1. git clone https://github.com/winglam/dependent-tests-impact.git
2. cd dependent-tests-impact/experiments
3. ./figureGenerator.sh

Once the script finishes running, the results for prioritization,
selection and parallelization can be found in dependent-tests-impact/experiments/prioritization-results, dependent-tests-impact/experiments/selection-results and dependent-tests-impact/experiments/parallelization-results (respectively).
Due to the calculation for APFD values (for figures 17 and 18) and runtime
differences (for figures 18 and 19) being dependent on the time it takes
for a test order to run and how the time it takes for a test
order to run may vary depending on external factors such as OS scheduling,
the results generated will most likely not match the figures in the paper
exactly. Nevertheless, the results generated should convey the same
overall message and should not differ significantly.

In light of saving run time of the scripts, the following files are
provided:
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

These files correspond to each project and their type of tests'
pre-computed dependences. To automatically generate these
pre-computed dependences instead of using the existing ones,
delete the files listed above and uncomment line 30 in
dependent-tests-impact/experiments/figureGenerator.sh.
`#./random-runner.sh` -> `./random-runner.sh`

With the pre-computed dependences provided the figureGenerator.sh
takes on average 9 hours to complete on a machine with the following
configuration:
Intel(R) Core(TM) i5-4590T CPU @ 2.00GHz 8GB RAM

The following two variables in dependent-tests-impact/experiments/config.sh
are also worth noting, `medianTimes=3` and `randomTimes=100`.
`medianTimes=3` represents the number of times to run the test order before
taking the median.
`randomTimes=100` represents the number of times to randomize the test
order when calculating the precomputed dependences.
The setting of these two variables may significantly affect the run time
of the scripts.