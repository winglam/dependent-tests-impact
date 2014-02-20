package edu.washington.cs.dt.impact.objects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import edu.washington.cs.dt.TestExecResults;
import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;
import edu.washington.cs.dt.impact.util.TestMethodData;
import edu.washington.cs.dt.runners.AbstractTestRunner;
import edu.washington.cs.dt.runners.FixedOrderRunner;

public class TestParallelizationObject extends TestObject {
    private Vector<TestExecResults> resultsList;

    public TestParallelizationObject(ORDER order, String outputFilename, File inputTestFolder, COVERAGE coverage, File dependentTestsFile, int k, File origOrder) {
        super(inputTestFolder, coverage, dependentTestsFile);

        resultsList = new Vector<TestExecResults>();

        Map<String, TestMethodData> nameToMethodData = new HashMap<String, TestMethodData>();
        for (TestMethodData methodData : methodList) {
            nameToMethodData.put(methodData.getName(), methodData);
        }

        List<List<String>> splitTests = new LinkedList<List<String>>();

        if (order == ORDER.ORIGINAL) {
            methodList.clear();
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader(origOrder));
                String line;
                while ((line = br.readLine()) != null) {
                    if (nameToMethodData.containsKey(line.trim())) {
                        methodList.add(nameToMethodData.get(line.trim()));
                    }
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (order == ORDER.RANDOM) {
            Collections.shuffle(methodList);
        } else {
            System.err.println("Test parallelization is specified with an incompatible order. Compatible orders are: random.");
            System.exit(0);
        }

        int size = methodList.size() / k;
        if (methodList.size() % k != 0) {
            size += 1;
        }

        int index = 0;
        for (int j = 0; j < k; j++) {
            List<String> tests = new LinkedList<String>();
            for (int counter = 0; index < methodList.size() && counter < size; index++) {
                tests.add(methodList.get(index).getName());
                counter += 1;
            }
            splitTests.add(tests);
        }

        URL[] urls = ((URLClassLoader) (Thread.currentThread().getContextClassLoader())).getURLs();
        // We will store the threads so that we can check if they are done
        List<Thread> threads = new LinkedList<Thread>();
        for (int i = 0; i < k; i++) {
            Runnable task = new FixedOrderRunnable(splitTests.get(i));
            Thread worker = new Thread(task);
            worker.setContextClassLoader(new URLClassLoader(urls));
            worker.start();
            threads.add(worker);
        }

        int running = 0;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
        } while (running > 0);

        printResults(outputFilename);
    }

    private void printResults(String filename) {
        if (filename == null) {
            for (TestExecResults result : resultsList) {
                System.out.println(result);
            }
        } else {
            FileWriter output = null;
            BufferedWriter writer = null;
            try {
                output = new FileWriter(filename);
                writer = new BufferedWriter(output);

                for (TestExecResults result : resultsList) {
                    writer.write(result + "\n");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                    if (output != null) {
                        output.close();
                    }
                } catch (IOException e) {
                    // Ignore issues during closing
                }
            }
        }
    }

    @Override
    public void printResults() {
    }

    public class FixedOrderRunnable implements Runnable {
        private List<String> tests;

        FixedOrderRunnable(List<String> tests) {
            this.tests = tests;
        }

        @Override
        public void run() {
            AbstractTestRunner runner = new FixedOrderRunner(tests);
            TestExecResults results = runner.run();
            resultsList.add(results);
        }
    }
}