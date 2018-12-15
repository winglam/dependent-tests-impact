# Usage

1. Clone the repositories.

```
git clone -b ASDFPrototype https://github.com/OrDTesters/dependent-tests-impact.git
```

```
git clone https://github.com/apache/zeppelin.git
git checkout -b 354b06f7342746ce50cffa5dc886512bfc908922
```

2. Compile the repositories.

```
cd dependent-tests-impact/dt-impact-tracer
mvn install dependency:copy-dependencies -DskipTests -Dgpg.skip
```

```
cd zeppelin/
mvn install -DskipTests
cd zeppelin-interpreter/
mvn install -DskipTests dependency:copy-dependencies
```

3. Running `AutoCleanerMain`. 

```
java \
-cp 
path_to_dt-impact-tracer_classes/:path_to_dt-impact-tracer/dependency/*: \
edu.washington.cs.dt.impact.Main.AutoCleanerMain \
  -tests zeppelin/zeppelin-interpreter/src/test/ \
  -cleanerTestName org.apache.zeppelin.dep.DependencyResolverTest.testAddRepo \
  -victimTestName org.apache.zeppelin.dep.DependencyResolverTest.testDelRepo \ 
  -classpath $NEW_DT_TESTS:$NEW_DT_CLASS:$NEW_DT_LIBS \
  -testBinaryPath /Users/winglam/tmp/zeppelin/zeppelin-interpreter/target/test-classes/org/apache/zeppelin/dep/DependencyResolverTest.java
```

+ ```-tests```: directory containing the source files that contains the cleaner and victim test methods.
+ ```-cleanerTestName```: fully qualified method name of the cleaner.
+ ```-victimTestName```: fully qualified method name of the victim.
+ ```-classpath```: classpath of compiled source and test code of the subject and the libs that the subject depends on. Libs can be expressed with `*` as the program will expand such wildcards.
+ ```-testBinaryPath```: path to where the fixed test file should be outputted to. For the sake of simplicity, this file path should be in the same directory as the compiled binary of the unfixed version (e.g., target/test-classes/.../TestFile.java).


Standard out from running the tool:

```
[INFO] Found and compiling victim test.
Trying to compile: DependencyResolverTest.java
Compiling succeeded with 0 errors.
Successfully compiled at: Thu Dec 13 14:58:15 PST 2018

[INFO] Running victim test in isolation without code from cleaner.
Executing fixed runner now.
Test being executed: org.apache.zeppelin.dep.DependencyResolverTest.testDelRepo
java.lang.AssertionError: expected:<1> but was:<2>
  at org.junit.Assert.fail(Assert.java:88)
  ...

[INFO] Applying code from cleaner and recompiling.
Trying to compile: DependencyResolverTest.java
Compiling succeeded with 0 errors.
Successfully compiled at: Thu Dec 13 14:58:16 PST 2018

[INFO] Running victim test in isolation with code from cleaner.
Executing fixed runner now.
Test being executed: org.apache.zeppelin.dep.DependencyResolverTest.testDelRepo

[INFO] Fix was successful! 
Fixed file: /Users/winglam/tmp/zeppelin/zeppelin-interpreter/target/test-classes/org/apache/zeppelin/dep/DependencyResolverTest.java
```