
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.REFRESH_CONFIG_TAGS_BEFORE_EXECUTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "forceRefreshConfigTagsBeforeExecution"+ "'", str0.equals("forceRefreshConfigTagsBeforeExecution"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.String> singularattribute_alertHistoryEntity_str0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertText;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_str0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestResourceProvider.REQUEST_SOURCE_SCHEDULE_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Requests/request_schedule/schedule_id"+ "'", str0.equals("Requests/request_schedule/schedule_id"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PrivilegeResourceProvider.PRIVILEGE_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/privilege_id"+ "'", str0.equals("PrivilegeInfo/privilege_id"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/id"+ "'", str0.equals("UpgradeChecks/id"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler.DEFAULT_MAX_DEGREE_OF_PARALLELISM = (byte)100;

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    java.lang.String str0 = org.apache.ambari.server.topology.SecurityConfigurationFactory.KERBEROS_DESCRIPTOR_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "kerberos_descriptor"+ "'", str0.equals("kerberos_descriptor"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider1 = null;
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration2 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider timelineMetricCacheProvider3 = null;
    org.apache.ambari.server.controller.metrics.MetricHostProvider metricHostProvider4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.timeline.AMSReportPropertyProvider aMSReportPropertyProvider6 = new org.apache.ambari.server.controller.metrics.timeline.AMSReportPropertyProvider(map_str_map_str_propertyInfo0, uRLStreamProvider1, componentSSLConfiguration2, timelineMetricCacheProvider3, metricHostProvider4, "Requests/request_schedule/schedule_id");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_DISPLAY_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/display_name"+ "'", str0.equals("RepositoryVersions/display_name"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.ALERTS_AMBARI_SNMP_DISPATCH_UDP_PORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,org.apache.ambari.server.orm.entities.RequestEntity> singularattribute_stageEntity_requestEntity0 = org.apache.ambari.server.orm.entities.StageEntity_.request;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stageEntity_requestEntity0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    org.apache.ambari.server.actionmanager.CommandExecutionType commandExecutionType0 = org.apache.ambari.server.actionmanager.CommandExecutionType.DEPENDENCY_ORDERED;
    org.junit.Assert.assertTrue("'" + commandExecutionType0 + "' != '" + org.apache.ambari.server.actionmanager.CommandExecutionType.DEPENDENCY_ORDERED + "'", commandExecutionType0.equals(org.apache.ambari.server.actionmanager.CommandExecutionType.DEPENDENCY_ORDERED));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.AmbariMetaInfo.WIDGETS_DESCRIPTOR_FILE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "widgets.json"+ "'", str0.equals("widgets.json"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.BaseRequest.ASC_ORDER_PROPERTY_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Request_Info/asc_order"+ "'", str0.equals("Request_Info/asc_order"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_LATEST_BASE_URL_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/latest_base_url"+ "'", str0.equals("Repositories/latest_base_url"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.STACK_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "stack_name"+ "'", str0.equals("stack_name"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog230 upgradeCatalog2301 = new org.apache.ambari.server.upgrade.UpgradeCatalog230(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "stack_name", "", "stack_name", "UpgradeChecks/id" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    org.apache.ambari.server.events.AlertHashInvalidationEvent alertHashInvalidationEvent8 = new org.apache.ambari.server.events.AlertHashInvalidationEvent((long)100, (java.util.Collection<java.lang.String>)arraylist_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.GANGLIA_MONITOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo0 = null;
    org.apache.ambari.server.controller.internal.StackDependencyResourceProvider.init(ambariMetaInfo0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.AmbariMetaInfo.SERVICE_ALERT_FILE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "alerts.json"+ "'", str0.equals("alerts.json"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    org.apache.ambari.server.events.jpa.EntityManagerCacheInvalidationEvent entityManagerCacheInvalidationEvent0 = new org.apache.ambari.server.events.jpa.EntityManagerCacheInvalidationEvent();

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.WIDGETLAYOUT_SECTION_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/section_name"+ "'", str0.equals("WidgetLayoutInfo/section_name"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.hostName = singularattribute_hostEntity_str0;

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.NAMENODE_SERVICE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    org.apache.ambari.server.state.Alert alert1 = null;
    org.apache.ambari.server.orm.entities.AlertCurrentEntity alertCurrentEntity2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.events.InitialAlertEvent initialAlertEvent3 = new org.apache.ambari.server.events.InitialAlertEvent((long)'4', alert1, alertCurrentEntity2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertTargetResourceProvider.ALERT_TARGET_NOTIFICATION_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertTarget/notification_type"+ "'", str0.equals("AlertTarget/notification_type"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    org.apache.ambari.server.orm.entities.AlertHistoryEntity_ alertHistoryEntity_0 = new org.apache.ambari.server.orm.entities.AlertHistoryEntity_();

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    org.apache.ambari.annotations.ExperimentalFeature experimentalFeature0 = org.apache.ambari.annotations.ExperimentalFeature.PARALLEL_PROCESSING;
    org.junit.Assert.assertTrue("'" + experimentalFeature0 + "' != '" + org.apache.ambari.annotations.ExperimentalFeature.PARALLEL_PROCESSING + "'", experimentalFeature0.equals(org.apache.ambari.annotations.ExperimentalFeature.PARALLEL_PROCESSING));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long long2 = org.apache.ambari.server.utils.DateUtils.convertToTimestamp("Requests/request_schedule/schedule_id", "Requests/request_schedule/schedule_id");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    org.apache.ambari.server.state.StackInfo stackInfo0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.StackId stackId1 = new org.apache.ambari.server.state.StackId(stackInfo0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StackEntity,java.lang.String> singularattribute_stackEntity_str0 = org.apache.ambari.server.orm.entities.StackEntity_.stackName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stackEntity_str0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_LAST_REGISTRATION_TIME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/last_registration_time"+ "'", str0.equals("Hosts/last_registration_time"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.MIN_AMBARI_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/min_ambari_version"+ "'", str0.equals("ViewVersionInfo/min_ambari_version"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    org.apache.ambari.server.state.quicklinksprofile.LinkAttributeFilter linkAttributeFilter0 = new org.apache.ambari.server.state.quicklinksprofile.LinkAttributeFilter();

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity configGroupHostMappingEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    configGroupHostMappingDAO0.remove(configGroupHostMappingEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.PROPERTY_VALUE_ATTRIBUTES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/property_value_attributes"+ "'", str0.equals("StackConfigurations/property_value_attributes"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.upgrades.UpdateDesiredStackAction.COMMAND_DOWNGRADE_FROM_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "downgrade_from_version"+ "'", str0.equals("downgrade_from_version"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HDFS_SERVICE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_ALERTS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_ALERTS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_ALERTS));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    com.google.inject.Injector injector0 = null;
    org.apache.ambari.server.serveraction.ServerActionExecutor.init(injector0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    java.lang.String str0 = org.apache.ambari.server.topology.Setting.SETTING_NAME_RECOVERY_SETTINGS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "recovery_settings"+ "'", str0.equals("recovery_settings"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackLevelConfigurationResourceProvider.PROPERTY_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackLevelConfigurations/type"+ "'", str0.equals("StackLevelConfigurations/type"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_UPGRADE_PACK_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/upgrade_pack"+ "'", str0.equals("UpgradeChecks/upgrade_pack"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog2121 upgradeCatalog21211 = new org.apache.ambari.server.upgrade.UpgradeCatalog2121(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    int i0 = org.apache.ambari.server.security.SecurePasswordHelper.DEFAULT_SECURE_PASSWORD_MIN_UPPERCASE_LETTERS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_REPOSITORY_VERSION_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/repository_version_id"+ "'", str0.equals("Repositories/repository_version_id"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    org.apache.ambari.server.ClusterNotFoundException clusterNotFoundException1 = new org.apache.ambari.server.ClusterNotFoundException("widgets.json");

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_MAINTENANCE_STATE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/maintenance_state"+ "'", str0.equals("Hosts/maintenance_state"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertTargetResourceProvider.ALERT_TARGET_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertTarget/name"+ "'", str0.equals("AlertTarget/name"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceComponentPropertyProvider.CIPHER_PROPERTIES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceComponents/ciphers"+ "'", str0.equals("RootServiceComponents/ciphers"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    java.io.File file0 = null;
    javax.xml.validation.Validator validator1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.StackManager.validateAllPropertyXmlsInFolderRecursively(file0, validator1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.ARCHIVE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/archive"+ "'", str0.equals("ViewVersionInfo/archive"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.BLUEPRINT_NAME_COL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "blueprint_name"+ "'", str0.equals("blueprint_name"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,java.lang.Long> singularattribute_stageEntity_long0 = null;
    org.apache.ambari.server.orm.entities.StageEntity_.clusterId = singularattribute_stageEntity_long0;

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.Long> singularattribute_hostEntity_long0 = org.apache.ambari.server.orm.entities.HostEntity_.hostId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_long0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_CONNECTION_POOL_ACQUISITION_RETRY_ATTEMPTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog212 upgradeCatalog2121 = new org.apache.ambari.server.upgrade.UpgradeCatalog212(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    org.apache.ambari.server.controller.spi.ProviderModule providerModule0 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl1 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule0);
    org.apache.ambari.server.controller.spi.Resource.Type type2 = null;
    org.apache.ambari.server.controller.spi.Request request3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus4 = clusterControllerImpl1.createResources(type2, request3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.keyPropertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ConfigurationResourceProvider.CONFIGURATION_CONFIG_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "type"+ "'", str0.equals("type"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.CLUSTER_ENV_RETRY_MAX_TIME_IN_SEC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "command_retry_max_time_in_sec"+ "'", str0.equals("command_retry_max_time_in_sec"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    org.apache.ambari.server.utils.RetryHelper.invalidateAffectedClusters();

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyManageAuthorization(alertDefinitionEntity0);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.EXECUTION_SCHEDULER_THREADS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    com.codahale.metrics.MetricFilter metricFilter0 = com.codahale.metrics.MetricFilter.ALL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(metricFilter0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.requestId = singularattribute_hostRoleCommandEntity_long0;

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.EXECUTION_SCHEDULER_START_DELAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    org.apache.ambari.server.security.authorization.AuthorizationException authorizationException1 = new org.apache.ambari.server.security.authorization.AuthorizationException("StackConfigurations/property_value_attributes");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.PRECISION_TABLE_TTL_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "timeline.metrics.host.aggregator.ttl"+ "'", str0.equals("timeline.metrics.host.aggregator.ttl"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.DESIRED_VERSION_COLUMN_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "desired_version"+ "'", str0.equals("desired_version"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY pADDING_STRATEGY0 = org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY.ZEROS;
    org.junit.Assert.assertTrue("'" + pADDING_STRATEGY0 + "' != '" + org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY.ZEROS + "'", pADDING_STRATEGY0.equals(org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY.ZEROS));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_ABORT_REASON;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/abort_reason"+ "'", str0.equals("Upgrade/abort_reason"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.KERBEROS_AUTH_USER_TYPES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.FALCON_SERVICE_CHECK;
    java.lang.String str1 = role0.name();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FALCON_SERVICE_CHECK"+ "'", str1.equals("FALCON_SERVICE_CHECK"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog242 upgradeCatalog2421 = new org.apache.ambari.server.upgrade.UpgradeCatalog242(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    org.apache.ambari.server.serveraction.kerberos.KDCType kDCType0 = org.apache.ambari.server.serveraction.kerberos.KDCType.MIT_KDC;
    org.junit.Assert.assertTrue("'" + kDCType0 + "' != '" + org.apache.ambari.server.serveraction.kerberos.KDCType.MIT_KDC + "'", kDCType0.equals(org.apache.ambari.server.serveraction.kerberos.KDCType.MIT_KDC));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.JAVA_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "java_version"+ "'", str0.equals("java_version"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ActionResourceProvider.TARGET_SERVICE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Actions/target_service"+ "'", str0.equals("Actions/target_service"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StageResourceProvider.STAGE_STATUS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stage/status"+ "'", str0.equals("Stage/status"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_PAGINATION_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestOperationLevel.OPERATION_SERVICE_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operation_level/service_name"+ "'", str0.equals("operation_level/service_name"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserResourceProvider.USER_USERNAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Users/user_name"+ "'", str0.equals("Users/user_name"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    org.apache.ambari.server.orm.entities.StageEntity_ stageEntity_0 = new org.apache.ambari.server.orm.entities.StageEntity_();

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SHARED_RESOURCES_DIR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    org.apache.ambari.server.security.authorization.AuthorizationHelper.addLoginNameAlias("forceRefreshConfigTagsBeforeExecution", "Requests/request_schedule/schedule_id");

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    com.google.common.eventbus.EventBus eventBus1 = org.apache.ambari.server.utils.EventBusSynchronizer.synchronizeAmbariEventPublisher(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    org.apache.ambari.server.orm.entities.ExtensionEntity extensionEntity0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.ExtensionId extensionId1 = new org.apache.ambari.server.state.ExtensionId(extensionEntity0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    org.apache.ambari.server.state.RepositoryVersionState repositoryVersionState0 = org.apache.ambari.server.state.RepositoryVersionState.NOT_REQUIRED;
    org.junit.Assert.assertTrue("'" + repositoryVersionState0 + "' != '" + org.apache.ambari.server.state.RepositoryVersionState.NOT_REQUIRED + "'", repositoryVersionState0.equals(org.apache.ambari.server.state.RepositoryVersionState.NOT_REQUIRED));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    org.apache.ambari.server.state.UpgradeHelper upgradeHelper0 = new org.apache.ambari.server.state.UpgradeHelper();
    java.util.Map<org.apache.ambari.server.state.Service,java.util.Set<org.apache.ambari.server.state.ServiceComponent>> map_service_set_serviceComponent2 = null;
    // The following exception was thrown during execution in test generation
    try {
    upgradeHelper0.putComponentsToUpgradingState("", map_service_set_serviceComponent2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    org.apache.ambari.server.stack.StackContext stackContext0 = null;
    org.apache.ambari.server.state.ServiceInfo serviceInfo1 = null;
    org.apache.ambari.server.stack.ServiceDirectory serviceDirectory2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.ServiceModule serviceModule3 = new org.apache.ambari.server.stack.ServiceModule(stackContext0, serviceInfo1, serviceDirectory2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    org.apache.ambari.server.utils.JaxbMapKeyVal jaxbMapKeyVal0 = new org.apache.ambari.server.utils.JaxbMapKeyVal();

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    org.apache.ambari.server.metadata.RoleCommandOrder roleCommandOrder0 = new org.apache.ambari.server.metadata.RoleCommandOrder();
    org.apache.ambari.server.stageplanner.RoleGraphNode roleGraphNode1 = null;
    org.apache.ambari.server.stageplanner.RoleGraphNode roleGraphNode2 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i3 = roleCommandOrder0.order(roleGraphNode1, roleGraphNode2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    org.apache.ambari.server.topology.TopologyRequest topologyRequest1 = null;
    org.apache.ambari.server.topology.ClusterTopology clusterTopology2 = null;
    org.apache.ambari.server.orm.entities.TopologyLogicalRequestEntity topologyLogicalRequestEntity3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.LogicalRequest logicalRequest4 = new org.apache.ambari.server.topology.LogicalRequest((java.lang.Long)0L, topologyRequest1, clusterTopology2, topologyLogicalRequestEntity3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackLevelConfigurationResourceProvider.PROPERTY_VALUE_ATTRIBUTES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackLevelConfigurations/property_value_attributes"+ "'", str0.equals("StackLevelConfigurations/property_value_attributes"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.lastAttemptTime;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_long0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    org.apache.ambari.server.controller.spi.Resource resource0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.ResourceImpl resourceImpl1 = new org.apache.ambari.server.controller.internal.ResourceImpl(resource0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,java.lang.String> singularattribute_stageEntity_str0 = org.apache.ambari.server.orm.entities.StageEntity_.requestContext;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stageEntity_str0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.AbstractUpgradeCatalog.YARN_SCHEDULER_CAPACITY_ROOT_QUEUES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "yarn.scheduler.capacity.root.queues"+ "'", str0.equals("yarn.scheduler.capacity.root.queues"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    org.apache.ambari.server.orm.entities.HostRoleCommandEntity hostRoleCommandEntity5 = null;
    org.apache.ambari.server.controller.internal.UpgradeSummary upgradeSummary6 = new org.apache.ambari.server.controller.internal.UpgradeSummary("widgets.json", (java.lang.Long)1L, (java.lang.Long)(-1L), (java.lang.Long)1L, "widgets.json", hostRoleCommandEntity5);
    java.lang.Long long7 = upgradeSummary6.getStageId();
    java.lang.Long long8 = upgradeSummary6.getTaskId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L)+ "'", long7.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L+ "'", long8.equals(1L));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserAuthorizationResourceProvider.AUTHORIZATION_CLUSTER_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AuthorizationInfo/cluster_name"+ "'", str0.equals("AuthorizationInfo/cluster_name"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    org.apache.ambari.server.controller.utilities.KerberosChecker kerberosChecker0 = new org.apache.ambari.server.controller.utilities.KerberosChecker();

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    java.util.Map<org.apache.ambari.server.state.PropertyInfo.PropertyType,java.util.Set<java.lang.String>> map_propertyType_set_str0 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    org.apache.ambari.server.utils.SecretReference.replacePasswordsWithReferences(map_propertyType_set_str0, map_str_str1, "command_retry_max_time_in_sec", (java.lang.Long)100L);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    org.apache.ambari.server.controller.internal.PropertyValueTrimmingStrategyDefiner propertyValueTrimmingStrategyDefiner0 = new org.apache.ambari.server.controller.internal.PropertyValueTrimmingStrategyDefiner();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    org.apache.ambari.server.serveraction.kerberos.KDCType kDCType0 = org.apache.ambari.server.serveraction.kerberos.KDCType.NONE;
    org.junit.Assert.assertTrue("'" + kDCType0 + "' != '" + org.apache.ambari.server.serveraction.kerberos.KDCType.NONE + "'", kDCType0.equals(org.apache.ambari.server.serveraction.kerberos.KDCType.NONE));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StageResourceProvider.STAGE_HOST_PARAMS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stage/host_params"+ "'", str0.equals("Stage/host_params"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    org.apache.ambari.server.api.services.ViewPrivilegeService viewPrivilegeService3 = new org.apache.ambari.server.api.services.ViewPrivilegeService("downgrade_from_version", "AlertTarget/name", "WidgetLayoutInfo/section_name");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = viewPrivilegeService3.getPrivileges(httpHeaders4, uriInfo5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,byte[]> singularattribute_stageEntity_byte_array0 = org.apache.ambari.server.orm.entities.StageEntity_.clusterHostInfo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stageEntity_byte_array0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    org.apache.ambari.server.collections.PredicateUtils predicateUtils0 = new org.apache.ambari.server.collections.PredicateUtils();

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.JDBC_IN_MEMORY_URL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "jdbc:derby:memory:myDB/ambari;create=true"+ "'", str0.equals("jdbc:derby:memory:myDB/ambari;create=true"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    org.apache.ambari.server.state.alert.SourceType sourceType0 = org.apache.ambari.server.state.alert.SourceType.SCRIPT;
    org.junit.Assert.assertTrue("'" + sourceType0 + "' != '" + org.apache.ambari.server.state.alert.SourceType.SCRIPT + "'", sourceType0.equals(org.apache.ambari.server.state.alert.SourceType.SCRIPT));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str6 = org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreatorHelper.getNamedPropertyList((org.apache.ambari.server.api.services.Request)postRequest4, "forceRefreshConfigTagsBeforeExecution");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.REQUEST_READ_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    org.apache.ambari.server.state.NotificationState notificationState0 = org.apache.ambari.server.state.NotificationState.DISPATCHED;
    org.junit.Assert.assertTrue("'" + notificationState0 + "' != '" + org.apache.ambari.server.state.NotificationState.DISPATCHED + "'", notificationState0.equals(org.apache.ambari.server.state.NotificationState.DISPATCHED));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_FAILED;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_FAILED + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_FAILED));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.TIMELINE_METRICS_CACHE_HEAP_PERCENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.VersionDefinitionResourceProvider.VERSION_DEF_STACK_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "VersionDefinition/stack_name"+ "'", str0.equals("VersionDefinition/stack_name"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_RACK_INFO_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/rack_info"+ "'", str0.equals("Hosts/rack_info"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserResourceProvider.USER_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Users/user_type"+ "'", str0.equals("Users/user_type"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_HOST_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/host_name"+ "'", str0.equals("HostRoles/host_name"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.StackId stackId1 = new org.apache.ambari.server.state.StackId("Stage/host_params");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ExecuteTask.actionVerb;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Executing"+ "'", str0.equals("Executing"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.String> singularattribute_alertHistoryEntity_str0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.serviceName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_str0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    org.apache.ambari.server.controller.logging.LoggingRequestHelperFactoryImpl loggingRequestHelperFactoryImpl0 = new org.apache.ambari.server.controller.logging.LoggingRequestHelperFactoryImpl();

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = null;
    org.apache.ambari.server.orm.dao.WidgetDAO widgetDAO1 = null;
    org.apache.ambari.server.orm.dao.WidgetLayoutDAO widgetLayoutDAO2 = null;
    com.google.gson.Gson gson3 = null;
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.init(userDAO0, widgetDAO1, widgetLayoutDAO2, gson3);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.CLUSTER_HANDLE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/cluster_handle"+ "'", str0.equals("ViewInstanceInfo/cluster_handle"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ArtifactResourceProvider.ARTIFACT_NAME_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Artifacts/artifact_name"+ "'", str0.equals("Artifacts/artifact_name"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.REPOSITORY_VERSION;
    org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.REPOSITORY_VERSION + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.REPOSITORY_VERSION));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    org.apache.ambari.server.api.resources.UpgradeResourceDefinition.SKIP_SERVICE_CHECKS_DIRECTIVE = "Upgrade/abort_reason";

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.TOPOLOGY_TASK_PARALLEL_CREATION_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.SECURITY_ENABLED_CONFIG_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cluster-env"+ "'", str0.equals("cluster-env"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    org.apache.ambari.server.serveraction.upgrades.ManualStageAction manualStageAction0 = new org.apache.ambari.server.serveraction.upgrades.ManualStageAction();

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    org.apache.ambari.server.state.Clusters clusters0 = null;
    org.apache.ambari.server.actionmanager.ActionManager actionManager1 = null;
    org.apache.ambari.server.agent.HeartbeatMonitor heartbeatMonitor2 = null;
    com.google.inject.Injector injector3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.HeartbeatProcessor heartbeatProcessor4 = new org.apache.ambari.server.agent.HeartbeatProcessor(clusters0, actionManager1, heartbeatMonitor2, injector3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    org.apache.ambari.server.orm.entities.AlertGroupEntity alertGroupEntity0 = null;
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyManageAuthorization(alertGroupEntity0, (java.lang.Long)10L);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/id"+ "'", str0.equals("Tasks/id"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AlertScriptDispatcher.SCRIPT_CONFIG_DEFAULT_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "notification.dispatch.alert.script"+ "'", str0.equals("notification.dispatch.alert.script"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.PROPERTY_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/type"+ "'", str0.equals("StackConfigurations/type"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewURLResourceProvider.URL_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewUrlInfo/url_name"+ "'", str0.equals("ViewUrlInfo/url_name"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    org.apache.ambari.server.api.resources.AlertDefResourceDefinition alertDefResourceDefinition0 = new org.apache.ambari.server.api.resources.AlertDefResourceDefinition();

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,java.lang.String> singularattribute_stageEntity_str0 = org.apache.ambari.server.orm.entities.StageEntity_.logInfo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stageEntity_str0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_RESTORE;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_RESTORE + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_RESTORE));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosOperationException kerberosOperationException1 = new org.apache.ambari.server.serveraction.kerberos.KerberosOperationException("Hosts/last_registration_time");

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosConfigDataFile.VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "value"+ "'", str0.equals("value"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_STATE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/state"+ "'", str0.equals("HostRoles/state"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.KERBEROS_AUTH_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.logging.LogLineResult logLineResult1 = new org.apache.ambari.server.controller.logging.LogLineResult(map_str_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_USER_BASE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,org.apache.ambari.server.orm.entities.RequestEntity> singularattribute_stageEntity_requestEntity0 = null;
    org.apache.ambari.server.orm.entities.StageEntity_.request = singularattribute_stageEntity_requestEntity0;

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.PROPERTY_FINAL_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/final"+ "'", str0.equals("StackConfigurations/final"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.MANAGE_IDENTITIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "manage_identities"+ "'", str0.equals("manage_identities"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.pkPropertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.AMBARI_SERVER_KERBEROS_IDENTITY_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari-server"+ "'", str0.equals("ambari-server"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    java.util.regex.Pattern pattern0 = org.apache.ambari.server.topology.HostGroup.HOSTGROUP_REGEX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pattern0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    org.apache.ambari.server.state.MaintenanceState maintenanceState0 = org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_SERVICE_AND_HOST;
    org.junit.Assert.assertTrue("'" + maintenanceState0 + "' != '" + org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_SERVICE_AND_HOST + "'", maintenanceState0.equals(org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_SERVICE_AND_HOST));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.RANGER_ADMIN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    org.apache.ambari.server.controller.logging.LogSearchDataRetrievalService logSearchDataRetrievalService0 = new org.apache.ambari.server.controller.logging.LogSearchDataRetrievalService();
    com.google.common.util.concurrent.Service.Listener listener1 = null;
    java.util.concurrent.Executor executor2 = null;
    // The following exception was thrown during execution in test generation
    try {
    logSearchDataRetrievalService0.addListener(listener1, executor2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.MAX_DURATION_OF_RETRIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "max_duration_for_retries"+ "'", str0.equals("max_duration_for_retries"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_SECONDARY_URL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.checks.CheckDescription.HOSTS_MASTER_MAINTENANCE = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.JDBC_IN_MEMORY_DRIVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "org.apache.derby.jdbc.EmbeddedDriver"+ "'", str0.equals("org.apache.derby.jdbc.EmbeddedDriver"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.AMBARI_DB_RCA_PASSWORD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari_db_rca_password"+ "'", str0.equals("ambari_db_rca_password"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.MYSQL_JAR_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    org.apache.ambari.server.controller.internal.DirectoriesTrimmingStrategy directoriesTrimmingStrategy0 = new org.apache.ambari.server.controller.internal.DirectoriesTrimmingStrategy();
    java.lang.String str2 = directoriesTrimmingStrategy0.trim("PrivilegeInfo/privilege_id");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "PrivilegeInfo/privilege_id"+ "'", str2.equals("PrivilegeInfo/privilege_id"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.JAVAX_SSL_TRUSTSTORE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "javax.net.ssl.trustStore"+ "'", str0.equals("javax.net.ssl.trustStore"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    org.apache.ambari.server.actionmanager.RequestType requestType0 = org.apache.ambari.server.actionmanager.RequestType.ACTION;
    org.junit.Assert.assertTrue("'" + requestType0 + "' != '" + org.apache.ambari.server.actionmanager.RequestType.ACTION + "'", requestType0.equals(org.apache.ambari.server.actionmanager.RequestType.ACTION));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SRVR_AGENT_ACCEPTOR_THREAD_COUNT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorHelper stackAdvisorHelper0 = null;
    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorBlueprintProcessor.init(stackAdvisorHelper0);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    org.apache.ambari.server.controller.spi.Resource resource0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getProperties(resource0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceResourceProvider.SERVICE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootService/service_name"+ "'", str0.equals("RootService/service_name"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    org.apache.ambari.server.state.HostEventType hostEventType0 = org.apache.ambari.server.state.HostEventType.HOST_HEARTBEAT_UNHEALTHY;
    org.junit.Assert.assertTrue("'" + hostEventType0 + "' != '" + org.apache.ambari.server.state.HostEventType.HOST_HEARTBEAT_UNHEALTHY + "'", hostEventType0.equals(org.apache.ambari.server.state.HostEventType.HOST_HEARTBEAT_UNHEALTHY));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.RECOVERY_RETRY_GAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.events.listeners.alerts.AlertServiceComponentHostListener alertServiceComponentHostListener1 = new org.apache.ambari.server.events.listeners.alerts.AlertServiceComponentHostListener(ambariEventPublisher0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigureTask.PARAMETER_KEY_VALUE_PAIRS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configure-task-key-value-pairs"+ "'", str0.equals("configure-task-key-value-pairs"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.JWT_PUBLIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_CRT_PASS_LEN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    org.apache.ambari.server.orm.cache.HostConfigMapping hostConfigMapping0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.cache.HostConfigMappingImpl hostConfigMappingImpl1 = new org.apache.ambari.server.orm.cache.HostConfigMappingImpl(hostConfigMapping0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.ALERTS_CACHE_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    org.apache.ambari.server.topology.TopologyRequest topologyRequest1 = null;
    org.apache.ambari.server.topology.ClusterTopology clusterTopology2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.LogicalRequest logicalRequest3 = new org.apache.ambari.server.topology.LogicalRequest((java.lang.Long)1L, topologyRequest1, clusterTopology2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    org.apache.ambari.server.utils.HostAndPort hostAndPort2 = new org.apache.ambari.server.utils.HostAndPort("Repositories/repository_version_id", (int)(byte)0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.ICON64_PATH_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/icon64_path"+ "'", str0.equals("ViewInstanceInfo/icon64_path"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    float f0 = org.apache.ambari.server.configuration.Configuration.JDK_MIN_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.7f);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.VIEW_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/view_name"+ "'", str0.equals("ViewInstanceInfo/view_name"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    java.lang.String str0 = org.apache.ambari.server.security.SignCertResponse.ERROR_STATUS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ERROR"+ "'", str0.equals("ERROR"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,byte[]> singularattribute_stageEntity_byte_array0 = null;
    org.apache.ambari.server.orm.entities.StageEntity_.commandParamsStage = singularattribute_stageEntity_byte_array0;

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    java.util.Map<org.apache.ambari.server.state.PropertyInfo.PropertyType,java.util.Set<java.lang.String>> map_propertyType_set_str0 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    org.apache.ambari.server.utils.SecretReference.replacePasswordsWithReferences(map_propertyType_set_str0, map_str_str1, "yarn.scheduler.capacity.root.queues", (java.lang.Long)(-1L));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceComponentResourceProvider.SERVICE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceComponents/service_name"+ "'", str0.equals("RootServiceComponents/service_name"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    org.apache.ambari.server.api.services.ExtensionsService extensionsService0 = new org.apache.ambari.server.api.services.ExtensionsService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = extensionsService0.getExtensionVersionLinks("Actions/target_service", httpHeaders2, uriInfo3, "Stage/host_params", "stack_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.SHORT_URL_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/short_url_name"+ "'", str0.equals("ViewInstanceInfo/short_url_name"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.services.Result result5 = postRequest4.process();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    org.apache.ambari.server.controller.spi.Resource resource0 = null;
    java.lang.String[] str_array19 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str20 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str20, str_array19);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent22 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str20);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str20;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.ResourceImpl resourceImpl24 = new org.apache.ambari.server.controller.internal.ResourceImpl(resource0, (java.util.Set<java.lang.String>)linkedhashset_str20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SSL_TRUSTSTORE_PASSWORD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    org.apache.ambari.server.state.HostHealthStatus.HealthStatus healthStatus0 = org.apache.ambari.server.state.HostHealthStatus.HealthStatus.UNKNOWN;
    org.junit.Assert.assertTrue("'" + healthStatus0 + "' != '" + org.apache.ambari.server.state.HostHealthStatus.HealthStatus.UNKNOWN + "'", healthStatus0.equals(org.apache.ambari.server.state.HostHealthStatus.HealthStatus.UNKNOWN));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    java.util.Map<java.lang.String,java.lang.Object> map_str_obj0 = null;
    org.apache.ambari.server.topology.SecurityConfiguration securityConfiguration1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.ProvisionClusterRequest provisionClusterRequest2 = new org.apache.ambari.server.controller.internal.ProvisionClusterRequest(map_str_obj0, securityConfiguration1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_REPOSITORY_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/repository_version"+ "'", str0.equals("UpgradeChecks/repository_version"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.HOSTGROUP_HOST_PREDICATE_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_predicate"+ "'", str0.equals("host_predicate"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertCurrentEntity,java.lang.Long> singularattribute_alertCurrentEntity_long0 = org.apache.ambari.server.orm.entities.AlertCurrentEntity_.originalTimestamp;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertCurrentEntity_long0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRequest.StackAdvisorRequestType stackAdvisorRequestType0 = org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRequest.StackAdvisorRequestType.CONFIGURATION_DEPENDENCIES;
    org.junit.Assert.assertTrue("'" + stackAdvisorRequestType0 + "' != '" + org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRequest.StackAdvisorRequestType.CONFIGURATION_DEPENDENCIES + "'", stackAdvisorRequestType0.equals(org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRequest.StackAdvisorRequestType.CONFIGURATION_DEPENDENCIES));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestResourceProvider.REQUEST_CLUSTER_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Requests/cluster_id"+ "'", str0.equals("Requests/cluster_id"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CLIENT_API_SSL_CRT_PASS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType comparisonType0 = org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.NOT_EQUALS;
    org.junit.Assert.assertTrue("'" + comparisonType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.NOT_EQUALS + "'", comparisonType0.equals(org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.NOT_EQUALS));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.HDFS_SITE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hdfs-site"+ "'", str0.equals("hdfs-site"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher.BODY_OID_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch.snmp.oids.body"+ "'", str0.equals("ambari.dispatch.snmp.oids.body"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.VIEW_EXTRACTION_THREADPOOL_MAX_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    org.apache.ambari.server.controller.RootServiceResponseFactory.Components components0 = org.apache.ambari.server.controller.RootServiceResponseFactory.Components.AMBARI_AGENT;
    org.junit.Assert.assertTrue("'" + components0 + "' != '" + org.apache.ambari.server.controller.RootServiceResponseFactory.Components.AMBARI_AGENT + "'", components0.equals(org.apache.ambari.server.controller.RootServiceResponseFactory.Components.AMBARI_AGENT));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertHistoryResourceProvider.ALERT_HISTORY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertHistory/id"+ "'", str0.equals("AlertHistory/id"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.ambari.server.controller.internal.RequestOperationLevel.getInternalLevelName("host_predicate");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackVersionResourceProvider.STACK_ERROR_SET;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/stack-errors"+ "'", str0.equals("Versions/stack-errors"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider.SERVICE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceHostComponents/service_name"+ "'", str0.equals("RootServiceHostComponents/service_name"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertNoticeResourceProvider.ALERT_NOTICE_TARGET_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertNotice/target_id"+ "'", str0.equals("AlertNotice/target_id"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.AbstractUpgradeCatalog.YARN_SCHEDULER_CAPACITY_ROOT_QUEUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "yarn.scheduler.capacity.root"+ "'", str0.equals("yarn.scheduler.capacity.root"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HBASE_CLIENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.MEMBERSHIPS_REMOVED_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/summary/memberships/removed"+ "'", str0.equals("Event/summary/memberships/removed"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyResponse stackConfigurationDependencyResponse2 = new org.apache.ambari.server.controller.StackConfigurationDependencyResponse("widgets.json", "widgets.json");
    stackConfigurationDependencyResponse2.setStackVersion("kerberos_descriptor");

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PrivilegeResourceProvider.PRINCIPAL_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/principal_type"+ "'", str0.equals("PrivilegeInfo/principal_type"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    java.lang.String str0 = org.apache.ambari.server.metadata.ActionMetadata.SERVICE_CHECK_POSTFIX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "_SERVICE_CHECK"+ "'", str0.equals("_SERVICE_CHECK"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertResourceProvider.ALERT_COMPONENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Alert/component_name"+ "'", str0.equals("Alert/component_name"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.checks.CheckDescription.HOSTS_HEARTBEAT = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    org.apache.ambari.server.state.stack.upgrade.UpgradeScope upgradeScope0 = org.apache.ambari.server.state.stack.upgrade.UpgradeScope.ANY;
    org.junit.Assert.assertTrue("'" + upgradeScope0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeScope.ANY + "'", upgradeScope0.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeScope.ANY));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.AbstractUpgradeCatalog.QUEUES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "queues"+ "'", str0.equals("queues"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    org.apache.ambari.server.controller.metrics.MetricsDataTransferMethodFactory metricsDataTransferMethodFactory0 = new org.apache.ambari.server.controller.metrics.MetricsDataTransferMethodFactory();

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.INSTALL_PACKAGES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    org.apache.ambari.server.topology.TopologyManager topologyManager0 = null;
    org.apache.ambari.server.utils.StageUtils.setTopologyManager(topologyManager0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    java.io.Closeable closeable0 = null;
    org.apache.ambari.server.utils.Closeables.closeSilently(closeable0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

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
    java.lang.String[] str_array81 = new java.lang.String[] { "ViewInstanceInfo/view_name", "StackConfigurations/property_value_attributes", "Users/user_type", "VersionDefinition/stack_name", "hi!", "ambari_db_rca_password", "recovery_settings", "desired_version", "Tasks/id", "AlertTarget/notification_type", "StackLevelConfigurations/type", "operation_level/service_name", "hdfs-site", "Tasks/id", "ERROR", "Requests/cluster_id", "FALCON_SERVICE_CHECK", "javax.net.ssl.trustStore", "forceRefreshConfigTagsBeforeExecution", "_SERVICE_CHECK", "downgrade_from_version", "WidgetLayoutInfo/section_name", "ViewInstanceInfo/short_url_name", "Upgrade/abort_reason", "Artifacts/artifact_name", "hi!", "Users/user_name", "PrivilegeInfo/principal_type", "UpgradeChecks/repository_version", "Alert/component_name", "ambari_db_rca_password", "AlertTarget/notification_type", "type", "ViewInstanceInfo/view_name", "host_predicate", "ViewVersionInfo/min_ambari_version", "ViewVersionInfo/min_ambari_version", "desired_version", "RootService/service_name", "PrivilegeInfo/principal_type", "Hosts/maintenance_state", "operation_level/service_name", "cluster-env", "manage_identities", "alerts.json", "javax.net.ssl.trustStore", "host_predicate", "ViewUrlInfo/url_name", "RootServiceHostComponents/service_name", "_SERVICE_CHECK" };
    java.util.ArrayList<java.lang.String> arraylist_str82 = new java.util.ArrayList<java.lang.String>();
    boolean b83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str82, str_array81);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.RequestStatusResponse requestStatusResponse85 = hostComponentResourceProvider28.start("yarn.scheduler.capacity.root", "ambari-server", (java.util.Collection<java.lang.String>)arraylist_str82, true);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertNoticeEntity,java.lang.Long> singularattribute_alertNoticeEntity_long0 = org.apache.ambari.server.orm.entities.AlertNoticeEntity_.notificationId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertNoticeEntity_long0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_SYNC_USER_MEMBER_REPLACE_PATTERN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/cluster_name"+ "'", str0.equals("Clusters/cluster_name"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    java.lang.String str0 = org.apache.ambari.server.utils.StageUtils.DEFAULT_IPV4_ADDRESS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "127.0.0.1"+ "'", str0.equals("127.0.0.1"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    org.apache.ambari.server.state.Host host0 = null;
    org.apache.ambari.server.Role role1 = org.apache.ambari.server.Role.KERBEROS_CLIENT;
    org.apache.ambari.server.state.ServiceComponentHostEvent serviceComponentHostEvent2 = null;
    org.apache.ambari.server.RoleCommand roleCommand3 = org.apache.ambari.server.RoleCommand.STOP;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO6 = null;
    org.apache.ambari.server.orm.dao.ExecutionCommandDAO executionCommandDAO7 = null;
    org.apache.ambari.server.actionmanager.ExecutionCommandWrapperFactory executionCommandWrapperFactory8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.actionmanager.HostRoleCommand hostRoleCommand9 = new org.apache.ambari.server.actionmanager.HostRoleCommand(host0, role1, serviceComponentHostEvent2, roleCommand3, false, false, hostDAO6, executionCommandDAO7, executionCommandWrapperFactory8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role1);
    org.junit.Assert.assertTrue("'" + roleCommand3 + "' != '" + org.apache.ambari.server.RoleCommand.STOP + "'", roleCommand3.equals(org.apache.ambari.server.RoleCommand.STOP));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.AMS_COLLECTOR_COMPONENT_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "METRICS_COLLECTOR"+ "'", str0.equals("METRICS_COLLECTOR"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.METRICS_COLLECTOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewURLResourceProvider.VIEW_INSTANCE_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewUrlInfo/view_instance_version"+ "'", str0.equals("ViewUrlInfo/view_instance_version"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    org.apache.ambari.server.api.services.TargetClusterService targetClusterService0 = new org.apache.ambari.server.api.services.TargetClusterService();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = targetClusterService0.deleteTargetCluster(httpHeaders1, uriInfo2, "AlertTarget/notification_type");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    int i3 = org.apache.ambari.server.utils.VersionUtils.compareVersions("widgets.json", "Alert/component_name", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType0 = org.apache.ambari.server.state.PropertyInfo.PropertyType.PASSWORD;
    org.junit.Assert.assertTrue("'" + propertyType0 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.PASSWORD + "'", propertyType0.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.PASSWORD));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertGroupResourceProvider.ALERT_GROUP_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertGroup/name"+ "'", str0.equals("AlertGroup/name"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    org.apache.ambari.server.api.predicate.Token.TYPE tYPE0 = org.apache.ambari.server.api.predicate.Token.TYPE.BRACKET_CLOSE;
    org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.ambari.server.api.predicate.Token.TYPE.BRACKET_CLOSE + "'", tYPE0.equals(org.apache.ambari.server.api.predicate.Token.TYPE.BRACKET_CLOSE));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SSL_TRUSTSTORE_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    org.springframework.security.core.Authentication authentication0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str1 = org.apache.ambari.server.security.authorization.AuthorizationHelper.getAuthorizationNames(authentication0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.PROPERTY_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/property_name"+ "'", str0.equals("StackConfigurations/property_name"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    org.apache.ambari.server.state.scheduler.BatchRequest.Type type0 = org.apache.ambari.server.state.scheduler.BatchRequest.Type.PUT;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.ambari.server.state.scheduler.BatchRequest.Type.PUT + "'", type0.equals(org.apache.ambari.server.state.scheduler.BatchRequest.Type.PUT));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    org.apache.ambari.server.state.HostState hostState0 = org.apache.ambari.server.state.HostState.HEALTHY;
    org.junit.Assert.assertTrue("'" + hostState0 + "' != '" + org.apache.ambari.server.state.HostState.HEALTHY + "'", hostState0.equals(org.apache.ambari.server.state.HostState.HEALTHY));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.SECURITY_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "security"+ "'", str0.equals("security"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertHistoryResourceProvider.ALERT_HISTORY_DEFINITION_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertHistory/definition_name"+ "'", str0.equals("AlertHistory/definition_name"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    org.apache.ambari.server.controller.spi.ProviderModule providerModule0 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl1 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule0);
    org.apache.ambari.server.controller.spi.Resource.Type type2 = null;
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource3 = null;
    org.apache.ambari.server.controller.spi.Request request4 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource6 = clusterControllerImpl1.populateResources(type2, set_resource3, request4, predicate5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    java.lang.String str1 = org.apache.ambari.server.utils.ShellCommandUtil.hideOpenSslPassword("StackConfigurations/property_value_attributes");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "StackConfigurations/property_value_attributes"+ "'", str1.equals("StackConfigurations/property_value_attributes"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.hostId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_long0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    org.apache.ambari.server.orm.entities.StageEntity stageEntity0 = null;
    org.apache.ambari.server.orm.dao.HostRoleCommandDAO hostRoleCommandDAO1 = null;
    org.apache.ambari.server.actionmanager.ActionDBAccessor actionDBAccessor2 = null;
    org.apache.ambari.server.state.Clusters clusters3 = null;
    org.apache.ambari.server.actionmanager.HostRoleCommandFactory hostRoleCommandFactory4 = null;
    org.apache.ambari.server.actionmanager.ExecutionCommandWrapperFactory executionCommandWrapperFactory5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.actionmanager.Stage stage6 = new org.apache.ambari.server.actionmanager.Stage(stageEntity0, hostRoleCommandDAO1, actionDBAccessor2, clusters3, hostRoleCommandFactory4, executionCommandWrapperFactory5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.MAPREDUCE_SERVICE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest0 = null;
    org.apache.ambari.server.controller.internal.AbstractResourceProvider.parseProperties(configurationRequest0, "stack_name", "UpgradeChecks/upgrade_pack", "ambari_db_rca_password");

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.AMBARI_REQUEST_CONNECT_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_BASE_URL_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/base_url"+ "'", str0.equals("Repositories/base_url"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertCurrentEntity,org.apache.ambari.server.state.MaintenanceState> singularattribute_alertCurrentEntity_maintenanceState0 = org.apache.ambari.server.orm.entities.AlertCurrentEntity_.maintenanceState;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertCurrentEntity_maintenanceState0);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    java.util.Map<org.apache.ambari.server.state.PropertyInfo.PropertyType,java.util.Set<java.lang.String>> map_propertyType_set_str0 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    org.apache.ambari.server.utils.SecretReference.replacePasswordsWithReferences(map_propertyType_set_str0, map_str_str1, "UpgradeChecks/repository_version", (java.lang.Long)(-1L));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    org.apache.ambari.server.controller.internal.DefaultTrimmingStrategy defaultTrimmingStrategy0 = new org.apache.ambari.server.controller.internal.DefaultTrimmingStrategy();

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertNoticeEntity,org.apache.ambari.server.state.NotificationState> singularattribute_alertNoticeEntity_notificationState0 = null;
    org.apache.ambari.server.orm.entities.AlertNoticeEntity_.notifyState = singularattribute_alertNoticeEntity_notificationState0;

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    int i5 = postRequest4.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type6 = postRequest4.getRequestType();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreatorHelper.getProperty((org.apache.ambari.server.api.services.Request)postRequest4, "PrivilegeInfo/privilege_id");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type6.equals(org.apache.ambari.server.api.services.Request.Type.POST));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HBASE_REGIONSERVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.taskId = singularattribute_hostRoleCommandEntity_long0;

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_TO_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/to_version"+ "'", str0.equals("Upgrade/to_version"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    java.lang.String str1 = org.apache.ambari.server.utils.HTTPUtils.requestURL("ambari.dispatch.snmp.oids.body");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.KAFKA_KERBEROS_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.PARAMETERS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/parameters"+ "'", str0.equals("ViewVersionInfo/parameters"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.AMBARI_ALERT_HOST_NAME_OID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.7"+ "'", str0.equals("1.3.6.1.4.1.18060.16.1.1.1.7"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,org.apache.ambari.server.state.alert.SourceType> singularattribute_alertDefinitionEntity_sourceType0 = null;
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.sourceType = singularattribute_alertDefinitionEntity_sourceType0;

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK configGroupHostMappingEntityPK1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity configGroupHostMappingEntity2 = configGroupHostMappingDAO0.findByPK(configGroupHostMappingEntityPK1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertCurrentEntity,java.lang.String> singularattribute_alertCurrentEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertCurrentEntity_.latestText = singularattribute_alertCurrentEntity_str0;

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.AmbariMetaInfo.SERVICE_QUICKLINKS_CONFIGURATIONS_FOLDER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "quicklinks"+ "'", str0.equals("quicklinks"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    org.apache.ambari.server.api.services.ConfigGroupService configGroupService1 = new org.apache.ambari.server.api.services.ConfigGroupService("");
    javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = configGroupService1.createConfigGroup("Upgrade/to_version", httpHeaders3, uriInfo4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_CRT_PASS_FILE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_MAINTENANCE_STATE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/maintenance_state"+ "'", str0.equals("HostRoles/maintenance_state"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.cpuInfo = singularattribute_hostEntity_str0;

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,java.lang.Long> singularattribute_stageEntity_long0 = null;
    org.apache.ambari.server.orm.entities.StageEntity_.stageId = singularattribute_stageEntity_long0;

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackLevelConfigurationResourceProvider.PROPERTY_DESCRIPTION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackLevelConfigurations/property_description"+ "'", str0.equals("StackLevelConfigurations/property_description"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CLIENT_API_SSL_TSTR_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "blueprint_name", "StackLevelConfigurations/property_value_attributes" };
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.utils.ShellCommandUtil.Result result4 = org.apache.ambari.server.utils.ShellCommandUtil.runCommand(str_array2, map_str_str3);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.COMMAND_RETRY_MAX_TIME_IN_SEC_DEFAULT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "600"+ "'", str0.equals("600"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_ALT_USER_SEARCH_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    boolean b0 = org.apache.ambari.server.utils.ShellCommandUtil.WINDOWS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.BASE_AMBARI_OID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16"+ "'", str0.equals("1.3.6.1.4.1.18060.16"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PermissionResourceProvider.RESOURCE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PermissionInfo/resource_name"+ "'", str0.equals("PermissionInfo/resource_name"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_FAILED_ON_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/failed_on"+ "'", str0.equals("UpgradeChecks/failed_on"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.DESCRIPTION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/description"+ "'", str0.equals("ViewInstanceInfo/description"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.Integer> singularattribute_hostEntity_i0 = org.apache.ambari.server.orm.entities.HostEntity_.cpuCount;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_i0);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeItemResourceProvider.UPGRADE_REQUEST_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeItem/request_id"+ "'", str0.equals("UpgradeItem/request_id"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    org.apache.ambari.server.utils.CommandUtils commandUtils0 = new org.apache.ambari.server.utils.CommandUtils();

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider.PROPERTIES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceHostComponents/properties"+ "'", str0.equals("RootServiceHostComponents/properties"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    org.apache.ambari.server.bootstrap.BootStrapPostStatus.BSPostStat bSPostStat0 = org.apache.ambari.server.bootstrap.BootStrapPostStatus.BSPostStat.ERROR;
    org.junit.Assert.assertTrue("'" + bSPostStat0 + "' != '" + org.apache.ambari.server.bootstrap.BootStrapPostStatus.BSPostStat.ERROR + "'", bSPostStat0.equals(org.apache.ambari.server.bootstrap.BootStrapPostStatus.BSPostStat.ERROR));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.STACK_UPGRADE_BYPASS_PRECHECKS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    org.apache.ambari.server.events.publishers.JPAEventPublisher jPAEventPublisher0 = new org.apache.ambari.server.events.publishers.JPAEventPublisher();

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceConfigVersionResourceProvider.SERVICE_CONFIG_VERSION_SERVICE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "service_name"+ "'", str0.equals("service_name"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str0 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = null;
    org.apache.ambari.server.utils.SecretReference.replacePasswordsWithReferencesForCustomProperties(map_str_map_str_str0, map_str_str1, "type", (java.lang.Long)0L);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    java.lang.String str0 = org.apache.ambari.server.utils.ShellCommandUtil.MASK_EVERYBODY_RWX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "777"+ "'", str0.equals("777"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport0 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i1 = clusterHealthReport0.getInitStateHosts();
    int i2 = clusterHealthReport0.getAlertStatusHosts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider0 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization1 = groupPrivilegeResourceProvider0.getRequiredCreateAuthorizations();
    org.apache.ambari.server.controller.spi.Request request2 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource4 = groupPrivilegeResourceProvider0.getResources(request2, predicate3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization1);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StageResourceProvider.STAGE_CLUSTER_HOST_INFO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stage/cluster_host_info"+ "'", str0.equals("Stage/cluster_host_info"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.SESSION_ATTRIBUTES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "session_attributes"+ "'", str0.equals("session_attributes"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.AMS_WEBAPP_ADDRESS_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "timeline.metrics.service.webapp.address"+ "'", str0.equals("timeline.metrics.service.webapp.address"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.ServiceConfigVersionResponse serviceConfigVersionResponse2 = new org.apache.ambari.server.controller.ServiceConfigVersionResponse(serviceConfigEntity0, "Alert/component_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    java.io.Closeable closeable0 = null;
    org.slf4j.Logger logger1 = null;
    org.apache.ambari.server.utils.Closeables.closeLoggingExceptions(closeable0, logger1);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_RELEASE_COMPATIBLE_WITH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/release/compatible_with"+ "'", str0.equals("RepositoryVersions/release/compatible_with"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    java.security.SecureRandom secureRandom0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.authorization.internal.InternalTokenStorage internalTokenStorage1 = new org.apache.ambari.server.security.authorization.internal.InternalTokenStorage(secureRandom0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceComponentResourceProvider.PROPERTIES_SERVER_CLOCK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceComponents/server_clock"+ "'", str0.equals("RootServiceComponents/server_clock"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    java.lang.String str2 = org.apache.ambari.server.security.encryption.CredentialStoreServiceImpl.canonicalizeAlias("PermissionInfo/resource_name", "RootServiceComponents/service_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "cluster.permissioninfo/resource_name.rootservicecomponents/service_name"+ "'", str2.equals("cluster.permissioninfo/resource_name.rootservicecomponents/service_name"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    org.apache.ambari.server.controller.ivory.IvoryService ivoryService0 = null;
    java.lang.String[] str_array19 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str20 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str20, str_array19);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent22 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str20);
    java.lang.String[] str_array41 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str42 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str42, str_array41);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent44 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str42);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str42;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController46 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider47 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController46);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str48 = ldapSyncEventResourceProvider47.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController49 = null;
    com.google.inject.Injector injector50 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider51 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str42, map_type_str48, ambariManagementController49, injector50);
    org.apache.ambari.server.controller.internal.TargetClusterResourceProvider targetClusterResourceProvider52 = new org.apache.ambari.server.controller.internal.TargetClusterResourceProvider(ivoryService0, (java.util.Set<java.lang.String>)linkedhashset_str20, map_type_str48);
    org.apache.ambari.server.controller.spi.Request request53 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate54 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus55 = targetClusterResourceProvider52.deleteResources(request53, predicate54);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str48);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_RECOVERY_REPORT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/recovery_report"+ "'", str0.equals("Hosts/recovery_report"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    org.apache.ambari.server.state.Service service0 = null;
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo2 = null;
    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO3 = null;
    org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO4 = null;
    org.apache.ambari.server.state.ServiceComponentHostFactory serviceComponentHostFactory5 = null;
    org.apache.ambari.server.orm.dao.StackDAO stackDAO6 = null;
    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher7 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.ServiceComponentImpl serviceComponentImpl8 = new org.apache.ambari.server.state.ServiceComponentImpl(service0, "security", ambariMetaInfo2, serviceComponentDesiredStateDAO3, clusterServiceDAO4, serviceComponentHostFactory5, stackDAO6, ambariEventPublisher7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    org.apache.ambari.server.state.HostComponentAdminState hostComponentAdminState0 = org.apache.ambari.server.state.HostComponentAdminState.DECOMMISSIONING;
    org.junit.Assert.assertTrue("'" + hostComponentAdminState0 + "' != '" + org.apache.ambari.server.state.HostComponentAdminState.DECOMMISSIONING + "'", hostComponentAdminState0.equals(org.apache.ambari.server.state.HostComponentAdminState.DECOMMISSIONING));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertCurrentEntity,org.apache.ambari.server.orm.entities.AlertHistoryEntity> singularattribute_alertCurrentEntity_alertHistoryEntity0 = null;
    org.apache.ambari.server.orm.entities.AlertCurrentEntity_.alertHistory = singularattribute_alertCurrentEntity_alertHistoryEntity0;

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = org.apache.ambari.server.controller.internal.HostStatusHelper.isHostLive(ambariManagementController0, "kerberos_descriptor", "ViewUrlInfo/view_instance_version");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.SERVICE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "service_name"+ "'", str0.equals("service_name"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,org.apache.ambari.server.state.alert.Scope> singularattribute_alertDefinitionEntity_scope0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.scope;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_scope0);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    org.apache.ambari.server.topology.ClusterTopology clusterTopology0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.BlueprintConfigurationProcessor blueprintConfigurationProcessor1 = new org.apache.ambari.server.controller.internal.BlueprintConfigurationProcessor(clusterTopology0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.parsers.RequestBodyParser.REQUEST_BLOB_TITLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RequestBodyInfo"+ "'", str0.equals("RequestBodyInfo"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.BOOTSTRAP_SETUP_AGENT_PASSWORD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    org.apache.ambari.server.state.ServiceComponent serviceComponent0 = null;
    org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity1 = null;
    org.apache.ambari.server.orm.entities.HostComponentDesiredStateEntity hostComponentDesiredStateEntity2 = null;
    org.apache.ambari.server.state.Clusters clusters3 = null;
    org.apache.ambari.server.orm.dao.StackDAO stackDAO4 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO5 = null;
    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO6 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO7 = null;
    org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO8 = null;
    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher9 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener alertLifecycleListener10 = new org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener(ambariEventPublisher9);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl serviceComponentHostImpl11 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl(serviceComponent0, hostComponentStateEntity1, hostComponentDesiredStateEntity2, clusters3, stackDAO4, hostDAO5, serviceComponentDesiredStateDAO6, hostComponentStateDAO7, hostComponentDesiredStateDAO8, ambariEventPublisher9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.gsinstaller.GSInstallerNoOpProvider gSInstallerNoOpProvider2 = new org.apache.ambari.server.controller.gsinstaller.GSInstallerNoOpProvider(type0, clusterDefinition1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.CLUSTER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "name"+ "'", str0.equals("name"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    org.apache.ambari.server.view.ViewArchiveUtility viewArchiveUtility0 = new org.apache.ambari.server.view.ViewArchiveUtility();
    java.io.File file1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.jar.JarInputStream jarInputStream2 = viewArchiveUtility0.getJarFileStream(file1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.services.ResultPostProcessorImpl resultPostProcessorImpl5 = new org.apache.ambari.server.api.services.ResultPostProcessorImpl((org.apache.ambari.server.api.services.Request)postRequest4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceComponentResourceProvider.COMPONENT_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceComponents/component_version"+ "'", str0.equals("RootServiceComponents/component_version"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    org.apache.ambari.server.topology.BlueprintFactory blueprintFactory0 = null;
    org.apache.ambari.server.orm.dao.BlueprintDAO blueprintDAO1 = null;
    org.apache.ambari.server.topology.SecurityConfigurationFactory securityConfigurationFactory2 = null;
    com.google.gson.Gson gson3 = null;
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo4 = null;
    org.apache.ambari.server.controller.internal.BlueprintResourceProvider.init(blueprintFactory0, blueprintDAO1, securityConfigurationFactory2, gson3, ambariMetaInfo4);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertResourceProvider.ALERT_HOST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Alert/host_name"+ "'", str0.equals("Alert/host_name"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    int i5 = postRequest4.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type6 = postRequest4.getRequestType();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = postRequest4.getURI();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type6.equals(org.apache.ambari.server.api.services.Request.Type.POST));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.AUTHENTICATED_USER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "authenticated_user_name"+ "'", str0.equals("authenticated_user_name"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization1 = org.apache.ambari.server.security.authorization.RoleAuthorization.translate("UpgradeItem/request_id");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    java.lang.String str0 = org.apache.ambari.server.controller.utilities.KerberosChecker.JAVA_SECURITY_AUTH_LOGIN_CONFIG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "java.security.auth.login.config"+ "'", str0.equals("java.security.auth.login.config"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    org.apache.ambari.server.controller.utilities.state.YARNServiceCalculatedState yARNServiceCalculatedState0 = new org.apache.ambari.server.controller.utilities.state.YARNServiceCalculatedState();
    org.apache.ambari.server.state.State state3 = yARNServiceCalculatedState0.getState("METRICS_COLLECTOR", "Hosts/maintenance_state");
    org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.apache.ambari.server.state.State.UNKNOWN + "'", state3.equals(org.apache.ambari.server.state.State.UNKNOWN));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CredentialResourceProvider.CREDENTIAL_KEY_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Credential/key"+ "'", str0.equals("Credential/key"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.STACK_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Blueprints/stack_name"+ "'", str0.equals("Blueprints/stack_name"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    org.apache.ambari.server.state.Cluster cluster0 = null;
    org.apache.ambari.server.orm.entities.RequestScheduleEntity requestScheduleEntity1 = null;
    com.google.inject.Injector injector2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.scheduler.RequestExecutionImpl requestExecutionImpl3 = new org.apache.ambari.server.state.scheduler.RequestExecutionImpl(cluster0, requestScheduleEntity1, injector2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo0 = new org.apache.ambari.server.state.ChangedConfigInfo();
    boolean b2 = changedConfigInfo0.equals((java.lang.Object)"UpgradeChecks/repository_version");
    changedConfigInfo0.setName("StackConfigurations/property_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    org.apache.ambari.server.metadata.ActionMetadata actionMetadata0 = new org.apache.ambari.server.metadata.ActionMetadata();
    actionMetadata0.addServiceCheckAction("type");

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    org.apache.ambari.server.controller.StackVersionRequest stackVersionRequest2 = new org.apache.ambari.server.controller.StackVersionRequest("cluster.permissioninfo/resource_name.rootservicecomponents/service_name", "java_version");

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HBASE_MASTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel1 = new org.apache.ambari.server.controller.internal.RequestOperationLevel(map_str_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType0 = org.apache.ambari.server.state.stack.PrereqCheckType.CLUSTER;
    org.junit.Assert.assertTrue("'" + prereqCheckType0 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.CLUSTER + "'", prereqCheckType0.equals(org.apache.ambari.server.state.stack.PrereqCheckType.CLUSTER));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    org.apache.ambari.server.topology.ConfigRecommendationStrategy configRecommendationStrategy0 = org.apache.ambari.server.topology.ConfigRecommendationStrategy.ALWAYS_APPLY_DONT_OVERRIDE_CUSTOM_VALUES;
    org.junit.Assert.assertTrue("'" + configRecommendationStrategy0 + "' != '" + org.apache.ambari.server.topology.ConfigRecommendationStrategy.ALWAYS_APPLY_DONT_OVERRIDE_CUSTOM_VALUES + "'", configRecommendationStrategy0.equals(org.apache.ambari.server.topology.ConfigRecommendationStrategy.ALWAYS_APPLY_DONT_OVERRIDE_CUSTOM_VALUES));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionVersionResourceProvider.EXTENSION_ERROR_SET;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/extension-errors"+ "'", str0.equals("Versions/extension-errors"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str0 = null;
    org.apache.ambari.server.state.Cluster cluster1 = null;
    org.apache.ambari.server.utils.SecretReference.replaceReferencesWithPasswords(map_str_str0, cluster1);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.CLUSTER_ENV_STACK_FEATURES_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "stack_features"+ "'", str0.equals("stack_features"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = mySqlHelper1.getSetNullableStatement("downgrade_from_version", dBColumnInfo3, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    org.apache.ambari.server.state.kerberos.KerberosDescriptorUpdateHelper kerberosDescriptorUpdateHelper0 = new org.apache.ambari.server.state.kerberos.KerberosDescriptorUpdateHelper();

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    org.apache.ambari.server.orm.entities.AlertDefinitionEntity_ alertDefinitionEntity_0 = new org.apache.ambari.server.orm.entities.AlertDefinitionEntity_();

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    java.lang.String str1 = org.apache.ambari.server.utils.AmbariPath.getPath("RecoveryReport{summary='DISABLED', component_reports='[]'}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RecoveryReport{summary='DISABLED', component_reports='[]'}"+ "'", str1.equals("RecoveryReport{summary='DISABLED', component_reports='[]'}"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.controller.internal.ClusterPrivilegeResourceProvider.init(clusterDAO0);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS0 = org.apache.ambari.server.api.services.ResultStatus.STATUS.OK;
    org.junit.Assert.assertTrue("'" + sTATUS0 + "' != '" + org.apache.ambari.server.api.services.ResultStatus.STATUS.OK + "'", sTATUS0.equals(org.apache.ambari.server.api.services.ResultStatus.STATUS.OK));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_DESIRED_CONFIGS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/desired_configs"+ "'", str0.equals("Clusters/desired_configs"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    org.apache.ambari.server.state.PropertyStackUpgradeBehavior propertyStackUpgradeBehavior1 = new org.apache.ambari.server.state.PropertyStackUpgradeBehavior(true);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceComponentResourceProvider.COMPONENT_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceComponents/component_name"+ "'", str0.equals("RootServiceComponents/component_name"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    int i0 = org.apache.ambari.server.utils.RetryHelper.getOperationsRetryAttempts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType1 = org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE;
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = null;
    org.apache.ambari.server.checks.CheckDescription checkDescription4 = new org.apache.ambari.server.checks.CheckDescription("alerts.json", prereqCheckType1, "recovery_settings", map_str_str3);
    org.junit.Assert.assertTrue("'" + prereqCheckType1 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE + "'", prereqCheckType1.equals(org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.TIMELINE_METRICS_CLUSTER_AGGREGATOR_INTERPOLATION_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "timeline.metrics.cluster.aggregator.interpolation.enabled"+ "'", str0.equals("timeline.metrics.cluster.aggregator.interpolation.enabled"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    java.lang.String str0 = org.apache.ambari.server.agent.RecoveryConfigHelper.RECOVERY_TYPE_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "recovery_type"+ "'", str0.equals("recovery_type"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    org.apache.ambari.server.checks.HealthCheck healthCheck0 = new org.apache.ambari.server.checks.HealthCheck();

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_USE_SSL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    java.lang.String str0 = org.apache.ambari.server.api.resources.AlertTargetResourceDefinition.OVERWRITE_DIRECTIVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "overwrite_existing"+ "'", str0.equals("overwrite_existing"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    org.apache.ambari.server.topology.AmbariContext.TaskType taskType0 = org.apache.ambari.server.topology.AmbariContext.TaskType.START;
    org.junit.Assert.assertTrue("'" + taskType0 + "' != '" + org.apache.ambari.server.topology.AmbariContext.TaskType.START + "'", taskType0.equals(org.apache.ambari.server.topology.AmbariContext.TaskType.START));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    org.apache.ambari.server.StackAccessException stackAccessException1 = new org.apache.ambari.server.StackAccessException("stack_name");

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.ambari.server.controller.internal.RequestOperationLevel.getExternalLevelName("security");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    java.lang.String str0 = org.apache.ambari.server.topology.SecurityConfigurationFactory.SECURITY_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "security"+ "'", str0.equals("security"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isClient();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog250.COMPONENT_VERSION_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "servicecomponent_version"+ "'", str0.equals("servicecomponent_version"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOSTGROUP_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_group"+ "'", str0.equals("host_group"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.lastAttemptTime = singularattribute_hostRoleCommandEntity_long0;

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserAuthorizationResourceProvider.AUTHORIZATION_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AuthorizationInfo/authorization_name"+ "'", str0.equals("AuthorizationInfo/authorization_name"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.OOZIE_SERVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = org.apache.ambari.server.controller.internal.HostStatusHelper.isHostComponentLive(ambariManagementController0, "VersionDefinition/stack_name", "Clusters/cluster_name", "Versions/stack-errors", "blueprint_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    org.apache.ambari.server.api.services.TaskService taskService3 = new org.apache.ambari.server.api.services.TaskService("PrivilegeInfo/privilege_id", "", "StackLevelConfigurations/type");
    javax.ws.rs.core.HttpHeaders httpHeaders5 = null;
    javax.ws.rs.core.UriInfo uriInfo6 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = taskService3.getTask("Stage/cluster_host_info", httpHeaders5, uriInfo6, "ViewInstanceInfo/cluster_handle");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    javax.persistence.metamodel.SetAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity,org.apache.ambari.server.orm.entities.AlertGroupEntity> setattribute_alertTargetEntity_alertGroupEntity0 = org.apache.ambari.server.orm.entities.AlertTargetEntity_.alertGroups;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(setattribute_alertTargetEntity_alertGroupEntity0);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    org.apache.ambari.server.api.services.HostComponentService hostComponentService2 = new org.apache.ambari.server.api.services.HostComponentService("manage_identities", "service_name");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = hostComponentService2.updateHostComponents("ViewVersionInfo/archive", httpHeaders4, uriInfo5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.gsinstaller.GSInstallerClusterProvider gSInstallerClusterProvider1 = new org.apache.ambari.server.controller.gsinstaller.GSInstallerClusterProvider(clusterDefinition0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.REQUEST_LOG_RETAINDAYS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    org.apache.ambari.server.metrics.system.impl.JvmMetricsSource jvmMetricsSource0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.metrics.system.impl.JvmMetricsSource.NonNumericMetricFilter nonNumericMetricFilter1 = jvmMetricsSource0.new NonNumericMetricFilter();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFileWriterFactory kerberosIdentityDataFileWriterFactory0 = new org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFileWriterFactory();

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    org.apache.ambari.server.controller.ServiceComponentRequest serviceComponentRequest5 = new org.apache.ambari.server.controller.ServiceComponentRequest("", "hi!", "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url");
    java.lang.String str6 = serviceComponentRequest5.getDesiredState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "WidgetLayoutInfo/section_name"+ "'", str6.equals("WidgetLayoutInfo/section_name"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    java.lang.String str0 = org.apache.ambari.server.topology.Setting.SETTING_NAME_SKIP_FAILURE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "skip_failure"+ "'", str0.equals("skip_failure"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.VIEW_EXTRACTION_THREADPOOL_TIMEOUT;
    java.lang.String str1 = configurationproperty_long0.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_long0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "view.extraction.threadpool.timeout"+ "'", str1.equals("view.extraction.threadpool.timeout"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    java.lang.String str0 = org.apache.ambari.server.controller.metrics.RestMetricsPropertyProvider.URL_PATH_SEPARATOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "##"+ "'", str0.equals("##"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.THREAD_POOL_SIZE_FOR_EXTERNAL_SCRIPT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    org.apache.ambari.server.security.credential.InvalidCredentialValueException invalidCredentialValueException1 = new org.apache.ambari.server.security.credential.InvalidCredentialValueException("host_group");

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    org.apache.ambari.server.update.HostUpdateHelper hostUpdateHelper0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.update.HostUpdateHelper.StringComparator stringComparator1 = hostUpdateHelper0.new StringComparator();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    org.apache.ambari.server.state.NotificationState notificationState0 = org.apache.ambari.server.state.NotificationState.DELIVERED;
    org.junit.Assert.assertTrue("'" + notificationState0 + "' != '" + org.apache.ambari.server.state.NotificationState.DELIVERED + "'", notificationState0.equals(org.apache.ambari.server.state.NotificationState.DELIVERED));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = mySqlHelper1.getSetNullableStatement("host_predicate", dBColumnInfo3, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider.REPOSITORY_VERSION_STACK_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CompatibleRepositoryVersions/stack_name"+ "'", str0.equals("CompatibleRepositoryVersions/stack_name"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    org.apache.ambari.server.api.services.SettingService settingService0 = new org.apache.ambari.server.api.services.SettingService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = settingService0.getSetting("servicecomponent_version", httpHeaders2, uriInfo3, "777");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type0 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper2 = null;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] taskWrapper_array3 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] { taskWrapper2 };
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper4 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type0, "WidgetLayoutInfo/section_name", taskWrapper_array3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = stageWrapper4.getHostsJson();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP + "'", type0.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(taskWrapper_array3);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    org.apache.ambari.server.utils.EventBusSynchronizer eventBusSynchronizer0 = new org.apache.ambari.server.utils.EventBusSynchronizer();

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity configGroupHostMappingEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity configGroupHostMappingEntity2 = configGroupHostMappingDAO0.merge(configGroupHostMappingEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.PrivilegeResourceDefinition privilegeResourceDefinition1 = new org.apache.ambari.server.api.resources.PrivilegeResourceDefinition(type0);
    java.util.Collection<java.lang.String> collection_str2 = privilegeResourceDefinition1.getDeleteDirectives();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    java.util.Collection<org.apache.ambari.server.Role> collection_role0 = org.apache.ambari.server.Role.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_role0);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    java.lang.Iterable<org.apache.ambari.server.controller.spi.Resource> iterable_resource0 = null;
    org.apache.ambari.server.controller.spi.Resource resource2 = null;
    org.apache.ambari.server.controller.spi.Resource resource3 = null;
    org.apache.ambari.server.controller.internal.PageResponseImpl pageResponseImpl5 = new org.apache.ambari.server.controller.internal.PageResponseImpl(iterable_resource0, (int)(byte)0, resource2, resource3, (java.lang.Integer)0);
    java.lang.Integer i6 = pageResponseImpl5.getTotalResourceCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.SQOOP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    org.apache.ambari.server.state.ServiceInfo.Selection selection0 = org.apache.ambari.server.state.ServiceInfo.Selection.MANDATORY;
    org.junit.Assert.assertTrue("'" + selection0 + "' != '" + org.apache.ambari.server.state.ServiceInfo.Selection.MANDATORY + "'", selection0.equals(org.apache.ambari.server.state.ServiceInfo.Selection.MANDATORY));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_USERNAME_ATTRIBUTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo[] dBColumnInfo_array3 = new org.apache.ambari.server.orm.DBAccessor.DBColumnInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.orm.DBAccessor.DBColumnInfo> arraylist_dBColumnInfo4 = new java.util.ArrayList<org.apache.ambari.server.orm.DBAccessor.DBColumnInfo>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.DBAccessor.DBColumnInfo>)arraylist_dBColumnInfo4, dBColumnInfo_array3);
    java.util.List<java.lang.String> list_str6 = org.apache.ambari.server.controller.utilities.PropertyHelper.AGGREGATE_FUNCTION_IDENTIFIERS;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = mySqlHelper1.getCreateTableStatement("Alert/component_name", (java.util.List<org.apache.ambari.server.orm.DBAccessor.DBColumnInfo>)arraylist_dBColumnInfo4, list_str6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dBColumnInfo_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Integer> singularattribute_hostRoleCommandEntity_i0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.exitcode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_i0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_CUST_CMD_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/custom_command_name"+ "'", str0.equals("Tasks/custom_command_name"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.AGENT_STACK_RETRY_ON_UNAVAILABILITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "agent_stack_retry_on_unavailability"+ "'", str0.equals("agent_stack_retry_on_unavailability"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    org.apache.ambari.server.state.ServiceInfo.Selection selection0 = org.apache.ambari.server.state.ServiceInfo.Selection.TECH_PREVIEW;
    org.junit.Assert.assertTrue("'" + selection0 + "' != '" + org.apache.ambari.server.state.ServiceInfo.Selection.TECH_PREVIEW + "'", selection0.equals(org.apache.ambari.server.state.ServiceInfo.Selection.TECH_PREVIEW));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    org.apache.ambari.server.orm.dao.BlueprintDAO blueprintDAO0 = null;
    org.apache.ambari.server.topology.BlueprintFactory.init(blueprintDAO0);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.AmbariMetaInfo.SERVICE_ADVISOR_FILE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "service_advisor.py"+ "'", str0.equals("service_advisor.py"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = org.apache.ambari.server.orm.entities.HostEntity_.cpuInfo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_str0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/host_name"+ "'", str0.equals("Hosts/host_name"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    boolean b1 = org.apache.ambari.server.utils.XmlUtils.isValidXml("600");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    org.apache.ambari.server.security.CertificateManager certificateManager0 = null;
    org.apache.ambari.server.security.unsecured.rest.CertificateSign.init(certificateManager0);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport0 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i1 = clusterHealthReport0.getInitStateHosts();
    clusterHealthReport0.setInitStateHosts((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceResourceProvider.SERVICE_CREDENTIAL_STORE_SUPPORTED_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ServiceInfo/credential_store_supported"+ "'", str0.equals("ServiceInfo/credential_store_supported"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.upgrades.FinalizeUpgradeAction.CLUSTER_NAME_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cluster_name"+ "'", str0.equals("cluster_name"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    org.apache.ambari.server.topology.TopologyRequest topologyRequest1 = null;
    org.apache.ambari.server.topology.PersistedTopologyRequest persistedTopologyRequest2 = new org.apache.ambari.server.topology.PersistedTopologyRequest((long)(byte)-1, topologyRequest1);
    org.apache.ambari.server.topology.TopologyRequest topologyRequest3 = persistedTopologyRequest2.getRequest();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(topologyRequest3);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.RECOVERY_LIFETIME_MAX_COUNT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = null;
    org.apache.ambari.server.api.services.RepositoryService repositoryService1 = new org.apache.ambari.server.api.services.RepositoryService(map_type_str0);
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = repositoryService1.getRepositories(httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    org.apache.ambari.server.controller.spi.ProviderModule providerModule0 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl1 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule0);
    org.apache.ambari.server.controller.spi.Resource.Type type2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.ResourceProvider resourceProvider3 = clusterControllerImpl1.ensureResourceProvider(type2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.taskId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_long0);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity,java.lang.String> singularattribute_alertTargetEntity_str0 = org.apache.ambari.server.orm.entities.AlertTargetEntity_.description;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertTargetEntity_str0);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    java.lang.String str0 = org.apache.ambari.server.controller.metrics.RestMetricsPropertyProvider.DOCUMENT_PATH_SEPARATOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "#"+ "'", str0.equals("#"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = null;
    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRunner stackAdvisorRunner1 = null;
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorHelper stackAdvisorHelper3 = new org.apache.ambari.server.api.services.stackadvisor.StackAdvisorHelper(configuration0, stackAdvisorRunner1, ambariMetaInfo2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    org.apache.ambari.server.actionmanager.CommandExecutionType commandExecutionType0 = org.apache.ambari.server.actionmanager.CommandExecutionType.STAGE;
    org.junit.Assert.assertTrue("'" + commandExecutionType0 + "' != '" + org.apache.ambari.server.actionmanager.CommandExecutionType.STAGE + "'", commandExecutionType0.equals(org.apache.ambari.server.actionmanager.CommandExecutionType.STAGE));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Masked masked0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Masked();

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.Long> singularattribute_alertDefinitionEntity_long0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.definitionId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_long0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,org.apache.ambari.server.state.AlertState> singularattribute_alertHistoryEntity_alertState0 = null;
    org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertState = singularattribute_alertHistoryEntity_alertState0;

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RemoteClusterResourceProvider.CLUSTER_URL_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ClusterInfo/url"+ "'", str0.equals("ClusterInfo/url"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeItemResourceProvider.UPGRADE_GROUP_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeItem/group_id"+ "'", str0.equals("UpgradeItem/group_id"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    org.apache.ambari.server.metadata.RoleCommandOrder roleCommandOrder0 = new org.apache.ambari.server.metadata.RoleCommandOrder();
    org.apache.ambari.server.state.Cluster cluster1 = null;
    // The following exception was thrown during execution in test generation
    try {
    roleCommandOrder0.initialize(cluster1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    int i0 = org.apache.ambari.server.proxy.ProxyService.HTTP_ERROR_RANGE_START;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 400);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    org.apache.ambari.server.ClusterNotFoundException clusterNotFoundException2 = new org.apache.ambari.server.ClusterNotFoundException((java.lang.Long)10L);
    org.apache.ambari.server.ObjectNotFoundException objectNotFoundException3 = new org.apache.ambari.server.ObjectNotFoundException("Hosts/last_registration_time", (org.apache.ambari.server.ObjectNotFoundException)clusterNotFoundException2);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    org.apache.ambari.server.api.resources.RemoteClusterResourceDefinition remoteClusterResourceDefinition0 = new org.apache.ambari.server.api.resources.RemoteClusterResourceDefinition();

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str0 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>>> map_str_map_str_map_str_str1 = null;
    org.apache.ambari.server.state.ConfigHelper.processHiddenAttribute(map_str_map_str_str0, map_str_map_str_map_str_str1, "The directory already exists, skipping.", true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_STALE_CONFIGS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/stale_configs"+ "'", str0.equals("HostRoles/stale_configs"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    java.lang.String str1 = org.apache.ambari.server.utils.DateUtils.convertToReadableTime((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1969-12-31 16:00:00"+ "'", str1.equals("1969-12-31 16:00:00"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    org.apache.ambari.server.hooks.users.UserHookParams userHookParams0 = org.apache.ambari.server.hooks.users.UserHookParams.SCRIPT;
    org.junit.Assert.assertTrue("'" + userHookParams0 + "' != '" + org.apache.ambari.server.hooks.users.UserHookParams.SCRIPT + "'", userHookParams0.equals(org.apache.ambari.server.hooks.users.UserHookParams.SCRIPT));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity2 = serviceComponentDesiredStateDAO0.merge(serviceComponentDesiredStateEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackLevelConfigurationResourceProvider.PROPERTY_FINAL_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackLevelConfigurations/final"+ "'", str0.equals("StackLevelConfigurations/final"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator0 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.Predicate predicate3 = isEmptyOperator0.toPredicate("cluster.permissioninfo/resource_name.rootservicecomponents/service_name", "AlertTarget/name");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.api.predicate.InvalidQueryException");
    } catch (org.apache.ambari.server.api.predicate.InvalidQueryException e) {
      // Expected exception.
    }

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    org.apache.ambari.server.orm.DBAccessor dBAccessor0 = null;
    com.google.inject.Injector injector1 = null;
    com.google.inject.persist.PersistService persistService2 = null;
    org.apache.ambari.server.checks.MpackInstallChecker mpackInstallChecker3 = new org.apache.ambari.server.checks.MpackInstallChecker(dBAccessor0, injector1, persistService2);
    org.apache.ambari.server.state.repository.AvailableServiceReference availableServiceReference4 = new org.apache.ambari.server.state.repository.AvailableServiceReference();
    java.lang.String[] str_array23 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str24 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str24, str_array23);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent26 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str24);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str24;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController28 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider29 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController28);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str30 = ldapSyncEventResourceProvider29.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController31 = null;
    com.google.inject.Injector injector32 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider33 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str24, map_type_str30, ambariManagementController31, injector32);
    org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str24;
    availableServiceReference4.components = linkedhashset_str24;
    // The following exception was thrown during execution in test generation
    try {
    mpackInstallChecker3.checkClusters((java.util.HashSet<java.lang.String>)linkedhashset_str24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str30);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    org.apache.ambari.server.topology.Blueprint blueprint0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.BlueprintValidatorImpl blueprintValidatorImpl1 = new org.apache.ambari.server.topology.BlueprintValidatorImpl(blueprint0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostWipeoutEvent serviceComponentHostWipeoutEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostWipeoutEvent("1.3.6.1.4.1.18060.16.1.1.1.7", "ViewInstanceInfo/view_name", 1L);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    org.apache.ambari.server.topology.TopologyRequest topologyRequest1 = null;
    org.apache.ambari.server.topology.ClusterTopology clusterTopology2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.LogicalRequest logicalRequest3 = new org.apache.ambari.server.topology.LogicalRequest((java.lang.Long)(-1L), topologyRequest1, clusterTopology2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostDisableEvent serviceComponentHostDisableEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostDisableEvent("Alert/component_name", "Alert/component_name", (long)(short)1);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterKerberosDescriptorResourceProvider.DIRECTIVE_EVALUATE_WHEN_CLAUSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "evaluate_when"+ "'", str0.equals("evaluate_when"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    org.apache.ambari.server.actionmanager.Stage[] stage_array0 = new org.apache.ambari.server.actionmanager.Stage[] {  };
    java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage> arraylist_stage1 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>)arraylist_stage1, stage_array0);
    org.apache.ambari.server.state.Clusters clusters3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.actionmanager.Request request4 = new org.apache.ambari.server.actionmanager.Request((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>)arraylist_stage1, clusters3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stage_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.MASTER_KEY_LOCATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    org.apache.ambari.server.controller.ServiceComponentRequest serviceComponentRequest5 = new org.apache.ambari.server.controller.ServiceComponentRequest("", "hi!", "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url");
    java.lang.String str6 = serviceComponentRequest5.getRecoveryEnabled();
    serviceComponentRequest5.setComponentCategory("Tasks/custom_command_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Repositories/latest_base_url"+ "'", str6.equals("Repositories/latest_base_url"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
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
    org.apache.ambari.server.api.resources.JobResourceDefinition jobResourceDefinition30 = new org.apache.ambari.server.api.resources.JobResourceDefinition();
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer32 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule33 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl34 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule33);
    metricsPaddingRenderer32.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl34);
    org.apache.ambari.server.api.query.QueryImpl queryImpl36 = new org.apache.ambari.server.api.query.QueryImpl(map_type_str26, (org.apache.ambari.server.api.resources.ResourceDefinition)jobResourceDefinition30, (org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl34);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.resources.ResourceDefinition resourceDefinition37 = org.apache.ambari.server.api.resources.ResourceInstanceFactoryImpl.getResourceDefinition(type0, map_type_str26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str26);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    org.apache.ambari.server.state.Cluster cluster0 = null;
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType1 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    org.apache.ambari.server.state.stack.upgrade.Direction direction2 = null;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj3 = null;
    org.apache.ambari.server.state.UpgradeContext upgradeContext4 = new org.apache.ambari.server.state.UpgradeContext(cluster0, upgradeType1, direction2, map_str_obj3);
    upgradeContext4.setAutoSkipComponentFailures(true);
    upgradeContext4.setAutoSkipComponentFailures(false);
    org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.AbstractUpgradeCatalog.PROPERTY_RANGER_HBASE_PLUGIN_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ranger-hbase-plugin-enabled"+ "'", str0.equals("ranger-hbase-plugin-enabled"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    org.apache.ambari.server.controller.spi.ProviderModule providerModule0 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl1 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule0);
    org.apache.ambari.server.controller.spi.Resource.Type type2 = null;
    org.apache.ambari.server.controller.spi.Resource[] resource_array3 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource4 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource4, resource_array3);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl9 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource4, true, false, (int)'#');
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl10 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource4);
    java.lang.String[] str_array13 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request14 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array13);
    org.apache.ambari.server.controller.spi.Predicate predicate15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource16 = clusterControllerImpl1.populateResources(type2, (java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource4, request14, predicate15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request14);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO0 = new org.apache.ambari.server.orm.dao.ClusterServiceDAO();
    org.apache.ambari.server.orm.entities.ClusterServiceEntityPK clusterServiceEntityPK1 = null;
    // The following exception was thrown during execution in test generation
    try {
    clusterServiceDAO0.removeByPK(clusterServiceEntityPK1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException1 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException("Hosts/last_registration_time");

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    org.apache.ambari.server.actionmanager.HostRoleCommand hostRoleCommand0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.ShortTaskStatus shortTaskStatus1 = new org.apache.ambari.server.controller.ShortTaskStatus(hostRoleCommand0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.TIMEDOUT;
    org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.TIMEDOUT + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.TIMEDOUT));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType stackAdvisorCommandType0 = org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_COMPONENT_LAYOUT;
    org.junit.Assert.assertTrue("'" + stackAdvisorCommandType0 + "' != '" + org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_COMPONENT_LAYOUT + "'", stackAdvisorCommandType0.equals(org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_COMPONENT_LAYOUT));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    java.lang.String str0 = org.apache.ambari.server.agent.RecoveryConfigHelper.RECOVERY_RETRY_GAP_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "recovery_retry_interval"+ "'", str0.equals("recovery_retry_interval"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyManageAuthorization("", (java.lang.Long)0L);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.AMS_SERVICE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AMBARI_METRICS"+ "'", str0.equals("AMBARI_METRICS"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor2 = null;
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor3 = null;
    org.apache.ambari.server.collections.Predicate predicate4 = null;
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor5 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor("RootServiceComponents/ciphers", "StackConfigurations/property_value_attributes", kerberosPrincipalDescriptor2, kerberosKeytabDescriptor3, predicate4);
    org.apache.ambari.server.state.CheckHelper checkHelper6 = new org.apache.ambari.server.state.CheckHelper();
    boolean b7 = kerberosIdentityDescriptor5.equals((java.lang.Object)checkHelper6);
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor8 = kerberosIdentityDescriptor5.getKeytabDescriptor();
    org.apache.ambari.server.collections.Predicate predicate9 = null;
    kerberosIdentityDescriptor5.setWhen(predicate9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(kerberosKeytabDescriptor8);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj0 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor1 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj0);
    org.apache.ambari.server.controller.predicate.ArrayPredicate arrayPredicate2 = null;
    // The following exception was thrown during execution in test generation
    try {
    extendedResourcePredicateVisitor1.acceptArrayPredicate(arrayPredicate2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.HBASE_SITE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hbase-site"+ "'", str0.equals("hbase-site"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationDependencyResourceProvider.DEPENDENCY_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurationDependency/dependency_name"+ "'", str0.equals("StackConfigurationDependency/dependency_name"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CLIENT_API_SSL_KSTR_DIR_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    org.apache.ambari.server.state.UpgradeState upgradeState0 = org.apache.ambari.server.state.UpgradeState.VERSION_MISMATCH;
    org.junit.Assert.assertTrue("'" + upgradeState0 + "' != '" + org.apache.ambari.server.state.UpgradeState.VERSION_MISMATCH + "'", upgradeState0.equals(org.apache.ambari.server.state.UpgradeState.VERSION_MISMATCH));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.CLUSTER_ENV;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cluster-env"+ "'", str0.equals("cluster-env"));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    org.apache.ambari.server.configuration.Configuration.DatabaseType databaseType0 = org.apache.ambari.server.configuration.Configuration.DatabaseType.MYSQL;
    org.junit.Assert.assertTrue("'" + databaseType0 + "' != '" + org.apache.ambari.server.configuration.Configuration.DatabaseType.MYSQL + "'", databaseType0.equals(org.apache.ambari.server.configuration.Configuration.DatabaseType.MYSQL));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO0 = new org.apache.ambari.server.orm.dao.ClusterServiceDAO();
    org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    clusterServiceDAO0.refresh(clusterServiceEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertHistoryResourceProvider.ALERT_HISTORY_CLUSTER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertHistory/cluster_name"+ "'", str0.equals("AlertHistory/cluster_name"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder2 = deleteViewInstanceRequestAuditEventBuilder0.withUserName("hi!");
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder4 = deleteViewInstanceRequestAuditEventBuilder2.withVersion("yarn.scheduler.capacity.root");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder4);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.AUDIT_LOGGER_CAPACITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.AGENT_PACKAGE_INSTALL_TASK_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_long0);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    java.util.AbstractMap.SimpleEntry<java.lang.String,java.lang.String> simpleentry_str_str0 = org.apache.ambari.server.state.ServiceInfo.DEFAULT_SERVICE_INSTALLABLE_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(simpleentry_str_str0);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    org.apache.ambari.server.orm.DBAccessor dBAccessor0 = null;
    com.google.inject.Injector injector1 = null;
    com.google.inject.persist.PersistService persistService2 = null;
    org.apache.ambari.server.checks.MpackInstallChecker mpackInstallChecker3 = new org.apache.ambari.server.checks.MpackInstallChecker(dBAccessor0, injector1, persistService2);
    // The following exception was thrown during execution in test generation
    try {
    mpackInstallChecker3.startPersistenceService();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFile.PRINCIPAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "principal"+ "'", str0.equals("principal"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.NAMENODE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    org.apache.ambari.server.actionmanager.ActionManager actionManager0 = null;
    org.apache.ambari.server.state.Clusters clusters1 = null;
    com.google.inject.Injector injector2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.AmbariManagementControllerImpl ambariManagementControllerImpl3 = new org.apache.ambari.server.controller.AmbariManagementControllerImpl(actionManager0, clusters1, injector2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AlertScriptDispatcher.SCRIPT_CONFIG_TIMEOUT_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "notification.dispatch.alert.script.timeout"+ "'", str0.equals("notification.dispatch.alert.script.timeout"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog220 upgradeCatalog2201 = new org.apache.ambari.server.upgrade.UpgradeCatalog220(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.HBASE_SITE_HBASE_COPROCESSOR_REGIONSERVER_CLASSES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hbase.coprocessor.regionserver.classes"+ "'", str0.equals("hbase.coprocessor.regionserver.classes"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    java.lang.String str0 = org.apache.ambari.server.stack.ThemeModule.THEME_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Theme"+ "'", str0.equals("Theme"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertResourceProvider.ALERT_TEXT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Alert/text"+ "'", str0.equals("Alert/text"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_USER_PASSWD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.VERSION_MISMATCH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    org.apache.ambari.server.state.RepositoryInfo[] repositoryInfo_array0 = new org.apache.ambari.server.state.RepositoryInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.RepositoryInfo> arraylist_repositoryInfo1 = new java.util.ArrayList<org.apache.ambari.server.state.RepositoryInfo>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.RepositoryInfo>)arraylist_repositoryInfo1, repositoryInfo_array0);
    java.util.List<org.apache.ambari.server.controller.RepositoryResponse> list_repositoryResponse6 = org.apache.ambari.server.stack.RepoUtil.asResponses((java.util.List<org.apache.ambari.server.state.RepositoryInfo>)arraylist_repositoryInfo1, "host_predicate", "AlertTarget/notification_type", "1.3.6.1.4.1.18060.16");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(repositoryInfo_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_repositoryResponse6);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder();

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    java.lang.String str0 = org.apache.ambari.server.metrics.system.impl.MetricsConfiguration.CONFIG_FILE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "metrics.properties"+ "'", str0.equals("metrics.properties"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.ambari.server.utils.RequestUtils.getRemoteAddress(httpServletRequest0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    java.io.File file1 = null;
    org.apache.ambari.server.state.StackInfo stackInfo2 = null;
    org.apache.ambari.server.state.stack.OsFamily osFamily3 = null;
    org.apache.ambari.server.state.stack.LatestRepoCallable latestRepoCallable4 = new org.apache.ambari.server.state.stack.LatestRepoCallable("kerberos_descriptor", file1, stackInfo2, osFamily3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Void void5 = org.apache.ambari.server.utils.RetryHelper.executeWithRetry((java.util.concurrent.Callable<java.lang.Void>)latestRepoCallable4);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
    } catch (org.apache.ambari.server.AmbariException e) {
      // Expected exception.
    }

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type0 = org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Update;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Update + "'", type0.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Update));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition configUpgradeChangeDefinition0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition();
    java.lang.String str1 = configUpgradeChangeDefinition0.summary;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    org.apache.ambari.server.state.alert.SourceType sourceType0 = org.apache.ambari.server.state.alert.SourceType.PORT;
    org.junit.Assert.assertTrue("'" + sourceType0 + "' != '" + org.apache.ambari.server.state.alert.SourceType.PORT + "'", sourceType0.equals(org.apache.ambari.server.state.alert.SourceType.PORT));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.PROPERTY_PROVIDER_THREADPOOL_WORKER_QUEUE_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.ServerAction.ACTION_USER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ACTION_USER_NAME"+ "'", str0.equals("ACTION_USER_NAME"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.OJDBC_JAR_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type0 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.CONFIGURE;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.CONFIGURE + "'", type0.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.CONFIGURE));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    org.apache.ambari.server.bootstrap.BSResponse bSResponse0 = new org.apache.ambari.server.bootstrap.BSResponse();
    bSResponse0.setRequestId((long)(short)0);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    boolean b1 = serviceCheckGrouping0.supportsAutoSkipOnFailure;
    boolean b2 = serviceCheckGrouping0.supportsAutoSkipOnFailure;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

}
