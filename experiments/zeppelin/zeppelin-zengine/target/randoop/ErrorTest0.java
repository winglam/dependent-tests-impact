
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup3 = interpreterSetting0.getInterpreterGroup("anonymous", "");

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.notebook.ApplicationState applicationState2 = new org.apache.zeppelin.notebook.ApplicationState(" ", heliumPackage1);
    
    // Checks the contract:  applicationState2.equals(applicationState2)
    org.junit.Assert.assertTrue("Contract failed: applicationState2.equals(applicationState2)", applicationState2.equals(applicationState2));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("hi!", "hi!");
    zeppelinhubClient2.initUser(" ");
    zeppelinhubClient2.handleMsgFromZeppelinHub("hi!");
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat7 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubHeartbeat7.run();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    watcherWebsocket0.onWebSocketText("");

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo1 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory2 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager3 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory4 = null;
    org.apache.zeppelin.search.SearchService searchService5 = null;
    org.apache.zeppelin.user.Credentials credentials6 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener7 = null;
    org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note(notebookRepo1, interpreterFactory2, interpreterSettingManager3, jobListenerFactory4, searchService5, credentials6, noteEventListener7);
    boolean b9 = note8.isPersonalizedMode();
    java.lang.String str10 = note8.toJson();
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
    note18.runAll();
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory23 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager24 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph25 = new org.apache.zeppelin.notebook.Paragraph("2CJB2PWE5", note8, (org.apache.zeppelin.scheduler.JobListener)note18, interpreterFactory23, interpreterSettingManager24);
    
    // Checks the contract:  !paragraph25.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !paragraph25.equals(null)", !paragraph25.equals(null));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup4 = interpreterSetting1.getInterpreterGroup("src", "helium.bundle.js");

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.notebook.ApplicationState applicationState2 = new org.apache.zeppelin.notebook.ApplicationState("local_modules", heliumPackage1);
    
    // Checks the contract:  applicationState2.equals(applicationState2)
    org.junit.Assert.assertTrue("Contract failed: applicationState2.equals(applicationState2)", applicationState2.equals(applicationState2));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup1 = interpreterSetting0.getAllInterpreterGroups();
    java.lang.String str2 = interpreterSetting0.getErrorReason();
    java.lang.String str3 = interpreterSetting0.getId();
    interpreterSetting0.setPath("src");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup8 = interpreterSetting0.getInterpreterGroup("Message{data={}, op=null}", "bundles");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLoginRoutine("load.js");

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
    heliumApplicationFactory0.onStatusChange("/", "anonymous", "", " ");
    heliumApplicationFactory0.onOutputAppend("1d225366-166b-4915-87f9-e54c61e0f003", "0.8.0-SNAPSHOT", (int)(byte)10, "helium-bundle", "{\"op\":\"PING\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
    heliumApplicationFactory0.onParagraphCreate(paragraph12);
    org.apache.zeppelin.notebook.Note note14 = new org.apache.zeppelin.notebook.Note();
    heliumApplicationFactory0.onNoteCreate(note14);
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo16 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory17 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager18 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory19 = null;
    org.apache.zeppelin.search.SearchService searchService20 = null;
    org.apache.zeppelin.user.Credentials credentials21 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener22 = null;
    org.apache.zeppelin.notebook.Note note23 = new org.apache.zeppelin.notebook.Note(notebookRepo16, interpreterFactory17, interpreterSettingManager18, jobListenerFactory19, searchService20, credentials21, noteEventListener22);
    org.apache.zeppelin.user.Credentials credentials24 = null;
    note23.setCredentials(credentials24);
    java.lang.String str26 = note23.toJson();
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory27 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager28 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph29 = new org.apache.zeppelin.notebook.Paragraph(note14, (org.apache.zeppelin.scheduler.JobListener)note23, interpreterFactory27, interpreterSettingManager28);
    
    // Checks the contract:  !paragraph29.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !paragraph29.equals(null)", !paragraph29.equals(null));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

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
    org.apache.zeppelin.search.LuceneSearch luceneSearch10 = new org.apache.zeppelin.search.LuceneSearch();
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo11 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory12 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager13 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory14 = null;
    org.apache.zeppelin.search.SearchService searchService15 = null;
    org.apache.zeppelin.user.Credentials credentials16 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener17 = null;
    org.apache.zeppelin.notebook.Note note18 = new org.apache.zeppelin.notebook.Note(notebookRepo11, interpreterFactory12, interpreterSettingManager13, jobListenerFactory14, searchService15, credentials16, noteEventListener17);
    boolean b19 = note18.isPersonalizedMode();
    org.apache.zeppelin.notebook.Paragraph paragraph20 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array21 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage22 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage22, interpreterResultMessage_array21);
    note18.onOutputUpdateAll(paragraph20, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage22);
    luceneSearch10.updateIndexDoc(note18);
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory26 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager27 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph28 = new org.apache.zeppelin.notebook.Paragraph(note7, (org.apache.zeppelin.scheduler.JobListener)note18, interpreterFactory26, interpreterSettingManager27);
    
    // Checks the contract:  !paragraph28.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !paragraph28.equals(null)", !paragraph28.equals(null));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLogoutRoutine("Message{data={}, op=null}");

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting1 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting0);
    java.lang.String str2 = interpreterSetting0.getPath();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup5 = interpreterSetting0.getInterpreterGroup("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CHC41EK3\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    org.apache.zeppelin.notebook.Note note1 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo2 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory3 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager4 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory5 = null;
    org.apache.zeppelin.search.SearchService searchService6 = null;
    org.apache.zeppelin.user.Credentials credentials7 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener8 = null;
    org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note(notebookRepo2, interpreterFactory3, interpreterSettingManager4, jobListenerFactory5, searchService6, credentials7, noteEventListener8);
    note9.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph12 = note9.getParagraphs();
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = note9.generateSingleParagraphInfo("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph17 = new org.apache.zeppelin.notebook.Paragraph("anonymous", note1, (org.apache.zeppelin.scheduler.JobListener)note9, interpreterFactory15, interpreterSettingManager16);
    
    // Checks the contract:  !paragraph17.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !paragraph17.equals(null)", !paragraph17.equals(null));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

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
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo12 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory13 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager14 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory15 = null;
    org.apache.zeppelin.search.SearchService searchService16 = null;
    org.apache.zeppelin.user.Credentials credentials17 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener18 = null;
    org.apache.zeppelin.notebook.Note note19 = new org.apache.zeppelin.notebook.Note(notebookRepo12, interpreterFactory13, interpreterSettingManager14, jobListenerFactory15, searchService16, credentials17, noteEventListener18);
    note19.setName("0.8.0-SNAPSHOT");
    java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph22 = note19.getParagraphs();
    java.util.Map<java.lang.String,java.lang.String> map_str_str24 = note19.generateSingleParagraphInfo("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CJD2C45W\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory25 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager26 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph27 = new org.apache.zeppelin.notebook.Paragraph(note7, (org.apache.zeppelin.scheduler.JobListener)note19, interpreterFactory25, interpreterSettingManager26);
    
    // Checks the contract:  !paragraph27.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !paragraph27.equals(null)", !paragraph27.equals(null));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLogoutRoutine("{\"data\":{},\"ticket\":\"{/\"data/\":{},/\"ticket/\":/\"anonymous/\",/\"principal/\":/\"load.js/\",/\"roles/\":/\"/\"}\",\"principal\":\"load.js\",\"roles\":\"\"}");

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.notebook.ApplicationState applicationState2 = new org.apache.zeppelin.notebook.ApplicationState("helium.bundle.cache.js", heliumPackage1);
    
    // Checks the contract:  applicationState2.equals(applicationState2)
    org.junit.Assert.assertTrue("Contract failed: applicationState2.equals(applicationState2)", applicationState2.equals(applicationState2));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

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
    org.apache.zeppelin.notebook.repo.NotebookRepo notebookRepo43 = null;
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory44 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager45 = null;
    org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory46 = null;
    org.apache.zeppelin.search.SearchService searchService47 = null;
    org.apache.zeppelin.user.Credentials credentials48 = null;
    org.apache.zeppelin.notebook.NoteEventListener noteEventListener49 = null;
    org.apache.zeppelin.notebook.Note note50 = new org.apache.zeppelin.notebook.Note(notebookRepo43, interpreterFactory44, interpreterSettingManager45, jobListenerFactory46, searchService47, credentials48, noteEventListener49);
    boolean b51 = note50.isPersonalizedMode();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo53 = null;
    note50.persist((-1), authenticationInfo53);
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str55 = note50.generateParagraphsInfo();
    org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory56 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager57 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph58 = new org.apache.zeppelin.notebook.Paragraph(note7, (org.apache.zeppelin.scheduler.JobListener)note50, interpreterFactory56, interpreterSettingManager57);
    
    // Checks the contract:  !paragraph58.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !paragraph58.equals(null)", !paragraph58.equals(null));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
    org.apache.zeppelin.notebook.ApplicationState applicationState2 = new org.apache.zeppelin.notebook.ApplicationState("{\"data\":{},\"ticket\":\"{\\\"data\\\":{},\\\"ticket\\\":\\\"anonymous\\\",\\\"principal\\\":\\\"load.js\\\",\\\"roles\\\":\\\"\\\"}\",\"principal\":\"load.js\",\"roles\":\"\"}", heliumPackage1);
    
    // Checks the contract:  applicationState2.equals(applicationState2)
    org.junit.Assert.assertTrue("Contract failed: applicationState2.equals(applicationState2)", applicationState2.equals(applicationState2));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
    java.util.Collection<org.apache.zeppelin.interpreter.InterpreterGroup> collection_interpreterGroup1 = interpreterSetting0.getAllInterpreterGroups();
    java.lang.String str2 = interpreterSetting0.getErrorReason();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup5 = interpreterSetting0.getInterpreterGroup("{\"paragraphs\":[],\"name\":\"\",\"id\":\"2CN35WB85\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "2CJB2PWE5");

  }

}
