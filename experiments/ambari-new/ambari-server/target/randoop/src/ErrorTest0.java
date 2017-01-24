
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.checkForNotMappedConfigsToCluster();

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }

    org.apache.ambari.server.state.State state3 = org.apache.ambari.server.state.State.INSTALLED;
    org.apache.ambari.server.state.State state4 = org.apache.ambari.server.state.State.INSTALLED;
    boolean b5 = state4.isValidClientComponentState();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.models.HostComponentSummary hostComponentSummary6 = new org.apache.ambari.server.orm.models.HostComponentSummary("kerberos_descriptor", "forceRefreshConfigTagsBeforeExecution", (java.lang.Long)0L, state3, state4);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<java.lang.String> list_str1 = upgradePack0.getPrerequisiteChecks();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }

    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ServiceComponentHistoryEntity> list_serviceComponentHistoryEntity4 = serviceComponentDesiredStateDAO0.findHistory(1L, "hi!", "recovery_settings");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.actionmanager.Stage stage5 = org.apache.ambari.server.utils.StageUtils.getATestStage((long)(byte)100, (long)(short)10, "ambari-server", "Hosts/last_registration_time", "max_duration_for_retries");

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.checkSchemaName();

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ExtensionLinkEntity> list_extensionLinkEntity3 = extensionLinkDAO0.findByExtension("AlertHistory/definition_name", "");

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.checkForConfigsSelectedMoreThanOnce();

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }

    org.apache.ambari.server.orm.dao.WidgetDAO widgetDAO0 = new org.apache.ambari.server.orm.dao.WidgetDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.WidgetEntity> list_widgetEntity2 = widgetDAO0.findByCluster((long)(-1));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }

    org.apache.ambari.server.state.services.MetricsRetrievalService metricsRetrievalService0 = new org.apache.ambari.server.state.services.MetricsRetrievalService();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.controller.jmx.JMXMetricHolder jMXMetricHolder2 = metricsRetrievalService0.getCachedJMXMetric("StackConfigurations/property_value_attributes");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }

    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity> list_serviceComponentDesiredStateEntity1 = serviceComponentDesiredStateDAO0.findAll();

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ExtensionLinkEntity> list_extensionLinkEntity3 = extensionLinkDAO0.findByStack("jdbc:derby:memory:myDB/ambari;create=true", "ERROR");

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.controller.utilities.DatabaseChecker.checkDBConsistency();

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.checkHostComponentStates();

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }

    org.apache.ambari.server.orm.dao.TopologyLogicalTaskDAO topologyLogicalTaskDAO0 = new org.apache.ambari.server.orm.dao.TopologyLogicalTaskDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.TopologyLogicalTaskEntity topologyLogicalTaskEntity2 = topologyLogicalTaskDAO0.findById((java.lang.Long)100L);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }

    org.apache.ambari.server.controller.logging.LogSearchDataRetrievalService logSearchDataRetrievalService0 = new org.apache.ambari.server.controller.logging.LogSearchDataRetrievalService();
    com.google.common.util.concurrent.ListenableFuture<com.google.common.util.concurrent.Service.State> listenablefuture_state1 = logSearchDataRetrievalService0.start();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Set<java.lang.String> set_str5 = logSearchDataRetrievalService0.getLogFileNames("AuthorizationInfo/cluster_name", "ERROR", "Repositories/latest_base_url");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.fixClusterConfigsNotMappedToAnyService();

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    users0.grantAdminPrivilege((java.lang.Integer)400);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.models.HostComponentSummary> list_hostComponentSummary2 = org.apache.ambari.server.orm.models.HostComponentSummary.getHostComponentSummaries("ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}", "servicecomponent_version");

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    users0.modifyPassword("Credential/key", "", "ambari-server");

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    users0.modifyPassword("PrivilegeInfo/privilege_id", "value", "RootServiceComponents/service_name");

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ExtensionLinkEntity> list_extensionLinkEntity3 = extensionLinkDAO0.findByStack("ERROR", "operation_level/service_name");

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }

    org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder createGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder createGroupRequestAuditEventBuilder2 = createGroupRequestAuditEventBuilder0.withGroupName("RepositoryVersions/display_name");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent createGroupRequestAuditEvent3 = createGroupRequestAuditEventBuilder0.build();

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }

    org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning0 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b1 = hiveNotRollingWarning0.isStackUpgradeAllowedToBypassPreChecks();

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.checkForHostsWithoutState();

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteCheckConfig prerequisiteCheckConfig1 = upgradePack0.getPrerequisiteCheckConfig();

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }

    org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder createGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent.CreateGroupRequestAuditEventBuilder createGroupRequestAuditEventBuilder2 = createGroupRequestAuditEventBuilder0.withGroupName("RepositoryVersions/display_name");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.CreateGroupRequestAuditEvent createGroupRequestAuditEvent3 = createGroupRequestAuditEventBuilder2.build();

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ExtensionLinkEntity> list_extensionLinkEntity1 = extensionLinkDAO0.findAll();

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Set<org.apache.ambari.server.orm.cache.ConfigGroupHostMapping> set_configGroupHostMapping2 = configGroupHostMappingDAO0.findByHostId((java.lang.Long)100L);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    users0.setUserLdap("ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}");

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    users0.setUserActive("host_group", false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.controller.utilities.DatabaseChecker.checkDBConfigsConsistency();

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.security.authorization.User user2 = users0.getAnyUser("Hosts/rack_info");

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.security.authorization.GroupType groupType2 = org.apache.ambari.server.security.authorization.GroupType.LOCAL;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.security.authorization.Group group3 = users0.getGroupByNameAndType("yarn.scheduler.capacity.root.queues", groupType2);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.controller.internal.ViewPrivilegeResourceProvider viewPrivilegeResourceProvider0 = new org.apache.ambari.server.controller.internal.ViewPrivilegeResourceProvider();

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ExtensionLinkEntity> list_extensionLinkEntity3 = extensionLinkDAO0.findByExtension("", "");

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }

    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent addRequestRequestAuditEvent1 = addRequestAuditEventBuilder0.build();

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }

    org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO0 = new org.apache.ambari.server.orm.dao.ClusterServiceDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity3 = clusterServiceDAO0.findByClusterAndServiceNames("PrivilegeInfo/privilege_id", "Versions/stack-errors");

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }

    org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder2 = deleteUserRequestAuditEventBuilder0.withUrl("Executing");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent deleteUserRequestAuditEvent3 = deleteUserRequestAuditEventBuilder2.build();

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }

    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ServiceComponentVersionEntity> list_serviceComponentVersionEntity4 = serviceComponentDesiredStateDAO0.findVersions((long)(byte)10, "Theme", "Upgrade/abort_reason");

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }

    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array0 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo1 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo1, propertyInfo_array0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo4 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo1, map_str_str3);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel5 = new org.apache.ambari.server.controller.internal.RequestOperationLevel(map_str_str3);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }

    org.apache.ambari.server.orm.dao.TopologyLogicalTaskDAO topologyLogicalTaskDAO0 = new org.apache.ambari.server.orm.dao.TopologyLogicalTaskDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.TopologyLogicalTaskEntity topologyLogicalTaskEntity2 = topologyLogicalTaskDAO0.findById((java.lang.Long)10L);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    org.apache.ambari.server.state.RepositoryVersionState repositoryVersionState3 = org.apache.ambari.server.state.RepositoryVersionState.INSTALLED;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.HostVersionEntity> list_hostVersionEntity4 = hostVersionDAO0.findByClusterHostAndState("StackConfigurations/type", "HostRoles/host_name", repositoryVersionState3);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Collection<org.apache.ambari.server.security.authorization.User> collection_user2 = users0.getGroupMembers("AlertNotice/target_id");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }

    org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO0 = new org.apache.ambari.server.orm.dao.ClusterServiceDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ClusterServiceEntity> list_clusterServiceEntity1 = clusterServiceDAO0.findAll();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.security.authorization.User user2 = users0.getUser((java.lang.Integer)400);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }

    org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager metricsCollectorHAManager0 = new org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager();
    boolean b1 = metricsCollectorHAManager0.isEmpty();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    metricsCollectorHAManager0.addCollectorHost("java_home", "quicklinks");

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }

    org.apache.ambari.server.agent.ExecutionCommand executionCommand0 = new org.apache.ambari.server.agent.ExecutionCommand();
    
    // Checks the contract:  executionCommand0.equals(executionCommand0)
    org.junit.Assert.assertTrue("Contract failed: executionCommand0.equals(executionCommand0)", executionCommand0.equals(executionCommand0));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ExtensionLinkEntity extensionLinkEntity2 = extensionLinkDAO0.findById((long)400);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }

    org.apache.ambari.server.orm.dao.TopologyHostGroupDAO topologyHostGroupDAO0 = new org.apache.ambari.server.orm.dao.TopologyHostGroupDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.TopologyHostGroupEntity> list_topologyHostGroupEntity1 = topologyHostGroupDAO0.findAll();

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack1 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack0.mergeProcessing(upgradePack1);
    org.apache.ambari.server.state.stack.UpgradePack upgradePack3 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack4 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack3.mergeProcessing(upgradePack4);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.UpgradePack.ProcessingComponent>> map_str_map_str_processingComponent6 = upgradePack3.getTasks();
    upgradePack0.mergeProcessing(upgradePack3);
    org.apache.ambari.server.state.stack.upgrade.Direction direction8 = org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE;
    java.lang.String str10 = direction8.getText(true);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.state.stack.upgrade.Grouping> list_grouping11 = upgradePack0.getGroups(direction8);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }

    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService affectedService0 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService();
    java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent> list_affectedComponent1 = affectedService0.components;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent> map_str_affectedComponent2 = affectedService0.getComponentMap();

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity> list_configGroupHostMappingEntity1 = configGroupHostMappingDAO0.findAll();

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }

    org.apache.ambari.server.orm.dao.WidgetLayoutDAO widgetLayoutDAO0 = new org.apache.ambari.server.orm.dao.WidgetLayoutDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.WidgetLayoutEntity> list_widgetLayoutEntity4 = widgetLayoutDAO0.findByName((java.lang.Long)10L, "UpgradeChecks/repository_version", "java_version");

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.actionmanager.Stage stage6 = org.apache.ambari.server.utils.StageUtils.getATestStage(5000L, (long)30, "operation_level/cluster_name", "recovery_type", "#", "jdbc:postgresql://localhost/");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    users0.createUser("AlertNotice/target_id", "Executing");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.runAllDBChecks();

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }

    org.apache.ambari.server.controller.HostsMap hostsMap1 = new org.apache.ambari.server.controller.HostsMap("components");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str3 = hostsMap1.getHostMap("max-age=31536000");

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }

    org.apache.ambari.server.state.alert.MetricSource.JmxInfo jmxInfo0 = new org.apache.ambari.server.state.alert.MetricSource.JmxInfo();
    
    // Checks the contract:  jmxInfo0.equals(jmxInfo0)
    org.junit.Assert.assertTrue("Contract failed: jmxInfo0.equals(jmxInfo0)", jmxInfo0.equals(jmxInfo0));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }

    org.apache.ambari.server.orm.dao.ResourceDAO resourceDAO0 = new org.apache.ambari.server.orm.dao.ResourceDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ResourceEntity resourceEntity2 = resourceDAO0.findById((java.lang.Long)5000L);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }

    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.builder();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent viewPrivilegeChangeRequestAuditEvent1 = viewPrivilegeChangeRequestAuditEventBuilder0.build();

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }

    org.apache.ambari.server.state.services.MetricsRetrievalService metricsRetrievalService0 = new org.apache.ambari.server.state.services.MetricsRetrievalService();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = metricsRetrievalService0.getCachedRESTMetric("Versions/extension-errors");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }

    org.apache.ambari.server.orm.dao.AlertDefinitionDAO alertDefinitionDAO0 = new org.apache.ambari.server.orm.dao.AlertDefinitionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.AlertDefinitionEntity> list_alertDefinitionEntity2 = alertDefinitionDAO0.findAgentScoped((long)'a');

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }

    org.apache.ambari.server.orm.dao.WidgetDAO widgetDAO0 = new org.apache.ambari.server.orm.dao.WidgetDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    widgetDAO0.removeByPK((java.lang.Long)0L);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher0 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener1 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher0);
    java.lang.String[] str_array20 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str21, str_array20);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent23 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    alertHostListener1.onAmbariEvent(hostsAddedEvent23);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<java.lang.String> list_str2 = users0.getAllMembers("Tasks/end_time");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.actionmanager.Stage stage6 = org.apache.ambari.server.utils.StageUtils.getATestStage((long)'#', (long)(byte)10, "StackLevelConfigurations/type", "Hosts/total_mem", "ThemeInfo/stack_version", "ambari_db_rca_username");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }

    org.apache.ambari.server.orm.dao.WidgetLayoutDAO widgetLayoutDAO0 = new org.apache.ambari.server.orm.dao.WidgetLayoutDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.WidgetLayoutEntity> list_widgetLayoutEntity4 = widgetLayoutDAO0.findByName((java.lang.Long)1L, "kerberos_descriptor", "downgrade");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK configGroupHostMappingEntityPK1 = new org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK();
    java.lang.Long long2 = configGroupHostMappingEntityPK1.getConfigGroupId();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    configGroupHostMappingDAO0.removeByPK(configGroupHostMappingEntityPK1);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }

    org.apache.ambari.server.orm.dao.AlertDefinitionDAO alertDefinitionDAO0 = new org.apache.ambari.server.orm.dao.AlertDefinitionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity3 = alertDefinitionDAO0.findByName((long)5, "ClusterInfo/url");

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.controller.UserResponse userResponse6 = new org.apache.ambari.server.controller.UserResponse("Users/user_type", true, false, true);
    org.apache.ambari.server.security.authorization.UserType userType7 = userResponse6.getUserType();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Collection<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority> collection_ambariGrantedAuthority8 = users0.getUserAuthorities("AlertHistory/cluster_name", userType7);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }

    org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.ActivateUserRequestAuditEventBuilder activateUserRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.builder();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent activateUserRequestAuditEvent1 = activateUserRequestAuditEventBuilder0.build();

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = configuration0.getPreviousDatabaseConnectorNames();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str4 = configuration0.getServerVersion();

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }

    org.apache.ambari.server.orm.dao.AlertDefinitionDAO alertDefinitionDAO0 = new org.apache.ambari.server.orm.dao.AlertDefinitionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.AlertDefinitionEntity> list_alertDefinitionEntity2 = alertDefinitionDAO0.findAllEnabled((long)(byte)10);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.security.authorization.Group> list_group1 = users0.getAllGroups();

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }

    org.apache.ambari.server.orm.dao.TopologyLogicalTaskDAO topologyLogicalTaskDAO0 = new org.apache.ambari.server.orm.dao.TopologyLogicalTaskDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.TopologyLogicalTaskEntity topologyLogicalTaskEntity2 = topologyLogicalTaskDAO0.findById((java.lang.Long)0L);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }

    org.apache.ambari.server.api.services.PersistKeyValueImpl persistKeyValueImpl0 = new org.apache.ambari.server.api.services.PersistKeyValueImpl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = persistKeyValueImpl0.getAllKeyValues();

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    users0.modifyPassword("Stage/host_params", "RootServiceComponents/ciphers", "Clusters/security_type");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }

    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent membershipChangeRequestAuditEvent1 = addUserToGroupRequestAuditEventBuilder0.build();

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.security.authorization.User> list_user1 = users0.getAllUsers();

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }

    org.apache.ambari.server.orm.dao.GroupDAO groupDAO0 = new org.apache.ambari.server.orm.dao.GroupDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.GroupEntity> list_groupEntity1 = groupDAO0.findAll();

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }

    org.apache.ambari.server.orm.dao.SettingDAO settingDAO0 = new org.apache.ambari.server.orm.dao.SettingDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.SettingEntity> list_settingEntity1 = settingDAO0.findAll();

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.models.HostComponentSummary> list_hostComponentSummary2 = org.apache.ambari.server.orm.models.HostComponentSummary.getHostComponentSummaries("Repositories/stack_name", "ViewInstanceInfo/description");

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }

    org.apache.ambari.server.orm.dao.AlertDefinitionDAO alertDefinitionDAO0 = new org.apache.ambari.server.orm.dao.AlertDefinitionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.AlertDefinitionEntity> list_alertDefinitionEntity1 = alertDefinitionDAO0.findAll();

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }

    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder2 = deleteRepositoryVersionAuditEventBuilder0.withStackName("AMBARI.MANAGE_USERS");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent deleteRepositoryVersionRequestAuditEvent3 = deleteRepositoryVersionAuditEventBuilder2.build();

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity2 = hostVersionDAO0.findByPK((java.lang.Long)1000L);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }

    org.apache.ambari.server.topology.PersistedStateImpl persistedStateImpl0 = new org.apache.ambari.server.topology.PersistedStateImpl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Map<org.apache.ambari.server.topology.ClusterTopology,java.util.List<org.apache.ambari.server.topology.LogicalRequest>> map_clusterTopology_list_logicalRequest1 = persistedStateImpl0.getAllRequests();

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }

    org.apache.ambari.server.orm.dao.ViewDAO viewDAO0 = new org.apache.ambari.server.orm.dao.ViewDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ViewEntity> list_viewEntity1 = viewDAO0.findAll();

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }

    org.apache.ambari.server.state.theme.Layout layout0 = new org.apache.ambari.server.state.theme.Layout();
    org.apache.ambari.server.state.theme.Layout layout1 = new org.apache.ambari.server.state.theme.Layout();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    layout0.mergeWithParent(layout1);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack1 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack0.mergeProcessing(upgradePack1);
    java.lang.String str3 = upgradePack1.getTarget();
    org.apache.ambari.server.state.stack.upgrade.Direction direction4 = org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.state.stack.upgrade.Grouping> list_grouping5 = upgradePack1.getGroups(direction4);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }

    org.apache.ambari.server.api.services.PersistKeyValueImpl persistKeyValueImpl0 = new org.apache.ambari.server.api.services.PersistKeyValueImpl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    persistKeyValueImpl0.put("WidgetInfo/values", "RootServiceComponents/component_name");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }

    org.apache.ambari.server.api.services.PersistKeyValueImpl persistKeyValueImpl0 = new org.apache.ambari.server.api.services.PersistKeyValueImpl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str2 = persistKeyValueImpl0.put("javax.net.ssl.trustStore");

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    hostVersionDAO0.removeByHostName("777");

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity2 = hostVersionDAO0.findByPK((java.lang.Long)(-1L));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    org.apache.ambari.server.state.StackId stackId4 = new org.apache.ambari.server.state.StackId("1.3.6.1.4.1.18060.16.1.1.1.1", "StackConfigurations/property_description");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity7 = hostVersionDAO0.findByClusterStackVersionAndHost((long)8443, stackId4, "AlertHistory/host_name", 0L);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }

    org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.HostComponentStateEntity> list_hostComponentStateEntity2 = hostComponentStateDAO0.findByService("Artifacts/artifact_name");

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ExtensionLinkEntity> list_extensionLinkEntity3 = extensionLinkDAO0.findByStack("oracle_jdbc_url", "AlertTarget/notification_type");

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandlerFactory kerberosOperationHandlerFactory0 = new org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandlerFactory();
    org.apache.ambari.server.serveraction.kerberos.KDCType kDCType1 = org.apache.ambari.server.serveraction.kerberos.KDCType.IPA;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler kerberosOperationHandler2 = kerberosOperationHandlerFactory0.getKerberosOperationHandler(kDCType1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }

    org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity5 = hostComponentStateDAO0.findByIndex((java.lang.Long)1000L, "PrivilegeInfo/type", "AuthorizationInfo/cluster_name", (java.lang.Long)0L);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }

    org.apache.ambari.server.orm.dao.RoleAuthorizationDAO roleAuthorizationDAO0 = new org.apache.ambari.server.orm.dao.RoleAuthorizationDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.RoleAuthorizationEntity> list_roleAuthorizationEntity1 = roleAuthorizationDAO0.findAll();

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }

    org.apache.ambari.server.api.services.PersistKeyValueImpl persistKeyValueImpl0 = new org.apache.ambari.server.api.services.PersistKeyValueImpl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str2 = persistKeyValueImpl0.getValue("UpgradeChecks/upgrade_pack");

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.controller.utilities.KerberosChecker.checkJaasConfiguration();

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }

    org.apache.ambari.server.audit.event.request.ClusterNameChangeRequestAuditEvent.ClusterNameChangeRequestAuditEventBuilder clusterNameChangeRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.ClusterNameChangeRequestAuditEvent.ClusterNameChangeRequestAuditEventBuilder();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.ClusterNameChangeRequestAuditEvent clusterNameChangeRequestAuditEvent1 = clusterNameChangeRequestAuditEventBuilder0.build();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity3 = hostVersionDAO0.findByHostAndStateCurrent("ViewInstanceInfo/context_path", "service");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.api.services.ClusterService clusterService0 = new org.apache.ambari.server.api.services.ClusterService();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }

    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.builder();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent addAlertGroupRequestAuditEvent1 = addAlertGroupRequestAuditEventBuilder0.build();

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }

    org.apache.ambari.server.state.alert.AlertDefinitionHash alertDefinitionHash0 = new org.apache.ambari.server.state.alert.AlertDefinitionHash();
    alertDefinitionHash0.invalidate("", "Tasks/command");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = alertDefinitionHash0.getHash("ClusterHealthReport{staleConfigsHosts=0, maintenanceStateHosts=0, healthyStateHosts=0, unhealthyStateHosts=0, heartbeatLostStateHosts=0, initStateHosts=0, healthyStatusHosts=0, unhealthyStatusHosts=0, unknownStatusHosts=0, alertStatusHosts=0}", "Stage/log_info");

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str1 = org.apache.ambari.server.utils.SecretReference.maskPasswordInPropertyMap("SECONDARY_NAMENODE_MUST_BE_DELETED");

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }

    org.apache.ambari.server.orm.dao.TopologyHostInfoDAO topologyHostInfoDAO0 = new org.apache.ambari.server.orm.dao.TopologyHostInfoDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.TopologyHostInfoEntity topologyHostInfoEntity2 = topologyHostInfoDAO0.findById((long)20);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity2 = hostVersionDAO0.findByPK((java.lang.Long)300000L);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity3 = hostVersionDAO0.findByHostAndStateCurrent((long)30, 1000L);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }

    org.apache.ambari.server.orm.dao.ViewDAO viewDAO0 = new org.apache.ambari.server.orm.dao.ViewDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ViewEntity viewEntity2 = viewDAO0.findByName("keytab_file_group_access");

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }

    org.apache.ambari.server.checks.ServicesTezDistributedCacheCheck servicesTezDistributedCacheCheck0 = new org.apache.ambari.server.checks.ServicesTezDistributedCacheCheck();
    org.apache.ambari.server.checks.HostsRepositoryVersionCheck hostsRepositoryVersionCheck1 = new org.apache.ambari.server.checks.HostsRepositoryVersionCheck();
    org.apache.ambari.server.checks.CheckDescription checkDescription2 = hostsRepositoryVersionCheck1.getDescription();
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest4 = new org.apache.ambari.server.controller.PrereqCheckRequest("server.jdbc.properties.");
    boolean b5 = hostsRepositoryVersionCheck1.isApplicable(prereqCheckRequest4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b6 = servicesTezDistributedCacheCheck0.isApplicable(prereqCheckRequest4);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ExtensionLinkEntity extensionLinkEntity5 = extensionLinkDAO0.findByStackAndExtension("AuthorizationInfo/resource_type", "operation", "Credential/alias", "Upgrade");

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }

    org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity5 = hostComponentStateDAO0.findByIndex((java.lang.Long)(-1L), "PrivilegeInfo/principal_type", "recovery_retry_interval", (java.lang.Long)1L);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }

    org.apache.ambari.server.orm.dao.GroupDAO groupDAO0 = new org.apache.ambari.server.orm.dao.GroupDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity2 = groupDAO0.findByPK((java.lang.Integer)100);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }

    org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO0 = new org.apache.ambari.server.orm.dao.MetainfoDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Collection<org.apache.ambari.server.orm.entities.MetainfoEntity> collection_metainfoEntity1 = metainfoDAO0.findAll();

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.HostVersionEntity> list_hostVersionEntity3 = hostVersionDAO0.findByClusterAndHost("ambari.dispatch.snmp.security.auth.passphrase", "ACTION_USER_NAME");

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.stack.StackDirectory stackDirectory1 = new org.apache.ambari.server.stack.StackDirectory("AlertHistory/label");

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }

    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder2 = viewPrivilegeChangeRequestAuditEventBuilder0.withVersion("Artifacts/service_name");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder4 = viewPrivilegeChangeRequestAuditEventBuilder0.withVersion("WidgetInfo/metrics");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent viewPrivilegeChangeRequestAuditEvent5 = viewPrivilegeChangeRequestAuditEventBuilder4.build();

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }

    org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    hostComponentDesiredStateDAO0.removeId((long)1200);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType3 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    mITKerberosOperationHandler0.setDefaultRealm("hi!");
    char[] char_array12 = new char[] { '4', '4', '#', 'a', '4' };
    org.apache.ambari.server.security.credential.PrincipalKeyCredential principalKeyCredential13 = new org.apache.ambari.server.security.credential.PrincipalKeyCredential("skip_failure", char_array12);
    org.apache.ambari.server.configuration.Configuration configuration15 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str16 = configuration15.getViewsPragmaHTTPResponseHeader();
    boolean b17 = configuration15.validateAgentHostnames();
    java.util.Map<java.lang.String,java.lang.String> map_str_str18 = configuration15.getDatabaseConnectorNames();
    mITKerberosOperationHandler0.open(principalKeyCredential13, "AlertHistory/label", map_str_str18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b21 = mITKerberosOperationHandler0.principalExists("StackServices/stack_version");

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }

    org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent.ConfigurationChangeRequestAuditEventBuilder configurationChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent.ConfigurationChangeRequestAuditEventBuilder configurationChangeRequestAuditEventBuilder2 = configurationChangeRequestAuditEventBuilder0.withOperation("ranger-hbase-plugin-enabled");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent configurationChangeRequestAuditEvent3 = configurationChangeRequestAuditEventBuilder0.build();

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ExtensionLinkEntity extensionLinkEntity5 = extensionLinkDAO0.findByStackAndExtension("isCommand :false, action :Tasks/custom_command_name, command :1.3.6.1.4.1.18060.16.1.1.1.7, inputs :{}, resourceFilters: [], exclusive: false, clusterName :MetricsRetrievalService [NEW]", "Users/password", "AlertHistory/id", "Upgrade/downgrade_allowed");

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }

    org.apache.ambari.server.orm.dao.HostConfigMappingDAO hostConfigMappingDAO0 = new org.apache.ambari.server.orm.dao.HostConfigMappingDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Set<org.apache.ambari.server.orm.cache.HostConfigMapping> set_hostConfigMapping3 = hostConfigMappingDAO0.findSelected((long)(byte)0, (java.lang.Long)0L);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }

    org.apache.ambari.server.notifications.dispatchers.AlertScriptDispatcher alertScriptDispatcher0 = new org.apache.ambari.server.notifications.dispatchers.AlertScriptDispatcher();
    java.lang.String str1 = alertScriptDispatcher0.getType();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long2 = alertScriptDispatcher0.getScriptConfigurationTimeout();

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher1 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener2 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher1);
    org.apache.ambari.server.actionmanager.ActionDBAccessorImpl actionDBAccessorImpl3 = new org.apache.ambari.server.actionmanager.ActionDBAccessorImpl((long)100, ambariEventPublisher1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    actionDBAccessorImpl3.abortHostRole("TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", (long)400, (long)120, "", "Upgrade/downgrade_allowed");

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test128"); }

    org.apache.ambari.server.state.scheduler.BatchRequest batchRequest0 = new org.apache.ambari.server.state.scheduler.BatchRequest();
    
    // Checks the contract:  compareTo-reflexive on batchRequest0
    org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on batchRequest0", batchRequest0.compareTo(batchRequest0) == 0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test129"); }

    org.apache.ambari.server.view.ViewDirectoryWatcher viewDirectoryWatcher0 = new org.apache.ambari.server.view.ViewDirectoryWatcher();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    viewDirectoryWatcher0.stop();

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test130"); }

    org.apache.ambari.server.orm.dao.ClusterVersionDAO clusterVersionDAO0 = new org.apache.ambari.server.orm.dao.ClusterVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ClusterVersionEntity> list_clusterVersionEntity4 = clusterVersionDAO0.findByStackAndVersion("version1", "", "ViewInstanceInfo/description");

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test131"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.checkForConfigsNotMappedToService();

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test132"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.fixDatabaseConsistency();

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test133"); }

    org.apache.ambari.server.api.services.PersistKeyValueImpl persistKeyValueImpl0 = new org.apache.ambari.server.api.services.PersistKeyValueImpl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str2 = persistKeyValueImpl0.put("metainfo.xml");

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test134"); }

    org.apache.ambari.server.orm.dao.ResourceDAO resourceDAO0 = new org.apache.ambari.server.orm.dao.ResourceDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ResourceEntity resourceEntity2 = resourceDAO0.findById((java.lang.Long)100000L);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test135"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher1 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener2 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher1);
    org.apache.ambari.server.actionmanager.ActionDBAccessorImpl actionDBAccessorImpl3 = new org.apache.ambari.server.actionmanager.ActionDBAccessorImpl((long)100, ambariEventPublisher1);
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L, 100L, 100000L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.actionmanager.HostRoleCommand> list_hostRoleCommand10 = actionDBAccessorImpl3.getTasks((java.util.Collection<java.lang.Long>)arraylist_long8);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test136"); }

    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder2 = addAlertGroupRequestAuditEventBuilder0.withOperation("Versions/stack-errors");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent addAlertGroupRequestAuditEvent3 = addAlertGroupRequestAuditEventBuilder0.build();

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test137"); }

    org.apache.ambari.server.api.services.PersistKeyValueImpl persistKeyValueImpl0 = new org.apache.ambari.server.api.services.PersistKeyValueImpl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    persistKeyValueImpl0.put("", "");

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test138"); }

    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder2 = addRequestAuditEventBuilder0.withCommand("UpgradeItem/request_id");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent addRequestRequestAuditEvent3 = addRequestAuditEventBuilder0.build();

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test139"); }

    org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity4 = hostComponentStateDAO0.findByServiceComponentAndHost("component", "kerberos_descriptor_reference", "ViewInstanceInfo/description");

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test140"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.security.authorization.GroupType groupType2 = org.apache.ambari.server.security.authorization.GroupType.JWT;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    users0.createGroup("configuration", groupType2);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test141"); }

    org.apache.ambari.server.orm.dao.BlueprintDAO blueprintDAO0 = new org.apache.ambari.server.orm.dao.BlueprintDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.BlueprintEntity> list_blueprintEntity1 = blueprintDAO0.findAll();

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test142"); }

    org.apache.ambari.server.orm.dao.WidgetDAO widgetDAO0 = new org.apache.ambari.server.orm.dao.WidgetDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    widgetDAO0.removeByPK((java.lang.Long)100L);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test143"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher1 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener2 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher1);
    org.apache.ambari.server.actionmanager.ActionDBAccessorImpl actionDBAccessorImpl3 = new org.apache.ambari.server.actionmanager.ActionDBAccessorImpl((long)100, ambariEventPublisher1);
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus5 = org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED;
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.actionmanager.HostRoleCommand> list_hostRoleCommand6 = actionDBAccessorImpl3.getTasksByRoleAndStatus("Repositories/version_definition_id", hostRoleStatus5);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test144"); }

    org.apache.ambari.server.audit.event.request.UpdateRepositoryRequestAuditEvent.UpdateRepositoryRequestAuditEventBuilder updateRepositoryRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.UpdateRepositoryRequestAuditEvent.builder();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.audit.event.request.UpdateRepositoryRequestAuditEvent updateRepositoryRequestAuditEvent1 = updateRepositoryRequestAuditEventBuilder0.build();

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test145"); }

    org.apache.ambari.server.orm.dao.ClusterVersionDAO clusterVersionDAO0 = new org.apache.ambari.server.orm.dao.ClusterVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ClusterVersionEntity clusterVersionEntity2 = clusterVersionDAO0.findByPK((java.lang.Long)300000L);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test146"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    configGroupHostMappingDAO0.removeAllByGroup((java.lang.Long)1L);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test147"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    users0.setGroupLdap("StackServices/stack_version");

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test148"); }

    org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.security.authorization.Group group2 = users0.getGroup("Repositories/stack_name");

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test149"); }

    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity2 = serviceComponentDesiredStateDAO0.findById((long)2000);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test150"); }

    org.apache.ambari.server.orm.dao.HostStateDAO hostStateDAO0 = new org.apache.ambari.server.orm.dao.HostStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostStateEntity hostStateEntity2 = hostStateDAO0.findByHostId((java.lang.Long)1L);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test151"); }

    org.apache.ambari.server.orm.dao.WidgetDAO widgetDAO0 = new org.apache.ambari.server.orm.dao.WidgetDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.WidgetEntity widgetEntity2 = widgetDAO0.findById((java.lang.Long)100L);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test152"); }

    org.apache.ambari.server.orm.dao.AlertDefinitionDAO alertDefinitionDAO0 = new org.apache.ambari.server.orm.dao.AlertDefinitionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    alertDefinitionDAO0.removeAll((long)(short)60);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test153"); }

    org.apache.ambari.server.orm.dao.TopologyHostInfoDAO topologyHostInfoDAO0 = new org.apache.ambari.server.orm.dao.TopologyHostInfoDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.TopologyHostInfoEntity> list_topologyHostInfoEntity1 = topologyHostInfoDAO0.findAll();

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test154"); }

    org.apache.ambari.server.orm.dao.RepositoryVersionDAO repositoryVersionDAO0 = new org.apache.ambari.server.orm.dao.RepositoryVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity3 = repositoryVersionDAO0.findByStackNameAndVersion("sortBy", "PrivilegeInfo/type");

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test155"); }

    org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO0 = new org.apache.ambari.server.orm.dao.MetainfoDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    metainfoDAO0.removeByHostName("");

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test156"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher1 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener2 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher1);
    org.apache.ambari.server.actionmanager.ActionDBAccessorImpl actionDBAccessorImpl3 = new org.apache.ambari.server.actionmanager.ActionDBAccessorImpl((long)100, ambariEventPublisher1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    actionDBAccessorImpl3.endRequestIfCompleted(300000L);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test157"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher1 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener2 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher1);
    org.apache.ambari.server.actionmanager.ActionDBAccessorImpl actionDBAccessorImpl3 = new org.apache.ambari.server.actionmanager.ActionDBAccessorImpl((long)100, ambariEventPublisher1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = actionDBAccessorImpl3.getRequestContext((long)5000);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test158"); }

    org.apache.ambari.server.security.CertificateManager certificateManager0 = new org.apache.ambari.server.security.CertificateManager();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str1 = certificateManager0.getServerCert();

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test159"); }

    org.apache.ambari.server.state.services.MetricsRetrievalService metricsRetrievalService0 = new org.apache.ambari.server.state.services.MetricsRetrievalService();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = metricsRetrievalService0.getCachedRESTMetric("one_dir_per_partition");

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test160"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    configGroupHostMappingDAO0.removeAllByHost((java.lang.Long)300000L);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test161"); }

    org.apache.ambari.server.serveraction.kerberos.CreateKeytabFilesServerAction createKeytabFilesServerAction0 = new org.apache.ambari.server.serveraction.kerberos.CreateKeytabFilesServerAction();
    org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler aDKerberosOperationHandler4 = new org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler();
    aDKerberosOperationHandler4.close();
    aDKerberosOperationHandler4.close();
    org.apache.ambari.server.serveraction.ActionLog actionLog9 = new org.apache.ambari.server.serveraction.ActionLog();
    java.lang.String str10 = actionLog9.getStdErr();
    java.lang.String str11 = actionLog9.getStdOut();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.directory.server.kerberos.shared.keytab.Keytab keytab12 = createKeytabFilesServerAction0.createKeytab("777", "DENY<NUMERIC", (java.lang.Integer)20, (org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler)aDKerberosOperationHandler4, false, false, actionLog9);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test162"); }

    org.apache.ambari.server.orm.dao.HostConfigMappingDAO hostConfigMappingDAO0 = new org.apache.ambari.server.orm.dao.HostConfigMappingDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Set<org.apache.ambari.server.orm.cache.HostConfigMapping> set_hostConfigMapping4 = hostConfigMappingDAO0.findByType((long)' ', (java.lang.Long)300000L, "max_duration_for_retries");

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test163"); }

    org.apache.ambari.server.orm.dao.ResourceDAO resourceDAO0 = new org.apache.ambari.server.orm.dao.ResourceDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.ResourceEntity> list_resourceEntity1 = resourceDAO0.findAll();

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test164"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK configGroupHostMappingEntityPK1 = new org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK();
    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse9 = new org.apache.ambari.server.controller.RepositoryResponse("Actions/target_service", "1.3.6.1.4.1.18060.16", "PermissionInfo/permission_name", "Versions/valid", "StackConfigurations/property_name", "QuickLinkInfo/default", "RUNNING");
    boolean b10 = configGroupHostMappingEntityPK1.equals((java.lang.Object)"StackConfigurations/property_name");
    configGroupHostMappingEntityPK1.setHostId((java.lang.Long)1L);
    configGroupHostMappingEntityPK1.setConfigGroupId((java.lang.Long)5000L);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity configGroupHostMappingEntity15 = configGroupHostMappingDAO0.findByPK(configGroupHostMappingEntityPK1);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test165"); }

    org.apache.ambari.server.orm.dao.HostConfigMappingDAO hostConfigMappingDAO0 = new org.apache.ambari.server.orm.dao.HostConfigMappingDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Set<org.apache.ambari.server.orm.cache.HostConfigMapping> set_hostConfigMapping3 = hostConfigMappingDAO0.findSelected((long)900000, (java.lang.Long)52L);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test166"); }

    org.apache.ambari.server.orm.dao.WidgetDAO widgetDAO0 = new org.apache.ambari.server.orm.dao.WidgetDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.orm.entities.WidgetEntity> list_widgetEntity2 = widgetDAO0.findBySectionName("install_packages");

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test167"); }

    org.apache.ambari.server.orm.dao.RepositoryVersionDAO repositoryVersionDAO0 = new org.apache.ambari.server.orm.dao.RepositoryVersionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity2 = repositoryVersionDAO0.findByPK((java.lang.Long)300000L);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test168"); }

    org.apache.ambari.server.state.theme.Layout layout0 = new org.apache.ambari.server.state.theme.Layout();
    org.apache.ambari.server.state.theme.Layout layout1 = new org.apache.ambari.server.state.theme.Layout();
    org.apache.ambari.server.state.theme.Tab tab2 = new org.apache.ambari.server.state.theme.Tab();
    org.apache.ambari.server.state.theme.TabLayout tabLayout3 = tab2.getTabLayout();
    org.apache.ambari.server.state.theme.Tab tab4 = new org.apache.ambari.server.state.theme.Tab();
    org.apache.ambari.server.state.theme.TabLayout tabLayout5 = tab4.getTabLayout();
    org.apache.ambari.server.state.theme.Tab tab6 = new org.apache.ambari.server.state.theme.Tab();
    java.lang.String str7 = tab6.getName();
    org.apache.ambari.server.state.theme.TabLayout tabLayout8 = new org.apache.ambari.server.state.theme.TabLayout();
    tab6.setTabLayout(tabLayout8);
    org.apache.ambari.server.state.theme.Tab[] tab_array10 = new org.apache.ambari.server.state.theme.Tab[] { tab2, tab4, tab6 };
    java.util.ArrayList<org.apache.ambari.server.state.theme.Tab> arraylist_tab11 = new java.util.ArrayList<org.apache.ambari.server.state.theme.Tab>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.theme.Tab>)arraylist_tab11, tab_array10);
    layout1.setTabs((java.util.List<org.apache.ambari.server.state.theme.Tab>)arraylist_tab11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    layout0.mergeWithParent(layout1);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test169"); }

    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    serviceComponentDesiredStateDAO0.removeByName(52L, "HostRoles/display_name", "Metric{metric='null', pointInTime=false, temporal=false, amsHostMetric=false, unit='unitless'}");

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test170"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher1 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener2 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher1);
    org.apache.ambari.server.actionmanager.ActionDBAccessorImpl actionDBAccessorImpl3 = new org.apache.ambari.server.actionmanager.ActionDBAccessorImpl((long)100, ambariEventPublisher1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    actionDBAccessorImpl3.endRequest((long)' ');

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test171"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher1 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertHostListener alertHostListener2 = new org.apache.ambari.server.events.listeners.alerts.AlertHostListener(ambariEventPublisher1);
    org.apache.ambari.server.actionmanager.ActionDBAccessorImpl actionDBAccessorImpl3 = new org.apache.ambari.server.actionmanager.ActionDBAccessorImpl((long)100, ambariEventPublisher1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.List<org.apache.ambari.server.actionmanager.Stage> list_stage5 = actionDBAccessorImpl3.getAllStages((long)(short)60);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test172"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getConnectionPoolMaximumAge();
    java.util.Properties properties4 = configuration0.getPersistenceCustomProperties();
    int i5 = configuration0.getMetricCacheTTLSeconds();
    java.lang.String str6 = configuration0.getCustomActionDefinitionPath();
    org.apache.ambari.server.orm.dao.AlertsDAO alertsDAO7 = new org.apache.ambari.server.orm.dao.AlertsDAO(configuration0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = alertsDAO7.removeCurrentByService(100000L, "kdc_type");

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test173"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getConnectionPoolMaximumAge();
    java.util.Properties properties4 = configuration0.getPersistenceCustomProperties();
    int i5 = configuration0.getMetricCacheTTLSeconds();
    java.lang.String str6 = configuration0.getCustomActionDefinitionPath();
    org.apache.ambari.server.orm.dao.AlertsDAO alertsDAO7 = new org.apache.ambari.server.orm.dao.AlertsDAO(configuration0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.AlertHistoryEntity alertHistoryEntity9 = alertsDAO7.findById((long)900000);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test174"); }

    org.apache.ambari.server.orm.dao.AlertDefinitionDAO alertDefinitionDAO0 = new org.apache.ambari.server.orm.dao.AlertDefinitionDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity2 = alertDefinitionDAO0.findById(0L);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test175"); }

    org.apache.ambari.server.api.services.PersistKeyValueImpl persistKeyValueImpl0 = new org.apache.ambari.server.api.services.PersistKeyValueImpl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    persistKeyValueImpl0.put("UpgradeChecks/check", "StackLevelConfigurations/type");

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test176"); }

    org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.ambari.server.orm.entities.HostComponentDesiredStateEntity hostComponentDesiredStateEntity4 = hostComponentDesiredStateDAO0.findByServiceComponentAndHost("Credential/key", "1; mode=block", "name");

  }

}
