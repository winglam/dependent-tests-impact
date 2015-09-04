Our paper says that dependent tests can affect downstream testing techniques such as regression, prioritization, coverage-based debugging, test parallelization, and delta debugging.  These test assume test independence, and they can produce incorrect results in the presence of dependent tests.

It would be nice to have concrete evidence about how often their results
are incorrect, and how incorrect their results are.  In particular, the
idea is:
  1. Choose a technique (I would start with test selection, but others would be possible).
  1. Implement the technique.
  1. Measure the impact of dependent tests on the technique. Then repeat with other techniques until you have evaluated them all.