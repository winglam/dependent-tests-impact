
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.lang.String str1 = message0.principal;
    java.lang.String str2 = message0.roles;
    java.lang.Iterable<org.apache.zeppelin.helium.HeliumRegistry> iterable_heliumRegistry4 = message0.getType("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CN35WB85\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str1.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "src"+ "'", str2.equals("src"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iterable_heliumRegistry4);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision7 = notebookRepoSync3.checkpoint("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "load.js", authenticationInfo6);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo8 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookRepoSync3.sync(authenticationInfo8);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision7);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

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
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo15 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory18 = null;
    org.apache.zeppelin.search.SearchService searchService19 = null;
    org.apache.zeppelin.user.Credentials credentials20 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener21 = null;
    org.apache.zeppelin.notebook.Note note22 = new org.apache.zeppelin.notebook.Note(notebookRepo15, interpreterFactory16, interpreterSettingManager17, jobListenerFactory18, searchService19, credentials20, noteEventListener21);
    note22.setName("0.8.0-SNAPSHOT");
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting25 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup26 = interpreterSetting25.getAllInterpreterGroups();
    java.lang.String str27 = interpreterSetting25.getErrorReason();
    java.lang.String str28 = interpreterSetting25.getId();
    interpreterSetting25.setPath("src");
    interpreterSetting25.clearNoteIdAndParaMap();
    heliumApplicationFactory11.onUnbindInterpreter(note22, interpreterSetting25);
    org.apache.zeppelin.interpreter.InterpreterSetting.Status status33 = interpreterSetting25.getStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status33);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinOp("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(oP1);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

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
    java.lang.String str18 = folder8.getName();
    // The following exception was thrown during execution in test generation
    try {
    folder6.addChild(folder8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(folder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "anonymous"+ "'", str17.equals("anonymous"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "anonymous"+ "'", str18.equals("anonymous"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getTrustStorePath();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.commons.configuration.SubnodeConfiguration subnodeConfiguration4 = zeppelinConfiguration0.configurationAt("~Trash");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getTrustStorePath();
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting6 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup7 = interpreterSetting6.getAllInterpreterGroups();
    java.lang.String str8 = interpreterSetting6.getErrorReason();
    zeppelinConfiguration3.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting6);
    zeppelinConfiguration3.reload();
    java.io.File file11 = null;
    java.io.File file12 = null;
    java.io.File file13 = null;
    java.io.File file14 = null;
    java.io.File file15 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory16 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration3, file11, file12, file13, file14, file15);
    java.io.File file18 = heliumBundleFactory16.getHeliumPackageBundleCache("notes");
    // The following exception was thrown during execution in test generation
    try {
    zeppelinConfiguration0.load(file18);
      org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
    } catch (org.apache.commons.configuration.ConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/.//conf/keystore"+ "'", str2.equals(".//conf/.//conf/keystore"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file18);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    // The following exception was thrown during execution in test generation
    try {
    zeppelinConfiguration3.setRootElementName("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
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
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting6 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup7 = interpreterSetting6.getAllInterpreterGroups();
    java.lang.String str8 = interpreterSetting6.getErrorReason();
    zeppelinConfiguration3.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting6);
    zeppelinConfiguration3.reload();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client11 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("src", "2CJQAY217", "X-Watcher-Key", zeppelinConfiguration3);
    org.apache.commons.configuration.tree.ExpressionEngine expressionEngine12 = zeppelinConfiguration3.getExpressionEngine();
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars13 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN_HIDE;
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.VarType varType14 = confVars13.getType();
    java.lang.String str15 = zeppelinConfiguration3.getString(confVars13);
    java.util.Collection<org.apache.commons.configuration.event.ConfigurationListener> collection_configurationListener16 = zeppelinConfiguration3.getConfigurationListeners();
    
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
    org.junit.Assert.assertNotNull(expressionEngine12);
    org.junit.Assert.assertTrue("'" + confVars13 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN_HIDE + "'", confVars13.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN_HIDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(varType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_configurationListener16);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision7 = notebookRepoSync3.checkpoint("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "load.js", authenticationInfo6);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo9 = null;
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision10 = notebookRepoSync3.revisionHistory("package.json", authenticationInfo9);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo11 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookRepoSync3.sync(authenticationInfo11);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_revision10);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getSinglePackageInfo("");
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult10 = helium5.getAllEnabledPackages();
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult12 = helium5.getSinglePackageInfo("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult12);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.net.URL uRL2 = null;
    zeppelinConfiguration0.setURL(uRL2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
    byte[] byte_array7 = new byte[] { (byte)10, (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10 };
    watcherWebsocket0.onWebSocketBinary(byte_array7, (int)'#', (int)(short)10);
    java.lang.Throwable throwable11 = null;
    watcherWebsocket0.onWebSocketError(throwable11);
    org.eclipse.jetty.websocket.api.Session session13 = watcherWebsocket0.connection;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session13);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig(" ");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult10 = helium5.getPackageInfo("~Trash", "{\"op\":\"DEAD\",\"data\":{\"token\":\"helium.bundle.js\"},\"meta\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    java.lang.Object obj1 = zeppelinConfiguration0.getReloadLock();
    org.apache.commons.configuration.Configuration configuration2 = zeppelinConfiguration0.interpolatedConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configuration2);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

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
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str10 = note7.generateParagraphsInfo();
    boolean b11 = note7.isPersonalizedMode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CK7HWPBF\",\"angularObjects\":{},\"config\":{},\"info\":{}}"+ "'", str9.equals("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CK7HWPBF\",\"angularObjects\":{},\"config\":{},\"info\":{}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_map_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    java.lang.Object obj1 = zeppelinConfiguration0.getReloadLock();
    org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy2 = null;
    // The following exception was thrown during execution in test generation
    try {
    zeppelinConfiguration0.setReloadingStrategy(reloadingStrategy2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj1 = message0.data;
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message0, map_str_str2);
    java.lang.Object obj4 = zeppelinhubMessage3.data;
    java.lang.Object obj5 = zeppelinhubMessage3.op;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    java.lang.String str7 = zeppelinConfiguration0.getMongoCollection();
    boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
    
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
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult3 = new org.apache.zeppelin.helium.HeliumPackageSearchResult("e8920161-14eb-4094-bb29-b85db179aeab", heliumPackage1, false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b2 = zeppelinConfiguration1.isAnonymousAllowed();
    java.lang.String str3 = zeppelinConfiguration1.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication4 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("", zeppelinConfiguration1);
    authentication4.run();
    boolean b6 = authentication4.authenticate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".//conf/interpreter-list"+ "'", str3.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authentication4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    java.lang.Object obj1 = zeppelinConfiguration0.getReloadLock();
    int i2 = zeppelinConfiguration0.getServerPort();
    java.util.List<org.apache.commons.configuration.HierarchicalConfiguration> list_hierarchicalConfiguration4 = zeppelinConfiguration0.configurationsAt("X-Watcher-Key");
    boolean b5 = zeppelinConfiguration0.isValidating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_hierarchicalConfiguration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

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
    org.apache.zeppelin.notebook.socket.Message message21 = zeppelinClient3.deserialize("heliumBundles");
    zeppelinClient3.stop();
    
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
    org.junit.Assert.assertNotNull(zeppelinHeartbeat19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(message21);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("~Trash");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings2 = builder1.build();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings2);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    org.apache.commons.lang.text.StrSubstitutor strSubstitutor6 = zeppelinConfiguration3.getSubstitutor();
    long long9 = zeppelinConfiguration3.getLong("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(strSubstitutor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

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
    java.lang.String str21 = message20.principal;
    java.io.File file26 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory27 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory28 = null;
    org.apache.zeppelin.helium.Helium helium29 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file26, heliumBundleFactory27, heliumApplicationFactory28);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj31 = helium29.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo32 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj31);
    message20.data = map_str_obj31;
    java.util.Map<java.lang.String,java.lang.String> map_str_str34 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage35 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message20, map_str_str34);
    java.lang.Object obj36 = zeppelinhubMessage35.op;
    zeppelinhubMessage15.data = zeppelinhubMessage35;
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars38 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_SHARE;
    zeppelinhubMessage35.data = confVars38;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str1.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"+ "'", str21.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    org.junit.Assert.assertTrue("'" + confVars38 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_SHARE + "'", confVars38.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_SHARE));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.lang.String[] str_array34 = new java.lang.String[] { "helium-bundle", "heliumBundles", "", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}", "2CJB2PWE5", " ", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "load.js", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}", "helium.bundle.cache.js", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "yarn-cache", "", "load.js", "0.8.0-SNAPSHOT", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium.bundle.js", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "heliumBundles", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "anonymous", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium-bundle", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array34);
    notebookAuthorization0.setOwners("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", (java.util.Set<java.lang.String>)linkedhashset_str35);
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration39 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization40 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration39);
    java.util.Set<java.lang.String> set_str42 = notebookAuthorization40.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration44 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization45 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration44);
    java.util.Set<java.lang.String> set_str47 = notebookAuthorization45.getReaders("X-Zeppelin-Token");
    notebookAuthorization40.setRoles("~Trash", set_str47);
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration50 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization51 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration50);
    java.util.Set<java.lang.String> set_str53 = notebookAuthorization51.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration55 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization56 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration55);
    java.util.Set<java.lang.String> set_str58 = notebookAuthorization56.getReaders("X-Zeppelin-Token");
    notebookAuthorization51.setRoles("~Trash", set_str58);
    java.util.Set<java.lang.String> set_str61 = notebookAuthorization51.getOwners("helium.bundle.js");
    notebookAuthorization40.setRoles("helium-bundle", set_str61);
    boolean b63 = notebookAuthorization0.isReader("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"Message{data\\u003d{}, op\\u003dnull}\",\"roles\":\"src\"}", set_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    boolean b8 = zeppelinConfiguration3.getBoolean(".//interpreter", false);
    java.lang.Short s11 = zeppelinConfiguration3.getShort("", (java.lang.Short)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + s11 + "' != '" + (short)1+ "'", s11.equals((short)1));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    java.lang.String str7 = zeppelinConfiguration0.getNotebookAuthorizationPath();
    java.util.Collection<org.apache.commons.configuration.event.ConfigurationListener> collection_configurationListener8 = zeppelinConfiguration0.getConfigurationListeners();
    boolean b9 = zeppelinConfiguration0.isSchemaValidation();
    
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
    org.junit.Assert.assertNotNull(collection_configurationListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision7 = notebookRepoSync3.checkpoint("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "load.js", authenticationInfo6);
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo8 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory9 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager10 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory11 = null;
    org.apache.zeppelin.search.SearchService searchService12 = null;
    org.apache.zeppelin.user.Credentials credentials13 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener14 = null;
    org.apache.zeppelin.notebook.Note note15 = new org.apache.zeppelin.notebook.Note(notebookRepo8, interpreterFactory9, interpreterSettingManager10, jobListenerFactory11, searchService12, credentials13, noteEventListener14);
    org.apache.zeppelin.user.Credentials credentials16 = null;
    note15.setCredentials(credentials16);
    boolean b18 = note15.isPersonalizedMode();
    java.lang.String str19 = note15.getFolderId();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo20 = null;
    notebookRepoSync3.save(note15, authenticationInfo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "/"+ "'", str19.equals("/"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
    notebookRepoSettingsInfo0.name = "bundles";
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str3 = notebookRepoSettingsInfo0.value;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_map_str_str3);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = helium5.getPackagePersistedConfig("X-Zeppelin-Token");
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getSinglePackageInfo("");
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult10 = helium5.getAllEnabledPackages();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult13 = helium5.getPackageInfo("X-Zeppelin-Token", "JKS");
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
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    java.lang.Object obj7 = zeppelinConfiguration3.getProperty("yarn-cache");
    java.util.Properties properties9 = zeppelinConfiguration3.getProperties("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");
    boolean b10 = zeppelinConfiguration3.isEmpty();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

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
    java.lang.String str16 = zeppelinConfiguration0.getMongoUri();
    zeppelinConfiguration0.setEncoding("helium.bundle.js");
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "mongodb://localhost"+ "'", str16.equals("mongodb://localhost"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving1 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str2 = interpreterInfoSaving1.interpreterBindings;
    org.sonatype.aether.repository.RemoteRepository[] remoteRepository_array3 = new org.sonatype.aether.repository.RemoteRepository[] {  };
    java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository> arraylist_remoteRepository4 = new java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.sonatype.aether.repository.RemoteRepository>)arraylist_remoteRepository4, remoteRepository_array3);
    interpreterInfoSaving1.interpreterRepositories = arraylist_remoteRepository4;
    interpreterInfoSaving0.interpreterRepositories = arraylist_remoteRepository4;
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str8 = interpreterInfoSaving0.interpreterBindings;
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterSetting> map_str_interpreterSetting9 = interpreterInfoSaving0.interpreterSettings;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(remoteRepository_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_interpreterSetting9);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

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
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat22 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
    
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
    org.junit.Assert.assertNull(message21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinHeartbeat22);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

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
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo29 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager31 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory32 = null;
    org.apache.zeppelin.search.SearchService searchService33 = null;
    org.apache.zeppelin.user.Credentials credentials34 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener35 = null;
    org.apache.zeppelin.notebook.Note note36 = new org.apache.zeppelin.notebook.Note(notebookRepo29, interpreterFactory30, interpreterSettingManager31, jobListenerFactory32, searchService33, credentials34, noteEventListener35);
    note36.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph39 = note36.getParagraphs();
    note36.setPersonalizedMode((java.lang.Boolean)true);
    folder11.addNote(note36);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo44 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Paragraph paragraph45 = note36.insertNewParagraph((int)'4', authenticationInfo44);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph39);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook1 = heliumApplicationFactory0.getNotebook();
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    heliumApplicationFactory0.unload(paragraph2, "helium.bundle.cache.js");
    org.apache.zeppelin.notebook.Notebook notebook5 = heliumApplicationFactory0.getNotebook();
    org.apache.zeppelin.notebook.Paragraph paragraph6 = null;
    heliumApplicationFactory0.unload(paragraph6, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook5);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

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
    java.util.List<org.apache.zeppelin.notebook.Note> list_note29 = folder24.getNotes();
    java.util.List<org.apache.zeppelin.notebook.Note> list_note30 = folder24.getNotesRecursively();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_note29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_note30);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.eclipse.jetty.websocket.api.Session session2 = null;
    zeppelinWebsocket1.connection = session2;

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
    java.util.Set<java.lang.String> set_str3 = notebookAuthorization1.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration5 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization6 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration5);
    java.util.Set<java.lang.String> set_str8 = notebookAuthorization6.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration10 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization11 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration10);
    java.util.Set<java.lang.String> set_str13 = notebookAuthorization11.getReaders("X-Zeppelin-Token");
    notebookAuthorization6.setRoles("~Trash", set_str13);
    boolean b15 = notebookAuthorization1.isWriter("hi!", set_str13);
    java.util.Set<java.lang.String> set_str17 = notebookAuthorization1.getWriters("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"paragraphs\\\":[],\\\"name\\\":\\\"\\\",\\\"id\\\":\\\"2CMDRX9EA\\\",\\\"angularObjects\\\":{},\\\"config\\\":{},\\\"info\\\":{}}\"},\"meta\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str17);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("0.8.0-SNAPSHOT");
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient4.initUser(" ");
    zeppelinhubClient4.initUser(" ");
    zeppelinhubMessage1.data = zeppelinhubClient4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient4);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings0 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
    notebookRepoWithSettings0.className = "src";
    java.lang.String str3 = notebookRepoWithSettings0.name;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_GROUP_ORDER;
    java.lang.Class class1 = confVars0.getVarClass();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_GROUP_ORDER + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_GROUP_ORDER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class1);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder3 = builder1.className(" ");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings4 = builder3.build();
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo5 = notebookRepoWithSettings4.settings;
    notebookRepoWithSettings4.name = "/";
    notebookRepoWithSettings4.className = "heliumBundles";
    
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "yarn-cache");
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance> list_instance5 = userTokenContainer3.getUserInstances("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userTokenContainer3);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b5 = zeppelinConfiguration4.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration4);
    java.lang.Object obj8 = zeppelinConfiguration4.getProperty("yarn-cache");
    java.util.Properties properties10 = zeppelinConfiguration4.getProperties("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");
    org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication11 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("983f4edc-7fd7-4978-ae01-8de1df3126f1", zeppelinConfiguration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authentication11);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    org.apache.zeppelin.helium.HeliumConf heliumConf0 = new org.apache.zeppelin.helium.HeliumConf();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj1 = heliumConf0.getAllPackageConfigs();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = heliumConf0.getEnabledPackages();
    java.util.List<java.lang.String> list_str3 = heliumConf0.getBundleDisplayOrder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    org.apache.zeppelin.interpreter.InterpreterSetting.Status status0 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY;
    org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY + "'", status0.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting6 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup7 = interpreterSetting6.getAllInterpreterGroups();
    java.lang.String str8 = interpreterSetting6.getErrorReason();
    zeppelinConfiguration3.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting6);
    zeppelinConfiguration3.reload();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client11 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("src", "2CJQAY217", "X-Watcher-Key", zeppelinConfiguration3);
    java.lang.String str12 = zeppelinConfiguration3.getKeyStorePassword();
    boolean b13 = zeppelinConfiguration3.isThrowExceptionOnMissing();
    
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
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    org.apache.commons.lang.text.StrSubstitutor strSubstitutor6 = zeppelinConfiguration3.getSubstitutor();
    javax.xml.parsers.DocumentBuilder documentBuilder7 = zeppelinConfiguration3.getDocumentBuilder();
    zeppelinConfiguration3.setSchemaValidation(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(strSubstitutor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(documentBuilder7);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

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
    java.math.BigDecimal bigDecimal15 = zeppelinConfiguration0.getBigDecimal(".//conf/interpreter-list");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(bigDecimal15);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
    java.lang.String str5 = zeppelinConfiguration0.getString("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.rename("0.8.0-SNAPSHOT");
    int i4 = folder1.countNotes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    java.lang.Object obj1 = zeppelinConfiguration0.getReloadLock();
    int i2 = zeppelinConfiguration0.getServerPort();
    java.util.Iterator<java.lang.String> iterator_str3 = zeppelinConfiguration0.getKeys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_str3);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "yarn-cache");
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance> list_instance5 = userTokenContainer3.getUserInstances("X-Watcher-Key");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userTokenContainer3);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting0);
    interpreterSetting1.setErrorReason("helium.bundle.cache.js");
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting4 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting1);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    java.lang.String str7 = zeppelinConfiguration0.getNotebookAuthorizationPath();
    java.lang.String str8 = zeppelinConfiguration0.getMongoCollection();
    java.lang.String str9 = zeppelinConfiguration0.getKeyManagerPassword();
    org.apache.commons.logging.Log log10 = zeppelinConfiguration0.getLogger();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "notes"+ "'", str8.equals("notes"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(log10);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("hi!", "", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("helium.bundle.cache.js");
    helium5.save();
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult9 = helium5.getAllEnabledPackages();
    java.util.List<org.apache.zeppelin.helium.HeliumRegistry> list_heliumRegistry10 = helium5.getAllRegistry();
    // The following exception was thrown during execution in test generation
    try {
    helium5.enable(".//conf/.//conf/keystore", "helium-bundle");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackageSearchResult9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumRegistry10);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
    java.util.Set<java.lang.String> set_str3 = notebookAuthorization1.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration5 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization6 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration5);
    java.util.Set<java.lang.String> set_str8 = notebookAuthorization6.getReaders("X-Zeppelin-Token");
    notebookAuthorization1.setRoles("~Trash", set_str8);
    java.util.Set<java.lang.String> set_str11 = notebookAuthorization1.getOwners("helium.bundle.js");
    boolean b12 = notebookAuthorization1.isPublic();
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration14 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization15 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration14);
    java.util.Set<java.lang.String> set_str17 = notebookAuthorization15.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration19 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization20 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration19);
    java.util.Set<java.lang.String> set_str22 = notebookAuthorization20.getReaders("X-Zeppelin-Token");
    notebookAuthorization15.setRoles("~Trash", set_str22);
    boolean b24 = notebookAuthorization1.isWriter("helium.bundle.cache.js", set_str22);
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("package.json", "X-Watcher-Key", zeppelinConfiguration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient3);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterDir();
    zeppelinConfiguration0.setEncoding("load.js");
    org.apache.commons.lang.text.StrSubstitutor strSubstitutor5 = zeppelinConfiguration0.getSubstitutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//interpreter"+ "'", str2.equals(".//interpreter"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(strSubstitutor5);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.lang.String[] str_array34 = new java.lang.String[] { "helium-bundle", "heliumBundles", "", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}", "2CJB2PWE5", " ", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "load.js", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}", "helium.bundle.cache.js", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "yarn-cache", "", "load.js", "0.8.0-SNAPSHOT", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium.bundle.js", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "heliumBundles", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "anonymous", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium-bundle", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array34);
    notebookAuthorization0.setOwners("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", (java.util.Set<java.lang.String>)linkedhashset_str35);
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration39 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization40 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration39);
    java.util.Set<java.lang.String> set_str42 = notebookAuthorization40.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization43 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.lang.String[] str_array54 = new java.lang.String[] { "1d225366-166b-4915-87f9-e54c61e0f003", "heliumBundles", "helium.bundle.cache.js", "helium.bundle.cache.js", "local_modules", "X-Zeppelin-Token", "/", "bundles", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str55 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str55, str_array54);
    notebookAuthorization43.setRoles("bundles", (java.util.Set<java.lang.String>)linkedhashset_str55);
    java.util.Set<java.lang.String> set_str59 = notebookAuthorization43.getReaders("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    boolean b61 = notebookAuthorization40.hasWriteAuthorization(set_str59, "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");
    boolean b62 = notebookAuthorization0.isOwner("mongodb://localhost", set_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

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
    helium29.disable("helium.bundle.cache.js");
    java.io.File file35 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory36 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory37 = null;
    org.apache.zeppelin.helium.Helium helium38 = new org.apache.zeppelin.helium.Helium("hi!", "", file35, heliumBundleFactory36, heliumApplicationFactory37);
    java.io.File file42 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory43 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory44 = null;
    org.apache.zeppelin.helium.Helium helium45 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file42, heliumBundleFactory43, heliumApplicationFactory44);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj47 = helium45.getPackagePersistedConfig("X-Zeppelin-Token");
    helium38.updatePackageConfig("helium.bundle.cache.js", map_str_obj47);
    helium29.updatePackageConfig("~Trash", map_str_obj47);
    java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> map_str_list_heliumPackageSearchResult52 = helium29.getAllPackageInfo(false, "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj54 = helium29.getPackagePersistedConfig("1d225366-166b-4915-87f9-e54c61e0f003");
    heliumConf0.updatePackageConfig("load.js", map_str_obj54);
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
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj80 = noteInfo66.getConfig();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj81 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj54, map_str_obj80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "1d225366-166b-4915-87f9-e54c61e0f003"+ "'", str67.equals("1d225366-166b-4915-87f9-e54c61e0f003"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj81);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
    java.io.Writer writer4 = null;
    // The following exception was thrown during execution in test generation
    try {
    zeppelinConfiguration0.save(writer4);
      org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
    } catch (org.apache.commons.configuration.ConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    java.io.File file4 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory5 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory6 = null;
    org.apache.zeppelin.helium.Helium helium7 = new org.apache.zeppelin.helium.Helium("hi!", "", file4, heliumBundleFactory5, heliumApplicationFactory6);
    helium7.disable("helium.bundle.cache.js");
    java.io.File file13 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory14 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory15 = null;
    org.apache.zeppelin.helium.Helium helium16 = new org.apache.zeppelin.helium.Helium("hi!", "", file13, heliumBundleFactory14, heliumApplicationFactory15);
    java.io.File file20 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory21 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = null;
    org.apache.zeppelin.helium.Helium helium23 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file20, heliumBundleFactory21, heliumApplicationFactory22);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj25 = helium23.getPackagePersistedConfig("X-Zeppelin-Token");
    helium16.updatePackageConfig("helium.bundle.cache.js", map_str_obj25);
    helium7.updatePackageConfig("~Trash", map_str_obj25);
    org.apache.zeppelin.notebook.NoteInfo noteInfo28 = new org.apache.zeppelin.notebook.NoteInfo("load.js", "helium.bundle.js", map_str_obj25);
    noteInfo28.setId("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CK7HWPBF\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj25);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterDir();
    java.lang.String str4 = zeppelinConfiguration0.getRelativeDir("2CN3T45UG");
    zeppelinConfiguration0.clearTree(".//{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}");
    java.lang.String str7 = zeppelinConfiguration0.getConfDir();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//interpreter"+ "'", str2.equals(".//interpreter"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ".//2CN3T45UG"+ "'", str4.equals(".//2CN3T45UG"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "conf"+ "'", str7.equals("conf"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory0.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.helium.HeliumPackage heliumPackage15 = null;
    heliumApplicationFactory0.onLoad("", "local_modules", "anonymous", heliumPackage15);
    org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
    heliumApplicationFactory0.unload(paragraph17, "983f4edc-7fd7-4978-ae01-8de1df3126f1");
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory20 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook21 = null;
    heliumApplicationFactory20.setNotebook(notebook21);
    org.apache.zeppelin.notebook.Notebook notebook23 = heliumApplicationFactory20.getNotebook();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type28 = null;
    heliumApplicationFactory20.onOutputUpdated("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "anonymous", (int)'a', "/", type28, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    heliumApplicationFactory20.onOutputAppend("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "src", 1, "0.8.0-SNAPSHOT", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.notebook.Paragraph paragraph37 = null;
    org.apache.zeppelin.scheduler.Job.Status status38 = null;
    heliumApplicationFactory20.onParagraphStatusChange(paragraph37, status38);
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory40 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory40.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory40.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.helium.HeliumPackage heliumPackage55 = null;
    heliumApplicationFactory40.onLoad("", "local_modules", "anonymous", heliumPackage55);
    heliumApplicationFactory40.onStatusChange("bundles", "helium.bundle.js", "helium.bundle.js", "local_modules");
    heliumApplicationFactory20.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener)heliumApplicationFactory40);
    heliumApplicationFactory0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener)heliumApplicationFactory40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook23);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
    java.lang.String str1 = npmPackage0.name;
    java.lang.String str2 = npmPackage0.version;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC;
    java.lang.Class class1 = confVars0.getVarClass();
    org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class1);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo3 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration2);
    org.apache.commons.configuration.interpol.ConfigurationInterpolator configurationInterpolator4 = zeppelinConfiguration2.getInterpolator();
    java.lang.String str5 = zeppelinConfiguration2.getWebsocketMaxTextMessageSize();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CN35WB85\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", zeppelinConfiguration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationInterpolator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1024000"+ "'", str5.equals("1024000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinClient6);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo1 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration0);
    vFSNotebookRepo1.close();
    org.apache.zeppelin.notebook.Folder folder4 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder6 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder8 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder6.merge(folder8);
    folder4.merge(folder6);
    folder4.notifyRenamed("Message{data={}, op=null}");
    org.apache.zeppelin.notebook.Folder folder14 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder16 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder18 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder16.merge(folder18);
    folder14.merge(folder16);
    folder14.notifyRenamed("Message{data={}, op=null}");
    folder4.addChild(folder14);
    org.apache.zeppelin.notebook.Folder folder25 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder27 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder25.merge(folder27);
    boolean b29 = folder27.hasChild();
    int i30 = folder27.countNotes();
    folder14.setParent(folder27);
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo32 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory33 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager34 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory35 = null;
    org.apache.zeppelin.search.SearchService searchService36 = null;
    org.apache.zeppelin.user.Credentials credentials37 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener38 = null;
    org.apache.zeppelin.notebook.Note note39 = new org.apache.zeppelin.notebook.Note(notebookRepo32, interpreterFactory33, interpreterSettingManager34, jobListenerFactory35, searchService36, credentials37, noteEventListener38);
    note39.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph42 = note39.getParagraphs();
    note39.setPersonalizedMode((java.lang.Boolean)true);
    folder14.addNote(note39);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo46 = null;
    vFSNotebookRepo1.save(note39, authenticationInfo46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph42);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    org.apache.zeppelin.notebook.NotebookImportDeserializer notebookImportDeserializer0 = new org.apache.zeppelin.notebook.NotebookImportDeserializer();

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    heliumApplicationFactory0.setNotebook(notebook1);
    org.apache.zeppelin.notebook.Notebook notebook3 = heliumApplicationFactory0.getNotebook();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type8 = null;
    heliumApplicationFactory0.onOutputUpdated("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "anonymous", (int)'a', "/", type8, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    heliumApplicationFactory0.onOutputAppend("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "src", 1, "0.8.0-SNAPSHOT", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
    org.apache.zeppelin.scheduler.Job.Status status18 = null;
    heliumApplicationFactory0.onParagraphStatusChange(paragraph17, status18);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage23 = null;
    heliumApplicationFactory0.onLoad("hi!", "2CJSPTYGZ", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}", heliumPackage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook3);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder3 = builder1.className(" ");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings4 = builder3.build();
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo5 = notebookRepoWithSettings4.settings;
    notebookRepoWithSettings4.name = "/";
    notebookRepoWithSettings4.name = "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}";
    notebookRepoWithSettings4.name = "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}";
    java.lang.String str12 = notebookRepoWithSettings4.className;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " "+ "'", str12.equals(" "));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    java.lang.String str3 = zeppelinConfiguration0.getRootElementName();
    java.lang.String str4 = zeppelinConfiguration0.getKeyStorePassword();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.commons.configuration.SubnodeConfiguration subnodeConfiguration7 = zeppelinConfiguration0.configurationAt("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHJGWPX6\",\"angularObjects\":{},\"config\":{},\"info\":{}}", false);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "configuration"+ "'", str3.equals("configuration"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

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
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj41 = heliumConf0.getAllPackageConfigs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj41);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    java.lang.Object obj7 = zeppelinConfiguration3.getProperty("yarn-cache");
    java.util.Properties properties9 = zeppelinConfiguration3.getProperties("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}");
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    zeppelinConfiguration3.load(inputStream10, ".//{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = org.apache.zeppelin.ticket.TicketContainer.instance;
    boolean b3 = ticketContainer0.isValid("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "~Trash");
    boolean b6 = ticketContainer0.isValid("spark,md,angular,sh,livy,alluxio,file,psql,flink,python,ignite,lens,cassandra,geode,kylin,elasticsearch,scalding,jdbc,hbase,bigquery,beam,pig,scio,groovy", ".//conf/interpreter-list");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ticketContainer0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
    notebookRepoSync3.close();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    java.lang.Object obj7 = zeppelinConfiguration3.getProperty("yarn-cache");
    zeppelinConfiguration3.clear();
    zeppelinConfiguration3.setRootElementName(".//conf/interpreter-list");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.merge(folder3);
    folder3.rename("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}");
    java.lang.String str7 = folder3.getId();
    folder3.rename("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"2CJB2PWE5\",\"roles\":\"src\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"load.js\",\"roles\":\"\"}"+ "'", str7.equals("{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"load.js\",\"roles\":\"\"}"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.eclipse.jetty.websocket.api.Session session2 = null;
    zeppelinWebsocket1.onWebSocketConnect(session2);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

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
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph11 = note8.getParagraphs();
    folderView0.onNoteNameChanged(note8, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    boolean b15 = folderView0.hasFolder("bundles");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
    java.lang.Throwable throwable1 = null;
    watcherWebsocket0.onWebSocketError(throwable1);
    org.eclipse.jetty.websocket.api.Session session3 = null;
    watcherWebsocket0.connection = session3;
    watcherWebsocket0.onWebSocketClose((int)(short)100, "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}");
    org.eclipse.jetty.websocket.api.Session session8 = null;
    watcherWebsocket0.connection = session8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(watcherWebsocket0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision7 = notebookRepoSync3.checkpoint("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "load.js", authenticationInfo6);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo9 = null;
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision10 = notebookRepoSync3.revisionHistory("package.json", authenticationInfo9);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo11 = null;
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings> list_notebookRepoWithSettings12 = notebookRepoSync3.getNotebookRepos(authenticationInfo11);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
    org.apache.zeppelin.notebook.Note note16 = notebookRepoSync3.setNoteRevision("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", "package.json", authenticationInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_revision10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_notebookRepoWithSettings12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(note16);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting6 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup7 = interpreterSetting6.getAllInterpreterGroups();
    java.lang.String str8 = interpreterSetting6.getErrorReason();
    zeppelinConfiguration3.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting6);
    zeppelinConfiguration3.reload();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client11 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("src", "2CJQAY217", "X-Watcher-Key", zeppelinConfiguration3);
    java.lang.String str12 = zeppelinConfiguration3.getKeyStorePassword();
    java.lang.String str13 = zeppelinConfiguration3.getInterpreterDir();
    org.apache.commons.configuration.Configuration configuration14 = zeppelinConfiguration3.interpolatedConfiguration();
    org.apache.commons.configuration.tree.ExpressionEngine expressionEngine15 = zeppelinConfiguration3.getExpressionEngine();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ".//interpreter"+ "'", str13.equals(".//interpreter"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configuration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(expressionEngine15);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
    instance0.name = "anonymous";
    java.lang.String str3 = instance0.token;
    java.lang.String str4 = instance0.token;
    java.lang.String str5 = instance0.token;
    java.lang.String str6 = instance0.token;
    instance0.name = "{\"op\":\"PING\",\"data\":{\"token\":\"~Trash\"},\"meta\":{}}";
    instance0.id = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterDir();
    java.util.List<java.lang.Object> list_obj4 = zeppelinConfiguration0.getList("X-Zeppelin-Token");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//interpreter"+ "'", str2.equals(".//interpreter"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj4);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
    org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder3 = builder1.subject("");
    org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage4 = builder1.build();
    java.lang.String str5 = watcherMessage4.subject;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(watcherMessage4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

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
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj30 = helium5.getPackagePersistedConfig("1d225366-166b-4915-87f9-e54c61e0f003");
    // The following exception was thrown during execution in test generation
    try {
    helium5.enable("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_heliumPackageSearchResult28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj30);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    java.lang.String str0 = org.apache.zeppelin.util.WatcherSecurityKey.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "5767bf49-e057-4071-850b-8d682ae5241f"+ "'", str0.equals("5767bf49-e057-4071-850b-8d682ae5241f"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

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
    java.lang.String str12 = note7.getNameWithoutPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(credentials11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0.8.0-SNAPSHOT"+ "'", str12.equals("0.8.0-SNAPSHOT"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

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
    java.util.Collection<org.apache.zeppelin.dep.Dependency> collection_dependency20 = message4.getType("~Trash");
    java.lang.String str21 = message4.ticket;
    java.io.File file26 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory27 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory28 = null;
    org.apache.zeppelin.helium.Helium helium29 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file26, heliumBundleFactory27, heliumApplicationFactory28);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj31 = helium29.getPackagePersistedConfig("X-Zeppelin-Token");
    org.apache.zeppelin.notebook.NoteInfo noteInfo32 = new org.apache.zeppelin.notebook.NoteInfo("/", "1d225366-166b-4915-87f9-e54c61e0f003", map_str_obj31);
    java.io.File file35 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory36 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory37 = null;
    org.apache.zeppelin.helium.Helium helium38 = new org.apache.zeppelin.helium.Helium("hi!", "", file35, heliumBundleFactory36, heliumApplicationFactory37);
    java.io.File file42 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory43 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory44 = null;
    org.apache.zeppelin.helium.Helium helium45 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file42, heliumBundleFactory43, heliumApplicationFactory44);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj47 = helium45.getPackagePersistedConfig("X-Zeppelin-Token");
    helium38.updatePackageConfig("helium.bundle.cache.js", map_str_obj47);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj49 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj31, map_str_obj47);
    message4.data = map_str_obj31;
    
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
    org.junit.Assert.assertNull(collection_dependency20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}"+ "'", str21.equals("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj49);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

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
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo15 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory18 = null;
    org.apache.zeppelin.search.SearchService searchService19 = null;
    org.apache.zeppelin.user.Credentials credentials20 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener21 = null;
    org.apache.zeppelin.notebook.Note note22 = new org.apache.zeppelin.notebook.Note(notebookRepo15, interpreterFactory16, interpreterSettingManager17, jobListenerFactory18, searchService19, credentials20, noteEventListener21);
    note22.setName("0.8.0-SNAPSHOT");
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting25 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup26 = interpreterSetting25.getAllInterpreterGroups();
    java.lang.String str27 = interpreterSetting25.getErrorReason();
    java.lang.String str28 = interpreterSetting25.getId();
    interpreterSetting25.setPath("src");
    interpreterSetting25.clearNoteIdAndParaMap();
    heliumApplicationFactory11.onUnbindInterpreter(note22, interpreterSetting25);
    org.apache.zeppelin.user.Credentials credentials33 = null;
    note22.setCredentials(credentials33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    java.lang.Object obj7 = zeppelinConfiguration3.getProperty("yarn-cache");
    zeppelinConfiguration3.clear();
    int i12 = zeppelinConfiguration3.getInt("0.8.0-SNAPSHOT", "983f4edc-7fd7-4978-ae01-8de1df3126f1", (int)(short)0);
    java.lang.String str13 = zeppelinConfiguration3.getInterpreterLocalRepoPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ".//local-repo"+ "'", str13.equals(".//local-repo"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup4 = interpreterSetting3.getAllInterpreterGroups();
    java.lang.String str5 = interpreterSetting3.getErrorReason();
    zeppelinConfiguration0.setProperty("{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", (java.lang.Object)interpreterSetting3);
    java.lang.String str7 = zeppelinConfiguration0.getNotebookAuthorizationPath();
    java.lang.String str8 = zeppelinConfiguration0.getMongoCollection();
    java.lang.String str9 = zeppelinConfiguration0.getKeyManagerPassword();
    org.apache.commons.configuration.FileSystem fileSystem10 = zeppelinConfiguration0.getFileSystem();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "notes"+ "'", str8.equals("notes"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fileSystem10);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision7 = notebookRepoSync3.checkpoint("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "load.js", authenticationInfo6);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo9 = null;
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision10 = notebookRepoSync3.revisionHistory("package.json", authenticationInfo9);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo13 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision14 = notebookRepoSync3.checkpoint(".//2CN3T45UG", "X-Zeppelin-Token", authenticationInfo13);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookRepoSync3.sync(authenticationInfo15);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_revision10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision14);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    org.apache.zeppelin.notebook.socket.Message.OP oP1 = message0.op;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj2 = message0.data;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(message0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(oP1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj2);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLogoutRoutine("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CN35WB85\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
    notebookRepoSettingsInfo0.name = "bundles";
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type3 = notebookRepoSettingsInfo0.type;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type3);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
    instance0.name = "anonymous";
    java.lang.String str3 = instance0.token;
    java.lang.String str4 = instance0.token;
    int i5 = instance0.id;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder3 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder1.merge(folder3);
    folder3.rename("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}");
    int i7 = folder3.countNotes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
    java.util.Set<java.lang.String> set_str3 = notebookAuthorization1.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration5 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization6 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration5);
    java.util.Set<java.lang.String> set_str8 = notebookAuthorization6.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration10 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization11 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration10);
    java.util.Set<java.lang.String> set_str13 = notebookAuthorization11.getReaders("X-Zeppelin-Token");
    notebookAuthorization6.setRoles("~Trash", set_str13);
    boolean b15 = notebookAuthorization1.isWriter("hi!", set_str13);
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization17 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.lang.String[] str_array51 = new java.lang.String[] { "helium-bundle", "heliumBundles", "", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}", "2CJB2PWE5", " ", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "load.js", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}", "helium.bundle.cache.js", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "yarn-cache", "", "load.js", "0.8.0-SNAPSHOT", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium.bundle.js", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "heliumBundles", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "anonymous", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium-bundle", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str52 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str52, str_array51);
    notebookAuthorization17.setOwners("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", (java.util.Set<java.lang.String>)linkedhashset_str52);
    notebookAuthorization1.setWriters("notes", (java.util.Set<java.lang.String>)linkedhashset_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    org.apache.commons.configuration.tree.ExpressionEngine expressionEngine2 = zeppelinConfiguration0.getExpressionEngine();
    // The following exception was thrown during execution in test generation
    try {
    zeppelinConfiguration0.validate();
      org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
    } catch (org.apache.commons.configuration.ConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(expressionEngine2);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    java.lang.String str3 = zeppelinConfiguration0.getRootElementName();
    java.lang.String str4 = zeppelinConfiguration0.getKeyStorePassword();
    boolean b5 = zeppelinConfiguration0.isAttributeSplittingDisabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".//conf/interpreter-list"+ "'", str3.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    org.apache.zeppelin.helium.HeliumConf heliumConf0 = new org.apache.zeppelin.helium.HeliumConf();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj1 = heliumConf0.getAllPackageConfigs();
    heliumConf0.disablePackage("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}");
    heliumConf0.disablePackage("{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"\",\"roles\":\"\"}");
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj6 = heliumConf0.getAllPackageConfigs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj6);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str1 = notebookRepoSettingsInfo0.value;
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str2 = notebookRepoSettingsInfo0.value;
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo3 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
    notebookRepoSettingsInfo3.name = "bundles";
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type6 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN;
    notebookRepoSettingsInfo3.type = type6;
    org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type8 = notebookRepoSettingsInfo3.type;
    notebookRepoSettingsInfo0.type = type8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_map_str_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsInfo3);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN + "'", type6.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN));
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN + "'", type8.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    java.lang.String str1 = zeppelinConfiguration0.getServerContextPath();
    java.lang.String str2 = zeppelinConfiguration0.getBucketName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "/"+ "'", str1.equals("/"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "zeppelin"+ "'", str2.equals("zeppelin"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getInterpreterListPath();
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision7 = notebookRepoSync3.checkpoint("{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "load.js", authenticationInfo6);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo9 = null;
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision10 = notebookRepoSync3.revisionHistory("package.json", authenticationInfo9);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo13 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision14 = notebookRepoSync3.checkpoint(".//2CN3T45UG", "X-Zeppelin-Token", authenticationInfo13);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo17 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision18 = notebookRepoSync3.checkpoint("{\"op\":\"DEAD\",\"data\":{\"token\":\"helium.bundle.js\"},\"meta\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"\",\"roles\":\"\"}", authenticationInfo17);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo21 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision22 = notebookRepoSync3.checkpoint("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CN3T45UG\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{}}", authenticationInfo21);
    org.apache.zeppelin.notebook.Folder folder24 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder26 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder28 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder26.merge(folder28);
    folder24.merge(folder26);
    folder24.notifyRenamed("Message{data={}, op=null}");
    java.lang.String str33 = folder24.getId();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo34 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory35 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager36 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory37 = null;
    org.apache.zeppelin.search.SearchService searchService38 = null;
    org.apache.zeppelin.user.Credentials credentials39 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener40 = null;
    org.apache.zeppelin.notebook.Note note41 = new org.apache.zeppelin.notebook.Note(notebookRepo34, interpreterFactory35, interpreterSettingManager36, jobListenerFactory37, searchService38, credentials39, noteEventListener40);
    note41.setName("0.8.0-SNAPSHOT");
    note41.moveParagraph("0.8.0-SNAPSHOT", (int)(byte)1);
    folder24.addNote(note41);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo48 = null;
    notebookRepoSync3.save(note41, authenticationInfo48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list"+ "'", str2.equals(".//conf/interpreter-list"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_revision10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(revision22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "anonymous"+ "'", str33.equals("anonymous"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "yarn-cache");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = userTokenContainer3.getDefaultZeppelinInstanceToken("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"Message{data\\u003d{}, op\\u003dnull}\",\"roles\":\"src\"}");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userTokenContainer3);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getScriptBody("2CJB2PWE5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2CJB2PWE5"+ "'", str1.equals("2CJB2PWE5"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b1 = zeppelinConfiguration0.isAnonymousAllowed();
    java.lang.String str2 = zeppelinConfiguration0.getTrustStorePath();
    int i3 = zeppelinConfiguration0.getServerPort();
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    java.lang.Object obj5 = zeppelinConfiguration4.getReloadLock();
    int i6 = zeppelinConfiguration4.getServerPort();
    zeppelinConfiguration0.setEntityResolver((org.xml.sax.EntityResolver)zeppelinConfiguration4);
    java.lang.String str11 = zeppelinConfiguration4.getString("2CMTCH2J9", "JKS", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/.//conf/keystore"+ "'", str2.equals(".//conf/.//conf/keystore"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 8080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 8080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer0 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry3 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage4 = heliumLocalRegistry3.getAll();
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage5 = heliumLocalRegistry3.getAll();
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars6 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD;
    long long7 = confVars6.getLongValue();
    java.lang.Class class8 = confVars6.getVarClass();
    com.google.gson.JsonSerializationContext jsonSerializationContext9 = null;
    com.google.gson.JsonElement jsonElement10 = heliumRegistrySerializer0.serialize((org.apache.zeppelin.helium.HeliumRegistry)heliumLocalRegistry3, (java.lang.reflect.Type)class8, jsonSerializationContext9);
    org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer11 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
    org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer12 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry15 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage16 = heliumLocalRegistry15.getAll();
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage17 = heliumLocalRegistry15.getAll();
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars18 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD;
    long long19 = confVars18.getLongValue();
    java.lang.Class class20 = confVars18.getVarClass();
    com.google.gson.JsonSerializationContext jsonSerializationContext21 = null;
    com.google.gson.JsonElement jsonElement22 = heliumRegistrySerializer12.serialize((org.apache.zeppelin.helium.HeliumRegistry)heliumLocalRegistry15, (java.lang.reflect.Type)class20, jsonSerializationContext21);
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars23 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_PUBLIC;
    java.lang.Class class24 = confVars23.getVarClass();
    com.google.gson.JsonDeserializationContext jsonDeserializationContext25 = null;
    org.apache.zeppelin.helium.HeliumRegistry heliumRegistry26 = heliumRegistrySerializer11.deserialize(jsonElement22, (java.lang.reflect.Type)class24, jsonDeserializationContext25);
    org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer27 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
    org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry30 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.cache.js", "heliumBundles");
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage31 = heliumLocalRegistry30.getAll();
    java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage32 = heliumLocalRegistry30.getAll();
    org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars33 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD;
    long long34 = confVars33.getLongValue();
    java.lang.Class class35 = confVars33.getVarClass();
    com.google.gson.JsonSerializationContext jsonSerializationContext36 = null;
    com.google.gson.JsonElement jsonElement37 = heliumRegistrySerializer27.serialize((org.apache.zeppelin.helium.HeliumRegistry)heliumLocalRegistry30, (java.lang.reflect.Type)class35, jsonSerializationContext36);
    com.google.gson.JsonSerializationContext jsonSerializationContext38 = null;
    com.google.gson.JsonElement jsonElement39 = heliumRegistrySerializer0.serialize(heliumRegistry26, (java.lang.reflect.Type)class35, jsonSerializationContext38);
    java.lang.String str40 = heliumRegistry26.name();
    
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
    org.junit.Assert.assertNotNull(list_heliumPackage16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage17);
    org.junit.Assert.assertTrue("'" + confVars18 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD + "'", confVars18.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonElement22);
    org.junit.Assert.assertTrue("'" + confVars23 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_PUBLIC + "'", confVars23.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_PUBLIC));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(heliumRegistry26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_heliumPackage32);
    org.junit.Assert.assertTrue("'" + confVars33 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD + "'", confVars33.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "helium.bundle.cache.js"+ "'", str40.equals("helium.bundle.cache.js"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    boolean b4 = zeppelinConfiguration3.isAnonymousAllowed();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", "X-Watcher-Key", zeppelinConfiguration3);
    java.util.Collection<org.apache.commons.configuration.event.ConfigurationListener> collection_configurationListener6 = zeppelinConfiguration3.getConfigurationListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinConfiguration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(client5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_configurationListener6);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("X-Watcher-Key");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

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
    java.lang.String str21 = folder1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "anonymous"+ "'", str21.equals("anonymous"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

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
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo29 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager31 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory32 = null;
    org.apache.zeppelin.search.SearchService searchService33 = null;
    org.apache.zeppelin.user.Credentials credentials34 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener35 = null;
    org.apache.zeppelin.notebook.Note note36 = new org.apache.zeppelin.notebook.Note(notebookRepo29, interpreterFactory30, interpreterSettingManager31, jobListenerFactory32, searchService33, credentials34, noteEventListener35);
    note36.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph39 = note36.getParagraphs();
    note36.setPersonalizedMode((java.lang.Boolean)true);
    folder11.addNote(note36);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo44 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.notebook.Paragraph paragraph45 = note36.insertNewParagraph((int)(short)100, authenticationInfo44);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph39);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

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
    org.apache.zeppelin.notebook.Paragraph paragraph15 = note7.clearPersonalizedParagraphOutput("notes", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    boolean b16 = note7.isPersonalizedMode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.8.0-SNAPSHOT"+ "'", str10.equals("0.8.0-SNAPSHOT"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(paragraph15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
    // The following exception was thrown during execution in test generation
    try {
    zeppelinhubRestApiHandler1.del("X-Zeppelin-Token", "~Trash");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CK7HWPBF\",\"angularObjects\":{},\"config\":{},\"info\":{}}");

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

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
    java.lang.Object obj18 = zeppelinhubMessage15.data;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array21 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo22 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo22, interpreterInfo_array21);
    org.apache.zeppelin.dep.Dependency[] dependency_array25 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency26 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency26, dependency_array25);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption28 = null;
    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner30 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting31 = new org.apache.zeppelin.interpreter.InterpreterSetting("anonymous", "hi!", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo22, (java.lang.Object)"~Trash", (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency26, interpreterOption28, "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", interpreterRunner30);
    zeppelinhubMessage15.op = "hi!";
    
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
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
    java.util.Set<java.lang.String> set_str3 = notebookAuthorization1.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration5 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization6 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration5);
    java.util.Set<java.lang.String> set_str8 = notebookAuthorization6.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration10 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization11 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration10);
    java.util.Set<java.lang.String> set_str13 = notebookAuthorization11.getReaders("X-Zeppelin-Token");
    notebookAuthorization6.setRoles("~Trash", set_str13);
    boolean b15 = notebookAuthorization1.isWriter("hi!", set_str13);
    boolean b16 = notebookAuthorization1.isPublic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

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
    note18.setPersonalizedMode((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph21);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder3 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("hi!");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder5 = builder3.className(" ");
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings6 = builder5.build();
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo7 = notebookRepoWithSettings6.settings;
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder8 = builder1.settings(list_notebookRepoSettingsInfo7);
    java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo9 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder10 = builder8.settings(list_notebookRepoSettingsInfo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(builder10);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings0 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
    java.lang.String str1 = notebookRepoWithSettings0.name;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoWithSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
    java.lang.String[] str_array34 = new java.lang.String[] { "helium-bundle", "heliumBundles", "", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}", "2CJB2PWE5", " ", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "load.js", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "helium.bundle.cache.js", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"load.js\",\"roles\":\"\"}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}", "helium.bundle.cache.js", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "yarn-cache", "", "load.js", "0.8.0-SNAPSHOT", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium.bundle.js", "{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}", "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"\"}", "heliumBundles", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "anonymous", "{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}", "helium-bundle", "hi!" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array34);
    notebookAuthorization0.setOwners("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", (java.util.Set<java.lang.String>)linkedhashset_str35);
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration39 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization40 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration39);
    java.util.Set<java.lang.String> set_str42 = notebookAuthorization40.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration44 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization45 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration44);
    java.util.Set<java.lang.String> set_str47 = notebookAuthorization45.getReaders("X-Zeppelin-Token");
    notebookAuthorization40.setRoles("~Trash", set_str47);
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration50 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization51 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration50);
    java.util.Set<java.lang.String> set_str53 = notebookAuthorization51.getReaders("X-Zeppelin-Token");
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration55 = null;
    org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization56 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration55);
    java.util.Set<java.lang.String> set_str58 = notebookAuthorization56.getReaders("X-Zeppelin-Token");
    notebookAuthorization51.setRoles("~Trash", set_str58);
    java.util.Set<java.lang.String> set_str61 = notebookAuthorization51.getOwners("helium.bundle.js");
    notebookAuthorization40.setRoles("helium-bundle", set_str61);
    notebookAuthorization0.setOwners("{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", set_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookAuthorization56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str61);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

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
    java.util.Map<java.lang.String,java.lang.String> map_str_str12 = note7.generateSingleParagraphInfo("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.notebook.Paragraph paragraph13 = null;
    note7.onOutputAppend(paragraph13, (int)' ', "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\"},\"meta\":{}}");
    note7.runAll();
    org.apache.zeppelin.notebook.Paragraph paragraph18 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array19 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage20 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage20, interpreterResultMessage_array19);
    note7.onOutputUpdateAll(paragraph18, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting0);
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting2 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup3 = interpreterSetting2.getAllInterpreterGroups();
    java.lang.String str4 = interpreterSetting2.getErrorReason();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo5 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
    org.apache.zeppelin.search.SearchService searchService9 = null;
    org.apache.zeppelin.user.Credentials credentials10 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener11 = null;
    org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note(notebookRepo5, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, noteEventListener11);
    note12.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph15 = note12.getParagraphs();
    java.util.Map<java.lang.String,java.lang.String> map_str_str17 = note12.generateSingleParagraphInfo("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    interpreterSetting2.setInfos(map_str_str17);
    interpreterSetting0.setInfos(map_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_interpreterGroup3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str17);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

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
    zeppelinClient3.ping();
    org.apache.zeppelin.notebook.socket.Message message21 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj22 = message21.data;
    java.lang.String str23 = zeppelinClient3.serialize(message21);
    
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
    org.junit.Assert.assertNotNull(message21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}"+ "'", str23.equals("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"{\\\\\\\"data\\\\\\\":{},\\\\\\\"ticket\\\\\\\":\\\\\\\"anonymous\\\\\\\",\\\\\\\"principal\\\\\\\":\\\\\\\"load.js\\\\\\\",\\\\\\\"roles\\\\\\\":\\\\\\\"\\\\\\\"}\\\",\\\"principal\\\":\\\"\\\",\\\"roles\\\":\\\"\\\"}\",\"roles\":\"src\"}"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    java.io.File file2 = null;
    org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = null;
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = null;
    org.apache.zeppelin.helium.Helium helium5 = new org.apache.zeppelin.helium.Helium("", "X-Zeppelin-Token", file2, heliumBundleFactory3, heliumApplicationFactory4);
    helium5.disable("anonymous");
    org.apache.zeppelin.helium.HeliumConf heliumConf8 = new org.apache.zeppelin.helium.HeliumConf();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj9 = heliumConf8.getAllPackageConfigs();
    java.lang.String[] str_array27 = new java.lang.String[] { "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "Message{data={}, op=null}", "X-Zeppelin-Token", "hi!", "~Trash", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "yarn-cache", "/", "hi!", "X-Zeppelin-Token", "heliumBundles", "helium.bundle.cache.js", "heliumBundles", "2CMTCH2J9", "1d225366-166b-4915-87f9-e54c61e0f003", "helium.bundle.js", "helium-bundle" };
    java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str28, str_array27);
    heliumConf8.setBundleDisplayOrder((java.util.List<java.lang.String>)arraylist_str28);
    // The following exception was thrown during execution in test generation
    try {
    helium5.setVisualizationPackageOrder((java.util.List<java.lang.String>)arraylist_str28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

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
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph11 = note8.getParagraphs();
    folderView0.onNoteNameChanged(note8, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.notebook.Folder folder15 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder17 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder15.merge(folder17);
    org.apache.zeppelin.notebook.Folder folder20 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder22 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder24 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder22.merge(folder24);
    folder20.merge(folder22);
    folder20.notifyRenamed("Message{data={}, op=null}");
    org.apache.zeppelin.notebook.Folder folder30 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder32 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder34 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder32.merge(folder34);
    folder30.merge(folder32);
    folder30.notifyRenamed("Message{data={}, op=null}");
    folder20.addChild(folder30);
    org.apache.zeppelin.notebook.Folder folder41 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder43 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder41.merge(folder43);
    boolean b45 = folder43.hasChild();
    int i46 = folder43.countNotes();
    folder30.setParent(folder43);
    java.lang.String str48 = folder30.getParentFolderId();
    folder15.addChild(folder30);
    folderView0.onFolderRenamed(folder15, "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}");
    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory52 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory52.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory52.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.Paragraph paragraph64 = null;
    heliumApplicationFactory52.onParagraphCreate(paragraph64);
    org.apache.zeppelin.notebook.Note note66 = new org.apache.zeppelin.notebook.Note();
    heliumApplicationFactory52.onNoteCreate(note66);
    folderView0.removeNote(note66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "/"+ "'", str48.equals("/"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
    luceneSearch0.close();
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str3 = luceneSearch0.query("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str5 = luceneSearch0.query("{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"load.js\",\"roles\":\"\"}");
    org.apache.zeppelin.notebook.Note note6 = new org.apache.zeppelin.notebook.Note();
    note6.runAll();
    // The following exception was thrown during execution in test generation
    try {
    luceneSearch0.addIndexDoc(note6);
      org.junit.Assert.fail("Expected exception of type org.apache.lucene.store.AlreadyClosedException");
    } catch (org.apache.lucene.store.AlreadyClosedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_map_str_str5);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

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
    zeppelinClient3.removeNoteConnection("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CMDRX9EA\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    
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
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

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
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph11 = note8.getParagraphs();
    folderView0.onNoteNameChanged(note8, "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.notebook.Folder folder15 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder17 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder15.merge(folder17);
    org.apache.zeppelin.notebook.Folder folder20 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder22 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder24 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder22.merge(folder24);
    folder20.merge(folder22);
    folder20.notifyRenamed("Message{data={}, op=null}");
    org.apache.zeppelin.notebook.Folder folder30 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder32 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder34 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder32.merge(folder34);
    folder30.merge(folder32);
    folder30.notifyRenamed("Message{data={}, op=null}");
    folder20.addChild(folder30);
    org.apache.zeppelin.notebook.Folder folder41 = new org.apache.zeppelin.notebook.Folder("anonymous");
    org.apache.zeppelin.notebook.Folder folder43 = new org.apache.zeppelin.notebook.Folder("anonymous");
    folder41.merge(folder43);
    boolean b45 = folder43.hasChild();
    int i46 = folder43.countNotes();
    folder30.setParent(folder43);
    java.lang.String str48 = folder30.getParentFolderId();
    folder15.addChild(folder30);
    folderView0.onFolderRenamed(folder15, "{\"op\":\"LIVE\",\"data\":{\"token\":\"{\\\"op\\\":\\\"LIVE\\\",\\\"data\\\":{\\\"token\\\":\\\"{\\\\\\\"paragraphs\\\\\\\":[],\\\\\\\"name\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"2CMDRX9EA\\\\\\\",\\\\\\\"angularObjects\\\\\\\":{},\\\\\\\"config\\\\\\\":{},\\\\\\\"info\\\\\\\":{}}\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.Note note52 = null;
    folderView0.removeNote(note52);
    boolean b55 = folderView0.hasFolder("1d225366-166b-4915-87f9-e54c61e0f003");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "/"+ "'", str48.equals("/"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

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
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo29 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory30 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager31 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory32 = null;
    org.apache.zeppelin.search.SearchService searchService33 = null;
    org.apache.zeppelin.user.Credentials credentials34 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener35 = null;
    org.apache.zeppelin.notebook.Note note36 = new org.apache.zeppelin.notebook.Note(notebookRepo29, interpreterFactory30, interpreterSettingManager31, jobListenerFactory32, searchService33, credentials34, noteEventListener35);
    note36.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph39 = note36.getParagraphs();
    note36.setPersonalizedMode((java.lang.Boolean)true);
    folder11.addNote(note36);
    org.apache.zeppelin.notebook.NoteInfo noteInfo43 = new org.apache.zeppelin.notebook.NoteInfo(note36);
    org.apache.zeppelin.notebook.NoteInfo noteInfo44 = new org.apache.zeppelin.notebook.NoteInfo(note36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_paragraph39);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ERROR_INFO;
    org.apache.zeppelin.notebook.socket.Message message1 = new org.apache.zeppelin.notebook.socket.Message(oP0);
    org.apache.zeppelin.helium.HeliumConf heliumConf2 = new org.apache.zeppelin.helium.HeliumConf();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>> map_str_map_str_obj3 = heliumConf2.getAllPackageConfigs();
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = heliumConf2.getEnabledPackages();
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage(message1, map_str_str4);
    org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ERROR_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ERROR_INFO));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubMessage5);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"LIVE\",\"data\":{\"token\":\"helium-bundle\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "yarn-cache");
    java.lang.String str5 = userTokenContainer3.getExistingUserToken("{\"op\":\"ERROR_INFO\",\"data\":{},\"ticket\":\"anonymous\",\"principal\":\"anonymous\",\"roles\":\"\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userTokenContainer3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getRequiredReplName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.handleMsgFromZeppelinHub("hi!");
    zeppelinhubClient2.initUser("");
    zeppelinhubClient2.removeSession("mongodb://localhost");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(zeppelinhubClient2);

  }

}
