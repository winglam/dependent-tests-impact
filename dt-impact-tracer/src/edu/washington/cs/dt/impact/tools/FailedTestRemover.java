package edu.washington.cs.dt.impact.tools;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;

import javax.tools.*;
import java.io.*;
import java.util.*;

public class FailedTestRemover {
    private final JavaFile javaFile;

    /**
     * The basic Java file which supports compiling/removing methods.
     */
    private class JavaFile {
        private CompilationUnit compilationUnit;
        private List<ClassOrInterfaceDeclaration> classList = new ArrayList<>();
        private final String classPath;
        private final String outfileName;

        private JavaFile(String filename, String classPath, String outfileName)
                throws IOException, ParseException {
            final File sourceFile = new File(filename);
            compilationUnit = JavaParser.parse(sourceFile);

            this.classPath = classPath;
            this.outfileName = outfileName;
        }

        /**
         * Finds all classes/interfaces in the file and saves them.
         */
        private void loadClassList() {
            classList.clear();

            for (final TypeDeclaration typeDeclaration : compilationUnit.getTypes()) {
                if (typeDeclaration instanceof ClassOrInterfaceDeclaration) {
                    classList.add((ClassOrInterfaceDeclaration) typeDeclaration);
                }
            }
        }

        private void writeFile() throws IOException {
            final FileOutputStream outputStream = new FileOutputStream(outfileName);

            outputStream.write(compilationUnit.toString().getBytes());
            outputStream.flush();

            outputStream.close();
        }

        private MethodDeclaration findMethodAt(final long line) {
            for (final ClassOrInterfaceDeclaration classDeclaration : classList) {
                for (final BodyDeclaration bodyDeclaration : classDeclaration.getMembers()) {
                    if (bodyDeclaration instanceof MethodDeclaration) {
                        final MethodDeclaration method = (MethodDeclaration)bodyDeclaration;

                        if (method.getBeginLine() <= line && method.getEndLine() >= line) {
                            return method;
                        }
                    }
                }
            }

            return null;
        }

        /**
         * Attempts to remove the method declaration from all classes in the file it may be defined in.
         * @param method The method declaration to remove.
         * @return True if successful, false if not.
         */
        private boolean removeMethod(final MethodDeclaration method) {
            for (final ClassOrInterfaceDeclaration classDeclaration : classList) {
                final boolean success = classDeclaration.getMembers().remove(method);

                // Doesn't seem to work on VM for some reason.
                // classDeclaration.addOrphanComment(new BlockComment(method.toString()));

                if (!success) {
                    return false;
                }
            }

            return true;
        }

        /**
         * Writes the file to the output filename, then tries to compile the output file.
         */
        private DiagnosticCollector<JavaFileObject> tryCompile()
                throws IOException, ParseException {
            writeAndReloadCompilationUnit();

            return compile();
        }

        private void writeAndReloadCompilationUnit() throws IOException, ParseException {
            writeFile();

            compilationUnit = JavaParser.parse(new FileInputStream(outfileName));
            loadClassList();
        }

        private DiagnosticCollector<JavaFileObject> compile() throws IOException {
            final File file = new File(outfileName);

            final JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
            final List<String> compilerOptions =
                    new ArrayList<>(Arrays.asList("-classpath", classPath));

            final DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
            final StandardJavaFileManager fileManager =
                    javaCompiler.getStandardFileManager(diagnostics, null, null);

            final Iterable<? extends JavaFileObject> fileObjects =
                    fileManager.getJavaFileObjectsFromFiles(Arrays.asList(file));

            System.out.println("Trying to compile.");

            final JavaCompiler.CompilationTask compilationTask =
                    javaCompiler.getTask(null, fileManager, diagnostics, compilerOptions, null, fileObjects);
            compilationTask.call();

            fileManager.close();

            return diagnostics;
        }

        private List<MethodDeclaration> getMethodsWithErrors(DiagnosticCollector<JavaFileObject> diagnostics)
                throws Exception {
            final List<MethodDeclaration> methodsWithErrors = new ArrayList<>();

            for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
                final MethodDeclaration method = findMethodAt(diagnostic.getLineNumber());
                if (diagnostic.getKind() == Diagnostic.Kind.ERROR) {
                    if (method != null) {
                        if (!methodsWithErrors.contains(method)) {
                            methodsWithErrors.add(method);
                        }
                    } else {
                        throw new Exception("An error has occurred in an unknown method:\n"
                                + " Message: " + diagnostic.getMessage(Locale.getDefault()) + "\n"
                                + " Source: " + diagnostic.getSource() + "\n"
                                + " Code: " + diagnostic.getCode() + "\n"
                                + " Kind: " + diagnostic.getKind() + "\n"
                                + " Line: " + diagnostic.getLineNumber()
                                + " Position: " + diagnostic.getPosition() + "\n");
                    }
                } else {
                    System.out.println("Ignoring the following diagnostic: "
                            + diagnostic.getMessage(Locale.getDefault()));
                }
            }

