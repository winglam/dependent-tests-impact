package edu.washington.cs.dt.impact.data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import com.github.javaparser.JavaParser;
import com.github.javaparser.Position;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;

/**
 * Created by winglam on 12/10/18.
 */
public class JavaFile {

    /**
     * The basic Java file which supports compiling/removing methods.
     */
    private CompilationUnit compilationUnit;
    private List<ClassOrInterfaceDeclaration> classList = new ArrayList<>();
    private Map<ClassOrInterfaceDeclaration, List<MethodDeclaration>> classToMethods = new HashMap<>();
    private Map<ClassOrInterfaceDeclaration, List<MethodDeclaration>> classToTestMethods = new HashMap<>();
    private final String filename;
    private final String classPath;
    private final Path outfileName;

    public JavaFile(String filename,
                    String classPath,
                    Path outfileName) {
        this.filename = filename;
        this.classPath = classPath;
        this.outfileName = outfileName;
    }

    public void open() throws IOException {
        final File sourceFile = new File(filename);
        compilationUnit = JavaParser.parse(sourceFile);
    }

    public String getFilename() {
        return filename;
    }

    /**
     * Finds all classes/interfaces in the file and saves them.
     * @param fileToParse
     */
    public void loadClassList(final Path fileToParse) throws IOException {
        compilationUnit = JavaParser.parse(fileToParse.toFile());

        classList.clear();
        classList.addAll(compilationUnit.findAll(ClassOrInterfaceDeclaration.class));

        classToMethods.clear();
        for (ClassOrInterfaceDeclaration classDec : classList) {
           List<MethodDeclaration> methods = classDec.findAll(MethodDeclaration.class);
           classToMethods.put(classDec, methods);
        }

        classToTestMethods.clear();
        for (ClassOrInterfaceDeclaration classDec: classToMethods.keySet()) {
            List<MethodDeclaration> testMethods = new ArrayList<>();
            for (MethodDeclaration method : classToMethods.get(classDec)) {
                if (areJUnitAnnotations(method.getAnnotations()) ||
                        method.getNameAsString().startsWith("test")) {
                    testMethods.add(method);
                }
            }
            if (!testMethods.isEmpty()) {
                classToTestMethods.put(classDec, testMethods);
            }
        }
    }

    private boolean areJUnitAnnotations(NodeList<AnnotationExpr> annotations) {
        for (AnnotationExpr expr : annotations) {
            if (expr.getNameAsString().startsWith("Test")) {
                return true;
            }
        }
        return false;
    }

    public List<String> getTestListAsString() {
        List<String> retList = new ArrayList<>();
        for(ClassOrInterfaceDeclaration classDec : classToTestMethods.keySet()) {
            for (MethodDeclaration method : classToTestMethods.get(classDec)) {
                retList.add(getFullyQualifiedMethodName(method, classDec));
            }
        }
        return retList;
    }

    public Path writeFile() throws IOException {
        Files.write(outfileName, compilationUnit.toString().getBytes());
        return outfileName;
    }

    public void writeAndReloadCompilationUnit() throws IOException {
        writeFile();
        loadClassList(outfileName);
    }

    private MethodDeclaration findMethodAt(final long line) {
        for (final ClassOrInterfaceDeclaration classDeclaration : classList) {
            for (final BodyDeclaration bodyDeclaration : classDeclaration.getMembers()) {
                if (bodyDeclaration instanceof MethodDeclaration) {
                    final MethodDeclaration method = (MethodDeclaration)bodyDeclaration;
                    final Position begin = method.getBegin().orElseThrow(() -> new RuntimeException("Cannot get start line for " + method.getSignature()));
                    final Position end = method.getEnd().orElseThrow(() -> new RuntimeException("Cannot get end line for " + method.getSignature()));

                    if (begin.line <= line && end.line >= line) {
                        return method;
                    }
                }
            }
        }

        return null;
    }

