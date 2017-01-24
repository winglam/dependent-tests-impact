
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test001"); }

    org.apache.ambari.server.configuration.Configuration.DatabaseType databaseType0 = org.apache.ambari.server.configuration.Configuration.DatabaseType.DERBY;
    org.junit.Assert.assertTrue("'" + databaseType0 + "' != '" + org.apache.ambari.server.configuration.Configuration.DatabaseType.DERBY + "'", databaseType0.equals(org.apache.ambari.server.configuration.Configuration.DatabaseType.DERBY));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test002"); }

    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder1 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder2 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder3 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody5 = null;
    javax.ws.rs.core.UriInfo uriInfo6 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance7 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest8 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders4, requestBody5, uriInfo6, resourceInstance7);
    int i9 = postRequest8.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type10 = postRequest8.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder11 = addUserToGroupRequestAuditEventBuilder3.withRequestType(type10);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder12 = deleteRepositoryVersionAuditEventBuilder2.withRequestType(type10);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder13 = userPasswordChangeRequestAuditEventBuilder1.withRequestType(type10);
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder14 = addUpgradeRequestAuditEventBuilder0.withRequestType(type10);
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder15 = org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder17 = addAlertGroupRequestAuditEventBuilder15.withName("ViewInstanceInfo/view_name");
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder19 = addAlertGroupRequestAuditEventBuilder15.withRemoteIp("alerts.json");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS20 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus21 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS20);
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder22 = addAlertGroupRequestAuditEventBuilder19.withResultStatus(resultStatus21);
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder23 = addUpgradeRequestAuditEventBuilder14.withResultStatus(resultStatus21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type10.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUpgradeRequestAuditEventBuilder14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUpgradeRequestAuditEventBuilder23);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test003"); }

    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder1 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance6 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest7 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders3, requestBody4, uriInfo5, resourceInstance6);
    int i8 = postRequest7.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type9 = postRequest7.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder10 = addUserToGroupRequestAuditEventBuilder2.withRequestType(type9);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder11 = deleteRepositoryVersionAuditEventBuilder1.withRequestType(type9);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder12 = userPasswordChangeRequestAuditEventBuilder0.withRequestType(type9);
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder13 = org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS14 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus15 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS14);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS16 = resultStatus15.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS17 = resultStatus15.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl18 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus15);
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder19 = clusterPrivilegeChangeRequestAuditEventBuilder13.withResultStatus(resultStatus15);
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder21 = clusterPrivilegeChangeRequestAuditEventBuilder19.withRemoteIp("ACTION_NAME");
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder22 = new org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder23 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder24 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder25 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders26 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody27 = null;
    javax.ws.rs.core.UriInfo uriInfo28 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance29 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest30 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders26, requestBody27, uriInfo28, resourceInstance29);
    int i31 = postRequest30.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type32 = postRequest30.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder33 = addUserToGroupRequestAuditEventBuilder25.withRequestType(type32);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder34 = deleteRepositoryVersionAuditEventBuilder24.withRequestType(type32);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder35 = userPasswordChangeRequestAuditEventBuilder23.withRequestType(type32);
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder36 = addUpgradeRequestAuditEventBuilder22.withRequestType(type32);
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder37 = clusterPrivilegeChangeRequestAuditEventBuilder21.withRequestType(type32);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder38 = userPasswordChangeRequestAuditEventBuilder0.withRequestType(type32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type9.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type32.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUpgradeRequestAuditEventBuilder36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder38);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test004"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse8.setInputs("ViewUrlInfo/view_instance_version");
    java.lang.String str11 = actionResponse8.getTargetType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "AlertTarget/notification_type"+ "'", str11.equals("AlertTarget/notification_type"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test005"); }

    org.apache.ambari.server.state.ServiceOsSpecific serviceOsSpecific0 = new org.apache.ambari.server.state.ServiceOsSpecific();
    org.apache.ambari.server.state.ServiceOsSpecific.Repo repo1 = serviceOsSpecific0.getRepo();
    java.lang.String str2 = serviceOsSpecific0.getOsFamily();
    org.apache.ambari.server.state.ServiceOsSpecific.Package[] package_array3 = new org.apache.ambari.server.state.ServiceOsSpecific.Package[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.ServiceOsSpecific.Package> arraylist_package4 = new java.util.ArrayList<org.apache.ambari.server.state.ServiceOsSpecific.Package>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.ServiceOsSpecific.Package>)arraylist_package4, package_array3);
    serviceOsSpecific0.addPackages((java.util.List<org.apache.ambari.server.state.ServiceOsSpecific.Package>)arraylist_package4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(repo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(package_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test006() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest6.test006"); }

    // org.apache.ambari.server.orm.entities.ClusterEntity clusterEntity0 = null;
    // com.google.inject.Injector injector1 = null;
    // org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher2 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    // org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener3 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher2);
    // org.apache.ambari.server.state.alert.AlertDefinition alertDefinition5 = null;
    // org.apache.ambari.server.events.AlertDefinitionChangedEvent alertDefinitionChangedEvent6 = new org.apache.ambari.server.events.AlertDefinitionChangedEvent((long)(byte)100, alertDefinition5);
    // ambariEventPublisher2.publish((org.apache.ambari.server.events.AmbariEvent)alertDefinitionChangedEvent6);
    // org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener alertMaintenanceModeListener8 = new org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener(ambariEventPublisher2);
    // org.apache.ambari.server.events.listeners.upgrade.HostVersionOutOfSyncListener hostVersionOutOfSyncListener9 = new org.apache.ambari.server.events.listeners.upgrade.HostVersionOutOfSyncListener(ambariEventPublisher2);
    // // The following exception was thrown during execution in test generation
    // try {
    // org.apache.ambari.server.state.cluster.ClusterImpl clusterImpl10 = new org.apache.ambari.server.state.cluster.ClusterImpl(clusterEntity0, injector1, ambariEventPublisher2);
    //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // } catch (java.lang.NullPointerException e) {
    //   // Expected exception.
    // }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test007"); }

    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport0 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i1 = clusterHealthReport0.getUnhealthyStatusHosts();
    int i2 = clusterHealthReport0.getStaleConfigsHosts();
    int i3 = clusterHealthReport0.getInitStateHosts();
    clusterHealthReport0.setUnhealthyStatusHosts(2000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test008"); }

    org.apache.ambari.server.orm.entities.RepositoryEntity repositoryEntity0 = new org.apache.ambari.server.orm.entities.RepositoryEntity();
    java.lang.String str1 = repositoryEntity0.getRepositoryId();
    repositoryEntity0.setRepositoryId("ranger-knox-plugin-enabled");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test009"); }

    org.apache.ambari.server.controller.ivory.Instance instance7 = new org.apache.ambari.server.controller.ivory.Instance("The directory already exists, skipping.", "CompatibleRepositoryVersions/display_name", "Tasks/structured_out", "/api/v1/views/*", "ViewInstanceInfo/visible", "EMAIL", "Blueprints/stack_name");

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test010"); }

    org.apache.ambari.server.state.alert.AlertGroup alertGroup0 = new org.apache.ambari.server.state.alert.AlertGroup();
    alertGroup0.setName("HostRoles/public_host_name");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test011"); }

    org.apache.ambari.server.controller.RootServiceComponentRequest rootServiceComponentRequest2 = new org.apache.ambari.server.controller.RootServiceComponentRequest("15%", "Tasks/status");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test012"); }

    org.apache.ambari.server.controller.jdbc.JobHistoryPostgresConnectionFactory jobHistoryPostgresConnectionFactory0 = new org.apache.ambari.server.controller.jdbc.JobHistoryPostgresConnectionFactory();
    // The following exception was thrown during execution in test generation
    try {
    java.sql.Connection connection1 = jobHistoryPostgresConnectionFactory0.getConnection();
      org.junit.Assert.fail("Expected exception of type org.postgresql.util.PSQLException");
    } catch (org.postgresql.util.PSQLException e) {
      // Expected exception.
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test013"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo0 = new org.apache.ambari.server.state.ChangedConfigInfo();
    boolean b2 = changedConfigInfo0.equals((java.lang.Object)"UpgradeChecks/repository_version");
    org.apache.ambari.server.cleanup.TimeBasedCleanupPolicy timeBasedCleanupPolicy5 = new org.apache.ambari.server.cleanup.TimeBasedCleanupPolicy("AuthorizationInfo/cluster_name", (java.lang.Long)0L);
    boolean b6 = changedConfigInfo0.equals((java.lang.Object)timeBasedCleanupPolicy5);
    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException10 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException();
    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException11 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("blueprint_name", (java.lang.Throwable)kerberosMissingAdminCredentialsException10);
    org.apache.ambari.server.view.IllegalClusterException illegalClusterException12 = new org.apache.ambari.server.view.IllegalClusterException((java.lang.Throwable)kerberosPrincipalAlreadyExistsException11);
    org.apache.ambari.server.serveraction.kerberos.KerberosLDAPContainerException kerberosLDAPContainerException13 = new org.apache.ambari.server.serveraction.kerberos.KerberosLDAPContainerException("service_type", (java.lang.Throwable)illegalClusterException12);
    org.apache.ambari.server.serveraction.kerberos.KerberosKDCConnectionException kerberosKDCConnectionException14 = new org.apache.ambari.server.serveraction.kerberos.KerberosKDCConnectionException("", (java.lang.Throwable)kerberosLDAPContainerException13);
    boolean b15 = changedConfigInfo0.equals((java.lang.Object)kerberosLDAPContainerException13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test014"); }

    org.apache.ambari.server.state.stack.upgrade.ClusterGrouping.ExecuteStage executeStage0 = new org.apache.ambari.server.state.stack.upgrade.ClusterGrouping.ExecuteStage();
    org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition configurationCondition1 = new org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition();
    java.lang.String str2 = configurationCondition1.toString();
    executeStage0.condition = configurationCondition1;
    org.apache.ambari.server.state.stack.upgrade.StartGrouping startGrouping4 = new org.apache.ambari.server.state.stack.upgrade.StartGrouping();
    startGrouping4.supportsAutoSkipOnFailure = false;
    org.apache.ambari.server.state.stack.upgrade.UpgradeScope upgradeScope7 = startGrouping4.scope;
    executeStage0.scope = upgradeScope7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ConfigurationCondition{}"+ "'", str2.equals("ConfigurationCondition{}"));
    org.junit.Assert.assertTrue("'" + upgradeScope7 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeScope.ANY + "'", upgradeScope7.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeScope.ANY));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test015"); }

    org.apache.ambari.server.events.HostRegisteredEvent hostRegisteredEvent1 = new org.apache.ambari.server.events.HostRegisteredEvent("OperatingSystems/stack_version");

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test016"); }

    org.apache.ambari.server.api.services.stackadvisor.validations.ValidationResponse.ValidationItem validationItem0 = new org.apache.ambari.server.api.services.stackadvisor.validations.ValidationResponse.ValidationItem();

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test017"); }

    org.apache.ambari.server.state.SecurityType securityType3 = null;
    java.lang.Integer[] i_array9 = new java.lang.Integer[] { 1, 0, 1, 10 };
    java.util.TreeSet<java.lang.Integer> treeset_i10 = new java.util.TreeSet<java.lang.Integer>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i10, i_array9);
    java.util.Set<java.lang.String> set_str12 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i10);
    org.apache.ambari.server.controller.ClusterRequest clusterRequest13 = new org.apache.ambari.server.controller.ClusterRequest((java.lang.Long)1L, "Versions/parent_extension_version", "ViewInstanceInfo/view_name", securityType3, "WidgetLayoutInfo/cluster_name", set_str12);
    java.lang.Long long14 = clusterRequest13.getClusterId();
    org.apache.ambari.server.state.repository.AvailableServiceReference availableServiceReference15 = new org.apache.ambari.server.state.repository.AvailableServiceReference();
    java.lang.String[] str_array34 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array34);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent37 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str35);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str35;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController39 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider40 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController39);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str41 = ldapSyncEventResourceProvider40.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController42 = null;
    com.google.inject.Injector injector43 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider44 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str35, map_type_str41, ambariManagementController42, injector43);
    org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str35;
    availableServiceReference15.components = linkedhashset_str35;
    clusterRequest13.setHostNames((java.util.Set<java.lang.String>)linkedhashset_str35);
    java.util.Set<java.lang.String> set_str48 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str49 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str48);
    org.apache.ambari.server.controller.spi.Request request50 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str48);
    java.lang.String[] str_array69 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str70 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str70, str_array69);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent72 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str70);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str70;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController74 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider75 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController74);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str76 = ldapSyncEventResourceProvider75.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController77 = null;
    com.google.inject.Injector injector78 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider79 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str70, map_type_str76, ambariManagementController77, injector78);
    org.apache.ambari.server.api.resources.JobResourceDefinition jobResourceDefinition80 = new org.apache.ambari.server.api.resources.JobResourceDefinition();
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer82 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule83 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl84 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule83);
    metricsPaddingRenderer82.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl84);
    org.apache.ambari.server.api.query.QueryImpl queryImpl86 = new org.apache.ambari.server.api.query.QueryImpl(map_type_str76, (org.apache.ambari.server.api.resources.ResourceDefinition)jobResourceDefinition80, (org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl84);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController87 = null;
    org.apache.ambari.server.controller.internal.LoggingResourceProvider loggingResourceProvider88 = new org.apache.ambari.server.controller.internal.LoggingResourceProvider(set_str48, map_type_str76, ambariManagementController87);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController89 = null;
    org.apache.ambari.server.controller.internal.MemberResourceProvider memberResourceProvider90 = new org.apache.ambari.server.controller.internal.MemberResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str35, map_type_str76, ambariManagementController89);
    org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.pkPropertyIds = linkedhashset_str35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L+ "'", long14.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str76);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test018"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.VIEW_STATUS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/status"+ "'", str0.equals("ViewVersionInfo/status"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test019"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.checks.CheckDescription.SERVICE_CHECK = checkDescription0;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_MR_DISTRIBUTED_CACHE = checkDescription0;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_NAMENODE_TRUNCATE = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test020"); }

    org.apache.ambari.server.checks.UpgradeCheckRegistry upgradeCheckRegistry0 = new org.apache.ambari.server.checks.UpgradeCheckRegistry();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack1 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack2 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack1.mergeProcessing(upgradePack2);
    upgradePack1.setName("timelineMetricCacheManager");
    java.util.Map<java.lang.String,org.apache.ambari.server.state.ServiceInfo> map_str_serviceInfo6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.ambari.server.checks.AbstractCheckDescriptor> list_abstractCheckDescriptor7 = upgradeCheckRegistry0.getServiceLevelUpgradeChecks(upgradePack1, map_str_serviceInfo6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest6.test021"); }

    // org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    // org.apache.ambari.server.state.Cluster cluster3 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType4 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction5 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj6 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext7 = new org.apache.ambari.server.state.UpgradeContext(cluster3, upgradeType4, direction5, map_str_obj6);
    // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest8 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType4);
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType9 = prereqCheckRequest8.getUpgradeType();
    // org.apache.ambari.server.state.StackId stackId12 = new org.apache.ambari.server.state.StackId("1.3.6.1.4.1.18060.16.1.1.1.1", "StackConfigurations/property_description");
    // prereqCheckRequest8.setTargetStackId(stackId12);
    // // The following exception was thrown during execution in test generation
    // try {
    // java.util.List<org.apache.ambari.server.orm.entities.HostVersionEntity> list_hostVersionEntity15 = hostVersionDAO0.findByClusterStackAndVersion("RUNNING", stackId12, "global");
    //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // } catch (java.lang.NullPointerException e) {
    //   // Expected exception.
    // }
    
    // org.junit.Assert.assertTrue("'" + upgradeType4 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType4.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    // org.junit.Assert.assertTrue("'" + upgradeType9 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType9.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test022"); }

    org.apache.ambari.server.api.services.HostService hostService1 = new org.apache.ambari.server.api.services.HostService("There is an existing {0} from {1} to {2} which has not completed. This {3} must be completed before a new upgrade or downgrade can begin.");

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test023"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setSyncGroupMemberReplacePattern("AlertTarget/notification_type");
    java.util.List<java.lang.String> list_str3 = ldapServerProperties0.getLdapUrls();
    ldapServerProperties0.setAdminGroupMappingMemberAttr("Upgrade/downgrade_allowed");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test024"); }

    org.apache.ambari.server.serveraction.kerberos.TrustingSSLSocketFactory trustingSSLSocketFactory0 = new org.apache.ambari.server.serveraction.kerberos.TrustingSSLSocketFactory();

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test025"); }

    org.apache.ambari.server.api.services.HostService hostService1 = new org.apache.ambari.server.api.services.HostService("");

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test026"); }

    org.apache.ambari.server.topology.NoSuchBlueprintException noSuchBlueprintException1 = new org.apache.ambari.server.topology.NoSuchBlueprintException("ClusterInfo/url");
    org.apache.ambari.server.view.IllegalClusterException illegalClusterException2 = new org.apache.ambari.server.view.IllegalClusterException((java.lang.Throwable)noSuchBlueprintException1);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test027"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.OperatingSystemResourceProvider.OPERATING_SYSTEM_REPOSITORY_VERSION_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OperatingSystems/repository_version_id"+ "'", str0.equals("OperatingSystems/repository_version_id"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test028"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.StackLevelConfigurationResourceDefinition stackLevelConfigurationResourceDefinition1 = new org.apache.ambari.server.api.resources.StackLevelConfigurationResourceDefinition(type0);
    java.lang.String str2 = stackLevelConfigurationResourceDefinition1.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "configurations"+ "'", str2.equals("configurations"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test029"); }

    org.apache.ambari.server.state.State state4 = org.apache.ambari.server.state.State.DISABLED;
    org.apache.ambari.server.state.SecurityType securityType5 = null;
    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider6 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition7 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider6);
    java.util.Set<java.lang.String> set_str8 = clusterDefinition7.getHosts();
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport11 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i12 = clusterHealthReport11.getInitStateHosts();
    int i13 = clusterHealthReport11.getHealthyStateHosts();
    int i14 = clusterHealthReport11.getStaleConfigsHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse15 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)10L, "stack_tools", state4, securityType5, set_str8, (java.lang.Integer)10, "_SERVICE_CHECK", clusterHealthReport11);
    org.apache.ambari.server.state.StackId stackId17 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str22 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse23 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId17, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str21, map_str_map_str_str22);
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask24 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask24.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array27 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask24 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task> arraylist_task28 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task28, task_array27);
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper30 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("widgets.json", "ViewInstanceInfo/view_name", set_str8, map_str_str21, (java.util.List<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task28);
    org.apache.ambari.server.controller.logging.LogLineResult logLineResult31 = new org.apache.ambari.server.controller.logging.LogLineResult(map_str_str21);
    java.lang.String str32 = logLineResult31.getLoggerName();
    org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state4.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test030"); }

    org.apache.ambari.server.audit.event.OperationStatusAuditEvent.OperationStatusAuditEventBuilder operationStatusAuditEventBuilder0 = org.apache.ambari.server.audit.event.OperationStatusAuditEvent.builder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(operationStatusAuditEventBuilder0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test031"); }

    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider0 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    org.apache.ambari.server.controller.spi.Predicate predicate1 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate2 = groupPrivilegeResourceProvider0.amendPredicate(predicate1);
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization3 = groupPrivilegeResourceProvider0.getRequiredDeleteAuthorizations();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController4 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider5 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController4);
    org.apache.ambari.server.controller.spi.Request request6 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate7 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus8 = widgetResourceProvider5.deleteResources(request6, predicate7);
    java.lang.String[] str_array11 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request12 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array11);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus13 = widgetResourceProvider5.createResources(request12);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate16 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate17 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array18 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate17 };
    org.apache.ambari.server.controller.spi.Predicate predicate19 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array18);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate20 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array18);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate23 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate26 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array27 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate16, andPredicate20, filterPredicate23, filterPredicate26 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate28 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array27);
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array29 = andPredicate28.getPredicates();
    java.util.Set<java.lang.String> set_str30 = andPredicate28.getPropertyIds();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource31 = groupPrivilegeResourceProvider0.getResources(request12, (org.apache.ambari.server.controller.spi.Predicate)andPredicate28);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str30);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test032"); }

    org.apache.ambari.server.state.alert.AlertGroup alertGroup0 = new org.apache.ambari.server.state.alert.AlertGroup();
    alertGroup0.setClusterName((long)5000);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test033"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = configuration0.getPreviousDatabaseConnectorNames();
    org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior ldapUsernameCollisionHandlingBehavior4 = configuration0.getLdapSyncCollisionHandlingBehavior();
    boolean b5 = configuration0.isAuditLogEnabled();
    long long6 = configuration0.getHostRoleCommandStatusSummaryCacheExpiryDuration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);
    org.junit.Assert.assertTrue("'" + ldapUsernameCollisionHandlingBehavior4 + "' != '" + org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior.CONVERT + "'", ldapUsernameCollisionHandlingBehavior4.equals(org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior.CONVERT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 30L);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test034"); }

    org.apache.ambari.server.utils.JaxbMapKeyVal jaxbMapKeyVal1 = null;
    org.apache.ambari.server.utils.JaxbMapKeyVal[] jaxbMapKeyVal_array2 = new org.apache.ambari.server.utils.JaxbMapKeyVal[] { jaxbMapKeyVal1 };
    org.apache.ambari.server.utils.JaxbMapKeyMap jaxbMapKeyMap3 = new org.apache.ambari.server.utils.JaxbMapKeyMap("UpgradeChecks/upgrade_pack", jaxbMapKeyVal_array2);
    org.apache.ambari.server.utils.JaxbMapKeyVal[] jaxbMapKeyVal_array4 = jaxbMapKeyMap3.value;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jaxbMapKeyVal_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jaxbMapKeyVal_array4);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test035"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.ambari.server.controller.HostRequest hostRequest3 = new org.apache.ambari.server.controller.HostRequest("Stage/host_params", "WidgetLayoutInfo/section_name", map_str_str2);
    hostRequest3.setHostGroupName("Requests/request_schedule/schedule_id");
    java.util.Map<java.lang.String,java.lang.String> map_str_str6 = org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper.masterToSlaveMappingForDecom;
    hostRequest3.setHostAttributes(map_str_str6);
    java.lang.String str8 = hostRequest3.getHostToClone();
    hostRequest3.setRackInfo("37a6259cc0c1dae299a7866489dff0bd");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test036"); }

    org.apache.ambari.server.api.services.ViewService viewService0 = new org.apache.ambari.server.api.services.ViewService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = viewService0.getViews("yarn.scheduler.capacity.root", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test037"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_START;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_START + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_START));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test038"); }

    org.apache.ambari.server.api.query.render.ClusterBlueprintRenderer clusterBlueprintRenderer0 = new org.apache.ambari.server.api.query.render.ClusterBlueprintRenderer();
    org.apache.ambari.server.api.util.TreeNode<org.apache.ambari.server.api.query.QueryInfo> treenode_queryInfo1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.util.TreeNode<java.util.Set<java.lang.String>> treenode_set_str3 = clusterBlueprintRenderer0.finalizeProperties(treenode_queryInfo1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test039"); }

    org.apache.ambari.server.RoleCommand roleCommand0 = org.apache.ambari.server.RoleCommand.UNINSTALL;
    org.junit.Assert.assertTrue("'" + roleCommand0 + "' != '" + org.apache.ambari.server.RoleCommand.UNINSTALL + "'", roleCommand0.equals(org.apache.ambari.server.RoleCommand.UNINSTALL));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test040"); }

    org.apache.ambari.server.orm.entities.ClusterServiceEntityPK clusterServiceEntityPK0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntityPK();
    java.lang.Long long1 = clusterServiceEntityPK0.getClusterId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test041"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent serviceComponentHostUninstallEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent("host_groups", "value", (long)(byte)100);
    java.lang.String str4 = serviceComponentHostUninstallEvent3.getStackId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test042"); }

    org.apache.ambari.server.security.encryption.MasterKeyServiceImpl masterKeyServiceImpl0 = new org.apache.ambari.server.security.encryption.MasterKeyServiceImpl();
    char[] char_array1 = masterKeyServiceImpl0.getMasterSecret();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(char_array1);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test043"); }

    org.apache.ambari.server.state.theme.Subsection subsection0 = new org.apache.ambari.server.state.theme.Subsection();

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test044"); }

    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest0 = new org.apache.ambari.server.controller.ConfigurationRequest();
    java.lang.String str1 = configurationRequest0.getServiceConfigVersionNote();
    java.lang.String str2 = configurationRequest0.getVersionTag();
    java.lang.String str3 = configurationRequest0.getServiceConfigVersionNote();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test045"); }

    org.apache.ambari.server.state.alert.Reporting.ReportingType reportingType1 = org.apache.ambari.server.state.alert.Reporting.ReportingType.NUMERIC;
    org.apache.ambari.server.controller.predicate.LessPredicate<org.apache.ambari.server.state.alert.Reporting.ReportingType> lesspredicate_reportingType2 = new org.apache.ambari.server.controller.predicate.LessPredicate<org.apache.ambari.server.state.alert.Reporting.ReportingType>("DENY", (java.lang.Comparable<org.apache.ambari.server.state.alert.Reporting.ReportingType>)reportingType1);
    java.lang.String str3 = lesspredicate_reportingType2.toString();
    java.lang.String str4 = lesspredicate_reportingType2.toString();
    org.junit.Assert.assertTrue("'" + reportingType1 + "' != '" + org.apache.ambari.server.state.alert.Reporting.ReportingType.NUMERIC + "'", reportingType1.equals(org.apache.ambari.server.state.alert.Reporting.ReportingType.NUMERIC));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "DENY<NUMERIC"+ "'", str3.equals("DENY<NUMERIC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "DENY<NUMERIC"+ "'", str4.equals("DENY<NUMERIC"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test046"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    org.apache.ambari.server.metadata.ActionMetadata actionMetadata2 = new org.apache.ambari.server.metadata.ActionMetadata();
    java.util.List<java.lang.String> list_str4 = actionMetadata2.getActions("evaluate_when");
    componentInfo0.setConfigDependencies(list_str4);
    componentInfo0.setDeleted(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test047"); }

    org.apache.ambari.server.state.alert.AlertUri alertUri0 = new org.apache.ambari.server.state.alert.AlertUri();
    java.lang.String str1 = alertUri0.getHttpUri();
    org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType2 = org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE;
    boolean b3 = alertUri0.equals((java.lang.Object)propertyType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    org.junit.Assert.assertTrue("'" + propertyType2 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE + "'", propertyType2.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test048"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.Long long1 = configuration0.getExecutionSchedulerWait();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L+ "'", long1.equals(1000L));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test049"); }

    org.apache.ambari.server.state.repository.Release release0 = new org.apache.ambari.server.state.repository.Release();
    release0.compatibleWith = "AlertNotice/history_id";

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test050"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str2 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str1);
    org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException3 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type0, set_str2);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str4 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.keyPropertyIds;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController5 = null;
    org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider6 = new org.apache.ambari.server.controller.internal.ActionResourceProvider(set_str2, map_type_str4, ambariManagementController5);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController7 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider8 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController7);
    org.apache.ambari.server.controller.spi.Request request9 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate10 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus11 = widgetResourceProvider8.deleteResources(request9, predicate10);
    java.lang.String[] str_array14 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request15 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array14);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus16 = widgetResourceProvider8.createResources(request15);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus17 = actionResourceProvider6.createResources(request15);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus16);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test051"); }

    org.apache.ambari.server.view.configuration.ViewConfig viewConfig0 = new org.apache.ambari.server.view.configuration.ViewConfig();
    java.util.List<org.apache.ambari.server.view.configuration.InstanceConfig> list_instanceConfig1 = viewConfig0.getInstances();
    java.lang.String str2 = viewConfig0.getMinAmbariVersion();
    java.lang.String str3 = viewConfig0.getMinAmbariVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_instanceConfig1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test052"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.String> singularattribute_hostRoleCommandEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.outputLog = singularattribute_hostRoleCommandEntity_str0;

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test053"); }

    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = addUserToGroupRequestAuditEventBuilder0.withUserName("StackConfigurations/type");
    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder4 = addUserToGroupRequestAuditEventBuilder2.withAffectedUserName("Upgrade/request_id");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder4);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test054"); }

    org.apache.ambari.server.api.services.ViewDataMigrationService viewDataMigrationService3 = new org.apache.ambari.server.api.services.ViewDataMigrationService("Clusters/health_report", "", "mirrorslist");

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test055"); }

    org.apache.ambari.server.api.resources.ViewUrlResourceDefinition viewUrlResourceDefinition0 = new org.apache.ambari.server.api.resources.ViewUrlResourceDefinition();
    java.lang.String str1 = viewUrlResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "view_url"+ "'", str1.equals("view_url"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test056"); }

    org.apache.ambari.server.orm.dao.ClusterVersionDAO clusterVersionDAO0 = new org.apache.ambari.server.orm.dao.ClusterVersionDAO();
    org.apache.ambari.server.orm.entities.ClusterVersionEntity clusterVersionEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    clusterVersionDAO0.refresh(clusterVersionEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test057"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_DRIVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test058"); }

    org.apache.ambari.server.orm.dao.ClusterVersionDAO clusterVersionDAO0 = new org.apache.ambari.server.orm.dao.ClusterVersionDAO();
    org.apache.ambari.server.orm.entities.ClusterEntity clusterEntity1 = null;
    org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity2 = null;
    org.apache.ambari.server.state.RepositoryVersionState repositoryVersionState3 = org.apache.ambari.server.state.RepositoryVersionState.INIT;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.ClusterVersionEntity clusterVersionEntity7 = clusterVersionDAO0.create(clusterEntity1, repositoryVersionEntity2, repositoryVersionState3, (long)3600, 1L, "kdc_hosts");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repositoryVersionState3 + "' != '" + org.apache.ambari.server.state.RepositoryVersionState.INIT + "'", repositoryVersionState3.equals(org.apache.ambari.server.state.RepositoryVersionState.INIT));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test059"); }

    org.apache.ambari.server.state.HostHealthStatus.HealthStatus healthStatus0 = org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT;
    org.apache.ambari.server.state.HostHealthStatus hostHealthStatus2 = new org.apache.ambari.server.state.HostHealthStatus(healthStatus0, "SECONDARY_NAMENODE_MUST_BE_DELETED");
    org.apache.ambari.server.state.HostHealthStatus hostHealthStatus4 = new org.apache.ambari.server.state.HostHealthStatus(healthStatus0, "slave_type");
    java.lang.String str5 = hostHealthStatus4.getHealthReport();
    org.apache.ambari.server.state.HostHealthStatus.HealthStatus healthStatus6 = org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT;
    org.apache.ambari.server.state.HostHealthStatus hostHealthStatus8 = new org.apache.ambari.server.state.HostHealthStatus(healthStatus6, "SECONDARY_NAMENODE_MUST_BE_DELETED");
    org.apache.ambari.server.state.HostHealthStatus hostHealthStatus10 = new org.apache.ambari.server.state.HostHealthStatus(healthStatus6, "slave_type");
    hostHealthStatus4.setHealthStatus(healthStatus6);
    org.junit.Assert.assertTrue("'" + healthStatus0 + "' != '" + org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT + "'", healthStatus0.equals(org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slave_type"+ "'", str5.equals("slave_type"));
    org.junit.Assert.assertTrue("'" + healthStatus6 + "' != '" + org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT + "'", healthStatus6.equals(org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test060"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    java.lang.String str2 = configuration0.isAgentStackRetryOnInstallEnabled();
    boolean b3 = configuration0.useMetricsCacheCustomSizingEngine();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false"+ "'", str2.equals("false"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test061"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceConfigVersionResourceProvider.SERVICE_CONFIG_VERSION_USER_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "user"+ "'", str0.equals("user"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test062"); }

    org.apache.ambari.server.orm.dao.PrincipalTypeDAO principalTypeDAO0 = new org.apache.ambari.server.orm.dao.PrincipalTypeDAO();

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test063"); }

    org.apache.ambari.server.controller.ivory.Cluster.Interface interface5 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array6 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface5 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface7 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface7, interface_array6);
    org.apache.ambari.server.controller.ivory.Cluster.Location location11 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array12 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location11 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location13 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location13, location_array12);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array15 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo16 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo16, propertyInfo_array15);
    java.util.Map<java.lang.String,java.lang.String> map_str_str18 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo19 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo16, map_str_str18);
    org.apache.ambari.server.controller.ivory.Cluster cluster20 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface7, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location13, map_str_str18);
    boolean b22 = cluster20.equals((java.lang.Object)"ViewInstanceInfo/visible");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test064"); }

    org.apache.ambari.server.state.RepositoryVersionState repositoryVersionState0 = org.apache.ambari.server.state.RepositoryVersionState.CURRENT;
    org.junit.Assert.assertTrue("'" + repositoryVersionState0 + "' != '" + org.apache.ambari.server.state.RepositoryVersionState.CURRENT + "'", repositoryVersionState0.equals(org.apache.ambari.server.state.RepositoryVersionState.CURRENT));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test065"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str19, str_array18);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent21 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str19);
    java.util.Set<java.lang.String> set_str22 = hostsAddedEvent21.getHostNames();
    org.apache.ambari.server.controller.spi.TemporalInfo temporalInfo24 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey timelineAppMetricCacheKey25 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey(set_str22, "Tasks/id", temporalInfo24);
    java.util.regex.Pattern pattern26 = org.apache.ambari.server.controller.internal.AbstractResourceProvider.propertiesAttributesPattern;
    boolean b27 = timelineAppMetricCacheKey25.equals((java.lang.Object)pattern26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pattern26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test066"); }

    org.apache.ambari.server.state.MaintenanceState maintenanceState0 = org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_HOST;
    org.apache.ambari.server.state.Host host2 = null;
    org.apache.ambari.server.events.MaintenanceModeEvent maintenanceModeEvent3 = new org.apache.ambari.server.events.MaintenanceModeEvent(maintenanceState0, (long)(short)100, host2);
    long long4 = maintenanceModeEvent3.getClusterId();
    org.apache.ambari.server.state.ServiceComponentHost serviceComponentHost5 = maintenanceModeEvent3.getServiceComponentHost();
    org.junit.Assert.assertTrue("'" + maintenanceState0 + "' != '" + org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_HOST + "'", maintenanceState0.equals(org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_HOST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serviceComponentHost5);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test067"); }

    org.apache.ambari.server.state.action.ActionId actionId0 = null;
    org.apache.ambari.server.state.action.ActionFailedEvent actionFailedEvent2 = new org.apache.ambari.server.state.action.ActionFailedEvent(actionId0, 10L);
    java.lang.String str3 = actionFailedEvent2.toString();
    long long4 = actionFailedEvent2.getCompletionTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EventType: ACTION_FAILED"+ "'", str3.equals("EventType: ACTION_FAILED"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 10L);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test068"); }

    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder2 = userPasswordChangeRequestAuditEventBuilder0.withUserName("AlertTarget/notification_type");
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder4 = userPasswordChangeRequestAuditEventBuilder2.withUserName("requestschedule");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder4);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test069"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.MYSQL_SERVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test070"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    java.io.File file3 = configuration0.getRecommendationsDir();
    boolean b4 = configuration0.isMetricsCacheDisabled();
    boolean b5 = configuration0.isViewRemoveUndeployedEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test071"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    mITKerberosOperationHandler0.setDefaultRealm("type");
    mITKerberosOperationHandler0.setOpen(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test072"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str19, str_array18);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent21 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str19);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str19;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController23 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider24 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController23);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str25 = ldapSyncEventResourceProvider24.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController26 = null;
    com.google.inject.Injector injector27 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider28 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str19, map_type_str25, ambariManagementController26, injector27);
    org.apache.ambari.server.api.resources.JobResourceDefinition jobResourceDefinition29 = new org.apache.ambari.server.api.resources.JobResourceDefinition();
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer31 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule32 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl33 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule32);
    metricsPaddingRenderer31.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl33);
    org.apache.ambari.server.api.query.QueryImpl queryImpl35 = new org.apache.ambari.server.api.query.QueryImpl(map_type_str25, (org.apache.ambari.server.api.resources.ResourceDefinition)jobResourceDefinition29, (org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl33);
    org.apache.ambari.server.controller.spi.PageRequest pageRequest36 = null;
    queryImpl35.setPageRequest(pageRequest36);
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer39 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    queryImpl35.setRenderer((org.apache.ambari.server.api.query.render.Renderer)metricsPaddingRenderer39);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str41 = queryImpl35.getKeyValueMap();
    boolean b42 = queryImpl35.isCollectionResource();
    org.apache.ambari.server.api.query.render.AlertSummaryGroupedRenderer alertSummaryGroupedRenderer43 = new org.apache.ambari.server.api.query.render.AlertSummaryGroupedRenderer();
    queryImpl35.setRenderer((org.apache.ambari.server.api.query.render.Renderer)alertSummaryGroupedRenderer43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test073"); }

    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest0 = new org.apache.ambari.server.controller.ConfigurationRequest();
    java.lang.String str1 = configurationRequest0.getType();
    configurationRequest0.setIncludeProperties(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test074"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = configuration0.getDatabaseConnectorNames();
    boolean b4 = configuration0.isParallelTopologyTaskCreationEnabled();
    org.apache.ambari.server.KdcServerConnectionVerification kdcServerConnectionVerification5 = new org.apache.ambari.server.KdcServerConnectionVerification(configuration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test075"); }

    org.apache.ambari.server.state.action.ActionType actionType1 = null;
    org.apache.ambari.server.state.action.ActionId actionId2 = new org.apache.ambari.server.state.action.ActionId((long)5, actionType1);
    org.apache.ambari.server.state.action.ActionImpl actionImpl4 = new org.apache.ambari.server.state.action.ActionImpl(actionId2, 10L);
    org.apache.ambari.server.state.action.ActionFailedEvent actionFailedEvent6 = new org.apache.ambari.server.state.action.ActionFailedEvent(actionId2, (long)'#');
    long long7 = actionFailedEvent6.getCompletionTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 35L);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test076"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType comparisonType0 = org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.EQUALS;
    org.junit.Assert.assertTrue("'" + comparisonType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.EQUALS + "'", comparisonType0.equals(org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.EQUALS));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test077"); }

    org.apache.ambari.server.orm.dao.ClusterVersionDAO clusterVersionDAO0 = new org.apache.ambari.server.orm.dao.ClusterVersionDAO();
    org.apache.ambari.server.orm.entities.ClusterVersionEntity clusterVersionEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.ClusterVersionEntity clusterVersionEntity2 = clusterVersionDAO0.merge(clusterVersionEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test078"); }

    org.apache.ambari.server.view.ViewDirectoryWatcher viewDirectoryWatcher0 = new org.apache.ambari.server.view.ViewDirectoryWatcher();
    com.google.common.base.Function<java.nio.file.Path,java.lang.Boolean> function_path_b1 = null;
    viewDirectoryWatcher0.addHook(function_path_b1);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test079"); }

    org.apache.ambari.server.audit.event.request.AddRepositoryVersionRequestAuditEvent.AddRepositoryVersionAuditEventBuilder addRepositoryVersionAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddRepositoryVersionRequestAuditEvent.AddRepositoryVersionAuditEventBuilder();

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test080"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.metrics.system.impl.MetricsConfiguration metricsConfiguration6 = new org.apache.ambari.server.metrics.system.impl.MetricsConfiguration(properties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties5);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test081"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    java.lang.String str1 = ldapServerProperties0.getManagerPassword();
    java.lang.String str2 = ldapServerProperties0.getAdminGroupMappingRules();
    ldapServerProperties0.setGroupObjectClass("StackConfigurationDependency/property_name");
    ldapServerProperties0.setSecondaryUrl("operation_level/service_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test082"); }

    org.apache.ambari.server.api.services.UserPrivilegeService userPrivilegeService1 = new org.apache.ambari.server.api.services.UserPrivilegeService("AlertTarget/properties");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test083"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setSyncGroupMemberReplacePattern("AlertTarget/notification_type");
    ldapServerProperties0.setAnonymousBind(true);
    java.lang.String str5 = ldapServerProperties0.getAdminGroupMappingMemberAttr();
    java.lang.String str6 = ldapServerProperties0.getUserBase();
    java.util.List<java.lang.String> list_str7 = ldapServerProperties0.getLdapUrls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test084"); }

    org.apache.ambari.server.controller.internal.Stack stack0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.TrimmingStrategy trimmingStrategy3 = org.apache.ambari.server.controller.internal.PropertyValueTrimmingStrategyDefiner.defineTrimmingStrategy(stack0, "Running", "WidgetInfo/values");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test085"); }

    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS1 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus2 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS1);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = resultStatus2.getStatus();
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder4 = addHostRequestAuditEventBuilder0.withResultStatus(resultStatus2);
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder5 = org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder7 = addAlertGroupRequestAuditEventBuilder5.withName("ViewInstanceInfo/view_name");
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder9 = addAlertGroupRequestAuditEventBuilder5.withRemoteIp("alerts.json");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS10 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus11 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS10);
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder12 = addAlertGroupRequestAuditEventBuilder9.withResultStatus(resultStatus11);
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder13 = addHostRequestAuditEventBuilder4.withResultStatus(resultStatus11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addHostRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addHostRequestAuditEventBuilder13);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test086"); }

    org.apache.ambari.server.state.scheduler.BatchSettings batchSettings0 = new org.apache.ambari.server.state.scheduler.BatchSettings();

  }

  @Test
  public void test087() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest6.test087"); }

    // org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    // org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler1 = null;
    // serviceCheckGrouping0.parallelScheduler = parallelScheduler1;
    // serviceCheckGrouping0.name = "notification.dispatch.alert.script";
    // org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping.ServiceCheckBuilder serviceCheckBuilder5 = serviceCheckGrouping0.getBuilder();
    // org.apache.ambari.server.state.Cluster cluster6 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType7 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction8 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj9 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext10 = new org.apache.ambari.server.state.UpgradeContext(cluster6, upgradeType7, direction8, map_str_obj9);
    // upgradeContext10.setAutoSkipComponentFailures(true);
    // org.apache.ambari.server.state.ServiceComponentHost[] serviceComponentHost_array13 = new org.apache.ambari.server.state.ServiceComponentHost[] {  };
    // java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost> arraylist_serviceComponentHost14 = new java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost>();
    // boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost14, serviceComponentHost_array13);
    // upgradeContext10.addUnhealthy((java.util.List<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost14);
    // upgradeContext10.setComponentDisplay("ambari_db_rca_driver", "hdfs-site", "configurations");
    // org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo21 = null;
    // upgradeContext10.setAmbariMetaInfo(ambariMetaInfo21);
    // org.apache.ambari.server.stack.HostsType hostsType23 = new org.apache.ambari.server.stack.HostsType();
    // java.util.List<org.apache.ambari.server.state.ServiceComponentHost> list_serviceComponentHost24 = null;
    // hostsType23.unhealthy = list_serviceComponentHost24;
    // org.apache.ambari.server.state.stack.UpgradePack.ProcessingComponent processingComponent28 = null;
    // java.util.Map<java.lang.String,java.lang.String> map_str_str33 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    // org.apache.ambari.server.state.Cluster cluster34 = null;
    // org.apache.ambari.server.utils.SecretReference.replaceReferencesWithPasswords(map_str_str33, cluster34);
    // org.apache.ambari.server.controller.StackLevelConfigurationResponse stackLevelConfigurationResponse36 = new org.apache.ambari.server.controller.StackLevelConfigurationResponse("operation_level/service_name", "host_group", "HostComponentProcess/host_name", "ViewVersionInfo/min_ambari_version", map_str_str33);
    // serviceCheckBuilder5.add(upgradeContext10, hostsType23, "java_home", false, processingComponent28, map_str_str33);
    // hostsType23.secondary = "";
    // hostsType23.master = "PermissionInfo/sort_order";
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceCheckBuilder5);
    // org.junit.Assert.assertTrue("'" + upgradeType7 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType7.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array13);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b15 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(map_str_str33);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test088"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException2 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("Event/summary/memberships/removed.FILTER(service_type) AND (null) AND Credential/key.FILTER(Credential/key) AND Credential/key.FILTER(Credential/key)");
    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalDoesNotExistException kerberosPrincipalDoesNotExistException3 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalDoesNotExistException("Users/user_type", (java.lang.Throwable)kerberosPrincipalAlreadyExistsException2);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test089"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = kerberosComponentDescriptor6.toMap();
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor8 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor(map_str_obj7);
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor9 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_str_obj7);
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor10 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor(map_str_obj7);
    org.apache.ambari.server.state.kerberos.KerberosPrincipalType kerberosPrincipalType12 = org.apache.ambari.server.state.kerberos.KerberosPrincipalType.USER;
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor15 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor("Versions/parent_extension_version", kerberosPrincipalType12, "hdfs-site", "AlertGroup/name");
    kerberosPrincipalDescriptor10.setType(kerberosPrincipalType12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    org.junit.Assert.assertTrue("'" + kerberosPrincipalType12 + "' != '" + org.apache.ambari.server.state.kerberos.KerberosPrincipalType.USER + "'", kerberosPrincipalType12.equals(org.apache.ambari.server.state.kerberos.KerberosPrincipalType.USER));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test090"); }

    org.apache.ambari.server.security.ldap.LdapUserGroupMemberDto ldapUserGroupMemberDto2 = new org.apache.ambari.server.security.ldap.LdapUserGroupMemberDto("cluster_name", "UpgradeChecks/upgrade_pack");
    java.lang.String str3 = ldapUserGroupMemberDto2.getUserName();
    java.lang.String str4 = ldapUserGroupMemberDto2.getUserName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UpgradeChecks/upgrade_pack"+ "'", str3.equals("UpgradeChecks/upgrade_pack"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UpgradeChecks/upgrade_pack"+ "'", str4.equals("UpgradeChecks/upgrade_pack"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test091"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.WIDGETLAYOUT_SCOPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/scope"+ "'", str0.equals("WidgetLayoutInfo/scope"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test092"); }

    org.apache.ambari.server.agent.HostInfo hostInfo0 = new org.apache.ambari.server.agent.HostInfo();
    hostInfo0.setHardwareModel("configure-task-key-value-pairs");

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test093"); }

    org.apache.ambari.server.api.resources.ActiveWidgetLayoutResourceDefinition activeWidgetLayoutResourceDefinition0 = new org.apache.ambari.server.api.resources.ActiveWidgetLayoutResourceDefinition();
    java.lang.String str1 = activeWidgetLayoutResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "widget_layouts"+ "'", str1.equals("widget_layouts"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test094"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setPrimaryUrl("Running");

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test095"); }

    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder2 = addBlueprintRequestAuditEventBuilder0.withBlueprintName("StackConfigurations/property_name");
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder4 = addBlueprintRequestAuditEventBuilder0.withUserName("Tasks/end_time");
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder6 = addBlueprintRequestAuditEventBuilder0.withOperation("recovery_type");
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder8 = addBlueprintRequestAuditEventBuilder6.withOperation("blueprint");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder8);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test096"); }

    org.apache.ambari.server.api.services.UserService userService0 = new org.apache.ambari.server.api.services.UserService();
    javax.ws.rs.core.Request request1 = null;
    org.apache.ambari.server.api.services.UserAuthorizationService userAuthorizationService3 = userService0.getUserAuthorizations(request1, "recovery_type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userAuthorizationService3);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test097"); }

    org.apache.ambari.server.actionmanager.ExecutionCommandWrapper executionCommandWrapper1 = new org.apache.ambari.server.actionmanager.ExecutionCommandWrapper("#");
    java.lang.String str2 = executionCommandWrapper1.getJson();
    java.lang.String str3 = executionCommandWrapper1.getJson();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#"+ "'", str3.equals("#"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test098"); }

    org.apache.ambari.server.controller.RepositoryRequest repositoryRequest4 = new org.apache.ambari.server.controller.RepositoryRequest(".FILTER", "task", "encryption_types", "ranger-hive-plugin-enabled");
    repositoryRequest4.setVerifyBaseUrl(false);
    repositoryRequest4.setBaseUrl("Alert/text");
    java.lang.String str9 = repositoryRequest4.getRepoId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ranger-hive-plugin-enabled"+ "'", str9.equals("ranger-hive-plugin-enabled"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test099"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform2 = null;
    org.eclipse.persistence.internal.sessions.AbstractSession abstractSession3 = mySqlHelper1.createStubAbstractSessionFromPlatform(databasePlatform2);
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = mySqlHelper1.getAlterColumnStatement("Stage/command_params", dBColumnInfo5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractSession3);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test100"); }

    org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager metricsCollectorHAManager0 = new org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager();
    boolean b2 = metricsCollectorHAManager0.isCollectorHostLive("WidgetLayoutInfo/user_name");
    boolean b4 = metricsCollectorHAManager0.isCollectorHostLive("servicecomponentdesiredstate");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test101() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest6.test101"); }

    // org.apache.ambari.server.state.Cluster cluster0 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType1 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction2 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj3 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext4 = new org.apache.ambari.server.state.UpgradeContext(cluster0, upgradeType1, direction2, map_str_obj3);
    // upgradeContext4.setAutoSkipComponentFailures(true);
    // org.apache.ambari.server.state.ServiceComponentHost[] serviceComponentHost_array7 = new org.apache.ambari.server.state.ServiceComponentHost[] {  };
    // java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost> arraylist_serviceComponentHost8 = new java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost>();
    // boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost8, serviceComponentHost_array7);
    // upgradeContext4.addUnhealthy((java.util.List<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost8);
    // org.apache.ambari.server.state.ServiceComponentHost[] serviceComponentHost_array11 = new org.apache.ambari.server.state.ServiceComponentHost[] {  };
    // java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost> arraylist_serviceComponentHost12 = new java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost>();
    // boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost12, serviceComponentHost_array11);
    // upgradeContext4.addUnhealthy((java.util.List<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost12);
    // org.apache.ambari.server.state.StackId stackId15 = null;
    // org.apache.ambari.server.state.StackId stackId16 = null;
    // upgradeContext4.setSourceAndTargetStacks(stackId15, stackId16);
    // upgradeContext4.setAutoSkipComponentFailures(true);
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array7);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b9 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array11);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test102"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    java.lang.String str13 = stackConfigurationResponse12.getPropertyDescription();
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array14 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo15 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo15, propertyDependencyInfo_array14);
    stackConfigurationResponse12.setDependsOnProperties((java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Hosts/last_registration_time"+ "'", str13.equals("Hosts/last_registration_time"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test103"); }

    org.apache.ambari.server.state.ServiceComponent serviceComponent0 = null;
    org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity1 = null;
    org.apache.ambari.server.orm.entities.HostComponentDesiredStateEntity hostComponentDesiredStateEntity2 = null;
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory4 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO5 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory6 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl7 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO3, clusterFactory4, hostDAO5, hostFactory6);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl7, (int)(short)100);
    java.util.Map<java.lang.String,org.apache.ambari.server.state.Cluster> map_str_cluster10 = clustersImpl7.getClusters();
    int i12 = clustersImpl7.getClusterSize("fqdn");
    org.apache.ambari.server.orm.dao.StackDAO stackDAO13 = new org.apache.ambari.server.orm.dao.StackDAO();
    org.apache.ambari.server.orm.dao.HostDAO hostDAO14 = null;
    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO15 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO16 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
    org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO17 = new org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO();
    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher19 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener20 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher19);
    org.apache.ambari.server.actionmanager.ActionDBAccessorImpl actionDBAccessorImpl21 = new org.apache.ambari.server.actionmanager.ActionDBAccessorImpl((long)100, ambariEventPublisher19);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl serviceComponentHostImpl22 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl(serviceComponent0, hostComponentStateEntity1, hostComponentDesiredStateEntity2, (org.apache.ambari.server.state.Clusters)clustersImpl7, stackDAO13, hostDAO14, serviceComponentDesiredStateDAO15, hostComponentStateDAO16, hostComponentDesiredStateDAO17, ambariEventPublisher19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_cluster10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test104"); }

    org.apache.ambari.server.controller.RepositoryRequest repositoryRequest4 = new org.apache.ambari.server.controller.RepositoryRequest(".FILTER", "task", "encryption_types", "ranger-hive-plugin-enabled");
    repositoryRequest4.setVerifyBaseUrl(false);
    repositoryRequest4.setClusterVersionId((java.lang.Long)5000L);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test105"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.TIMELINE_METRICS_SINK_COLLECTION_PERIOD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "timeline.metrics.sink.collection.period"+ "'", str0.equals("timeline.metrics.sink.collection.period"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test106"); }

    org.apache.ambari.server.audit.event.request.DeleteAlertTargetRequestAuditEvent.DeleteAlertTargetRequestAuditEventBuilder deleteAlertTargetRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.DeleteAlertTargetRequestAuditEvent.builder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS1 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus2 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS1);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = resultStatus2.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS4 = resultStatus2.getStatus();
    org.apache.ambari.server.audit.event.request.DeleteAlertTargetRequestAuditEvent.DeleteAlertTargetRequestAuditEventBuilder deleteAlertTargetRequestAuditEventBuilder5 = deleteAlertTargetRequestAuditEventBuilder0.withResultStatus(resultStatus2);
    org.apache.ambari.server.audit.event.request.DeleteAlertTargetRequestAuditEvent.DeleteAlertTargetRequestAuditEventBuilder deleteAlertTargetRequestAuditEventBuilder7 = deleteAlertTargetRequestAuditEventBuilder5.withUrl("RepositoryVersions/display_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteAlertTargetRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteAlertTargetRequestAuditEventBuilder5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteAlertTargetRequestAuditEventBuilder7);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test107"); }

    org.apache.ambari.server.state.State state4 = org.apache.ambari.server.state.State.DISABLED;
    org.apache.ambari.server.state.SecurityType securityType5 = null;
    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider6 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition7 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider6);
    java.util.Set<java.lang.String> set_str8 = clusterDefinition7.getHosts();
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport11 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i12 = clusterHealthReport11.getInitStateHosts();
    int i13 = clusterHealthReport11.getHealthyStateHosts();
    int i14 = clusterHealthReport11.getStaleConfigsHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse15 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)10L, "stack_tools", state4, securityType5, set_str8, (java.lang.Integer)10, "_SERVICE_CHECK", clusterHealthReport11);
    org.apache.ambari.server.state.StackId stackId17 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str22 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse23 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId17, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str21, map_str_map_str_str22);
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask24 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask24.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array27 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask24 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task> arraylist_task28 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task28, task_array27);
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper30 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("widgets.json", "ViewInstanceInfo/view_name", set_str8, map_str_str21, (java.util.List<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task28);
    org.apache.ambari.server.controller.logging.LogLineResult logLineResult31 = new org.apache.ambari.server.controller.logging.LogLineResult(map_str_str21);
    java.lang.String str32 = logLineResult31.getLogMethod();
    logLineResult31.setEventCount("rootService");
    org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state4.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test108"); }

    org.apache.ambari.server.state.AlertState alertState7 = null;
    org.apache.ambari.server.state.Alert alert8 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState7);
    org.apache.ambari.server.events.AlertReceivedEvent alertReceivedEvent9 = new org.apache.ambari.server.events.AlertReceivedEvent(0L, alert8);
    org.apache.ambari.server.state.Alert alert10 = alertReceivedEvent9.getAlert();
    org.apache.ambari.server.orm.entities.AlertCurrentEntity alertCurrentEntity11 = null;
    org.apache.ambari.server.state.AlertState alertState12 = org.apache.ambari.server.state.AlertState.WARNING;
    org.apache.ambari.server.state.AlertFirmness alertFirmness13 = org.apache.ambari.server.state.AlertFirmness.SOFT;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.events.AlertStateChangeEvent alertStateChangeEvent14 = new org.apache.ambari.server.events.AlertStateChangeEvent((long)2147483647, alert10, alertCurrentEntity11, alertState12, alertFirmness13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(alert10);
    org.junit.Assert.assertTrue("'" + alertState12 + "' != '" + org.apache.ambari.server.state.AlertState.WARNING + "'", alertState12.equals(org.apache.ambari.server.state.AlertState.WARNING));
    org.junit.Assert.assertTrue("'" + alertFirmness13 + "' != '" + org.apache.ambari.server.state.AlertFirmness.SOFT + "'", alertFirmness13.equals(org.apache.ambari.server.state.AlertFirmness.SOFT));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test109"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    boolean b2 = configuration0.isMasterKeyPersisted();
    java.lang.Long long3 = configuration0.getMetricRequestBufferTimeCatchupInterval();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 300000L+ "'", long3.equals(300000L));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test110"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler.KERBEROS_ENV_ADMIN_SERVER_HOST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "admin_server_host"+ "'", str0.equals("admin_server_host"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test111"); }

    org.apache.ambari.server.configuration.Configuration.DatabaseType databaseType0 = org.apache.ambari.server.configuration.Configuration.DatabaseType.SQL_ANYWHERE;
    org.junit.Assert.assertTrue("'" + databaseType0 + "' != '" + org.apache.ambari.server.configuration.Configuration.DatabaseType.SQL_ANYWHERE + "'", databaseType0.equals(org.apache.ambari.server.configuration.Configuration.DatabaseType.SQL_ANYWHERE));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test112"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/id"+ "'", str0.equals("RepositoryVersions/id"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test113"); }

    org.apache.ambari.server.state.stack.ConfigUpgradePack[] configUpgradePack_array0 = new org.apache.ambari.server.state.stack.ConfigUpgradePack[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack> arraylist_configUpgradePack1 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack>)arraylist_configUpgradePack1, configUpgradePack_array0);
    org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack3 = org.apache.ambari.server.state.stack.ConfigUpgradePack.merge(arraylist_configUpgradePack1);
    java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> list_affectedService4 = configUpgradePack3.services;
    java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> map_str_affectedService5 = configUpgradePack3.getServiceMap();
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService affectedService6 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService();
    java.lang.String str7 = affectedService6.name;
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService affectedService8 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService();
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService affectedService9 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService();
    java.lang.String str10 = affectedService9.name;
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent affectedComponent11 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent();
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent[] affectedComponent_array12 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent[] { affectedComponent11 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent> arraylist_affectedComponent13 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent>)arraylist_affectedComponent13, affectedComponent_array12);
    affectedService9.components = arraylist_affectedComponent13;
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService affectedService16 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService();
    java.lang.String str17 = affectedService16.name;
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService affectedService18 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService();
    java.lang.String str19 = affectedService18.name;
    java.lang.String str20 = affectedService18.name;
    java.lang.String str21 = affectedService18.name;
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService affectedService22 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService();
    java.lang.String str23 = affectedService22.name;
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent affectedComponent24 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent();
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent[] affectedComponent_array25 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent[] { affectedComponent24 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent> arraylist_affectedComponent26 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent>)arraylist_affectedComponent26, affectedComponent_array25);
    affectedService22.components = arraylist_affectedComponent26;
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService[] affectedService_array29 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService[] { affectedService6, affectedService8, affectedService9, affectedService16, affectedService18, affectedService22 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> arraylist_affectedService30 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService>)arraylist_affectedService30, affectedService_array29);
    configUpgradePack3.services = arraylist_affectedService30;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configUpgradePack_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configUpgradePack3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_affectedService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_affectedService5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(affectedComponent_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(affectedComponent_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(affectedService_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test114"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.orm.dao.GroupDAO groupDAO4 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO5 = null;
    org.apache.ambari.server.security.authorization.Users users6 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.controller.internal.UserPrivilegeResourceProvider.init(userDAO0, clusterDAO3, groupDAO4, viewInstanceDAO5, users6);
    org.apache.ambari.server.orm.entities.GroupEntity[] groupEntity_array8 = new org.apache.ambari.server.orm.entities.GroupEntity[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.orm.entities.GroupEntity> linkedhashset_groupEntity9 = new java.util.LinkedHashSet<org.apache.ambari.server.orm.entities.GroupEntity>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.GroupEntity>)linkedhashset_groupEntity9, groupEntity_array8);
    groupDAO4.remove((java.util.Set<org.apache.ambari.server.orm.entities.GroupEntity>)linkedhashset_groupEntity9);
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity12 = null;
    // The following exception was thrown during execution in test generation
    try {
    groupDAO4.remove(groupEntity12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(groupEntity_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test115"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider6 = new org.apache.ambari.server.controller.internal.URLStreamProvider(1200, (-1), "ambari.dispatch.snmp.security.priv.passphrase", "OperatingSystems/version_definition_id", "timeline.metrics.cluster.aggregator.minute.ttl");
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration7 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider timelineMetricCacheProvider8 = null;
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule9 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule10 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule9);
    java.lang.String str14 = defaultProviderModule9.getJMXRpcMetricTag("ViewVersionInfo/description", "QuickLinkInfo/stack_version", "StackServices/stack_version");
    java.lang.String str17 = defaultProviderModule9.getJMXProtocol("stack_name", "Versions/valid");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.timeline.AMSComponentPropertyProvider aMSComponentPropertyProvider20 = new org.apache.ambari.server.controller.metrics.timeline.AMSComponentPropertyProvider(map_str_map_str_propertyInfo0, uRLStreamProvider6, componentSSLConfiguration7, timelineMetricCacheProvider8, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule9, "Stage/host_params", "Event/summary/groups/created");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "http"+ "'", str17.equals("http"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test116"); }

    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent affectedComponent0 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent();
    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition configUpgradeChangeDefinition1 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition();
    java.util.List<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer> list_transfer2 = configUpgradeChangeDefinition1.getTransfers();
    java.lang.String str3 = configUpgradeChangeDefinition1.getConfigType();
    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition configUpgradeChangeDefinition4 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition();
    java.util.List<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer> list_transfer5 = configUpgradeChangeDefinition4.getTransfers();
    java.lang.String str6 = configUpgradeChangeDefinition4.getConfigType();
    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition configUpgradeChangeDefinition7 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition();
    java.util.List<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer> list_transfer8 = configUpgradeChangeDefinition7.getTransfers();
    java.lang.String str9 = configUpgradeChangeDefinition7.getConfigType();
    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition[] configUpgradeChangeDefinition_array10 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition[] { configUpgradeChangeDefinition1, configUpgradeChangeDefinition4, configUpgradeChangeDefinition7 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition> arraylist_configUpgradeChangeDefinition11 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition>)arraylist_configUpgradeChangeDefinition11, configUpgradeChangeDefinition_array10);
    affectedComponent0.changes = arraylist_configUpgradeChangeDefinition11;
    java.util.List<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition> list_configUpgradeChangeDefinition14 = null;
    affectedComponent0.changes = list_configUpgradeChangeDefinition14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_transfer2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_transfer5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_transfer8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configUpgradeChangeDefinition_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test117"); }

    org.apache.ambari.server.api.services.HostService hostService1 = new org.apache.ambari.server.api.services.HostService("ambari.dispatch.snmp.security.priv.passphrase");
    org.apache.ambari.server.api.services.HostComponentService hostComponentService3 = hostService1.getHostComponentHandler("OK");
    javax.ws.rs.core.HttpHeaders httpHeaders5 = null;
    javax.ws.rs.core.UriInfo uriInfo6 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = hostService1.getHost("Versions/stack-errors", httpHeaders5, uriInfo6, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostComponentService3);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test118"); }

    org.apache.ambari.server.controller.spi.SortRequestProperty[] sortRequestProperty_array0 = new org.apache.ambari.server.controller.spi.SortRequestProperty[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.spi.SortRequestProperty> arraylist_sortRequestProperty1 = new java.util.ArrayList<org.apache.ambari.server.controller.spi.SortRequestProperty>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.SortRequestProperty>)arraylist_sortRequestProperty1, sortRequestProperty_array0);
    org.apache.ambari.server.controller.internal.SortRequestImpl sortRequestImpl3 = new org.apache.ambari.server.controller.internal.SortRequestImpl((java.util.List<org.apache.ambari.server.controller.spi.SortRequestProperty>)arraylist_sortRequestProperty1);
    java.util.List<org.apache.ambari.server.controller.spi.SortRequestProperty> list_sortRequestProperty4 = sortRequestImpl3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortRequestProperty_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_sortRequestProperty4);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test119"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserAuthorizationResourceProvider.AUTHORIZATION_VIEW_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AuthorizationInfo/view_name"+ "'", str0.equals("AuthorizationInfo/view_name"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test120"); }

    org.apache.ambari.server.orm.entities.HostGroupConfigEntityPK hostGroupConfigEntityPK0 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntityPK();
    boolean b2 = hostGroupConfigEntityPK0.equals((java.lang.Object)"Upgrade/abort_reason");
    hostGroupConfigEntityPK0.setType("Event/summary/memberships/created");
    org.apache.ambari.server.security.encryption.InMemoryCredentialStore inMemoryCredentialStore5 = new org.apache.ambari.server.security.encryption.InMemoryCredentialStore();
    boolean b7 = inMemoryCredentialStore5.containsCredential("ViewInstanceInfo/view_name:type");
    org.apache.ambari.server.security.credential.Credential credential9 = inMemoryCredentialStore5.getCredential("Artifacts/stack_name");
    org.apache.ambari.server.security.credential.Credential credential11 = inMemoryCredentialStore5.getCredential("Clusters/security_type");
    boolean b12 = hostGroupConfigEntityPK0.equals((java.lang.Object)credential11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(credential9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(credential11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test121"); }

    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest7 = new org.apache.ambari.server.controller.ServiceConfigVersionRequest("Hosts/os_type", "widgets.json", (java.lang.Long)0L, (java.lang.Long)5000L, (java.lang.Long)100L, "ranger-hbase-plugin-enabled", (java.lang.Boolean)false);
    serviceConfigVersionRequest7.setServiceName("skip_failure");
    serviceConfigVersionRequest7.setIsCurrent((java.lang.Boolean)false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test122"); }

    org.apache.ambari.server.agent.HostInfo hostInfo0 = new org.apache.ambari.server.agent.HostInfo();
    hostInfo0.setAgentUserId("ViewInstanceInfo/context_path");
    hostInfo0.setOSRelease("recovery_lifetime_max_count");
    boolean b5 = hostInfo0.getSeLinux();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test123"); }

    org.apache.ambari.server.api.services.GroupService groupService0 = new org.apache.ambari.server.api.services.GroupService();
    org.apache.ambari.server.api.services.MemberService memberService2 = groupService0.getMemberHandler("");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = memberService2.createMember("Event/summary/groups/created", httpHeaders4, uriInfo5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(memberService2);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test124"); }

    org.apache.ambari.server.api.services.StageService stageService2 = new org.apache.ambari.server.api.services.StageService("", "AlertTarget/properties");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = stageService2.updateStages("AlertGroup/id", httpHeaders4, uriInfo5, "sortBy");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test125"); }

    org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat bSStat0 = org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.ERROR;
    org.junit.Assert.assertTrue("'" + bSStat0 + "' != '" + org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.ERROR + "'", bSStat0.equals(org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.ERROR));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test126"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.ConfigurationKeyValue configurationKeyValue0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.ConfigurationKeyValue();
    java.lang.String str1 = configurationKeyValue0.value;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test127"); }

    org.apache.ambari.server.controller.ServiceComponentHostRequest serviceComponentHostRequest5 = new org.apache.ambari.server.controller.ServiceComponentHostRequest("<?xml version=\"1.0\"?><status> RUNNING</status>", "db_driver_filename", "session_attributes", "mark_draining_only", "QuickLinkInfo/default");
    serviceComponentHostRequest5.setAdminState("RecoveryReport{summary='DISABLED', component_reports='[]'}");
    serviceComponentHostRequest5.setAdminState("setting_name");
    java.lang.String str10 = serviceComponentHostRequest5.getState();
    serviceComponentHostRequest5.setHostname("PrivilegeInfo/principal_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test128"); }

    org.apache.ambari.server.controller.internal.DeleteSpacesAtTheEndTrimmingStrategy deleteSpacesAtTheEndTrimmingStrategy0 = new org.apache.ambari.server.controller.internal.DeleteSpacesAtTheEndTrimmingStrategy();

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test129"); }

    org.apache.ambari.server.topology.AmbariContext ambariContext0 = new org.apache.ambari.server.topology.AmbariContext();

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test130"); }

    org.apache.ambari.server.controller.RepositoryRequest repositoryRequest4 = new org.apache.ambari.server.controller.RepositoryRequest(".FILTER", "task", "encryption_types", "ranger-hive-plugin-enabled");
    repositoryRequest4.setVerifyBaseUrl(false);
    java.lang.Long long7 = repositoryRequest4.getRepositoryVersionId();
    repositoryRequest4.setBaseUrl("Alert/definition_id");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long7);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test131"); }

    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping3 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition5 = aggregateDefinitionMapping3.getAggregateDefinitions((long)(short)1);
    org.apache.ambari.server.agent.AlertDefinitionCommand alertDefinitionCommand6 = new org.apache.ambari.server.agent.AlertDefinitionCommand("", "Hosts/last_registration_time", "${ambariVersion}", list_alertDefinition5);
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition7 = alertDefinitionCommand6.getAlertDefinitions();
    org.apache.ambari.server.agent.AgentCommand.AgentCommandType agentCommandType8 = alertDefinitionCommand6.getCommandType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition7);
    org.junit.Assert.assertTrue("'" + agentCommandType8 + "' != '" + org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_DEFINITION_COMMAND + "'", agentCommandType8.equals(org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_DEFINITION_COMMAND));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test132"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.REPO_SUFFIX_KEY_DEFAULT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test133"); }

    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type0 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION;
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface7 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array8 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface7 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface9 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface9, interface_array8);
    org.apache.ambari.server.controller.ivory.Cluster.Location location13 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array14 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location13 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location15 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location15, location_array14);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array17 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo18 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo18, propertyInfo_array17);
    java.util.Map<java.lang.String,java.lang.String> map_str_str20 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo21 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo18, map_str_str20);
    org.apache.ambari.server.controller.ivory.Cluster cluster22 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface9, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location15, map_str_str20);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type23 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper25 = null;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] taskWrapper_array26 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] { taskWrapper25 };
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper27 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type23, "WidgetLayoutInfo/section_name", taskWrapper_array26);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper28 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type0, "StackConfigurationDependency/property_name", map_str_str20, taskWrapper_array26);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type29 = stageWrapper28.getType();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION + "'", type0.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str20);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP + "'", type23.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(taskWrapper_array26);
    org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION + "'", type29.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test134"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    long long6 = configuration0.getPropertyProvidersCompletionServiceTimeout();
    java.util.Properties properties7 = configuration0.getLog4jProperties();
    boolean b8 = configuration0.isKerberosJaasConfigurationCheckEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 5000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test135"); }

    org.apache.ambari.server.state.repository.Release release0 = new org.apache.ambari.server.state.repository.Release();
    java.lang.String str1 = release0.releaseNotes;
    java.lang.String str2 = release0.stackId;
    java.lang.String str3 = release0.releaseNotes;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test136() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest6.test136"); }

    // org.apache.ambari.server.state.Cluster cluster2 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType3 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction4 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj5 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext6 = new org.apache.ambari.server.state.UpgradeContext(cluster2, upgradeType3, direction4, map_str_obj5);
    // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest7 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType3);
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType8 = prereqCheckRequest7.getUpgradeType();
    // org.apache.ambari.server.state.StackId stackId11 = new org.apache.ambari.server.state.StackId("1.3.6.1.4.1.18060.16.1.1.1.1", "StackConfigurations/property_description");
    // prereqCheckRequest7.setTargetStackId(stackId11);
    // java.lang.String str13 = stackId11.toString();
    // org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType18 = org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE;
    // org.apache.ambari.server.controller.ivory.Cluster.Interface interface28 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    // org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array29 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface28 };
    // java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface30 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    // boolean b31 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface30, interface_array29);
    // org.apache.ambari.server.controller.ivory.Cluster.Location location34 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    // org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array35 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location34 };
    // java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location36 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    // boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location36, location_array35);
    // org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array38 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    // java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo39 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    // boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo39, propertyInfo_array38);
    // java.util.Map<java.lang.String,java.lang.String> map_str_str41 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    // org.apache.ambari.server.stack.ConfigurationInfo configurationInfo42 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo39, map_str_str41);
    // org.apache.ambari.server.controller.ivory.Cluster cluster43 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface30, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location36, map_str_str41);
    // java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str44 = null;
    // org.apache.ambari.server.controller.ConfigurationRequest configurationRequest45 = new org.apache.ambari.server.controller.ConfigurationRequest("service_component_filter", "yarn.scheduler.capacity.root.queues", "GreaterEqualsOperator", map_str_str41, map_str_map_str_str44);
    // org.apache.ambari.server.checks.CheckDescription checkDescription46 = new org.apache.ambari.server.checks.CheckDescription("max_duration_for_retries", prereqCheckType18, "ambari_db_rca_username", map_str_str41);
    // org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array47 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    // java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo48 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    // boolean b49 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo48, propertyInfo_array47);
    // java.util.Map<java.lang.String,java.lang.String> map_str_str50 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    // org.apache.ambari.server.stack.ConfigurationInfo configurationInfo51 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo48, map_str_str50);
    // boolean b52 = configurationInfo51.isValid();
    // java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str53 = configurationInfo51.getAttributes();
    // org.apache.ambari.server.controller.ConfigurationResponse configurationResponse54 = new org.apache.ambari.server.controller.ConfigurationResponse("", stackId11, "FilterOperator", "OK", (java.lang.Long)1L, map_str_str41, map_str_map_str_str53);
    // java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>>> map_str_map_str_map_str_str55 = null;
    // org.apache.ambari.server.topology.Configuration configuration56 = new org.apache.ambari.server.topology.Configuration(map_str_map_str_str53, map_str_map_str_map_str_str55);
    // java.lang.String str59 = configuration56.removeProperty("EventType: HOST_SVCCOMP_UNINSTALL", "configure-task-config-type");
    // org.junit.Assert.assertTrue("'" + upgradeType3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType3.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    // org.junit.Assert.assertTrue("'" + upgradeType8 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType8.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.1-StackConfigurations/property_description"+ "'", str13.equals("1.3.6.1.4.1.18060.16.1.1.1.1-StackConfigurations/property_description"));
    // org.junit.Assert.assertTrue("'" + prereqCheckType18 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE + "'", prereqCheckType18.equals(org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(interface_array29);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b31 == true);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(location_array35);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b37 == true);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(propertyInfo_array38);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b40 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(map_str_str41);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(propertyInfo_array47);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b49 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(map_str_str50);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b52 == true);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(map_str_map_str_str53);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNull(str59);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test137"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyResponse stackConfigurationDependencyResponse2 = new org.apache.ambari.server.controller.StackConfigurationDependencyResponse("slave_type", "instance");

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test138"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceComponentPropertyProvider.JCE_POLICY_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceComponents/jce_policy"+ "'", str0.equals("RootServiceComponents/jce_policy"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test139"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType3 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    char[] char_array10 = new char[] { '4', '4', '#', 'a', '4' };
    org.apache.ambari.server.security.credential.PrincipalKeyCredential principalKeyCredential11 = new org.apache.ambari.server.security.credential.PrincipalKeyCredential("skip_failure", char_array10);
    char[] char_array18 = new char[] { '4', '4', '#', 'a', '4' };
    org.apache.ambari.server.security.credential.PrincipalKeyCredential principalKeyCredential19 = new org.apache.ambari.server.security.credential.PrincipalKeyCredential("skip_failure", char_array18);
    principalKeyCredential11.setKey(char_array18);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type22 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP;
    java.util.Map<java.lang.String,java.lang.String> map_str_str24 = null;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] taskWrapper_array25 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.TaskWrapper> arraylist_taskWrapper26 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>)arraylist_taskWrapper26, taskWrapper_array25);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper28 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type22, "ranger-hbase-plugin-enabled", map_str_str24, (java.util.List<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>)arraylist_taskWrapper26);
    java.lang.String str29 = stageWrapper28.getText();
    java.util.Map<java.lang.String,java.lang.String> map_str_str30 = stageWrapper28.getParams();
    mITKerberosOperationHandler0.open(principalKeyCredential11, "repo:/stack_name//Users/admin/jce_name:ViewInstanceInfo/validation_result", map_str_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array18);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP + "'", type22.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(taskWrapper_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "ranger-hbase-plugin-enabled"+ "'", str29.equals("ranger-hbase-plugin-enabled"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str30);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test140"); }

    org.apache.ambari.server.notifications.Notification notification0 = new org.apache.ambari.server.notifications.Notification();
    java.lang.Integer[] i_array7 = new java.lang.Integer[] { 1, 0, 1, 10 };
    java.util.TreeSet<java.lang.Integer> treeset_i8 = new java.util.TreeSet<java.lang.Integer>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i8, i_array7);
    java.util.Set<java.lang.String> set_str10 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i8);
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask11 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    org.apache.ambari.server.state.stack.upgrade.ConfigureFunction configureFunction12 = new org.apache.ambari.server.state.stack.upgrade.ConfigureFunction();
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array13 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask11, configureFunction12 };
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper14 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("ambari_db_rca_username", "WidgetLayoutInfo/widgets", set_str10, task_array13);
    java.util.Map<java.lang.String,java.lang.String> map_str_str15 = taskWrapper14.getParams();
    notification0.DispatchProperties = map_str_str15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str15);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test141"); }

    org.apache.ambari.server.orm.dao.RepositoryVersionDAO repositoryVersionDAO0 = new org.apache.ambari.server.orm.dao.RepositoryVersionDAO();
    org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity2 = repositoryVersionDAO0.merge(repositoryVersionEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test142"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = kerberosComponentDescriptor6.toMap();
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor8 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor(map_str_obj7);
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor9 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_str_obj7);
    java.util.List<org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor> list_kerberosIdentityDescriptor10 = kerberosComponentDescriptor9.getIdentities();
    kerberosComponentDescriptor9.removeIdentity("queues");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_kerberosIdentityDescriptor10);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test143"); }

    org.apache.ambari.server.state.State state4 = org.apache.ambari.server.state.State.DISABLED;
    org.apache.ambari.server.state.SecurityType securityType5 = null;
    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider6 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition7 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider6);
    java.util.Set<java.lang.String> set_str8 = clusterDefinition7.getHosts();
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport11 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i12 = clusterHealthReport11.getInitStateHosts();
    int i13 = clusterHealthReport11.getHealthyStateHosts();
    int i14 = clusterHealthReport11.getStaleConfigsHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse15 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)10L, "stack_tools", state4, securityType5, set_str8, (java.lang.Integer)10, "_SERVICE_CHECK", clusterHealthReport11);
    org.apache.ambari.server.state.StackId stackId17 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str22 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse23 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId17, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str21, map_str_map_str_str22);
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask24 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask24.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array27 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask24 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task> arraylist_task28 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task28, task_array27);
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper30 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("widgets.json", "ViewInstanceInfo/view_name", set_str8, map_str_str21, (java.util.List<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task28);
    org.apache.ambari.server.controller.logging.LogLineResult logLineResult31 = new org.apache.ambari.server.controller.logging.LogLineResult(map_str_str21);
    java.lang.String str32 = logLineResult31.getVersion();
    java.lang.String str33 = logLineResult31.getComponentType();
    org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state4.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test144"); }

    org.apache.ambari.server.notifications.dispatchers.AlertScriptDispatcher alertScriptDispatcher0 = new org.apache.ambari.server.notifications.dispatchers.AlertScriptDispatcher();
    org.apache.ambari.server.notifications.Notification notification1 = null;
    java.lang.String str2 = alertScriptDispatcher0.getScriptConfigurationKey(notification1);
    // The following exception was thrown during execution in test generation
    try {
    long long3 = alertScriptDispatcher0.getScriptConfigurationTimeout();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "notification.dispatch.alert.script"+ "'", str2.equals("notification.dispatch.alert.script"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test145"); }

    org.apache.ambari.server.controller.StackServiceRequest stackServiceRequest3 = new org.apache.ambari.server.controller.StackServiceRequest("Upgraded", "AlertNotice/target_id", "Request_Info/asc_order");

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test146"); }

    org.apache.ambari.server.state.alert.Reporting.ReportTemplate reportTemplate0 = new org.apache.ambari.server.state.alert.Reporting.ReportTemplate();
    reportTemplate0.setText("metainfo.xml");
    reportTemplate0.setValue((java.lang.Double)(-1.0d));

  }

  @Test
  public void test147() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest6.test147"); }

    // org.apache.ambari.server.metadata.RoleCommandOrder roleCommandOrder0 = new org.apache.ambari.server.metadata.RoleCommandOrder();
    // boolean b1 = roleCommandOrder0.isNameNodeHAEnabled();
    // boolean b2 = roleCommandOrder0.isNameNodeHAEnabled();
    // org.apache.ambari.server.metadata.RoleCommandOrder roleCommandOrder3 = new org.apache.ambari.server.metadata.RoleCommandOrder();
    // roleCommandOrder3.setIsNameNodeHAEnabled(false);
    // int i6 = roleCommandOrder0.compareDeps(roleCommandOrder3);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b1 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b2 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test148"); }

    org.apache.ambari.server.api.resources.ValidationResourceDefinition validationResourceDefinition0 = new org.apache.ambari.server.api.resources.ValidationResourceDefinition();
    java.lang.String str1 = validationResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "validation"+ "'", str1.equals("validation"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test149"); }

    org.apache.ambari.server.api.services.ViewPermissionService viewPermissionService2 = new org.apache.ambari.server.api.services.ViewPermissionService("kerberos_descriptor", "UpgradeChecks/id");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = viewPermissionService2.createPermission("Upgraded", httpHeaders4, uriInfo5, "AlertGroup/definitions");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test150"); }

    org.apache.ambari.server.state.alert.Reporting reporting0 = new org.apache.ambari.server.state.alert.Reporting();
    org.apache.ambari.server.state.alert.Reporting.ReportTemplate reportTemplate1 = new org.apache.ambari.server.state.alert.Reporting.ReportTemplate();
    java.lang.String str2 = reportTemplate1.getText();
    reporting0.setWarning(reportTemplate1);
    org.apache.ambari.server.state.alert.Reporting.ReportingType reportingType4 = reporting0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reportingType4);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test151"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getConnectionPoolMaximumAge();
    java.util.Properties properties4 = configuration0.getPersistenceCustomProperties();
    int i5 = configuration0.getMetricCacheTTLSeconds();
    java.lang.String str6 = configuration0.getServerTempDir();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/var/lib/ambari-server/tmp"+ "'", str6.equals("/var/lib/ambari-server/tmp"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test152"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.HostGroup hostGroup0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.HostGroup();
    java.lang.String str1 = hostGroup0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test153"); }

    org.apache.ambari.server.serveraction.upgrades.KerberosKeytabsAction kerberosKeytabsAction0 = new org.apache.ambari.server.serveraction.upgrades.KerberosKeytabsAction();
    java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Object> concurrentmap_str_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.CommandReport commandReport2 = kerberosKeytabsAction0.execute(concurrentmap_str_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test154"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    java.util.Map<java.lang.String,org.apache.ambari.server.state.Cluster> map_str_cluster7 = clustersImpl4.getClusters();
    int i9 = clustersImpl4.getClusterSize("fqdn");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = clustersImpl4.checkPermission("AlertHistory/host_name", false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_cluster7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test155"); }

    org.apache.ambari.server.state.State state2 = org.apache.ambari.server.state.State.DISABLED;
    org.apache.ambari.server.state.SecurityType securityType3 = null;
    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider4 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition5 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider4);
    java.util.Set<java.lang.String> set_str6 = clusterDefinition5.getHosts();
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport9 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i10 = clusterHealthReport9.getInitStateHosts();
    int i11 = clusterHealthReport9.getHealthyStateHosts();
    int i12 = clusterHealthReport9.getStaleConfigsHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse13 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)10L, "stack_tools", state2, securityType3, set_str6, (java.lang.Integer)10, "_SERVICE_CHECK", clusterHealthReport9);
    java.util.Map<java.lang.String,java.util.Collection<org.apache.ambari.server.controller.ServiceConfigVersionResponse>> map_str_collection_serviceConfigVersionResponse14 = null;
    clusterResponse13.setDesiredServiceConfigVersions(map_str_collection_serviceConfigVersionResponse14);
    org.junit.Assert.assertTrue("'" + state2 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state2.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test156"); }

    org.apache.ambari.server.state.ThemeInfo themeInfo0 = null;
    org.apache.ambari.server.stack.ThemeModule themeModule1 = new org.apache.ambari.server.stack.ThemeModule(themeInfo0);
    boolean b2 = themeModule1.isValid();
    org.apache.ambari.server.state.ThemeInfo themeInfo3 = null;
    org.apache.ambari.server.stack.ThemeModule themeModule4 = new org.apache.ambari.server.stack.ThemeModule(themeInfo3);
    boolean b5 = themeModule4.isValid();
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.StackModule> map_str_stackModule6 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ServiceModule> map_str_serviceModule7 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ExtensionModule> map_str_extensionModule8 = null;
    themeModule1.resolve(themeModule4, map_str_stackModule6, map_str_serviceModule7, map_str_extensionModule8);
    boolean b10 = themeModule4.isDeleted();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test157"); }

    org.apache.ambari.server.controller.internal.HostStatusHelper hostStatusHelper0 = new org.apache.ambari.server.controller.internal.HostStatusHelper();

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test158"); }

    org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder createGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder createGroupRequestAuditEventBuilder2 = createGroupRequestAuditEventBuilder0.withGroupName("RepositoryVersions/display_name");
    org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder createGroupRequestAuditEventBuilder4 = createGroupRequestAuditEventBuilder2.withUserName("1.3.6.1.4.1.18060.16.1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createGroupRequestAuditEventBuilder4);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test159"); }

    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    java.lang.String str4 = defaultProviderModule0.getJMXRpcMetricTag("timeline.metrics.sink.collection.period", "configure-task-key-value-pairs", "ERROR");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test160"); }

    org.apache.ambari.server.state.kerberos.VariableReplacementHelper variableReplacementHelper0 = new org.apache.ambari.server.state.kerberos.VariableReplacementHelper();

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test161"); }

    org.apache.ambari.server.actionmanager.ActionType actionType1 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType6 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array8 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization9 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9, roleAuthorization_array8);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition11 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType1, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType6, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9);
    actionDefinition11.setActionName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test162"); }

    org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider viewInstanceResourceProvider0 = new org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization1 = viewInstanceResourceProvider0.getRequiredCreateAuthorizations();
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule2 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    viewInstanceResourceProvider0.addObserver((org.apache.ambari.server.controller.internal.ResourceProviderObserver)defaultProviderModule2);
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule4 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule2);
    java.lang.String str9 = defaultProviderModule2.getPort("no-cache", "dependency", "Users/user_name", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test163"); }

    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider0);
    org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider gSInstallerHostProvider2 = new org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider(clusterDefinition1);
    java.lang.String[] str_array21 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent24 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str22);
    java.util.Set<java.lang.String> set_str25 = hostsAddedEvent24.getHostNames();
    org.apache.ambari.server.controller.spi.TemporalInfo temporalInfo27 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey timelineAppMetricCacheKey28 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey(set_str25, "Tasks/id", temporalInfo27);
    org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.propertyIds = set_str25;
    java.util.Set<java.lang.String> set_str30 = gSInstallerHostProvider2.checkPropertyIds(set_str25);
    boolean b32 = org.apache.ambari.server.controller.utilities.PropertyHelper.containsProperty(set_str30, "Versions/extension_version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

}