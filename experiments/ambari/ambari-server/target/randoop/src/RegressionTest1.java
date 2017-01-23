
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    org.apache.ambari.server.ServiceNotFoundException serviceNotFoundException2 = new org.apache.ambari.server.ServiceNotFoundException("queues", "stack_features");

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.REQUESTSCHEDULE_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "requestschedule"+ "'", str0.equals("requestschedule"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Short> singularattribute_hostRoleCommandEntity_s0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.attemptCount;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_s0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = org.apache.ambari.server.upgrade.SchemaUpgradeUtil.extractProperty("StackLevelConfigurations/property_description", "RootServiceComponents/component_name", "authenticated_user_name", "Users/user_type", "RootServiceComponents/server_clock", map_str_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_END_TIME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/end_time"+ "'", str0.equals("Tasks/end_time"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    org.apache.ambari.server.api.query.render.ClusterBlueprintRenderer clusterBlueprintRenderer0 = new org.apache.ambari.server.api.query.render.ClusterBlueprintRenderer();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance4 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest5 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders1, requestBody2, uriInfo3, resourceInstance4);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.services.ResultPostProcessor resultPostProcessor6 = clusterBlueprintRenderer0.getResultPostProcessor((org.apache.ambari.server.api.services.Request)postRequest5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    org.apache.ambari.server.orm.DBAccessor dBAccessor0 = null;
    com.google.inject.Injector injector1 = null;
    com.google.inject.persist.PersistService persistService2 = null;
    org.apache.ambari.server.checks.MpackInstallChecker mpackInstallChecker3 = new org.apache.ambari.server.checks.MpackInstallChecker(dBAccessor0, injector1, persistService2);
    // The following exception was thrown during execution in test generation
    try {
    java.sql.Connection connection4 = mpackInstallChecker3.getConnection();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    org.apache.ambari.server.notifications.DispatchFactory dispatchFactory0 = org.apache.ambari.server.notifications.DispatchFactory.getInstance();
    org.apache.ambari.server.notifications.NotificationDispatcher notificationDispatcher2 = null;
    dispatchFactory0.register("skip_failure", notificationDispatcher2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dispatchFactory0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    org.apache.ambari.server.state.alert.AlertDefinitionFactory alertDefinitionFactory0 = new org.apache.ambari.server.state.alert.AlertDefinitionFactory();
    org.apache.ambari.server.state.alert.AlertDefinition alertDefinition1 = null;
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity3 = alertDefinitionFactory0.merge(alertDefinition1, alertDefinitionEntity2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    org.apache.ambari.server.orm.DBAccessor dBAccessor0 = null;
    com.google.inject.Injector injector1 = null;
    com.google.inject.persist.PersistService persistService2 = null;
    org.apache.ambari.server.checks.MpackInstallChecker mpackInstallChecker3 = new org.apache.ambari.server.checks.MpackInstallChecker(dBAccessor0, injector1, persistService2);
    java.lang.String[] str_array25 = new java.lang.String[] { "Event/summary/memberships/removed", "ACTION_USER_NAME", "AlertHistory/cluster_name", "RootService/service_name", "Stage/status", "_SERVICE_CHECK", "Clusters/cluster_name", "security", "HostRoles/host_name", "WidgetLayoutInfo/section_name", "quicklinks", "java.security.auth.login.config", "ClusterInfo/url", "Actions/target_service", "ambari-server", "FALCON_SERVICE_CHECK", "#", "1969-12-31 16:00:00", "RootServiceComponents/ciphers", "1.3.6.1.4.1.18060.16", "ambari.dispatch.snmp.oids.body" };
    java.util.HashSet<java.lang.String> hashset_str26 = new java.util.HashSet<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)hashset_str26, str_array25);
    // The following exception was thrown during execution in test generation
    try {
    mpackInstallChecker3.checkClusters(hashset_str26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    org.apache.ambari.server.configuration.Configuration.ConnectionPoolType connectionPoolType0 = org.apache.ambari.server.configuration.Configuration.ConnectionPoolType.C3P0;
    org.junit.Assert.assertTrue("'" + connectionPoolType0 + "' != '" + org.apache.ambari.server.configuration.Configuration.ConnectionPoolType.C3P0 + "'", connectionPoolType0.equals(org.apache.ambari.server.configuration.Configuration.ConnectionPoolType.C3P0));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    java.lang.String str0 = org.apache.ambari.server.stack.ExtensionDirectory.EXTENSIONS_FOLDER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "extensions"+ "'", str0.equals("extensions"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    java.lang.String str0 = org.apache.ambari.server.bootstrap.BootStrapImpl.DEV_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "${ambariVersion}"+ "'", str0.equals("${ambariVersion}"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.HOSTGROUP_HOST_FQDN_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "fqdn"+ "'", str0.equals("fqdn"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    org.apache.ambari.server.orm.entities.WidgetEntity widgetEntity0 = null;
    org.apache.ambari.server.controller.WidgetResponse widgetResponse1 = org.apache.ambari.server.controller.WidgetResponse.coerce(widgetEntity0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(widgetResponse1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    boolean b0 = org.apache.ambari.server.utils.ShellCommandUtil.MAC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.MEMBERSHIPS_CREATED_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/summary/memberships/created"+ "'", str0.equals("Event/summary/memberships/created"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    org.apache.ambari.server.state.stack.upgrade.StartGrouping startGrouping0 = new org.apache.ambari.server.state.stack.upgrade.StartGrouping();
    org.apache.ambari.server.state.stack.upgrade.Task.Type type1 = startGrouping0.getFunction();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.Task.Type.START + "'", type1.equals(org.apache.ambari.server.state.stack.upgrade.Task.Type.START));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    org.apache.ambari.server.utils.HostUtils hostUtils0 = new org.apache.ambari.server.utils.HostUtils();

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    org.apache.ambari.server.topology.ClusterTopology clusterTopology3 = null;
    org.apache.ambari.server.orm.entities.TopologyHostRequestEntity topologyHostRequestEntity4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.HostRequest hostRequest6 = new org.apache.ambari.server.topology.HostRequest((long)' ', (long)0, "ambari-server", clusterTopology3, topologyHostRequestEntity4, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.VERSION_DEFINITION_READ_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    javax.persistence.metamodel.SetAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity,org.apache.ambari.server.orm.entities.AlertGroupEntity> setattribute_alertTargetEntity_alertGroupEntity0 = null;
    org.apache.ambari.server.orm.entities.AlertTargetEntity_.alertGroups = setattribute_alertTargetEntity_alertGroupEntity0;

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    org.apache.ambari.annotations.ExperimentalFeature experimentalFeature0 = org.apache.ambari.annotations.ExperimentalFeature.PATCH_UPGRADES;
    org.junit.Assert.assertTrue("'" + experimentalFeature0 + "' != '" + org.apache.ambari.annotations.ExperimentalFeature.PATCH_UPGRADES + "'", experimentalFeature0.equals(org.apache.ambari.annotations.ExperimentalFeature.PATCH_UPGRADES));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.WIDGETLAYOUT_CLUSTER_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/cluster_name"+ "'", str0.equals("WidgetLayoutInfo/cluster_name"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.String> singularattribute_alertHistoryEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertLabel = singularattribute_alertHistoryEntity_str0;

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    org.apache.ambari.server.state.repository.AvailableServiceReference availableServiceReference0 = new org.apache.ambari.server.state.repository.AvailableServiceReference();
    java.lang.String[] str_array19 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str20 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str20, str_array19);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent22 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str20);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str20;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController24 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider25 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController24);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str26 = ldapSyncEventResourceProvider25.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController27 = null;
    com.google.inject.Injector injector28 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider29 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str20, map_type_str26, ambariManagementController27, injector28);
    org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str20;
    availableServiceReference0.components = linkedhashset_str20;
    java.lang.String[] str_array50 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str51 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str51, str_array50);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent53 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str51);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str51;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController55 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider56 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController55);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str57 = ldapSyncEventResourceProvider56.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController58 = null;
    com.google.inject.Injector injector59 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider60 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str51, map_type_str57, ambariManagementController58, injector59);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController61 = null;
    org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider62 = new org.apache.ambari.server.controller.internal.ActionResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str20, map_type_str57, ambariManagementController61);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController63 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider64 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController63);
    org.apache.ambari.server.controller.spi.Request request65 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate66 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus67 = widgetResourceProvider64.deleteResources(request65, predicate66);
    java.lang.String[] str_array70 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request71 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array70);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus72 = widgetResourceProvider64.createResources(request71);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus73 = actionResourceProvider62.createResources(request71);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus72);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator0 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression1 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator0);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.Predicate predicate4 = isEmptyOperator0.toPredicate("Stage/host_params", "type");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.api.predicate.InvalidQueryException");
    } catch (org.apache.ambari.server.api.predicate.InvalidQueryException e) {
      // Expected exception.
    }

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    org.apache.ambari.server.controller.spi.NoSuchResourceException noSuchResourceException2 = new org.apache.ambari.server.controller.spi.NoSuchResourceException("alerts.json");
    org.apache.ambari.server.view.RemoteAmbariConfigurationReadException remoteAmbariConfigurationReadException3 = new org.apache.ambari.server.view.RemoteAmbariConfigurationReadException("max_duration_for_retries", (java.lang.Throwable)noSuchResourceException2);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    org.apache.ambari.server.state.stack.upgrade.HostOrderItem.HostOrderActionType hostOrderActionType0 = org.apache.ambari.server.state.stack.upgrade.HostOrderItem.HostOrderActionType.HOST_UPGRADE;
    org.junit.Assert.assertTrue("'" + hostOrderActionType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.HostOrderItem.HostOrderActionType.HOST_UPGRADE + "'", hostOrderActionType0.equals(org.apache.ambari.server.state.stack.upgrade.HostOrderItem.HostOrderActionType.HOST_UPGRADE));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertGroupResourceProvider.ALERT_GROUP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertGroup"+ "'", str0.equals("AlertGroup"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.AMBARI_DB_RCA_USERNAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari_db_rca_username"+ "'", str0.equals("ambari_db_rca_username"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.SERVICE_COMPONENT_FILTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "service_component_filter"+ "'", str0.equals("service_component_filter"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.INFORMATIONAL_WARNING;
    org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.INFORMATIONAL_WARNING + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.INFORMATIONAL_WARNING));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.DEFAULT_REALM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "default_realm"+ "'", str0.equals("default_realm"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertCurrentEntity,java.lang.Long> singularattribute_alertCurrentEntity_long0 = null;
    org.apache.ambari.server.orm.entities.AlertCurrentEntity_.originalTimestamp = singularattribute_alertCurrentEntity_long0;

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertNoticeResourceProvider.ALERT_NOTICE_SERVICE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertNotice/service_name"+ "'", str0.equals("AlertNotice/service_name"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.JDK_LOCATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "jdk_location"+ "'", str0.equals("jdk_location"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    org.apache.ambari.server.orm.entities.LdapSyncEventEntity.Status status0 = org.apache.ambari.server.orm.entities.LdapSyncEventEntity.Status.RUNNING;
    org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.ambari.server.orm.entities.LdapSyncEventEntity.Status.RUNNING + "'", status0.equals(org.apache.ambari.server.orm.entities.LdapSyncEventEntity.Status.RUNNING));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    org.apache.ambari.server.audit.request.eventcreator.DefaultEventCreator defaultEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.DefaultEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type1 = defaultEventCreator0.getResourceTypes();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance5 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest6 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders2, requestBody3, uriInfo4, resourceInstance5);
    int i7 = postRequest6.getAPIVersion();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS8 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus9 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS8);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS10 = resultStatus9.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS11 = resultStatus9.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl12 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus9);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.audit.event.AuditEvent auditEvent13 = defaultEventCreator0.createAuditEvent((org.apache.ambari.server.api.services.Request)postRequest6, (org.apache.ambari.server.api.services.Result)resultImpl12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_type1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS11);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.builder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_KSTR_DIR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,byte[]> singularattribute_hostRoleCommandEntity_byte_array0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.structuredOut = singularattribute_hostRoleCommandEntity_byte_array0;

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.osArch = singularattribute_hostEntity_str0;

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    serviceComponentDesiredStateDAO0.create(serviceComponentDesiredStateEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.YARN_SERVICE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_PUBLIC_HOST_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/public_host_name"+ "'", str0.equals("HostRoles/public_host_name"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType stackAdvisorCommandType0 = org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_CONFIGURATION_DEPENDENCIES;
    org.junit.Assert.assertTrue("'" + stackAdvisorCommandType0 + "' != '" + org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_CONFIGURATION_DEPENDENCIES + "'", stackAdvisorCommandType0.equals(org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_CONFIGURATION_DEPENDENCIES));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.AMBARI_DB_RCA_DRIVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari_db_rca_driver"+ "'", str0.equals("ambari_db_rca_driver"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    org.apache.ambari.server.checks.SecondaryNamenodeDeletedCheck secondaryNamenodeDeletedCheck0 = new org.apache.ambari.server.checks.SecondaryNamenodeDeletedCheck();
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest1 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b2 = secondaryNamenodeDeletedCheck0.isApplicable(prereqCheckRequest1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    org.apache.ambari.server.state.Clusters clusters0 = null;
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo1 = null;
    org.apache.ambari.server.configuration.Configuration configuration2 = null;
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.ConfigHelper configHelper4 = new org.apache.ambari.server.state.ConfigHelper(clusters0, ambariMetaInfo1, configuration2, clusterDAO3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    org.apache.ambari.server.checks.InstallPackagesCheck installPackagesCheck0 = new org.apache.ambari.server.checks.InstallPackagesCheck();
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest1 = null;
    boolean b2 = installPackagesCheck0.isApplicable(prereqCheckRequest1);
    org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck3 = null;
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest4 = null;
    // The following exception was thrown during execution in test generation
    try {
    installPackagesCheck0.perform(prerequisiteCheck3, prereqCheckRequest4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    org.apache.ambari.server.state.services.MetricsRetrievalService.MetricSourceType metricSourceType0 = org.apache.ambari.server.state.services.MetricsRetrievalService.MetricSourceType.REST;
    org.junit.Assert.assertTrue("'" + metricSourceType0 + "' != '" + org.apache.ambari.server.state.services.MetricsRetrievalService.MetricSourceType.REST + "'", metricSourceType0.equals(org.apache.ambari.server.state.services.MetricsRetrievalService.MetricSourceType.REST));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.STACK_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/stack_version"+ "'", str0.equals("StackConfigurations/stack_version"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    org.apache.ambari.server.view.ViewRegistry viewRegistry0 = null;
    org.apache.ambari.server.view.ViewRegistry.initInstance(viewRegistry0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.resetErrorWarningFlags();

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StageResourceProvider.STAGE_COMMAND_PARAMS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stage/command_params"+ "'", str0.equals("Stage/command_params"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.Integer> singularattribute_alertDefinitionEntity_i0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.enabled;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_i0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    java.lang.String str1 = org.apache.ambari.server.utils.DateUtils.convertToReadableTime((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1969-12-31 16:00:00"+ "'", str1.equals("1969-12-31 16:00:00"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    org.apache.ambari.server.controller.spi.Resource[] resource_array0 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource1 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1, resource_array0);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl6 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1, true, false, (int)'#');
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl7 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource8 = queryResponseImpl7.getResources();
    boolean b9 = queryResponseImpl7.isPagedResponse();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = addUserToGroupRequestAuditEventBuilder0.withRemoteIp("ViewVersionInfo/archive");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder2);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    org.apache.ambari.server.api.services.PermissionService permissionService0 = new org.apache.ambari.server.api.services.PermissionService();
    javax.ws.rs.core.Request request1 = null;
    org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService3 = permissionService0.getRoleAuthorizations(request1, "");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = permissionService0.deletePermission(httpHeaders4, uriInfo5, "ambari-server");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorizationService3);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.PEERSTATUS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceConfigVersionResourceProvider.SERVICE_CONFIG_VERSION_CLUSTER_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cluster_name"+ "'", str0.equals("cluster_name"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackVersionResourceProvider.STACK_VALID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/valid"+ "'", str0.equals("Versions/valid"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.CONFIGURATIONS_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configurations"+ "'", str0.equals("configurations"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    org.apache.ambari.server.api.services.KerberosDescriptorService kerberosDescriptorService0 = new org.apache.ambari.server.api.services.KerberosDescriptorService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = kerberosDescriptorService0.getKerberosDescriptors("Upgrade/to_version", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.controller.metrics.MetricsServiceProvider.MetricsService metricsService2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = defaultProviderModule0.getCollectorHostName("components", metricsService2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    org.apache.ambari.server.configuration.Configuration.DatabaseType databaseType0 = org.apache.ambari.server.configuration.Configuration.DatabaseType.SQL_SERVER;
    java.lang.String str1 = databaseType0.getName();
    org.junit.Assert.assertTrue("'" + databaseType0 + "' != '" + org.apache.ambari.server.configuration.Configuration.DatabaseType.SQL_SERVER + "'", databaseType0.equals(org.apache.ambari.server.configuration.Configuration.DatabaseType.SQL_SERVER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "sqlserver"+ "'", str1.equals("sqlserver"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    boolean b0 = org.apache.ambari.server.utils.ShellCommandUtil.LINUX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    javax.persistence.metamodel.SetAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,org.apache.ambari.server.orm.entities.AlertGroupEntity> setattribute_alertDefinitionEntity_alertGroupEntity0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.alertGroups;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(setattribute_alertDefinitionEntity_alertGroupEntity0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.logging.LockFactory lockFactory1 = new org.apache.ambari.server.logging.LockFactory(configuration0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.CONFIG_RECOMMENDATION_STRATEGY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "config_recommendation_strategy"+ "'", str0.equals("config_recommendation_strategy"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    boolean b1 = org.apache.ambari.server.controller.utilities.PropertyHelper.containsArguments("Versions/valid");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.TOPOLOGY;
    java.lang.Float f1 = upgradeCheckGroup0.getOrder();
    org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.TOPOLOGY + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.TOPOLOGY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f1 + "' != '" + 4.0f+ "'", f1.equals(4.0f));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    java.lang.String str2 = org.apache.ambari.server.topology.HostGroupImpl.formatAbsoluteName("ViewInstanceInfo/view_name", "type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ViewInstanceInfo/view_name:type"+ "'", str2.equals("ViewInstanceInfo/view_name:type"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder deleteGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder deleteGroupRequestAuditEventBuilder2 = deleteGroupRequestAuditEventBuilder0.withUrl("Repositories/latest_base_url");
    javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance6 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest7 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders3, requestBody4, uriInfo5, resourceInstance6);
    int i8 = postRequest7.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type9 = postRequest7.getRequestType();
    org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder deleteGroupRequestAuditEventBuilder10 = deleteGroupRequestAuditEventBuilder2.withRequestType(type9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type9.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteGroupRequestAuditEventBuilder10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_STALE_CONFIG_CACHE_EXPIRATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionVersionResourceProvider.EXTENSION_PARENT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/parent_extension_version"+ "'", str0.equals("Versions/parent_extension_version"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.String> singularattribute_alertHistoryEntity_str0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.hostName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_str0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    org.apache.ambari.server.controller.RequestsByStatusesRequest requestsByStatusesRequest0 = new org.apache.ambari.server.controller.RequestsByStatusesRequest();

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    org.apache.ambari.server.state.RepositoryVersionState repositoryVersionState0 = org.apache.ambari.server.state.RepositoryVersionState.INSTALLING;
    org.junit.Assert.assertTrue("'" + repositoryVersionState0 + "' != '" + org.apache.ambari.server.state.RepositoryVersionState.INSTALLING + "'", repositoryVersionState0.equals(org.apache.ambari.server.state.RepositoryVersionState.INSTALLING));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    java.lang.String str0 = org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper.DECOM_INCLUDED_HOSTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "included_hosts"+ "'", str0.equals("included_hosts"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    org.apache.ambari.server.actionmanager.ActionType actionType1 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType6 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array8 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization9 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9, roleAuthorization_array8);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition11 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType1, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType6, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9);
    java.lang.String str12 = actionDefinition11.getTargetService();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "WidgetLayoutInfo/section_name"+ "'", str12.equals("WidgetLayoutInfo/section_name"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_BIND_ANONYMOUSLY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.SUBRESOURCE_OPERATING_SYSTEMS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operating_systems"+ "'", str0.equals("operating_systems"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_ hostRoleCommandEntity_0 = new org.apache.ambari.server.orm.entities.HostRoleCommandEntity_();

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    javax.ws.rs.core.MediaType mediaType0 = org.apache.ambari.server.api.services.BaseService.MEDIA_TYPE_TEXT_CSV_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mediaType0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    org.apache.ambari.server.bootstrap.BSResponse bSResponse0 = new org.apache.ambari.server.bootstrap.BSResponse();
    bSResponse0.setLog("METRICS_COLLECTOR");
    java.lang.String str3 = bSResponse0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "METRICS_COLLECTOR"+ "'", str3.equals("METRICS_COLLECTOR"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    org.apache.ambari.server.orm.entities.AlertGroupEntity alertGroupEntity0 = null;
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyViewAuthorization(alertGroupEntity0, (java.lang.Long)0L);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer1 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule2 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl3 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule2);
    metricsPaddingRenderer1.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl3);
    org.apache.ambari.server.api.util.TreeNode<org.apache.ambari.server.api.query.QueryInfo> treenode_queryInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.util.TreeNode<java.util.Set<java.lang.String>> treenode_set_str7 = metricsPaddingRenderer1.finalizeProperties(treenode_queryInfo5, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    org.apache.ambari.server.state.StackId stackId1 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str6 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse7 = new org.apache.ambari.server.controller.ConfigurationResponse("service", stackId1, "hi!", "ServiceInfo/credential_store_supported", (java.lang.Long)(-1L), map_str_str5, map_str_map_str_str6);
    configurationResponse7.setVersion((java.lang.Long)1L);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_ALERTS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_ALERTS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_ALERTS));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.TOPOLOGY_TASK_PARALLEL_CREATION_THREAD_COUNT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    org.apache.ambari.server.state.AlertFirmness alertFirmness0 = org.apache.ambari.server.state.AlertFirmness.HARD;
    org.junit.Assert.assertTrue("'" + alertFirmness0 + "' != '" + org.apache.ambari.server.state.AlertFirmness.HARD + "'", alertFirmness0.equals(org.apache.ambari.server.state.AlertFirmness.HARD));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    int i2 = org.apache.ambari.server.utils.VersionUtils.compareVersions("ViewInstanceInfo/short_url_name", "Actions/target_service");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    java.lang.String str0 = org.apache.ambari.server.stack.StackManager.COMMON_SERVICES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "common-services"+ "'", str0.equals("common-services"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.SERVICE_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "service_type"+ "'", str0.equals("service_type"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.RANGER_USERSYNC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    org.apache.ambari.server.state.repository.VersionDefinitionXml versionDefinitionXml0 = new org.apache.ambari.server.state.repository.VersionDefinitionXml();
    org.apache.ambari.server.state.StackInfo stackInfo1 = null;
    java.util.Collection<org.apache.ambari.server.state.repository.AvailableService> collection_availableService2 = versionDefinitionXml0.getAvailableServices(stackInfo1);
    org.apache.ambari.server.state.StackInfo stackInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.ambari.server.state.repository.ManifestServiceInfo> list_manifestServiceInfo4 = versionDefinitionXml0.getStackServices(stackInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_availableService2);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.HOST_GROUP_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_groups"+ "'", str0.equals("host_groups"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    org.apache.ambari.server.controller.GroupRequest groupRequest1 = new org.apache.ambari.server.controller.GroupRequest("Users/user_name");

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    org.apache.ambari.server.security.CertificateManager certificateManager0 = null;
    org.apache.ambari.server.security.unsecured.rest.CertificateDownload.init(certificateManager0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertResourceProvider.ALERT_CLUSTER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Alert/cluster_name"+ "'", str0.equals("Alert/cluster_name"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.CLUSTER_ENV_STACK_TOOLS_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "stack_tools"+ "'", str0.equals("stack_tools"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.JWT_AUDIENCES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    org.apache.ambari.server.controller.spi.Predicate predicate0 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array1 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate0 };
    org.apache.ambari.server.controller.spi.Predicate predicate2 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array1);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate3 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate2);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    org.apache.ambari.server.agent.CommandReport commandReport2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.events.ActionFinalReportReceivedEvent actionFinalReportReceivedEvent4 = new org.apache.ambari.server.events.ActionFinalReportReceivedEvent((java.lang.Long)0L, "security", commandReport2, (java.lang.Boolean)true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.String> singularattribute_hostRoleCommandEntity_str0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.outputLog;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_str0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StackEntity,java.lang.Long> singularattribute_stackEntity_long0 = null;
    org.apache.ambari.server.orm.entities.StackEntity_.stackId = singularattribute_stackEntity_long0;

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    org.apache.ambari.server.security.encryption.CertificateUtils certificateUtils0 = new org.apache.ambari.server.security.encryption.CertificateUtils();

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_RESTART;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_RESTART + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_RESTART));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertNoticeResourceProvider.ALERT_NOTICE_STATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertNotice/notification_state"+ "'", str0.equals("AlertNotice/notification_state"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    org.apache.ambari.server.controller.logging.LogSearchDataRetrievalService logSearchDataRetrievalService0 = new org.apache.ambari.server.controller.logging.LogSearchDataRetrievalService();
    com.google.common.util.concurrent.ListenableFuture<com.google.common.util.concurrent.Service.State> listenablefuture_state1 = logSearchDataRetrievalService0.start();
    com.google.common.util.concurrent.Service.Listener listener2 = null;
    java.util.concurrent.Executor executor3 = null;
    // The following exception was thrown during execution in test generation
    try {
    logSearchDataRetrievalService0.addListener(listener2, executor3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listenablefuture_state1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider.VIEW_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PermissionInfo/version"+ "'", str0.equals("PermissionInfo/version"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    java.util.Properties properties0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.configuration.Configuration configuration1 = new org.apache.ambari.server.configuration.Configuration(properties0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.KDC_CONNECTION_CHECK_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STACK_DETAILS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STACK_DETAILS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STACK_DETAILS));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    int i0 = org.apache.ambari.server.state.stack.upgrade.ParallelScheduler.DEFAULT_MAX_DEGREE_OF_PARALLELISM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 100);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.CONFIGURATION_MAP_CHECK_ERROR_MESSAGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Configuration elements must be Maps"+ "'", str0.equals("Configuration elements must be Maps"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    java.lang.String str0 = org.apache.ambari.server.api.predicate.QueryLexer.QUERY_FIELDS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "fields"+ "'", str0.equals("fields"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_CONNECTION_POOL_AQUISITION_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.ipv4 = singularattribute_hostEntity_str0;

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.METRIC_RETRIEVAL_SERVICE_THREAD_PRIORITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo0 = new org.apache.ambari.server.state.ChangedConfigInfo();
    boolean b2 = changedConfigInfo0.equals((java.lang.Object)"UpgradeChecks/repository_version");
    java.lang.String str3 = changedConfigInfo0.getType();
    changedConfigInfo0.setType("Stage/cluster_host_info");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    org.apache.ambari.server.api.predicate.expressions.LogicalExpressionFactory logicalExpressionFactory0 = new org.apache.ambari.server.api.predicate.expressions.LogicalExpressionFactory();

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.propertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getKeyPropertyIds(type0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    java.lang.String str0 = org.apache.ambari.server.agent.RecoveryConfigHelper.RECOVERY_LIFETIME_MAX_COUNT_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "recovery_lifetime_max_count"+ "'", str0.equals("recovery_lifetime_max_count"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    java.lang.String str0 = org.apache.ambari.server.topology.Setting.SETTING_NAME_SERVICE_SETTINGS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "service_settings"+ "'", str0.equals("service_settings"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.CONST_UPGRADE_ITEM_TEXT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Update Target Stack"+ "'", str0.equals("Update Target Stack"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SECONDARY_NAMENODE_MUST_BE_DELETED;
    org.apache.ambari.server.checks.CheckDescription.KAFKA_KERBEROS_CHECK = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.JAVA_HOME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "java_home"+ "'", str0.equals("java_home"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity,java.lang.String> singularattribute_alertTargetEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertTargetEntity_.targetName = singularattribute_alertTargetEntity_str0;

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    org.apache.ambari.server.utils.XmlUtils xmlUtils0 = new org.apache.ambari.server.utils.XmlUtils();

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_TOTAL_HOSTS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/total_hosts"+ "'", str0.equals("Clusters/total_hosts"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity,java.lang.Short> singularattribute_alertTargetEntity_s0 = org.apache.ambari.server.orm.entities.AlertTargetEntity_.isGlobal;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertTargetEntity_s0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    org.apache.ambari.server.api.services.ViewService viewService0 = new org.apache.ambari.server.api.services.ViewService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = viewService0.getView("HostRoles/state", httpHeaders2, uriInfo3, "cluster_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackVersionResourceProvider.STACK_MAX_JDK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/max_jdk"+ "'", str0.equals("Versions/max_jdk"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    org.apache.ambari.server.hooks.users.UserHookParams userHookParams0 = org.apache.ambari.server.hooks.users.UserHookParams.CLUSTER_ID;
    org.junit.Assert.assertTrue("'" + userHookParams0 + "' != '" + org.apache.ambari.server.hooks.users.UserHookParams.CLUSTER_ID + "'", userHookParams0.equals(org.apache.ambari.server.hooks.users.UserHookParams.CLUSTER_ID));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.TEMPORARYSTORE_ACTIVELY_PURGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.ServerAction.ACTION_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ACTION_NAME"+ "'", str0.equals("ACTION_NAME"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform2 = null;
    org.eclipse.persistence.internal.sessions.AbstractSession abstractSession3 = mySqlHelper1.createStubAbstractSessionFromPlatform(databasePlatform2);
    java.lang.StringBuilder stringBuilder4 = null;
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.StringBuilder stringBuilder6 = mySqlHelper1.writeColumnModifyString(stringBuilder4, dBColumnInfo5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractSession3);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertHistoryResourceProvider.ALERT_HISTORY_HOSTNAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertHistory/host_name"+ "'", str0.equals("AlertHistory/host_name"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator0 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    int i1 = isEmptyOperator0.getPrecedence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = org.apache.ambari.server.upgrade.SchemaUpgradeUtil.extractProperty("#", "", "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", "ambari_db_rca_driver", "Versions/extension-errors", map_str_str5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.MASTER_KEY_ENV_PROP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AMBARI_SECURITY_MASTER_KEY"+ "'", str0.equals("AMBARI_SECURITY_MASTER_KEY"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    java.io.File file1 = null;
    org.apache.ambari.server.state.StackInfo stackInfo2 = null;
    org.apache.ambari.server.state.stack.OsFamily osFamily3 = null;
    org.apache.ambari.server.state.stack.LatestRepoCallable latestRepoCallable4 = new org.apache.ambari.server.state.stack.LatestRepoCallable("kerberos_descriptor", file1, stackInfo2, osFamily3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Void void5 = latestRepoCallable4.call();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.Integer> singularattribute_alertDefinitionEntity_i0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.scheduleInterval;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_i0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.JWT_ORIGINAL_URL_QUERY_PARAM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    org.apache.ambari.view.migration.ViewDataMigrationContext viewDataMigrationContext0 = null;
    org.apache.ambari.server.view.ViewDataMigrationUtility.CopyAllDataMigrator copyAllDataMigrator1 = new org.apache.ambari.server.view.ViewDataMigrationUtility.CopyAllDataMigrator(viewDataMigrationContext0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.String> singularattribute_hostRoleCommandEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.commandDetail = singularattribute_hostRoleCommandEntity_str0;

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.KNOX_GATEWAY;
    org.apache.ambari.server.RoleCommand roleCommand1 = org.apache.ambari.server.RoleCommand.EXECUTE;
    org.apache.ambari.server.metadata.RoleCommandPair roleCommandPair2 = new org.apache.ambari.server.metadata.RoleCommandPair(role0, roleCommand1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);
    org.junit.Assert.assertTrue("'" + roleCommand1 + "' != '" + org.apache.ambari.server.RoleCommand.EXECUTE + "'", roleCommand1.equals(org.apache.ambari.server.RoleCommand.EXECUTE));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Integer> singularattribute_hostRoleCommandEntity_i0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.exitcode = singularattribute_hostRoleCommandEntity_i0;

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity,java.lang.String> singularattribute_alertTargetEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertTargetEntity_.description = singularattribute_alertTargetEntity_str0;

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.RECOMMENDATIONS_DIR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.GROUPS_CREATED_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/summary/groups/created"+ "'", str0.equals("Event/summary/groups/created"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BaseClusterRequest.PROVISION_ACTION_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "provision_action"+ "'", str0.equals("provision_action"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    org.apache.ambari.server.checks.HiveMultipleMetastoreCheck hiveMultipleMetastoreCheck0 = new org.apache.ambari.server.checks.HiveMultipleMetastoreCheck();

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS;
    java.lang.String str1 = roleAuthorization0.getId();
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AMBARI.MANAGE_USERS"+ "'", str1.equals("AMBARI.MANAGE_USERS"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    org.apache.ambari.server.api.predicate.operators.EqualsOperator equalsOperator0 = new org.apache.ambari.server.api.predicate.operators.EqualsOperator();
    org.apache.ambari.server.api.predicate.operators.Operator.TYPE tYPE1 = equalsOperator0.getType();
    java.lang.String str2 = equalsOperator0.getName();
    org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.ambari.server.api.predicate.operators.Operator.TYPE.EQUAL + "'", tYPE1.equals(org.apache.ambari.server.api.predicate.operators.Operator.TYPE.EQUAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "EqualsOperator"+ "'", str2.equals("EqualsOperator"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    stackConfigurationResponse12.setPropertyValue("hdfs-site");
    java.lang.String str15 = stackConfigurationResponse12.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "alerts.json"+ "'", str15.equals("alerts.json"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.BLUEPRINT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "blueprint"+ "'", str0.equals("blueprint"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    org.apache.ambari.server.security.authorization.ResourceType resourceType0 = null;
    org.apache.ambari.server.actionmanager.ActionType actionType3 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType8 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array10 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization11 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization11, roleAuthorization_array10);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition13 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType3, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType8, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization11);
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider16 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization17 = groupPrivilegeResourceProvider16.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization18 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array19 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization18 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization20 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization20, roleAuthorization_array19);
    boolean b22 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization17, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization20);
    actionDefinition13.setPermissions((java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization20);
    boolean b24 = org.apache.ambari.server.security.authorization.AuthorizationHelper.isAuthorized(resourceType0, (java.lang.Long)(-1L), (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization17);
    org.junit.Assert.assertTrue("'" + roleAuthorization18 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization18.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.ClusterKerberosDescriptorResourceProvider clusterKerberosDescriptorResourceProvider1 = new org.apache.ambari.server.controller.internal.ClusterKerberosDescriptorResourceProvider(ambariManagementController0);
    org.apache.ambari.server.controller.ivory.IvoryService ivoryService2 = null;
    java.lang.String[] str_array21 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent24 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str22);
    java.lang.String[] str_array43 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str44 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str44, str_array43);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent46 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str44);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str44;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController48 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider49 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController48);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str50 = ldapSyncEventResourceProvider49.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController51 = null;
    com.google.inject.Injector injector52 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider53 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str44, map_type_str50, ambariManagementController51, injector52);
    org.apache.ambari.server.controller.internal.TargetClusterResourceProvider targetClusterResourceProvider54 = new org.apache.ambari.server.controller.internal.TargetClusterResourceProvider(ivoryService2, (java.util.Set<java.lang.String>)linkedhashset_str22, map_type_str50);
    java.lang.String[] str_array57 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request58 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array57);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus59 = targetClusterResourceProvider54.createResources(request58);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate62 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource63 = clusterKerberosDescriptorResourceProvider1.getResources(request58, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate62);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus59);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    org.apache.ambari.server.orm.entities.RequestEntity requestEntity0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter> list_requestResourceFilter1 = org.apache.ambari.server.actionmanager.Request.filtersFromEntity(requestEntity0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array0 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo1 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo1, propertyInfo_array0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo4 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo1, map_str_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider1 = null;
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration2 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider timelineMetricCacheProvider3 = null;
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule4 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule5 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.MetricsReportPropertyProviderProxy metricsReportPropertyProviderProxy7 = org.apache.ambari.server.controller.metrics.MetricsReportPropertyProvider.createInstance(map_str_map_str_propertyInfo0, uRLStreamProvider1, componentSSLConfiguration2, timelineMetricCacheProvider3, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule4, (org.apache.ambari.server.controller.metrics.MetricsServiceProvider)defaultProviderModule5, "RootServiceComponents/service_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    org.apache.ambari.server.controller.UserResponse userResponse4 = new org.apache.ambari.server.controller.UserResponse("##", true, true, true);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

    org.apache.ambari.server.KdcServerConnectionVerification.ConnectionProtocol connectionProtocol0 = org.apache.ambari.server.KdcServerConnectionVerification.ConnectionProtocol.TCP;
    org.junit.Assert.assertTrue("'" + connectionProtocol0 + "' != '" + org.apache.ambari.server.KdcServerConnectionVerification.ConnectionProtocol.TCP + "'", connectionProtocol0.equals(org.apache.ambari.server.KdcServerConnectionVerification.ConnectionProtocol.TCP));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    int i5 = postRequest4.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type6 = postRequest4.getRequestType();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreatorHelper.getProperty((org.apache.ambari.server.api.services.Request)postRequest4, "Versions/valid");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type6.equals(org.apache.ambari.server.api.services.Request.Type.POST));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_STRUCT_OUT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/structured_out"+ "'", str0.equals("Tasks/structured_out"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.VIEWS_HTTP_CACHE_CONTROL_HEADER_VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    org.apache.ambari.server.state.ServiceComponent serviceComponent0 = null;
    org.apache.ambari.server.state.Clusters clusters2 = null;
    org.apache.ambari.server.orm.dao.StackDAO stackDAO3 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO4 = null;
    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO5 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO6 = null;
    org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO7 = null;
    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher8 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener alertLifecycleListener9 = new org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener(ambariEventPublisher8);
    org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener alertMaintenanceModeListener10 = new org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener(ambariEventPublisher8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl serviceComponentHostImpl11 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl(serviceComponent0, "AlertTarget/name", clusters2, stackDAO3, hostDAO4, serviceComponentDesiredStateDAO5, hostComponentStateDAO6, hostComponentDesiredStateDAO7, ambariEventPublisher8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo3 = new org.apache.ambari.server.state.ChangedConfigInfo("security", "stack_tools", "PermissionInfo/resource_name");

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    org.apache.ambari.server.api.resources.ServiceResourceDefinition serviceResourceDefinition0 = new org.apache.ambari.server.api.resources.ServiceResourceDefinition();

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType0 = org.apache.ambari.server.state.PropertyInfo.PropertyType.NOT_MANAGED_HDFS_PATH;
    org.junit.Assert.assertTrue("'" + propertyType0 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.NOT_MANAGED_HDFS_PATH + "'", propertyType0.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.NOT_MANAGED_HDFS_PATH));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    java.lang.String str0 = org.apache.ambari.server.utils.AmbariPath.rootDirectory;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    org.apache.ambari.server.serveraction.kerberos.PrepareDisableKerberosServerAction prepareDisableKerberosServerAction0 = new org.apache.ambari.server.serveraction.kerberos.PrepareDisableKerberosServerAction();
    java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Object> concurrentmap_str_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.CommandReport commandReport2 = prepareDisableKerberosServerAction0.execute(concurrentmap_str_obj1);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
    } catch (org.apache.ambari.server.AmbariException e) {
      // Expected exception.
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    org.apache.ambari.server.orm.entities.AlertCurrentEntity_ alertCurrentEntity_0 = new org.apache.ambari.server.orm.entities.AlertCurrentEntity_();

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,byte[]> singularattribute_hostRoleCommandEntity_byte_array0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.stdError;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_byte_array0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.VersionDefinitionResourceProvider.SUBRESOURCE_OPERATING_SYSTEMS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operating_systems"+ "'", str0.equals("operating_systems"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    org.apache.ambari.server.state.quicklinks.Link link0 = new org.apache.ambari.server.state.quicklinks.Link();
    org.apache.ambari.server.state.quicklinks.Protocol protocol1 = link0.getProtocol();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(protocol1);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    java.lang.String str13 = stackConfigurationResponse12.getPropertyDescription();
    java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo> set_propertyDependencyInfo14 = stackConfigurationResponse12.getDependsOnProperties();
    stackConfigurationResponse12.setPropertyDisplayName("AlertGroup");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Hosts/last_registration_time"+ "'", str13.equals("Hosts/last_registration_time"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_propertyDependencyInfo14);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.PACKAGE_LIST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "package_list"+ "'", str0.equals("package_list"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider0 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.lang.String[] str_array3 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request4 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus5 = groupPrivilegeResourceProvider0.createResources(request4);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.controller.spi.SystemException");
    } catch (org.apache.ambari.server.controller.spi.SystemException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request4);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    org.apache.ambari.server.api.resources.CredentialResourceDefinition credentialResourceDefinition0 = new org.apache.ambari.server.api.resources.CredentialResourceDefinition();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.query.render.Renderer renderer2 = credentialResourceDefinition0.getRenderer("_SERVICE_CHECK");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserAuthorizationResourceProvider.AUTHORIZATION_RESOURCE_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AuthorizationInfo/resource_type"+ "'", str0.equals("AuthorizationInfo/resource_type"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    java.lang.String str0 = org.apache.ambari.server.api.resources.UpgradeResourceDefinition.DOWNGRADE_DIRECTIVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "downgrade"+ "'", str0.equals("downgrade"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.STACK_SERVICE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Artifacts/service_name"+ "'", str0.equals("Artifacts/service_name"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    org.apache.ambari.server.utils.ShellCommandUtil shellCommandUtil0 = new org.apache.ambari.server.utils.ShellCommandUtil();

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    org.apache.ambari.server.orm.entities.StageEntity[] stageEntity_array0 = new org.apache.ambari.server.orm.entities.StageEntity[] {  };
    java.util.ArrayList<org.apache.ambari.server.orm.entities.StageEntity> arraylist_stageEntity1 = new java.util.ArrayList<org.apache.ambari.server.orm.entities.StageEntity>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.StageEntity>)arraylist_stageEntity1, stageEntity_array0);
    org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus3 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStageEntities((java.util.Collection<org.apache.ambari.server.orm.entities.StageEntity>)arraylist_stageEntity1);
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus4 = calculatedStatus3.getStatus();
    boolean b5 = hostRoleStatus4.isCompletedState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stageEntity_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(calculatedStatus3);
    org.junit.Assert.assertTrue("'" + hostRoleStatus4 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED + "'", hostRoleStatus4.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request3 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array2);
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.utils.ShellCommandUtil.Result result5 = org.apache.ambari.server.utils.ShellCommandUtil.runCommand(str_array2, map_str_str4);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    java.lang.StringBuilder stringBuilder2 = null;
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.StringBuilder stringBuilder6 = mySqlHelper1.writeSetNullableString(stringBuilder2, "evaluate_when", dBColumnInfo4, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    org.apache.ambari.server.controller.AlertCurrentRequest alertCurrentRequest0 = new org.apache.ambari.server.controller.AlertCurrentRequest();
    org.apache.ambari.server.controller.spi.SortRequest sortRequest1 = null;
    alertCurrentRequest0.Sort = sortRequest1;

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.ANONYMOUS_AUDIT_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_DISABLED_CIPHERS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFile.KEYTAB_FILE_GROUP_ACCESS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "keytab_file_group_access"+ "'", str0.equals("keytab_file_group_access"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_OS_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/os_type"+ "'", str0.equals("Hosts/os_type"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.CLUSTER_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cluster_id"+ "'", str0.equals("cluster_id"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    org.apache.ambari.server.topology.TopologyRequest topologyRequest1 = null;
    org.apache.ambari.server.topology.PersistedTopologyRequest persistedTopologyRequest2 = new org.apache.ambari.server.topology.PersistedTopologyRequest((long)(short)100, topologyRequest1);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.UPGRADE_SUSPENDED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "upgrade_suspended"+ "'", str0.equals("upgrade_suspended"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertNoticeResourceProvider.ALERT_NOTICE_CLUSTER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertNotice/cluster_name"+ "'", str0.equals("AlertNotice/cluster_name"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

    org.apache.ambari.server.api.resources.TaskAttemptResourceDefinition taskAttemptResourceDefinition0 = new org.apache.ambari.server.api.resources.TaskAttemptResourceDefinition();

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.upgrades.FinalizeUpgradeAction.VERSION_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "version"+ "'", str0.equals("version"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    org.apache.ambari.server.api.services.ViewUrlsService viewUrlsService0 = new org.apache.ambari.server.api.services.ViewUrlsService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = viewUrlsService0.deleteUrl("fqdn", httpHeaders2, uriInfo3, "forceRefreshConfigTagsBeforeExecution");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    java.lang.String str0 = org.apache.ambari.server.orm.dao.HostRoleCommandDAO.HRC_STATUS_SUMMARY_CACHE_EXPIRY_DURATION_MINUTES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hostRoleCommandStatusCacheExpiryDurationMins"+ "'", str0.equals("hostRoleCommandStatusCacheExpiryDurationMins"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.USER_LIST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "user_list"+ "'", str0.equals("user_list"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str19, str_array18);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent21 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str19);
    java.util.Set<java.lang.String> set_str22 = hostsAddedEvent21.getHostNames();
    org.apache.ambari.server.controller.spi.TemporalInfo temporalInfo24 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey timelineAppMetricCacheKey25 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey(set_str22, "Tasks/id", temporalInfo24);
    java.lang.String str26 = timelineAppMetricCacheKey25.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}"+ "'", str26.equals("TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.Integer> singularattribute_hostEntity_i0 = org.apache.ambari.server.orm.entities.HostEntity_.phCpuCount;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_i0);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreatorHelper.getProperty((org.apache.ambari.server.api.services.Request)postRequest4, "Configuration elements must be Maps");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.CONFIGURATION_LIST_CHECK_ERROR_MESSAGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Configurations property must be a List of Maps"+ "'", str0.equals("Configurations property must be a List of Maps"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.SHORT_URL_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/short_url"+ "'", str0.equals("ViewInstanceInfo/short_url"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    org.apache.ambari.server.events.ClusterConfigChangedEvent clusterConfigChangedEvent4 = new org.apache.ambari.server.events.ClusterConfigChangedEvent("Upgrade", "Configuration elements must be Maps", "StackLevelConfigurations/property_value_attributes", (java.lang.Long)100L);
    java.lang.String str5 = clusterConfigChangedEvent4.getClusterName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Upgrade"+ "'", str5.equals("Upgrade"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyToggleAuthorization("ViewVersionInfo/min_ambari_version", (java.lang.Long)(-1L));
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.WIDGETLAYOUT_WIDGETS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/widgets"+ "'", str0.equals("WidgetLayoutInfo/widgets"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.JDBC_LOCAL_URL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "jdbc:postgresql://localhost/"+ "'", str0.equals("jdbc:postgresql://localhost/"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.RECOVERY_WINDOW_IN_MIN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    org.apache.ambari.server.api.services.VersionDefinitionService versionDefinitionService0 = new org.apache.ambari.server.api.services.VersionDefinitionService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = versionDefinitionService0.createVersionByXml("cluster-env", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    org.apache.ambari.server.view.configuration.AutoInstanceConfig autoInstanceConfig0 = new org.apache.ambari.server.view.configuration.AutoInstanceConfig();
    java.lang.String str1 = autoInstanceConfig0.getDescription();
    java.lang.String str2 = autoInstanceConfig0.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SECONDARY_NAMENODE_MUST_BE_DELETED;
    java.lang.String str1 = checkDescription0.name();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SECONDARY_NAMENODE_MUST_BE_DELETED"+ "'", str1.equals("SECONDARY_NAMENODE_MUST_BE_DELETED"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HIVE_CLIENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule1 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule0);
    org.apache.ambari.server.controller.spi.Resource.Type type2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.ambari.server.controller.spi.PropertyProvider> list_propertyProvider3 = viewProviderModule1.getPropertyProviders(type2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule1);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization1 = org.apache.ambari.server.security.authorization.RoleAuthorization.translate("Versions/parent_extension_version");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder2 = addCredentialAuditEventBuilder0.withUrl("Versions/stack-errors");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder2);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.String> singularattribute_hostRoleCommandEntity_str0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.commandDetail;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_str0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertCurrentEntity,java.lang.Long> singularattribute_alertCurrentEntity_long0 = org.apache.ambari.server.orm.entities.AlertCurrentEntity_.latestTimestamp;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertCurrentEntity_long0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertHistoryResourceProvider.ALERT_HISTORY_LABEL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertHistory/label"+ "'", str0.equals("AlertHistory/label"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    org.apache.ambari.server.utils.SetUtils setUtils0 = new org.apache.ambari.server.utils.SetUtils();

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.USERS_CREATED_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/summary/users/created"+ "'", str0.equals("Event/summary/users/created"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    java.lang.Iterable<org.apache.ambari.server.controller.spi.Resource> iterable_resource0 = null;
    org.apache.ambari.server.controller.spi.Resource resource2 = null;
    org.apache.ambari.server.controller.spi.Resource resource3 = null;
    org.apache.ambari.server.controller.internal.PageResponseImpl pageResponseImpl5 = new org.apache.ambari.server.controller.internal.PageResponseImpl(iterable_resource0, (int)(byte)0, resource2, resource3, (java.lang.Integer)0);
    org.apache.ambari.server.controller.spi.Resource resource6 = pageResponseImpl5.getPreviousResource();
    java.lang.Integer i7 = pageResponseImpl5.getTotalResourceCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 0+ "'", i7.equals(0));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

    org.apache.ambari.server.state.alert.AlertDefinition alertDefinition1 = null;
    org.apache.ambari.server.events.AlertDefinitionDeleteEvent alertDefinitionDeleteEvent2 = new org.apache.ambari.server.events.AlertDefinitionDeleteEvent((long)120, alertDefinition1);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder1 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance5 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest6 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders2, requestBody3, uriInfo4, resourceInstance5);
    int i7 = postRequest6.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type8 = postRequest6.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder9 = addUserToGroupRequestAuditEventBuilder1.withRequestType(type8);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder10 = deleteRepositoryVersionAuditEventBuilder0.withRequestType(type8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent deleteRepositoryVersionRequestAuditEvent11 = deleteRepositoryVersionAuditEventBuilder10.build();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type8.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder10);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    mITKerberosOperationHandler0.setDefaultRealm("type");
    mITKerberosOperationHandler0.setOpen(true);
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = mITKerberosOperationHandler0.principalExists("Clusters/total_hosts");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosOperationException");
    } catch (org.apache.ambari.server.serveraction.kerberos.KerberosOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler.KERBEROS_ENV_ENCRYPTION_TYPES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "encryption_types"+ "'", str0.equals("encryption_types"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    java.io.File file3 = configuration0.getRecommendationsDir();
    java.lang.String str4 = configuration0.getViewsPragmaHTTPResponseHeader();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no-cache"+ "'", str4.equals("no-cache"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.ipv6 = singularattribute_hostEntity_str0;

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_HOSTS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_HOSTS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_HOSTS));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b1 = org.apache.ambari.server.topology.ClusterTopologyImpl.isNameNodeHAEnabled(map_str_map_str_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.AMBARI_REQUEST_READ_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

    org.apache.ambari.server.checks.ServicePresenceCheck servicePresenceCheck0 = new org.apache.ambari.server.checks.ServicePresenceCheck();

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    org.apache.ambari.server.audit.request.eventcreator.ComponentEventCreator componentEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.ComponentEventCreator();

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.HOST_GROUP_CARDINALITY_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cardinality"+ "'", str0.equals("cardinality"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

    org.apache.ambari.server.events.ServiceInstalledEvent serviceInstalledEvent4 = new org.apache.ambari.server.events.ServiceInstalledEvent((long)(short)0, "alerts.json", "alerts.json", "");
    java.lang.String str5 = serviceInstalledEvent4.getStackName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "alerts.json"+ "'", str5.equals("alerts.json"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.pkPropertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str0);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_STATUS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/status"+ "'", str0.equals("Tasks/status"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetResourceProvider.WIDGET_METRICS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetInfo/metrics"+ "'", str0.equals("WidgetInfo/metrics"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    org.apache.ambari.server.orm.entities.HostGroupConfigEntityPK hostGroupConfigEntityPK0 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntityPK();
    java.lang.String str1 = hostGroupConfigEntityPK0.getHostGroupName();
    java.lang.String str2 = hostGroupConfigEntityPK0.getBlueprintName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.INCLUDE_AMBARI_IDENTITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "include_ambari_identity"+ "'", str0.equals("include_ambari_identity"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    int i5 = postRequest4.getAPIVersion();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,org.apache.ambari.server.controller.spi.TemporalInfo> map_str_temporalInfo6 = postRequest4.getFields();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentProcessResourceProvider.HC_PROCESS_HOST_NAME_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostComponentProcess/host_name"+ "'", str0.equals("HostComponentProcess/host_name"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.MYSQL_JDBC_URL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mysql_jdbc_url"+ "'", str0.equals("mysql_jdbc_url"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity0 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization1 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization2 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_ALERTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization3 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS;
    java.lang.String str4 = roleAuthorization3.getId();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization5 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_ALERTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization6 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS;
    java.lang.String str7 = roleAuthorization6.getId();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization8 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization9 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STACK_DETAILS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization10 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization11 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization12 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_ALERTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array13 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization1, roleAuthorization2, roleAuthorization3, roleAuthorization5, roleAuthorization6, roleAuthorization8, roleAuthorization9, roleAuthorization10, roleAuthorization11, roleAuthorization12 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization14 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization14, roleAuthorization_array13);
    org.apache.ambari.server.controller.spi.Resource.Type type16 = null;
    java.util.Set<java.lang.String> set_str17 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str18 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str17);
    org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException19 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type16, set_str18);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str20 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.keyPropertyIds;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController21 = null;
    org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider22 = new org.apache.ambari.server.controller.internal.ActionResourceProvider(set_str18, map_type_str20, ambariManagementController21);
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization23 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization24 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization25 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization26 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization27 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization28 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array29 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization23, roleAuthorization24, roleAuthorization25, roleAuthorization26, roleAuthorization27, roleAuthorization28 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization30 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization30, roleAuthorization_array29);
    actionResourceProvider22.setRequiredUpdateAuthorizations((java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization30);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyAuthorization(alertDefinitionEntity0, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization14, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization30, "cardinality");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + roleAuthorization1 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA + "'", roleAuthorization1.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA));
    org.junit.Assert.assertTrue("'" + roleAuthorization2 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_ALERTS + "'", roleAuthorization2.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_ALERTS));
    org.junit.Assert.assertTrue("'" + roleAuthorization3 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS + "'", roleAuthorization3.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AMBARI.MANAGE_USERS"+ "'", str4.equals("AMBARI.MANAGE_USERS"));
    org.junit.Assert.assertTrue("'" + roleAuthorization5 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_ALERTS + "'", roleAuthorization5.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_ALERTS));
    org.junit.Assert.assertTrue("'" + roleAuthorization6 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS + "'", roleAuthorization6.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "AMBARI.MANAGE_USERS"+ "'", str7.equals("AMBARI.MANAGE_USERS"));
    org.junit.Assert.assertTrue("'" + roleAuthorization8 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS + "'", roleAuthorization8.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS));
    org.junit.Assert.assertTrue("'" + roleAuthorization9 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STACK_DETAILS + "'", roleAuthorization9.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STACK_DETAILS));
    org.junit.Assert.assertTrue("'" + roleAuthorization10 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS + "'", roleAuthorization10.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS));
    org.junit.Assert.assertTrue("'" + roleAuthorization11 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization11.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));
    org.junit.Assert.assertTrue("'" + roleAuthorization12 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_ALERTS + "'", roleAuthorization12.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_ALERTS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str20);
    org.junit.Assert.assertTrue("'" + roleAuthorization23 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK + "'", roleAuthorization23.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK));
    org.junit.Assert.assertTrue("'" + roleAuthorization24 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS + "'", roleAuthorization24.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS));
    org.junit.Assert.assertTrue("'" + roleAuthorization25 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS + "'", roleAuthorization25.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS));
    org.junit.Assert.assertTrue("'" + roleAuthorization26 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization26.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));
    org.junit.Assert.assertTrue("'" + roleAuthorization27 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK + "'", roleAuthorization27.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK));
    org.junit.Assert.assertTrue("'" + roleAuthorization28 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA + "'", roleAuthorization28.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str2 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str1);
    org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException3 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type0, set_str2);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str4 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.keyPropertyIds;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController5 = null;
    org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider6 = new org.apache.ambari.server.controller.internal.ActionResourceProvider(set_str2, map_type_str4, ambariManagementController5);
    java.util.Set<java.lang.String> set_str7 = actionResourceProvider6.getPKPropertyIds();
    java.util.Set<java.lang.String> set_str8 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str9 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str8);
    org.apache.ambari.server.controller.spi.Request request10 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus11 = actionResourceProvider6.createResources(request10);
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
    org.junit.Assert.assertNotNull(set_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request10);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    org.apache.ambari.server.controller.internal.PermissionResourceProvider permissionResourceProvider0 = new org.apache.ambari.server.controller.internal.PermissionResourceProvider();

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.closeConnection();

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

    org.apache.ambari.server.state.stack.upgrade.StartGrouping startGrouping0 = new org.apache.ambari.server.state.stack.upgrade.StartGrouping();
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler1 = null;
    startGrouping0.parallelScheduler = parallelScheduler1;

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

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
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController29 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider30 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController29);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str31 = ldapSyncEventResourceProvider30.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController32 = null;
    org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider rootServiceHostComponentResourceProvider33 = new org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str19, map_type_str31, ambariManagementController32);
    org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.propertyIds = linkedhashset_str19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str31);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException2 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException();
    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException3 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("blueprint_name", (java.lang.Throwable)kerberosMissingAdminCredentialsException2);
    org.apache.ambari.server.view.IllegalClusterException illegalClusterException4 = new org.apache.ambari.server.view.IllegalClusterException((java.lang.Throwable)kerberosPrincipalAlreadyExistsException3);
    org.apache.ambari.server.AmbariException ambariException5 = new org.apache.ambari.server.AmbariException("StackConfigurations/final", (java.lang.Throwable)illegalClusterException4);
    org.apache.ambari.server.api.services.parsers.BodyParseException bodyParseException6 = new org.apache.ambari.server.api.services.parsers.BodyParseException((java.lang.Exception)ambariException5);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    org.apache.ambari.server.stack.ConfigurationInfo.Supports supports0 = org.apache.ambari.server.stack.ConfigurationInfo.Supports.ADDING_FORBIDDEN;
    org.junit.Assert.assertTrue("'" + supports0 + "' != '" + org.apache.ambari.server.stack.ConfigurationInfo.Supports.ADDING_FORBIDDEN + "'", supports0.equals(org.apache.ambari.server.stack.ConfigurationInfo.Supports.ADDING_FORBIDDEN));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type0 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RESTART;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RESTART + "'", type0.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RESTART));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    org.apache.ambari.server.controller.AlertNoticeRequest alertNoticeRequest0 = new org.apache.ambari.server.controller.AlertNoticeRequest();
    org.apache.ambari.server.controller.spi.PageRequest pageRequest1 = alertNoticeRequest0.Pagination;
    org.apache.ambari.server.controller.spi.Predicate predicate2 = alertNoticeRequest0.Predicate;
    org.apache.ambari.server.controller.spi.PageRequest pageRequest3 = null;
    alertNoticeRequest0.Pagination = pageRequest3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(pageRequest1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate2);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    org.apache.ambari.server.api.resources.UpgradeResourceDefinition.DOWNGRADE_DIRECTIVE = "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}";

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.WIDGETLAYOUT_USERNAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/user_name"+ "'", str0.equals("WidgetLayoutInfo/user_name"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

    java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.DIRECTIVE_FORCE_TOGGLE_KERBEROS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "force_toggle_kerberos"+ "'", str0.equals("force_toggle_kerberos"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler aDKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler();
    // The following exception was thrown during execution in test generation
    try {
    boolean b2 = aDKerberosOperationHandler0.removePrincipal("hostRoleCommandStatusCacheExpiryDurationMins");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosOperationException");
    } catch (org.apache.ambari.server.serveraction.kerberos.KerberosOperationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.PARAMETER_KEY_VALUE_PAIRS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configure-task-key-value-pairs"+ "'", str0.equals("configure-task-key-value-pairs"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.PHOENIX_QUERY_KEEPALIVE_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "phoenix.query.keepAliveMs"+ "'", str0.equals("phoenix.query.keepAliveMs"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationDependencyResourceProvider.PROPERTY_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurationDependency/property_name"+ "'", str0.equals("StackConfigurationDependency/property_name"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_INSTALL;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_INSTALL + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_INSTALL));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_SYCN_GROUP_MEMBER_REPLACE_PATTERN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.HOSTGROUP_HOSTS_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hosts"+ "'", str0.equals("hosts"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }

    java.util.concurrent.TimeUnit timeUnit3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.utilities.ScalingThreadPoolExecutor scalingThreadPoolExecutor5 = new org.apache.ambari.server.controller.utilities.ScalingThreadPoolExecutor((int)'4', (int)(short)-1, (long)' ', timeUnit3, 5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }

    int i0 = org.apache.ambari.server.view.ViewDirectoryWatcher.FIXED_FILE_COUNTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 30);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }

    org.apache.ambari.server.stack.StackManager.PATH_DELIMITER = "alerts.json";

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }

    org.apache.ambari.server.stack.ExtensionHelper extensionHelper0 = new org.apache.ambari.server.stack.ExtensionHelper();

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }

    org.apache.ambari.server.utils.DateUtils dateUtils0 = new org.apache.ambari.server.utils.DateUtils();

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    java.io.File file3 = configuration0.getRecommendationsDir();
    java.lang.String str4 = configuration0.getViewsStrictTransportSecurityHTTPResponseHeader();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "max-age=31536000"+ "'", str4.equals("max-age=31536000"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }

    org.apache.ambari.server.api.services.HostComponentService hostComponentService2 = new org.apache.ambari.server.api.services.HostComponentService("manage_identities", "service_name");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = hostComponentService2.createHostComponent("hostRoleCommandStatusCacheExpiryDurationMins", httpHeaders4, uriInfo5, "Tasks/custom_command_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }

    org.apache.ambari.server.topology.TopologyRequest topologyRequest1 = null;
    org.apache.ambari.server.topology.PersistedTopologyRequest persistedTopologyRequest2 = new org.apache.ambari.server.topology.PersistedTopologyRequest((long)(byte)-1, topologyRequest1);
    long long3 = persistedTopologyRequest2.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }

    org.apache.ambari.server.state.State state0 = org.apache.ambari.server.state.State.UNKNOWN;
    boolean b1 = state0.isValidDesiredState();
    org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.apache.ambari.server.state.State.UNKNOWN + "'", state0.equals(org.apache.ambari.server.state.State.UNKNOWN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_DN_ATTRIBUTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PrivilegeResourceProvider.PRINCIPAL_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/principal_name"+ "'", str0.equals("PrivilegeInfo/principal_name"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    org.apache.ambari.server.state.StackId stackId2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.ambari.server.orm.entities.HostVersionEntity> list_hostVersionEntity4 = hostVersionDAO0.findByClusterStackAndVersion("StackConfigurationDependency/dependency_name", stackId2, "type");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.AMBARI_ALERT_DEFINITION_ID_OID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.1"+ "'", str0.equals("1.3.6.1.4.1.18060.16.1.1.1.1"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }

    org.apache.ambari.server.orm.dao.TopologyHostGroupDAO topologyHostGroupDAO0 = new org.apache.ambari.server.orm.dao.TopologyHostGroupDAO();
    org.apache.ambari.server.orm.entities.TopologyHostGroupEntity topologyHostGroupEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    topologyHostGroupDAO0.create(topologyHostGroupEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewURLResourceProvider.VIEW_INSTANCE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewUrlInfo/view_instance_name"+ "'", str0.equals("ViewUrlInfo/view_instance_name"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }

    org.apache.ambari.server.hooks.users.UserHookParams userHookParams0 = org.apache.ambari.server.hooks.users.UserHookParams.CMD_HDFS_PRINCIPAL;
    org.junit.Assert.assertTrue("'" + userHookParams0 + "' != '" + org.apache.ambari.server.hooks.users.UserHookParams.CMD_HDFS_PRINCIPAL + "'", userHookParams0.equals(org.apache.ambari.server.hooks.users.UserHookParams.CMD_HDFS_PRINCIPAL));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }

    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.controller.metrics.MetricsServiceProvider.MetricsService metricsService2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = defaultProviderModule0.getCollectorHostName("Alert/text", metricsService2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_PROPERTIES_PREFIX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "server.jdbc.properties."+ "'", str0.equals("server.jdbc.properties."));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }

    java.lang.String str0 = org.apache.ambari.server.orm.dao.HostRoleCommandDAO.HRC_STATUS_SUMMARY_CACHE_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hostRoleCommandStatusSummaryCacheEnabled"+ "'", str0.equals("hostRoleCommandStatusSummaryCacheEnabled"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_HDP_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/hdp_version"+ "'", str0.equals("HostRoles/hdp_version"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }

    org.apache.ambari.server.controller.utilities.DatabaseChecker databaseChecker0 = new org.apache.ambari.server.controller.utilities.DatabaseChecker();

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.WIDGETLAYOUT_WIDGETS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/widgets"+ "'", str0.equals("WidgetLayoutInfo/widgets"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }

    org.apache.ambari.server.api.services.HostComponentService hostComponentService2 = new org.apache.ambari.server.api.services.HostComponentService("manage_identities", "service_name");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = hostComponentService2.updateHostComponent("timeline.metrics.service.webapp.address", httpHeaders4, uriInfo5, "stack_tools");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertCurrentEntity,org.apache.ambari.server.orm.entities.AlertDefinitionEntity> singularattribute_alertCurrentEntity_alertDefinitionEntity0 = org.apache.ambari.server.orm.entities.AlertCurrentEntity_.alertDefinition;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertCurrentEntity_alertDefinitionEntity0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackServiceResourceProvider.STACK_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackServices/stack_version"+ "'", str0.equals("StackServices/stack_version"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }

    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    serviceComponentDesiredStateDAO0.remove(serviceComponentDesiredStateEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }

    org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteChecks prerequisiteChecks0 = new org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteChecks();
    org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteCheckConfig prerequisiteCheckConfig1 = prerequisiteChecks0.configuration;
    org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteCheckConfig prerequisiteCheckConfig2 = null;
    prerequisiteChecks0.configuration = prerequisiteCheckConfig2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(prerequisiteCheckConfig1);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }

    java.lang.String[] str_array76 = new java.lang.String[] { "Hosts/last_registration_time", "ERROR", "notification.dispatch.alert.script", "AlertTarget/name", "Upgrade/abort_reason", "Event/summary/memberships/removed", "timeline.metrics.host.aggregator.ttl", "stack_name", "StackLevelConfigurations/type", "javax.net.ssl.trustStore", "configure-task-key-value-pairs", "ambari.dispatch.snmp.oids.body", "ambari_db_rca_password", "ViewInstanceInfo/cluster_handle", "ViewInstanceInfo/view_name", "hi!", "Repositories/latest_base_url", "Users/user_name", "RootServiceComponents/service_name", "recovery_settings", "StackLevelConfigurations/property_value_attributes", "RootServiceComponents/service_name", "AlertNotice/target_id", "RepositoryVersions/display_name", "Hosts/maintenance_state", "RootServiceComponents/service_name", "StackConfigurations/property_value_attributes", "ambari_db_rca_password", "Actions/target_service", "AlertHistory/definition_name", "Request_Info/asc_order", "jdbc:derby:memory:myDB/ambari;create=true", "yarn.scheduler.capacity.root", "java_version", "ViewInstanceInfo/cluster_handle", "alerts.json", "ambari.dispatch.snmp.oids.body", "ViewVersionInfo/min_ambari_version", "notification.dispatch.alert.script", "type", "yarn.scheduler.capacity.root.queues", "ViewInstanceInfo/icon64_path", "StackLevelConfigurations/property_value_attributes", "PrivilegeInfo/principal_type", "desired_version", "Executing", "org.apache.derby.jdbc.EmbeddedDriver", "alerts.json", "recovery_settings", "UpgradeChecks/id", "PrivilegeInfo/principal_type", "RepositoryVersions/display_name", "Alert/component_name", "Users/user_type", "WidgetLayoutInfo/section_name", "Hosts/rack_info", "cluster-env", "blueprint_name", "ambari.dispatch.snmp.oids.body", "Tasks/id", "configure-task-key-value-pairs", "FALCON_SERVICE_CHECK", "host_predicate", "ViewUrlInfo/url_name", "max_duration_for_retries", "RootServiceHostComponents/service_name", "Users/user_name", "Requests/request_schedule/schedule_id", "Executing", "javax.net.ssl.trustStore", "UpgradeChecks/id", "max_duration_for_retries", "org.apache.derby.jdbc.EmbeddedDriver", "VersionDefinition/stack_name", "ambari-server", "manage_identities" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str77 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str77, str_array76);
    org.apache.ambari.server.controller.RequestsByStatusesRequest requestsByStatusesRequest79 = new org.apache.ambari.server.controller.RequestsByStatusesRequest((java.util.Set<java.lang.String>)linkedhashset_str77);
    java.util.Set<java.lang.String> set_str80 = requestsByStatusesRequest79.getStatuses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str80);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }

    org.apache.ambari.server.StateRecoveryManager stateRecoveryManager0 = new org.apache.ambari.server.StateRecoveryManager();

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }

    org.apache.ambari.server.actionmanager.ActionType actionType1 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType6 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array8 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization9 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9, roleAuthorization_array8);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition11 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType1, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType6, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9);
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider14 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization15 = groupPrivilegeResourceProvider14.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization16 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array17 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization16 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization18 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization18, roleAuthorization_array17);
    boolean b20 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization15, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization18);
    actionDefinition11.setPermissions((java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization18);
    actionDefinition11.setInputs("Stage/command_params");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.ActionResponse actionResponse24 = actionDefinition11.convertToResponse();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization15);
    org.junit.Assert.assertTrue("'" + roleAuthorization16 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization16.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_SETTINGS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_SETTINGS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_SETTINGS));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }

    org.apache.ambari.server.agent.RecoveryReport recoveryReport0 = new org.apache.ambari.server.agent.RecoveryReport();
    java.lang.String str1 = recoveryReport0.toString();
    java.lang.String str2 = recoveryReport0.getSummary();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RecoveryReport{summary='DISABLED', component_reports='[]'}"+ "'", str1.equals("RecoveryReport{summary='DISABLED', component_reports='[]'}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "DISABLED"+ "'", str2.equals("DISABLED"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }

    java.lang.String str0 = org.apache.ambari.server.stack.StackManager.PATH_DELIMITER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "alerts.json"+ "'", str0.equals("alerts.json"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }

    org.apache.ambari.server.api.resources.FeedResourceDefinition feedResourceDefinition0 = new org.apache.ambari.server.api.resources.FeedResourceDefinition();

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }

    org.apache.ambari.server.utils.HTTPUtils hTTPUtils0 = new org.apache.ambari.server.utils.HTTPUtils();

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.String> singularattribute_alertHistoryEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertText = singularattribute_alertHistoryEntity_str0;

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }

    org.apache.ambari.server.topology.AmbariContext ambariContext0 = null;
    org.apache.ambari.server.topology.TopologyRequest topologyRequest1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.ClusterTopologyImpl clusterTopologyImpl2 = new org.apache.ambari.server.topology.ClusterTopologyImpl(ambariContext0, topologyRequest1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceResourceProvider.SERVICE_CREDENTIAL_STORE_ENABLED_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ServiceInfo/credential_store_enabled"+ "'", str0.equals("ServiceInfo/credential_store_enabled"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }

    org.apache.ambari.server.orm.JPATableGenerationStrategy jPATableGenerationStrategy0 = org.apache.ambari.server.orm.JPATableGenerationStrategy.CREATE;
    org.junit.Assert.assertTrue("'" + jPATableGenerationStrategy0 + "' != '" + org.apache.ambari.server.orm.JPATableGenerationStrategy.CREATE + "'", jPATableGenerationStrategy0.equals(org.apache.ambari.server.orm.JPATableGenerationStrategy.CREATE));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.Integer> singularattribute_alertDefinitionEntity_i0 = null;
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.scheduleInterval = singularattribute_alertDefinitionEntity_i0;

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }

    org.apache.ambari.server.api.query.render.MinimalRenderer minimalRenderer0 = new org.apache.ambari.server.api.query.render.MinimalRenderer();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance4 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest5 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders1, requestBody2, uriInfo3, resourceInstance4);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.services.ResultPostProcessor resultPostProcessor6 = minimalRenderer0.getResultPostProcessor((org.apache.ambari.server.api.services.Request)postRequest5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    java.lang.String str13 = stackConfigurationResponse12.getPropertyDescription();
    java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo> set_propertyDependencyInfo14 = stackConfigurationResponse12.getDependsOnProperties();
    stackConfigurationResponse12.setPropertyValue("ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Hosts/last_registration_time"+ "'", str13.equals("Hosts/last_registration_time"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_propertyDependencyInfo14);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.IDENTITY_FILTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "identity_filter"+ "'", str0.equals("identity_filter"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }

    org.apache.ambari.server.orm.dao.StackDAO stackDAO0 = new org.apache.ambari.server.orm.dao.StackDAO();
    org.apache.ambari.server.orm.entities.StackEntity stackEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    stackDAO0.createOrUpdate(stackEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }

    org.apache.ambari.server.api.predicate.operators.OrOperator orOperator1 = new org.apache.ambari.server.api.predicate.operators.OrOperator(25);
    org.apache.ambari.server.api.predicate.operators.Operator.TYPE tYPE2 = orOperator1.getType();
    org.junit.Assert.assertTrue("'" + tYPE2 + "' != '" + org.apache.ambari.server.api.predicate.operators.Operator.TYPE.OR + "'", tYPE2.equals(org.apache.ambari.server.api.predicate.operators.Operator.TYPE.OR));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.STACK_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "QuickLinkInfo/stack_version"+ "'", str0.equals("QuickLinkInfo/stack_version"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }

    org.apache.ambari.server.api.resources.UpgradeResourceDefinition.SKIP_SERVICE_CHECKS_DIRECTIVE = "Hosts/maintenance_state";

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserResourceProvider.USER_PASSWORD_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Users/password"+ "'", str0.equals("Users/password"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SECONDARY_NAMENODE_MUST_BE_DELETED;
    org.apache.ambari.server.checks.CheckDescription.CLIENT_RETRY = checkDescription0;
    org.apache.ambari.server.checks.CheckDescription.HOSTS_MASTER_MAINTENANCE = checkDescription0;
    org.apache.ambari.server.checks.CheckDescription.CLIENT_RETRY = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.Long> singularattribute_hostEntity_long0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.hostId = singularattribute_hostEntity_long0;

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }

    org.apache.ambari.server.state.PropertyUpgradeBehavior propertyUpgradeBehavior0 = new org.apache.ambari.server.state.PropertyUpgradeBehavior();
    propertyUpgradeBehavior0.setDelete(false);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_SUCCEEDED;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_SUCCEEDED + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_SUCCEEDED));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosOperationException kerberosOperationException1 = new org.apache.ambari.server.serveraction.kerberos.KerberosOperationException("Upgrade/abort_reason");

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }

    org.apache.ambari.server.topology.NoSuchHostGroupException noSuchHostGroupException1 = new org.apache.ambari.server.topology.NoSuchHostGroupException("blueprint");

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider.COMPONENT_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceHostComponents/component_version"+ "'", str0.equals("RootServiceHostComponents/component_version"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.discoveryStatus = singularattribute_hostEntity_str0;

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.ROLLING_UPGRADE_SKIP_PACKAGES_PREFIXES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }

    org.apache.ambari.server.orm.entities.BlueprintConfigEntityPK blueprintConfigEntityPK0 = new org.apache.ambari.server.orm.entities.BlueprintConfigEntityPK();

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }

    org.apache.ambari.server.controller.StackVersionRequest stackVersionRequest2 = new org.apache.ambari.server.controller.StackVersionRequest("FilterOperator", "Clusters/desired_configs");

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.OperatingSystemResourceProvider.OPERATING_SYSTEM_VERSION_DEFINITION_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OperatingSystems/version_definition_id"+ "'", str0.equals("OperatingSystems/version_definition_id"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.controller.ivory.Feed feed20 = new org.apache.ambari.server.controller.ivory.Feed("AlertTarget/notification_type", "Stage/command_params", "Alert/host_name", "extensions", "desired_version", "TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", "ERROR", "ViewInstanceInfo/cluster_handle", "", "AlertTarget/notification_type", "Theme", "Stage/host_params", "AlertHistory/id", "Versions/stack-errors", map_str_str19);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = org.apache.ambari.server.upgrade.SchemaUpgradeUtil.extractProperty("HostRoles/stale_configs", "HostRoles/state", "default_realm", "ViewInstanceInfo/view_name:type", "hbase.coprocessor.regionserver.classes", map_str_str19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }

    org.apache.ambari.server.state.theme.Widget widget0 = new org.apache.ambari.server.state.theme.Widget();
    org.apache.ambari.server.state.theme.Unit[] unit_array1 = new org.apache.ambari.server.state.theme.Unit[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.theme.Unit> arraylist_unit2 = new java.util.ArrayList<org.apache.ambari.server.state.theme.Unit>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.theme.Unit>)arraylist_unit2, unit_array1);
    widget0.setUnits((java.util.List<org.apache.ambari.server.state.theme.Unit>)arraylist_unit2);
    java.lang.String str5 = widget0.getDisplayName();
    org.apache.ambari.server.state.theme.Unit[] unit_array6 = new org.apache.ambari.server.state.theme.Unit[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.theme.Unit> arraylist_unit7 = new java.util.ArrayList<org.apache.ambari.server.state.theme.Unit>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.theme.Unit>)arraylist_unit7, unit_array6);
    widget0.setUnits((java.util.List<org.apache.ambari.server.state.theme.Unit>)arraylist_unit7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unit_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unit_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_GROUP_NAMING_ATTR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }

    com.google.gson.Gson gson0 = null;
    org.apache.ambari.server.utils.StageUtils.setGson(gson0);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }

    com.google.common.base.Function<org.apache.ambari.server.state.RepositoryInfo,java.lang.String> function_repositoryInfo_str0 = org.apache.ambari.server.state.RepositoryInfo.GET_REPO_ID_FUNCTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(function_repositoryInfo_str0);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }

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
    org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.propertyIds = linkedhashset_str19;
    org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.pkPropertyIds = linkedhashset_str19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.COMPONENT_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "name"+ "'", str0.equals("name"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }

    org.apache.ambari.server.state.Clusters clusters0 = null;
    org.apache.ambari.server.state.StackInfo stackInfo1 = null;
    org.apache.ambari.server.state.ExtensionInfo extensionInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.ExtensionHelper.validateDeleteLink(clusters0, stackInfo1, extensionInfo2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException3 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException();
    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException4 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("blueprint_name", (java.lang.Throwable)kerberosMissingAdminCredentialsException3);
    org.apache.ambari.server.view.IllegalClusterException illegalClusterException5 = new org.apache.ambari.server.view.IllegalClusterException((java.lang.Throwable)kerberosPrincipalAlreadyExistsException4);
    org.apache.ambari.server.AmbariException ambariException6 = new org.apache.ambari.server.AmbariException("StackConfigurations/final", (java.lang.Throwable)illegalClusterException5);
    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException7 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException("Stage/host_params", (java.lang.Throwable)ambariException6);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }

    org.apache.ambari.server.api.services.SettingService settingService0 = new org.apache.ambari.server.api.services.SettingService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = settingService0.createSetting("AuthorizationInfo/cluster_name", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.PROPERTY_DESCRIPTION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/property_description"+ "'", str0.equals("StackConfigurations/property_description"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }

    org.apache.ambari.server.api.services.ClusterKerberosDescriptorService clusterKerberosDescriptorService1 = new org.apache.ambari.server.api.services.ClusterKerberosDescriptorService("StackLevelConfigurations/type");
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = clusterKerberosDescriptorService1.getKerberosDescriptor(httpHeaders2, uriInfo3, "extensions");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }

    org.apache.ambari.server.orm.dao.RoleSuccessCriteriaDAO roleSuccessCriteriaDAO0 = new org.apache.ambari.server.orm.dao.RoleSuccessCriteriaDAO();
    org.apache.ambari.server.orm.entities.RoleSuccessCriteriaEntityPK roleSuccessCriteriaEntityPK1 = null;
    // The following exception was thrown during execution in test generation
    try {
    roleSuccessCriteriaDAO0.removeByPK(roleSuccessCriteriaEntityPK1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    java.lang.String str1 = serviceCheckGrouping0.title;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    java.lang.String str3 = configuration0.getRecommendationsArtifactsLifetime();
    // The following exception was thrown during execution in test generation
    try {
    com.google.gson.JsonObject jsonObject5 = configuration0.getHostChangesJson("Requests/request_schedule/schedule_id");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1w"+ "'", str3.equals("1w"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }

    org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider viewPermissionResourceProvider0 = new org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider();
    java.util.Set<java.lang.String> set_str1 = viewPermissionResourceProvider0.getCategoryIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider3 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController2);
    org.apache.ambari.server.controller.spi.Request request4 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate5 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus6 = widgetResourceProvider3.deleteResources(request4, predicate5);
    java.util.Set<java.lang.String> set_str7 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str8 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str7);
    org.apache.ambari.server.controller.spi.Request request9 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str7);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus10 = widgetResourceProvider3.createResources(request9);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus11 = viewPermissionResourceProvider0.createResources(request9);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus10);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }

    org.apache.ambari.server.state.ServiceComponentHost serviceComponentHost0 = null;
    org.apache.ambari.server.state.State state1 = org.apache.ambari.server.state.State.INSTALLING;
    org.apache.ambari.server.state.State state2 = org.apache.ambari.server.state.State.STOPPING;
    org.apache.ambari.server.state.State state3 = org.apache.ambari.server.state.State.UNINSTALLED;
    boolean b4 = org.apache.ambari.server.state.State.isValidStateTransition(state2, state3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.State.checkUpdateConfiguration(serviceComponentHost0, state1, state2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + state1 + "' != '" + org.apache.ambari.server.state.State.INSTALLING + "'", state1.equals(org.apache.ambari.server.state.State.INSTALLING));
    org.junit.Assert.assertTrue("'" + state2 + "' != '" + org.apache.ambari.server.state.State.STOPPING + "'", state2.equals(org.apache.ambari.server.state.State.STOPPING));
    org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.apache.ambari.server.state.State.UNINSTALLED + "'", state3.equals(org.apache.ambari.server.state.State.UNINSTALLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.QUICKLINK_FILE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "QuickLinkInfo/file_name"+ "'", str0.equals("QuickLinkInfo/file_name"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }

    org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.PrincipalType principalType0 = org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.PrincipalType.GROUPS;
    org.junit.Assert.assertTrue("'" + principalType0 + "' != '" + org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.PrincipalType.GROUPS + "'", principalType0.equals(org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.PrincipalType.GROUPS));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HCAT_SERVICE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent serviceComponentHostUninstallEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent("requestschedule", "Upgrade/abort_reason", (long)(short)0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.TIMELINE_METRICS_CACHE_USE_CUSTOM_SIZING_ENGINE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionLinkResourceProvider.EXTENSION_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ExtensionLink/extension_version"+ "'", str0.equals("ExtensionLink/extension_version"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_VERSION_FILE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }

    org.apache.ambari.server.orm.entities.ViewInstancePropertyEntityPK viewInstancePropertyEntityPK0 = new org.apache.ambari.server.orm.entities.ViewInstancePropertyEntityPK();
    viewInstancePropertyEntityPK0.setViewName("ViewUrlInfo/view_instance_version");
    viewInstancePropertyEntityPK0.setName("Versions/parent_extension_version");

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertNoticeEntity,org.apache.ambari.server.orm.entities.AlertTargetEntity> singularattribute_alertNoticeEntity_alertTargetEntity0 = org.apache.ambari.server.orm.entities.AlertNoticeEntity_.alertTarget;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertNoticeEntity_alertTargetEntity0);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestOperationLevel.OPERATION_CLUSTER_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operation_level/cluster_name"+ "'", str0.equals("operation_level/cluster_name"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.HTTP_ONLY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HTTP_ONLY"+ "'", str0.equals("HTTP_ONLY"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,java.lang.Long> singularattribute_stageEntity_long0 = org.apache.ambari.server.orm.entities.StageEntity_.clusterId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stageEntity_long0);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }

    java.util.Map<java.lang.String,java.lang.Object> map_str_obj0 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str15 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.controller.ivory.Feed feed16 = new org.apache.ambari.server.controller.ivory.Feed("AlertTarget/notification_type", "Stage/command_params", "Alert/host_name", "extensions", "desired_version", "TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", "ERROR", "ViewInstanceInfo/cluster_handle", "", "AlertTarget/notification_type", "Theme", "Stage/host_params", "AlertHistory/id", "Versions/stack-errors", map_str_str15);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.Request request17 = org.apache.ambari.server.controller.utilities.PropertyHelper.getUpdateRequest(map_str_obj0, map_str_str15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str15);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }

    org.apache.ambari.server.audit.request.eventcreator.BlueprintExportEventCreator blueprintExportEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.BlueprintExportEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type1 = blueprintExportEventCreator0.getResourceTypes();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS2 = blueprintExportEventCreator0.getResultStatuses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS2);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.STACK_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ThemeInfo/stack_version"+ "'", str0.equals("ThemeInfo/stack_version"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }

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
    java.util.Map<java.lang.String,org.apache.ambari.server.api.resources.ResourceInstance> map_str_resourceInstance36 = queryImpl35.getSubResources();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_resourceInstance36);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = mySqlHelper1.getDropTableStatement("sqlserver");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog240 upgradeCatalog2401 = new org.apache.ambari.server.upgrade.UpgradeCatalog240(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }

    org.apache.ambari.server.state.RepositoryType repositoryType0 = org.apache.ambari.server.state.RepositoryType.PATCH;
    org.junit.Assert.assertTrue("'" + repositoryType0 + "' != '" + org.apache.ambari.server.state.RepositoryType.PATCH + "'", repositoryType0.equals(org.apache.ambari.server.state.RepositoryType.PATCH));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_SET_SERVICE_USERS_GROUPS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_SET_SERVICE_USERS_GROUPS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_SET_SERVICE_USERS_GROUPS));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }

    org.apache.ambari.server.api.services.TaskService taskService3 = new org.apache.ambari.server.api.services.TaskService("timeline.metrics.host.aggregator.ttl", "sqlserver", "UpgradeItem/request_id");

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_COMMAND_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/command"+ "'", str0.equals("Tasks/command"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }

    org.apache.ambari.server.state.alert.SourceType sourceType0 = org.apache.ambari.server.state.alert.SourceType.AMS;
    org.junit.Assert.assertTrue("'" + sourceType0 + "' != '" + org.apache.ambari.server.state.alert.SourceType.AMS + "'", sourceType0.equals(org.apache.ambari.server.state.alert.SourceType.AMS));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.repository.VersionDefinitionXml versionDefinitionXml1 = org.apache.ambari.server.state.repository.VersionDefinitionXml.load("Alert/component_name");
      org.junit.Assert.fail("Expected exception of type javax.xml.stream.XMLStreamException");
    } catch (javax.xml.stream.XMLStreamException e) {
      // Expected exception.
    }

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }

    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder1 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance5 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest6 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders2, requestBody3, uriInfo4, resourceInstance5);
    int i7 = postRequest6.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type8 = postRequest6.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder9 = addUserToGroupRequestAuditEventBuilder1.withRequestType(type8);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder10 = deleteRepositoryVersionAuditEventBuilder0.withRequestType(type8);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder12 = deleteRepositoryVersionAuditEventBuilder10.withOperation("requestschedule");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type8.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder12);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.SECONDARY_NAMENODE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }

    org.apache.ambari.server.controller.AuthToLocalBuilder authToLocalBuilder3 = new org.apache.ambari.server.controller.AuthToLocalBuilder("ViewUrlInfo/url_name", "hdfs-site", false);
    java.lang.String str4 = authToLocalBuilder3.generate();

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }

    com.google.inject.Injector injector0 = null;
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.setInjector(injector0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher.COMMUNITY_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch.snmp.community"+ "'", str0.equals("ambari.dispatch.snmp.community"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.OracleHelper oracleHelper1 = new org.apache.ambari.server.orm.helpers.dbms.OracleHelper(databasePlatform0);
    java.lang.StringBuilder stringBuilder2 = null;
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.StringBuilder stringBuilder6 = oracleHelper1.writeSetNullableString(stringBuilder2, "AlertNotice/target_id", dBColumnInfo4, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }

    org.apache.ambari.server.serveraction.upgrades.RangerKmsProxyConfig rangerKmsProxyConfig0 = new org.apache.ambari.server.serveraction.upgrades.RangerKmsProxyConfig();
    java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Object> concurrentmap_str_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.CommandReport commandReport2 = rangerKmsProxyConfig0.execute(concurrentmap_str_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.configuration.Configuration.DatabaseType databaseType6 = configuration0.getDatabaseType();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
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
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider.SUBRESOURCE_OPERATING_SYSTEMS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operating_systems"+ "'", str0.equals("operating_systems"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse8.setActionName("");
    java.lang.String str11 = actionResponse8.getDefaultTimeout();
    java.lang.String str12 = actionResponse8.getActionName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "alerts.json"+ "'", str11.equals("alerts.json"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }

    org.apache.ambari.server.stack.ExtensionDirectory extensionDirectory0 = null;
    org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO1 = null;
    org.apache.ambari.server.metadata.ActionMetadata actionMetadata2 = new org.apache.ambari.server.metadata.ActionMetadata();
    org.apache.ambari.server.state.stack.OsFamily osFamily3 = null;
    org.apache.ambari.server.stack.StackContext stackContext4 = new org.apache.ambari.server.stack.StackContext(metainfoDAO1, actionMetadata2, osFamily3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.ExtensionModule extensionModule5 = new org.apache.ambari.server.stack.ExtensionModule(extensionDirectory0, stackContext4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }

    org.apache.ambari.server.state.Clusters clusters0 = null;
    org.apache.ambari.server.agent.ActionQueue actionQueue1 = null;
    org.apache.ambari.server.actionmanager.ActionManager actionManager2 = null;
    com.google.inject.Injector injector3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.HeartBeatHandler heartBeatHandler4 = new org.apache.ambari.server.agent.HeartBeatHandler(clusters0, actionQueue1, actionManager2, injector3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_VIEW_CONFIGS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_VIEW_CONFIGS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_VIEW_CONFIGS));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetResourceProvider.WIDGET_VALUES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetInfo/values"+ "'", str0.equals("WidgetInfo/values"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }

    org.apache.ambari.server.serveraction.users.ShellCommandUtilityWrapper shellCommandUtilityWrapper0 = new org.apache.ambari.server.serveraction.users.ShellCommandUtilityWrapper();

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.STACK_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "QuickLinkInfo/stack_name"+ "'", str0.equals("QuickLinkInfo/stack_name"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }

    org.apache.ambari.server.checks.PreviousUpgradeCompleted previousUpgradeCompleted0 = new org.apache.ambari.server.checks.PreviousUpgradeCompleted();

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }

    org.apache.ambari.server.controller.utilities.ServiceCalculatedStateFactory serviceCalculatedStateFactory0 = new org.apache.ambari.server.controller.utilities.ServiceCalculatedStateFactory();

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }

    org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.SCOPE sCOPE0 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.SCOPE.USER;
    org.junit.Assert.assertTrue("'" + sCOPE0 + "' != '" + org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.SCOPE.USER + "'", sCOPE0.equals(org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.SCOPE.USER));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }

    int i0 = org.apache.ambari.server.security.SecurePasswordHelper.DEFAULT_SECURE_PASSWORD_MIN_DIGITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }

    org.apache.ambari.server.api.resources.ClusterResourceDefinition clusterResourceDefinition0 = new org.apache.ambari.server.api.resources.ClusterResourceDefinition();
    boolean b1 = clusterResourceDefinition0.isCreatable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }

    org.apache.ambari.server.state.action.ActionEventType actionEventType0 = org.apache.ambari.server.state.action.ActionEventType.ACTION_INIT;
    org.junit.Assert.assertTrue("'" + actionEventType0 + "' != '" + org.apache.ambari.server.state.action.ActionEventType.ACTION_INIT + "'", actionEventType0.equals(org.apache.ambari.server.state.action.ActionEventType.ACTION_INIT));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StageResourceProvider.STAGE_DISPLAY_STATUS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stage/display_status"+ "'", str0.equals("Stage/display_status"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = org.apache.ambari.server.orm.entities.HostEntity_.ipv4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_str0);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    boolean b1 = upgradePack0.isAllTarget();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo0 = new org.apache.ambari.server.state.ChangedConfigInfo();
    changedConfigInfo0.setOldValue("Upgrade/to_version");

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }

    org.apache.ambari.server.ObjectNotFoundException objectNotFoundException1 = new org.apache.ambari.server.ObjectNotFoundException("ViewInstanceInfo/icon64_path");

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_METRICS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_METRICS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_METRICS));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }

    org.apache.ambari.server.controller.spi.Predicate[] predicate_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate1 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }

    org.apache.ambari.server.orm.dao.WidgetDAO widgetDAO0 = new org.apache.ambari.server.orm.dao.WidgetDAO();
    org.apache.ambari.server.orm.entities.WidgetEntity widgetEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    widgetDAO0.create(widgetEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }

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
    org.apache.ambari.server.controller.spi.Resource.Type type36 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.Schema schema37 = clusterControllerImpl33.getSchema(type36);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }

    org.apache.ambari.server.customactions.ActionDefinitionXml actionDefinitionXml0 = new org.apache.ambari.server.customactions.ActionDefinitionXml();

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.PARAMETER_TRANSFERS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configure-task-transfers"+ "'", str0.equals("configure-task-transfers"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }

    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo0 = null;
    org.apache.ambari.server.orm.entities.HostEntity hostEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.svccomphost.ServiceComponentHostSummary serviceComponentHostSummary4 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostSummary(ambariMetaInfo0, hostEntity1, "", "StackConfigurationDependency/dependency_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }

    org.apache.ambari.server.agent.RecoveryReport recoveryReport0 = new org.apache.ambari.server.agent.RecoveryReport();
    org.apache.ambari.server.agent.ComponentRecoveryReport[] componentRecoveryReport_array1 = new org.apache.ambari.server.agent.ComponentRecoveryReport[] {  };
    java.util.ArrayList<org.apache.ambari.server.agent.ComponentRecoveryReport> arraylist_componentRecoveryReport2 = new java.util.ArrayList<org.apache.ambari.server.agent.ComponentRecoveryReport>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.agent.ComponentRecoveryReport>)arraylist_componentRecoveryReport2, componentRecoveryReport_array1);
    recoveryReport0.setComponentReports((java.util.List<org.apache.ambari.server.agent.ComponentRecoveryReport>)arraylist_componentRecoveryReport2);
    java.lang.String str5 = recoveryReport0.getSummary();
    java.lang.String str6 = recoveryReport0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentRecoveryReport_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "DISABLED"+ "'", str5.equals("DISABLED"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "RecoveryReport{summary='DISABLED', component_reports='[]'}"+ "'", str6.equals("RecoveryReport{summary='DISABLED', component_reports='[]'}"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }

    org.apache.ambari.server.api.services.ExtensionsService extensionsService0 = new org.apache.ambari.server.api.services.ExtensionsService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = extensionsService0.getExtensionVersionLinks("RecoveryReport{summary='DISABLED', component_reports='[]'}", httpHeaders2, uriInfo3, "_SERVICE_CHECK", "ambari_db_rca_username");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }

    org.apache.ambari.server.api.predicate.Token.TYPE tYPE0 = org.apache.ambari.server.api.predicate.Token.TYPE.PROPERTY_OPERAND;
    org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.ambari.server.api.predicate.Token.TYPE.PROPERTY_OPERAND + "'", tYPE0.equals(org.apache.ambari.server.api.predicate.Token.TYPE.PROPERTY_OPERAND));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }

    org.apache.ambari.server.controller.AlertNoticeRequest alertNoticeRequest0 = new org.apache.ambari.server.controller.AlertNoticeRequest();
    org.apache.ambari.server.controller.spi.PageRequest pageRequest1 = alertNoticeRequest0.Pagination;
    org.apache.ambari.server.controller.spi.Predicate predicate2 = alertNoticeRequest0.Predicate;
    org.apache.ambari.server.controller.spi.PageRequest pageRequest3 = alertNoticeRequest0.Pagination;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(pageRequest1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(pageRequest3);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ConfigGroupResourceProvider.CONFIGGROUP_CONFIGS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ConfigGroup/desired_configs"+ "'", str0.equals("ConfigGroup/desired_configs"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }

    java.lang.String str0 = org.apache.ambari.server.security.authorization.AuthorizationHelper.getAuthenticatedName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str0);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosConfigDataFile.OPERATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operation"+ "'", str0.equals("operation"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str4 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest5 = new org.apache.ambari.server.controller.ConfigurationRequest("", "Users/user_name", "CompatibleRepositoryVersions/stack_name", map_str_str3, map_str_map_str_str4);
    java.lang.String str6 = configurationRequest5.getVersionTag();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "CompatibleRepositoryVersions/stack_name"+ "'", str6.equals("CompatibleRepositoryVersions/stack_name"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.LOGSEARCH_PORTAL_CONNECT_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AlertScriptDispatcher.DISPATCH_PROPERTY_SCRIPT_CONFIG_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch-property.script"+ "'", str0.equals("ambari.dispatch-property.script"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.METRIC_RETRIEVAL_SERVICE_REQUEST_TTL_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }

    org.apache.ambari.server.checks.HostsHeartbeatCheck hostsHeartbeatCheck0 = new org.apache.ambari.server.checks.HostsHeartbeatCheck();

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }

    java.lang.String str0 = org.apache.ambari.server.agent.RecoveryConfigHelper.RECOVERY_MAX_COUNT_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "recovery_max_count"+ "'", str0.equals("recovery_max_count"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }

    org.apache.ambari.server.state.PropertyUpgradeBehavior propertyUpgradeBehavior0 = new org.apache.ambari.server.state.PropertyUpgradeBehavior();
    boolean b1 = propertyUpgradeBehavior0.isDelete();
    propertyUpgradeBehavior0.setAdd(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }

    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder();

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }

    org.apache.ambari.server.utils.JaxbMapKeyValAdapter jaxbMapKeyValAdapter0 = new org.apache.ambari.server.utils.JaxbMapKeyValAdapter();
    org.apache.ambari.server.utils.JaxbMapKeyVal jaxbMapKeyVal2 = null;
    org.apache.ambari.server.utils.JaxbMapKeyVal[] jaxbMapKeyVal_array3 = new org.apache.ambari.server.utils.JaxbMapKeyVal[] { jaxbMapKeyVal2 };
    org.apache.ambari.server.utils.JaxbMapKeyMap jaxbMapKeyMap4 = new org.apache.ambari.server.utils.JaxbMapKeyMap("UpgradeChecks/upgrade_pack", jaxbMapKeyVal_array3);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = jaxbMapKeyValAdapter0.unmarshal(jaxbMapKeyVal_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jaxbMapKeyVal_array3);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = null;
    org.apache.ambari.server.controller.HostComponentProcessResponse hostComponentProcessResponse4 = new org.apache.ambari.server.controller.HostComponentProcessResponse("WidgetLayoutInfo/section_name", "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", "ViewUrlInfo/url_name", map_str_str3);
    java.lang.String str5 = hostComponentProcessResponse4.getCluster();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "WidgetLayoutInfo/section_name"+ "'", str5.equals("WidgetLayoutInfo/section_name"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.HOSTGROUPS_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_groups"+ "'", str0.equals("host_groups"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }

    com.google.inject.persist.PersistService persistService0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.GuiceJpaInitializer guiceJpaInitializer1 = new org.apache.ambari.server.orm.GuiceJpaInitializer(persistService0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }

    org.apache.ambari.server.security.authorization.GroupType groupType0 = org.apache.ambari.server.security.authorization.GroupType.PAM;
    org.junit.Assert.assertTrue("'" + groupType0 + "' != '" + org.apache.ambari.server.security.authorization.GroupType.PAM + "'", groupType0.equals(org.apache.ambari.server.security.authorization.GroupType.PAM));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }

    org.apache.ambari.server.cleanup.CleanupDriver cleanupDriver0 = new org.apache.ambari.server.cleanup.CleanupDriver();

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }

    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type0 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper2 = null;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] taskWrapper_array3 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] { taskWrapper2 };
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper4 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type0, "WidgetLayoutInfo/section_name", taskWrapper_array3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = stageWrapper4.getTasksJson();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP + "'", type0.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(taskWrapper_array3);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }

    org.apache.ambari.server.checks.DatabaseConsistencyChecker.CheckHelperAuditModule checkHelperAuditModule0 = new org.apache.ambari.server.checks.DatabaseConsistencyChecker.CheckHelperAuditModule();

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.PrivilegeResourceDefinition privilegeResourceDefinition1 = new org.apache.ambari.server.api.resources.PrivilegeResourceDefinition(type0);
    java.lang.String str2 = privilegeResourceDefinition1.getSingularName();
    java.lang.String str3 = privilegeResourceDefinition1.getSingularName();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition4 = privilegeResourceDefinition1.getSubResourceDefinitions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "privilege"+ "'", str2.equals("privilege"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "privilege"+ "'", str3.equals("privilege"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition4);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.QUICKLINK_DEFAULT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "QuickLinkInfo/default"+ "'", str0.equals("QuickLinkInfo/default"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }

    org.apache.hadoop.metrics2.sink.timeline.TimelineMetric timelineMetric0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.MetricReportingAdapter metricReportingAdapter1 = new org.apache.ambari.server.controller.metrics.MetricReportingAdapter(timelineMetric0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }

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
    org.apache.ambari.server.controller.spi.Resource.Type type36 = null;
    java.util.Set<java.lang.String> set_str37 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str38 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str37);
    org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException39 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type36, set_str38);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str40 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.keyPropertyIds;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController41 = null;
    org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider42 = new org.apache.ambari.server.controller.internal.ActionResourceProvider(set_str38, map_type_str40, ambariManagementController41);
    queryImpl35.setKeyValueMap(map_type_str40);
    java.util.Map<java.lang.String,java.lang.String> map_str_str44 = queryImpl35.getRequestInfoProps();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str44);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider1 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController0);
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization2 = ldapSyncEventResourceProvider1.getRequiredDeleteAuthorizations();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization2);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }

    org.apache.ambari.server.checks.ServicesMapReduceDistributedCacheCheck servicesMapReduceDistributedCacheCheck0 = new org.apache.ambari.server.checks.ServicesMapReduceDistributedCacheCheck();

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    java.lang.String str1 = widgetResponse0.getAuthor();
    widgetResponse0.setMetrics("upgrade_suspended");
    widgetResponse0.setAuthor("StackLevelConfigurations/property_value_attributes");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.MAPREDUCE2_LOG4J_CONFIG_TAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mapreduce2-log4j"+ "'", str0.equals("mapreduce2-log4j"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }

    org.apache.ambari.server.api.resources.RootServiceResourceDefinition rootServiceResourceDefinition0 = new org.apache.ambari.server.api.resources.RootServiceResourceDefinition();
    java.lang.String str1 = rootServiceResourceDefinition0.getPluralName();
    java.lang.String str2 = rootServiceResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "rootServices"+ "'", str1.equals("rootServices"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "rootService"+ "'", str2.equals("rootService"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str0);
    org.apache.ambari.server.controller.spi.Request request2 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str0);
    java.lang.String[] str_array21 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent24 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str22);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str22;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController26 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider27 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController26);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str28 = ldapSyncEventResourceProvider27.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController29 = null;
    com.google.inject.Injector injector30 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider31 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str22, map_type_str28, ambariManagementController29, injector30);
    org.apache.ambari.server.api.resources.JobResourceDefinition jobResourceDefinition32 = new org.apache.ambari.server.api.resources.JobResourceDefinition();
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer34 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule35 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl36 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule35);
    metricsPaddingRenderer34.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl36);
    org.apache.ambari.server.api.query.QueryImpl queryImpl38 = new org.apache.ambari.server.api.query.QueryImpl(map_type_str28, (org.apache.ambari.server.api.resources.ResourceDefinition)jobResourceDefinition32, (org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl36);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController39 = null;
    org.apache.ambari.server.controller.internal.LoggingResourceProvider loggingResourceProvider40 = new org.apache.ambari.server.controller.internal.LoggingResourceProvider(set_str0, map_type_str28, ambariManagementController39);
    java.lang.String[] str_array43 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request44 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array43);
    org.apache.ambari.server.controller.spi.Predicate predicate45 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource46 = loggingResourceProvider40.getResources(request44, predicate45);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request44);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }

    org.apache.ambari.server.controller.RequestRequest requestRequest2 = new org.apache.ambari.server.controller.RequestRequest("777", (long)(-1));
    long long3 = requestRequest2.getRequestId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }

    org.apache.ambari.server.api.services.HostKerberosIdentityService hostKerberosIdentityService2 = new org.apache.ambari.server.api.services.HostKerberosIdentityService("127.0.0.1", "Requests/cluster_id");

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }

    org.apache.ambari.server.topology.TopologyRequestFactoryImpl topologyRequestFactoryImpl0 = new org.apache.ambari.server.topology.TopologyRequestFactoryImpl();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj1 = null;
    org.apache.ambari.server.state.SecurityType securityType2 = null;
    org.apache.ambari.server.topology.SecurityConfiguration securityConfiguration3 = new org.apache.ambari.server.topology.SecurityConfiguration(securityType2);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.ProvisionClusterRequest provisionClusterRequest4 = topologyRequestFactoryImpl0.createProvisionClusterRequest(map_str_obj1, securityConfiguration3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType concatenationType1 = org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.translate("AlertHistory/definition_name");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.security.authorization.Group group1 = null;
    // The following exception was thrown during execution in test generation
    try {
    users0.removeGroup(group1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_AUTO_START;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_AUTO_START + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_AUTO_START));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }

    org.apache.ambari.server.api.resources.InstanceResourceDefinition instanceResourceDefinition0 = new org.apache.ambari.server.api.resources.InstanceResourceDefinition();
    java.lang.String str1 = instanceResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "instance"+ "'", str1.equals("instance"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    hostVersionDAO0.refresh(hostVersionEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }

    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED;
    org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.DESCRIPTION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/description"+ "'", str0.equals("ViewVersionInfo/description"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }

    java.lang.String str0 = org.apache.ambari.server.api.resources.UpgradeResourceDefinition.SKIP_SERVICE_CHECKS_DIRECTIVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/maintenance_state"+ "'", str0.equals("Hosts/maintenance_state"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }

    org.apache.ambari.server.controller.StackServiceRequest stackServiceRequest3 = new org.apache.ambari.server.controller.StackServiceRequest("ViewUrlInfo/view_instance_version", "", "ACTION_NAME");

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController6 = null;
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider activeWidgetLayoutResourceProvider7 = new org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider(ambariManagementController6);
    java.util.Set<java.lang.String> set_str8 = activeWidgetLayoutResourceProvider7.getCategoryIds();
    org.apache.ambari.server.controller.ExtensionLinkResponse extensionLinkResponse9 = new org.apache.ambari.server.controller.ExtensionLinkResponse("service", "Clusters/total_hosts", "Repositories/latest_base_url", "Request_Info/asc_order", "_SERVICE_CHECK", false, (java.util.Collection<java.lang.String>)set_str8);
    extensionLinkResponse9.setExtensionName("sqlserver");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.TSTR_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition configUpgradeChangeDefinition0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition();
    java.util.List<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer> list_transfer1 = configUpgradeChangeDefinition0.getTransfers();
    java.lang.String str2 = configUpgradeChangeDefinition0.getConfigType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_transfer1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    java.lang.String str1 = widgetResponse0.getAuthor();
    widgetResponse0.setMetrics("upgrade_suspended");
    java.lang.String str4 = widgetResponse0.getScope();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_VIEW_OPERATIONAL_LOGS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_VIEW_OPERATIONAL_LOGS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_VIEW_OPERATIONAL_LOGS));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_TOGGLE_ALERTS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_TOGGLE_ALERTS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_TOGGLE_ALERTS));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider1 = null;
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration2 = null;
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule3 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.ganglia.GangliaHostComponentPropertyProvider gangliaHostComponentPropertyProvider7 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaHostComponentPropertyProvider(map_str_map_str_propertyInfo0, uRLStreamProvider1, componentSSLConfiguration2, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule3, "Upgraded", "alerts.json", "FilterOperator");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HOSTS_MASTER_MAINTENANCE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    int i2 = configuration0.getViewRequestThreadPoolTimeout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2000);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.PROXY_ALLOWED_HOST_PORTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }

    org.apache.ambari.server.controller.RootServiceResponseFactory.Components components0 = org.apache.ambari.server.controller.RootServiceResponseFactory.Components.AMBARI_SERVER;
    org.junit.Assert.assertTrue("'" + components0 + "' != '" + org.apache.ambari.server.controller.RootServiceResponseFactory.Components.AMBARI_SERVER + "'", components0.equals(org.apache.ambari.server.controller.RootServiceResponseFactory.Components.AMBARI_SERVER));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }

    org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.COMPONENT_VERSION;
    java.lang.Float f1 = upgradeCheckGroup0.getOrder();
    org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.COMPONENT_VERSION + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.COMPONENT_VERSION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f1 + "' != '" + 9.0f+ "'", f1.equals(9.0f));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }

    org.apache.ambari.server.agent.RecoveryReport recoveryReport0 = new org.apache.ambari.server.agent.RecoveryReport();
    org.apache.ambari.server.agent.RecoveryReport recoveryReport1 = new org.apache.ambari.server.agent.RecoveryReport();
    org.apache.ambari.server.agent.ComponentRecoveryReport[] componentRecoveryReport_array2 = new org.apache.ambari.server.agent.ComponentRecoveryReport[] {  };
    java.util.ArrayList<org.apache.ambari.server.agent.ComponentRecoveryReport> arraylist_componentRecoveryReport3 = new java.util.ArrayList<org.apache.ambari.server.agent.ComponentRecoveryReport>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.agent.ComponentRecoveryReport>)arraylist_componentRecoveryReport3, componentRecoveryReport_array2);
    recoveryReport1.setComponentReports((java.util.List<org.apache.ambari.server.agent.ComponentRecoveryReport>)arraylist_componentRecoveryReport3);
    recoveryReport0.setComponentReports((java.util.List<org.apache.ambari.server.agent.ComponentRecoveryReport>)arraylist_componentRecoveryReport3);
    java.util.List<org.apache.ambari.server.agent.ComponentRecoveryReport> list_componentRecoveryReport7 = recoveryReport0.getComponentReports();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentRecoveryReport_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_componentRecoveryReport7);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    org.apache.ambari.server.controller.utilities.StreamProvider streamProvider1 = null;
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration2 = null;
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule3 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule4 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.ganglia.GangliaReportPropertyProvider gangliaReportPropertyProvider6 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaReportPropertyProvider(map_str_map_str_propertyInfo0, streamProvider1, componentSSLConfiguration2, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule3, "Tasks/custom_command_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule4);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }

    org.apache.ambari.server.state.State state0 = org.apache.ambari.server.state.State.UNINSTALLING;
    org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.apache.ambari.server.state.State.UNINSTALLING + "'", state0.equals(org.apache.ambari.server.state.State.UNINSTALLING));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.pkPropertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserResourceProvider.USER_OLD_PASSWORD_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Users/old_password"+ "'", str0.equals("Users/old_password"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }

    org.apache.ambari.server.serveraction.upgrades.SparkShufflePropertyConfig sparkShufflePropertyConfig0 = new org.apache.ambari.server.serveraction.upgrades.SparkShufflePropertyConfig();
    java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Object> concurrentmap_str_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.CommandReport commandReport2 = sparkShufflePropertyConfig0.execute(concurrentmap_str_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.KERBEROS_CHECK_JAAS_CONFIGURATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }

    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder2 = createUserRequestAuditEventBuilder0.withCreatedUsername("hdfs-site");
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder4 = createUserRequestAuditEventBuilder2.withAdmin(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder4);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.BLUEPRINT_SETTING_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "blueprint_setting"+ "'", str0.equals("blueprint_setting"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }

    org.apache.ambari.server.collections.Predicate predicate0 = null;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj1 = org.apache.ambari.server.collections.PredicateUtils.toMap(predicate0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_obj1);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }

    org.apache.ambari.server.view.configuration.AutoInstanceConfig autoInstanceConfig0 = new org.apache.ambari.server.view.configuration.AutoInstanceConfig();
    java.lang.String str1 = autoInstanceConfig0.getStackId();
    boolean b2 = autoInstanceConfig0.isVisible();
    java.lang.String str3 = autoInstanceConfig0.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }

    org.apache.ambari.server.state.AgentVersion agentVersion1 = new org.apache.ambari.server.state.AgentVersion("kerberos_descriptor");
    org.apache.ambari.server.cleanup.TimeBasedCleanupPolicy timeBasedCleanupPolicy4 = new org.apache.ambari.server.cleanup.TimeBasedCleanupPolicy("StackConfigurations/final", (java.lang.Long)0L);
    java.lang.Long long5 = timeBasedCleanupPolicy4.getToDateInMillis();
    boolean b6 = agentVersion1.equals((java.lang.Object)long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L+ "'", long5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.ORACLE_JDBC_URL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "oracle_jdbc_url"+ "'", str0.equals("oracle_jdbc_url"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }

    org.apache.ambari.server.actionmanager.RequestType requestType0 = org.apache.ambari.server.actionmanager.RequestType.INTERNAL_REQUEST;
    org.junit.Assert.assertTrue("'" + requestType0 + "' != '" + org.apache.ambari.server.actionmanager.RequestType.INTERNAL_REQUEST + "'", requestType0.equals(org.apache.ambari.server.actionmanager.RequestType.INTERNAL_REQUEST));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,java.lang.Long> singularattribute_stageEntity_long0 = org.apache.ambari.server.orm.entities.StageEntity_.requestId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stageEntity_long0);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.Long> singularattribute_hostEntity_long0 = org.apache.ambari.server.orm.entities.HostEntity_.totalMem;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_long0);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.ARTIFACT_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Artifacts/artifact_name"+ "'", str0.equals("Artifacts/artifact_name"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.HOST_GROUP_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "name"+ "'", str0.equals("name"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }

    org.apache.ambari.server.api.services.HostKerberosIdentityService hostKerberosIdentityService2 = new org.apache.ambari.server.api.services.HostKerberosIdentityService("mysql_jdbc_url", "Users/user_name");

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }

    org.apache.ambari.server.state.Cluster cluster0 = null;
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType1 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    org.apache.ambari.server.state.stack.upgrade.Direction direction2 = null;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj3 = null;
    org.apache.ambari.server.state.UpgradeContext upgradeContext4 = new org.apache.ambari.server.state.UpgradeContext(cluster0, upgradeType1, direction2, map_str_obj3);
    upgradeContext4.setAutoSkipComponentFailures(true);
    org.apache.ambari.server.state.stack.UpgradePack upgradePack7 = upgradeContext4.getUpgradePack();
    org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(upgradePack7);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }

    org.apache.ambari.server.actionmanager.ActionType actionType0 = org.apache.ambari.server.actionmanager.ActionType.DISABLED;
    org.junit.Assert.assertTrue("'" + actionType0 + "' != '" + org.apache.ambari.server.actionmanager.ActionType.DISABLED + "'", actionType0.equals(org.apache.ambari.server.actionmanager.ActionType.DISABLED));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }

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
    org.apache.ambari.server.controller.spi.Resource.Type type36 = null;
    java.util.Set<java.lang.String> set_str37 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str38 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str37);
    org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException39 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type36, set_str38);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str40 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.keyPropertyIds;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController41 = null;
    org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider42 = new org.apache.ambari.server.controller.internal.ActionResourceProvider(set_str38, map_type_str40, ambariManagementController41);
    queryImpl35.setKeyValueMap(map_type_str40);
    org.apache.ambari.server.controller.internal.TemporalInfoImpl temporalInfoImpl48 = new org.apache.ambari.server.controller.internal.TemporalInfoImpl((long)' ', (long)(short)100, (long)(byte)100);
    org.apache.ambari.server.configuration.Configuration configuration49 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str50 = configuration49.getViewsPragmaHTTPResponseHeader();
    boolean b51 = configuration49.validateAgentHostnames();
    boolean b52 = temporalInfoImpl48.equals((java.lang.Object)configuration49);
    queryImpl35.addProperty("HTTP_ONLY", (org.apache.ambari.server.controller.spi.TemporalInfo)temporalInfoImpl48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "no-cache"+ "'", str50.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.HostGroup hostGroup0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.HostGroup();
    hostGroup0.setName("RootServiceHostComponents/service_name");

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }

    org.apache.ambari.server.state.ExtensionId extensionId0 = new org.apache.ambari.server.state.ExtensionId();
    boolean b2 = extensionId0.equals((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }

    java.lang.Throwable throwable1 = null;
    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException2 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("ambari-server", throwable1);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }

    org.apache.ambari.server.controller.StackVersionRequest stackVersionRequest2 = new org.apache.ambari.server.controller.StackVersionRequest("FilterOperator", "Clusters/total_hosts");

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.BLUEPRINT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "blueprint"+ "'", str0.equals("blueprint"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFile.PRINCIPAL_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "principal_type"+ "'", str0.equals("principal_type"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    org.apache.ambari.server.security.SecurePasswordHelper securePasswordHelper5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.encryption.CredentialStoreServiceImpl credentialStoreServiceImpl6 = new org.apache.ambari.server.security.encryption.CredentialStoreServiceImpl(configuration0, securePasswordHelper5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.AmbariMetaInfo.ANY_OS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "any"+ "'", str0.equals("any"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider1 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController0);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str2 = ldapSyncEventResourceProvider1.getKeyPropertyIds();
    org.apache.ambari.server.api.services.RepositoryVersionService repositoryVersionService3 = new org.apache.ambari.server.api.services.RepositoryVersionService(map_type_str2);
    javax.ws.rs.core.HttpHeaders httpHeaders5 = null;
    javax.ws.rs.core.UriInfo uriInfo6 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = repositoryVersionService3.updateRepositoryVersion("version", httpHeaders5, uriInfo6, "user_list");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str2);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestOperationLevel.OPERATION_HOSTCOMPONENT_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operation_level/hostcomponent_name"+ "'", str0.equals("operation_level/hostcomponent_name"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }

    org.apache.ambari.server.actionmanager.RequestStatus requestStatus0 = org.apache.ambari.server.actionmanager.RequestStatus.COMPLETED;
    org.junit.Assert.assertTrue("'" + requestStatus0 + "' != '" + org.apache.ambari.server.actionmanager.RequestStatus.COMPLETED + "'", requestStatus0.equals(org.apache.ambari.server.actionmanager.RequestStatus.COMPLETED));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }

    org.apache.ambari.server.state.MaintenanceState maintenanceState0 = org.apache.ambari.server.state.MaintenanceState.OFF;
    org.junit.Assert.assertTrue("'" + maintenanceState0 + "' != '" + org.apache.ambari.server.state.MaintenanceState.OFF + "'", maintenanceState0.equals(org.apache.ambari.server.state.MaintenanceState.OFF));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    mITKerberosOperationHandler0.setDefaultRealm("downgrade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

}
