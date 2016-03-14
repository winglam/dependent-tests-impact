To reproduce figures 17, 18 and 19 in our paper do the following:

1. git clone https://github.com/winglam/dependent-tests-impact.git
2. cd dependent-tests-impact/experiments
3. ./figureGenerator.sh

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
takes on average about 9 hours to complete on a machine with the following
configuration:
Intel(R) Core(TM) i5-4590T CPU @ 2.00GHz 8GB RAM