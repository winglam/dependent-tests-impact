
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.realm.LdapRealm ldapRealm4 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = ldapRealm4.getListRoles();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    notebookServer0.onParaInfosReceived("subtree", "(.*)", "subtree", map_str_str5);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm4 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm4.setSearchBase("hi!");
    activeDirectoryGroupRealm4.setSearchBase("");
    activeDirectoryGroupRealm4.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm10 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm10.setUserSearchAttributeTemplate("hi!");
    java.lang.String str13 = ldapRealm10.getUserSearchAttributeTemplate();
    java.lang.String str14 = ldapRealm10.getUserSearchAttributeName();
    boolean b15 = ldapRealm10.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm16 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str17 = ldapRealm16.getListRoles();
    ldapRealm10.setRolesByGroup(map_str_str17);
    activeDirectoryGroupRealm4.setGroupRolesMap(map_str_str17);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    notebookServer0.onParaInfosReceived("org.apache.zeppelin.realm.LdapRealm_75", "cn", "", map_str_str17);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response1 = interpreterRestApi0.listSettings();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.removeCredentials("subtree");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = interpreterRestApi0.restartSetting("", "cn");

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.putCredentials("");

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.broadcastUpdateNoteJobInfo((long)100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    notebookServer0.onOutputClear("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "{\n  \"message\": \"hi!\"\n}");

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = interpreterRestApi0.removeSetting("org.apache.zeppelin.realm.LdapRealm_139");

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = heliumRestApi0.disablePackage("org.apache.zeppelin.realm.LdapRealm_75");

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.removeCredentialEntity("");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("org.apache.zeppelin.realm.LdapRealm_139", "");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response6 = heliumRestApi0.suggest("org.apache.zeppelin.realm.LdapRealm_152", "org.apache.zeppelin.realm.LdapRealm_152", "org.apache.zeppelin.realm.LdapRealm_75");

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_175");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = heliumRestApi0.disablePackage("org.apache.zeppelin.realm.LdapRealm_93");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = heliumRestApi0.getAllEnabledPackageInfo();

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.removeCredentials("{\"message\":\"hi!\"}");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    zeppelinHubRealm0.setZeppelinhubUrl("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("org.apache.zeppelin.realm.LdapRealm_267", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }

    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi0 = new org.apache.zeppelin.rest.NotebookRepoRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response1 = notebookRepoRestApi0.refreshRepo();

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.insertParagraph("org.apache.zeppelin.realm.LdapRealm_262", "cn");

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.removeCredentialEntity("org.apache.zeppelin.realm.LdapRealm_273");

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    notebookServer0.onOutputClear("groupOfNames", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.getParagraph("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm_189");

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    zeppelinHubRealm0.setZeppelinhubUrl("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("hi!", "org.apache.zeppelin.realm.LdapRealm_187");

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.importNote("org.apache.zeppelin.realm.LdapRealm_47");

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.registerCronJob("org.apache.zeppelin.realm.LdapRealm_189", "{}");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    zeppelinHubRealm0.setZeppelinhubUrl("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("{\n  \"message\": \"hi!\"\n}", "cn");

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.updateParagraphConfig("org.apache.zeppelin.realm.LdapRealm_47", "groupOfNames", "hi!");

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getUpdatedJobListforNote((long)' ');

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.bind("", "org.apache.zeppelin.realm.LdapRealm_246");

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.importNote("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNote("org.apache.zeppelin.realm.LdapRealm_306");

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.search("org.apache.zeppelin.realm.LdapRealm_139");

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.bind("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.lang.String str6 = notebookServer0.getServletInfo();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Enumeration<java.lang.String> enumeration_str7 = notebookServer0.getInitParameterNames();

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.deleteParagraph("org.apache.zeppelin.realm.LdapRealm.authenticationCache.359", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    ldapRealm7.setAuthorizationEnabled(false);
    ldapRealm7.setAuthenticationCachingEnabled(false);
    ldapRealm7.setAuthenticationCachingEnabled(false);
    org.apache.zeppelin.realm.LdapRealm ldapRealm16 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str17 = ldapRealm16.getListRoles();
    ldapRealm7.setRolesByGroup(map_str_str17);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    notebookServer0.onMetaInfosReceived("org.apache.zeppelin.realm.LdapRealm_262", map_str_str17);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response1 = notebookRestApi0.getNoteList();

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response5 = heliumRestApi0.enablePackage("person", "{\n  \"message\": \"hi!\"\n}");

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.exportNote("org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.bind("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_273");

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response6 = heliumRestApi0.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.rest.exception.NotFoundException");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response7 = heliumRestApi0.getAllPackageInfo();

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response1 = notebookRestApi0.getJobListforNote();

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.exportNote("org.apache.zeppelin.realm.LdapRealm_93");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = heliumRestApi0.suggest("{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNotePermissions("");

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.getNoteParagraphJobStatus("org.apache.zeppelin.realm.LdapRealm_301", "org.apache.zeppelin.realm.LdapRealm_175");

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.moveParagraph("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm_306");

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.exportNote("org.apache.zeppelin.realm.LdapRealm_306");

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.lang.String str6 = notebookServer0.getServletInfo();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    notebookServer0.log("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.putNotePermissions("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache", "");

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.exportNote("org.apache.zeppelin.realm.LdapRealm_300");

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraph("org.apache.zeppelin.realm.LdapRealm.authenticationCache.439", "org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.deleteNote("org.apache.zeppelin.realm.LdapRealm_187");

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.lang.String str6 = notebookServer0.getServletInfo();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = notebookServer0.getInitParameter("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.insertParagraph("org.apache.zeppelin.realm.LdapRealm_175", "anonymous");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.updateParagraphConfig("org.apache.zeppelin.realm.LdapRealm.authorizationCache.266", "", "hi!");

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.removeCronJob("org.apache.zeppelin.realm.LdapRealm_460");

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getUpdatedJobListforNote((long)(short)0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest8 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str9 = notebookRepoSettingsRequest8.settings;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm10 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm10.setSearchBase("hi!");
    activeDirectoryGroupRealm10.setSearchBase("");
    activeDirectoryGroupRealm10.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm16 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm16.setUserSearchAttributeTemplate("hi!");
    java.lang.String str19 = ldapRealm16.getUserSearchAttributeTemplate();
    java.lang.String str20 = ldapRealm16.getUserSearchAttributeName();
    boolean b21 = ldapRealm16.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm22 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str23 = ldapRealm22.getListRoles();
    ldapRealm16.setRolesByGroup(map_str_str23);
    activeDirectoryGroupRealm10.setGroupRolesMap(map_str_str23);
    notebookRepoSettingsRequest8.settings = map_str_str23;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    notebookServer0.onMetaInfosReceived("{\n  \"message\": \"hi!\"\n}", map_str_str23);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.removeCronJob("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185", "org.apache.zeppelin.realm.LdapRealm_189");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getUpdatedJobListforNote(0L);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraphSynchronously("org.apache.zeppelin.realm.LdapRealm.authenticationCache.356", "org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm_447");

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNotePermissions("org.apache.zeppelin.realm.LdapRealm.authenticationCache.356");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.getCredentials("org.apache.zeppelin.realm.LdapRealm_47");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraph("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.356", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.insertParagraph("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_246");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.search("org.apache.zeppelin.realm.LdapRealm_267");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.removeCronJob("org.apache.zeppelin.realm.LdapRealm_529");

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.deleteParagraph("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm_301");

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNoteJobStatus("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }

    org.apache.zeppelin.rest.ConfigurationsRestApi configurationsRestApi0 = new org.apache.zeppelin.rest.ConfigurationsRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = configurationsRestApi0.getByPrefix("org.apache.zeppelin.realm.LdapRealm_133");

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.cloneNote("org.apache.zeppelin.realm.LdapRealm_460", "{\"message\":\"hi!\"}");

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNote("");

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNotePermissions("org.apache.zeppelin.realm.LdapRealm.authenticationCache.439");

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.exportNote("org.apache.zeppelin.realm.LdapRealm_529");

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    javax.ws.rs.core.Response response2 = interpreterRestApi0.removeRepository("{}");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = interpreterRestApi0.listInterpreter("org.apache.zeppelin.realm.LdapRealm_205");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response1 = heliumRestApi0.getAllPackageConfigs();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getAllPackageConfigs();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response5 = heliumRestApi0.bundleLoad("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_262");

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    javax.ws.rs.core.Response response2 = interpreterRestApi0.removeRepository("{}");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = interpreterRestApi0.listInterpreter("");

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator5 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    notebookServer0.log("org.apache.zeppelin.realm.LdapRealm_366");

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }

    org.apache.zeppelin.rest.ConfigurationsRestApi configurationsRestApi0 = new org.apache.zeppelin.rest.ConfigurationsRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response1 = configurationsRestApi0.getAll();

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.getNoteParagraphJobStatus("org.apache.zeppelin.rest.exception.BadRequestException", "org.apache.zeppelin.realm.LdapRealm_189");

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getCronJob("{\n  \"message\": \"hi!\"\n}");

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNote("member");

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraph("org.apache.zeppelin.realm.LdapRealm_578", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "");

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.cloneNote("org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.removeCronJob("org.apache.zeppelin.realm.LdapRealm_578");

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNotePermissions("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.importNote("{\"message\":\"hi!\"}");

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.updateParagraphConfig("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_447", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNoteJobStatus("org.apache.zeppelin.realm.LdapRealm_256");

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNoteJobStatus("org.apache.zeppelin.realm.LdapRealm_134");

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.removeCronJob("person");

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response5 = heliumRestApi0.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response6 = heliumRestApi0.getVisualizationPackageOrder();

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.search("org.apache.zeppelin.realm.LdapRealm_623");

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.bind("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.stopParagraph("org.apache.zeppelin.realm.LdapRealm_447", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.439");

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getCronJob("org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNoteJobStatus("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.getNoteParagraphJobStatus("{\"message\":\"hi!\"}", "groupOfNames");

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.stopNoteJobs("{\"message\":\"member\"}");

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    zeppelinHubRealm0.setZeppelinhubUrl("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("org.apache.zeppelin.realm.LdapRealm_558", "org.apache.zeppelin.realm.LdapRealm_267");

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNote("org.apache.zeppelin.realm.LdapRealm_485");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.cloneNote("(.*)", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "subtree", (int)(byte)1, "org.apache.zeppelin.realm.LdapRealm_267");
    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest13 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = notebookRepoSettingsRequest13.settings;
    org.apache.zeppelin.realm.LdapRealm ldapRealm15 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str16 = ldapRealm15.getListRoles();
    notebookRepoSettingsRequest13.settings = map_str_str16;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    notebookServer0.onMetaInfosReceived("org.apache.zeppelin.realm.LdapRealm.authenticationCache.356", map_str_str16);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.bind("org.apache.zeppelin.realm.LdapRealm_187", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    javax.ws.rs.core.Response response2 = interpreterRestApi0.removeRepository("{}");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = interpreterRestApi0.listInterpreter("org.apache.zeppelin.realm.LdapRealm.authenticationCache.439");

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response5 = heliumRestApi0.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response8 = heliumRestApi0.bundleLoad("org.apache.zeppelin.rest.exception.BadRequestException", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.exportNote("org.apache.zeppelin.realm.LdapRealm_558");

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.cloneNote("org.apache.zeppelin.rest.exception.ForbiddenException", "org.apache.zeppelin.realm.LdapRealm_267");

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response5 = heliumRestApi0.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    javax.ws.rs.core.Response response9 = heliumRestApi0.updatePackageConfig("hi!", "(.*)", "org.apache.zeppelin.realm.LdapRealm_300");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response12 = heliumRestApi0.enablePackage("org.apache.zeppelin.realm.LdapRealm_599", "org.apache.zeppelin.realm.LdapRealm_133");

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraphSynchronously("org.apache.zeppelin.realm.LdapRealm.authenticationCache.451", "org.apache.zeppelin.realm.LdapRealm_152", "org.apache.zeppelin.realm.LdapRealm_599");

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.runNoteJobs("org.apache.zeppelin.realm.LdapRealm_623");

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = interpreterRestApi0.restartSetting("org.apache.zeppelin.realm.LdapRealm_246", "");

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response5 = heliumRestApi0.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    javax.ws.rs.core.Response response9 = heliumRestApi0.updatePackageConfig("hi!", "(.*)", "org.apache.zeppelin.realm.LdapRealm_300");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response10 = heliumRestApi0.getAllPackageInfo();

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response5 = heliumRestApi0.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    javax.ws.rs.core.Response response7 = heliumRestApi0.getSinglePackageInfo("(.*)");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response10 = heliumRestApi0.suggest("org.apache.zeppelin.realm.LdapRealm_267", "(.*)");

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response6 = heliumRestApi0.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.rest.exception.NotFoundException");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response9 = heliumRestApi0.enablePackage("org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm_256");

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.importNote("org.apache.zeppelin.realm.LdapRealm_93");

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.exportNote("org.apache.zeppelin.realm.LdapRealm.authenticationCache.379");

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.createNote("{\"message\":\"hi!\"}");

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response5 = heliumRestApi0.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response8 = heliumRestApi0.bundleLoad("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_189");

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.cloneNote("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_265");

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNotePermissions("org.apache.zeppelin.realm.LdapRealm.authenticationCache.545");

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.getParagraph("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "{\n  \"message\": \"hi!\"\n}");

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.bind("org.apache.zeppelin.realm.LdapRealm.authenticationCache.593");

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test128"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.exportNote("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test129"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator1 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Enumeration<java.lang.String> enumeration_str2 = notebookServer0.getInitParameterNames();

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test130"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraph("org.apache.zeppelin.realm.LdapRealm_662", "org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.510");

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test131"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.removeCredentials("org.apache.zeppelin.realm.LdapRealm.authenticationCache.555");

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test132"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getCronJob("org.apache.zeppelin.realm.LdapRealm_817");

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test133"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.bind("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm_205");

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test134"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraph("org.apache.zeppelin.realm.LdapRealm_485", "org.apache.zeppelin.realm.LdapRealm_447", "org.apache.zeppelin.realm.LdapRealm_187");

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test135"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.runNoteJobs("org.apache.zeppelin.realm.LdapRealm_529");

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test136"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.stopParagraph("{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.408");

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test137"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.stopParagraph("org.apache.zeppelin.realm.LdapRealm_447", "org.apache.zeppelin.realm.LdapRealm_509");

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test138"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraphSynchronously("org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.realm.LdapRealm_265", "(.*)");

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test139"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.deleteParagraph("{\"message\":\"hi!\"}", "{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}");

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test140"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.deleteParagraph("org.apache.zeppelin.realm.LdapRealm_509", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test141"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.getParagraph("org.apache.zeppelin.rest.exception.BadRequestException", "org.apache.zeppelin.realm.LdapRealm_704");

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test142"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.updateParagraphConfig("{\"message\":\"hi!\"}", "org.apache.zeppelin.realm.LdapRealm_509", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.439");

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test143"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNote("org.apache.zeppelin.realm.LdapRealm_246");

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test144"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.importNote("org.apache.zeppelin.realm.LdapRealm_484");

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test145"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.runNoteJobs("org.apache.zeppelin.realm.LdapRealm_786");

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test146"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response1 = heliumRestApi0.getAllPackageConfigs();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getAllPackageConfigs();
    javax.ws.rs.core.Response response4 = heliumRestApi0.getSinglePackageInfo("org.apache.zeppelin.realm.LdapRealm_300");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response6 = heliumRestApi0.getVisualizationPackageOrder("");

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test147"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSinglePackageInfo("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = heliumRestApi0.getVisualizationPackageOrder();

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test148"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.runNoteJobs("member");

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test149"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.removeCronJob("");

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test150"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNote("groupOfNames");

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test151"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getCronJob("");

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test152"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.putNotePermissions("org.apache.zeppelin.realm.LdapRealm_913", "");

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test153"); }

    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi0 = new org.apache.zeppelin.rest.NotebookRepoRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response1 = notebookRepoRestApi0.listRepoSettings();

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test154"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraphSynchronously("org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm_913", "{\"message\":\"member\"}");

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test155"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response1 = heliumRestApi0.getAllPackageConfigs();
    javax.ws.rs.core.Response response5 = heliumRestApi0.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm.authenticationCache.555", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm_262");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response6 = heliumRestApi0.getAllEnabledPackageInfo();

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test156"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.removeCronJob("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test157"); }

    org.apache.zeppelin.rest.ConfigurationsRestApi configurationsRestApi0 = new org.apache.zeppelin.rest.ConfigurationsRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = configurationsRestApi0.getByPrefix("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test158"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    zeppelinHubRealm0.setZeppelinhubUrl("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("{\"message\":\"member\"}", "org.apache.zeppelin.realm.ActiveDirectoryGroupRealm_931");

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test159"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.search("org.apache.zeppelin.realm.LdapRealm_485");

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test160"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.stopParagraph("org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test161"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.runNoteJobs("org.apache.zeppelin.realm.LdapRealm_75");

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test162"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.runParagraphSynchronously("org.apache.zeppelin.realm.LdapRealm_662", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.408", "org.apache.zeppelin.realm.LdapRealm_509");

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test163"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.clearAllParagraphOutput("org.apache.zeppelin.realm.LdapRealm_662");

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test164"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.deleteNote("org.apache.zeppelin.realm.LdapRealm.authenticationCache.863");

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test165"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.runNoteJobs("org.apache.zeppelin.realm.LdapRealm_205");

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test166"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.moveParagraph("org.apache.zeppelin.realm.LdapRealm_306", "", "{\"body\":[\"org.apache.zeppelin.realm.LdapRealm_256\",\"org.apache.zeppelin.rest.exception.NotFoundException\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.260\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.266\",\"{\\\"message\\\":\\\"hi!\\\"}\",\"{\\n  \\\"message\\\": \\\"hi!\\\"\\n}\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.272\",\"org.apache.zeppelin.realm.LdapRealm_75\",\"org.apache.zeppelin.realm.LdapRealm_187\",\"org.apache.zeppelin.realm.LdapRealm_133\",\"org.apache.zeppelin.realm.LdapRealm_133\",\"org.apache.zeppelin.realm.LdapRealm_246\",\"org.apache.zeppelin.rest.exception.NotFoundException\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.167\",\"org.apache.zeppelin.realm.LdapRealm_109\",\"org.apache.zeppelin.realm.LdapRealm_93\",\"org.apache.zeppelin.realm.LdapRealm_175\",\"hi!\",\"org.apache.zeppelin.realm.LdapRealm_189\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"{}\",\"org.apache.zeppelin.realm.LdapRealm_229\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.272\",\"org.apache.zeppelin.realm.LdapRealm_306\",\"org.apache.zeppelin.realm.LdapRealm_205\",\"groupOfNames\",\"\",\"org.apache.zeppelin.realm.LdapRealm_301\",\"org.apache.zeppelin.realm.LdapRealm_134\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"{}\",\"org.apache.zeppelin.realm.LdapRealm_189\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.132\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.260\",\"org.apache.zeppelin.realm.LdapRealm_301\"]}");

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test167"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.removeCredentialEntity("org.apache.zeppelin.realm.LdapRealm.authenticationCache.1032");

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test168"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.putNotePermissions("", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test169"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.getCredentials("org.apache.zeppelin.realm.LdapRealm_882");

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test170"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.bind("org.apache.zeppelin.realm.LdapRealm_1022", "org.apache.zeppelin.realm.LdapRealm_109");

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test171"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.search("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339");

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test172"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.getNotePermissions("org.apache.zeppelin.realm.LdapRealm.authenticationCache.379");

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test173"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.stopParagraph("org.apache.zeppelin.realm.LdapRealm_651", "org.apache.zeppelin.realm.LdapRealm_300");

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test174"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.881");

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test175"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response6 = heliumRestApi0.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.rest.exception.NotFoundException");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response7 = heliumRestApi0.getVisualizationPackageOrder();

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test176"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.insertParagraph("{\n  \"message\": \"hi!\"\n}", "{\"message\":\"hi!\"}");

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test177"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.stopParagraph("org.apache.zeppelin.realm.LdapRealm_256", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test178"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.stopParagraph("hi!", "org.apache.zeppelin.realm.LdapRealm_793");

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test179"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = credentialRestApi0.removeCredentialEntity("org.apache.zeppelin.realm.LdapRealm_366");

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test180"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.runNoteJobs("org.apache.zeppelin.realm.LdapRealm_817");

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test181"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response1 = heliumRestApi0.getAllPackageConfigs();
    javax.ws.rs.core.Response response3 = heliumRestApi0.getSinglePackageInfo("org.apache.zeppelin.realm.LdapRealm.authenticationCache.439");
    javax.ws.rs.core.Response response5 = heliumRestApi0.getSpellConfigUsingMagic("org.apache.zeppelin.realm.LdapRealm_246");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response8 = heliumRestApi0.suggest("org.apache.zeppelin.realm.LdapRealm.authorizationCache.881", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.881");

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test182"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.cloneNote("org.apache.zeppelin.realm.LdapRealm_989", "org.apache.zeppelin.realm.LdapRealm_882");

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test183"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.importNote("org.apache.zeppelin.realm.LdapRealm_262");

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test184"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response2 = notebookRestApi0.exportNote("org.apache.zeppelin.realm.LdapRealm_973");

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test185"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    zeppelinHubRealm0.onLoginSuccess("org.apache.zeppelin.realm.LdapRealm.authorizationCache.510", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.408");

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test186"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response4 = notebookRestApi0.updateParagraphConfig("org.apache.zeppelin.realm.LdapRealm_273", "org.apache.zeppelin.realm.LdapRealm_1042", "org.apache.zeppelin.realm.LdapRealm_1137");

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test187"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response3 = notebookRestApi0.stopParagraph("org.apache.zeppelin.realm.LdapRealm.authorizationCache.1171", "org.apache.zeppelin.realm.LdapRealm_93");

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test188"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response6 = heliumRestApi0.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm_366", "org.apache.zeppelin.realm.LdapRealm_47");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    javax.ws.rs.core.Response response7 = heliumRestApi0.getAllPackageInfo();

  }

}
