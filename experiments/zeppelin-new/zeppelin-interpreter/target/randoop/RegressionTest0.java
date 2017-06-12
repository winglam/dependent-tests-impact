
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext0 = org.apache.zeppelin.interpreter.InterpreterContext.get();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterContext0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.tabledata.InterpreterResultTableData interpreterResultTableData1 = new org.apache.zeppelin.tabledata.InterpreterResultTableData(interpreterResultMessage0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.Interpreter.RegisteredInterpreter> map_str_registeredInterpreter0 = null;
    org.apache.zeppelin.interpreter.Interpreter.registeredInterpreters = map_str_registeredInterpreter0;

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    org.sonatype.aether.RepositorySystem repositorySystem0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.sonatype.aether.RepositorySystemSession repositorySystemSession2 = org.apache.zeppelin.dep.Booter.newRepositorySystemSession(repositorySystem0, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.Constants.ZEPPELIN_INTERPRETER_PORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "zeppelin.interpreter.port"+ "'", str0.equals("zeppelin.interpreter.port"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.InterpreterHookRegistry.HookType.POST_EXEC_DEV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "post_exec_dev"+ "'", str0.equals("post_exec_dev"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    int i0 = org.apache.zeppelin.interpreter.Constants.ZEPPELIN_INTERPRETER_OUTPUT_LIMIT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 102400);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils.getInterpreterSettingId("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    int i0 = org.apache.zeppelin.interpreter.InterpreterOutput.limit;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 102400);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource3 = linkedlist_resource1.element();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.Interpreter.logger = logger0;

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    org.apache.zeppelin.completer.CompletionType completionType0 = org.apache.zeppelin.completer.CompletionType.schema;
    org.junit.Assert.assertTrue("'" + completionType0 + "' != '" + org.apache.zeppelin.completer.CompletionType.schema + "'", completionType0.equals(org.apache.zeppelin.completer.CompletionType.schema));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    org.apache.zeppelin.resource.ResourcePool resourcePool0 = null;
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader2 = new org.apache.zeppelin.helium.ApplicationLoader(resourcePool0, dependencyResolver1);
    org.apache.zeppelin.helium.HeliumType heliumType3 = null;
    java.lang.String[][] str_array_array8 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = new org.apache.zeppelin.helium.HeliumPackage(heliumType3, "", "", "hi!", "hi!", str_array_array8, "post_exec_dev", "post_exec_dev");
    java.lang.String str12 = heliumPackage11.getArtifact();
    java.lang.String str13 = heliumPackage11.getGroupId();
    org.apache.zeppelin.helium.ApplicationContext applicationContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.Application application15 = applicationLoader2.load(heliumPackage11, applicationContext14);
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.helium.ApplicationException");
    } catch (org.apache.zeppelin.helium.ApplicationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    java.lang.Object obj1 = org.apache.zeppelin.resource.Resource.deserializeObject(byteBuffer0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    org.apache.zeppelin.dep.Booter booter0 = new org.apache.zeppelin.dep.Booter();

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = null;
    org.apache.zeppelin.interpreter.InterpreterResult.Type type1 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult3 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, type1, "[null]");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    org.sonatype.aether.repository.RemoteRepository remoteRepository0 = org.apache.zeppelin.dep.Booter.newLocalRepository();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(remoteRepository0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.InterpreterHookRegistry.GLOBAL_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "_GLOBAL_"+ "'", str0.equals("_GLOBAL_"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.ResultMessages.EXCEEDS_LIMIT_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"+ "'", str0.equals("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    org.apache.zeppelin.interpreter.InterpreterException interpreterException1 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.interpreter.InterpreterException interpreterException2 = new org.apache.zeppelin.interpreter.InterpreterException((java.lang.Throwable)interpreterException1);
    java.lang.Throwable[] throwable_array3 = interpreterException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo2 = new org.apache.zeppelin.user.AuthenticationInfo("_GLOBAL_", "_GLOBAL_");

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    org.apache.zeppelin.completer.CompletionType completionType0 = org.apache.zeppelin.completer.CompletionType.command;
    org.junit.Assert.assertTrue("'" + completionType0 + "' != '" + org.apache.zeppelin.completer.CompletionType.command + "'", completionType0.equals(org.apache.zeppelin.completer.CompletionType.command));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo0 = new org.apache.zeppelin.user.AuthenticationInfo();
    org.apache.zeppelin.user.UserCredentials userCredentials1 = null;
    authenticationInfo0.setUserCredentials(userCredentials1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.InterpreterHookRegistry.HookType.PRE_EXEC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "pre_exec"+ "'", str0.equals("pre_exec"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    // The following exception was thrown during execution in test generation
    try {
    java.util.ListIterator<org.apache.zeppelin.resource.Resource> listiterator_resource4 = resourceSet0.listIterator((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactInstalling(repositoryEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    boolean b1 = org.apache.zeppelin.helium.HeliumPackage.isBundleType(heliumType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.InterpreterHookRegistry.HookType.PRE_EXEC_DEV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "pre_exec_dev"+ "'", str0.equals("pre_exec_dev"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    long long0 = org.apache.zeppelin.scheduler.JobProgressPoller.DEFAULT_INTERVAL_MSEC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 500L);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    org.apache.zeppelin.resource.Resource resource0 = null;
    org.apache.zeppelin.tabledata.ProxyRowIterator proxyRowIterator1 = new org.apache.zeppelin.tabledata.ProxyRowIterator(resource0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b2 = proxyRowIterator1.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.zeppelin.display.AngularObject>> map_str_map_str_angularObject3 = null;
    // The following exception was thrown during execution in test generation
    try {
    angularObjectRegistry2.setRegistry(map_str_map_str_angularObject3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    org.apache.zeppelin.completer.CompletionType completionType0 = org.apache.zeppelin.completer.CompletionType.table;
    org.junit.Assert.assertTrue("'" + completionType0 + "' != '" + org.apache.zeppelin.completer.CompletionType.table + "'", completionType0.equals(org.apache.zeppelin.completer.CompletionType.table));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    byte[] byte_array7 = new byte[] { (byte)1, (byte)0, (byte)1, (byte)10, (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    int i10 = byteBufferInputStream1.read(byte_array7, (int)' ', (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataResolving(repositoryEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    org.apache.zeppelin.interpreter.Interpreter interpreter0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.LazyOpenInterpreter lazyOpenInterpreter1 = new org.apache.zeppelin.interpreter.LazyOpenInterpreter(interpreter0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    org.apache.zeppelin.completer.CompletionType completionType0 = org.apache.zeppelin.completer.CompletionType.setting;
    org.junit.Assert.assertTrue("'" + completionType0 + "' != '" + org.apache.zeppelin.completer.CompletionType.setting + "'", completionType0.equals(org.apache.zeppelin.completer.CompletionType.setting));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils remoteInterpreterUtils0 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils();

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataInstalled(repositoryEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource7 = resourceSet6.element();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    org.apache.zeppelin.completer.CompletionType completionType0 = org.apache.zeppelin.completer.CompletionType.path;
    org.junit.Assert.assertTrue("'" + completionType0 + "' != '" + org.apache.zeppelin.completer.CompletionType.path + "'", completionType0.equals(org.apache.zeppelin.completer.CompletionType.path));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    org.apache.zeppelin.tabledata.ColumnDef.TYPE tYPE0 = org.apache.zeppelin.tabledata.ColumnDef.TYPE.STRING;
    org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.zeppelin.tabledata.ColumnDef.TYPE.STRING + "'", tYPE0.equals(org.apache.zeppelin.tabledata.ColumnDef.TYPE.STRING));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactDownloaded(repositoryEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.InterpreterOption.SHARED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "shared"+ "'", str0.equals("shared"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource10 = linkedlist_resource1.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo11 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i12 = linkedlist_resource1.indexOf((java.lang.Object)authenticationInfo11);
    org.apache.zeppelin.user.UserCredentials userCredentials13 = authenticationInfo11.getUserCredentials();
    java.lang.String str14 = authenticationInfo11.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userCredentials13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "zeppelin.interpreter.port"+ "'", str14.equals("zeppelin.interpreter.port"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    org.apache.zeppelin.interpreter.InterpreterException interpreterException1 = new org.apache.zeppelin.interpreter.InterpreterException("");
    java.lang.Throwable[] throwable_array2 = interpreterException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array2);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.Object obj37 = gUI19.input("_GLOBAL_");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj37 + "' != '" + ""+ "'", obj37.equals(""));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.Constants.ZEPPELIN_INTERPRETER_HOST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "zeppelin.interpreter.host"+ "'", str0.equals("zeppelin.interpreter.host"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input1 = org.apache.zeppelin.display.Input.extractSimpleQueryForm("_GLOBAL_");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    int i0 = java.lang.Thread.MIN_PRIORITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.InterpreterOption.ISOLATED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isolated"+ "'", str0.equals("isolated"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    // The following exception was thrown during execution in test generation
    try {
    byteBufferInputStream1.reset();
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    org.apache.zeppelin.completer.CompletionType completionType0 = org.apache.zeppelin.completer.CompletionType.column;
    org.junit.Assert.assertTrue("'" + completionType0 + "' != '" + org.apache.zeppelin.completer.CompletionType.column + "'", completionType0.equals(org.apache.zeppelin.completer.CompletionType.column));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    angularObjectRegistry2.removeAll("_GLOBAL_", "[null]");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    org.apache.zeppelin.interpreter.InterpreterHookRegistry.HookType hookType0 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry.HookType();

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    boolean b11 = linkedlist_resource1.contains((java.lang.Object)(-1));
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource1.offerLast(resource12);
    int i14 = linkedlist_resource1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.ResultMessages.EXCEEDS_LIMIT_ROWS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>"+ "'", str0.equals("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    org.apache.zeppelin.interpreter.InterpreterContext.remove();

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input1 = org.apache.zeppelin.display.Input.extractSimpleQueryForm("org.apache.zeppelin.interpreter.InterpreterException: ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input1);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory0 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    java.util.concurrent.ExecutorService executorService2 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener3 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler4 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService2, schedulerListener3);
    org.apache.zeppelin.scheduler.Job job5 = null;
    // The following exception was thrown during execution in test generation
    try {
    schedulerFactory0.jobFinished((org.apache.zeppelin.scheduler.Scheduler)fIFOScheduler4, job5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterException interpreterException2 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.helium.ApplicationException applicationException3 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)interpreterException2);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource5.add(resource12);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code14 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array15 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage16 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage16, interpreterResultMessage_array15);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult18 = new org.apache.zeppelin.interpreter.InterpreterResult(code14, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage16);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code19 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array20 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage21 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21, interpreterResultMessage_array20);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult23 = new org.apache.zeppelin.interpreter.InterpreterResult(code19, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code24 = interpreterResult23.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage25 = interpreterResult23.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code26 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array27 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage28 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28, interpreterResultMessage_array27);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult30 = new org.apache.zeppelin.interpreter.InterpreterResult(code26, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code31 = interpreterResult30.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage32 = interpreterResult30.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code33 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array34 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage35 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage35, interpreterResultMessage_array34);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult37 = new org.apache.zeppelin.interpreter.InterpreterResult(code33, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage35);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code38 = interpreterResult37.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage39 = interpreterResult37.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code40 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array41 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage42 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage42, interpreterResultMessage_array41);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult44 = new org.apache.zeppelin.interpreter.InterpreterResult(code40, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage42);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code45 = interpreterResult44.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage46 = interpreterResult44.message();
    java.util.List[] list_array48 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array49 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array48;
    list_interpreterResultMessage_array49[0] = arraylist_interpreterResultMessage16;
    list_interpreterResultMessage_array49[1] = list_interpreterResultMessage25;
    list_interpreterResultMessage_array49[2] = list_interpreterResultMessage32;
    list_interpreterResultMessage_array49[3] = list_interpreterResultMessage39;
    list_interpreterResultMessage_array49[4] = list_interpreterResultMessage46;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array60 = linkedlist_resource5.toArray(list_interpreterResultMessage_array49);
    org.apache.zeppelin.resource.Resource resource61 = null;
    boolean b62 = linkedlist_resource5.offerFirst(resource61);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource63 = linkedlist_resource5.iterator();
    boolean b64 = interpreterGroup0.remove((java.lang.Object)applicationException3, (java.lang.Object)linkedlist_resource5);
    org.apache.zeppelin.resource.Resource resource65 = null;
    linkedlist_resource5.addFirst(resource65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.io.InputStream inputStream1 = org.apache.zeppelin.resource.ByteBufferInputStream.get(byteBuffer0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    interpreterResultMessageOutput2.flush();
    byte[] byte_array7 = new byte[] { (byte)1, (byte)1, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    interpreterResultMessageOutput2.write(byte_array7, (-1), 102400);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    org.apache.zeppelin.interpreter.ResultMessages resultMessages0 = new org.apache.zeppelin.interpreter.ResultMessages();

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    org.sonatype.aether.repository.RemoteRepository remoteRepository0 = org.apache.zeppelin.dep.Booter.newCentralRepository();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(remoteRepository0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    org.apache.zeppelin.resource.ResourcePoolUtils.removeResourcesBelongsToNote("");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    linkedlist_resource1.addLast(resource8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource11 = linkedlist_resource1.get((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    java.util.Map<java.lang.String,java.lang.Object> map_str_obj0 = null;
    java.lang.String str2 = org.apache.zeppelin.display.Input.getSimpleQuery(map_str_obj0, "pre_exec_dev");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "pre_exec_dev"+ "'", str2.equals("pre_exec_dev"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    byte[] byte_array5 = new byte[] { (byte)1, (byte)100 };
    // The following exception was thrown during execution in test generation
    try {
    interpreterResultMessageOutput2.write(byte_array5, (int)'#', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage4 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = interpreterResultMessageOutput2.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage4);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    org.apache.zeppelin.resource.Resource resource7 = resourceSet4.pollFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource7);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    boolean b2 = org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils.checkIfRemoteEndpointAccessible("zeppelin.interpreter.port", (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.Constants.EXISTING_PROCESS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "existing_process"+ "'", str0.equals("existing_process"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterHookRegistry12.addRepl("hi!", "InterpreterGroup_1497134350938_711831855");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input1 = org.apache.zeppelin.display.Input.extractSimpleQueryForm("InterpreterGroup_1497134361094_1261121192");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input1);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterProperty> map_str_interpreterProperty3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.Interpreter.register("InterpreterGroup_1497134361189_-653890590", "{}", "isolated", map_str_interpreterProperty3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    org.apache.zeppelin.dep.TransferListener transferListener0 = new org.apache.zeppelin.dep.TransferListener();
    org.sonatype.aether.transfer.TransferEvent transferEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    transferListener0.transferProgressed(transferEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    org.apache.zeppelin.helium.ApplicationException applicationException1 = new org.apache.zeppelin.helium.ApplicationException("shared");

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    org.apache.zeppelin.resource.Resource resource0 = null;
    org.apache.zeppelin.tabledata.ProxyRowIterator proxyRowIterator1 = new org.apache.zeppelin.tabledata.ProxyRowIterator(resource0);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.tabledata.Row row2 = proxyRowIterator1.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    java.lang.Object[] obj_array7 = resourceSet6.toArray();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource8 = resourceSet6.removeLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.Resource resource4 = null;
    resourceSet0.add((int)(byte)0, resource4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    select11.setHidden(false);
    select11.setHidden(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    java.util.Map<java.lang.String,java.lang.Object> map_str_obj0 = null;
    java.lang.String str2 = org.apache.zeppelin.display.Input.getSimpleQuery(map_str_obj0, "anonymous");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "anonymous"+ "'", str2.equals("anonymous"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    org.apache.zeppelin.interpreter.InterpreterOutput.limit = (-1);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    org.apache.zeppelin.interpreter.Interpreter interpreter0 = null;
    java.lang.ClassLoader classLoader1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.ClassloaderInterpreter classloaderInterpreter2 = new org.apache.zeppelin.interpreter.ClassloaderInterpreter(interpreter0, classLoader1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    org.apache.zeppelin.display.ui.TextBox textBox2 = new org.apache.zeppelin.display.ui.TextBox("", "[null]");
    java.lang.String str3 = textBox2.getDefaultValue();
    java.lang.String str4 = textBox2.getDefaultValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[null]"+ "'", str3.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[null]"+ "'", str4.equals("[null]"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    org.apache.zeppelin.resource.LocalResourcePool localResourcePool1 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.Resource resource3 = localResourcePool1.remove("InterpreterGroup_1497134350790_986318210");
    org.apache.zeppelin.helium.HeliumType heliumType5 = null;
    java.lang.String[][] str_array_array10 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage13 = new org.apache.zeppelin.helium.HeliumPackage(heliumType5, "", "", "hi!", "hi!", str_array_array10, "post_exec_dev", "post_exec_dev");
    java.lang.String str14 = heliumPackage13.getArtifact();
    org.apache.zeppelin.helium.SpellPackageInfo spellPackageInfo15 = heliumPackage13.getSpellInfo();
    // The following exception was thrown during execution in test generation
    try {
    localResourcePool1.put("InterpreterGroup_1497134353138_86992792", (java.lang.Object)spellPackageInfo15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(spellPackageInfo15);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.perNoteShared();
    boolean b3 = interpreterOption1.perUserScoped();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    org.apache.zeppelin.dep.TransferListener transferListener0 = new org.apache.zeppelin.dep.TransferListener();
    org.sonatype.aether.transfer.TransferEvent transferEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    transferListener0.transferCorrupted(transferEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = interpreterGroup0.getInterpreterHookRegistry();
    interpreterGroup0.close("");
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry4 = interpreterGroup0.getAngularObjectRegistry();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry4);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("");

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = interpreterResultMessage3.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type4);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool0 = new org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool();
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource8 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource8, resource_array7);
    org.apache.zeppelin.resource.Resource[] resource_array10 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource11 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource11, resource_array10);
    boolean b13 = arraylist_resource11.isEmpty();
    boolean b14 = linkedlist_resource8.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource11);
    org.apache.zeppelin.resource.Resource resource15 = null;
    boolean b16 = linkedlist_resource8.add(resource15);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource17 = linkedlist_resource8.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo18 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i19 = linkedlist_resource8.indexOf((java.lang.Object)authenticationInfo18);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj20 = null;
    org.apache.zeppelin.display.GUI gUI21 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener23 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry24 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener23);
    org.apache.zeppelin.display.AngularObject angularObject29 = angularObjectRegistry24.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool31 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array32 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner33 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner33, interpreterContextRunner_array32);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput35 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController36 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext37 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo18, map_str_obj20, gUI21, angularObjectRegistry24, (org.apache.zeppelin.resource.ResourcePool)localResourcePool31, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner33, interpreterOutput35, remoteWorksController36);
    interpreterContextRunnerPool0.addAll("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner33);
    // The following exception was thrown during execution in test generation
    try {
    interpreterContextRunnerPool0.run("InterpreterGroup_1497134361189_-653890590", "zeppelin.interpreter.host");
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.interpreter.InterpreterException");
    } catch (org.apache.zeppelin.interpreter.InterpreterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.ResultMessages.EXCEEDS_LIMIT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>"+ "'", str0.equals("<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    org.apache.zeppelin.resource.ResourcePool resourcePool0 = null;
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader2 = new org.apache.zeppelin.helium.ApplicationLoader(resourcePool0, dependencyResolver1);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage3 = null;
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener8 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry9 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener8);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry12 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry9, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject14 = heliumAppAngularObjectRegistry12.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput15 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext16 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry12, interpreterOutput15);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry17 = applicationContext16.getAngularObjectRegistry();
    java.lang.String str18 = applicationContext16.getNoteId();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.Application application19 = applicationLoader2.load(heliumPackage3, applicationContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(heliumAppAngularObjectRegistry17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "InterpreterGroup_1497134353138_86992792"+ "'", str18.equals("InterpreterGroup_1497134353138_86992792"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource3 = resourceSet2.getFirst();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    org.apache.zeppelin.resource.ResourcePool resourcePool0 = null;
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader2 = new org.apache.zeppelin.helium.ApplicationLoader(resourcePool0, dependencyResolver1);
    org.apache.zeppelin.helium.HeliumType heliumType3 = null;
    java.lang.String[][] str_array_array8 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = new org.apache.zeppelin.helium.HeliumPackage(heliumType3, "", "", "hi!", "hi!", str_array_array8, "post_exec_dev", "post_exec_dev");
    java.lang.String str12 = heliumPackage11.getDescription();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener17 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry18 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener17);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry21 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry18, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject23 = heliumAppAngularObjectRegistry21.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput24 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext25 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry21, interpreterOutput24);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.Application application26 = applicationLoader2.load(heliumPackage11, applicationContext25);
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.helium.ApplicationException");
    } catch (org.apache.zeppelin.helium.ApplicationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject23);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    org.apache.zeppelin.display.RuntimeTypeAdapterFactory runtimeTypeAdapterFactory0 = org.apache.zeppelin.display.Input.TypeAdapterFactory;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(runtimeTypeAdapterFactory0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    boolean b2 = byteBufferInputStream1.markSupported();
    byteBufferInputStream1.close();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener5 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput6 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type4, interpreterResultMessageOutputListener5);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage7 = interpreterResultMessageOutput6.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage8 = interpreterResultMessageOutput6.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener9 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput10 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener9);
    interpreterOutput10.addResourceSearchPath("isolated");
    byte[] byte_array13 = interpreterOutput10.toByteArray();
    interpreterResultMessageOutput6.write(byte_array13);
    // The following exception was thrown during execution in test generation
    try {
    int i17 = byteBufferInputStream1.read(byte_array13, (int)(byte)1, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    boolean b13 = linkedlist_resource2.removeFirstOccurrence((java.lang.Object)(short)1);
    java.lang.Object[] obj_array14 = linkedlist_resource2.toArray();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code15 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array16 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage17 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17, interpreterResultMessage_array16);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code15, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    boolean b20 = linkedlist_resource2.removeAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource21 = linkedlist_resource2.element();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    org.apache.zeppelin.display.ui.TextBox textBox2 = org.apache.zeppelin.display.Input.textbox("", "InterpreterGroup_1497134350790_986318210");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBox2);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    org.apache.zeppelin.dep.TransferListener transferListener0 = new org.apache.zeppelin.dep.TransferListener();
    org.sonatype.aether.transfer.TransferEvent transferEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    transferListener0.transferFailed(transferEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    org.apache.zeppelin.resource.ResourceId resourceId0 = null;
    java.lang.Class class2 = null;
    java.lang.Class[] class_array3 = new java.lang.Class[] { class2 };
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource5.add(resource12);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource14 = linkedlist_resource5.iterator();
    java.lang.String str15 = linkedlist_resource5.toString();
    java.lang.Object[] obj_array16 = linkedlist_resource5.toArray();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage invokeResourceMethodEventMessage18 = new org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage(resourceId0, "existing_process", class_array3, obj_array16, "zeppelin.interpreter.host");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[null]"+ "'", str15.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory0 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.Scheduler scheduler1 = null;
    org.apache.zeppelin.scheduler.Job job2 = null;
    // The following exception was thrown during execution in test generation
    try {
    schedulerFactory0.jobStarted(scheduler1, job2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    select11.setDisplayName("[null]");
    java.lang.String str14 = select11.getArgument();
    select11.setArgument("InterpreterGroup_1497134350790_986318210");
    select11.setDisplayName("InterpreterGroup_1497134350938_711831855");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "post_exec_dev", "", "zeppelin.interpreter.host", "{}", "InterpreterGroup_1497134350790_986318210" };
    java.lang.String[] str_array9 = null;
    java.lang.String[] str_array11 = org.apache.zeppelin.display.Input.splitPipe("1");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String[] str_array13 = org.apache.zeppelin.display.Input.split("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", '4', str_array8, str_array9, str_array11, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    boolean b13 = linkedlist_resource2.removeFirstOccurrence((java.lang.Object)(short)1);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type14 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener15 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput16 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type14, interpreterResultMessageOutputListener15);
    interpreterResultMessageOutput16.flush();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type18 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener19 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput20 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type18, interpreterResultMessageOutputListener19);
    java.lang.String[] str_array23 = new java.lang.String[] { "zeppelin.interpreter.port", "_GLOBAL_" };
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array23);
    interpreterResultMessageOutput20.setResourceSearchPaths((java.util.List<java.lang.String>)arraylist_str24);
    interpreterResultMessageOutput16.setResourceSearchPaths((java.util.List<java.lang.String>)arraylist_str24);
    boolean b28 = linkedlist_resource2.containsAll((java.util.Collection<java.lang.String>)arraylist_str24);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource29 = linkedlist_resource2.getFirst();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory0 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService3 = executorFactory0.createOrGet("pre_exec_dev", 0);
    executorFactory0.shutdown("existing_process");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService3);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    int i0 = java.lang.Thread.MAX_PRIORITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type3 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput2.setType(type3);
    java.io.File file5 = null;
    interpreterResultMessageOutput2.write(file5);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type3.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    org.apache.zeppelin.resource.LocalResourcePool localResourcePool1 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = localResourcePool1.getAll();
    org.apache.zeppelin.resource.Resource resource3 = resourceSet2.poll();
    org.apache.zeppelin.resource.ResourceSet resourceSet5 = resourceSet2.filterByNameRegex("isolated");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet5);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    org.apache.zeppelin.tabledata.TableDataException tableDataException1 = new org.apache.zeppelin.tabledata.TableDataException("{}");
    java.lang.String str2 = org.apache.zeppelin.interpreter.InterpreterUtils.getMostRelevantMessage((java.lang.Exception)tableDataException1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataDeployed(repositoryEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    boolean b2 = byteBufferInputStream1.markSupported();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = byteBufferInputStream1.skip((long)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    org.apache.zeppelin.display.ui.CheckBox checkBox0 = new org.apache.zeppelin.display.ui.CheckBox();
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array1 = checkBox0.getOptions();
    java.lang.Object[] obj_array2 = checkBox0.getDefaultValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paramOption_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj_array2);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloaded(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactInstalling(repositoryEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str1 = interpreterGroup0.getId();
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = interpreterGroup0.getAngularObjectRegistry();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "InterpreterGroup_1497134369176_-1878842789"+ "'", str1.equals("InterpreterGroup_1497134369176_-1878842789"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry2);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloaded(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataResolved(repositoryEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    org.apache.zeppelin.helium.Application application0 = null;
    java.lang.ClassLoader classLoader1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.ClassLoaderApplication classLoaderApplication2 = new org.apache.zeppelin.helium.ClassLoaderApplication(application0, classLoader1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource12 = linkedlist_resource2.element();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloaded(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataInstalling(repositoryEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    linkedlist_resource1.clear();
    java.lang.Object obj9 = linkedlist_resource1.clone();
    org.apache.zeppelin.scheduler.FIFOScheduler[] fIFOScheduler_array10 = new org.apache.zeppelin.scheduler.FIFOScheduler[] {  };
    org.apache.zeppelin.scheduler.FIFOScheduler[] fIFOScheduler_array11 = linkedlist_resource1.toArray(fIFOScheduler_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fIFOScheduler_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fIFOScheduler_array11);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess6 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory7 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler9 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService4, "pre_exec_dev", remoteInterpreterProcess6, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory7, (int)(short)1);
    org.apache.zeppelin.scheduler.Job job10 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteScheduler9.submit(job10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    boolean b2 = org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils.checkIfRemoteEndpointAccessible("InterpreterGroup_1497134369176_-1878842789", (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    byte[] byte_array2 = new byte[] {  };
    // The following exception was thrown during execution in test generation
    try {
    int i5 = byteBufferInputStream1.read(byte_array2, (int)(byte)1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterException interpreterException2 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.helium.ApplicationException applicationException3 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)interpreterException2);
    boolean b4 = interpreterGroup0.containsKey((java.lang.Object)applicationException3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.perNoteShared();
    boolean b3 = interpreterOption1.perUserIsolated();
    boolean b4 = interpreterOption1.perUserScoped();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    org.apache.zeppelin.interpreter.Interpreter.RegisteredInterpreter registeredInterpreter0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.Interpreter.register(registeredInterpreter0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    int i2 = byteBufferInputStream1.available();
    byte[] byte_array8 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)0, (byte)100 };
    // The following exception was thrown during execution in test generation
    try {
    int i9 = byteBufferInputStream1.read(byte_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code10 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array11 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage12 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12, interpreterResultMessage_array11);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult14 = new org.apache.zeppelin.interpreter.InterpreterResult(code10, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code15 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array16 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage17 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17, interpreterResultMessage_array16);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code15, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code20 = interpreterResult19.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage21 = interpreterResult19.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code22 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array23 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage24 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage24, interpreterResultMessage_array23);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult26 = new org.apache.zeppelin.interpreter.InterpreterResult(code22, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage24);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code27 = interpreterResult26.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage28 = interpreterResult26.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code29 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array30 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage31, interpreterResultMessage_array30);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult33 = new org.apache.zeppelin.interpreter.InterpreterResult(code29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage31);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code34 = interpreterResult33.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage35 = interpreterResult33.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code36 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array37 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage38 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage38, interpreterResultMessage_array37);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult40 = new org.apache.zeppelin.interpreter.InterpreterResult(code36, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage38);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code41 = interpreterResult40.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage42 = interpreterResult40.message();
    java.util.List[] list_array44 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array45 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array44;
    list_interpreterResultMessage_array45[0] = arraylist_interpreterResultMessage12;
    list_interpreterResultMessage_array45[1] = list_interpreterResultMessage21;
    list_interpreterResultMessage_array45[2] = list_interpreterResultMessage28;
    list_interpreterResultMessage_array45[3] = list_interpreterResultMessage35;
    list_interpreterResultMessage_array45[4] = list_interpreterResultMessage42;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array56 = linkedlist_resource1.toArray(list_interpreterResultMessage_array45);
    org.apache.zeppelin.resource.Resource resource57 = null;
    boolean b58 = linkedlist_resource1.offerFirst(resource57);
    org.apache.zeppelin.resource.Resource resource59 = linkedlist_resource1.pop();
    org.apache.zeppelin.resource.Resource resource60 = linkedlist_resource1.pop();
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource61 = linkedlist_resource1.descendingIterator();
    org.apache.zeppelin.resource.Resource resource62 = null;
    linkedlist_resource1.push(resource62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource61);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.isUserImpersonate();
    boolean b3 = interpreterOption1.perUserShared();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("1");
    dependencyContext1.reset();
    java.util.List<java.io.File> list_file3 = dependencyContext1.getFilesDist();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file3);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = org.apache.zeppelin.helium.HeliumType.INTERPRETER;
    boolean b1 = org.apache.zeppelin.helium.HeliumPackage.isBundleType(heliumType0);
    org.junit.Assert.assertTrue("'" + heliumType0 + "' != '" + org.apache.zeppelin.helium.HeliumType.INTERPRETER + "'", heliumType0.equals(org.apache.zeppelin.helium.HeliumType.INTERPRETER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    org.apache.zeppelin.scheduler.Job job0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.scheduler.JobProgressPoller jobProgressPoller2 = new org.apache.zeppelin.scheduler.JobProgressPoller(job0, (long)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    boolean b2 = byteBufferInputStream1.markSupported();
    byte[] byte_array6 = new byte[] { (byte)10, (byte)-1, (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    int i9 = byteBufferInputStream1.read(byte_array6, (int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry5 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry2, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject7 = heliumAppAngularObjectRegistry5.get("");
    org.apache.zeppelin.display.AngularObject angularObject9 = heliumAppAngularObjectRegistry5.remove("InterpreterGroup_1497134367518_-1467696533");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject9);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    select11.setDisplayName("[null]");
    select11.setArgument("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource10 = linkedlist_resource1.iterator();
    java.lang.Object obj11 = linkedlist_resource1.clone();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource13 = linkedlist_resource1.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource10 = linkedlist_resource1.iterator();
    org.apache.zeppelin.resource.Resource resource11 = linkedlist_resource1.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource11);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input1 = org.apache.zeppelin.display.Input.extractSimpleQueryForm("shared");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input1);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.flush();
    interpreterOutput1.write((int)(short)-1);
    interpreterOutput1.flush();

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener2 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput3 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener2);
    interpreterOutput3.addResourceSearchPath("isolated");
    byte[] byte_array6 = interpreterOutput3.toByteArray();
    // The following exception was thrown during execution in test generation
    try {
    interpreterOutputStream1.write(byte_array6, (int)(byte)10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    interpreterOption6.setUserImpersonate(false);
    boolean b11 = interpreterOption6.perNoteIsolated();
    interpreterOption6.setRemote(false);
    boolean b14 = interpreterOption6.permissionIsSet();
    interpreterOption6.setHost("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    org.sonatype.aether.RepositorySystem repositorySystem0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.sonatype.aether.RepositorySystemSession repositorySystemSession2 = org.apache.zeppelin.dep.Booter.newRepositorySystemSession(repositorySystem0, "existing_process");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    java.lang.Long long0 = org.apache.zeppelin.interpreter.remote.AppendOutputRunner.BUFFER_TIME_MS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long0 + "' != '" + 100L+ "'", long0.equals(100L));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    boolean b2 = byteBufferInputStream1.markSupported();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type3 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener4 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput5 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type3, interpreterResultMessageOutputListener4);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage6 = interpreterResultMessageOutput5.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage7 = interpreterResultMessageOutput5.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener8 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput9 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener8);
    interpreterOutput9.addResourceSearchPath("isolated");
    byte[] byte_array12 = interpreterOutput9.toByteArray();
    interpreterResultMessageOutput5.write(byte_array12);
    // The following exception was thrown during execution in test generation
    try {
    int i14 = byteBufferInputStream1.read(byte_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener2 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput3 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type1, interpreterResultMessageOutputListener2);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput3.setType(type4);
    angularobject_outputStream0.set((java.io.OutputStream)interpreterResultMessageOutput3);
    angularobject_outputStream0.emit();
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type4.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    java.lang.String[] str_array25 = new java.lang.String[] { "anonymous", "hi!", "zeppelin.interpreter.port", "InterpreterGroup_1497134350790_986318210", "post_exec_dev", "_GLOBAL_", "existing_process", "existing_process", "zeppelin.interpreter.host", "pre_exec_dev", "InterpreterGroup_1497134350790_986318210", "pre_exec_dev", "pre_exec", "pre_exec_dev", "isolated", "pre_exec", "shared", "_GLOBAL_", "[null]", "existing_process" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    boolean b28 = resourceSet4.removeAll((java.util.Collection<java.lang.String>)arraylist_str26);
    resourceSet4.clear();
    org.apache.zeppelin.resource.ResourceSet resourceSet31 = resourceSet4.filterByParagraphId("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    boolean b32 = resourceSet4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE;
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup1 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry2 = interpreterGroup1.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource4 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource4, resource_array3);
    org.apache.zeppelin.resource.Resource[] resource_array6 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource7 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource7, resource_array6);
    boolean b9 = arraylist_resource7.isEmpty();
    boolean b10 = linkedlist_resource4.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource7);
    linkedlist_resource4.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter12 = interpreterGroup1.get((java.lang.Object)linkedlist_resource4);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type13 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter14 = interpreterGroup1.get((java.lang.Object)type13);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult16 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, type13, "shared");
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener17 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput18 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type13, interpreterResultMessageOutputListener17);
    org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE + "'", code0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter12);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type13.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter14);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterException interpreterException2 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.helium.ApplicationException applicationException3 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)interpreterException2);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource5.add(resource12);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code14 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array15 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage16 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage16, interpreterResultMessage_array15);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult18 = new org.apache.zeppelin.interpreter.InterpreterResult(code14, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage16);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code19 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array20 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage21 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21, interpreterResultMessage_array20);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult23 = new org.apache.zeppelin.interpreter.InterpreterResult(code19, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code24 = interpreterResult23.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage25 = interpreterResult23.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code26 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array27 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage28 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28, interpreterResultMessage_array27);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult30 = new org.apache.zeppelin.interpreter.InterpreterResult(code26, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code31 = interpreterResult30.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage32 = interpreterResult30.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code33 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array34 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage35 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage35, interpreterResultMessage_array34);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult37 = new org.apache.zeppelin.interpreter.InterpreterResult(code33, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage35);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code38 = interpreterResult37.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage39 = interpreterResult37.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code40 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array41 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage42 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage42, interpreterResultMessage_array41);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult44 = new org.apache.zeppelin.interpreter.InterpreterResult(code40, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage42);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code45 = interpreterResult44.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage46 = interpreterResult44.message();
    java.util.List[] list_array48 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array49 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array48;
    list_interpreterResultMessage_array49[0] = arraylist_interpreterResultMessage16;
    list_interpreterResultMessage_array49[1] = list_interpreterResultMessage25;
    list_interpreterResultMessage_array49[2] = list_interpreterResultMessage32;
    list_interpreterResultMessage_array49[3] = list_interpreterResultMessage39;
    list_interpreterResultMessage_array49[4] = list_interpreterResultMessage46;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array60 = linkedlist_resource5.toArray(list_interpreterResultMessage_array49);
    org.apache.zeppelin.resource.Resource resource61 = null;
    boolean b62 = linkedlist_resource5.offerFirst(resource61);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource63 = linkedlist_resource5.iterator();
    boolean b64 = interpreterGroup0.remove((java.lang.Object)applicationException3, (java.lang.Object)linkedlist_resource5);
    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory65 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService68 = executorFactory65.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup69 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool70 = interpreterGroup69.getResourcePool();
    boolean b73 = interpreterGroup69.remove((java.lang.Object)0L, (java.lang.Object)'a');
    boolean b74 = interpreterGroup0.remove((java.lang.Object)0, (java.lang.Object)b73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    boolean b3 = interpreterOption2.perNoteShared();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption4 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption2);
    interpreterOption4.setUserPermission(false);
    interpreterOption4.setUserImpersonate(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption4);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource4 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource4, resource_array3);
    org.apache.zeppelin.resource.Resource[] resource_array6 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource7 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource7, resource_array6);
    boolean b9 = arraylist_resource7.isEmpty();
    boolean b10 = linkedlist_resource4.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource7);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption11 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array12 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption11 };
    org.apache.zeppelin.display.ui.Select select13 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource4, paramOption_array12);
    org.apache.zeppelin.display.ui.Select select14 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array12);
    java.lang.String str15 = select14.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "zeppelin.interpreter.port"+ "'", str15.equals("zeppelin.interpreter.port"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.Object obj38 = gUI19.textbox("", "zeppelin.interpreter.host");
    gUI19.convertOldInput();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj40 = gUI19.getParams();
    java.lang.String str42 = org.apache.zeppelin.display.Input.getSimpleQuery(map_str_obj40, "InterpreterGroup_1497134367518_-1467696533");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "zeppelin.interpreter.host"+ "'", obj38.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "InterpreterGroup_1497134367518_-1467696533"+ "'", str42.equals("InterpreterGroup_1497134367518_-1467696533"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    org.apache.zeppelin.user.UsernamePassword usernamePassword2 = new org.apache.zeppelin.user.UsernamePassword("InterpreterGroup_1497134353138_86992792", "zeppelin.interpreter.host");
    java.lang.String str3 = usernamePassword2.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "InterpreterGroup_1497134353138_86992792"+ "'", str3.equals("InterpreterGroup_1497134353138_86992792"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    org.apache.zeppelin.resource.Resource[] resource_array11 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource12 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource12, resource_array11);
    org.apache.zeppelin.resource.Resource[] resource_array14 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource15 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15, resource_array14);
    boolean b17 = arraylist_resource15.isEmpty();
    boolean b18 = linkedlist_resource12.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15);
    org.apache.zeppelin.resource.Resource resource19 = null;
    boolean b20 = linkedlist_resource12.add(resource19);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource21 = linkedlist_resource12.iterator();
    java.lang.Object obj22 = linkedlist_resource12.clone();
    org.apache.zeppelin.resource.Resource resource23 = linkedlist_resource12.getLast();
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = linkedlist_resource1.addAll(4, (java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource12);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource23);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput2 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0, interpreterOutputChangeListener1);
    interpreterOutput2.writeResource("");

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource4 = resourceSet2.remove((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = org.apache.zeppelin.helium.HeliumType.SPELL;
    org.junit.Assert.assertTrue("'" + heliumType0 + "' != '" + org.apache.zeppelin.helium.HeliumType.SPELL + "'", heliumType0.equals(org.apache.zeppelin.helium.HeliumType.SPELL));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.resource.Resource[] resource_array9 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource10 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource10, resource_array9);
    org.apache.zeppelin.resource.Resource[] resource_array12 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource13 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource13, resource_array12);
    boolean b15 = arraylist_resource13.isEmpty();
    boolean b16 = linkedlist_resource10.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource13);
    org.apache.zeppelin.resource.Resource resource17 = null;
    boolean b18 = linkedlist_resource10.add(resource17);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code19 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array20 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage21 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21, interpreterResultMessage_array20);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult23 = new org.apache.zeppelin.interpreter.InterpreterResult(code19, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code24 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array25 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage26 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage26, interpreterResultMessage_array25);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult28 = new org.apache.zeppelin.interpreter.InterpreterResult(code24, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage26);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code29 = interpreterResult28.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage30 = interpreterResult28.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code31 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array32 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage33 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage33, interpreterResultMessage_array32);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult35 = new org.apache.zeppelin.interpreter.InterpreterResult(code31, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage33);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code36 = interpreterResult35.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage37 = interpreterResult35.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code38 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array39 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage40 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage40, interpreterResultMessage_array39);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult42 = new org.apache.zeppelin.interpreter.InterpreterResult(code38, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage40);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code43 = interpreterResult42.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage44 = interpreterResult42.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code45 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array46 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage47 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage47, interpreterResultMessage_array46);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult49 = new org.apache.zeppelin.interpreter.InterpreterResult(code45, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage47);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code50 = interpreterResult49.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage51 = interpreterResult49.message();
    java.util.List[] list_array53 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array54 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array53;
    list_interpreterResultMessage_array54[0] = arraylist_interpreterResultMessage21;
    list_interpreterResultMessage_array54[1] = list_interpreterResultMessage30;
    list_interpreterResultMessage_array54[2] = list_interpreterResultMessage37;
    list_interpreterResultMessage_array54[3] = list_interpreterResultMessage44;
    list_interpreterResultMessage_array54[4] = list_interpreterResultMessage51;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array65 = linkedlist_resource10.toArray(list_interpreterResultMessage_array54);
    org.apache.zeppelin.resource.Resource resource66 = null;
    boolean b67 = linkedlist_resource10.offerFirst(resource66);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource68 = linkedlist_resource10.iterator();
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource69 = linkedlist_resource10.descendingIterator();
    org.apache.zeppelin.resource.Resource resource70 = linkedlist_resource10.remove();
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource71 = linkedlist_resource10.iterator();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter72 = interpreterGroup0.remove((java.lang.Object)linkedlist_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter72);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    org.apache.zeppelin.helium.SpellPackageInfo spellPackageInfo0 = new org.apache.zeppelin.helium.SpellPackageInfo();
    java.lang.String str1 = spellPackageInfo0.getMagic();
    java.lang.String str2 = spellPackageInfo0.getMagic();
    java.lang.String str3 = spellPackageInfo0.getMagic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    org.apache.zeppelin.scheduler.Job job0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.scheduler.JobProgressPoller jobProgressPoller2 = new org.apache.zeppelin.scheduler.JobProgressPoller(job0, (long)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    org.apache.zeppelin.completer.StringsCompleter stringsCompleter0 = new org.apache.zeppelin.completer.StringsCompleter();

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("1");
    java.util.List<java.io.File> list_file2 = dependencyContext1.fetch();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file2);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    org.apache.zeppelin.resource.Resource[] resource_array6 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource7 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource7, resource_array6);
    org.apache.zeppelin.resource.Resource[] resource_array9 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource10 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource10, resource_array9);
    boolean b12 = arraylist_resource10.isEmpty();
    boolean b13 = linkedlist_resource7.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource10);
    org.apache.zeppelin.resource.Resource resource14 = null;
    boolean b15 = linkedlist_resource7.add(resource14);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource16 = linkedlist_resource7.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo17 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i18 = linkedlist_resource7.indexOf((java.lang.Object)authenticationInfo17);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj19 = null;
    org.apache.zeppelin.display.GUI gUI20 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener22 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry23 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener22);
    org.apache.zeppelin.display.AngularObject angularObject28 = angularObjectRegistry23.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool30 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array31 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner32 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner32, interpreterContextRunner_array31);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput34 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController35 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext36 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo17, map_str_obj19, gUI20, angularObjectRegistry23, (org.apache.zeppelin.resource.ResourcePool)localResourcePool30, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner32, interpreterOutput34, remoteWorksController35);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry37 = interpreterContext36.getAngularObjectRegistry();
    java.lang.String str38 = interpreterContext36.getParagraphTitle();
    org.apache.zeppelin.display.GUI gUI39 = interpreterContext36.getGui();
    java.lang.String str40 = interpreterContext36.getParagraphText();
    org.apache.zeppelin.resource.Resource[] resource_array42 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource43 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource43, resource_array42);
    org.apache.zeppelin.resource.Resource[] resource_array45 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource46 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource46, resource_array45);
    boolean b48 = arraylist_resource46.isEmpty();
    boolean b49 = linkedlist_resource43.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource46);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption50 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array51 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption50 };
    org.apache.zeppelin.display.ui.Select select52 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource43, paramOption_array51);
    org.apache.zeppelin.display.ui.Select select53 = org.apache.zeppelin.display.Input.select("InterpreterGroup_1497134371990_1999798592", (java.lang.Object)str40, paramOption_array51);
    select53.setArgument("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "pre_exec_dev"+ "'", str38.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gUI39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[null]"+ "'", str40.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select53);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory2 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client3 = clientFactory2.create();
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.interpreter.InterpreterException");
    } catch (org.apache.zeppelin.interpreter.InterpreterException e) {
      // Expected exception.
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    org.apache.zeppelin.display.ui.TextBox textBox2 = org.apache.zeppelin.display.Input.textbox("InterpreterGroup_1497134350790_986318210", "InterpreterGroup_1497134361094_1261121192");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBox2);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.Object obj38 = gUI19.textbox("", "zeppelin.interpreter.host");
    gUI19.convertOldInput();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj40 = gUI19.getParams();
    java.lang.Object obj42 = gUI19.textbox("anonymous");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "zeppelin.interpreter.host"+ "'", obj38.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + ""+ "'", obj42.equals(""));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup1 = org.apache.zeppelin.interpreter.InterpreterGroup.getByInterpreterGroupId("InterpreterGroup_1497134368135_304166951");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterGroup1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    java.util.concurrent.ExecutorService executorService1 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener2 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler3 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService1, schedulerListener2);
    org.apache.zeppelin.scheduler.Job job4 = null;
    // The following exception was thrown during execution in test generation
    try {
    fIFOScheduler3.submit(job4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("zeppelin.interpreter.host");
    interpreterHookRegistry1.unregister("{}", "zeppelin.repl.result", "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>");

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    org.apache.zeppelin.display.GUI gUI5 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input6 = gUI5.getForms();
    java.lang.Object obj9 = gUI5.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    boolean b10 = interpreterProperty4.equals(obj9);
    interpreterProperty4.setPropertyName("existing_process");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "1"+ "'", obj9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    org.apache.zeppelin.display.GUI gUI0 = new org.apache.zeppelin.display.GUI();
    java.lang.Object obj3 = gUI0.textbox("InterpreterGroup_1497134350790_986318210", "InterpreterGroup_1497134367518_-1467696533");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "InterpreterGroup_1497134367518_-1467696533"+ "'", obj3.equals("InterpreterGroup_1497134367518_-1467696533"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataResolved(repositoryEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    org.apache.zeppelin.resource.ResourcePool resourcePool0 = null;
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader2 = new org.apache.zeppelin.helium.ApplicationLoader(resourcePool0, dependencyResolver1);
    org.apache.zeppelin.helium.HeliumType heliumType3 = null;
    java.lang.String[][] str_array_array8 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = new org.apache.zeppelin.helium.HeliumPackage(heliumType3, "", "", "hi!", "hi!", str_array_array8, "post_exec_dev", "post_exec_dev");
    java.lang.String str12 = heliumPackage11.getArtifact();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener20 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry21 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener20);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry24 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry21, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject26 = heliumAppAngularObjectRegistry24.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput27 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext28 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry24, interpreterOutput27);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener29 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener30 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput31 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener29, interpreterOutputChangeListener30);
    org.apache.zeppelin.helium.ApplicationContext applicationContext32 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry24, interpreterOutput31);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry33 = applicationContext32.getAngularObjectRegistry();
    java.lang.String str34 = applicationContext32.getParagraphId();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.Application application35 = applicationLoader2.load(heliumPackage11, applicationContext32);
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.helium.ApplicationException");
    } catch (org.apache.zeppelin.helium.ApplicationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(heliumAppAngularObjectRegistry33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "InterpreterGroup_1497134350938_711831855"+ "'", str34.equals("InterpreterGroup_1497134350938_711831855"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    org.apache.zeppelin.resource.LocalResourcePool localResourcePool1 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.Resource resource3 = localResourcePool1.get("pre_exec_dev");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource3);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption1.setPort(10);
    boolean b5 = interpreterOption1.perUserShared();
    boolean b6 = interpreterOption1.isSession();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    org.apache.zeppelin.interpreter.InterpreterUtils interpreterUtils0 = new org.apache.zeppelin.interpreter.InterpreterUtils();

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool0 = new org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool();
    // The following exception was thrown during execution in test generation
    try {
    interpreterContextRunnerPool0.run("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "zeppelin.interpreter.host");
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.interpreter.InterpreterException");
    } catch (org.apache.zeppelin.interpreter.InterpreterException e) {
      // Expected exception.
    }

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage4 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    java.net.URL uRL5 = null;
    interpreterResultMessageOutput2.write(uRL5);
    // The following exception was thrown during execution in test generation
    try {
    interpreterResultMessageOutput2.writeResource("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage4);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener2 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput3 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type1, interpreterResultMessageOutputListener2);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput3.setType(type4);
    angularobject_outputStream0.set((java.io.OutputStream)interpreterResultMessageOutput3);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type7 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener8 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput9 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type7, interpreterResultMessageOutputListener8);
    interpreterResultMessageOutput9.flush();
    boolean b11 = interpreterResultMessageOutput9.isAppendSupported();
    java.net.URL uRL12 = null;
    interpreterResultMessageOutput9.write(uRL12);
    java.lang.String[] str_array19 = new java.lang.String[] { "isolated", "InterpreterGroup_1497134361189_-653890590", "_GLOBAL_", "isolated", "1" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    interpreterResultMessageOutput9.setResourceSearchPaths((java.util.List<java.lang.String>)arraylist_str20);
    // The following exception was thrown during execution in test generation
    try {
    angularobject_outputStream0.set((java.io.OutputStream)interpreterResultMessageOutput9, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type4.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.InterpreterOption.SCOPED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "scoped"+ "'", str0.equals("scoped"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    org.apache.zeppelin.display.GUI gUI0 = new org.apache.zeppelin.display.GUI();
    java.lang.Object obj2 = gUI0.input("pre_exec_dev");
    gUI0.convertOldInput();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + ""+ "'", obj2.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    org.apache.zeppelin.resource.ResourcePoolUtils resourcePoolUtils0 = new org.apache.zeppelin.resource.ResourcePoolUtils();

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getArtifact();
    java.lang.String str10 = heliumPackage8.getGroupId();
    java.lang.String str11 = heliumPackage8.getClassName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array1 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage2 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage2, interpreterResultMessage_array1);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult4 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage2);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code5 = interpreterResult4.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage6 = interpreterResult4.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type7 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener8 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput9 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type7, interpreterResultMessageOutputListener8);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage10 = interpreterResultMessageOutput9.toInterpreterResultMessage();
    interpreterResult4.add(interpreterResultMessage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage10);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption2.setHost("[null]");
    boolean b5 = interpreterOption2.perUserScoped();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    int i2 = byteBufferInputStream1.available();
    byteBufferInputStream1.mark((int)'4');
    byte[] byte_array9 = new byte[] { (byte)0, (byte)100, (byte)10, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    int i10 = byteBufferInputStream1.read(byte_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.flush();
    interpreterOutput1.write((int)(short)-1);
    int i5 = interpreterOutput1.size();
    java.net.URL uRL6 = null;
    interpreterOutput1.write(uRL6);
    java.io.File file8 = null;
    interpreterOutput1.write(file8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    linkedlist_resource1.addLast(resource8);
    org.apache.zeppelin.resource.Resource[] resource_array10 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource11 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource11, resource_array10);
    boolean b13 = arraylist_resource11.isEmpty();
    boolean b14 = arraylist_resource11.isEmpty();
    boolean b15 = linkedlist_resource1.removeLastOccurrence((java.lang.Object)b14);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.resource.Resource> list_resource18 = linkedlist_resource1.subList((int)'4', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    java.lang.String[] str_array1 = org.apache.zeppelin.display.Input.splitPipe("[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterGroup> map_str_interpreterGroup5 = null;
    interpreterGroup0.close(map_str_interpreterGroup5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption10 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b11 = interpreterOption10.perNoteShared();
    boolean b12 = interpreterGroup0.containsKey((java.lang.Object)interpreterOption10);
    interpreterOption10.setUserPermission(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = org.apache.zeppelin.helium.HeliumType.VISUALIZATION;
    org.junit.Assert.assertTrue("'" + heliumType0 + "' != '" + org.apache.zeppelin.helium.HeliumType.VISUALIZATION + "'", heliumType0.equals(org.apache.zeppelin.helium.HeliumType.VISUALIZATION));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    org.apache.zeppelin.user.Credentials credentials2 = new org.apache.zeppelin.user.Credentials((java.lang.Boolean)true, "InterpreterGroup_1497134368135_304166951");
    org.apache.zeppelin.user.UserCredentials userCredentials4 = null;
    credentials2.putUserCredentials("_GLOBAL_", userCredentials4);
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = credentials2.removeCredentialEntity("{}", "InterpreterGroup_1497134361189_-653890590");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption2.setHost("[null]");
    interpreterOption2.setPerNote("InterpreterGroup_1497134350938_711831855");
    interpreterOption2.setUserPermission(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    boolean b11 = linkedlist_resource1.contains((java.lang.Object)(-1));
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource1.offerLast(resource12);
    org.apache.zeppelin.resource.Resource[] resource_array15 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource16 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16, resource_array15);
    org.apache.zeppelin.resource.Resource[] resource_array18 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource19 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19, resource_array18);
    boolean b21 = arraylist_resource19.isEmpty();
    boolean b22 = linkedlist_resource16.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19);
    org.apache.zeppelin.resource.Resource resource23 = null;
    boolean b24 = linkedlist_resource16.add(resource23);
    boolean b26 = linkedlist_resource16.contains((java.lang.Object)(-1));
    boolean b27 = linkedlist_resource1.addAll(1, (java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16);
    org.apache.zeppelin.resource.Resource resource28 = null;
    boolean b29 = linkedlist_resource16.offerLast(resource28);
    org.apache.zeppelin.resource.ResourceSet resourceSet30 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet32 = resourceSet30.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet34 = resourceSet30.filterByNoteId("_GLOBAL_");
    org.apache.zeppelin.resource.Resource resource35 = null;
    boolean b36 = resourceSet34.offerLast(resource35);
    boolean b37 = linkedlist_resource16.equals((java.lang.Object)resourceSet34);
    org.apache.zeppelin.resource.Resource resource38 = linkedlist_resource16.peekFirst();
    org.apache.zeppelin.resource.Resource resource39 = linkedlist_resource16.remove();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource39);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory0 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.Scheduler scheduler3 = schedulerFactory0.createOrGetParallelScheduler("shared", (int)(short)0);
    java.util.concurrent.ExecutorService executorService5 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener6 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler7 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService5, schedulerListener6);
    org.apache.zeppelin.scheduler.Job job9 = fIFOScheduler7.removeFromWaitingQueue("shared");
    org.apache.zeppelin.scheduler.Job job10 = null;
    // The following exception was thrown during execution in test generation
    try {
    schedulerFactory0.jobStarted((org.apache.zeppelin.scheduler.Scheduler)fIFOScheduler7, job10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job9);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    java.lang.String str37 = interpreterContext35.getClassName();
    java.lang.String str38 = interpreterContext35.getParagraphTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "pre_exec_dev"+ "'", str38.equals("pre_exec_dev"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory0 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService2 = executorFactory0.createOrGet("hi!");
    // The following exception was thrown during execution in test generation
    try {
    executorFactory0.shutdownAll();
      org.junit.Assert.fail("Expected exception of type java.util.ConcurrentModificationException");
    } catch (java.util.ConcurrentModificationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService2);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataInstalling(repositoryEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    boolean b3 = interpreterOption2.perNoteShared();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption4 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption2);
    java.util.List<java.lang.String> list_str5 = interpreterOption4.getUsers();
    boolean b6 = interpreterOption4.perUserShared();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getArtifact();
    java.lang.String str10 = heliumPackage8.getGroupId();
    java.lang.String str11 = heliumPackage8.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup0 = org.apache.zeppelin.interpreter.InterpreterGroup.getAll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    int i0 = java.lang.Thread.NORM_PRIORITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    java.util.concurrent.ExecutorService executorService1 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener2 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler3 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService1, schedulerListener2);
    fIFOScheduler3.stop();
    java.lang.String str5 = fIFOScheduler3.getName();
    org.apache.zeppelin.scheduler.Job job7 = fIFOScheduler3.removeFromWaitingQueue("post_exec_dev");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str5.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job7);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    org.apache.zeppelin.display.GUI gUI5 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input6 = gUI5.getForms();
    java.lang.Object obj9 = gUI5.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    boolean b10 = interpreterProperty4.equals(obj9);
    interpreterProperty4.setEnvName("<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>");
    interpreterProperty4.setPropertyName("_GLOBAL_");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "1"+ "'", obj9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.Object obj38 = gUI19.textbox("", "zeppelin.interpreter.host");
    org.apache.zeppelin.resource.Resource[] resource_array45 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource46 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource46, resource_array45);
    org.apache.zeppelin.resource.Resource[] resource_array48 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource49 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource49, resource_array48);
    boolean b51 = arraylist_resource49.isEmpty();
    boolean b52 = linkedlist_resource46.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource49);
    org.apache.zeppelin.resource.Resource resource53 = null;
    boolean b54 = linkedlist_resource46.add(resource53);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource55 = linkedlist_resource46.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo56 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i57 = linkedlist_resource46.indexOf((java.lang.Object)authenticationInfo56);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj58 = null;
    org.apache.zeppelin.display.GUI gUI59 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener61 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry62 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener61);
    org.apache.zeppelin.display.AngularObject angularObject67 = angularObjectRegistry62.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool69 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array70 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner71 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b72 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner71, interpreterContextRunner_array70);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput73 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController74 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext75 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo56, map_str_obj58, gUI59, angularObjectRegistry62, (org.apache.zeppelin.resource.ResourcePool)localResourcePool69, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner71, interpreterOutput73, remoteWorksController74);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext75);
    java.lang.String str77 = interpreterContext75.getReplName();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo78 = interpreterContext75.getAuthenticationInfo();
    java.lang.Object obj79 = gUI19.input("InterpreterGroup_1497134353138_86992792", (java.lang.Object)interpreterContext75);
    java.lang.Object obj82 = gUI19.textbox("InterpreterGroup_1497134369176_-1878842789", "existing_process");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "zeppelin.interpreter.host"+ "'", obj38.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str77.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj82 + "' != '" + "existing_process"+ "'", obj82.equals("existing_process"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    boolean b11 = linkedlist_resource1.contains((java.lang.Object)(-1));
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource1.offerLast(resource12);
    org.apache.zeppelin.resource.Resource[] resource_array15 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource16 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16, resource_array15);
    org.apache.zeppelin.resource.Resource[] resource_array18 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource19 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19, resource_array18);
    boolean b21 = arraylist_resource19.isEmpty();
    boolean b22 = linkedlist_resource16.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19);
    org.apache.zeppelin.resource.Resource resource23 = null;
    boolean b24 = linkedlist_resource16.add(resource23);
    boolean b26 = linkedlist_resource16.contains((java.lang.Object)(-1));
    boolean b27 = linkedlist_resource1.addAll(1, (java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16);
    org.apache.zeppelin.resource.Resource resource28 = null;
    boolean b29 = linkedlist_resource16.offerLast(resource28);
    org.apache.zeppelin.resource.ResourceSet resourceSet30 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet32 = resourceSet30.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet34 = resourceSet30.filterByNoteId("_GLOBAL_");
    org.apache.zeppelin.resource.Resource resource35 = null;
    boolean b36 = resourceSet34.offerLast(resource35);
    boolean b37 = linkedlist_resource16.equals((java.lang.Object)resourceSet34);
    org.apache.zeppelin.resource.Resource resource38 = resourceSet34.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource38);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    resourceSet6.clear();
    org.apache.zeppelin.resource.ResourceSet resourceSet8 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet10 = resourceSet8.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet12 = resourceSet10.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet14 = resourceSet12.filterByName("InterpreterGroup_1497134350938_711831855");
    java.lang.Object[] obj_array15 = resourceSet14.toArray();
    org.apache.zeppelin.resource.ResourceSet resourceSet17 = resourceSet14.filterByClassnameRegex("org.apache.zeppelin.interpreter.InterpreterException: ");
    boolean b18 = resourceSet6.contains((java.lang.Object)resourceSet17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    org.apache.zeppelin.interpreter.remote.AppendOutputBuffer appendOutputBuffer4 = new org.apache.zeppelin.interpreter.remote.AppendOutputBuffer("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>", (int)(byte)10, "pre_exec");
    int i5 = appendOutputBuffer4.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.flush();
    interpreterOutput1.write((int)(short)-1);
    int i5 = interpreterOutput1.size();
    java.net.URL uRL6 = null;
    interpreterOutput1.write(uRL6);
    interpreterOutput1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    java.util.concurrent.ExecutorService executorService1 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener2 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler3 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService1, schedulerListener2);
    org.apache.zeppelin.scheduler.Job job5 = fIFOScheduler3.removeFromWaitingQueue("shared");
    fIFOScheduler3.stop();
    java.lang.String str7 = fIFOScheduler3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str7.equals("org.apache.zeppelin.interpreter.InterpreterException: "));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess6 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory7 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler9 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService4, "pre_exec_dev", remoteInterpreterProcess6, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory7, (int)(short)1);
    remoteScheduler9.stop();
    org.apache.zeppelin.scheduler.Job job11 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteScheduler9.submit(job11);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory2 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client3 = null;
    // The following exception was thrown during execution in test generation
    try {
    clientFactory2.destroyObject(pooledobject_client3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo2 = new org.apache.zeppelin.user.AuthenticationInfo("anonymous", "org.apache.zeppelin.interpreter.InterpreterException: ");
    java.lang.String str3 = authenticationInfo2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "anonymous"+ "'", str3.equals("anonymous"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener7 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry8 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener7);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry11 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry8, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject13 = heliumAppAngularObjectRegistry11.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput14 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext15 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry11, interpreterOutput14);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener16 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener17 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput18 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener16, interpreterOutputChangeListener17);
    org.apache.zeppelin.helium.ApplicationContext applicationContext19 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry11, interpreterOutput18);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput20 = applicationContext19.out;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput21 = interpreterOutput20.getCurrentOutput();
    java.net.URL uRL22 = null;
    interpreterOutput20.write(uRL22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterResultMessageOutput21);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    java.lang.String str5 = interpreterProperty4.getDefaultValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage2 = org.apache.zeppelin.interpreter.ResultMessages.getExceedsLimitRowsMessage(1, "scoped");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage2);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input1 = org.apache.zeppelin.display.Input.extractSimpleQueryForm("isolated");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    org.apache.zeppelin.dep.TransferListener transferListener0 = new org.apache.zeppelin.dep.TransferListener();
    org.sonatype.aether.transfer.TransferEvent transferEvent1 = null;
    // The following exception was thrown during execution in test generation
    try {
    transferListener0.transferSucceeded(transferEvent1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    org.apache.zeppelin.interpreter.InterpreterOutput.limit = (short)100;

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterException interpreterException2 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.helium.ApplicationException applicationException3 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)interpreterException2);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource5.add(resource12);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code14 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array15 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage16 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage16, interpreterResultMessage_array15);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult18 = new org.apache.zeppelin.interpreter.InterpreterResult(code14, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage16);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code19 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array20 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage21 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21, interpreterResultMessage_array20);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult23 = new org.apache.zeppelin.interpreter.InterpreterResult(code19, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code24 = interpreterResult23.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage25 = interpreterResult23.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code26 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array27 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage28 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28, interpreterResultMessage_array27);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult30 = new org.apache.zeppelin.interpreter.InterpreterResult(code26, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code31 = interpreterResult30.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage32 = interpreterResult30.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code33 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array34 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage35 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage35, interpreterResultMessage_array34);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult37 = new org.apache.zeppelin.interpreter.InterpreterResult(code33, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage35);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code38 = interpreterResult37.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage39 = interpreterResult37.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code40 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array41 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage42 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage42, interpreterResultMessage_array41);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult44 = new org.apache.zeppelin.interpreter.InterpreterResult(code40, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage42);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code45 = interpreterResult44.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage46 = interpreterResult44.message();
    java.util.List[] list_array48 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array49 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array48;
    list_interpreterResultMessage_array49[0] = arraylist_interpreterResultMessage16;
    list_interpreterResultMessage_array49[1] = list_interpreterResultMessage25;
    list_interpreterResultMessage_array49[2] = list_interpreterResultMessage32;
    list_interpreterResultMessage_array49[3] = list_interpreterResultMessage39;
    list_interpreterResultMessage_array49[4] = list_interpreterResultMessage46;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array60 = linkedlist_resource5.toArray(list_interpreterResultMessage_array49);
    org.apache.zeppelin.resource.Resource resource61 = null;
    boolean b62 = linkedlist_resource5.offerFirst(resource61);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource63 = linkedlist_resource5.iterator();
    boolean b64 = interpreterGroup0.remove((java.lang.Object)applicationException3, (java.lang.Object)linkedlist_resource5);
    org.apache.zeppelin.resource.Resource resource65 = null;
    boolean b66 = linkedlist_resource5.add(resource65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    select11.setDisplayName("[null]");
    java.lang.String str14 = select11.getArgument();
    select11.setArgument("InterpreterGroup_1497134350790_986318210");
    java.lang.Object obj17 = select11.getDefaultValue();
    boolean b18 = select11.isHidden();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getArtifact();
    java.lang.String str10 = heliumPackage8.getArtifact();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    org.apache.zeppelin.tabledata.TableDataException tableDataException1 = new org.apache.zeppelin.tabledata.TableDataException("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    java.lang.String str2 = tableDataException1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.zeppelin.tabledata.TableDataException: <strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"+ "'", str2.equals("org.apache.zeppelin.tabledata.TableDataException: <strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry5 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry2, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject7 = heliumAppAngularObjectRegistry5.get("_GLOBAL_");
    org.apache.zeppelin.display.AngularObject angularObject9 = heliumAppAngularObjectRegistry5.get("InterpreterGroup_1497134350938_711831855");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject9);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    org.apache.zeppelin.resource.ResourceSet resourceSet8 = resourceSet6.filterByParagraphId("InterpreterGroup_1497134369176_-1878842789");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource9 = resourceSet8.getLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet8);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    java.lang.String[] str_array25 = new java.lang.String[] { "anonymous", "hi!", "zeppelin.interpreter.port", "InterpreterGroup_1497134350790_986318210", "post_exec_dev", "_GLOBAL_", "existing_process", "existing_process", "zeppelin.interpreter.host", "pre_exec_dev", "InterpreterGroup_1497134350790_986318210", "pre_exec_dev", "pre_exec", "pre_exec_dev", "isolated", "pre_exec", "shared", "_GLOBAL_", "[null]", "existing_process" };
    java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str26, str_array25);
    boolean b28 = resourceSet4.removeAll((java.util.Collection<java.lang.String>)arraylist_str26);
    resourceSet4.clear();
    org.apache.zeppelin.resource.ResourceSet resourceSet31 = resourceSet4.filterByName("{\"params\":{},\"forms\":{\"InterpreterGroup_1497134350790_986318210\":{\"type\":\"TextBox\",\"name\":\"InterpreterGroup_1497134350790_986318210\",\"displayName\":\"InterpreterGroup_1497134350790_986318210\",\"defaultValue\":\"1\",\"hidden\":false}}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet31);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("anonymous");

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactResolved(repositoryEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner2 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>", "AngularObject{noteId='null', paragraphId='null', object=null, name='null'}");

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloaded(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataInstalled(repositoryEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    java.lang.String str1 = org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils.getInterpreterSettingId("org.apache.zeppelin.interpreter.InterpreterException: ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException"+ "'", str1.equals("org.apache.zeppelin.interpreter.InterpreterException"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    boolean b13 = linkedlist_resource2.removeFirstOccurrence((java.lang.Object)(short)1);
    java.lang.Object[] obj_array14 = linkedlist_resource2.toArray();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code15 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array16 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage17 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17, interpreterResultMessage_array16);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code15, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    boolean b20 = linkedlist_resource2.removeAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    int i21 = linkedlist_resource2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    select11.setDisplayName("[null]");
    java.lang.String str14 = select11.getArgument();
    select11.setArgument("InterpreterGroup_1497134350790_986318210");
    boolean b17 = select11.isHidden();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    byte[] byte_array5 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream1.write(byte_array5, (int)'a', 3);
    interpreterOutputStream1.ignoreLeadingNewLinesFromScalaReporter();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput10 = interpreterOutputStream1.getInterpreterOutput();
    interpreterOutputStream1.write((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput10);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str1 = interpreterGroup0.getId();
    boolean b3 = interpreterGroup0.equals((java.lang.Object)0L);
    java.util.Collection<java.util.List<org.apache.zeppelin.interpreter.Interpreter>> collection_list_interpreter4 = interpreterGroup0.values();
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess5 = interpreterGroup0.getRemoteInterpreterProcess();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "InterpreterGroup_1497134377841_-315852627"+ "'", str1.equals("InterpreterGroup_1497134377841_-315852627"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_list_interpreter4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteInterpreterProcess5);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    org.apache.zeppelin.display.Input<org.apache.zeppelin.scheduler.FIFOScheduler> input_fIFOScheduler0 = new org.apache.zeppelin.display.Input<org.apache.zeppelin.scheduler.FIFOScheduler>();
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler1 = input_fIFOScheduler0.getDefaultValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(fIFOScheduler1);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    org.apache.zeppelin.completer.CompletionType completionType0 = org.apache.zeppelin.completer.CompletionType.keyword;
    org.junit.Assert.assertTrue("'" + completionType0 + "' != '" + org.apache.zeppelin.completer.CompletionType.keyword + "'", completionType0.equals(org.apache.zeppelin.completer.CompletionType.keyword));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    org.apache.zeppelin.resource.LocalResourcePool localResourcePool1 = new org.apache.zeppelin.resource.LocalResourcePool("InterpreterGroup_1497134377841_-315852627");

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    boolean b2 = org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils.checkIfRemoteEndpointAccessible("AngularObject{noteId='null', paragraphId='null', object=null, name='null'}", 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.display.GUI gUI38 = interpreterContext35.getGui();
    gUI38.convertOldInput();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gUI38);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult2 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "");
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = null;
    interpreterResult2.add(interpreterResultMessage3);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type5 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener6 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput7 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type5, interpreterResultMessageOutputListener6);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage8 = interpreterResultMessageOutput7.toInterpreterResultMessage();
    interpreterResult2.add(interpreterResultMessage8);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code10 = interpreterResult2.code();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code10);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    boolean b11 = linkedlist_resource1.contains((java.lang.Object)(-1));
    org.apache.zeppelin.resource.Resource resource12 = linkedlist_resource1.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource12);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    boolean b11 = linkedlist_resource1.contains((java.lang.Object)(-1));
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource1.offerLast(resource12);
    org.apache.zeppelin.resource.Resource[] resource_array15 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource16 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16, resource_array15);
    org.apache.zeppelin.resource.Resource[] resource_array18 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource19 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19, resource_array18);
    boolean b21 = arraylist_resource19.isEmpty();
    boolean b22 = linkedlist_resource16.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19);
    org.apache.zeppelin.resource.Resource resource23 = null;
    boolean b24 = linkedlist_resource16.add(resource23);
    boolean b26 = linkedlist_resource16.contains((java.lang.Object)(-1));
    boolean b27 = linkedlist_resource1.addAll(1, (java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16);
    org.apache.zeppelin.resource.Resource resource28 = null;
    boolean b29 = linkedlist_resource16.offerLast(resource28);
    java.lang.Object obj30 = linkedlist_resource16.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    select11.setDisplayName("[null]");
    java.lang.String str14 = select11.getDisplayName();
    java.lang.String str15 = select11.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[null]"+ "'", str14.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[null]"+ "'", str15.equals("[null]"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloaded(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactDescriptorInvalid(repositoryEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    org.apache.zeppelin.resource.WellKnownResourceName wellKnownResourceName0 = org.apache.zeppelin.resource.WellKnownResourceName.ZeppelinTableResult;
    org.junit.Assert.assertTrue("'" + wellKnownResourceName0 + "' != '" + org.apache.zeppelin.resource.WellKnownResourceName.ZeppelinTableResult + "'", wellKnownResourceName0.equals(org.apache.zeppelin.resource.WellKnownResourceName.ZeppelinTableResult));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.resource.Resource[] resource_array10 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource11 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource11, resource_array10);
    org.apache.zeppelin.resource.Resource[] resource_array13 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource14 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource14, resource_array13);
    boolean b16 = arraylist_resource14.isEmpty();
    boolean b17 = linkedlist_resource11.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource14);
    org.apache.zeppelin.resource.Resource resource18 = null;
    boolean b19 = linkedlist_resource11.add(resource18);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource20 = linkedlist_resource11.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo21 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i22 = linkedlist_resource11.indexOf((java.lang.Object)authenticationInfo21);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj23 = null;
    org.apache.zeppelin.display.GUI gUI24 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener26 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry27 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener26);
    org.apache.zeppelin.display.AngularObject angularObject32 = angularObjectRegistry27.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool34 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array35 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner36 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner36, interpreterContextRunner_array35);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput38 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController39 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext40 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo21, map_str_obj23, gUI24, angularObjectRegistry27, (org.apache.zeppelin.resource.ResourcePool)localResourcePool34, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner36, interpreterOutput38, remoteWorksController39);
    interpreterGroup0.setAngularObjectRegistry(angularObjectRegistry27);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup42 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool43 = interpreterGroup42.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry45 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup42.setInterpreterHookRegistry(interpreterHookRegistry45);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption48 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption49 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption48);
    boolean b50 = interpreterGroup42.contains((java.lang.Object)interpreterOption48);
    interpreterGroup0.putAll((java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.interpreter.Interpreter>>)interpreterGroup42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService3 = executorFactory1.createOrGet("hi!");
    java.util.concurrent.ExecutorService executorService5 = executorFactory1.createOrGet("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory6 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler7 = new org.apache.zeppelin.scheduler.FIFOScheduler("InterpreterGroup_1497134374771_373499119", executorService5, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory6);
    java.lang.String str8 = fIFOScheduler7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "InterpreterGroup_1497134374771_373499119"+ "'", str8.equals("InterpreterGroup_1497134374771_373499119"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    java.lang.String[] str_array1 = org.apache.zeppelin.display.Input.split("InterpreterGroup_1497134376850_-1874169858");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    org.apache.zeppelin.interpreter.InterpreterOutput.limit = (byte)1;

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    int i0 = org.apache.zeppelin.interpreter.Constants.ZEPPELIN_INTERPRETER_DEFAUlT_PORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 29914);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = org.apache.zeppelin.interpreter.InterpreterResult.Code.KEEP_PREVIOUS_RESULT;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult2 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "existing_process");
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult4 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "_GLOBAL_");
    org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.KEEP_PREVIOUS_RESULT + "'", code0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.KEEP_PREVIOUS_RESULT));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    org.apache.zeppelin.display.GUI gUI0 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input1 = gUI0.getForms();
    java.lang.Object obj4 = gUI0.textbox("InterpreterGroup_1497134371990_1999798592", "pre_exec");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "pre_exec"+ "'", obj4.equals("pre_exec"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    org.apache.zeppelin.user.CredentialsInfoSaving credentialsInfoSaving0 = new org.apache.zeppelin.user.CredentialsInfoSaving();
    java.util.Map<java.lang.String,org.apache.zeppelin.user.UserCredentials> map_str_userCredentials1 = credentialsInfoSaving0.credentialsMap;
    java.util.Map<java.lang.String,org.apache.zeppelin.user.UserCredentials> map_str_userCredentials2 = null;
    credentialsInfoSaving0.credentialsMap = map_str_userCredentials2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_userCredentials1);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    interpreterResultMessageOutput2.flush();
    boolean b4 = interpreterResultMessageOutput2.isAppendSupported();
    java.net.URL uRL5 = null;
    interpreterResultMessageOutput2.write(uRL5);
    interpreterResultMessageOutput2.flush();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getArtifact();
    java.lang.String str10 = heliumPackage8.getPublishedDate();
    java.lang.String[][] str_array_array11 = heliumPackage8.getResources();
    java.lang.String str12 = heliumPackage8.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "post_exec_dev"+ "'", str12.equals("post_exec_dev"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.close("InterpreterGroup_1497134367518_-1467696533");
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry17 = interpreterGroup0.getInterpreterHookRegistry();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterHookRegistry17);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    linkedlist_resource5.clear();
    org.apache.zeppelin.display.AngularObject angularObject16 = angularObjectRegistry2.add("_GLOBAL_", (java.lang.Object)linkedlist_resource5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.display.AngularObjectWatcher angularObjectWatcher17 = null;
    angularObject16.removeWatcher(angularObjectWatcher17);
    angularObject16.setParagraphId("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterResult.Type type21 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener22 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput23 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type21, interpreterResultMessageOutputListener22);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage24 = interpreterResultMessageOutput23.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage25 = interpreterResultMessageOutput23.toInterpreterResultMessage();
    java.net.URL uRL26 = null;
    interpreterResultMessageOutput23.write(uRL26);
    // The following exception was thrown during execution in test generation
    try {
    angularObject16.set((java.io.OutputStream)interpreterResultMessageOutput23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage25);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = interpreterGroup0.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array2 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource3 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource3, resource_array2);
    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource6 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource6, resource_array5);
    boolean b8 = arraylist_resource6.isEmpty();
    boolean b9 = linkedlist_resource3.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource6);
    linkedlist_resource3.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter11 = interpreterGroup0.get((java.lang.Object)linkedlist_resource3);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type12 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter13 = interpreterGroup0.get((java.lang.Object)type12);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess14 = null;
    interpreterGroup0.setRemoteInterpreterProcess(remoteInterpreterProcess14);
    java.lang.String str16 = interpreterGroup0.getId();
    int i17 = interpreterGroup0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type12.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "InterpreterGroup_1497134384512_-890338748"+ "'", str16.equals("InterpreterGroup_1497134384512_-890338748"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    byte[] byte_array5 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream1.write(byte_array5, (int)'a', 3);
    interpreterOutputStream1.ignoreLeadingNewLinesFromScalaReporter();
    interpreterOutputStream1.ignoreLeadingNewLinesFromScalaReporter();
    int i11 = interpreterOutputStream1.getMessageLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 999);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array1 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage2 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage2, interpreterResultMessage_array1);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult4 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage2);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type5 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    interpreterResult4.add(type5, "InterpreterGroup_1497134353138_86992792");
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage8 = null;
    interpreterResult4.add(interpreterResultMessage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type5.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService3 = executorFactory1.createOrGet("hi!");
    java.util.concurrent.ExecutorService executorService5 = executorFactory1.createOrGet("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory6 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler7 = new org.apache.zeppelin.scheduler.FIFOScheduler("InterpreterGroup_1497134374771_373499119", executorService5, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory6);
    java.util.concurrent.ExecutorService executorService9 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener10 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler11 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService9, schedulerListener10);
    fIFOScheduler11.stop();
    org.apache.zeppelin.scheduler.Job job13 = null;
    // The following exception was thrown during execution in test generation
    try {
    schedulerFactory6.jobFinished((org.apache.zeppelin.scheduler.Scheduler)fIFOScheduler11, job13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService5);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    interpreterOption6.setUserImpersonate(false);
    boolean b11 = interpreterOption6.perNoteIsolated();
    interpreterOption6.setRemote(false);
    interpreterOption6.setPerUser("isolated");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo1 = new org.apache.zeppelin.user.AuthenticationInfo("InterpreterGroup_1497134350938_711831855");

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    org.apache.zeppelin.display.GUI gUI5 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input6 = gUI5.getForms();
    java.lang.Object obj9 = gUI5.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    boolean b10 = interpreterProperty4.equals(obj9);
    java.lang.String str11 = interpreterProperty4.getDefaultValue();
    java.lang.String str12 = interpreterProperty4.getDescription();
    java.lang.String str13 = interpreterProperty4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "1"+ "'", obj9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}"+ "'", str11.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "anonymous"+ "'", str12.equals("anonymous"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{envName=zeppelin.interpreter.port, propertyName=<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>, defaultValue={}, description=           anonymous}"+ "'", str13.equals("{envName=zeppelin.interpreter.port, propertyName=<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>, defaultValue={}, description=           anonymous}"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.String str36 = authenticationInfo16.getTicket();
    authenticationInfo16.setUser("InterpreterGroup_1497134384596_204399223");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "anonymous"+ "'", str36.equals("anonymous"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataInstalling(repositoryEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage4 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup5 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry6 = interpreterGroup5.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource8 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource8, resource_array7);
    org.apache.zeppelin.resource.Resource[] resource_array10 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource11 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource11, resource_array10);
    boolean b13 = arraylist_resource11.isEmpty();
    boolean b14 = linkedlist_resource8.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource11);
    linkedlist_resource8.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter16 = interpreterGroup5.get((java.lang.Object)linkedlist_resource8);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type17 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter18 = interpreterGroup5.get((java.lang.Object)type17);
    interpreterResultMessageOutput2.setType(type17);
    interpreterResultMessageOutput2.write("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type17.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter18);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("hi!");
    java.net.URL uRL2 = null;
    // The following exception was thrown during execution in test generation
    try {
    dependencyResolver1.setProxy(uRL2, "{\"params\":{},\"forms\":{\"InterpreterGroup_1497134350790_986318210\":{\"type\":\"TextBox\",\"name\":\"InterpreterGroup_1497134350790_986318210\",\"displayName\":\"InterpreterGroup_1497134350790_986318210\",\"defaultValue\":\"1\",\"hidden\":false}}}", "InterpreterGroup_1497134379014_-1019571993");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    // The following exception was thrown during execution in test generation
    try {
    int i2 = byteBufferInputStream1.read();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.flush();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code3 = org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE;
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup4 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry5 = interpreterGroup4.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array6 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource7 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource7, resource_array6);
    org.apache.zeppelin.resource.Resource[] resource_array9 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource10 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource10, resource_array9);
    boolean b12 = arraylist_resource10.isEmpty();
    boolean b13 = linkedlist_resource7.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource10);
    linkedlist_resource7.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter15 = interpreterGroup4.get((java.lang.Object)linkedlist_resource7);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type16 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter17 = interpreterGroup4.get((java.lang.Object)type16);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code3, type16, "shared");
    org.apache.zeppelin.interpreter.InterpreterResult.Code code20 = org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE;
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup21 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry22 = interpreterGroup21.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array23 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource24 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource24, resource_array23);
    org.apache.zeppelin.resource.Resource[] resource_array26 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource27 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource27, resource_array26);
    boolean b29 = arraylist_resource27.isEmpty();
    boolean b30 = linkedlist_resource24.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource27);
    linkedlist_resource24.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter32 = interpreterGroup21.get((java.lang.Object)linkedlist_resource24);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type33 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter34 = interpreterGroup21.get((java.lang.Object)type33);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult36 = new org.apache.zeppelin.interpreter.InterpreterResult(code20, type33, "shared");
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult38 = new org.apache.zeppelin.interpreter.InterpreterResult(code3, type33, "InterpreterGroup_1497134367518_-1467696533");
    interpreterOutput1.setType(type33);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener40 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput41 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener40);
    interpreterOutput41.addResourceSearchPath("isolated");
    byte[] byte_array44 = interpreterOutput41.toByteArray();
    interpreterOutput1.write(byte_array44);
    org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE + "'", code3.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter15);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type16.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter17);
    org.junit.Assert.assertTrue("'" + code20 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE + "'", code20.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter32);
    org.junit.Assert.assertTrue("'" + type33 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type33.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    interpreterResultMessageOutput2.flush();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = interpreterResultMessageOutput2.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    byte[] byte_array5 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream1.write(byte_array5, (int)'a', 3);
    org.slf4j.Logger logger9 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream10 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger9);
    byte[] byte_array14 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream10.write(byte_array14, (int)'a', 3);
    interpreterOutputStream1.write(byte_array14, (int)(short)10, 10);
    interpreterOutputStream1.flush();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    org.apache.zeppelin.display.ui.TextBox textBox0 = new org.apache.zeppelin.display.ui.TextBox();

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.Object obj38 = gUI19.textbox("", "zeppelin.interpreter.host");
    gUI19.convertOldInput();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input40 = gUI19.getForms();
    gUI19.convertOldInput();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "zeppelin.interpreter.host"+ "'", obj38.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input40);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    byte[] byte_array5 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream1.write(byte_array5, (int)'a', 3);
    interpreterOutputStream1.ignoreLeadingNewLinesFromScalaReporter();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput10 = interpreterOutputStream1.getInterpreterOutput();
    interpreterOutputStream1.write((int)(short)1);
    interpreterOutputStream1.write(100);
    interpreterOutputStream1.ignoreLeadingNewLinesFromScalaReporter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput10);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo2 = new org.apache.zeppelin.user.AuthenticationInfo("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134350790_986318210");

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory5 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.Scheduler scheduler7 = schedulerFactory5.createOrGetFIFOScheduler("InterpreterGroup_1497134361189_-653890590");
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler8 = new org.apache.zeppelin.scheduler.FIFOScheduler("hi!", executorService4, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory5);
    org.apache.zeppelin.scheduler.Job job10 = fIFOScheduler8.removeFromWaitingQueue("AngularObject{noteId='<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>', paragraphId='pre_exec', object=[], name='_GLOBAL_'}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job10);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    boolean b13 = linkedlist_resource2.removeFirstOccurrence((java.lang.Object)(short)1);
    java.lang.Object[] obj_array14 = linkedlist_resource2.toArray();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code15 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array16 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage17 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17, interpreterResultMessage_array16);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code15, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    boolean b20 = linkedlist_resource2.removeAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    org.apache.zeppelin.resource.ResourceSet resourceSet22 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet24 = resourceSet22.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet26 = resourceSet24.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.interpreter.InterpreterResult.Code code27 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult28 = new org.apache.zeppelin.interpreter.InterpreterResult(code27);
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage29 = interpreterResult28.message();
    boolean b30 = resourceSet24.removeAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)list_interpreterResultMessage29);
    java.util.ListIterator<org.apache.zeppelin.resource.Resource> listiterator_resource31 = resourceSet24.listIterator();
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = linkedlist_resource2.addAll((int)(short)10, (java.util.Collection<org.apache.zeppelin.resource.Resource>)resourceSet24);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_resource31);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    org.slf4j.Logger logger0 = org.apache.zeppelin.interpreter.Interpreter.logger;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logger0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = interpreterResultMessage3.getType();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage3);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type4.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    int i0 = org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils.findRandomAvailablePortOnAllLocalInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 59683);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.perNoteShared();
    interpreterOption1.setUserPermission(false);
    int i5 = interpreterOption1.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    java.lang.String str39 = interpreterContext35.getParagraphTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "pre_exec_dev"+ "'", str39.equals("pre_exec_dev"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.display.GUI gUI38 = interpreterContext35.getGui();
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController39 = null;
    interpreterContext35.setRemoteWorksController(remoteWorksController39);
    interpreterContext35.setClassName("InterpreterGroup_1497134379014_-1019571993");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gUI38);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    java.util.Set<java.lang.String> set_str15 = interpreterGroup0.keySet();
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry16 = interpreterGroup0.getAngularObjectRegistry();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry16);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    org.apache.zeppelin.helium.SpellPackageInfo spellPackageInfo0 = new org.apache.zeppelin.helium.SpellPackageInfo();
    java.lang.String str1 = spellPackageInfo0.getMagic();
    java.lang.String str2 = spellPackageInfo0.getMagic();
    java.lang.String str3 = spellPackageInfo0.getUsage();
    java.lang.String str4 = spellPackageInfo0.getMagic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    org.apache.zeppelin.interpreter.remote.AppendOutputBuffer appendOutputBuffer4 = new org.apache.zeppelin.interpreter.remote.AppendOutputBuffer("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>", (int)(byte)10, "pre_exec");
    java.lang.String str5 = appendOutputBuffer4.getData();
    java.lang.String str6 = appendOutputBuffer4.getNoteId();
    java.lang.String str7 = appendOutputBuffer4.getParagraphId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "pre_exec"+ "'", str5.equals("pre_exec"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>"+ "'", str6.equals("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>"+ "'", str7.equals("<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    boolean b13 = linkedlist_resource2.removeFirstOccurrence((java.lang.Object)(short)1);
    java.lang.Object[] obj_array14 = linkedlist_resource2.toArray();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code15 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array16 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage17 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17, interpreterResultMessage_array16);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code15, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    boolean b20 = linkedlist_resource2.removeAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    org.apache.zeppelin.resource.Resource resource21 = linkedlist_resource2.pollFirst();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource22 = linkedlist_resource2.getFirst();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource21);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup1 = org.apache.zeppelin.interpreter.InterpreterGroup.getByInterpreterGroupId("zeppelin.interpreter.host");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterGroup1);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    org.apache.zeppelin.resource.ResourcePoolUtils.removeResourcesBelongsToNote("anonymous");

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource10 = linkedlist_resource1.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo11 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i12 = linkedlist_resource1.indexOf((java.lang.Object)authenticationInfo11);
    org.apache.zeppelin.resource.Resource resource13 = linkedlist_resource1.remove();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource13);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.shutdown();
    java.lang.String str16 = interpreterGroup0.getId();
    java.util.Set<java.util.Map.Entry<java.lang.String,java.util.List<org.apache.zeppelin.interpreter.Interpreter>>> set_entry_str_list_interpreter17 = interpreterGroup0.entrySet();
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry18 = interpreterGroup0.getAngularObjectRegistry();
    java.util.Set<java.util.Map.Entry<java.lang.String,java.util.List<org.apache.zeppelin.interpreter.Interpreter>>> set_entry_str_list_interpreter19 = interpreterGroup0.entrySet();
    java.lang.String str20 = interpreterGroup0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "InterpreterGroup_1497134387892_-1132206419"+ "'", str16.equals("InterpreterGroup_1497134387892_-1132206419"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_str_list_interpreter17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_str_list_interpreter19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "InterpreterGroup_1497134387892_-1132206419"+ "'", str20.equals("InterpreterGroup_1497134387892_-1132206419"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory0 = new org.apache.zeppelin.scheduler.ExecutorFactory();

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    org.sonatype.aether.RepositorySystem repositorySystem0 = org.apache.zeppelin.dep.RepositorySystemFactory.newRepositorySystem();
    org.sonatype.aether.RepositorySystemSession repositorySystemSession2 = org.apache.zeppelin.dep.Booter.newRepositorySystemSession(repositorySystem0, "InterpreterGroup_1497134376958_1758884347");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(repositorySystem0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(repositorySystemSession2);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.isUserImpersonate();
    boolean b3 = interpreterOption1.permissionIsSet();
    int i4 = interpreterOption1.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("InterpreterGroup_1497134376971_-1963975868");
    org.apache.zeppelin.interpreter.InterpreterResult.Type type3 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener4 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput5 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type3, interpreterResultMessageOutputListener4);
    java.lang.String[] str_array8 = new java.lang.String[] { "zeppelin.interpreter.port", "_GLOBAL_" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    interpreterResultMessageOutput5.setResourceSearchPaths((java.util.List<java.lang.String>)arraylist_str9);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.sonatype.aether.resolution.ArtifactResult> list_artifactResult12 = dependencyResolver1.getArtifactsWithDep("InterpreterGroup_1497134350938_711831855", (java.util.Collection<java.lang.String>)arraylist_str9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    org.apache.zeppelin.resource.LocalResourcePool localResourcePool1 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = localResourcePool1.getAll();
    org.apache.zeppelin.resource.Resource resource4 = localResourcePool1.get("org.apache.zeppelin.tabledata.TableDataException: <strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.Resource resource6 = localResourcePool1.remove("org.apache.zeppelin.tabledata.TableDataException: <strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource6);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    resourceSet6.clear();
    org.apache.zeppelin.resource.ResourceSet resourceSet9 = resourceSet6.filterByNoteId("pre_exec");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource10 = resourceSet9.getLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet9);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    java.lang.String str1 = org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils.getInterpreterSettingId("{\"params\":{},\"forms\":{\"InterpreterGroup_1497134350790_986318210\":{\"type\":\"TextBox\",\"name\":\"InterpreterGroup_1497134350790_986318210\",\"displayName\":\"InterpreterGroup_1497134350790_986318210\",\"defaultValue\":\"1\",\"hidden\":false}}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"params\""+ "'", str1.equals("{\"params\""));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    org.apache.zeppelin.helium.SpellPackageInfo spellPackageInfo0 = new org.apache.zeppelin.helium.SpellPackageInfo();
    java.lang.String str1 = spellPackageInfo0.getMagic();
    java.lang.String str2 = spellPackageInfo0.getUsage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet1 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResourcesExcept("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet1);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = interpreterGroup0.getInterpreterHookRegistry();
    java.util.Enumeration<java.util.List<org.apache.zeppelin.interpreter.Interpreter>> enumeration_list_interpreter2 = interpreterGroup0.elements();
    interpreterGroup0.shutdown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_list_interpreter2);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    org.apache.zeppelin.display.GUI gUI5 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input6 = gUI5.getForms();
    java.lang.Object obj9 = gUI5.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    boolean b10 = interpreterProperty4.equals(obj9);
    java.lang.String str11 = interpreterProperty4.getPropertyName();
    interpreterProperty4.setDefaultValue("InterpreterGroup_1497134376850_-1874169858");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "1"+ "'", obj9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"+ "'", str11.equals("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    repositoryListener0.metadataDownloaded(repositoryEvent3);
    org.sonatype.aether.RepositoryEvent repositoryEvent5 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataResolving(repositoryEvent5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    java.lang.String[] str_array5 = new java.lang.String[] { "zeppelin.interpreter.port", "_GLOBAL_" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    interpreterResultMessageOutput2.setResourceSearchPaths((java.util.List<java.lang.String>)arraylist_str6);
    interpreterResultMessageOutput2.clear();
    boolean b10 = interpreterResultMessageOutput2.isAppendSupported();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo0 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    authenticationInfo0.setUser("zeppelin.interpreter.port");
    java.lang.String str3 = authenticationInfo0.getTicket();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "anonymous"+ "'", str3.equals("anonymous"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    resourceSet6.clear();
    org.apache.zeppelin.resource.Resource resource8 = resourceSet6.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource8);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    boolean b2 = byteBufferInputStream1.markSupported();
    byteBufferInputStream1.close();
    // The following exception was thrown during execution in test generation
    try {
    long long5 = byteBufferInputStream1.skip((long)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.perNoteShared();
    boolean b3 = interpreterOption1.perUserIsolated();
    boolean b4 = interpreterOption1.perNoteIsolated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.display.GUI gUI38 = interpreterContext35.getGui();
    java.lang.Object obj40 = gUI38.input("InterpreterGroup_1497134385425_-1840284417");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gUI38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj40 + "' != '" + ""+ "'", obj40.equals(""));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    boolean b3 = interpreterOption2.perNoteShared();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption4 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption2);
    java.util.List<java.lang.String> list_str5 = interpreterOption4.getUsers();
    boolean b6 = interpreterOption4.isExistingProcess();
    boolean b7 = interpreterOption4.isRemote();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption8 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption4);
    boolean b9 = interpreterOption4.isSession();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup1 = new org.apache.zeppelin.interpreter.InterpreterGroup("InterpreterGroup_1497134379014_-1019571993");
    interpreterGroup1.shutdown();

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool0 = new org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool();
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource8 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource8, resource_array7);
    org.apache.zeppelin.resource.Resource[] resource_array10 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource11 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource11, resource_array10);
    boolean b13 = arraylist_resource11.isEmpty();
    boolean b14 = linkedlist_resource8.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource11);
    org.apache.zeppelin.resource.Resource resource15 = null;
    boolean b16 = linkedlist_resource8.add(resource15);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource17 = linkedlist_resource8.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo18 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i19 = linkedlist_resource8.indexOf((java.lang.Object)authenticationInfo18);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj20 = null;
    org.apache.zeppelin.display.GUI gUI21 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener23 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry24 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener23);
    org.apache.zeppelin.display.AngularObject angularObject29 = angularObjectRegistry24.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool31 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array32 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner33 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner33, interpreterContextRunner_array32);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput35 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController36 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext37 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo18, map_str_obj20, gUI21, angularObjectRegistry24, (org.apache.zeppelin.resource.ResourcePool)localResourcePool31, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner33, interpreterOutput35, remoteWorksController36);
    interpreterContextRunnerPool0.addAll("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner33);
    interpreterContextRunnerPool0.clear("InterpreterGroup_1497134361189_-653890590");
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner44 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("InterpreterGroup_1497134353138_86992792", "zeppelin.interpreter.host");
    java.lang.String str45 = remoteInterpreterContextRunner44.getParagraphId();
    interpreterContextRunnerPool0.add("InterpreterGroup_1497134373781_-855626841", (org.apache.zeppelin.interpreter.InterpreterContextRunner)remoteInterpreterContextRunner44);
    java.lang.String str47 = remoteInterpreterContextRunner44.getParagraphId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "zeppelin.interpreter.host"+ "'", str45.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "zeppelin.interpreter.host"+ "'", str47.equals("zeppelin.interpreter.host"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput2 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0, interpreterOutputChangeListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener4 = interpreterOutput2.createInterpreterResultMessageOutputListener(5);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type5 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener6 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput7 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type5, interpreterResultMessageOutputListener6);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type8 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput7.setType(type8);
    interpreterResultMessageOutput7.clear();
    interpreterResultMessageOutput7.close();
    interpreterResultMessageOutput7.close();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup13 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str14 = interpreterGroup13.getId();
    boolean b16 = interpreterGroup13.equals((java.lang.Object)0L);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup17 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool18 = interpreterGroup17.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry20 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup17.setInterpreterHookRegistry(interpreterHookRegistry20);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = interpreterGroup17.getAngularObjectRegistry();
    boolean b24 = interpreterGroup13.remove((java.lang.Object)interpreterGroup17, (java.lang.Object)10.0d);
    boolean b25 = interpreterGroup17.isEmpty();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type26 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener27 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput28 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type26, interpreterResultMessageOutputListener27);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage29 = interpreterResultMessageOutput28.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage30 = interpreterResultMessageOutput28.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener31 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput32 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener31);
    interpreterOutput32.addResourceSearchPath("isolated");
    byte[] byte_array35 = interpreterOutput32.toByteArray();
    interpreterResultMessageOutput28.write(byte_array35);
    boolean b37 = interpreterGroup17.containsKey((java.lang.Object)interpreterResultMessageOutput28);
    byte[] byte_array38 = interpreterResultMessageOutput28.toByteArray();
    interpreterResultMessageOutput7.write(byte_array38);
    // The following exception was thrown during execution in test generation
    try {
    interpreterOutput2.write(byte_array38, (int)(byte)-1, 5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessageOutputListener4);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type8.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "InterpreterGroup_1497134393527_-2029655445"+ "'", str14.equals("InterpreterGroup_1497134393527_-2029655445"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    org.apache.zeppelin.user.CredentialsInfoSaving credentialsInfoSaving0 = new org.apache.zeppelin.user.CredentialsInfoSaving();
    java.util.Map<java.lang.String,org.apache.zeppelin.user.UserCredentials> map_str_userCredentials1 = credentialsInfoSaving0.credentialsMap;
    java.util.Map<java.lang.String,org.apache.zeppelin.user.UserCredentials> map_str_userCredentials2 = credentialsInfoSaving0.credentialsMap;
    java.util.Map<java.lang.String,org.apache.zeppelin.user.UserCredentials> map_str_userCredentials3 = credentialsInfoSaving0.credentialsMap;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_userCredentials1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_userCredentials2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_userCredentials3);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource10 = linkedlist_resource1.iterator();
    org.apache.zeppelin.resource.Resource resource11 = linkedlist_resource1.pop();
    linkedlist_resource1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource11);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    boolean b2 = byteBufferInputStream1.markSupported();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener3 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput4 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener3);
    interpreterOutput4.addResourceSearchPath("isolated");
    byte[] byte_array7 = interpreterOutput4.toByteArray();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = byteBufferInputStream1.read(byte_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = interpreterGroup0.getInterpreterHookRegistry();
    java.lang.String str2 = interpreterGroup0.toString();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup4 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str5 = interpreterGroup4.getId();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array7 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter8 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter8, interpreter_array7);
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter10 = interpreterGroup4.putIfAbsent("pre_exec_dev", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter8);
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array11 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter12 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter12, interpreter_array11);
    boolean b14 = interpreterGroup0.replace("InterpreterGroup_1497134350790_986318210", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter8, (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter12);
    java.lang.String str15 = interpreterGroup0.getId();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry16 = interpreterGroup0.getInterpreterHookRegistry();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "InterpreterGroup_1497134393546_1288425887"+ "'", str5.equals("InterpreterGroup_1497134393546_1288425887"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "InterpreterGroup_1497134393545_537212119"+ "'", str15.equals("InterpreterGroup_1497134393545_537212119"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry16);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.resource.Resource resource9 = null;
    boolean b10 = linkedlist_resource2.add(resource9);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource11 = linkedlist_resource2.iterator();
    java.lang.String str12 = linkedlist_resource2.toString();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry14 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    int i15 = linkedlist_resource2.lastIndexOf((java.lang.Object)interpreterHookRegistry14);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption16 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array17 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption16 };
    org.apache.zeppelin.display.ui.Select select18 = new org.apache.zeppelin.display.ui.Select("", (java.lang.Object)interpreterHookRegistry14, paramOption_array17);
    java.lang.String str22 = interpreterHookRegistry14.get("org.apache.zeppelin.interpreter.InterpreterException: ", "", "InterpreterGroup_1497134371990_1999798592");
    interpreterHookRegistry14.addNote("InterpreterGroup_1497134377064_955397632");
    java.lang.String str28 = interpreterHookRegistry14.get("org.apache.zeppelin.tabledata.TableDataException: <strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "isolated", "AngularObject{noteId='<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>', paragraphId='pre_exec', object=[], name='_GLOBAL_'}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[null]"+ "'", str12.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = interpreterGroup0.getInterpreterHookRegistry();
    java.lang.String str2 = interpreterGroup0.toString();
    interpreterGroup0.close();
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterGroup> map_str_interpreterGroup4 = null;
    interpreterGroup0.close(map_str_interpreterGroup4, "InterpreterGroup_1497134350938_711831855", "pre_exec");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory0 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.Scheduler scheduler3 = schedulerFactory0.createOrGetParallelScheduler("shared", (int)(short)0);
    schedulerFactory0.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler3);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    java.lang.String str0 = org.apache.zeppelin.interpreter.InterpreterHookRegistry.HookType.POST_EXEC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "post_exec"+ "'", str0.equals("post_exec"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    boolean b2 = org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils.checkIfRemoteEndpointAccessible("AngularObject{noteId='null', paragraphId='null', object=null, name='null'}", (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    boolean b2 = byteBufferInputStream1.markSupported();
    byteBufferInputStream1.close();
    int i4 = byteBufferInputStream1.available();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = byteBufferInputStream1.read();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    org.apache.zeppelin.scheduler.Job job0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.scheduler.JobProgressPoller jobProgressPoller2 = new org.apache.zeppelin.scheduler.JobProgressPoller(job0, (long)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    int i2 = byteBufferInputStream1.available();
    // The following exception was thrown during execution in test generation
    try {
    int i3 = byteBufferInputStream1.read();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory2 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client3 = null;
    clientFactory2.passivateObject(pooledobject_client3);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client5 = null;
    clientFactory2.passivateObject(pooledobject_client5);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = clientFactory2.validateObject(pooledobject_client7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    org.apache.zeppelin.display.GUI gUI5 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input6 = gUI5.getForms();
    java.lang.Object obj9 = gUI5.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    boolean b10 = interpreterProperty4.equals(obj9);
    java.lang.String str11 = interpreterProperty4.getPropertyName();
    java.lang.String str12 = interpreterProperty4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "1"+ "'", obj9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"+ "'", str11.equals("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{envName=zeppelin.interpreter.port, propertyName=<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>, defaultValue={}, description=           anonymous}"+ "'", str12.equals("{envName=zeppelin.interpreter.port, propertyName=<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>, defaultValue={}, description=           anonymous}"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    repositoryListener0.metadataDownloaded(repositoryEvent3);
    org.sonatype.aether.RepositoryEvent repositoryEvent5 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactDescriptorInvalid(repositoryEvent5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo1 = new org.apache.zeppelin.user.AuthenticationInfo("post_exec_dev");

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.resource.ResourcePool resourcePool2 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup4 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry5 = interpreterGroup4.getInterpreterHookRegistry();
    java.lang.String str6 = interpreterGroup4.toString();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup8 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str9 = interpreterGroup8.getId();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array11 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter12 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter12, interpreter_array11);
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter14 = interpreterGroup8.putIfAbsent("pre_exec_dev", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter12);
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array15 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter16 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter16, interpreter_array15);
    boolean b18 = interpreterGroup4.replace("InterpreterGroup_1497134350790_986318210", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter12, (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter16);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup19 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool20 = interpreterGroup19.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry22 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup19.setInterpreterHookRegistry(interpreterHookRegistry22);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry24 = interpreterGroup19.getAngularObjectRegistry();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array26 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter27 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter27, interpreter_array26);
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter29 = interpreterGroup19.put("InterpreterGroup_1497134369176_-1878842789", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter27);
    // The following exception was thrown during execution in test generation
    try {
    boolean b30 = interpreterGroup0.replace("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter16, list_interpreter29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}"+ "'", str6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "InterpreterGroup_1497134394015_1776543382"+ "'", str9.equals("InterpreterGroup_1497134394015_1776543382"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter29);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    linkedlist_resource1.clear();
    java.lang.Object obj9 = linkedlist_resource1.clone();
    java.util.concurrent.ExecutorService executorService11 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler13 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService11, schedulerListener12);
    fIFOScheduler13.stop();
    boolean b15 = linkedlist_resource1.removeFirstOccurrence((java.lang.Object)fIFOScheduler13);
    linkedlist_resource1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("hi!");
    org.apache.zeppelin.interpreter.InterpreterResult.Type type3 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener4 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput5 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type3, interpreterResultMessageOutputListener4);
    interpreterResultMessageOutput5.flush();
    boolean b7 = interpreterResultMessageOutput5.isAppendSupported();
    java.net.URL uRL8 = null;
    interpreterResultMessageOutput5.write(uRL8);
    java.lang.String[] str_array15 = new java.lang.String[] { "isolated", "InterpreterGroup_1497134361189_-653890590", "_GLOBAL_", "isolated", "1" };
    java.util.ArrayList<java.lang.String> arraylist_str16 = new java.util.ArrayList<java.lang.String>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str16, str_array15);
    interpreterResultMessageOutput5.setResourceSearchPaths((java.util.List<java.lang.String>)arraylist_str16);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.sonatype.aether.resolution.ArtifactResult> list_artifactResult19 = dependencyResolver1.getArtifactsWithDep("InterpreterGroup_1497134393145_-2056563636", (java.util.Collection<java.lang.String>)arraylist_str16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    boolean b11 = linkedlist_resource1.contains((java.lang.Object)(-1));
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource1.offerLast(resource12);
    org.apache.zeppelin.resource.Resource[] resource_array15 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource16 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16, resource_array15);
    org.apache.zeppelin.resource.Resource[] resource_array18 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource19 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19, resource_array18);
    boolean b21 = arraylist_resource19.isEmpty();
    boolean b22 = linkedlist_resource16.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19);
    org.apache.zeppelin.resource.Resource resource23 = null;
    boolean b24 = linkedlist_resource16.add(resource23);
    boolean b26 = linkedlist_resource16.contains((java.lang.Object)(-1));
    boolean b27 = linkedlist_resource1.addAll(1, (java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16);
    org.apache.zeppelin.resource.Resource resource28 = null;
    boolean b29 = linkedlist_resource16.offerLast(resource28);
    org.apache.zeppelin.resource.Resource[] resource_array30 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource31 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource31, resource_array30);
    org.apache.zeppelin.resource.Resource[] resource_array33 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource34 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource34, resource_array33);
    boolean b36 = arraylist_resource34.isEmpty();
    boolean b37 = linkedlist_resource31.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource34);
    org.apache.zeppelin.resource.Resource resource38 = null;
    boolean b39 = linkedlist_resource31.add(resource38);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource40 = linkedlist_resource31.iterator();
    boolean b41 = linkedlist_resource16.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener7 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry8 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener7);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry11 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry8, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject13 = heliumAppAngularObjectRegistry11.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput14 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext15 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry11, interpreterOutput14);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener16 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener17 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput18 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener16, interpreterOutputChangeListener17);
    org.apache.zeppelin.helium.ApplicationContext applicationContext19 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry11, interpreterOutput18);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput20 = applicationContext19.out;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput21 = interpreterOutput20.getCurrentOutput();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage22 = interpreterOutput20.toInterpreterResultMessage();
    interpreterOutput20.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterResultMessageOutput21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage22);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption2.setHost("[null]");
    interpreterOption2.setPerNote("InterpreterGroup_1497134350938_711831855");
    boolean b7 = interpreterOption2.perNoteShared();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    org.apache.zeppelin.dep.RepositorySystemFactory.ManualWagonProvider manualWagonProvider0 = new org.apache.zeppelin.dep.RepositorySystemFactory.ManualWagonProvider();
    org.apache.maven.wagon.Wagon wagon1 = null;
    manualWagonProvider0.release(wagon1);
    org.apache.maven.wagon.Wagon wagon4 = manualWagonProvider0.lookup("InterpreterGroup_1497134376850_-1874169858");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(wagon4);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess6 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory7 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler9 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService4, "pre_exec_dev", remoteInterpreterProcess6, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory7, (int)(short)1);
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job10 = remoteScheduler9.getJobsWaiting();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job10);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("%angular [null]", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "anonymous", "InterpreterGroup_1497134377883_708078564");

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    resourceSet6.clear();
    org.apache.zeppelin.resource.ResourceSet resourceSet9 = resourceSet6.filterByNoteId("pre_exec");
    org.apache.zeppelin.resource.Resource resource10 = null;
    resourceSet9.addLast(resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet9);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventClient remoteInterpreterEventClient0 = null;
    org.apache.zeppelin.interpreter.remote.RemoteEventClient remoteEventClient1 = new org.apache.zeppelin.interpreter.remote.RemoteEventClient(remoteInterpreterEventClient0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteEventClient1.onParaInfosReceived("[]", "InterpreterGroup_1497134387851_-94093795", map_str_str4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    java.lang.String str15 = interpreterGroup0.toString();
    boolean b16 = interpreterGroup0.isEmpty();
    java.lang.String str17 = interpreterGroup0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}"+ "'", str15.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "InterpreterGroup_1497134405176_-1094264094"+ "'", str17.equals("InterpreterGroup_1497134405176_-1094264094"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("scoped", 2);
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory5 = org.apache.zeppelin.scheduler.SchedulerFactory.singleton();
    org.apache.zeppelin.scheduler.ParallelScheduler parallelScheduler7 = new org.apache.zeppelin.scheduler.ParallelScheduler("post_exec_dev", executorService4, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory5, (int)(byte)10);
    org.apache.zeppelin.scheduler.Job job8 = null;
    // The following exception was thrown during execution in test generation
    try {
    parallelScheduler7.submit(job8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerFactory5);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    linkedlist_resource5.clear();
    org.apache.zeppelin.display.AngularObject angularObject16 = angularObjectRegistry2.add("_GLOBAL_", (java.lang.Object)linkedlist_resource5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    java.lang.String str17 = angularObject16.getName();
    angularObject16.setNoteId("AngularObject{noteId='<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>', paragraphId='pre_exec', object=[], name='_GLOBAL_'}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "_GLOBAL_"+ "'", str17.equals("_GLOBAL_"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner2 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("InterpreterGroup_1497134393145_-2056563636", "zeppelin.repl.result");

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.flush();
    interpreterOutput1.write((int)(short)-1);
    int i5 = interpreterOutput1.size();
    java.net.URL uRL6 = null;
    interpreterOutput1.write(uRL6);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener8 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput9 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener8);
    interpreterOutput9.addResourceSearchPath("isolated");
    byte[] byte_array12 = interpreterOutput9.toByteArray();
    interpreterOutput1.write(byte_array12, (int)'#', (int)(byte)0);
    interpreterOutput1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    repositoryListener0.metadataDownloading(repositoryEvent3);
    org.sonatype.aether.RepositoryEvent repositoryEvent5 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactDescriptorMissing(repositoryEvent5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    org.apache.zeppelin.helium.ApplicationException applicationException1 = new org.apache.zeppelin.helium.ApplicationException("InterpreterGroup_1497134393739_-53647588");

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    int i2 = byteBufferInputStream1.available();
    boolean b3 = byteBufferInputStream1.markSupported();
    // The following exception was thrown during execution in test generation
    try {
    long long5 = byteBufferInputStream1.skip((long)29914);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("InterpreterGroup_1497134376971_-1963975868");
    java.net.URL uRL2 = null;
    // The following exception was thrown during execution in test generation
    try {
    dependencyResolver1.setProxy(uRL2, "InterpreterGroup_1497134377064_955397632", "InterpreterGroup_1497134393546_1288425887");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("InterpreterGroup_1497134369176_-1878842789");
    java.util.List<java.io.File> list_file2 = dependencyContext1.getFiles();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file2);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory2 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService5 = executorFactory2.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess7 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory8 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler10 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService5, "pre_exec_dev", remoteInterpreterProcess7, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory8, (int)(short)1);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess12 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory13 = org.apache.zeppelin.scheduler.SchedulerFactory.singleton();
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess16 = null;
    org.apache.zeppelin.scheduler.Scheduler scheduler18 = schedulerFactory13.createOrGetRemoteScheduler("{}", "_GLOBAL_", remoteInterpreterProcess16, (int)(short)1);
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler20 = new org.apache.zeppelin.scheduler.RemoteScheduler("1", executorService5, "hi!", remoteInterpreterProcess12, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory13, 100);
    java.lang.String str21 = remoteScheduler20.getName();
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job22 = remoteScheduler20.getJobsRunning();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerFactory13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "1"+ "'", str21.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job22);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventClient remoteInterpreterEventClient0 = null;
    org.apache.zeppelin.interpreter.remote.RemoteEventClient remoteEventClient1 = new org.apache.zeppelin.interpreter.remote.RemoteEventClient(remoteInterpreterEventClient0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteEventClient1.onMetaInfosReceived(map_str_str2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code10 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array11 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage12 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12, interpreterResultMessage_array11);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult14 = new org.apache.zeppelin.interpreter.InterpreterResult(code10, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code15 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array16 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage17 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17, interpreterResultMessage_array16);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code15, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code20 = interpreterResult19.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage21 = interpreterResult19.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code22 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array23 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage24 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage24, interpreterResultMessage_array23);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult26 = new org.apache.zeppelin.interpreter.InterpreterResult(code22, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage24);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code27 = interpreterResult26.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage28 = interpreterResult26.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code29 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array30 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage31, interpreterResultMessage_array30);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult33 = new org.apache.zeppelin.interpreter.InterpreterResult(code29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage31);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code34 = interpreterResult33.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage35 = interpreterResult33.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code36 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array37 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage38 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage38, interpreterResultMessage_array37);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult40 = new org.apache.zeppelin.interpreter.InterpreterResult(code36, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage38);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code41 = interpreterResult40.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage42 = interpreterResult40.message();
    java.util.List[] list_array44 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array45 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array44;
    list_interpreterResultMessage_array45[0] = arraylist_interpreterResultMessage12;
    list_interpreterResultMessage_array45[1] = list_interpreterResultMessage21;
    list_interpreterResultMessage_array45[2] = list_interpreterResultMessage28;
    list_interpreterResultMessage_array45[3] = list_interpreterResultMessage35;
    list_interpreterResultMessage_array45[4] = list_interpreterResultMessage42;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array56 = linkedlist_resource1.toArray(list_interpreterResultMessage_array45);
    org.apache.zeppelin.resource.Resource resource57 = null;
    boolean b58 = linkedlist_resource1.offerFirst(resource57);
    org.apache.zeppelin.resource.Resource resource59 = linkedlist_resource1.pop();
    org.apache.zeppelin.resource.Resource resource60 = linkedlist_resource1.pop();
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource61 = linkedlist_resource1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource61);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    org.apache.zeppelin.user.UsernamePassword usernamePassword2 = new org.apache.zeppelin.user.UsernamePassword("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    usernamePassword2.setPassword("post_exec_dev");
    usernamePassword2.setUsername("existing_process");
    java.lang.String str7 = usernamePassword2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "post_exec_dev"+ "'", str7.equals("post_exec_dev"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener9 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry10 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener9);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry13 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry10, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject15 = heliumAppAngularObjectRegistry13.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput16 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext17 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry13, interpreterOutput16);
    org.apache.zeppelin.display.AngularObject angularObject19 = heliumAppAngularObjectRegistry13.remove("InterpreterGroup_1497134353138_86992792");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener27 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry28 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener27);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry31 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry28, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject33 = heliumAppAngularObjectRegistry31.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput34 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext35 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry31, interpreterOutput34);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener36 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener37 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput38 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener36, interpreterOutputChangeListener37);
    org.apache.zeppelin.helium.ApplicationContext applicationContext39 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry31, interpreterOutput38);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput40 = applicationContext39.out;
    org.apache.zeppelin.helium.ApplicationContext applicationContext41 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134374771_373499119", "InterpreterGroup_1497134367518_-1467696533", "isolated", heliumAppAngularObjectRegistry13, interpreterOutput40);
    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream42 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type43 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener44 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput45 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type43, interpreterResultMessageOutputListener44);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type46 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput45.setType(type46);
    angularobject_outputStream42.set((java.io.OutputStream)interpreterResultMessageOutput45);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type49 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener50 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput51 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type49, interpreterResultMessageOutputListener50);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage52 = interpreterResultMessageOutput51.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage53 = interpreterResultMessageOutput51.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup54 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry55 = interpreterGroup54.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array56 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource57 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource57, resource_array56);
    org.apache.zeppelin.resource.Resource[] resource_array59 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource60 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource60, resource_array59);
    boolean b62 = arraylist_resource60.isEmpty();
    boolean b63 = linkedlist_resource57.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource60);
    linkedlist_resource57.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter65 = interpreterGroup54.get((java.lang.Object)linkedlist_resource57);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type66 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter67 = interpreterGroup54.get((java.lang.Object)type66);
    interpreterResultMessageOutput51.setType(type66);
    interpreterResultMessageOutput45.setType(type66);
    org.slf4j.Logger logger70 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream71 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger70);
    byte[] byte_array75 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream71.write(byte_array75, (int)'a', 3);
    interpreterResultMessageOutput45.write(byte_array75, (int)'#', 2);
    interpreterOutput40.write(byte_array75);
    // The following exception was thrown during execution in test generation
    try {
    int i85 = byteBufferInputStream1.read(byte_array75, 59683, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput40);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type46.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter65);
    org.junit.Assert.assertTrue("'" + type66 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type66.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array75);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener2 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput3 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type1, interpreterResultMessageOutputListener2);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput3.setType(type4);
    angularobject_outputStream0.set((java.io.OutputStream)interpreterResultMessageOutput3);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type7 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener8 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput9 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type7, interpreterResultMessageOutputListener8);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage10 = interpreterResultMessageOutput9.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage11 = interpreterResultMessageOutput9.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup12 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry13 = interpreterGroup12.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array14 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource15 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource15, resource_array14);
    org.apache.zeppelin.resource.Resource[] resource_array17 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource18 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource18, resource_array17);
    boolean b20 = arraylist_resource18.isEmpty();
    boolean b21 = linkedlist_resource15.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource18);
    linkedlist_resource15.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter23 = interpreterGroup12.get((java.lang.Object)linkedlist_resource15);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type24 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter25 = interpreterGroup12.get((java.lang.Object)type24);
    interpreterResultMessageOutput9.setType(type24);
    interpreterResultMessageOutput3.setType(type24);
    org.slf4j.Logger logger28 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream29 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger28);
    byte[] byte_array33 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream29.write(byte_array33, (int)'a', 3);
    interpreterResultMessageOutput3.write(byte_array33, (int)'#', 2);
    java.lang.String str40 = interpreterResultMessageOutput3.toString();
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type4.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type24.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "%null "+ "'", str40.equals("%null "));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage2 = org.apache.zeppelin.interpreter.ResultMessages.getExceedsLimitSizeMessage((int)(short)1, "InterpreterGroup_1497134373781_-855626841");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage2);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code10 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array11 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage12 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12, interpreterResultMessage_array11);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult14 = new org.apache.zeppelin.interpreter.InterpreterResult(code10, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code15 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array16 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage17 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17, interpreterResultMessage_array16);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code15, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code20 = interpreterResult19.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage21 = interpreterResult19.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code22 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array23 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage24 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage24, interpreterResultMessage_array23);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult26 = new org.apache.zeppelin.interpreter.InterpreterResult(code22, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage24);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code27 = interpreterResult26.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage28 = interpreterResult26.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code29 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array30 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage31, interpreterResultMessage_array30);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult33 = new org.apache.zeppelin.interpreter.InterpreterResult(code29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage31);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code34 = interpreterResult33.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage35 = interpreterResult33.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code36 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array37 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage38 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage38, interpreterResultMessage_array37);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult40 = new org.apache.zeppelin.interpreter.InterpreterResult(code36, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage38);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code41 = interpreterResult40.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage42 = interpreterResult40.message();
    java.util.List[] list_array44 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array45 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array44;
    list_interpreterResultMessage_array45[0] = arraylist_interpreterResultMessage12;
    list_interpreterResultMessage_array45[1] = list_interpreterResultMessage21;
    list_interpreterResultMessage_array45[2] = list_interpreterResultMessage28;
    list_interpreterResultMessage_array45[3] = list_interpreterResultMessage35;
    list_interpreterResultMessage_array45[4] = list_interpreterResultMessage42;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array56 = linkedlist_resource1.toArray(list_interpreterResultMessage_array45);
    org.apache.zeppelin.resource.Resource resource57 = null;
    boolean b58 = linkedlist_resource1.offerFirst(resource57);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource59 = linkedlist_resource1.iterator();
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource60 = linkedlist_resource1.descendingIterator();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener68 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry69 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener68);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry72 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry69, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject74 = heliumAppAngularObjectRegistry72.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput75 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext76 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry72, interpreterOutput75);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener77 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener78 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput79 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener77, interpreterOutputChangeListener78);
    org.apache.zeppelin.helium.ApplicationContext applicationContext80 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry72, interpreterOutput79);
    int i81 = linkedlist_resource1.indexOf((java.lang.Object)heliumAppAngularObjectRegistry72);
    org.apache.zeppelin.resource.Resource resource82 = linkedlist_resource1.peekLast();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource82);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput38 = interpreterContext35.out;
    java.lang.String str39 = interpreterContext35.getParagraphTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "pre_exec_dev"+ "'", str39.equals("pre_exec_dev"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet2.filterByName("anonymous");
    org.apache.zeppelin.resource.Resource resource7 = resourceSet2.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource7);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    linkedlist_resource5.clear();
    org.apache.zeppelin.display.AngularObject angularObject16 = angularObjectRegistry2.add("_GLOBAL_", (java.lang.Object)linkedlist_resource5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup17 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry18 = interpreterGroup17.getInterpreterHookRegistry();
    java.lang.String str19 = interpreterGroup17.toString();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup21 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str22 = interpreterGroup21.getId();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array24 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter25 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter25, interpreter_array24);
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter27 = interpreterGroup21.putIfAbsent("pre_exec_dev", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter25);
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array28 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter29 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter29, interpreter_array28);
    boolean b31 = interpreterGroup17.replace("InterpreterGroup_1497134350790_986318210", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter25, (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter29);
    boolean b32 = linkedlist_resource5.containsAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter25);
    java.util.ListIterator<org.apache.zeppelin.resource.Resource> listiterator_resource33 = linkedlist_resource5.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}"+ "'", str19.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "InterpreterGroup_1497134406482_218481333"+ "'", str22.equals("InterpreterGroup_1497134406482_218481333"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_resource33);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.zeppelin.interpreter.remote.RemoteInterpreterUtils.getInterpreterSettingId("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.Interpreter.RegisteredInterpreter> map_str_registeredInterpreter0 = org.apache.zeppelin.interpreter.Interpreter.registeredInterpreters;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_registeredInterpreter0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    linkedlist_resource5.clear();
    org.apache.zeppelin.display.AngularObject angularObject16 = angularObjectRegistry2.add("_GLOBAL_", (java.lang.Object)linkedlist_resource5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    java.util.List<org.apache.zeppelin.display.AngularObject> list_angularObject19 = angularObjectRegistry2.getAll("pre_exec", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.Resource[] resource_array26 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource27 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource27, resource_array26);
    org.apache.zeppelin.resource.Resource[] resource_array29 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource30 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource30, resource_array29);
    boolean b32 = arraylist_resource30.isEmpty();
    boolean b33 = linkedlist_resource27.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource30);
    org.apache.zeppelin.resource.Resource resource34 = null;
    boolean b35 = linkedlist_resource27.add(resource34);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource36 = linkedlist_resource27.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo37 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i38 = linkedlist_resource27.indexOf((java.lang.Object)authenticationInfo37);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj39 = null;
    org.apache.zeppelin.display.GUI gUI40 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener42 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry43 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener42);
    org.apache.zeppelin.display.AngularObject angularObject48 = angularObjectRegistry43.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool50 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array51 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner52 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner52, interpreterContextRunner_array51);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput54 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController55 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext56 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo37, map_str_obj39, gUI40, angularObjectRegistry43, (org.apache.zeppelin.resource.ResourcePool)localResourcePool50, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner52, interpreterOutput54, remoteWorksController55);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext56);
    java.lang.String str58 = interpreterContext56.getReplName();
    java.lang.String str59 = interpreterContext56.getReplName();
    java.lang.String str60 = interpreterContext56.getParagraphId();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner> list_interpreterContextRunner61 = interpreterContext56.getRunners();
    org.apache.zeppelin.display.AngularObject angularObject64 = angularObjectRegistry2.add("InterpreterGroup_1497134384596_204399223", (java.lang.Object)interpreterContext56, "InterpreterGroup_1497134376922_-128746751", "AngularObject{noteId='null', paragraphId='null', object=null, name='null'}");
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo65 = interpreterContext56.getAuthenticationInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_angularObject19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str58.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str59.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "InterpreterGroup_1497134353138_86992792"+ "'", str60.equals("InterpreterGroup_1497134353138_86992792"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterContextRunner61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo65);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner2 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("InterpreterGroup_1497134353138_86992792", "zeppelin.interpreter.host");
    java.lang.String str3 = remoteInterpreterContextRunner2.getParagraphId();
    boolean b5 = remoteInterpreterContextRunner2.equals((java.lang.Object)(short)1);
    java.lang.String str6 = remoteInterpreterContextRunner2.getParagraphId();
    // The following exception was thrown during execution in test generation
    try {
    remoteInterpreterContextRunner2.run();
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.interpreter.InterpreterException");
    } catch (org.apache.zeppelin.interpreter.InterpreterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "zeppelin.interpreter.host"+ "'", str3.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "zeppelin.interpreter.host"+ "'", str6.equals("zeppelin.interpreter.host"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    org.apache.zeppelin.resource.LocalResourcePool localResourcePool1 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.Resource[] resource_array6 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource7 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource7, resource_array6);
    org.apache.zeppelin.resource.Resource[] resource_array9 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource10 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource10, resource_array9);
    boolean b12 = arraylist_resource10.isEmpty();
    boolean b13 = linkedlist_resource7.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource10);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption14 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array15 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption14 };
    org.apache.zeppelin.display.ui.Select select16 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource7, paramOption_array15);
    org.apache.zeppelin.display.ui.Select select17 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array15);
    boolean b18 = select17.isHidden();
    select17.setDisplayName("zeppelin.interpreter.port");
    localResourcePool1.put("shared", (java.lang.Object)"zeppelin.interpreter.port");
    org.apache.zeppelin.resource.Resource resource25 = localResourcePool1.get("pre_exec", "InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134385808_1965526612");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource25);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    linkedlist_resource5.clear();
    org.apache.zeppelin.display.AngularObject angularObject16 = angularObjectRegistry2.add("_GLOBAL_", (java.lang.Object)linkedlist_resource5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.display.AngularObjectWatcher angularObjectWatcher17 = null;
    angularObject16.removeWatcher(angularObjectWatcher17);
    angularObject16.emit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject16);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.addResourceSearchPath("isolated");
    byte[] byte_array4 = interpreterOutput1.toByteArray();
    java.io.File file5 = null;
    interpreterOutput1.write(file5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    java.lang.Object obj0 = null;
    java.nio.ByteBuffer byteBuffer1 = org.apache.zeppelin.resource.Resource.serializeObject(obj0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byteBuffer1);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    boolean b2 = byteBufferInputStream1.markSupported();
    byteBufferInputStream1.close();
    // The following exception was thrown during execution in test generation
    try {
    int i4 = byteBufferInputStream1.read();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet5 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet7 = resourceSet5.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet9 = resourceSet7.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet11 = resourceSet9.filterByName("InterpreterGroup_1497134350938_711831855");
    boolean b12 = resourceSet2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)resourceSet11);
    org.apache.zeppelin.resource.ResourceSet resourceSet14 = resourceSet11.filterByClassnameRegex("[null]");
    org.apache.zeppelin.resource.Resource resource15 = resourceSet11.peekLast();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource15);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    java.lang.String[] str_array1 = org.apache.zeppelin.display.Input.splitPipe("InterpreterGroup_1497134384512_-890338748");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage4 = new org.apache.zeppelin.interpreter.InterpreterResultMessage(type0, "[null]");
    java.lang.String str5 = interpreterResultMessage4.getData();
    java.lang.String str6 = interpreterResultMessage4.toString();
    org.apache.zeppelin.tabledata.InterpreterResultTableData interpreterResultTableData7 = new org.apache.zeppelin.tabledata.InterpreterResultTableData(interpreterResultMessage4);
    java.util.Iterator<org.apache.zeppelin.tabledata.Row> iterator_row8 = interpreterResultTableData7.rows();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]"+ "'", str5.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "%angular [null]"+ "'", str6.equals("%angular [null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_row8);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    org.apache.zeppelin.resource.Resource resource0 = null;
    org.apache.zeppelin.tabledata.TableDataProxy tableDataProxy1 = new org.apache.zeppelin.tabledata.TableDataProxy(resource0);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.tabledata.ColumnDef[] columnDef_array2 = tableDataProxy1.columns();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet2.filterByName("anonymous");
    org.apache.zeppelin.resource.ResourceSet resourceSet7 = new org.apache.zeppelin.resource.ResourceSet((java.util.Collection<org.apache.zeppelin.resource.Resource>)resourceSet6);
    org.apache.zeppelin.resource.ResourceSet resourceSet9 = resourceSet7.filterByClassname("_GLOBAL_");
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.resource.Resource> list_resource12 = resourceSet9.subList((int)'4', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet9);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    org.apache.zeppelin.dep.TransferListener transferListener0 = new org.apache.zeppelin.dep.TransferListener();
    org.sonatype.aether.transfer.TransferEvent transferEvent1 = null;
    transferListener0.transferStarted(transferEvent1);
    org.sonatype.aether.transfer.TransferEvent transferEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    transferListener0.transferProgressed(transferEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    select11.setDisplayName("[null]");
    java.lang.String str14 = select11.getArgument();
    select11.setArgument("InterpreterGroup_1497134350790_986318210");
    java.lang.Object obj17 = select11.getDefaultValue();
    select11.setHidden(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    linkedlist_resource5.clear();
    org.apache.zeppelin.display.AngularObject angularObject16 = angularObjectRegistry2.add("_GLOBAL_", (java.lang.Object)linkedlist_resource5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup17 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry18 = interpreterGroup17.getInterpreterHookRegistry();
    java.lang.String str19 = interpreterGroup17.toString();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup21 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str22 = interpreterGroup21.getId();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array24 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter25 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter25, interpreter_array24);
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter27 = interpreterGroup21.putIfAbsent("pre_exec_dev", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter25);
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array28 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter29 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter29, interpreter_array28);
    boolean b31 = interpreterGroup17.replace("InterpreterGroup_1497134350790_986318210", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter25, (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter29);
    boolean b32 = linkedlist_resource5.containsAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter25);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource33 = linkedlist_resource5.element();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}"+ "'", str19.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "InterpreterGroup_1497134407710_1438550717"+ "'", str22.equals("InterpreterGroup_1497134407710_1438550717"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getDescription();
    org.apache.zeppelin.helium.SpellPackageInfo spellPackageInfo10 = heliumPackage8.getSpellInfo();
    java.lang.String str11 = heliumPackage8.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(spellPackageInfo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.tabledata.InterpreterResultTableData interpreterResultTableData4 = new org.apache.zeppelin.tabledata.InterpreterResultTableData(interpreterResultMessage3);
    org.apache.zeppelin.tabledata.ColumnDef[] columnDef_array5 = interpreterResultTableData4.columns();
    org.apache.zeppelin.tabledata.ColumnDef[] columnDef_array6 = interpreterResultTableData4.columns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(columnDef_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(columnDef_array6);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    org.apache.zeppelin.user.Credentials credentials2 = new org.apache.zeppelin.user.Credentials((java.lang.Boolean)false, "InterpreterGroup_1497134376971_-1963975868");
    credentials2.saveCredentials();

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("InterpreterGroup_1497134376971_-1963975868");
    dependencyResolver1.addRepo("1", "1", false);
    org.sonatype.aether.repository.RemoteRepository remoteRepository7 = dependencyResolver1.delRepo("InterpreterGroup_1497134374528_1509866041");
    java.io.File file9 = null;
    // The following exception was thrown during execution in test generation
    try {
    dependencyResolver1.copyLocalDependency("InterpreterGroup_1497134374528_1509866041", file9);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteRepository7);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory2 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService5 = executorFactory2.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess7 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory8 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler10 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService5, "pre_exec_dev", remoteInterpreterProcess7, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory8, (int)(short)1);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess12 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory13 = org.apache.zeppelin.scheduler.SchedulerFactory.singleton();
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess16 = null;
    org.apache.zeppelin.scheduler.Scheduler scheduler18 = schedulerFactory13.createOrGetRemoteScheduler("{}", "_GLOBAL_", remoteInterpreterProcess16, (int)(short)1);
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler20 = new org.apache.zeppelin.scheduler.RemoteScheduler("1", executorService5, "hi!", remoteInterpreterProcess12, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory13, 100);
    java.lang.String str21 = remoteScheduler20.getName();
    org.apache.zeppelin.scheduler.Job job22 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteScheduler20.submit(job22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerFactory13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "1"+ "'", str21.equals("1"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    java.lang.String[] str_array7 = org.apache.zeppelin.display.Input.splitPipe("InterpreterGroup_1497134374771_373499119");
    java.lang.String[] str_array9 = org.apache.zeppelin.display.Input.splitPipe("1");
    java.lang.String[] str_array11 = org.apache.zeppelin.display.Input.splitPipe("InterpreterGroup_1497134374771_373499119");
    java.lang.String[] str_array13 = org.apache.zeppelin.display.Input.split("zeppelin.repl.result", "zeppelin.repl.result", ' ', str_array7, str_array9, str_array11, true);
    java.lang.String[] str_array15 = org.apache.zeppelin.display.Input.split("hi!");
    java.lang.String[] str_array18 = org.apache.zeppelin.display.Input.split("scoped", 'a');
    java.lang.String[] str_array20 = org.apache.zeppelin.display.Input.split("AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}", "scoped", '4', str_array7, str_array15, str_array18, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage2 = org.apache.zeppelin.interpreter.ResultMessages.getExceedsLimitRowsMessage(100, "InterpreterGroup_1497134376971_-1963975868");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage2);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("InterpreterGroup_1497134376971_-1963975868");
    dependencyResolver1.addRepo("1", "1", false);
    java.util.List<java.io.File> list_file7 = dependencyResolver1.load("");
    java.io.File file9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.io.File> list_file10 = dependencyResolver1.load("post_exec", file9);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file7);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    org.apache.zeppelin.interpreter.InterpreterException interpreterException1 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.interpreter.InterpreterException interpreterException2 = new org.apache.zeppelin.interpreter.InterpreterException((java.lang.Throwable)interpreterException1);
    java.lang.String str3 = org.apache.zeppelin.interpreter.InterpreterUtils.getMostRelevantMessage((java.lang.Exception)interpreterException2);
    org.apache.zeppelin.helium.ApplicationException applicationException4 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)interpreterException2);
    java.lang.Throwable[] throwable_array5 = applicationException4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str3.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource10 = linkedlist_resource1.iterator();
    java.lang.Object obj11 = linkedlist_resource1.clone();
    org.apache.zeppelin.resource.Resource resource12 = linkedlist_resource1.getLast();
    org.apache.zeppelin.resource.Resource resource13 = linkedlist_resource1.peekFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource13);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult2 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "InterpreterGroup_1497134350790_986318210");

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    java.lang.String str37 = interpreterContext35.getReplName();
    org.apache.zeppelin.resource.ResourcePool resourcePool38 = interpreterContext35.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput39 = interpreterContext35.out();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner> list_interpreterContextRunner40 = interpreterContext35.getRunners();
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str37.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourcePool38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterContextRunner40);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput2 = interpreterOutputStream1.getInterpreterOutput();
    interpreterOutputStream1.flush();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput4 = interpreterOutputStream1.getInterpreterOutput();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput4);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    org.apache.zeppelin.helium.ApplicationException applicationException1 = new org.apache.zeppelin.helium.ApplicationException("InterpreterGroup_1497134385808_1965526612");
    java.lang.String str2 = applicationException1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.zeppelin.helium.ApplicationException: InterpreterGroup_1497134385808_1965526612"+ "'", str2.equals("org.apache.zeppelin.helium.ApplicationException: InterpreterGroup_1497134385808_1965526612"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    org.apache.zeppelin.dep.RepositorySystemFactory.ManualWagonProvider manualWagonProvider0 = new org.apache.zeppelin.dep.RepositorySystemFactory.ManualWagonProvider();
    org.apache.maven.wagon.Wagon wagon1 = null;
    manualWagonProvider0.release(wagon1);
    org.apache.maven.wagon.Wagon wagon3 = null;
    manualWagonProvider0.release(wagon3);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    java.lang.Object[] obj_array7 = resourceSet6.toArray();
    org.apache.zeppelin.resource.ResourceSet resourceSet9 = resourceSet6.filterByClassnameRegex("org.apache.zeppelin.interpreter.InterpreterException: ");
    org.apache.zeppelin.resource.Resource resource10 = null;
    resourceSet6.addFirst(resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet9);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.permissionIsSet();
    java.lang.String str3 = interpreterOption1.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess6 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory7 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler9 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService4, "pre_exec_dev", remoteInterpreterProcess6, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory7, (int)(short)1);
    java.util.Collection<org.apache.zeppelin.scheduler.Scheduler> collection_scheduler11 = schedulerFactory7.listScheduler("InterpreterGroup_1497134384934_2010942845");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_scheduler11);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.String str36 = authenticationInfo16.getTicket();
    authenticationInfo16.setTicket("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "anonymous"+ "'", str36.equals("anonymous"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener7 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry8 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener7);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry11 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry8, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject13 = heliumAppAngularObjectRegistry11.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput14 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext15 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry11, interpreterOutput14);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener16 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener17 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput18 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener16, interpreterOutputChangeListener17);
    org.apache.zeppelin.helium.ApplicationContext applicationContext19 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry11, interpreterOutput18);
    java.util.List<org.apache.zeppelin.display.AngularObject> list_angularObject20 = heliumAppAngularObjectRegistry11.getAll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_angularObject20);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    // The following exception was thrown during execution in test generation
    try {
    interpreterResultMessageOutput2.writeResource("InterpreterGroup_1497134384512_-890338748");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage3);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo38 = interpreterContext35.getAuthenticationInfo();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj39 = interpreterContext35.getConfig();
    org.apache.zeppelin.interpreter.remote.RemoteEventClientWrapper remoteEventClientWrapper40 = interpreterContext35.getClient();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEventClientWrapper40);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory0 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService3 = executorFactory0.createOrGet("scoped", 2);
    // The following exception was thrown during execution in test generation
    try {
    executorFactory0.shutdownAll();
      org.junit.Assert.fail("Expected exception of type java.util.ConcurrentModificationException");
    } catch (java.util.ConcurrentModificationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService3);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo0 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    java.lang.String str1 = authenticationInfo0.getTicket();
    authenticationInfo0.setTicket("[]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>"+ "'", str1.equals("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterProperty> map_str_interpreterProperty3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.Interpreter.register("pre_exec", "pre_exec", "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>", map_str_interpreterProperty3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("scoped", 2);
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory5 = org.apache.zeppelin.scheduler.SchedulerFactory.singleton();
    org.apache.zeppelin.scheduler.ParallelScheduler parallelScheduler7 = new org.apache.zeppelin.scheduler.ParallelScheduler("post_exec_dev", executorService4, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory5, (int)(byte)10);
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory8 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.Scheduler scheduler10 = schedulerFactory8.createOrGetFIFOScheduler("InterpreterGroup_1497134361189_-653890590");
    org.apache.zeppelin.scheduler.Job job11 = null;
    // The following exception was thrown during execution in test generation
    try {
    schedulerFactory5.jobStarted(scheduler10, job11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerFactory5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler10);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    repositoryListener0.metadataDownloading(repositoryEvent3);
    org.sonatype.aether.RepositoryEvent repositoryEvent5 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataInvalid(repositoryEvent5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = org.apache.zeppelin.interpreter.InterpreterResult.Code.ERROR;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult1 = new org.apache.zeppelin.interpreter.InterpreterResult(code0);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code2 = org.apache.zeppelin.interpreter.InterpreterResult.Code.SUCCESS;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult3 = new org.apache.zeppelin.interpreter.InterpreterResult(code2);
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage4 = interpreterResult3.message();
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult5 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, list_interpreterResultMessage4);
    org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.ERROR + "'", code0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.ERROR));
    org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.SUCCESS + "'", code2.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.SUCCESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage4);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    org.apache.zeppelin.resource.LocalResourcePool localResourcePool1 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.Resource resource3 = localResourcePool1.remove("InterpreterGroup_1497134350790_986318210");
    org.apache.zeppelin.resource.Resource resource7 = localResourcePool1.get("InterpreterGroup_1497134393145_-2056563636", "InterpreterGroup_1497134384557_-1299248309", "[null]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource7);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactDeployed(repositoryEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.perNoteShared();
    boolean b3 = interpreterOption1.perUserIsolated();
    interpreterOption1.setHost("{}");
    interpreterOption1.setPerUser("existing_process");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    linkedlist_resource1.clear();
    java.lang.Object obj9 = linkedlist_resource1.clone();
    java.util.concurrent.ExecutorService executorService11 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler13 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService11, schedulerListener12);
    fIFOScheduler13.stop();
    boolean b15 = linkedlist_resource1.removeFirstOccurrence((java.lang.Object)fIFOScheduler13);
    org.apache.zeppelin.resource.ResourceSet resourceSet16 = new org.apache.zeppelin.resource.ResourceSet((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1);
    java.util.ListIterator<org.apache.zeppelin.resource.Resource> listiterator_resource17 = linkedlist_resource1.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_resource17);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    org.apache.zeppelin.user.Credentials credentials2 = new org.apache.zeppelin.user.Credentials((java.lang.Boolean)true, "zeppelin.interpreter.host");
    org.apache.zeppelin.user.UserCredentials userCredentials4 = credentials2.removeUserCredentials("InterpreterGroup_1497134350938_711831855");
    org.apache.zeppelin.user.UserCredentials userCredentials6 = credentials2.removeUserCredentials("InterpreterGroup_1497134353138_86992792");
    credentials2.saveCredentials();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userCredentials4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userCredentials6);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.flush();
    interpreterOutput1.write((int)(short)-1);
    int i5 = interpreterOutput1.size();
    java.net.URL uRL6 = null;
    interpreterOutput1.write(uRL6);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener8 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput9 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener8);
    interpreterOutput9.addResourceSearchPath("isolated");
    byte[] byte_array12 = interpreterOutput9.toByteArray();
    interpreterOutput1.write(byte_array12, (int)'#', (int)(byte)0);
    interpreterOutput1.write("InterpreterGroup_1497134384934_2010942845");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("{}");
    interpreterHookRegistry1.addRepl("isolated", "InterpreterGroup_1497134353138_86992792");
    // The following exception was thrown during execution in test generation
    try {
    interpreterHookRegistry1.register("InterpreterGroup_1497134393145_-2056563636", "", "InterpreterGroup_1497134405176_-1094264094", "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet2.filterByName("anonymous");
    org.apache.zeppelin.resource.ResourceSet resourceSet7 = new org.apache.zeppelin.resource.ResourceSet((java.util.Collection<org.apache.zeppelin.resource.Resource>)resourceSet6);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = resourceSet6.add(resource8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    boolean b3 = interpreterOption2.perNoteShared();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption4 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption2);
    java.util.List<java.lang.String> list_str5 = interpreterOption4.getUsers();
    boolean b6 = interpreterOption4.isExistingProcess();
    boolean b7 = interpreterOption4.isRemote();
    java.lang.String str8 = interpreterOption4.getHost();
    boolean b9 = interpreterOption4.permissionIsSet();
    interpreterOption4.setExistingProcess(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type3 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput2.setType(type3);
    interpreterResultMessageOutput2.clear();
    interpreterResultMessageOutput2.close();
    interpreterResultMessageOutput2.close();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup8 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str9 = interpreterGroup8.getId();
    boolean b11 = interpreterGroup8.equals((java.lang.Object)0L);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup12 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool13 = interpreterGroup12.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry15 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup12.setInterpreterHookRegistry(interpreterHookRegistry15);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry17 = interpreterGroup12.getAngularObjectRegistry();
    boolean b19 = interpreterGroup8.remove((java.lang.Object)interpreterGroup12, (java.lang.Object)10.0d);
    boolean b20 = interpreterGroup12.isEmpty();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type21 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener22 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput23 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type21, interpreterResultMessageOutputListener22);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage24 = interpreterResultMessageOutput23.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage25 = interpreterResultMessageOutput23.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener26 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput27 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener26);
    interpreterOutput27.addResourceSearchPath("isolated");
    byte[] byte_array30 = interpreterOutput27.toByteArray();
    interpreterResultMessageOutput23.write(byte_array30);
    boolean b32 = interpreterGroup12.containsKey((java.lang.Object)interpreterResultMessageOutput23);
    byte[] byte_array33 = interpreterResultMessageOutput23.toByteArray();
    interpreterResultMessageOutput2.write(byte_array33);
    interpreterResultMessageOutput2.write("InterpreterGroup_1497134378013_-178412288");
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type3.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "InterpreterGroup_1497134408987_-733609207"+ "'", str9.equals("InterpreterGroup_1497134408987_-733609207"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory0 = org.apache.zeppelin.scheduler.SchedulerFactory.singleton();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.scheduler.Scheduler scheduler3 = schedulerFactory0.createOrGetParallelScheduler("anonymous", 999);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerFactory0);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    org.apache.zeppelin.display.GUI gUI0 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input1 = gUI0.getForms();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj2 = gUI0.getParams();
    java.lang.String str4 = org.apache.zeppelin.display.Input.getSimpleQuery(map_str_obj2, "shared");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "shared"+ "'", str4.equals("shared"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory5 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.Scheduler scheduler7 = schedulerFactory5.createOrGetFIFOScheduler("InterpreterGroup_1497134361189_-653890590");
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler8 = new org.apache.zeppelin.scheduler.FIFOScheduler("hi!", executorService4, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory5);
    org.apache.zeppelin.scheduler.Scheduler scheduler10 = schedulerFactory5.removeScheduler("InterpreterGroup_1497134387892_-1132206419");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scheduler10);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    java.lang.String[] str_array2 = org.apache.zeppelin.display.Input.split("InterpreterGroup_1497134361094_1261121192", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory2 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService5 = executorFactory2.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess7 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory8 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler10 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService5, "pre_exec_dev", remoteInterpreterProcess7, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory8, (int)(short)1);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess12 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory13 = org.apache.zeppelin.scheduler.SchedulerFactory.singleton();
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess16 = null;
    org.apache.zeppelin.scheduler.Scheduler scheduler18 = schedulerFactory13.createOrGetRemoteScheduler("{}", "_GLOBAL_", remoteInterpreterProcess16, (int)(short)1);
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler20 = new org.apache.zeppelin.scheduler.RemoteScheduler("1", executorService5, "hi!", remoteInterpreterProcess12, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory13, 100);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.scheduler.Scheduler scheduler22 = schedulerFactory13.createOrGetFIFOScheduler("InterpreterGroup_1497134374771_373499119");
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerFactory13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler18);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    org.apache.zeppelin.resource.Resource resource7 = resourceSet4.peekLast();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource7);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    byte[] byte_array5 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream1.write(byte_array5, (int)'a', 3);
    interpreterOutputStream1.ignoreLeadingNewLinesFromScalaReporter();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput10 = interpreterOutputStream1.getInterpreterOutput();
    interpreterOutputStream1.write((int)(short)1);
    int i13 = interpreterOutputStream1.getMessageLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 999);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getArtifact();
    java.lang.String str10 = heliumPackage8.getGroupId();
    java.lang.String str11 = heliumPackage8.getArtifactId();
    org.apache.zeppelin.helium.SpellPackageInfo spellPackageInfo12 = heliumPackage8.getSpellInfo();
    java.lang.String str13 = heliumPackage8.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(spellPackageInfo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "post_exec_dev"+ "'", str13.equals("post_exec_dev"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource0 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type type1 = null;
    remoteZeppelinServerResource0.setResourceType(type1);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner5 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("InterpreterGroup_1497134353138_86992792", "zeppelin.interpreter.host");
    java.lang.String str6 = remoteInterpreterContextRunner5.getParagraphId();
    boolean b8 = remoteInterpreterContextRunner5.equals((java.lang.Object)(short)1);
    remoteZeppelinServerResource0.setData((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "zeppelin.interpreter.host"+ "'", str6.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = org.apache.zeppelin.interpreter.InterpreterResult.Code.KEEP_PREVIOUS_RESULT;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult2 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "existing_process");
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult3 = new org.apache.zeppelin.interpreter.InterpreterResult(code0);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult5 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "zeppelin.interpreter.host");
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult6 = new org.apache.zeppelin.interpreter.InterpreterResult(code0);
    org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.KEEP_PREVIOUS_RESULT + "'", code0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.KEEP_PREVIOUS_RESULT));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("scoped");

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    byte[] byte_array5 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream1.write(byte_array5, (int)'a', 3);
    org.slf4j.Logger logger9 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream10 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger9);
    byte[] byte_array14 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream10.write(byte_array14, (int)'a', 3);
    interpreterOutputStream1.write(byte_array14, (int)(short)10, 10);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput21 = interpreterOutputStream1.getInterpreterOutput();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput21);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
    org.apache.zeppelin.helium.ApplicationEventListener applicationEventListener1 = null;
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller2 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, applicationEventListener1);
    remoteInterpreterEventPoller2.shutdown();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup4 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool5 = interpreterGroup4.getResourcePool();
    boolean b8 = interpreterGroup4.remove((java.lang.Object)0L, (java.lang.Object)'a');
    java.lang.String str9 = interpreterGroup4.getId();
    remoteInterpreterEventPoller2.setInterpreterGroup(interpreterGroup4);
    org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage invokeResourceMethodEventMessage11 = null;
    java.lang.Object obj12 = null;
    remoteInterpreterEventPoller2.sendInvokeMethodResult(invokeResourceMethodEventMessage11, obj12);
    remoteInterpreterEventPoller2.shutdown();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "InterpreterGroup_1497134410025_-620513103"+ "'", str9.equals("InterpreterGroup_1497134410025_-620513103"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.String str36 = gUI19.toJson();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{\"params\":{},\"forms\":{}}"+ "'", str36.equals("{\"params\":{},\"forms\":{}}"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    org.apache.zeppelin.interpreter.remote.AppendOutputBuffer appendOutputBuffer4 = new org.apache.zeppelin.interpreter.remote.AppendOutputBuffer("InterpreterGroup_1497134361094_1261121192", "anonymous", (int)(short)100, "InterpreterGroup_1497134350938_711831855");
    java.lang.String str5 = appendOutputBuffer4.getParagraphId();
    int i6 = appendOutputBuffer4.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "anonymous"+ "'", str5.equals("anonymous"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet1 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResourcesExcept("AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet1);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
    org.apache.zeppelin.helium.ApplicationEventListener applicationEventListener1 = null;
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller2 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, applicationEventListener1);
    remoteInterpreterEventPoller2.shutdown();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup4 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool5 = interpreterGroup4.getResourcePool();
    boolean b8 = interpreterGroup4.remove((java.lang.Object)0L, (java.lang.Object)'a');
    java.lang.String str9 = interpreterGroup4.getId();
    remoteInterpreterEventPoller2.setInterpreterGroup(interpreterGroup4);
    remoteInterpreterEventPoller2.run();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup12 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool13 = interpreterGroup12.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry15 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup12.setInterpreterHookRegistry(interpreterHookRegistry15);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption18 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption19 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption18);
    boolean b20 = interpreterGroup12.contains((java.lang.Object)interpreterOption18);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup21 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool22 = interpreterGroup21.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry24 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup21.setInterpreterHookRegistry(interpreterHookRegistry24);
    interpreterGroup12.setInterpreterHookRegistry(interpreterHookRegistry24);
    remoteInterpreterEventPoller2.setInterpreterGroup(interpreterGroup12);
    remoteInterpreterEventPoller2.run();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "InterpreterGroup_1497134410098_-512670828"+ "'", str9.equals("InterpreterGroup_1497134410098_-512670828"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool22);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption1.setPort(10);
    boolean b5 = interpreterOption1.perUserShared();
    boolean b6 = interpreterOption1.perNoteScoped();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool0 = new org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool();
    interpreterContextRunnerPool0.clear("anonymous");

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterProperty> map_str_interpreterProperty3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.Interpreter.register("InterpreterGroup_1497134408026_-794939986", "InterpreterGroup_1497134387007_1195822394", "InterpreterGroup_1497134385425_-1840284417", map_str_interpreterProperty3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = org.apache.zeppelin.helium.HeliumType.NOTEBOOK_REPO;
    org.junit.Assert.assertTrue("'" + heliumType0 + "' != '" + org.apache.zeppelin.helium.HeliumType.NOTEBOOK_REPO + "'", heliumType0.equals(org.apache.zeppelin.helium.HeliumType.NOTEBOOK_REPO));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage4 = new org.apache.zeppelin.interpreter.InterpreterResultMessage(type0, "[null]");
    java.lang.String str5 = interpreterResultMessage4.getData();
    java.lang.String str6 = interpreterResultMessage4.getData();
    java.lang.String str7 = interpreterResultMessage4.getData();
    java.lang.String str8 = interpreterResultMessage4.getData();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]"+ "'", str5.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[null]"+ "'", str6.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[null]"+ "'", str7.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[null]"+ "'", str8.equals("[null]"));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource0 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    remoteZeppelinServerResource0.setOwnerKey("InterpreterGroup_1497134408379_1574252163");
    java.lang.Object obj3 = remoteZeppelinServerResource0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet1 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResourcesExcept("InterpreterGroup_1497134369176_-1878842789");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet1);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    org.apache.zeppelin.resource.Resource resource13 = null;
    // The following exception was thrown during execution in test generation
    try {
    linkedlist_resource2.add((int)'#', resource13);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    org.apache.zeppelin.resource.ResourcePool resourcePool0 = null;
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader2 = new org.apache.zeppelin.helium.ApplicationLoader(resourcePool0, dependencyResolver1);
    org.apache.zeppelin.helium.HeliumType heliumType3 = null;
    java.lang.String[][] str_array_array8 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = new org.apache.zeppelin.helium.HeliumPackage(heliumType3, "", "", "hi!", "hi!", str_array_array8, "post_exec_dev", "post_exec_dev");
    java.lang.String str12 = heliumPackage11.getIcon();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener17 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry18 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener17);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry21 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry18, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject23 = heliumAppAngularObjectRegistry21.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput24 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext25 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry21, interpreterOutput24);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry26 = applicationContext25.getAngularObjectRegistry();
    java.lang.String str27 = applicationContext25.getNoteId();
    java.lang.String str28 = applicationContext25.getApplicationInstanceId();
    java.lang.String str29 = applicationContext25.getNoteId();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.Application application30 = applicationLoader2.load(heliumPackage11, applicationContext25);
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.helium.ApplicationException");
    } catch (org.apache.zeppelin.helium.ApplicationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "post_exec_dev"+ "'", str12.equals("post_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(heliumAppAngularObjectRegistry26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "InterpreterGroup_1497134353138_86992792"+ "'", str27.equals("InterpreterGroup_1497134353138_86992792"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "pre_exec_dev"+ "'", str28.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "InterpreterGroup_1497134353138_86992792"+ "'", str29.equals("InterpreterGroup_1497134353138_86992792"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource0 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    java.lang.String str1 = remoteZeppelinServerResource0.getOwnerKey();
    java.lang.Object obj2 = remoteZeppelinServerResource0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption3 = new org.apache.zeppelin.interpreter.InterpreterOption(false, "InterpreterGroup_1497134377883_708078564", "InterpreterGroup_1497134387851_-94093795");

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    interpreterOption6.setUserImpersonate(false);
    boolean b11 = interpreterOption6.perNoteIsolated();
    interpreterOption6.setRemote(false);
    boolean b14 = interpreterOption6.isExistingProcess();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
    org.apache.zeppelin.helium.ApplicationEventListener applicationEventListener1 = null;
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller remoteInterpreterEventPoller2 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventPoller(remoteInterpreterProcessListener0, applicationEventListener1);
    remoteInterpreterEventPoller2.shutdown();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup4 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool5 = interpreterGroup4.getResourcePool();
    boolean b8 = interpreterGroup4.remove((java.lang.Object)0L, (java.lang.Object)'a');
    java.lang.String str9 = interpreterGroup4.getId();
    remoteInterpreterEventPoller2.setInterpreterGroup(interpreterGroup4);
    remoteInterpreterEventPoller2.run();
    org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage invokeResourceMethodEventMessage12 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener13 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput14 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener13);
    interpreterOutput14.addResourceSearchPath("isolated");
    byte[] byte_array17 = interpreterOutput14.toByteArray();
    remoteInterpreterEventPoller2.sendInvokeMethodResult(invokeResourceMethodEventMessage12, (java.lang.Object)interpreterOutput14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "InterpreterGroup_1497134410556_1275540258"+ "'", str9.equals("InterpreterGroup_1497134410556_1275540258"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = org.apache.zeppelin.interpreter.InterpreterResult.Code.ERROR;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult1 = new org.apache.zeppelin.interpreter.InterpreterResult(code0);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type2 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener3 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput4 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type2, interpreterResultMessageOutputListener3);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type5 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput4.setType(type5);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult8 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, type5, "AngularObject{noteId='null', paragraphId='null', object=null, name='null'}");
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage11 = org.apache.zeppelin.interpreter.ResultMessages.getExceedsLimitSizeMessage((int)(short)1, "InterpreterGroup_1497134350790_986318210");
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage14 = org.apache.zeppelin.interpreter.ResultMessages.getExceedsLimitSizeMessage((int)(short)1, "InterpreterGroup_1497134350790_986318210");
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage17 = org.apache.zeppelin.interpreter.ResultMessages.getExceedsLimitRowsMessage(100, "InterpreterGroup_1497134376971_-1963975868");
    org.apache.zeppelin.interpreter.InterpreterResult.Code code18 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult20 = new org.apache.zeppelin.interpreter.InterpreterResult(code18, "");
    org.apache.zeppelin.interpreter.InterpreterResult.Type type21 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener22 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput23 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type21, interpreterResultMessageOutputListener22);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage24 = interpreterResultMessageOutput23.toInterpreterResultMessage();
    java.lang.String str25 = interpreterResultMessage24.getData();
    interpreterResult20.add(interpreterResultMessage24);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type27 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener28 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput29 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type27, interpreterResultMessageOutputListener28);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage31 = new org.apache.zeppelin.interpreter.InterpreterResultMessage(type27, "[null]");
    java.lang.String str32 = interpreterResultMessage31.getData();
    java.lang.String str33 = interpreterResultMessage31.toString();
    org.apache.zeppelin.tabledata.InterpreterResultTableData interpreterResultTableData34 = new org.apache.zeppelin.tabledata.InterpreterResultTableData(interpreterResultMessage31);
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array35 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] { interpreterResultMessage11, interpreterResultMessage14, interpreterResultMessage17, interpreterResultMessage24, interpreterResultMessage31 };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage36 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage36, interpreterResultMessage_array35);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult38 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage36);
    org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.ERROR + "'", code0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.ERROR));
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type5.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type27.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[null]"+ "'", str32.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "%angular [null]"+ "'", str33.equals("%angular [null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput2 = interpreterOutputStream1.getInterpreterOutput();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type3 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener4 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput5 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type3, interpreterResultMessageOutputListener4);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type6 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput5.setType(type6);
    interpreterResultMessageOutput5.clear();
    interpreterResultMessageOutput5.close();
    interpreterResultMessageOutput5.close();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup11 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str12 = interpreterGroup11.getId();
    boolean b14 = interpreterGroup11.equals((java.lang.Object)0L);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup15 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool16 = interpreterGroup15.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry18 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup15.setInterpreterHookRegistry(interpreterHookRegistry18);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry20 = interpreterGroup15.getAngularObjectRegistry();
    boolean b22 = interpreterGroup11.remove((java.lang.Object)interpreterGroup15, (java.lang.Object)10.0d);
    boolean b23 = interpreterGroup15.isEmpty();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type24 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener25 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput26 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type24, interpreterResultMessageOutputListener25);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage27 = interpreterResultMessageOutput26.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage28 = interpreterResultMessageOutput26.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener29 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput30 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener29);
    interpreterOutput30.addResourceSearchPath("isolated");
    byte[] byte_array33 = interpreterOutput30.toByteArray();
    interpreterResultMessageOutput26.write(byte_array33);
    boolean b35 = interpreterGroup15.containsKey((java.lang.Object)interpreterResultMessageOutput26);
    byte[] byte_array36 = interpreterResultMessageOutput26.toByteArray();
    interpreterResultMessageOutput5.write(byte_array36);
    interpreterOutputStream1.write(byte_array36);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener39 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput40 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener39);
    interpreterOutput40.flush();
    interpreterOutput40.write((int)(short)-1);
    int i44 = interpreterOutput40.size();
    java.net.URL uRL45 = null;
    interpreterOutput40.write(uRL45);
    org.slf4j.Logger logger47 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream48 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger47);
    byte[] byte_array52 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream48.write(byte_array52, (int)'a', 3);
    interpreterOutput40.write(byte_array52);
    interpreterOutputStream1.setInterpreterOutput(interpreterOutput40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput2);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type6.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "InterpreterGroup_1497134410739_-1534144333"+ "'", str12.equals("InterpreterGroup_1497134410739_-1534144333"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array52);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = interpreterResultMessageOutput2.getType();
    java.net.URL uRL5 = null;
    interpreterResultMessageOutput2.write(uRL5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type4);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    org.apache.zeppelin.resource.ResourcePoolUtils.removeResourcesBelongsToNote("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>");

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource resource3 = null;
    linkedlist_resource1.addFirst(resource3);
    org.apache.zeppelin.resource.Resource resource5 = null;
    linkedlist_resource1.addFirst(resource5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    java.lang.Object[] obj_array7 = resourceSet6.toArray();
    org.apache.zeppelin.resource.ResourceSet resourceSet9 = resourceSet6.filterByClassnameRegex("org.apache.zeppelin.interpreter.InterpreterException: ");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener11 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry12 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener11);
    org.apache.zeppelin.resource.Resource[] resource_array14 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource15 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource15, resource_array14);
    org.apache.zeppelin.resource.Resource[] resource_array17 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource18 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource18, resource_array17);
    boolean b20 = arraylist_resource18.isEmpty();
    boolean b21 = linkedlist_resource15.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource18);
    linkedlist_resource15.clear();
    org.apache.zeppelin.display.AngularObject angularObject26 = angularObjectRegistry12.add("_GLOBAL_", (java.lang.Object)linkedlist_resource15, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener27 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput28 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener27);
    interpreterOutput28.flush();
    interpreterOutput28.write((int)(short)-1);
    int i32 = interpreterOutput28.size();
    int i33 = linkedlist_resource15.lastIndexOf((java.lang.Object)i32);
    boolean b34 = resourceSet9.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.display.GUI gUI38 = interpreterContext35.getGui();
    java.lang.Object obj41 = gUI38.textbox("InterpreterGroup_1497134373781_-855626841", "");
    gUI38.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gUI38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + ""+ "'", obj41.equals(""));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = org.apache.zeppelin.interpreter.InterpreterResult.Code.SUCCESS;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult1 = new org.apache.zeppelin.interpreter.InterpreterResult(code0);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code2 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult3 = new org.apache.zeppelin.interpreter.InterpreterResult(code2);
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage4 = interpreterResult3.message();
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult5 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, list_interpreterResultMessage4);
    org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.SUCCESS + "'", code0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.SUCCESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage4);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterProperty> map_str_interpreterProperty3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.Interpreter.register("InterpreterGroup_1497134387007_1195822394", "[null]", "InterpreterGroup_1497134384596_204399223", map_str_interpreterProperty3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    java.nio.ByteBuffer byteBuffer0 = null;
    org.apache.zeppelin.resource.ByteBufferInputStream byteBufferInputStream1 = new org.apache.zeppelin.resource.ByteBufferInputStream(byteBuffer0);
    boolean b2 = byteBufferInputStream1.markSupported();
    boolean b3 = byteBufferInputStream1.markSupported();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet1 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResourcesExcept("InterpreterGroup_1497134378013_-178412288");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet1);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("InterpreterGroup_1497134385425_-1840284417");

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    boolean b3 = interpreterOption2.perNoteShared();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption4 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption2);
    java.util.List<java.lang.String> list_str5 = interpreterOption4.getUsers();
    boolean b6 = interpreterOption4.isExistingProcess();
    boolean b7 = interpreterOption4.isSession();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    org.apache.zeppelin.display.GUI gUI5 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input6 = gUI5.getForms();
    java.lang.Object obj9 = gUI5.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    boolean b10 = interpreterProperty4.equals(obj9);
    java.lang.String str11 = interpreterProperty4.getPropertyName();
    java.lang.String str12 = interpreterProperty4.getEnvName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "1"+ "'", obj9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"+ "'", str11.equals("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "zeppelin.interpreter.port"+ "'", str12.equals("zeppelin.interpreter.port"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("{}");
    java.lang.String str5 = interpreterHookRegistry1.get("InterpreterGroup_1497134374771_373499119", "InterpreterGroup_1497134384557_-1299248309", "InterpreterGroup_1497134410025_-620513103");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    repositoryListener0.metadataDownloading(repositoryEvent3);
    org.sonatype.aether.RepositoryEvent repositoryEvent5 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactDownloaded(repositoryEvent5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    org.apache.zeppelin.dep.TransferListener transferListener0 = new org.apache.zeppelin.dep.TransferListener();
    org.sonatype.aether.transfer.TransferEvent transferEvent1 = null;
    transferListener0.transferStarted(transferEvent1);
    org.sonatype.aether.transfer.TransferEvent transferEvent3 = null;
    transferListener0.transferStarted(transferEvent3);
    org.sonatype.aether.transfer.TransferEvent transferEvent5 = null;
    // The following exception was thrown during execution in test generation
    try {
    transferListener0.transferFailed(transferEvent5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    java.lang.String str1 = angularobject_outputStream0.getParagraphId();
    java.lang.Object obj2 = angularobject_outputStream0.get();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener10 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry11 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener10);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry14 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry11, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject16 = heliumAppAngularObjectRegistry14.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput17 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext18 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry14, interpreterOutput17);
    org.apache.zeppelin.display.AngularObject angularObject20 = heliumAppAngularObjectRegistry14.remove("InterpreterGroup_1497134353138_86992792");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener28 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry29 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener28);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry32 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry29, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject34 = heliumAppAngularObjectRegistry32.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput35 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext36 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry32, interpreterOutput35);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener37 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener38 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput39 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener37, interpreterOutputChangeListener38);
    org.apache.zeppelin.helium.ApplicationContext applicationContext40 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry32, interpreterOutput39);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput41 = applicationContext40.out;
    org.apache.zeppelin.helium.ApplicationContext applicationContext42 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134374771_373499119", "InterpreterGroup_1497134367518_-1467696533", "isolated", heliumAppAngularObjectRegistry14, interpreterOutput41);
    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream43 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type44 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener45 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput46 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type44, interpreterResultMessageOutputListener45);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type47 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput46.setType(type47);
    angularobject_outputStream43.set((java.io.OutputStream)interpreterResultMessageOutput46);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type50 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener51 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput52 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type50, interpreterResultMessageOutputListener51);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage53 = interpreterResultMessageOutput52.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage54 = interpreterResultMessageOutput52.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup55 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry56 = interpreterGroup55.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array57 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource58 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource58, resource_array57);
    org.apache.zeppelin.resource.Resource[] resource_array60 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource61 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource61, resource_array60);
    boolean b63 = arraylist_resource61.isEmpty();
    boolean b64 = linkedlist_resource58.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource61);
    linkedlist_resource58.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter66 = interpreterGroup55.get((java.lang.Object)linkedlist_resource58);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type67 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter68 = interpreterGroup55.get((java.lang.Object)type67);
    interpreterResultMessageOutput52.setType(type67);
    interpreterResultMessageOutput46.setType(type67);
    org.slf4j.Logger logger71 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream72 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger71);
    byte[] byte_array76 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream72.write(byte_array76, (int)'a', 3);
    interpreterResultMessageOutput46.write(byte_array76, (int)'#', 2);
    interpreterOutput41.write(byte_array76);
    angularobject_outputStream0.set((java.io.OutputStream)interpreterOutput41);
    boolean b85 = angularobject_outputStream0.isGlobal();
    java.lang.Object obj86 = angularobject_outputStream0.get();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput41);
    org.junit.Assert.assertTrue("'" + type47 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type47.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter66);
    org.junit.Assert.assertTrue("'" + type67 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type67.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj86);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory2 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService5 = executorFactory2.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess7 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory8 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler10 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService5, "pre_exec_dev", remoteInterpreterProcess7, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory8, (int)(short)1);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess12 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory13 = org.apache.zeppelin.scheduler.SchedulerFactory.singleton();
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess16 = null;
    org.apache.zeppelin.scheduler.Scheduler scheduler18 = schedulerFactory13.createOrGetRemoteScheduler("{}", "_GLOBAL_", remoteInterpreterProcess16, (int)(short)1);
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler20 = new org.apache.zeppelin.scheduler.RemoteScheduler("1", executorService5, "hi!", remoteInterpreterProcess12, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory13, 100);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.scheduler.Scheduler scheduler22 = schedulerFactory13.createOrGetFIFOScheduler("InterpreterGroup_1497134376959_456934766");
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerFactory13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler18);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    boolean b11 = linkedlist_resource1.contains((java.lang.Object)(-1));
    java.lang.Object obj12 = linkedlist_resource1.clone();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array13 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter14 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter14, interpreter_array13);
    boolean b16 = linkedlist_resource1.removeAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter14);
    // The following exception was thrown during execution in test generation
    try {
    java.util.ListIterator<org.apache.zeppelin.resource.Resource> listiterator_resource18 = linkedlist_resource1.listIterator((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.flush();
    interpreterOutput1.write((int)(short)-1);
    int i5 = interpreterOutput1.size();
    java.io.File file6 = null;
    interpreterOutput1.write(file6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    java.util.concurrent.ExecutorService executorService1 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener2 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler3 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService1, schedulerListener2);
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job4 = fIFOScheduler3.getJobsRunning();
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job5 = fIFOScheduler3.getJobsRunning();
    java.lang.String str6 = fIFOScheduler3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str6.equals("org.apache.zeppelin.interpreter.InterpreterException: "));

  }

}
