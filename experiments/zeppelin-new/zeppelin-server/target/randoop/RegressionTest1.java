
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.rest.ConfigurationsRestApi configurationsRestApi1 = new org.apache.zeppelin.rest.ConfigurationsRestApi(notebook0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = configurationsRestApi1.getByPrefix("org.apache.zeppelin.realm.LdapRealm.authorizationCache.510");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, "hi!");
    javax.ws.rs.core.Response.Status status3 = jsonresponse_abstractcollection_interpreterInfo2.getCode();
    java.lang.String str4 = jsonresponse_abstractcollection_interpreterInfo2.toString();
    javax.ws.rs.core.NewCookie newCookie5 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo6 = jsonresponse_abstractcollection_interpreterInfo2.addCookie(newCookie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{\"message\":\"hi!\"}"+ "'", str4.equals("{\"message\":\"hi!\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_abstractcollection_interpreterInfo6);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setName("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setSearchBase("{}");
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    activeDirectoryGroupRealm0.onLogout(principalCollection9);
    boolean b11 = activeDirectoryGroupRealm0.isCachingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    boolean b8 = notebookServer0.checkOrigin(httpServletRequest6, "org.apache.zeppelin.realm.LdapRealm_273");
    org.apache.zeppelin.notebook.Note note9 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.unicastParagraph(note9, paragraph10, "org.apache.zeppelin.realm.LdapRealm_484");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str2);
    java.util.List<java.lang.String> list_str5 = getUserList0.getUserList(activeDirectoryGroupRealm1, "cn");
    org.apache.zeppelin.realm.LdapRealm ldapRealm6 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm6.setUserSearchAttributeTemplate("hi!");
    java.lang.String str9 = ldapRealm6.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.util.Collection collection11 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b12 = ldapRealm6.isPermittedAll(principalCollection10, (java.util.Collection<org.apache.shiro.authz.Permission>)collection11);
    java.util.List<java.lang.String> list_str13 = getUserList0.getRolesList(ldapRealm6);
    ldapRealm6.setUserSearchBase("org.apache.zeppelin.rest.exception.NotFoundException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    org.jvnet.libpam.UnixUser unixUser0 = null;
    org.apache.zeppelin.realm.UserPrincipal userPrincipal1 = new org.apache.zeppelin.realm.UserPrincipal(unixUser0);
    org.jvnet.libpam.UnixUser unixUser2 = userPrincipal1.getUnixUser();
    org.jvnet.libpam.UnixUser unixUser3 = userPrincipal1.getUnixUser();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = userPrincipal1.getName();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(unixUser2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(unixUser3);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "org.apache.zeppelin.realm.LdapRealm_654");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
    notebookInformationListener4.onParagraphRemove(paragraph5);
    org.apache.zeppelin.notebook.Note note7 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener4.onNoteRemove(note7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

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
    java.util.Map<java.lang.String,java.lang.String> map_str_str20 = ldapRealm19.getListRoles();
    java.lang.String str21 = ldapRealm19.getGroupSearchBase();
    java.util.List<java.lang.String> list_str23 = getUserList0.getUserList(ldapRealm19, "org.apache.zeppelin.realm.LdapRealm_47");
    ldapRealm19.setMemberAttribute("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");
    
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
    org.junit.Assert.assertNotNull(map_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

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
    org.apache.zeppelin.notebook.Note note30 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener31 = notebookServer0.getParagraphJobListener(note30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener31);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    javax.ws.rs.core.Response response9 = heliumRestApi2.getSpellConfigUsingMagic("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response10 = heliumRestApi2.getVisualizationPackageOrder();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response9);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    java.util.Map<java.lang.String,java.lang.String> map_str_str8 = ldapRealm0.getListRoles();
    ldapRealm0.setUserObjectClass("org.apache.zeppelin.realm.LdapRealm_109");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str8);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    ldapRealm2.setName("{\"message\":\"hi!\"}");
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.shiro.authz.Permission permission12 = null;
    boolean b13 = ldapRealm2.isPermitted(principalCollection11, permission12);
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    org.apache.shiro.authz.Permission permission15 = null;
    boolean b16 = ldapRealm2.isPermitted(principalCollection14, permission15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    boolean b4 = notebookSocket3.isNotConnected();
    boolean b5 = notebookSocket3.isNotConnected();
    org.eclipse.jetty.websocket.api.Session session6 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketConnect(session6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener4 = notebookServer0.getNotebookInformationListener();
    org.apache.zeppelin.socket.NotebookServer notebookServer5 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer5.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject7);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener9 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer5);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener12 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest10, "subtree", notebookSocketListener12);
    boolean b14 = notebookSocket13.isConnected();
    boolean b15 = notebookSocket13.isConnected();
    notebookServer5.onMessage(notebookSocket13, "org.apache.zeppelin.realm.LdapRealm_205");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onClose(notebookSocket13, (int)(byte)100, "cn");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

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
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration<java.lang.String> enumeration_str47 = notebookServer2.getInitParameterNames();
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.679"+ "'", str19.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.679"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    notebookSocket3.setUser("{}");
    org.eclipse.jetty.websocket.api.Session session6 = notebookSocket3.getSession();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session6);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

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
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_267", (int)(byte)100, "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");
    org.apache.zeppelin.notebook.Note note23 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNote(note23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    corsFilter0.destroy();
    corsFilter0.destroy();
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
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "org.apache.zeppelin.realm.LdapRealm_262");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response5 = heliumRestApi0.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_265", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = heliumRestApi0.getVisualizationPackageOrder("org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

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
    org.apache.zeppelin.scheduler.Job job24 = null;
    org.apache.zeppelin.scheduler.Job.Status status25 = null;
    org.apache.zeppelin.scheduler.Job.Status status26 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.afterStatusChange(job24, status25, status26);
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b2 = org.apache.zeppelin.utils.SecurityUtils.isValidOrigin("{\n  \"message\": \"hi!\"\n}", zeppelinConfiguration1);
      org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException");
    } catch (java.net.URISyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

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
    org.junit.Assert.assertNotNull(hashset_str21);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer9 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest7, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer9);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint11 = notebookSocket10.getRemote();
    java.lang.String str12 = notebookSocket10.getProtocol();
    org.eclipse.jetty.websocket.api.Session session13 = notebookSocket10.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException15 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket10.onWebSocketError((java.lang.Throwable)forbiddenException15);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onClose(notebookSocket10, (int)(byte)0, "org.apache.zeppelin.realm.LdapRealm_139");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "cn"+ "'", str12.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session13);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

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
    ldapRealm0.init();
    
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = heliumRestApi2.getVisualizationPackageOrder("org.apache.zeppelin.realm.LdapRealm_256");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

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
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo29 = ldapRealm19.getAuthenticationCache();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo29);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

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
    activeDirectoryGroupRealm0.setSearchBase("org.apache.zeppelin.rest.exception.NotFoundException");
    
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
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response1 = heliumRestApi0.getAllPackageConfigs();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = heliumRestApi0.getVisualizationPackageOrder("org.apache.zeppelin.realm.LdapRealm_623");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setAuthorizationCachingEnabled(true);
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener7 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi8 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response11 = interpreterRestApi8.restartSetting("person", "org.apache.zeppelin.realm.LdapRealm_47");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Note note7 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener6.onNoteCreate(note7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm_139");
    ldapRealm0.init();
    java.lang.String str11 = ldapRealm0.getGroupObjectClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "groupOfNames"+ "'", str11.equals("groupOfNames"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo4 = ldapRealm0.getAuthorizationCache();
    ldapRealm0.setPagingSize((int)(short)1);
    java.lang.String str7 = ldapRealm0.getMemberAttribute();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "member"+ "'", str7.equals("member"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    ldapRealm0.setCachingEnabled(false);
    java.lang.String str8 = ldapRealm0.getUserSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

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
    java.util.Map<java.lang.String,java.lang.String> map_str_str20 = ldapRealm19.getListRoles();
    java.lang.String str21 = ldapRealm19.getGroupSearchBase();
    java.util.List<java.lang.String> list_str23 = getUserList0.getUserList(ldapRealm19, "org.apache.zeppelin.realm.LdapRealm_47");
    org.apache.shiro.subject.PrincipalCollection principalCollection24 = null;
    boolean b26 = ldapRealm19.hasRole(principalCollection24, "{\"message\":\"hi!\"}");
    
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
    org.junit.Assert.assertNotNull(map_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

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
    notebookServer0.onRemoteRunParagraph("org.apache.zeppelin.realm.LdapRealm_267", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    ldapRealm1.setAuthorizationEnabled(false);
    ldapRealm1.setUserDnTemplate("subtree");
    java.util.List<java.lang.String> list_str8 = getUserList0.getRolesList(ldapRealm1);
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm9 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str10 = null;
    activeDirectoryGroupRealm9.setGroupRolesMap(map_str_str10);
    activeDirectoryGroupRealm9.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm9.setName("org.apache.zeppelin.realm.LdapRealm_109");
    java.util.List<java.lang.String> list_str17 = getUserList0.getUserList(activeDirectoryGroupRealm9, "org.apache.zeppelin.realm.LdapRealm_75");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "subtree", (int)(byte)1, "org.apache.zeppelin.realm.LdapRealm_267");
    org.apache.zeppelin.socket.NotebookServer notebookServer12 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer12.onStatusChange("cn", "", "subtree", "subtree");
    notebookServer12.onOutputAppend("org.apache.zeppelin.realm.LdapRealm_371", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", (int)'a', "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer26 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket27 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest24, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer26);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint28 = notebookSocket27.getRemote();
    java.lang.String str29 = notebookSocket27.getProtocol();
    org.eclipse.jetty.websocket.api.Session session30 = notebookSocket27.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException32 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket27.onWebSocketError((java.lang.Throwable)forbiddenException32);
    notebookServer12.onMessage(notebookSocket27, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.451");
    java.lang.String str36 = notebookServer12.getServletInfo();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init((javax.servlet.ServletConfig)notebookServer12);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "cn"+ "'", str29.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException3 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException1, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException5 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)badRequestException3, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException6 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)notFoundException5);
    java.lang.String str7 = notFoundException6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.rest.exception.NotFoundException: org.apache.zeppelin.rest.exception.NotFoundException: org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException"+ "'", str7.equals("org.apache.zeppelin.rest.exception.NotFoundException: org.apache.zeppelin.rest.exception.NotFoundException: org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    org.apache.zeppelin.rest.NotebookResponse notebookResponse1 = new org.apache.zeppelin.rest.NotebookResponse("org.apache.zeppelin.realm.LdapRealm.authenticationCache.545");

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

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
    javax.ws.rs.core.NewCookie newCookie16 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm17 = jsonresponse_jndiLdapRealm15.addCookie(newCookie16);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jndiLdapRealm17);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response8 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_205", "groupOfNames");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response11 = heliumRestApi2.bundleLoad("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "groupOfNames");
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
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator1 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest servletUpgradeRequest2 = null;
    org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse servletUpgradeResponse3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = notebookWebSocketCreator1.createWebSocket(servletUpgradeRequest2, servletUpgradeResponse3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm10 = jsonresponse_jndiLdapRealm8.setPretty(false);
    javax.ws.rs.core.Response.Status status11 = jsonresponse_jndiLdapRealm8.getCode();
    javax.ws.rs.core.Response.Status status12 = jsonresponse_jndiLdapRealm8.getCode();
    
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
    org.junit.Assert.assertNull(status12);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response1 = heliumRestApi0.getAllPackageConfigs();
    javax.ws.rs.core.Response response4 = heliumRestApi0.getPackageConfig("org.apache.zeppelin.realm.LdapRealm.authenticationCache.356", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.167");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    notebookRepoSettingsRequest0.settings = map_str_str1;
    boolean b3 = notebookRepoSettingsRequest0.isEmpty();
    java.lang.String str4 = notebookRepoSettingsRequest0.name;
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = notebookRepoSettingsRequest0.settings;
    boolean b6 = notebookRepoSettingsRequest0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "subtree"+ "'", str4.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "org.apache.zeppelin.realm.LdapRealm_75");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener6 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket7 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest4, "subtree", notebookSocketListener6);
    boolean b8 = notebookSocket7.isConnected();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket7);
    notebookServer0.broadcastUpdateNoteJobInfo((long)' ');
    org.apache.zeppelin.socket.NotebookServer notebookServer12 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer12.onStatusChange("cn", "", "subtree", "subtree");
    notebookServer12.onOutputAppend("org.apache.zeppelin.realm.LdapRealm_371", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", (int)'a', "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer26 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket27 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest24, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer26);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint28 = notebookSocket27.getRemote();
    java.lang.String str29 = notebookSocket27.getProtocol();
    org.eclipse.jetty.websocket.api.Session session30 = notebookSocket27.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException32 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket27.onWebSocketError((java.lang.Throwable)forbiddenException32);
    notebookServer12.onMessage(notebookSocket27, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.451");
    org.apache.zeppelin.notebook.socket.Message message36 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.saveInterpreterBindings(notebookSocket27, message36);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "cn"+ "'", str29.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session30);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    notebookSocket3.setUser("{}");
    boolean b6 = notebookSocket3.isNotConnected();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    java.lang.String str1 = newInterpreterSettingRequest0.getGroup();
    java.lang.String str2 = newInterpreterSettingRequest0.getName();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = newInterpreterSettingRequest0.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

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
    boolean b19 = notebookRepoSettingsRequest0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_273");
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_654");

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setSystemPassword("org.apache.zeppelin.realm.LdapRealm_704");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.CacheManager cacheManager4 = null;
    ldapRealm0.setCacheManager(cacheManager4);
    java.lang.String str6 = ldapRealm0.getGroupSearchScope();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "subtree"+ "'", str6.equals("subtree"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

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
    org.apache.shiro.subject.PrincipalCollection principalCollection17 = null;
    java.util.Collection collection18 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b19 = ldapRealm13.isPermittedAll(principalCollection17, (java.util.Collection<org.apache.shiro.authz.Permission>)collection18);
    java.util.Map<java.lang.String,java.lang.String> map_str_str20 = ldapRealm13.getRolesByGroup();
    notebookRepoSettingsRequest0.settings = map_str_str20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "subtree"+ "'", str2.equals("subtree"));
    
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
    org.junit.Assert.assertNotNull(collection18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str20);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    ldapRealm7.setAuthorizationEnabled(false);
    ldapRealm7.setAuthenticationCachingEnabled(false);
    ldapRealm7.setUserSearchBase("hi!");
    java.lang.String str16 = ldapRealm7.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo17 = null;
    ldapRealm7.setAuthorizationCache(cache_obj_authorizationInfo17);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver19 = ldapRealm7.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory20 = ldapRealm7.getContextFactory();
    ldapRealm0.setContextFactory(ldapContextFactory20);
    ldapRealm0.setAuthorizationEnabled(true);
    ldapRealm0.setPagingSize(1);
    java.lang.String str26 = ldapRealm0.getUserObjectClass();
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

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
    notebookServer0.onRemove("org.apache.zeppelin.realm.LdapRealm_371", "anonymous", "org.apache.zeppelin.realm.LdapRealm_447", "org.apache.zeppelin.realm.LdapRealm_187");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator5 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type10 = null;
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm_578", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.150", (int)(short)-1, "", type10, "org.apache.zeppelin.realm.LdapRealm_256");

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = notebookServer1.doWebSocketConnect(httpServletRequest8, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator11 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer1);
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
    notebookServer1.broadcastNoteList(authenticationInfo12, (java.util.HashSet)hashset_str24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket10);
    
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
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator6 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener10 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest8, "subtree", notebookSocketListener10);
    boolean b12 = notebookSocket11.isConnected();
    boolean b13 = notebookSocket11.isNotConnected();
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException14 = new org.apache.zeppelin.rest.exception.BadRequestException();
    java.lang.Throwable[] throwable_array15 = badRequestException14.getSuppressed();
    notebookSocket11.onWebSocketError((java.lang.Throwable)badRequestException14);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.log("{\n  \"message\": \"hi!\"\n}", (java.lang.Throwable)badRequestException14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array15);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    java.lang.Boolean b2 = org.apache.zeppelin.utils.SecurityUtils.isValidOrigin("", zeppelinConfiguration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b2 + "' != '" + false+ "'", b2.equals(false));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer2.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener8 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer2);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    notebookServer2.onMessage(notebookSocket12, "org.apache.zeppelin.realm.LdapRealm_187");
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket17 = notebookServer2.doWebSocketConnect(httpServletRequest15, "org.apache.zeppelin.realm.LdapRealm_175");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener18 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer2);
    notebookServer2.broadcastUpdateNoteJobInfo((long)'4');
    org.apache.zeppelin.socket.NotebookSocket notebookSocket21 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_133", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket17);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    org.apache.zeppelin.rest.NotebookResponse notebookResponse1 = new org.apache.zeppelin.rest.NotebookResponse("org.apache.zeppelin.realm.LdapRealm_623");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    corsFilter0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    corsFilter0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    corsFilter0.init(filterConfig4);
    javax.servlet.ServletRequest servletRequest6 = null;
    javax.servlet.ServletResponse servletResponse7 = null;
    javax.servlet.FilterChain filterChain8 = null;
    // The following exception was thrown during execution in test generation
    try {
    corsFilter0.doFilter(servletRequest6, servletResponse7, filterChain8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    corsFilter0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    corsFilter0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    corsFilter0.init(filterConfig4);
    corsFilter0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    corsFilter0.init(filterConfig7);
    corsFilter0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    corsFilter0.init(filterConfig10);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    java.lang.String str1 = newInterpreterSettingRequest0.getGroup();
    java.lang.String str2 = newInterpreterSettingRequest0.getName();
    java.lang.String str3 = newInterpreterSettingRequest0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    notebookServer0.broadcastUpdateNoteJobInfo((-1L));
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer13 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket14 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest11, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer13);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint15 = notebookSocket14.getRemote();
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint16 = notebookSocket14.getRemote();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo17 = null;
    java.lang.String[] str_array66 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.realm.LdapRealm_371", "(.*)", "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.439", "org.apache.zeppelin.realm.LdapRealm_366", "subtree", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.593", "org.apache.zeppelin.realm.LdapRealm_47", "org.apache.zeppelin.realm.LdapRealm_267", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.rest.exception.NotFoundException: org.apache.zeppelin.rest.exception.NotFoundException: org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.593", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm_301", "member", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.356", "org.apache.zeppelin.realm.LdapRealm_484", "org.apache.zeppelin.realm.LdapRealm_267", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266", "org.apache.zeppelin.realm.LdapRealm_558", "org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm_152", "org.apache.zeppelin.rest.exception.BadRequestException", "org.apache.zeppelin.realm.LdapRealm_139", "person", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.555", "org.apache.zeppelin.realm.LdapRealm_256", "org.apache.zeppelin.realm.LdapRealm_109", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.150", "org.apache.zeppelin.realm.LdapRealm_623", "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache", "org.apache.zeppelin.realm.LdapRealm_447", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.439", "org.apache.zeppelin.realm.LdapRealm_676", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.545", "org.apache.zeppelin.realm.LdapRealm_300", "member", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.312", "org.apache.zeppelin.realm.LdapRealm_366", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_300", "{\"message\":\"member\"}", "org.apache.zeppelin.realm.LdapRealm_246", "member", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.359", "anonymous" };
    java.util.HashSet<java.lang.String> hashset_str67 = new java.util.HashSet<java.lang.String>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)hashset_str67, str_array66);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.unicastNoteList(notebookSocket14, authenticationInfo17, hashset_str67);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setUserDnTemplate("subtree");
    java.lang.String str7 = ldapRealm0.getGroupObjectClass();
    ldapRealm0.setUserSearchFilter("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "groupOfNames"+ "'", str7.equals("groupOfNames"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException3 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException1, "");
    javax.ws.rs.core.Response response4 = badRequestException3.getResponse();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException6 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)badRequestException3, "org.apache.zeppelin.realm.LdapRealm_134");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException8 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException6, "{\n  \"message\": \"hi!\"\n}");
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException10 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)forbiddenException6, "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    java.lang.String str2 = ldapRealm0.getGroupSearchScope();
    ldapRealm0.setPrincipalRegex("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");
    java.lang.String str5 = ldapRealm0.getAuthenticationCacheName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "subtree"+ "'", str2.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.759"+ "'", str5.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.759"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

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
    javax.ws.rs.core.Response.Status status14 = null;
    jsonresponse_jndiLdapRealm13.setCode(status14);
    org.apache.shiro.realm.ldap.JndiLdapRealm jndiLdapRealm16 = jsonresponse_jndiLdapRealm13.getBody();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jndiLdapRealm16);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

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
    javax.ws.rs.core.Response response16 = heliumRestApi2.getVisualizationPackageOrder();
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
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    byte[] byte_array9 = new byte[] { (byte)0, (byte)10, (byte)100, (byte)0, (byte)1 };
    notebookSocket3.onWebSocketBinary(byte_array9, 0, (int)(short)10);
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException14 = new org.apache.zeppelin.rest.exception.ForbiddenException("");
    javax.ws.rs.core.Response response15 = forbiddenException14.getResponse();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException16 = new org.apache.zeppelin.rest.exception.ForbiddenException();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException18 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException20 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException18, "");
    javax.ws.rs.core.Response response21 = badRequestException20.getResponse();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException23 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)badRequestException20, "org.apache.zeppelin.realm.LdapRealm_134");
    forbiddenException16.addSuppressed((java.lang.Throwable)badRequestException20);
    forbiddenException14.addSuppressed((java.lang.Throwable)badRequestException20);
    notebookSocket3.onWebSocketError((java.lang.Throwable)badRequestException20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response21);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

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
    org.apache.shiro.realm.jdbc.JdbcRealm jdbcRealm15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str16 = getUserList0.getUserList(jdbcRealm15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = newInterpreterSettingRequest0.getOption();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = newInterpreterSettingRequest0.getProperties();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption3 = newInterpreterSettingRequest0.getOption();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption3);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getAuthenticationCacheName();
    ldapRealm0.setMemberAttribute("org.apache.zeppelin.realm.LdapRealm_187");
    ldapRealm0.setUserSearchScope("org.apache.zeppelin.rest.exception.NotFoundException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.765"+ "'", str3.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.765"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = null;
    notebookServer0.onLoad("org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm_205", heliumPackage8);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type14 = null;
    notebookServer0.onOutputUpdated("", "(.*)", (int)(byte)0, "{\"message\":\"hi!\"}", type14, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    org.apache.zeppelin.socket.NotebookServer notebookServer17 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph18 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph19 = null;
    notebookServer17.broadcastParagraphs(map_str_paragraph18, paragraph19);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init((javax.servlet.ServletConfig)notebookServer17);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
    activeDirectoryGroupRealm0.init();
    activeDirectoryGroupRealm0.setPrincipalSuffix("subtree");
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo8 = null;
    activeDirectoryGroupRealm0.setAuthorizationCache(cache_obj_authorizationInfo8);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph6, paragraph7);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    org.jvnet.libpam.UnixUser unixUser0 = null;
    org.apache.zeppelin.realm.UserPrincipal userPrincipal1 = new org.apache.zeppelin.realm.UserPrincipal(unixUser0);
    org.jvnet.libpam.UnixUser unixUser2 = userPrincipal1.getUnixUser();
    org.jvnet.libpam.UnixUser unixUser3 = userPrincipal1.getUnixUser();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = userPrincipal1.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(unixUser2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(unixUser3);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

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
    org.eclipse.jetty.websocket.api.Session session13 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket8.onWebSocketConnect(session13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    java.lang.String str5 = notebookSocket3.getProtocol();
    org.eclipse.jetty.websocket.api.Session session6 = notebookSocket3.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException8 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket3.onWebSocketError((java.lang.Throwable)forbiddenException8);
    org.eclipse.jetty.websocket.api.Session session10 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketConnect(session10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "cn"+ "'", str5.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session6);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    org.apache.zeppelin.rest.NotebookResponse notebookResponse1 = new org.apache.zeppelin.rest.NotebookResponse("org.apache.zeppelin.realm.LdapRealm.authenticationCache.759");

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    org.eclipse.jetty.websocket.api.Session session5 = notebookSocket3.getSession();
    byte[] byte_array6 = new byte[] {  };
    notebookSocket3.onWebSocketBinary(byte_array6, (int)(byte)10, 100);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = notebookSocket3.getRequest();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest10);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory1 = activeDirectoryGroupRealm0.getLdapContextFactory();
    activeDirectoryGroupRealm0.setPrincipalSuffix("(.*)");
    activeDirectoryGroupRealm0.setSystemPassword("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory1);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject4 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.socket.NotebookServer notebookServer10 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer10.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener16 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer10);
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener19 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket20 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest17, "subtree", notebookSocketListener19);
    notebookServer10.onMessage(notebookSocket20, "org.apache.zeppelin.realm.LdapRealm_187");
    org.apache.zeppelin.notebook.socket.Message message23 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.saveInterpreterBindings(notebookSocket20, message23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

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
    ldapRealm0.setUserSearchAttributeTemplate("org.apache.zeppelin.realm.LdapRealm_175");
    
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

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = newInterpreterSettingRequest0.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = newInterpreterSettingRequest0.getOption();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = newInterpreterSettingRequest0.getProperties();
    java.lang.String str4 = newInterpreterSettingRequest0.getGroup();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = notebookSocket3.getRequest();
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.send("org.apache.zeppelin.realm.LdapRealm_301");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest4);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    boolean b8 = notebookServer0.checkOrigin(httpServletRequest6, "org.apache.zeppelin.realm.LdapRealm_273");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputClear("org.apache.zeppelin.realm.LdapRealm.authenticationCache.759", "org.apache.zeppelin.realm.LdapRealm_558");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener5 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest6, "subtree", notebookSocketListener8);
    boolean b10 = notebookSocket9.isConnected();
    boolean b11 = notebookSocket9.isConnected();
    notebookServer1.onMessage(notebookSocket9, "org.apache.zeppelin.realm.LdapRealm_205");
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi14 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener17 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket18 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest15, "subtree", notebookSocketListener17);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint19 = notebookSocket18.getRemote();
    org.eclipse.jetty.websocket.api.Session session20 = notebookSocket18.getSession();
    byte[] byte_array21 = new byte[] {  };
    notebookSocket18.onWebSocketBinary(byte_array21, (int)(byte)10, 100);
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException25 = new org.apache.zeppelin.rest.exception.ForbiddenException();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException27 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException25, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    notebookSocket18.onWebSocketError((java.lang.Throwable)notFoundException27);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.onClose(notebookSocket18, (int)' ', "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

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
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response23 = interpreterRestApi21.removeSetting("org.apache.zeppelin.realm.LdapRealm_256");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchFilter("");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver6 = ldapRealm0.getPermissionResolver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver6);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    org.apache.zeppelin.realm.LdapGroupRealm ldapGroupRealm0 = new org.apache.zeppelin.realm.LdapGroupRealm();
    javax.naming.ldap.LdapContext ldapContext2 = null;
    java.util.Set<java.lang.String> set_str4 = ldapGroupRealm0.getRoleNamesForUser("org.apache.zeppelin.realm.LdapRealm_75", ldapContext2, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str4);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.545", (int)' ', "");
    org.apache.zeppelin.socket.NotebookServer notebookServer12 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject14 = null;
    notebookServer12.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject14);
    javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener18 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket19 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest16, "subtree", notebookSocketListener18);
    boolean b20 = notebookSocket19.isConnected();
    notebookServer12.unsubscribeNoteJobInfo(notebookSocket19);
    notebookServer12.broadcastUpdateNoteJobInfo((long)' ');
    org.apache.zeppelin.display.AngularObject angularObject25 = null;
    notebookServer12.onAdd("org.apache.zeppelin.realm.LdapRealm_273", angularObject25);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init((javax.servlet.ServletConfig)notebookServer12);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

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
    org.apache.zeppelin.display.AngularObject angularObject25 = null;
    notebookServer0.onAdd("member", angularObject25);
    org.apache.zeppelin.notebook.Note note27 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph28 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastParagraph(note27, paragraph28);
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
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.rest.ConfigurationsRestApi configurationsRestApi1 = new org.apache.zeppelin.rest.ConfigurationsRestApi(notebook0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = configurationsRestApi1.getByPrefix("org.apache.zeppelin.realm.LdapRealm_704");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.broadcastUpdateNoteJobInfo((long)100);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph8 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph9 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph8, paragraph9);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    java.lang.String str7 = ldapRealm0.getName();
    java.lang.String str8 = ldapRealm0.getGroupSearchBase();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver9 = ldapRealm0.getRolePermissionResolver();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = ldapRealm0.getAuthorizationCache();
    ldapRealm0.setSearchBase("org.apache.zeppelin.realm.LdapRealm_460");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_780"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_780"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo10);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    notebookSocket3.setUser("{}");
    notebookSocket3.setUser("org.apache.zeppelin.realm.LdapRealm_229");
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketText("org.apache.zeppelin.realm.LdapRealm_558");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    ldapRealm2.setUserSearchAttributeTemplate("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    boolean b11 = ldapRealm2.getUserLowerCase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    boolean b4 = notebookSocket3.isConnected();
    boolean b5 = notebookSocket3.isNotConnected();
    boolean b6 = notebookSocket3.isNotConnected();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory10 = ldapRealm0.getContextFactory();
    boolean b11 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    org.apache.zeppelin.realm.LdapRealm ldapRealm12 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm12.setUserSearchAttributeTemplate("hi!");
    ldapRealm12.setAuthorizationEnabled(false);
    ldapRealm12.setUserDnTemplate("subtree");
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = ldapRealm12.getRolesByGroup();
    ldapRealm0.setRolesByGroup(map_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_786"+ "'", str9.equals("org.apache.zeppelin.realm.LdapRealm_786"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    java.lang.String str7 = ldapRealm0.getGroupIdAttribute();
    boolean b8 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "cn"+ "'", str7.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer0.onAdd("(.*)", angularObject7);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.312", 0, "{\"message\":\"hi!\"}");
    javax.ws.rs.core.Response.Status status19 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array22 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo23 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo23, interpreterInfo_array22);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList26 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo23, false);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo27 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status19, (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo23);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList29 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_134", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo23, false);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList31 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm_262", "org.apache.zeppelin.realm.LdapRealm_262", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo23, false);
    notebookServer0.broadcastInterpreterBindings("org.apache.zeppelin.realm.LdapRealm_133", (java.util.List)arraylist_interpreterInfo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException3 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException1, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException5 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)badRequestException3, "");
    javax.ws.rs.core.Response response6 = badRequestException3.getResponse();
    javax.ws.rs.core.Response response7 = badRequestException3.getResponse();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    ldapRealm0.setGroupSearchBase("org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");
    ldapRealm0.setUserSearchBase("org.apache.zeppelin.realm.LdapRealm_75");
    ldapRealm0.setUserLowerCase(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm3 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory4 = activeDirectoryGroupRealm3.getLdapContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory4);
    boolean b6 = activeDirectoryGroupRealm0.isAuthorizationCachingEnabled();
    activeDirectoryGroupRealm0.setSystemUsername("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339");
    activeDirectoryGroupRealm0.setSystemPassword("org.apache.zeppelin.realm.LdapRealm_662");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    java.lang.String str4 = ldapRealm0.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    java.util.List<java.lang.String> list_str6 = null;
    boolean[] b_array7 = ldapRealm0.hasRoles(principalCollection5, list_str6);
    java.lang.String str8 = ldapRealm0.getUserSearchFilter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "cn"+ "'", str4.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.PamRealm pamRealm1 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver2 = pamRealm1.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection3 = null;
    java.lang.String[] str_array40 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_256", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266", "{\"message\":\"hi!\"}", "{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_187", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_109", "org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm_175", "hi!", "org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm_300", "{}", "org.apache.zeppelin.realm.LdapRealm_229", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm_306", "org.apache.zeppelin.realm.LdapRealm_205", "groupOfNames", "", "org.apache.zeppelin.realm.LdapRealm_301", "org.apache.zeppelin.realm.LdapRealm_134", "org.apache.zeppelin.realm.LdapRealm_300", "{}", "org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm_301" };
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array40);
    boolean[] b_array43 = pamRealm1.hasRoles(principalCollection3, (java.util.List<java.lang.String>)arraylist_str41);
    org.apache.zeppelin.server.JsonResponse<java.util.Collection<java.lang.String>> jsonresponse_collection_str44 = new org.apache.zeppelin.server.JsonResponse<java.util.Collection<java.lang.String>>(status0, (java.util.Collection<java.lang.String>)arraylist_str41);
    javax.ws.rs.core.Response.Status status45 = null;
    jsonresponse_collection_str44.setCode(status45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array43);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

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
    ldapRealm0.setPermissionsByRole("org.apache.zeppelin.realm.LdapRealm_152");
    
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
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    org.apache.shiro.authz.Permission permission8 = null;
    boolean b9 = ldapRealm0.isPermitted(principalCollection7, permission8);
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.util.HashSet<java.lang.String> hashset_str11 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    boolean b12 = ldapRealm0.hasAllRoles(principalCollection10, (java.util.Collection<java.lang.String>)hashset_str11);
    ldapRealm0.setAuthenticationCacheName("org.apache.zeppelin.realm.LdapRealm_651");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    boolean b9 = notebookServer0.checkOrigin(httpServletRequest7, "cn");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph10 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph10, paragraph11);
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting13 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.clearParagraphRuntimeInfo(interpreterSetting13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = heliumRestApi2.getVisualizationPackageOrder("org.apache.zeppelin.realm.LdapRealm_780");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    javax.ws.rs.core.Response response3 = credentialRestApi1.putCredentials("{}");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = credentialRestApi1.putCredentials("org.apache.zeppelin.realm.LdapRealm_205");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    ldapRealm2.setUserObjectClass("org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.zeppelin.rest.GetUserList getUserList12 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm13 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm13.setSearchBase("hi!");
    activeDirectoryGroupRealm13.setSearchBase("");
    activeDirectoryGroupRealm13.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm19 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm19.setUserSearchAttributeTemplate("hi!");
    java.lang.String str22 = ldapRealm19.getUserSearchAttributeTemplate();
    java.lang.String str23 = ldapRealm19.getUserSearchAttributeName();
    boolean b24 = ldapRealm19.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm25 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str26 = ldapRealm25.getListRoles();
    ldapRealm19.setRolesByGroup(map_str_str26);
    activeDirectoryGroupRealm13.setGroupRolesMap(map_str_str26);
    java.util.List<java.lang.String> list_str30 = getUserList12.getUserList(activeDirectoryGroupRealm13, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.zeppelin.realm.LdapRealm ldapRealm31 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str32 = ldapRealm31.getListRoles();
    java.lang.String str33 = ldapRealm31.getGroupSearchBase();
    java.util.List<java.lang.String> list_str35 = getUserList12.getUserList(ldapRealm31, "org.apache.zeppelin.realm.LdapRealm_47");
    org.apache.shiro.subject.PrincipalCollection principalCollection36 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm37 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm37.setUserSearchAttributeTemplate("hi!");
    java.lang.String str40 = ldapRealm37.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection41 = null;
    java.util.Collection collection42 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b43 = ldapRealm37.isPermittedAll(principalCollection41, (java.util.Collection<org.apache.shiro.authz.Permission>)collection42);
    java.util.Map<java.lang.String,java.lang.String> map_str_str44 = ldapRealm37.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection45 = null;
    org.apache.shiro.authz.Permission[] permission_array46 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission47 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission47, permission_array46);
    ldapRealm37.checkPermissions(principalCollection45, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission47);
    boolean[] b_array50 = ldapRealm31.isPermitted(principalCollection36, (java.util.List<org.apache.shiro.authz.Permission>)arraylist_permission47);
    boolean[] b_array51 = ldapRealm2.isPermitted(principalCollection11, (java.util.List<org.apache.shiro.authz.Permission>)arraylist_permission47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array51);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
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
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("org.apache.zeppelin.realm.LdapRealm.authenticationCache.545");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

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
    org.apache.zeppelin.scheduler.Job job22 = null;
    org.apache.zeppelin.scheduler.Job.Status status23 = null;
    org.apache.zeppelin.scheduler.Job.Status status24 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl11.afterStatusChange(job22, status23, status24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    org.eclipse.jetty.websocket.api.Session session5 = notebookSocket3.getSession();
    javax.servlet.http.HttpServletRequest httpServletRequest6 = notebookSocket3.getRequest();
    byte[] byte_array7 = null;
    notebookSocket3.onWebSocketBinary(byte_array7, 10, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest6);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    notebookServer0.onStatusChange("org.apache.zeppelin.realm.LdapRealm.authorizationCache.266", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "hi!", "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting11 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.clearParagraphRuntimeInfo(interpreterSetting11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    org.apache.zeppelin.rest.exception.BadRequestException badRequestException0 = new org.apache.zeppelin.rest.exception.BadRequestException();
    java.lang.Throwable[] throwable_array1 = badRequestException0.getSuppressed();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException3 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException5 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException3, "");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException7 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)badRequestException5, "");
    badRequestException0.addSuppressed((java.lang.Throwable)badRequestException5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array1);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject4 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer2.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.apache.zeppelin.socket.NotebookServer notebookServer10 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer10.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph16 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
    notebookServer10.broadcastParagraphs(map_str_paragraph16, paragraph17);
    javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener21 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket22 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest19, "subtree", notebookSocketListener21);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint23 = notebookSocket22.getRemote();
    notebookServer10.unsubscribeNoteJobInfo(notebookSocket22);
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph25 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
    notebookServer10.broadcastParagraphs(map_str_paragraph25, paragraph26);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.init((javax.servlet.ServletConfig)notebookServer10);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint23);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    org.apache.shiro.subject.PrincipalCollection principalCollection1 = null;
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHubRealm0.onLogout(principalCollection1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str5 = ldapRealm0.getName();
    boolean b6 = ldapRealm0.isAuthenticationCachingEnabled();
    java.lang.String str7 = ldapRealm0.getPrincipalRegex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_825"+ "'", str5.equals("org.apache.zeppelin.realm.LdapRealm_825"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(.*)"+ "'", str7.equals("(.*)"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver5 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver5);
    java.lang.String str7 = ldapRealm0.getUserSearchAttributeTemplate();
    java.util.Map<java.lang.String,java.lang.String> map_str_str8 = ldapRealm0.getRolesByGroup();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher9 = ldapRealm0.getCredentialsMatcher();
    java.lang.String str10 = ldapRealm0.getUserSearchAttributeTemplate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

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
    ldapRealm0.setSearchBase("org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");
    
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

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setAuthenticationCacheName("");
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher8 = ldapRealm0.getCredentialsMatcher();
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm10 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str11 = null;
    activeDirectoryGroupRealm10.setGroupRolesMap(map_str_str11);
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm13.setUserSearchAttributeTemplate("hi!");
    ldapRealm13.setAuthorizationEnabled(false);
    ldapRealm13.setAuthenticationCachingEnabled(false);
    ldapRealm13.setUserSearchBase("hi!");
    java.lang.String str22 = ldapRealm13.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory23 = ldapRealm13.getContextFactory();
    activeDirectoryGroupRealm10.setLdapContextFactory(ldapContextFactory23);
    org.apache.shiro.subject.PrincipalCollection principalCollection25 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm26 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm26.setUserSearchAttributeTemplate("hi!");
    java.lang.String str29 = ldapRealm26.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection30 = null;
    java.util.Collection collection31 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b32 = ldapRealm26.isPermittedAll(principalCollection30, (java.util.Collection<org.apache.shiro.authz.Permission>)collection31);
    boolean b33 = ldapRealm26.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm26.setUserDnTemplate("");
    org.apache.shiro.subject.PrincipalCollection principalCollection36 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm37 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm37.setUserSearchAttributeTemplate("hi!");
    ldapRealm37.setAuthorizationEnabled(false);
    ldapRealm37.setAuthenticationCachingEnabled(false);
    ldapRealm37.setUserSearchBase("hi!");
    java.lang.String str46 = ldapRealm37.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection47 = null;
    java.lang.String[] str_array49 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array50 = ldapRealm37.isPermitted(principalCollection47, str_array49);
    boolean[] b_array51 = ldapRealm26.isPermitted(principalCollection36, str_array49);
    boolean b52 = activeDirectoryGroupRealm10.isPermittedAll(principalCollection25, str_array49);
    boolean[] b_array53 = ldapRealm0.isPermitted(principalCollection9, str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_832"+ "'", str22.equals("org.apache.zeppelin.realm.LdapRealm_832"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array53);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    java.lang.Class class3 = activeDirectoryGroupRealm0.getAuthenticationTokenClass();
    javax.naming.ldap.LdapContext ldapContext5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str6 = activeDirectoryGroupRealm0.searchForUserName("org.apache.zeppelin.realm.ActiveDirectoryGroupRealm.authenticationCache.823", ldapContext5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class3);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer7 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer7.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject9);
    org.apache.zeppelin.display.AngularObject angularObject12 = null;
    notebookServer7.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject12);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket14 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest5, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest3, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket15);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputClear("org.apache.zeppelin.realm.LdapRealm_558", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.759");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response1 = heliumRestApi0.getAllPackageConfigs();
    javax.ws.rs.core.Response response5 = heliumRestApi0.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm.authenticationCache.555", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm_262");
    javax.ws.rs.core.Response response7 = heliumRestApi0.getSinglePackageInfo("org.apache.zeppelin.realm.LdapRealm_300");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    boolean b4 = notebookSocket3.isConnected();
    boolean b5 = notebookSocket3.isConnected();
    java.lang.String str6 = notebookSocket3.getUser();
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer9 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest7, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer9);
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer13 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket14 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest11, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer13);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint15 = notebookSocket14.getRemote();
    java.lang.String str16 = notebookSocket14.getProtocol();
    org.eclipse.jetty.websocket.api.Session session17 = notebookSocket14.getSession();
    notebookSocket14.onWebSocketText("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    byte[] byte_array22 = new byte[] { (byte)1, (byte)-1 };
    notebookSocket14.onWebSocketBinary(byte_array22, 0, (int)(short)0);
    notebookSocket10.onWebSocketBinary(byte_array22, (int)' ', (int)'#');
    notebookSocket3.onWebSocketBinary(byte_array22, 0, 0);
    org.eclipse.jetty.websocket.api.Session session32 = notebookSocket3.getSession();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "cn"+ "'", str16.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session32);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

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
    javax.ws.rs.core.Response response19 = interpreterRestApi16.updateSetting("groupOfNames", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.451");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHubRealm0.setZeppelinhubUrl("org.apache.zeppelin.realm.LdapRealm_781");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

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
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_832");
    
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
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver5 = activeDirectoryGroupRealm0.getRolePermissionResolver();
    activeDirectoryGroupRealm0.setAuthorizationCachingEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo8 = null;
    activeDirectoryGroupRealm0.setAuthenticationCache(cache_obj_authenticationInfo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver5);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    java.lang.String str7 = ldapRealm0.getName();
    boolean b8 = ldapRealm0.isAuthorizationEnabled();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str9 = ldapRealm0.getPermissionsByRole();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_840"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_840"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str9);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

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
    javax.ws.rs.core.Response.Status status22 = null;
    jsonresponse_jobListener21.setCode(status22);
    org.apache.zeppelin.server.JsonResponse<?> jsonresponse_wildcard26 = jsonresponse_jobListener21.addCookie("org.apache.zeppelin.realm.LdapRealm.authenticationCache.765", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_wildcard26);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    ldapRealm7.setAuthorizationEnabled(false);
    ldapRealm7.setAuthenticationCachingEnabled(false);
    ldapRealm7.setUserSearchBase("hi!");
    java.lang.String str16 = ldapRealm7.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo17 = null;
    ldapRealm7.setAuthorizationCache(cache_obj_authorizationInfo17);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver19 = ldapRealm7.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory20 = ldapRealm7.getContextFactory();
    ldapRealm0.setContextFactory(ldapContextFactory20);
    ldapRealm0.setAuthorizationEnabled(true);
    java.util.Map<java.lang.String,java.lang.String> map_str_str24 = ldapRealm0.getListRoles();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str24);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

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
    ldapRealm0.onLogout(principalCollection13);
    org.apache.shiro.subject.PrincipalCollection principalCollection15 = null;
    org.apache.shiro.authz.Permission[] permission_array16 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission17 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission17, permission_array16);
    ldapRealm0.checkPermissions(principalCollection15, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission17);
    
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
    org.junit.Assert.assertNotNull(permission_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponseContent(status0, "org.apache.zeppelin.realm.LdapRealm_139");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    org.apache.zeppelin.rest.message.NewNoteRequest newNoteRequest0 = new org.apache.zeppelin.rest.message.NewNoteRequest();
    java.util.List<org.apache.zeppelin.rest.message.NewParagraphRequest> list_newParagraphRequest1 = newNoteRequest0.getParagraphs();
    java.util.List<org.apache.zeppelin.rest.message.NewParagraphRequest> list_newParagraphRequest2 = newNoteRequest0.getParagraphs();
    java.lang.String str3 = newNoteRequest0.getName();
    java.util.List<org.apache.zeppelin.rest.message.NewParagraphRequest> list_newParagraphRequest4 = newNoteRequest0.getParagraphs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_newParagraphRequest1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_newParagraphRequest2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_newParagraphRequest4);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer6 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket7 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest4, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer6);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint8 = notebookSocket7.getRemote();
    java.lang.String str9 = notebookSocket7.getProtocol();
    org.eclipse.jetty.websocket.api.Session session10 = notebookSocket7.getSession();
    notebookSocket7.onWebSocketText("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    org.apache.zeppelin.notebook.socket.Message message13 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.getInterpreterBindings(notebookSocket7, message13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "cn"+ "'", str9.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session10);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.lang.Iterable> jsonresponse_iterable2 = new org.apache.zeppelin.server.JsonResponse<java.lang.Iterable>(status0, "org.apache.zeppelin.realm.LdapRealm_175");
    javax.ws.rs.core.Response.Status status3 = jsonresponse_iterable2.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status3);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.helium.HeliumPackage heliumPackage4 = null;
    notebookServer0.onLoad("cn", "cn", "org.apache.zeppelin.realm.LdapRealm_47", heliumPackage4);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer0.onAdd("(.*)", angularObject7);
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest9, "subtree", notebookSocketListener11);
    org.apache.zeppelin.notebook.socket.Message message13 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.saveInterpreterBindings(notebookSocket12, message13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookInformationListener6.onParagraphRemove(paragraph7);
    org.apache.zeppelin.notebook.Note note9 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener6.onNoteCreate(note9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.send("org.apache.zeppelin.realm.LdapRealm.authorizationCache.510");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response8 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_205", "groupOfNames");
    javax.ws.rs.core.Response response11 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_265");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response13 = heliumRestApi2.disablePackage("org.apache.zeppelin.realm.LdapRealm.authenticationCache.356");
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
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

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
    org.apache.zeppelin.server.JsonResponse<?> jsonresponse_wildcard16 = jsonresponse_jndiLdapRealm13.addCookie("org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm_189");
    
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
    org.junit.Assert.assertNotNull(jsonresponse_wildcard16);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    ldapRealm0.setAuthenticationCacheName("org.apache.zeppelin.realm.LdapRealm_484");
    ldapRealm0.setUserSearchAttributeTemplate("hi!");

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    ldapRealm0.setUserSearchBase("cn");
    ldapRealm0.setAuthenticationCachingEnabled(false);
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm12 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm12.setUserSearchAttributeTemplate("hi!");
    java.lang.String str15 = ldapRealm12.getUserSearchAttributeTemplate();
    boolean b16 = ldapRealm12.isAuthorizationCachingEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection17 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm18 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm18.setUserSearchAttributeTemplate("hi!");
    java.lang.String str21 = ldapRealm18.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection22 = null;
    java.util.Collection collection23 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b24 = ldapRealm18.isPermittedAll(principalCollection22, (java.util.Collection<org.apache.shiro.authz.Permission>)collection23);
    boolean b25 = ldapRealm18.isGroupSearchEnableMatchingRuleInChain();
    org.apache.shiro.subject.PrincipalCollection principalCollection26 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm27 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm27.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver30 = ldapRealm27.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection31 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm32 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm32.setUserSearchAttributeTemplate("hi!");
    ldapRealm32.setAuthorizationEnabled(false);
    ldapRealm32.setAuthenticationCachingEnabled(false);
    ldapRealm32.setUserSearchBase("hi!");
    java.lang.String str41 = ldapRealm32.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection42 = null;
    java.lang.String[] str_array44 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array45 = ldapRealm32.isPermitted(principalCollection42, str_array44);
    boolean[] b_array46 = ldapRealm27.isPermitted(principalCollection31, str_array44);
    boolean[] b_array47 = ldapRealm18.isPermitted(principalCollection26, str_array44);
    boolean[] b_array48 = ldapRealm12.isPermitted(principalCollection17, str_array44);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermissions(principalCollection11, str_array44);
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array48);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener9 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest7, "subtree", notebookSocketListener9);
    notebookServer0.onMessage(notebookSocket10, "org.apache.zeppelin.realm.LdapRealm_187");
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket10.onWebSocketClose((int)(short)-1, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.356");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
    ldapRealm0.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = ldapRealm0.isPermitted(principalCollection10, "");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
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
    org.apache.zeppelin.search.SearchService searchService25 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi26 = new org.apache.zeppelin.rest.NotebookRestApi(notebook0, notebookServer1, searchService25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "cn"+ "'", str18.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session19);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

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
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener19 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket20 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest17, "subtree", notebookSocketListener19);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint21 = notebookSocket20.getRemote();
    org.eclipse.jetty.websocket.api.Session session22 = notebookSocket20.getSession();
    org.eclipse.jetty.websocket.api.Session session23 = notebookSocket20.getSession();
    javax.servlet.http.HttpServletRequest httpServletRequest24 = notebookSocket20.getRequest();
    org.apache.zeppelin.notebook.socket.Message message25 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.unicastNoteJobInfo(notebookSocket20, message25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest24);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
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
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph16 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph16, paragraph17);
    notebookServer1.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_267", (int)(byte)100, "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");
    org.apache.zeppelin.search.SearchService searchService24 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi25 = new org.apache.zeppelin.rest.NotebookRestApi(notebook0, notebookServer1, searchService24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    java.lang.String str2 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str3 = ldapRealm0.getPrincipalRegex();
    ldapRealm0.setGroupIdAttribute("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    boolean b6 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setUserSearchAttributeName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(.*)"+ "'", str3.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener5 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest6, "subtree", notebookSocketListener8);
    boolean b10 = notebookSocket9.isConnected();
    boolean b11 = notebookSocket9.isConnected();
    notebookServer1.onMessage(notebookSocket9, "org.apache.zeppelin.realm.LdapRealm_205");
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi14 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    javax.ws.rs.core.Response response16 = notebookRepoRestApi14.updateRepoSetting("org.apache.zeppelin.realm.LdapRealm_780");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response16);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = new org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = notebookRepoSettingsRequest0.settings;
    boolean b2 = notebookRepoSettingsRequest0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.scheduler.JobListener> jsonresponse_jobListener2 = new org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.scheduler.JobListener>(status0, "org.apache.zeppelin.realm.LdapRealm_306");
    org.apache.zeppelin.server.JsonResponse<?> jsonresponse_wildcard5 = jsonresponse_jobListener2.addCookie("", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_wildcard5);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.545", (int)' ', "");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener12 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException14 = new org.apache.zeppelin.rest.exception.ForbiddenException();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException16 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException14, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.log("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185", (java.lang.Throwable)notFoundException16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = credentialRestApi1.getCredentials("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.broadcastUpdateNoteJobInfo((long)100);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    boolean b10 = notebookServer0.checkOrigin(httpServletRequest8, "org.apache.zeppelin.realm.LdapRealm_47");
    org.eclipse.jetty.websocket.servlet.WebSocketServletFactory webSocketServletFactory11 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.configure(webSocketServletFactory11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response7 = interpreterRestApi5.getSetting("org.apache.zeppelin.realm.LdapRealm_139");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = interpreterRestApi5.listRepositories();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = newInterpreterSettingRequest0.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = newInterpreterSettingRequest0.getOption();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = newInterpreterSettingRequest0.getProperties();
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = newInterpreterSettingRequest0.getProperties();
    java.lang.String str5 = newInterpreterSettingRequest0.getGroup();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = newInterpreterSettingRequest0.getOption();
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = newInterpreterSettingRequest0.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str7);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    javax.ws.rs.core.Response response3 = credentialRestApi1.putCredentials("{}");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = credentialRestApi1.putCredentials("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    org.apache.shiro.authz.Permission permission8 = null;
    boolean b9 = ldapRealm0.isPermitted(principalCollection7, permission8);
    ldapRealm0.setPagingSize((int)(short)-1);
    ldapRealm0.init();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    ldapRealm0.setAuthenticationCacheName("org.apache.zeppelin.realm.LdapRealm_484");
    ldapRealm0.setCachingEnabled(true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getAuthenticationCacheName();
    ldapRealm0.setGroupObjectClass("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.863"+ "'", str3.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.863"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener11 = notebookServer1.getNotebookInformationListener();
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm13.setUserSearchAttributeTemplate("hi!");
    java.lang.String str16 = ldapRealm13.getUserSearchAttributeTemplate();
    ldapRealm13.setUserObjectClass("hi!");
    int i19 = ldapRealm13.getPagingSize();
    java.lang.Class class20 = ldapRealm13.getAuthenticationTokenClass();
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = ldapRealm13.getListRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.onMetaInfosReceived("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", map_str_str21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str21);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

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
    java.lang.String str16 = ldapRealm0.getGroupIdAttribute();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.150"+ "'", str16.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
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
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchFilter("");
    ldapRealm0.setCachingEnabled(true);
    java.lang.String str8 = ldapRealm0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_867"+ "'", str8.equals("org.apache.zeppelin.realm.LdapRealm_867"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.Realm> jsonresponse_realm1 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.Realm>(status0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b2 = org.apache.zeppelin.utils.SecurityUtils.isValidOrigin("org.apache.zeppelin.realm.LdapRealm_262", zeppelinConfiguration1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener9 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest7, "subtree", notebookSocketListener9);
    notebookServer0.onMessage(notebookSocket10, "org.apache.zeppelin.realm.LdapRealm_187");
    java.lang.String str13 = notebookSocket10.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

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
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer1;
    
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
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.notebook.Note note4 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastParagraph(note4, paragraph5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.lang.String[] str_array8 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str9 = new java.util.ArrayList<java.lang.String>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str9, str_array8);
    boolean[] b_array11 = ldapRealm0.hasRoles(principalCollection4, (java.util.List<java.lang.String>)arraylist_str9);
    org.apache.shiro.subject.PrincipalCollection principalCollection12 = null;
    boolean b14 = ldapRealm0.hasRole(principalCollection12, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");
    org.apache.shiro.subject.PrincipalCollection principalCollection15 = null;
    org.apache.shiro.authz.Permission permission16 = null;
    boolean b17 = ldapRealm0.isPermitted(principalCollection15, permission16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    javax.ws.rs.core.Response.Status status2 = null;
    javax.ws.rs.core.Response.Status status4 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array7 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo8 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo8, interpreterInfo_array7);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList11 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo8, false);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo12 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status4, (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo8);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo13 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status2, "", (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo8);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList15 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm_623", "org.apache.zeppelin.realm.LdapRealm_599", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo8, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponseContent(status0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.863");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = ldapRealm0.getListRoles();
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    ldapRealm0.setPermissionResolver(permissionResolver5);
    ldapRealm0.setUserDnTemplate("{\n  \"message\": \"hi!\"\n}");
    boolean b9 = ldapRealm0.isAuthenticationCachingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

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
    boolean b14 = notebookServer2.checkOrigin(httpServletRequest12, "org.apache.zeppelin.realm.LdapRealm_93");
    notebookServer2.broadcastUpdateNoteJobInfo(100L);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator17 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

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
    javax.ws.rs.core.Response response15 = interpreterRestApi10.updateSetting("org.apache.zeppelin.realm.LdapRealm_623", "org.apache.zeppelin.realm.LdapRealm_366");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response12);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    pamRealm0.setService("");
    pamRealm0.setAuthorizationCachingEnabled(true);
    pamRealm0.setService("org.apache.zeppelin.realm.LdapRealm_578");
    org.apache.zeppelin.realm.PamRealm pamRealm7 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver8 = pamRealm7.getPermissionResolver();
    pamRealm0.setPermissionResolver(permissionResolver8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver8);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm3 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory4 = activeDirectoryGroupRealm3.getLdapContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory4);
    boolean b6 = activeDirectoryGroupRealm0.isAuthorizationCachingEnabled();
    activeDirectoryGroupRealm0.setUrl("org.apache.zeppelin.realm.LdapRealm.authenticationCache.545");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

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
    org.apache.zeppelin.notebook.Note note17 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener16.onNoteCreate(note17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket15);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    boolean b9 = notebookServer0.checkOrigin(httpServletRequest7, "cn");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onRemove("org.apache.zeppelin.realm.LdapRealm_262", "{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm_623", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

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
    org.apache.zeppelin.notebook.Paragraph paragraph20 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage22 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputUpdate(paragraph20, (int)(short)-1, interpreterResultMessage22);
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
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

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
    org.eclipse.jetty.websocket.servlet.WebSocketServletFactory webSocketServletFactory15 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.configure(webSocketServletFactory15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchFilter("");
    ldapRealm0.setGroupSearchEnableMatchingRuleInChain(false);
    java.lang.String str8 = ldapRealm0.getName();
    ldapRealm0.setUserObjectClass("org.apache.zeppelin.realm.LdapRealm_780");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_882"+ "'", str8.equals("org.apache.zeppelin.realm.LdapRealm_882"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    org.apache.zeppelin.rest.SecurityRestApi securityRestApi0 = new org.apache.zeppelin.rest.SecurityRestApi();
    javax.ws.rs.core.Response response1 = securityRestApi0.ticket();
    javax.ws.rs.core.Response response2 = securityRestApi0.ticket();
    javax.ws.rs.core.Response response3 = securityRestApi0.ticket();
    javax.ws.rs.core.Response response5 = securityRestApi0.getUserList("org.apache.zeppelin.realm.LdapRealm_529");
    javax.ws.rs.core.Response response6 = securityRestApi0.ticket();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response6);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher5 = null;
    ldapRealm0.setCredentialsMatcher(credentialsMatcher5);
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm_47");
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver9 = ldapRealm0.getRolePermissionResolver();
    ldapRealm0.setGroupSearchBase("org.apache.zeppelin.realm.LdapRealm_301");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver9);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    org.apache.zeppelin.rest.message.NewNoteRequest newNoteRequest0 = new org.apache.zeppelin.rest.message.NewNoteRequest();
    java.util.List<org.apache.zeppelin.rest.message.NewParagraphRequest> list_newParagraphRequest1 = newNoteRequest0.getParagraphs();
    java.lang.String str2 = newNoteRequest0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_newParagraphRequest1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

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
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer22 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket23 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest20, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer22);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint24 = notebookSocket23.getRemote();
    java.lang.String str25 = notebookSocket23.getProtocol();
    org.eclipse.jetty.websocket.api.Session session26 = notebookSocket23.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException28 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket23.onWebSocketError((java.lang.Throwable)forbiddenException28);
    org.apache.zeppelin.notebook.socket.Message message30 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.unicastNoteJobInfo(notebookSocket23, message30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "cn"+ "'", str25.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session26);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest1 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = notebookRepoSettingsRequest1.settings;
    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest3 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = notebookRepoSettingsRequest3.settings;
    org.apache.zeppelin.realm.LdapRealm ldapRealm5 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str6 = ldapRealm5.getListRoles();
    notebookRepoSettingsRequest3.settings = map_str_str6;
    notebookRepoSettingsRequest1.settings = map_str_str6;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str6);
    activeDirectoryGroupRealm0.setAuthorizationCacheName("org.apache.zeppelin.realm.LdapRealm.authorizationCache.881");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str6);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.545", (int)' ', "");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onRemoteRunParagraph("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "org.apache.zeppelin.realm.LdapRealm_371");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    ldapRealm0.onLogout(principalCollection7);
    ldapRealm0.setName("org.apache.zeppelin.realm.LdapRealm_256");
    java.lang.String str11 = ldapRealm0.getUserSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    org.apache.zeppelin.notebook.Note note7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastParagraph(note7, paragraph8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response9 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109");
    javax.ws.rs.core.Response response11 = interpreterRestApi7.removeRepository("{\n  \"message\": \"hi!\"\n}");
    javax.ws.rs.core.Response response13 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response16 = interpreterRestApi7.updateSetting("{}", "org.apache.zeppelin.realm.LdapRealm_152");
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
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

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
    org.apache.zeppelin.notebook.Note note22 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener23 = notebookServer1.getParagraphJobListener(note22);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.init();
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener23);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    corsFilter0.destroy();
    corsFilter0.destroy();
    corsFilter0.destroy();
    javax.servlet.ServletRequest servletRequest4 = null;
    javax.servlet.ServletResponse servletResponse5 = null;
    javax.servlet.FilterChain filterChain6 = null;
    // The following exception was thrown during execution in test generation
    try {
    corsFilter0.doFilter(servletRequest4, servletResponse5, filterChain6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

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
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputAppend(paragraph24, (int)(short)0, "org.apache.zeppelin.realm.LdapRealm_676");
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
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer4 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer4.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject6);
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer4.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject9);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest2, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer4);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer4);
    org.apache.zeppelin.realm.LdapRealm ldapRealm14 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm14.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver17 = ldapRealm14.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection18 = null;
    java.lang.String[] str_array22 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str23, str_array22);
    boolean[] b_array25 = ldapRealm14.hasRoles(principalCollection18, (java.util.List<java.lang.String>)arraylist_str23);
    notebookServer4.broadcastInterpreterBindings("anonymous", (java.util.List)arraylist_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array25);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

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
    org.apache.zeppelin.notebook.Note note22 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener23 = notebookServer1.getParagraphJobListener(note22);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo25 = null;
    java.util.HashSet<java.lang.String> hashset_str26 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str27 = notebookServer1.generateNotesInfo(true, authenticationInfo25, (java.util.Set<java.lang.String>)hashset_str26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str26);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = heliumRestApi2.getVisualizationPackageOrder("org.apache.zeppelin.realm.LdapRealm_366");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    boolean b9 = notebookServer0.checkOrigin(httpServletRequest7, "cn");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph10 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph10, paragraph11);
    java.util.Properties properties14 = null;
    java.util.Properties properties15 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array16 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency17 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency17, dependency_array16);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption19 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest20 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties15, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency17, interpreterOption19);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption21 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest22 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties14, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency17, interpreterOption21);
    notebookServer0.broadcastInterpreterBindings("org.apache.zeppelin.realm.LdapRealm_845", (java.util.List)arraylist_dependency17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator5 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    javax.servlet.ServletConfig servletConfig6 = notebookServer0.getServletConfig();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = null;
    java.util.HashSet<java.lang.String> hashset_str8 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNoteList(authenticationInfo7, (java.util.HashSet)hashset_str8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str8);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    org.apache.zeppelin.rest.message.NewNoteRequest newNoteRequest0 = new org.apache.zeppelin.rest.message.NewNoteRequest();
    java.lang.String str1 = newNoteRequest0.getName();
    java.lang.String str2 = newNoteRequest0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

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
    org.apache.zeppelin.notebook.Note note24 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener25 = notebookServer0.getParagraphJobListener(note24);
    javax.ws.rs.core.Response.Status status31 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array34 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo35 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35, interpreterInfo_array34);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList38 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35, false);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo39 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status31, (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList41 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.rest.exception.NotFoundException", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35, true);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList43 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "org.apache.zeppelin.realm.LdapRealm_306", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35, true);
    notebookServer0.broadcastInterpreterBindings("org.apache.zeppelin.realm.LdapRealm.authenticationCache.555", (java.util.List)arraylist_interpreterInfo35);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage48 = null;
    notebookServer0.onLoad("org.apache.zeppelin.realm.LdapRealm.authenticationCache.312", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "org.apache.zeppelin.realm.LdapRealm_825", heliumPackage48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "cn"+ "'", str17.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    boolean b6 = ldapRealm0.isPermitted(principalCollection4, "org.apache.zeppelin.realm.LdapRealm_654");
    ldapRealm0.setGroupIdAttribute("org.apache.zeppelin.realm.LdapRealm_882");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.cache.CacheManager cacheManager3 = null;
    ldapRealm0.setCacheManager(cacheManager3);
    java.lang.String str5 = ldapRealm0.getGroupSearchBase();
    ldapRealm0.setPrincipalRegex("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339");
    ldapRealm0.setGroupIdAttribute("org.apache.zeppelin.realm.LdapRealm_229");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = notebookRestApi0.createNote("org.apache.zeppelin.realm.LdapRealm_793");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    ldapRealm0.setPermissionsByRole("org.apache.zeppelin.realm.LdapRealm_152");
    java.lang.String str4 = ldapRealm0.getPrincipalRegex();
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("org.apache.zeppelin.realm.LdapRealm_300");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(.*)"+ "'", str4.equals("(.*)"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = heliumRestApi2.enablePackage("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache", "org.apache.zeppelin.realm.LdapRealm_366");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    javax.ws.rs.core.Response response9 = heliumRestApi2.getSpellConfigUsingMagic("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response10 = heliumRestApi2.getAllEnabledPackageInfo();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response9);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setPermissionsByRole("org.apache.zeppelin.rest.exception.ForbiddenException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher5 = null;
    ldapRealm0.setCredentialsMatcher(credentialsMatcher5);
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver7 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver7);
    org.apache.zeppelin.realm.LdapRealm ldapRealm9 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm9.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver12 = ldapRealm9.getPermissionResolver();
    boolean b13 = ldapRealm9.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm15 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm15.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver18 = ldapRealm15.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection19 = null;
    java.lang.String[] str_array23 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str24 = new java.util.ArrayList<java.lang.String>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str24, str_array23);
    boolean[] b_array26 = ldapRealm15.hasRoles(principalCollection19, (java.util.List<java.lang.String>)arraylist_str24);
    boolean[] b_array27 = ldapRealm9.hasRoles(principalCollection14, (java.util.List<java.lang.String>)arraylist_str24);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo28 = null;
    ldapRealm9.setAuthorizationCache(cache_obj_authorizationInfo28);
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher30 = ldapRealm9.getCredentialsMatcher();
    ldapRealm0.setCredentialsMatcher(credentialsMatcher30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher30);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

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
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response24 = interpreterRestApi21.updateSetting("org.apache.zeppelin.realm.LdapRealm.authorizationCache.510", "org.apache.zeppelin.realm.LdapRealm_301");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener5 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest6, "subtree", notebookSocketListener8);
    boolean b10 = notebookSocket9.isConnected();
    boolean b11 = notebookSocket9.isConnected();
    notebookServer1.onMessage(notebookSocket9, "org.apache.zeppelin.realm.LdapRealm_205");
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi14 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response15 = notebookRepoRestApi14.listRepoSettings();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    java.lang.String str8 = ldapRealm0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_913"+ "'", str8.equals("org.apache.zeppelin.realm.LdapRealm_913"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener9 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest7, "subtree", notebookSocketListener9);
    notebookServer0.onMessage(notebookSocket10, "org.apache.zeppelin.realm.LdapRealm_187");
    org.apache.zeppelin.socket.NotebookServer notebookServer13 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject15 = null;
    notebookServer13.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject15);
    org.apache.zeppelin.display.AngularObject angularObject18 = null;
    notebookServer13.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject18);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener20 = notebookServer13.getNotebookInformationListener();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init((javax.servlet.ServletConfig)notebookServer13);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener20);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    notebookServer0.broadcastUpdateNoteJobInfo((-1L));
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    javax.servlet.ServletConfig servletConfig12 = notebookServer0.getServletConfig();
    org.apache.zeppelin.realm.LdapRealm ldapRealm16 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm16.setUserSearchAttributeTemplate("hi!");
    ldapRealm16.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo21 = null;
    ldapRealm16.setAuthenticationCache(cache_obj_authenticationInfo21);
    java.lang.String str23 = ldapRealm16.getName();
    boolean b24 = ldapRealm16.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection25 = null;
    org.apache.shiro.authz.Permission permission26 = null;
    boolean b27 = ldapRealm16.isPermitted(principalCollection25, permission26);
    javax.ws.rs.core.Response.Status status28 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm29 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm29.setUserSearchAttributeTemplate("hi!");
    ldapRealm29.setAuthorizationEnabled(false);
    ldapRealm29.setAuthenticationCachingEnabled(false);
    ldapRealm29.setUserSearchBase("hi!");
    java.lang.String str38 = ldapRealm29.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo39 = null;
    ldapRealm29.setAuthorizationCache(cache_obj_authorizationInfo39);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm41 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status28, (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm29);
    ldapRealm29.setName("org.apache.zeppelin.rest.exception.NotFoundException");
    java.util.Map<java.lang.String,java.lang.String> map_str_str44 = ldapRealm29.getRolesByGroup();
    ldapRealm16.setRolesByGroup(map_str_str44);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onParaInfosReceived("hi!", "{\"body\":[\"org.apache.zeppelin.realm.LdapRealm_256\",\"org.apache.zeppelin.rest.exception.NotFoundException\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.260\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.266\",\"{\\\"message\\\":\\\"hi!\\\"}\",\"{\\n  \\\"message\\\": \\\"hi!\\\"\\n}\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.272\",\"org.apache.zeppelin.realm.LdapRealm_75\",\"org.apache.zeppelin.realm.LdapRealm_187\",\"org.apache.zeppelin.realm.LdapRealm_133\",\"org.apache.zeppelin.realm.LdapRealm_133\",\"org.apache.zeppelin.realm.LdapRealm_246\",\"org.apache.zeppelin.rest.exception.NotFoundException\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.167\",\"org.apache.zeppelin.realm.LdapRealm_109\",\"org.apache.zeppelin.realm.LdapRealm_93\",\"org.apache.zeppelin.realm.LdapRealm_175\",\"hi!\",\"org.apache.zeppelin.realm.LdapRealm_189\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"{}\",\"org.apache.zeppelin.realm.LdapRealm_229\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.272\",\"org.apache.zeppelin.realm.LdapRealm_306\",\"org.apache.zeppelin.realm.LdapRealm_205\",\"groupOfNames\",\"\",\"org.apache.zeppelin.realm.LdapRealm_301\",\"org.apache.zeppelin.realm.LdapRealm_134\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"{}\",\"org.apache.zeppelin.realm.LdapRealm_189\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.132\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.260\",\"org.apache.zeppelin.realm.LdapRealm_301\"]}", "org.apache.zeppelin.realm.LdapRealm_366", map_str_str44);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_919"+ "'", str23.equals("org.apache.zeppelin.realm.LdapRealm_919"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str44);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    boolean b8 = ldapRealm0.supports(authenticationToken7);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo9 = ldapRealm0.getAuthenticationCache();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo9);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    org.jvnet.libpam.UnixUser unixUser0 = null;
    org.apache.zeppelin.realm.UserPrincipal userPrincipal1 = new org.apache.zeppelin.realm.UserPrincipal(unixUser0);
    org.jvnet.libpam.UnixUser unixUser2 = userPrincipal1.getUnixUser();
    org.jvnet.libpam.UnixUser unixUser3 = userPrincipal1.getUnixUser();
    org.jvnet.libpam.UnixUser unixUser4 = userPrincipal1.getUnixUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(unixUser2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(unixUser3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(unixUser4);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener4 = notebookServer0.getNotebookInformationListener();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type9 = null;
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm.authenticationCache.593", "anonymous", (int)(byte)100, "org.apache.zeppelin.realm.LdapRealm_882", type9, "groupOfNames");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener4);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
    notebookInformationListener4.onParagraphRemove(paragraph5);
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    org.apache.zeppelin.scheduler.Job.Status status8 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener4.onParagraphStatusChange(paragraph7, status8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

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
    ldapRealm0.setGroupObjectClass("org.apache.zeppelin.realm.LdapRealm.authenticationCache.451");
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.922"+ "'", str8.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.922"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array13 = ldapRealm0.isPermitted(principalCollection10, str_array12);
    ldapRealm0.setPrincipalRegex("org.apache.zeppelin.realm.LdapRealm_75");
    ldapRealm0.setPermissionsByRole("org.apache.zeppelin.realm.LdapRealm_133");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    ldapRealm0.setUserSearchBase("cn");
    boolean b9 = ldapRealm0.isCachingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str2);
    java.util.List<java.lang.String> list_str5 = getUserList0.getUserList(activeDirectoryGroupRealm1, "cn");
    org.apache.zeppelin.realm.LdapRealm ldapRealm6 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm6.setUserSearchAttributeTemplate("hi!");
    java.lang.String str9 = ldapRealm6.getUserSearchAttributeTemplate();
    java.lang.String str10 = ldapRealm6.getUserSearchAttributeName();
    boolean b11 = ldapRealm6.isAuthorizationCachingEnabled();
    boolean b12 = ldapRealm6.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher13 = ldapRealm6.getCredentialsMatcher();
    org.apache.zeppelin.realm.LdapRealm ldapRealm14 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm14.setUserSearchAttributeTemplate("hi!");
    java.lang.String str17 = ldapRealm14.getUserSearchAttributeTemplate();
    ldapRealm14.setUserObjectClass("hi!");
    boolean b20 = ldapRealm14.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm21 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm21.setUserSearchAttributeTemplate("hi!");
    ldapRealm21.setAuthorizationEnabled(false);
    ldapRealm21.setAuthenticationCachingEnabled(false);
    ldapRealm21.setUserSearchBase("hi!");
    java.lang.String str30 = ldapRealm21.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo31 = null;
    ldapRealm21.setAuthorizationCache(cache_obj_authorizationInfo31);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver33 = ldapRealm21.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory34 = ldapRealm21.getContextFactory();
    ldapRealm14.setContextFactory(ldapContextFactory34);
    ldapRealm6.setContextFactory(ldapContextFactory34);
    activeDirectoryGroupRealm1.setLdapContextFactory(ldapContextFactory34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory34);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("org.apache.zeppelin.realm.LdapRealm_447");

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener7 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket8 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest5, "subtree", notebookSocketListener7);
    boolean b9 = notebookSocket8.isConnected();
    notebookServer1.unsubscribeNoteJobInfo(notebookSocket8);
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = notebookServer1.doWebSocketConnect(httpServletRequest11, "org.apache.zeppelin.realm.LdapRealm_189");
    org.apache.zeppelin.search.SearchService searchService14 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi15 = new org.apache.zeppelin.rest.NotebookRestApi(notebook0, notebookServer1, searchService14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket13);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("org.apache.zeppelin.realm.LdapRealm_306");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array13 = ldapRealm0.isPermitted(principalCollection10, str_array12);
    ldapRealm0.setPrincipalRegex("org.apache.zeppelin.realm.LdapRealm_75");
    java.lang.String str16 = ldapRealm0.getGroupObjectClass();
    org.apache.shiro.subject.PrincipalCollection principalCollection17 = null;
    org.apache.shiro.authz.Permission permission18 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection17, permission18);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "groupOfNames"+ "'", str16.equals("groupOfNames"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    java.lang.Class class3 = activeDirectoryGroupRealm0.getAuthenticationTokenClass();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory4 = activeDirectoryGroupRealm0.getLdapContextFactory();
    org.apache.zeppelin.realm.LdapRealm ldapRealm5 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm5.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver8 = ldapRealm5.getPermissionResolver();
    boolean b9 = ldapRealm5.isAuthenticationCachingEnabled();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo10 = null;
    ldapRealm5.setAuthenticationCache(cache_obj_authenticationInfo10);
    org.apache.shiro.subject.PrincipalCollection principalCollection12 = null;
    org.apache.shiro.authz.Permission permission13 = null;
    boolean b14 = ldapRealm5.isPermitted(principalCollection12, permission13);
    org.apache.zeppelin.realm.LdapRealm ldapRealm15 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm15.setUserSearchAttributeTemplate("hi!");
    java.lang.String str18 = ldapRealm15.getUserSearchAttributeTemplate();
    ldapRealm15.setUserObjectClass("hi!");
    ldapRealm15.setAuthenticationCacheName("");
    org.apache.zeppelin.realm.LdapRealm ldapRealm23 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm23.setUserSearchAttributeTemplate("hi!");
    java.lang.String str26 = ldapRealm23.getUserSearchAttributeTemplate();
    ldapRealm23.setUserObjectClass("hi!");
    boolean b29 = ldapRealm23.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm30 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm30.setUserSearchAttributeTemplate("hi!");
    ldapRealm30.setAuthorizationEnabled(false);
    ldapRealm30.setAuthenticationCachingEnabled(false);
    ldapRealm30.setUserSearchBase("hi!");
    java.lang.String str39 = ldapRealm30.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo40 = null;
    ldapRealm30.setAuthorizationCache(cache_obj_authorizationInfo40);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver42 = ldapRealm30.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory43 = ldapRealm30.getContextFactory();
    ldapRealm23.setContextFactory(ldapContextFactory43);
    ldapRealm15.setContextFactory(ldapContextFactory43);
    ldapRealm5.setContextFactory(ldapContextFactory43);
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory43);
    java.lang.String str48 = activeDirectoryGroupRealm0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "org.apache.zeppelin.realm.ActiveDirectoryGroupRealm_931"+ "'", str48.equals("org.apache.zeppelin.realm.ActiveDirectoryGroupRealm_931"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

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
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener22 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket23 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest20, "subtree", notebookSocketListener22);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint24 = notebookSocket23.getRemote();
    org.eclipse.jetty.websocket.api.Session session25 = notebookSocket23.getSession();
    org.eclipse.jetty.websocket.api.Session session26 = notebookSocket23.getSession();
    org.apache.zeppelin.notebook.socket.Message message27 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.getInterpreterBindings(notebookSocket23, message27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session26);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.lang.String str6 = notebookServer0.getServletInfo();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type11 = null;
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm_366", "org.apache.zeppelin.realm.LdapRealm_93", 100, "org.apache.zeppelin.realm.LdapRealm_93", type11, "{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}");
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator14 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = null;
    org.apache.zeppelin.realm.LdapGroupRealm ldapGroupRealm17 = new org.apache.zeppelin.realm.LdapGroupRealm();
    javax.naming.ldap.LdapContext ldapContext19 = null;
    java.util.Set<java.lang.String> set_str21 = ldapGroupRealm17.getRoleNamesForUser("", ldapContext19, "");
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str22 = notebookServer0.generateNotesInfo(true, authenticationInfo16, set_str21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str21);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

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
    java.lang.String str14 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserObjectClass("org.apache.zeppelin.realm.LdapRealm_175");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "subtree"+ "'", str14.equals("subtree"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    org.apache.zeppelin.realm.LdapGroupRealm ldapGroupRealm0 = new org.apache.zeppelin.realm.LdapGroupRealm();
    javax.naming.ldap.LdapContext ldapContext2 = null;
    java.util.Set<java.lang.String> set_str4 = ldapGroupRealm0.getRoleNamesForUser("org.apache.zeppelin.realm.LdapRealm_654", ldapContext2, "(.*)");
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm6 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm6.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm9 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory10 = activeDirectoryGroupRealm9.getLdapContextFactory();
    activeDirectoryGroupRealm6.setLdapContextFactory(ldapContextFactory10);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authz.AuthorizationInfo authorizationInfo12 = ldapGroupRealm0.queryForAuthorizationInfo(principalCollection5, ldapContextFactory10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory10);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

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
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm19 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm19.setSearchBase("hi!");
    activeDirectoryGroupRealm19.setHadoopSecurityCredentialPath("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    org.apache.zeppelin.realm.LdapRealm ldapRealm24 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm24.setUserSearchAttributeTemplate("hi!");
    ldapRealm24.setAuthorizationEnabled(false);
    ldapRealm24.setAuthenticationCachingEnabled(false);
    ldapRealm24.setUserSearchBase("hi!");
    java.lang.String str33 = ldapRealm24.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory34 = ldapRealm24.getContextFactory();
    activeDirectoryGroupRealm19.setLdapContextFactory(ldapContextFactory34);
    java.util.List<java.lang.String> list_str37 = getUserList0.getUserList(activeDirectoryGroupRealm19, "groupOfNames");
    org.apache.shiro.subject.PrincipalCollection principalCollection38 = null;
    // The following exception was thrown during execution in test generation
    try {
    activeDirectoryGroupRealm19.checkRole(principalCollection38, "org.apache.zeppelin.realm.LdapRealm_704");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_949"+ "'", str33.equals("org.apache.zeppelin.realm.LdapRealm_949"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("anonymous");

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener6 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket7 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest4, "subtree", notebookSocketListener6);
    boolean b8 = notebookSocket7.isConnected();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket7);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = notebookServer0.doWebSocketConnect(httpServletRequest10, "org.apache.zeppelin.realm.LdapRealm_189");
    org.apache.zeppelin.display.AngularObject angularObject14 = null;
    notebookServer0.onUpdate("org.apache.zeppelin.realm.LdapRealm_366", angularObject14);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo17 = null;
    java.util.HashSet<java.lang.String> hashset_str18 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.util.Map<java.lang.String,java.lang.String>> list_map_str_str19 = notebookServer0.generateNotesInfo(false, authenticationInfo17, (java.util.Set<java.lang.String>)hashset_str18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str18);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setUserDnTemplate("subtree");
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = ldapRealm0.getRolesByGroup();
    ldapRealm0.setUserSearchAttributeTemplate("org.apache.zeppelin.realm.LdapRealm_134");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str7);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener6 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    boolean b9 = notebookServer0.checkOrigin(httpServletRequest7, "cn");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    org.apache.zeppelin.realm.LdapRealm ldapRealm14 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm14.setUserSearchAttributeTemplate("hi!");
    java.lang.String str17 = ldapRealm14.getUserSearchAttributeTemplate();
    java.lang.String str18 = ldapRealm14.getUserSearchAttributeName();
    boolean b19 = ldapRealm14.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm20 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = ldapRealm20.getListRoles();
    ldapRealm14.setRolesByGroup(map_str_str21);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onParaInfosReceived("org.apache.zeppelin.realm.LdapRealm_187", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.555", "org.apache.zeppelin.realm.LdapRealm_134", map_str_str21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str21);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

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
    org.apache.zeppelin.notebook.Note note20 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl21 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer0, note20);
    org.apache.zeppelin.scheduler.Job job22 = null;
    org.apache.zeppelin.scheduler.Job.Status status23 = null;
    org.apache.zeppelin.scheduler.Job.Status status24 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl21.afterStatusChange(job22, status23, status24);
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
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setMemberAttribute("subtree");
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm_229");
    ldapRealm0.setPrincipalRegex("org.apache.zeppelin.realm.LdapRealm_262");
    java.lang.String str12 = ldapRealm0.getUserSearchAttributeName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str8 = ldapRealm7.getListRoles();
    ldapRealm0.setRolesByGroup(map_str_str8);
    boolean b10 = ldapRealm0.isCachingEnabled();
    java.lang.String str11 = ldapRealm0.getGroupIdAttribute();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "cn"+ "'", str11.equals("cn"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str2);
    activeDirectoryGroupRealm1.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm1.setName("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm1.setSearchBase("{}");
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    activeDirectoryGroupRealm1.onLogout(principalCollection10);
    java.util.List<java.lang.String> list_str13 = getUserList0.getUserList(activeDirectoryGroupRealm1, "member");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm14 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm14.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm17 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory18 = activeDirectoryGroupRealm17.getLdapContextFactory();
    activeDirectoryGroupRealm14.setLdapContextFactory(ldapContextFactory18);
    boolean b20 = activeDirectoryGroupRealm14.isAuthorizationCachingEnabled();
    activeDirectoryGroupRealm14.setSystemUsername("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339");
    java.util.List<java.lang.String> list_str24 = getUserList0.getUserList(activeDirectoryGroupRealm14, "org.apache.zeppelin.realm.LdapRealm_262");
    org.apache.zeppelin.realm.LdapRealm ldapRealm25 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm25.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver28 = ldapRealm25.getPermissionResolver();
    boolean b29 = ldapRealm25.isAuthenticationCachingEnabled();
    boolean b30 = ldapRealm25.isGroupSearchEnableMatchingRuleInChain();
    java.util.List<java.lang.String> list_str31 = getUserList0.getRolesList(ldapRealm25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

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
    org.eclipse.jetty.websocket.api.Session session13 = notebookSocket8.getSession();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session13);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    org.apache.zeppelin.realm.LdapRealm ldapRealm9 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str10 = ldapRealm9.getListRoles();
    ldapRealm0.setRolesByGroup(map_str_str10);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo12 = ldapRealm0.getAuthorizationCache();
    java.lang.String str13 = ldapRealm0.getUserObjectClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "person"+ "'", str13.equals("person"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response8 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.rest.exception.BadRequestException", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.593");
    javax.ws.rs.core.Response response10 = heliumRestApi2.getSinglePackageInfo("org.apache.zeppelin.realm.LdapRealm_781");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response10);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer7 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer7.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject9);
    org.apache.zeppelin.display.AngularObject angularObject12 = null;
    notebookServer7.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject12);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket14 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest5, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest3, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket15);
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
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

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
    org.apache.zeppelin.notebook.Note note24 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener25 = notebookServer0.getParagraphJobListener(note24);
    javax.ws.rs.core.Response.Status status31 = null;
    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array34 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo35 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35, interpreterInfo_array34);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList38 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35, false);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo39 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status31, (java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList41 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.rest.exception.NotFoundException", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35, true);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList43 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "org.apache.zeppelin.realm.LdapRealm_306", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo35, true);
    notebookServer0.broadcastInterpreterBindings("org.apache.zeppelin.realm.LdapRealm.authenticationCache.555", (java.util.List)arraylist_interpreterInfo35);
    org.eclipse.jetty.websocket.servlet.WebSocketServletFactory webSocketServletFactory45 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.configure(webSocketServletFactory45);
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
    org.junit.Assert.assertNotNull(paragraphJobListener25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

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
    javax.ws.rs.core.Response response16 = heliumRestApi2.getAllEnabledPackageInfo();
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
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    ldapRealm0.setUserSearchAttributeTemplate("subtree");
    ldapRealm0.setGroupIdAttribute("org.apache.zeppelin.realm.LdapRealm_306");
    java.util.Map<java.lang.String,java.lang.String> map_str_str11 = ldapRealm0.getListRoles();
    java.lang.String str12 = ldapRealm0.getGroupObjectClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "groupOfNames"+ "'", str12.equals("groupOfNames"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = newInterpreterSettingRequest0.getOption();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = newInterpreterSettingRequest0.getOption();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = newInterpreterSettingRequest0.getProperties();
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = newInterpreterSettingRequest0.getProperties();
    java.lang.String str5 = newInterpreterSettingRequest0.getGroup();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency6 = newInterpreterSettingRequest0.getDependencies();
    java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency7 = newInterpreterSettingRequest0.getDependencies();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_dependency6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_dependency7);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    org.eclipse.jetty.websocket.api.Session session5 = notebookSocket3.getSession();
    java.lang.String str6 = notebookSocket3.getProtocol();
    javax.servlet.http.HttpServletRequest httpServletRequest7 = notebookSocket3.getRequest();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "subtree"+ "'", str6.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest7);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm3 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory4 = activeDirectoryGroupRealm3.getLdapContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory4);
    activeDirectoryGroupRealm0.setSystemUsername("subtree");
    activeDirectoryGroupRealm0.setSystemUsername("org.apache.zeppelin.rest.exception.ForbiddenException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory4);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = ldapRealm0.getListRoles();
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    ldapRealm0.setPermissionResolver(permissionResolver5);
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm8 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str9 = null;
    activeDirectoryGroupRealm8.setGroupRolesMap(map_str_str9);
    org.apache.zeppelin.realm.LdapRealm ldapRealm11 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm11.setUserSearchAttributeTemplate("hi!");
    ldapRealm11.setAuthorizationEnabled(false);
    ldapRealm11.setAuthenticationCachingEnabled(false);
    ldapRealm11.setUserSearchBase("hi!");
    java.lang.String str20 = ldapRealm11.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory21 = ldapRealm11.getContextFactory();
    activeDirectoryGroupRealm8.setLdapContextFactory(ldapContextFactory21);
    org.apache.shiro.subject.PrincipalCollection principalCollection23 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm24 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm24.setUserSearchAttributeTemplate("hi!");
    java.lang.String str27 = ldapRealm24.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection28 = null;
    java.util.Collection collection29 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b30 = ldapRealm24.isPermittedAll(principalCollection28, (java.util.Collection<org.apache.shiro.authz.Permission>)collection29);
    boolean b31 = ldapRealm24.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm24.setUserDnTemplate("");
    org.apache.shiro.subject.PrincipalCollection principalCollection34 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm35 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm35.setUserSearchAttributeTemplate("hi!");
    ldapRealm35.setAuthorizationEnabled(false);
    ldapRealm35.setAuthenticationCachingEnabled(false);
    ldapRealm35.setUserSearchBase("hi!");
    java.lang.String str44 = ldapRealm35.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection45 = null;
    java.lang.String[] str_array47 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array48 = ldapRealm35.isPermitted(principalCollection45, str_array47);
    boolean[] b_array49 = ldapRealm24.isPermitted(principalCollection34, str_array47);
    boolean b50 = activeDirectoryGroupRealm8.isPermittedAll(principalCollection23, str_array47);
    boolean b51 = ldapRealm0.isPermittedAll(principalCollection7, str_array47);
    org.apache.shiro.subject.PrincipalCollection principalCollection52 = null;
    boolean b54 = ldapRealm0.hasRole(principalCollection52, "org.apache.zeppelin.realm.LdapRealm_93");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_973"+ "'", str20.equals("org.apache.zeppelin.realm.LdapRealm_973"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.lang.Cloneable> jsonresponse_cloneable1 = new org.apache.zeppelin.server.JsonResponse<java.lang.Cloneable>(status0);
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection6 = null;
    java.lang.String[] str_array10 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str11, str_array10);
    boolean[] b_array13 = ldapRealm2.hasRoles(principalCollection6, (java.util.List<java.lang.String>)arraylist_str11);
    jsonresponse_cloneable1.setBody((java.lang.Cloneable)arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str5 = ldapRealm0.getName();
    org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
    boolean b7 = ldapRealm0.supports(authenticationToken6);
    java.lang.String str8 = ldapRealm0.getPrincipalRegex();
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm_205");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_980"+ "'", str5.equals("org.apache.zeppelin.realm.LdapRealm_980"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(.*)"+ "'", str8.equals("(.*)"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException0 = new org.apache.zeppelin.rest.exception.ForbiddenException();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException2 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException4 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException2, "{\"message\":\"hi!\"}");
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer7 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket8 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest5, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint9 = notebookSocket8.getRemote();
    java.lang.String str10 = notebookSocket8.getProtocol();
    org.eclipse.jetty.websocket.api.Session session11 = notebookSocket8.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException13 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket8.onWebSocketError((java.lang.Throwable)forbiddenException13);
    javax.ws.rs.core.Response response15 = forbiddenException13.getResponse();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException17 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException19 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)forbiddenException17, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    forbiddenException13.addSuppressed((java.lang.Throwable)forbiddenException17);
    badRequestException4.addSuppressed((java.lang.Throwable)forbiddenException17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "cn"+ "'", str10.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response15);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    corsFilter0.destroy();
    corsFilter0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    corsFilter0.init(filterConfig3);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

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
    org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
    notebookInformationListener16.onParagraphRemove(paragraph17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket15);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    javax.servlet.ServletConfig servletConfig4 = notebookServer2.getServletConfig();
    // The following exception was thrown during execution in test generation
    try {
    javax.servlet.ServletContext servletContext5 = notebookServer2.getServletContext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig4);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }

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
    org.apache.zeppelin.notebook.Paragraph paragraph20 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputAppend(paragraph20, (int)(short)1, "org.apache.zeppelin.realm.LdapRealm_817");
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
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer4 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer4.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject6);
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer4.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject9);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest2, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer4);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer4);
    boolean b13 = notebookSocket12.isNotConnected();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response6 = heliumRestApi0.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.rest.exception.NotFoundException");
    javax.ws.rs.core.Response response8 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response11 = heliumRestApi0.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_578", "org.apache.zeppelin.realm.LdapRealm_780");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response11);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    ldapRealm0.setUserLowerCase(false);
    ldapRealm0.setUserObjectClass("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");
    ldapRealm0.setGroupSearchBase("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    ldapRealm0.setAuthenticationCacheName("org.apache.zeppelin.rest.exception.NotFoundException: org.apache.zeppelin.rest.exception.NotFoundException: org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.zeppelin.types.InterpreterSettingsList> list_interpreterSettingsList2 = org.apache.zeppelin.utils.InterpreterBindingUtils.getInterpreterBindings(notebook0, "org.apache.zeppelin.realm.LdapRealm.authorizationCache.881");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }

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
    ldapRealm1.setGroupObjectClass("org.apache.zeppelin.realm.LdapRealm.authorizationCache.806");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException3 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException1, "");
    javax.ws.rs.core.Response response4 = badRequestException3.getResponse();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException6 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)badRequestException3, "org.apache.zeppelin.realm.LdapRealm_134");
    java.lang.String str7 = badRequestException3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException"+ "'", str7.equals("org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator2 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer1);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi3 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = interpreterRestApi3.listRepositories();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }

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
    javax.ws.rs.core.Response response13 = interpreterRestApi10.listRepositories();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response12);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    ldapRealm0.setUserLowerCase(false);
    ldapRealm0.setUserObjectClass("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver12 = ldapRealm0.getPermissionResolver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver12);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = null;
    ldapRealm0.setAuthorizationCache(cache_obj_authorizationInfo10);
    org.apache.shiro.subject.PrincipalCollection principalCollection12 = null;
    javax.ws.rs.core.Response.Status status13 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm15 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm15.setUserSearchAttributeTemplate("hi!");
    java.lang.String str18 = ldapRealm15.getUserSearchAttributeTemplate();
    java.lang.String str19 = ldapRealm15.getUserSearchAttributeName();
    boolean b20 = ldapRealm15.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm21 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status13, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm15);
    org.apache.shiro.subject.PrincipalCollection principalCollection22 = null;
    org.apache.zeppelin.rest.GetUserList getUserList23 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm24 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm24.setSearchBase("hi!");
    activeDirectoryGroupRealm24.setSearchBase("");
    activeDirectoryGroupRealm24.init();
    org.apache.zeppelin.realm.LdapRealm ldapRealm30 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm30.setUserSearchAttributeTemplate("hi!");
    java.lang.String str33 = ldapRealm30.getUserSearchAttributeTemplate();
    java.lang.String str34 = ldapRealm30.getUserSearchAttributeName();
    boolean b35 = ldapRealm30.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm36 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str37 = ldapRealm36.getListRoles();
    ldapRealm30.setRolesByGroup(map_str_str37);
    activeDirectoryGroupRealm24.setGroupRolesMap(map_str_str37);
    java.util.List<java.lang.String> list_str41 = getUserList23.getUserList(activeDirectoryGroupRealm24, "org.apache.zeppelin.realm.LdapRealm_75");
    org.apache.zeppelin.realm.LdapRealm ldapRealm42 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str43 = ldapRealm42.getListRoles();
    java.lang.String str44 = ldapRealm42.getGroupSearchBase();
    java.util.List<java.lang.String> list_str46 = getUserList23.getUserList(ldapRealm42, "org.apache.zeppelin.realm.LdapRealm_47");
    ldapRealm15.checkRoles(principalCollection22, (java.util.Collection<java.lang.String>)list_str46);
    boolean[] b_array48 = ldapRealm0.hasRoles(principalCollection12, list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array48);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator1 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.apache.zeppelin.notebook.Note note2 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNote(note2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
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
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher7);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str2);
    activeDirectoryGroupRealm1.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver6 = activeDirectoryGroupRealm1.getRolePermissionResolver();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver7 = activeDirectoryGroupRealm1.getRolePermissionResolver();
    activeDirectoryGroupRealm1.setPrincipalSuffix("cn");
    java.util.List<java.lang.String> list_str11 = getUserList0.getUserList(activeDirectoryGroupRealm1, "org.apache.zeppelin.realm.LdapRealm_262");
    org.apache.zeppelin.realm.LdapRealm ldapRealm12 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm12.setUserSearchAttributeTemplate("hi!");
    java.lang.String str15 = ldapRealm12.getUserSearchAttributeTemplate();
    ldapRealm12.setUserObjectClass("hi!");
    int i18 = ldapRealm12.getPagingSize();
    ldapRealm12.setUserSearchAttributeTemplate("org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");
    org.apache.zeppelin.realm.PamRealm pamRealm21 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver22 = pamRealm21.getPermissionResolver();
    ldapRealm12.setPermissionResolver(permissionResolver22);
    java.lang.String str24 = ldapRealm12.getAuthorizationCacheName();
    java.util.List<java.lang.String> list_str25 = getUserList0.getRolesList(ldapRealm12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authorizationCache.1006"+ "'", str24.equals("org.apache.zeppelin.realm.LdapRealm.authorizationCache.1006"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }

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
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory15 = activeDirectoryGroupRealm0.getLdapContextFactory();
    org.apache.shiro.subject.PrincipalCollection principalCollection16 = null;
    // The following exception was thrown during execution in test generation
    try {
    activeDirectoryGroupRealm0.checkRole(principalCollection16, "org.apache.zeppelin.realm.LdapRealm_133");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1009"+ "'", str12.equals("org.apache.zeppelin.realm.LdapRealm_1009"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory15);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener7 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    boolean b10 = notebookServer1.checkOrigin(httpServletRequest8, "cn");
    org.apache.zeppelin.notebook.Note note11 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener12 = notebookServer1.getParagraphJobListener(note11);
    org.apache.zeppelin.search.SearchService searchService13 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi14 = new org.apache.zeppelin.rest.NotebookRestApi(notebook0, notebookServer1, searchService13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener12);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }

    org.apache.zeppelin.rest.LoginRestApi loginRestApi0 = new org.apache.zeppelin.rest.LoginRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = loginRestApi0.postLogin("org.apache.zeppelin.realm.LdapRealm_786", "org.apache.zeppelin.realm.LdapRealm_246");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.UnavailableSecurityManagerException");
    } catch (org.apache.shiro.UnavailableSecurityManagerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response9 = interpreterRestApi7.listInterpreter("org.apache.zeppelin.realm.LdapRealm_139");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSinglePackageInfo("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");
    javax.ws.rs.core.Response response6 = heliumRestApi0.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.realm.LdapRealm_47");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response6);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.ws.rs.core.Response response9 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109");
    javax.ws.rs.core.Response response11 = interpreterRestApi7.removeRepository("{\n  \"message\": \"hi!\"\n}");
    javax.ws.rs.core.Response response13 = interpreterRestApi7.removeRepository("org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response14 = interpreterRestApi7.listRepositories();
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
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }

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
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm19 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm19.setSearchBase("hi!");
    activeDirectoryGroupRealm19.setHadoopSecurityCredentialPath("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    org.apache.zeppelin.realm.LdapRealm ldapRealm24 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm24.setUserSearchAttributeTemplate("hi!");
    ldapRealm24.setAuthorizationEnabled(false);
    ldapRealm24.setAuthenticationCachingEnabled(false);
    ldapRealm24.setUserSearchBase("hi!");
    java.lang.String str33 = ldapRealm24.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory34 = ldapRealm24.getContextFactory();
    activeDirectoryGroupRealm19.setLdapContextFactory(ldapContextFactory34);
    java.util.List<java.lang.String> list_str37 = getUserList0.getUserList(activeDirectoryGroupRealm19, "groupOfNames");
    org.apache.zeppelin.realm.LdapRealm ldapRealm38 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm38.setUserSearchAttributeTemplate("hi!");
    java.lang.String str41 = ldapRealm38.getUserSearchAttributeTemplate();
    java.lang.String str42 = ldapRealm38.getUserSearchAttributeName();
    java.lang.String str43 = ldapRealm38.getName();
    org.apache.shiro.subject.PrincipalCollection principalCollection44 = null;
    java.lang.String[] str_array45 = null;
    boolean b46 = ldapRealm38.isPermittedAll(principalCollection44, str_array45);
    java.util.List<java.lang.String> list_str47 = getUserList0.getRolesList(ldapRealm38);
    org.apache.zeppelin.realm.LdapRealm ldapRealm48 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm48.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.cache.CacheManager cacheManager51 = null;
    ldapRealm48.setCacheManager(cacheManager51);
    java.lang.String str53 = ldapRealm48.getGroupSearchBase();
    java.util.List<java.lang.String> list_str54 = getUserList0.getRolesList(ldapRealm48);
    
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
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1022"+ "'", str33.equals("org.apache.zeppelin.realm.LdapRealm_1022"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1023"+ "'", str43.equals("org.apache.zeppelin.realm.LdapRealm_1023"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str54);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher8 = null;
    ldapRealm0.setCredentialsMatcher(credentialsMatcher8);
    java.lang.String str10 = ldapRealm0.getGroupIdAttribute();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver11 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "cn"+ "'", str10.equals("cn"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    java.lang.String str5 = notebookSocket3.getProtocol();
    org.eclipse.jetty.websocket.api.Session session6 = notebookSocket3.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException8 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket3.onWebSocketError((java.lang.Throwable)forbiddenException8);
    javax.ws.rs.core.Response response10 = forbiddenException8.getResponse();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException12 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException14 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)forbiddenException12, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.150");
    forbiddenException8.addSuppressed((java.lang.Throwable)forbiddenException12);
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException16 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "cn"+ "'", str5.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response10);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }

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
    org.apache.zeppelin.notebook.Paragraph paragraph20 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage22 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputUpdate(paragraph20, (int)'a', interpreterResultMessage22);
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
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    java.lang.Class class3 = activeDirectoryGroupRealm0.getAuthenticationTokenClass();
    org.apache.zeppelin.json.NotebookTypeAdapterFactory<java.util.Set<java.lang.String>> notebooktypeadapterfactory_set_str4 = new org.apache.zeppelin.json.NotebookTypeAdapterFactory<java.util.Set<java.lang.String>>((java.lang.Class<java.util.Set<java.lang.String>>)class3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class3);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo1 = ldapRealm0.getAuthorizationCache();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo1);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    boolean b4 = notebookSocket3.isConnected();
    boolean b5 = notebookSocket3.isConnected();
    java.lang.String str6 = notebookSocket3.getUser();
    javax.servlet.http.HttpServletRequest httpServletRequest7 = notebookSocket3.getRequest();
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketClose((int)'#', "person");
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
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    org.apache.zeppelin.display.AngularObject angularObject8 = null;
    notebookServer0.onAdd("", angularObject8);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration<java.lang.String> enumeration_str10 = notebookServer0.getInitParameterNames();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array13 = ldapRealm0.isPermitted(principalCollection10, str_array12);
    java.lang.String str14 = ldapRealm0.getPrincipalRegex();
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm_832");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "(.*)"+ "'", str14.equals("(.*)"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo4 = ldapRealm0.getAuthorizationCache();
    ldapRealm0.setPagingSize((int)(short)1);
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str7 = ldapRealm0.getPermissionsByRole();
    java.lang.String str8 = ldapRealm0.getAuthenticationCacheName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.1032"+ "'", str8.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.1032"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }

    java.util.Properties properties0 = null;
    javax.ws.rs.core.Response.Status status1 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>> jsonresponse_list_dependency2 = new org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>>(status1);
    javax.ws.rs.core.Response.Status status3 = null;
    jsonresponse_list_dependency2.setCode(status3);
    org.apache.zeppelin.dep.Dependency[] dependency_array5 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency6 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency6, dependency_array5);
    jsonresponse_list_dependency2.setBody((java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency6);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption9 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest10 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties0, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency6, interpreterOption9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }

    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi0 = new org.apache.zeppelin.rest.NotebookRestApi();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = notebookRestApi0.registerCronJob("org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.realm.LdapRealm_662");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }

    javax.ws.rs.core.Response.Status status0 = null;
    java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo> abstractcollection_interpreterInfo1 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo2 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>>(status0, abstractcollection_interpreterInfo1);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<org.apache.zeppelin.interpreter.InterpreterInfo>> jsonresponse_abstractcollection_interpreterInfo4 = jsonresponse_abstractcollection_interpreterInfo2.setPretty(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_abstractcollection_interpreterInfo4);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }

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
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl10.onOutputAppend(paragraph24, (int)(byte)1, "org.apache.zeppelin.realm.LdapRealm_578");
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
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }

    org.apache.zeppelin.rest.SecurityRestApi securityRestApi0 = new org.apache.zeppelin.rest.SecurityRestApi();
    javax.ws.rs.core.Response response1 = securityRestApi0.ticket();
    javax.ws.rs.core.Response response2 = securityRestApi0.ticket();
    javax.ws.rs.core.Response response3 = securityRestApi0.ticket();
    javax.ws.rs.core.Response response5 = securityRestApi0.getUserList("org.apache.zeppelin.realm.LdapRealm_529");
    javax.ws.rs.core.Response response7 = securityRestApi0.getUserList("org.apache.zeppelin.realm.LdapRealm.authorizationCache.510");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.message.NewParagraphRequest> jsonresponse_newParagraphRequest1 = new org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.message.NewParagraphRequest>(status0);
    javax.ws.rs.core.Response.Status status2 = null;
    jsonresponse_newParagraphRequest1.setCode(status2);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }

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
    org.apache.zeppelin.scheduler.Job.Status status12 = null;
    org.apache.zeppelin.scheduler.Job.Status status13 = null;
    paragraphListenerImpl10.beforeStatusChange(job11, status12, status13);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher5 = null;
    ldapRealm0.setCredentialsMatcher(credentialsMatcher5);
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm_47");
    ldapRealm0.setAuthorizationEnabled(false);
    java.lang.String str11 = ldapRealm0.getMemberAttribute();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "member"+ "'", str11.equals("member"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    java.lang.String str7 = ldapRealm0.getName();
    java.lang.String str8 = ldapRealm0.getGroupSearchBase();
    ldapRealm0.setGroupIdAttribute("{\n  \"message\": \"hi!\"\n}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1042"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_1042"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }

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
    boolean b14 = notebookServer2.checkOrigin(httpServletRequest12, "org.apache.zeppelin.realm.LdapRealm_93");
    notebookServer2.broadcastUpdateNoteJobInfo(100L);
    org.apache.zeppelin.notebook.Note note17 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph18 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.broadcastParagraph(note17, paragraph18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.ServletConfig servletConfig8 = notebookServer1.getServletConfig();
    org.apache.zeppelin.display.AngularObject angularObject10 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_265", angularObject10);
    org.apache.zeppelin.socket.NotebookServer notebookServer12 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject14 = null;
    notebookServer12.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject14);
    javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener18 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket19 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest16, "subtree", notebookSocketListener18);
    boolean b20 = notebookSocket19.isConnected();
    notebookServer12.unsubscribeNoteJobInfo(notebookSocket19);
    javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket24 = notebookServer12.doWebSocketConnect(httpServletRequest22, "org.apache.zeppelin.realm.LdapRealm_189");
    org.apache.zeppelin.notebook.socket.Message message25 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.getInterpreterBindings(notebookSocket24, message25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket24);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }

    javax.ws.rs.core.Response.Status status0 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = org.apache.zeppelin.utils.ExceptionUtils.jsonResponseContent(status0, "org.apache.zeppelin.realm.LdapRealm_654");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<javax.servlet.Filter> jsonresponse_filter2 = new org.apache.zeppelin.server.JsonResponse<javax.servlet.Filter>(status0, "");
    org.apache.zeppelin.server.JsonResponse<javax.servlet.Filter> jsonresponse_filter4 = jsonresponse_filter2.setPretty(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_filter4);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator2 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer1);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi3 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = interpreterRestApi3.getMetaInfo(httpServletRequest4, "org.apache.zeppelin.realm.LdapRealm_134");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }

    javax.ws.rs.core.Response.Status status0 = null;
    java.util.AbstractList<org.apache.zeppelin.interpreter.InterpreterResultMessage> abstractlist_interpreterResultMessage2 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractList<org.apache.zeppelin.interpreter.InterpreterResultMessage>> jsonresponse_abstractlist_interpreterResultMessage3 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractList<org.apache.zeppelin.interpreter.InterpreterResultMessage>>(status0, "member", abstractlist_interpreterResultMessage2);
    java.lang.String str4 = jsonresponse_abstractlist_interpreterResultMessage3.toString();
    javax.ws.rs.core.NewCookie newCookie5 = null;
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractList<org.apache.zeppelin.interpreter.InterpreterResultMessage>> jsonresponse_abstractlist_interpreterResultMessage6 = jsonresponse_abstractlist_interpreterResultMessage3.addCookie(newCookie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{\"message\":\"member\"}"+ "'", str4.equals("{\"message\":\"member\"}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_abstractlist_interpreterResultMessage6);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }

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
    org.apache.zeppelin.notebook.Note note20 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl21 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer0, note20);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener22 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
    org.apache.zeppelin.scheduler.Job.Status status24 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener22.onParagraphStatusChange(paragraph23, status24);
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
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }

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
    org.apache.zeppelin.scheduler.Job job22 = null;
    org.apache.zeppelin.scheduler.Job.Status status23 = null;
    org.apache.zeppelin.scheduler.Job.Status status24 = null;
    paragraphListenerImpl11.beforeStatusChange(job22, status23, status24);
    org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync27 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer28 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject30 = null;
    notebookServer28.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject30);
    org.apache.zeppelin.display.AngularObject angularObject33 = null;
    notebookServer28.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject33);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi35 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync27, notebookServer28);
    org.apache.zeppelin.notebook.Note note36 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl37 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer28, note36);
    org.apache.zeppelin.notebook.Paragraph paragraph38 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array39 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage40 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage40, interpreterResultMessage_array39);
    paragraphListenerImpl37.onOutputUpdateAll(paragraph38, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage40);
    paragraphListenerImpl11.onOutputUpdateAll(paragraph26, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage40);
    org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage46 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl11.onOutputUpdate(paragraph44, 0, interpreterResultMessage46);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    notebookServer0.onStatusChange("org.apache.zeppelin.realm.LdapRealm.authorizationCache.266", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339", "hi!", "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph11 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph11, paragraph12);
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo14 = null;
    java.util.HashSet<java.lang.String> hashset_str15 = org.apache.zeppelin.utils.SecurityUtils.getRoles();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNoteList(authenticationInfo14, (java.util.HashSet)hashset_str15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashset_str15);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHubRealm0.setZeppelinhubUrl("anonymous");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str5 = ldapRealm0.getName();
    org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
    boolean b7 = ldapRealm0.supports(authenticationToken6);
    ldapRealm0.setPrincipalRegex("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermission(principalCollection10, "org.apache.zeppelin.realm.LdapRealm_75");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1044"+ "'", str5.equals("org.apache.zeppelin.realm.LdapRealm_1044"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.lang.String str6 = notebookServer0.getServletInfo();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type11 = null;
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm_366", "org.apache.zeppelin.realm.LdapRealm_93", 100, "org.apache.zeppelin.realm.LdapRealm_93", type11, "{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}");
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator14 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest servletUpgradeRequest15 = null;
    org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse servletUpgradeResponse16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj17 = notebookWebSocketCreator14.createWebSocket(servletUpgradeRequest15, servletUpgradeResponse16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }

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
    notebookServer4.broadcastUpdateNoteJobInfo(1L);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage20 = null;
    notebookServer4.onLoad("groupOfNames", "org.apache.zeppelin.realm.LdapRealm_267", "org.apache.zeppelin.realm.LdapRealm_187", heliumPackage20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener14);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<javax.servlet.Filter> jsonresponse_filter2 = new org.apache.zeppelin.server.JsonResponse<javax.servlet.Filter>(status0, "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache");

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = notebookServer1.doWebSocketConnect(httpServletRequest8, "org.apache.zeppelin.realm.LdapRealm_75");
    java.lang.String str11 = notebookSocket10.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver1 = pamRealm0.getPermissionResolver();
    pamRealm0.setService("");
    java.lang.String str4 = pamRealm0.getService();
    java.lang.String str5 = pamRealm0.getService();
    pamRealm0.setService("org.apache.zeppelin.realm.LdapRealm_623");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }

    org.apache.zeppelin.rest.message.RestartInterpreterRequest restartInterpreterRequest0 = new org.apache.zeppelin.rest.message.RestartInterpreterRequest();
    java.lang.String str1 = restartInterpreterRequest0.getNoteId();
    java.lang.String str2 = restartInterpreterRequest0.getNoteId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }

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
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.destroy();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
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
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    notebookSocket3.onWebSocketText("org.apache.zeppelin.realm.LdapRealm_229");

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array13 = ldapRealm0.isPermitted(principalCollection10, str_array12);
    java.lang.String str14 = ldapRealm0.getPrincipalRegex();
    java.lang.String str15 = ldapRealm0.getUserSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "(.*)"+ "'", str14.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    javax.ws.rs.core.Response response10 = heliumRestApi2.getPackageConfig("{}", "org.apache.zeppelin.realm.LdapRealm_485");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response13 = heliumRestApi2.suggest("", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response10);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }

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
    org.apache.zeppelin.notebook.Note note23 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNote(note23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    ldapRealm1.setAuthorizationEnabled(false);
    ldapRealm1.setUserDnTemplate("subtree");
    java.util.List<java.lang.String> list_str8 = getUserList0.getRolesList(ldapRealm1);
    org.apache.zeppelin.realm.LdapRealm ldapRealm9 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm9.setUserSearchAttributeTemplate("hi!");
    java.lang.String str12 = ldapRealm9.getUserSearchScope();
    org.apache.shiro.subject.PrincipalCollection principalCollection13 = null;
    boolean b15 = ldapRealm9.isPermitted(principalCollection13, "org.apache.zeppelin.realm.LdapRealm_654");
    java.util.List<java.lang.String> list_str17 = getUserList0.getUserList(ldapRealm9, "(.*)");
    org.apache.shiro.realm.text.IniRealm iniRealm18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str19 = getUserList0.getUserList(iniRealm18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "subtree"+ "'", str12.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    ldapRealm0.setGroupSearchBase("hi!");
    boolean b6 = ldapRealm0.isAuthorizationCachingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener7 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener10 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest8, "subtree", notebookSocketListener10);
    notebookServer1.onMessage(notebookSocket11, "org.apache.zeppelin.realm.LdapRealm_187");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi14 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response17 = interpreterRestApi14.restartSetting("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    ldapRealm0.setGroupSearchBase("hi!");
    ldapRealm0.setPagingSize((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }

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
    org.apache.zeppelin.notebook.Note note20 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl21 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer0, note20);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener22 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.notebook.Note note23 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookInformationListener22.onNoteCreate(note23);
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
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }

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
    org.apache.shiro.subject.PrincipalCollection principalCollection17 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm18 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = ldapRealm18.getListRoles();
    org.apache.zeppelin.realm.LdapRealm ldapRealm20 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm20.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver23 = ldapRealm20.getPermissionResolver();
    ldapRealm18.setPermissionResolver(permissionResolver23);
    org.apache.shiro.subject.PrincipalCollection principalCollection25 = null;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm26 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str27 = null;
    activeDirectoryGroupRealm26.setGroupRolesMap(map_str_str27);
    org.apache.zeppelin.realm.LdapRealm ldapRealm29 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm29.setUserSearchAttributeTemplate("hi!");
    ldapRealm29.setAuthorizationEnabled(false);
    ldapRealm29.setAuthenticationCachingEnabled(false);
    ldapRealm29.setUserSearchBase("hi!");
    java.lang.String str38 = ldapRealm29.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory39 = ldapRealm29.getContextFactory();
    activeDirectoryGroupRealm26.setLdapContextFactory(ldapContextFactory39);
    org.apache.shiro.subject.PrincipalCollection principalCollection41 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm42 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm42.setUserSearchAttributeTemplate("hi!");
    java.lang.String str45 = ldapRealm42.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection46 = null;
    java.util.Collection collection47 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b48 = ldapRealm42.isPermittedAll(principalCollection46, (java.util.Collection<org.apache.shiro.authz.Permission>)collection47);
    boolean b49 = ldapRealm42.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm42.setUserDnTemplate("");
    org.apache.shiro.subject.PrincipalCollection principalCollection52 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm53 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm53.setUserSearchAttributeTemplate("hi!");
    ldapRealm53.setAuthorizationEnabled(false);
    ldapRealm53.setAuthenticationCachingEnabled(false);
    ldapRealm53.setUserSearchBase("hi!");
    java.lang.String str62 = ldapRealm53.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection63 = null;
    java.lang.String[] str_array65 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array66 = ldapRealm53.isPermitted(principalCollection63, str_array65);
    boolean[] b_array67 = ldapRealm42.isPermitted(principalCollection52, str_array65);
    boolean b68 = activeDirectoryGroupRealm26.isPermittedAll(principalCollection41, str_array65);
    boolean b69 = ldapRealm18.isPermittedAll(principalCollection25, str_array65);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkRoles(principalCollection17, str_array65);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(map_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1059"+ "'", str38.equals("org.apache.zeppelin.realm.LdapRealm_1059"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    ldapRealm0.setGroupSearchBase("org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");
    ldapRealm0.setUserSearchBase("org.apache.zeppelin.realm.LdapRealm_75");
    ldapRealm0.init();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }

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
    jsonresponse_jobListener21.setMessage("org.apache.zeppelin.realm.LdapRealm_246");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    ldapRealm0.setUserLowerCase(false);
    ldapRealm0.setUserObjectClass("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    ldapRealm0.setUserLowerCase(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }

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
    org.apache.shiro.subject.PrincipalCollection principalCollection34 = null;
    org.apache.zeppelin.rest.GetUserList getUserList35 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.LdapRealm ldapRealm36 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm36.setUserSearchAttributeTemplate("hi!");
    ldapRealm36.setAuthorizationEnabled(false);
    ldapRealm36.setUserDnTemplate("subtree");
    java.util.List<java.lang.String> list_str43 = getUserList35.getRolesList(ldapRealm36);
    boolean b44 = ldapRealm0.hasAllRoles(principalCollection34, (java.util.Collection<java.lang.String>)list_str43);
    
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
    org.junit.Assert.assertNotNull(list_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.lang.String str6 = notebookServer0.getServletInfo();
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init();
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }

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
    javax.ws.rs.core.Response.Status status14 = null;
    jsonresponse_jndiLdapRealm13.setCode(status14);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = jsonresponse_jndiLdapRealm13.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    java.lang.String str2 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str3 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    ldapRealm0.onLogout(principalCollection4);
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory6 = ldapRealm0.getContextFactory();
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    ldapRealm0.onLogout(principalCollection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(.*)"+ "'", str3.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory6);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isCachingEnabled();
    ldapRealm0.setUserSearchScope("org.apache.zeppelin.realm.LdapRealm_267");
    java.lang.Class class10 = ldapRealm0.getAuthenticationTokenClass();
    ldapRealm0.setPagingSize((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class10);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<java.lang.Iterable> jsonresponse_iterable2 = new org.apache.zeppelin.server.JsonResponse<java.lang.Iterable>(status0, "org.apache.zeppelin.realm.LdapRealm_704");

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }

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
    ldapRealm0.setGroupSearchBase("org.apache.zeppelin.realm.LdapRealm_175");
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.setMemberAttributeValueTemplate("org.apache.zeppelin.realm.LdapRealm_910");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory13);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer2.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer2;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "groupOfNames", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    java.lang.String str10 = notebookSocket9.getProtocol();
    boolean b11 = notebookSocket9.isNotConnected();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "groupOfNames"+ "'", str10.equals("groupOfNames"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }

    java.util.Properties properties0 = null;
    java.util.Properties properties1 = null;
    java.util.Properties properties2 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array3 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency4 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, dependency_array3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest7 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties2, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption8 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest9 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties1, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, interpreterOption8);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption10 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest11 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties0, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, interpreterOption10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setUserLowerCase(false);
    ldapRealm0.setCachingEnabled(true);
    boolean b11 = ldapRealm0.getUserLowerCase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    ldapRealm0.onLogout(principalCollection7);
    ldapRealm0.setPagingSize((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }

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
    org.apache.shiro.authz.Permission permission14 = null;
    boolean b15 = ldapRealm0.isPermitted(principalCollection13, permission14);
    
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
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }

    org.apache.zeppelin.realm.ZeppelinHubRealm zeppelinHubRealm0 = new org.apache.zeppelin.realm.ZeppelinHubRealm();
    zeppelinHubRealm0.setZeppelinhubUrl("");
    // The following exception was thrown during execution in test generation
    try {
    zeppelinHubRealm0.setZeppelinhubUrl("org.apache.zeppelin.realm.LdapRealm.authorizationCache.806");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }

    org.apache.zeppelin.rest.exception.BadRequestException badRequestException1 = new org.apache.zeppelin.rest.exception.BadRequestException("org.apache.zeppelin.realm.LdapRealm.authenticationCache.863");

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str2);
    java.util.List<java.lang.String> list_str5 = getUserList0.getUserList(activeDirectoryGroupRealm1, "cn");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm6 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm6.setSearchBase("hi!");
    activeDirectoryGroupRealm6.setSearchBase("");
    activeDirectoryGroupRealm6.setSearchBase("cn");
    activeDirectoryGroupRealm6.setSystemUsername("");
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory15 = activeDirectoryGroupRealm6.getLdapContextFactory();
    org.apache.shiro.cache.CacheManager cacheManager16 = activeDirectoryGroupRealm6.getCacheManager();
    activeDirectoryGroupRealm6.setSearchBase("org.apache.zeppelin.realm.LdapRealm_246");
    java.util.List<java.lang.String> list_str20 = getUserList0.getUserList(activeDirectoryGroupRealm6, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cacheManager16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    ldapRealm0.setName("org.apache.zeppelin.realm.LdapRealm_109");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }

    org.apache.zeppelin.rest.message.NewParagraphRequest newParagraphRequest0 = new org.apache.zeppelin.rest.message.NewParagraphRequest();
    java.lang.Double d1 = newParagraphRequest0.getIndex();
    java.lang.Double d2 = newParagraphRequest0.getIndex();
    java.lang.String str3 = newParagraphRequest0.getTitle();
    java.util.HashMap<java.lang.String,java.lang.Object> hashmap_str_obj4 = newParagraphRequest0.getConfig();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_str_obj4);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm1 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    activeDirectoryGroupRealm1.setGroupRolesMap(map_str_str2);
    java.util.List<java.lang.String> list_str5 = getUserList0.getUserList(activeDirectoryGroupRealm1, "cn");
    org.apache.zeppelin.realm.LdapRealm ldapRealm6 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm6.setUserSearchAttributeTemplate("hi!");
    java.lang.String str9 = ldapRealm6.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.util.Collection collection11 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b12 = ldapRealm6.isPermittedAll(principalCollection10, (java.util.Collection<org.apache.shiro.authz.Permission>)collection11);
    java.util.List<java.lang.String> list_str13 = getUserList0.getRolesList(ldapRealm6);
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    org.apache.zeppelin.rest.GetUserList getUserList15 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm16 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str17 = null;
    activeDirectoryGroupRealm16.setGroupRolesMap(map_str_str17);
    java.util.List<java.lang.String> list_str20 = getUserList15.getUserList(activeDirectoryGroupRealm16, "cn");
    org.apache.zeppelin.realm.LdapRealm ldapRealm21 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm21.setUserSearchAttributeTemplate("hi!");
    java.lang.String str24 = ldapRealm21.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection25 = null;
    java.util.Collection collection26 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b27 = ldapRealm21.isPermittedAll(principalCollection25, (java.util.Collection<org.apache.shiro.authz.Permission>)collection26);
    java.util.List<java.lang.String> list_str28 = getUserList15.getRolesList(ldapRealm21);
    ldapRealm6.checkRoles(principalCollection14, (java.util.Collection<java.lang.String>)list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response13 = interpreterRestApi10.restartSetting("org.apache.zeppelin.realm.LdapRealm.authenticationCache.150", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setMemberAttribute("subtree");
    ldapRealm0.setUserSearchAttributeTemplate("subtree");
    java.lang.String str10 = ldapRealm0.getGroupSearchBase();
    java.lang.Class class11 = ldapRealm0.getAuthenticationTokenClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class11);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }

    org.apache.zeppelin.rest.exception.BadRequestException badRequestException1 = new org.apache.zeppelin.rest.exception.BadRequestException("{\"message\":\"hi!\"}");

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.CacheManager cacheManager4 = null;
    ldapRealm0.setCacheManager(cacheManager4);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo6 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.rest.message.NewParagraphRequest newParagraphRequest1 = new org.apache.zeppelin.rest.message.NewParagraphRequest();
    java.lang.Double d2 = newParagraphRequest1.getIndex();
    java.lang.Double d3 = newParagraphRequest1.getIndex();
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.message.NewParagraphRequest> jsonresponse_newParagraphRequest4 = new org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.message.NewParagraphRequest>(status0, newParagraphRequest1);
    java.lang.String str5 = newParagraphRequest1.getText();
    java.util.HashMap<java.lang.String,java.lang.Object> hashmap_str_obj6 = newParagraphRequest1.getConfig();
    java.lang.String str7 = newParagraphRequest1.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_str_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }

    javax.ws.rs.core.Response.Status status0 = null;
    java.util.Properties properties1 = null;
    java.util.Properties properties2 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array3 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency4 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, dependency_array3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest7 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties2, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption8 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest9 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties1, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, interpreterOption8);
    org.apache.zeppelin.server.JsonResponse<java.lang.Iterable> jsonresponse_iterable10 = new org.apache.zeppelin.server.JsonResponse<java.lang.Iterable>(status0, (java.lang.Iterable)arraylist_dependency4);
    org.apache.zeppelin.server.JsonResponse<?> jsonresponse_wildcard13 = jsonresponse_iterable10.addCookie("org.apache.zeppelin.realm.LdapRealm_205", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.1006");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_wildcard13);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }

    org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest notebookRepoSettingsRequest0 = org.apache.zeppelin.rest.message.NotebookRepoSettingsRequest.EMPTY;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = notebookRepoSettingsRequest0.settings;
    java.lang.String str2 = notebookRepoSettingsRequest0.name;
    java.lang.String str3 = notebookRepoSettingsRequest0.name;
    notebookRepoSettingsRequest0.name = "groupOfNames";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookRepoSettingsRequest0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "subtree"+ "'", str2.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator5 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer0);
    org.apache.zeppelin.display.AngularObject angularObject7 = null;
    notebookServer0.onUpdate("{\n  \"message\": \"hi!\"\n}", angularObject7);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onRemove("groupOfNames", "org.apache.zeppelin.realm.LdapRealm_109.authorizationCache", "org.apache.zeppelin.realm.LdapRealm_988", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("org.apache.zeppelin.realm.LdapRealm_152");
    java.lang.String str2 = forbiddenException1.toString();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException3 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "org.apache.zeppelin.rest.exception.ForbiddenException"+ "'", str2.equals("org.apache.zeppelin.rest.exception.ForbiddenException"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    org.apache.shiro.subject.PrincipalCollection principalCollection8 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm9 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm9.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver12 = ldapRealm9.getPermissionResolver();
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
    boolean[] b_array28 = ldapRealm9.isPermitted(principalCollection13, str_array26);
    boolean[] b_array29 = ldapRealm0.isPermitted(principalCollection8, str_array26);
    int i30 = ldapRealm0.getPagingSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver12);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 100);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("hi!", "", "subtree", "");
    notebookServer0.broadcastUpdateNoteJobInfo((long)100);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    boolean b10 = notebookServer0.checkOrigin(httpServletRequest8, "org.apache.zeppelin.realm.LdapRealm_47");
    notebookServer0.onOutputAppend("org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm_133", (int)'#', "subtree", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    notebookServer0.broadcastUpdateNoteJobInfo((-1L));
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    org.apache.zeppelin.notebook.Note note12 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl13 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer0, note12);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputClear("org.apache.zeppelin.realm.LdapRealm_793", "org.apache.zeppelin.rest.exception.NotFoundException");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    java.lang.String str7 = ldapRealm0.getName();
    org.apache.zeppelin.realm.LdapRealm ldapRealm8 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm8.setUserSearchAttributeTemplate("hi!");
    java.lang.String str11 = ldapRealm8.getUserSearchScope();
    org.apache.shiro.cache.CacheManager cacheManager12 = null;
    ldapRealm8.setCacheManager(cacheManager12);
    ldapRealm8.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_109");
    java.util.Map<java.lang.String,java.lang.String> map_str_str16 = ldapRealm8.getListRoles();
    ldapRealm0.setRolesByGroup(map_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1094"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_1094"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "subtree"+ "'", str11.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str16);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }

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
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response19 = interpreterRestApi16.getMetaInfo(httpServletRequest17, "org.apache.zeppelin.realm.LdapRealm_246");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi5 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.ServletConfig servletConfig6 = notebookServer1.getServletConfig();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = notebookServer1.getServletName();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig6);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    boolean b4 = notebookSocket3.isConnected();
    boolean b5 = notebookSocket3.isConnected();
    java.lang.String str6 = notebookSocket3.getUser();
    org.eclipse.jetty.websocket.api.Session session7 = notebookSocket3.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException9 = new org.apache.zeppelin.rest.exception.ForbiddenException("org.apache.zeppelin.realm.LdapRealm_301");
    notebookSocket3.onWebSocketError((java.lang.Throwable)forbiddenException9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session7);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    java.lang.String str6 = ldapRealm2.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    java.util.List<java.lang.String> list_str8 = null;
    boolean[] b_array9 = ldapRealm2.hasRoles(principalCollection7, list_str8);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = ldapRealm2.getAuthorizationCache();
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm12 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm12.setUserSearchAttributeTemplate("hi!");
    java.lang.String str15 = ldapRealm12.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection16 = null;
    java.util.Collection collection17 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b18 = ldapRealm12.isPermittedAll(principalCollection16, (java.util.Collection<org.apache.shiro.authz.Permission>)collection17);
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = ldapRealm12.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection20 = null;
    org.apache.shiro.authz.Permission[] permission_array21 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission22 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission22, permission_array21);
    ldapRealm12.checkPermissions(principalCollection20, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission22);
    ldapRealm2.checkPermissions(principalCollection11, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission22);
    org.apache.zeppelin.server.JsonResponse<java.util.ArrayList<org.apache.shiro.authz.Permission>> jsonresponse_arraylist_permission26 = new org.apache.zeppelin.server.JsonResponse<java.util.ArrayList<org.apache.shiro.authz.Permission>>(status0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245", arraylist_permission22);
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission27 = jsonresponse_arraylist_permission26.getBody();
    jsonresponse_arraylist_permission26.setMessage("org.apache.zeppelin.realm.LdapRealm_1022");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "cn"+ "'", str6.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_permission27);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }

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
    org.apache.zeppelin.scheduler.Job job22 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl11.onProgressUpdate(job22, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    notebookSocket3.setUser("{}");
    notebookSocket3.setUser("org.apache.zeppelin.realm.LdapRealm_229");
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket3.onWebSocketClose((int)(byte)0, "org.apache.zeppelin.realm.LdapRealm_267");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }

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
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory16 = ldapRealm0.getContextFactory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "subtree"+ "'", str13.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory16);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.server.JsonResponse<java.util.AbstractList<org.apache.zeppelin.interpreter.InterpreterResultMessage>>> jsonresponse_jsonresponse_abstractlist_interpreterResultMessage2 = new org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.server.JsonResponse<java.util.AbstractList<org.apache.zeppelin.interpreter.InterpreterResultMessage>>>(status0, "subtree");
    javax.ws.rs.core.NewCookie newCookie3 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.server.JsonResponse<java.util.AbstractList<org.apache.zeppelin.interpreter.InterpreterResultMessage>>> jsonresponse_jsonresponse_abstractlist_interpreterResultMessage4 = jsonresponse_jsonresponse_abstractlist_interpreterResultMessage2.addCookie(newCookie3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_jsonresponse_abstractlist_interpreterResultMessage4);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm6 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = ldapRealm6.getListRoles();
    ldapRealm0.setRolesByGroup(map_str_str7);
    ldapRealm0.setPagingSize((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str7);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchFilter("");
    ldapRealm0.setCachingEnabled(true);
    ldapRealm0.setUserSearchScope("org.apache.zeppelin.realm.LdapRealm.authenticationCache.759");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }

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
    javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket32 = notebookServer0.doWebSocketConnect(httpServletRequest30, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException34 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException36 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException34, "");
    javax.ws.rs.core.Response response37 = badRequestException36.getResponse();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException39 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)badRequestException36, "org.apache.zeppelin.realm.LdapRealm_134");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException41 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException39, "{\n  \"message\": \"hi!\"\n}");
    java.lang.Throwable[] throwable_array42 = forbiddenException39.getSuppressed();
    notebookSocket32.onWebSocketError((java.lang.Throwable)forbiddenException39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array42);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    org.apache.zeppelin.socket.NotebookServer notebookServer3 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer3.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener9 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer3);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    boolean b12 = notebookServer3.checkOrigin(httpServletRequest10, "cn");
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.init((javax.servlet.ServletConfig)notebookServer3);
      org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException");
    } catch (javax.servlet.ServletException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = null;
    notebookServer0.onLoad("org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.realm.LdapRealm_139", "org.apache.zeppelin.realm.LdapRealm_205", heliumPackage8);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener.RemoteWorksEventListener remoteWorksEventListener12 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onGetParagraphRunners("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm_267", remoteWorksEventListener12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }

    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array6 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo7 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo7, interpreterInfo_array6);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList10 = new org.apache.zeppelin.types.InterpreterSettingsList("hi!", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo7, false);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList12 = new org.apache.zeppelin.types.InterpreterSettingsList("{\n  \"message\": \"hi!\"\n}", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo7, true);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList14 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm_229", "org.apache.zeppelin.realm.LdapRealm_273", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo7, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener7 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener10 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket11 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest8, "subtree", notebookSocketListener10);
    notebookServer1.onMessage(notebookSocket11, "org.apache.zeppelin.realm.LdapRealm_187");
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket16 = notebookServer1.doWebSocketConnect(httpServletRequest14, "org.apache.zeppelin.realm.LdapRealm_175");
    org.apache.zeppelin.search.SearchService searchService17 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi18 = new org.apache.zeppelin.rest.NotebookRestApi(notebook0, notebookServer1, searchService17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket16);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setUserLowerCase(false);
    boolean b9 = ldapRealm0.isAuthenticationCachingEnabled();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory10 = ldapRealm0.getContextFactory();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver11 = ldapRealm0.getRolePermissionResolver();
    org.apache.zeppelin.realm.LdapRealm ldapRealm12 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm12.setUserSearchAttributeTemplate("hi!");
    java.lang.String str15 = ldapRealm12.getUserSearchAttributeTemplate();
    ldapRealm12.setUserObjectClass("hi!");
    ldapRealm12.setAuthenticationCacheName("");
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher20 = ldapRealm12.getCredentialsMatcher();
    ldapRealm0.setCredentialsMatcher(credentialsMatcher20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher20);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    java.lang.String str2 = ldapRealm0.getUserSearchAttributeName();
    java.lang.String str3 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    ldapRealm0.onLogout(principalCollection4);
    org.apache.shiro.cache.CacheManager cacheManager6 = null;
    ldapRealm0.setCacheManager(cacheManager6);
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");
    ldapRealm0.setUserSearchFilter("org.apache.zeppelin.rest.exception.NotFoundException");
    org.apache.shiro.authc.AuthenticationToken authenticationToken12 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.shiro.authc.AuthenticationInfo authenticationInfo13 = ldapRealm0.getAuthenticationInfo(authenticationToken12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    boolean b5 = ldapRealm0.isAuthorizationCachingEnabled();
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher7 = ldapRealm0.getCredentialsMatcher();
    ldapRealm0.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_75");
    ldapRealm0.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_246");
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
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setHadoopSecurityCredentialPath("org.apache.zeppelin.realm.LdapRealm_47");
    activeDirectoryGroupRealm0.setUrl("org.apache.zeppelin.realm.LdapRealm_175");
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo9 = activeDirectoryGroupRealm0.getAuthenticationCache();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo9);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }

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
    javax.ws.rs.core.Response response18 = interpreterRestApi16.removeSetting("org.apache.zeppelin.realm.LdapRealm_780");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.cache.CacheManager cacheManager3 = null;
    ldapRealm0.setCacheManager(cacheManager3);
    ldapRealm0.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver7 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver7);
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm10 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm10.setUserSearchAttributeTemplate("hi!");
    ldapRealm10.setAuthorizationEnabled(false);
    ldapRealm10.setAuthenticationCachingEnabled(false);
    ldapRealm10.setUserSearchBase("hi!");
    java.lang.String str19 = ldapRealm10.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection20 = null;
    java.lang.String[] str_array22 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array23 = ldapRealm10.isPermitted(principalCollection20, str_array22);
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkPermissions(principalCollection9, str_array22);
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array23);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }

    org.apache.zeppelin.rest.message.NewParagraphRequest newParagraphRequest0 = new org.apache.zeppelin.rest.message.NewParagraphRequest();
    java.lang.Double d1 = newParagraphRequest0.getIndex();
    java.lang.Double d2 = newParagraphRequest0.getIndex();
    java.lang.String str3 = newParagraphRequest0.getTitle();
    java.lang.Double d4 = newParagraphRequest0.getIndex();
    java.lang.String str5 = newParagraphRequest0.getText();
    java.lang.Double d6 = newParagraphRequest0.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d6);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener6 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket7 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest4, "subtree", notebookSocketListener6);
    boolean b8 = notebookSocket7.isConnected();
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket7);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket12 = notebookServer0.doWebSocketConnect(httpServletRequest10, "org.apache.zeppelin.realm.LdapRealm_189");
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket12.send("org.apache.zeppelin.realm.LdapRealm_676");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket12);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "cn", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    java.lang.String str5 = notebookSocket3.getProtocol();
    org.eclipse.jetty.websocket.api.Session session6 = notebookSocket3.getSession();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException8 = new org.apache.zeppelin.rest.exception.ForbiddenException("hi!");
    notebookSocket3.onWebSocketError((java.lang.Throwable)forbiddenException8);
    byte[] byte_array13 = new byte[] { (byte)10, (byte)-1, (byte)0 };
    notebookSocket3.onWebSocketBinary(byte_array13, (int)(short)0, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "cn"+ "'", str5.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }

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
    javax.ws.rs.core.Response.Status status12 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm13 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm13.setUserSearchAttributeTemplate("hi!");
    ldapRealm13.setAuthorizationEnabled(false);
    ldapRealm13.setAuthenticationCachingEnabled(false);
    ldapRealm13.setUserSearchBase("hi!");
    java.lang.String str22 = ldapRealm13.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo23 = null;
    ldapRealm13.setAuthorizationCache(cache_obj_authorizationInfo23);
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm25 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status12, (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm13);
    ldapRealm13.setName("org.apache.zeppelin.rest.exception.NotFoundException");
    java.util.Map<java.lang.String,java.lang.String> map_str_str28 = ldapRealm13.getRolesByGroup();
    ldapRealm0.setRolesByGroup(map_str_str28);
    org.apache.shiro.subject.PrincipalCollection principalCollection30 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm0.checkRole(principalCollection30, "org.apache.zeppelin.realm.LdapRealm_916");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1112"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_1112"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str28);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getAuthenticationCacheName();
    ldapRealm0.setName("org.apache.zeppelin.realm.LdapRealm_1094");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.1114"+ "'", str9.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.1114"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }

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
    java.lang.String str16 = ldapRealm0.getGroupSearchScope();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "subtree"+ "'", str16.equals("subtree"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }

    org.apache.zeppelin.rest.SecurityRestApi securityRestApi0 = new org.apache.zeppelin.rest.SecurityRestApi();
    javax.ws.rs.core.Response response2 = securityRestApi0.getUserList("org.apache.zeppelin.realm.LdapRealm_509");
    javax.ws.rs.core.Response response3 = securityRestApi0.ticket();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.PamRealm pamRealm2 = new org.apache.zeppelin.realm.PamRealm();
    pamRealm2.setService("");
    org.apache.shiro.subject.PrincipalCollection principalCollection5 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm6 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm6.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver9 = ldapRealm6.getPermissionResolver();
    boolean b10 = ldapRealm6.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm12 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm12.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver15 = ldapRealm12.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection16 = null;
    java.lang.String[] str_array20 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str21 = new java.util.ArrayList<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str21, str_array20);
    boolean[] b_array23 = ldapRealm12.hasRoles(principalCollection16, (java.util.List<java.lang.String>)arraylist_str21);
    boolean[] b_array24 = ldapRealm6.hasRoles(principalCollection11, (java.util.List<java.lang.String>)arraylist_str21);
    boolean[] b_array25 = pamRealm2.hasRoles(principalCollection5, (java.util.List<java.lang.String>)arraylist_str21);
    org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<java.lang.String>> jsonresponse_abstractcollection_str26 = new org.apache.zeppelin.server.JsonResponse<java.util.AbstractCollection<java.lang.String>>(status0, "org.apache.zeppelin.realm.LdapRealm_273", (java.util.AbstractCollection<java.lang.String>)arraylist_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array25);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }

    org.apache.zeppelin.rest.ZeppelinRestApi zeppelinRestApi0 = new org.apache.zeppelin.rest.ZeppelinRestApi();
    javax.ws.rs.core.Response response1 = zeppelinRestApi0.getVersion();
    javax.ws.rs.core.Response response2 = zeppelinRestApi0.getVersion();
    javax.ws.rs.core.Response response3 = zeppelinRestApi0.getRoot();
    javax.ws.rs.core.Response response4 = zeppelinRestApi0.getVersion();
    javax.ws.rs.core.Response response5 = zeppelinRestApi0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response5);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    ldapRealm2.setName("{\"message\":\"hi!\"}");
    ldapRealm2.setUserSearchAttributeName("org.apache.zeppelin.realm.LdapRealm_175");
    java.lang.String str13 = ldapRealm2.getMemberAttribute();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "member"+ "'", str13.equals("member"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    java.lang.String str5 = ldapRealm2.getUserSearchAttributeTemplate();
    java.lang.String str6 = ldapRealm2.getUserSearchAttributeName();
    boolean b7 = ldapRealm2.isAuthorizationCachingEnabled();
    org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm> jsonresponse_jndiLdapRealm8 = new org.apache.zeppelin.server.JsonResponse<org.apache.shiro.realm.ldap.JndiLdapRealm>(status0, "org.apache.zeppelin.realm.LdapRealm_93", (org.apache.shiro.realm.ldap.JndiLdapRealm)ldapRealm2);
    ldapRealm2.setName("{\"message\":\"hi!\"}");
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.shiro.authz.Permission permission12 = null;
    boolean b13 = ldapRealm2.isPermitted(principalCollection11, permission12);
    org.apache.shiro.subject.PrincipalCollection principalCollection14 = null;
    // The following exception was thrown during execution in test generation
    try {
    ldapRealm2.checkPermission(principalCollection14, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.555");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.authz.UnauthorizedException");
    } catch (org.apache.shiro.authz.UnauthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }

    org.apache.zeppelin.rest.ZeppelinRestApi zeppelinRestApi0 = new org.apache.zeppelin.rest.ZeppelinRestApi();
    javax.ws.rs.core.Response response1 = zeppelinRestApi0.getVersion();
    javax.ws.rs.core.Response response2 = zeppelinRestApi0.getRoot();
    javax.ws.rs.core.Response response3 = zeppelinRestApi0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    ldapRealm0.setUserLowerCase(false);
    ldapRealm0.setUserObjectClass("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm.authenticationCache.260");
    boolean b14 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm0.setAuthorizationCacheName("org.apache.zeppelin.realm.LdapRealm.authorizationCache.510");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    java.lang.String str6 = ldapRealm2.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    java.util.List<java.lang.String> list_str8 = null;
    boolean[] b_array9 = ldapRealm2.hasRoles(principalCollection7, list_str8);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = ldapRealm2.getAuthorizationCache();
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm12 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm12.setUserSearchAttributeTemplate("hi!");
    java.lang.String str15 = ldapRealm12.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection16 = null;
    java.util.Collection collection17 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b18 = ldapRealm12.isPermittedAll(principalCollection16, (java.util.Collection<org.apache.shiro.authz.Permission>)collection17);
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = ldapRealm12.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection20 = null;
    org.apache.shiro.authz.Permission[] permission_array21 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission22 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission22, permission_array21);
    ldapRealm12.checkPermissions(principalCollection20, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission22);
    ldapRealm2.checkPermissions(principalCollection11, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission22);
    org.apache.zeppelin.server.JsonResponse<java.util.ArrayList<org.apache.shiro.authz.Permission>> jsonresponse_arraylist_permission26 = new org.apache.zeppelin.server.JsonResponse<java.util.ArrayList<org.apache.shiro.authz.Permission>>(status0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245", arraylist_permission22);
    javax.ws.rs.core.Response.Status status27 = jsonresponse_arraylist_permission26.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "cn"+ "'", str6.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status27);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("org.apache.zeppelin.realm.LdapRealm_840");

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException0 = new org.apache.zeppelin.rest.exception.ForbiddenException();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException2 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException4 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException2, "");

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer7 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer7.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject9);
    org.apache.zeppelin.display.AngularObject angularObject12 = null;
    notebookServer7.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject12);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket14 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest5, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest3, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket15);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type20 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm.authenticationCache.545", "", (-1), type20, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    notebookServer0.broadcastUpdateNoteJobInfo((-1L));
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer0;
    org.apache.zeppelin.notebook.Note note12 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl13 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer0, note12);
    org.apache.zeppelin.scheduler.Job job14 = null;
    org.apache.zeppelin.scheduler.Job.Status status15 = null;
    org.apache.zeppelin.scheduler.Job.Status status16 = null;
    // The following exception was thrown during execution in test generation
    try {
    paragraphListenerImpl13.afterStatusChange(job14, status15, status16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isCachingEnabled();
    boolean b5 = ldapRealm0.isAuthorizationEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = null;
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi2 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = notebookRepoRestApi2.refreshRepo();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.545", (int)' ', "");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener12 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm_273", "org.apache.zeppelin.realm.LdapRealm_676", 0, "org.apache.zeppelin.realm.LdapRealm_558", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379");
    org.apache.zeppelin.interpreter.InterpreterResult.Type type22 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm_867", (int)(short)10, type22, "org.apache.zeppelin.realm.LdapRealm_704");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }

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
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException56 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException58 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException56, "");
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException60 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)badRequestException58, "org.apache.zeppelin.realm.LdapRealm.authorizationCache.339");
    notebookSocket50.onWebSocketError((java.lang.Throwable)badRequestException58);
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.1128"+ "'", str19.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.1128"));
    
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
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    activeDirectoryGroupRealm0.setSearchBase("");
    activeDirectoryGroupRealm0.setSearchBase("cn");
    activeDirectoryGroupRealm0.setSystemUsername("");
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory9 = activeDirectoryGroupRealm0.getLdapContextFactory();
    org.apache.shiro.cache.CacheManager cacheManager10 = activeDirectoryGroupRealm0.getCacheManager();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo11 = null;
    activeDirectoryGroupRealm0.setAuthorizationCache(cache_obj_authorizationInfo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cacheManager10);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    corsFilter0.destroy();
    corsFilter0.destroy();
    corsFilter0.destroy();
    corsFilter0.destroy();

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response1 = heliumRestApi0.getAllPackageConfigs();
    javax.ws.rs.core.Response response3 = heliumRestApi0.getSpellConfigUsingMagic("org.apache.zeppelin.realm.LdapRealm.authenticationCache.545");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = heliumRestApi0.getVisualizationPackageOrder("org.apache.zeppelin.realm.LdapRealm_882");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo4 = ldapRealm0.getAuthorizationCache();
    ldapRealm0.setPagingSize((int)(short)1);
    java.lang.String str7 = ldapRealm0.getAuthorizationCacheName();
    java.lang.String str8 = ldapRealm0.getUserObjectClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authorizationCache.1130"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm.authorizationCache.1130"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "person"+ "'", str8.equals("person"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }

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
    javax.ws.rs.core.Response response17 = interpreterRestApi16.listRepositories();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }

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
    org.apache.zeppelin.notebook.Note note24 = null;
    org.apache.zeppelin.notebook.ParagraphJobListener paragraphJobListener25 = notebookServer0.getParagraphJobListener(note24);
    javax.servlet.http.HttpServletRequest httpServletRequest26 = null;
    boolean b28 = notebookServer0.checkOrigin(httpServletRequest26, "person");
    org.apache.zeppelin.display.AngularObject angularObject30 = null;
    notebookServer0.onUpdate("org.apache.zeppelin.realm.LdapRealm_229", angularObject30);
    notebookServer0.onStatusChange("org.apache.zeppelin.realm.LdapRealm_447", "", "org.apache.zeppelin.realm.LdapRealm_301", "org.apache.zeppelin.realm.LdapRealm_651");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "cn"+ "'", str17.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = ldapRealm0.getListRoles();
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    ldapRealm0.setPermissionResolver(permissionResolver5);
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str7 = ldapRealm0.getPermissionsByRole();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str7);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.getUserLowerCase();
    ldapRealm0.setUserLowerCase(false);
    ldapRealm0.setCachingEnabled(true);
    boolean b11 = ldapRealm0.isAuthorizationEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject2 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject2);
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener4 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer0);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer0.onAdd("org.apache.zeppelin.realm.LdapRealm_256", angularObject6);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type11 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", 0, type11, "org.apache.zeppelin.realm.LdapRealm_825");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    java.lang.String str7 = ldapRealm0.getName();
    ldapRealm0.init();
    boolean b9 = ldapRealm0.isAuthorizationEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1137"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_1137"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }

    org.apache.zeppelin.rest.ZeppelinRestApi zeppelinRestApi0 = new org.apache.zeppelin.rest.ZeppelinRestApi();
    javax.ws.rs.core.Response response1 = zeppelinRestApi0.getVersion();
    javax.ws.rs.core.Response response2 = zeppelinRestApi0.getVersion();
    javax.ws.rs.core.Response response3 = zeppelinRestApi0.getRoot();
    javax.ws.rs.core.Response response4 = zeppelinRestApi0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    boolean b4 = ldapRealm0.isAuthenticationCachingEnabled();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo5 = null;
    ldapRealm0.setAuthenticationCache(cache_obj_authenticationInfo5);
    ldapRealm0.setGroupSearchBase("org.apache.zeppelin.realm.LdapRealm.authenticationCache.359");
    ldapRealm0.setUserSearchBase("org.apache.zeppelin.realm.LdapRealm_75");
    java.lang.String str11 = ldapRealm0.getSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }

    org.apache.zeppelin.server.CorsFilter corsFilter0 = new org.apache.zeppelin.server.CorsFilter();
    corsFilter0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    corsFilter0.init(filterConfig2);
    corsFilter0.destroy();

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }

    org.apache.zeppelin.rest.message.NewParagraphRequest newParagraphRequest0 = new org.apache.zeppelin.rest.message.NewParagraphRequest();
    java.lang.Double d1 = newParagraphRequest0.getIndex();
    java.lang.Double d2 = newParagraphRequest0.getIndex();
    java.util.HashMap<java.lang.String,java.lang.Object> hashmap_str_obj3 = newParagraphRequest0.getConfig();
    java.lang.String str4 = newParagraphRequest0.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_str_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm2 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm2.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver5 = ldapRealm2.getPermissionResolver();
    java.lang.String str6 = ldapRealm2.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection7 = null;
    java.util.List<java.lang.String> list_str8 = null;
    boolean[] b_array9 = ldapRealm2.hasRoles(principalCollection7, list_str8);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo10 = ldapRealm2.getAuthorizationCache();
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm12 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm12.setUserSearchAttributeTemplate("hi!");
    java.lang.String str15 = ldapRealm12.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection16 = null;
    java.util.Collection collection17 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b18 = ldapRealm12.isPermittedAll(principalCollection16, (java.util.Collection<org.apache.shiro.authz.Permission>)collection17);
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = ldapRealm12.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection20 = null;
    org.apache.shiro.authz.Permission[] permission_array21 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission22 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission22, permission_array21);
    ldapRealm12.checkPermissions(principalCollection20, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission22);
    ldapRealm2.checkPermissions(principalCollection11, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission22);
    org.apache.zeppelin.server.JsonResponse<java.util.ArrayList<org.apache.shiro.authz.Permission>> jsonresponse_arraylist_permission26 = new org.apache.zeppelin.server.JsonResponse<java.util.ArrayList<org.apache.shiro.authz.Permission>>(status0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245", arraylist_permission22);
    org.apache.zeppelin.realm.LdapRealm ldapRealm27 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm27.setUserSearchAttributeTemplate("hi!");
    java.lang.String str30 = ldapRealm27.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection31 = null;
    java.util.Collection collection32 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b33 = ldapRealm27.isPermittedAll(principalCollection31, (java.util.Collection<org.apache.shiro.authz.Permission>)collection32);
    java.util.Map<java.lang.String,java.lang.String> map_str_str34 = ldapRealm27.getRolesByGroup();
    org.apache.shiro.subject.PrincipalCollection principalCollection35 = null;
    org.apache.shiro.authz.Permission[] permission_array36 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission37 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission37, permission_array36);
    ldapRealm27.checkPermissions(principalCollection35, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission37);
    jsonresponse_arraylist_permission26.setBody(arraylist_permission37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "cn"+ "'", str6.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    notebookServer1.broadcastUpdateNoteJobInfo(10L);
    org.apache.zeppelin.search.SearchService searchService10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi11 = new org.apache.zeppelin.rest.NotebookRestApi(notebook0, notebookServer1, searchService10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }

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
    javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket32 = notebookServer0.doWebSocketConnect(httpServletRequest30, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379");
    javax.servlet.http.HttpServletRequest httpServletRequest33 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer35 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject37 = null;
    notebookServer35.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject37);
    org.apache.zeppelin.display.AngularObject angularObject40 = null;
    notebookServer35.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject40);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket42 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest33, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer35);
    org.apache.zeppelin.notebook.socket.Message message43 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.saveInterpreterBindings(notebookSocket42, message43);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket32);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer2.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer2;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "groupOfNames", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket9.onWebSocketClose((-1), "org.apache.zeppelin.realm.LdapRealm_988");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = credentialRestApi1.putCredentials("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    activeDirectoryGroupRealm0.setHadoopSecurityCredentialPath("org.apache.zeppelin.realm.LdapRealm_47");
    activeDirectoryGroupRealm0.setUrl("org.apache.zeppelin.realm.LdapRealm_175");
    java.lang.String str9 = activeDirectoryGroupRealm0.getAuthenticationCacheName();
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_371");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.ActiveDirectoryGroupRealm.authenticationCache.1142"+ "'", str9.equals("org.apache.zeppelin.realm.ActiveDirectoryGroupRealm.authenticationCache.1142"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }

    org.apache.zeppelin.rest.message.NewNoteRequest newNoteRequest0 = new org.apache.zeppelin.rest.message.NewNoteRequest();
    java.lang.String str1 = newNoteRequest0.getName();
    java.util.List<org.apache.zeppelin.rest.message.NewParagraphRequest> list_newParagraphRequest2 = newNoteRequest0.getParagraphs();
    java.util.List<org.apache.zeppelin.rest.message.NewParagraphRequest> list_newParagraphRequest3 = newNoteRequest0.getParagraphs();
    java.util.List<org.apache.zeppelin.rest.message.NewParagraphRequest> list_newParagraphRequest4 = newNoteRequest0.getParagraphs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_newParagraphRequest2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_newParagraphRequest3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_newParagraphRequest4);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint4 = notebookSocket3.getRemote();
    org.eclipse.jetty.websocket.api.Session session5 = notebookSocket3.getSession();
    byte[] byte_array6 = new byte[] {  };
    notebookSocket3.onWebSocketBinary(byte_array6, (int)(byte)10, 100);
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException10 = new org.apache.zeppelin.rest.exception.ForbiddenException();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException12 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException10, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    notebookSocket3.onWebSocketError((java.lang.Throwable)notFoundException12);
    javax.ws.rs.core.Response response14 = notFoundException12.getResponse();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response14);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher5 = null;
    ldapRealm0.setCredentialsMatcher(credentialsMatcher5);
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver7 = null;
    ldapRealm0.setRolePermissionResolver(rolePermissionResolver7);
    org.apache.shiro.subject.PrincipalCollection principalCollection9 = null;
    org.apache.zeppelin.rest.GetUserList getUserList10 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.LdapRealm ldapRealm11 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm11.setUserSearchAttributeTemplate("hi!");
    ldapRealm11.setAuthorizationEnabled(false);
    ldapRealm11.setUserDnTemplate("subtree");
    java.util.List<java.lang.String> list_str18 = getUserList10.getRolesList(ldapRealm11);
    boolean b19 = ldapRealm0.hasAllRoles(principalCollection9, (java.util.Collection<java.lang.String>)list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }

    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject3 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject3);
    org.apache.zeppelin.display.AngularObject angularObject6 = null;
    notebookServer1.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject6);
    org.apache.zeppelin.notebook.NotebookEventListener notebookEventListener8 = notebookServer1.getNotebookInformationListener();
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi9 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    javax.ws.rs.core.Response response11 = notebookRepoRestApi9.updateRepoSetting("org.apache.zeppelin.realm.LdapRealm_152");
    javax.ws.rs.core.Response response13 = notebookRepoRestApi9.updateRepoSetting("org.apache.zeppelin.realm.LdapRealm_75");
    javax.ws.rs.core.Response response15 = notebookRepoRestApi9.updateRepoSetting("org.apache.zeppelin.realm.LdapRealm.authenticationCache.922");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookEventListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response15);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }

    org.apache.zeppelin.rest.message.NewInterpreterSettingRequest newInterpreterSettingRequest0 = new org.apache.zeppelin.rest.message.NewInterpreterSettingRequest();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = newInterpreterSettingRequest0.getOption();
    java.lang.String str2 = newInterpreterSettingRequest0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOption1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer2 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer2.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer2;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket9 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "(.*)", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer2);
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager12 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer13 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer13.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph19 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph20 = null;
    notebookServer13.broadcastParagraphs(map_str_paragraph19, paragraph20);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi22 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager12, notebookServer13);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket23 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest10, "org.apache.zeppelin.realm.LdapRealm_75", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer13);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer2.onClose(notebookSocket23, (int)(byte)100, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str1);
    activeDirectoryGroupRealm0.setPrincipalSuffix("org.apache.zeppelin.realm.LdapRealm_109");
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver5 = activeDirectoryGroupRealm0.getRolePermissionResolver();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver6 = activeDirectoryGroupRealm0.getRolePermissionResolver();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    java.lang.String str10 = ldapRealm7.getUserSearchScope();
    org.apache.shiro.cache.CacheManager cacheManager11 = null;
    ldapRealm7.setCacheManager(cacheManager11);
    ldapRealm7.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_109");
    java.util.Map<java.lang.String,java.lang.String> map_str_str15 = ldapRealm7.getListRoles();
    activeDirectoryGroupRealm0.setGroupRolesMap(map_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "subtree"+ "'", str10.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str15);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    ldapRealm0.setUserSearchBase("(.*)");
    ldapRealm0.setUserSearchScope("(.*)");
    org.apache.zeppelin.realm.LdapRealm ldapRealm11 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm11.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver14 = ldapRealm11.getPermissionResolver();
    java.lang.String str15 = ldapRealm11.getGroupIdAttribute();
    org.apache.shiro.subject.PrincipalCollection principalCollection16 = null;
    java.util.List<java.lang.String> list_str17 = null;
    boolean[] b_array18 = ldapRealm11.hasRoles(principalCollection16, list_str17);
    java.lang.String str19 = ldapRealm11.getUserObjectClass();
    org.apache.zeppelin.realm.LdapRealm ldapRealm20 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm20.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver23 = ldapRealm20.getPermissionResolver();
    boolean b24 = ldapRealm20.isAuthorizationEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection25 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm26 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm26.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver29 = ldapRealm26.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection30 = null;
    java.lang.String[] str_array34 = new java.lang.String[] { "subtree", "subtree", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str35, str_array34);
    boolean[] b_array37 = ldapRealm26.hasRoles(principalCollection30, (java.util.List<java.lang.String>)arraylist_str35);
    boolean[] b_array38 = ldapRealm20.hasRoles(principalCollection25, (java.util.List<java.lang.String>)arraylist_str35);
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo39 = null;
    ldapRealm20.setAuthorizationCache(cache_obj_authorizationInfo39);
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher41 = ldapRealm20.getCredentialsMatcher();
    ldapRealm11.setCredentialsMatcher(credentialsMatcher41);
    ldapRealm0.setCredentialsMatcher(credentialsMatcher41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "cn"+ "'", str15.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "person"+ "'", str19.equals("person"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher41);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }

    org.apache.zeppelin.user.Credentials credentials0 = null;
    org.apache.zeppelin.rest.CredentialRestApi credentialRestApi1 = new org.apache.zeppelin.rest.CredentialRestApi(credentials0);
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = credentialRestApi1.putCredentials("org.apache.zeppelin.realm.LdapRealm.authenticationCache.863");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }

    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b2 = org.apache.zeppelin.utils.SecurityUtils.isValidOrigin("org.apache.zeppelin.realm.LdapRealm_878", zeppelinConfiguration1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }

    javax.ws.rs.core.Response.Status status0 = null;
    java.util.Properties properties2 = null;
    org.apache.zeppelin.dep.Dependency[] dependency_array3 = new org.apache.zeppelin.dep.Dependency[] {  };
    java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency4 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, dependency_array3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = null;
    org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest updateInterpreterSettingRequest7 = new org.apache.zeppelin.rest.message.UpdateInterpreterSettingRequest(properties2, (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4, interpreterOption6);
    org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>> jsonresponse_list_dependency8 = new org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>>(status0, "org.apache.zeppelin.realm.LdapRealm_139", (java.util.List<org.apache.zeppelin.dep.Dependency>)arraylist_dependency4);
    org.apache.zeppelin.server.JsonResponse<java.util.List<org.apache.zeppelin.dep.Dependency>> jsonresponse_list_dependency10 = jsonresponse_list_dependency8.setPretty(false);
    java.lang.String str11 = jsonresponse_list_dependency10.toString();
    javax.ws.rs.core.Response.Status status12 = jsonresponse_list_dependency10.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonresponse_list_dependency10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}"+ "'", str11.equals("{\"message\":\"org.apache.zeppelin.realm.LdapRealm_139\",\"body\":[]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status12);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver1 = pamRealm0.getPermissionResolver();
    java.lang.String str2 = pamRealm0.getService();
    java.lang.Class class3 = pamRealm0.getAuthenticationTokenClass();
    java.lang.String str4 = pamRealm0.getService();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    javax.ws.rs.core.Response response10 = heliumRestApi2.getPackageConfig("{}", "org.apache.zeppelin.realm.LdapRealm_485");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response14 = heliumRestApi2.suggest("org.apache.zeppelin.realm.LdapRealm_867", "org.apache.zeppelin.realm.LdapRealm_246", "{\"message\":\"member\"}");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response10);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }

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
    notebookServer0.onOutputUpdated("org.apache.zeppelin.realm.LdapRealm_109", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.765", (int)(short)-1, type33, "org.apache.zeppelin.realm.LdapRealm_139");
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
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }

    org.apache.zeppelin.rest.exception.NotFoundException notFoundException1 = new org.apache.zeppelin.rest.exception.NotFoundException("org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }

    org.apache.zeppelin.notebook.Notebook notebook0 = null;
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
    javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
    boolean b29 = notebookServer1.checkOrigin(httpServletRequest27, "person");
    org.apache.zeppelin.display.AngularObject angularObject31 = null;
    notebookServer1.onUpdate("org.apache.zeppelin.realm.LdapRealm_229", angularObject31);
    org.apache.zeppelin.search.SearchService searchService33 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.rest.NotebookRestApi notebookRestApi34 = new org.apache.zeppelin.rest.NotebookRestApi(notebook0, notebookServer1, searchService33);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "cn"+ "'", str18.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response5 = heliumRestApi2.getAllPackageConfigs();
    javax.ws.rs.core.Response response8 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_205", "groupOfNames");
    javax.ws.rs.core.Response response11 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm_265");
    javax.ws.rs.core.Response response15 = heliumRestApi2.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm_509", "org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272");
    javax.ws.rs.core.Response response19 = heliumRestApi2.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm_1015", "org.apache.zeppelin.realm.LdapRealm_651", "org.apache.zeppelin.realm.LdapRealm_980");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response19);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph1 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph2 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph1, paragraph2);
    org.apache.zeppelin.display.AngularObject angularObject5 = null;
    notebookServer0.onUpdate("", angularObject5);
    notebookServer0.onOutputAppend("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.545", (int)' ', "");
    org.apache.zeppelin.notebook.Note note12 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.broadcastNote(note12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.broadcastUpdateNoteJobInfo((long)(byte)0);
    javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer7 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject9 = null;
    notebookServer7.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject9);
    org.apache.zeppelin.display.AngularObject angularObject12 = null;
    notebookServer7.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject12);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket14 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest5, "org.apache.zeppelin.realm.LdapRealm_139", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    org.apache.zeppelin.socket.NotebookSocket notebookSocket15 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest3, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.379", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer7);
    notebookServer0.unsubscribeNoteJobInfo(notebookSocket15);
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener19 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket20 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest17, "subtree", notebookSocketListener19);
    boolean b21 = notebookSocket20.isConnected();
    boolean b22 = notebookSocket20.isConnected();
    java.lang.String str23 = notebookSocket20.getUser();
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener26 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket27 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest24, "subtree", notebookSocketListener26);
    org.eclipse.jetty.websocket.api.RemoteEndpoint remoteEndpoint28 = notebookSocket27.getRemote();
    org.eclipse.jetty.websocket.api.Session session29 = notebookSocket27.getSession();
    byte[] byte_array30 = new byte[] {  };
    notebookSocket27.onWebSocketBinary(byte_array30, (int)(byte)10, 100);
    notebookSocket20.onWebSocketBinary(byte_array30, (int)(short)-1, (int)(byte)1);
    notebookSocket15.onWebSocketBinary(byte_array30, (int)(short)-1, (int)(short)1);
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException41 = new org.apache.zeppelin.rest.exception.NotFoundException("hi!");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException43 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException41, "");
    javax.ws.rs.core.Response response44 = badRequestException43.getResponse();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException46 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)badRequestException43, "org.apache.zeppelin.realm.LdapRealm_134");
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException48 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException46, "{\n  \"message\": \"hi!\"\n}");
    java.lang.Throwable[] throwable_array49 = forbiddenException46.getSuppressed();
    notebookSocket15.onWebSocketError((java.lang.Throwable)forbiddenException46);
    // The following exception was thrown during execution in test generation
    try {
    notebookSocket15.onWebSocketClose(0, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.1114");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array49);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }

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
    ldapRealm0.setUserSearchFilter("org.apache.zeppelin.realm.LdapRealm_109");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1152"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm_1152"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    boolean b6 = ldapRealm0.isAuthorizationEnabled();
    org.apache.zeppelin.realm.LdapRealm ldapRealm7 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm7.setUserSearchAttributeTemplate("hi!");
    ldapRealm7.setAuthorizationEnabled(false);
    ldapRealm7.setAuthenticationCachingEnabled(false);
    ldapRealm7.setUserSearchBase("hi!");
    java.lang.String str16 = ldapRealm7.getSearchBase();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo17 = null;
    ldapRealm7.setAuthorizationCache(cache_obj_authorizationInfo17);
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver19 = ldapRealm7.getPermissionResolver();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory20 = ldapRealm7.getContextFactory();
    ldapRealm0.setContextFactory(ldapContextFactory20);
    ldapRealm0.setAuthorizationEnabled(true);
    ldapRealm0.setPagingSize(1);
    java.lang.String str26 = ldapRealm0.getUserObjectClass();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authc.AuthenticationInfo> cache_obj_authenticationInfo27 = ldapRealm0.getAuthenticationCache();
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver28 = ldapRealm0.getRolePermissionResolver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authenticationInfo27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver28);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection10 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array13 = ldapRealm0.isPermitted(principalCollection10, str_array12);
    ldapRealm0.setUserSearchScope("org.apache.zeppelin.realm.LdapRealm_267");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }

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
    java.util.Map<java.lang.String,java.lang.String> map_str_str20 = ldapRealm19.getListRoles();
    java.lang.String str21 = ldapRealm19.getGroupSearchBase();
    java.util.List<java.lang.String> list_str23 = getUserList0.getUserList(ldapRealm19, "org.apache.zeppelin.realm.LdapRealm_47");
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher24 = ldapRealm19.getCredentialsMatcher();
    
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
    org.junit.Assert.assertNotNull(map_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher24);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph7 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
    notebookServer1.broadcastParagraphs(map_str_paragraph7, paragraph8);
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi10 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    org.apache.zeppelin.socket.NotebookWebSocketCreator notebookWebSocketCreator11 = new org.apache.zeppelin.socket.NotebookWebSocketCreator(notebookServer1);
    org.apache.zeppelin.socket.NotebookServer notebookServer12 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer12.onStatusChange("cn", "", "subtree", "subtree");
    org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener notebookInformationListener18 = new org.apache.zeppelin.socket.NotebookServer.NotebookInformationListener(notebookServer12);
    javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener21 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket22 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest19, "subtree", notebookSocketListener21);
    notebookServer12.onMessage(notebookSocket22, "org.apache.zeppelin.realm.LdapRealm_187");
    javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket27 = notebookServer12.doWebSocketConnect(httpServletRequest25, "org.apache.zeppelin.realm.LdapRealm_175");
    org.apache.zeppelin.notebook.socket.Message message28 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer1.unicastNoteJobInfo(notebookSocket27, message28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket27);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.realm.PamRealm pamRealm1 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver2 = pamRealm1.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection3 = null;
    java.lang.String[] str_array40 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_256", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266", "{\"message\":\"hi!\"}", "{\n  \"message\": \"hi!\"\n}", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_187", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm_133", "org.apache.zeppelin.realm.LdapRealm_246", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm_300", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.167", "org.apache.zeppelin.realm.LdapRealm_109", "org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm_175", "hi!", "org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm_300", "{}", "org.apache.zeppelin.realm.LdapRealm_229", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.272", "org.apache.zeppelin.realm.LdapRealm_306", "org.apache.zeppelin.realm.LdapRealm_205", "groupOfNames", "", "org.apache.zeppelin.realm.LdapRealm_301", "org.apache.zeppelin.realm.LdapRealm_134", "org.apache.zeppelin.realm.LdapRealm_300", "{}", "org.apache.zeppelin.realm.LdapRealm_189", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.260", "org.apache.zeppelin.realm.LdapRealm_301" };
    java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str41, str_array40);
    boolean[] b_array43 = pamRealm1.hasRoles(principalCollection3, (java.util.List<java.lang.String>)arraylist_str41);
    org.apache.zeppelin.server.JsonResponse<java.util.Collection<java.lang.String>> jsonresponse_collection_str44 = new org.apache.zeppelin.server.JsonResponse<java.util.Collection<java.lang.String>>(status0, (java.util.Collection<java.lang.String>)arraylist_str41);
    java.lang.String str45 = jsonresponse_collection_str44.toString();
    javax.ws.rs.core.Response.Status status46 = jsonresponse_collection_str44.getCode();
    javax.ws.rs.core.Response.Status status47 = jsonresponse_collection_str44.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{\"body\":[\"org.apache.zeppelin.realm.LdapRealm_256\",\"org.apache.zeppelin.rest.exception.NotFoundException\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.260\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.266\",\"{\\\"message\\\":\\\"hi!\\\"}\",\"{\\n  \\\"message\\\": \\\"hi!\\\"\\n}\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.272\",\"org.apache.zeppelin.realm.LdapRealm_75\",\"org.apache.zeppelin.realm.LdapRealm_187\",\"org.apache.zeppelin.realm.LdapRealm_133\",\"org.apache.zeppelin.realm.LdapRealm_133\",\"org.apache.zeppelin.realm.LdapRealm_246\",\"org.apache.zeppelin.rest.exception.NotFoundException\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.167\",\"org.apache.zeppelin.realm.LdapRealm_109\",\"org.apache.zeppelin.realm.LdapRealm_93\",\"org.apache.zeppelin.realm.LdapRealm_175\",\"hi!\",\"org.apache.zeppelin.realm.LdapRealm_189\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"{}\",\"org.apache.zeppelin.realm.LdapRealm_229\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.272\",\"org.apache.zeppelin.realm.LdapRealm_306\",\"org.apache.zeppelin.realm.LdapRealm_205\",\"groupOfNames\",\"\",\"org.apache.zeppelin.realm.LdapRealm_301\",\"org.apache.zeppelin.realm.LdapRealm_134\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"{}\",\"org.apache.zeppelin.realm.LdapRealm_189\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.132\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.260\",\"org.apache.zeppelin.realm.LdapRealm_301\"]}"+ "'", str45.equals("{\"body\":[\"org.apache.zeppelin.realm.LdapRealm_256\",\"org.apache.zeppelin.rest.exception.NotFoundException\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.260\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.266\",\"{\\\"message\\\":\\\"hi!\\\"}\",\"{\\n  \\\"message\\\": \\\"hi!\\\"\\n}\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.272\",\"org.apache.zeppelin.realm.LdapRealm_75\",\"org.apache.zeppelin.realm.LdapRealm_187\",\"org.apache.zeppelin.realm.LdapRealm_133\",\"org.apache.zeppelin.realm.LdapRealm_133\",\"org.apache.zeppelin.realm.LdapRealm_246\",\"org.apache.zeppelin.rest.exception.NotFoundException\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.167\",\"org.apache.zeppelin.realm.LdapRealm_109\",\"org.apache.zeppelin.realm.LdapRealm_93\",\"org.apache.zeppelin.realm.LdapRealm_175\",\"hi!\",\"org.apache.zeppelin.realm.LdapRealm_189\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"{}\",\"org.apache.zeppelin.realm.LdapRealm_229\",\"org.apache.zeppelin.realm.LdapRealm.authorizationCache.272\",\"org.apache.zeppelin.realm.LdapRealm_306\",\"org.apache.zeppelin.realm.LdapRealm_205\",\"groupOfNames\",\"\",\"org.apache.zeppelin.realm.LdapRealm_301\",\"org.apache.zeppelin.realm.LdapRealm_134\",\"org.apache.zeppelin.realm.LdapRealm_300\",\"{}\",\"org.apache.zeppelin.realm.LdapRealm_189\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.132\",\"org.apache.zeppelin.realm.LdapRealm.authenticationCache.260\",\"org.apache.zeppelin.realm.LdapRealm_301\"]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status47);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }

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
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi27 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync0, notebookServer1);
    javax.ws.rs.core.Response response29 = notebookRepoRestApi27.updateRepoSetting("org.apache.zeppelin.realm.LdapRealm_558");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "cn"+ "'", str18.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(session19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response29);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }

    javax.ws.rs.core.Response.Status status0 = null;
    org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.GetUserList> jsonresponse_getUserList1 = new org.apache.zeppelin.server.JsonResponse<org.apache.zeppelin.rest.GetUserList>(status0);
    jsonresponse_getUserList1.setMessage("org.apache.zeppelin.realm.LdapRealm.authenticationCache.312");
    jsonresponse_getUserList1.setMessage("org.apache.zeppelin.realm.LdapRealm_366");
    org.apache.zeppelin.rest.GetUserList getUserList6 = jsonresponse_getUserList1.getBody();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(getUserList6);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    java.lang.Class class7 = ldapRealm0.getAuthenticationTokenClass();
    org.apache.zeppelin.json.NotebookTypeAdapterFactory<java.util.Set<java.lang.String>> notebooktypeadapterfactory_set_str8 = new org.apache.zeppelin.json.NotebookTypeAdapterFactory<java.util.Set<java.lang.String>>((java.lang.Class<java.util.Set<java.lang.String>>)class7);
    org.apache.zeppelin.json.NotebookTypeAdapterFactory<org.apache.zeppelin.server.CorsFilter> notebooktypeadapterfactory_corsFilter9 = new org.apache.zeppelin.json.NotebookTypeAdapterFactory<org.apache.zeppelin.server.CorsFilter>((java.lang.Class<org.apache.zeppelin.server.CorsFilter>)class7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class7);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    org.apache.shiro.cache.Cache<java.lang.Object,org.apache.shiro.authz.AuthorizationInfo> cache_obj_authorizationInfo4 = ldapRealm0.getAuthorizationCache();
    ldapRealm0.setPagingSize((int)(short)1);
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str7 = ldapRealm0.getPermissionsByRole();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory8 = ldapRealm0.getContextFactory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cache_obj_authorizationInfo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory8);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher5 = null;
    ldapRealm0.setCredentialsMatcher(credentialsMatcher5);
    java.lang.String str7 = ldapRealm0.getAuthorizationCacheName();
    ldapRealm0.setGroupIdAttribute("subtree");
    ldapRealm0.setUserSearchScope("org.apache.zeppelin.realm.LdapRealm_845");
    java.lang.String str12 = ldapRealm0.getUserObjectClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authorizationCache.1163"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm.authorizationCache.1163"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "person"+ "'", str12.equals("person"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }

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
    javax.ws.rs.core.Response response15 = interpreterRestApi10.restartSetting("org.apache.zeppelin.realm.LdapRealm_1110", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.451");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response12);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    java.lang.String str7 = ldapRealm0.getUserSearchFilter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchScope();
    ldapRealm0.setUserDnTemplate("");
    java.lang.String str6 = ldapRealm0.getPrincipalRegex();
    org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
    boolean b8 = ldapRealm0.supports(authenticationToken7);
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm_134");
    java.lang.String str11 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserSearchAttributeName("org.apache.zeppelin.rest.exception.BadRequestException: org.apache.zeppelin.rest.exception.NotFoundException");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "subtree"+ "'", str3.equals("subtree"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(.*)"+ "'", str6.equals("(.*)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }

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
    javax.ws.rs.core.Response response18 = interpreterRestApi16.getSetting("org.apache.zeppelin.realm.LdapRealm_558");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response21 = interpreterRestApi16.updateSetting("org.apache.zeppelin.realm.LdapRealm_913", "org.apache.zeppelin.realm.LdapRealm_867");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response18);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }

    org.apache.zeppelin.rest.NotebookResponse notebookResponse1 = new org.apache.zeppelin.rest.NotebookResponse("org.apache.zeppelin.realm.LdapRealm_910");

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }

    org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array2 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo3 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo3, interpreterInfo_array2);
    org.apache.zeppelin.types.InterpreterSettingsList interpreterSettingsList6 = new org.apache.zeppelin.types.InterpreterSettingsList("org.apache.zeppelin.realm.LdapRealm_1042", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.266", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>)arraylist_interpreterInfo3, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterInfo_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    ldapRealm0.setAuthenticationCacheName("");
    ldapRealm0.setGroupObjectClass("org.apache.zeppelin.realm.LdapRealm_786");
    ldapRealm0.setPermissionsByRole("org.apache.zeppelin.realm.LdapRealm.authenticationCache.245");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.utils.SecurityUtils.initSecurityManager("org.apache.zeppelin.realm.LdapRealm_366");
      org.junit.Assert.fail("Expected exception of type org.apache.shiro.config.ConfigurationException");
    } catch (org.apache.shiro.config.ConfigurationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    java.lang.String str4 = ldapRealm0.getUserSearchAttributeName();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher5 = null;
    ldapRealm0.setCredentialsMatcher(credentialsMatcher5);
    java.lang.String str7 = ldapRealm0.getAuthorizationCacheName();
    java.lang.String str8 = ldapRealm0.getGroupObjectClass();
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm_152");
    org.apache.shiro.subject.PrincipalCollection principalCollection11 = null;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm12 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm12.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm15 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory16 = activeDirectoryGroupRealm15.getLdapContextFactory();
    activeDirectoryGroupRealm12.setLdapContextFactory(ldapContextFactory16);
    activeDirectoryGroupRealm12.setSystemUsername("subtree");
    org.apache.shiro.subject.PrincipalCollection principalCollection20 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm21 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm21.setUserSearchAttributeTemplate("hi!");
    java.lang.String str24 = ldapRealm21.getUserSearchAttributeTemplate();
    boolean b25 = ldapRealm21.isAuthorizationCachingEnabled();
    org.apache.shiro.subject.PrincipalCollection principalCollection26 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm27 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm27.setUserSearchAttributeTemplate("hi!");
    java.lang.String str30 = ldapRealm27.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection31 = null;
    java.util.Collection collection32 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b33 = ldapRealm27.isPermittedAll(principalCollection31, (java.util.Collection<org.apache.shiro.authz.Permission>)collection32);
    boolean b34 = ldapRealm27.isGroupSearchEnableMatchingRuleInChain();
    org.apache.shiro.subject.PrincipalCollection principalCollection35 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm36 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm36.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver39 = ldapRealm36.getPermissionResolver();
    org.apache.shiro.subject.PrincipalCollection principalCollection40 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm41 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm41.setUserSearchAttributeTemplate("hi!");
    ldapRealm41.setAuthorizationEnabled(false);
    ldapRealm41.setAuthenticationCachingEnabled(false);
    ldapRealm41.setUserSearchBase("hi!");
    java.lang.String str50 = ldapRealm41.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection51 = null;
    java.lang.String[] str_array53 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array54 = ldapRealm41.isPermitted(principalCollection51, str_array53);
    boolean[] b_array55 = ldapRealm36.isPermitted(principalCollection40, str_array53);
    boolean[] b_array56 = ldapRealm27.isPermitted(principalCollection35, str_array53);
    boolean[] b_array57 = ldapRealm21.isPermitted(principalCollection26, str_array53);
    boolean b58 = activeDirectoryGroupRealm12.isPermittedAll(principalCollection20, str_array53);
    boolean[] b_array59 = ldapRealm0.isPermitted(principalCollection11, str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authorizationCache.1171"+ "'", str7.equals("org.apache.zeppelin.realm.LdapRealm.authorizationCache.1171"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "groupOfNames"+ "'", str8.equals("groupOfNames"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array59);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }

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
    notebookRepoSettingsRequest0.name = "org.apache.zeppelin.realm.LdapRealm_1137";
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "groupOfNames"+ "'", str19.equals("groupOfNames"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    ldapRealm0.setUserObjectClass("hi!");
    int i6 = ldapRealm0.getPagingSize();
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm.authorizationCache.510");
    ldapRealm0.setUserSearchAttributeTemplate("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket10 = notebookServer1.doWebSocketConnect(httpServletRequest8, "org.apache.zeppelin.realm.LdapRealm_654");
    javax.servlet.http.HttpServletRequest httpServletRequest11 = notebookSocket10.getRequest();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(notebookSocket10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest11);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    java.lang.Class class3 = activeDirectoryGroupRealm0.getAuthenticationTokenClass();
    activeDirectoryGroupRealm0.setSystemUsername("org.apache.zeppelin.realm.LdapRealm_152");
    boolean b6 = activeDirectoryGroupRealm0.isAuthorizationCachingEnabled();
    activeDirectoryGroupRealm0.setSearchBase("org.apache.zeppelin.realm.LdapRealm_189");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }

    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException1 = new org.apache.zeppelin.rest.exception.ForbiddenException("org.apache.zeppelin.realm.LdapRealm.authorizationCache.96");

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver3 = ldapRealm0.getPermissionResolver();
    java.lang.String str4 = ldapRealm0.getGroupIdAttribute();
    java.lang.String str5 = ldapRealm0.getUserSearchBase();
    ldapRealm0.setAuthorizationCachingEnabled(true);
    java.lang.String str8 = ldapRealm0.getGroupSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "cn"+ "'", str4.equals("cn"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm0.setUserDnTemplate("");
    java.util.Map<java.lang.String,java.lang.String> map_str_str10 = ldapRealm0.getRolesByGroup();
    java.lang.String str11 = ldapRealm0.getGroupSearchBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }

    org.apache.zeppelin.rest.GetUserList getUserList0 = new org.apache.zeppelin.rest.GetUserList();
    org.apache.zeppelin.realm.LdapRealm ldapRealm1 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm1.setUserSearchAttributeTemplate("hi!");
    ldapRealm1.setAuthorizationEnabled(false);
    ldapRealm1.setUserDnTemplate("subtree");
    java.util.List<java.lang.String> list_str8 = getUserList0.getRolesList(ldapRealm1);
    ldapRealm1.setAuthenticationCacheName("cn");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    ldapRealm0.setAuthorizationEnabled(false);
    ldapRealm0.setAuthenticationCachingEnabled(false);
    ldapRealm0.setUserSearchBase("hi!");
    java.lang.String str9 = ldapRealm0.getName();
    ldapRealm0.setUserDnTemplate("org.apache.zeppelin.realm.LdapRealm.authenticationCache.379");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1186"+ "'", str9.equals("org.apache.zeppelin.realm.LdapRealm_1186"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    pamRealm0.setService("org.apache.zeppelin.realm.LdapRealm_265");
    org.apache.shiro.subject.PrincipalCollection principalCollection3 = null;
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer6 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer6.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.server.ZeppelinServer.notebookWsServer = notebookServer6;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket13 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest4, "groupOfNames", (org.apache.zeppelin.socket.NotebookSocketListener)notebookServer6);
    org.apache.zeppelin.realm.LdapRealm ldapRealm15 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm15.setUserSearchAttributeTemplate("hi!");
    java.lang.String str18 = ldapRealm15.getUserSearchAttributeTemplate();
    java.lang.String str19 = ldapRealm15.getUserSearchAttributeName();
    boolean b20 = ldapRealm15.isAuthorizationCachingEnabled();
    boolean b21 = ldapRealm15.isAuthorizationEnabled();
    org.apache.shiro.authc.credential.CredentialsMatcher credentialsMatcher22 = ldapRealm15.getCredentialsMatcher();
    java.lang.String str23 = ldapRealm15.getAuthenticationCacheName();
    org.apache.shiro.subject.PrincipalCollection principalCollection24 = null;
    java.lang.String[] str_array46 = new java.lang.String[] { "{}", "org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.rest.exception.NotFoundException", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.realm.LdapRealm_205", "org.apache.zeppelin.realm.LdapRealm_139", "{}", "org.apache.zeppelin.realm.LdapRealm_205", "org.apache.zeppelin.realm.LdapRealm_47", "org.apache.zeppelin.realm.LdapRealm_133", "{\"message\":\"hi!\"}", "hi!", "org.apache.zeppelin.realm.LdapRealm_175", "{}", "(.*)", "org.apache.zeppelin.realm.LdapRealm_109", "{}", "org.apache.zeppelin.realm.LdapRealm.authorizationCache.96", "org.apache.zeppelin.rest.exception.NotFoundException", "cn", "groupOfNames" };
    java.util.ArrayList<java.lang.String> arraylist_str47 = new java.util.ArrayList<java.lang.String>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str47, str_array46);
    boolean b49 = ldapRealm15.hasAllRoles(principalCollection24, (java.util.Collection<java.lang.String>)arraylist_str47);
    notebookServer6.broadcastInterpreterBindings("", (java.util.List)arraylist_str47);
    boolean b51 = pamRealm0.hasAllRoles(principalCollection3, (java.util.Collection<java.lang.String>)arraylist_str47);
    java.lang.String str52 = pamRealm0.getService();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(credentialsMatcher22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "org.apache.zeppelin.realm.LdapRealm.authenticationCache.1188"+ "'", str23.equals("org.apache.zeppelin.realm.LdapRealm.authenticationCache.1188"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_265"+ "'", str52.equals("org.apache.zeppelin.realm.LdapRealm_265"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm3 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory4 = activeDirectoryGroupRealm3.getLdapContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory4);
    activeDirectoryGroupRealm0.setSystemUsername("subtree");
    javax.naming.ldap.LdapContext ldapContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str10 = activeDirectoryGroupRealm0.searchForUserName("org.apache.zeppelin.realm.LdapRealm.authenticationCache.1188", ldapContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory4);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }

    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi0 = new org.apache.zeppelin.rest.InterpreterRestApi();
    javax.ws.rs.core.Response response2 = interpreterRestApi0.removeRepository("{}");
    javax.ws.rs.core.Response response4 = interpreterRestApi0.removeRepository("(.*)");
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = interpreterRestApi0.updateSetting("org.apache.zeppelin.realm.ActiveDirectoryGroupRealm.authenticationCache.823", "anonymous");
      org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
    } catch (com.google.gson.JsonSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str1 = ldapRealm0.getPermissionsByRole();
    org.apache.shiro.authc.AuthenticationToken authenticationToken2 = null;
    boolean b3 = ldapRealm0.supports(authenticationToken2);
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    org.apache.shiro.authz.Permission permission5 = null;
    boolean b6 = ldapRealm0.isPermitted(principalCollection4, permission5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }

    org.apache.zeppelin.helium.Helium helium0 = null;
    org.apache.zeppelin.notebook.Notebook notebook1 = null;
    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi2 = new org.apache.zeppelin.rest.HeliumRestApi(helium0, notebook1);
    javax.ws.rs.core.Response response4 = heliumRestApi2.getSpellConfigUsingMagic("cn");
    javax.ws.rs.core.Response response7 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.realm.LdapRealm_75", "org.apache.zeppelin.realm.LdapRealm_175");
    javax.ws.rs.core.Response response10 = heliumRestApi2.getPackageConfig("{}", "org.apache.zeppelin.realm.LdapRealm_485");
    javax.ws.rs.core.Response response13 = heliumRestApi2.getPackageConfig("org.apache.zeppelin.rest.exception.BadRequestException", "org.apache.zeppelin.realm.LdapRealm_676");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response13);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }

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
    org.apache.zeppelin.notebook.Note note20 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl21 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer0, note20);
    org.apache.zeppelin.notebook.Paragraph paragraph22 = null;
    org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync23 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer24 = new org.apache.zeppelin.socket.NotebookServer();
    org.apache.zeppelin.display.AngularObject angularObject26 = null;
    notebookServer24.onAdd("org.apache.zeppelin.realm.LdapRealm_47", angularObject26);
    org.apache.zeppelin.display.AngularObject angularObject29 = null;
    notebookServer24.onAdd("org.apache.zeppelin.realm.LdapRealm_93", angularObject29);
    org.apache.zeppelin.rest.NotebookRepoRestApi notebookRepoRestApi31 = new org.apache.zeppelin.rest.NotebookRepoRestApi(notebookRepoSync23, notebookServer24);
    org.apache.zeppelin.notebook.Note note32 = null;
    org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl paragraphListenerImpl33 = new org.apache.zeppelin.socket.NotebookServer.ParagraphListenerImpl(notebookServer24, note32);
    org.apache.zeppelin.notebook.Paragraph paragraph34 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array35 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage36 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage36, interpreterResultMessage_array35);
    paragraphListenerImpl33.onOutputUpdateAll(paragraph34, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage36);
    paragraphListenerImpl21.onOutputUpdateAll(paragraph22, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEndpoint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paragraphJobListener19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }

    org.apache.zeppelin.rest.message.NewParagraphRequest newParagraphRequest0 = new org.apache.zeppelin.rest.message.NewParagraphRequest();
    java.lang.Double d1 = newParagraphRequest0.getIndex();
    java.lang.Double d2 = newParagraphRequest0.getIndex();
    java.lang.String str3 = newParagraphRequest0.getTitle();
    java.lang.Double d4 = newParagraphRequest0.getIndex();
    java.lang.String str5 = newParagraphRequest0.getTitle();
    java.util.HashMap<java.lang.String,java.lang.Object> hashmap_str_obj6 = newParagraphRequest0.getConfig();
    java.lang.String str7 = newParagraphRequest0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(d4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_str_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting9 = null;
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.clearParagraphRuntimeInfo(interpreterSetting9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }

    org.apache.zeppelin.realm.PamRealm pamRealm0 = new org.apache.zeppelin.realm.PamRealm();
    org.apache.shiro.authz.permission.PermissionResolver permissionResolver1 = pamRealm0.getPermissionResolver();
    pamRealm0.setService("");
    java.lang.String str4 = pamRealm0.getService();
    java.lang.String str5 = pamRealm0.getService();
    org.apache.shiro.subject.PrincipalCollection principalCollection6 = null;
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm7 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    java.util.Map<java.lang.String,java.lang.String> map_str_str8 = null;
    activeDirectoryGroupRealm7.setGroupRolesMap(map_str_str8);
    org.apache.zeppelin.realm.LdapRealm ldapRealm10 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm10.setUserSearchAttributeTemplate("hi!");
    ldapRealm10.setAuthorizationEnabled(false);
    ldapRealm10.setAuthenticationCachingEnabled(false);
    ldapRealm10.setUserSearchBase("hi!");
    java.lang.String str19 = ldapRealm10.getName();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory20 = ldapRealm10.getContextFactory();
    activeDirectoryGroupRealm7.setLdapContextFactory(ldapContextFactory20);
    org.apache.shiro.subject.PrincipalCollection principalCollection22 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm23 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm23.setUserSearchAttributeTemplate("hi!");
    java.lang.String str26 = ldapRealm23.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection27 = null;
    java.util.Collection collection28 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b29 = ldapRealm23.isPermittedAll(principalCollection27, (java.util.Collection<org.apache.shiro.authz.Permission>)collection28);
    boolean b30 = ldapRealm23.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm23.setUserDnTemplate("");
    org.apache.shiro.subject.PrincipalCollection principalCollection33 = null;
    org.apache.zeppelin.realm.LdapRealm ldapRealm34 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm34.setUserSearchAttributeTemplate("hi!");
    ldapRealm34.setAuthorizationEnabled(false);
    ldapRealm34.setAuthenticationCachingEnabled(false);
    ldapRealm34.setUserSearchBase("hi!");
    java.lang.String str43 = ldapRealm34.getSearchBase();
    org.apache.shiro.subject.PrincipalCollection principalCollection44 = null;
    java.lang.String[] str_array46 = new java.lang.String[] { "org.apache.zeppelin.realm.LdapRealm_47" };
    boolean[] b_array47 = ldapRealm34.isPermitted(principalCollection44, str_array46);
    boolean[] b_array48 = ldapRealm23.isPermitted(principalCollection33, str_array46);
    boolean b49 = activeDirectoryGroupRealm7.isPermittedAll(principalCollection22, str_array46);
    boolean b50 = pamRealm0.isPermittedAll(principalCollection6, str_array46);
    pamRealm0.setAuthorizationCachingEnabled(false);
    pamRealm0.setAuthenticationCachingEnabled(true);
    pamRealm0.setService("org.apache.zeppelin.realm.LdapRealm_246");
    pamRealm0.setService("");
    org.apache.shiro.authc.AuthenticationToken authenticationToken59 = null;
    boolean b60 = pamRealm0.supports(authenticationToken59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permissionResolver1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.apache.zeppelin.realm.LdapRealm_1194"+ "'", str19.equals("org.apache.zeppelin.realm.LdapRealm_1194"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }

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
    org.apache.shiro.authz.permission.RolePermissionResolver rolePermissionResolver15 = ldapRealm0.getRolePermissionResolver();
    java.lang.String str16 = ldapRealm0.getGroupSearchScope();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rolePermissionResolver15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "subtree"+ "'", str16.equals("subtree"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }

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
    java.lang.String str31 = ldapRealm0.getPrincipalRegex();
    
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
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "(.*)"+ "'", str31.equals("(.*)"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }

    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm0 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    activeDirectoryGroupRealm0.setSearchBase("hi!");
    org.apache.zeppelin.realm.ActiveDirectoryGroupRealm activeDirectoryGroupRealm3 = new org.apache.zeppelin.realm.ActiveDirectoryGroupRealm();
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory4 = activeDirectoryGroupRealm3.getLdapContextFactory();
    activeDirectoryGroupRealm0.setLdapContextFactory(ldapContextFactory4);
    org.apache.shiro.subject.PrincipalCollection principalCollection6 = null;
    org.apache.shiro.authz.Permission[] permission_array7 = new org.apache.shiro.authz.Permission[] {  };
    java.util.ArrayList<org.apache.shiro.authz.Permission> arraylist_permission8 = new java.util.ArrayList<org.apache.shiro.authz.Permission>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission8, permission_array7);
    activeDirectoryGroupRealm0.checkPermissions(principalCollection6, (java.util.Collection<org.apache.shiro.authz.Permission>)arraylist_permission8);
    org.apache.shiro.realm.ldap.LdapContextFactory ldapContextFactory11 = activeDirectoryGroupRealm0.getLdapContextFactory();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(permission_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ldapContextFactory11);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }

    org.apache.zeppelin.realm.LdapRealm ldapRealm0 = new org.apache.zeppelin.realm.LdapRealm();
    ldapRealm0.setUserSearchAttributeTemplate("hi!");
    java.lang.String str3 = ldapRealm0.getUserSearchAttributeTemplate();
    org.apache.shiro.subject.PrincipalCollection principalCollection4 = null;
    java.util.Collection collection5 = org.apache.zeppelin.utils.SecurityUtils.getRealmsList();
    boolean b6 = ldapRealm0.isPermittedAll(principalCollection4, (java.util.Collection<org.apache.shiro.authz.Permission>)collection5);
    boolean b7 = ldapRealm0.isGroupSearchEnableMatchingRuleInChain();
    ldapRealm0.setUserDnTemplate("");
    ldapRealm0.setGroupSearchScope("org.apache.zeppelin.realm.LdapRealm.authenticationCache.185");
    boolean b12 = ldapRealm0.isAuthorizationCachingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }

    org.apache.zeppelin.rest.HeliumRestApi heliumRestApi0 = new org.apache.zeppelin.rest.HeliumRestApi();
    javax.ws.rs.core.Response response2 = heliumRestApi0.getSpellConfigUsingMagic("");
    javax.ws.rs.core.Response response6 = heliumRestApi0.updatePackageConfig("org.apache.zeppelin.realm.LdapRealm_93", "org.apache.zeppelin.realm.LdapRealm_175", "org.apache.zeppelin.rest.exception.NotFoundException");
    javax.ws.rs.core.Response response8 = heliumRestApi0.getSinglePackageInfo("org.apache.zeppelin.realm.LdapRealm_133");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response8);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }

    org.apache.zeppelin.rest.ZeppelinRestApi zeppelinRestApi0 = new org.apache.zeppelin.rest.ZeppelinRestApi();
    javax.ws.rs.core.Response response1 = zeppelinRestApi0.getVersion();
    javax.ws.rs.core.Response response2 = zeppelinRestApi0.getVersion();
    javax.ws.rs.core.Response response3 = zeppelinRestApi0.getVersion();
    javax.ws.rs.core.Response response4 = zeppelinRestApi0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(response4);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    org.apache.zeppelin.socket.NotebookSocketListener notebookSocketListener2 = null;
    org.apache.zeppelin.socket.NotebookSocket notebookSocket3 = new org.apache.zeppelin.socket.NotebookSocket(httpServletRequest0, "subtree", notebookSocketListener2);
    boolean b4 = notebookSocket3.isConnected();
    boolean b5 = notebookSocket3.isConnected();
    java.lang.String str6 = notebookSocket3.getUser();
    javax.servlet.http.HttpServletRequest httpServletRequest7 = notebookSocket3.getRequest();
    java.lang.String str8 = notebookSocket3.getProtocol();
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException9 = new org.apache.zeppelin.rest.exception.ForbiddenException();
    org.apache.zeppelin.rest.exception.NotFoundException notFoundException11 = new org.apache.zeppelin.rest.exception.NotFoundException((java.lang.Throwable)forbiddenException9, "org.apache.zeppelin.realm.LdapRealm.authenticationCache.132");
    org.apache.zeppelin.rest.exception.BadRequestException badRequestException13 = new org.apache.zeppelin.rest.exception.BadRequestException((java.lang.Throwable)notFoundException11, "{\"message\":\"hi!\"}");
    org.apache.zeppelin.rest.exception.ForbiddenException forbiddenException15 = new org.apache.zeppelin.rest.exception.ForbiddenException((java.lang.Throwable)badRequestException13, "org.apache.zeppelin.realm.LdapRealm_306");
    notebookSocket3.onWebSocketError((java.lang.Throwable)badRequestException13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(httpServletRequest7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "subtree"+ "'", str8.equals("subtree"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }

    org.apache.zeppelin.socket.NotebookServer notebookServer0 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer0.onStatusChange("cn", "", "subtree", "subtree");
    java.util.Map<java.lang.String,org.apache.zeppelin.notebook.Paragraph> map_str_paragraph6 = null;
    org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
    notebookServer0.broadcastParagraphs(map_str_paragraph6, paragraph7);
    // The following exception was thrown during execution in test generation
    try {
    notebookServer0.onRemove("org.apache.zeppelin.realm.LdapRealm_47", "", "org.apache.zeppelin.realm.LdapRealm.authenticationCache.245", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }

    org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager0 = null;
    org.apache.zeppelin.socket.NotebookServer notebookServer1 = new org.apache.zeppelin.socket.NotebookServer();
    notebookServer1.onStatusChange("hi!", "", "subtree", "");
    org.apache.zeppelin.rest.InterpreterRestApi interpreterRestApi7 = new org.apache.zeppelin.rest.InterpreterRestApi(interpreterSettingManager0, notebookServer1);
    javax.servlet.ServletConfig servletConfig8 = notebookServer1.getServletConfig();
    notebookServer1.onStatusChange("", "org.apache.zeppelin.realm.ActiveDirectoryGroupRealm.authenticationCache.1142", "anonymous", "groupOfNames");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(servletConfig8);

  }

}
