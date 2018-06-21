package edu.washington.cs.dt.impact.runner;

import edu.washington.cs.dt.impact.figure.generator.PrecomputedTimeFigureGenerator;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;

public class OneConfigurationRunnerTest {
    private static final Path ROOT =
            Paths.get(System.getProperty("user.dir"), "..", "..", "dependent-tests-experiments").normalize();
    private static final Path OLD_CRYSTAL_PATH = ROOT.resolve("crystalvc");
    private static final Path NEW_CRYSTAL_PATH = ROOT.resolve("crystal");

    private static final Set<String> supportedSubjects = new HashSet<>(Collections.singletonList("crystal"));

    private static final PrintStream stdOut = System.out;

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(stdOut);
    }
//
//    @Test
//    public void testOutputResults() throws Exception {
//        final File resultsDir = temporaryFolder.newFolder();
//
//        runOneConfigRunner("crystal", "orig", "statement", "relative", resultsDir, false);
//
//        final Path outputFile =
//                Files.list(resultsDir.toPath())
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("No result files generated!"));
//
//        // Test that the lines exists AND that we can read them.
//        assertTrue(new StringSearch(FileUtil.readFile(outputFile))
//                .search(Searcher.contains("Original order results:"))
//                .findFirst()
//                .flatMap(LineMatch::nextLine)
//                .map(l -> MapUtil.valueRead(RESULT::valueOf, l.get()))
//                .isPresent());
//
//        assertTrue(new StringSearch(FileUtil.readFile(outputFile))
//                .search(Searcher.contains("Test order results:"))
//                .findFirst()
//                .flatMap(LineMatch::nextLine)
//                .map(l -> MapUtil.valueRead(RESULT::valueOf, l.get()))
//                .isPresent());
//    }

    @Test
    public void testCrystalPrecomputedTimeIsAverageTime() throws Exception {
        double totalTime = 0;
        int runs = 0;

        final File paraResultsDir = temporaryFolder.newFolder();
        final File prioResultsDir = temporaryFolder.newFolder();

        for (final String coverage : Arrays.asList("statement", "function")) {
            for (final String order : Arrays.asList("absolute", "relative")) {
                System.err.println("Running with: " + coverage + "," + order);
                runOneConfigRunner("crystal", "orig", coverage, order, prioResultsDir, true);

                final Optional<String> time = findOutput("Average time was: ([0-9]+\\.[0-9]+)");

                if (time.isPresent()) {
                    totalTime += Double.parseDouble(time.get());
                    runs++;
                }
            }
        }

        final long avgTime = (long) (totalTime / runs);

        final File outputFile = temporaryFolder.newFile("precomputed-dependences-time-per-program.tex");
        final String[] args = {"-outputDirectory", outputFile.getParent(),
                               "-prioDirectory", prioResultsDir.getCanonicalPath(),
                               "-paraDirectory", paraResultsDir.getCanonicalPath()};
        PrecomputedTimeFigureGenerator.main(args);

        final List<String> lines = Files.readAllLines(outputFile.toPath());

        // 3 is the column that contains orig-prio
        final long avgTimeInFile = (long) Double.parseDouble(lines.get(0).split("&")[3]);

        assertEquals(avgTime, avgTimeInFile);
    }

    private static List<File> getModifiedFiles(final long startTime, final File dir) {
        final File[] files = dir.listFiles();
        final List<File> modified = new ArrayList<>();

        if (files != null) {
            for (final File file : files) {
                System.out.println(file.lastModified() + " vs. " + startTime);
                if (file.lastModified() > startTime) {
                    modified.add(file);
                }
            }
        }

        return modified;
    }

    private File runOneConfigRunner(final String subject,
                                    final String testType,
                                    final String coverage,
                                    final String order,
                                    final File resultsDir,
                                    final boolean resolveDependences) throws Exception {
        assumeThat(subject, Matchers.isIn(supportedSubjects));

        final File outputFile = temporaryFolder.newFile();

        List<String> args = new ArrayList<>();
        switch (subject) {
            case "crystal":
                assumeTrue(Files.exists(OLD_CRYSTAL_PATH));
                assumeTrue(Files.exists(NEW_CRYSTAL_PATH));

                args = new ArrayList<>(Arrays.asList(
                        "-technique", "prioritization", "-coverage", coverage, "-order", order,
                        "-origOrder", NEW_CRYSTAL_PATH.resolve("crystal-" + testType + "-order").toString(),
                        "-testInputDir", OLD_CRYSTAL_PATH.resolve("sootTestOutput-" + testType).toString(),
                        "-filesToDelete", NEW_CRYSTAL_PATH.resolve("crystal-env-files").toString(),
                        "-getCoverage", "-project", "Crystal", "-testType", testType,
                        "-outputDir", resultsDir.getCanonicalPath(),
                        "-classpath", NEW_CRYSTAL_PATH.resolve("bin").toString() + ":" + NEW_CRYSTAL_PATH.resolve("lib").toString() + "/*"));
                break;
        }

        if (resolveDependences) {
            args.add("-resolveDependences");
            args.add(outputFile.toString());
        }

        final long startTime = System.currentTimeMillis(); // use instead of nanotime because File.lastModified is in milliseconds.
        OneConfigurationRunner.main(args.toArray(new String[0]));
        final List<File> modified = getModifiedFiles(startTime, resultsDir);

        assertThat(modified, Matchers.hasSize(1));

        return modified.get(0);
    }

    private Optional<String> findOutput(final String s) {
        for (final String line : outputStream.toString().split("\n")) {
            try {
                final Matcher matcher = Pattern.compile(s).matcher(line);

                if (matcher.matches()) {
                    return Optional.ofNullable(matcher.group(1));
                }
            } catch (IndexOutOfBoundsException ignored) {}
        }

        return Optional.empty();
    }
}