    public MethodDeclaration getMethodDeclaration(final String name) {
        for (final ClassOrInterfaceDeclaration classDeclaration : classList) {
            for (final BodyDeclaration bodyDeclaration : classDeclaration.getMembers()) {
                if (bodyDeclaration instanceof MethodDeclaration) {
                    final MethodDeclaration method = (MethodDeclaration)bodyDeclaration;
                    String fullMethodName = getFullyQualifiedMethodName(method, classDeclaration);
                    if (fullMethodName.equalsIgnoreCase(name))
                        return method;
                }
            }
        }

        return null;
    }

    private String getFullyQualifiedMethodName(MethodDeclaration method, ClassOrInterfaceDeclaration classDec) {
        return String.format("%s.%s.%s",
                             compilationUnit.getPackageDeclaration().get().getName().toString(),
                             classDec.getNameAsString(),
                             method.getName().getIdentifier());
    }


    /**
     * Attempts to remove the method declaration.
     * @param method The method declaration to remove.
     * @return A String of the fully qualified name of the method removed if found, null otherwise.
     */
    public String removeMethod(final MethodDeclaration method) {
        for (final ClassOrInterfaceDeclaration classDeclaration : classList) {
            final MethodRemoverVisitor remover = new MethodRemoverVisitor(method);
            classDeclaration.accept(remover, null);

            final Optional<PackageDeclaration> packageDec = compilationUnit.getPackageDeclaration();

            if (remover.succeeded()) {
                return createRemovedMethodString(packageDec.map(PackageDeclaration::getNameAsString).orElse(""), classDeclaration, method);
            }
        }

        return null;
    }

    /**
     * @return The fully qualified name of this method: packageName.className.methodName(paramNames)
     */
    private static String createRemovedMethodString(final String packageName,
                                                    final ClassOrInterfaceDeclaration classDeclaration,
                                                    final MethodDeclaration method) {
        // Not using .getDeclarationAsString because it includes the return type, which wouldn't work with concatting below
        final String methodName = method.getName() + "(" + getParametersAsString(method) + ")";

        return packageName + classDeclaration.getName() + "." + methodName;
    }

    /**
     * Ex: For int f(int a, int b), returns "int a, int b"
     * @return A string containing the parameters separated by commas.
     */
    private static String getParametersAsString(final MethodDeclaration method) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < method.getParameters().size(); i++) {
            final Parameter parameter = method.getParameters().get(i);

            result.append(parameter.toString());

            if (i != (method.getParameters().size() - 1)) {
                result.append(", ");
            }
        }

        return result.toString();
    }

    /**
     * Writes the file to the output filename, then tries to compile the output file.
     */
    public DiagnosticCollector<JavaFileObject> tryCompile() throws IOException {
        writeAndReloadCompilationUnit();
        return compile();
    }

    public DiagnosticCollector<JavaFileObject> compile() throws IOException {
        final File file = outfileName.toFile();

        final JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        final List<String> compilerOptions =
                new ArrayList<>(Arrays.asList("-classpath", classPath));

        final DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        final StandardJavaFileManager fileManager =
                javaCompiler.getStandardFileManager(diagnostics, null, null);

        final Iterable<? extends JavaFileObject> fileObjects =
                fileManager.getJavaFileObjectsFromFiles(Collections.singletonList(file));

        final JavaCompiler.CompilationTask compilationTask =
                javaCompiler.getTask(null, fileManager, diagnostics, compilerOptions, null, fileObjects);
        compilationTask.call();

        fileManager.close();

        return diagnostics;
    }

    public List<MethodDeclaration> getMethodsWithErrors(DiagnosticCollector<JavaFileObject> diagnostics)
            throws Exception {
        final List<MethodDeclaration> methodsWithErrors = new ArrayList<>();

        for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
            if (diagnostic.getKind() == Diagnostic.Kind.ERROR) {
                final MethodDeclaration method = findMethodAt(diagnostic.getLineNumber());
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


    private final class MethodRemoverVisitor extends ModifierVisitor<Void> {
        private final MethodDeclaration method;

        private boolean found = false;

        MethodRemoverVisitor(final MethodDeclaration method) {
            this.method = method;
        }

        @Override
        public Visitable visit(MethodDeclaration n, Void arg) {
            if (n.getSignature().equals(method.getSignature())) {
                this.found = true;

                return null;
            }

            return super.visit(n, arg);
        }

        boolean succeeded() {
            return found;
        }
    }
}
