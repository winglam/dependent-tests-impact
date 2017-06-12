
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test01"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    java.lang.String str7 = ldapRealm0.getSearchBase();
    ldapRealm0.setSearchBase("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");
    java.lang.String str10 = ldapRealm0.getUserSearchAttributeName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test02"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response12 = interpreterRestApi10.getSetting("{\n  \"message\": \"hi!\"\n}");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response14 = interpreterRestApi10.listInterpreter("org.apache.zeppelin.realm.LdapRealm.authenticationCache.379");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response12);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test03"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener7 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener10 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest8, "subtree", notebookSocketListener10);
    notebookServer1.onMessage(notebookSocket11, "org.apache.zeppelin.realm.LdapRealm_187");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi14 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response17 = interpreterRestApi14.getMetaInfo(httpServletRequest15, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.593");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test04"); }

    java.util.Properties properties0 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array1 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency2 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency2, dependency_array1);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption4 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest5 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties0, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency2, interpreterOption4);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = updateInterpreterSettingRequest5.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = updateInterpreterSettingRequest5.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption8 = updateInterpreterSettingRequest5.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption9 = updateInterpreterSettingRequest5.getOption();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test05"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    notebookServer0.broadcastUpdateNoteJobInfo((-1L));
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    org.apache.zeppelin.notebook.Note note12 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl13 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer0, note12);
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer16 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject18 = null;
    notebookServer16.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject18);
    org.apache.zeppelin.display.AngularObject angularObject21 = null;
    notebookServer16.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject21);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket23 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest14, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer16);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init((javax.servlet.ServletConfig)notebookServer16);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test06"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = ldapRealm0.getRolesByGroup();
    boolean b8 = ldapRealm0.isAuthorizationEnabled();
    ldapRealm0.setAuthorizationCacheName("org.apache.zeppelin.realm.LdapRealm_578");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test07"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    ldapRealm0.setPagingSize((int)' ');
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    ldapRealm7.setAuthorizationEnabled(false);
    ldapRealm7.setAuthenticationCachingEnabled(false);
    ldapRealm7.setUserSearchBase("hi!");
    java.lang.String str16 = ldapRealm7.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory17 = ldapRealm7.getContextFactory();
    ldapRealm0.setContextFactory(ldapContextFactory17);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo19 = ldapRealm0.getAuthorizationCache();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1208"+ "'", str16.equals("org.apache.zeppelin.realm.LdapRealm_1208"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo19);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test08"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response9 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109");
    javax.ws.rs.core.Response response11 = interpreterRestApi7.removeRepository("{\n  \"message\": \"hi!\"\n}");
    javax.ws.rs.core.Response response13 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response14 = interpreterRestApi7.listSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response13);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test09"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener7 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi8 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener9 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test10"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.545", (int)' ', "");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener12 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph13 = null;
    notebookInformationListener12.onParagraphRemove(paragraph13);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test11"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener7 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket8 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest5, "subtree", notebookSocketListener7);
    boolean b9 = notebookSocket8.isConnected();
    boolean b10 = notebookSocket8.isConnected();
    notebookServer0.onMessage(notebookSocket8, "org.apache.zeppelin.realm.LdapRealm_205");
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm_273", "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache", (int)'4', "org.apache.zeppelin.realm.LdapRealm_704");
    org.apache.zeppelin.display.AngularObject angularObject19 = null;
    notebookServer0.onUpdate("org.apache.zeppelin.realm.LdapRealm_447", angularObject19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test12"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm3 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory4 = activeDirectoryGroupRealm3.getLdapContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory4);
    activeDirectoryGroupRealm0.setSystemUsername("subtree");
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    activeDirectoryGroupRealm0.onLogout(principalCollection8);
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    boolean b12 = activeDirectoryGroupRealm0.isPermitted(principalCollection10, "org.apache.zeppelin.realm.LdapRealm_262");
    org.apache.shiro.cache.CacheManager cacheManager13 = null;
    activeDirectoryGroupRealm0.setCacheManager(cacheManager13);
    org.apache.shiro.subject.PrincipalCollection principalCollection15 = null;
    org.apache.shiro.authz.Permission[] permission_array16 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission17 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission17, permission_array16);
    boolean[] b_array19 = activeDirectoryGroupRealm0.isPermitted(principalCollection15, (java.util.List<org.apache.shiro.authz.Permission>)arraylist_permission17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array19);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test13"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    pamRealm0.setService("");
    pamRealm0.setAuthorizationCachingEnabled(true);
    pamRealm0.setService("org.apache.zeppelin.realm.LdapRealm_578");
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    pamRealm0.onLogout(principalCollection7);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test14"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer4 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer4.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject6);
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer4.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject9);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest2, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer4);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer4);
    org.apache.zeppelin.notebook.Note note13 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener14 = notebookServer4.getParagraphJobListener(note13);
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket17 = notebookServer4.doWebSocketConnect(httpServletRequest15, "");
    javax.servlet.ServletRequest servletRequest18 = null;
    javax.servlet.ServletResponse servletResponse19 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer4.service(servletRequest18, servletResponse19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket17);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test15"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response9 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109");
    javax.ws.rs.core.Response response11 = interpreterRestApi7.removeRepository("{\n  \"message\": \"hi!\"\n}");
    javax.ws.rs.core.Response response13 = interpreterRestApi7.removeRepository("org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response13);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test16"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test17"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setMemberAttribute("subtree");
    ldapRealm0.setUserSearchAttributeTemplate("subtree");
    java.util.Map<java.lang.String,java.lang.String> map_str_str10 = ldapRealm0.getListRoles();
    ldapRealm0.setPrincipalRegex("org.apache.zeppelin.realm.LdapRealm.authenticationCache.922");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str10);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test18"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator8 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer1);
    java.util.Map<java.lang.String,java.lang.String> map_str_str12 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.onParaInfosReceived("org.apache.zeppelin.realm.LdapRealm.authenticationCache.863", "org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.rest.exception.NotFoundException", map_str_str12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test19"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.545", (int)' ', "");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener12 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Note note13 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener12.onNoteRemove(note13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test20"); }

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
    java.lang.String str15 = ldapRealm1.getGroupSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test21"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    ldapRealm1.setAuthorizationEnabled(false);
    ldapRealm1.setUserDnTemplate("subtree");
    java.util.List<java.lang.String> list_str8 = getUserList0.getRolesList(ldapRealm1);
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm9 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm9.setSearchBase("hi!");
    java.lang.Class class12 = activeDirectoryGroupRealm9.getAuthenticationTokenClass();
    java.util.List<java.lang.String> list_str14 = getUserList0.getUserList(activeDirectoryGroupRealm9, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    org.apache.shiro.subject.PrincipalCollection principalCollection15 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm16 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm16.setUserSearchAttributeTemplate("hi!");
    java.lang.String str19 = ldapRealm16.getUserSearchAttributeTemplate();
    java.lang.String str20 = ldapRealm16.getUserSearchAttributeName();
    boolean b21 = ldapRealm16.isAuthorizationCachingEnabled();
    boolean b22 = ldapRealm16.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher23 = ldapRealm16.getCredentialsMatcher();
    ldapRealm16.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_75");
    ldapRealm16.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    ldapRealm16.setGroupIdAttribute("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    java.lang.String str30 = ldapRealm16.getUserSearchFilter();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo31 = ldapRealm16.getAuthenticationCache();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver32 = ldapRealm16.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection33 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm34 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm34.setUserSearchAttributeTemplate("hi!");
    java.lang.String str37 = ldapRealm34.getUserSearchAttributeTemplate();
    java.lang.String str38 = ldapRealm34.getUserSearchAttributeName();
    boolean b39 = ldapRealm34.isAuthorizationCachingEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection40 = null;
    javax.ws.rs.core.Response.Status status41 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm43 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm43.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver46 = ldapRealm43.getPermissionResolver();
    java.lang.String str47 = ldapRealm43.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection48 = null;
    java.util.List<java.lang.String> list_str49 = null;
    boolean[] b_array50 = ldapRealm43.hasRoles(principalCollection48, list_str49);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo51 = ldapRealm43.getAuthorizationCache();
    org.apache.shiro.subject.PrincipalCollection principalCollection52 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm53 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm53.setUserSearchAttributeTemplate("hi!");
    java.lang.String str56 = ldapRealm53.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection57 = null;
    java.util.Collection collection58 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b59 = ldapRealm53.isPermittedAll(principalCollection57, (java.util.Collection<org.apache.shiro.authz.Permission>)collection58);
    java.util.Map<java.lang.String,java.lang.String> map_str_str60 = ldapRealm53.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection61 = null;
    org.apache.shiro.authz.Permission[] permission_array62 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission63 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission63, permission_array62);
    ldapRealm53.checkPermissions(principalCollection61, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission63);
    ldapRealm43.checkPermissions(principalCollection52, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission63);
    org.apache.zeppelin.server.JsonResponse<java.util.ArrayList<org.apache.shiro.authz.Permission>> jsonresponse_arraylist_permission67 = new org.apache.zeppelin.server.JsonResponse<java.util.ArrayList<org.apache.shiro.authz.Permission>>(status41, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245", arraylist_permission63);
    boolean b68 = ldapRealm34.isPermittedAll(principalCollection40, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission63);
    boolean[] b_array69 = ldapRealm16.isPermitted(principalCollection33, (java.util.List<org.apache.shiro.authz.Permission>)arraylist_permission63);
    boolean[] b_array70 = activeDirectoryGroupRealm9.isPermitted(principalCollection15, (java.util.List<org.apache.shiro.authz.Permission>)arraylist_permission63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_75"+ "'", str30.equals("org.apache.zeppelin.realm.LdapRealm_75"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "cn"+ "'", str47.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array70);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test22"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
    org.apache.zeppelin.realm.LdapRealm ldapRealm8 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm8.setUserSearchAttributeTemplate("hi!");
    java.lang.String str11 = ldapRealm8.getUserSearchAttributeTemplate();
    ldapRealm8.setUserObjectClass("hi!");
    boolean b14 = ldapRealm8.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm15 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm15.setUserSearchAttributeTemplate("hi!");
    ldapRealm15.setAuthorizationEnabled(false);
    ldapRealm15.setAuthenticationCachingEnabled(false);
    ldapRealm15.setUserSearchBase("hi!");
    java.lang.String str24 = ldapRealm15.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo25 = null;
    ldapRealm15.setAuthorizationCache(cache_obj_authorizationInfo25);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver27 = ldapRealm15.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory28 = ldapRealm15.getContextFactory();
    ldapRealm8.setContextFactory(ldapContextFactory28);
    ldapRealm0.setContextFactory(ldapContextFactory28);
    ldapRealm0.setSearchBase("subtree");
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo33 = ldapRealm0.getAuthenticationCache();
    org.apache.zeppelin.realm.LdapRealm ldapRealm34 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm34.setUserSearchAttributeTemplate("hi!");
    java.lang.String str37 = ldapRealm34.getUserSearchAttributeTemplate();
    java.lang.String str38 = ldapRealm34.getUserSearchAttributeName();
    boolean b39 = ldapRealm34.isAuthorizationCachingEnabled();
    boolean b40 = ldapRealm34.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher41 = ldapRealm34.getCredentialsMatcher();
    ldapRealm34.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_75");
    ldapRealm34.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    ldapRealm34.setGroupIdAttribute("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    java.lang.String str48 = ldapRealm34.getUserSearchFilter();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo49 = ldapRealm34.getAuthenticationCache();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver50 = ldapRealm34.getPermissionResolver();
    ldapRealm0.setPermissionResolver(permissionResolver50);
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_75"+ "'", str48.equals("org.apache.zeppelin.realm.LdapRealm_75"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver50);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test23"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    java.lang.String str4 = ldapRealm1.getUserSearchAttributeTemplate();
    java.lang.String str5 = ldapRealm1.getUserSearchAttributeName();
    java.lang.String str6 = ldapRealm1.getName();
    boolean b7 = ldapRealm1.isAuthenticationCachingEnabled();
    ldapRealm1.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_93");
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.Realm> jsonresponse_realm10 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.Realm>(status0, (org.apache.shiro.realm.Realm)ldapRealm1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1225"+ "'", str6.equals("org.apache.zeppelin.realm.LdapRealm_1225"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test24"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("org.apache.zeppelin.realm.LdapRealm_152");
    java.lang.String str2 = forbiddenException1.toString();
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException4 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)forbiddenException1, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.zeppelin.rest.exception.ForbiddenException"+ "'", str2.equals("org.apache.zeppelin.rest.exception.ForbiddenException"));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test25"); }

    org.apache.zeppelin.rest.exception.BadRequestException badRequestException1 = new org.apache.zeppelin.rest.exception.BadRequestException("");

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test26"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    zeppelinHubRealm0.setZeppelinhubUrl("");
    org.apache.shiro.subject.PrincipalCollection principalCollection3 = null;
    java.lang.String[] str_array4 = new java.lang.String[] {  };
    zeppelinHubRealm0.checkPermissions(principalCollection3, str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test27"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync1 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject4 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject7);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi9 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync1, notebookServer2);
    org.apache.zeppelin.notebook.Note note10 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl11 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer2, note10);
    org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array13 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage14 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage14, interpreterResultMessage_array13);
    paragraphListenerImpl11.onOutputUpdateAll(paragraph12, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage14);
    org.apache.zeppelin.scheduler.Job job17 = null;
    org.apache.zeppelin.scheduler.Job.Status status18 = null;
    org.apache.zeppelin.scheduler.Job.Status status19 = null;
    paragraphListenerImpl11.beforeStatusChange(job17, status18, status19);
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.scheduler.JobListener> jsonresponse_jobListener21 = new org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.scheduler.JobListener>(status0, (org.apache.zeppelin.scheduler.JobListener)paragraphListenerImpl11);
    org.apache.zeppelin.notebook.Paragraph paragraph22 = null;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage23 = null;
    paragraphListenerImpl11.onOutputUpdateAll(paragraph22, list_interpreterResultMessage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test28"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph2 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph2, paragraph3);
    javax.servlet.ServletConfig servletConfig5 = notebookServer1.getServletConfig();
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi6 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = interpreterRestApi6.removeSetting("org.apache.zeppelin.realm.LdapRealm_1208");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig5);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test29"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isCachingEnabled();
    org.apache.shiro.authc.AuthenticationToken authenticationToken8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo9 = ldapRealm0.getAuthenticationInfo(authenticationToken8);
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
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test30"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setAuthenticationCacheName("");
    org.apache.zeppelin.realm.LdapRealm ldapRealm8 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm8.setUserSearchAttributeTemplate("hi!");
    java.lang.String str11 = ldapRealm8.getUserSearchAttributeTemplate();
    ldapRealm8.setUserObjectClass("hi!");
    boolean b14 = ldapRealm8.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm15 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm15.setUserSearchAttributeTemplate("hi!");
    ldapRealm15.setAuthorizationEnabled(false);
    ldapRealm15.setAuthenticationCachingEnabled(false);
    ldapRealm15.setUserSearchBase("hi!");
    java.lang.String str24 = ldapRealm15.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo25 = null;
    ldapRealm15.setAuthorizationCache(cache_obj_authorizationInfo25);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver27 = ldapRealm15.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory28 = ldapRealm15.getContextFactory();
    ldapRealm8.setContextFactory(ldapContextFactory28);
    ldapRealm0.setContextFactory(ldapContextFactory28);
    java.lang.String str31 = ldapRealm0.getSearchBase();
    ldapRealm0.setGroupSearchBase("hi!");
    boolean b34 = ldapRealm0.getUserLowerCase();
    org.apache.shiro.authc.AuthenticationToken authenticationToken35 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo36 = ldapRealm0.getAuthenticationInfo(authenticationToken35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test31"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    java.lang.String str7 = ldapRealm0.getSearchBase();
    ldapRealm0.setSearchBase("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");
    ldapRealm0.setMemberAttribute("org.apache.zeppelin.realm.LdapRealm_558");
    org.apache.shiro.subject.PrincipalCollection principalCollection12 = null;
    org.apache.zeppelin.rest.GetUserList getUserList13 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm14 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm14.setSearchBase("hi!");
    activeDirectoryGroupRealm14.setSearchBase("");
    activeDirectoryGroupRealm14.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm20 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm20.setUserSearchAttributeTemplate("hi!");
    java.lang.String str23 = ldapRealm20.getUserSearchAttributeTemplate();
    java.lang.String str24 = ldapRealm20.getUserSearchAttributeName();
    boolean b25 = ldapRealm20.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm26 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str27 = ldapRealm26.getListRoles();
    ldapRealm20.setRolesByGroup(map_str_str27);
    activeDirectoryGroupRealm14.setGroupRolesMap(map_str_str27);
    java.util.List<java.lang.String> list_str31 = getUserList13.getUserList(activeDirectoryGroupRealm14, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.zeppelin.realm.LdapRealm ldapRealm32 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str33 = ldapRealm32.getListRoles();
    java.lang.String str34 = ldapRealm32.getGroupSearchBase();
    java.util.List<java.lang.String> list_str36 = getUserList13.getUserList(ldapRealm32, "org.apache.zeppelin.realm.LdapRealm_47");
    org.apache.shiro.subject.PrincipalCollection principalCollection37 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm38 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm38.setUserSearchAttributeTemplate("hi!");
    java.lang.String str41 = ldapRealm38.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection42 = null;
    java.util.Collection collection43 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b44 = ldapRealm38.isPermittedAll(principalCollection42, (java.util.Collection<org.apache.shiro.authz.Permission>)collection43);
    java.util.Map<java.lang.String,java.lang.String> map_str_str45 = ldapRealm38.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection46 = null;
    org.apache.shiro.authz.Permission[] permission_array47 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission48 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission48, permission_array47);
    ldapRealm38.checkPermissions(principalCollection46, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission48);
    boolean[] b_array51 = ldapRealm32.isPermitted(principalCollection37, (java.util.List<org.apache.shiro.authz.Permission>)arraylist_permission48);
    boolean b52 = ldapRealm0.isPermittedAll(principalCollection12, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test32"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    boolean b4 = notebookSocket3.isNotConnected();
    boolean b5 = notebookSocket3.isNotConnected();
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint6 = notebookSocket3.getRemote();
    org.eclipse.jetty.websocket.api.Session session7 = notebookSocket3.getSession();
    org.eclipse.jetty.websocket.api.Session session8 = notebookSocket3.getSession();
    java.lang.String str9 = notebookSocket3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test33"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response3 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response4 = heliumRestApi2.getAllPackageConfigs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test34"); }

    java.util.Properties properties0 = null;
    java.util.Properties properties1 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array2 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency3 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency3, dependency_array2);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption5 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest6 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties1, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency3, interpreterOption5);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest8 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties0, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency3, interpreterOption7);
    java.util.Properties properties9 = updateInterpreterSettingRequest8.getProperties();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency10 = updateInterpreterSettingRequest8.getDependencies();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(properties9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_dependency10);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test35"); }

    org.apache.zeppelin.rest.message.NewParagraphRequest newParagraphRequest0 = new org.apache.zeppelin.rest.message.NewParagraphRequest();
    java.util.HashMap<java.lang.String,java.lang.Object> hashmap_str_obj1 = newParagraphRequest0.getConfig();
    java.lang.String str2 = newParagraphRequest0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test36"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    java.lang.String str7 = ldapRealm0.getName();
    ldapRealm0.setSearchBase("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo10 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo10);
    boolean b12 = ldapRealm0.getUserLowerCase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1240"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_1240"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test37"); }

    org.apache.zeppelin.rest.message.RunParagraphWithParametersRequest runParagraphWithParametersRequest0 = new org.apache.zeppelin.rest.message.RunParagraphWithParametersRequest();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj1 = runParagraphWithParametersRequest0.getParams();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj2 = runParagraphWithParametersRequest0.getParams();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj3 = runParagraphWithParametersRequest0.getParams();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj4 = runParagraphWithParametersRequest0.getParams();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_obj4);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test38"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchFilter("");
    ldapRealm0.setGroupSearchEnableMatchingRuleInChain(false);
    java.lang.String str8 = ldapRealm0.getUserObjectClass();
    java.lang.String str9 = ldapRealm0.getAuthenticationCacheName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "person"+ "'", str8.equals("person"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.1241"+ "'", str9.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.1241"));

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test39"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    notebookServer1.onOutputAppend("org.apache.zeppelin.realm.LdapRealm_371", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", (int)'a', "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer15 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket16 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest13, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer15);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint17 = notebookSocket16.getRemote();
    java.lang.String str18 = notebookSocket16.getProtocol();
    org.eclipse.jetty.websocket.api.Session session19 = notebookSocket16.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException21 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket16.onWebSocketError((java.lang.Throwable)forbiddenException21);
    notebookServer1.onMessage(notebookSocket16, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.451");
    org.apache.zeppelin.notebook.Note note25 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener26 = notebookServer1.getParagraphJobListener(note25);
    javax.ws.rs.core.Response.Status status32 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array35 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo36 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo36, interpreterInfo_array35);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList39 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo36, false);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo40 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status32, (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo36);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList42 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.rest.exception.NotFoundException", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo36, true);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList44 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "org.apache.zeppelin.realm.LdapRealm_306", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo36, true);
    notebookServer1.broadcastInterpreterBindings("org.apache.zeppelin.realm.LdapRealm.authenticationCache.555", (java.util.List)arraylist_interpreterInfo36);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi46 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator47 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer1);
    notebookServer1.broadcastUpdateNoteJobInfo((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "cn"+ "'", str18.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test40"); }

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
    boolean b12 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    
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
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test41"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    boolean b8 = ldapRealm0.supports(authenticationToken7);
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm10 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str11 = null;
    activeDirectoryGroupRealm10.setGroupRolesMap(map_str_str11);
    org.apache.shiro.subject.PrincipalCollection principalCollection13 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm14 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm14.setUserSearchAttributeTemplate("hi!");
    ldapRealm14.setAuthorizationEnabled(false);
    ldapRealm14.setAuthenticationCachingEnabled(false);
    ldapRealm14.setUserSearchBase("hi!");
    java.lang.String str23 = ldapRealm14.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection24 = null;
    java.lang.String[] str_array26 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array27 = ldapRealm14.isPermitted(principalCollection24, str_array26);
    boolean[] b_array28 = activeDirectoryGroupRealm10.isPermitted(principalCollection13, str_array26);
    boolean[] b_array29 = ldapRealm0.isPermitted(principalCollection9, str_array26);
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver30 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array29);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test42"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("org.apache.zeppelin.realm.LdapRealm_1225");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test43"); }

    java.util.Properties properties0 = null;
    java.util.Properties properties1 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array2 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency3 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency3, dependency_array2);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption5 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest6 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties1, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency3, interpreterOption5);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = updateInterpreterSettingRequest6.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption8 = updateInterpreterSettingRequest6.getOption();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency9 = updateInterpreterSettingRequest6.getDependencies();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption10 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest11 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties0, list_dependency9, interpreterOption10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_dependency9);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test44"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.ServletConfig servletConfig8 = notebookServer1.getServletConfig();
    org.apache.zeppelin.display.AngularObject angularObject10 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_265", angularObject10);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage15 = null;
    notebookServer1.onLoad("{\"message\":\"hi!\"}", "org.apache.zeppelin.realm.LdapRealm_1042", "org.apache.zeppelin.realm.LdapRealm_1194", heliumPackage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig8);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test45"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setUserLowerCase(false);
    boolean b9 = ldapRealm0.isAuthenticationCachingEnabled();
    ldapRealm0.setPagingSize(10);
    org.apache.shiro.authc.AuthenticationToken authenticationToken12 = null;
    boolean b13 = ldapRealm0.supports(authenticationToken12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test46"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.1006", "org.apache.zeppelin.realm.LdapRealm_134", (int)(byte)0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.545");

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test47"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject4 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.notebook.Note note10 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener11 = notebookServer2.getParagraphJobListener(note10);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo12 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm13.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver16 = ldapRealm13.getPermissionResolver();
    boolean b17 = ldapRealm13.isAuthenticationCachingEnabled();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo18 = null;
    ldapRealm13.setAuthenticationCache(cache_obj_authenticationInfo18);
    org.apache.shiro.subject.PrincipalCollection principalCollection20 = null;
    org.apache.shiro.authz.Permission permission21 = null;
    boolean b22 = ldapRealm13.isPermitted(principalCollection20, permission21);
    org.apache.shiro.subject.PrincipalCollection principalCollection23 = null;
    java.util.HashSet<java.lang.String> hashset_str24 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    boolean b25 = ldapRealm13.hasAllRoles(principalCollection23, (java.util.Collection<java.lang.String>)hashset_str24);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.broadcastNoteList(authenticationInfo12, (java.util.HashSet)hashset_str24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test48"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.GetUserList> jsonresponse_getUserList1 = new org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.GetUserList>(status0);
    javax.ws.rs.core.Response.Status status2 = null;
    jsonresponse_getUserList1.setCode(status2);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test49"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    notebookRepoSettingsRequest0.settings = map_str_str1;
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = notebookRepoSettingsRequest0.settings;
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = notebookRepoSettingsRequest0.settings;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str4);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test50"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    ldapRealm0.setPermissionsByRole("org.apache.zeppelin.realm.LdapRealm_152");
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm_558");
    ldapRealm0.init();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test51"); }

    org.apache.zeppelin.rest.message.NewParagraphRequest newParagraphRequest0 = new org.apache.zeppelin.rest.message.NewParagraphRequest();
    java.lang.Double d1 = newParagraphRequest0.getIndex();
    java.lang.String str2 = newParagraphRequest0.getTitle();
    java.lang.String str3 = newParagraphRequest0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test52"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    javax.ws.rs.core.Response response2 = interpreterRestApi0.removeRepository("{}");
    javax.ws.rs.core.Response response4 = interpreterRestApi0.removeRepository("(.*)");
    javax.ws.rs.core.Response response6 = interpreterRestApi0.removeRepository("org.apache.zeppelin.realm.LdapRealm.authenticationCache.1114");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response6);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test53"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    ldapRealm0.setGroupSearchBase("hi!");
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo6 = ldapRealm0.getAuthenticationCache();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo6);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test54"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException3 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException5 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException3, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException6 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)notFoundException3);
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException8 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException10 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException8, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException12 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)badRequestException10, "");
    javax.ws.rs.core.Response response13 = badRequestException10.getResponse();
    notFoundException3.addSuppressed((java.lang.Throwable)badRequestException10);
    forbiddenException1.addSuppressed((java.lang.Throwable)badRequestException10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response13);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test55"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
    ldapRealm0.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_75");
    ldapRealm0.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    ldapRealm0.setGroupIdAttribute("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    java.lang.String str14 = ldapRealm0.getUserSearchFilter();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo15 = ldapRealm0.getAuthenticationCache();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver16 = ldapRealm0.getPermissionResolver();
    java.lang.String str17 = ldapRealm0.getUserSearchAttributeTemplate();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_75"+ "'", str14.equals("org.apache.zeppelin.realm.LdapRealm_75"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test56"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm3 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory4 = activeDirectoryGroupRealm3.getLdapContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory4);
    activeDirectoryGroupRealm0.setSystemUsername("subtree");
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    activeDirectoryGroupRealm0.onLogout(principalCollection8);
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm10 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm10.setSearchBase("hi!");
    activeDirectoryGroupRealm10.setSearchBase("");
    activeDirectoryGroupRealm10.init();
    activeDirectoryGroupRealm10.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory18 = activeDirectoryGroupRealm10.getLdapContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory18);
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver20 = activeDirectoryGroupRealm0.getRolePermissionResolver();
    activeDirectoryGroupRealm0.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm22 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str23 = ldapRealm22.getPermissionsByRole();
    java.lang.String str24 = ldapRealm22.getUserSearchAttributeName();
    java.lang.String str25 = ldapRealm22.getPrincipalRegex();
    ldapRealm22.setGroupIdAttribute("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver28 = ldapRealm22.getPermissionResolver();
    activeDirectoryGroupRealm0.setPermissionResolver(permissionResolver28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "(.*)"+ "'", str25.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver28);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test57"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener7 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener10 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest8, "subtree", notebookSocketListener10);
    notebookServer1.onMessage(notebookSocket11, "org.apache.zeppelin.realm.LdapRealm_187");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi14 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener15 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test58"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test59"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer2.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer2;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "groupOfNames", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener10 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer2);
    org.apache.zeppelin.notebook.Note note11 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener10.onNoteCreate(note11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test60"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener7 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi8 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    java.lang.String str9 = notebookServer1.getServletInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test61"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    ldapRealm0.setPagingSize((int)' ');
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    ldapRealm0.onLogout(principalCollection7);
    ldapRealm0.setAuthorizationEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test62"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer2.onStatusChange("hi!", "", "subtree", "");
    notebookServer2.broadcastUpdateNoteJobInfo((long)100);
    notebookServer2.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", 10, "org.apache.zeppelin.realm.LdapRealm_187", "org.apache.zeppelin.realm.LdapRealm_256");
    org.apache.zeppelin.socket.NotebookSocket notebookSocket16 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_832", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test63"); }

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
    notebookServer1.onOutputAppend("org.apache.zeppelin.realm.LdapRealm_306", "org.apache.zeppelin.realm.LdapRealm_366", (int)'#', "org.apache.zeppelin.realm.LdapRealm.authenticationCache.408");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi21 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response23 = interpreterRestApi21.getSetting("org.apache.zeppelin.realm.LdapRealm_529");
    javax.ws.rs.core.Response response25 = interpreterRestApi21.addRepository("org.apache.zeppelin.realm.LdapRealm_485");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response25);

  }

}
