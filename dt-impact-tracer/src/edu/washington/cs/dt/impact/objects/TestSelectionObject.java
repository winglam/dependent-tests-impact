package edu.washington.cs.dt.impact.objects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.washington.cs.dt.impact.util.Constants.COVERAGE;
import edu.washington.cs.dt.impact.util.Constants.ORDER;
import edu.washington.cs.dt.impact.util.TestMethodData;

public class TestSelectionObject extends TestObject {
    private OrderObject orderObj;

    public TestSelectionObject(ORDER order, String outputFileName, File inputTestFolder, COVERAGE coverage, File selectionOutput1, File selectionOutput2, File origOrder) {
        super(inputTestFolder, coverage);

        Set<String> changedCoverage = findCoverage(selectionOutput1, selectionOutput2, coverage);

        // removes all tests from consideration if they don't execute any of the methods that has been changed
        Map<String, TestMethodData> nameToMethodData = new HashMap<String, TestMethodData>();
        for (TestMethodData methodData : methodList) {
            methodData.retainLines(changedCoverage);
            if (methodData.getLineCount() != 0) {
                nameToMethodData.put(methodData.getName(), methodData);
            }
        }

        if (order == ORDER.ABSOLUTE) {
            methodList.retainAll(nameToMethodData.values());
            Collections.sort(methodList);
        } else if (order == ORDER.RANDOM) {
            methodList.retainAll(nameToMethodData.values());
            Collections.shuffle(methodList);
        } else if (order == ORDER.ORIGINAL) {
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
        }
        orderObj = new StandardOrderObject(outputFileName, methodList);
    }

    private  Set<String> findCoverage(File selectionOutput1, File selectionOutput2, final COVERAGE coverage) {
        Map<String, List<String>> oldVersMap = coverageCount(selectionOutput1);
        Map<String, List<String>> newVersMap = coverageCount(selectionOutput2);
        Set<String> changedCoverage = new HashSet<String>();

        if (coverage == COVERAGE.FUNCTION) {
            // generate the list of methods that has been changed
            for (String key : oldVersMap.keySet()) {
                if (!newVersMap.containsKey(key) || !oldVersMap.get(key).equals(newVersMap.get(key))) {
                    changedCoverage.add(key);
                }
            }
        } else if (coverage == COVERAGE.STATEMENT) {
            // generate the list of statements that has been changed
            for (String key : oldVersMap.keySet()) {
                if (!newVersMap.containsKey(key)) {
                    changedCoverage.addAll(oldVersMap.get(key));
                } else if (!oldVersMap.get(key).equals(newVersMap.get(key))) {
                    oldVersMap.get(key).removeAll(newVersMap.get(key));
                    changedCoverage.addAll(oldVersMap.get(key));
                }
            }
        }

        return changedCoverage;
    }

    private  Map<String, List<String>> coverageCount(final File folder) {
        Map<String, List<String>> retMap = new HashMap<String, List<String>>();

        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isFile()) {
                BufferedReader br;
                try {
                    br = new BufferedReader(new FileReader(fileEntry));
                    String line;
                    List<String> lines = new LinkedList<String>();
                    while ((line = br.readLine()) != null) {
                        lines.add(line);
                    }
                    br.close();
                    retMap.put(fileEntry.getName(), lines);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            } else {
                continue;
            }
        }

        return retMap;
    }

    @Override
    public void printResults() {
        orderObj.printResults();
    }
}
