package edu.washington.cs.dt.impact.Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaFileObject;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.reedoei.eunomia.util.StandardMain;
import edu.washington.cs.dt.impact.data.JavaFile;
import edu.washington.cs.dt.impact.tools.FailedTestRemover;
import edu.washington.cs.dt.impact.tools.detectors.FailingTestDetector;

/**
 * Created by winglam on 12/10/18.
 */
public class AutoCleanerMain extends StandardMain {
    private final String classpath;
    private final String cleanerTestName;
    private final String victimTestName;
    private final Path testFilesPath;
    private final Path testBinaryPath;

    public AutoCleanerMain(final String[] args) throws Exception {
        super(args);

        this.classpath = FailedTestRemover.buildClassPath(getArgRequired("classpath").split(":"));
        this.cleanerTestName = getArgRequired("cleanerTestName");
        this.victimTestName = getArgRequired("victimTestName");
        this.testFilesPath = Paths.get(getArgRequired("tests"));
        this.testBinaryPath = Paths.get(getArgRequired("testBinaryPath"));
    }

    private boolean didTestsPass(List<String> tests) throws IOException {
        FailingTestDetector detector = getFailingTestDetector(classpath, tests);
        Set<String> failedTest = detector.notPassingTests();
        return failedTest.isEmpty();
    }

    private FailingTestDetector detector;
    private FailingTestDetector getFailingTestDetector(String classpath, List<String> tests) {
        if (detector == null) {
            detector = new FailingTestDetector(classpath, new ArrayList<>(tests));
        } else {
            detector.setTestList(new ArrayList<>(tests));
        }
        return detector;
    }

    private void compile(final JavaFile javaFile) throws Exception {
        int errorCount = -1;
        while (errorCount != 0) {
            System.out.println("Trying to compile: " + javaFile.getFilename());
            final DiagnosticCollector<JavaFileObject> diagnostics = javaFile.tryCompile();

            errorCount = FailedTestRemover.getDiagnosticCount(diagnostics, Diagnostic.Kind.ERROR);

            System.out.println("Compiling " + (errorCount == 0 ? "succeeded" : "failed")
                                       + " with " + errorCount + " errors.");
            errorCount = 0;
        }

        System.out.println("Successfully compiled at: " + new Date().toString());
        System.out.println();
    }

    private JavaFile getJavaFile(String testName, List<Path> testFiles, boolean saveOrigFile, Path outputPath) throws IOException {
        // For each test source files, find the cleaner and victim test name
        for (Path p : testFiles) {
            if (!p.getFileName().toString().endsWith(".java")) {
                continue;
            }

            Path pOrig = Paths.get(p.toString() + ".orig");

            if (Files.exists(pOrig)) {
                Files.copy(pOrig, p,
                           StandardCopyOption.REPLACE_EXISTING);
            } else if (saveOrigFile){
                saveOrigFile(p);
            }

            // Copy the compiled binary to the correct location
            // TODO a better way should be implemented to look up the location of the
            // binary file using the source file that we found, fixed, and recompiled
            JavaFile jFile = new JavaFile(p.getFileName().toString(), classpath, outputPath);

            jFile.loadClassList(p);
            if (jFile.getMethodDeclaration(testName) != null) {
                return jFile;
            }
        }
        return null;
    }

    private void saveOrigFile(Path filePath) throws IOException {
        Path parent = filePath.getParent();
        Path copyFilePath = Paths.get(parent.toString(), filePath.getFileName().toString() + ".orig");
        Files.copy(filePath, copyFilePath,
                   StandardCopyOption.REPLACE_EXISTING);
    }

    @Override
    protected void run() throws Exception {
        // Get all test source files
        List<Path> testFiles = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(testFilesPath)) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(testFiles::add);
        }

        JavaFile cleanerJavaFile = getJavaFile(cleanerTestName, testFiles, false, testBinaryPath);
        MethodDeclaration cleanerMethod = cleanerJavaFile.getMethodDeclaration(cleanerTestName);
        BlockStmt cleanerBlock = cleanerMethod.getBody().get();

        JavaFile victimJavaFile = getJavaFile(victimTestName, testFiles, true, testBinaryPath);

        // Check if we pass in isolation before fix
        System.out.println("[INFO] Found and compiling victim test.");
        compile(victimJavaFile);
        System.out.println("[INFO] Running victim test in isolation without code from cleaner.");
        didTestsPass(Arrays.asList(victimTestName));

        // Do our fix
        System.out.println("[INFO] Applying code from cleaner and recompiling.");
        MethodDeclaration victimMethod = victimJavaFile.getMethodDeclaration(victimTestName);
        NodeList<Statement> victimStmts = victimMethod.getBody().get().getStatements();
        victimStmts.add(0, cleanerBlock);

        victimMethod.getBody().get().setStatements(victimStmts);
        victimJavaFile.writeFile();

        // Check if we pass in isolation after fix
        compile(victimJavaFile);
        System.out.println("[INFO] Running victim test in isolation with code from cleaner.");
        boolean passInIsolationAfterFix = didTestsPass(Arrays.asList(victimTestName));
        if (!passInIsolationAfterFix) {
            System.out.println("[ERROR] Fix was unsuccessful. Test still fails in isolation.");
            return;
        } else {
            System.out.println("[INFO] Fix was successful! Fixed file:\n" + testBinaryPath);
        }

        // Check if we pass in the whole test class
        // Should check before fix if class is passing
        //        boolean didClassPass = didTestsPass(victimJavaFile.getTestListAsString());

        //        if (didClassPass) {
        //            boolean didClassPassAfterFix = didTestsPass(victimJavaFile.getTestListAsString());
        //            if (!didClassPassAfterFix) {
        //                System.out.println("Fix was unsuccessful. Fix causes some other test in the class to fail.");
        //                return;
        //            }
        //        }
    }

    public static void main(final String[] args) {
        try {
            new AutoCleanerMain(args).run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.exit(0);
    }
}
