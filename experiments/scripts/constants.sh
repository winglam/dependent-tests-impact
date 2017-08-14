# This file is to share variables and functions. Please do not run this
# file.

# Number of times to run the test order before taking the median
medianTimes=1
# Number of times to randomize the test order when calculating the
# precomputed dependences
randomTimes=100

testTypes=(orig auto)
coverages=(statement function)
machines=(2 4 8 16)

# Ordering for the three techniques
priorOrders=(absolute relative)
seleOrders=(original absolute relative)

# Directory to output the results
priorDir=prioritization-results
seleDir=selection-results
paraDir=parallelization-results

function clearTemp() {
  rm -rf tmpfile.txt
  rm -rf tmptestfiles.txt
  rm -rf dtFixerOutput
}