            return methodsWithErrors;
        }
    }

    private FailedTestRemover(final String filename, final String classPath, final String outfileName)
            throws IOException, ParseException {
        javaFile = new JavaFile(filename, classPath, outfileName);
    }

    public static void main(final String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java FailedTestRemover <classpath> <filename> [<output-dir>]");
            System.out.println();

            System.out.print("Tries to compile the file specified by <filename> using the <classpath> ");
            System.out.print("(separated by " + System.getProperty("path.separator") + "), removing methods until it compiles. ");
            System.out.print("Writes out the file to <output-dir>/<filename> (default <output-dir> is 'out/') ");
            System.out.print("after each attempted compilation/removal cycle.");
            System.out.println();

            System.out.println();
            System.out.println("Example ($DT_TOOLS should include the javaparser .jar and the .jar for the FailedTestRemover): ");
            System.out.println();
            System.out.println("    java -cp $DT_TOOLS: edu.washington.cs.dt.impact.tools.FailedTestRemover . Test.java");
            System.out.println("    java -cp $DT_TOOLS: edu.washington.cs.dt.impact.tools.FailedTestRemover $NEW_DT_LIBS:$NEW_DT_CLASS:$DT_TOOLS: RegressionTest0.java");
            return;
        }

        // Necessary because the JavaCompiler class won't expand wildcards.
        final String classPath = buildClassPath(args[0].split(System.getProperty("path.separator")));
        final String filename = args[1];

        String outputDir = "out/";

        if (args.length > 2) {
            outputDir = args[1];
        }

        if (!outputDir.endsWith("/")) {
            outputDir += "/";
        }

        final File file = new File(filename);

        System.out.println("Started running at: " + new Date().toString());

        System.out.println("Trying to compile " + filename);
        System.out.println("Classpath is: " + classPath);
        System.out.println("Writing output to " + outputDir + file.getName());

        FailedTestRemover failedTestRemover = new FailedTestRemover(filename, classPath, outputDir + file.getName());
        failedTestRemover.run();
    }

    /**
     * Tries to repeatedly compile the file until there were no errors that occurred during compilation.
     * @throws Exception
     */
    private void run() throws Exception {
        int errorCount = -1;
        while (errorCount != 0) {
            DiagnosticCollector<JavaFileObject> diagnostics = javaFile.tryCompile();

            errorCount = getDiagnosticCount(diagnostics, Diagnostic.Kind.ERROR);

            System.out.println("Compiling " + (errorCount == 0 ? "succeeded" : "failed")
                    + " with " + errorCount + " errors.");

            final List<MethodDeclaration> methodsWithErrors = javaFile.getMethodsWithErrors(diagnostics);

            System.out.print("Removing: ");
            for (int i = 0; i < methodsWithErrors.size(); i++) {
                MethodDeclaration method = methodsWithErrors.get(i);

                if (i + 1 == methodsWithErrors.size()) {
                    System.out.print(method.getName());
                } else {
                    System.out.print(method.getName() + ", ");
                }

                boolean success = javaFile.removeMethod(method);

                if (!success) {
                    throw new Exception("Failed to remove " + method.getName() + "!");
                }
            }

            System.out.println();

            javaFile.writeAndReloadCompilationUnit();
        }

        System.out.println("Successfully compiled at: " + new Date().toString());
    }

    private int getDiagnosticCount(final DiagnosticCollector<JavaFileObject> diagnostics,
                                   final Diagnostic.Kind kind) {
        int count = 0;

        for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
            if (diagnostic.getKind() == kind) {
                count++;
            }
        }

        return count;
    }

    /**
     * This function builds a classpath from the passed Strings
     * From https://stackoverflow.com/questions/22965975/how-to-set-up-classpath-of-javacompiler-to-multiple-jar-files-using-wildcard
     *
     * @param paths classpath elements
     * @return returns the complete classpath with wildcards expanded
     */
    private static String buildClassPath(String... paths) {
        StringBuilder sb = new StringBuilder();
        for (String path : paths) {
            if (path.endsWith("*")) {
                path = path.substring(0, path.length() - 1);
                File pathFile = new File(path);
                for (File file : pathFile.listFiles()) {
                    if (file.isFile() && file.getName().endsWith(".jar")) {
                        sb.append(path);
                        sb.append(file.getName());
                        sb.append(System.getProperty("path.separator"));
                    }
                }
            } else {
                sb.append(path);
                sb.append(System.getProperty("path.separator"));
            }
        }
        return sb.toString();
    }
}
