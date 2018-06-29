package edu.washington.cs.dt.impact.tools;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.collections.MapUtil;
import com.reedoei.eunomia.io.IOUtil;
import com.reedoei.eunomia.string.matching.LineMatch;
import com.reedoei.eunomia.string.searching.Searcher;
import com.reedoei.eunomia.string.searching.StringSearch;
import com.reedoei.eunomia.util.StandardMain;
import edu.washington.cs.dt.OneTestExecResult;
import edu.washington.cs.dt.RESULT;
import edu.washington.cs.dt.impact.util.Constants;
import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// TODO: Only a TODO so this gets seen
// NOTE: This class was only used for updating result files. It is probably no longer useful after
//       2018-07-06 (hence the deprecation). If you find yourself using this, please update this date
//       to be accurate.
@Deprecated
public class ResultFileUpdater extends StandardMain {
    private final Path resultDir;
    private final String classpath;

    private final Map<String, RESULT> origResults;
//    private final Map<String, RESULT> autoResults;

    public static void main(final String[] args) throws Exception {
        new ResultFileUpdater(args).run();
    }

    private ResultFileUpdater(final String[] args) throws IOException {
        super(args);

        resultDir = Paths.get(getArgRequired("result-dir"));
        classpath = getArg("cp", "classpath").orElse(System.getProperty("java.class.path"));

        final List<String> origOrder =
                Files.readAllLines(Paths.get(getArgRequired("origOrder", "orig-order")), Charset.defaultCharset());
//        final List<String> autoOrder =
//                Files.readAllLines(Paths.get(getArgRequired("autoOrder", "auto-order")), Charset.defaultCharset());

        System.out.println("[INFO] Getting original order results.");
        origResults = new SilentRunner(classpath, origOrder).run().getNameToResultsMap();
//        autoResults = new SilentRunner(classpath, autoOrder).run().getNameToResultsMap();
    }

    @Override
    protected void run() throws Exception {
        final List<Path> files =
                Files.walk(resultDir)
                .filter(path -> FilenameUtils.isExtension(path.toString(), "txt"))
                .collect(Collectors.toList());

        for (int i = 0; i < files.size(); i++) {
            final Path resultFile = files.get(i);
            try {
                IOUtil.printClearLine(String.format("[INFO] %d of %d: %s", i, files.size(), resultFile));

                if (resultFile.toString().contains("-ORIG-")) {
                    processFile(resultFile, origResults);
                }
/*                } else {
                    processFile(resultFile, autoResults);
                }*/
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n[INFO] Done.");
    }

    private void processFile(final Path resultFile, final Map<String, RESULT> results) throws IOException {
        // TODO: XML_CHANGE. If converting results files to XML, change this parsing.
        final List<String> testOrder =
                new StringSearch(resultFile)
                        .searchMustMatch(Searcher.contains(Constants.TEST_ORDER_LIST))
                        .nextLine()
                        .map(l -> ListUtil.read(l.get()))
                        .orElseThrow(() -> new RuntimeException("No line comes after line '" + Constants.TEST_ORDER_LIST + "' in " + resultFile));

        final Map<String, RESULT> orderResults =
                new SilentRunner(classpath, testOrder).run().getNameToResultsMap();

        final Set<String> dependentTests = MapUtil.diff(orderResults, results);

        final Map<String, RESULT> isolationResults = new HashMap<>();
        final Map<String, Long> isolationTimes = new HashMap<>();

        for (final String dependentTest : dependentTests) {
            final OneTestExecResult result =
                    new SilentRunner(classpath, Collections.singletonList(dependentTest))
                    .run().getResult(dependentTest);

            isolationResults.put(dependentTest, result.result);
            isolationTimes.put(dependentTest, result.getExecTime());
        }

        writeModifiedFile(resultFile, results, orderResults, isolationResults, isolationTimes);
    }

    private void writeModifiedFile(final Path resultFile,
                                   final Map<String,RESULT> results,
                                   final Map<String,RESULT> orderResults,
                                   final Map<String,RESULT> isolationResults,
                                   final Map<String,Long> isolationTimes) throws IOException {
        final List<String> newLines = new ArrayList<>();

        newLines.add("\nOriginal order results:");
        newLines.add(results.toString());

        newLines.add("\nTest order results:");
        newLines.add(orderResults.toString());

        newLines.add("\n" + Constants.ISOLATION_RESULTS);
        newLines.add(isolationResults.toString());

        newLines.add("\n" + Constants.ISOLATION_TIMES);
        newLines.add(isolationTimes.toString() + "\n");

        final LineMatch match = new StringSearch(resultFile)
                .searchMustMatch(Searcher.contains(Constants.TEST_ORDER_LIST))
                .nextLine(2)
                .map(l -> l.insertAfter(newLines))
                .orElseThrow(() -> new RuntimeException("Couldn't get line to insert! Verify that "
                        + resultFile + " contains the text '" + Constants.TEST_ORDER_LIST
                        + "' and has at least 2 lines after it."));

        Files.write(resultFile, String.join(System.lineSeparator(), match.getLines()).getBytes());
    }
}
