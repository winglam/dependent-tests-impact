package edu.washington.cs.dt.impact.tools;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.TypeDeclaration;

import javax.tools.*;
import java.io.*;
import java.util.*;

public class FailedTestRemover {
    private static final String AUTO_REMOVED_METHODS_FILEPATH = "auto-removed-methods.txt";

    private final JavaFile javaFile;
    private final List<RemovedMethod> removedMethods = new ArrayList<>();

    /**
     * A method that has been removed from the file because an error occurred in it.
     */
    private class RemovedMethod {
        private final PackageDeclaration packageDeclaration;
        private final ClassOrInterfaceDeclaration classDeclaration;
        private final MethodDeclaration method;

        private RemovedMethod(final PackageDeclaration packageDeclaration,
                              final ClassOrInterfaceDeclaration classDeclaration,
                              final MethodDeclaration method) {
            this.packageDeclaration = packageDeclaration;
            this.classDeclaration = classDeclaration;
            this.method = method;
        }

        /**
         * Ex: For int f(int a, int b), returns "int a, int b"
         * @returns A string containing the parameters separated by commas.
         */
        private String getParametersAsString() {
            String result = "";

            for (int i = 0; i < method.getParameters().size(); i++) {
                final Parameter parameter = method.getParameters().get(i);

                result += parameter.toString();

                if (i != (method.getParameters().size() - 1)) {
                    result += ", ";
                }
            }

            return result;
        }

        /**
         * @returns The fully qualified name of this method: packageName.className.methodName(paramNames)
         */
        private String getFullyQualifiedName() {
            final String packageName = packageDeclaration != null ? packageDeclaration.getPackageName() + "." : "";

            // Not using .getDeclarationAsString because it includes the return type, which wouldn't work with concatting below
            final String methodName = method.getName() + "(" + getParametersAsString() + ")";

            return packageName + classDeclaration.getName() + "." + methodName;
        }
    }

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
         * Attempts to remove the method declaration.
         * @param method The method declaration to remove.
         * @return A RemovedMethod object for the method if found, null otherwise.
         */
        private RemovedMethod removeMethod(final MethodDeclaration method) {
            for (final ClassOrInterfaceDeclaration classDeclaration : classList) {
                final boolean success = classDeclaration.getMembers().remove(method);

                if (success) {
                    return new RemovedMethod(compilationUnit.getPackage(), classDeclaration, method);
                }
            }

            return null;
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
            System.out.println("Usage: java FailedTestRemover <classpath> <filename>");
            System.out.println();

            System.out.print("Tries to compile the file specified by <filename> using the <classpath> ");
            System.out.print("(separated by " + System.getProperty("path.separator") + "), removing methods until it compiles. ");
            System.out.print("Writes out the file to out/<filename> ");
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

        final File file = new File(filename);

        System.out.println("Started running at: " + new Date().toString());

        System.out.println("Trying to compile " + filename);
        System.out.println("Classpath is: " + classPath);

        FailedTestRemover failedTestRemover = new FailedTestRemover(filename, classPath, "out/" + file.getName());
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

                final RemovedMethod removedMethod = javaFile.removeMethod(method);

                if (removedMethod != null) {
                    removedMethods.add(removedMethod);
                } else {
                    throw new Exception("Failed to remove " + method.getName() + "!");
                }
            }

            System.out.println();

            javaFile.writeAndReloadCompilationUnit();
        }

        writeAutoRemovedMethodList();

        System.out.println("Successfully compiled at: " + new Date().toString());
    }

    /**
     * Writes a list of tests that were removed from the file to auto-removed-methods.txt
     */
    private void writeAutoRemovedMethodList() throws IOException {
        final StringBuilder builder = new StringBuilder();

        builder.append("# This file contains the list of tests that were automatically removed to make the file compile with the new version of the subject.\n");

        if (removedMethods.size() == 0) {
            builder.append("# There were no tests that failed to compiled.");
        } else {
            for (final RemovedMethod method : removedMethods) {
                builder.append(method.getFullyQualifiedName() + "\n");
            }
        }

        final FileOutputStream outputStream = new FileOutputStream(AUTO_REMOVED_METHODS_FILEPATH);
        outputStream.write(builder.toString().getBytes());
        outputStream.flush();
        outputStream.close();
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
