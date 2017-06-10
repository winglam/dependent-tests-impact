
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    org.apache.zeppelin.helium.Helium helium0 = org.apache.zeppelin.server.ZeppelinServer.helium;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(helium0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    org.apache.zeppelin.utils.SecurityUtils securityUtils0 = new org.apache.zeppelin.utils.SecurityUtils();

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    org.apache.zeppelin.utils.CommandLineUtils commandLineUtils0 = new org.apache.zeppelin.utils.CommandLineUtils();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    org.apache.zeppelin.utils.InterpreterBindingUtils interpreterBindingUtils0 = new org.apache.zeppelin.utils.InterpreterBindingUtils();

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response1 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponse(status0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = null;
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    org.apache.shiro.authc.AuthenticationToken authenticationToken1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo2 = ldapRealm0.getAuthenticationInfo(authenticationToken1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = org.apache.zeppelin.server.ZeppelinServer.notebook;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebook0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    boolean b0 = org.apache.zeppelin.utils.SecurityUtils.isAuthenticated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("subtree");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketClose((int)(short)0, "subtree");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = null;
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener1 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener1.onParagraphCreate(paragraph2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = ldapRealm0.isPermitted(principalCollection7, "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    java.util.Map<java.lang.String,java.lang.String> map_str_str8 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setRolesByGroup(map_str_str8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    org.eclipse.jetty.server.Server server0 = null;
    org.apache.zeppelin.server.ZeppelinServer.jettyWebServer = server0;

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = null;
    org.apache.zeppelin.search.SearchService searchService2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi3 = new org.apache.zeppelin.rest.NotebookRestApi(notebook0, notebookServer1, searchService2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    javax.servlet.ServletRequest servletRequest1 = null;
    javax.servlet.ServletResponse servletResponse2 = null;
    javax.servlet.FilterChain filterChain3 = null;
    // The following exception was thrown during execution in test generation
    try {
    corsFilter0.doFilter(servletRequest1, servletResponse2, filterChain3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setUserSearchFilter("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    org.apache.shiro.subject.PrincipalCollection principalCollection3 = null;
    org.apache.shiro.authz.Permission permission4 = null;
    // The following exception was thrown during execution in test generation
    try {
    activeDirectoryGroupRealm0.checkPermission(principalCollection3, permission4);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    org.apache.zeppelin.utils.ExceptionUtils exceptionUtils0 = new org.apache.zeppelin.utils.ExceptionUtils();

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.server.ZeppelinServer.notebook = notebook0;

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketClose((int)(byte)-1, "(.*)");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b2 = org.apache.zeppelin.utils.SecurityUtils.isValidOrigin("subtree", zeppelinConfiguration1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.server.ZeppelinServer.helium = helium0;

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = heliumRestApi2.getAllEnabledPackageInfo();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = interpreterRestApi0.updateSetting("cn", "subtree");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    org.apache.zeppelin.rest.NotebookResponse notebookResponse0 = new org.apache.zeppelin.rest.NotebookResponse();

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = null;
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi2 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = notebookRepoRestApi2.listRepoSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.send("org.apache.zeppelin.realm.LdapRealm_47");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener3 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket4 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest1, "subtree", notebookSocketListener3);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint5 = notebookSocket4.getRemote();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOpen(notebookSocket4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint5);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketText("cn");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = null;
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener1 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Note note2 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener1.onNoteRemove(note2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("", "(.*)", (int)'4', type4, "cn");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.send("(.*)");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = heliumRestApi2.bundleLoad("subtree", "subtree");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    javax.servlet.ServletRequest servletRequest1 = null;
    javax.servlet.ServletResponse servletResponse2 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.service(servletRequest1, servletResponse2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("cn");

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchFilter("");
    java.util.Map<java.lang.String,java.lang.String> map_str_str6 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setRolesByGroup(map_str_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener3 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket4 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest1, "subtree", notebookSocketListener3);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOpen(notebookSocket4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.notebook.Note note6 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNote(note6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm_47", "cn", (int)(byte)0, type4, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm6 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm6.setUserSearchAttributeTemplate("hi!");
    ldapRealm6.setAuthorizationEnabled(false);
    ldapRealm6.setAuthenticationCachingEnabled(false);
    ldapRealm6.setUserSearchBase("hi!");
    java.lang.String str15 = ldapRealm6.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection16 = null;
    java.lang.String[] str_array18 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array19 = ldapRealm6.isPermitted(principalCollection16, str_array18);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermissions(principalCollection5, str_array18);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array19);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    boolean b7 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver8 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setPermissionResolver(permissionResolver8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = interpreterRestApi0.getMetaInfo(httpServletRequest1, "org.apache.zeppelin.realm.LdapRealm_75");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setMemberAttribute("subtree");
    ldapRealm0.setUserSearchAttributeTemplate("subtree");
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = ldapRealm0.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    org.apache.shiro.authz.Permission[] permission_array9 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission10 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission10, permission_array9);
    ldapRealm0.checkPermissions(principalCollection8, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission10);
    org.apache.shiro.subject.PrincipalCollection principalCollection13 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection13, "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest6, "subtree", notebookSocketListener8);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint10 = notebookSocket9.getRemote();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onClose(notebookSocket9, (-1), "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint10);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, "hi!");
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo4 = jsonresponse_abstractcollection_interpreterInfo2.setPretty(true);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = jsonresponse_abstractcollection_interpreterInfo4.build();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_abstractcollection_interpreterInfo4);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    pamRealm0.setService("");
    pamRealm0.setService("");

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    java.lang.String str2 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str3 = ldapRealm0.getPrincipalRegex();
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(.*)"+ "'", str3.equals("(.*)"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = org.apache.zeppelin.server.ZeppelinServer.notebookWsServer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(notebookServer0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = interpreterRestApi0.getMetaInfo(httpServletRequest1, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    ldapRealm0.setAuthenticationCacheName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException3 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException1, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException5 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)badRequestException3, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException6 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)notFoundException5);
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException8 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException5, "");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = null;
    ldapRealm0.setAuthorizationCache(cache_obj_authorizationInfo10);
    ldapRealm0.setAuthorizationCacheName("org.apache.zeppelin.realm.LdapRealm_75");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    javax.servlet.ServletRequest servletRequest4 = null;
    javax.servlet.ServletResponse servletResponse5 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.service(servletRequest4, servletResponse5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.notebook.Note note1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastParagraph(note1, paragraph2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array3 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo4 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo4, interpreterInfo_array3);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList7 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo4, false);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo8 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo4);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response9 = jsonresponse_abstractcollection_interpreterInfo8.build();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str5 = ldapRealm0.getName();
    int i6 = ldapRealm0.getPagingSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_93"+ "'", str5.equals("org.apache.zeppelin.realm.LdapRealm_93"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener.RemoteWorksEventListener remoteWorksEventListener6 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.onGetParagraphRunners("org.apache.zeppelin.realm.LdapRealm_75", "cn", remoteWorksEventListener6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.onRemoteRunParagraph("(.*)", "subtree");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    org.jvnet.libpam.UnixUser unixUser0 = null;
    org.apache.zeppelin.realm.UserPrincipal userPrincipal1 = new org.apache.zeppelin.realm.UserPrincipal(unixUser0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = userPrincipal1.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.eclipse.jetty.websocket.servlet.WebSocketServletFactory webSocketServletFactory6 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.configure(webSocketServletFactory6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    org.eclipse.jetty.server.Server server0 = org.apache.zeppelin.server.ZeppelinServer.jettyWebServer;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(server0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = new org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest();
    notebookRepoSettingsRequest0.name = "cn";

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    ldapRealm0.setAuthorizationCacheName("org.apache.zeppelin.realm.LdapRealm_75");
    java.lang.String str9 = ldapRealm0.getUserSearchFilter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = null;
    ldapRealm0.setAuthorizationCache(cache_obj_authorizationInfo10);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver12 = ldapRealm0.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory13 = ldapRealm0.getContextFactory();
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    java.lang.String[] str_array18 = new java.lang.String[] { "cn", "org.apache.zeppelin.realm.LdapRealm_47", "org.apache.zeppelin.realm.LdapRealm_93" };
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkRoles(principalCollection14, str_array18);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = null;
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener1 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Note note2 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting3 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener1.onUnbindInterpreter(note2, interpreterSetting3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = heliumRestApi0.getVisualizationPackageOrder("cn");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, "hi!");
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo4 = jsonresponse_abstractcollection_interpreterInfo2.setPretty(true);
    java.lang.String str5 = jsonresponse_abstractcollection_interpreterInfo2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_abstractcollection_interpreterInfo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\n  \"message\": \"hi!\"\n}"+ "'", str5.equals("{\n  \"message\": \"hi!\"\n}"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = null;
    java.util.HashSet<java.lang.String> hashset_str8 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str9 = notebookServer0.generateNotesInfo(false, authenticationInfo7, (java.util.Set<java.lang.String>)hashset_str8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str8);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
    activeDirectoryGroupRealm0.init();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver6 = null;
    // The following exception was thrown during execution in test generation
    try {
    activeDirectoryGroupRealm0.setPermissionResolver(permissionResolver6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer0.onAdd("(.*)", angularObject7);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo10 = null;
    java.util.HashSet<java.lang.String> hashset_str11 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str12 = notebookServer0.generateNotesInfo(true, authenticationInfo10, (java.util.Set<java.lang.String>)hashset_str11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str11);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer0.onAdd("(.*)", angularObject7);
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.service(servletRequest9, servletResponse10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo5 = null;
    java.util.HashSet<java.lang.String> hashset_str6 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str7 = notebookServer0.generateNotesInfo(false, authenticationInfo5, (java.util.Set<java.lang.String>)hashset_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str6);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, "hi!");
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo4 = jsonresponse_abstractcollection_interpreterInfo2.setPretty(true);
    javax.ws.rs.core.Response.Status status5 = null;
    jsonresponse_abstractcollection_interpreterInfo4.setCode(status5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_abstractcollection_interpreterInfo4);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    org.apache.zeppelin.server.JsonExclusionStrategy jsonExclusionStrategy0 = new org.apache.zeppelin.server.JsonExclusionStrategy();
    com.google.gson.FieldAttributes fieldAttributes1 = null;
    boolean b2 = jsonExclusionStrategy0.shouldSkipField(fieldAttributes1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    boolean b13 = notebookSocket12.isConnected();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo14 = null;
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "org.apache.zeppelin.realm.LdapRealm_75", "", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96" };
    java.util.HashSet<java.lang.String> hashset_str20 = new java.util.HashSet<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)hashset_str20, str_array19);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.unicastNoteList(notebookSocket12, authenticationInfo14, hashset_str20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    java.lang.String str4 = ldapRealm0.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    java.util.List<java.lang.String> list_str6 = null;
    boolean[] b_array7 = ldapRealm0.hasRoles(principalCollection5, list_str6);
    java.util.Map<java.lang.String,java.lang.String> map_str_str8 = ldapRealm0.getListRoles();
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_109", "org.apache.zeppelin.realm.LdapRealm_47", "(.*)", "org.apache.zeppelin.realm.LdapRealm_75", "hi!" };
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkRoles(principalCollection9, str_array15);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "cn"+ "'", str4.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("{\n  \"message\": \"hi!\"\n}");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer0.onAdd("(.*)", angularObject7);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener.RemoteWorksEventListener remoteWorksEventListener11 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onGetParagraphRunners("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "cn", remoteWorksEventListener11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = ldapRealm0.getListRoles();
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setPrincipalRegex("{\n  \"message\": \"hi!\"\n}");
      org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException");
    } catch (java.util.regex.PatternSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest5 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str6 = notebookRepoSettingsRequest5.settings;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm7 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm7.setSearchBase("hi!");
    activeDirectoryGroupRealm7.setSearchBase("");
    activeDirectoryGroupRealm7.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm13.setUserSearchAttributeTemplate("hi!");
    java.lang.String str16 = ldapRealm13.getUserSearchAttributeTemplate();
    java.lang.String str17 = ldapRealm13.getUserSearchAttributeName();
    boolean b18 = ldapRealm13.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm19 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str20 = ldapRealm19.getListRoles();
    ldapRealm13.setRolesByGroup(map_str_str20);
    activeDirectoryGroupRealm7.setGroupRolesMap(map_str_str20);
    notebookRepoSettingsRequest5.settings = map_str_str20;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.onMetaInfosReceived("", map_str_str20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str20);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer7 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket8 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest5, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint9 = notebookSocket8.getRemote();
    org.apache.zeppelin.notebook.socket.Message message10 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.saveInterpreterBindings(notebookSocket8, message10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint9);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    zeppelinHubRealm0.setZeppelinhubUrl("");
    org.apache.shiro.subject.PrincipalCollection principalCollection3 = null;
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHubRealm0.onLogout(principalCollection3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.broadcastUpdateNoteJobInfo((long)100);
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer0.onAdd("", angularObject9);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.CacheManager cacheManager4 = null;
    ldapRealm0.setCacheManager(cacheManager4);
    org.apache.shiro.subject.PrincipalCollection principalCollection6 = null;
    org.apache.shiro.authz.Permission permission7 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection6, permission7);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.rest.ConfigurationsRestApi configurationsRestApi1 = new org.apache.zeppelin.rest.ConfigurationsRestApi(notebook0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = configurationsRestApi1.getAll();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = null;
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener1 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener1.onParagraphRemove(paragraph2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type7 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm_109", "org.apache.zeppelin.realm.LdapRealm_134", (int)(byte)1, type7, "{\n  \"message\": \"hi!\"\n}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("(.*)");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    org.jvnet.libpam.UnixUser unixUser0 = null;
    org.apache.zeppelin.realm.UserPrincipal userPrincipal1 = new org.apache.zeppelin.realm.UserPrincipal(unixUser0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = userPrincipal1.getName();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getAuthenticationCacheName();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection4, "org.apache.zeppelin.realm.LdapRealm_139");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.144"+ "'", str3.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.144"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = heliumRestApi2.enablePackage("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_133");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject5);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type10 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_134", (int)(short)10, type10, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer8 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest6, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer8);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init((javax.servlet.ServletConfig)notebookServer8);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("cn");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "org.apache.zeppelin.realm.LdapRealm_133");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    boolean b8 = ldapRealm0.supports(authenticationToken7);
    ldapRealm0.setAuthorizationCachingEnabled(true);
    boolean b11 = ldapRealm0.isAuthorizationEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response9 = notebookRepoRestApi8.refreshRepo();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    java.lang.String str4 = ldapRealm0.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    java.util.List<java.lang.String> list_str6 = null;
    boolean[] b_array7 = ldapRealm0.hasRoles(principalCollection5, list_str6);
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection8, "org.apache.zeppelin.realm.LdapRealm_75");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "cn"+ "'", str4.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array7);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    byte[] byte_array9 = new byte[] { (byte)0, (byte)10, (byte)100, (byte)0, (byte)1 };
    notebookSocket3.onWebSocketBinary(byte_array9, 0, (int)(short)10);
    java.lang.String str13 = notebookSocket3.getProtocol();
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.send("{\n  \"message\": \"hi!\"\n}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "subtree"+ "'", str13.equals("subtree"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration<java.lang.String> enumeration_str5 = notebookServer0.getInitParameterNames();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    org.apache.zeppelin.rest.LoginRestApi loginRestApi0 = new org.apache.zeppelin.rest.LoginRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = loginRestApi0.postLogin("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_133");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.UnavailableSecurityManagerException");
    } catch (org.apache.shiro.UnavailableSecurityManagerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest6, "subtree", notebookSocketListener8);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint10 = notebookSocket9.getRemote();
    org.apache.zeppelin.notebook.socket.Message message11 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.unicastNoteJobInfo(notebookSocket9, message11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint10);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    pamRealm0.setService("");
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo3 = null;
    pamRealm0.setAuthenticationCache(cache_obj_authenticationInfo3);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.server.ZeppelinServer zeppelinServer0 = new org.apache.zeppelin.server.ZeppelinServer();
      org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException");
    } catch (java.nio.file.NoSuchFileException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.broadcastUpdateNoteJobInfo((long)100);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener10 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest8, "subtree", notebookSocketListener10);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint12 = notebookSocket11.getRemote();
    org.apache.zeppelin.notebook.socket.Message message13 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.saveInterpreterBindings(notebookSocket11, message13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint12);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = heliumRestApi2.enablePackage("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.apache.zeppelin.notebook.Note note6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.unicastParagraph(note6, paragraph7, "org.apache.zeppelin.realm.LdapRealm_152");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    // The following exception was thrown during execution in test generation
    try {
    javax.servlet.ServletContext servletContext4 = notebookServer0.getServletContext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
    java.util.HashSet<java.lang.String> hashset_str16 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastReloadedNoteList(authenticationInfo15, (java.util.HashSet)hashset_str16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str16);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.socket.NotebookServer notebookServer5 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer5.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph11 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
    notebookServer5.broadcastParagraphs(map_str_paragraph11, paragraph12);
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener16 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket17 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest14, "subtree", notebookSocketListener16);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint18 = notebookSocket17.getRemote();
    notebookServer5.unsubscribeNoteJobInfo(notebookSocket17);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onClose(notebookSocket17, 0, "cn");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint18);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response9 = notebookRepoRestApi8.listRepoSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest6, "subtree", notebookSocketListener8);
    byte[] byte_array15 = new byte[] { (byte)0, (byte)10, (byte)100, (byte)0, (byte)1 };
    notebookSocket9.onWebSocketBinary(byte_array15, 0, (int)(short)10);
    java.lang.String str19 = notebookSocket9.getProtocol();
    org.apache.zeppelin.notebook.socket.Message message20 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.getInterpreterBindings(notebookSocket9, message20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "subtree"+ "'", str19.equals("subtree"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response13 = interpreterRestApi10.updateSetting("cn", "(.*)");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm10 = jsonresponse_jndiLdapRealm8.setPretty(false);
    javax.ws.rs.core.Response.Status status11 = null;
    jsonresponse_jndiLdapRealm8.setCode(status11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jndiLdapRealm10);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponseContent(status0, "org.apache.zeppelin.realm.LdapRealm_133");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = interpreterRestApi5.listRepositories();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener4.onParagraphCreate(paragraph5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, "hi!");
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo4 = jsonresponse_abstractcollection_interpreterInfo2.setPretty(true);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = jsonresponse_abstractcollection_interpreterInfo2.build();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_abstractcollection_interpreterInfo4);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer8 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest6, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer8);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint10 = notebookSocket9.getRemote();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.onOpen(notebookSocket9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint10);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserDnTemplate("cn");

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, "hi!");
    javax.ws.rs.core.Response.Status status3 = jsonresponse_abstractcollection_interpreterInfo2.getCode();
    java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo> abstractcollection_interpreterInfo4 = jsonresponse_abstractcollection_interpreterInfo2.getBody();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(abstractcollection_interpreterInfo4);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    boolean b8 = ldapRealm0.supports(authenticationToken7);
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm_134");
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm12 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str13 = null;
    activeDirectoryGroupRealm12.setGroupRolesMap(map_str_str13);
    org.apache.shiro.subject.PrincipalCollection principalCollection15 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm16 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm16.setUserSearchAttributeTemplate("hi!");
    ldapRealm16.setAuthorizationEnabled(false);
    ldapRealm16.setAuthenticationCachingEnabled(false);
    ldapRealm16.setUserSearchBase("hi!");
    java.lang.String str25 = ldapRealm16.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection26 = null;
    java.lang.String[] str_array28 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array29 = ldapRealm16.isPermitted(principalCollection26, str_array28);
    boolean[] b_array30 = activeDirectoryGroupRealm12.isPermitted(principalCollection15, str_array28);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkRoles(principalCollection11, str_array28);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array30);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response13 = interpreterRestApi10.getMetaInfo(httpServletRequest11, "org.apache.zeppelin.realm.LdapRealm_175");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
    java.util.HashSet hashSet5 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNoteList(authenticationInfo4, hashSet5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b2 = org.apache.zeppelin.utils.SecurityUtils.isValidOrigin("org.apache.zeppelin.realm.LdapRealm_133", zeppelinConfiguration1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    org.apache.zeppelin.rest.LoginRestApi loginRestApi0 = new org.apache.zeppelin.rest.LoginRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response1 = loginRestApi0.logout();
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.UnavailableSecurityManagerException");
    } catch (org.apache.shiro.UnavailableSecurityManagerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = new org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest();
    notebookRepoSettingsRequest0.name = "org.apache.zeppelin.realm.LdapRealm_189";

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException3 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException1, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException4 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)badRequestException3);
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException6 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)badRequestException3, "org.apache.zeppelin.realm.LdapRealm_47");
    javax.ws.rs.core.Response response7 = badRequestException3.getResponse();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str5 = ldapRealm0.getName();
    org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
    boolean b7 = ldapRealm0.supports(authenticationToken6);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo8 = null;
    ldapRealm0.setAuthorizationCache(cache_obj_authorizationInfo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_205"+ "'", str5.equals("org.apache.zeppelin.realm.LdapRealm_205"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
    activeDirectoryGroupRealm0.setSystemPassword("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHubRealm0.setZeppelinhubUrl("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer0.onAdd("(.*)", angularObject7);
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm12 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm12.setSearchBase("hi!");
    activeDirectoryGroupRealm12.setSearchBase("");
    activeDirectoryGroupRealm12.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm18 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm18.setUserSearchAttributeTemplate("hi!");
    java.lang.String str21 = ldapRealm18.getUserSearchAttributeTemplate();
    java.lang.String str22 = ldapRealm18.getUserSearchAttributeName();
    boolean b23 = ldapRealm18.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm24 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str25 = ldapRealm24.getListRoles();
    ldapRealm18.setRolesByGroup(map_str_str25);
    activeDirectoryGroupRealm12.setGroupRolesMap(map_str_str25);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onParaInfosReceived("", "", "org.apache.zeppelin.realm.LdapRealm_109", map_str_str25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str25);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.CacheManager cacheManager4 = null;
    ldapRealm0.setCacheManager(cacheManager4);
    ldapRealm0.setUserObjectClass("cn");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = interpreterRestApi7.listRepositories();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.log("org.apache.zeppelin.realm.LdapRealm_47");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = heliumRestApi2.disablePackage("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator5 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest servletUpgradeRequest6 = null;
    org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse servletUpgradeResponse7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = notebookWebSocketCreator5.createWebSocket(servletUpgradeRequest6, servletUpgradeResponse7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response9 = interpreterRestApi7.removeSetting("org.apache.zeppelin.realm.LdapRealm_152");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    javax.ws.rs.core.Response.Status status0 = null;
    java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo> abstractcollection_interpreterInfo1 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, abstractcollection_interpreterInfo1);
    java.lang.String str3 = jsonresponse_abstractcollection_interpreterInfo2.toString();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = jsonresponse_abstractcollection_interpreterInfo2.build();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}"+ "'", str3.equals("{}"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setHadoopSecurityCredentialPath("org.apache.zeppelin.realm.LdapRealm_47");
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo8 = activeDirectoryGroupRealm0.getAuthenticationInfo(authenticationToken7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHubRealm0.setZeppelinhubUrl("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = interpreterRestApi5.listSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.eclipse.jetty.websocket.servlet.WebSocketServletFactory webSocketServletFactory11 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.configure(webSocketServletFactory11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    java.lang.String str2 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str3 = ldapRealm0.getPrincipalRegex();
    java.lang.String str4 = ldapRealm0.getGroupSearchScope();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(.*)"+ "'", str3.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "subtree"+ "'", str4.equals("subtree"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("{\"message\":\"hi!\"}");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.realm.LdapRealm ldapRealm9 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm9.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver12 = ldapRealm9.getPermissionResolver();
    java.lang.String str13 = ldapRealm9.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    java.util.List<java.lang.String> list_str15 = null;
    boolean[] b_array16 = ldapRealm9.hasRoles(principalCollection14, list_str15);
    java.util.Map<java.lang.String,java.lang.String> map_str_str17 = ldapRealm9.getListRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onParaInfosReceived("org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm_47", "subtree", map_str_str17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "cn"+ "'", str13.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str17);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = null;
    java.util.HashSet<java.lang.String> hashset_str8 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastReloadedNoteList(authenticationInfo7, (java.util.HashSet)hashset_str8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str8);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = heliumRestApi2.bundleLoad("{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm_139");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager5 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer6 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer6.broadcastParagraphs(map_str_paragraph7, paragraph8);
    javax.servlet.ServletConfig servletConfig10 = notebookServer6.getServletConfig();
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi11 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager5, notebookServer6);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init((javax.servlet.ServletConfig)notebookServer6);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig10);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    zeppelinHubRealm0.setZeppelinhubUrl("");
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHubRealm0.setZeppelinhubUrl("org.apache.zeppelin.realm.LdapRealm_139");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    java.lang.String str1 = pamRealm0.getService();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver5 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver5);
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.onParaInfosReceived("groupOfNames", "{\"message\":\"hi!\"}", "org.apache.zeppelin.realm.LdapRealm_175", map_str_str14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getName();
    ldapRealm0.setAuthenticationCachingEnabled(true);
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str12 = ldapRealm0.getPermissionsByRole();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_256"+ "'", str9.equals("org.apache.zeppelin.realm.LdapRealm_256"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str12);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    byte[] byte_array9 = new byte[] { (byte)0, (byte)10, (byte)100, (byte)0, (byte)1 };
    notebookSocket3.onWebSocketBinary(byte_array9, 0, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketClose((-1), "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onRemove("{\"message\":\"hi!\"}", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "cn");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
    java.lang.String str8 = ldapRealm0.getAuthenticationCacheName();
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    java.lang.String[] str_array31 = new java.lang.String[] { "{}", "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm_205", "org.apache.zeppelin.realm.LdapRealm_139", "{}", "org.apache.zeppelin.realm.LdapRealm_205", "org.apache.zeppelin.realm.LdapRealm_47", "org.apache.zeppelin.realm.LdapRealm_133", "{\"message\":\"hi!\"}", "hi!", "org.apache.zeppelin.realm.LdapRealm_175", "{}", "(.*)", "org.apache.zeppelin.realm.LdapRealm_109", "{}", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.rest.exception.NotFoundException", "cn", "groupOfNames" };
    java.util.ArrayList<java.lang.String> arraylist_str32 = new java.util.ArrayList<java.lang.String>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str32, str_array31);
    boolean b34 = ldapRealm0.hasAllRoles(principalCollection9, (java.util.Collection<java.lang.String>)arraylist_str32);
    boolean b35 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260"+ "'", str8.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    javax.ws.rs.core.Response.Status status0 = null;
    java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo> abstractcollection_interpreterInfo1 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, abstractcollection_interpreterInfo1);
    java.lang.String str3 = jsonresponse_abstractcollection_interpreterInfo2.toString();
    java.lang.String str4 = jsonresponse_abstractcollection_interpreterInfo2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}"+ "'", str3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = null;
    notebookServer0.onLoad("org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm_205", heliumPackage8);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type14 = null;
    notebookServer0.onOutputUpdated("", "(.*)", (int)(byte)0, "{\"message\":\"hi!\"}", type14, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting17 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.clearParagraphRuntimeInfo(interpreterSetting17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
    activeDirectoryGroupRealm0.setSearchBase("cn");
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo8 = activeDirectoryGroupRealm0.getAuthenticationInfo(authenticationToken7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setUserLowerCase(false);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response13 = interpreterRestApi10.updateSetting("org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.realm.LdapRealm_189");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = interpreterRestApi5.getMetaInfo(httpServletRequest6, "org.apache.zeppelin.realm.LdapRealm_256");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.shiro.realm.text.IniRealm iniRealm1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str2 = getUserList0.getUserList(iniRealm1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getName();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm_139" };
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermissions(principalCollection10, str_array16);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_268"+ "'", str9.equals("org.apache.zeppelin.realm.LdapRealm_268"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener4 = notebookServer0.getNotebookInformationListener();
    org.apache.zeppelin.notebook.Note note5 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNote(note5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener4);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.destroy();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket12.onWebSocketClose((int)(short)1, "{\n  \"message\": \"hi!\"\n}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.destroy();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    org.eclipse.jetty.websocket.api.Session session5 = notebookSocket3.getSession();
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketText("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session5);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    ldapRealm0.setPagingSize((int)' ');
    java.lang.String str7 = ldapRealm0.getAuthorizationCacheName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = newInterpreterSettingRequest0.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = newInterpreterSettingRequest0.getOption();
    java.lang.String str3 = newInterpreterSettingRequest0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener.RemoteWorksEventListener remoteWorksEventListener6 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onGetParagraphRunners("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150", "org.apache.zeppelin.realm.LdapRealm_175", remoteWorksEventListener6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setName("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setSystemUsername("org.apache.zeppelin.realm.LdapRealm_134");

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
    activeDirectoryGroupRealm0.init();
    org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo7 = activeDirectoryGroupRealm0.getAuthenticationInfo(authenticationToken6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException3 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException1, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException4 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)badRequestException3);
    javax.ws.rs.core.Response response5 = notFoundException4.getResponse();
    javax.ws.rs.core.Response response6 = notFoundException4.getResponse();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response6);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    java.lang.String str7 = ldapRealm0.getSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject4 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.notebook.Note note10 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener11 = notebookServer2.getParagraphJobListener(note10);
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener14 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest12, "subtree", notebookSocketListener14);
    boolean b16 = notebookSocket15.isConnected();
    java.lang.String str17 = notebookSocket15.getUser();
    org.apache.zeppelin.notebook.socket.Message message18 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.unicastNoteJobInfo(notebookSocket15, message18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = heliumRestApi2.getAllPackageInfo();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = null;
    notebookServer0.onLoad("org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm_205", heliumPackage8);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type14 = null;
    notebookServer0.onOutputUpdated("", "(.*)", (int)(byte)0, "{\"message\":\"hi!\"}", type14, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    org.apache.zeppelin.notebook.Note note17 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNote(note17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener6 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket7 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest4, "subtree", notebookSocketListener6);
    boolean b8 = notebookSocket7.isConnected();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket7);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener12 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest10, "subtree", notebookSocketListener12);
    byte[] byte_array19 = new byte[] { (byte)0, (byte)10, (byte)100, (byte)0, (byte)1 };
    notebookSocket13.onWebSocketBinary(byte_array19, 0, (int)(short)10);
    java.lang.String str23 = notebookSocket13.getProtocol();
    org.apache.zeppelin.notebook.socket.Message message24 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.getInterpreterBindings(notebookSocket13, message24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "subtree"+ "'", str23.equals("subtree"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener4 = notebookServer0.getNotebookInformationListener();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = notebookServer0.getServletName();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener4);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph15 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph15, paragraph16);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.log("org.apache.zeppelin.realm.LdapRealm_134");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = interpreterRestApi5.listInterpreter("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener4 = notebookServer0.getNotebookInformationListener();
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer7 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket8 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest5, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint9 = notebookSocket8.getRemote();
    java.lang.String str10 = notebookSocket8.getProtocol();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onClose(notebookSocket8, (int)(byte)10, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "cn"+ "'", str10.equals("cn"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    org.apache.zeppelin.realm.LdapRealm ldapRealm3 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm3.setUserSearchAttributeTemplate("hi!");
    ldapRealm3.setAuthorizationEnabled(false);
    ldapRealm3.setAuthenticationCachingEnabled(false);
    ldapRealm3.setUserSearchBase("hi!");
    java.lang.String str12 = ldapRealm3.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory13 = ldapRealm3.getContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory13);
    javax.naming.ldap.LdapContext ldapContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str17 = activeDirectoryGroupRealm0.searchForUserName("org.apache.zeppelin.realm.LdapRealm_47", ldapContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_293"+ "'", str12.equals("org.apache.zeppelin.realm.LdapRealm_293"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory13);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response10 = heliumRestApi2.bundleLoad("subtree", "org.apache.zeppelin.realm.LdapRealm_267");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest6, "subtree", notebookSocketListener8);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint10 = notebookSocket9.getRemote();
    org.eclipse.jetty.websocket.api.Session session11 = notebookSocket9.getSession();
    javax.servlet.http.HttpServletRequest httpServletRequest12 = notebookSocket9.getRequest();
    org.apache.zeppelin.notebook.socket.Message message13 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.getInterpreterBindings(notebookSocket9, message13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest12);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    org.apache.shiro.subject.PrincipalCollection principalCollection3 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm4 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm4.setUserSearchAttributeTemplate("hi!");
    ldapRealm4.setAuthorizationEnabled(false);
    ldapRealm4.setAuthenticationCachingEnabled(false);
    ldapRealm4.setUserSearchBase("hi!");
    java.lang.String str13 = ldapRealm4.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array17 = ldapRealm4.isPermitted(principalCollection14, str_array16);
    boolean[] b_array18 = activeDirectoryGroupRealm0.isPermitted(principalCollection3, str_array16);
    activeDirectoryGroupRealm0.setSearchBase("{}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array18);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = heliumRestApi2.disablePackage("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = credentialRestApi1.putCredentials("groupOfNames");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Note note7 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener6.onNoteRemove(note7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response12 = interpreterRestApi10.newSettings("org.apache.zeppelin.realm.LdapRealm_301");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str2);
    java.util.List<java.lang.String> list_str5 = getUserList0.getUserList(activeDirectoryGroupRealm1, "cn");
    org.apache.shiro.realm.text.IniRealm iniRealm6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str7 = getUserList0.getRolesList(iniRealm6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response12 = interpreterRestApi10.getSetting("groupOfNames");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response14 = interpreterRestApi10.listInterpreter("org.apache.zeppelin.realm.LdapRealm_273");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response12);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener.RemoteWorksEventListener remoteWorksEventListener5 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onGetParagraphRunners("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", remoteWorksEventListener5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener6 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket7 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest4, "subtree", notebookSocketListener6);
    boolean b8 = notebookSocket7.isConnected();
    boolean b9 = notebookSocket7.isConnected();
    org.apache.zeppelin.notebook.socket.Message message10 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.getInterpreterBindings(notebookSocket7, message10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.lang.String str1 = ldapRealm0.getGroupSearchScope();
    ldapRealm0.setUserDnTemplate("groupOfNames");
    ldapRealm0.setSearchBase("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "subtree"+ "'", str1.equals("subtree"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = ldapRealm0.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    org.apache.shiro.authz.Permission[] permission_array9 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission10 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission10, permission_array9);
    ldapRealm0.checkPermissions(principalCollection8, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission10);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setPrincipalRegex("{\"message\":\"hi!\"}");
      org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException");
    } catch (java.util.regex.PatternSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.CacheManager cacheManager4 = null;
    ldapRealm0.setCacheManager(cacheManager4);
    org.apache.shiro.subject.PrincipalCollection principalCollection6 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    ldapRealm7.setAuthorizationEnabled(false);
    ldapRealm7.setAuthenticationCachingEnabled(false);
    ldapRealm7.setUserSearchBase("hi!");
    java.lang.String str16 = ldapRealm7.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection17 = null;
    java.lang.String[] str_array19 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array20 = ldapRealm7.isPermitted(principalCollection17, str_array19);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkRoles(principalCollection6, str_array19);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array20);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    javax.ws.rs.core.Response.Status status8 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm9 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm9.setUserSearchAttributeTemplate("hi!");
    ldapRealm9.setAuthorizationEnabled(false);
    ldapRealm9.setAuthenticationCachingEnabled(false);
    ldapRealm9.setUserSearchBase("hi!");
    java.lang.String str18 = ldapRealm9.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo19 = null;
    ldapRealm9.setAuthorizationCache(cache_obj_authorizationInfo19);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm21 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status8, (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm9);
    ldapRealm9.setName("org.apache.zeppelin.rest.exception.NotFoundException");
    java.util.Map<java.lang.String,java.lang.String> map_str_str24 = ldapRealm9.getRolesByGroup();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onMetaInfosReceived("org.apache.zeppelin.realm.LdapRealm.authenticationCache.312", map_str_str24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str24);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Note note5 = null;
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting6 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener4.onUnbindInterpreter(note5, interpreterSetting6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject4 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.notebook.Note note10 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener11 = notebookServer2.getParagraphJobListener(note10);
    org.apache.zeppelin.notebook.Note note12 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.broadcastNote(note12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener11);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.scheduler.Job job11 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onProgressUpdate(job11, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = ldapRealm0.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    org.apache.shiro.authz.Permission[] permission_array9 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission10 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission10, permission_array9);
    ldapRealm0.checkPermissions(principalCollection8, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission10);
    org.apache.shiro.subject.PrincipalCollection principalCollection13 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm14 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm14.setUserSearchAttributeTemplate("hi!");
    java.lang.String str17 = ldapRealm14.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection18 = null;
    java.util.Collection collection19 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b20 = ldapRealm14.isPermittedAll(principalCollection18, (java.util.Collection<org.apache.shiro.authz.Permission>)collection19);
    boolean b21 = ldapRealm14.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm14.setUserDnTemplate("");
    org.apache.shiro.subject.PrincipalCollection principalCollection24 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm25 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm25.setUserSearchAttributeTemplate("hi!");
    ldapRealm25.setAuthorizationEnabled(false);
    ldapRealm25.setAuthenticationCachingEnabled(false);
    ldapRealm25.setUserSearchBase("hi!");
    java.lang.String str34 = ldapRealm25.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection35 = null;
    java.lang.String[] str_array37 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array38 = ldapRealm25.isPermitted(principalCollection35, str_array37);
    boolean[] b_array39 = ldapRealm14.isPermitted(principalCollection24, str_array37);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermissions(principalCollection13, str_array37);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array39);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setUrl("hi!");
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory7 = activeDirectoryGroupRealm0.getLdapContextFactory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory7);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setName("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setSearchBase("{}");
    java.lang.String str9 = activeDirectoryGroupRealm0.getAuthorizationCacheName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache"+ "'", str9.equals("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm10 = jsonresponse_jndiLdapRealm8.setPretty(false);
    javax.ws.rs.core.Response.Status status11 = jsonresponse_jndiLdapRealm8.getCode();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm13 = jsonresponse_jndiLdapRealm8.setPretty(false);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm15 = jsonresponse_jndiLdapRealm8.setPretty(true);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response16 = jsonresponse_jndiLdapRealm15.build();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jndiLdapRealm10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jndiLdapRealm13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jndiLdapRealm15);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    org.apache.zeppelin.rest.LoginRestApi loginRestApi0 = new org.apache.zeppelin.rest.LoginRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = loginRestApi0.postLogin("org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm_267");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.UnavailableSecurityManagerException");
    } catch (org.apache.shiro.UnavailableSecurityManagerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = credentialRestApi1.removeCredentialEntity("{\n  \"message\": \"hi!\"\n}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.broadcastUpdateNoteJobInfo((long)100);
    org.apache.zeppelin.socket.NotebookServer notebookServer8 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer8.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer8.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator13 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer8);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket14 = null;
    notebookServer8.unsubscribeNoteJobInfo(notebookSocket14);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init((javax.servlet.ServletConfig)notebookServer8);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Note note5 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener4.onNoteCreate(note5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi0 = new org.apache.zeppelin.rest.CredentialRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = credentialRestApi0.putCredentials("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    ldapRealm0.setAuthorizationCacheName("org.apache.zeppelin.realm.LdapRealm_75");
    ldapRealm0.setGroupSearchEnableMatchingRuleInChain(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher8 = null;
    ldapRealm0.setCredentialsMatcher(credentialsMatcher8);
    ldapRealm0.setPrincipalRegex("org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b2 = org.apache.zeppelin.utils.SecurityUtils.isValidOrigin("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", zeppelinConfiguration1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponseContent(status0, "org.apache.zeppelin.realm.LdapRealm_306");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm6 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = ldapRealm6.getListRoles();
    ldapRealm0.setRolesByGroup(map_str_str7);
    java.lang.Class class9 = ldapRealm0.getAuthenticationTokenClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class9);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer0.onAdd("(.*)", angularObject7);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration<java.lang.String> enumeration_str9 = notebookServer0.getInitParameterNames();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    corsFilter0.destroy();
    javax.servlet.ServletRequest servletRequest2 = null;
    javax.servlet.ServletResponse servletResponse3 = null;
    javax.servlet.FilterChain filterChain4 = null;
    // The following exception was thrown during execution in test generation
    try {
    corsFilter0.doFilter(servletRequest2, servletResponse3, filterChain4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponseContent(status0, "org.apache.zeppelin.realm.LdapRealm_187");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    ldapRealm1.setAuthorizationEnabled(false);
    ldapRealm1.setAuthenticationCachingEnabled(false);
    ldapRealm1.setUserSearchBase("hi!");
    java.lang.String str10 = ldapRealm1.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo11 = null;
    ldapRealm1.setAuthorizationCache(cache_obj_authorizationInfo11);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm13 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm1);
    ldapRealm1.setName("org.apache.zeppelin.rest.exception.NotFoundException");
    java.util.Map<java.lang.String,java.lang.String> map_str_str16 = ldapRealm1.getRolesByGroup();
    ldapRealm1.setUserSearchAttributeName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str16);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.rest.ConfigurationsRestApi configurationsRestApi1 = new org.apache.zeppelin.rest.ConfigurationsRestApi(notebook0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = configurationsRestApi1.getByPrefix("{\n  \"message\": \"hi!\"\n}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo4 = ldapRealm0.getAuthorizationCache();
    ldapRealm0.setPagingSize((int)(short)1);
    ldapRealm0.setAuthorizationCacheName("org.apache.zeppelin.realm.LdapRealm_152");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo4);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getAuthenticationCacheName();
    ldapRealm0.setGroupSearchBase("hi!");
    java.lang.String str6 = ldapRealm0.getUserSearchFilter();
    ldapRealm0.setAuthenticationCacheName("{\n  \"message\": \"hi!\"\n}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.356"+ "'", str3.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.356"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = heliumRestApi2.disablePackage("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm0.setUserDnTemplate("");
    ldapRealm0.setUserSearchScope("{\"message\":\"hi!\"}");
    ldapRealm0.setUserLowerCase(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponseContent(status0, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response6 = heliumRestApi2.getAllPackageConfigs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response6);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchAttributeTemplate();
    java.lang.String str11 = ldapRealm7.getUserSearchAttributeName();
    boolean b12 = ldapRealm7.isAuthorizationCachingEnabled();
    boolean b13 = ldapRealm7.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher14 = ldapRealm7.getCredentialsMatcher();
    ldapRealm0.setCredentialsMatcher(credentialsMatcher14);
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher16 = ldapRealm0.getCredentialsMatcher();
    org.apache.shiro.subject.PrincipalCollection principalCollection17 = null;
    org.apache.shiro.authz.Permission permission18 = null;
    boolean b19 = ldapRealm0.isPermitted(principalCollection17, permission18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = null;
    ldapRealm0.setAuthorizationCache(cache_obj_authorizationInfo10);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver12 = ldapRealm0.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory13 = ldapRealm0.getContextFactory();
    ldapRealm0.setMemberAttribute("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory13);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = heliumRestApi2.getVisualizationPackageOrder();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    java.lang.String str7 = ldapRealm0.getName();
    boolean b8 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    org.apache.shiro.authz.Permission permission10 = null;
    boolean b11 = ldapRealm0.isPermitted(principalCollection9, permission10);
    ldapRealm0.setName("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_366"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_366"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setMemberAttribute("subtree");
    ldapRealm0.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm_75");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init();
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    boolean b8 = ldapRealm0.supports(authenticationToken7);
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm_134");
    ldapRealm0.setSearchBase("cn");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    boolean b9 = notebookServer0.checkOrigin(httpServletRequest7, "cn");
    // The following exception was thrown during execution in test generation
    try {
    javax.servlet.ServletContext servletContext10 = notebookServer0.getServletContext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    java.lang.String str0 = org.apache.zeppelin.utils.SecurityUtils.getPrincipal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "anonymous"+ "'", str0.equals("anonymous"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException3 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException1, "");
    javax.ws.rs.core.Response response4 = badRequestException3.getResponse();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException6 = new org.apache.zeppelin.rest.exception.NotFoundException("org.apache.zeppelin.realm.LdapRealm_109");
    badRequestException3.addSuppressed((java.lang.Throwable)notFoundException6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    java.lang.String str5 = notebookSocket3.getProtocol();
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketClose((int)(byte)1, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "cn"+ "'", str5.equals("cn"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response9 = heliumRestApi2.disablePackage("org.apache.zeppelin.realm.LdapRealm_109");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    java.lang.String str5 = ldapRealm0.getUserObjectClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "person"+ "'", str5.equals("person"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response12 = interpreterRestApi10.getSetting("groupOfNames");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response13 = interpreterRestApi10.listSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response12);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str2);
    java.util.List<java.lang.String> list_str5 = getUserList0.getUserList(activeDirectoryGroupRealm1, "cn");
    org.apache.shiro.realm.jdbc.JdbcRealm jdbcRealm6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str7 = getUserList0.getUserList(jdbcRealm6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.scheduler.Job job11 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onProgressUpdate(job11, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException3 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException1, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException5 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)badRequestException3, "");
    javax.ws.rs.core.Response response6 = badRequestException3.getResponse();
    java.lang.Throwable[] throwable_array7 = badRequestException3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array7);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response12 = interpreterRestApi10.getSetting("groupOfNames");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response14 = interpreterRestApi10.listInterpreter("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response12);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setUserLowerCase(false);
    boolean b9 = ldapRealm0.isAuthenticationCachingEnabled();
    org.apache.shiro.authc.AuthenticationToken authenticationToken10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo11 = ldapRealm0.getAuthenticationInfo(authenticationToken10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = null;
    notebookServer0.onLoad("org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm_205", heliumPackage8);
    org.apache.zeppelin.notebook.Note note10 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNote(note10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = heliumRestApi2.getVisualizationPackageOrder();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph15 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph15, paragraph16);
    org.apache.zeppelin.notebook.Note note18 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener19 = notebookServer0.getParagraphJobListener(note18);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator20 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest servletUpgradeRequest21 = null;
    org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse servletUpgradeResponse22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj23 = notebookWebSocketCreator20.createWebSocket(servletUpgradeRequest21, servletUpgradeResponse22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener19);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchFilter();
    ldapRealm0.setAuthenticationCacheName("org.apache.zeppelin.realm.LdapRealm_256");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setMemberAttribute("subtree");
    ldapRealm0.setUserSearchAttributeTemplate("subtree");
    java.lang.String str10 = ldapRealm0.getGroupSearchBase();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str11 = ldapRealm0.getPermissionsByRole();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str11);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response10 = heliumRestApi2.enablePackage("org.apache.zeppelin.realm.LdapRealm_262", "org.apache.zeppelin.realm.LdapRealm_246");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm1.setSearchBase("hi!");
    activeDirectoryGroupRealm1.setSearchBase("");
    activeDirectoryGroupRealm1.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchAttributeTemplate();
    java.lang.String str11 = ldapRealm7.getUserSearchAttributeName();
    boolean b12 = ldapRealm7.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = ldapRealm13.getListRoles();
    ldapRealm7.setRolesByGroup(map_str_str14);
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str14);
    java.util.List<java.lang.String> list_str18 = getUserList0.getUserList(activeDirectoryGroupRealm1, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.shiro.realm.jdbc.JdbcRealm jdbcRealm19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str20 = getUserList0.getUserList(jdbcRealm19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException0 = new org.apache.zeppelin.rest.exception.ForbiddenException();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException2 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException4 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException2, "");
    javax.ws.rs.core.Response response5 = badRequestException4.getResponse();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException7 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)badRequestException4, "org.apache.zeppelin.realm.LdapRealm_134");
    forbiddenException0.addSuppressed((java.lang.Throwable)badRequestException4);
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException10 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException12 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException10, "");
    badRequestException4.addSuppressed((java.lang.Throwable)notFoundException10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver5 = activeDirectoryGroupRealm0.getRolePermissionResolver();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver6 = activeDirectoryGroupRealm0.getRolePermissionResolver();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver7 = activeDirectoryGroupRealm0.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    org.apache.shiro.authz.Permission permission9 = null;
    // The following exception was thrown during execution in test generation
    try {
    activeDirectoryGroupRealm0.checkPermission(principalCollection8, permission9);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver7);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response8 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_205", "groupOfNames");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response9 = heliumRestApi2.getAllPackageInfo();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response8);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onRemoteRunParagraph("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245", "org.apache.zeppelin.rest.exception.NotFoundException");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException0 = new org.apache.zeppelin.rest.exception.NotFoundException();

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = notebookSocket3.getRequest();
    org.eclipse.jetty.websocket.api.Session session5 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketConnect(session5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest4);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = notebookRestApi0.registerCronJob("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    pamRealm0.setService("org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");
    org.apache.shiro.subject.PrincipalCollection principalCollection3 = null;
    boolean b5 = pamRealm0.isPermitted(principalCollection3, "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = ldapRealm0.getListRoles();
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    ldapRealm0.setPermissionResolver(permissionResolver5);
    ldapRealm0.setUserDnTemplate("{\n  \"message\": \"hi!\"\n}");
    ldapRealm0.setPrincipalRegex("cn");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm1.setSearchBase("hi!");
    activeDirectoryGroupRealm1.setSearchBase("");
    activeDirectoryGroupRealm1.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchAttributeTemplate();
    java.lang.String str11 = ldapRealm7.getUserSearchAttributeName();
    boolean b12 = ldapRealm7.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = ldapRealm13.getListRoles();
    ldapRealm7.setRolesByGroup(map_str_str14);
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str14);
    java.util.List<java.lang.String> list_str18 = getUserList0.getUserList(activeDirectoryGroupRealm1, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.shiro.realm.text.IniRealm iniRealm19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str20 = getUserList0.getRolesList(iniRealm19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage13 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputUpdate(paragraph11, (int)(short)10, interpreterResultMessage13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHubRealm0.setZeppelinhubUrl("org.apache.zeppelin.realm.LdapRealm_366");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    org.apache.zeppelin.rest.message.NewParagraphRequest newParagraphRequest0 = new org.apache.zeppelin.rest.message.NewParagraphRequest();
    java.util.HashMap<java.lang.String,java.lang.Object> hashmap_str_obj1 = newParagraphRequest0.getConfig();
    java.util.HashMap<java.lang.String,java.lang.Object> hashmap_str_obj2 = newParagraphRequest0.getConfig();
    java.lang.String str3 = newParagraphRequest0.getText();
    java.lang.String str4 = newParagraphRequest0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_str_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
    ldapRealm0.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_75");
    ldapRealm0.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    ldapRealm0.setUserLowerCase(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher7);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph15 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph15, paragraph16);
    org.apache.zeppelin.notebook.Note note18 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener19 = notebookServer0.getParagraphJobListener(note18);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator20 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener.RemoteWorksEventListener remoteWorksEventListener23 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onGetParagraphRunners("org.apache.zeppelin.realm.LdapRealm_256", "org.apache.zeppelin.realm.LdapRealm_300", remoteWorksEventListener23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener19);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = newInterpreterSettingRequest0.getOption();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency2 = newInterpreterSettingRequest0.getDependencies();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_dependency2);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    ldapRealm1.setAuthorizationEnabled(false);
    ldapRealm1.setAuthenticationCachingEnabled(false);
    ldapRealm1.setUserSearchBase("hi!");
    java.lang.String str10 = ldapRealm1.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo11 = null;
    ldapRealm1.setAuthorizationCache(cache_obj_authorizationInfo11);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm13 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm1);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver14 = ldapRealm1.getPermissionResolver();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo15 = ldapRealm1.getAuthenticationCache();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo15);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.broadcastUpdateNoteJobInfo((long)100);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    boolean b10 = notebookServer0.checkOrigin(httpServletRequest8, "org.apache.zeppelin.realm.LdapRealm_47");
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration<java.lang.String> enumeration_str11 = notebookServer0.getInitParameterNames();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b2 = org.apache.zeppelin.utils.SecurityUtils.isValidOrigin("org.apache.zeppelin.realm.LdapRealm.authenticationCache.356", zeppelinConfiguration1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    org.eclipse.jetty.websocket.api.Session session5 = notebookSocket3.getSession();
    javax.servlet.http.HttpServletRequest httpServletRequest6 = notebookSocket3.getRequest();
    java.lang.String str7 = notebookSocket3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.String str7 = ldapRealm0.getUserSearchFilter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    pamRealm0.setService("");
    pamRealm0.setService("org.apache.zeppelin.realm.LdapRealm_205");

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getAuthenticationCacheName();
    ldapRealm0.setAuthenticationCachingEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.439"+ "'", str3.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.439"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setMemberAttribute("subtree");
    ldapRealm0.setUserSearchAttributeTemplate("subtree");
    java.lang.String str10 = ldapRealm0.getGroupSearchBase();
    ldapRealm0.setAuthorizationCachingEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject4 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo10 = null;
    java.util.HashSet<java.lang.String> hashset_str11 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.broadcastReloadedNoteList(authenticationInfo10, (java.util.HashSet)hashset_str11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str11);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    boolean b4 = ldapRealm0.isAuthorizationCachingEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    java.util.Collection collection6 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    ldapRealm0.checkRoles(principalCollection5, (java.util.Collection<java.lang.String>)collection6);
    java.lang.String str8 = ldapRealm0.getUserSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.lang.String str6 = notebookServer0.getServletInfo();
    org.apache.zeppelin.notebook.Note note7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.unicastParagraph(note7, paragraph8, "org.apache.zeppelin.realm.LdapRealm_256");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = notebookRepoSettingsRequest0.settings;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm2 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm2.setSearchBase("hi!");
    activeDirectoryGroupRealm2.setSearchBase("");
    activeDirectoryGroupRealm2.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm8 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm8.setUserSearchAttributeTemplate("hi!");
    java.lang.String str11 = ldapRealm8.getUserSearchAttributeTemplate();
    java.lang.String str12 = ldapRealm8.getUserSearchAttributeName();
    boolean b13 = ldapRealm8.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm14 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str15 = ldapRealm14.getListRoles();
    ldapRealm8.setRolesByGroup(map_str_str15);
    activeDirectoryGroupRealm2.setGroupRolesMap(map_str_str15);
    notebookRepoSettingsRequest0.settings = map_str_str15;
    java.lang.String str19 = notebookRepoSettingsRequest0.name;
    notebookRepoSettingsRequest0.name = "org.apache.zeppelin.realm.LdapRealm_47";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "subtree"+ "'", str19.equals("subtree"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    ldapRealm0.setGroupSearchBase("org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo9 = ldapRealm0.getAuthorizationCache();
    ldapRealm0.setSearchBase("org.apache.zeppelin.realm.LdapRealm_306");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo9);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = credentialRestApi1.getCredentials("subtree");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    java.lang.String str7 = ldapRealm0.getName();
    ldapRealm0.setAuthenticationCacheName("org.apache.zeppelin.realm.LdapRealm_366");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_447"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_447"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo8 = ldapRealm0.getAuthenticationInfo(authenticationToken7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.subject.PrincipalCollection principalCollection3 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection3, "org.apache.zeppelin.realm.LdapRealm_301");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setAuthenticationCacheName("org.apache.zeppelin.realm.LdapRealm_267");
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    org.apache.shiro.authz.Permission permission6 = null;
    // The following exception was thrown during execution in test generation
    try {
    activeDirectoryGroupRealm0.checkPermission(principalCollection5, permission6);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer0.broadcastUpdateNoteJobInfo((long)(short)0);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setUrl("hi!");
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchAttributeTemplate();
    ldapRealm7.setUserObjectClass("hi!");
    ldapRealm7.setAuthenticationCacheName("");
    org.apache.zeppelin.realm.LdapRealm ldapRealm15 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm15.setUserSearchAttributeTemplate("hi!");
    java.lang.String str18 = ldapRealm15.getUserSearchAttributeTemplate();
    ldapRealm15.setUserObjectClass("hi!");
    boolean b21 = ldapRealm15.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm22 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm22.setUserSearchAttributeTemplate("hi!");
    ldapRealm22.setAuthorizationEnabled(false);
    ldapRealm22.setAuthenticationCachingEnabled(false);
    ldapRealm22.setUserSearchBase("hi!");
    java.lang.String str31 = ldapRealm22.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo32 = null;
    ldapRealm22.setAuthorizationCache(cache_obj_authorizationInfo32);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver34 = ldapRealm22.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory35 = ldapRealm22.getContextFactory();
    ldapRealm15.setContextFactory(ldapContextFactory35);
    ldapRealm7.setContextFactory(ldapContextFactory35);
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory35);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer9 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer9.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer9;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket16 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest7, "groupOfNames", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer9);
    org.apache.zeppelin.notebook.socket.Message message17 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.saveInterpreterBindings(notebookSocket16, message17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    java.lang.String str2 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str3 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    ldapRealm0.onLogout(principalCollection4);
    org.apache.shiro.cache.CacheManager cacheManager6 = null;
    ldapRealm0.setCacheManager(cacheManager6);
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(.*)"+ "'", str3.equals("(.*)"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    notebookRepoSettingsRequest0.settings = map_str_str1;
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = notebookRepoSettingsRequest0.settings;
    java.lang.String str4 = notebookRepoSettingsRequest0.name;
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = notebookRepoSettingsRequest0.settings;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_47"+ "'", str4.equals("org.apache.zeppelin.realm.LdapRealm_47"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str5);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency1 = newInterpreterSettingRequest0.getDependencies();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_dependency1);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputAppend(paragraph11, 0, "org.apache.zeppelin.realm.LdapRealm_371");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    org.jvnet.libpam.UnixUser unixUser0 = null;
    org.apache.zeppelin.realm.UserPrincipal userPrincipal1 = new org.apache.zeppelin.realm.UserPrincipal(unixUser0);
    org.jvnet.libpam.UnixUser unixUser2 = userPrincipal1.getUnixUser();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = userPrincipal1.getName();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(unixUser2);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    notebookRepoSettingsRequest0.settings = map_str_str1;
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = notebookRepoSettingsRequest0.settings;
    boolean b4 = notebookRepoSettingsRequest0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    javax.ws.rs.core.Response.Status status0 = null;
    java.util.Properties properties2 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array3 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency4 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, dependency_array3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest7 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties2, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, interpreterOption6);
    org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>> jsonresponse_list_dependency8 = new org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>>(status0, "org.apache.zeppelin.realm.LdapRealm_139", (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4);
    javax.ws.rs.core.Response.Status status9 = jsonresponse_list_dependency8.getCode();
    org.apache.zeppelin.server.JsonResponse<?> jsonresponse_wildcard12 = jsonresponse_list_dependency8.addCookie("person", "org.apache.zeppelin.realm.LdapRealm_75");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_wildcard12);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    org.apache.zeppelin.rest.message.CronRequest cronRequest0 = new org.apache.zeppelin.rest.message.CronRequest();
    java.lang.String str1 = cronRequest0.getCronString();
    java.lang.String str2 = cronRequest0.getCronString();
    java.lang.String str3 = cronRequest0.getCronString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo4 = ldapRealm0.getAuthorizationCache();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver5 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver5);
    ldapRealm0.setGroupSearchEnableMatchingRuleInChain(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo4);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.message.NewParagraphRequest> jsonresponse_newParagraphRequest2 = new org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.message.NewParagraphRequest>(status0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.408");

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, "hi!");
    org.apache.zeppelin.server.JsonResponse<?> jsonresponse_wildcard5 = jsonresponse_abstractcollection_interpreterInfo2.addCookie("org.apache.zeppelin.realm.LdapRealm.authorizationCache.266", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_wildcard5);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.apache.zeppelin.notebook.Note note11 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.broadcastParagraph(note11, paragraph12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph15 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph15, paragraph16);
    org.apache.zeppelin.notebook.Note note18 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener19 = notebookServer0.getParagraphJobListener(note18);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo20 = null;
    java.util.HashSet<java.lang.String> hashset_str21 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastReloadedNoteList(authenticationInfo20, (java.util.HashSet)hashset_str21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str21);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm_306", "org.apache.zeppelin.realm.LdapRealm_366", (int)'#', "org.apache.zeppelin.realm.LdapRealm.authenticationCache.408");
    org.apache.zeppelin.interpreter.InterpreterResult.Type type23 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm.authenticationCache.408", "cn", 100, type23, "anonymous");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("org.apache.zeppelin.realm.LdapRealm_189");

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener12 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest10, "subtree", notebookSocketListener12);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint14 = notebookSocket13.getRemote();
    notebookServer1.unsubscribeNoteJobInfo(notebookSocket13);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi16 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response18 = interpreterRestApi16.removeSetting("anonymous");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    java.lang.String str1 = newInterpreterSettingRequest0.getGroup();
    java.lang.String str2 = newInterpreterSettingRequest0.getName();
    java.lang.String str3 = newInterpreterSettingRequest0.getName();
    java.lang.String str4 = newInterpreterSettingRequest0.getName();
    
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
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    notebookRepoSettingsRequest0.settings = map_str_str1;
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = notebookRepoSettingsRequest0.settings;
    java.lang.String str4 = notebookRepoSettingsRequest0.name;
    boolean b5 = notebookRepoSettingsRequest0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_47"+ "'", str4.equals("org.apache.zeppelin.realm.LdapRealm_47"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = notebookRestApi0.createNote("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    javax.ws.rs.core.Response.Status status0 = null;
    java.util.Properties properties2 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array3 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency4 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, dependency_array3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest7 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties2, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, interpreterOption6);
    org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>> jsonresponse_list_dependency8 = new org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>>(status0, "org.apache.zeppelin.realm.LdapRealm_139", (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4);
    java.lang.String str9 = jsonresponse_list_dependency8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}"+ "'", str9.equals("{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    notebookRepoSettingsRequest0.settings = map_str_str1;
    boolean b3 = notebookRepoSettingsRequest0.isEmpty();
    boolean b4 = notebookRepoSettingsRequest0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.socket.NotebookServer notebookServer7 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer7.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject9);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener11 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer7);
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener14 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest12, "subtree", notebookSocketListener14);
    boolean b16 = notebookSocket15.isConnected();
    boolean b17 = notebookSocket15.isConnected();
    notebookServer7.onMessage(notebookSocket15, "org.apache.zeppelin.realm.LdapRealm_205");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onClose(notebookSocket15, (int)(byte)0, "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    boolean b8 = notebookServer0.checkOrigin(httpServletRequest6, "org.apache.zeppelin.realm.LdapRealm_273");
    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest12 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str13 = notebookRepoSettingsRequest12.settings;
    org.apache.zeppelin.realm.LdapRealm ldapRealm14 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str15 = ldapRealm14.getListRoles();
    notebookRepoSettingsRequest12.settings = map_str_str15;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onParaInfosReceived("org.apache.zeppelin.realm.LdapRealm_301", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm_371", map_str_str15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str15);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener6.onParagraphCreate(paragraph7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.lang.String str6 = notebookServer0.getServletInfo();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onRemoteRunParagraph("org.apache.zeppelin.realm.LdapRealm_371", "");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = credentialRestApi1.removeCredentials("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm3 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory4 = activeDirectoryGroupRealm3.getLdapContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory4);
    activeDirectoryGroupRealm0.setSystemUsername("subtree");
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    activeDirectoryGroupRealm0.onLogout(principalCollection8);
    java.lang.Class class10 = activeDirectoryGroupRealm0.getAuthenticationTokenClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class10);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
    java.util.HashSet<java.lang.String> hashset_str5 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.broadcastNoteList(authenticationInfo4, (java.util.HashSet)hashset_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str5);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponseContent(status0, "org.apache.zeppelin.realm.LdapRealm_134");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    ldapRealm0.setUserLowerCase(false);
    java.lang.String str10 = ldapRealm0.getAuthorizationCacheName();
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("org.apache.zeppelin.realm.LdapRealm_460");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authorizationCache.480"+ "'", str10.equals("org.apache.zeppelin.realm.LdapRealm.authorizationCache.480"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    ldapRealm1.setAuthorizationEnabled(false);
    ldapRealm1.setAuthenticationCachingEnabled(false);
    ldapRealm1.setUserSearchBase("hi!");
    java.lang.String str10 = ldapRealm1.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo11 = null;
    ldapRealm1.setAuthorizationCache(cache_obj_authorizationInfo11);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm13 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm1);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm1.setMemberAttributeValueTemplate("org.apache.zeppelin.realm.LdapRealm_262");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    java.lang.String str7 = ldapRealm0.getName();
    boolean b8 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    org.apache.shiro.authz.Permission permission10 = null;
    boolean b11 = ldapRealm0.isPermitted(principalCollection9, permission10);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo12 = ldapRealm0.getAuthorizationCache();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_484"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_484"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo12);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection4, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator5 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.apache.zeppelin.socket.NotebookServer notebookServer6 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject8 = null;
    notebookServer6.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject8);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener10 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer6);
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener13 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket14 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest11, "subtree", notebookSocketListener13);
    boolean b15 = notebookSocket14.isConnected();
    boolean b16 = notebookSocket14.isConnected();
    notebookServer6.onMessage(notebookSocket14, "org.apache.zeppelin.realm.LdapRealm_205");
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo19 = null;
    java.util.HashSet<java.lang.String> hashset_str20 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.unicastNoteList(notebookSocket14, authenticationInfo19, hashset_str20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str20);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setName("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setSearchBase("{}");
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    activeDirectoryGroupRealm0.onLogout(principalCollection9);
    java.lang.String str11 = activeDirectoryGroupRealm0.getAuthorizationCacheName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache"+ "'", str11.equals("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject5);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo8 = null;
    java.lang.String[] str_array34 = new java.lang.String[] { "person", "cn", "org.apache.zeppelin.realm.LdapRealm_152", "{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.realm.LdapRealm_485", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.439", "subtree", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.356", "{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm_152", "{\"message\":\"hi!\"}", "org.apache.zeppelin.realm.LdapRealm_152", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185", "org.apache.zeppelin.realm.LdapRealm_256", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm_366", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.439", "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array34);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str37 = notebookServer0.generateNotesInfo(false, authenticationInfo8, (java.util.Set<java.lang.String>)linkedhashset_str35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    boolean b8 = notebookServer0.checkOrigin(httpServletRequest6, "org.apache.zeppelin.realm.LdapRealm_273");
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo10 = null;
    java.lang.String[] str_array28 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm.authenticationCache.408", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185", "org.apache.zeppelin.realm.LdapRealm_187", "org.apache.zeppelin.realm.LdapRealm_301", "org.apache.zeppelin.realm.LdapRealm_134", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.439", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.408", "org.apache.zeppelin.realm.LdapRealm_267", "org.apache.zeppelin.realm.LdapRealm_205", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185", "(.*)", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "{\"message\":\"hi!\"}", "anonymous", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.359", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str29 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str29, str_array28);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str31 = notebookServer0.generateNotesInfo(true, authenticationInfo10, (java.util.Set<java.lang.String>)linkedhashset_str29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>> jsonresponse_list_dependency1 = new org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>>(status0);
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency2 = jsonresponse_list_dependency1.getBody();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_dependency2);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    boolean b4 = notebookSocket3.isConnected();
    boolean b5 = notebookSocket3.isConnected();
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.send("person");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer0.onAdd("(.*)", angularObject7);
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException11 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException13 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException11, "");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.log("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150", (java.lang.Throwable)badRequestException13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver5 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver5);
    java.lang.String str7 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm9 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm9.setUserSearchAttributeTemplate("hi!");
    ldapRealm9.setAuthorizationEnabled(false);
    ldapRealm9.setAuthenticationCachingEnabled(false);
    ldapRealm9.setUserSearchBase("hi!");
    java.lang.String str18 = ldapRealm9.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection19 = null;
    java.lang.String[] str_array21 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array22 = ldapRealm9.isPermitted(principalCollection19, str_array21);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermissions(principalCollection8, str_array21);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array22);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener9 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest7, "subtree", notebookSocketListener9);
    notebookServer0.onMessage(notebookSocket10, "org.apache.zeppelin.realm.LdapRealm_187");
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = notebookServer0.doWebSocketConnect(httpServletRequest13, "org.apache.zeppelin.realm.LdapRealm_175");
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo17 = null;
    java.lang.String[] str_array34 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache", "org.apache.zeppelin.realm.LdapRealm_134", "anonymous", "org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185", "org.apache.zeppelin.realm.LdapRealm_47", "org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.312", "org.apache.zeppelin.realm.LdapRealm_301", "org.apache.zeppelin.realm.LdapRealm_484", "(.*)", "hi!", "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_306", "org.apache.zeppelin.realm.LdapRealm_273" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array34);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str37 = notebookServer0.generateNotesInfo(false, authenticationInfo17, (java.util.Set<java.lang.String>)linkedhashset_str35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authc.AuthenticationToken authenticationToken1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo2 = pamRealm0.getAuthenticationInfo(authenticationToken1);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authc.AuthenticationException");
    } catch (org.apache.shiro.authc.AuthenticationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener6 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket7 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest4, "subtree", notebookSocketListener6);
    boolean b8 = notebookSocket7.isConnected();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket7);
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager10 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer11 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer11.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi17 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager10, notebookServer11);
    javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket20 = notebookServer11.doWebSocketConnect(httpServletRequest18, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo21 = null;
    java.lang.String[] str_array42 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "{\"message\":\"hi!\"}", "person", "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.439", "org.apache.zeppelin.realm.LdapRealm_134", "{}", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.realm.LdapRealm_447", "org.apache.zeppelin.realm.LdapRealm_93", "(.*)", "org.apache.zeppelin.realm.LdapRealm_273", "anonymous", "org.apache.zeppelin.realm.LdapRealm_301", "org.apache.zeppelin.realm.LdapRealm_460", "org.apache.zeppelin.realm.LdapRealm_139", "{\n  \"message\": \"hi!\"\n}" };
    java.util.HashSet<java.lang.String> hashset_str43 = new java.util.HashSet<java.lang.String>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)hashset_str43, str_array42);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.unicastNoteList(notebookSocket20, authenticationInfo21, hashset_str43);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm10 = jsonresponse_jndiLdapRealm8.setPretty(false);
    javax.ws.rs.core.Response.Status status11 = jsonresponse_jndiLdapRealm8.getCode();
    org.apache.zeppelin.server.JsonResponse<?> jsonresponse_wildcard14 = jsonresponse_jndiLdapRealm8.addCookie("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_187");
    org.apache.zeppelin.server.JsonResponse<?> jsonresponse_wildcard17 = jsonresponse_jndiLdapRealm8.addCookie("{}", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm19 = jsonresponse_jndiLdapRealm8.setPretty(true);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response20 = jsonresponse_jndiLdapRealm19.build();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jndiLdapRealm10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_wildcard14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_wildcard17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jndiLdapRealm19);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
    org.apache.shiro.authc.AuthenticationToken authenticationToken8 = null;
    boolean b9 = ldapRealm0.supports(authenticationToken8);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = ldapRealm0.getAuthorizationCache();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo10);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer3 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket4 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest1, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer3);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi5 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer3);
    org.apache.zeppelin.socket.NotebookServer notebookServer6 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject8 = null;
    notebookServer6.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject8);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener12 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest10, "subtree", notebookSocketListener12);
    boolean b14 = notebookSocket13.isConnected();
    notebookServer6.unsubscribeNoteJobInfo(notebookSocket13);
    java.lang.String str16 = notebookSocket13.getUser();
    org.apache.zeppelin.notebook.socket.Message message17 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer3.unicastNoteJobInfo(notebookSocket13, message17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer2.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer2;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "groupOfNames", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph10 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    notebookServer2.broadcastParagraphs(map_str_paragraph10, paragraph11);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver1 = pamRealm0.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection2 = null;
    java.lang.String[] str_array39 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_256", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266", "{\"message\":\"hi!\"}", "{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_187", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_109", "org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm_175", "hi!", "org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm_300", "{}", "org.apache.zeppelin.realm.LdapRealm_229", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm_306", "org.apache.zeppelin.realm.LdapRealm_205", "groupOfNames", "", "org.apache.zeppelin.realm.LdapRealm_301", "org.apache.zeppelin.realm.LdapRealm_134", "org.apache.zeppelin.realm.LdapRealm_300", "{}", "org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm_301" };
    java.util.ArrayList<java.lang.String> arraylist_str40 = new java.util.ArrayList<java.lang.String>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str40, str_array39);
    boolean[] b_array42 = pamRealm0.hasRoles(principalCollection2, (java.util.List<java.lang.String>)arraylist_str40);
    java.lang.String str43 = pamRealm0.getService();
    boolean b44 = pamRealm0.isAuthenticationCachingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    javax.servlet.ServletConfig servletConfig6 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init(servletConfig6);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    org.apache.zeppelin.realm.PamRealm pamRealm2 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = pamRealm2.getPermissionResolver();
    ldapRealm0.setPermissionResolver(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = heliumRestApi2.disablePackage("org.apache.zeppelin.realm.LdapRealm_366");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchFilter("");
    ldapRealm0.setGroupSearchEnableMatchingRuleInChain(false);
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher10 = ldapRealm0.getCredentialsMatcher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher10);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer2.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer2;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "groupOfNames", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.realm.LdapRealm ldapRealm11 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm11.setUserSearchAttributeTemplate("hi!");
    java.lang.String str14 = ldapRealm11.getUserSearchAttributeTemplate();
    java.lang.String str15 = ldapRealm11.getUserSearchAttributeName();
    boolean b16 = ldapRealm11.isAuthorizationCachingEnabled();
    boolean b17 = ldapRealm11.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher18 = ldapRealm11.getCredentialsMatcher();
    java.lang.String str19 = ldapRealm11.getAuthenticationCacheName();
    org.apache.shiro.subject.PrincipalCollection principalCollection20 = null;
    java.lang.String[] str_array42 = new java.lang.String[] { "{}", "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm_205", "org.apache.zeppelin.realm.LdapRealm_139", "{}", "org.apache.zeppelin.realm.LdapRealm_205", "org.apache.zeppelin.realm.LdapRealm_47", "org.apache.zeppelin.realm.LdapRealm_133", "{\"message\":\"hi!\"}", "hi!", "org.apache.zeppelin.realm.LdapRealm_175", "{}", "(.*)", "org.apache.zeppelin.realm.LdapRealm_109", "{}", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.rest.exception.NotFoundException", "cn", "groupOfNames" };
    java.util.ArrayList<java.lang.String> arraylist_str43 = new java.util.ArrayList<java.lang.String>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str43, str_array42);
    boolean b45 = ldapRealm11.hasAllRoles(principalCollection20, (java.util.Collection<java.lang.String>)arraylist_str43);
    notebookServer2.broadcastInterpreterBindings("", (java.util.List)arraylist_str43);
    javax.servlet.http.HttpServletRequest httpServletRequest47 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener49 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket50 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest47, "subtree", notebookSocketListener49);
    boolean b51 = notebookSocket50.isConnected();
    java.lang.String str52 = notebookSocket50.getUser();
    notebookServer2.onMessage(notebookSocket50, "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339");
    javax.servlet.ServletRequest servletRequest55 = null;
    javax.servlet.ServletResponse servletResponse56 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.service(servletRequest55, servletResponse56);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.502"+ "'", str19.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.502"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm1.setSearchBase("hi!");
    activeDirectoryGroupRealm1.setSearchBase("");
    activeDirectoryGroupRealm1.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchAttributeTemplate();
    java.lang.String str11 = ldapRealm7.getUserSearchAttributeName();
    boolean b12 = ldapRealm7.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = ldapRealm13.getListRoles();
    ldapRealm7.setRolesByGroup(map_str_str14);
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str14);
    java.util.List<java.lang.String> list_str18 = getUserList0.getUserList(activeDirectoryGroupRealm1, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.shiro.realm.text.IniRealm iniRealm19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str20 = getUserList0.getUserList(iniRealm19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm1.setSearchBase("hi!");
    activeDirectoryGroupRealm1.setSearchBase("");
    activeDirectoryGroupRealm1.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchAttributeTemplate();
    java.lang.String str11 = ldapRealm7.getUserSearchAttributeName();
    boolean b12 = ldapRealm7.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = ldapRealm13.getListRoles();
    ldapRealm7.setRolesByGroup(map_str_str14);
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str14);
    java.util.List<java.lang.String> list_str18 = getUserList0.getUserList(activeDirectoryGroupRealm1, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.zeppelin.realm.LdapRealm ldapRealm19 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm19.setUserSearchAttributeTemplate("hi!");
    java.lang.String str22 = ldapRealm19.getUserSearchAttributeTemplate();
    ldapRealm19.setUserObjectClass("hi!");
    int i25 = ldapRealm19.getPagingSize();
    ldapRealm19.setUserSearchAttributeTemplate("org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");
    java.util.List<java.lang.String> list_str28 = getUserList0.getRolesList(ldapRealm19);
    org.apache.shiro.realm.text.IniRealm iniRealm29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str30 = getUserList0.getRolesList(iniRealm29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    java.lang.String str2 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str3 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    ldapRealm0.onLogout(principalCollection4);
    org.apache.shiro.cache.CacheManager cacheManager6 = null;
    ldapRealm0.setCacheManager(cacheManager6);
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");
    ldapRealm0.setAuthorizationCachingEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(.*)"+ "'", str3.equals("(.*)"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isCachingEnabled();
    ldapRealm0.setGroupObjectClass("org.apache.zeppelin.realm.LdapRealm_152");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response9 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response10 = interpreterRestApi7.listRepositories();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response9);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array12 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13, interpreterResultMessage_array12);
    paragraphListenerImpl10.onOutputUpdateAll(paragraph11, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13);
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage18 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputUpdate(paragraph16, (int)(short)100, interpreterResultMessage18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    ldapRealm0.setPermissionsByRole("org.apache.zeppelin.realm.LdapRealm_47");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer2.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer2;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "groupOfNames", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.notebook.Note note10 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.broadcastParagraph(note10, paragraph11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response8 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_205", "groupOfNames");
    javax.ws.rs.core.Response response11 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_265");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response15 = heliumRestApi2.suggest("{\"message\":\"hi!\"}", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.356", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response11);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    org.apache.zeppelin.scheduler.Job.Status status8 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener6.onParagraphStatusChange(paragraph7, status8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    java.util.Properties properties0 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array1 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency2 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency2, dependency_array1);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption4 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest5 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties0, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency2, interpreterOption4);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = updateInterpreterSettingRequest5.getOption();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency7 = updateInterpreterSettingRequest5.getDependencies();
    java.util.Properties properties8 = updateInterpreterSettingRequest5.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_dependency7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(properties8);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response9 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response10 = interpreterRestApi7.listSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response9);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    org.apache.zeppelin.rest.LoginRestApi loginRestApi0 = new org.apache.zeppelin.rest.LoginRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = loginRestApi0.postLogin("(.*)", "org.apache.zeppelin.realm.LdapRealm_267");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.UnavailableSecurityManagerException");
    } catch (org.apache.shiro.UnavailableSecurityManagerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    org.apache.zeppelin.notebook.Note note7 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNote(note7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer4 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer4.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject6);
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer4.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject9);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest2, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer4);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer4);
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener15 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket16 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest13, "subtree", notebookSocketListener15);
    boolean b17 = notebookSocket16.isConnected();
    boolean b18 = notebookSocket16.isConnected();
    java.lang.String str19 = notebookSocket16.getUser();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo20 = null;
    java.util.HashSet<java.lang.String> hashset_str21 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer4.unicastNoteList(notebookSocket16, authenticationInfo20, hashset_str21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str21);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = newInterpreterSettingRequest0.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = newInterpreterSettingRequest0.getOption();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = newInterpreterSettingRequest0.getProperties();
    java.lang.String str4 = newInterpreterSettingRequest0.getName();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency5 = newInterpreterSettingRequest0.getDependencies();
    java.lang.String str6 = newInterpreterSettingRequest0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_dependency5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isCachingEnabled();
    ldapRealm0.setUserSearchAttributeTemplate("org.apache.zeppelin.realm.LdapRealm_75");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    javax.servlet.ServletConfig servletConfig4 = notebookServer0.getServletConfig();
    org.apache.zeppelin.notebook.Note note5 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph6 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastParagraph(note5, paragraph6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig4);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str5 = ldapRealm0.getName();
    boolean b6 = ldapRealm0.isAuthenticationCachingEnabled();
    java.lang.String str7 = ldapRealm0.getMemberAttribute();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_529"+ "'", str5.equals("org.apache.zeppelin.realm.LdapRealm_529"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "member"+ "'", str7.equals("member"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    javax.ws.rs.core.Response response2 = interpreterRestApi0.removeRepository("{}");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = interpreterRestApi0.updateSetting("anonymous", "org.apache.zeppelin.realm.LdapRealm_134");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    ldapRealm0.setPagingSize((int)' ');
    ldapRealm0.setPermissionsByRole("org.apache.zeppelin.rest.exception.NotFoundException");
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("org.apache.zeppelin.realm.LdapRealm_152");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    org.apache.zeppelin.realm.LdapGroupRealm ldapGroupRealm0 = new org.apache.zeppelin.realm.LdapGroupRealm();
    org.apache.shiro.subject.PrincipalCollection principalCollection1 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    boolean b6 = ldapRealm2.isAuthenticationCachingEnabled();
    ldapRealm2.setPagingSize((int)' ');
    org.apache.zeppelin.realm.LdapRealm ldapRealm9 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm9.setUserSearchAttributeTemplate("hi!");
    ldapRealm9.setAuthorizationEnabled(false);
    ldapRealm9.setAuthenticationCachingEnabled(false);
    ldapRealm9.setUserSearchBase("hi!");
    java.lang.String str18 = ldapRealm9.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory19 = ldapRealm9.getContextFactory();
    ldapRealm2.setContextFactory(ldapContextFactory19);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authz.AuthorizationInfo authorizationInfo21 = ldapGroupRealm0.queryForAuthorizationInfo(principalCollection1, ldapContextFactory19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_533"+ "'", str18.equals("org.apache.zeppelin.realm.LdapRealm_533"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory19);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    java.lang.String str1 = newInterpreterSettingRequest0.getGroup();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = newInterpreterSettingRequest0.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str2);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setAuthenticationCacheName("org.apache.zeppelin.realm.LdapRealm_267");
    activeDirectoryGroupRealm0.setSystemUsername("org.apache.zeppelin.realm.LdapRealm_47");

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    ldapRealm0.setUserSearchBase("cn");
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm10 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm10.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver13 = ldapRealm10.getPermissionResolver();
    boolean b14 = ldapRealm10.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection15 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm16 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm16.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver19 = ldapRealm16.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection20 = null;
    java.lang.String[] str_array24 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str25 = new java.util.ArrayList<java.lang.String>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str25, str_array24);
    boolean[] b_array27 = ldapRealm16.hasRoles(principalCollection20, (java.util.List<java.lang.String>)arraylist_str25);
    boolean[] b_array28 = ldapRealm10.hasRoles(principalCollection15, (java.util.List<java.lang.String>)arraylist_str25);
    boolean b29 = ldapRealm0.hasAllRoles(principalCollection9, (java.util.Collection<java.lang.String>)arraylist_str25);
    ldapRealm0.setAuthorizationCachingEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = notebookRepoSettingsRequest0.settings;
    java.lang.String str2 = notebookRepoSettingsRequest0.name;
    org.apache.zeppelin.realm.LdapRealm ldapRealm3 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm3.setUserSearchAttributeTemplate("hi!");
    java.lang.String str6 = ldapRealm3.getUserSearchAttributeTemplate();
    java.lang.String str7 = ldapRealm3.getUserSearchAttributeName();
    boolean b8 = ldapRealm3.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm9 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str10 = ldapRealm9.getListRoles();
    ldapRealm3.setRolesByGroup(map_str_str10);
    notebookRepoSettingsRequest0.settings = map_str_str10;
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm13.setUserSearchAttributeTemplate("hi!");
    java.lang.String str16 = ldapRealm13.getUserSearchAttributeTemplate();
    java.lang.String str17 = ldapRealm13.getUserSearchAttributeName();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver18 = null;
    ldapRealm13.setRolePermissionResolver(rolePermissionResolver18);
    java.lang.String str20 = ldapRealm13.getUserSearchAttributeTemplate();
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = ldapRealm13.getRolesByGroup();
    notebookRepoSettingsRequest0.settings = map_str_str21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_47"+ "'", str2.equals("org.apache.zeppelin.realm.LdapRealm_47"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str21);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.cache.CacheManager cacheManager3 = null;
    ldapRealm0.setCacheManager(cacheManager3);
    ldapRealm0.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver7 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver7);
    java.lang.String str9 = ldapRealm0.getUserSearchScope();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "subtree"+ "'", str9.equals("subtree"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    notebookRepoSettingsRequest0.name = "subtree";
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = notebookRepoSettingsRequest0.settings;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener9 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest7, "subtree", notebookSocketListener9);
    notebookServer0.onMessage(notebookSocket10, "org.apache.zeppelin.realm.LdapRealm_187");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onRemoteRunParagraph("org.apache.zeppelin.realm.LdapRealm_47", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponseContent(status0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.lang.String str6 = notebookServer0.getServletInfo();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type11 = null;
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm_366", "org.apache.zeppelin.realm.LdapRealm_93", 100, "org.apache.zeppelin.realm.LdapRealm_93", type11, "{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}");
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener16 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket17 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest14, "subtree", notebookSocketListener16);
    boolean b18 = notebookSocket17.isConnected();
    java.lang.String str19 = notebookSocket17.getUser();
    org.apache.zeppelin.notebook.socket.Message message20 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.getInterpreterBindings(notebookSocket17, message20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("anonymous");

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    org.apache.zeppelin.rest.exception.BadRequestException badRequestException1 = new org.apache.zeppelin.rest.exception.BadRequestException("org.apache.zeppelin.realm.LdapRealm_109");
    java.lang.String str2 = badRequestException1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.zeppelin.rest.exception.BadRequestException"+ "'", str2.equals("org.apache.zeppelin.rest.exception.BadRequestException"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setHadoopSecurityCredentialPath("org.apache.zeppelin.realm.LdapRealm_47");
    javax.naming.ldap.LdapContext ldapContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str9 = activeDirectoryGroupRealm0.searchForUserName("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245", ldapContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo(0L);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    org.eclipse.jetty.websocket.api.Session session5 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketConnect(session5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    javax.servlet.FilterConfig filterConfig1 = null;
    corsFilter0.init(filterConfig1);
    javax.servlet.ServletRequest servletRequest3 = null;
    javax.servlet.ServletResponse servletResponse4 = null;
    javax.servlet.FilterChain filterChain5 = null;
    // The following exception was thrown during execution in test generation
    try {
    corsFilter0.doFilter(servletRequest3, servletResponse4, filterChain5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.ws.rs.core.Response.Status status6 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array9 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo10 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, interpreterInfo_array9);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList13 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, false);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo14 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status6, (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10);
    javax.ws.rs.core.Response.Status status17 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array20 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo21 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo21, interpreterInfo_array20);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList24 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo21, false);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo25 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status17, (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo21);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList27 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.rest.exception.NotFoundException", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo21, true);
    jsonresponse_abstractcollection_interpreterInfo14.setBody((java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo21);
    notebookServer0.broadcastInterpreterBindings("", (java.util.List)arraylist_interpreterInfo21);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type33 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "{}", (int)' ', type33, "org.apache.zeppelin.realm.LdapRealm_529");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = ldapRealm0.getListRoles();
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    ldapRealm0.setPermissionResolver(permissionResolver5);
    ldapRealm0.setUserDnTemplate("{\n  \"message\": \"hi!\"\n}");
    ldapRealm0.setPrincipalRegex("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    ldapRealm0.setName("org.apache.zeppelin.realm.LdapRealm_265");
    java.lang.String str13 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection14, "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "subtree"+ "'", str13.equals("subtree"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = null;
    ldapRealm0.setAuthorizationCache(cache_obj_authorizationInfo10);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver12 = ldapRealm0.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory13 = ldapRealm0.getContextFactory();
    ldapRealm0.setCachingEnabled(false);
    ldapRealm0.setAuthorizationCacheName("(.*)");
    boolean b18 = ldapRealm0.isAuthorizationCachingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b2 = org.apache.zeppelin.utils.SecurityUtils.isValidOrigin("org.apache.zeppelin.realm.LdapRealm_509", zeppelinConfiguration1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    boolean b8 = ldapRealm0.supports(authenticationToken7);
    ldapRealm0.setAuthorizationCachingEnabled(true);
    org.apache.shiro.cache.CacheManager cacheManager11 = ldapRealm0.getCacheManager();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cacheManager11);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph15 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph15, paragraph16);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener18 = notebookServer0.getNotebookInformationListener();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener18);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.356");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory1 = activeDirectoryGroupRealm0.getLdapContextFactory();
    activeDirectoryGroupRealm0.setHadoopSecurityCredentialPath("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");
    javax.naming.ldap.LdapContext ldapContext5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str6 = activeDirectoryGroupRealm0.searchForUserName("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", ldapContext5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory1);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = newInterpreterSettingRequest0.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = newInterpreterSettingRequest0.getOption();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = newInterpreterSettingRequest0.getProperties();
    java.lang.String str4 = newInterpreterSettingRequest0.getName();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency5 = newInterpreterSettingRequest0.getDependencies();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency6 = newInterpreterSettingRequest0.getDependencies();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_dependency5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_dependency6);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    ldapRealm0.setMemberAttribute("org.apache.zeppelin.realm.LdapRealm_47");
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("org.apache.zeppelin.realm.LdapRealm_267");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
    java.lang.String str8 = ldapRealm0.getAuthenticationCacheName();
    ldapRealm0.setMemberAttribute("org.apache.zeppelin.realm.LdapRealm_485");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.555"+ "'", str8.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.555"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array12 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13, interpreterResultMessage_array12);
    paragraphListenerImpl10.onOutputUpdateAll(paragraph11, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13);
    org.apache.zeppelin.scheduler.Job job16 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onProgressUpdate(job16, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    java.lang.String str7 = ldapRealm0.getName();
    boolean b8 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setUserSearchAttributeTemplate("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_558"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_558"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
    org.apache.shiro.authc.AuthenticationToken authenticationToken8 = null;
    boolean b9 = ldapRealm0.supports(authenticationToken8);
    ldapRealm0.setUserObjectClass("org.apache.zeppelin.realm.LdapRealm_460");
    ldapRealm0.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm_265");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer2.onUpdate("", angularObject5);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = interpreterRestApi5.removeSetting("org.apache.zeppelin.realm.LdapRealm_152");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer3 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer3.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph9 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
    notebookServer3.broadcastParagraphs(map_str_paragraph9, paragraph10);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi12 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager2, notebookServer3);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_75", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer3);
    org.eclipse.jetty.websocket.api.Session session14 = notebookSocket13.getSession();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session14);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm6 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm6.setUserSearchAttributeTemplate("hi!");
    java.lang.String str9 = ldapRealm6.getUserSearchAttributeTemplate();
    boolean b10 = ldapRealm6.isAuthorizationCachingEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    java.util.Collection collection12 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    ldapRealm6.checkRoles(principalCollection11, (java.util.Collection<java.lang.String>)collection12);
    boolean b14 = ldapRealm0.isPermittedAll(principalCollection5, (java.util.Collection<org.apache.shiro.authz.Permission>)collection12);
    ldapRealm0.setName("org.apache.zeppelin.realm.LdapRealm_485");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>> jsonresponse_list_dependency2 = new org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>>(status0, "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    ldapRealm0.setUserSearchBase("(.*)");
    ldapRealm0.setUserLowerCase(true);
    boolean b11 = ldapRealm0.getUserLowerCase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchAttributeTemplate();
    java.lang.String str11 = ldapRealm7.getUserSearchAttributeName();
    boolean b12 = ldapRealm7.isAuthorizationCachingEnabled();
    boolean b13 = ldapRealm7.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher14 = ldapRealm7.getCredentialsMatcher();
    ldapRealm0.setCredentialsMatcher(credentialsMatcher14);
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver16 = ldapRealm0.getRolePermissionResolver();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo17 = ldapRealm0.getAuthenticationCache();
    org.apache.shiro.subject.PrincipalCollection principalCollection18 = null;
    org.apache.zeppelin.realm.PamRealm pamRealm19 = new org.apache.zeppelin.realm.PamRealm();
    pamRealm19.setService("");
    org.apache.shiro.subject.PrincipalCollection principalCollection22 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm23 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm23.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver26 = ldapRealm23.getPermissionResolver();
    boolean b27 = ldapRealm23.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection28 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm29 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm29.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver32 = ldapRealm29.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection33 = null;
    java.lang.String[] str_array37 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str38 = new java.util.ArrayList<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str38, str_array37);
    boolean[] b_array40 = ldapRealm29.hasRoles(principalCollection33, (java.util.List<java.lang.String>)arraylist_str38);
    boolean[] b_array41 = ldapRealm23.hasRoles(principalCollection28, (java.util.List<java.lang.String>)arraylist_str38);
    boolean[] b_array42 = pamRealm19.hasRoles(principalCollection22, (java.util.List<java.lang.String>)arraylist_str38);
    boolean[] b_array43 = ldapRealm0.hasRoles(principalCollection18, (java.util.List<java.lang.String>)arraylist_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array43);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
    java.util.HashSet<java.lang.String> hashset_str7 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNoteList(authenticationInfo6, (java.util.HashSet)hashset_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str7);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    boolean b4 = notebookSocket3.isConnected();
    boolean b5 = notebookSocket3.isConnected();
    java.lang.String str6 = notebookSocket3.getUser();
    javax.servlet.http.HttpServletRequest httpServletRequest7 = notebookSocket3.getRequest();
    org.eclipse.jetty.websocket.api.Session session8 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketConnect(session8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest7);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = null;
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi2 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    javax.ws.rs.core.Response response4 = notebookRepoRestApi2.updateRepoSetting("subtree");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = notebookRepoRestApi2.listRepoSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.socket.NotebookServer notebookServer4 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer4.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject6);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener8 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer4);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    boolean b13 = notebookSocket12.isConnected();
    boolean b14 = notebookSocket12.isConnected();
    notebookServer4.onMessage(notebookSocket12, "org.apache.zeppelin.realm.LdapRealm_205");
    org.apache.zeppelin.notebook.socket.Message message17 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.getInterpreterBindings(notebookSocket12, message17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    ldapRealm1.setAuthorizationEnabled(false);
    ldapRealm1.setUserDnTemplate("subtree");
    java.util.List<java.lang.String> list_str8 = getUserList0.getRolesList(ldapRealm1);
    org.apache.shiro.realm.text.IniRealm iniRealm9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str10 = getUserList0.getUserList(iniRealm9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.lang.String[] str_array8 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    boolean[] b_array11 = ldapRealm0.hasRoles(principalCollection4, (java.util.List<java.lang.String>)arraylist_str9);
    java.lang.String str12 = ldapRealm0.getGroupObjectClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "groupOfNames"+ "'", str12.equals("groupOfNames"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm1.setSearchBase("hi!");
    activeDirectoryGroupRealm1.setSearchBase("");
    activeDirectoryGroupRealm1.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchAttributeTemplate();
    java.lang.String str11 = ldapRealm7.getUserSearchAttributeName();
    boolean b12 = ldapRealm7.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = ldapRealm13.getListRoles();
    ldapRealm7.setRolesByGroup(map_str_str14);
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str14);
    java.util.List<java.lang.String> list_str18 = getUserList0.getUserList(activeDirectoryGroupRealm1, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.shiro.subject.PrincipalCollection principalCollection19 = null;
    org.apache.shiro.authz.Permission permission20 = null;
    // The following exception was thrown during execution in test generation
    try {
    activeDirectoryGroupRealm1.checkPermission(principalCollection19, permission20);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm0.setUserDnTemplate("");
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm11 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm11.setUserSearchAttributeTemplate("hi!");
    ldapRealm11.setAuthorizationEnabled(false);
    ldapRealm11.setAuthenticationCachingEnabled(false);
    ldapRealm11.setUserSearchBase("hi!");
    java.lang.String str20 = ldapRealm11.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection21 = null;
    java.lang.String[] str_array23 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array24 = ldapRealm11.isPermitted(principalCollection21, str_array23);
    boolean[] b_array25 = ldapRealm0.isPermitted(principalCollection10, str_array23);
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str26 = ldapRealm0.getPermissionsByRole();
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm_262");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str26);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.message.NewParagraphRequest> jsonresponse_newParagraphRequest1 = new org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.message.NewParagraphRequest>(status0);
    org.apache.zeppelin.server.JsonResponse<?> jsonresponse_wildcard4 = jsonresponse_newParagraphRequest1.addCookie("{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm_133");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_wildcard4);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array12 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13, interpreterResultMessage_array12);
    paragraphListenerImpl10.onOutputUpdateAll(paragraph11, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13);
    org.apache.zeppelin.scheduler.Job job16 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onProgressUpdate(job16, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    notebookServer0.broadcastUpdateNoteJobInfo((-1L));
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    javax.servlet.ServletRequest servletRequest12 = null;
    javax.servlet.ServletResponse servletResponse13 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.service(servletRequest12, servletResponse13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    java.lang.String str4 = ldapRealm0.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    java.util.List<java.lang.String> list_str6 = null;
    boolean[] b_array7 = ldapRealm0.hasRoles(principalCollection5, list_str6);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo8 = ldapRealm0.getAuthorizationCache();
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm10 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm10.setUserSearchAttributeTemplate("hi!");
    java.lang.String str13 = ldapRealm10.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    java.util.Collection collection15 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b16 = ldapRealm10.isPermittedAll(principalCollection14, (java.util.Collection<org.apache.shiro.authz.Permission>)collection15);
    java.util.Map<java.lang.String,java.lang.String> map_str_str17 = ldapRealm10.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection18 = null;
    org.apache.shiro.authz.Permission[] permission_array19 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission20 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission20, permission_array19);
    ldapRealm10.checkPermissions(principalCollection18, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission20);
    ldapRealm0.checkPermissions(principalCollection9, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission20);
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory24 = ldapRealm0.getContextFactory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "cn"+ "'", str4.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory24);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array12 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13, interpreterResultMessage_array12);
    paragraphListenerImpl10.onOutputUpdateAll(paragraph11, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13);
    org.apache.zeppelin.scheduler.Job job16 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onProgressUpdate(job16, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph2 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph2, paragraph3);
    javax.servlet.ServletConfig servletConfig5 = notebookServer1.getServletConfig();
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi6 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = interpreterRestApi6.listSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig5);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, "");

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage13 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputUpdate(paragraph11, (int)'4', interpreterResultMessage13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.apache.zeppelin.socket.NotebookServer notebookServer11 = new org.apache.zeppelin.socket.NotebookServer();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.init((javax.servlet.ServletConfig)notebookServer11);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getAuthenticationCacheName();
    ldapRealm0.setAuthorizationCacheName("{\"message\":\"hi!\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.593"+ "'", str9.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.593"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage18 = null;
    notebookServer0.onLoad("org.apache.zeppelin.realm.LdapRealm_109", "org.apache.zeppelin.realm.LdapRealm_139", "{\n  \"message\": \"hi!\"\n}", heliumPackage18);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type23 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("groupOfNames", "org.apache.zeppelin.realm.LdapRealm_262", (int)(short)100, type23, "org.apache.zeppelin.realm.LdapRealm_75");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = heliumRestApi2.getVisualizationPackageOrder();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver5 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver5);
    java.lang.String str7 = ldapRealm0.getUserSearchAttributeTemplate();
    boolean b8 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setPermissionsByRole("anonymous");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.socket.NotebookServer notebookServer5 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer5.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    boolean b13 = notebookSocket12.isConnected();
    notebookServer5.unsubscribeNoteJobInfo(notebookSocket12);
    java.lang.String str15 = notebookSocket12.getUser();
    javax.servlet.http.HttpServletRequest httpServletRequest16 = notebookSocket12.getRequest();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onClose(notebookSocket12, (int)(short)1, "org.apache.zeppelin.realm.LdapRealm_447");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest16);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    java.lang.String str7 = ldapRealm0.getName();
    ldapRealm0.setUserSearchScope("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    org.apache.zeppelin.rest.GetUserList getUserList11 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.LdapRealm ldapRealm12 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm12.setUserSearchAttributeTemplate("hi!");
    ldapRealm12.setAuthorizationEnabled(false);
    ldapRealm12.setUserDnTemplate("subtree");
    java.util.List<java.lang.String> list_str19 = getUserList11.getRolesList(ldapRealm12);
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm20 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm20.setSearchBase("hi!");
    java.lang.Class class23 = activeDirectoryGroupRealm20.getAuthenticationTokenClass();
    java.util.List<java.lang.String> list_str25 = getUserList11.getUserList(activeDirectoryGroupRealm20, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    ldapRealm0.checkRoles(principalCollection10, (java.util.Collection<java.lang.String>)list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_599"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_599"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener4 = notebookServer0.getNotebookInformationListener();
    org.apache.zeppelin.socket.NotebookServer notebookServer5 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer5.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph11 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
    notebookServer5.broadcastParagraphs(map_str_paragraph11, paragraph12);
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener16 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket17 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest14, "subtree", notebookSocketListener16);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint18 = notebookSocket17.getRemote();
    notebookServer5.unsubscribeNoteJobInfo(notebookSocket17);
    org.apache.zeppelin.notebook.socket.Message message20 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.saveInterpreterBindings(notebookSocket17, message20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint18);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = notebookRestApi0.registerCronJob("org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", "member");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchAttributeTemplate();
    java.lang.String str11 = ldapRealm7.getUserSearchAttributeName();
    boolean b12 = ldapRealm7.isAuthorizationCachingEnabled();
    boolean b13 = ldapRealm7.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher14 = ldapRealm7.getCredentialsMatcher();
    ldapRealm0.setCredentialsMatcher(credentialsMatcher14);
    org.apache.shiro.subject.PrincipalCollection principalCollection16 = null;
    org.apache.shiro.authz.Permission permission17 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection16, permission17);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher14);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph15 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph15, paragraph16);
    org.apache.zeppelin.notebook.Note note18 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener19 = notebookServer0.getParagraphJobListener(note18);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = notebookServer0.getInitParameter("org.apache.zeppelin.realm.LdapRealm.authenticationCache.408");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener19);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("(.*)");
    java.lang.String str2 = forbiddenException1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.zeppelin.rest.exception.ForbiddenException"+ "'", str2.equals("org.apache.zeppelin.rest.exception.ForbiddenException"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = heliumRestApi2.getVisualizationPackageOrder("org.apache.zeppelin.realm.LdapRealm_189");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array12 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13, interpreterResultMessage_array12);
    paragraphListenerImpl10.onOutputUpdateAll(paragraph11, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13);
    org.apache.zeppelin.scheduler.Job job16 = null;
    org.apache.zeppelin.scheduler.Job.Status status17 = null;
    org.apache.zeppelin.scheduler.Job.Status status18 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.afterStatusChange(job16, status17, status18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchFilter("");
    ldapRealm0.setCachingEnabled(true);
    ldapRealm0.setUserLowerCase(true);
    java.lang.String str10 = ldapRealm0.getUserSearchFilter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer3 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer3.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph9 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
    notebookServer3.broadcastParagraphs(map_str_paragraph9, paragraph10);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi12 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager2, notebookServer3);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_75", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer3);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer3.onOutputClear("anonymous", "anonymous");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    boolean b4 = notebookSocket3.isConnected();
    boolean b5 = notebookSocket3.isNotConnected();
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException6 = new org.apache.zeppelin.rest.exception.BadRequestException();
    java.lang.Throwable[] throwable_array7 = badRequestException6.getSuppressed();
    notebookSocket3.onWebSocketError((java.lang.Throwable)badRequestException6);
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketText("member");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array7);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchFilter("");
    ldapRealm0.setCachingEnabled(true);
    ldapRealm0.setUserLowerCase(true);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver10 = ldapRealm0.getPermissionResolver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver10);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    javax.ws.rs.core.Response.Status status6 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array9 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo10 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, interpreterInfo_array9);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList13 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, false);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo14 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status6, (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList16 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.rest.exception.NotFoundException", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, true);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList18 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "org.apache.zeppelin.realm.LdapRealm_306", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, true);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList20 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm_187", "org.apache.zeppelin.realm.LdapRealm_229", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo10, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.broadcastUpdateNoteJobInfo((long)100);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", 10, "org.apache.zeppelin.realm.LdapRealm_187", "org.apache.zeppelin.realm.LdapRealm_256");
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer16 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket17 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest14, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer16);
    boolean b18 = notebookSocket17.isNotConnected();
    notebookSocket17.setUser("org.apache.zeppelin.realm.LdapRealm_267");
    org.apache.zeppelin.notebook.socket.Message message21 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.saveInterpreterBindings(notebookSocket17, message21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = credentialRestApi1.getCredentials("org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    java.lang.String str2 = notFoundException1.toString();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException3 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)notFoundException1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.zeppelin.rest.exception.NotFoundException"+ "'", str2.equals("org.apache.zeppelin.rest.exception.NotFoundException"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    ldapRealm2.setAuthenticationCacheName("org.apache.zeppelin.realm.LdapRealm_205");
    java.lang.String str11 = ldapRealm2.getUserSearchAttributeTemplate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response7 = heliumRestApi2.getSinglePackageInfo("org.apache.zeppelin.realm.LdapRealm_229");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    org.apache.zeppelin.rest.NotebookResponse notebookResponse1 = new org.apache.zeppelin.rest.NotebookResponse("org.apache.zeppelin.realm.LdapRealm_205");

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    org.apache.zeppelin.realm.LdapGroupRealm ldapGroupRealm0 = new org.apache.zeppelin.realm.LdapGroupRealm();
    javax.naming.ldap.LdapContext ldapContext2 = null;
    java.util.Set<java.lang.String> set_str4 = ldapGroupRealm0.getRoleNamesForUser("org.apache.zeppelin.realm.LdapRealm_47", ldapContext2, "org.apache.zeppelin.realm.LdapRealm_262");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str4);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isCachingEnabled();
    ldapRealm0.setUserSearchAttributeName("org.apache.zeppelin.rest.exception.NotFoundException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm0.setUserLowerCase(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer3 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket4 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest1, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer3);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi5 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer3);
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    ldapRealm7.setAuthorizationEnabled(false);
    ldapRealm7.setAuthenticationCachingEnabled(false);
    ldapRealm7.setAuthenticationCachingEnabled(false);
    org.apache.zeppelin.realm.LdapRealm ldapRealm16 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str17 = ldapRealm16.getListRoles();
    ldapRealm7.setRolesByGroup(map_str_str17);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer3.onMetaInfosReceived("", map_str_str17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str17);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setMemberAttribute("subtree");
    ldapRealm0.setUserSearchAttributeTemplate("subtree");
    boolean b10 = ldapRealm0.isAuthorizationEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph15 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph15, paragraph16);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage21 = null;
    notebookServer0.onLoad("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm_256", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", heliumPackage21);
    javax.servlet.http.HttpServletRequest httpServletRequest23 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer25 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket26 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest23, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer25);
    org.apache.zeppelin.notebook.socket.Message message27 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.saveInterpreterBindings(notebookSocket26, message27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher5 = null;
    ldapRealm0.setCredentialsMatcher(credentialsMatcher5);
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm_47");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setUserSearchScope("org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str5 = ldapRealm0.getName();
    boolean b6 = ldapRealm0.isAuthenticationCachingEnabled();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str7 = ldapRealm0.getPermissionsByRole();
    java.lang.String str8 = ldapRealm0.getGroupSearchScope();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_623"+ "'", str5.equals("org.apache.zeppelin.realm.LdapRealm_623"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "subtree"+ "'", str8.equals("subtree"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    org.apache.zeppelin.rest.message.NewParagraphRequest newParagraphRequest0 = new org.apache.zeppelin.rest.message.NewParagraphRequest();
    java.util.HashMap<java.lang.String,java.lang.Object> hashmap_str_obj1 = newParagraphRequest0.getConfig();
    java.util.HashMap<java.lang.String,java.lang.Object> hashmap_str_obj2 = newParagraphRequest0.getConfig();
    java.lang.Double d3 = newParagraphRequest0.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_str_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d3);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = notebookRepoSettingsRequest0.settings;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = ldapRealm2.getListRoles();
    notebookRepoSettingsRequest0.settings = map_str_str3;
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = notebookRepoSettingsRequest0.settings;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str5);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response7 = interpreterRestApi5.getSetting("org.apache.zeppelin.realm.LdapRealm_139");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = interpreterRestApi5.listSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener9 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest7, "subtree", notebookSocketListener9);
    notebookServer0.onMessage(notebookSocket10, "org.apache.zeppelin.realm.LdapRealm_187");
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = notebookServer0.doWebSocketConnect(httpServletRequest13, "org.apache.zeppelin.realm.LdapRealm_175");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener16 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.ServletConfig servletConfig17 = notebookServer0.getServletConfig();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig17);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response9 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109");
    javax.ws.rs.core.Response response11 = interpreterRestApi7.getSetting("org.apache.zeppelin.realm.LdapRealm_133");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response13 = interpreterRestApi7.removeSetting("org.apache.zeppelin.realm.LdapRealm_152");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response11);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    ldapRealm2.setName("{\"message\":\"hi!\"}");
    ldapRealm2.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm_175");
    java.util.Map<java.lang.String,java.lang.String> map_str_str13 = ldapRealm2.getRolesByGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str13);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setUserLowerCase(false);
    boolean b9 = ldapRealm0.isAuthenticationCachingEnabled();
    ldapRealm0.setPagingSize(10);
    boolean b12 = ldapRealm0.isCachingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm6 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm6.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver9 = ldapRealm6.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str15, str_array14);
    boolean[] b_array17 = ldapRealm6.hasRoles(principalCollection10, (java.util.List<java.lang.String>)arraylist_str15);
    boolean[] b_array18 = ldapRealm0.hasRoles(principalCollection5, (java.util.List<java.lang.String>)arraylist_str15);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo19 = null;
    ldapRealm0.setAuthorizationCache(cache_obj_authorizationInfo19);
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher21 = ldapRealm0.getCredentialsMatcher();
    ldapRealm0.setGroupSearchScope("{\"message\":\"member\"}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher21);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "org.apache.zeppelin.realm.LdapRealm_265");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response8 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_205", "groupOfNames");
    javax.ws.rs.core.Response response11 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_265");
    javax.ws.rs.core.Response response15 = heliumRestApi2.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm_509", "org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response18 = heliumRestApi2.suggest("org.apache.zeppelin.realm.LdapRealm_558", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response15);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    ldapRealm0.setPagingSize((int)' ');
    ldapRealm0.setPermissionsByRole("org.apache.zeppelin.rest.exception.NotFoundException");
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher9 = ldapRealm0.getCredentialsMatcher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher9);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory1 = activeDirectoryGroupRealm0.getLdapContextFactory();
    activeDirectoryGroupRealm0.setPrincipalSuffix("(.*)");
    activeDirectoryGroupRealm0.setSystemUsername("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    activeDirectoryGroupRealm0.setHadoopSecurityCredentialPath("cn");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory1);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array13 = ldapRealm0.isPermitted(principalCollection10, str_array12);
    java.lang.String str14 = ldapRealm0.getSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response10 = heliumRestApi2.enablePackage("org.apache.zeppelin.realm.LdapRealm_133", "person");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener6 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket7 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest4, "subtree", notebookSocketListener6);
    boolean b8 = notebookSocket7.isConnected();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket7);
    notebookServer0.broadcastUpdateNoteJobInfo((long)' ');
    org.apache.zeppelin.display.AngularObject angularObject13 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_371", angularObject13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = notebookServer1.doWebSocketConnect(httpServletRequest8, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = null;
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo12 = null;
    java.util.HashSet<java.lang.String> hashset_str13 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.unicastNoteList(notebookSocket11, authenticationInfo12, hashset_str13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket10);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "org.apache.zeppelin.realm.LdapRealm_300");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array2 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo3 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo3, interpreterInfo_array2);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList6 = new org.apache.zeppelin.types.InterpreterSettingsList("(.*)", "org.apache.zeppelin.realm.LdapRealm_187", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo3, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    org.apache.zeppelin.rest.NotebookResponse notebookResponse1 = new org.apache.zeppelin.rest.NotebookResponse("org.apache.zeppelin.realm.LdapRealm.authorizationCache.510");

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
    activeDirectoryGroupRealm0.setSearchBase("cn");
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_189");

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = notebookServer1.doWebSocketConnect(httpServletRequest8, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator11 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer1);
    org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest servletUpgradeRequest12 = null;
    org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse servletUpgradeResponse13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj14 = notebookWebSocketCreator11.createWebSocket(servletUpgradeRequest12, servletUpgradeResponse13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket10);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
    activeDirectoryGroupRealm0.setSearchBase("cn");
    activeDirectoryGroupRealm0.setSystemUsername("");
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory9 = activeDirectoryGroupRealm0.getLdapContextFactory();
    org.apache.shiro.cache.CacheManager cacheManager10 = activeDirectoryGroupRealm0.getCacheManager();
    activeDirectoryGroupRealm0.setHadoopSecurityCredentialPath("org.apache.zeppelin.realm.LdapRealm.authenticationCache.451");
    activeDirectoryGroupRealm0.setHadoopSecurityCredentialPath("org.apache.zeppelin.realm.LdapRealm.authenticationCache.439");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cacheManager10);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    ldapRealm0.onLogout(principalCollection7);
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm10 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm10.setUserSearchAttributeTemplate("hi!");
    java.lang.String str13 = ldapRealm10.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    java.util.Collection collection15 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b16 = ldapRealm10.isPermittedAll(principalCollection14, (java.util.Collection<org.apache.shiro.authz.Permission>)collection15);
    boolean b17 = ldapRealm10.isGroupSearchEnableMatchingRuleInChain();
    org.apache.shiro.subject.PrincipalCollection principalCollection18 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm19 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm19.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver22 = ldapRealm19.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection23 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm24 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm24.setUserSearchAttributeTemplate("hi!");
    ldapRealm24.setAuthorizationEnabled(false);
    ldapRealm24.setAuthenticationCachingEnabled(false);
    ldapRealm24.setUserSearchBase("hi!");
    java.lang.String str33 = ldapRealm24.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection34 = null;
    java.lang.String[] str_array36 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array37 = ldapRealm24.isPermitted(principalCollection34, str_array36);
    boolean[] b_array38 = ldapRealm19.isPermitted(principalCollection23, str_array36);
    boolean[] b_array39 = ldapRealm10.isPermitted(principalCollection18, str_array36);
    boolean[] b_array40 = ldapRealm0.isPermitted(principalCollection9, str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array40);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm_371", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", (int)'a', "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer14 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest12, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer14);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint16 = notebookSocket15.getRemote();
    java.lang.String str17 = notebookSocket15.getProtocol();
    org.eclipse.jetty.websocket.api.Session session18 = notebookSocket15.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException20 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket15.onWebSocketError((java.lang.Throwable)forbiddenException20);
    notebookServer0.onMessage(notebookSocket15, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.451");
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket15.send("{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "cn"+ "'", str17.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session18);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager2 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer3 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer3.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph9 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
    notebookServer3.broadcastParagraphs(map_str_paragraph9, paragraph10);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi12 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager2, notebookServer3);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_75", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer3);
    java.lang.String str14 = notebookSocket13.getProtocol();
    boolean b15 = notebookSocket13.isConnected();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_75"+ "'", str14.equals("org.apache.zeppelin.realm.LdapRealm_75"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm10 = jsonresponse_jndiLdapRealm8.setPretty(false);
    javax.ws.rs.core.Response.Status status11 = jsonresponse_jndiLdapRealm8.getCode();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm13 = jsonresponse_jndiLdapRealm8.setPretty(false);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response14 = jsonresponse_jndiLdapRealm8.build();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jndiLdapRealm10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jndiLdapRealm13);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array12 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13, interpreterResultMessage_array12);
    paragraphListenerImpl10.onOutputUpdateAll(paragraph11, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13);
    org.apache.zeppelin.scheduler.Job job16 = null;
    org.apache.zeppelin.scheduler.Job.Status status17 = null;
    org.apache.zeppelin.scheduler.Job.Status status18 = null;
    paragraphListenerImpl10.beforeStatusChange(job16, status17, status18);
    org.apache.zeppelin.scheduler.Job job20 = null;
    org.apache.zeppelin.scheduler.Job.Status status21 = null;
    org.apache.zeppelin.scheduler.Job.Status status22 = null;
    paragraphListenerImpl10.beforeStatusChange(job20, status21, status22);
    org.apache.zeppelin.notebook.Paragraph paragraph24 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage26 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputUpdate(paragraph24, 0, interpreterResultMessage26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener12 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest10, "subtree", notebookSocketListener12);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint14 = notebookSocket13.getRemote();
    notebookServer1.unsubscribeNoteJobInfo(notebookSocket13);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi16 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response18 = interpreterRestApi16.getSetting("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response18);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo2 = null;
    org.apache.zeppelin.realm.LdapGroupRealm ldapGroupRealm3 = new org.apache.zeppelin.realm.LdapGroupRealm();
    javax.naming.ldap.LdapContext ldapContext5 = null;
    java.util.Set<java.lang.String> set_str7 = ldapGroupRealm3.getRoleNamesForUser("", ldapContext5, "");
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str8 = notebookServer0.generateNotesInfo(false, authenticationInfo2, set_str7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str7);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint13 = notebookSocket12.getRemote();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket12);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph15 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph15, paragraph16);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage21 = null;
    notebookServer0.onLoad("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm_256", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", heliumPackage21);
    javax.servlet.ServletConfig servletConfig23 = notebookServer0.getServletConfig();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig23);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    boolean b9 = notebookServer0.checkOrigin(httpServletRequest7, "cn");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.destroy();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm0.setUserDnTemplate("");
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm11 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm11.setUserSearchAttributeTemplate("hi!");
    ldapRealm11.setAuthorizationEnabled(false);
    ldapRealm11.setAuthenticationCachingEnabled(false);
    ldapRealm11.setUserSearchBase("hi!");
    java.lang.String str20 = ldapRealm11.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection21 = null;
    java.lang.String[] str_array23 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array24 = ldapRealm11.isPermitted(principalCollection21, str_array23);
    boolean[] b_array25 = ldapRealm0.isPermitted(principalCollection10, str_array23);
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver26 = ldapRealm0.getRolePermissionResolver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver26);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    org.apache.zeppelin.rest.exception.BadRequestException badRequestException1 = new org.apache.zeppelin.rest.exception.BadRequestException("org.apache.zeppelin.realm.LdapRealm_447");

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    boolean b4 = notebookSocket3.isNotConnected();
    notebookSocket3.onWebSocketText("org.apache.zeppelin.realm.LdapRealm_93");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getName();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver10 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver10);
    ldapRealm0.setGroupSearchBase("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_654"+ "'", str9.equals("org.apache.zeppelin.realm.LdapRealm_654"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer10 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest8, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer10);
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer14 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest12, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer14);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint16 = notebookSocket15.getRemote();
    java.lang.String str17 = notebookSocket15.getProtocol();
    org.eclipse.jetty.websocket.api.Session session18 = notebookSocket15.getSession();
    notebookSocket15.onWebSocketText("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    byte[] byte_array23 = new byte[] { (byte)1, (byte)-1 };
    notebookSocket15.onWebSocketBinary(byte_array23, 0, (int)(short)0);
    notebookSocket11.onWebSocketBinary(byte_array23, (int)' ', (int)'#');
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.onOpen(notebookSocket11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "cn"+ "'", str17.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm0.setUserDnTemplate("");
    ldapRealm0.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm12 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm12.setSearchBase("hi!");
    activeDirectoryGroupRealm12.setSearchBase("");
    activeDirectoryGroupRealm12.init();
    activeDirectoryGroupRealm12.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory20 = activeDirectoryGroupRealm12.getLdapContextFactory();
    ldapRealm0.setContextFactory(ldapContextFactory20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory20);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi8 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl10 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer1, note9);
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array12 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13, interpreterResultMessage_array12);
    paragraphListenerImpl10.onOutputUpdateAll(paragraph11, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13);
    org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputAppend(paragraph16, (int)' ', "org.apache.zeppelin.realm.LdapRealm_265");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    ldapRealm1.setAuthorizationEnabled(false);
    ldapRealm1.setUserDnTemplate("subtree");
    java.util.List<java.lang.String> list_str8 = getUserList0.getRolesList(ldapRealm1);
    org.apache.shiro.realm.text.IniRealm iniRealm9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str10 = getUserList0.getRolesList(iniRealm9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject4 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener12 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest10, "subtree", notebookSocketListener12);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint14 = notebookSocket13.getRemote();
    org.eclipse.jetty.websocket.api.Session session15 = notebookSocket13.getSession();
    org.eclipse.jetty.websocket.api.Session session16 = notebookSocket13.getSession();
    org.apache.zeppelin.notebook.socket.Message message17 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.getInterpreterBindings(notebookSocket13, message17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session16);

  }

}
