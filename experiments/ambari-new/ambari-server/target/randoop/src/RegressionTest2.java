
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.JCE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "jce_name"+ "'", str0.equals("jce_name"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.AGENT_STACK_RETRY_COUNT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test003() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }

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
    // boolean b18 = upgradeContext10.isServiceSupported("config_recommendation_strategy");
    // org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type19 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP;
    // java.util.Map<java.lang.String,java.lang.String> map_str_str21 = null;
    // org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] taskWrapper_array22 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] {  };
    // java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.TaskWrapper> arraylist_taskWrapper23 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>();
    // boolean b24 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>)arraylist_taskWrapper23, taskWrapper_array22);
    // org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper25 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type19, "ranger-hbase-plugin-enabled", map_str_str21, (java.util.List<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>)arraylist_taskWrapper23);
    // java.util.Set<java.lang.String> set_str26 = stageWrapper25.getHosts();
    // org.apache.ambari.server.state.stack.upgrade.StageWrapper[] stageWrapper_array27 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper[] { stageWrapper25 };
    // java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.StageWrapper> arraylist_stageWrapper28 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.StageWrapper>();
    // boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.StageWrapper>)arraylist_stageWrapper28, stageWrapper_array27);
    // // The following exception was thrown during execution in test generation
    // try {
    // java.util.List<org.apache.ambari.server.state.stack.upgrade.StageWrapper> list_stageWrapper30 = serviceCheckBuilder5.build(upgradeContext10, (java.util.List<org.apache.ambari.server.state.stack.upgrade.StageWrapper>)arraylist_stageWrapper28);
    //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // } catch (java.lang.NullPointerException e) {
    //   // Expected exception.
    // }
    
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceCheckBuilder5);
    // org.junit.Assert.assertTrue("'" + upgradeType7 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType7.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array13);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b15 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b18 == true);
    // org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP + "'", type19.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(taskWrapper_array22);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b24 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(set_str26);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(stageWrapper_array27);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }

    org.apache.ambari.server.state.action.ActionEventType actionEventType0 = org.apache.ambari.server.state.action.ActionEventType.ACTION_FAILED;
    org.junit.Assert.assertTrue("'" + actionEventType0 + "' != '" + org.apache.ambari.server.state.action.ActionEventType.ACTION_FAILED + "'", actionEventType0.equals(org.apache.ambari.server.state.action.ActionEventType.ACTION_FAILED));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }

    org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO0 = new org.apache.ambari.server.orm.dao.ClusterServiceDAO();
    org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity2 = clusterServiceDAO0.merge(clusterServiceEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }

    com.google.inject.persist.PersistService persistService0 = null;
    org.apache.ambari.server.configuration.Configuration configuration1 = new org.apache.ambari.server.configuration.Configuration();
    int i2 = configuration1.getClientThreadPoolSize();
    java.lang.String str3 = configuration1.getMpacksStagingPath();
    java.io.File file4 = configuration1.getBootStrapDir();
    com.google.inject.Injector injector5 = null;
    org.apache.ambari.server.update.HostUpdateHelper hostUpdateHelper6 = new org.apache.ambari.server.update.HostUpdateHelper(persistService0, configuration1, injector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file4);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_TOTAL_MEM_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/total_mem"+ "'", str0.equals("Hosts/total_mem"));

  }

  @Test
  public void test008() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }

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
    // org.apache.ambari.server.state.stack.UpgradePack upgradePack11 = new org.apache.ambari.server.state.stack.UpgradePack();
    // org.apache.ambari.server.state.stack.UpgradePack upgradePack12 = new org.apache.ambari.server.state.stack.UpgradePack();
    // upgradePack11.mergeProcessing(upgradePack12);
    // upgradeContext4.setUpgradePack(upgradePack12);
    // upgradeContext4.setAutoSkipComponentFailures(true);
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array7);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.RANGER_KMS_SERVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_DOWNGRADE_ALLOWED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/downgrade_allowed"+ "'", str0.equals("Upgrade/downgrade_allowed"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = org.apache.ambari.server.controller.internal.HostStatusHelper.isHostLive(ambariManagementController0, "1969-12-31 16:00:00", "StackServices/stack_version");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.STACK_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Artifacts/stack_name"+ "'", str0.equals("Artifacts/stack_name"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }

    org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.NAMENODE_HA;
    org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.NAMENODE_HA + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.NAMENODE_HA));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity2 = hostVersionDAO0.merge(hostVersionEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }

    org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType stackAdvisorCommandType0 = org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.VALIDATE_COMPONENT_LAYOUT;
    java.lang.String str1 = stackAdvisorCommandType0.toString();
    org.junit.Assert.assertTrue("'" + stackAdvisorCommandType0 + "' != '" + org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.VALIDATE_COMPONENT_LAYOUT + "'", stackAdvisorCommandType0.equals(org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.VALIDATE_COMPONENT_LAYOUT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "validate-component-layout"+ "'", str1.equals("validate-component-layout"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }

    org.apache.ambari.server.serveraction.kerberos.CreatePrincipalsServerAction createPrincipalsServerAction0 = new org.apache.ambari.server.serveraction.kerberos.CreatePrincipalsServerAction();

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }

    org.apache.ambari.server.state.alert.TargetType targetType0 = org.apache.ambari.server.state.alert.TargetType.LOG;
    org.junit.Assert.assertTrue("'" + targetType0 + "' != '" + org.apache.ambari.server.state.alert.TargetType.LOG + "'", targetType0.equals(org.apache.ambari.server.state.alert.TargetType.LOG));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_DESIRED_ADMIN_STATE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/desired_admin_state"+ "'", str0.equals("HostRoles/desired_admin_state"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }

    org.apache.ambari.server.notifications.DispatchFactory dispatchFactory0 = org.apache.ambari.server.notifications.DispatchFactory.getInstance();
    org.apache.ambari.server.notifications.NotificationDispatcher notificationDispatcher2 = null;
    dispatchFactory0.register("Artifacts/service_name", notificationDispatcher2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dispatchFactory0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack1 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack0.mergeProcessing(upgradePack1);
    org.apache.ambari.server.state.stack.UpgradePack upgradePack3 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack4 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack3.mergeProcessing(upgradePack4);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.UpgradePack.ProcessingComponent>> map_str_map_str_processingComponent6 = upgradePack3.getTasks();
    upgradePack0.mergeProcessing(upgradePack3);
    org.apache.ambari.server.state.StackId stackId8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack9 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.ConfigurationPackBuilder.build(upgradePack3, stackId8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_map_str_processingComponent6);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.STACK_UPGRADE_AUTO_RETRY_TIMEOUT_MINS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }

    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING;
    org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }

    org.apache.ambari.server.controller.ActionExecutionContext actionExecutionContext0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.lang.String> map_str_str1 = org.apache.ambari.server.utils.StageUtils.getCommandParamsStage(actionExecutionContext0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_HIVE_MULTIPLE_METASTORES;
    org.apache.ambari.server.checks.CheckDescription.COMPONENTS_INSTALLATION = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }

    org.apache.ambari.server.controller.AmbariServer.setupProxyAuth();

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.keyPropertyIds;
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor1 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor(map_type_str0);
    org.apache.ambari.server.state.kerberos.AbstractKerberosDescriptor abstractKerberosDescriptor2 = kerberosPrincipalDescriptor1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(abstractKerberosDescriptor2);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    java.util.Collection<java.lang.String> collection_str2 = componentModule1.getErrors();
    java.lang.String str3 = componentModule1.toString();
    org.apache.ambari.server.state.State state8 = org.apache.ambari.server.state.State.DISABLED;
    org.apache.ambari.server.state.SecurityType securityType9 = null;
    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider10 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition11 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider10);
    java.util.Set<java.lang.String> set_str12 = clusterDefinition11.getHosts();
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport15 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i16 = clusterHealthReport15.getInitStateHosts();
    int i17 = clusterHealthReport15.getHealthyStateHosts();
    int i18 = clusterHealthReport15.getStaleConfigsHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse19 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)10L, "stack_tools", state8, securityType9, set_str12, (java.lang.Integer)10, "_SERVICE_CHECK", clusterHealthReport15);
    org.apache.ambari.server.state.StackId stackId21 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str25 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str26 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse27 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId21, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str25, map_str_map_str_str26);
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask28 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask28.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array31 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask28 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task> arraylist_task32 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task32, task_array31);
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper34 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("widgets.json", "ViewInstanceInfo/view_name", set_str12, map_str_str25, (java.util.List<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task32);
    componentModule1.addErrors((java.util.Collection<java.lang.String>)set_str12);
    java.lang.String str36 = componentModule1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);
    org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state8.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }

    java.lang.String str0 = org.apache.ambari.server.utils.ShellCommandUtil.MASK_OWNER_ONLY_RW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "600"+ "'", str0.equals("600"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }

    java.lang.String str0 = org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper.HBASE_MARK_DRAINING_ONLY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mark_draining_only"+ "'", str0.equals("mark_draining_only"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }

    java.lang.String str0 = org.apache.ambari.server.utils.RequestUtils.getRemoteAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.GLUSTERFS_CLIENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }

    org.apache.ambari.server.bootstrap.BSResponse bSResponse0 = new org.apache.ambari.server.bootstrap.BSResponse();
    long long1 = bSResponse0.getRequestId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.AUTO_GROUP_CREATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }

    java.util.Date date0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Long long1 = org.apache.ambari.server.utils.DateUtils.getDateDifferenceInMinutes(date0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }

    java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, 0, 1, 10 };
    java.util.TreeSet<java.lang.Integer> treeset_i5 = new java.util.TreeSet<java.lang.Integer>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i5, i_array4);
    java.util.Set<java.lang.String> set_str7 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i5);
    java.util.Set<java.lang.String> set_str8 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i5);
    java.util.Set<java.lang.String> set_str9 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str9);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.MAHOUT_SERVICE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider.PERMISSION_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PermissionInfo/permission_name"+ "'", str0.equals("PermissionInfo/permission_name"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.HIVE_SITE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hive-site"+ "'", str0.equals("hive-site"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    javax.xml.validation.Validator validator3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.StackManager.validateAllPropertyXmlsInFolderRecursively(file2, validator3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }

    org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfileParser quickLinksProfileParser0 = new org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfileParser();
    byte[] byte_array7 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfile quickLinksProfile8 = quickLinksProfileParser0.parse(byte_array7);
      org.junit.Assert.fail("Expected exception of type org.codehaus.jackson.JsonParseException");
    } catch (org.codehaus.jackson.JsonParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.GLUSTERFS_SERVICE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }

    org.apache.ambari.server.orm.dao.AlertDefinitionDAO alertDefinitionDAO0 = new org.apache.ambari.server.orm.dao.AlertDefinitionDAO();
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    alertDefinitionDAO0.createOrUpdate(alertDefinitionEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }

    org.apache.ambari.server.api.services.ConfigGroupService configGroupService1 = new org.apache.ambari.server.api.services.ConfigGroupService("");
    javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = configGroupService1.getConfigGroup("ambari_db_rca_password", httpHeaders3, uriInfo4, "ViewUrlInfo/view_instance_version");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_RELEASE_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/release/version"+ "'", str0.equals("RepositoryVersions/release/version"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }

    java.lang.String str0 = org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper.DECOM_SLAVE_COMPONENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "slave_type"+ "'", str0.equals("slave_type"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str0);
    org.apache.ambari.server.controller.internal.ConfigurationTopologyException configurationTopologyException2 = new org.apache.ambari.server.controller.internal.ConfigurationTopologyException((java.util.Collection<java.lang.String>)set_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }

    org.apache.ambari.server.state.SecurityType securityType3 = null;
    java.lang.Integer[] i_array9 = new java.lang.Integer[] { 1, 0, 1, 10 };
    java.util.TreeSet<java.lang.Integer> treeset_i10 = new java.util.TreeSet<java.lang.Integer>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i10, i_array9);
    java.util.Set<java.lang.String> set_str12 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i10);
    org.apache.ambari.server.controller.ClusterRequest clusterRequest13 = new org.apache.ambari.server.controller.ClusterRequest((java.lang.Long)1L, "Versions/parent_extension_version", "ViewInstanceInfo/view_name", securityType3, "WidgetLayoutInfo/cluster_name", set_str12);
    java.lang.Long long14 = clusterRequest13.getClusterId();
    java.lang.Long long15 = clusterRequest13.getClusterId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L+ "'", long14.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L+ "'", long15.equals(1L));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CredentialResourceProvider.CREDENTIAL_CLUSTER_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Credential/cluster_name"+ "'", str0.equals("Credential/cluster_name"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackVersionResourceProvider.STACK_ACTIVE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/active"+ "'", str0.equals("Versions/active"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.CONTEXT_PATH_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/context_path"+ "'", str0.equals("ViewInstanceInfo/context_path"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }

    org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str1 = agentEnv0.getTransparentHugePage();
    java.lang.String[] str_array2 = agentEnv0.getExistingRepos();
    org.apache.ambari.server.agent.AgentEnv.Alternative alternative3 = new org.apache.ambari.server.agent.AgentEnv.Alternative();
    org.apache.ambari.server.agent.AgentEnv.Alternative[] alternative_array4 = new org.apache.ambari.server.agent.AgentEnv.Alternative[] { alternative3 };
    agentEnv0.setAlternatives(alternative_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(alternative_array4);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }

    org.apache.ambari.server.state.alert.Reporting.ReportingType reportingType0 = org.apache.ambari.server.state.alert.Reporting.ReportingType.PERCENT;
    org.junit.Assert.assertTrue("'" + reportingType0 + "' != '" + org.apache.ambari.server.state.alert.Reporting.ReportingType.PERCENT + "'", reportingType0.equals(org.apache.ambari.server.state.alert.Reporting.ReportingType.PERCENT));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }

    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils alertResourceProviderUtils0 = new org.apache.ambari.server.controller.internal.AlertResourceProviderUtils();

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    boolean b2 = componentInfo0.hasConfigType("RecoveryReport{summary='DISABLED', component_reports='[]'}");
    boolean b3 = componentInfo0.isDeleted();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertGroupResourceProvider.ALERT_GROUP_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertGroup/id"+ "'", str0.equals("AlertGroup/id"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }

    org.apache.ambari.server.agent.AgentRequests agentRequests0 = new org.apache.ambari.server.agent.AgentRequests();
    agentRequests0.setExecutionDetailsRequest("jdbc:postgresql://localhost/", "agent_stack_retry_on_unavailability", "validate-component-layout");

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.REPO_VERSION_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "repository_version"+ "'", str0.equals("repository_version"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_STACK_SERVICES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/stack_services"+ "'", str0.equals("RepositoryVersions/stack_services"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }

    org.apache.ambari.server.controller.RequestRequest requestRequest2 = new org.apache.ambari.server.controller.RequestRequest("777", (long)(-1));
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus3 = org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS;
    requestRequest2.setStatus(hostRoleStatus3);
    boolean b5 = hostRoleStatus3.isInProgress();
    org.junit.Assert.assertTrue("'" + hostRoleStatus3 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS + "'", hostRoleStatus3.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }

    java.lang.String str0 = org.apache.ambari.server.agent.RecoveryConfigHelper.RECOVERY_LIFETIME_MAX_COUNT_DEFAULT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "12"+ "'", str0.equals("12"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }

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
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.keyPropertyIds = map_type_str25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }

    org.apache.ambari.server.state.action.ActionEventType actionEventType0 = org.apache.ambari.server.state.action.ActionEventType.ACTION_COMPLETED;
    org.junit.Assert.assertTrue("'" + actionEventType0 + "' != '" + org.apache.ambari.server.state.action.ActionEventType.ACTION_COMPLETED + "'", actionEventType0.equals(org.apache.ambari.server.state.action.ActionEventType.ACTION_COMPLETED));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StageResourceProvider.STAGE_LOG_INFO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stage/log_info"+ "'", str0.equals("Stage/log_info"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }

    org.apache.ambari.server.state.Cluster cluster0 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.state.Config> map_str_config4 = null;
    java.util.Map<java.lang.Long,org.apache.ambari.server.state.Host> map_long_host5 = null;
    org.apache.ambari.server.state.Clusters clusters6 = null;
    org.apache.ambari.server.state.ConfigFactory configFactory7 = null;
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO8 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO9 = null;
    org.apache.ambari.server.orm.dao.ConfigGroupDAO configGroupDAO10 = null;
    org.apache.ambari.server.orm.dao.ConfigGroupConfigMappingDAO configGroupConfigMappingDAO11 = null;
    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO12 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.logging.LockFactory lockFactory13 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.configgroup.ConfigGroupImpl configGroupImpl14 = new org.apache.ambari.server.state.configgroup.ConfigGroupImpl(cluster0, "Stage/log_info", "server.jdbc.properties.", "", map_str_config4, map_long_host5, clusters6, configFactory7, clusterDAO8, hostDAO9, configGroupDAO10, configGroupConfigMappingDAO11, configGroupHostMappingDAO12, lockFactory13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }

    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping0 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition2 = aggregateDefinitionMapping0.getAggregateDefinitions((long)(short)1);
    java.util.List<java.lang.String> list_str4 = aggregateDefinitionMapping0.getAlertsWithAggregates(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }

    org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric.TemporalMetric temporalMetric2 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric.TemporalMetric("cluster-env", (java.lang.Number)10.0f);
    java.lang.Number number3 = temporalMetric2.getValue();
    boolean b4 = temporalMetric2.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }

    org.apache.ambari.server.state.kerberos.KerberosDescriptor kerberosDescriptor0 = null;
    org.apache.ambari.server.state.kerberos.KerberosDescriptor kerberosDescriptor1 = null;
    org.apache.ambari.server.state.kerberos.KerberosDescriptor kerberosDescriptor2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.kerberos.KerberosDescriptor kerberosDescriptor3 = org.apache.ambari.server.state.kerberos.KerberosDescriptorUpdateHelper.updateUserKerberosDescriptor(kerberosDescriptor0, kerberosDescriptor1, kerberosDescriptor2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.OracleHelper oracleHelper1 = new org.apache.ambari.server.orm.helpers.dbms.OracleHelper(databasePlatform0);
    boolean b2 = oracleHelper1.supportsColumnTypeChange();
    java.lang.StringBuilder stringBuilder3 = null;
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.StringBuilder stringBuilder6 = oracleHelper1.writeColumnRenameString(stringBuilder3, "ViewVersionInfo/parameters", dBColumnInfo5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.SERVER_HRC_STATUS_SUMMARY_CACHE_EXPIRY_DURATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_long0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }

    org.apache.ambari.server.state.services.MetricsRetrievalService metricsRetrievalService0 = new org.apache.ambari.server.state.services.MetricsRetrievalService();
    com.google.common.util.concurrent.Service.State state1 = metricsRetrievalService0.stopAndWait();
    com.google.common.util.concurrent.Service.State state2 = metricsRetrievalService0.stopAndWait();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(state1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(state2);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }

    org.apache.ambari.server.controller.spi.ClusterController clusterController0 = org.apache.ambari.server.topology.AmbariContext.getClusterController();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterController0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.String> singularattribute_alertDefinitionEntity_str0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.hash;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_str0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }

    org.apache.ambari.server.api.resources.RequestResourceDefinition requestResourceDefinition0 = new org.apache.ambari.server.api.resources.RequestResourceDefinition();

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)(-1L), "host_group", "Clusters/cluster_name", "java_version", "yarn.scheduler.capacity.root.queues", batch5, schedule6, "Stage/status", "Credential/key", "StackConfigurations/property_name", "downgrade_from_version", (java.lang.Integer)0);
    java.lang.Integer i13 = requestScheduleResponse12.getAuthenticatedUserId();
    java.lang.Integer i14 = requestScheduleResponse12.getAuthenticatedUserId();
    requestScheduleResponse12.setDescription("cluster.permissioninfo/resource_name.rootservicecomponents/service_name");
    java.lang.String str17 = requestScheduleResponse12.getClusterName();
    requestScheduleResponse12.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "host_group"+ "'", str17.equals("host_group"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider activeWidgetLayoutResourceProvider1 = new org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider(ambariManagementController0);
    java.util.Set<java.lang.String> set_str2 = activeWidgetLayoutResourceProvider1.getCategoryIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController3 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider4 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController3);
    org.apache.ambari.server.controller.spi.Request request5 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate6 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus7 = widgetResourceProvider4.deleteResources(request5, predicate6);
    java.lang.String[] str_array10 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request11 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array10);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus12 = widgetResourceProvider4.createResources(request11);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate15 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource16 = activeWidgetLayoutResourceProvider1.getResources(request11, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus12);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }

    java.lang.String str0 = org.apache.ambari.server.state.services.AlertNoticeDispatchService.AMBARI_DISPATCH_CREDENTIAL_USERNAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch.credential.username"+ "'", str0.equals("ambari.dispatch.credential.username"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }

    org.apache.ambari.server.api.resources.RootServiceResourceDefinition rootServiceResourceDefinition0 = new org.apache.ambari.server.api.resources.RootServiceResourceDefinition();
    java.util.List<org.apache.ambari.server.api.resources.ResourceDefinition.PostProcessor> list_postProcessor1 = rootServiceResourceDefinition0.getPostProcessors();
    java.util.Collection<java.lang.String> collection_str2 = rootServiceResourceDefinition0.getUpdateDirectives();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_postProcessor1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getServerTempDir();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "/var/lib/ambari-server/tmp"+ "'", str3.equals("/var/lib/ambari-server/tmp"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    java.lang.String str3 = configuration0.getRecommendationsArtifactsLifetime();
    java.lang.String str4 = configuration0.getRecoveryDisabledComponents();
    java.lang.String str5 = configuration0.getRcaDatabasePassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1w"+ "'", str3.equals("1w"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "mapred"+ "'", str5.equals("mapred"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_VERSION_DEFINITION_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/version_definition_id"+ "'", str0.equals("Repositories/version_definition_id"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }

    org.apache.ambari.server.audit.request.eventcreator.UserEventCreator userEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.UserEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type1 = userEventCreator0.getResourceTypes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type1);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }

    org.apache.ambari.server.stack.MasterHostResolver.Service service0 = org.apache.ambari.server.stack.MasterHostResolver.Service.OTHER;
    org.junit.Assert.assertTrue("'" + service0 + "' != '" + org.apache.ambari.server.stack.MasterHostResolver.Service.OTHER + "'", service0.equals(org.apache.ambari.server.stack.MasterHostResolver.Service.OTHER));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.RootServiceComponentResourceDefinition rootServiceComponentResourceDefinition1 = new org.apache.ambari.server.api.resources.RootServiceComponentResourceDefinition(type0);
    java.lang.String str2 = rootServiceComponentResourceDefinition1.getPluralName();
    java.lang.String str3 = rootServiceComponentResourceDefinition1.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "components"+ "'", str2.equals("components"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "component"+ "'", str3.equals("component"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.predicate.operators.RelationalOperator relationalOperator1 = org.apache.ambari.server.api.predicate.operators.RelationalOperatorFactory.createOperator("ClusterInfo/url");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }

    org.apache.ambari.server.orm.dao.GroupDAO groupDAO0 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity2 = groupDAO0.merge(groupEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.KDC_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "kdc_type"+ "'", str0.equals("kdc_type"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.HOSTGROUP_HOST_RACK_INFO_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "rack_info"+ "'", str0.equals("rack_info"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StageResourceProvider.STAGE_PROGRESS_PERCENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stage/progress_percent"+ "'", str0.equals("Stage/progress_percent"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)(-1L), "host_group", "Clusters/cluster_name", "java_version", "yarn.scheduler.capacity.root.queues", batch5, schedule6, "Stage/status", "Credential/key", "StackConfigurations/property_name", "downgrade_from_version", (java.lang.Integer)0);
    java.lang.String str13 = requestScheduleResponse12.getUpdateTime();
    requestScheduleResponse12.setStatus("ClusterInfo/url");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "downgrade_from_version"+ "'", str13.equals("downgrade_from_version"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.ComponentStackVersionResourceDefinition componentStackVersionResourceDefinition1 = new org.apache.ambari.server.api.resources.ComponentStackVersionResourceDefinition(type0);
    java.lang.String str2 = componentStackVersionResourceDefinition1.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "stack_versions"+ "'", str2.equals("stack_versions"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }

    org.apache.ambari.server.orm.dao.HostVersionDAO hostVersionDAO0 = new org.apache.ambari.server.orm.dao.HostVersionDAO();
    org.apache.ambari.server.state.StackId stackId2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity5 = hostVersionDAO0.findByClusterStackVersionAndHost("validate-component-layout", stackId2, "ambari.dispatch.snmp.community", "RepositoryVersions/stack_services");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }

    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest0 = new org.apache.ambari.server.controller.ConfigurationRequest();
    configurationRequest0.setSelected(true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }

    org.apache.ambari.server.state.stack.upgrade.TransferCoercionType transferCoercionType0 = org.apache.ambari.server.state.stack.upgrade.TransferCoercionType.YAML_ARRAY;
    org.junit.Assert.assertTrue("'" + transferCoercionType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.TransferCoercionType.YAML_ARRAY + "'", transferCoercionType0.equals(org.apache.ambari.server.state.stack.upgrade.TransferCoercionType.YAML_ARRAY));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }

    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask0 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask0.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.UpgradeScope upgradeScope3 = executeTask0.scope;
    org.junit.Assert.assertTrue("'" + upgradeScope3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeScope.ANY + "'", upgradeScope3.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeScope.ANY));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }

    org.apache.ambari.server.controller.spi.ClusterController clusterController0 = org.apache.ambari.server.controller.utilities.ClusterControllerHelper.getClusterController();
    org.apache.ambari.server.api.services.persistence.PersistenceManagerImpl persistenceManagerImpl1 = new org.apache.ambari.server.api.services.persistence.PersistenceManagerImpl(clusterController0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterController0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }

    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS0 = org.apache.ambari.server.api.services.ResultStatus.STATUS.NOT_FOUND;
    org.junit.Assert.assertTrue("'" + sTATUS0 + "' != '" + org.apache.ambari.server.api.services.ResultStatus.STATUS.NOT_FOUND + "'", sTATUS0.equals(org.apache.ambari.server.api.services.ResultStatus.STATUS.NOT_FOUND));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_CLUSTER_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/cluster_name"+ "'", str0.equals("UpgradeChecks/cluster_name"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }

    java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.DIRECTIVE_REGENERATE_KEYTABS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "regenerate_keytabs"+ "'", str0.equals("regenerate_keytabs"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.THEME_DEFAULT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ThemeInfo/default"+ "'", str0.equals("ThemeInfo/default"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }

    org.apache.ambari.server.controller.ivory.Cluster.Interface interface6 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array7 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface6 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface8 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface8, interface_array7);
    org.apache.ambari.server.controller.ivory.Cluster.Location location12 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array13 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location12 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location14 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location14, location_array13);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array16 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo17 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo17, propertyInfo_array16);
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo20 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo17, map_str_str19);
    org.apache.ambari.server.controller.ivory.Cluster cluster21 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface8, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location14, map_str_str19);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.Metric>> map_str_map_str_metric22 = null;
    org.apache.ambari.server.state.stack.MetricDefinition metricDefinition23 = new org.apache.ambari.server.state.stack.MetricDefinition("AlertReceivedEvent{cluserId=0, alerts=[{cluster=null, state=null, name=Repositories/repository_version_id, service=PrivilegeInfo/privilege_id, component=forceRefreshConfigTagsBeforeExecution, host=type, instance=kerberos_descriptor, text='null'}]}", map_str_str19, map_str_map_str_metric22);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.Metric> map_str_metric24 = metricDefinition23.getMetrics();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }

    org.apache.ambari.server.topology.ConfigRecommendationStrategy configRecommendationStrategy0 = org.apache.ambari.server.topology.ConfigRecommendationStrategy.ONLY_STACK_DEFAULTS_APPLY;
    org.junit.Assert.assertTrue("'" + configRecommendationStrategy0 + "' != '" + org.apache.ambari.server.topology.ConfigRecommendationStrategy.ONLY_STACK_DEFAULTS_APPLY + "'", configRecommendationStrategy0.equals(org.apache.ambari.server.topology.ConfigRecommendationStrategy.ONLY_STACK_DEFAULTS_APPLY));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }

    org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator groupEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance4 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest5 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders1, requestBody2, uriInfo3, resourceInstance4);
    int i6 = postRequest5.getAPIVersion();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS7 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus8 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS7);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS9 = resultStatus8.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS10 = resultStatus8.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl11 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.audit.event.AuditEvent auditEvent12 = groupEventCreator0.createAuditEvent((org.apache.ambari.server.api.services.Request)postRequest5, (org.apache.ambari.server.api.services.Result)resultImpl11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS10);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HOSTS_REPOSITORY_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }

    org.apache.ambari.server.state.alert.Scope scope0 = org.apache.ambari.server.state.alert.Scope.ANY;
    org.junit.Assert.assertTrue("'" + scope0 + "' != '" + org.apache.ambari.server.state.alert.Scope.ANY + "'", scope0.equals(org.apache.ambari.server.state.alert.Scope.ANY));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_SECURITY_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/security_type"+ "'", str0.equals("Clusters/security_type"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AmbariPrivilegeResourceProvider.PRIVILEGE_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/type"+ "'", str0.equals("PrivilegeInfo/type"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.AGENT_PACKAGE_PARALLEL_COMMANDS_LIMIT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }

    java.lang.String str0 = org.apache.ambari.server.state.repository.VersionDefinitionXml.SCHEMA_LOCATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "version_definition.xsd"+ "'", str0.equals("version_definition.xsd"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.Extension extension3 = new org.apache.ambari.server.controller.internal.Extension("java_version", "session_attributes", ambariManagementController2);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }

    org.apache.ambari.server.controller.jdbc.JobHistoryPostgresConnectionFactory jobHistoryPostgresConnectionFactory4 = new org.apache.ambari.server.controller.jdbc.JobHistoryPostgresConnectionFactory("no-cache", "recovery_lifetime_max_count", "package_list", "principal_type");
    // The following exception was thrown during execution in test generation
    try {
    java.sql.Connection connection5 = jobHistoryPostgresConnectionFactory4.getConnection();
      org.junit.Assert.fail("Expected exception of type org.postgresql.util.PSQLException");
    } catch (org.postgresql.util.PSQLException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HIVE_SERVICE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }

    org.apache.ambari.server.audit.request.eventcreator.DefaultEventCreator defaultEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.DefaultEventCreator();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS1 = defaultEventCreator0.getResultStatuses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }

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
    org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.keyPropertyIds = map_type_str28;
    
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

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }

    org.apache.ambari.server.controller.ServiceComponentRequest serviceComponentRequest6 = new org.apache.ambari.server.controller.ServiceComponentRequest("yarn.scheduler.capacity.root.queues", "StackLevelConfigurations/type", "RepositoryVersions/display_name", "ViewInstanceInfo/description", "", "view.extraction.threadpool.timeout");
    serviceComponentRequest6.setComponentCategory("encryption_types");

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }

    org.apache.ambari.server.security.credential.CredentialFactory credentialFactory0 = new org.apache.ambari.server.security.credential.CredentialFactory();

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }

    org.apache.ambari.server.controller.ResourceProviderFactory resourceProviderFactory0 = null;
    org.apache.ambari.server.controller.internal.AbstractControllerResourceProvider.init(resourceProviderFactory0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintClusterBinding blueprintClusterBinding0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintClusterBinding();
    java.util.Set<org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BindingHostGroup> set_bindingHostGroup1 = null;
    blueprintClusterBinding0.setHostGroups(set_bindingHostGroup1);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }

    org.apache.ambari.server.api.services.PermissionService permissionService0 = new org.apache.ambari.server.api.services.PermissionService();
    javax.ws.rs.core.Request request1 = null;
    org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService3 = permissionService0.getRoleAuthorizations(request1, "");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = roleAuthorizationService3.getAuthorizations(httpHeaders4, uriInfo5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorizationService3);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }

    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder2 = addBlueprintRequestAuditEventBuilder0.withBlueprintName("StackConfigurations/property_name");
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder4 = addBlueprintRequestAuditEventBuilder2.withOperation("blueprint_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder4);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.AGENT_STACK_RETRY_ON_REPO_UNAVAILABILITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }

    java.lang.Number number6 = null;
    java.lang.Number number10 = null;
    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO15 = new org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO((java.lang.Number)400, (java.lang.Number)(short)100, (java.lang.Number)10, (java.lang.Number)(short)0, (java.lang.Number)(byte)10, (java.lang.Number)(byte)10, number6, (java.lang.Number)10L, (java.lang.Number)10.0f, (java.lang.Number)(byte)0, number10, (java.lang.Number)(short)100, (java.lang.Number)0L, (java.lang.Number)(byte)-1, (java.lang.Number)(-1L));
    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO17 = hostRoleCommandStatusSummaryDTO15.timedout(1);
    java.lang.Long long18 = hostRoleCommandStatusSummaryDTO15.getStartTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommandStatusSummaryDTO17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L+ "'", long18.equals(100L));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }

    org.apache.ambari.server.controller.internal.DefaultResourcePredicateEvaluator defaultResourcePredicateEvaluator0 = new org.apache.ambari.server.controller.internal.DefaultResourcePredicateEvaluator();
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate3 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    java.lang.String str4 = filterPredicate3.getOperator();
    java.lang.String str5 = filterPredicate3.getPropertyId();
    org.apache.ambari.server.controller.spi.Resource resource6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = defaultResourcePredicateEvaluator0.evaluate((org.apache.ambari.server.controller.spi.Predicate)filterPredicate3, resource6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ".FILTER"+ "'", str4.equals(".FILTER"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Event/summary/memberships/removed"+ "'", str5.equals("Event/summary/memberships/removed"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.NOT_MANAGED_HDFS_PATH_LIST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "not_managed_hdfs_path_list"+ "'", str0.equals("not_managed_hdfs_path_list"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo0 = new org.apache.ambari.server.state.ChangedConfigInfo();
    boolean b2 = changedConfigInfo0.equals((java.lang.Object)"UpgradeChecks/repository_version");
    java.lang.String str3 = changedConfigInfo0.getType();
    changedConfigInfo0.setType("Hosts/maintenance_state");
    java.lang.String str6 = changedConfigInfo0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Hosts/maintenance_state"+ "'", str6.equals("Hosts/maintenance_state"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }

    org.apache.ambari.server.state.SecurityType securityType3 = null;
    java.lang.Integer[] i_array9 = new java.lang.Integer[] { 1, 0, 1, 10 };
    java.util.TreeSet<java.lang.Integer> treeset_i10 = new java.util.TreeSet<java.lang.Integer>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i10, i_array9);
    java.util.Set<java.lang.String> set_str12 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i10);
    org.apache.ambari.server.controller.ClusterRequest clusterRequest13 = new org.apache.ambari.server.controller.ClusterRequest((java.lang.Long)1L, "Versions/parent_extension_version", "ViewInstanceInfo/view_name", securityType3, "WidgetLayoutInfo/cluster_name", set_str12);
    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest14 = clusterRequest13.getServiceConfigVersionRequest();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serviceConfigVersionRequest14);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }

    org.apache.ambari.server.state.stack.upgrade.UpdateStackGrouping updateStackGrouping0 = new org.apache.ambari.server.state.stack.upgrade.UpdateStackGrouping();
    java.util.Iterator<org.apache.ambari.server.state.stack.upgrade.Grouping> iterator_grouping1 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateStackGrouping0.merge(iterator_grouping1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }

    java.lang.Comparable<org.apache.ambari.server.controller.logging.LogQueryResponse> comparable_logQueryResponse1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.predicate.GreaterEqualsPredicate<org.apache.ambari.server.controller.logging.LogQueryResponse> greaterequalspredicate_logQueryResponse2 = new org.apache.ambari.server.controller.predicate.GreaterEqualsPredicate<org.apache.ambari.server.controller.logging.LogQueryResponse>("AlertTarget/name", comparable_logQueryResponse1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }

    org.apache.ambari.server.topology.SettingFactory settingFactory0 = new org.apache.ambari.server.topology.SettingFactory();

  }

  @Test
  public void test131() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }

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
    // org.apache.ambari.server.state.StackId stackId11 = null;
    // upgradeContext4.setOriginalStackId(stackId11);
    // org.apache.ambari.server.state.StackId stackId13 = upgradeContext4.getTargetStackId();
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array7);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b9 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNull(stackId13);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.TASKTRACKER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }

    org.apache.ambari.server.api.services.ExtensionLinksService extensionLinksService0 = new org.apache.ambari.server.api.services.ExtensionLinksService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = extensionLinksService0.updateExtensionLink("PermissionInfo/version", httpHeaders2, uriInfo3, "mark_draining_only");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.String> singularattribute_alertDefinitionEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.componentName = singularattribute_alertDefinitionEntity_str0;

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity configGroupHostMappingEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    configGroupHostMappingDAO0.refresh(configGroupHostMappingEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }

    org.apache.ambari.server.orm.cache.ConfigGroupHostMappingImpl configGroupHostMappingImpl0 = new org.apache.ambari.server.orm.cache.ConfigGroupHostMappingImpl();
    java.lang.Long long1 = configGroupHostMappingImpl0.getHostId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }

    javax.net.SocketFactory socketFactory0 = org.apache.ambari.server.serveraction.kerberos.TrustingSSLSocketFactory.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(socketFactory0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_OUTPUTLOG_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/output_log"+ "'", str0.equals("Tasks/output_log"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_DISPLAY_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/display_name"+ "'", str0.equals("HostRoles/display_name"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HISTORYSERVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType3 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = mITKerberosOperationHandler0.testAdministratorCredentials();
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosOperationException");
    } catch (org.apache.ambari.server.serveraction.kerberos.KerberosOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType3);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }

    org.apache.ambari.server.controller.UserResponse userResponse4 = new org.apache.ambari.server.controller.UserResponse("Users/user_type", true, false, true);
    org.apache.ambari.server.security.authorization.UserType userType5 = userResponse4.getUserType();
    org.apache.ambari.server.security.authorization.UserType userType6 = userResponse4.getUserType();
    org.junit.Assert.assertTrue("'" + userType5 + "' != '" + org.apache.ambari.server.security.authorization.UserType.LOCAL + "'", userType5.equals(org.apache.ambari.server.security.authorization.UserType.LOCAL));
    org.junit.Assert.assertTrue("'" + userType6 + "' != '" + org.apache.ambari.server.security.authorization.UserType.LOCAL + "'", userType6.equals(org.apache.ambari.server.security.authorization.UserType.LOCAL));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_DISABLE;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_DISABLE + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_DISABLE));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }

    org.apache.ambari.server.orm.entities.ViewInstancePropertyEntityPK viewInstancePropertyEntityPK0 = new org.apache.ambari.server.orm.entities.ViewInstancePropertyEntityPK();
    viewInstancePropertyEntityPK0.setViewName("ViewUrlInfo/view_instance_version");
    java.lang.String str3 = viewInstancePropertyEntityPK0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }

    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping3 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition5 = aggregateDefinitionMapping3.getAggregateDefinitions((long)(short)1);
    org.apache.ambari.server.agent.AlertDefinitionCommand alertDefinitionCommand6 = new org.apache.ambari.server.agent.AlertDefinitionCommand("", "Hosts/last_registration_time", "${ambariVersion}", list_alertDefinition5);
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition7 = alertDefinitionCommand6.getAlertDefinitions();
    org.apache.ambari.server.agent.AgentCommand.AgentCommandType agentCommandType8 = null;
    alertDefinitionCommand6.setCommandType(agentCommandType8);
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition10 = alertDefinitionCommand6.getAlertDefinitions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition10);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_USER_OBJECT_CLASS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }

    org.apache.ambari.server.state.StackId stackId1 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str6 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse7 = new org.apache.ambari.server.controller.ConfigurationResponse("service", stackId1, "hi!", "ServiceInfo/credential_store_supported", (java.lang.Long)(-1L), map_str_str5, map_str_map_str_str6);
    configurationResponse7.setVersion((java.lang.Long)0L);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }

    org.apache.ambari.server.state.action.ActionType actionType1 = null;
    org.apache.ambari.server.state.action.ActionId actionId2 = new org.apache.ambari.server.state.action.ActionId((long)5, actionType1);
    org.apache.ambari.server.state.action.ActionImpl actionImpl4 = new org.apache.ambari.server.state.action.ActionImpl(actionId2, 10L);
    actionImpl4.setCompletionTime((long)10);
    actionImpl4.setLastUpdateTime((long)10);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertNoticeEntity,java.lang.String> singularattribute_alertNoticeEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertNoticeEntity_.uuid = singularattribute_alertNoticeEntity_str0;

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }

    org.apache.ambari.server.utils.HostAndPort hostAndPort2 = new org.apache.ambari.server.utils.HostAndPort("1969-12-31 16:00:00", (-1));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }

    org.apache.ambari.server.controller.spi.Resource[] resource_array0 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource1 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1, resource_array0);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl6 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1, true, false, (int)'#');
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl7 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource8 = queryResponseImpl7.getResources();
    int i9 = queryResponseImpl7.getTotalResourceCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }

    org.apache.ambari.server.state.stack.UpgradePack.OrderService orderService0 = new org.apache.ambari.server.state.stack.UpgradePack.OrderService();
    orderService0.serviceName = "org.apache.derby.jdbc.EmbeddedDriver";
    java.util.List<java.lang.String> list_str3 = org.apache.ambari.server.controller.utilities.PropertyHelper.AGGREGATE_FUNCTION_IDENTIFIERS;
    orderService0.components = list_str3;
    java.lang.String str5 = orderService0.serviceName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.apache.derby.jdbc.EmbeddedDriver"+ "'", str5.equals("org.apache.derby.jdbc.EmbeddedDriver"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }

    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest7 = new org.apache.ambari.server.controller.ServiceConfigVersionRequest("Hosts/os_type", "widgets.json", (java.lang.Long)0L, (java.lang.Long)5000L, (java.lang.Long)100L, "ranger-hbase-plugin-enabled", (java.lang.Boolean)false);
    serviceConfigVersionRequest7.setServiceName("skip_failure");
    serviceConfigVersionRequest7.setCreateTime((java.lang.Long)0L);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }

    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate2 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate3 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array4 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate3 };
    org.apache.ambari.server.controller.spi.Predicate predicate5 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array4);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate6 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array4);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate9 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate12 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array13 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate2, andPredicate6, filterPredicate9, filterPredicate12 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate14 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array13);
    org.apache.ambari.server.actionmanager.ActionType actionType16 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType21 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array23 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization24 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization24, roleAuthorization_array23);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition26 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType16, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType21, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization24);
    boolean b27 = andPredicate14.equals((java.lang.Object)(short)100);
    java.lang.String str28 = andPredicate14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Event/summary/memberships/removed.FILTER(service_type) AND (null) AND Credential/key.FILTER(Credential/key) AND Credential/key.FILTER(Credential/key)"+ "'", str28.equals("Event/summary/memberships/removed.FILTER(service_type) AND (null) AND Credential/key.FILTER(Credential/key) AND Credential/key.FILTER(Credential/key)"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.String> singularattribute_alertDefinitionEntity_str0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.source;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_str0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str4 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest5 = new org.apache.ambari.server.controller.ConfigurationRequest("", "Users/user_name", "CompatibleRepositoryVersions/stack_name", map_str_str3, map_str_map_str_str4);
    configurationRequest5.setVersion((java.lang.Long)(-1L));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.USERS_SKIPPED_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/summary/users/skipped"+ "'", str0.equals("Event/summary/users/skipped"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.String> singularattribute_alertHistoryEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertInstance = singularattribute_alertHistoryEntity_str0;

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    widgetResponse0.setWidgetType("Hosts/last_registration_time");
    java.lang.String str3 = widgetResponse0.getWidgetType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Hosts/last_registration_time"+ "'", str3.equals("Hosts/last_registration_time"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider.RESOURCE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PermissionInfo/resource_name"+ "'", str0.equals("PermissionInfo/resource_name"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }

    org.apache.ambari.server.controller.RootServiceResponseFactory rootServiceResponseFactory0 = new org.apache.ambari.server.controller.RootServiceResponseFactory();
    org.apache.ambari.server.controller.RootServiceComponentRequest rootServiceComponentRequest3 = new org.apache.ambari.server.controller.RootServiceComponentRequest("host_group", "hdfs-site");
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.RootServiceComponentResponse> set_rootServiceComponentResponse4 = rootServiceResponseFactory0.getRootServiceComponents(rootServiceComponentRequest3);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.ObjectNotFoundException");
    } catch (org.apache.ambari.server.ObjectNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }

    org.apache.ambari.server.state.theme.Tab tab0 = new org.apache.ambari.server.state.theme.Tab();
    org.apache.ambari.server.state.theme.TabLayout tabLayout1 = tab0.getTabLayout();
    tab0.setName("Event/summary/memberships/removed");
    org.apache.ambari.server.state.theme.Tab tab4 = new org.apache.ambari.server.state.theme.Tab();
    org.apache.ambari.server.state.theme.TabLayout tabLayout5 = tab4.getTabLayout();
    tab0.mergeWithParent(tab4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(tabLayout1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(tabLayout5);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str6 = org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreatorHelper.getNamedPropertyList((org.apache.ambari.server.api.services.Request)postRequest4, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse8.setActionName("");
    java.lang.String str11 = actionResponse8.getDefaultTimeout();
    actionResponse8.setDefaultTimeout("desired_version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "alerts.json"+ "'", str11.equals("alerts.json"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }

    org.apache.ambari.server.api.services.KerberosDescriptorService kerberosDescriptorService0 = new org.apache.ambari.server.api.services.KerberosDescriptorService();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = kerberosDescriptorService0.deleteKerberosDescriptor(httpHeaders1, uriInfo2, "configure-task-transfers");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }

    org.apache.ambari.server.controller.ivory.Cluster.Interface interface6 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array7 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface6 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface8 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface8, interface_array7);
    org.apache.ambari.server.controller.ivory.Cluster.Location location12 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array13 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location12 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location14 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location14, location_array13);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array16 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo17 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo17, propertyInfo_array16);
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo20 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo17, map_str_str19);
    org.apache.ambari.server.controller.ivory.Cluster cluster21 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface8, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location14, map_str_str19);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.Metric>> map_str_map_str_metric22 = null;
    org.apache.ambari.server.state.stack.MetricDefinition metricDefinition23 = new org.apache.ambari.server.state.stack.MetricDefinition("AlertReceivedEvent{cluserId=0, alerts=[{cluster=null, state=null, name=Repositories/repository_version_id, service=PrivilegeInfo/privilege_id, component=forceRefreshConfigTagsBeforeExecution, host=type, instance=kerberos_descriptor, text='null'}]}", map_str_str19, map_str_map_str_metric22);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo> map_str_propertyInfo24 = org.apache.ambari.server.controller.internal.StackDefinedPropertyProvider.getPropertyInfo(metricDefinition23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    java.util.Collection<java.lang.String> collection_str2 = componentModule1.getErrors();
    boolean b3 = componentModule1.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }

    java.lang.Iterable<org.apache.ambari.server.controller.spi.Resource> iterable_resource0 = null;
    org.apache.ambari.server.controller.spi.Resource resource2 = null;
    org.apache.ambari.server.controller.spi.Resource resource3 = null;
    org.apache.ambari.server.controller.internal.PageResponseImpl pageResponseImpl5 = new org.apache.ambari.server.controller.internal.PageResponseImpl(iterable_resource0, (int)(byte)0, resource2, resource3, (java.lang.Integer)0);
    org.apache.ambari.server.controller.spi.Resource resource6 = pageResponseImpl5.getNextResource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource6);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }

    org.apache.ambari.server.bootstrap.BSResponse bSResponse0 = new org.apache.ambari.server.bootstrap.BSResponse();
    org.apache.ambari.server.bootstrap.BSResponse.BSRunStat bSRunStat1 = bSResponse0.getStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(bSRunStat1);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    java.lang.String str9 = actionResponse8.getInputs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ViewUrlInfo/view_instance_version"+ "'", str9.equals("ViewUrlInfo/view_instance_version"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }

    org.apache.ambari.server.configuration.Configuration.DatabaseType databaseType0 = org.apache.ambari.server.configuration.Configuration.DatabaseType.SQL_SERVER;
    org.apache.ambari.server.configuration.Configuration.DatabaseType databaseType2 = databaseType0.get("/var/lib/ambari-server/tmp");
    org.junit.Assert.assertTrue("'" + databaseType0 + "' != '" + org.apache.ambari.server.configuration.Configuration.DatabaseType.SQL_SERVER + "'", databaseType0.equals(org.apache.ambari.server.configuration.Configuration.DatabaseType.SQL_SERVER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(databaseType2);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_BASE_DN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }

    org.apache.ambari.server.controller.utilities.PredicateHelper predicateHelper0 = new org.apache.ambari.server.controller.utilities.PredicateHelper();

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.predicate.operators.RelationalOperator relationalOperator1 = org.apache.ambari.server.api.predicate.operators.RelationalOperatorFactory.createOperator("AuthorizationInfo/cluster_name");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }

    java.lang.String str0 = org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider.TIMELINE_METRIC_CACHE_MANAGER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "timelineMetricCacheManager"+ "'", str0.equals("timelineMetricCacheManager"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }

    org.apache.ambari.server.notifications.dispatchers.EmailDispatcher emailDispatcher0 = new org.apache.ambari.server.notifications.dispatchers.EmailDispatcher();
    org.apache.ambari.server.notifications.Notification notification1 = null;
    // The following exception was thrown during execution in test generation
    try {
    emailDispatcher0.dispatch(notification1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = org.apache.ambari.server.orm.entities.HostEntity_.publicHostName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_str0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }

    org.apache.ambari.server.actionmanager.ActionType actionType0 = org.apache.ambari.server.actionmanager.ActionType.USER_REQUIRES_ADMIN;
    org.junit.Assert.assertTrue("'" + actionType0 + "' != '" + org.apache.ambari.server.actionmanager.ActionType.USER_REQUIRES_ADMIN + "'", actionType0.equals(org.apache.ambari.server.actionmanager.ActionType.USER_REQUIRES_ADMIN));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }

    org.apache.ambari.server.agent.ExecutionCommand executionCommand0 = null;
    org.apache.ambari.server.actionmanager.ExecutionCommandWrapper executionCommandWrapper1 = new org.apache.ambari.server.actionmanager.ExecutionCommandWrapper(executionCommand0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo0 = new org.apache.ambari.server.state.ChangedConfigInfo();
    boolean b2 = changedConfigInfo0.equals((java.lang.Object)"UpgradeChecks/repository_version");
    java.lang.String str3 = changedConfigInfo0.getType();
    changedConfigInfo0.setType("Hosts/maintenance_state");
    java.lang.String str6 = org.apache.ambari.server.utils.StageUtils.jaxbToString((java.lang.Object)"Hosts/maintenance_state");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"Hosts/maintenance_state\""+ "'", str6.equals("\"Hosts/maintenance_state\""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }

    org.apache.ambari.server.state.MaintenanceState maintenanceState0 = org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_HOST;
    org.apache.ambari.server.state.Service service1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.events.MaintenanceModeEvent maintenanceModeEvent2 = new org.apache.ambari.server.events.MaintenanceModeEvent(maintenanceState0, service1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + maintenanceState0 + "' != '" + org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_HOST + "'", maintenanceState0.equals(org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_HOST));

  }

  @Test
  public void test182() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }

    // org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning0 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
    // org.apache.ambari.server.state.Cluster cluster2 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType3 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction4 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj5 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext6 = new org.apache.ambari.server.state.UpgradeContext(cluster2, upgradeType3, direction4, map_str_obj5);
    // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest7 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType3);
    // // The following exception was thrown during execution in test generation
    // try {
    // boolean b8 = hiveNotRollingWarning0.isApplicable(prereqCheckRequest7);
    //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // } catch (java.lang.NullPointerException e) {
    //   // Expected exception.
    // }
    
    // org.junit.Assert.assertTrue("'" + upgradeType3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType3.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.Blueprint blueprint0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.Blueprint();
    java.util.Map<java.lang.String,org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintConfigurations> map_str_blueprintConfigurations1 = null;
    blueprint0.setConfigurations(map_str_blueprintConfigurations1);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }

    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = addUserToGroupRequestAuditEventBuilder0.withUrl("Upgrade");
    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder4 = addUserToGroupRequestAuditEventBuilder0.withAffectedUserName("HostRoles/hdp_version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder4);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }

    org.apache.ambari.server.orm.entities.HostGroupConfigEntityPK hostGroupConfigEntityPK0 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntityPK();
    java.lang.String str1 = hostGroupConfigEntityPK0.getHostGroupName();
    hostGroupConfigEntityPK0.setType("Stage/log_info");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_STACK_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/stack_name"+ "'", str0.equals("Repositories/stack_name"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.EXPERIMENTAL_CONCURRENCY_STAGE_PROCESSING_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.Extension extension3 = new org.apache.ambari.server.controller.internal.Extension("configure-task-key-value-pairs", "", ambariManagementController2);
    java.lang.String str4 = extension3.getVersion();
    java.lang.String str6 = extension3.getServiceForComponent("ClusterInfo/url");
    org.apache.ambari.server.state.ComponentInfo componentInfo8 = extension3.getComponentInfo("cardinality");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentInfo8);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceResourceProvider.SERVICE_SERVICE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ServiceInfo/service_name"+ "'", str0.equals("ServiceInfo/service_name"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }

    org.apache.ambari.server.api.services.PermissionService permissionService0 = new org.apache.ambari.server.api.services.PermissionService();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = permissionService0.getPermissions(httpHeaders1, uriInfo2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }

    org.apache.ambari.server.state.services.MetricsRetrievalService metricsRetrievalService0 = new org.apache.ambari.server.state.services.MetricsRetrievalService();
    java.lang.String str1 = metricsRetrievalService0.toString();
    java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
    metricsRetrievalService0.setThreadPoolExecutor(threadPoolExecutor2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "MetricsRetrievalService [NEW]"+ "'", str1.equals("MetricsRetrievalService [NEW]"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }

    org.apache.ambari.server.controller.UserResponse userResponse6 = new org.apache.ambari.server.controller.UserResponse("Users/user_type", true, false, true);
    org.apache.ambari.server.security.authorization.UserType userType7 = userResponse6.getUserType();
    org.apache.ambari.server.controller.UserResponse userResponse11 = new org.apache.ambari.server.controller.UserResponse("configure-task-key-value-pairs", userType7, true, false, false);
    org.apache.ambari.server.controller.UserResponse userResponse15 = new org.apache.ambari.server.controller.UserResponse("FilterOperator", userType7, false, true, true);
    org.junit.Assert.assertTrue("'" + userType7 + "' != '" + org.apache.ambari.server.security.authorization.UserType.LOCAL + "'", userType7.equals(org.apache.ambari.server.security.authorization.UserType.LOCAL));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }

    org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO0 = new org.apache.ambari.server.orm.dao.ClusterServiceDAO();
    org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    clusterServiceDAO0.remove(clusterServiceEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }

    org.apache.ambari.server.topology.LogicalRequestFactory logicalRequestFactory0 = new org.apache.ambari.server.topology.LogicalRequestFactory();

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }

    org.apache.ambari.server.state.HostHealthStatus.HealthStatus healthStatus0 = org.apache.ambari.server.state.HostHealthStatus.HealthStatus.HEALTHY;
    org.junit.Assert.assertTrue("'" + healthStatus0 + "' != '" + org.apache.ambari.server.state.HostHealthStatus.HealthStatus.HEALTHY + "'", healthStatus0.equals(org.apache.ambari.server.state.HostHealthStatus.HealthStatus.HEALTHY));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }

    org.apache.ambari.server.state.State state0 = org.apache.ambari.server.state.State.UNKNOWN;
    org.apache.ambari.server.state.State state1 = org.apache.ambari.server.state.State.INIT;
    boolean b2 = org.apache.ambari.server.state.State.isValidStateTransition(state0, state1);
    org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.apache.ambari.server.state.State.UNKNOWN + "'", state0.equals(org.apache.ambari.server.state.State.UNKNOWN));
    org.junit.Assert.assertTrue("'" + state1 + "' != '" + org.apache.ambari.server.state.State.INIT + "'", state1.equals(org.apache.ambari.server.state.State.INIT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }

    org.apache.ambari.server.metadata.ActionMetadata actionMetadata0 = new org.apache.ambari.server.metadata.ActionMetadata();
    java.util.List<java.lang.String> list_str2 = actionMetadata0.getActions("evaluate_when");
    org.apache.ambari.server.utils.CustomStringUtils.toLowerCase(list_str2);
    org.apache.ambari.server.utils.CustomStringUtils.toLowerCase(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CLIENT_API_SSL_CRT_PASS_FILE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }

    java.lang.String str0 = org.apache.ambari.server.api.resources.AlertTargetResourceDefinition.VALIDATE_CONFIG_DIRECTIVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "validate_config"+ "'", str0.equals("validate_config"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserResourceProvider.USER_ADMIN_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Users/admin"+ "'", str0.equals("Users/admin"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }

    org.apache.ambari.server.api.resources.AlertNoticeResourceDefinition alertNoticeResourceDefinition0 = new org.apache.ambari.server.api.resources.AlertNoticeResourceDefinition();

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.AMBARI_ALERT_ENTRY_OID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1"+ "'", str0.equals("1.3.6.1.4.1.18060.16.1.1.1"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }

    org.apache.ambari.server.state.Service service0 = null;
    org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity1 = null;
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo2 = null;
    org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO3 = new org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO();
    org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO4 = new org.apache.ambari.server.orm.dao.ClusterServiceDAO();
    org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO5 = null;
    org.apache.ambari.server.state.ServiceComponentHostFactory serviceComponentHostFactory6 = null;
    org.apache.ambari.server.orm.dao.StackDAO stackDAO7 = new org.apache.ambari.server.orm.dao.StackDAO();
    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher8 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.ServiceComponentImpl serviceComponentImpl9 = new org.apache.ambari.server.state.ServiceComponentImpl(service0, serviceComponentDesiredStateEntity1, ambariMetaInfo2, serviceComponentDesiredStateDAO3, clusterServiceDAO4, hostComponentDesiredStateDAO5, serviceComponentHostFactory6, stackDAO7, ambariEventPublisher8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }

    org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService1 = new org.apache.ambari.server.api.services.RoleAuthorizationService("hostRoleCommandStatusSummaryCacheEnabled");

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }

    org.apache.ambari.server.state.alert.AlertDefinitionFactory alertDefinitionFactory0 = new org.apache.ambari.server.state.alert.AlertDefinitionFactory();
    java.io.Reader reader1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.state.alert.AlertDefinition> set_alertDefinition3 = alertDefinitionFactory0.getAlertDefinitions(reader1, "PermissionInfo/version");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
    } catch (org.apache.ambari.server.AmbariException e) {
      // Expected exception.
    }

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }

    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.AccessUnauthorizedAuditEventBuilder accessUnauthorizedAuditEventBuilder0 = org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.builder();
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent accessUnauthorizedAuditEvent1 = accessUnauthorizedAuditEventBuilder0.build();
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.AccessUnauthorizedAuditEventBuilder accessUnauthorizedAuditEventBuilder3 = accessUnauthorizedAuditEventBuilder0.withRemoteIp("AlertTarget/notification_type");
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent accessUnauthorizedAuditEvent4 = accessUnauthorizedAuditEventBuilder0.build();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEvent1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEventBuilder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEvent4);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }

    org.apache.ambari.server.collections.Predicate predicate0 = null;
    java.lang.String str1 = org.apache.ambari.server.collections.PredicateUtils.toJSON(predicate0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }

    org.apache.ambari.server.state.stack.upgrade.StartGrouping startGrouping0 = new org.apache.ambari.server.state.stack.upgrade.StartGrouping();
    java.util.Iterator<org.apache.ambari.server.state.stack.upgrade.Grouping> iterator_grouping1 = null;
    // The following exception was thrown during execution in test generation
    try {
    startGrouping0.merge(iterator_grouping1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }

    org.apache.ambari.server.api.resources.ClusterResourceDefinition clusterResourceDefinition0 = new org.apache.ambari.server.api.resources.ClusterResourceDefinition();
    java.lang.String str1 = clusterResourceDefinition0.getSingularName();
    java.util.Collection<java.lang.String> collection_str2 = clusterResourceDefinition0.getUpdateDirectives();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "cluster"+ "'", str1.equals("cluster"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }

    java.lang.String str0 = org.apache.ambari.server.stack.StackManager.PROPERTY_SCHEMA_PATH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configuration-schema.xsd"+ "'", str0.equals("configuration-schema.xsd"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }

    org.apache.ambari.server.security.unsecured.rest.CertificateDownload certificateDownload0 = new org.apache.ambari.server.security.unsecured.rest.CertificateDownload();

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentProcessResourceProvider.HC_PROCESS_COMPONENT_NAME_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostComponentProcess/component_name"+ "'", str0.equals("HostComponentProcess/component_name"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler.KERBEROS_ENV_KDC_CREATE_ATTRIBUTES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "kdc_create_attributes"+ "'", str0.equals("kdc_create_attributes"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_KEY_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }

    org.apache.ambari.server.state.StackId stackId1 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str6 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse7 = new org.apache.ambari.server.controller.ConfigurationResponse("service", stackId1, "hi!", "ServiceInfo/credential_store_supported", (java.lang.Long)(-1L), map_str_str5, map_str_map_str_str6);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str8 = configurationResponse7.getConfigAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_map_str_str8);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertTargetResourceProvider.ALERT_TARGET_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertTarget/enabled"+ "'", str0.equals("AlertTarget/enabled"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }

    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.PENDING;
    org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.PENDING + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.PENDING));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }

    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.builder();
    org.apache.ambari.server.api.services.Request.Type type1 = null;
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder2 = addBlueprintRequestAuditEventBuilder0.withRequestType(type1);
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder4 = addBlueprintRequestAuditEventBuilder2.withBlueprintName("downgrade_from_version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder4);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }

    org.apache.ambari.server.api.services.KerberosDescriptorService kerberosDescriptorService0 = new org.apache.ambari.server.api.services.KerberosDescriptorService();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = kerberosDescriptorService0.deleteKerberosDescriptor(httpHeaders1, uriInfo2, "ViewInstanceInfo/icon64_path");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StackEntity,java.lang.String> singularattribute_stackEntity_str0 = null;
    org.apache.ambari.server.orm.entities.StackEntity_.stackName = singularattribute_stackEntity_str0;

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_DESIRED_STATE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/desired_state"+ "'", str0.equals("HostRoles/desired_state"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }

    org.apache.ambari.server.controller.logging.LoggingSearchPropertyProvider loggingSearchPropertyProvider0 = new org.apache.ambari.server.controller.logging.LoggingSearchPropertyProvider();

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,byte[]> singularattribute_hostRoleCommandEntity_byte_array0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.stdError = singularattribute_hostRoleCommandEntity_byte_array0;

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    java.util.Collection<java.lang.String> collection_str2 = componentModule1.getErrors();
    java.lang.String[] str_array21 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent24 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str22);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str22;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str26 = null;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController27 = null;
    org.apache.ambari.server.controller.internal.LoggingResourceProvider loggingResourceProvider28 = new org.apache.ambari.server.controller.internal.LoggingResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str22, map_type_str26, ambariManagementController27);
    componentModule1.addErrors((java.util.Collection<java.lang.String>)linkedhashset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CUSTOM_ACTION_DEFINITION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider1 = null;
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration2 = null;
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule3 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule4 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.ganglia.GangliaComponentPropertyProvider gangliaComponentPropertyProvider7 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaComponentPropertyProvider(map_str_map_str_propertyInfo0, uRLStreamProvider1, componentSSLConfiguration2, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule3, "AuthorizationInfo/resource_type", "AlertHistory/definition_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule4);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }

    java.io.FilenameFilter filenameFilter0 = org.apache.ambari.server.api.services.AmbariMetaInfo.FILENAME_FILTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(filenameFilter0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StackEntity,java.lang.String> singularattribute_stackEntity_str0 = org.apache.ambari.server.orm.entities.StackEntity_.stackVersion;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stackEntity_str0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }

    org.apache.ambari.server.api.predicate.Token.TYPE tYPE0 = org.apache.ambari.server.api.predicate.Token.TYPE.RELATIONAL_OPERATOR_FUNC;
    org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.ambari.server.api.predicate.Token.TYPE.RELATIONAL_OPERATOR_FUNC + "'", tYPE0.equals(org.apache.ambari.server.api.predicate.Token.TYPE.RELATIONAL_OPERATOR_FUNC));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SECONDARY_NAMENODE_MUST_BE_DELETED;
    org.apache.ambari.server.checks.CheckDescription.CLIENT_RETRY = checkDescription0;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_HIVE_ROLLING_WARNING = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test231() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }

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
    // upgradeContext4.setOriginalStackId(stackId15);
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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.EVENT_STATUS_DETAIL_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/status_detail"+ "'", str0.equals("Event/status_detail"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostStartEvent serviceComponentHostStartEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostStartEvent("java_home", "value", (long)2);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }

    org.apache.ambari.server.state.AlertState alertState5 = null;
    org.apache.ambari.server.state.Alert alert6 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState5);
    alert6.setLabel("Upgrade/abort_reason");
    java.lang.String str9 = alert6.getName();
    alert6.setHostName("_SERVICE_CHECK");
    java.lang.String str12 = alert6.getInstance();
    java.lang.String str13 = alert6.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Repositories/repository_version_id"+ "'", str9.equals("Repositories/repository_version_id"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "kerberos_descriptor"+ "'", str12.equals("kerberos_descriptor"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "kerberos_descriptor"+ "'", str13.equals("kerberos_descriptor"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }

    org.apache.ambari.server.state.theme.ConfigPlacement configPlacement0 = new org.apache.ambari.server.state.theme.ConfigPlacement();
    java.lang.String str1 = configPlacement0.getSubsectionTabName();
    configPlacement0.setConfig("AlertTarget/notification_type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }

    org.apache.ambari.server.controller.utilities.state.HiveServiceCalculatedState hiveServiceCalculatedState0 = new org.apache.ambari.server.controller.utilities.state.HiveServiceCalculatedState();
    org.apache.ambari.server.state.State state3 = hiveServiceCalculatedState0.getState("yarn.scheduler.capacity.root.queues", "FALCON_SERVICE_CHECK");
    org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.apache.ambari.server.state.State.UNKNOWN + "'", state3.equals(org.apache.ambari.server.state.State.UNKNOWN));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    org.apache.ambari.server.orm.entities.ExtensionLinkEntity extensionLinkEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    extensionLinkDAO0.remove(extensionLinkEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.String> singularattribute_alertDefinitionEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.helpURL = singularattribute_alertDefinitionEntity_str0;

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }

    org.apache.ambari.server.security.authorization.AmbariLdapUtils ambariLdapUtils0 = new org.apache.ambari.server.security.authorization.AmbariLdapUtils();

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }

    org.apache.ambari.server.view.configuration.AutoInstanceConfig autoInstanceConfig0 = new org.apache.ambari.server.view.configuration.AutoInstanceConfig();
    java.lang.String str1 = autoInstanceConfig0.getDescription();
    java.util.Set<java.lang.String> set_str2 = autoInstanceConfig0.getRoles();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_str2);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }

    javax.persistence.metamodel.SetAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,org.apache.ambari.server.orm.entities.AlertGroupEntity> setattribute_alertDefinitionEntity_alertGroupEntity0 = null;
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.alertGroups = setattribute_alertDefinitionEntity_alertGroupEntity0;

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.parsers.RequestBodyParser.BODY_TITLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Body"+ "'", str0.equals("Body"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }

    org.apache.ambari.server.state.alert.SourceType sourceType0 = org.apache.ambari.server.state.alert.SourceType.RECOVERY;
    org.junit.Assert.assertTrue("'" + sourceType0 + "' != '" + org.apache.ambari.server.state.alert.SourceType.RECOVERY + "'", sourceType0.equals(org.apache.ambari.server.state.alert.SourceType.RECOVERY));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.CLUSTER_MINUTE_TABLE_TTL_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "timeline.metrics.cluster.aggregator.minute.ttl"+ "'", str0.equals("timeline.metrics.cluster.aggregator.minute.ttl"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher.SECURITY_PRIV_PASSPHRASE_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch.snmp.security.priv.passphrase"+ "'", str0.equals("ambari.dispatch.snmp.security.priv.passphrase"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str19, str_array18);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent21 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str19);
    java.util.Set<java.lang.String> set_str22 = hostsAddedEvent21.getHostNames();
    org.apache.ambari.server.controller.spi.TemporalInfo temporalInfo24 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey timelineAppMetricCacheKey25 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey(set_str22, "Tasks/id", temporalInfo24);
    java.lang.String str26 = timelineAppMetricCacheKey25.getAppId();
    java.lang.String str27 = timelineAppMetricCacheKey25.getSpec();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Tasks/id"+ "'", str26.equals("Tasks/id"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }

    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate2 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate3 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array4 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate3 };
    org.apache.ambari.server.controller.spi.Predicate predicate5 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array4);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate6 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array4);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate9 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate12 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array13 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate2, andPredicate6, filterPredicate9, filterPredicate12 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate14 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array13);
    org.apache.ambari.server.actionmanager.ActionType actionType16 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType21 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array23 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization24 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization24, roleAuthorization_array23);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition26 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType16, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType21, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization24);
    boolean b27 = andPredicate14.equals((java.lang.Object)(short)100);
    java.util.Set<java.lang.String> set_str28 = org.apache.ambari.server.controller.utilities.PredicateHelper.getPropertyIds((org.apache.ambari.server.controller.spi.Predicate)andPredicate14);
    org.apache.ambari.server.agent.AgentEnv agentEnv31 = new org.apache.ambari.server.agent.AgentEnv();
    org.apache.ambari.server.agent.DiskInfo[] diskInfo_array32 = new org.apache.ambari.server.agent.DiskInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.agent.DiskInfo> arraylist_diskInfo33 = new java.util.ArrayList<org.apache.ambari.server.agent.DiskInfo>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.agent.DiskInfo>)arraylist_diskInfo33, diskInfo_array32);
    org.apache.ambari.server.state.host.HostHealthyHeartbeatEvent hostHealthyHeartbeatEvent35 = new org.apache.ambari.server.state.host.HostHealthyHeartbeatEvent("QuickLinkInfo/stack_version", (long)(byte)-1, agentEnv31, (java.util.List<org.apache.ambari.server.agent.DiskInfo>)arraylist_diskInfo33);
    boolean b36 = andPredicate14.equals((java.lang.Object)hostHealthyHeartbeatEvent35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(diskInfo_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request3 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array2);
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface10 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array11 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface10 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface12 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface12, interface_array11);
    org.apache.ambari.server.controller.ivory.Cluster.Location location16 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array17 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location16 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location18 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location18, location_array17);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array20 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo21 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo21, propertyInfo_array20);
    java.util.Map<java.lang.String,java.lang.String> map_str_str23 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo24 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo21, map_str_str23);
    org.apache.ambari.server.controller.ivory.Cluster cluster25 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface12, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location18, map_str_str23);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.Metric>> map_str_map_str_metric26 = null;
    org.apache.ambari.server.state.stack.MetricDefinition metricDefinition27 = new org.apache.ambari.server.state.stack.MetricDefinition("AlertReceivedEvent{cluserId=0, alerts=[{cluster=null, state=null, name=Repositories/repository_version_id, service=PrivilegeInfo/privilege_id, component=forceRefreshConfigTagsBeforeExecution, host=type, instance=kerberos_descriptor, text='null'}]}", map_str_str23, map_str_map_str_metric26);
    org.apache.ambari.server.utils.ShellCommandUtil.InteractiveHandler interactiveHandler28 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.utils.ShellCommandUtil.Result result30 = org.apache.ambari.server.utils.ShellCommandUtil.runCommand(str_array2, map_str_str23, interactiveHandler28, false);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str23);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }

    org.apache.ambari.server.audit.request.eventcreator.HostEventCreator hostEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.HostEventCreator();

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }

    org.apache.ambari.server.HostNotFoundException hostNotFoundException1 = new org.apache.ambari.server.HostNotFoundException("configure-task-key-value-pairs");

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }

    org.apache.ambari.server.utils.JaxbMapKeyMapAdapter jaxbMapKeyMapAdapter0 = new org.apache.ambari.server.utils.JaxbMapKeyMapAdapter();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str1 = null;
    org.apache.ambari.server.utils.JaxbMapKeyMap[] jaxbMapKeyMap_array2 = jaxbMapKeyMapAdapter0.marshal(map_str_map_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jaxbMapKeyMap_array2);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.TIMELINE_METRICS_CACHE_TTL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }

    org.apache.ambari.server.state.alert.SourceType sourceType0 = org.apache.ambari.server.state.alert.SourceType.METRIC;
    org.junit.Assert.assertTrue("'" + sourceType0 + "' != '" + org.apache.ambari.server.state.alert.SourceType.METRIC + "'", sourceType0.equals(org.apache.ambari.server.state.alert.SourceType.METRIC));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,org.apache.ambari.server.state.AlertState> singularattribute_alertHistoryEntity_alertState0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertState;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_alertState0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }

    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider0 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization1 = groupPrivilegeResourceProvider0.getRequiredCreateAuthorizations();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider3 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController2);
    org.apache.ambari.server.controller.spi.Request request4 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate5 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus6 = widgetResourceProvider3.deleteResources(request4, predicate5);
    java.util.Set<java.lang.String> set_str7 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str8 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str7);
    org.apache.ambari.server.controller.spi.Request request9 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str7);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus10 = widgetResourceProvider3.createResources(request9);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate13 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate14 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array15 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate14 };
    org.apache.ambari.server.controller.spi.Predicate predicate16 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array15);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate17 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array15);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate20 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate23 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array24 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate13, andPredicate17, filterPredicate20, filterPredicate23 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate25 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array24);
    org.apache.ambari.server.actionmanager.ActionType actionType27 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType32 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array34 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization35 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization35, roleAuthorization_array34);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition37 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType27, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType32, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization35);
    boolean b38 = andPredicate25.equals((java.lang.Object)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus39 = groupPrivilegeResourceProvider0.deleteResources(request9, (org.apache.ambari.server.controller.spi.Predicate)andPredicate25);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.controller.spi.SystemException");
    } catch (org.apache.ambari.server.controller.spi.SystemException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertTargetResourceProvider.ALERT_TARGET_PROPERTIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertTarget/properties"+ "'", str0.equals("AlertTarget/properties"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SRVR_API_ACCEPTOR_THREAD_COUNT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.keyPropertyIds;
    org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.keyPropertyIds = map_type_str0;
    org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.keyPropertyIds = map_type_str0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str0);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type1 = org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete;
    org.apache.ambari.server.controller.spi.Request request2 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate3 = null;
    org.apache.ambari.server.controller.internal.ResourceProviderEvent resourceProviderEvent4 = new org.apache.ambari.server.controller.internal.ResourceProviderEvent(type0, type1, request2, predicate3);
    org.apache.ambari.server.controller.spi.Resource.Type type5 = resourceProviderEvent4.getResourceType();
    org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type6 = resourceProviderEvent4.getType();
    org.apache.ambari.server.controller.spi.Resource.Type type7 = resourceProviderEvent4.getResourceType();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type1.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type6.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type7);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.DependencyInfo[] dependencyInfo_array1 = new org.apache.ambari.server.state.DependencyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.DependencyInfo> arraylist_dependencyInfo2 = new java.util.ArrayList<org.apache.ambari.server.state.DependencyInfo>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.DependencyInfo>)arraylist_dependencyInfo2, dependencyInfo_array1);
    componentInfo0.setDependencies((java.util.List<org.apache.ambari.server.state.DependencyInfo>)arraylist_dependencyInfo2);
    org.apache.ambari.server.state.CustomCommandDefinition customCommandDefinition6 = componentInfo0.getCustomCommandByName("Clusters/security_type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependencyInfo_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(customCommandDefinition6);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }

    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK configGroupHostMappingEntityPK0 = new org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK();
    java.lang.Long long1 = configGroupHostMappingEntityPK0.getConfigGroupId();
    java.lang.Long long2 = configGroupHostMappingEntityPK0.getHostId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = org.apache.ambari.server.orm.entities.HostEntity_.ipv6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_str0);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }

    org.apache.ambari.server.controller.RootServiceComponentRequest rootServiceComponentRequest2 = new org.apache.ambari.server.controller.RootServiceComponentRequest("host_group", "hdfs-site");
    rootServiceComponentRequest2.setComponentName("principal_type");
    java.lang.String str5 = rootServiceComponentRequest2.getServiceName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "host_group"+ "'", str5.equals("host_group"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.credential.PrincipalKeyCredential principalKeyCredential1 = org.apache.ambari.server.security.credential.PrincipalKeyCredential.fromValue("");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.credential.InvalidCredentialValueException");
    } catch (org.apache.ambari.server.security.credential.InvalidCredentialValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }

    org.apache.ambari.server.controller.RequestRequest requestRequest2 = new org.apache.ambari.server.controller.RequestRequest("777", (long)(-1));
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus3 = requestRequest2.getStatus();
    requestRequest2.setClusterName("version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hostRoleStatus3);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }

    org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.CLIENT_RETRY_PROPERTY;
    org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.CLIENT_RETRY_PROPERTY + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.CLIENT_RETRY_PROPERTY));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_STACK_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/stack_id"+ "'", str0.equals("HostRoles/stack_id"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }

    org.apache.ambari.server.view.ViewArchiveUtility viewArchiveUtility0 = new org.apache.ambari.server.view.ViewArchiveUtility();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.view.configuration.ViewConfig viewConfig3 = viewArchiveUtility0.getViewConfigFromExtractedArchive("Repositories/stack_name", false);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }

    org.apache.ambari.server.security.encryption.CredentialStoreType credentialStoreType0 = org.apache.ambari.server.security.encryption.CredentialStoreType.TEMPORARY;
    org.junit.Assert.assertTrue("'" + credentialStoreType0 + "' != '" + org.apache.ambari.server.security.encryption.CredentialStoreType.TEMPORARY + "'", credentialStoreType0.equals(org.apache.ambari.server.security.encryption.CredentialStoreType.TEMPORARY));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }

    org.apache.ambari.server.controller.ServiceComponentRequest serviceComponentRequest5 = new org.apache.ambari.server.controller.ServiceComponentRequest("", "hi!", "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url");
    java.lang.String str6 = serviceComponentRequest5.getClusterName();
    serviceComponentRequest5.setRecoveryEnabled("Stage/command_params");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }

    org.apache.ambari.server.upgrade.UpgradeCatalog[] upgradeCatalog_array0 = new org.apache.ambari.server.upgrade.UpgradeCatalog[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog> linkedhashset_upgradeCatalog1 = new java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog1, upgradeCatalog_array0);
    com.google.inject.persist.PersistService persistService3 = null;
    org.apache.ambari.server.orm.DBAccessor dBAccessor4 = null;
    org.apache.ambari.server.configuration.Configuration configuration5 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str6 = configuration5.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file7 = configuration5.getRecommendationsDir();
    java.lang.String str8 = configuration5.getHostsMapFile();
    java.lang.Integer i9 = configuration5.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties10 = configuration5.getPersistenceCustomProperties();
    long long11 = configuration5.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str12 = configuration5.getWebAppDir();
    java.lang.String str13 = configuration5.isAgentStackRetryOnInstallEnabled();
    org.apache.ambari.server.upgrade.SchemaUpgradeHelper schemaUpgradeHelper14 = new org.apache.ambari.server.upgrade.SchemaUpgradeHelper((java.util.Set<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog1, persistService3, dBAccessor4, configuration5);
    java.lang.String str15 = configuration5.getStackAdvisorScript();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(upgradeCatalog_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "nosniff"+ "'", str6.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 30000+ "'", i9.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 5000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "false"+ "'", str13.equals("false"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "/var/lib/ambari-server/resources/scripts/stack_advisor.py"+ "'", str15.equals("/var/lib/ambari-server/resources/scripts/stack_advisor.py"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackLevelConfigurationResourceProvider.DEPENDS_ON_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackLevelConfigurations/property_depends_on"+ "'", str0.equals("StackLevelConfigurations/property_depends_on"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_TWO_WAY_SSL_PORT;
    java.lang.String str1 = configurationproperty_str0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "security.server.two_way_ssl.port"+ "'", str1.equals("security.server.two_way_ssl.port"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.TEMPORARYSTORE_RETENTION_MINUTES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_long0);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.GenericDbmsHelper genericDbmsHelper1 = new org.apache.ambari.server.orm.helpers.dbms.GenericDbmsHelper(databasePlatform0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_START_STOP;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_START_STOP + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_START_STOP));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }

    org.apache.ambari.server.api.resources.OperatingSystemResourceDefinition operatingSystemResourceDefinition0 = new org.apache.ambari.server.api.resources.OperatingSystemResourceDefinition();
    java.lang.String str1 = operatingSystemResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "operating_systems"+ "'", str1.equals("operating_systems"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }

    org.apache.ambari.server.orm.cache.ConfigGroupHostMappingImpl configGroupHostMappingImpl0 = new org.apache.ambari.server.orm.cache.ConfigGroupHostMappingImpl();
    org.apache.ambari.server.state.configgroup.ConfigGroup configGroup1 = null;
    configGroupHostMappingImpl0.setConfigGroup(configGroup1);
    java.lang.Long long3 = configGroupHostMappingImpl0.getHostId();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController6 = null;
    org.apache.ambari.server.controller.internal.Extension extension7 = new org.apache.ambari.server.controller.internal.Extension("configure-task-key-value-pairs", "", ambariManagementController6);
    java.lang.String str8 = extension7.getVersion();
    boolean b9 = configGroupHostMappingImpl0.equals((java.lang.Object)extension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }

    int i0 = org.apache.ambari.server.proxy.ProxyService.URL_CONNECT_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 20000);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    int i5 = configuration0.getStackUpgradeAutoRetryCheckIntervalSecs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 20);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }

    org.apache.ambari.server.controller.StackConfigurationRequest stackConfigurationRequest4 = new org.apache.ambari.server.controller.StackConfigurationRequest("forceRefreshConfigTagsBeforeExecution", "forceRefreshConfigTagsBeforeExecution", "forceRefreshConfigTagsBeforeExecution", "hi!");
    java.lang.String str5 = stackConfigurationRequest4.getPropertyName();
    java.lang.String str6 = stackConfigurationRequest4.getStackVersion();
    stackConfigurationRequest4.setStackName("ViewUrlInfo/url_name");
    java.lang.String str9 = stackConfigurationRequest4.getServiceName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "forceRefreshConfigTagsBeforeExecution"+ "'", str6.equals("forceRefreshConfigTagsBeforeExecution"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "forceRefreshConfigTagsBeforeExecution"+ "'", str9.equals("forceRefreshConfigTagsBeforeExecution"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }

    org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager metricsCollectorHAManager0 = new org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager();
    boolean b2 = metricsCollectorHAManager0.isCollectorHostLive("ambari.dispatch-property.script");
    boolean b3 = metricsCollectorHAManager0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException3 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException();
    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException4 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("blueprint_name", (java.lang.Throwable)kerberosMissingAdminCredentialsException3);
    org.apache.ambari.server.api.predicate.InvalidQueryException invalidQueryException5 = new org.apache.ambari.server.api.predicate.InvalidQueryException("Artifacts/artifact_name", (java.lang.Throwable)kerberosMissingAdminCredentialsException3);
    org.apache.ambari.server.AmbariException ambariException6 = new org.apache.ambari.server.AmbariException("RootServiceComponents/server_clock", (java.lang.Throwable)kerberosMissingAdminCredentialsException3);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.JOURNALNODE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test285() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }

    // org.apache.ambari.server.state.UpgradeHelper upgradeHelper0 = new org.apache.ambari.server.state.UpgradeHelper();
    // org.apache.ambari.server.state.stack.UpgradePack upgradePack1 = new org.apache.ambari.server.state.stack.UpgradePack();
    // org.apache.ambari.server.state.stack.UpgradePack upgradePack2 = new org.apache.ambari.server.state.stack.UpgradePack();
    // upgradePack1.mergeProcessing(upgradePack2);
    // java.lang.String str4 = upgradePack2.getTarget();
    // org.apache.ambari.server.state.Cluster cluster5 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType6 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction7 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj8 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext9 = new org.apache.ambari.server.state.UpgradeContext(cluster5, upgradeType6, direction7, map_str_obj8);
    // upgradeContext9.setAutoSkipComponentFailures(true);
    // org.apache.ambari.server.state.ServiceComponentHost[] serviceComponentHost_array12 = new org.apache.ambari.server.state.ServiceComponentHost[] {  };
    // java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost> arraylist_serviceComponentHost13 = new java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost>();
    // boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost13, serviceComponentHost_array12);
    // upgradeContext9.addUnhealthy((java.util.List<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost13);
    // org.apache.ambari.server.state.ServiceComponentHost[] serviceComponentHost_array16 = new org.apache.ambari.server.state.ServiceComponentHost[] {  };
    // java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost> arraylist_serviceComponentHost17 = new java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost>();
    // boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost17, serviceComponentHost_array16);
    // upgradeContext9.addUnhealthy((java.util.List<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost17);
    // // The following exception was thrown during execution in test generation
    // try {
    // java.util.List<org.apache.ambari.server.state.UpgradeHelper.UpgradeGroupHolder> list_upgradeGroupHolder20 = upgradeHelper0.createSequence(upgradePack2, upgradeContext9);
    //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // } catch (java.lang.NullPointerException e) {
    //   // Expected exception.
    // }
    
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNull(str4);
    // org.junit.Assert.assertTrue("'" + upgradeType6 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType6.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array12);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b14 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array16);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }

    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder2 = privilegeChangeRequestAuditEventBuilder0.withGroup("StackLevelConfigurations/type");
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder4 = privilegeChangeRequestAuditEventBuilder2.withUrl("HostRoles/stale_configs");
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder6 = privilegeChangeRequestAuditEventBuilder4.withUrl("StackServices/stack_version");
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder8 = privilegeChangeRequestAuditEventBuilder4.withUrl("version_definition.xsd");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(privilegeChangeRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(privilegeChangeRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(privilegeChangeRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(privilegeChangeRequestAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(privilegeChangeRequestAuditEventBuilder8);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }

    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest7 = new org.apache.ambari.server.controller.ServiceConfigVersionRequest("Hosts/os_type", "widgets.json", (java.lang.Long)0L, (java.lang.Long)5000L, (java.lang.Long)100L, "ranger-hbase-plugin-enabled", (java.lang.Boolean)false);
    serviceConfigVersionRequest7.setIsCurrent((java.lang.Boolean)false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }

    org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO0 = null;
    org.apache.ambari.server.metadata.ActionMetadata actionMetadata1 = new org.apache.ambari.server.metadata.ActionMetadata();
    org.apache.ambari.server.state.stack.OsFamily osFamily2 = null;
    org.apache.ambari.server.stack.StackContext stackContext3 = new org.apache.ambari.server.stack.StackContext(metainfoDAO0, actionMetadata1, osFamily2);
    org.apache.ambari.server.stack.StackModule stackModule5 = null;
    // The following exception was thrown during execution in test generation
    try {
    stackContext3.registerRepoUpdateTask("false", stackModule5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }

    org.apache.ambari.server.api.resources.StackServiceResourceDefinition stackServiceResourceDefinition0 = new org.apache.ambari.server.api.resources.StackServiceResourceDefinition();
    java.lang.String str1 = stackServiceResourceDefinition0.getSingularName();
    java.lang.String str2 = stackServiceResourceDefinition0.getPluralName();
    java.lang.String str3 = stackServiceResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "service"+ "'", str1.equals("service"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "services"+ "'", str2.equals("services"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "services"+ "'", str3.equals("services"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }

    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder2 = changeAlertGroupRequestAuditEventBuilder0.withUrl("ViewVersionInfo/parameters");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder2);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }

    org.apache.ambari.server.state.AlertState alertState5 = null;
    org.apache.ambari.server.state.Alert alert6 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState5);
    alert6.setLabel("Upgrade/abort_reason");
    java.lang.String str9 = alert6.getName();
    alert6.setComponent("");
    alert6.setTimestamp((long)20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Repositories/repository_version_id"+ "'", str9.equals("Repositories/repository_version_id"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.CLUSTER_DEFAULT_TAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tag"+ "'", str0.equals("tag"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getMetricPropertyIds(type0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.ALERTS_CACHE_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }

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
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = clusterResponse13.getCredentialStoreServiceProperties();
    org.junit.Assert.assertTrue("'" + state2 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state2.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str14);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }

    org.apache.ambari.server.api.services.PermissionService permissionService0 = new org.apache.ambari.server.api.services.PermissionService();
    javax.ws.rs.core.Request request1 = null;
    org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService3 = permissionService0.getRoleAuthorizations(request1, "");
    javax.ws.rs.core.HttpHeaders httpHeaders5 = null;
    javax.ws.rs.core.UriInfo uriInfo6 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = permissionService0.updatePermission("QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", httpHeaders5, uriInfo6, "WidgetInfo/values");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorizationService3);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }

    org.apache.ambari.server.orm.dao.TopologyHostGroupDAO topologyHostGroupDAO0 = new org.apache.ambari.server.orm.dao.TopologyHostGroupDAO();
    org.apache.ambari.server.orm.entities.TopologyHostGroupEntity topologyHostGroupEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.TopologyHostGroupEntity topologyHostGroupEntity2 = topologyHostGroupDAO0.merge(topologyHostGroupEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }

    java.util.Set<java.lang.String> set_str0 = null;
    org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.propertyIds = set_str0;

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.URL_ID_COLUMN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "url_id"+ "'", str0.equals("url_id"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostStopEvent serviceComponentHostStopEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostStopEvent("Hosts/os_type", "ambari.dispatch.snmp.security.priv.passphrase", 10L);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }

    org.apache.ambari.server.api.services.HostComponentService hostComponentService2 = new org.apache.ambari.server.api.services.HostComponentService("manage_identities", "service_name");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = hostComponentService2.getHostComponent("HostRoles/hdp_version", httpHeaders4, uriInfo5, "java_version", "QuickLinkInfo/stack_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getConnectionPoolMaximumAge();
    java.util.Properties properties4 = configuration0.getPersistenceCustomProperties();
    int i5 = configuration0.getViewExtractionThreadPoolCoreSize();
    java.lang.String str6 = configuration0.getWebAppDir();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }

    org.apache.ambari.server.alerts.AgentHeartbeatAlertRunnable agentHeartbeatAlertRunnable1 = new org.apache.ambari.server.alerts.AgentHeartbeatAlertRunnable("yarn.scheduler.capacity.root.queues");
    agentHeartbeatAlertRunnable1.run();

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }

    org.apache.ambari.server.api.resources.ViewVersionResourceDefinition viewVersionResourceDefinition0 = new org.apache.ambari.server.api.resources.ViewVersionResourceDefinition();
    java.lang.String str1 = viewVersionResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "versions"+ "'", str1.equals("versions"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }

    org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService1 = new org.apache.ambari.server.api.services.RoleAuthorizationService("Clusters/desired_configs");
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = roleAuthorizationService1.getAuthorizations(httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str3 = valueAttributesInfo0.getIncrementStep();
    valueAttributesInfo0.setEntriesEditable((java.lang.Boolean)false);
    java.lang.Boolean b6 = valueAttributesInfo0.getShowPropertyName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b6);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }

    org.apache.ambari.server.actionmanager.HostRoleCommand[] hostRoleCommand_array0 = new org.apache.ambari.server.actionmanager.HostRoleCommand[] {  };
    java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand> arraylist_hostRoleCommand1 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleCommand>)arraylist_hostRoleCommand1, hostRoleCommand_array0);
    java.util.Map<java.lang.Long,org.apache.ambari.server.actionmanager.HostRoleCommand> map_long_hostRoleCommand3 = org.apache.ambari.server.utils.CommandUtils.convertToTaskIdCommandMap((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleCommand>)arraylist_hostRoleCommand1);
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor4 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor(map_long_hostRoleCommand3);
    java.lang.String str5 = kerberosPrincipalDescriptor4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommand_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_long_hostRoleCommand3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }

    org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler aDKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler();
    aDKerberosOperationHandler0.close();
    org.apache.ambari.server.security.credential.PrincipalKeyCredential principalKeyCredential2 = null;
    org.apache.ambari.server.configuration.Configuration configuration18 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str19 = configuration18.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file20 = configuration18.getRecommendationsDir();
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = configuration18.getPreviousDatabaseConnectorNames();
    org.apache.ambari.server.controller.ivory.Feed feed22 = new org.apache.ambari.server.controller.ivory.Feed("UpgradeChecks/repository_version", "", "operating_systems", "service_settings", "", "recovery_retry_interval", "RootServiceComponents/ciphers", "Event/summary/users/created", "AlertHistory/label", "Stage/command_params", "Hosts/host_name", "Upgrade/abort_reason", "RootServiceHostComponents/properties", "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", map_str_str21);
    // The following exception was thrown during execution in test generation
    try {
    aDKerberosOperationHandler0.open(principalKeyCredential2, "ViewUrlInfo/url_name", map_str_str21);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException");
    } catch (org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "nosniff"+ "'", str19.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str21);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.COMPONENT_CATEGORY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "component_category"+ "'", str0.equals("component_category"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }

    org.apache.ambari.server.view.ViewArchiveUtility viewArchiveUtility0 = new org.apache.ambari.server.view.ViewArchiveUtility();
    org.apache.ambari.server.configuration.Configuration configuration1 = new org.apache.ambari.server.configuration.Configuration();
    int i2 = configuration1.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher3 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration1);
    java.io.File file4 = configuration1.getRecommendationsDir();
    // The following exception was thrown during execution in test generation
    try {
    java.io.FileOutputStream fileOutputStream5 = viewArchiveUtility0.getFileOutputStream(file4);
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file4);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }

    org.springframework.ldap.core.DirContextAdapter dirContextAdapter0 = null;
    boolean b2 = org.apache.ambari.server.security.authorization.AmbariLdapUtils.isLdapObjectOutOfScopeFromBaseDn(dirContextAdapter0, "Tasks/status");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyResponse stackConfigurationDependencyResponse2 = new org.apache.ambari.server.controller.StackConfigurationDependencyResponse("widgets.json", "widgets.json");
    stackConfigurationDependencyResponse2.setPropertyName("configurations");
    java.lang.String str5 = stackConfigurationDependencyResponse2.getDependencyType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "widgets.json"+ "'", str5.equals("widgets.json"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.ClusterKerberosDescriptorResourceProvider clusterKerberosDescriptorResourceProvider1 = new org.apache.ambari.server.controller.internal.ClusterKerberosDescriptorResourceProvider(ambariManagementController0);
    java.lang.String[] str_array4 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request5 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array4);
    org.apache.ambari.server.api.predicate.operators.LessOperator lessOperator6 = new org.apache.ambari.server.api.predicate.operators.LessOperator();
    org.apache.ambari.server.controller.spi.Predicate predicate9 = lessOperator6.toPredicate("principal_type", "ACTION_USER_NAME");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus10 = clusterKerberosDescriptorResourceProvider1.deleteResources(request5, predicate9);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.controller.spi.SystemException");
    } catch (org.apache.ambari.server.controller.spi.SystemException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate9);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }

    org.apache.ambari.server.orm.dao.GroupDAO groupDAO0 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    groupDAO0.create(groupEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }

    org.apache.ambari.server.api.rest.HealthCheck healthCheck0 = new org.apache.ambari.server.api.rest.HealthCheck();
    java.lang.String str1 = healthCheck0.htmlCheck();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<html> <title>Status</title><body><h1>RUNNING</body></h1></html> "+ "'", str1.equals("<html> <title>Status</title><body><h1>RUNNING</body></h1></html> "));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }

    org.apache.ambari.server.state.ClientConfigFileDefinition clientConfigFileDefinition0 = new org.apache.ambari.server.state.ClientConfigFileDefinition();
    boolean b2 = clientConfigFileDefinition0.equals((java.lang.Object)"StackConfigurations/property_value_attributes");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }

    org.apache.ambari.server.state.HostComponentAdminState hostComponentAdminState0 = org.apache.ambari.server.state.HostComponentAdminState.INSERVICE;
    org.junit.Assert.assertTrue("'" + hostComponentAdminState0 + "' != '" + org.apache.ambari.server.state.HostComponentAdminState.INSERVICE + "'", hostComponentAdminState0.equals(org.apache.ambari.server.state.HostComponentAdminState.INSERVICE));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_GROUP_SEARCH_FILTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionLinkResourceProvider.STACK_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ExtensionLink/stack_version"+ "'", str0.equals("ExtensionLink/stack_version"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }

    org.apache.ambari.server.orm.dao.WidgetLayoutDAO widgetLayoutDAO0 = new org.apache.ambari.server.orm.dao.WidgetLayoutDAO();
    org.apache.ambari.server.orm.entities.WidgetLayoutEntity widgetLayoutEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.WidgetLayoutEntity widgetLayoutEntity2 = widgetLayoutDAO0.mergeWithFlush(widgetLayoutEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }

    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor2 = null;
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor3 = null;
    org.apache.ambari.server.collections.Predicate predicate4 = null;
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor5 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor("RootServiceComponents/ciphers", "StackConfigurations/property_value_attributes", kerberosPrincipalDescriptor2, kerberosKeytabDescriptor3, predicate4);
    org.apache.ambari.server.state.CheckHelper checkHelper6 = new org.apache.ambari.server.state.CheckHelper();
    boolean b7 = kerberosIdentityDescriptor5.equals((java.lang.Object)checkHelper6);
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor8 = kerberosIdentityDescriptor5.getKeytabDescriptor();
    java.lang.String str9 = kerberosIdentityDescriptor5.getName();
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor10 = kerberosIdentityDescriptor5.getKeytabDescriptor();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = kerberosKeytabDescriptor10.isContainer();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(kerberosKeytabDescriptor8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "RootServiceComponents/ciphers"+ "'", str9.equals("RootServiceComponents/ciphers"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(kerberosKeytabDescriptor10);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }

    org.apache.ambari.server.checks.StormShutdownWarning stormShutdownWarning0 = new org.apache.ambari.server.checks.StormShutdownWarning();

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.ambari.server.controller.HostRequest hostRequest3 = new org.apache.ambari.server.controller.HostRequest("Stage/host_params", "WidgetLayoutInfo/section_name", map_str_str2);
    hostRequest3.setHostGroupName("Requests/request_schedule/schedule_id");
    hostRequest3.setMaintenanceState("agent_stack_retry_on_unavailability");

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }

    org.apache.ambari.server.orm.entities.LdapSyncEventEntity.Status status0 = org.apache.ambari.server.orm.entities.LdapSyncEventEntity.Status.COMPLETE;
    org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.ambari.server.orm.entities.LdapSyncEventEntity.Status.COMPLETE + "'", status0.equals(org.apache.ambari.server.orm.entities.LdapSyncEventEntity.Status.COMPLETE));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }

    org.apache.ambari.server.state.SecurityType securityType0 = org.apache.ambari.server.state.SecurityType.KERBEROS;
    org.apache.ambari.server.topology.SecurityConfiguration securityConfiguration3 = new org.apache.ambari.server.topology.SecurityConfiguration(securityType0, "keytab_file_group_access", "AlertNotice/service_name");
    org.junit.Assert.assertTrue("'" + securityType0 + "' != '" + org.apache.ambari.server.state.SecurityType.KERBEROS + "'", securityType0.equals(org.apache.ambari.server.state.SecurityType.KERBEROS));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }

    java.util.Map<java.lang.String,java.util.Set<java.lang.String>> map_str_set_str0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.util.Set<java.lang.String>> map_str_set_str1 = org.apache.ambari.server.utils.StageUtils.substituteHostIndexes(map_str_set_str0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackLevelConfigurationResourceProvider.PROPERTY_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackLevelConfigurations/property_name"+ "'", str0.equals("StackLevelConfigurations/property_name"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }

    java.lang.String str0 = org.apache.ambari.server.topology.SecurityConfigurationFactory.KERBEROS_DESCRIPTOR_REFERENCE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "kerberos_descriptor_reference"+ "'", str0.equals("kerberos_descriptor_reference"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }

    org.apache.ambari.server.events.publishers.VersionEventPublisher versionEventPublisher0 = new org.apache.ambari.server.events.publishers.VersionEventPublisher();
    org.apache.ambari.server.metrics.system.impl.MetricsConfiguration metricsConfiguration1 = org.apache.ambari.server.metrics.system.impl.MetricsConfiguration.getMetricsConfiguration();
    versionEventPublisher0.register((java.lang.Object)metricsConfiguration1);
    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher3 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener alertLifecycleListener4 = new org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener(ambariEventPublisher3);
    versionEventPublisher0.register((java.lang.Object)ambariEventPublisher3);
    org.apache.ambari.server.events.listeners.upgrade.DistributeRepositoriesActionListener distributeRepositoriesActionListener6 = new org.apache.ambari.server.events.listeners.upgrade.DistributeRepositoriesActionListener(ambariEventPublisher3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(metricsConfiguration1);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.VALIDATION_RESULT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/validation_result"+ "'", str0.equals("ViewInstanceInfo/validation_result"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.DEFAULT_DERBY_SCHEMA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari"+ "'", str0.equals("ambari"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }

    org.apache.ambari.server.checks.HostsMasterMaintenanceCheck hostsMasterMaintenanceCheck0 = new org.apache.ambari.server.checks.HostsMasterMaintenanceCheck();
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType1 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    boolean b2 = hostsMasterMaintenanceCheck0.isRequired(upgradeType1);
    org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFile.KEYTAB_FILE_IS_CACHABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "keytab_file_is_cachable"+ "'", str0.equals("keytab_file_is_cachable"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }

    org.apache.ambari.server.ClusterNotFoundException clusterNotFoundException2 = new org.apache.ambari.server.ClusterNotFoundException((java.lang.Long)10L);
    org.apache.ambari.server.controller.internal.ConfigurationTopologyException configurationTopologyException3 = new org.apache.ambari.server.controller.internal.ConfigurationTopologyException("Event/summary/memberships/removed.FILTER(service_type) AND (null) AND Credential/key.FILTER(Credential/key) AND Credential/key.FILTER(Credential/key)", (java.lang.Throwable)clusterNotFoundException2);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }

    org.apache.ambari.server.api.services.ActiveWidgetLayoutService activeWidgetLayoutService1 = new org.apache.ambari.server.api.services.ActiveWidgetLayoutService("Repositories/version_definition_id");

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    java.lang.String str13 = stackConfigurationResponse12.getPropertyDescription();
    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = stackConfigurationResponse12.getPropertyAttributes();
    stackConfigurationResponse12.setRequired((java.lang.Boolean)false);
    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType17 = stackConfigurationResponse12.getPropertyType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Hosts/last_registration_time"+ "'", str13.equals("Hosts/last_registration_time"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_propertyType17);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }

    org.apache.ambari.server.alerts.StaleAlertRunnable staleAlertRunnable1 = new org.apache.ambari.server.alerts.StaleAlertRunnable("ACTION_NAME");

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer transfer0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer();
    java.lang.String str1 = transfer0.toString();
    org.apache.ambari.server.state.stack.upgrade.TransferOperation transferOperation2 = null;
    transfer0.operation = transferOperation2;
    org.apache.ambari.server.state.stack.upgrade.PropertyKeyState propertyKeyState4 = transfer0.ifKeyState;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Transfer{operation=null, fromType='null', fromKey='null', toKey='null', deleteKey='null', preserveEdits=false, defaultValue='null', coerceTo=null, ifKey='null', ifType='null', ifValue='null', ifKeyState='null', keepKeys=[]}"+ "'", str1.equals("Transfer{operation=null, fromType='null', fromKey='null', toKey='null', deleteKey='null', preserveEdits=false, defaultValue='null', coerceTo=null, ifKey='null', ifType='null', ifValue='null', ifKeyState='null', keepKeys=[]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(propertyKeyState4);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    java.util.Map<java.lang.String,org.apache.ambari.server.state.DesiredConfig> map_str_desiredConfig2 = hostResponse1.getDesiredConfigs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_desiredConfig2);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }

    org.apache.ambari.server.api.resources.RequestScheduleResourceDefinition requestScheduleResourceDefinition0 = new org.apache.ambari.server.api.resources.RequestScheduleResourceDefinition();
    java.lang.String str1 = requestScheduleResourceDefinition0.getPluralName();
    java.util.List<org.apache.ambari.server.api.resources.ResourceDefinition.PostProcessor> list_postProcessor2 = requestScheduleResourceDefinition0.getPostProcessors();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "request_schedules"+ "'", str1.equals("request_schedules"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_postProcessor2);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }

    org.apache.ambari.server.api.resources.ServiceConfigVersionResourceDefinition serviceConfigVersionResourceDefinition0 = new org.apache.ambari.server.api.resources.ServiceConfigVersionResourceDefinition();

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }

    org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType stackAdvisorCommandType0 = org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.VALIDATE_CONFIGURATIONS;
    org.junit.Assert.assertTrue("'" + stackAdvisorCommandType0 + "' != '" + org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.VALIDATE_CONFIGURATIONS + "'", stackAdvisorCommandType0.equals(org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.VALIDATE_CONFIGURATIONS));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_WP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.upgrades.UpdateDesiredStackAction.COMMAND_PARAM_DIRECTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "upgrade_direction"+ "'", str0.equals("upgrade_direction"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.String> singularattribute_hostRoleCommandEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.roleCommand = singularattribute_hostRoleCommandEntity_str0;

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.String> singularattribute_alertDefinitionEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.definitionName = singularattribute_alertDefinitionEntity_str0;

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.String> singularattribute_alertDefinitionEntity_str0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.label;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_str0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }

    org.apache.ambari.server.controller.ivory.Cluster.Interface interface3 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    java.lang.String str4 = interface3.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "timeline.metrics.host.aggregator.ttl"+ "'", str4.equals("timeline.metrics.host.aggregator.ttl"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }

    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS0 = org.apache.ambari.server.api.services.ResultStatus.STATUS.SERVER_ERROR;
    int i1 = sTATUS0.getStatus();
    java.lang.String str2 = sTATUS0.getDescription();
    org.junit.Assert.assertTrue("'" + sTATUS0 + "' != '" + org.apache.ambari.server.api.services.ResultStatus.STATUS.SERVER_ERROR + "'", sTATUS0.equals(org.apache.ambari.server.api.services.ResultStatus.STATUS.SERVER_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Internal Server Error"+ "'", str2.equals("Internal Server Error"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_LAST_HEARTBEAT_TIME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/last_heartbeat_time"+ "'", str0.equals("Hosts/last_heartbeat_time"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ActionResourceProvider.TARGET_HOST_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Actions/target_type"+ "'", str0.equals("Actions/target_type"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }

    org.apache.ambari.server.alerts.AgentHeartbeatAlertRunnable agentHeartbeatAlertRunnable1 = new org.apache.ambari.server.alerts.AgentHeartbeatAlertRunnable("forceRefreshConfigTagsBeforeExecution");

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }

    org.apache.ambari.server.alerts.AgentHeartbeatAlertRunnable agentHeartbeatAlertRunnable1 = new org.apache.ambari.server.alerts.AgentHeartbeatAlertRunnable("Upgrade/to_version");

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }

    org.apache.ambari.server.orm.entities.RequestEntity requestEntity0 = null;
    com.google.inject.Injector injector1 = null;
    org.apache.ambari.server.actionmanager.StageFactoryImpl stageFactoryImpl2 = new org.apache.ambari.server.actionmanager.StageFactoryImpl(injector1);
    org.apache.ambari.server.state.Clusters clusters3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.actionmanager.Request request4 = new org.apache.ambari.server.actionmanager.Request(requestEntity0, (org.apache.ambari.server.actionmanager.StageFactory)stageFactoryImpl2, clusters3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }

    org.apache.ambari.server.actionmanager.TargetHostType targetHostType0 = org.apache.ambari.server.actionmanager.TargetHostType.SPECIFIC;
    org.apache.ambari.server.notifications.Notification.Type type1 = org.apache.ambari.server.notifications.Notification.Type.ALERT;
    org.apache.ambari.server.state.fsm.InvalidStateTransitionException invalidStateTransitionException2 = new org.apache.ambari.server.state.fsm.InvalidStateTransitionException((java.lang.Enum<org.apache.ambari.server.actionmanager.TargetHostType>)targetHostType0, (java.lang.Enum<org.apache.ambari.server.notifications.Notification.Type>)type1);
    org.junit.Assert.assertTrue("'" + targetHostType0 + "' != '" + org.apache.ambari.server.actionmanager.TargetHostType.SPECIFIC + "'", targetHostType0.equals(org.apache.ambari.server.actionmanager.TargetHostType.SPECIFIC));
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.ambari.server.notifications.Notification.Type.ALERT + "'", type1.equals(org.apache.ambari.server.notifications.Notification.Type.ALERT));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }

    org.apache.ambari.server.orm.entities.AlertGroupEntity alertGroupEntity0 = null;
    boolean b2 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasViewAuthorization(alertGroupEntity0, (java.lang.Long)5000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }

    org.apache.ambari.server.controller.UserResponse userResponse4 = new org.apache.ambari.server.controller.UserResponse("Users/user_type", true, false, true);
    boolean b5 = userResponse4.isAdmin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }

    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping1 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<java.lang.String> list_str3 = aggregateDefinitionMapping1.getAlertsWithAggregates((long)(-1));
    org.apache.ambari.server.utils.JaxbMapKeyList jaxbMapKeyList4 = new org.apache.ambari.server.utils.JaxbMapKeyList("Users/user_name", list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    boolean b4 = componentInfo0.isCustomCommand("UpgradeChecks/id");
    componentInfo0.setVersionAdvertised(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }

    org.apache.ambari.server.controller.internal.Stack stack2 = null;
    org.apache.ambari.server.topology.Component[] component_array3 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component4 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, component_array3);
    org.apache.ambari.server.topology.Configuration configuration6 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl8 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack2, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, configuration6, "Repositories/latest_base_url");
    java.lang.String str9 = hostGroupImpl8.getCardinality();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Repositories/latest_base_url"+ "'", str9.equals("Repositories/latest_base_url"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)(-1L), "host_group", "Clusters/cluster_name", "java_version", "yarn.scheduler.capacity.root.queues", batch5, schedule6, "Stage/status", "Credential/key", "StackConfigurations/property_name", "downgrade_from_version", (java.lang.Integer)0);
    java.lang.Integer i13 = requestScheduleResponse12.getAuthenticatedUserId();
    java.lang.Integer i14 = requestScheduleResponse12.getAuthenticatedUserId();
    requestScheduleResponse12.setDescription("cluster.permissioninfo/resource_name.rootservicecomponents/service_name");
    requestScheduleResponse12.setAuthenticatedUserId((java.lang.Integer)30000);
    java.lang.String str19 = requestScheduleResponse12.getCreateUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Stage/status"+ "'", str19.equals("Stage/status"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/version"+ "'", str0.equals("Clusters/version"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostStopEvent serviceComponentHostStopEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostStopEvent("mapreduce2-log4j", "provision_action", (long)'4');

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    long long6 = configuration0.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str7 = configuration0.getWebAppDir();
    int i8 = configuration0.getViewExtractionThreadPoolMaxSize();
    
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
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 20);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }

    org.apache.ambari.server.security.ClientSecurityType clientSecurityType0 = org.apache.ambari.server.security.ClientSecurityType.LOCAL;
    org.junit.Assert.assertTrue("'" + clientSecurityType0 + "' != '" + org.apache.ambari.server.security.ClientSecurityType.LOCAL + "'", clientSecurityType0.equals(org.apache.ambari.server.security.ClientSecurityType.LOCAL));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionResourceProvider.EXTENSION_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Extensions/extension_name"+ "'", str0.equals("Extensions/extension_name"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }

    org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.LIVELINESS;
    org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.LIVELINESS + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.LIVELINESS));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }

    org.apache.ambari.server.api.services.LoggingService loggingService1 = new org.apache.ambari.server.api.services.LoggingService("AuthorizationInfo/cluster_name");
    javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = loggingService1.getSearchEngine("view.extraction.threadpool.timeout", httpHeaders3, uriInfo4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }

    org.apache.ambari.server.state.services.AlertNoticeDispatchService alertNoticeDispatchService0 = new org.apache.ambari.server.state.services.AlertNoticeDispatchService();
    com.google.common.util.concurrent.ListenableFuture<com.google.common.util.concurrent.Service.State> listenablefuture_state1 = alertNoticeDispatchService0.start();
    com.google.common.util.concurrent.Service.State state2 = alertNoticeDispatchService0.state();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listenablefuture_state1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(state2);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }

    org.apache.ambari.server.orm.entities.ServiceDesiredStateEntityPK serviceDesiredStateEntityPK0 = new org.apache.ambari.server.orm.entities.ServiceDesiredStateEntityPK();
    serviceDesiredStateEntityPK0.setClusterId((java.lang.Long)300000L);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_SKIP_PREREQUISITE_CHECKS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/skip_prerequisite_checks"+ "'", str0.equals("Upgrade/skip_prerequisite_checks"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_TASK_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }

    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer1 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.api.util.TreeNode<org.apache.ambari.server.api.query.QueryInfo> treenode_queryInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.util.TreeNode<java.util.Set<java.lang.String>> treenode_set_str4 = metricsPaddingRenderer1.finalizeProperties(treenode_queryInfo2, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }

    org.apache.ambari.server.controller.utilities.PropertyHelper propertyHelper0 = new org.apache.ambari.server.controller.utilities.PropertyHelper();

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }

    org.apache.ambari.server.state.services.CachedAlertFlushService cachedAlertFlushService0 = new org.apache.ambari.server.state.services.CachedAlertFlushService();

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }

    org.apache.ambari.server.api.services.PermissionService permissionService0 = new org.apache.ambari.server.api.services.PermissionService();
    javax.ws.rs.core.Request request1 = null;
    org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService3 = permissionService0.getRoleAuthorizations(request1, "");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = permissionService0.deletePermission(httpHeaders4, uriInfo5, "Tasks/custom_command_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorizationService3);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }

    org.apache.ambari.server.agent.AgentEnv agentEnv2 = new org.apache.ambari.server.agent.AgentEnv();
    org.apache.ambari.server.agent.DiskInfo[] diskInfo_array3 = new org.apache.ambari.server.agent.DiskInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.agent.DiskInfo> arraylist_diskInfo4 = new java.util.ArrayList<org.apache.ambari.server.agent.DiskInfo>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.agent.DiskInfo>)arraylist_diskInfo4, diskInfo_array3);
    org.apache.ambari.server.state.host.HostHealthyHeartbeatEvent hostHealthyHeartbeatEvent6 = new org.apache.ambari.server.state.host.HostHealthyHeartbeatEvent("QuickLinkInfo/stack_version", (long)(byte)-1, agentEnv2, (java.util.List<org.apache.ambari.server.agent.DiskInfo>)arraylist_diskInfo4);
    long long7 = hostHealthyHeartbeatEvent6.getHeartbeatTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(diskInfo_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.UserEntity userEntity4 = userDAO0.findLdapUserByName(".FILTER");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    componentInfo0.setCardinality("RootServiceComponents/ciphers");
    org.apache.ambari.server.state.LogDefinition logDefinition5 = componentInfo0.getPrimaryLog();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition5);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_STOP;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_STOP + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_STOP));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.orm.dao.ClusterVersionDAO clusterVersionDAO1 = null;
    org.apache.ambari.server.orm.dao.RepositoryVersionDAO repositoryVersionDAO2 = null;
    org.apache.ambari.server.state.stack.upgrade.RepositoryVersionHelper repositoryVersionHelper3 = new org.apache.ambari.server.state.stack.upgrade.RepositoryVersionHelper();
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.UpdateActiveRepoVersionOnStartup updateActiveRepoVersionOnStartup5 = new org.apache.ambari.server.stack.UpdateActiveRepoVersionOnStartup(clusterDAO0, clusterVersionDAO1, repositoryVersionDAO2, repositoryVersionHelper3, ambariMetaInfo4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }

    org.apache.ambari.server.state.stack.upgrade.StartGrouping startGrouping0 = new org.apache.ambari.server.state.stack.upgrade.StartGrouping();
    startGrouping0.supportsAutoSkipOnFailure = false;
    org.apache.ambari.server.state.stack.upgrade.StageWrapperBuilder stageWrapperBuilder3 = startGrouping0.getBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stageWrapperBuilder3);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,org.apache.ambari.server.orm.entities.HostEntity> singularattribute_hostRoleCommandEntity_hostEntity0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.host;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_hostEntity0);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyExecuteAuthorization("", (java.lang.Long)100L);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }

    java.lang.String str0 = org.apache.ambari.server.actionmanager.Stage.INTERNAL_HOSTNAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "_internal_ambari"+ "'", str0.equals("_internal_ambari"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }

    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport0 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i1 = clusterHealthReport0.getStaleConfigsHosts();
    clusterHealthReport0.setStaleConfigsHosts(2000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }

    org.apache.ambari.server.state.alert.AlertDefinition alertDefinition1 = null;
    org.apache.ambari.server.events.AlertDefinitionChangedEvent alertDefinitionChangedEvent2 = new org.apache.ambari.server.events.AlertDefinitionChangedEvent(1000L, alertDefinition1);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer transfer0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer();
    java.lang.String str1 = transfer0.toString();
    org.apache.ambari.server.state.stack.upgrade.PropertyKeyState propertyKeyState2 = null;
    transfer0.ifKeyState = propertyKeyState2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Transfer{operation=null, fromType='null', fromKey='null', toKey='null', deleteKey='null', preserveEdits=false, defaultValue='null', coerceTo=null, ifKey='null', ifType='null', ifValue='null', ifKeyState='null', keepKeys=[]}"+ "'", str1.equals("Transfer{operation=null, fromType='null', fromKey='null', toKey='null', deleteKey='null', preserveEdits=false, defaultValue='null', coerceTo=null, ifKey='null', ifType='null', ifValue='null', ifKeyState='null', keepKeys=[]}"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.PROPERTY_PROPERTY_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/property_type"+ "'", str0.equals("StackConfigurations/property_type"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo1 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider2 = null;
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration3 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider timelineMetricCacheProvider4 = null;
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule5 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule6 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule5);
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule7 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule8 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.MetricsPropertyProviderProxy metricsPropertyProviderProxy12 = org.apache.ambari.server.controller.metrics.MetricsPropertyProvider.createInstance(type0, map_str_map_str_propertyInfo1, uRLStreamProvider2, componentSSLConfiguration3, timelineMetricCacheProvider4, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule5, (org.apache.ambari.server.controller.metrics.MetricsServiceProvider)defaultProviderModule7, "ThemeInfo/stack_version", "dependency", "Configuration elements must be Maps");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule8);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }

    org.apache.ambari.server.api.resources.InstanceResourceDefinition instanceResourceDefinition0 = new org.apache.ambari.server.api.resources.InstanceResourceDefinition();
    java.lang.String str1 = instanceResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "instances"+ "'", str1.equals("instances"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }

    int i0 = org.apache.ambari.server.security.SecurePasswordHelper.DEFAULT_SECURE_PASSWORD_MIN_WHITESPACE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }

    org.apache.ambari.server.controller.internal.TemporalInfoImpl temporalInfoImpl3 = new org.apache.ambari.server.controller.internal.TemporalInfoImpl((long)' ', (long)(short)100, (long)(byte)100);
    org.apache.ambari.server.configuration.Configuration configuration4 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str5 = configuration4.getViewsPragmaHTTPResponseHeader();
    boolean b6 = configuration4.validateAgentHostnames();
    boolean b7 = temporalInfoImpl3.equals((java.lang.Object)configuration4);
    org.apache.ambari.server.logging.LockFactory lockFactory8 = new org.apache.ambari.server.logging.LockFactory(configuration4);
    java.lang.StringBuilder stringBuilder9 = null;
    lockFactory8.debugDump(stringBuilder9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "no-cache"+ "'", str5.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigureFunction configureFunction0 = new org.apache.ambari.server.state.stack.upgrade.ConfigureFunction();
    java.lang.String str1 = configureFunction0.summary;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }

    org.apache.ambari.server.state.quicklinks.Protocol protocol0 = new org.apache.ambari.server.state.quicklinks.Protocol();
    java.lang.String str1 = protocol0.getType();
    protocol0.setType("service_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer transfer0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer();
    java.lang.String str1 = transfer0.defaultValue;
    transfer0.toKey = "Theme";
    java.lang.String str4 = transfer0.defaultValue;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.DB_DRIVER_FILENAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "db_driver_filename"+ "'", str0.equals("db_driver_filename"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }

    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.AccessUnauthorizedAuditEventBuilder accessUnauthorizedAuditEventBuilder0 = org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.builder();
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent accessUnauthorizedAuditEvent1 = accessUnauthorizedAuditEventBuilder0.build();
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.AccessUnauthorizedAuditEventBuilder accessUnauthorizedAuditEventBuilder3 = accessUnauthorizedAuditEventBuilder0.withRemoteIp("AlertTarget/notification_type");
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.AccessUnauthorizedAuditEventBuilder accessUnauthorizedAuditEventBuilder5 = accessUnauthorizedAuditEventBuilder0.withUserName("default_realm");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEvent1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEventBuilder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEventBuilder5);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider1 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController0);
    org.apache.ambari.server.controller.spi.Resource.Type type2 = null;
    org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type3 = org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete;
    org.apache.ambari.server.controller.spi.Request request4 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate5 = null;
    org.apache.ambari.server.controller.internal.ResourceProviderEvent resourceProviderEvent6 = new org.apache.ambari.server.controller.internal.ResourceProviderEvent(type2, type3, request4, predicate5);
    org.apache.ambari.server.controller.spi.Resource.Type type7 = resourceProviderEvent6.getResourceType();
    org.apache.ambari.server.controller.spi.Predicate predicate8 = resourceProviderEvent6.getPredicate();
    ldapSyncEventResourceProvider1.updateObservers(resourceProviderEvent6);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type3.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate8);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }

    org.apache.ambari.server.api.services.UserAuthorizationService userAuthorizationService1 = new org.apache.ambari.server.api.services.UserAuthorizationService("HostRoles/state");

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }

    org.apache.ambari.server.state.quicklinks.Link link0 = new org.apache.ambari.server.state.quicklinks.Link();
    link0.setUrl("AlertHistory/definition_name");
    java.lang.String str3 = link0.getLabel();
    link0.setRequiresUserName("\"Hosts/maintenance_state\"");
    java.lang.String str6 = link0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }

    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder2 = addComponentToHostRequestAuditEventBuilder0.withRemoteIp("RootServiceComponents/component_name");
    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder4 = addComponentToHostRequestAuditEventBuilder2.withOperation("Versions/max_jdk");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder4);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.PREFIX_DIR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/var/lib/ambari-agent/data"+ "'", str0.equals("/var/lib/ambari-agent/data"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }

    org.apache.ambari.server.state.stack.upgrade.StopTask stopTask0 = new org.apache.ambari.server.state.stack.upgrade.StopTask();

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,byte[]> singularattribute_stageEntity_byte_array0 = null;
    org.apache.ambari.server.orm.entities.StageEntity_.clusterHostInfo = singularattribute_stageEntity_byte_array0;

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }

    org.apache.ambari.server.agent.AgentEnv.LiveService liveService0 = new org.apache.ambari.server.agent.AgentEnv.LiveService();
    java.lang.String str1 = liveService0.getName();
    liveService0.setDesc("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }

    org.apache.ambari.server.state.alert.Scope scope0 = org.apache.ambari.server.state.alert.Scope.HOST;
    org.junit.Assert.assertTrue("'" + scope0 + "' != '" + org.apache.ambari.server.state.alert.Scope.HOST + "'", scope0.equals(org.apache.ambari.server.state.alert.Scope.HOST));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }

    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance4 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest5 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders1, requestBody2, uriInfo3, resourceInstance4);
    int i6 = postRequest5.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type7 = postRequest5.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder8 = addUserToGroupRequestAuditEventBuilder0.withRequestType(type7);
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder10 = addUserToGroupRequestAuditEventBuilder8.withRemoteIp("provision_action");
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder11 = new org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS12 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus13 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS12);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS14 = resultStatus13.getStatus();
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder15 = addHostRequestAuditEventBuilder11.withResultStatus(resultStatus13);
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder16 = addUserToGroupRequestAuditEventBuilder8.withResultStatus(resultStatus13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type7.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addHostRequestAuditEventBuilder15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder16);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }

    org.apache.ambari.server.events.MetricsCollectorHostDownEvent metricsCollectorHostDownEvent2 = new org.apache.ambari.server.events.MetricsCollectorHostDownEvent("service_component_filter", "Actions/target_type");

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.PROPERTY_VALIDATION_RESULTS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/property_validation_results"+ "'", str0.equals("ViewInstanceInfo/property_validation_results"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }

    org.apache.ambari.server.serveraction.upgrades.YarnConfigCalculation yarnConfigCalculation0 = new org.apache.ambari.server.serveraction.upgrades.YarnConfigCalculation();
    java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Object> concurrentmap_str_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.CommandReport commandReport2 = yarnConfigCalculation0.execute(concurrentmap_str_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    valueAttributesInfo0.setMaximum("Clusters/security_type");

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }

    org.apache.ambari.server.state.ExtensionId extensionId2 = new org.apache.ambari.server.state.ExtensionId("requestschedule", "Clusters/total_hosts");

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }

    org.apache.ambari.server.state.repository.VersionDefinitionXml versionDefinitionXml0 = new org.apache.ambari.server.state.repository.VersionDefinitionXml();
    java.lang.String str1 = versionDefinitionXml0.xsdLocation;
    java.lang.String str2 = versionDefinitionXml0.xsdLocation;
    org.apache.ambari.server.state.StackInfo stackInfo3 = null;
    java.util.Collection<org.apache.ambari.server.state.repository.AvailableService> collection_availableService4 = versionDefinitionXml0.getAvailableServices(stackInfo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_availableService4);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }

    org.apache.ambari.server.state.alert.AlertUri alertUri0 = new org.apache.ambari.server.state.alert.AlertUri();
    java.lang.String str1 = alertUri0.getHttpsUri();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }

    org.apache.ambari.server.api.services.ViewPrivilegeService viewPrivilegeService3 = new org.apache.ambari.server.api.services.ViewPrivilegeService("downgrade_from_version", "AlertTarget/name", "WidgetLayoutInfo/section_name");
    javax.ws.rs.core.HttpHeaders httpHeaders5 = null;
    javax.ws.rs.core.UriInfo uriInfo6 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = viewPrivilegeService3.updatePrivileges("hosts", httpHeaders5, uriInfo6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }

    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder2 = userPasswordChangeRequestAuditEventBuilder0.withUserName("AlertTarget/notification_type");
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder4 = userPasswordChangeRequestAuditEventBuilder2.withOperation("PermissionInfo/permission_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder4);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }

    org.apache.ambari.server.api.resources.HostComponentProcessResourceDefinition hostComponentProcessResourceDefinition0 = new org.apache.ambari.server.api.resources.HostComponentProcessResourceDefinition();
    java.lang.String str1 = hostComponentProcessResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "processes"+ "'", str1.equals("processes"));

  }

  @Test
  public void test419() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }

    // org.apache.ambari.server.stack.HostsType hostsType0 = new org.apache.ambari.server.stack.HostsType();
    // org.apache.ambari.server.state.Cluster cluster1 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType2 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction3 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj4 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext5 = new org.apache.ambari.server.state.UpgradeContext(cluster1, upgradeType2, direction3, map_str_obj4);
    // upgradeContext5.setAutoSkipComponentFailures(true);
    // org.apache.ambari.server.state.ServiceComponentHost[] serviceComponentHost_array8 = new org.apache.ambari.server.state.ServiceComponentHost[] {  };
    // java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost> arraylist_serviceComponentHost9 = new java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost>();
    // boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost9, serviceComponentHost_array8);
    // upgradeContext5.addUnhealthy((java.util.List<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost9);
    // hostsType0.unhealthy = arraylist_serviceComponentHost9;
    // org.junit.Assert.assertTrue("'" + upgradeType2 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType2.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array8);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }

    org.apache.ambari.server.state.ClientConfigFileDefinition clientConfigFileDefinition0 = new org.apache.ambari.server.state.ClientConfigFileDefinition();
    java.lang.String str1 = clientConfigFileDefinition0.getFileName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }

    java.util.Map<java.lang.String,java.lang.Object> map_str_obj0 = null;
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface6 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array7 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface6 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface8 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface8, interface_array7);
    org.apache.ambari.server.controller.ivory.Cluster.Location location12 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array13 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location12 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location14 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location14, location_array13);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array16 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo17 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo17, propertyInfo_array16);
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo20 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo17, map_str_str19);
    org.apache.ambari.server.controller.ivory.Cluster cluster21 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface8, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location14, map_str_str19);
    java.util.Map<java.lang.String,java.lang.String> map_str_str22 = cluster21.getProperties();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.Request request23 = org.apache.ambari.server.controller.utilities.PropertyHelper.getUpdateRequest(map_str_obj0, map_str_str22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str22);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setStatus("ambari.dispatch-property.script");

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }

    org.apache.ambari.server.api.services.TargetClusterService targetClusterService0 = new org.apache.ambari.server.api.services.TargetClusterService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = targetClusterService0.getTargetCluster("The directory already exists, skipping.", httpHeaders2, uriInfo3, "RootService/service_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog250.COMPONENT_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "servicecomponentdesiredstate"+ "'", str0.equals("servicecomponentdesiredstate"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog2402 upgradeCatalog24021 = new org.apache.ambari.server.upgrade.UpgradeCatalog2402(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetResourceProvider.WIDGET_AUTHOR_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetInfo/author"+ "'", str0.equals("WidgetInfo/author"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }

    org.apache.ambari.server.api.services.ConfigGroupService configGroupService1 = new org.apache.ambari.server.api.services.ConfigGroupService("AlertTarget/enabled");

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType3 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    mITKerberosOperationHandler0.setDefaultRealm("hi!");
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType6 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType6);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.orm.dao.GroupDAO groupDAO4 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO5 = null;
    org.apache.ambari.server.security.authorization.Users users6 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.controller.internal.UserPrivilegeResourceProvider.init(userDAO0, clusterDAO3, groupDAO4, viewInstanceDAO5, users6);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.UserEntity userEntity9 = userDAO0.findByPK((java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertGroupResourceProvider.ALERT_GROUP_CLUSTER_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertGroup/cluster_name"+ "'", str0.equals("AlertGroup/cluster_name"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.ExtensionResourceDefinition extensionResourceDefinition1 = new org.apache.ambari.server.api.resources.ExtensionResourceDefinition(type0);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }

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
    java.lang.String[] str_array33 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request34 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array33);
    org.apache.ambari.server.controller.spi.Request request35 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array33);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate38 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS39 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus40 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS39);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS41 = resultStatus40.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS42 = resultStatus40.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl43 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus40);
    boolean b44 = filterPredicate38.equals((java.lang.Object)resultStatus40);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus45 = gSInstallerHostProvider2.updateResources(request35, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate38);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }

    org.apache.ambari.server.actionmanager.HostRoleCommandFactory hostRoleCommandFactory0 = null;
    org.apache.ambari.server.topology.AmbariContext.init(hostRoleCommandFactory0);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }

    java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.DIRECTIVE_MANAGE_KERBEROS_IDENTITIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "manage_kerberos_identities"+ "'", str0.equals("manage_kerberos_identities"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    java.lang.Long long1 = widgetResponse0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);

  }

  @Test
  public void test436() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }

    // org.apache.ambari.server.checks.HostMaintenanceModeCheck hostMaintenanceModeCheck0 = new org.apache.ambari.server.checks.HostMaintenanceModeCheck();
    // org.apache.ambari.server.checks.CheckDescription checkDescription1 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    // org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck3 = new org.apache.ambari.server.state.stack.PrerequisiteCheck(checkDescription1, "upgrade_suspended");
    // java.lang.String[] str_array22 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    // java.util.LinkedHashSet<java.lang.String> linkedhashset_str23 = new java.util.LinkedHashSet<java.lang.String>();
    // boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str23, str_array22);
    // org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent25 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str23);
    // org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str23;
    // prerequisiteCheck3.setFailedOn(linkedhashset_str23);
    // org.apache.ambari.server.state.Cluster cluster29 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType30 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction31 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj32 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext33 = new org.apache.ambari.server.state.UpgradeContext(cluster29, upgradeType30, direction31, map_str_obj32);
    // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest34 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType30);
    // // The following exception was thrown during execution in test generation
    // try {
    // hostMaintenanceModeCheck0.perform(prerequisiteCheck3, prereqCheckRequest34);
    //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // } catch (java.lang.NullPointerException e) {
    //   // Expected exception.
    // }
    
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(checkDescription1);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(str_array22);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b24 == true);
    // org.junit.Assert.assertTrue("'" + upgradeType30 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType30.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }

    org.apache.ambari.server.RoleCommand roleCommand0 = org.apache.ambari.server.RoleCommand.START;
    org.junit.Assert.assertTrue("'" + roleCommand0 + "' != '" + org.apache.ambari.server.RoleCommand.START + "'", roleCommand0.equals(org.apache.ambari.server.RoleCommand.START));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.COMPONENT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "components"+ "'", str0.equals("components"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str2 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str1);
    org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException3 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type0, set_str2);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str4 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.keyPropertyIds;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController5 = null;
    org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider6 = new org.apache.ambari.server.controller.internal.ActionResourceProvider(set_str2, map_type_str4, ambariManagementController5);
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization7 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization8 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization9 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization10 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization11 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization12 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array13 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization7, roleAuthorization8, roleAuthorization9, roleAuthorization10, roleAuthorization11, roleAuthorization12 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization14 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization14, roleAuthorization_array13);
    actionResourceProvider6.setRequiredUpdateAuthorizations((java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization14);
    java.lang.String[] str_array19 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request20 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array19);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate23 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource24 = actionResourceProvider6.getResources(request20, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str4);
    org.junit.Assert.assertTrue("'" + roleAuthorization7 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK + "'", roleAuthorization7.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK));
    org.junit.Assert.assertTrue("'" + roleAuthorization8 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS + "'", roleAuthorization8.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS));
    org.junit.Assert.assertTrue("'" + roleAuthorization9 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS + "'", roleAuthorization9.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS));
    org.junit.Assert.assertTrue("'" + roleAuthorization10 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization10.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));
    org.junit.Assert.assertTrue("'" + roleAuthorization11 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK + "'", roleAuthorization11.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK));
    org.junit.Assert.assertTrue("'" + roleAuthorization12 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA + "'", roleAuthorization12.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request20);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }

    org.apache.ambari.server.state.stack.upgrade.Grouping grouping0 = new org.apache.ambari.server.state.stack.upgrade.Grouping();

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    java.lang.String str1 = widgetResponse0.getAuthor();
    widgetResponse0.setWidgetType("cluster");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    stackConfigurationResponse12.setPropertyName("sqlserver");
    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType15 = stackConfigurationResponse12.getPropertyType();
    stackConfigurationResponse12.setServiceName("AlertHistory/cluster_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_propertyType15);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }

    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest7 = new org.apache.ambari.server.controller.ServiceConfigVersionRequest("Hosts/os_type", "widgets.json", (java.lang.Long)0L, (java.lang.Long)5000L, (java.lang.Long)100L, "ranger-hbase-plugin-enabled", (java.lang.Boolean)false);
    serviceConfigVersionRequest7.setServiceName("skip_failure");
    serviceConfigVersionRequest7.setClusterName("##");

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.StartTask.actionVerb;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Starting"+ "'", str0.equals("Starting"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BindingHostGroup bindingHostGroup0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BindingHostGroup();
    java.lang.String str1 = bindingHostGroup0.getName();
    bindingHostGroup0.setName("WidgetLayoutInfo/section_name");
    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BindingHostGroup bindingHostGroup4 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BindingHostGroup();
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.controller.ivory.Feed feed20 = new org.apache.ambari.server.controller.ivory.Feed("AlertTarget/notification_type", "Stage/command_params", "Alert/host_name", "extensions", "desired_version", "TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", "ERROR", "ViewInstanceInfo/cluster_handle", "", "AlertTarget/notification_type", "Theme", "Stage/host_params", "AlertHistory/id", "Versions/stack-errors", map_str_str19);
    org.apache.ambari.server.state.State state25 = org.apache.ambari.server.state.State.DISABLED;
    org.apache.ambari.server.state.SecurityType securityType26 = null;
    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider27 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition28 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider27);
    java.util.Set<java.lang.String> set_str29 = clusterDefinition28.getHosts();
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport32 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i33 = clusterHealthReport32.getInitStateHosts();
    int i34 = clusterHealthReport32.getHealthyStateHosts();
    int i35 = clusterHealthReport32.getStaleConfigsHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse36 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)10L, "stack_tools", state25, securityType26, set_str29, (java.lang.Integer)10, "_SERVICE_CHECK", clusterHealthReport32);
    org.apache.ambari.server.state.StackId stackId38 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str42 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str43 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse44 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId38, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str42, map_str_map_str_str43);
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask45 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask45.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array48 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask45 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task> arraylist_task49 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task49, task_array48);
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper51 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("widgets.json", "ViewInstanceInfo/view_name", set_str29, map_str_str42, (java.util.List<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task49);
    org.apache.ambari.server.state.StackId stackId53 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str57 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str58 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse59 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId53, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str57, map_str_map_str_str58);
    java.util.LinkedHashSet<java.util.Map<java.lang.String,java.lang.String>> linkedhashset_map_str_str60 = new java.util.LinkedHashSet<java.util.Map<java.lang.String,java.lang.String>>();
    boolean b61 = linkedhashset_map_str_str60.add(map_str_str19);
    boolean b62 = linkedhashset_map_str_str60.add(map_str_str42);
    boolean b63 = linkedhashset_map_str_str60.add(map_str_str57);
    bindingHostGroup4.setHosts((java.util.Set<java.util.Map<java.lang.String,java.lang.String>>)linkedhashset_map_str_str60);
    bindingHostGroup0.setHosts((java.util.Set<java.util.Map<java.lang.String,java.lang.String>>)linkedhashset_map_str_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);
    org.junit.Assert.assertTrue("'" + state25 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state25.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds;
    org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException2 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type0, set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }

    org.apache.ambari.server.utils.ShellCommandUtil.setUnixFilePermissions("AlertTarget/properties", "PrivilegeInfo/principal_type");

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }

    org.apache.ambari.server.controller.utilities.state.HBaseServiceCalculatedState hBaseServiceCalculatedState0 = new org.apache.ambari.server.controller.utilities.state.HBaseServiceCalculatedState();
    org.apache.ambari.server.state.State state3 = hBaseServiceCalculatedState0.getState("cluster_id", "AlertTarget/name");
    org.apache.ambari.server.state.State state6 = hBaseServiceCalculatedState0.getState("include_ambari_identity", "RecoveryReport{summary='DISABLED', component_reports='[]'}");
    org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.apache.ambari.server.state.State.UNKNOWN + "'", state3.equals(org.apache.ambari.server.state.State.UNKNOWN));
    org.junit.Assert.assertTrue("'" + state6 + "' != '" + org.apache.ambari.server.state.State.UNKNOWN + "'", state6.equals(org.apache.ambari.server.state.State.UNKNOWN));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }

    org.apache.ambari.server.checks.ConfigurationMergeCheck configurationMergeCheck0 = new org.apache.ambari.server.checks.ConfigurationMergeCheck();
    org.apache.ambari.server.checks.CheckDescription checkDescription1 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck3 = new org.apache.ambari.server.state.stack.PrerequisiteCheck(checkDescription1, "upgrade_suspended");
    org.apache.ambari.server.state.stack.PrereqCheckStatus prereqCheckStatus4 = org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL;
    prerequisiteCheck3.setStatus(prereqCheckStatus4);
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest6 = null;
    // The following exception was thrown during execution in test generation
    try {
    configurationMergeCheck0.perform(prerequisiteCheck3, prereqCheckRequest6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription1);
    org.junit.Assert.assertTrue("'" + prereqCheckStatus4 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL + "'", prereqCheckStatus4.equals(org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_TWO_WAY_SSL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.WIDGETLAYOUT_SECTION_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/section_name"+ "'", str0.equals("WidgetLayoutInfo/section_name"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler1 = null;
    serviceCheckGrouping0.parallelScheduler = parallelScheduler1;
    serviceCheckGrouping0.name = "notification.dispatch.alert.script";
    serviceCheckGrouping0.title = "UpgradeChecks/repository_version";

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.orm.dao.GroupDAO groupDAO4 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO5 = null;
    org.apache.ambari.server.security.authorization.Users users6 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.controller.internal.UserPrivilegeResourceProvider.init(userDAO0, clusterDAO3, groupDAO4, viewInstanceDAO5, users6);
    java.util.Set<org.apache.ambari.server.orm.entities.UserEntity> set_userEntity8 = null;
    // The following exception was thrown during execution in test generation
    try {
    userDAO0.create(set_userEntity8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }

    org.apache.ambari.server.serveraction.kerberos.FinalizeKerberosServerAction finalizeKerberosServerAction0 = new org.apache.ambari.server.serveraction.kerberos.FinalizeKerberosServerAction();
    org.apache.ambari.server.actionmanager.HostRoleCommand hostRoleCommand1 = finalizeKerberosServerAction0.getHostRoleCommand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hostRoleCommand1);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }

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
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_HIVE_ROLLING_WARNING;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_STORM_ROLLING_WARNING = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    stackConfigurationResponse12.setPropertyName("sqlserver");
    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType15 = stackConfigurationResponse12.getPropertyType();
    java.lang.String str16 = stackConfigurationResponse12.getPropertyValue();
    org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType17 = org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE;
    org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType18 = org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE;
    org.apache.ambari.server.state.PropertyInfo.PropertyType[] propertyType_array19 = new org.apache.ambari.server.state.PropertyInfo.PropertyType[] { propertyType17, propertyType18 };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyInfo.PropertyType> linkedhashset_propertyType20 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyInfo.PropertyType>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo.PropertyType>)linkedhashset_propertyType20, propertyType_array19);
    stackConfigurationResponse12.setPropertyType((java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType>)linkedhashset_propertyType20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_propertyType15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR"+ "'", str16.equals("ERROR"));
    org.junit.Assert.assertTrue("'" + propertyType17 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE + "'", propertyType17.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE));
    org.junit.Assert.assertTrue("'" + propertyType18 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE + "'", propertyType18.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyType_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }

    org.apache.ambari.server.orm.cache.ConfigGroupHostMappingImpl configGroupHostMappingImpl0 = new org.apache.ambari.server.orm.cache.ConfigGroupHostMappingImpl();
    org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior ldapUsernameCollisionHandlingBehavior1 = org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior.CONVERT;
    boolean b2 = configGroupHostMappingImpl0.equals((java.lang.Object)ldapUsernameCollisionHandlingBehavior1);
    java.lang.Long long3 = configGroupHostMappingImpl0.getConfigGroupId();
    org.junit.Assert.assertTrue("'" + ldapUsernameCollisionHandlingBehavior1 + "' != '" + org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior.CONVERT + "'", ldapUsernameCollisionHandlingBehavior1.equals(org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior.CONVERT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long3);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ActionResourceProvider.DEFAULT_TIMEOUT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Actions/default_timeout"+ "'", str0.equals("Actions/default_timeout"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    widgetResponse0.setDisplayName("Tasks/structured_out");

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }

    org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfileParser quickLinksProfileParser0 = new org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfileParser();
    byte[] byte_array6 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)0, (byte)1 };
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)1, (byte)100 };
    byte[] byte_array13 = new byte[] { (byte)-1 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult14 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array6, byte_array11, byte_array13);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfile quickLinksProfile15 = quickLinksProfileParser0.parse(byte_array6);
      org.junit.Assert.fail("Expected exception of type org.codehaus.jackson.JsonParseException");
    } catch (org.codehaus.jackson.JsonParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);

  }

  @Test
  public void test462() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }

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
    // java.lang.String str18 = upgradeContext4.getVersion();
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array7);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b9 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array11);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b13 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }

    org.apache.ambari.server.security.SignMessage signMessage0 = new org.apache.ambari.server.security.SignMessage();
    signMessage0.setCsr("max_duration_for_retries");
    signMessage0.setCsr("##");
    signMessage0.setPassphrase("configurations");

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_OS_FAMILY_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/os_family"+ "'", str0.equals("Hosts/os_family"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.ExtensionId extensionId1 = new org.apache.ambari.server.state.ExtensionId("RootServiceComponents/component_version");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }

    org.apache.ambari.server.controller.StackVersionRequest stackVersionRequest2 = new org.apache.ambari.server.controller.StackVersionRequest("HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}", "ambari_db_rca_username");

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }

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
    org.apache.ambari.server.controller.internal.SimplifyingPredicateVisitor simplifyingPredicateVisitor29 = new org.apache.ambari.server.controller.internal.SimplifyingPredicateVisitor((org.apache.ambari.server.controller.spi.ResourceProvider)hostComponentResourceProvider28);
    org.apache.ambari.server.controller.predicate.CategoryPredicate categoryPredicate30 = null;
    simplifyingPredicateVisitor29.acceptCategoryPredicate(categoryPredicate30);
    java.util.List<org.apache.ambari.server.controller.spi.Predicate> list_predicate32 = simplifyingPredicateVisitor29.getSimplifiedPredicates();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_predicate32);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    java.lang.String str5 = configuration0.getAlertTemplateFile();
    java.lang.Integer i6 = configuration0.getAgentApiAcceptors();
    boolean b7 = configuration0.isApiGzipped();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }

    org.apache.ambari.server.agent.AgentEnv.ExistingUser existingUser0 = new org.apache.ambari.server.agent.AgentEnv.ExistingUser();
    existingUser0.setUserStatus("ViewUrlInfo/view_instance_version");
    existingUser0.setUserHomeDir("stack_features");

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }

    org.apache.ambari.server.controller.logging.HostComponentLoggingInfo hostComponentLoggingInfo0 = new org.apache.ambari.server.controller.logging.HostComponentLoggingInfo();
    java.util.List<org.apache.ambari.server.controller.logging.LogFileDefinitionInfo> list_logFileDefinitionInfo1 = hostComponentLoggingInfo0.getListOfLogFileDefinitions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_logFileDefinitionInfo1);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }

    org.apache.ambari.server.state.AlertState alertState5 = null;
    org.apache.ambari.server.state.Alert alert6 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState5);
    boolean b8 = alert6.equals((java.lang.Object)"package_list");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }

    org.apache.ambari.server.state.State state2 = org.apache.ambari.server.state.State.STOPPING;
    org.apache.ambari.server.state.State state3 = org.apache.ambari.server.state.State.UNINSTALLED;
    boolean b4 = org.apache.ambari.server.state.State.isValidStateTransition(state2, state3);
    org.apache.ambari.server.state.SecurityType securityType5 = null;
    org.apache.ambari.server.controller.ivory.IvoryService ivoryService6 = null;
    java.lang.String[] str_array25 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str26 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str26, str_array25);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent28 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str26);
    java.lang.String[] str_array47 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str48 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str48, str_array47);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent50 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str48);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str48;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController52 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider53 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController52);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str54 = ldapSyncEventResourceProvider53.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController55 = null;
    com.google.inject.Injector injector56 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider57 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str48, map_type_str54, ambariManagementController55, injector56);
    org.apache.ambari.server.controller.internal.TargetClusterResourceProvider targetClusterResourceProvider58 = new org.apache.ambari.server.controller.internal.TargetClusterResourceProvider(ivoryService6, (java.util.Set<java.lang.String>)linkedhashset_str26, map_type_str54);
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport61 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i62 = clusterHealthReport61.getInitStateHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse63 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)5000L, "Stage/status", state3, securityType5, (java.util.Set<java.lang.String>)linkedhashset_str26, (java.lang.Integer)400, "ViewUrlInfo/view_instance_name", clusterHealthReport61);
    int i64 = clusterHealthReport61.getUnhealthyStateHosts();
    org.junit.Assert.assertTrue("'" + state2 + "' != '" + org.apache.ambari.server.state.State.STOPPING + "'", state2.equals(org.apache.ambari.server.state.State.STOPPING));
    org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.apache.ambari.server.state.State.UNINSTALLED + "'", state3.equals(org.apache.ambari.server.state.State.UNINSTALLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.credential.PrincipalKeyCredential principalKeyCredential1 = org.apache.ambari.server.security.credential.PrincipalKeyCredential.fromValue("host_groups");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.credential.InvalidCredentialValueException");
    } catch (org.apache.ambari.server.security.credential.InvalidCredentialValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.PROPERTIES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/properties"+ "'", str0.equals("ViewInstanceInfo/properties"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }

    org.apache.ambari.server.upgrade.UpgradeCatalog[] upgradeCatalog_array0 = new org.apache.ambari.server.upgrade.UpgradeCatalog[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog> linkedhashset_upgradeCatalog1 = new java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog1, upgradeCatalog_array0);
    com.google.inject.persist.PersistService persistService3 = null;
    org.apache.ambari.server.orm.DBAccessor dBAccessor4 = null;
    org.apache.ambari.server.configuration.Configuration configuration5 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str6 = configuration5.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file7 = configuration5.getRecommendationsDir();
    java.lang.String str8 = configuration5.getHostsMapFile();
    java.lang.Integer i9 = configuration5.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties10 = configuration5.getPersistenceCustomProperties();
    long long11 = configuration5.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str12 = configuration5.getWebAppDir();
    java.lang.String str13 = configuration5.isAgentStackRetryOnInstallEnabled();
    org.apache.ambari.server.upgrade.SchemaUpgradeHelper schemaUpgradeHelper14 = new org.apache.ambari.server.upgrade.SchemaUpgradeHelper((java.util.Set<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog1, persistService3, dBAccessor4, configuration5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = configuration5.getDatabaseSchema();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(upgradeCatalog_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "nosniff"+ "'", str6.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 30000+ "'", i9.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 5000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "false"+ "'", str13.equals("false"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }

    org.apache.ambari.server.state.stack.UpgradePack.OrderService orderService0 = new org.apache.ambari.server.state.stack.UpgradePack.OrderService();
    orderService0.serviceName = "org.apache.derby.jdbc.EmbeddedDriver";
    java.util.List<java.lang.String> list_str3 = orderService0.components;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_str3);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    java.lang.String str5 = configuration0.getAlertTemplateFile();
    java.lang.String str6 = configuration0.getViewsStrictTransportSecurityHTTPResponseHeader();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "max-age=31536000"+ "'", str6.equals("max-age=31536000"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity,java.lang.String> singularattribute_alertTargetEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertTargetEntity_.notificationType = singularattribute_alertTargetEntity_str0;

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider1 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController0);
    java.lang.String[] str_array4 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request5 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array4);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus6 = compatibleRepositoryVersionResourceProvider1.createResources(request5);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.controller.spi.SystemException");
    } catch (org.apache.ambari.server.controller.spi.SystemException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request5);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.String> singularattribute_alertHistoryEntity_str0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.componentName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_str0);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }

    org.apache.ambari.server.state.Host host0 = null;
    org.apache.ambari.server.Role role1 = org.apache.ambari.server.Role.ACCUMULO_CLIENT;
    org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent serviceComponentHostUninstallEvent5 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent("host_groups", "value", (long)(byte)100);
    org.apache.ambari.server.actionmanager.ServiceComponentHostEventWrapper serviceComponentHostEventWrapper6 = new org.apache.ambari.server.actionmanager.ServiceComponentHostEventWrapper((org.apache.ambari.server.state.ServiceComponentHostEvent)serviceComponentHostUninstallEvent5);
    org.apache.ambari.server.RoleCommand roleCommand7 = org.apache.ambari.server.RoleCommand.INSTALL;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO10 = null;
    org.apache.ambari.server.orm.dao.ExecutionCommandDAO executionCommandDAO11 = null;
    org.apache.ambari.server.actionmanager.ExecutionCommandWrapperFactory executionCommandWrapperFactory12 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.actionmanager.HostRoleCommand hostRoleCommand13 = new org.apache.ambari.server.actionmanager.HostRoleCommand(host0, role1, (org.apache.ambari.server.state.ServiceComponentHostEvent)serviceComponentHostUninstallEvent5, roleCommand7, true, true, hostDAO10, executionCommandDAO11, executionCommandWrapperFactory12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role1);
    org.junit.Assert.assertTrue("'" + roleCommand7 + "' != '" + org.apache.ambari.server.RoleCommand.INSTALL + "'", roleCommand7.equals(org.apache.ambari.server.RoleCommand.INSTALL));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }

    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport0 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i1 = clusterHealthReport0.getStaleConfigsHosts();
    int i2 = clusterHealthReport0.getInitStateHosts();
    java.lang.String str3 = clusterHealthReport0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ClusterHealthReport{staleConfigsHosts=0, maintenanceStateHosts=0, healthyStateHosts=0, unhealthyStateHosts=0, heartbeatLostStateHosts=0, initStateHosts=0, healthyStatusHosts=0, unhealthyStatusHosts=0, unknownStatusHosts=0, alertStatusHosts=0}"+ "'", str3.equals("ClusterHealthReport{staleConfigsHosts=0, maintenanceStateHosts=0, healthyStateHosts=0, unhealthyStateHosts=0, heartbeatLostStateHosts=0, initStateHosts=0, healthyStatusHosts=0, unhealthyStatusHosts=0, unknownStatusHosts=0, alertStatusHosts=0}"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    int i5 = postRequest4.getAPIVersion();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str7 = org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreatorHelper.getPropertyList((org.apache.ambari.server.api.services.Request)postRequest4, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }

    org.apache.ambari.server.api.services.ConfigGroupService configGroupService1 = new org.apache.ambari.server.api.services.ConfigGroupService("Tasks/id");

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }

    org.apache.ambari.server.orm.dao.GroupDAO groupDAO0 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    groupDAO0.remove(groupEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }

    org.apache.ambari.server.api.services.VersionDefinitionService versionDefinitionService0 = new org.apache.ambari.server.api.services.VersionDefinitionService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = versionDefinitionService0.createVersion("blueprint_name", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }

    org.apache.ambari.server.notifications.Recipient recipient0 = new org.apache.ambari.server.notifications.Recipient();
    java.lang.String str1 = recipient0.Identifier;
    java.lang.String str2 = recipient0.Identifier;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }

    java.lang.String str0 = org.apache.ambari.server.checks.PreviousUpgradeCompleted.ERROR_MESSAGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "There is an existing {0} from {1} to {2} which has not completed. This {3} must be completed before a new upgrade or downgrade can begin."+ "'", str0.equals("There is an existing {0} from {1} to {2} which has not completed. This {3} must be completed before a new upgrade or downgrade can begin."));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }

    org.apache.ambari.server.state.alert.AlertDefinitionFactory alertDefinitionFactory0 = new org.apache.ambari.server.state.alert.AlertDefinitionFactory();
    com.google.gson.Gson gson1 = alertDefinitionFactory0.getGson();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gson1);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    java.lang.String str3 = configuration0.getAgentStackRetryOnInstallCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "5"+ "'", str3.equals("5"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }

    org.apache.ambari.server.state.Cluster cluster0 = null;
    org.apache.ambari.server.orm.entities.ConfigGroupEntity configGroupEntity1 = null;
    org.apache.ambari.server.state.Clusters clusters2 = null;
    org.apache.ambari.server.state.ConfigFactory configFactory3 = null;
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO4 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO5 = null;
    org.apache.ambari.server.orm.dao.ConfigGroupDAO configGroupDAO6 = null;
    org.apache.ambari.server.orm.dao.ConfigGroupConfigMappingDAO configGroupConfigMappingDAO7 = null;
    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO8 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.configuration.Configuration configuration9 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str10 = configuration9.getViewsPragmaHTTPResponseHeader();
    boolean b11 = configuration9.validateAgentHostnames();
    java.lang.String str12 = configuration9.getRecommendationsArtifactsLifetime();
    java.lang.String str13 = configuration9.getRecoveryDisabledComponents();
    org.apache.ambari.server.logging.LockFactory lockFactory14 = new org.apache.ambari.server.logging.LockFactory(configuration9);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.configgroup.ConfigGroupImpl configGroupImpl15 = new org.apache.ambari.server.state.configgroup.ConfigGroupImpl(cluster0, configGroupEntity1, clusters2, configFactory3, clusterDAO4, hostDAO5, configGroupDAO6, configGroupConfigMappingDAO7, configGroupHostMappingDAO8, lockFactory14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "no-cache"+ "'", str10.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1w"+ "'", str12.equals("1w"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }

    org.apache.ambari.server.api.resources.StackConfigurationResourceDefinition stackConfigurationResourceDefinition0 = new org.apache.ambari.server.api.resources.StackConfigurationResourceDefinition();
    java.lang.String str1 = stackConfigurationResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "configuration"+ "'", str1.equals("configuration"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }

    org.apache.ambari.server.view.configuration.ViewConfig viewConfig0 = new org.apache.ambari.server.view.configuration.ViewConfig();
    java.lang.String str1 = viewConfig0.getDataMigrator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }

    org.apache.ambari.server.actionmanager.ActionType actionType1 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType6 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array8 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization9 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9, roleAuthorization_array8);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition11 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType1, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType6, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9);
    actionDefinition11.setTargetService("AlertTarget/notification_type");
    actionDefinition11.setDefaultTimeout((java.lang.Short)(short)0);
    actionDefinition11.setTargetComponent("ViewInstanceInfo/icon64_path");
    java.lang.String str18 = actionDefinition11.getInputs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "PrivilegeInfo/privilege_id"+ "'", str18.equals("PrivilegeInfo/privilege_id"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }

    org.apache.ambari.server.state.stack.upgrade.StopGrouping stopGrouping0 = new org.apache.ambari.server.state.stack.upgrade.StopGrouping();

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController6 = null;
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider activeWidgetLayoutResourceProvider7 = new org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider(ambariManagementController6);
    java.util.Set<java.lang.String> set_str8 = activeWidgetLayoutResourceProvider7.getCategoryIds();
    org.apache.ambari.server.controller.ExtensionLinkResponse extensionLinkResponse9 = new org.apache.ambari.server.controller.ExtensionLinkResponse("service", "Clusters/total_hosts", "Repositories/latest_base_url", "Request_Info/asc_order", "_SERVICE_CHECK", false, (java.util.Collection<java.lang.String>)set_str8);
    java.lang.String str10 = extensionLinkResponse9.getStackVersion();
    extensionLinkResponse9.setExtensionName("HostRoles/desired_admin_state");
    extensionLinkResponse9.setStackVersion("StackServices/stack_version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Repositories/latest_base_url"+ "'", str10.equals("Repositories/latest_base_url"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }

    org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric gangliaMetric0 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric();
    java.lang.String str1 = gangliaMetric0.getMetric_name();
    gangliaMetric0.setCluster_name("Repositories/version_definition_id");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }

    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder2 = addRequestAuditEventBuilder0.withCommand("UpgradeItem/request_id");
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder3 = org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder4 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder5 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders6 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody7 = null;
    javax.ws.rs.core.UriInfo uriInfo8 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance9 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest10 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders6, requestBody7, uriInfo8, resourceInstance9);
    int i11 = postRequest10.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type12 = postRequest10.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder13 = addUserToGroupRequestAuditEventBuilder5.withRequestType(type12);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder14 = deleteRepositoryVersionAuditEventBuilder4.withRequestType(type12);
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder15 = changeRepositoryVersionAuditEventBuilder3.withRequestType(type12);
    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder16 = addRequestAuditEventBuilder2.withRequestType(type12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type12.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addRequestAuditEventBuilder16);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosConfigDataFile.CONFIGURATION_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "config"+ "'", str0.equals("config"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.CLUSTER_ENV_RETRY_COMMANDS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "commands_to_retry"+ "'", str0.equals("commands_to_retry"));

  }

}