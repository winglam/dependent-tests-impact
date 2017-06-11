
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLES_DIR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "bundles"+ "'", str0.equals("bundles"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    java.lang.Throwable throwable0 = null;
    java.lang.String str1 = org.apache.zeppelin.scheduler.Job.getStack(throwable0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    org.apache.zeppelin.util.Util util0 = new org.apache.zeppelin.util.Util();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    int i0 = org.apache.commons.configuration.AbstractConfiguration.EVENT_CLEAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DEP_MVNREPO;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DEP_MVNREPO + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DEP_MVNREPO));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.FOLDER_RENAME;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.FOLDER_RENAME + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.FOLDER_RENAME));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.SAVE_INTERPRETER_BINDINGS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.SAVE_INTERPRETER_BINDINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.SAVE_INTERPRETER_BINDINGS));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    java.io.File file0 = null;
    java.io.File file1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.install.InstallInterpreter installInterpreter3 = new org.apache.zeppelin.interpreter.install.InstallInterpreter(file0, file1, "bundles");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.UPDATE_PERSONALIZED_MODE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.UPDATE_PERSONALIZED_MODE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.UPDATE_PERSONALIZED_MODE));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.APP_STATUS_CHANGE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.APP_STATUS_CHANGE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.APP_STATUS_CHANGE));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    java.lang.String str0 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.ZEPPELIN_TOKEN_HEADER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Zeppelin-Token"+ "'", str0.equals("X-Zeppelin-Token"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    java.net.URL uRL0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration(uRL0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo1 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    org.apache.zeppelin.notebook.utility.IdHashes idHashes0 = new org.apache.zeppelin.notebook.utility.IdHashes();

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo1 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.MOVE_NOTE_TO_TRASH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.MOVE_NOTE_TO_TRASH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.MOVE_NOTE_TO_TRASH));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_ALL;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_ALL + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_ALL));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.SESSION_LOGOUT;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.SESSION_LOGOUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.SESSION_LOGOUT));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getScriptBody("bundles");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bundles"+ "'", str1.equals("bundles"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLES_SRC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "load.js"+ "'", str0.equals("load.js"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    int i0 = org.apache.commons.configuration.AbstractConfiguration.EVENT_ADD_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_NOTE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_NOTE));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    int i0 = org.apache.commons.configuration.HierarchicalConfiguration.EVENT_CLEAR_TREE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_MOVED;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_MOVED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_MOVED));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_CONTEXT_PATH;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_CONTEXT_PATH + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_CONTEXT_PATH));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLE_CACHE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "helium.bundle.cache.js"+ "'", str0.equals("helium.bundle.cache.js"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLES_VAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "heliumBundles"+ "'", str0.equals("heliumBundles"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_CONNECTION_STRING;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_CONNECTION_STRING + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_CONNECTION_STRING));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PATH;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PATH + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PATH));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    java.lang.String str0 = org.apache.zeppelin.notebook.Folder.TRASH_FOLDER_CONFLICT_INFIX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + " "+ "'", str0.equals(" "));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.REMOVE_FOLDER;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.REMOVE_FOLDER + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.REMOVE_FOLDER));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    int i0 = org.apache.commons.configuration.AbstractConfiguration.EVENT_SET_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj7 = helium5.getSpellConfig("helium.bundle.cache.js");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.AzureNotebookRepo azureNotebookRepo1 = new org.apache.zeppelin.notebook.repo.AzureNotebookRepo(zeppelinConfiguration0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult8 = helium5.getPackageInfo("anonymous", "anonymous");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.lang.String[] str_array11 = new java.lang.String[] { "load.js", "load.js", "hi!", "helium.bundle.cache.js", " " };
    java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str12, str_array11);
    // The following exception was thrown during execution in test generation
    try {
    helium5.setVisualizationPackageOrder((java.util.List<java.lang.String>)arraylist_str12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETERS;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETERS + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETERS));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "helium.bundle.js"+ "'", str0.equals("helium.bundle.js"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.ZEPPELIN_STATUS;
    org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.ZEPPELIN_STATUS + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.ZEPPELIN_STATUS));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("anonymous");
    java.lang.String[] str_array10 = new java.lang.String[] { "", "heliumBundles" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    // The following exception was thrown during execution in test generation
    try {
    helium5.setVisualizationPackageOrder((java.util.List<java.lang.String>)arraylist_str11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CONF_DIR;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CONF_DIR + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CONF_DIR));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.AUTH_INFO;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.AUTH_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.AUTH_INFO));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Note note1 = org.apache.zeppelin.notebook.Note.fromJson("X-Zeppelin-Token");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_REMOVE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_REMOVE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_REMOVE));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    java.io.File file11 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory12 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory13 = null;
    org.apache.zeppelin.helium.Helium helium14 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file11, heliumBundleFactory12, heliumApplicationFactory13);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj16 = helium14.getPackagePersistedConfig("X-Zeppelin-Token");
    // The following exception was thrown during execution in test generation
    try {
    helium5.updatePackageConfig("helium.bundle.cache.js", map_str_obj16);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj16);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CREDENTIALS_PERSIST;
    float f1 = confVars0.getFloatValue();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CREDENTIALS_PERSIST + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CREDENTIALS_PERSIST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == (-1.0f));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    org.apache.commons.configuration.AbstractConfiguration.setDelimiter('a');

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_ID;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_ID + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_ID));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type0.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
    java.lang.String str1 = notebookRepoSettingsInfo0.name;
    java.lang.String str2 = notebookRepoSettingsInfo0.name;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("bundles");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_PORT;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_PORT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_PORT));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADED;
    org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADED + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADED));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer0 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userTokenContainer0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    org.apache.commons.configuration.AbstractConfiguration.setDefaultListDelimiter('#');

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    java.lang.String str0 = org.apache.zeppelin.notebook.Folder.ROOT_FOLDER_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/"+ "'", str0.equals("/"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_DEFAULT_DIR_ALLOWED;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_DEFAULT_DIR_ALLOWED + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_DEFAULT_DIR_ALLOWED));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
    org.apache.zeppelin.search.SearchService searchService6 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization7 = null;
    org.apache.zeppelin.user.Credentials credentials8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Notebook notebook9 = new org.apache.zeppelin.notebook.Notebook(zeppelinConfiguration0, notebookRepo1, schedulerFactory2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, notebookAuthorization7, credentials8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RUN_ALL_PARAGRAPHS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RUN_ALL_PARAGRAPHS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RUN_ALL_PARAGRAPHS));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_LOCALREPO;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_LOCALREPO + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_LOCALREPO));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PASSWORD;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PASSWORD + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PASSWORD));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    java.lang.String str0 = org.apache.zeppelin.util.Util.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "0.8.0-SNAPSHOT"+ "'", str0.equals("0.8.0-SNAPSHOT"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils zeppelinhubUtils0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils();

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.ERROR;
    org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.ERROR + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.ERROR));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication2 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("heliumBundles", zeppelinConfiguration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(authentication2);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.WELCOME;
    org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.WELCOME + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.WELCOME));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    org.apache.zeppelin.notebook.Note note0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.NoteInfo noteInfo1 = new org.apache.zeppelin.notebook.NoteInfo(note0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH_USING_SPELL;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH_USING_SPELL + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH_USING_SPELL));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.notebook.Notebook.CronJob.notebook = notebook0;

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLES_SRC_DIR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "src"+ "'", str0.equals("src"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    java.lang.String str0 = org.apache.zeppelin.notebook.Folder.TRASH_FOLDER_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "~Trash"+ "'", str0.equals("~Trash"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    org.eclipse.jetty.websocket.api.Session session0 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, "");
    zeppelinhubSession2.sendByFuture("load.js");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubSession2);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_CONFIGURATIONS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_CONFIGURATIONS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_CONFIGURATIONS));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.pingMessage("bundles");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}"+ "'", str1.equals("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    java.io.File file0 = null;
    java.io.File file1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.install.InstallInterpreter installInterpreter3 = new org.apache.zeppelin.interpreter.install.InstallInterpreter(file0, file1, "heliumBundles");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer userSessionContainer0 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer.instance;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userSessionContainer0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION_LIST;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION_LIST + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION_LIST));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    org.apache.commons.configuration.AbstractConfiguration.setDelimiter('4');

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    // The following exception was thrown during execution in test generation
    try {
    zeppelinhubClient2.send("bundles", "src");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(client0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_ALL_OUTPUT;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_ALL_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_ALL_OUTPUT));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook1 = heliumApplicationFactory0.getNotebook();
    org.apache.zeppelin.notebook.Note note2 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    // The following exception was thrown during execution in test generation
    try {
    heliumApplicationFactory0.onUnbindInterpreter(note2, interpreterSetting3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    java.io.File file1 = null;
    java.io.File file2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file1, file2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAS_INFO;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAS_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAS_INFO));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    org.eclipse.jetty.websocket.api.Session session0 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, "");
    boolean b3 = zeppelinhubSession2.isSessionOpen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubSession2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook1 = heliumApplicationFactory0.getNotebook();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage2 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = heliumApplicationFactory0.loadAndRun(heliumPackage2, paragraph3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook1);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_BINDINGS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_BINDINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_BINDINGS));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_ADDED;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_ADDED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_ADDED));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener2 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory3 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver4 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory7 = new org.apache.zeppelin.interpreter.InterpreterFactory(zeppelinConfiguration0, angularObjectRegistryListener1, remoteInterpreterProcessListener2, (org.apache.zeppelin.helium.ApplicationEventListener)heliumApplicationFactory3, dependencyResolver4, false, interpreterSettingManager6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVE));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RELOAD_NOTES_FROM_REPO;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RELOAD_NOTES_FROM_REPO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RELOAD_NOTES_FROM_REPO));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getSinglePackageInfo("");
    org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumPackageSuggestion heliumPackageSuggestion11 = helium5.suggestApp(paragraph10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult9);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    java.net.URI uRI0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.HttpProxyClient httpProxyClient1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.HttpProxyClient.newInstance(uRI0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.lang.String str3 = heliumLocalRegistry2.uri();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "heliumBundles"+ "'", str3.equals("heliumBundles"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    int i0 = org.apache.commons.configuration.HierarchicalConfiguration.EVENT_SUBNODE_CHANGED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 12);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    java.io.File file6 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = null;
    org.apache.zeppelin.helium.Helium helium9 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file6, heliumBundleFactory7, heliumApplicationFactory8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium9.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj11);
    java.io.File file15 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory16 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory17 = null;
    org.apache.zeppelin.helium.Helium helium18 = new org.apache.zeppelin.helium.Helium("hi!", "", file15, heliumBundleFactory16, heliumApplicationFactory17);
    java.io.File file22 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory23 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory24 = null;
    org.apache.zeppelin.helium.Helium helium25 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file22, heliumBundleFactory23, heliumApplicationFactory24);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj27 = helium25.getPackagePersistedConfig("X-Zeppelin-Token");
    helium18.updatePackageConfig("helium.bundle.cache.js", map_str_obj27);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj29 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj11, map_str_obj27);
    org.apache.zeppelin.notebook.NoteInfo noteInfo30 = new org.apache.zeppelin.notebook.NoteInfo("helium.bundle.cache.js", "0.8.0-SNAPSHOT", map_str_obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj29);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_BINDINGS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_BINDINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_BINDINGS));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_ENDPOINT;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_ENDPOINT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_ENDPOINT));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PING;
    org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PING + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PING));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.DEL_NOTE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.DEL_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.DEL_NOTE));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_LOCAL_MODULE_DIR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "local_modules"+ "'", str0.equals("local_modules"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.GET_NOTE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_NOTE));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    helium5.save();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult11 = helium5.getPackageInfo("bundles", " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ENCODING;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ENCODING + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ENCODING));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str1 = message0.principal;
    java.lang.String str2 = message0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Message{data={}, op=null}"+ "'", str2.equals("Message{data={}, op=null}"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    boolean b8 = note7.isPersonalizedMode();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo9 = null;
    // The following exception was thrown during execution in test generation
    try {
    note7.persist(authenticationInfo9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.DEAD;
    org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.DEAD + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.DEAD));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_TYPE;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_TYPE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_TYPE));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.lang.String str3 = heliumLocalRegistry2.name();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "helium.bundle.cache.js"+ "'", str3.equals("helium.bundle.cache.js"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.LOADED;
    org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.LOADED + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.LOADED));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_EMP;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_EMP + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_EMP));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_LOCAL_REPO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "helium-bundle"+ "'", str0.equals("helium-bundle"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.UNSUBSCRIBE_UPDATE_NOTE_JOBS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.UNSUBSCRIBE_UPDATE_NOTE_JOBS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.UNSUBSCRIBE_UPDATE_NOTE_JOBS));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATED;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATED));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_BIND;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_BIND + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_BIND));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    org.apache.zeppelin.user.Credentials credentials8 = null;
    note7.setCredentials(credentials8);
    org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
    // The following exception was thrown during execution in test generation
    try {
    note7.initializeJobListenerForParagraph(paragraph10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.io.File file9 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory10 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory11 = null;
    org.apache.zeppelin.helium.Helium helium12 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file9, heliumBundleFactory10, heliumApplicationFactory11);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj14 = helium12.getPackagePersistedConfig("X-Zeppelin-Token");
    helium5.updatePackageConfig("helium.bundle.cache.js", map_str_obj14);
    java.lang.String[] str_array23 = new java.lang.String[] { "anonymous", "src", "helium-bundle", "helium-bundle", "helium.bundle.cache.js", "~Trash", "helium-bundle" };
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array23);
    // The following exception was thrown during execution in test generation
    try {
    helium5.setVisualizationPackageOrder((java.util.List<java.lang.String>)arraylist_str24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str1 = message0.principal;
    java.io.File file6 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = null;
    org.apache.zeppelin.helium.Helium helium9 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file6, heliumBundleFactory7, heliumApplicationFactory8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium9.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj11);
    message0.data = map_str_obj11;
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage15 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message0, map_str_str14);
    java.lang.Object obj16 = zeppelinhubMessage15.data;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_NPM_REGISTRY;
    long long1 = confVars0.getLongValue();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_NPM_REGISTRY + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_NPM_REGISTRY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == (-1L));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.liveMessage("helium-bundle");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}"+ "'", str1.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    java.lang.String str5 = zeppelinhubClient2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_OUTPUT_LIMIT;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_OUTPUT_LIMIT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_OUTPUT_LIMIT));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_REGISTRY;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_REGISTRY + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_REGISTRY));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_UNBIND;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_UNBIND + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_UNBIND));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_REGION;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_REGION + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_REGION));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PROGRESS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PROGRESS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PROGRESS));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATED;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATED));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    org.apache.commons.configuration.AbstractConfiguration.setDelimiter(' ');

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN_HIDE;
    float f1 = confVars0.getFloatValue();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN_HIDE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN_HIDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == (-1.0f));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving notebookAuthorizationInfoSaving0 = new org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Set<java.lang.String>>> map_str_map_str_set_str1 = notebookAuthorizationInfoSaving0.authInfo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_map_str_set_str1);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.List<java.lang.String> list_str6 = helium5.setVisualizationPackageOrder();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj9 = helium5.getPackageConfig("", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    java.lang.String str0 = org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo.TOKEN_HEADER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Zeppelin-Token"+ "'", str0.equals("X-Zeppelin-Token"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting0);
    java.lang.String str2 = interpreterSetting1.getPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str1 = message0.principal;
    java.io.File file6 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = null;
    org.apache.zeppelin.helium.Helium helium9 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file6, heliumBundleFactory7, heliumApplicationFactory8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium9.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj11);
    message0.data = map_str_obj11;
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage15 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message0, map_str_str14);
    message0.principal = "load.js";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage15);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WAR_TEMPDIR;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WAR_TEMPDIR + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WAR_TEMPDIR));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder5 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder3.merge(folder5);
    folder1.merge(folder3);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Folder> map_str_folder8 = folder1.getChildren();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_folder8);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    char char0 = org.apache.commons.configuration.AbstractConfiguration.getDefaultListDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char0 == ' ');

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook1 = heliumApplicationFactory0.getNotebook();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type6 = null;
    heliumApplicationFactory0.onOutputUpdated("helium.bundle.cache.js", "hi!", 1, "~Trash", type6, "heliumBundles");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook1);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_CONNECT_TIMEOUT;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_CONNECT_TIMEOUT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_CONNECT_TIMEOUT));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.List<java.lang.String> list_str6 = helium5.setVisualizationPackageOrder();
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult8 = helium5.getSinglePackageInfo("bundles");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult8);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = org.apache.zeppelin.notebook.Notebook.CronJob.notebook;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COPY_PARAGRAPH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COPY_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COPY_PARAGRAPH));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_USER;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_USER + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_USER));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    java.lang.String str0 = org.apache.zeppelin.util.WatcherSecurityKey.HTTP_HEADER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Watcher-Key"+ "'", str0.equals("X-Watcher-Key"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    helium5.save();
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult9 = helium5.getAllPackageInfoWithoutRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult9);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    interpreterSetting0.setErrorReason("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    java.lang.String str3 = interpreterSetting0.getName();
    java.util.Map<java.lang.String,java.util.Set<java.lang.String>> map_str_set_str4 = interpreterSetting0.getNoteIdAndParaMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_set_str4);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.stopUser("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    note7.moveParagraph("0.8.0-SNAPSHOT", (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion16 = note7.completion("local_modules", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "hi!");

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("heliumBundles");
    zeppelinWebsocket1.onWebSocketText(" ");
    zeppelinWebsocket1.onWebSocketText("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo zeppelinHubRepo1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo(zeppelinConfiguration0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    java.lang.String str0 = org.apache.zeppelin.notebook.utility.IdHashes.generateId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "2CJB2PWE5"+ "'", str0.equals("2CJB2PWE5"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinOp("heliumBundles");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(oP1);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
    org.apache.zeppelin.search.SearchService searchService6 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization7 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.lang.String[] str_array18 = new java.lang.String[] { "1d225366-166b-4915-87f9-e54c61e0f003", "heliumBundles", "helium.bundle.cache.js", "helium.bundle.cache.js", "local_modules", "X-Zeppelin-Token", "/", "bundles", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str19, str_array18);
    notebookAuthorization7.setRoles("bundles", (java.util.Set<java.lang.String>)linkedhashset_str19);
    java.lang.String[] str_array34 = new java.lang.String[] { "bundles", "", "bundles", "hi!", "src", "X-Zeppelin-Token", "", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "helium.bundle.js", "0.8.0-SNAPSHOT", "helium.bundle.js", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array34);
    boolean b38 = notebookAuthorization7.hasReadAuthorization((java.util.Set<java.lang.String>)linkedhashset_str35, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.user.Credentials credentials39 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Notebook notebook40 = new org.apache.zeppelin.notebook.Notebook(zeppelinConfiguration0, notebookRepo1, schedulerFactory2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, notebookAuthorization7, credentials39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
    org.eclipse.jetty.websocket.api.Session session1 = watcherWebsocket0.connection;
    // The following exception was thrown during execution in test generation
    try {
    watcherWebsocket0.onWebSocketText("helium.bundle.js");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(watcherWebsocket0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session1);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinOp("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph10 = note7.getParagraphs();
    note7.runAll();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Paragraph paragraph12 = note7.getLastParagraph();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph10);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    org.apache.zeppelin.notebook.Paragraph paragraph6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumPackageSuggestion heliumPackageSuggestion7 = helium5.suggestApp(paragraph6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry8 = null;
    helium5.addRegistry(heliumRegistry8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium5.getPackagePersistedConfig("heliumBundles");
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage12 = helium5.getBundlePackagesToBundle();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.zeppelin.notebook.Folder.normalizeFolderId("");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str1 = message0.principal;
    java.io.File file6 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = null;
    org.apache.zeppelin.helium.Helium helium9 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file6, heliumBundleFactory7, heliumApplicationFactory8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium9.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj11);
    message0.data = map_str_obj11;
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage15 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message0, map_str_str14);
    java.util.Map<java.lang.String,java.lang.String> map_str_str16 = zeppelinhubMessage15.meta;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "load.js"+ "'", str1.equals("load.js"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str16);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.merge(folder3);
    boolean b5 = folder3.hasChild();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo6 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory7 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager8 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory9 = null;
    org.apache.zeppelin.search.SearchService searchService10 = null;
    org.apache.zeppelin.user.Credentials credentials11 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener12 = null;
    org.apache.zeppelin.notebook.Note note13 = new org.apache.zeppelin.notebook.Note(notebookRepo6, interpreterFactory7, interpreterSettingManager8, jobListenerFactory9, searchService10, credentials11, noteEventListener12);
    note13.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph16 = note13.getParagraphs();
    folder3.removeNote(note13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph16);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.merge(folder3);
    boolean b5 = folder3.hasChild();
    org.apache.zeppelin.notebook.Folder folder7 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder9 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder7.merge(folder9);
    folder3.addChild(folder9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj1 = message0.data;
    message0.ticket = "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array5 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo6 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo6, interpreterInfo_array5);
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry10 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage11 = heliumLocalRegistry10.getAll();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency12 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting13 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup14 = interpreterSetting13.getAllInterpreterGroups();
    java.lang.String str15 = interpreterSetting13.getErrorReason();
    java.lang.String str16 = interpreterSetting13.getId();
    interpreterSetting13.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption19 = interpreterSetting13.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner21 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting22 = new org.apache.zeppelin.interpreter.InterpreterSetting("1d225366-166b-4915-87f9-e54c61e0f003", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "anonymous", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo6, (java.lang.Object)heliumLocalRegistry10, list_dependency12, interpreterOption19, "heliumBundles", interpreterRunner21);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager23 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, dependencyResolver1, interpreterOption19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption19);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinHubOp("helium.bundle.cache.js");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(zeppelinHubOp1);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    java.io.File file0 = null;
    java.io.File file1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str2 = org.apache.zeppelin.helium.HeliumBundleFactory.unTgz(file0, file1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.handleMsgFromZeppelinHub("hi!");
    zeppelinhubClient2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = interpreterInfoSaving0.interpreterBindings;
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str2 = null;
    interpreterInfoSaving0.interpreterBindings = map_str_list_str2;
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterSetting> map_str_interpreterSetting4 = interpreterInfoSaving0.interpreterSettings;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_interpreterSetting4);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_SSE;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_SSE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_SSE));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinOp("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.MOVE_FOLDER_TO_TRASH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.MOVE_FOLDER_TO_TRASH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.MOVE_FOLDER_TO_TRASH));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.APP_LOAD;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.APP_LOAD + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.APP_LOAD));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    org.apache.zeppelin.user.Credentials credentials8 = null;
    note7.setCredentials(credentials8);
    boolean b10 = note7.isPersonalizedMode();
    java.lang.String str11 = note7.getFolderId();
    org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo(note7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "/"+ "'", str11.equals("/"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_FOLDER;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_FOLDER + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_FOLDER));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj1 = message0.data;
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message0, map_str_str2);
    java.lang.String str4 = zeppelinhubMessage3.serialize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{\"data\":{}}"+ "'", str4.equals("{\"data\":{}}"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry8 = null;
    helium5.addRegistry(heliumRegistry8);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj12 = helium5.getPackageConfig("heliumBundles", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    org.eclipse.jetty.websocket.api.Session session0 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, "");
    zeppelinhubSession2.close();
    zeppelinhubSession2.sendByFuture("2CJB2PWE5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubSession2);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    // The following exception was thrown during execution in test generation
    try {
    org.eclipse.jetty.websocket.api.Session session7 = zeppelinClient3.getZeppelinConnection("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_EXECUTED_BY_SPELL;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_EXECUTED_BY_SPELL + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_EXECUTED_BY_SPELL));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CHECKPOINT_NOTE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CHECKPOINT_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CHECKPOINT_NOTE));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    org.apache.commons.configuration.tree.ExpressionEngine expressionEngine0 = org.apache.commons.configuration.HierarchicalConfiguration.getDefaultExpressionEngine();
    org.apache.commons.configuration.HierarchicalConfiguration.setDefaultExpressionEngine(expressionEngine0);
    org.apache.commons.configuration.HierarchicalConfiguration.setDefaultExpressionEngine(expressionEngine0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(expressionEngine0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.LOADING;
    org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.LOADING + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.LOADING));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder3 = builder1.className(" ");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings4 = builder3.build();
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder6 = builder3.className("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder6);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PONG;
    org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PONG + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PONG));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_PORT;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_PORT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_PORT));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str1 = message0.principal;
    java.io.File file6 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = null;
    org.apache.zeppelin.helium.Helium helium9 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file6, heliumBundleFactory7, heliumApplicationFactory8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium9.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj11);
    message0.data = map_str_obj11;
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage15 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message0, map_str_str14);
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory16 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook17 = null;
    heliumApplicationFactory16.setNotebook(notebook17);
    zeppelinhubMessage15.data = notebook17;
    org.apache.zeppelin.notebook.socket.Message message20 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    org.apache.zeppelin.notebook.socket.Message.OP oP21 = message20.op;
    message20.principal = "";
    zeppelinhubMessage15.data = message20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "load.js"+ "'", str1.equals("load.js"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(oP21);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    interpreterSetting0.setErrorReason("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    java.lang.String str6 = interpreterSetting3.getId();
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array10 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo11 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo11, interpreterInfo_array10);
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry15 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage16 = heliumLocalRegistry15.getAll();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency17 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting18 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup19 = interpreterSetting18.getAllInterpreterGroups();
    java.lang.String str20 = interpreterSetting18.getErrorReason();
    java.lang.String str21 = interpreterSetting18.getId();
    interpreterSetting18.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption24 = interpreterSetting18.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner26 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting27 = new org.apache.zeppelin.interpreter.InterpreterSetting("1d225366-166b-4915-87f9-e54c61e0f003", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "anonymous", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo11, (java.lang.Object)heliumLocalRegistry15, list_dependency17, interpreterOption24, "heliumBundles", interpreterRunner26);
    interpreterSetting3.setOption(interpreterOption24);
    interpreterSetting0.setOption(interpreterOption24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption24);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient0 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient0);
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHeartbeat1.run();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinHeartbeat1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("helium-bundle");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = zeppelinhubRestApiHandler1.putWithResponseBody("helium.bundle.js", "Message{data={}, op=null}", "helium-bundle");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.SET_NOTE_REVISION;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.SET_NOTE_REVISION + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.SET_NOTE_REVISION));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
    org.apache.zeppelin.search.LuceneSearch luceneSearch6 = new org.apache.zeppelin.search.LuceneSearch();
    luceneSearch6.close();
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str9 = luceneSearch6.query("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization10 = null;
    org.apache.zeppelin.user.Credentials credentials11 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Notebook notebook12 = new org.apache.zeppelin.notebook.Notebook(zeppelinConfiguration0, notebookRepo1, schedulerFactory2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, (org.apache.zeppelin.search.SearchService)luceneSearch6, notebookAuthorization10, credentials11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_map_str_str9);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup1 = interpreterSetting0.getAllInterpreterGroups();
    java.lang.String str2 = interpreterSetting0.getErrorReason();
    java.lang.String str3 = interpreterSetting0.getId();
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array9 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo10 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, interpreterInfo_array9);
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry14 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage15 = heliumLocalRegistry14.getAll();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency16 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting17 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup18 = interpreterSetting17.getAllInterpreterGroups();
    java.lang.String str19 = interpreterSetting17.getErrorReason();
    java.lang.String str20 = interpreterSetting17.getId();
    interpreterSetting17.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption23 = interpreterSetting17.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner25 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting26 = new org.apache.zeppelin.interpreter.InterpreterSetting("1d225366-166b-4915-87f9-e54c61e0f003", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "anonymous", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, (java.lang.Object)heliumLocalRegistry14, list_dependency16, interpreterOption23, "heliumBundles", interpreterRunner25);
    java.lang.Object obj27 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array28 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency29 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency29, dependency_array28);
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting31 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup32 = interpreterSetting31.getAllInterpreterGroups();
    java.lang.String str33 = interpreterSetting31.getErrorReason();
    java.lang.String str34 = interpreterSetting31.getId();
    interpreterSetting31.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption37 = interpreterSetting31.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner39 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting40 = new org.apache.zeppelin.interpreter.InterpreterSetting("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "helium-bundle", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, obj27, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency29, interpreterOption37, "", interpreterRunner39);
    interpreterSetting0.setOption(interpreterOption37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption37);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HOME;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HOME + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HOME));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
    luceneSearch0.close();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
    org.apache.zeppelin.search.SearchService searchService6 = null;
    org.apache.zeppelin.user.Credentials credentials7 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
    org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
    boolean b10 = note9.isPersonalizedMode();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = note9.getInfo();
    // The following exception was thrown during execution in test generation
    try {
    luceneSearch0.deleteIndexDocs(note9);
      org.junit.Assert.fail("Expected exception of type org.apache.lucene.store.AlreadyClosedException");
    } catch (org.apache.lucene.store.AlreadyClosedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = interpreterInfoSaving0.interpreterBindings;
    org.sonatype.aether.repository.RemoteRepository[] remoteRepository_array2 = new org.sonatype.aether.repository.RemoteRepository[] {  };
    java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository> arraylist_remoteRepository3 = new java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.sonatype.aether.repository.RemoteRepository>)arraylist_remoteRepository3, remoteRepository_array2);
    interpreterInfoSaving0.interpreterRepositories = arraylist_remoteRepository3;
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str6 = interpreterInfoSaving0.interpreterBindings;
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str7 = interpreterInfoSaving0.interpreterBindings;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(remoteRepository_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str7);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str5 = message4.principal;
    java.io.File file10 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory11 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory12 = null;
    org.apache.zeppelin.helium.Helium helium13 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file10, heliumBundleFactory11, heliumApplicationFactory12);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj15 = helium13.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo16 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj15);
    message4.data = map_str_obj15;
    java.lang.String str18 = zeppelinClient3.serialize(message4);
    zeppelinClient3.start();
    org.apache.zeppelin.notebook.socket.Message message21 = zeppelinClient3.deserialize("1d225366-166b-4915-87f9-e54c61e0f003");
    org.apache.zeppelin.notebook.socket.Message.OP oP22 = org.apache.zeppelin.notebook.socket.Message.OP.ERROR_INFO;
    org.apache.zeppelin.notebook.socket.Message message23 = new org.apache.zeppelin.notebook.socket.Message(oP22);
    java.lang.String str24 = zeppelinClient3.serialize(message23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str18.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(message21);
    org.junit.Assert.assertTrue("'" + oP22 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ERROR_INFO + "'", oP22.equals(org.apache.zeppelin.notebook.socket.Message.OP.ERROR_INFO));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}"+ "'", str24.equals("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    java.lang.String str10 = note7.getNameWithoutPath();
    boolean b12 = note7.isLastParagraph(" ");
    // The following exception was thrown during execution in test generation
    try {
    note7.moveParagraph("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", (-1), true);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.8.0-SNAPSHOT"+ "'", str10.equals("0.8.0-SNAPSHOT"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
    org.apache.zeppelin.search.LuceneSearch luceneSearch6 = new org.apache.zeppelin.search.LuceneSearch();
    luceneSearch6.close();
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str9 = luceneSearch6.query("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization10 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.io.File file15 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory16 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory17 = null;
    org.apache.zeppelin.helium.Helium helium18 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file15, heliumBundleFactory16, heliumApplicationFactory17);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj20 = helium18.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo21 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj20);
    java.lang.String str22 = noteInfo21.getName();
    java.io.File file27 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory28 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = null;
    org.apache.zeppelin.helium.Helium helium30 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file27, heliumBundleFactory28, heliumApplicationFactory29);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj32 = helium30.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo33 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj32);
    noteInfo21.setConfig(map_str_obj32);
    java.io.File file41 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory42 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory43 = null;
    org.apache.zeppelin.helium.Helium helium44 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file41, heliumBundleFactory42, heliumApplicationFactory43);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj46 = helium44.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo47 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj46);
    java.io.File file50 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory51 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory52 = null;
    org.apache.zeppelin.helium.Helium helium53 = new org.apache.zeppelin.helium.Helium("hi!", "", file50, heliumBundleFactory51, heliumApplicationFactory52);
    java.io.File file57 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory58 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory59 = null;
    org.apache.zeppelin.helium.Helium helium60 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file57, heliumBundleFactory58, heliumApplicationFactory59);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj62 = helium60.getPackagePersistedConfig("X-Zeppelin-Token");
    helium53.updatePackageConfig("helium.bundle.cache.js", map_str_obj62);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj64 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj46, map_str_obj62);
    org.apache.zeppelin.notebook.NoteInfo noteInfo65 = new org.apache.zeppelin.notebook.NoteInfo("helium.bundle.cache.js", "0.8.0-SNAPSHOT", map_str_obj62);
    java.io.File file70 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory71 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory72 = null;
    org.apache.zeppelin.helium.Helium helium73 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file70, heliumBundleFactory71, heliumApplicationFactory72);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj75 = helium73.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo76 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj75);
    java.lang.String str77 = noteInfo76.getName();
    java.io.File file82 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory83 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory84 = null;
    org.apache.zeppelin.helium.Helium helium85 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file82, heliumBundleFactory83, heliumApplicationFactory84);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj87 = helium85.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo88 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj87);
    noteInfo76.setConfig(map_str_obj87);
    org.apache.zeppelin.notebook.NoteInfo[] noteInfo_array90 = new org.apache.zeppelin.notebook.NoteInfo[] { noteInfo21, noteInfo65, noteInfo76 };
    java.util.ArrayList<org.apache.zeppelin.notebook.NoteInfo> arraylist_noteInfo91 = new java.util.ArrayList<org.apache.zeppelin.notebook.NoteInfo>();
    boolean b92 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.notebook.NoteInfo>)arraylist_noteInfo91, noteInfo_array90);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo93 = null;
    java.util.List<org.apache.zeppelin.notebook.NoteInfo> list_noteInfo94 = notebookAuthorization10.filterByUser((java.util.List<org.apache.zeppelin.notebook.NoteInfo>)arraylist_noteInfo91, authenticationInfo93);
    org.apache.zeppelin.user.Credentials credentials95 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Notebook notebook96 = new org.apache.zeppelin.notebook.Notebook(zeppelinConfiguration0, notebookRepo1, schedulerFactory2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, (org.apache.zeppelin.search.SearchService)luceneSearch6, notebookAuthorization10, credentials95);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_map_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str22.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str77.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(noteInfo_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_noteInfo94);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTES;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTES + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTES));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    note7.moveParagraph("0.8.0-SNAPSHOT", (int)(byte)1);
    org.apache.zeppelin.notebook.Paragraph paragraph13 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage15 = null;
    note7.onOutputUpdate(paragraph13, 100, interpreterResultMessage15);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion20 = note7.completion("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "X-Zeppelin-Token", 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_RENAME;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_RENAME + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_RENAME));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    org.apache.zeppelin.user.Credentials credentials8 = null;
    note7.setCredentials(credentials8);
    boolean b10 = note7.isPersonalizedMode();
    boolean b11 = note7.isTrash();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo1 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory0.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.helium.HeliumPackage heliumPackage15 = null;
    heliumApplicationFactory0.onLoad("", "local_modules", "anonymous", heliumPackage15);
    org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.ApplicationState applicationState19 = heliumApplicationFactory0.get(paragraph17, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.GET_HOME_NOTE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_HOME_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_HOME_NOTE));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userSwitchTokenRoutine("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "~Trash", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    org.apache.zeppelin.notebook.Paragraph paragraph6 = null;
    // The following exception was thrown during execution in test generation
    try {
    heliumApplicationFactory0.onParagraphRemove(paragraph6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CLONE_NOTE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CLONE_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CLONE_NOTE));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CREDENTIALS_PERSIST;
    java.lang.String str1 = confVars0.getStringValue();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CREDENTIALS_PERSIST + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CREDENTIALS_PERSIST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getRequiredReplName("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    org.apache.zeppelin.user.Credentials credentials8 = null;
    note7.setCredentials(credentials8);
    org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
    // The following exception was thrown during execution in test generation
    try {
    note7.clearParagraphOutputFields(paragraph10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_SETTINGS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_SETTINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_SETTINGS));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    java.util.Map<java.lang.String,java.lang.Object> map_str_obj2 = null;
    org.apache.zeppelin.notebook.NoteInfo noteInfo3 = new org.apache.zeppelin.notebook.NoteInfo("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", " ", map_str_obj2);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting0);
    org.apache.zeppelin.dep.Dependency[] dependency_array2 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency3 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency3, dependency_array2);
    interpreterSetting0.setDependencies((java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph10 = note7.getParagraphs();
    org.apache.zeppelin.user.Credentials credentials11 = note7.getCredentials();
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph12 = note7.getParagraphs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(credentials11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph12);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer0 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
    com.google.gson.JsonElement jsonElement1 = null;
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars2 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD;
    long long3 = confVars2.getLongValue();
    java.lang.Class class4 = confVars2.getVarClass();
    com.google.gson.JsonDeserializationContext jsonDeserializationContext5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry6 = heliumRegistrySerializer0.deserialize(jsonElement1, (java.lang.reflect.Type)class4, jsonDeserializationContext5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + confVars2 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD + "'", confVars2.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class4);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
    org.eclipse.jetty.websocket.api.Session session1 = watcherWebsocket0.connection;
    org.eclipse.jetty.websocket.api.Session session2 = null;
    // The following exception was thrown during execution in test generation
    try {
    watcherWebsocket0.onWebSocketConnect(session2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(watcherWebsocket0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session1);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    boolean b8 = note7.isPersonalizedMode();
    boolean b10 = note7.isLastParagraph("load.js");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Paragraph paragraph13 = note7.removeParagraph("X-Watcher-Key", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array2 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo3 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo3, interpreterInfo_array2);
    org.apache.zeppelin.dep.Dependency[] dependency_array6 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency7 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency7, dependency_array6);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption9 = null;
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner11 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting12 = new org.apache.zeppelin.interpreter.InterpreterSetting("anonymous", "hi!", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo3, (java.lang.Object)"~Trash", (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency7, interpreterOption9, "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", interpreterRunner11);
    java.lang.String str13 = interpreterSetting12.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "anonymous"+ "'", str13.equals("anonymous"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.handleMsgFromZeppelinHub("hi!");
    zeppelinhubClient2.initUser("helium.bundle.js");
    zeppelinhubClient2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.merge(folder3);
    boolean b5 = folder3.hasChild();
    folder3.rename("X-Watcher-Key");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CANCEL_PARAGRAPH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CANCEL_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CANCEL_PARAGRAPH));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_BUCKET;
    boolean b1 = confVars0.getBooleanValue();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_BUCKET + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_BUCKET));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.MOVE_PARAGRAPH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.MOVE_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.MOVE_PARAGRAPH));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    org.eclipse.jetty.websocket.api.Session session0 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, "");
    zeppelinhubSession2.close();
    zeppelinhubSession2.sendByFuture("~Trash");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubSession2);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder5 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder3.merge(folder5);
    folder1.merge(folder3);
    folder1.notifyRenamed("Message{data={}, op=null}");
    boolean b10 = folder1.hasChild();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.liveMessage("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}"+ "'", str1.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATE));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.List<java.lang.String> list_str6 = helium5.setVisualizationPackageOrder();
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult9 = helium5.getAllPackageInfo(false, "hi!");
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult10 = helium5.getAllPackageInfoWithoutRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult10);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    org.apache.zeppelin.user.Credentials credentials8 = null;
    note7.setCredentials(credentials8);
    boolean b10 = note7.isPersonalizedMode();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion14 = note7.completion("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "helium.bundle.cache.js", 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_USER;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_USER + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_USER));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = interpreterInfoSaving0.interpreterBindings;
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterSetting> map_str_interpreterSetting2 = interpreterInfoSaving0.interpreterSettings;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_interpreterSetting2);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder3 = builder1.className(" ");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings4 = builder3.build();
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo5 = notebookRepoWithSettings4.settings;
    notebookRepoWithSettings4.className = "src";
    notebookRepoWithSettings4.name = "X-Zeppelin-Token";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo5);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
    org.apache.zeppelin.search.LuceneSearch luceneSearch6 = new org.apache.zeppelin.search.LuceneSearch();
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization7 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.io.File file12 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory13 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory14 = null;
    org.apache.zeppelin.helium.Helium helium15 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file12, heliumBundleFactory13, heliumApplicationFactory14);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj17 = helium15.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo18 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj17);
    java.lang.String str19 = noteInfo18.getName();
    java.io.File file24 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory25 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = null;
    org.apache.zeppelin.helium.Helium helium27 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file24, heliumBundleFactory25, heliumApplicationFactory26);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj29 = helium27.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo30 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj29);
    noteInfo18.setConfig(map_str_obj29);
    java.io.File file38 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory39 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory40 = null;
    org.apache.zeppelin.helium.Helium helium41 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file38, heliumBundleFactory39, heliumApplicationFactory40);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj43 = helium41.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj43);
    java.io.File file47 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory48 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory49 = null;
    org.apache.zeppelin.helium.Helium helium50 = new org.apache.zeppelin.helium.Helium("hi!", "", file47, heliumBundleFactory48, heliumApplicationFactory49);
    java.io.File file54 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory55 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory56 = null;
    org.apache.zeppelin.helium.Helium helium57 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file54, heliumBundleFactory55, heliumApplicationFactory56);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj59 = helium57.getPackagePersistedConfig("X-Zeppelin-Token");
    helium50.updatePackageConfig("helium.bundle.cache.js", map_str_obj59);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj61 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj43, map_str_obj59);
    org.apache.zeppelin.notebook.NoteInfo noteInfo62 = new org.apache.zeppelin.notebook.NoteInfo("helium.bundle.cache.js", "0.8.0-SNAPSHOT", map_str_obj59);
    java.io.File file67 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory68 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory69 = null;
    org.apache.zeppelin.helium.Helium helium70 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file67, heliumBundleFactory68, heliumApplicationFactory69);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj72 = helium70.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo73 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj72);
    java.lang.String str74 = noteInfo73.getName();
    java.io.File file79 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory80 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory81 = null;
    org.apache.zeppelin.helium.Helium helium82 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file79, heliumBundleFactory80, heliumApplicationFactory81);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj84 = helium82.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo85 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj84);
    noteInfo73.setConfig(map_str_obj84);
    org.apache.zeppelin.notebook.NoteInfo[] noteInfo_array87 = new org.apache.zeppelin.notebook.NoteInfo[] { noteInfo18, noteInfo62, noteInfo73 };
    java.util.ArrayList<org.apache.zeppelin.notebook.NoteInfo> arraylist_noteInfo88 = new java.util.ArrayList<org.apache.zeppelin.notebook.NoteInfo>();
    boolean b89 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.notebook.NoteInfo>)arraylist_noteInfo88, noteInfo_array87);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo90 = null;
    java.util.List<org.apache.zeppelin.notebook.NoteInfo> list_noteInfo91 = notebookAuthorization7.filterByUser((java.util.List<org.apache.zeppelin.notebook.NoteInfo>)arraylist_noteInfo88, authenticationInfo90);
    org.apache.zeppelin.user.Credentials credentials92 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Notebook notebook93 = new org.apache.zeppelin.notebook.Notebook(zeppelinConfiguration0, notebookRepo1, schedulerFactory2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, (org.apache.zeppelin.search.SearchService)luceneSearch6, notebookAuthorization7, credentials92);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str19.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str74.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(noteInfo_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_noteInfo91);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_AUTOIMPORT;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_AUTOIMPORT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_AUTOIMPORT));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.IMPORT_NOTE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.IMPORT_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.IMPORT_NOTE));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str5 = message4.principal;
    java.io.File file10 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory11 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory12 = null;
    org.apache.zeppelin.helium.Helium helium13 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file10, heliumBundleFactory11, heliumApplicationFactory12);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj15 = helium13.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo16 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj15);
    message4.data = map_str_obj15;
    java.lang.String str18 = zeppelinClient3.serialize(message4);
    message4.roles = "src";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str5.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}"+ "'", str18.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory0.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.helium.HeliumPackage heliumPackage15 = null;
    heliumApplicationFactory0.onLoad("", "local_modules", "anonymous", heliumPackage15);
    org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.ApplicationState applicationState19 = heliumApplicationFactory0.get(paragraph17, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("");

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj10 = note7.getConfig();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj10);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder3 = builder1.subject("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_SETTINGS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_SETTINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_SETTINGS));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
    byte[] byte_array7 = new byte[] { (byte)10, (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10 };
    watcherWebsocket0.onWebSocketBinary(byte_array7, (int)'#', (int)(short)10);
    java.lang.Throwable throwable11 = null;
    watcherWebsocket0.onWebSocketError(throwable11);
    org.eclipse.jetty.websocket.api.Session session13 = null;
    // The following exception was thrown during execution in test generation
    try {
    watcherWebsocket0.onWebSocketConnect(session13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getSinglePackageInfo("");
    // The following exception was thrown during execution in test generation
    try {
    helium5.enable("2CJB2PWE5", "Message{data={}, op=null}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult9);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication0 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(authentication0);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder3 = builder1.className(" ");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings4 = builder3.build();
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo5 = notebookRepoWithSettings4.settings;
    boolean b6 = notebookRepoWithSettings4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    java.io.File file6 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = null;
    org.apache.zeppelin.helium.Helium helium9 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file6, heliumBundleFactory7, heliumApplicationFactory8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium9.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry12 = null;
    helium9.addRegistry(heliumRegistry12);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj15 = helium9.getPackagePersistedConfig("heliumBundles");
    org.apache.zeppelin.notebook.NoteInfo noteInfo16 = new org.apache.zeppelin.notebook.NoteInfo("/", "helium.bundle.js", map_str_obj15);
    org.apache.zeppelin.notebook.NoteInfo noteInfo17 = new org.apache.zeppelin.notebook.NoteInfo("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "X-Zeppelin-Token", map_str_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj15);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("heliumBundles");
    zeppelinWebsocket1.onWebSocketText(" ");
    java.lang.String str4 = zeppelinWebsocket1.noteId;
    org.eclipse.jetty.websocket.api.Session session5 = null;
    zeppelinWebsocket1.connection = session5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "heliumBundles"+ "'", str4.equals("heliumBundles"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.YARN_CACHE_DIR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "yarn-cache"+ "'", str0.equals("yarn-cache"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult6 = helium5.getAllPackageInfoWithoutRefresh();
    java.lang.String[] str_array41 = new java.lang.String[] { "0.8.0-SNAPSHOT", "{\"data\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}", "yarn-cache", " ", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}", "0.8.0-SNAPSHOT", "0.8.0-SNAPSHOT", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "X-Watcher-Key", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "", "local_modules", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "helium.bundle.cache.js", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}", "yarn-cache", "0.8.0-SNAPSHOT", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}", "{\"data\":{}}", "~Trash", "heliumBundles", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "Message{data={}, op=null}", "0.8.0-SNAPSHOT", "local_modules", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "yarn-cache", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "bundles" };
    java.util.ArrayList<java.lang.String> arraylist_str42 = new java.util.ArrayList<java.lang.String>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str42, str_array41);
    // The following exception was thrown during execution in test generation
    try {
    helium5.setVisualizationPackageOrder((java.util.List<java.lang.String>)arraylist_str42);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_APPEND_OUTPUT;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_APPEND_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_APPEND_OUTPUT));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry("", "X-Zeppelin-Token");

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    int i0 = org.apache.commons.configuration.AbstractConfiguration.EVENT_CLEAR_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinOp("yarn-cache");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
    instance0.name = "anonymous";
    java.lang.String str3 = instance0.token;
    instance0.id = '4';
    instance0.name = "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}");

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    char char0 = org.apache.commons.configuration.AbstractConfiguration.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char0 == ' ');

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WEBSOCKET_MAX_TEXT_MESSAGE_SIZE;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WEBSOCKET_MAX_TEXT_MESSAGE_SIZE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WEBSOCKET_MAX_TEXT_MESSAGE_SIZE));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
    zeppelinHeartbeat4.run();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinHeartbeat4);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}", "", zeppelinConfiguration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinOp("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(oP1);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Properties properties1 = null;
    interpreterSetting0.setProperties(properties1);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry8 = null;
    helium5.addRegistry(heliumRegistry8);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult13 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("hi!", heliumPackage11, false);
    boolean b14 = helium5.canBundle(heliumPackageSearchResult13);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj15 = helium5.getAllPackageConfig();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult16 = helium5.getAllPackageInfoWithoutRefresh();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj15);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService schedulerService0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService.getInstance();
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration3);
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient4);
    // The following exception was thrown during execution in test generation
    try {
    schedulerService0.addOnce((java.lang.Runnable)zeppelinHeartbeat5, 0);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerService0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinHeartbeat5);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry8 = null;
    helium5.addRegistry(heliumRegistry8);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult13 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("hi!", heliumPackage11, false);
    boolean b14 = helium5.canBundle(heliumPackageSearchResult13);
    java.io.File file17 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory18 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory19 = null;
    org.apache.zeppelin.helium.Helium helium20 = new org.apache.zeppelin.helium.Helium("hi!", "", file17, heliumBundleFactory18, heliumApplicationFactory19);
    java.util.List<java.lang.String> list_str21 = helium20.setVisualizationPackageOrder();
    // The following exception was thrown during execution in test generation
    try {
    helium5.setVisualizationPackageOrder(list_str21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
    // The following exception was thrown during execution in test generation
    try {
    zeppelinhubRestApiHandler1.del("1d225366-166b-4915-87f9-e54c61e0f003", "heliumBundles");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    org.apache.zeppelin.helium.HeliumConf heliumConf0 = new org.apache.zeppelin.helium.HeliumConf();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    // The following exception was thrown during execution in test generation
    try {
    heliumConf0.disablePackage(heliumPackage1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    org.apache.zeppelin.notebook.Note note6 = null;
    heliumApplicationFactory0.onNoteCreate(note6);
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory8.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory8.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.Paragraph paragraph20 = null;
    heliumApplicationFactory8.onParagraphCreate(paragraph20);
    heliumApplicationFactory0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener)heliumApplicationFactory8);
    org.apache.zeppelin.helium.ApplicationEventListener applicationEventListener23 = heliumApplicationFactory8.getApplicationEventListener();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(applicationEventListener23);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK;
    org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder5 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder3.merge(folder5);
    folder1.merge(folder3);
    folder1.notifyRenamed("Message{data={}, op=null}");
    org.apache.zeppelin.notebook.Folder folder11 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder13 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder15 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder13.merge(folder15);
    folder11.merge(folder13);
    folder11.notifyRenamed("Message{data={}, op=null}");
    folder1.addChild(folder11);
    org.apache.zeppelin.notebook.Folder folder22 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder24 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder22.merge(folder24);
    boolean b26 = folder24.hasChild();
    int i27 = folder24.countNotes();
    folder11.setParent(folder24);
    java.lang.String str29 = folder11.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "anonymous"+ "'", str29.equals("anonymous"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder2 = null;
    // The following exception was thrown during execution in test generation
    try {
    folder1.setParent(folder2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup1 = interpreterSetting0.getAllInterpreterGroups();
    java.lang.String str2 = interpreterSetting0.getErrorReason();
    java.lang.String str3 = interpreterSetting0.getId();
    interpreterSetting0.setPath("src");
    java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo> list_interpreterInfo6 = interpreterSetting0.getInterpreterInfos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreterInfo6);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
    luceneSearch0.close();
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str3 = luceneSearch0.query("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo4 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory5 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager6 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory7 = null;
    org.apache.zeppelin.search.SearchService searchService8 = null;
    org.apache.zeppelin.user.Credentials credentials9 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener10 = null;
    org.apache.zeppelin.notebook.Note note11 = new org.apache.zeppelin.notebook.Note(notebookRepo4, interpreterFactory5, interpreterSettingManager6, jobListenerFactory7, searchService8, credentials9, noteEventListener10);
    note11.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph14 = note11.getParagraphs();
    org.apache.zeppelin.user.Credentials credentials15 = note11.getCredentials();
    note11.setPersonalizedMode((java.lang.Boolean)false);
    // The following exception was thrown during execution in test generation
    try {
    luceneSearch0.updateIndexDoc(note11);
      org.junit.Assert.fail("Expected exception of type org.apache.lucene.store.AlreadyClosedException");
    } catch (org.apache.lucene.store.AlreadyClosedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(credentials15);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph10 = note7.getParagraphs();
    org.apache.zeppelin.user.Credentials credentials11 = null;
    note7.setCredentials(credentials11);
    java.lang.String str13 = note7.getFolderId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "/"+ "'", str13.equals("/"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    org.apache.zeppelin.user.Credentials credentials8 = null;
    note7.setCredentials(credentials8);
    java.lang.String str10 = note7.toJson();
    boolean b11 = note7.isTrash();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHJGWPX6\",\"angularObjects\":{},\"config\":{},\"info\":{}}"+ "'", str10.equals("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHJGWPX6\",\"angularObjects\":{},\"config\":{},\"info\":{}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("heliumBundles");
    zeppelinWebsocket1.onWebSocketText(" ");
    org.eclipse.jetty.websocket.api.Session session4 = zeppelinWebsocket1.connection;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session4);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.liveMessage("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"paragraphs\\\":[],\\\"name\\\":\\\"\\\",\\\"id\\\":\\\"2CMDRX9EA\\\",\\\"angularObjects\\\":{},\\\"config\\\":{},\\\"info\\\":{}}\"},\"meta\":{}}"+ "'", str1.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"paragraphs\\\":[],\\\"name\\\":\\\"\\\",\\\"id\\\":\\\"2CMDRX9EA\\\",\\\"angularObjects\\\":{},\\\"config\\\":{},\\\"info\\\":{}}\"},\"meta\":{}}"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder3 = builder1.className(" ");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings4 = builder3.build();
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo5 = notebookRepoWithSettings4.settings;
    notebookRepoWithSettings4.name = "/";
    notebookRepoWithSettings4.name = "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}";
    notebookRepoWithSettings4.name = "/";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo5);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("helium-bundle");
    zeppelinhubRestApiHandler1.close();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup1 = interpreterSetting0.getAllInterpreterGroups();
    interpreterSetting0.setErrorReason("X-Zeppelin-Token");
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = null;
    interpreterSetting0.setInfos(map_str_str4);
    java.util.Map<java.lang.String,java.lang.String> map_str_str6 = interpreterSetting0.getInfos();
    java.lang.Object obj7 = interpreterSetting0.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory0.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.helium.HeliumPackage heliumPackage15 = null;
    heliumApplicationFactory0.onLoad("", "local_modules", "anonymous", heliumPackage15);
    heliumApplicationFactory0.onStatusChange("bundles", "helium.bundle.js", "helium.bundle.js", "local_modules");
    org.apache.zeppelin.helium.HeliumPackage heliumPackage22 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = heliumApplicationFactory0.loadAndRun(heliumPackage22, paragraph23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult3 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("helium-bundle", heliumPackage1, false);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = heliumPackageSearchResult3.getPkg();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(heliumPackage4);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("heliumBundles");
    zeppelinWebsocket1.onWebSocketText(" ");
    org.eclipse.jetty.websocket.api.Session session4 = null;
    zeppelinWebsocket1.onWebSocketConnect(session4);
    org.eclipse.jetty.websocket.api.Session session6 = null;
    zeppelinWebsocket1.onWebSocketConnect(session6);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.io.File file8 = helium5.getBundle(heliumPackage6, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph10 = note7.getParagraphs();
    note7.setPersonalizedMode((java.lang.Boolean)true);
    java.io.File file17 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory18 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory19 = null;
    org.apache.zeppelin.helium.Helium helium20 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file17, heliumBundleFactory18, heliumApplicationFactory19);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj22 = helium20.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo23 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj22);
    java.io.File file26 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory27 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory28 = null;
    org.apache.zeppelin.helium.Helium helium29 = new org.apache.zeppelin.helium.Helium("hi!", "", file26, heliumBundleFactory27, heliumApplicationFactory28);
    java.io.File file33 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory34 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory35 = null;
    org.apache.zeppelin.helium.Helium helium36 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file33, heliumBundleFactory34, heliumApplicationFactory35);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj38 = helium36.getPackagePersistedConfig("X-Zeppelin-Token");
    helium29.updatePackageConfig("helium.bundle.cache.js", map_str_obj38);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj40 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj22, map_str_obj38);
    note7.setInfo(map_str_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj40);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.start();
    zeppelinhubClient2.removeSession("X-Watcher-Key");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DIR;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DIR + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DIR));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PING;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PING + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PING));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_COLLECTION;
    int i1 = confVars0.getIntValue();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_COLLECTION + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_COLLECTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder3 = builder1.className(" ");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings4 = builder3.build();
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo5 = notebookRepoWithSettings4.settings;
    notebookRepoWithSettings4.name = "/";
    java.lang.String str8 = notebookRepoWithSettings4.name;
    java.lang.String str9 = notebookRepoWithSettings4.className;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/"+ "'", str8.equals("/"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " "+ "'", str9.equals(" "));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_UPDATE_NOTE_JOBS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_UPDATE_NOTE_JOBS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_UPDATE_NOTE_JOBS));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry8 = null;
    helium5.addRegistry(heliumRegistry8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium5.getPackagePersistedConfig("heliumBundles");
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry14 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage15 = heliumLocalRegistry14.getAll();
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage16 = heliumLocalRegistry14.getAll();
    helium5.addRegistry((org.apache.zeppelin.helium.HeliumRegistry)heliumLocalRegistry14);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage19 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult21 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("", heliumPackage19, false);
    boolean b22 = helium5.canBundle(heliumPackageSearchResult21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    org.apache.zeppelin.interpreter.install.InstallInterpreter.usage();

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.stopUser("heliumBundles");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str1 = message0.principal;
    java.io.File file6 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = null;
    org.apache.zeppelin.helium.Helium helium9 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file6, heliumBundleFactory7, heliumApplicationFactory8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium9.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo12 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj11);
    message0.data = map_str_obj11;
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage15 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message0, map_str_str14);
    java.lang.Object obj16 = zeppelinhubMessage15.op;
    java.lang.Object obj17 = zeppelinhubMessage15.op;
    java.util.Map<java.lang.String,java.lang.String> map_str_str18 = zeppelinhubMessage15.meta;
    java.lang.Object obj19 = zeppelinhubMessage15.op;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str1.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.Folder.normalizeFolderId("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str1.equals("{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"\",\"roles\":\"\"}"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_GROUP_ORDER;
    java.lang.String str1 = confVars0.getStringValue();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_GROUP_ORDER + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_GROUP_ORDER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "spark,md,angular,sh,livy,alluxio,file,psql,flink,python,ignite,lens,cassandra,geode,kylin,elasticsearch,scalding,jdbc,hbase,bigquery,beam,pig,scio,groovy"+ "'", str1.equals("spark,md,angular,sh,livy,alluxio,file,psql,flink,python,ignite,lens,cassandra,geode,kylin,elasticsearch,scalding,jdbc,hbase,bigquery,beam,pig,scio,groovy"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.stopUser("local_modules");
    // The following exception was thrown during execution in test generation
    try {
    zeppelinhubClient2.send("heliumBundles", "~Trash");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph10 = note7.getParagraphs();
    org.apache.zeppelin.scheduler.Job job11 = null;
    org.apache.zeppelin.scheduler.Job.Status status12 = null;
    org.apache.zeppelin.scheduler.Job.Status status13 = null;
    note7.beforeStatusChange(job11, status12, status13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph10);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    helium5.save();
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getAllEnabledPackages();
    helium5.disable("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult9);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
    instance0.name = "anonymous";
    instance0.id = 1;
    java.lang.String str5 = instance0.token;
    instance0.token = "Message{data={}, op=null}";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder5 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder3.merge(folder5);
    folder1.merge(folder3);
    folder1.notifyRenamed("anonymous");

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NEW_NOTE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NEW_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NEW_NOTE));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEY_MANAGER_PASSWORD;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEY_MANAGER_PASSWORD + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEY_MANAGER_PASSWORD));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = new org.apache.zeppelin.ticket.TicketContainer();
    boolean b3 = ticketContainer0.isValid("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}", zeppelinConfiguration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.List<java.lang.String> list_str6 = helium5.setVisualizationPackageOrder();
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult9 = helium5.getAllPackageInfo(false, "hi!");
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult12 = helium5.getAllPackageInfo(false, "heliumBundles");
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult13 = helium5.getAllPackageInfoWithoutRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult13);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer0 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
    com.google.gson.JsonElement jsonElement1 = null;
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars2 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC;
    float f3 = confVars2.getFloatValue();
    java.lang.Class class4 = confVars2.getVarClass();
    com.google.gson.JsonDeserializationContext jsonDeserializationContext5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry6 = heliumRegistrySerializer0.deserialize(jsonElement1, (java.lang.reflect.Type)class4, jsonDeserializationContext5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + confVars2 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC + "'", confVars2.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class4);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVED;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVED));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    helium5.save();
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getAllEnabledPackages();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult12 = helium5.getPackageInfo("1d225366-166b-4915-87f9-e54c61e0f003", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHJGWPX6\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult9);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
    org.eclipse.jetty.websocket.api.Session session1 = null;
    watcherWebsocket0.connection = session1;

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.initUser("bundles");
    zeppelinhubClient2.removeSession("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"paragraphs\\\":[],\\\"name\\\":\\\"\\\",\\\"id\\\":\\\"2CMDRX9EA\\\",\\\"angularObjects\\\":{},\\\"config\\\":{},\\\"info\\\":{}}\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str5 = message4.principal;
    java.io.File file10 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory11 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory12 = null;
    org.apache.zeppelin.helium.Helium helium13 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file10, heliumBundleFactory11, heliumApplicationFactory12);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj15 = helium13.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo16 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj15);
    message4.data = map_str_obj15;
    java.lang.String str18 = zeppelinClient3.serialize(message4);
    zeppelinClient3.removeNoteConnection("0.8.0-SNAPSHOT");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str5.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}"+ "'", str18.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj1 = message0.data;
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message0, map_str_str2);
    java.lang.String str4 = message0.principal;
    java.lang.Object obj6 = message0.get("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
    java.util.Collection<org.apache.zeppelin.helium.HeliumRegistry> collection_heliumRegistry8 = message0.getType("2CJB2PWE5");
    message0.principal = "2CJB2PWE5";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str4.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(collection_heliumRegistry8);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str5 = message4.principal;
    java.io.File file10 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory11 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory12 = null;
    org.apache.zeppelin.helium.Helium helium13 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file10, heliumBundleFactory11, heliumApplicationFactory12);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj15 = helium13.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo16 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj15);
    message4.data = map_str_obj15;
    java.lang.String str18 = zeppelinClient3.serialize(message4);
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat19 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
    zeppelinHeartbeat19.run();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2CJB2PWE5"+ "'", str5.equals("2CJB2PWE5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"2CJB2PWE5\",\"roles\":\"src\"}"+ "'", str18.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"2CJB2PWE5\",\"roles\":\"src\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinHeartbeat19);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
    java.lang.Throwable throwable1 = null;
    watcherWebsocket0.onWebSocketError(throwable1);
    org.eclipse.jetty.websocket.api.Session session3 = watcherWebsocket0.connection;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(watcherWebsocket0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session3);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.pingMessage("~Trash");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"PING\",\"data\":{\"token\":\"~Trash\"},\"meta\":{}}"+ "'", str1.equals("{\"op\":\"PING\",\"data\":{\"token\":\"~Trash\"},\"meta\":{}}"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage1);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_UPDATE_OUTPUT;
    org.apache.zeppelin.notebook.socket.Message message1 = new org.apache.zeppelin.notebook.socket.Message(oP0);
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_UPDATE_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_UPDATE_OUTPUT));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array5 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo6 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo6, interpreterInfo_array5);
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry10 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage11 = heliumLocalRegistry10.getAll();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency12 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting13 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup14 = interpreterSetting13.getAllInterpreterGroups();
    java.lang.String str15 = interpreterSetting13.getErrorReason();
    java.lang.String str16 = interpreterSetting13.getId();
    interpreterSetting13.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption19 = interpreterSetting13.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner21 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting22 = new org.apache.zeppelin.interpreter.InterpreterSetting("1d225366-166b-4915-87f9-e54c61e0f003", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "anonymous", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo6, (java.lang.Object)heliumLocalRegistry10, list_dependency12, interpreterOption19, "heliumBundles", interpreterRunner21);
    java.lang.Object obj23 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array24 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency25 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency25, dependency_array24);
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting27 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup28 = interpreterSetting27.getAllInterpreterGroups();
    java.lang.String str29 = interpreterSetting27.getErrorReason();
    java.lang.String str30 = interpreterSetting27.getId();
    interpreterSetting27.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption33 = interpreterSetting27.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner35 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting36 = new org.apache.zeppelin.interpreter.InterpreterSetting("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "helium-bundle", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo6, obj23, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency25, interpreterOption33, "", interpreterRunner35);
    java.util.Properties properties37 = null;
    interpreterSetting36.setProperties(properties37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption33);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    java.io.File file4 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory5 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory6 = null;
    org.apache.zeppelin.helium.Helium helium7 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file4, heliumBundleFactory5, heliumApplicationFactory6);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj9 = helium7.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj9);
    java.lang.String str11 = noteInfo10.getName();
    java.io.File file16 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory17 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory18 = null;
    org.apache.zeppelin.helium.Helium helium19 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file16, heliumBundleFactory17, heliumApplicationFactory18);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj21 = helium19.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo22 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj21);
    noteInfo10.setConfig(map_str_obj21);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj24 = noteInfo10.getConfig();
    java.lang.String str25 = noteInfo10.getName();
    java.lang.String str26 = noteInfo10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str11.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str25.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str26.equals("1d225366-166b-4915-87f9-e54c61e0f003"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("heliumBundles");
    zeppelinWebsocket1.noteId = "hi!";
    zeppelinWebsocket1.noteId = "helium.bundle.cache.js";
    org.eclipse.jetty.websocket.api.Session session6 = zeppelinWebsocket1.connection;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session6);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED;
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.VarType varType1 = confVars0.getType();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(varType1);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService schedulerService0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService.getInstance();
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration3);
    org.apache.zeppelin.notebook.socket.Message message5 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str6 = message5.principal;
    java.io.File file11 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory12 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory13 = null;
    org.apache.zeppelin.helium.Helium helium14 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file11, heliumBundleFactory12, heliumApplicationFactory13);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj16 = helium14.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo17 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj16);
    message5.data = map_str_obj16;
    java.lang.String str19 = zeppelinClient4.serialize(message5);
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat20 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient4);
    // The following exception was thrown during execution in test generation
    try {
    schedulerService0.add((java.lang.Runnable)zeppelinHeartbeat20, (int)' ', 2);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerService0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message{data={}, op=null}"+ "'", str6.equals("Message{data={}, op=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"Message{data\\u003d{}, op\\u003dnull}\",\"roles\":\"src\"}"+ "'", str19.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"Message{data\\u003d{}, op\\u003dnull}\",\"roles\":\"src\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinHeartbeat20);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("heliumBundles");
    org.eclipse.jetty.websocket.api.Session session2 = zeppelinWebsocket1.connection;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session2);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.pingMessage("{\"data\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"data\\\":{}}\"},\"meta\":{}}"+ "'", str1.equals("{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"data\\\":{}}\"},\"meta\":{}}"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    org.apache.zeppelin.helium.HeliumConf heliumConf0 = new org.apache.zeppelin.helium.HeliumConf();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj1 = heliumConf0.getAllPackageConfigs();
    java.io.File file5 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory6 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory7 = null;
    org.apache.zeppelin.helium.Helium helium8 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file5, heliumBundleFactory6, heliumApplicationFactory7);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj10 = helium8.getPackagePersistedConfig("X-Zeppelin-Token");
    heliumConf0.updatePackageConfig("0.8.0-SNAPSHOT", map_str_obj10);
    heliumConf0.disablePackage(" ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj10);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}");

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.io.File file5 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory6 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory7 = null;
    org.apache.zeppelin.helium.Helium helium8 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file5, heliumBundleFactory6, heliumApplicationFactory7);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj10 = helium8.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj10);
    java.lang.String str12 = noteInfo11.getName();
    java.io.File file17 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory18 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory19 = null;
    org.apache.zeppelin.helium.Helium helium20 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file17, heliumBundleFactory18, heliumApplicationFactory19);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj22 = helium20.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo23 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj22);
    noteInfo11.setConfig(map_str_obj22);
    java.io.File file31 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory32 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory33 = null;
    org.apache.zeppelin.helium.Helium helium34 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file31, heliumBundleFactory32, heliumApplicationFactory33);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj36 = helium34.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo37 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj36);
    java.io.File file40 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory41 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory42 = null;
    org.apache.zeppelin.helium.Helium helium43 = new org.apache.zeppelin.helium.Helium("hi!", "", file40, heliumBundleFactory41, heliumApplicationFactory42);
    java.io.File file47 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory48 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory49 = null;
    org.apache.zeppelin.helium.Helium helium50 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file47, heliumBundleFactory48, heliumApplicationFactory49);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj52 = helium50.getPackagePersistedConfig("X-Zeppelin-Token");
    helium43.updatePackageConfig("helium.bundle.cache.js", map_str_obj52);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj54 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj36, map_str_obj52);
    org.apache.zeppelin.notebook.NoteInfo noteInfo55 = new org.apache.zeppelin.notebook.NoteInfo("helium.bundle.cache.js", "0.8.0-SNAPSHOT", map_str_obj52);
    java.io.File file60 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory61 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory62 = null;
    org.apache.zeppelin.helium.Helium helium63 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file60, heliumBundleFactory61, heliumApplicationFactory62);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj65 = helium63.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo66 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj65);
    java.lang.String str67 = noteInfo66.getName();
    java.io.File file72 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory73 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory74 = null;
    org.apache.zeppelin.helium.Helium helium75 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file72, heliumBundleFactory73, heliumApplicationFactory74);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj77 = helium75.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo78 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj77);
    noteInfo66.setConfig(map_str_obj77);
    org.apache.zeppelin.notebook.NoteInfo[] noteInfo_array80 = new org.apache.zeppelin.notebook.NoteInfo[] { noteInfo11, noteInfo55, noteInfo66 };
    java.util.ArrayList<org.apache.zeppelin.notebook.NoteInfo> arraylist_noteInfo81 = new java.util.ArrayList<org.apache.zeppelin.notebook.NoteInfo>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.notebook.NoteInfo>)arraylist_noteInfo81, noteInfo_array80);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo83 = null;
    java.util.List<org.apache.zeppelin.notebook.NoteInfo> list_noteInfo84 = notebookAuthorization0.filterByUser((java.util.List<org.apache.zeppelin.notebook.NoteInfo>)arraylist_noteInfo81, authenticationInfo83);
    java.util.Set<java.lang.String> set_str86 = notebookAuthorization0.getWriters("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str12.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str67.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(noteInfo_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_noteInfo84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str86);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    org.apache.zeppelin.helium.HeliumConf heliumConf0 = new org.apache.zeppelin.helium.HeliumConf();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj1 = heliumConf0.getAllPackageConfigs();
    java.lang.String[] str_array19 = new java.lang.String[] { "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "Message{data={}, op=null}", "X-Zeppelin-Token", "hi!", "~Trash", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "yarn-cache", "/", "hi!", "X-Zeppelin-Token", "heliumBundles", "helium.bundle.cache.js", "heliumBundles", "2CMTCH2J9", "1d225366-166b-4915-87f9-e54c61e0f003", "helium.bundle.js", "helium-bundle" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    heliumConf0.setBundleDisplayOrder((java.util.List<java.lang.String>)arraylist_str20);
    java.io.File file26 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory27 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory28 = null;
    org.apache.zeppelin.helium.Helium helium29 = new org.apache.zeppelin.helium.Helium("hi!", "", file26, heliumBundleFactory27, heliumApplicationFactory28);
    java.io.File file33 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory34 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory35 = null;
    org.apache.zeppelin.helium.Helium helium36 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file33, heliumBundleFactory34, heliumApplicationFactory35);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj38 = helium36.getPackagePersistedConfig("X-Zeppelin-Token");
    helium29.updatePackageConfig("helium.bundle.cache.js", map_str_obj38);
    heliumConf0.updatePackageConfig("X-Watcher-Key", map_str_obj38);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage41 = null;
    // The following exception was thrown during execution in test generation
    try {
    heliumConf0.disablePackage(heliumPackage41);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj38);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory0.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
    heliumApplicationFactory0.onParagraphCreate(paragraph12);
    heliumApplicationFactory0.onOutputAppend("hi!", "src", (int)(short)100, "Message{data={}, op=null}", "helium.bundle.js");

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("");
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket2 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
    byte[] byte_array9 = new byte[] { (byte)10, (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10 };
    watcherWebsocket2.onWebSocketBinary(byte_array9, (int)'#', (int)(short)10);
    zeppelinWebsocket1.onWebSocketBinary(byte_array9, (int)'#', (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    helium5.save();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj10 = helium5.getSpellConfig("load.js");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry8 = null;
    helium5.addRegistry(heliumRegistry8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium5.getPackagePersistedConfig("heliumBundles");
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry14 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage15 = heliumLocalRegistry14.getAll();
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage16 = heliumLocalRegistry14.getAll();
    helium5.addRegistry((org.apache.zeppelin.helium.HeliumRegistry)heliumLocalRegistry14);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult20 = helium5.getPackageInfo("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage16);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("helium.bundle.cache.js");

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_JSON;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_JSON + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_JSON));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    helium5.save();
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getAllEnabledPackages();
    org.apache.zeppelin.notebook.socket.Message message11 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str12 = message11.principal;
    java.io.File file17 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory18 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory19 = null;
    org.apache.zeppelin.helium.Helium helium20 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file17, heliumBundleFactory18, heliumApplicationFactory19);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj22 = helium20.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo23 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj22);
    message11.data = map_str_obj22;
    helium5.updatePackageConfig("yarn-cache", map_str_obj22);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj26 = helium5.getAllPackageConfig();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Message{data={}, op=null}"+ "'", str12.equals("Message{data={}, op=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj26);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization2 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.util.Set<java.lang.String> set_str4 = notebookAuthorization2.getReaders("2CJB2PWE5");
    notebookAuthorization0.setWriters("", set_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str4);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting0);
    java.lang.String str2 = interpreterSetting0.getPath();
    java.lang.String str3 = interpreterSetting0.getErrorReason();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    org.eclipse.jetty.websocket.api.Session session0 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"2CJB2PWE5\",\"roles\":\"src\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubSession2);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder5 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder3.merge(folder5);
    folder1.merge(folder3);
    folder1.notifyRenamed("Message{data={}, op=null}");
    java.lang.String str10 = folder1.getId();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo11 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory12 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager13 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory14 = null;
    org.apache.zeppelin.search.SearchService searchService15 = null;
    org.apache.zeppelin.user.Credentials credentials16 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener17 = null;
    org.apache.zeppelin.notebook.Note note18 = new org.apache.zeppelin.notebook.Note(notebookRepo11, interpreterFactory12, interpreterSettingManager13, jobListenerFactory14, searchService15, credentials16, noteEventListener17);
    note18.setName("0.8.0-SNAPSHOT");
    note18.moveParagraph("0.8.0-SNAPSHOT", (int)(byte)1);
    folder1.addNote(note18);
    org.apache.zeppelin.notebook.Paragraph paragraph27 = note18.clearPersonalizedParagraphOutput("Message{data={}, op=null}", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "anonymous"+ "'", str10.equals("anonymous"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paragraph27);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup1 = interpreterSetting0.getAllInterpreterGroups();
    java.lang.String str2 = interpreterSetting0.getErrorReason();
    java.lang.String str3 = interpreterSetting0.getId();
    interpreterSetting0.setPath("src");
    java.lang.String str6 = interpreterSetting0.getName();
    java.lang.Object obj7 = interpreterSetting0.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo1 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
    org.apache.zeppelin.search.LuceneSearch luceneSearch1 = new org.apache.zeppelin.search.LuceneSearch();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
    org.apache.zeppelin.search.SearchService searchService6 = null;
    org.apache.zeppelin.user.Credentials credentials7 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
    org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
    boolean b10 = note9.isPersonalizedMode();
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array12 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13, interpreterResultMessage_array12);
    note9.onOutputUpdateAll(paragraph11, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13);
    luceneSearch1.updateIndexDoc(note9);
    java.lang.String str17 = note9.getNameWithoutPath();
    luceneSearch0.addIndexDoc(note9);
    boolean b19 = note9.isTrash();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "2CJQAY217"+ "'", str17.equals("2CJQAY217"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.lang.String[] str_array34 = new java.lang.String[] { "helium-bundle", "heliumBundles", "", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}", "2CJB2PWE5", " ", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "load.js", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}", "helium.bundle.cache.js", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "yarn-cache", "", "load.js", "0.8.0-SNAPSHOT", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium.bundle.js", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "heliumBundles", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "anonymous", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium-bundle", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array34);
    notebookAuthorization0.setOwners("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", (java.util.Set<java.lang.String>)linkedhashset_str35);
    java.lang.String[] str_array55 = new java.lang.String[] { "helium.bundle.cache.js", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium.bundle.cache.js", "{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"data\\\":{}}\"},\"meta\":{}}", "~Trash", "hi!", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "local_modules", "X-Watcher-Key", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "", "2CJQAY217", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"2CJB2PWE5\",\"roles\":\"src\"}", "bundles" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str56 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str56, str_array55);
    notebookAuthorization0.setReaders("{\"data\":{}}", (java.util.Set<java.lang.String>)linkedhashset_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str1 = message0.principal;
    message0.principal = "Message{data={}, op=null}";
    java.lang.String str4 = message0.roles;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Message{data={}, op=null}"+ "'", str1.equals("Message{data={}, op=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "src"+ "'", str4.equals("src"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage3 = heliumLocalRegistry2.getAll();
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage4 = heliumLocalRegistry2.getAll();
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage5 = heliumLocalRegistry2.getAll();
    java.lang.String str6 = heliumLocalRegistry2.uri();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "heliumBundles"+ "'", str6.equals("heliumBundles"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    interpreterSetting0.setErrorReason("{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    java.lang.Object obj3 = interpreterSetting0.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult3 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("local_modules", heliumPackage1, false);
    boolean b4 = heliumPackageSearchResult3.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj8 = helium5.getPackageConfig("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATE;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATE));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
    org.apache.zeppelin.search.SearchService searchService5 = null;
    org.apache.zeppelin.user.Credentials credentials6 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
    org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
    org.apache.zeppelin.user.Credentials credentials9 = null;
    note8.setCredentials(credentials9);
    boolean b11 = note8.isPersonalizedMode();
    java.lang.String str12 = note8.getFolderId();
    luceneSearch0.addIndexDoc(note8);
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str15 = luceneSearch0.query("load.js");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/"+ "'", str12.equals("/"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_map_str_str15);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService schedulerService0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService.getInstance();
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration3);
    org.apache.zeppelin.notebook.socket.Message message5 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str6 = message5.principal;
    java.io.File file11 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory12 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory13 = null;
    org.apache.zeppelin.helium.Helium helium14 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file11, heliumBundleFactory12, heliumApplicationFactory13);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj16 = helium14.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo17 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj16);
    message5.data = map_str_obj16;
    java.lang.String str19 = zeppelinClient4.serialize(message5);
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat20 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient4);
    // The following exception was thrown during execution in test generation
    try {
    schedulerService0.add((java.lang.Runnable)zeppelinHeartbeat20, (int)(short)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerService0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message{data={}, op=null}"+ "'", str6.equals("Message{data={}, op=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"Message{data\\u003d{}, op\\u003dnull}\",\"roles\":\"src\"}"+ "'", str19.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"Message{data\\u003d{}, op\\u003dnull}\",\"roles\":\"src\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinHeartbeat20);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult3 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("1d225366-166b-4915-87f9-e54c61e0f003", heliumPackage1, false);
    boolean b4 = heliumPackageSearchResult3.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.EMPTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubSession0);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    // The following exception was thrown during execution in test generation
    try {
    boolean b2 = zeppelinConfiguration0.getBoolean("{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"\",\"roles\":\"\"}");
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    java.io.File file2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumOnlineRegistry heliumOnlineRegistry3 = new org.apache.zeppelin.helium.HeliumOnlineRegistry("yarn-cache", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.io.File file5 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory6 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory7 = null;
    org.apache.zeppelin.helium.Helium helium8 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file5, heliumBundleFactory6, heliumApplicationFactory7);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj10 = helium8.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj10);
    java.io.File file14 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory15 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory16 = null;
    org.apache.zeppelin.helium.Helium helium17 = new org.apache.zeppelin.helium.Helium("hi!", "", file14, heliumBundleFactory15, heliumApplicationFactory16);
    java.io.File file21 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory22 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory23 = null;
    org.apache.zeppelin.helium.Helium helium24 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file21, heliumBundleFactory22, heliumApplicationFactory23);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj26 = helium24.getPackagePersistedConfig("X-Zeppelin-Token");
    helium17.updatePackageConfig("helium.bundle.cache.js", map_str_obj26);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj28 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj10, map_str_obj26);
    message0.data = map_str_obj10;
    org.apache.zeppelin.notebook.socket.Message.OP oP30 = message0.op;
    java.io.File file35 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory36 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory37 = null;
    org.apache.zeppelin.helium.Helium helium38 = new org.apache.zeppelin.helium.Helium("hi!", "", file35, heliumBundleFactory36, heliumApplicationFactory37);
    helium38.disable("helium.bundle.cache.js");
    java.io.File file44 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory45 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory46 = null;
    org.apache.zeppelin.helium.Helium helium47 = new org.apache.zeppelin.helium.Helium("hi!", "", file44, heliumBundleFactory45, heliumApplicationFactory46);
    java.io.File file51 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory52 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory53 = null;
    org.apache.zeppelin.helium.Helium helium54 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file51, heliumBundleFactory52, heliumApplicationFactory53);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj56 = helium54.getPackagePersistedConfig("X-Zeppelin-Token");
    helium47.updatePackageConfig("helium.bundle.cache.js", map_str_obj56);
    helium38.updatePackageConfig("~Trash", map_str_obj56);
    org.apache.zeppelin.notebook.NoteInfo noteInfo59 = new org.apache.zeppelin.notebook.NoteInfo("src", " ", map_str_obj56);
    message0.data = map_str_obj56;
    java.lang.Object obj62 = message0.get("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(oP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj62);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    helium5.save();
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getAllEnabledPackages();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.io.File file12 = helium5.getBundle(heliumPackage10, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult9);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.merge(folder3);
    boolean b5 = folder3.hasChild();
    org.apache.zeppelin.notebook.Folder folder6 = folder3.getParent();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo7 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory8 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager9 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory10 = null;
    org.apache.zeppelin.search.SearchService searchService11 = null;
    org.apache.zeppelin.user.Credentials credentials12 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener13 = null;
    org.apache.zeppelin.notebook.Note note14 = new org.apache.zeppelin.notebook.Note(notebookRepo7, interpreterFactory8, interpreterSettingManager9, jobListenerFactory10, searchService11, credentials12, noteEventListener13);
    boolean b15 = note14.isPersonalizedMode();
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array17 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage18 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage18, interpreterResultMessage_array17);
    note14.onOutputUpdateAll(paragraph16, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage18);
    note14.setName("heliumBundles");
    // The following exception was thrown during execution in test generation
    try {
    folder6.removeNote(note14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(folder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinOp("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(oP1);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.AzureNotebookRepo azureNotebookRepo1 = new org.apache.zeppelin.notebook.repo.AzureNotebookRepo(zeppelinConfiguration0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.commons.configuration.SubnodeConfiguration subnodeConfiguration2 = zeppelinConfiguration0.configurationAt("anonymous");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
    org.apache.zeppelin.search.SearchService searchService5 = null;
    org.apache.zeppelin.user.Credentials credentials6 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
    org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
    boolean b9 = note8.isPersonalizedMode();
    org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array11 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage12 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12, interpreterResultMessage_array11);
    note8.onOutputUpdateAll(paragraph10, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12);
    luceneSearch0.updateIndexDoc(note8);
    org.apache.zeppelin.scheduler.Job job16 = null;
    org.apache.zeppelin.scheduler.Job.Status status17 = null;
    org.apache.zeppelin.scheduler.Job.Status status18 = null;
    note8.beforeStatusChange(job16, status17, status18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_MAX_POOL_SIZE;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_MAX_POOL_SIZE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_MAX_POOL_SIZE));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
    npmPackage0.version = "2CJQAY217";

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer userSessionContainer0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer();
    java.lang.String str2 = userSessionContainer0.getSession("~Trash");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult3 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("1d225366-166b-4915-87f9-e54c61e0f003", heliumPackage1, false);
    java.lang.String str4 = heliumPackageSearchResult3.getRegistry();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str4.equals("1d225366-166b-4915-87f9-e54c61e0f003"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array5 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo6 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo6, interpreterInfo_array5);
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry10 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage11 = heliumLocalRegistry10.getAll();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency12 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting13 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup14 = interpreterSetting13.getAllInterpreterGroups();
    java.lang.String str15 = interpreterSetting13.getErrorReason();
    java.lang.String str16 = interpreterSetting13.getId();
    interpreterSetting13.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption19 = interpreterSetting13.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner21 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting22 = new org.apache.zeppelin.interpreter.InterpreterSetting("1d225366-166b-4915-87f9-e54c61e0f003", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "anonymous", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo6, (java.lang.Object)heliumLocalRegistry10, list_dependency12, interpreterOption19, "heliumBundles", interpreterRunner21);
    java.lang.Object obj23 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array24 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency25 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency25, dependency_array24);
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting27 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup28 = interpreterSetting27.getAllInterpreterGroups();
    java.lang.String str29 = interpreterSetting27.getErrorReason();
    java.lang.String str30 = interpreterSetting27.getId();
    interpreterSetting27.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption33 = interpreterSetting27.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner35 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting36 = new org.apache.zeppelin.interpreter.InterpreterSetting("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "helium-bundle", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo6, obj23, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency25, interpreterOption33, "", interpreterRunner35);
    interpreterSetting36.setErrorReason("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption33);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.liveMessage("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"paragraphs\\\":[],\\\"name\\\":\\\"\\\",\\\"id\\\":\\\"2CMDRX9EA\\\",\\\"angularObjects\\\":{},\\\"config\\\":{},\\\"info\\\":{}}\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}"+ "'", str1.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    int i0 = org.apache.commons.configuration.AbstractConfiguration.EVENT_READ_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.socket.Message message5 = zeppelinClient3.deserialize("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}");
    zeppelinClient3.handleMsgFromZeppelin(" ", "{\"op\":\"PING\",\"data\":{\"token\":\"~Trash\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message5);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
    java.lang.String str1 = notebookRepoSettingsInfo0.name;
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type2 = notebookRepoSettingsInfo0.type;
    notebookRepoSettingsInfo0.selected = "{\"op\":\"PING\",\"data\":{\"token\":\"~Trash\"},\"meta\":{}}";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type2);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder5 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder3.merge(folder5);
    folder1.merge(folder3);
    folder1.notifyRenamed("Message{data={}, op=null}");
    java.lang.String str10 = folder1.getId();
    org.apache.zeppelin.notebook.Note note11 = new org.apache.zeppelin.notebook.Note();
    folder1.removeNote(note11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "anonymous"+ "'", str10.equals("anonymous"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    java.io.File file11 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory12 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory13 = null;
    org.apache.zeppelin.helium.Helium helium14 = new org.apache.zeppelin.helium.Helium("hi!", "", file11, heliumBundleFactory12, heliumApplicationFactory13);
    java.io.File file18 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory20 = null;
    org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file18, heliumBundleFactory19, heliumApplicationFactory20);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj23 = helium21.getPackagePersistedConfig("X-Zeppelin-Token");
    helium14.updatePackageConfig("helium.bundle.cache.js", map_str_obj23);
    helium5.updatePackageConfig("~Trash", map_str_obj23);
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult28 = helium5.getAllPackageInfo(false, "spark,md,angular,sh,livy,alluxio,file,psql,flink,python,ignite,lens,cassandra,geode,kylin,elasticsearch,scalding,jdbc,hbase,bigquery,beam,pig,scio,groovy");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult28);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory0.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
    heliumApplicationFactory0.onParagraphCreate(paragraph12);
    org.apache.zeppelin.notebook.Note note14 = new org.apache.zeppelin.notebook.Note();
    heliumApplicationFactory0.onNoteCreate(note14);
    org.apache.zeppelin.notebook.NoteNameListener noteNameListener16 = null;
    note14.setNoteNameListener(noteNameListener16);
    note14.runAll();

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.merge(folder3);
    folder3.rename("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}");
    folder3.notifyRenamed("helium.bundle.cache.js");

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CONFIGURATIONS_INFO;
    org.apache.zeppelin.notebook.socket.Message message1 = new org.apache.zeppelin.notebook.socket.Message(oP0);
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CONFIGURATIONS_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CONFIGURATIONS_INFO));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry8 = null;
    helium5.addRegistry(heliumRegistry8);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = helium5.getPackagePersistedConfig("heliumBundles");
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry14 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage15 = heliumLocalRegistry14.getAll();
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage16 = heliumLocalRegistry14.getAll();
    helium5.addRegistry((org.apache.zeppelin.helium.HeliumRegistry)heliumLocalRegistry14);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj18 = helium5.getAllPackageConfig();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj18);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str5 = message4.principal;
    java.io.File file10 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory11 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory12 = null;
    org.apache.zeppelin.helium.Helium helium13 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file10, heliumBundleFactory11, heliumApplicationFactory12);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj15 = helium13.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo16 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj15);
    message4.data = map_str_obj15;
    java.lang.String str18 = zeppelinClient3.serialize(message4);
    zeppelinClient3.start();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat20 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Message{data={}, op=null}"+ "'", str5.equals("Message{data={}, op=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"Message{data\\u003d{}, op\\u003dnull}\",\"roles\":\"src\"}"+ "'", str18.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"Message{data\\u003d{}, op\\u003dnull}\",\"roles\":\"src\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinHeartbeat20);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings0 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
    boolean b1 = notebookRepoWithSettings0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
    instance0.name = "anonymous";
    java.lang.String str3 = instance0.token;
    java.lang.String str4 = instance0.token;
    instance0.name = "{\"data\":{}}";
    instance0.id = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    heliumApplicationFactory0.setNotebook(notebook1);
    org.apache.zeppelin.notebook.Notebook notebook3 = heliumApplicationFactory0.getNotebook();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type8 = null;
    heliumApplicationFactory0.onOutputUpdated("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "anonymous", (int)'a', "/", type8, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    heliumApplicationFactory0.onOutputAppend("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "src", 1, "0.8.0-SNAPSHOT", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.helium.HeliumPackage heliumPackage20 = null;
    heliumApplicationFactory0.onLoad("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "~Trash", heliumPackage20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook3);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    java.lang.String str3 = zeppelinhubClient2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup1 = interpreterSetting0.getAllInterpreterGroups();
    java.lang.String str2 = interpreterSetting0.getErrorReason();
    interpreterSetting0.setErrorReason("{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    java.io.File file11 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory12 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory13 = null;
    org.apache.zeppelin.helium.Helium helium14 = new org.apache.zeppelin.helium.Helium("hi!", "", file11, heliumBundleFactory12, heliumApplicationFactory13);
    java.io.File file18 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory20 = null;
    org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file18, heliumBundleFactory19, heliumApplicationFactory20);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj23 = helium21.getPackagePersistedConfig("X-Zeppelin-Token");
    helium14.updatePackageConfig("helium.bundle.cache.js", map_str_obj23);
    helium5.updatePackageConfig("~Trash", map_str_obj23);
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult28 = helium5.getAllPackageInfo(false, "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    helium5.disable("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}");
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult31 = helium5.getAllPackageInfoWithoutRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult31);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry8 = null;
    helium5.addRegistry(heliumRegistry8);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult13 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("hi!", heliumPackage11, false);
    boolean b14 = helium5.canBundle(heliumPackageSearchResult13);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj15 = helium5.getAllPackageConfig();
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory16 = helium5.getApplicationFactory();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage18 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult20 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("", heliumPackage18, false);
    java.lang.String str21 = heliumPackageSearchResult20.getRegistry();
    boolean b22 = helium5.canBundle(heliumPackageSearchResult20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(heliumApplicationFactory16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
    java.util.Set<java.lang.String> set_str3 = notebookAuthorization1.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration5 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization6 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration5);
    java.util.Set<java.lang.String> set_str8 = notebookAuthorization6.getReaders("X-Zeppelin-Token");
    notebookAuthorization1.setRoles("~Trash", set_str8);
    java.util.Set<java.lang.String> set_str11 = notebookAuthorization1.getOwners("helium.bundle.js");
    java.util.Set<java.lang.String> set_str13 = notebookAuthorization1.getWriters("X-Zeppelin-Token");
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
    notebookAuthorization1.setNewNotePermissions(".//conf/interpreter-list", authenticationInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str13);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = new org.apache.zeppelin.ticket.TicketContainer();
    java.lang.String str2 = ticketContainer0.getTicket("helium.bundle.cache.js");
    java.lang.String str4 = ticketContainer0.getTicket("0.8.0-SNAPSHOT");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "983f4edc-7fd7-4978-ae01-8de1df3126f1"+ "'", str2.equals("983f4edc-7fd7-4978-ae01-8de1df3126f1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "e8920161-14eb-4094-bb29-b85db179aeab"+ "'", str4.equals("e8920161-14eb-4094-bb29-b85db179aeab"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup1 = interpreterSetting0.getAllInterpreterGroups();
    java.lang.String str2 = interpreterSetting0.getErrorReason();
    java.lang.String str3 = interpreterSetting0.getId();
    interpreterSetting0.setPath("src");
    interpreterSetting0.clearNoteIdAndParaMap();
    java.lang.String str7 = interpreterSetting0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.handleMsgFromZeppelinHub("hi!");
    zeppelinhubClient2.initUser("");
    zeppelinhubClient2.start();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer0 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry3 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage4 = heliumLocalRegistry3.getAll();
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage5 = heliumLocalRegistry3.getAll();
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars6 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD;
    long long7 = confVars6.getLongValue();
    java.lang.Class class8 = confVars6.getVarClass();
    com.google.gson.JsonSerializationContext jsonSerializationContext9 = null;
    com.google.gson.JsonElement jsonElement10 = heliumRegistrySerializer0.serialize((org.apache.zeppelin.helium.HeliumRegistry)heliumLocalRegistry3, (java.lang.reflect.Type)class8, jsonSerializationContext9);
    java.lang.String str11 = heliumLocalRegistry3.uri();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage5);
    org.junit.Assert.assertTrue("'" + confVars6 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD + "'", confVars6.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "heliumBundles"+ "'", str11.equals("heliumBundles"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str1 = notebookRepoSettingsInfo0.value;
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str2 = notebookRepoSettingsInfo0.value;
    java.lang.String str3 = notebookRepoSettingsInfo0.selected;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_map_str_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    org.apache.zeppelin.notebook.Note note6 = null;
    heliumApplicationFactory0.onNoteCreate(note6);
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    heliumApplicationFactory0.unload(paragraph8, "");
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo11 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory12 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager13 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory14 = null;
    org.apache.zeppelin.search.SearchService searchService15 = null;
    org.apache.zeppelin.user.Credentials credentials16 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener17 = null;
    org.apache.zeppelin.notebook.Note note18 = new org.apache.zeppelin.notebook.Note(notebookRepo11, interpreterFactory12, interpreterSettingManager13, jobListenerFactory14, searchService15, credentials16, noteEventListener17);
    note18.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph21 = note18.getParagraphs();
    note18.setPersonalizedMode((java.lang.Boolean)true);
    heliumApplicationFactory0.onNoteRemove(note18);
    heliumApplicationFactory0.onOutputAppend("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CN35WB85\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "0.8.0-SNAPSHOT", (int)'a', "", "2CMTCH2J9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph21);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory0.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
    heliumApplicationFactory0.onParagraphCreate(paragraph12);
    org.apache.zeppelin.notebook.Note note14 = new org.apache.zeppelin.notebook.Note();
    heliumApplicationFactory0.onNoteCreate(note14);
    org.apache.zeppelin.notebook.NoteNameListener noteNameListener16 = null;
    note14.setNoteNameListener(noteNameListener16);
    org.apache.zeppelin.notebook.Paragraph paragraph20 = note14.clearPersonalizedParagraphOutput("", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paragraph20);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    java.lang.String str7 = zeppelinConfiguration0.getNotebookAuthorizationPath();
    long long11 = zeppelinConfiguration0.getLong("hi!", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", 0L);
    zeppelinConfiguration0.setBasePath("helium-bundle");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ".//conf/notebook-authorization.json"+ "'", str7.equals(".//conf/notebook-authorization.json"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    org.apache.commons.configuration.tree.ExpressionEngine expressionEngine0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.commons.configuration.HierarchicalConfiguration.setDefaultExpressionEngine(expressionEngine0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    boolean b8 = note7.isPersonalizedMode();
    org.apache.zeppelin.notebook.Paragraph paragraph9 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array10 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage11 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage11, interpreterResultMessage_array10);
    note7.onOutputUpdateAll(paragraph9, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage11);
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph14 = note7.getParagraphs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph14);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("heliumBundles");
    zeppelinWebsocket1.onWebSocketText(" ");
    java.lang.String str4 = zeppelinWebsocket1.noteId;
    zeppelinWebsocket1.noteId = "bundles";
    zeppelinWebsocket1.onWebSocketText("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "heliumBundles"+ "'", str4.equals("heliumBundles"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
    instance0.name = "anonymous";
    java.lang.String str3 = instance0.token;
    java.lang.String str4 = instance0.token;
    instance0.name = "{\"data\":{}}";
    instance0.token = "helium.bundle.js";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult9 = helium5.getEnabledPackageInfo("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    java.lang.String str7 = zeppelinConfiguration0.getNotebookAuthorizationPath();
    long long11 = zeppelinConfiguration0.getLong("hi!", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", 0L);
    zeppelinConfiguration0.addErrorLogListener();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ".//conf/notebook-authorization.json"+ "'", str7.equals(".//conf/notebook-authorization.json"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj1 = message0.data;
    message0.principal = "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}";
    org.apache.zeppelin.notebook.socket.Message.OP oP4 = message0.op;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(oP4);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
    npmPackage0.version = "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"paragraphs\\\":[],\\\"name\\\":\\\"\\\",\\\"id\\\":\\\"2CMDRX9EA\\\",\\\"angularObjects\\\":{},\\\"config\\\":{},\\\"info\\\":{}}\"},\"meta\":{}}";

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage6 = helium5.getBundlePackagesToBundle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage6);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    boolean b8 = note7.isPersonalizedMode();
    java.lang.String str9 = note7.toJson();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo10 = null;
    // The following exception was thrown during execution in test generation
    try {
    note7.persist(authenticationInfo10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJG74W6V\",\"angularObjects\":{},\"config\":{},\"info\":{}}"+ "'", str9.equals("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJG74W6V\",\"angularObjects\":{},\"config\":{},\"info\":{}}"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    note7.moveParagraph("0.8.0-SNAPSHOT", (int)(byte)1);
    boolean b13 = note7.isNameEmpty();
    org.apache.zeppelin.notebook.NoteInfo noteInfo14 = new org.apache.zeppelin.notebook.NoteInfo(note7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getSinglePackageInfo("");
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult10 = helium5.getAllEnabledPackages();
    // The following exception was thrown during execution in test generation
    try {
    helium5.enable("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult10);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    java.lang.String str10 = note7.getNameWithoutPath();
    org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo(note7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.8.0-SNAPSHOT"+ "'", str10.equals("0.8.0-SNAPSHOT"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings0 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
    notebookRepoWithSettings0.className = "src";
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder4 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder6 = builder4.className(" ");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings7 = builder6.build();
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo8 = notebookRepoWithSettings7.settings;
    notebookRepoWithSettings0.settings = list_notebookRepoSettingsInfo8;
    java.lang.String str10 = notebookRepoWithSettings0.name;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult3 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("hi!", heliumPackage1, false);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = heliumPackageSearchResult3.getPkg();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(heliumPackage4);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
    java.lang.String str1 = npmPackage0.version;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.PACKAGE_JSON;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "package.json"+ "'", str0.equals("package.json"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
    notebookRepoSettingsInfo0.name = "helium.bundle.js";

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array3 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo4 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo4, interpreterInfo_array3);
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry8 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage9 = heliumLocalRegistry8.getAll();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency10 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting11 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup12 = interpreterSetting11.getAllInterpreterGroups();
    java.lang.String str13 = interpreterSetting11.getErrorReason();
    java.lang.String str14 = interpreterSetting11.getId();
    interpreterSetting11.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption17 = interpreterSetting11.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner19 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting20 = new org.apache.zeppelin.interpreter.InterpreterSetting("1d225366-166b-4915-87f9-e54c61e0f003", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "anonymous", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo4, (java.lang.Object)heliumLocalRegistry8, list_dependency10, interpreterOption17, "heliumBundles", interpreterRunner19);
    org.apache.zeppelin.interpreter.InterpreterSetting.Status status21 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES;
    interpreterSetting20.setStatus(status21);
    java.lang.String str23 = interpreterSetting20.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption17);
    org.junit.Assert.assertTrue("'" + status21 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES + "'", status21.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "anonymous"+ "'", str23.equals("anonymous"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
    org.apache.zeppelin.search.SearchService searchService6 = null;
    org.apache.zeppelin.user.Credentials credentials7 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
    org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
    java.io.File file14 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory15 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory16 = null;
    org.apache.zeppelin.helium.Helium helium17 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file14, heliumBundleFactory15, heliumApplicationFactory16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj19 = helium17.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo20 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj19);
    java.lang.String str21 = noteInfo20.getName();
    java.io.File file26 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory27 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory28 = null;
    org.apache.zeppelin.helium.Helium helium29 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file26, heliumBundleFactory27, heliumApplicationFactory28);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj31 = helium29.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo32 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj31);
    noteInfo20.setConfig(map_str_obj31);
    note9.setInfo(map_str_obj31);
    org.apache.zeppelin.notebook.NoteInfo noteInfo35 = new org.apache.zeppelin.notebook.NoteInfo("{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"data\\\":{}}\"},\"meta\":{}}", "", map_str_obj31);
    org.apache.zeppelin.helium.HeliumConf heliumConf36 = new org.apache.zeppelin.helium.HeliumConf();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj37 = heliumConf36.getAllPackageConfigs();
    java.lang.String[] str_array55 = new java.lang.String[] { "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "Message{data={}, op=null}", "X-Zeppelin-Token", "hi!", "~Trash", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "yarn-cache", "/", "hi!", "X-Zeppelin-Token", "heliumBundles", "helium.bundle.cache.js", "heliumBundles", "2CMTCH2J9", "1d225366-166b-4915-87f9-e54c61e0f003", "helium.bundle.js", "helium-bundle" };
    java.util.ArrayList<java.lang.String> arraylist_str56 = new java.util.ArrayList<java.lang.String>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str56, str_array55);
    heliumConf36.setBundleDisplayOrder((java.util.List<java.lang.String>)arraylist_str56);
    java.io.File file62 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory63 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory64 = null;
    org.apache.zeppelin.helium.Helium helium65 = new org.apache.zeppelin.helium.Helium("hi!", "", file62, heliumBundleFactory63, heliumApplicationFactory64);
    java.io.File file69 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory70 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory71 = null;
    org.apache.zeppelin.helium.Helium helium72 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file69, heliumBundleFactory70, heliumApplicationFactory71);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj74 = helium72.getPackagePersistedConfig("X-Zeppelin-Token");
    helium65.updatePackageConfig("helium.bundle.cache.js", map_str_obj74);
    heliumConf36.updatePackageConfig("X-Watcher-Key", map_str_obj74);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj77 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj31, map_str_obj74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str21.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj77);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    heliumApplicationFactory0.setNotebook(notebook1);
    org.apache.zeppelin.notebook.Notebook notebook3 = heliumApplicationFactory0.getNotebook();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = heliumApplicationFactory0.loadAndRun(heliumPackage4, paragraph5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook3);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    java.io.File file4 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory5 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory6 = null;
    org.apache.zeppelin.helium.Helium helium7 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file4, heliumBundleFactory5, heliumApplicationFactory6);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj9 = helium7.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj9);
    java.lang.String str11 = noteInfo10.getName();
    java.io.File file16 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory17 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory18 = null;
    org.apache.zeppelin.helium.Helium helium19 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file16, heliumBundleFactory17, heliumApplicationFactory18);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj21 = helium19.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo22 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj21);
    noteInfo10.setConfig(map_str_obj21);
    java.lang.String str24 = noteInfo10.getId();
    java.lang.String str25 = noteInfo10.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str11.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "/"+ "'", str24.equals("/"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "/"+ "'", str25.equals("/"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving1 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str2 = interpreterInfoSaving1.interpreterBindings;
    org.sonatype.aether.repository.RemoteRepository[] remoteRepository_array3 = new org.sonatype.aether.repository.RemoteRepository[] {  };
    java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository> arraylist_remoteRepository4 = new java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.sonatype.aether.repository.RemoteRepository>)arraylist_remoteRepository4, remoteRepository_array3);
    interpreterInfoSaving1.interpreterRepositories = arraylist_remoteRepository4;
    interpreterInfoSaving0.interpreterRepositories = arraylist_remoteRepository4;
    org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving8 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving9 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str10 = interpreterInfoSaving9.interpreterBindings;
    org.sonatype.aether.repository.RemoteRepository[] remoteRepository_array11 = new org.sonatype.aether.repository.RemoteRepository[] {  };
    java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository> arraylist_remoteRepository12 = new java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.sonatype.aether.repository.RemoteRepository>)arraylist_remoteRepository12, remoteRepository_array11);
    interpreterInfoSaving9.interpreterRepositories = arraylist_remoteRepository12;
    interpreterInfoSaving8.interpreterRepositories = arraylist_remoteRepository12;
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str16 = interpreterInfoSaving8.interpreterBindings;
    java.util.List<org.sonatype.aether.repository.RemoteRepository> list_remoteRepository17 = interpreterInfoSaving8.interpreterRepositories;
    interpreterInfoSaving0.interpreterRepositories = list_remoteRepository17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(remoteRepository_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(remoteRepository_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_remoteRepository17);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinHubOp("0.8.0-SNAPSHOT");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(zeppelinHubOp1);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("heliumBundles");
    zeppelinWebsocket1.onWebSocketText(" ");
    java.lang.String str4 = zeppelinWebsocket1.noteId;
    zeppelinWebsocket1.noteId = "bundles";
    org.eclipse.jetty.websocket.api.Session session7 = null;
    zeppelinWebsocket1.onWebSocketConnect(session7);
    zeppelinWebsocket1.onWebSocketText("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "heliumBundles"+ "'", str4.equals("heliumBundles"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder5 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder3.merge(folder5);
    folder1.merge(folder3);
    folder1.notifyRenamed("Message{data={}, op=null}");
    java.lang.String str10 = folder1.getId();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo11 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory12 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager13 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory14 = null;
    org.apache.zeppelin.search.SearchService searchService15 = null;
    org.apache.zeppelin.user.Credentials credentials16 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener17 = null;
    org.apache.zeppelin.notebook.Note note18 = new org.apache.zeppelin.notebook.Note(notebookRepo11, interpreterFactory12, interpreterSettingManager13, jobListenerFactory14, searchService15, credentials16, noteEventListener17);
    note18.setName("0.8.0-SNAPSHOT");
    note18.moveParagraph("0.8.0-SNAPSHOT", (int)(byte)1);
    folder1.addNote(note18);
    folder1.removeChild("2CJQAY217");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "anonymous"+ "'", str10.equals("anonymous"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_REVISION_HISTORY;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_REVISION_HISTORY + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_REVISION_HISTORY));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    java.io.File file11 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory12 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory13 = null;
    org.apache.zeppelin.helium.Helium helium14 = new org.apache.zeppelin.helium.Helium("hi!", "", file11, heliumBundleFactory12, heliumApplicationFactory13);
    java.io.File file18 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory20 = null;
    org.apache.zeppelin.helium.Helium helium21 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file18, heliumBundleFactory19, heliumApplicationFactory20);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj23 = helium21.getPackagePersistedConfig("X-Zeppelin-Token");
    helium14.updatePackageConfig("helium.bundle.cache.js", map_str_obj23);
    helium5.updatePackageConfig("~Trash", map_str_obj23);
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult28 = helium5.getAllPackageInfo(false, "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj30 = helium5.getPackagePersistedConfig("helium.bundle.cache.js");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj30);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
    instance0.name = "anonymous";
    java.lang.String str3 = instance0.token;
    java.lang.String str4 = instance0.token;
    java.lang.String str5 = instance0.token;
    java.lang.String str6 = instance0.name;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "anonymous"+ "'", str6.equals("anonymous"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    helium5.save();
    helium5.save();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.io.File file12 = helium5.getBundle(heliumPackage10, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinHubOp("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(zeppelinHubOp1);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.Folder.normalizeFolderId("2CJSPTYGZ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2CJSPTYGZ"+ "'", str1.equals("2CJSPTYGZ"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str5 = message4.principal;
    java.io.File file10 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory11 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory12 = null;
    org.apache.zeppelin.helium.Helium helium13 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file10, heliumBundleFactory11, heliumApplicationFactory12);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj15 = helium13.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo16 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj15);
    message4.data = map_str_obj15;
    java.lang.String str18 = zeppelinClient3.serialize(message4);
    org.apache.zeppelin.notebook.socket.Message message20 = zeppelinClient3.deserialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.notebook.socket.Message.OP oP21 = message20.op;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str5.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}"+ "'", str18.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(oP21);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    org.apache.zeppelin.notebook.ParagraphRuntimeInfo paragraphRuntimeInfo5 = new org.apache.zeppelin.notebook.ParagraphRuntimeInfo("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CN35WB85\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}", "src", "local_modules", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}");

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    org.apache.zeppelin.user.Credentials credentials8 = null;
    note7.setCredentials(credentials8);
    boolean b10 = note7.isPersonalizedMode();
    java.io.File file13 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory14 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory15 = null;
    org.apache.zeppelin.helium.Helium helium16 = new org.apache.zeppelin.helium.Helium("hi!", "", file13, heliumBundleFactory14, heliumApplicationFactory15);
    helium16.disable("helium.bundle.cache.js");
    java.io.File file22 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory23 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory24 = null;
    org.apache.zeppelin.helium.Helium helium25 = new org.apache.zeppelin.helium.Helium("hi!", "", file22, heliumBundleFactory23, heliumApplicationFactory24);
    java.io.File file29 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory30 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory31 = null;
    org.apache.zeppelin.helium.Helium helium32 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file29, heliumBundleFactory30, heliumApplicationFactory31);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj34 = helium32.getPackagePersistedConfig("X-Zeppelin-Token");
    helium25.updatePackageConfig("helium.bundle.cache.js", map_str_obj34);
    helium16.updatePackageConfig("~Trash", map_str_obj34);
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult39 = helium16.getAllPackageInfo(false, "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj41 = helium16.getPackagePersistedConfig("1d225366-166b-4915-87f9-e54c61e0f003");
    note7.setInfo(map_str_obj41);
    org.apache.zeppelin.scheduler.Job job43 = null;
    org.apache.zeppelin.scheduler.Job.Status status44 = null;
    org.apache.zeppelin.scheduler.Job.Status status45 = null;
    note7.beforeStatusChange(job43, status44, status45);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo48 = null;
    note7.persist(0, authenticationInfo48);
    boolean b51 = note7.isLastParagraph("0.8.0-SNAPSHOT");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("load.js", "yarn-cache", "~Trash", zeppelinConfiguration3);
    client4.start();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client4);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AUTO_INTERPRETER_BINDING;
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AUTO_INTERPRETER_BINDING + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AUTO_INTERPRETER_BINDING));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"\",\"roles\":\"\"}", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj5 = message4.data;
    // The following exception was thrown during execution in test generation
    try {
    zeppelinClient3.send(message4, "e8920161-14eb-4094-bb29-b85db179aeab");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj5);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("hi!");

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.deadMessage("helium.bundle.js");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"helium.bundle.js\"},\"meta\":{}}"+ "'", str1.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"helium.bundle.js\"},\"meta\":{}}"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph10 = note7.getParagraphs();
    org.apache.zeppelin.user.Credentials credentials11 = note7.getCredentials();
    note7.setPersonalizedMode((java.lang.Boolean)false);
    org.apache.zeppelin.notebook.NoteNameListener noteNameListener14 = null;
    note7.setNoteNameListener(noteNameListener14);
    org.apache.zeppelin.notebook.Paragraph paragraph17 = note7.getParagraph("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(credentials11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paragraph17);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting6 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup7 = interpreterSetting6.getAllInterpreterGroups();
    java.lang.String str8 = interpreterSetting6.getErrorReason();
    zeppelinConfiguration3.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting6);
    zeppelinConfiguration3.reload();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client11 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("src", "2CJQAY217", "X-Watcher-Key", zeppelinConfiguration3);
    java.lang.String str12 = zeppelinConfiguration3.getKeyStorePassword();
    boolean b13 = zeppelinConfiguration3.isNotebokPublic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    zeppelinConfiguration0.reload();
    java.io.File file8 = null;
    java.io.File file9 = null;
    java.io.File file10 = null;
    java.io.File file11 = null;
    java.io.File file12 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory13 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file8, file9, file10, file11, file12);
    org.w3c.dom.Document document14 = null;
    // The following exception was thrown during execution in test generation
    try {
    zeppelinConfiguration0.initProperties(document14, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
    java.lang.String str1 = notebookRepoSettingsInfo0.name;
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type2 = notebookRepoSettingsInfo0.type;
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type3 = notebookRepoSettingsInfo0.type;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type3);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder3 = builder1.subject("");
    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder5 = builder1.subject(" ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder5);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    heliumApplicationFactory0.setNotebook(notebook1);
    org.apache.zeppelin.notebook.Notebook notebook3 = heliumApplicationFactory0.getNotebook();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type8 = null;
    heliumApplicationFactory0.onOutputUpdated("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "anonymous", (int)'a', "/", type8, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory11 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook12 = null;
    heliumApplicationFactory11.setNotebook(notebook12);
    heliumApplicationFactory0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener)heliumApplicationFactory11);
    org.apache.zeppelin.notebook.Paragraph paragraph15 = null;
    heliumApplicationFactory11.unload(paragraph15, "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook3);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    zeppelinConfiguration0.reload();
    java.io.File file8 = null;
    java.io.File file9 = null;
    java.io.File file10 = null;
    java.io.File file11 = null;
    java.io.File file12 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory13 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file8, file9, file10, file11, file12);
    com.github.eirslett.maven.plugins.frontend.lib.FrontendPluginFactory frontendPluginFactory14 = null;
    java.io.File file15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.io.File file16 = heliumBundleFactory13.bundleHeliumPackage(frontendPluginFactory14, file15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    zeppelinConfiguration0.reload();
    java.io.File file8 = null;
    java.io.File file9 = null;
    java.io.File file10 = null;
    java.io.File file11 = null;
    java.io.File file12 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory13 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file8, file9, file10, file11, file12);
    java.lang.String str15 = zeppelinConfiguration0.getRelativeDir("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}");
    java.util.Collection<org.apache.commons.configuration.event.ConfigurationListener> collection_configurationListener16 = zeppelinConfiguration0.getConfigurationListeners();
    java.net.URL uRL17 = zeppelinConfiguration0.getURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ".//{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}"+ "'", str15.equals(".//{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_configurationListener16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(uRL17);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
    java.lang.String str1 = notebookRepoSettingsInfo0.selected;
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str2 = notebookRepoSettingsInfo0.value;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_map_str_str2);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
    org.apache.zeppelin.notebook.socket.Message message5 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.io.File file10 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory11 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory12 = null;
    org.apache.zeppelin.helium.Helium helium13 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file10, heliumBundleFactory11, heliumApplicationFactory12);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj15 = helium13.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo16 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj15);
    java.io.File file19 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory20 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory21 = null;
    org.apache.zeppelin.helium.Helium helium22 = new org.apache.zeppelin.helium.Helium("hi!", "", file19, heliumBundleFactory20, heliumApplicationFactory21);
    java.io.File file26 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory27 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory28 = null;
    org.apache.zeppelin.helium.Helium helium29 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file26, heliumBundleFactory27, heliumApplicationFactory28);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj31 = helium29.getPackagePersistedConfig("X-Zeppelin-Token");
    helium22.updatePackageConfig("helium.bundle.cache.js", map_str_obj31);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj33 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj15, map_str_obj31);
    message5.data = map_str_obj15;
    java.lang.String str35 = message5.ticket;
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars37 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED;
    org.apache.zeppelin.notebook.socket.Message message38 = message5.put("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", (java.lang.Object)confVars37);
    // The following exception was thrown during execution in test generation
    try {
    zeppelinClient3.send(message5, "{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"data\\\":{}}\"},\"meta\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinHeartbeat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}"+ "'", str35.equals("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}"));
    org.junit.Assert.assertTrue("'" + confVars37 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED + "'", confVars37.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message38);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = zeppelinConfiguration3.getBoolean("configuration");
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client5);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    note7.moveParagraph("0.8.0-SNAPSHOT", (int)(byte)1);
    boolean b13 = note7.isNameEmpty();
    org.apache.zeppelin.notebook.Paragraph paragraph14 = null;
    note7.onOutputAppend(paragraph14, (int)(byte)10, "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"paragraphs\\\":[],\\\"name\\\":\\\"\\\",\\\"id\\\":\\\"2CMDRX9EA\\\",\\\"angularObjects\\\":{},\\\"config\\\":{},\\\"info\\\":{}}\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.EMPTY_TRASH;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.EMPTY_TRASH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.EMPTY_TRASH));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    org.apache.zeppelin.notebook.Note note6 = null;
    heliumApplicationFactory0.onNoteCreate(note6);
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    heliumApplicationFactory0.unload(paragraph8, "");
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo11 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory12 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager13 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory14 = null;
    org.apache.zeppelin.search.SearchService searchService15 = null;
    org.apache.zeppelin.user.Credentials credentials16 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener17 = null;
    org.apache.zeppelin.notebook.Note note18 = new org.apache.zeppelin.notebook.Note(notebookRepo11, interpreterFactory12, interpreterSettingManager13, jobListenerFactory14, searchService15, credentials16, noteEventListener17);
    note18.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph21 = note18.getParagraphs();
    note18.setPersonalizedMode((java.lang.Boolean)true);
    heliumApplicationFactory0.onNoteRemove(note18);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Paragraph paragraph27 = note18.removeParagraph("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph21);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    zeppelinConfiguration0.reload();
    java.io.File file8 = null;
    java.io.File file9 = null;
    java.io.File file10 = null;
    java.io.File file11 = null;
    java.io.File file12 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory13 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file8, file9, file10, file11, file12);
    java.io.File file15 = heliumBundleFactory13.getHeliumPackageBundleCache("notes");
    org.apache.zeppelin.helium.HeliumPackage heliumPackage16 = null;
    org.apache.zeppelin.helium.WebpackResult webpackResult17 = new org.apache.zeppelin.helium.WebpackResult();
    java.lang.String[] str_array18 = webpackResult17.errors;
    java.lang.String[] str_array19 = webpackResult17.warnings;
    // The following exception was thrown during execution in test generation
    try {
    heliumBundleFactory13.prepareSource(heliumPackage16, str_array19, "spark,md,angular,sh,livy,alluxio,file,psql,flink,python,ignite,lens,cassandra,geode,kylin,elasticsearch,scalding,jdbc,hbase,bigquery,beam,pig,scio,groovy");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    boolean b8 = note7.isPersonalizedMode();
    org.apache.zeppelin.notebook.Paragraph paragraph9 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array10 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage11 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage11, interpreterResultMessage_array10);
    note7.onOutputUpdateAll(paragraph9, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage11);
    note7.setName("heliumBundles");
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo17 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory18 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager19 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory20 = null;
    org.apache.zeppelin.search.SearchService searchService21 = null;
    org.apache.zeppelin.user.Credentials credentials22 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener23 = null;
    org.apache.zeppelin.notebook.Note note24 = new org.apache.zeppelin.notebook.Note(notebookRepo17, interpreterFactory18, interpreterSettingManager19, jobListenerFactory20, searchService21, credentials22, noteEventListener23);
    boolean b25 = note24.isPersonalizedMode();
    org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array27 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage28 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28, interpreterResultMessage_array27);
    note24.onOutputUpdateAll(paragraph26, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28);
    note7.onOutputUpdateAll(paragraph16, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28);
    note7.setName("{\"op\":\"DEAD\",\"data\":{\"token\":\"helium.bundle.js\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.merge(folder3);
    java.lang.String str5 = folder3.getParentFolderId();
    org.apache.zeppelin.notebook.FolderView folderView6 = new org.apache.zeppelin.notebook.FolderView();
    folder3.addFolderListener((org.apache.zeppelin.notebook.FolderListener)folderView6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "/"+ "'", str5.equals("/"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize(".//conf/.//conf/keystore", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTE_JOBS;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTE_JOBS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTE_JOBS));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
    byte[] byte_array3 = new byte[] { (byte)0, (byte)0 };
    watcherWebsocket0.onWebSocketBinary(byte_array3, (int)(byte)100, (int)(short)0);
    org.eclipse.jetty.websocket.api.Session session7 = watcherWebsocket0.connection;
    java.lang.Throwable throwable8 = null;
    watcherWebsocket0.onWebSocketError(throwable8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(watcherWebsocket0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session7);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
    instance0.name = "anonymous";
    instance0.id = (short)-1;

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
    int i1 = folderView0.countNotes();
    org.apache.zeppelin.notebook.Folder folder2 = null;
    // The following exception was thrown during execution in test generation
    try {
    folderView0.onFolderRenamed(folder2, "local_modules");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    note7.setName("0.8.0-SNAPSHOT");
    note7.moveParagraph("0.8.0-SNAPSHOT", (int)(byte)1);
    org.apache.zeppelin.notebook.Paragraph paragraph13 = null;
    note7.onOutputAppend(paragraph13, (int)(byte)1, "X-Watcher-Key");

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    java.lang.String str7 = zeppelinConfiguration0.getMongoCollection();
    org.apache.commons.configuration.HierarchicalConfiguration.Node node8 = zeppelinConfiguration0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "notes"+ "'", str7.equals("notes"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
    java.lang.String str1 = instance0.token;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.lang.String[] str_array11 = new java.lang.String[] { "1d225366-166b-4915-87f9-e54c61e0f003", "heliumBundles", "helium.bundle.cache.js", "helium.bundle.cache.js", "local_modules", "X-Zeppelin-Token", "/", "bundles", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str12 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str12, str_array11);
    notebookAuthorization0.setRoles("bundles", (java.util.Set<java.lang.String>)linkedhashset_str12);
    java.lang.String[] str_array27 = new java.lang.String[] { "bundles", "", "bundles", "hi!", "src", "X-Zeppelin-Token", "", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "helium.bundle.js", "0.8.0-SNAPSHOT", "helium.bundle.js", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str28, str_array27);
    boolean b31 = notebookAuthorization0.hasReadAuthorization((java.util.Set<java.lang.String>)linkedhashset_str28, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    boolean b32 = notebookAuthorization0.isPublic();
    boolean b33 = notebookAuthorization0.isPublic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    java.lang.Object obj7 = zeppelinConfiguration3.getProperty("yarn-cache");
    java.util.Properties properties9 = zeppelinConfiguration3.getProperties("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.commons.configuration.SubnodeConfiguration subnodeConfiguration11 = zeppelinConfiguration3.configurationAt("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties9);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder5 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder3.merge(folder5);
    folder1.merge(folder3);
    folder1.notifyRenamed("Message{data={}, op=null}");
    org.apache.zeppelin.notebook.Folder folder11 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder13 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder15 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder13.merge(folder15);
    folder11.merge(folder13);
    folder11.notifyRenamed("Message{data={}, op=null}");
    folder1.addChild(folder11);
    org.apache.zeppelin.notebook.Folder folder22 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder24 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder22.merge(folder24);
    boolean b26 = folder24.hasChild();
    int i27 = folder24.countNotes();
    folder11.setParent(folder24);
    java.lang.String str29 = folder11.getParentFolderId();
    boolean b30 = folder11.hasChild();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "/"+ "'", str29.equals("/"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder(".//conf/.//conf/keystore");

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
    org.apache.zeppelin.search.SearchService searchService5 = null;
    org.apache.zeppelin.user.Credentials credentials6 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
    org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
    org.apache.zeppelin.user.Credentials credentials9 = null;
    note8.setCredentials(credentials9);
    boolean b11 = note8.isPersonalizedMode();
    java.lang.String str12 = note8.getFolderId();
    luceneSearch0.updateIndexDoc(note8);
    org.apache.zeppelin.notebook.Paragraph paragraph15 = note8.clearParagraphOutput("src");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/"+ "'", str12.equals("/"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paragraph15);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
    org.apache.zeppelin.search.SearchService searchService5 = null;
    org.apache.zeppelin.user.Credentials credentials6 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
    org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
    note8.setName("0.8.0-SNAPSHOT");
    folderView0.removeNote(note8);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("hi!", "src", zeppelinConfiguration2);
    org.apache.zeppelin.notebook.socket.Message message5 = zeppelinClient3.deserialize("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}");
    java.lang.String str6 = message5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Message{data={}, op=null}"+ "'", str6.equals("Message{data={}, op=null}"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.handleMsgFromZeppelinHub("hi!");
    zeppelinhubClient2.initUser("helium.bundle.js");
    // The following exception was thrown during execution in test generation
    try {
    zeppelinhubClient2.send(".//conf/.//conf/keystore", ".//{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
    java.util.Set<java.lang.String> set_str3 = notebookAuthorization1.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration5 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization6 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration5);
    java.util.Set<java.lang.String> set_str8 = notebookAuthorization6.getReaders("X-Zeppelin-Token");
    notebookAuthorization1.setRoles("~Trash", set_str8);
    java.util.Set<java.lang.String> set_str11 = notebookAuthorization1.getOwners("helium.bundle.js");
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization13 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.lang.String[] str_array24 = new java.lang.String[] { "1d225366-166b-4915-87f9-e54c61e0f003", "heliumBundles", "helium.bundle.cache.js", "helium.bundle.cache.js", "local_modules", "X-Zeppelin-Token", "/", "bundles", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str25 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str25, str_array24);
    notebookAuthorization13.setRoles("bundles", (java.util.Set<java.lang.String>)linkedhashset_str25);
    java.lang.String[] str_array40 = new java.lang.String[] { "bundles", "", "bundles", "hi!", "src", "X-Zeppelin-Token", "", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "helium.bundle.js", "0.8.0-SNAPSHOT", "helium.bundle.js", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str41 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str41, str_array40);
    boolean b44 = notebookAuthorization13.hasReadAuthorization((java.util.Set<java.lang.String>)linkedhashset_str41, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    notebookAuthorization1.setReaders("e8920161-14eb-4094-bb29-b85db179aeab", (java.util.Set<java.lang.String>)linkedhashset_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type1 = notebookRepoSettingsInfo0.type;
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo2 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
    notebookRepoSettingsInfo2.name = "bundles";
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type5 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN;
    notebookRepoSettingsInfo2.type = type5;
    notebookRepoSettingsInfo0.type = type5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsInfo2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN + "'", type5.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    org.apache.zeppelin.helium.HeliumConf heliumConf0 = new org.apache.zeppelin.helium.HeliumConf();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj1 = heliumConf0.getAllPackageConfigs();
    java.lang.String[] str_array19 = new java.lang.String[] { "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "Message{data={}, op=null}", "X-Zeppelin-Token", "hi!", "~Trash", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "yarn-cache", "/", "hi!", "X-Zeppelin-Token", "heliumBundles", "helium.bundle.cache.js", "heliumBundles", "2CMTCH2J9", "1d225366-166b-4915-87f9-e54c61e0f003", "helium.bundle.js", "helium-bundle" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    heliumConf0.setBundleDisplayOrder((java.util.List<java.lang.String>)arraylist_str20);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj23 = heliumConf0.getAllPackageConfigs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj23);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PATH;
    float f1 = confVars0.getFloatValue();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PATH + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PATH));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == (-1.0f));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.io.File file5 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory6 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory7 = null;
    org.apache.zeppelin.helium.Helium helium8 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file5, heliumBundleFactory6, heliumApplicationFactory7);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj10 = helium8.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo11 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj10);
    java.lang.String str12 = noteInfo11.getName();
    java.io.File file17 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory18 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory19 = null;
    org.apache.zeppelin.helium.Helium helium20 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file17, heliumBundleFactory18, heliumApplicationFactory19);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj22 = helium20.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo23 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj22);
    noteInfo11.setConfig(map_str_obj22);
    java.io.File file31 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory32 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory33 = null;
    org.apache.zeppelin.helium.Helium helium34 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file31, heliumBundleFactory32, heliumApplicationFactory33);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj36 = helium34.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo37 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj36);
    java.io.File file40 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory41 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory42 = null;
    org.apache.zeppelin.helium.Helium helium43 = new org.apache.zeppelin.helium.Helium("hi!", "", file40, heliumBundleFactory41, heliumApplicationFactory42);
    java.io.File file47 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory48 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory49 = null;
    org.apache.zeppelin.helium.Helium helium50 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file47, heliumBundleFactory48, heliumApplicationFactory49);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj52 = helium50.getPackagePersistedConfig("X-Zeppelin-Token");
    helium43.updatePackageConfig("helium.bundle.cache.js", map_str_obj52);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj54 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj36, map_str_obj52);
    org.apache.zeppelin.notebook.NoteInfo noteInfo55 = new org.apache.zeppelin.notebook.NoteInfo("helium.bundle.cache.js", "0.8.0-SNAPSHOT", map_str_obj52);
    java.io.File file60 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory61 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory62 = null;
    org.apache.zeppelin.helium.Helium helium63 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file60, heliumBundleFactory61, heliumApplicationFactory62);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj65 = helium63.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo66 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj65);
    java.lang.String str67 = noteInfo66.getName();
    java.io.File file72 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory73 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory74 = null;
    org.apache.zeppelin.helium.Helium helium75 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file72, heliumBundleFactory73, heliumApplicationFactory74);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj77 = helium75.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo78 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj77);
    noteInfo66.setConfig(map_str_obj77);
    org.apache.zeppelin.notebook.NoteInfo[] noteInfo_array80 = new org.apache.zeppelin.notebook.NoteInfo[] { noteInfo11, noteInfo55, noteInfo66 };
    java.util.ArrayList<org.apache.zeppelin.notebook.NoteInfo> arraylist_noteInfo81 = new java.util.ArrayList<org.apache.zeppelin.notebook.NoteInfo>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.notebook.NoteInfo>)arraylist_noteInfo81, noteInfo_array80);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo83 = null;
    java.util.List<org.apache.zeppelin.notebook.NoteInfo> list_noteInfo84 = notebookAuthorization0.filterByUser((java.util.List<org.apache.zeppelin.notebook.NoteInfo>)arraylist_noteInfo81, authenticationInfo83);
    boolean b85 = notebookAuthorization0.isPublic();
    notebookAuthorization0.removeNote("Message{data={}, op=null}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str12.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str67.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(noteInfo_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_noteInfo84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    java.lang.Object obj1 = zeppelinConfiguration0.getReloadLock();
    int i2 = zeppelinConfiguration0.getServerPort();
    java.util.List<org.apache.commons.configuration.HierarchicalConfiguration> list_hierarchicalConfiguration4 = zeppelinConfiguration0.configurationsAt("X-Watcher-Key");
    short s7 = zeppelinConfiguration0.getShort(".//{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", (short)10);
    org.w3c.dom.Document document8 = null;
    // The following exception was thrown during execution in test generation
    try {
    zeppelinConfiguration0.initProperties(document8, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_hierarchicalConfiguration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)10);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array3 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo4 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo4, interpreterInfo_array3);
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry8 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage9 = heliumLocalRegistry8.getAll();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency10 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting11 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup12 = interpreterSetting11.getAllInterpreterGroups();
    java.lang.String str13 = interpreterSetting11.getErrorReason();
    java.lang.String str14 = interpreterSetting11.getId();
    interpreterSetting11.setPath("src");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption17 = interpreterSetting11.getOption();
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner19 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting20 = new org.apache.zeppelin.interpreter.InterpreterSetting("1d225366-166b-4915-87f9-e54c61e0f003", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "anonymous", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo4, (java.lang.Object)heliumLocalRegistry8, list_dependency10, interpreterOption17, "heliumBundles", interpreterRunner19);
    org.apache.zeppelin.interpreter.InterpreterSetting.Status status21 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES;
    interpreterSetting20.setStatus(status21);
    interpreterSetting20.addNoteToPara(".//conf/notebook-authorization.json", "e8920161-14eb-4094-bb29-b85db179aeab");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption17);
    org.junit.Assert.assertTrue("'" + status21 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES + "'", status21.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo0 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory1 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory3 = null;
    org.apache.zeppelin.search.SearchService searchService4 = null;
    org.apache.zeppelin.user.Credentials credentials5 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener6 = null;
    org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note(notebookRepo0, interpreterFactory1, interpreterSettingManager2, jobListenerFactory3, searchService4, credentials5, noteEventListener6);
    org.apache.zeppelin.user.Credentials credentials8 = null;
    note7.setCredentials(credentials8);
    java.lang.String str10 = note7.toJson();
    org.apache.zeppelin.notebook.Paragraph paragraph13 = note7.clearPersonalizedParagraphOutput("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "anonymous");
    java.lang.String str14 = note7.getNameWithoutPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CN3T45UG\",\"angularObjects\":{},\"config\":{},\"info\":{}}"+ "'", str10.equals("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CN3T45UG\",\"angularObjects\":{},\"config\":{},\"info\":{}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paragraph13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "2CN3T45UG"+ "'", str14.equals("2CN3T45UG"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.merge(folder3);
    boolean b5 = folder3.hasChild();
    org.apache.zeppelin.notebook.Folder folder6 = folder3.getParent();
    org.apache.zeppelin.notebook.Folder folder8 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder10 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder12 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder10.merge(folder12);
    folder8.merge(folder10);
    folder8.notifyRenamed("Message{data={}, op=null}");
    java.lang.String str17 = folder8.getId();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo18 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory19 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager20 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory21 = null;
    org.apache.zeppelin.search.SearchService searchService22 = null;
    org.apache.zeppelin.user.Credentials credentials23 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener24 = null;
    org.apache.zeppelin.notebook.Note note25 = new org.apache.zeppelin.notebook.Note(notebookRepo18, interpreterFactory19, interpreterSettingManager20, jobListenerFactory21, searchService22, credentials23, noteEventListener24);
    note25.setName("0.8.0-SNAPSHOT");
    note25.moveParagraph("0.8.0-SNAPSHOT", (int)(byte)1);
    folder8.addNote(note25);
    folder3.merge(folder8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(folder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "anonymous"+ "'", str17.equals("anonymous"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    zeppelinWebsocket1.noteId = "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}";

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_OUTPUT;
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_OUTPUT));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getTrustStorePath();
    // The following exception was thrown during execution in test generation
    try {
    int i4 = zeppelinConfiguration0.getInt("http://registry.npmjs.org/");
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/.//conf/keystore"+ "'", str2.equals(".//conf/.//conf/keystore"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    java.lang.Object obj1 = zeppelinConfiguration0.getReloadLock();
    java.lang.String str2 = zeppelinConfiguration0.getKeyStoreType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "JKS"+ "'", str2.equals("JKS"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.deadMessage(" ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIST_NOTES\",\"meta\":{}}"+ "'", str1.equals("{\"op\":\"LIST_NOTES\",\"meta\":{}}"));

  }

}
