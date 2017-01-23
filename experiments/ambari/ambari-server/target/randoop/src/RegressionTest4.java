
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }

    org.apache.ambari.server.controller.internal.Stack stack2 = null;
    org.apache.ambari.server.topology.Component[] component_array3 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component4 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, component_array3);
    org.apache.ambari.server.topology.Configuration configuration6 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl8 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack2, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, configuration6, "Repositories/latest_base_url");
    java.lang.String str9 = hostGroupImpl8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ambari-server"+ "'", str9.equals("ambari-server"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }

    org.apache.ambari.server.api.services.ClusterStackVersionService clusterStackVersionService1 = new org.apache.ambari.server.api.services.ClusterStackVersionService("Actions/target_service");

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider activeWidgetLayoutResourceProvider1 = new org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider(ambariManagementController0);
    java.util.Set<java.lang.String> set_str2 = activeWidgetLayoutResourceProvider1.getCategoryIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController3 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider4 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController3);
    java.lang.String[] str_array7 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request8 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array7);
    org.apache.ambari.server.controller.spi.Request request9 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array7);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate12 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate13 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array14 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate13 };
    org.apache.ambari.server.controller.spi.Predicate predicate15 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array14);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate16 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array14);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate19 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate22 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array23 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate12, andPredicate16, filterPredicate19, filterPredicate22 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate24 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array23);
    org.apache.ambari.server.actionmanager.ActionType actionType26 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType31 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array33 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization34 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization34, roleAuthorization_array33);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition36 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType26, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType31, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization34);
    boolean b37 = andPredicate24.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate38 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj39 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor40 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj39);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate38, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor40);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate42 = null;
    extendedResourcePredicateVisitor40.acceptUnaryPredicate(unaryPredicate42);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate24, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor40);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource45 = compatibleRepositoryVersionResourceProvider4.getResources(request9, (org.apache.ambari.server.controller.spi.Predicate)andPredicate24);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus46 = activeWidgetLayoutResourceProvider1.createResources(request9);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.controller.spi.SystemException");
    } catch (org.apache.ambari.server.controller.spi.SystemException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource45);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_PREDICATE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_predicate"+ "'", str0.equals("host_predicate"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }

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
    org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.propertyIds = linkedhashset_str20;
    org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException31 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type0, (java.util.Set<java.lang.String>)linkedhashset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str26);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }

    org.apache.ambari.server.state.UpgradeState upgradeState0 = org.apache.ambari.server.state.UpgradeState.IN_PROGRESS;
    org.junit.Assert.assertTrue("'" + upgradeState0 + "' != '" + org.apache.ambari.server.state.UpgradeState.IN_PROGRESS + "'", upgradeState0.equals(org.apache.ambari.server.state.UpgradeState.IN_PROGRESS));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CLIENT_API_PORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }

    java.lang.String str0 = org.apache.ambari.server.security.SignCertResponse.OK_STATUS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OK"+ "'", str0.equals("OK"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }

    org.apache.ambari.server.state.DesiredConfig.HostOverride hostOverride2 = new org.apache.ambari.server.state.DesiredConfig.HostOverride("#", "HostRoles/state");
    java.lang.String str3 = hostOverride2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#"+ "'", str3.equals("#"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }

    org.apache.ambari.server.security.encryption.MasterKeyServiceImpl masterKeyServiceImpl1 = new org.apache.ambari.server.security.encryption.MasterKeyServiceImpl("StackConfigurationDependency/dependency_name");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = hostResponse1.getHostAttributes();
    java.lang.String str5 = hostResponse1.getStatus();
    hostResponse1.setLastRegistrationTime((long)' ');
    hostResponse1.setStatus("generatedTag_");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }

    java.util.Date date0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.ambari.server.utils.DateUtils.convertDateToString(date0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }

    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest7 = new org.apache.ambari.server.controller.ServiceConfigVersionRequest("Hosts/os_type", "widgets.json", (java.lang.Long)0L, (java.lang.Long)5000L, (java.lang.Long)100L, "ranger-hbase-plugin-enabled", (java.lang.Boolean)false);
    serviceConfigVersionRequest7.setServiceName("skip_failure");
    serviceConfigVersionRequest7.setNote("HostRoles/maintenance_state");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.hostAttributes = singularattribute_hostEntity_str0;

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }

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
    org.apache.ambari.server.state.State state29 = org.apache.ambari.server.state.State.INSTALLED;
    boolean b30 = state29.isValidClientComponentState();
    org.apache.ambari.server.state.State state33 = org.apache.ambari.server.state.State.STOPPING;
    org.apache.ambari.server.state.State state34 = org.apache.ambari.server.state.State.UNINSTALLED;
    boolean b35 = org.apache.ambari.server.state.State.isValidStateTransition(state33, state34);
    org.apache.ambari.server.state.SecurityType securityType36 = null;
    org.apache.ambari.server.controller.ivory.IvoryService ivoryService37 = null;
    java.lang.String[] str_array56 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str57 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str57, str_array56);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent59 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str57);
    java.lang.String[] str_array78 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str79 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str79, str_array78);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent81 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str79);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str79;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController83 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider84 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController83);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str85 = ldapSyncEventResourceProvider84.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController86 = null;
    com.google.inject.Injector injector87 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider88 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str79, map_type_str85, ambariManagementController86, injector87);
    org.apache.ambari.server.controller.internal.TargetClusterResourceProvider targetClusterResourceProvider89 = new org.apache.ambari.server.controller.internal.TargetClusterResourceProvider(ivoryService37, (java.util.Set<java.lang.String>)linkedhashset_str57, map_type_str85);
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport92 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i93 = clusterHealthReport92.getInitStateHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse94 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)5000L, "Stage/status", state34, securityType36, (java.util.Set<java.lang.String>)linkedhashset_str57, (java.lang.Integer)400, "ViewUrlInfo/view_instance_name", clusterHealthReport92);
    boolean b95 = hostComponentResourceProvider28.isDirectTransition(state29, state34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    org.junit.Assert.assertTrue("'" + state29 + "' != '" + org.apache.ambari.server.state.State.INSTALLED + "'", state29.equals(org.apache.ambari.server.state.State.INSTALLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.apache.ambari.server.state.State.STOPPING + "'", state33.equals(org.apache.ambari.server.state.State.STOPPING));
    org.junit.Assert.assertTrue("'" + state34 + "' != '" + org.apache.ambari.server.state.State.UNINSTALLED + "'", state34.equals(org.apache.ambari.server.state.State.UNINSTALLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }

    org.apache.ambari.server.api.services.VersionDefinitionService versionDefinitionService0 = new org.apache.ambari.server.api.services.VersionDefinitionService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = versionDefinitionService0.createVersionByXml("Tasks/command", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    java.lang.String str1 = widgetResponse0.getAuthor();
    java.lang.String str2 = widgetResponse0.getDisplayName();
    java.lang.String str3 = widgetResponse0.getClusterName();
    widgetResponse0.setAuthor("Users/admin");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    long long6 = configuration0.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str7 = configuration0.getWebAppDir();
    java.lang.String str8 = configuration0.isAgentStackRetryOnInstallEnabled();
    org.apache.ambari.server.security.ClientSecurityType clientSecurityType9 = null;
    // The following exception was thrown during execution in test generation
    try {
    configuration0.setClientSecurityType(clientSecurityType9);
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
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 5000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false"+ "'", str8.equals("false"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.state.StackId stackId8 = new org.apache.ambari.server.state.StackId("1.3.6.1.4.1.18060.16.1.1.1.1", "StackConfigurations/property_description");
    // The following exception was thrown during execution in test generation
    try {
    clustersImpl4.addCluster("metainfo.xml", stackId8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertResourceProvider.ALERT_DEFINITION_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Alert/definition_id"+ "'", str0.equals("Alert/definition_id"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFileReaderFactory kerberosIdentityDataFileReaderFactory0 = new org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFileReaderFactory();

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }

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
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController37 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider38 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController37);
    org.apache.ambari.server.controller.spi.Request request39 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate40 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus41 = widgetResourceProvider38.deleteResources(request39, predicate40);
    java.util.Set<java.lang.String> set_str42 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str43 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str42);
    org.apache.ambari.server.controller.spi.Request request44 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str42);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus45 = widgetResourceProvider38.createResources(request44);
    java.lang.String[] str_array64 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str65 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str65, str_array64);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent67 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str65);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str65;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController69 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider70 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController69);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str71 = ldapSyncEventResourceProvider70.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController72 = null;
    com.google.inject.Injector injector73 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider74 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str65, map_type_str71, ambariManagementController72, injector73);
    org.apache.ambari.server.api.resources.JobResourceDefinition jobResourceDefinition75 = new org.apache.ambari.server.api.resources.JobResourceDefinition();
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer77 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule78 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl79 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule78);
    metricsPaddingRenderer77.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl79);
    org.apache.ambari.server.api.query.QueryImpl queryImpl81 = new org.apache.ambari.server.api.query.QueryImpl(map_type_str71, (org.apache.ambari.server.api.resources.ResourceDefinition)jobResourceDefinition75, (org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl79);
    org.apache.ambari.server.controller.spi.PageRequest pageRequest82 = null;
    queryImpl81.setPageRequest(pageRequest82);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController84 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider85 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController84);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str86 = ldapSyncEventResourceProvider85.getKeyPropertyIds();
    queryImpl81.setKeyValueMap(map_type_str86);
    org.apache.ambari.server.api.query.ProcessingPredicateVisitor processingPredicateVisitor88 = new org.apache.ambari.server.api.query.ProcessingPredicateVisitor(queryImpl81);
    org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate categoryIsEmptyPredicate90 = new org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate("AlertHistory/definition_name");
    processingPredicateVisitor88.acceptCategoryPredicate((org.apache.ambari.server.controller.predicate.CategoryPredicate)categoryIsEmptyPredicate90);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus92 = clusterControllerImpl33.updateResources(type36, request44, (org.apache.ambari.server.controller.spi.Predicate)categoryIsEmptyPredicate90);
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
    org.junit.Assert.assertNotNull(requestStatus41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str86);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }

    org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str1 = agentEnv0.getTransparentHugePage();
    java.lang.String[] str_array2 = agentEnv0.getExistingRepos();
    agentEnv0.setFirewallName("RootServiceHostComponents/properties");
    org.apache.ambari.server.agent.AgentEnv.HostHealth hostHealth5 = agentEnv0.getHostHealth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostHealth5);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    java.lang.String str3 = mySqlHelper1.quoteObjectName("ambari.dispatch.snmp.community");
    org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler aDKerberosOperationHandler7 = new org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler();
    aDKerberosOperationHandler7.close();
    java.lang.String str9 = aDKerberosOperationHandler7.getDefaultRealm();
    org.apache.ambari.server.agent.AgentEnv agentEnv10 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str11 = agentEnv10.getTransparentHugePage();
    java.lang.String[] str_array12 = agentEnv10.getExistingRepos();
    aDKerberosOperationHandler7.setExecutableSearchPaths(str_array12);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = mySqlHelper1.getCreateIndexStatement("StackLevelConfigurations/type", "ViewInstanceInfo/context_path", false, str_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "`ambari.dispatch.snmp.community`"+ "'", str3.equals("`ambari.dispatch.snmp.community`"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }

    java.util.regex.Pattern pattern1 = org.apache.ambari.server.checks.HardcodedStackVersionPropertiesCheck.getHardcodeSearchPattern("ViewVersionInfo/parameters");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pattern1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }

    org.apache.ambari.server.checks.MpackInstallChecker.MpackCheckerAuditModule mpackCheckerAuditModule0 = new org.apache.ambari.server.checks.MpackInstallChecker.MpackCheckerAuditModule();

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    int i5 = postRequest4.getAPIVersion();
    org.apache.ambari.server.api.services.RequestBody requestBody6 = postRequest4.getBody();
    java.lang.String str7 = postRequest4.getRemoteAddress();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.services.Result result8 = postRequest4.process();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(requestBody6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }

    org.apache.ambari.server.api.predicate.Token.TYPE tYPE0 = org.apache.ambari.server.api.predicate.Token.TYPE.RELATIONAL_OPERATOR;
    org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.ambari.server.api.predicate.Token.TYPE.RELATIONAL_OPERATOR + "'", tYPE0.equals(org.apache.ambari.server.api.predicate.Token.TYPE.RELATIONAL_OPERATOR));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }

    org.apache.ambari.server.security.ldap.LdapUserGroupMemberDto ldapUserGroupMemberDto2 = new org.apache.ambari.server.security.ldap.LdapUserGroupMemberDto("cluster_name", "UpgradeChecks/upgrade_pack");
    java.lang.String str3 = ldapUserGroupMemberDto2.getGroupName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "cluster_name"+ "'", str3.equals("cluster_name"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }

    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder2 = addCredentialAuditEventBuilder0.withUserName("");
    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder4 = addCredentialAuditEventBuilder0.withType("StackLevelConfigurations/type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder4);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    java.util.Set<java.lang.String> set_str7 = kerberosComponentDescriptor6.getAuthToLocalProperties();
    java.util.Map<java.lang.String,org.apache.ambari.server.state.kerberos.KerberosConfigurationDescriptor> map_str_kerberosConfigurationDescriptor8 = kerberosComponentDescriptor6.getConfigurations();
    
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
    org.junit.Assert.assertNull(set_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_kerberosConfigurationDescriptor8);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }

    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.builder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS1 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus2 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS1);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = resultStatus2.getStatus();
    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder4 = addComponentToHostRequestAuditEventBuilder0.withResultStatus(resultStatus2);
    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder6 = addComponentToHostRequestAuditEventBuilder4.withUserName("not_managed_hdfs_path_list");
    java.lang.String[] str_array25 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str26 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str26, str_array25);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent28 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str26);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str26;
    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder30 = addComponentToHostRequestAuditEventBuilder4.withComponents((java.util.Set<java.lang.String>)linkedhashset_str26);
    org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str26;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder30);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = org.apache.ambari.server.controller.internal.HostStatusHelper.isHostLive(ambariManagementController0, "principal", "127.0.0.1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    java.lang.String str3 = configuration0.getOjdbcJarName();
    java.lang.String str4 = configuration0.getMetadataPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ojdbc6.jar"+ "'", str3.equals("ojdbc6.jar"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }

    org.apache.ambari.server.audit.event.kerberos.ChangeSecurityStateKerberosAuditEvent.ChangeSecurityStateKerberosAuditEventBuilder changeSecurityStateKerberosAuditEventBuilder0 = org.apache.ambari.server.audit.event.kerberos.ChangeSecurityStateKerberosAuditEvent.builder();
    org.apache.ambari.server.audit.event.kerberos.ChangeSecurityStateKerberosAuditEvent.ChangeSecurityStateKerberosAuditEventBuilder changeSecurityStateKerberosAuditEventBuilder2 = changeSecurityStateKerberosAuditEventBuilder0.withState("java_version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeSecurityStateKerberosAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeSecurityStateKerberosAuditEventBuilder2);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionVersionResourceProvider.EXTENSION_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/extension_name"+ "'", str0.equals("Versions/extension_name"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }

    org.apache.ambari.server.view.configuration.AutoInstanceConfig autoInstanceConfig0 = new org.apache.ambari.server.view.configuration.AutoInstanceConfig();
    java.lang.String str1 = autoInstanceConfig0.getDescription();
    java.lang.String str2 = autoInstanceConfig0.getIcon();
    java.lang.String str3 = autoInstanceConfig0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }

    org.apache.ambari.server.orm.dao.SettingDAO settingDAO0 = new org.apache.ambari.server.orm.dao.SettingDAO();
    org.apache.ambari.server.orm.entities.SettingEntity settingEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    settingDAO0.create(settingEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    int i3 = configuration0.getViewExtractionThreadPoolMaxSize();
    java.lang.String str4 = configuration0.getBootSetupAgentPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "password"+ "'", str4.equals("password"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }

    org.apache.ambari.server.state.theme.Widget widget0 = new org.apache.ambari.server.state.theme.Widget();
    org.apache.ambari.server.state.theme.Unit[] unit_array1 = new org.apache.ambari.server.state.theme.Unit[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.theme.Unit> arraylist_unit2 = new java.util.ArrayList<org.apache.ambari.server.state.theme.Unit>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.theme.Unit>)arraylist_unit2, unit_array1);
    widget0.setUnits((java.util.List<org.apache.ambari.server.state.theme.Unit>)arraylist_unit2);
    java.lang.String str5 = widget0.getDisplayName();
    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b6 = org.apache.ambari.server.configuration.Configuration.ACTIVE_INSTANCE;
    org.apache.ambari.server.state.theme.Widget widget7 = new org.apache.ambari.server.state.theme.Widget();
    org.apache.ambari.server.state.theme.Unit[] unit_array8 = new org.apache.ambari.server.state.theme.Unit[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.theme.Unit> arraylist_unit9 = new java.util.ArrayList<org.apache.ambari.server.state.theme.Unit>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.theme.Unit>)arraylist_unit9, unit_array8);
    widget7.setUnits((java.util.List<org.apache.ambari.server.state.theme.Unit>)arraylist_unit9);
    boolean b12 = configurationproperty_b6.equals((java.lang.Object)arraylist_unit9);
    widget0.setUnits((java.util.List<org.apache.ambari.server.state.theme.Unit>)arraylist_unit9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unit_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unit_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.AMBARI_ALERTS_OID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16.1"+ "'", str0.equals("1.3.6.1.4.1.18060.16.1"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }

    org.apache.ambari.server.agent.RecoveryReport recoveryReport0 = new org.apache.ambari.server.agent.RecoveryReport();
    java.lang.String str1 = recoveryReport0.toString();
    recoveryReport0.setSummary("password");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RecoveryReport{summary='DISABLED', component_reports='[]'}"+ "'", str1.equals("RecoveryReport{summary='DISABLED', component_reports='[]'}"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }

    org.apache.ambari.server.api.services.HostComponentService hostComponentService2 = new org.apache.ambari.server.api.services.HostComponentService("manage_identities", "service_name");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = hostComponentService2.getHostComponent("MetricsRetrievalService [NEW]", httpHeaders4, uriInfo5, "AlertTarget/name", "hosts");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.parsers.RequestBodyParser.REQUEST_INFO_PATH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RequestInfo"+ "'", str0.equals("RequestInfo"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }

    org.apache.ambari.server.api.resources.CredentialResourceDefinition credentialResourceDefinition0 = new org.apache.ambari.server.api.resources.CredentialResourceDefinition();
    java.lang.String str1 = credentialResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "credentials"+ "'", str1.equals("credentials"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }

    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder2 = deleteRepositoryVersionAuditEventBuilder0.withOperation("Event/summary/memberships/removed.FILTER(service_type) AND (null) AND Credential/key.FILTER(Credential/key) AND Credential/key.FILTER(Credential/key)");
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder4 = deleteRepositoryVersionAuditEventBuilder0.withOperation("Hosts/os_family");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder4);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }

    org.apache.ambari.server.state.ThemeInfo themeInfo0 = null;
    org.apache.ambari.server.stack.ThemeModule themeModule1 = new org.apache.ambari.server.stack.ThemeModule(themeInfo0);
    boolean b2 = themeModule1.isValid();
    java.util.Collection<java.lang.String> collection_str3 = themeModule1.getErrors();
    boolean b4 = themeModule1.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i6 = mITKerberosOperationHandler0.createPrincipal("Requests/request_schedule/schedule_id", "cluster-env", false);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosOperationException");
    } catch (org.apache.ambari.server.serveraction.kerberos.KerberosOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck2 = new org.apache.ambari.server.state.stack.PrerequisiteCheck(checkDescription0, "upgrade_suspended");
    org.apache.ambari.server.state.stack.PrereqCheckStatus prereqCheckStatus3 = org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL;
    prerequisiteCheck2.setStatus(prereqCheckStatus3);
    prerequisiteCheck2.setFailReason("configure-task-config-type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);
    org.junit.Assert.assertTrue("'" + prereqCheckStatus3 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL + "'", prereqCheckStatus3.equals(org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }

    org.apache.ambari.server.checks.ConfigurationMergeCheck.MergeDetail mergeDetail0 = new org.apache.ambari.server.checks.ConfigurationMergeCheck.MergeDetail();
    java.lang.String str1 = mergeDetail0.result_value;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.security.ClientSecurityType clientSecurityType7 = org.apache.ambari.server.security.ClientSecurityType.fromString("UpgradeChecks/id");
    configuration0.setClientSecurityType(clientSecurityType7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.DBAccessorImpl dBAccessorImpl9 = new org.apache.ambari.server.orm.DBAccessorImpl(configuration0);
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
    org.junit.Assert.assertTrue("'" + clientSecurityType7 + "' != '" + org.apache.ambari.server.security.ClientSecurityType.LOCAL + "'", clientSecurityType7.equals(org.apache.ambari.server.security.ClientSecurityType.LOCAL));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.DEFAULT_PASSWORD_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "default_password"+ "'", str0.equals("default_password"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }

    org.apache.ambari.server.configuration.Configuration.ConnectionPoolType connectionPoolType0 = org.apache.ambari.server.configuration.Configuration.ConnectionPoolType.INTERNAL;
    org.junit.Assert.assertTrue("'" + connectionPoolType0 + "' != '" + org.apache.ambari.server.configuration.Configuration.ConnectionPoolType.INTERNAL + "'", connectionPoolType0.equals(org.apache.ambari.server.configuration.Configuration.ConnectionPoolType.INTERNAL));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionVersionResourceProvider.EXTENSION_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/extension_version"+ "'", str0.equals("Versions/extension_version"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.lang.String str2 = configuration0.getExtensionsPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_GROUP_BASE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.UpgradeResourceDefinition upgradeResourceDefinition1 = new org.apache.ambari.server.api.resources.UpgradeResourceDefinition();
    org.apache.ambari.server.api.resources.ResourceInstanceFactoryImpl.addResourceDefinition(type0, (org.apache.ambari.server.api.resources.ResourceDefinition)upgradeResourceDefinition1);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }

    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = addUserToGroupRequestAuditEventBuilder0.withUserName("1.3.6.1.4.1.18060.16.1.1.1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder2);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }

    org.apache.ambari.server.orm.entities.HostGroupComponentEntityPK hostGroupComponentEntityPK0 = new org.apache.ambari.server.orm.entities.HostGroupComponentEntityPK();
    java.lang.String str1 = hostGroupComponentEntityPK0.getBlueprintName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.JWT_COOKIE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array5 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter6 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6, requestResourceFilter_array5);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel8 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str9 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest11 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6, requestOperationLevel8, map_str_str9, false);
    org.apache.ambari.server.configuration.Configuration configuration26 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str27 = configuration26.getViewsPragmaHTTPResponseHeader();
    boolean b28 = configuration26.validateAgentHostnames();
    java.util.Map<java.lang.String,java.lang.String> map_str_str29 = configuration26.getDatabaseConnectorNames();
    org.apache.ambari.server.controller.ivory.Feed feed30 = new org.apache.ambari.server.controller.ivory.Feed("HostRoles/hdp_version", "ThemeInfo/stack_version", "QuickLinkInfo/stack_version", "ViewInstanceInfo/view_name", "mapreduce2-log4j", "agent_stack_retry_on_unavailability", "ViewUrlInfo/view_instance_name", "Upgrade/abort_reason", "Stage/progress_percent", "Theme", "AlertHistory/cluster_name", "", "forceRefreshConfigTagsBeforeExecution", "Requests/cluster_id", map_str_str29);
    org.apache.ambari.server.controller.ActionExecutionContext actionExecutionContext31 = new org.apache.ambari.server.controller.ActionExecutionContext("HostComponentProcess/name", "WidgetLayoutInfo/id", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6, map_str_str29);
    java.lang.Short s32 = actionExecutionContext31.getTimeout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "no-cache"+ "'", str27.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(s32);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }

    org.apache.ambari.server.state.StackId stackId1 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str6 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse7 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId1, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str5, map_str_map_str_str6);
    java.lang.Long long8 = configurationResponse7.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L+ "'", long8.equals(1L));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }

    org.apache.ambari.server.state.State state0 = org.apache.ambari.server.state.State.WIPING_OUT;
    org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.apache.ambari.server.state.State.WIPING_OUT + "'", state0.equals(org.apache.ambari.server.state.State.WIPING_OUT));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.lang.String str5 = configuration0.getStrictTransportSecurityHTTPResponseHeader();
    java.lang.String str6 = configuration0.getXFrameOptionsHTTPResponseHeader();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "max-age=31536000"+ "'", str5.equals("max-age=31536000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "DENY"+ "'", str6.equals("DENY"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }

    org.apache.ambari.server.serveraction.users.CsvFilePersisterService csvFilePersisterService1 = new org.apache.ambari.server.serveraction.users.CsvFilePersisterService("Stage/status");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }

    org.apache.ambari.server.api.predicate.InvalidQueryException invalidQueryException1 = new org.apache.ambari.server.api.predicate.InvalidQueryException("Hosts/recovery_report");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }

    org.apache.ambari.server.controller.StackServiceRequest stackServiceRequest3 = new org.apache.ambari.server.controller.StackServiceRequest("Hosts/total_mem", "Event/summary/memberships/removed", "RepositoryVersions/release/version");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }

    org.apache.ambari.server.topology.NoSuchHostGroupException noSuchHostGroupException2 = new org.apache.ambari.server.topology.NoSuchHostGroupException("WidgetLayoutInfo/section_name", "AMBARI_SECURITY_MASTER_KEY");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }

    org.apache.ambari.server.controller.StackConfigurationRequest stackConfigurationRequest4 = new org.apache.ambari.server.controller.StackConfigurationRequest("db_driver_filename", "hbase-site", "cluster_name", "Hosts/last_heartbeat_time");
    java.lang.String str5 = stackConfigurationRequest4.getServiceName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "cluster_name"+ "'", str5.equals("cluster_name"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }

    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder2 = addAlertGroupRequestAuditEventBuilder0.withName("ViewInstanceInfo/view_name");
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder4 = addAlertGroupRequestAuditEventBuilder0.withRemoteIp("alerts.json");
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder6 = addAlertGroupRequestAuditEventBuilder4.withUrl("privilege");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder6);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    java.util.List<java.lang.String> list_str3 = componentInfo0.getClientsToUpdateConfigs();
    org.apache.ambari.server.state.AutoDeployInfo autoDeployInfo4 = componentInfo0.getAutoDeploy();
    java.lang.String str5 = componentInfo0.getTimelineAppid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(autoDeployInfo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_IN_PROGRESS;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_IN_PROGRESS + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_OP_IN_PROGRESS));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.ClusterKerberosDescriptorResourceProvider clusterKerberosDescriptorResourceProvider1 = new org.apache.ambari.server.controller.internal.ClusterKerberosDescriptorResourceProvider(ambariManagementController0);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider3 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController2);
    org.apache.ambari.server.controller.spi.Request request4 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate5 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus6 = widgetResourceProvider3.deleteResources(request4, predicate5);
    java.lang.String[] str_array9 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request10 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array9);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus11 = widgetResourceProvider3.createResources(request10);
    org.apache.ambari.server.controller.spi.Predicate predicate12 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj13 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor14 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj13);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate12, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor14);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate18 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    extendedResourcePredicateVisitor14.acceptComparisonPredicate((org.apache.ambari.server.controller.predicate.ComparisonPredicate)filterPredicate18);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource20 = clusterKerberosDescriptorResourceProvider1.getResources(request10, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate18);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus11);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertNoticeResourceProvider.ALERT_NOTICE_HISTORY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertNotice/history_id"+ "'", str0.equals("AlertNotice/history_id"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.FLUME_HANDLER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    long long6 = configuration0.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str7 = configuration0.getWebAppDir();
    int i8 = configuration0.getKerberosOperationRetryTimeout();
    
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
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }

    org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO0 = null;
    org.apache.ambari.server.metadata.ActionMetadata actionMetadata1 = new org.apache.ambari.server.metadata.ActionMetadata();
    org.apache.ambari.server.state.stack.OsFamily osFamily2 = null;
    org.apache.ambari.server.stack.StackContext stackContext3 = new org.apache.ambari.server.stack.StackContext(metainfoDAO0, actionMetadata1, osFamily2);
    stackContext3.executeRepoTasks();
    org.apache.ambari.server.stack.StackModule stackModule6 = null;
    // The following exception was thrown during execution in test generation
    try {
    stackContext3.registerRepoUpdateTask("ViewUrlInfo/url_name", stackModule6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }

    org.apache.ambari.server.controller.StackServiceRequest stackServiceRequest3 = new org.apache.ambari.server.controller.StackServiceRequest("extension", "Versions/parent_extension_version", ".FILTER");

  }

    /**  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }

    org.apache.ambari.server.state.stack.JsonOsFamilyRoot jsonOsFamilyRoot0 = new org.apache.ambari.server.state.stack.JsonOsFamilyRoot();
    java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.JsonOsFamilyEntry> map_str_jsonOsFamilyEntry1 = null;
    jsonOsFamilyRoot0.setMapping(map_str_jsonOsFamilyEntry1);

    }*/

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str3 = valueAttributesInfo0.getIncrementStep();
    valueAttributesInfo0.setDelete("operation");
    java.lang.String str6 = valueAttributesInfo0.getPropertyFileName();
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder7 = org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder8 = org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS9 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus10 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS9);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS11 = resultStatus10.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS12 = resultStatus10.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl13 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus10);
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder14 = clusterPrivilegeChangeRequestAuditEventBuilder8.withResultStatus(resultStatus10);
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder15 = privilegeChangeRequestAuditEventBuilder7.withResultStatus(resultStatus10);
    boolean b16 = valueAttributesInfo0.equals((java.lang.Object)privilegeChangeRequestAuditEventBuilder7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(privilegeChangeRequestAuditEventBuilder7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(privilegeChangeRequestAuditEventBuilder15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }

    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS1 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus2 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS1);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = resultStatus2.getStatus();
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder4 = addHostRequestAuditEventBuilder0.withResultStatus(resultStatus2);
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder6 = addHostRequestAuditEventBuilder4.withRemoteIp("Artifacts/service_name");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent addHostRequestAuditEvent7 = addHostRequestAuditEventBuilder4.build();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addHostRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addHostRequestAuditEventBuilder6);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }

    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = addUserToGroupRequestAuditEventBuilder0.withRemoteIp("requestschedule");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder2);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }

    org.apache.ambari.server.metrics.system.impl.MetricsConfiguration metricsConfiguration0 = org.apache.ambari.server.metrics.system.impl.MetricsConfiguration.getMetricsConfiguration();
    java.lang.String str2 = metricsConfiguration0.getProperty("cluster-env");
    java.util.Properties properties3 = metricsConfiguration0.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(metricsConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties3);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }

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
    java.lang.String str32 = availableServiceReference0.serviceIdReference;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)(-1L), "host_group", "Clusters/cluster_name", "java_version", "yarn.scheduler.capacity.root.queues", batch5, schedule6, "Stage/status", "Credential/key", "StackConfigurations/property_name", "downgrade_from_version", (java.lang.Integer)0);
    org.apache.ambari.server.state.scheduler.Schedule schedule13 = requestScheduleResponse12.getSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(schedule13);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_ADMIN_GROUP_MAPPING_RULES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }

    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder();
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
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder14 = changeAlertTargetRequestAuditEventBuilder0.withRequestType(type10);
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder16 = changeAlertTargetRequestAuditEventBuilder0.withOperation("config_recommendation_strategy");
    java.util.List<java.lang.String> list_str17 = org.apache.ambari.server.controller.utilities.PropertyHelper.AGGREGATE_FUNCTION_IDENTIFIERS;
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder18 = changeAlertTargetRequestAuditEventBuilder16.withAlertStates(list_str17);
    
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
    org.junit.Assert.assertNotNull(changeAlertTargetRequestAuditEventBuilder14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertTargetRequestAuditEventBuilder16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertTargetRequestAuditEventBuilder18);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.SERVER_VERSION_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "version"+ "'", str0.equals("version"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.OperatingSystemResourceProvider.propertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.MAHOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }

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
    org.apache.ambari.server.api.services.persistence.PersistenceManagerImpl persistenceManagerImpl36 = new org.apache.ambari.server.api.services.persistence.PersistenceManagerImpl((org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl33);
    org.apache.ambari.server.controller.spi.Resource.Type type37 = null;
    org.apache.ambari.server.controller.spi.Resource[] resource_array38 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource39 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource39, resource_array38);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl44 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource39, true, false, (int)'#');
    boolean b45 = queryResponseImpl44.isSortedResponse();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController46 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider47 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController46);
    java.lang.String[] str_array50 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request51 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array50);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus52 = ldapSyncEventResourceProvider47.createResourcesAuthorized(request51);
    org.apache.ambari.server.api.predicate.operators.LessOperator lessOperator53 = new org.apache.ambari.server.api.predicate.operators.LessOperator();
    org.apache.ambari.server.controller.spi.Predicate predicate56 = lessOperator53.toPredicate("principal_type", "ACTION_USER_NAME");
    org.apache.ambari.server.controller.spi.PageRequest pageRequest57 = null;
    org.apache.ambari.server.controller.spi.SortRequest sortRequest58 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Iterable<org.apache.ambari.server.controller.spi.Resource> iterable_resource59 = clusterControllerImpl33.getIterable(type37, (org.apache.ambari.server.controller.spi.QueryResponse)queryResponseImpl44, request51, predicate56, pageRequest57, sortRequest58);
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
    org.junit.Assert.assertNotNull(resource_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate56);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }

    org.apache.ambari.server.state.ConfigMergeHelper.ThreeWayValue threeWayValue0 = new org.apache.ambari.server.state.ConfigMergeHelper.ThreeWayValue();
    threeWayValue0.savedValue = "RootService/service_name";

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.propertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.RECOVERY_ENABLED_COMPONENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }

    org.apache.ambari.server.controller.ExtensionVersionRequest extensionVersionRequest2 = new org.apache.ambari.server.controller.ExtensionVersionRequest("QuickLinkInfo/stack_version", "hbase.coprocessor.regionserver.classes");
    extensionVersionRequest2.setExtensionVersion("Upgrade/downgrade_allowed");

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }

    java.lang.String str1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getPropertyName("ambari.dispatch.snmp.community");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ambari.dispatch.snmp.community"+ "'", str1.equals("ambari.dispatch.snmp.community"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.SchemaUpgradeHelper.UpgradeHelperModule upgradeHelperModule0 = new org.apache.ambari.server.upgrade.SchemaUpgradeHelper.UpgradeHelperModule();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }

    org.apache.ambari.server.audit.request.eventcreator.UpgradeItemEventCreator upgradeItemEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.UpgradeItemEventCreator();
    java.util.Set<org.apache.ambari.server.api.services.Request.Type> set_type1 = upgradeItemEventCreator0.getRequestTypes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_RUN_CUSTOM_COMMAND;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_RUN_CUSTOM_COMMAND + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_RUN_CUSTOM_COMMAND));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }

    org.apache.ambari.server.actionmanager.ActionType actionType1 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType6 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array8 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization9 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9, roleAuthorization_array8);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition11 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType1, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType6, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9);
    java.lang.String str12 = actionDefinition11.getActionName();
    org.apache.ambari.server.actionmanager.ActionType actionType13 = actionDefinition11.getActionType();
    java.lang.String str14 = actionDefinition11.getTargetService();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "forceRefreshConfigTagsBeforeExecution"+ "'", str12.equals("forceRefreshConfigTagsBeforeExecution"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(actionType13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "WidgetLayoutInfo/section_name"+ "'", str14.equals("WidgetLayoutInfo/section_name"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }

    org.apache.ambari.server.state.stack.upgrade.HostOrderGrouping hostOrderGrouping0 = new org.apache.ambari.server.state.stack.upgrade.HostOrderGrouping();
    org.apache.ambari.server.state.stack.upgrade.StageWrapperBuilder stageWrapperBuilder1 = hostOrderGrouping0.getBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stageWrapperBuilder1);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }

    org.apache.ambari.server.audit.request.eventcreator.ViewPrivilegeEventCreator viewPrivilegeEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.ViewPrivilegeEventCreator();

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }

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
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent addUserToGroupRequestAuditEvent11 = addUserToGroupRequestAuditEventBuilder10.build();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type7.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder10);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface8 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array9 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface8 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface10 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface10, interface_array9);
    org.apache.ambari.server.controller.ivory.Cluster.Location location14 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array15 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location14 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location16 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location16, location_array15);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array18 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo19 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo19, propertyInfo_array18);
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo22 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo19, map_str_str21);
    org.apache.ambari.server.controller.ivory.Cluster cluster23 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface10, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location16, map_str_str21);
    java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location> set_location24 = cluster23.getLocations();
    alertEventPublisher2.register((java.lang.Object)set_location24);
    org.apache.ambari.server.events.listeners.alerts.AlertStateChangedListener alertStateChangedListener26 = new org.apache.ambari.server.events.listeners.alerts.AlertStateChangedListener(alertEventPublisher2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_location24);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }

    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder2 = addCredentialAuditEventBuilder0.withUserName("");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus4 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS3);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS5 = resultStatus4.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS6 = resultStatus4.getStatus();
    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder7 = addCredentialAuditEventBuilder0.withResultStatus(resultStatus4);
    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder9 = addCredentialAuditEventBuilder0.withType("recovery_lifetime_max_count");
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder10 = org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder12 = changeAlertGroupRequestAuditEventBuilder10.withOperation("configure-task-transfers");
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder13 = org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder14 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder15 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders16 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody17 = null;
    javax.ws.rs.core.UriInfo uriInfo18 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance19 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest20 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders16, requestBody17, uriInfo18, resourceInstance19);
    int i21 = postRequest20.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type22 = postRequest20.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder23 = addUserToGroupRequestAuditEventBuilder15.withRequestType(type22);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder24 = deleteRepositoryVersionAuditEventBuilder14.withRequestType(type22);
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder25 = changeRepositoryVersionAuditEventBuilder13.withRequestType(type22);
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder27 = changeRepositoryVersionAuditEventBuilder25.withUrl("Stage/host_params");
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder28 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder29 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder30 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders31 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody32 = null;
    javax.ws.rs.core.UriInfo uriInfo33 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance34 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest35 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders31, requestBody32, uriInfo33, resourceInstance34);
    int i36 = postRequest35.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type37 = postRequest35.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder38 = addUserToGroupRequestAuditEventBuilder30.withRequestType(type37);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder39 = deleteRepositoryVersionAuditEventBuilder29.withRequestType(type37);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder40 = userPasswordChangeRequestAuditEventBuilder28.withRequestType(type37);
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder41 = changeRepositoryVersionAuditEventBuilder27.withRequestType(type37);
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder42 = changeAlertGroupRequestAuditEventBuilder12.withRequestType(type37);
    org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder43 = addCredentialAuditEventBuilder0.withRequestType(type37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type22.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    org.junit.Assert.assertTrue("'" + type37 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type37.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder43);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    boolean b3 = mITKerberosOperationHandler0.isOpen();
    mITKerberosOperationHandler0.close();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i8 = mITKerberosOperationHandler0.createPrincipal("UpgradeItem/request_id", "operation_level/cluster_name", false);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosOperationException");
    } catch (org.apache.ambari.server.serveraction.kerberos.KerberosOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.CONFIGURATION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configurations"+ "'", str0.equals("configurations"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    boolean b1 = serviceCheckGrouping0.supportsAutoSkipOnFailure;
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler2 = serviceCheckGrouping0.parallelScheduler;
    org.apache.ambari.server.state.stack.upgrade.Condition condition3 = serviceCheckGrouping0.condition;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(parallelScheduler2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(condition3);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType syncType1 = org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.valueOfIgnoreCase("PermissionInfo/resource_name");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.StackConfigurationDependencyResourceDefinition stackConfigurationDependencyResourceDefinition1 = new org.apache.ambari.server.api.resources.StackConfigurationDependencyResourceDefinition(type0);
    java.lang.String str2 = stackConfigurationDependencyResourceDefinition1.getSingularName();
    java.lang.String str3 = stackConfigurationDependencyResourceDefinition1.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "dependency"+ "'", str2.equals("dependency"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "dependencies"+ "'", str3.equals("dependencies"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }

    org.apache.ambari.server.security.authorization.ResourceType resourceType0 = org.apache.ambari.server.security.authorization.ResourceType.AMBARI;
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider2 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization3 = groupPrivilegeResourceProvider2.getRequiredCreateAuthorizations();
    boolean b4 = org.apache.ambari.server.security.authorization.AuthorizationHelper.isAuthorized(resourceType0, (java.lang.Long)1L, set_roleAuthorization3);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController6 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider7 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController6);
    org.apache.ambari.server.controller.spi.Request request8 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate9 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus10 = widgetResourceProvider7.deleteResources(request8, predicate9);
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider11 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization12 = groupPrivilegeResourceProvider11.getRequiredCreateAuthorizations();
    widgetResourceProvider7.setRequiredGetAuthorizations(set_roleAuthorization12);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.authorization.AuthorizationHelper.verifyAuthorization(resourceType0, (java.lang.Long)1L, set_roleAuthorization12);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + resourceType0 + "' != '" + org.apache.ambari.server.security.authorization.ResourceType.AMBARI + "'", resourceType0.equals(org.apache.ambari.server.security.authorization.ResourceType.AMBARI));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization12);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.rackInfo = singularattribute_hostEntity_str0;

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }

    org.apache.ambari.server.metadata.RoleCommandOrder roleCommandOrder0 = new org.apache.ambari.server.metadata.RoleCommandOrder();
    org.apache.ambari.server.state.Service service1 = null;
    org.apache.ambari.server.RoleCommand roleCommand2 = org.apache.ambari.server.RoleCommand.STOP;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.state.Service> set_service3 = roleCommandOrder0.getTransitiveServices(service1, roleCommand2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + roleCommand2 + "' != '" + org.apache.ambari.server.RoleCommand.STOP + "'", roleCommand2.equals(org.apache.ambari.server.RoleCommand.STOP));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_RM_HA;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_WP = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyRequest stackConfigurationDependencyRequest5 = new org.apache.ambari.server.controller.StackConfigurationDependencyRequest("HostRoles/cluster_name", "validate_config", "CompatibleRepositoryVersions/stack_name", "include_ambari_identity", "AlertTarget/enabled");
    stackConfigurationDependencyRequest5.setDependencyName("kdc_create_attributes");

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }

    org.apache.ambari.server.orm.dao.ClusterStateDAO clusterStateDAO0 = new org.apache.ambari.server.orm.dao.ClusterStateDAO();
    org.apache.ambari.server.orm.entities.ClusterStateEntity clusterStateEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    clusterStateDAO0.remove(clusterStateEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }

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
    org.apache.ambari.server.state.ThemeInfo themeInfo10 = null;
    org.apache.ambari.server.stack.ThemeModule themeModule11 = new org.apache.ambari.server.stack.ThemeModule(themeInfo10);
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.StackModule> map_str_stackModule12 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ServiceModule> map_str_serviceModule13 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ExtensionModule> map_str_extensionModule14 = null;
    themeModule4.resolve(themeModule11, map_str_stackModule12, map_str_serviceModule13, map_str_extensionModule14);
    java.lang.String[] str_array34 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str35, str_array34);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent37 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str35);
    java.util.Set<java.lang.String> set_str38 = hostsAddedEvent37.getHostNames();
    org.apache.ambari.server.controller.spi.TemporalInfo temporalInfo40 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey timelineAppMetricCacheKey41 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey(set_str38, "Tasks/id", temporalInfo40);
    themeModule11.addErrors((java.util.Collection<java.lang.String>)set_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str38);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = org.apache.ambari.server.orm.entities.HostEntity_.osArch;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_str0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }

    java.lang.String str0 = org.apache.ambari.server.events.listeners.upgrade.DistributeRepositoriesActionListener.INSTALL_PACKAGES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "install_packages"+ "'", str0.equals("install_packages"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STATUS_INFO;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STATUS_INFO + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STATUS_INFO));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }

    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.builder();
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
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder12 = changeRepositoryVersionAuditEventBuilder0.withRequestType(type9);
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder14 = changeRepositoryVersionAuditEventBuilder12.withUrl("Stage/host_params");
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder16 = changeRepositoryVersionAuditEventBuilder12.withRepoVersion("StackLevelConfigurations/type");
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder18 = changeRepositoryVersionAuditEventBuilder16.withUserName("recovery_retry_interval");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type9.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder18);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }

    org.apache.ambari.server.api.handlers.QueryCreateHandler queryCreateHandler0 = new org.apache.ambari.server.api.handlers.QueryCreateHandler();

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    java.util.Map<java.lang.String,org.apache.ambari.server.state.Cluster> map_str_cluster7 = clustersImpl4.getClusters();
    org.apache.ambari.server.hooks.users.PostUserCreationHookContext postUserCreationHookContext9 = new org.apache.ambari.server.hooks.users.PostUserCreationHookContext("RepositoryVersions/display_name");
    java.util.Map<java.lang.String,java.util.Set<java.lang.String>> map_str_set_str10 = postUserCreationHookContext9.getUserGroups();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str11 = null;
    // The following exception was thrown during execution in test generation
    try {
    clustersImpl4.updateHostWithClusterAndAttributes(map_str_set_str10, map_str_map_str_str11);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.HostNotFoundException");
    } catch (org.apache.ambari.server.HostNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_cluster7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_set_str10);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }

    org.apache.ambari.server.serveraction.upgrades.FixOozieAdminUsers fixOozieAdminUsers0 = new org.apache.ambari.server.serveraction.upgrades.FixOozieAdminUsers();

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }

    org.apache.ambari.server.api.services.ViewUrlsService viewUrlsService0 = new org.apache.ambari.server.api.services.ViewUrlsService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = viewUrlsService0.updateUrl("ViewUrlInfo/view_instance_name", httpHeaders2, uriInfo3, "\"Hosts/maintenance_state\"");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }

    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService affectedService0 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService();
    java.lang.String str1 = affectedService0.name;
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent affectedComponent2 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent();
    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent[] affectedComponent_array3 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent[] { affectedComponent2 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent> arraylist_affectedComponent4 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedComponent>)arraylist_affectedComponent4, affectedComponent_array3);
    affectedService0.components = arraylist_affectedComponent4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(affectedComponent_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }

    org.apache.ambari.server.state.quicklinksprofile.AcceptAllFilter acceptAllFilter0 = new org.apache.ambari.server.state.quicklinksprofile.AcceptAllFilter();
    org.apache.ambari.server.state.quicklinks.Link link1 = new org.apache.ambari.server.state.quicklinks.Link();
    link1.setUrl("AlertHistory/definition_name");
    link1.setLabel("keytab_file_group_access");
    boolean b6 = acceptAllFilter0.accept(link1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }

    org.apache.ambari.server.api.services.stackadvisor.validations.ValidationResponse validationResponse0 = new org.apache.ambari.server.api.services.stackadvisor.validations.ValidationResponse();
    java.util.Set<org.apache.ambari.server.api.services.stackadvisor.validations.ValidationResponse.ValidationItem> set_validationItem1 = validationResponse0.getItems();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_validationItem1);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }

    org.apache.ambari.server.controller.internal.PropertyInfo propertyInfo3 = new org.apache.ambari.server.controller.internal.PropertyInfo("blueprint_name", true, true);
    boolean b4 = propertyInfo3.isPointInTime();
    boolean b5 = propertyInfo3.isPointInTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType3 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    mITKerberosOperationHandler0.close();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType3);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }

    org.apache.ambari.server.controller.internal.PropertyInfo propertyInfo3 = new org.apache.ambari.server.controller.internal.PropertyInfo("blueprint_name", true, true);
    propertyInfo3.setAmsHostMetric(false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider.REPOSITORY_VERSION_STACK_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CompatibleRepositoryVersions/stack_version"+ "'", str0.equals("CompatibleRepositoryVersions/stack_version"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertHistoryResourceProvider.ALERT_HISTORY_COMPONENT_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertHistory/component_name"+ "'", str0.equals("AlertHistory/component_name"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }

    org.apache.ambari.server.state.stack.upgrade.TaskWrapperBuilder taskWrapperBuilder0 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapperBuilder();

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }

    org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus0 = org.apache.ambari.server.controller.internal.CalculatedStatus.COMPLETED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(calculatedStatus0);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }

    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO0 = new org.apache.ambari.server.orm.dao.ViewInstanceDAO();
    org.apache.ambari.server.orm.entities.ViewInstanceEntity viewInstanceEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    viewInstanceDAO0.create(viewInstanceEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }

    org.apache.ambari.server.controller.logging.LogQueryResponse logQueryResponse0 = new org.apache.ambari.server.controller.logging.LogQueryResponse();
    logQueryResponse0.setResultSize("Credential/key");
    java.lang.String str3 = logQueryResponse0.getQueryTimeMS();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }

    org.apache.ambari.server.agent.AgentEnv.ExistingUser existingUser0 = new org.apache.ambari.server.agent.AgentEnv.ExistingUser();
    java.lang.String str1 = existingUser0.getUserHomeDir();
    java.lang.String str2 = existingUser0.getUserName();
    java.lang.String str3 = existingUser0.getUserStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_NAMENODE_TRUNCATE;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_MAINTENANCE_MODE = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }

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
    org.apache.ambari.server.controller.spi.Resource resource37 = null;
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource38 = null;
    org.apache.ambari.server.controller.internal.RequestStatusImpl requestStatusImpl39 = new org.apache.ambari.server.controller.internal.RequestStatusImpl(resource37, set_resource38);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource40 = requestStatusImpl39.getAssociatedResources();
    java.lang.String[] str_array43 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request44 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array43);
    org.apache.ambari.server.controller.spi.Request request45 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array43);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate48 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    java.lang.String str49 = filterPredicate48.getOperator();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource50 = clusterControllerImpl33.populateResources(type36, set_resource40, request45, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate48);
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
    org.junit.Assert.assertNotNull(set_resource40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ".FILTER"+ "'", str49.equals(".FILTER"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str4 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest5 = new org.apache.ambari.server.controller.ConfigurationRequest("", "Users/user_name", "CompatibleRepositoryVersions/stack_name", map_str_str3, map_str_map_str_str4);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str6 = null;
    configurationRequest5.setPropertiesAttributes(map_str_map_str_str6);
    java.lang.String str8 = configurationRequest5.getType();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str9 = configurationRequest5.getPropertiesAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Users/user_name"+ "'", str8.equals("Users/user_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_map_str_str9);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }

    org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric gangliaMetric0 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric();
    java.lang.String str1 = gangliaMetric0.getMetric_name();
    java.lang.Number[][] number_array_array2 = gangliaMetric0.getDatapoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(number_array_array2);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider.REPOSITORY_VERSION_REPOSITORY_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CompatibleRepositoryVersions/repository_version"+ "'", str0.equals("CompatibleRepositoryVersions/repository_version"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }

    org.apache.ambari.server.controller.OperatingSystemResponse operatingSystemResponse1 = new org.apache.ambari.server.controller.OperatingSystemResponse("AlertGroup");
    operatingSystemResponse1.setStackVersion("version1");

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_UPGRADE;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_UPGRADE + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_UPGRADE));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse8.setInputs("ViewUrlInfo/view_instance_version");
    actionResponse8.setDefaultTimeout("StackLevelConfigurations/property_description");

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }

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
    org.apache.ambari.server.state.Host host11 = clustersImpl4.getHostById((java.lang.Long)300000L);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.HostNotFoundException");
    } catch (org.apache.ambari.server.HostNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_cluster7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }

    org.apache.ambari.server.state.SecurityType securityType3 = org.apache.ambari.server.state.SecurityType.KERBEROS;
    java.util.Set<java.lang.String> set_str5 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.propertyIds;
    org.apache.ambari.server.controller.ClusterRequest clusterRequest6 = new org.apache.ambari.server.controller.ClusterRequest((java.lang.Long)1000L, "timeline.metrics.host.aggregator.ttl", "Users/user_type", securityType3, "HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}", set_str5);
    clusterRequest6.setProvisioningState("");
    org.junit.Assert.assertTrue("'" + securityType3 + "' != '" + org.apache.ambari.server.state.SecurityType.KERBEROS + "'", securityType3.equals(org.apache.ambari.server.state.SecurityType.KERBEROS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str5);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyResponse stackConfigurationDependencyResponse2 = new org.apache.ambari.server.controller.StackConfigurationDependencyResponse("widgets.json", "widgets.json");
    stackConfigurationDependencyResponse2.setPropertyName("configurations");
    java.lang.String str5 = stackConfigurationDependencyResponse2.getServiceName();
    stackConfigurationDependencyResponse2.setDependencyName("cluster");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }

    org.apache.ambari.server.hooks.users.UserHookParams userHookParams0 = org.apache.ambari.server.hooks.users.UserHookParams.CMD_TIME_FRAME;
    org.junit.Assert.assertTrue("'" + userHookParams0 + "' != '" + org.apache.ambari.server.hooks.users.UserHookParams.CMD_TIME_FRAME + "'", userHookParams0.equals(org.apache.ambari.server.hooks.users.UserHookParams.CMD_TIME_FRAME));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.ambari.server.controller.HostRequest hostRequest3 = new org.apache.ambari.server.controller.HostRequest("Theme", "", map_str_str2);
    java.lang.String str4 = hostRequest3.getRackInfo();
    hostRequest3.setMaintenanceState("ViewUrlInfo/url_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }

    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = addUserToGroupRequestAuditEventBuilder0.withUrl("Upgrade");
    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder4 = addUserToGroupRequestAuditEventBuilder2.withUrl("#");
    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder6 = addUserToGroupRequestAuditEventBuilder4.withUserName("ConfigGroup/hosts");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder6);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }

    org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent.ConfigurationChangeRequestAuditEventBuilder configurationChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent.ConfigurationChangeRequestAuditEventBuilder configurationChangeRequestAuditEventBuilder2 = configurationChangeRequestAuditEventBuilder0.withOperation("ranger-hbase-plugin-enabled");
    org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent.ConfigurationChangeRequestAuditEventBuilder configurationChangeRequestAuditEventBuilder4 = configurationChangeRequestAuditEventBuilder0.withUserName("fqdn");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationChangeRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationChangeRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationChangeRequestAuditEventBuilder4);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler1 = null;
    serviceCheckGrouping0.parallelScheduler = parallelScheduler1;
    serviceCheckGrouping0.name = "notification.dispatch.alert.script";
    serviceCheckGrouping0.allowRetry = false;
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler7 = null;
    serviceCheckGrouping0.parallelScheduler = parallelScheduler7;
    serviceCheckGrouping0.allowRetry = true;

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }

    org.apache.ambari.server.controller.internal.PasswordTrimmingStrategy passwordTrimmingStrategy0 = new org.apache.ambari.server.controller.internal.PasswordTrimmingStrategy();
    java.lang.String str1 = passwordTrimmingStrategy0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "PasswordTrimmingStrategy"+ "'", str1.equals("PasswordTrimmingStrategy"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.keyPropertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }

    org.apache.ambari.server.state.SecurityType securityType3 = null;
    java.lang.Integer[] i_array9 = new java.lang.Integer[] { 1, 0, 1, 10 };
    java.util.TreeSet<java.lang.Integer> treeset_i10 = new java.util.TreeSet<java.lang.Integer>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i10, i_array9);
    java.util.Set<java.lang.String> set_str12 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i10);
    org.apache.ambari.server.controller.ClusterRequest clusterRequest13 = new org.apache.ambari.server.controller.ClusterRequest((java.lang.Long)1L, "Versions/parent_extension_version", "ViewInstanceInfo/view_name", securityType3, "WidgetLayoutInfo/cluster_name", set_str12);
    java.lang.Long long14 = clusterRequest13.getClusterId();
    java.util.Map<java.lang.String,java.lang.String> map_str_str18 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str19 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest20 = new org.apache.ambari.server.controller.ConfigurationRequest("", "Users/user_name", "CompatibleRepositoryVersions/stack_name", map_str_str18, map_str_map_str_str19);
    java.util.Map<java.lang.String,java.lang.String> map_str_str24 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str25 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest26 = new org.apache.ambari.server.controller.ConfigurationRequest("", "Users/user_name", "CompatibleRepositoryVersions/stack_name", map_str_str24, map_str_map_str_str25);
    java.util.Map<java.lang.String,java.lang.String> map_str_str30 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str31 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest32 = new org.apache.ambari.server.controller.ConfigurationRequest("", "Users/user_name", "CompatibleRepositoryVersions/stack_name", map_str_str30, map_str_map_str_str31);
    org.apache.ambari.server.controller.ConfigurationRequest[] configurationRequest_array33 = new org.apache.ambari.server.controller.ConfigurationRequest[] { configurationRequest20, configurationRequest26, configurationRequest32 };
    java.util.ArrayList<org.apache.ambari.server.controller.ConfigurationRequest> arraylist_configurationRequest34 = new java.util.ArrayList<org.apache.ambari.server.controller.ConfigurationRequest>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ConfigurationRequest>)arraylist_configurationRequest34, configurationRequest_array33);
    clusterRequest13.setDesiredConfig((java.util.List<org.apache.ambari.server.controller.ConfigurationRequest>)arraylist_configurationRequest34);
    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest44 = new org.apache.ambari.server.controller.ServiceConfigVersionRequest("Hosts/os_type", "widgets.json", (java.lang.Long)0L, (java.lang.Long)5000L, (java.lang.Long)100L, "ranger-hbase-plugin-enabled", (java.lang.Boolean)false);
    serviceConfigVersionRequest44.setCreateTime((java.lang.Long)(-1L));
    java.lang.Long long47 = serviceConfigVersionRequest44.getVersion();
    clusterRequest13.setServiceConfigVersionRequest(serviceConfigVersionRequest44);
    java.lang.String str49 = clusterRequest13.getStackVersion();
    java.lang.String str50 = clusterRequest13.getClusterName();
    org.apache.ambari.server.state.SecurityType securityType51 = org.apache.ambari.server.state.SecurityType.KERBEROS;
    org.apache.ambari.server.topology.SecurityConfiguration securityConfiguration54 = new org.apache.ambari.server.topology.SecurityConfiguration(securityType51, "ViewInstanceInfo/short_url_name", "RootServiceComponents/server_clock");
    clusterRequest13.setSecurityType(securityType51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L+ "'", long14.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationRequest_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L+ "'", long47.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "WidgetLayoutInfo/cluster_name"+ "'", str49.equals("WidgetLayoutInfo/cluster_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Versions/parent_extension_version"+ "'", str50.equals("Versions/parent_extension_version"));
    org.junit.Assert.assertTrue("'" + securityType51 + "' != '" + org.apache.ambari.server.state.SecurityType.KERBEROS + "'", securityType51.equals(org.apache.ambari.server.state.SecurityType.KERBEROS));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }

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
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type64 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION;
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface71 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array72 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface71 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface73 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b74 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface73, interface_array72);
    org.apache.ambari.server.controller.ivory.Cluster.Location location77 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array78 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location77 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location79 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b80 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location79, location_array78);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array81 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo82 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b83 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo82, propertyInfo_array81);
    java.util.Map<java.lang.String,java.lang.String> map_str_str84 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo85 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo82, map_str_str84);
    org.apache.ambari.server.controller.ivory.Cluster cluster86 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface73, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location79, map_str_str84);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type87 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper89 = null;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] taskWrapper_array90 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] { taskWrapper89 };
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper91 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type87, "WidgetLayoutInfo/section_name", taskWrapper_array90);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper92 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type64, "StackConfigurationDependency/property_name", map_str_str84, taskWrapper_array90);
    clusterResponse63.setCredentialStoreServiceProperties(map_str_str84);
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
    org.junit.Assert.assertTrue("'" + type64 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION + "'", type64.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str84);
    org.junit.Assert.assertTrue("'" + type87 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP + "'", type87.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(taskWrapper_array90);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }

    org.apache.ambari.server.view.configuration.ViewConfig viewConfig0 = new org.apache.ambari.server.view.configuration.ViewConfig();
    java.lang.String str1 = viewConfig0.getClusterConfigOptions();
    java.lang.String str2 = viewConfig0.getValidator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test160"); }

    org.apache.ambari.server.state.stack.ConfigUpgradePack[] configUpgradePack_array0 = new org.apache.ambari.server.state.stack.ConfigUpgradePack[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack> arraylist_configUpgradePack1 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack>)arraylist_configUpgradePack1, configUpgradePack_array0);
    org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack3 = org.apache.ambari.server.state.stack.ConfigUpgradePack.merge(arraylist_configUpgradePack1);
    java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> list_affectedService4 = configUpgradePack3.services;
    org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack5 = new org.apache.ambari.server.state.stack.ConfigUpgradePack(list_affectedService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configUpgradePack_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configUpgradePack3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_affectedService4);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test161"); }

    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping6 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition8 = aggregateDefinitionMapping6.getAggregateDefinitions((long)(short)1);
    org.apache.ambari.server.agent.AlertDefinitionCommand alertDefinitionCommand9 = new org.apache.ambari.server.agent.AlertDefinitionCommand("", "Hosts/last_registration_time", "${ambariVersion}", list_alertDefinition8);
    org.apache.ambari.server.agent.AlertDefinitionCommand alertDefinitionCommand10 = new org.apache.ambari.server.agent.AlertDefinitionCommand("AMBARI.MANAGE_USERS", "Actions/target_service", "yarn.scheduler.capacity.root", list_alertDefinition8);
    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping14 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition16 = aggregateDefinitionMapping14.getAggregateDefinitions((long)(short)1);
    org.apache.ambari.server.agent.AlertDefinitionCommand alertDefinitionCommand17 = new org.apache.ambari.server.agent.AlertDefinitionCommand("", "Hosts/last_registration_time", "${ambariVersion}", list_alertDefinition16);
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition18 = alertDefinitionCommand17.getAlertDefinitions();
    org.apache.ambari.server.agent.AgentCommand.AgentCommandType agentCommandType19 = null;
    alertDefinitionCommand17.setCommandType(agentCommandType19);
    org.apache.ambari.server.agent.AgentCommand.AgentCommandType agentCommandType21 = alertDefinitionCommand17.getCommandType();
    alertDefinitionCommand10.setCommandType(agentCommandType21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition18);
    org.junit.Assert.assertTrue("'" + agentCommandType21 + "' != '" + org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_DEFINITION_COMMAND + "'", agentCommandType21.equals(org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_DEFINITION_COMMAND));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test162"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse8.setInputs("ViewUrlInfo/view_instance_version");
    java.lang.String str11 = actionResponse8.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "HostRoles/state"+ "'", str11.equals("HostRoles/state"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test163"); }

    java.lang.Comparable<org.apache.ambari.server.state.alert.TargetType> comparable_targetType1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.predicate.GreaterEqualsPredicate<org.apache.ambari.server.state.alert.TargetType> greaterequalspredicate_targetType2 = new org.apache.ambari.server.controller.predicate.GreaterEqualsPredicate<org.apache.ambari.server.state.alert.TargetType>("StackConfigurations/property_value_attributes", comparable_targetType1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test164"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.orm.dao.GroupDAO groupDAO4 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO5 = null;
    org.apache.ambari.server.security.authorization.Users users6 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.controller.internal.UserPrivilegeResourceProvider.init(userDAO0, clusterDAO3, groupDAO4, viewInstanceDAO5, users6);
    org.apache.ambari.server.security.ldap.LdapBatchDto ldapBatchDto8 = null;
    // The following exception was thrown during execution in test generation
    try {
    users6.processLdapSync(ldapBatchDto8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test165"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.upgrades.UpdateDesiredStackAction.COMMAND_PARAM_ORIGINAL_STACK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "original_stack"+ "'", str0.equals("original_stack"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test166"); }

    org.apache.ambari.server.controller.spi.Resource[] resource_array0 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource1 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1, resource_array0);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl6 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1, true, false, (int)'#');
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl7 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1);
    boolean b8 = queryResponseImpl7.isPagedResponse();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test167"); }

    org.apache.ambari.server.controller.ServiceComponentRequest serviceComponentRequest5 = new org.apache.ambari.server.controller.ServiceComponentRequest("", "hi!", "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url");
    serviceComponentRequest5.setServiceName("ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}");
    serviceComponentRequest5.setComponentName("Versions/extension-errors");

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test168"); }

    org.apache.ambari.server.audit.request.eventcreator.UserEventCreator userEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.UserEventCreator();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS1 = userEventCreator0.getResultStatuses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS1);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test169"); }

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
    java.util.List<org.apache.ambari.server.security.authorization.User> list_user8 = users6.getAllUsers();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test170"); }

    org.apache.ambari.server.orm.entities.RequestEntity requestEntity0 = null;
    com.google.inject.Injector injector1 = null;
    org.apache.ambari.server.actionmanager.StageFactoryImpl stageFactoryImpl2 = new org.apache.ambari.server.actionmanager.StageFactoryImpl(injector1);
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory4 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO5 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory6 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl7 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO3, clusterFactory4, hostDAO5, hostFactory6);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl7, (int)(short)100);
    java.util.Map<java.lang.String,org.apache.ambari.server.state.Cluster> map_str_cluster10 = clustersImpl7.getClusters();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.actionmanager.Request request11 = new org.apache.ambari.server.actionmanager.Request(requestEntity0, (org.apache.ambari.server.actionmanager.StageFactory)stageFactoryImpl2, (org.apache.ambari.server.state.Clusters)clustersImpl7);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_cluster10);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test171"); }

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
    java.util.Set<java.lang.String> set_str29 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str30 = hostComponentResourceProvider28.checkPropertyIds(set_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str30);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test172"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.List<java.lang.String> list_str5 = configuration0.getRollingUpgradeSkipPackagesPrefixes();
    int i6 = configuration0.getAgentPackageParallelCommandsLimit();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = configuration0.getLocalDatabaseUrl();
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
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test173"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array5 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter6 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6, requestResourceFilter_array5);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel8 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str9 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest11 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6, requestOperationLevel8, map_str_str9, false);
    org.apache.ambari.server.controller.ActionExecutionContext actionExecutionContext12 = new org.apache.ambari.server.controller.ActionExecutionContext("", "RootServiceHostComponents/properties", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6);
    java.lang.String str13 = actionExecutionContext12.getActionName();
    actionExecutionContext12.setRetryAllowed(true);
    java.lang.String str16 = actionExecutionContext12.getExpectedComponentName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "RootServiceHostComponents/properties"+ "'", str13.equals("RootServiceHostComponents/properties"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test174"); }

    java.lang.String str0 = org.apache.ambari.server.topology.Setting.SETTING_NAME_RECOVERY_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "recovery_enabled"+ "'", str0.equals("recovery_enabled"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test175"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceConfigVersionResourceProvider.SERVICE_CONFIG_VERSION_GROUP_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "group_name"+ "'", str0.equals("group_name"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test176"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.VIEWS_HTTP_X_CONTENT_TYPE_HEADER_VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test177"); }

    com.google.inject.Injector injector0 = null;
    org.apache.ambari.server.actionmanager.StageFactoryImpl stageFactoryImpl1 = new org.apache.ambari.server.actionmanager.StageFactoryImpl(injector0);
    org.apache.ambari.server.orm.entities.StageEntity stageEntity2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.actionmanager.Stage stage3 = stageFactoryImpl1.createExisting(stageEntity2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test178"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.List<java.lang.String> list_str5 = configuration0.getRollingUpgradeSkipPackagesPrefixes();
    int i6 = configuration0.getAgentPackageParallelCommandsLimit();
    long long7 = configuration0.getViewExtractionThreadPoolTimeout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 100000L);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test179"); }

    java.lang.String str0 = org.apache.ambari.server.stack.QuickLinksConfigurationModule.QUICKLINKS_CONFIGURATION_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "QuickLinksConfiguration"+ "'", str0.equals("QuickLinksConfiguration"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test180"); }

    org.apache.ambari.server.RoleCommand roleCommand0 = org.apache.ambari.server.RoleCommand.CUSTOM_COMMAND;
    org.junit.Assert.assertTrue("'" + roleCommand0 + "' != '" + org.apache.ambari.server.RoleCommand.CUSTOM_COMMAND + "'", roleCommand0.equals(org.apache.ambari.server.RoleCommand.CUSTOM_COMMAND));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test181"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    long long6 = configuration0.getPropertyProvidersCompletionServiceTimeout();
    java.util.Properties properties7 = configuration0.getLog4jProperties();
    int i8 = configuration0.getTaskIdListLimit();
    
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
    org.junit.Assert.assertTrue(i8 == 999);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test182"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_REASON_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/reason"+ "'", str0.equals("UpgradeChecks/reason"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test183"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher0 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.agent.RecoveryConfigHelper recoveryConfigHelper1 = new org.apache.ambari.server.agent.RecoveryConfigHelper(ambariEventPublisher0);
    boolean b5 = recoveryConfigHelper1.isConfigStale("StackLevelConfigurations/type", "value", (long)20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test184"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.lang.String str5 = configuration0.getStrictTransportSecurityHTTPResponseHeader();
    boolean b6 = configuration0.useMetricsCacheCustomSizingEngine();
    java.lang.String str7 = configuration0.getStackAdvisorScript();
    java.io.File file8 = configuration0.getViewsDir();
    boolean b9 = configuration0.getParallelStageExecution();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "max-age=31536000"+ "'", str5.equals("max-age=31536000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/var/lib/ambari-server/resources/scripts/stack_advisor.py"+ "'", str7.equals("/var/lib/ambari-server/resources/scripts/stack_advisor.py"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test185"); }

    org.apache.ambari.server.api.services.KerberosDescriptorService kerberosDescriptorService0 = new org.apache.ambari.server.api.services.KerberosDescriptorService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = kerberosDescriptorService0.createKerberosDescriptor("upgraded", httpHeaders2, uriInfo3, "instances");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test186"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = configuration0.getPreviousDatabaseConnectorNames();
    org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior ldapUsernameCollisionHandlingBehavior4 = configuration0.getLdapSyncCollisionHandlingBehavior();
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = configuration0.getAmbariProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);
    org.junit.Assert.assertTrue("'" + ldapUsernameCollisionHandlingBehavior4 + "' != '" + org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior.CONVERT + "'", ldapUsernameCollisionHandlingBehavior4.equals(org.apache.ambari.server.configuration.Configuration.LdapUsernameCollisionHandlingBehavior.CONVERT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str5);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test187"); }

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
    java.util.Set<java.lang.String> set_str44 = queryImpl35.getProperties();
    
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
    org.junit.Assert.assertNotNull(set_str44);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test188"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserResourceProvider.USER_LDAP_USER_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Users/ldap_user"+ "'", str0.equals("Users/ldap_user"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test189"); }

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
    org.apache.ambari.server.upgrade.UpgradeCatalog[] upgradeCatalog_array15 = new org.apache.ambari.server.upgrade.UpgradeCatalog[] {  };
    java.util.ArrayList<org.apache.ambari.server.upgrade.UpgradeCatalog> arraylist_upgradeCatalog16 = new java.util.ArrayList<org.apache.ambari.server.upgrade.UpgradeCatalog>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.upgrade.UpgradeCatalog>)arraylist_upgradeCatalog16, upgradeCatalog_array15);
    schemaUpgradeHelper14.executeUpgrade((java.util.List<org.apache.ambari.server.upgrade.UpgradeCatalog>)arraylist_upgradeCatalog16);
    org.apache.ambari.server.upgrade.UpgradeCatalog[] upgradeCatalog_array19 = new org.apache.ambari.server.upgrade.UpgradeCatalog[] {  };
    java.util.ArrayList<org.apache.ambari.server.upgrade.UpgradeCatalog> arraylist_upgradeCatalog20 = new java.util.ArrayList<org.apache.ambari.server.upgrade.UpgradeCatalog>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.upgrade.UpgradeCatalog>)arraylist_upgradeCatalog20, upgradeCatalog_array19);
    schemaUpgradeHelper14.executeUpgrade((java.util.List<org.apache.ambari.server.upgrade.UpgradeCatalog>)arraylist_upgradeCatalog20);
    org.apache.ambari.server.upgrade.UpgradeCatalog[] upgradeCatalog_array23 = new org.apache.ambari.server.upgrade.UpgradeCatalog[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog> linkedhashset_upgradeCatalog24 = new java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog24, upgradeCatalog_array23);
    com.google.inject.persist.PersistService persistService26 = null;
    org.apache.ambari.server.orm.DBAccessor dBAccessor27 = null;
    org.apache.ambari.server.configuration.Configuration configuration28 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str29 = configuration28.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file30 = configuration28.getRecommendationsDir();
    java.lang.String str31 = configuration28.getHostsMapFile();
    java.lang.Integer i32 = configuration28.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties33 = configuration28.getPersistenceCustomProperties();
    long long34 = configuration28.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str35 = configuration28.getWebAppDir();
    java.lang.String str36 = configuration28.isAgentStackRetryOnInstallEnabled();
    org.apache.ambari.server.upgrade.SchemaUpgradeHelper schemaUpgradeHelper37 = new org.apache.ambari.server.upgrade.SchemaUpgradeHelper((java.util.Set<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog24, persistService26, dBAccessor27, configuration28);
    org.apache.ambari.server.upgrade.UpgradeCatalog[] upgradeCatalog_array38 = new org.apache.ambari.server.upgrade.UpgradeCatalog[] {  };
    java.util.ArrayList<org.apache.ambari.server.upgrade.UpgradeCatalog> arraylist_upgradeCatalog39 = new java.util.ArrayList<org.apache.ambari.server.upgrade.UpgradeCatalog>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.upgrade.UpgradeCatalog>)arraylist_upgradeCatalog39, upgradeCatalog_array38);
    schemaUpgradeHelper37.executeUpgrade((java.util.List<org.apache.ambari.server.upgrade.UpgradeCatalog>)arraylist_upgradeCatalog39);
    schemaUpgradeHelper14.executeDMLUpdates((java.util.List<org.apache.ambari.server.upgrade.UpgradeCatalog>)arraylist_upgradeCatalog39, "metrics.properties");
    
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
    org.junit.Assert.assertNotNull(upgradeCatalog_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(upgradeCatalog_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(upgradeCatalog_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "nosniff"+ "'", str29.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 30000+ "'", i32.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 5000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "false"+ "'", str36.equals("false"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(upgradeCatalog_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test190"); }

    org.apache.ambari.server.hooks.users.PostUserCreationHookContext postUserCreationHookContext1 = new org.apache.ambari.server.hooks.users.PostUserCreationHookContext("RepositoryVersions/display_name");
    java.util.Map<java.lang.String,java.util.Set<java.lang.String>> map_str_set_str2 = postUserCreationHookContext1.getUserGroups();
    org.apache.ambari.server.hooks.users.PostUserCreationHookContext postUserCreationHookContext3 = new org.apache.ambari.server.hooks.users.PostUserCreationHookContext(map_str_set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_set_str2);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test191"); }

    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity0 = null;
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider3 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization4 = groupPrivilegeResourceProvider3.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization5 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array6 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization5 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization7 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization7, roleAuthorization_array6);
    boolean b9 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization4, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization7);
    org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider viewInstanceResourceProvider10 = new org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization11 = viewInstanceResourceProvider10.getRequiredCreateAuthorizations();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyAuthorization(alertDefinitionEntity0, set_roleAuthorization4, set_roleAuthorization11, "ExtensionLink/extension_version");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization4);
    org.junit.Assert.assertTrue("'" + roleAuthorization5 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization5.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization11);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test192"); }

    org.apache.ambari.server.api.services.RequestBody requestBody0 = new org.apache.ambari.server.api.services.RequestBody();
    java.util.Set<java.util.Map<java.lang.String,java.lang.Object>> set_map_str_obj1 = requestBody0.getPropertySets();
    org.apache.ambari.server.controller.internal.ScaleClusterRequest scaleClusterRequest2 = new org.apache.ambari.server.controller.internal.ScaleClusterRequest(set_map_str_obj1);
    org.apache.ambari.server.topology.Setting setting3 = org.apache.ambari.server.topology.SettingFactory.getSetting((java.util.Collection<java.util.Map<java.lang.String,java.lang.Object>>)set_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(setting3);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test193"); }

    org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning0 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
    org.apache.ambari.server.checks.InstallPackagesCheck installPackagesCheck1 = new org.apache.ambari.server.checks.InstallPackagesCheck();
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType2 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.NON_ROLLING;
    boolean b3 = installPackagesCheck1.isRequired(upgradeType2);
    boolean b4 = hiveNotRollingWarning0.isRequired(upgradeType2);
    org.junit.Assert.assertTrue("'" + upgradeType2 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.NON_ROLLING + "'", upgradeType2.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.NON_ROLLING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test194"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getAlertEventPublisherPoolSize();
    java.lang.String str4 = configuration0.getAlertTemplateFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test195"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType comparisonType0 = org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.CONTAINS;
    org.junit.Assert.assertTrue("'" + comparisonType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.CONTAINS + "'", comparisonType0.equals(org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.CONTAINS));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test196"); }

    org.apache.ambari.server.controller.internal.Stack.ConfigProperty configProperty3 = new org.apache.ambari.server.controller.internal.Stack.ConfigProperty("ambari-server", "RootServiceComponents/service_name", "hostComponents");
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo4 = configProperty3.getPropertyValueAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(valueAttributesInfo4);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test197"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.DB_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "db_name"+ "'", str0.equals("db_name"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test198"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getConnectionPoolMaximumAge();
    java.util.Properties properties4 = configuration0.getPersistenceCustomProperties();
    int i5 = configuration0.getMetricCacheTTLSeconds();
    java.lang.String str6 = configuration0.getExecutionSchedulerConnections();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5"+ "'", str6.equals("5"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test199"); }

    org.apache.ambari.server.agent.HostInfo hostInfo0 = new org.apache.ambari.server.agent.HostInfo();
    hostInfo0.setOS("clusterHostInfo");
    java.lang.String str3 = hostInfo0.getTimeZone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test200"); }

    org.apache.ambari.server.agent.HostInfo hostInfo0 = new org.apache.ambari.server.agent.HostInfo();
    java.lang.String str1 = hostInfo0.getFQDN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test201"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,java.lang.Long> singularattribute_stageEntity_long0 = org.apache.ambari.server.orm.entities.StageEntity_.stageId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stageEntity_long0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test202"); }

    org.apache.ambari.server.api.resources.UpgradeResourceDefinition.DOWNGRADE_DIRECTIVE = "HostRoles/public_host_name";

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test203"); }

    int i0 = org.apache.ambari.server.api.services.BaseRequest.DEFAULT_PAGE_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 20);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test204"); }

    org.apache.ambari.server.controller.logging.NameValuePair nameValuePair2 = new org.apache.ambari.server.controller.logging.NameValuePair("tag", "tag");
    java.lang.String str3 = nameValuePair2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tag"+ "'", str3.equals("tag"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test205"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_AGENT_HOSTNAME_VALIDATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test206"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.NIMBUS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test207"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler.KERBEROS_ENV_KDC_HOSTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "kdc_hosts"+ "'", str0.equals("kdc_hosts"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test208"); }

    org.apache.ambari.server.api.resources.CredentialResourceDefinition credentialResourceDefinition0 = new org.apache.ambari.server.api.resources.CredentialResourceDefinition();
    java.lang.String str1 = credentialResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "credential"+ "'", str1.equals("credential"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test209"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertTargetResourceProvider.ALERT_TARGET_GROUPS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertTarget/groups"+ "'", str0.equals("AlertTarget/groups"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test210"); }

    org.apache.ambari.server.bootstrap.BSResponse bSResponse0 = new org.apache.ambari.server.bootstrap.BSResponse();
    bSResponse0.setLog("METRICS_COLLECTOR");
    bSResponse0.setRequestId((long)140);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test211"); }

    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorException stackAdvisorException1 = new org.apache.ambari.server.api.services.stackadvisor.StackAdvisorException("RootServiceHostComponents/service_name");

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test212"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getAlertEventPublisherPoolSize();
    java.lang.Integer i4 = configuration0.getDefaultServerTaskTimeout();
    java.lang.String str5 = configuration0.getViewsPragmaHTTPResponseHeader();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1200+ "'", i4.equals(1200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "no-cache"+ "'", str5.equals("no-cache"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test213"); }

    org.apache.ambari.server.api.services.ExtensionLinksService extensionLinksService0 = new org.apache.ambari.server.api.services.ExtensionLinksService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = extensionLinksService0.getExtensionLinks("credential", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test214"); }

    org.apache.ambari.server.state.theme.Widget widget0 = new org.apache.ambari.server.state.theme.Widget();
    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler1 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType2 = mITKerberosOperationHandler1.getKeyEncryptionTypes();
    java.lang.String str3 = mITKerberosOperationHandler1.getDefaultRealm();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType4 = mITKerberosOperationHandler1.getKeyEncryptionTypes();
    mITKerberosOperationHandler1.setDefaultRealm("hi!");
    char[] char_array13 = new char[] { '4', '4', '#', 'a', '4' };
    org.apache.ambari.server.security.credential.PrincipalKeyCredential principalKeyCredential14 = new org.apache.ambari.server.security.credential.PrincipalKeyCredential("skip_failure", char_array13);
    org.apache.ambari.server.configuration.Configuration configuration16 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str17 = configuration16.getViewsPragmaHTTPResponseHeader();
    boolean b18 = configuration16.validateAgentHostnames();
    java.util.Map<java.lang.String,java.lang.String> map_str_str19 = configuration16.getDatabaseConnectorNames();
    mITKerberosOperationHandler1.open(principalKeyCredential14, "AlertHistory/label", map_str_str19);
    widget0.setRequiredProperties(map_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "no-cache"+ "'", str17.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str19);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test215"); }

    org.apache.ambari.server.state.stack.ConfigUpgradePack[] configUpgradePack_array0 = new org.apache.ambari.server.state.stack.ConfigUpgradePack[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack> arraylist_configUpgradePack1 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack>)arraylist_configUpgradePack1, configUpgradePack_array0);
    org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack3 = org.apache.ambari.server.state.stack.ConfigUpgradePack.merge(arraylist_configUpgradePack1);
    java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> list_affectedService4 = configUpgradePack3.services;
    java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> map_str_affectedService5 = configUpgradePack3.getServiceMap();
    org.apache.ambari.server.state.stack.ConfigUpgradePack[] configUpgradePack_array6 = new org.apache.ambari.server.state.stack.ConfigUpgradePack[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack> arraylist_configUpgradePack7 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack>)arraylist_configUpgradePack7, configUpgradePack_array6);
    org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack9 = org.apache.ambari.server.state.stack.ConfigUpgradePack.merge(arraylist_configUpgradePack7);
    java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> list_affectedService10 = configUpgradePack9.services;
    configUpgradePack3.services = list_affectedService10;
    
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
    org.junit.Assert.assertNotNull(configUpgradePack_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configUpgradePack9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_affectedService10);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test216"); }

    org.apache.ambari.server.checks.HardcodedStackVersionPropertiesCheck hardcodedStackVersionPropertiesCheck0 = new org.apache.ambari.server.checks.HardcodedStackVersionPropertiesCheck();
    org.apache.ambari.server.checks.CheckDescription checkDescription1 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck3 = new org.apache.ambari.server.state.stack.PrerequisiteCheck(checkDescription1, "upgrade_suspended");
    org.apache.ambari.server.state.Cluster cluster5 = null;
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType6 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    org.apache.ambari.server.state.stack.upgrade.Direction direction7 = null;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj8 = null;
    org.apache.ambari.server.state.UpgradeContext upgradeContext9 = new org.apache.ambari.server.state.UpgradeContext(cluster5, upgradeType6, direction7, map_str_obj8);
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest10 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType6);
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType11 = prereqCheckRequest10.getUpgradeType();
    org.apache.ambari.server.state.StackId stackId12 = null;
    prereqCheckRequest10.setSourceStackId(stackId12);
    // The following exception was thrown during execution in test generation
    try {
    hardcodedStackVersionPropertiesCheck0.perform(prerequisiteCheck3, prereqCheckRequest10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription1);
    org.junit.Assert.assertTrue("'" + upgradeType6 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType6.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    org.junit.Assert.assertTrue("'" + upgradeType11 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType11.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test217"); }

    org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.ActivateUserRequestAuditEventBuilder activateUserRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.ActivateUserRequestAuditEventBuilder activateUserRequestAuditEventBuilder2 = activateUserRequestAuditEventBuilder0.withOperation("UpgradeChecks/upgrade_pack");
    org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.ActivateUserRequestAuditEventBuilder activateUserRequestAuditEventBuilder4 = activateUserRequestAuditEventBuilder2.withOperation("Theme");
    org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.ActivateUserRequestAuditEventBuilder activateUserRequestAuditEventBuilder6 = activateUserRequestAuditEventBuilder4.withActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(activateUserRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(activateUserRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(activateUserRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(activateUserRequestAuditEventBuilder6);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test218"); }

    org.apache.ambari.server.api.services.FeedService feedService0 = new org.apache.ambari.server.api.services.FeedService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = feedService0.updateFeed("queues", httpHeaders2, uriInfo3, "CompatibleRepositoryVersions/repository_version");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test219"); }

    org.apache.ambari.server.state.quicklinks.QuickLinks quickLinks0 = new org.apache.ambari.server.state.quicklinks.QuickLinks();
    java.lang.String str1 = quickLinks0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test220"); }

    org.apache.ambari.server.state.alert.Reporting.ReportTemplate reportTemplate0 = new org.apache.ambari.server.state.alert.Reporting.ReportTemplate();
    org.apache.ambari.server.controller.ExtensionLinkRequest extensionLinkRequest6 = new org.apache.ambari.server.controller.ExtensionLinkRequest("HostRoles/state", "configure-task-transfers", "HostRoles/stale_configs", "ConfigGroup/desired_configs", "##");
    extensionLinkRequest6.setStackName("RootServiceComponents/service_name");
    boolean b9 = reportTemplate0.equals((java.lang.Object)extensionLinkRequest6);
    reportTemplate0.setValue((java.lang.Double)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test221"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.ambari.server.controller.HostRequest hostRequest3 = new org.apache.ambari.server.controller.HostRequest("Theme", "", map_str_str2);
    java.lang.String str4 = hostRequest3.getRackInfo();
    hostRequest3.setRackInfo("HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test222"); }

    org.apache.ambari.server.state.AgentVersion agentVersion1 = new org.apache.ambari.server.state.AgentVersion("kerberos_descriptor");
    java.lang.String str2 = agentVersion1.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "kerberos_descriptor"+ "'", str2.equals("kerberos_descriptor"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test223"); }

    org.apache.ambari.server.state.alert.AlertUri alertUri0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.alert.AlertUri.HighAvailability highAvailability1 = alertUri0.new HighAvailability();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test224"); }

    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse7 = new org.apache.ambari.server.controller.RepositoryResponse("Actions/target_service", "1.3.6.1.4.1.18060.16", "PermissionInfo/permission_name", "Versions/valid", "StackConfigurations/property_name", "QuickLinkInfo/default", "RUNNING");
    java.lang.String str8 = repositoryResponse7.getDefaultBaseUrl();
    repositoryResponse7.setBaseUrl("configure-task-config-type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "QuickLinkInfo/default"+ "'", str8.equals("QuickLinkInfo/default"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test225"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.AbstractUpgradeCatalog.PROPERTY_RANGER_KNOX_PLUGIN_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ranger-knox-plugin-enabled"+ "'", str0.equals("ranger-knox-plugin-enabled"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test226"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestResourceProvider.REQUEST_SOURCE_SCHEDULE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Requests/request_schedule"+ "'", str0.equals("Requests/request_schedule"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test227"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_RCA_DRIVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test228"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,byte[]> singularattribute_hostRoleCommandEntity_byte_array0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.stdOut;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_byte_array0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test229"); }

    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest7 = new org.apache.ambari.server.controller.ServiceConfigVersionRequest("Hosts/os_type", "widgets.json", (java.lang.Long)0L, (java.lang.Long)5000L, (java.lang.Long)100L, "ranger-hbase-plugin-enabled", (java.lang.Boolean)false);
    serviceConfigVersionRequest7.setVersion((java.lang.Long)10L);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test230"); }

    org.apache.ambari.server.state.QuickLinksConfigurationInfo quickLinksConfigurationInfo0 = new org.apache.ambari.server.state.QuickLinksConfigurationInfo();
    java.lang.String str1 = quickLinksConfigurationInfo0.toString();
    quickLinksConfigurationInfo0.setDeleted((java.lang.Boolean)false);
    java.util.Map<java.lang.String,org.apache.ambari.server.state.quicklinks.QuickLinks> map_str_quickLinks4 = null;
    quickLinksConfigurationInfo0.setQuickLinksConfigurationMap(map_str_quickLinks4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"+ "'", str1.equals("QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test231"); }

    org.apache.ambari.server.api.resources.ConfigGroupResourceDefinition configGroupResourceDefinition0 = new org.apache.ambari.server.api.resources.ConfigGroupResourceDefinition();
    java.util.List<org.apache.ambari.server.api.resources.ResourceDefinition.PostProcessor> list_postProcessor1 = configGroupResourceDefinition0.getPostProcessors();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_postProcessor1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test232"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_HOST_HEALTH_REPORT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/host_health_report"+ "'", str0.equals("Hosts/host_health_report"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test233"); }

    org.apache.ambari.server.controller.StackServiceComponentRequest stackServiceComponentRequest5 = new org.apache.ambari.server.controller.StackServiceComponentRequest("12", "FALCON_SERVICE_CHECK", "WidgetLayoutInfo/widgets", "AlertNotice/service_name", "AMBARI.MANAGE_USERS");
    stackServiceComponentRequest5.setRecoveryEnabled("force_toggle_kerberos");

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test234"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = kerberosComponentDescriptor6.toMap();
    org.apache.ambari.server.state.SecurityType securityType8 = null;
    org.apache.ambari.server.topology.SecurityConfiguration securityConfiguration9 = new org.apache.ambari.server.topology.SecurityConfiguration(securityType8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.ProvisionClusterRequest provisionClusterRequest10 = new org.apache.ambari.server.controller.internal.ProvisionClusterRequest(map_str_obj7, securityConfiguration9);
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
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj7);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test235"); }

    org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str1 = agentEnv0.getTransparentHugePage();
    java.lang.String[] str_array2 = agentEnv0.getExistingRepos();
    agentEnv0.setFirewallName("RootServiceHostComponents/properties");
    agentEnv0.setFirewallRunning((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test236"); }

    org.apache.ambari.server.state.services.AlertNoticeDispatchService alertNoticeDispatchService0 = new org.apache.ambari.server.state.services.AlertNoticeDispatchService();
    com.google.common.util.concurrent.Service service1 = alertNoticeDispatchService0.stopAsync();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(service1);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test237"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.orm.dao.GroupDAO groupDAO4 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO5 = null;
    org.apache.ambari.server.security.authorization.Users users6 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.controller.internal.UserPrivilegeResourceProvider.init(userDAO0, clusterDAO3, groupDAO4, viewInstanceDAO5, users6);
    org.apache.ambari.server.security.authorization.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
    users6.removeUser(user8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test238"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.entities.UserEntity userEntity3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.UserEntity userEntity4 = userDAO0.merge(userEntity3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test239"); }

    org.apache.ambari.server.controller.ivory.IvoryService ivoryService0 = null;
    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse recommendationResponse1 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse();
    java.lang.String[] str_array59 = new java.lang.String[] { "security", "alerts.json", "Artifacts/artifact_name", "widgets.json", "ambari.dispatch.snmp.oids.body", "", "type", "alerts.json", "RootServiceComponents/ciphers", "notification.dispatch.alert.script", "AuthorizationInfo/cluster_name", "Users/user_type", "stack_name", "Alert/component_name", "ViewUrlInfo/view_instance_version", "max_duration_for_retries", "javax.net.ssl.trustStore", "AlertGroup/name", "configure-task-key-value-pairs", "RootService/service_name", "StackConfigurations/property_value_attributes", "ambari_db_rca_password", "hi!", "Stage/status", "127.0.0.1", "UpgradeChecks/repository_version", "queues", "UpgradeChecks/repository_version", "ERROR", "desired_version", "_SERVICE_CHECK", "Event/summary/memberships/removed", "AlertTarget/name", "PrivilegeInfo/principal_type", "manage_identities", "ambari-server", "Event/summary/memberships/removed", "Stage/host_params", "max_duration_for_retries", "queues", "cluster-env", "UpgradeChecks/id", "StackConfigurations/property_name", "stack_name", "METRICS_COLLECTOR", "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", "operation_level/service_name", "alerts.json", "stack_name", "ViewVersionInfo/archive", "StackLevelConfigurations/property_value_attributes", "kerberos_descriptor", "Repositories/repository_version_id", "ambari_db_rca_password", "notification.dispatch.alert.script", "ERROR", "AlertNotice/target_id" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str60 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str60, str_array59);
    java.util.Set<java.lang.String> set_str62 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories((java.util.Set<java.lang.String>)linkedhashset_str60);
    recommendationResponse1.setHosts((java.util.Set<java.lang.String>)linkedhashset_str60);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController64 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider65 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController64);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str66 = ldapSyncEventResourceProvider65.getKeyPropertyIds();
    org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.keyPropertyIds = map_type_str66;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.keyPropertyIds = map_type_str66;
    org.apache.ambari.server.controller.internal.FeedResourceProvider feedResourceProvider69 = new org.apache.ambari.server.controller.internal.FeedResourceProvider(ivoryService0, (java.util.Set<java.lang.String>)linkedhashset_str60, map_type_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str66);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test240"); }

    org.apache.ambari.server.orm.dao.BlueprintDAO blueprintDAO0 = new org.apache.ambari.server.orm.dao.BlueprintDAO();
    org.apache.ambari.server.orm.entities.BlueprintEntity blueprintEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.BlueprintEntity blueprintEntity2 = blueprintDAO0.merge(blueprintEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test241"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)300000L, "Event/status_detail", "Upgrade/abort_reason", "UpgradeItem/request_id", "Event/summary/memberships/created", batch5, schedule6, "Hosts/host_name", "configure-task-config-type", "host_groups", "AMBARI_METRICS", (java.lang.Integer)30000);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test242"); }

    org.apache.ambari.server.state.theme.ConfigPlacement configPlacement0 = new org.apache.ambari.server.state.theme.ConfigPlacement();
    java.lang.String str1 = configPlacement0.getSubsectionName();
    configPlacement0.setSubsectionTabName("Repositories/version_definition_id");
    java.util.List<org.apache.ambari.server.state.theme.ConfigCondition> list_configCondition4 = configPlacement0.getDependsOn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_configCondition4);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test243"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException2 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("Event/summary/memberships/removed.FILTER(service_type) AND (null) AND Credential/key.FILTER(Credential/key) AND Credential/key.FILTER(Credential/key)");
    org.apache.ambari.server.view.ViewExtractor.ExtractionException extractionException3 = new org.apache.ambari.server.view.ViewExtractor.ExtractionException("StackConfigurations/type", (java.lang.Throwable)kerberosPrincipalAlreadyExistsException2);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test244"); }

    org.apache.ambari.server.agent.StatusCommand.StatusCommandPayload statusCommandPayload0 = org.apache.ambari.server.agent.StatusCommand.StatusCommandPayload.MINIMAL;
    org.junit.Assert.assertTrue("'" + statusCommandPayload0 + "' != '" + org.apache.ambari.server.agent.StatusCommand.StatusCommandPayload.MINIMAL + "'", statusCommandPayload0.equals(org.apache.ambari.server.agent.StatusCommand.StatusCommandPayload.MINIMAL));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test245"); }

    org.apache.ambari.server.controller.OperatingSystemResponse operatingSystemResponse1 = new org.apache.ambari.server.controller.OperatingSystemResponse("widgets.json");

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test246"); }

    org.apache.ambari.server.controller.OperatingSystemResponse operatingSystemResponse1 = new org.apache.ambari.server.controller.OperatingSystemResponse("AlertGroup");
    boolean b2 = operatingSystemResponse1.isAmbariManagedRepos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test247"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_NAMENODE_TRUNCATE;
    org.apache.ambari.server.checks.CheckDescription.HEALTH = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test248"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PermissionResourceProvider.SORT_ORDER_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PermissionInfo/sort_order"+ "'", str0.equals("PermissionInfo/sort_order"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test249"); }

    org.apache.ambari.server.ParentObjectNotFoundException parentObjectNotFoundException1 = new org.apache.ambari.server.ParentObjectNotFoundException("ambari.dispatch.snmp.oids.body");
    java.lang.Throwable[] throwable_array2 = parentObjectNotFoundException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array2);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test250"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.Cluster cluster10 = clustersImpl4.getClusterById((long)10);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.ClusterNotFoundException");
    } catch (org.apache.ambari.server.ClusterNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test251"); }

    org.apache.ambari.server.serveraction.kerberos.DestroyPrincipalsServerAction destroyPrincipalsServerAction0 = new org.apache.ambari.server.serveraction.kerberos.DestroyPrincipalsServerAction();

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test252"); }

    org.apache.ambari.server.checks.HostsMasterMaintenanceCheck hostsMasterMaintenanceCheck0 = new org.apache.ambari.server.checks.HostsMasterMaintenanceCheck();
    org.apache.ambari.server.checks.HostsRepositoryVersionCheck hostsRepositoryVersionCheck1 = new org.apache.ambari.server.checks.HostsRepositoryVersionCheck();
    org.apache.ambari.server.state.Cluster cluster3 = null;
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType4 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    org.apache.ambari.server.state.stack.upgrade.Direction direction5 = null;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj6 = null;
    org.apache.ambari.server.state.UpgradeContext upgradeContext7 = new org.apache.ambari.server.state.UpgradeContext(cluster3, upgradeType4, direction5, map_str_obj6);
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest8 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType4);
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType9 = prereqCheckRequest8.getUpgradeType();
    boolean b10 = hostsRepositoryVersionCheck1.isApplicable(prereqCheckRequest8);
    prereqCheckRequest8.setRepositoryVersion("recovery_type");
    boolean b13 = hostsMasterMaintenanceCheck0.isApplicable(prereqCheckRequest8);
    org.junit.Assert.assertTrue("'" + upgradeType4 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType4.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    org.junit.Assert.assertTrue("'" + upgradeType9 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType9.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test253"); }

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
    java.lang.String str17 = stackConfigurationResponse12.getStackName();
    java.lang.Boolean b18 = stackConfigurationResponse12.isRequired();
    stackConfigurationResponse12.setPropertyName("SAMEORIGIN");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_propertyType15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR"+ "'", str16.equals("ERROR"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b18 + "' != '" + true+ "'", b18.equals(true));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test254"); }

    org.apache.ambari.server.orm.dao.RoleSuccessCriteriaDAO roleSuccessCriteriaDAO0 = new org.apache.ambari.server.orm.dao.RoleSuccessCriteriaDAO();
    org.apache.ambari.server.orm.entities.RoleSuccessCriteriaEntity roleSuccessCriteriaEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.RoleSuccessCriteriaEntity roleSuccessCriteriaEntity2 = roleSuccessCriteriaDAO0.merge(roleSuccessCriteriaEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test255"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler1 = null;
    serviceCheckGrouping0.parallelScheduler = parallelScheduler1;
    serviceCheckGrouping0.name = "notification.dispatch.alert.script";
    serviceCheckGrouping0.allowRetry = false;
    serviceCheckGrouping0.addAfterGroup = "HostRoles/host_name";
    org.apache.ambari.server.state.stack.upgrade.Condition condition9 = serviceCheckGrouping0.condition;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(condition9);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test256"); }

    org.apache.ambari.server.api.services.ExtensionLinksService extensionLinksService0 = new org.apache.ambari.server.api.services.ExtensionLinksService();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = extensionLinksService0.deleteExtensionLink(httpHeaders1, uriInfo2, "validate_config");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test257"); }

    org.apache.ambari.server.state.ServiceOsSpecific serviceOsSpecific0 = new org.apache.ambari.server.state.ServiceOsSpecific();
    org.apache.ambari.server.Role role1 = org.apache.ambari.server.Role.HUE_SERVER;
    boolean b2 = serviceOsSpecific0.equals((java.lang.Object)role1);
    org.apache.ambari.server.state.ServiceOsSpecific.Package[] package_array3 = new org.apache.ambari.server.state.ServiceOsSpecific.Package[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.ServiceOsSpecific.Package> arraylist_package4 = new java.util.ArrayList<org.apache.ambari.server.state.ServiceOsSpecific.Package>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.ServiceOsSpecific.Package>)arraylist_package4, package_array3);
    serviceOsSpecific0.addPackages((java.util.List<org.apache.ambari.server.state.ServiceOsSpecific.Package>)arraylist_package4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(package_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test258"); }

    org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.DEFAULT;
    org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.DEFAULT + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.DEFAULT));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test259"); }

    org.apache.ambari.server.utils.ShellCommandUtil.Result result2 = org.apache.ambari.server.utils.ShellCommandUtil.setFileGroup("rootServices", "jdk_location");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(result2);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test260"); }

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
    org.apache.ambari.server.configuration.Configuration configuration11 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str12 = configuration11.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file13 = configuration11.getRecommendationsDir();
    java.lang.String str14 = configuration11.getHostsMapFile();
    java.lang.Integer i15 = configuration11.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties16 = configuration11.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor17 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = kerberosComponentDescriptor17.toMap();
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor19 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor(map_str_obj18);
    kerberosComponentDescriptor9.setParent((org.apache.ambari.server.state.kerberos.AbstractKerberosDescriptor)kerberosIdentityDescriptor19);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "nosniff"+ "'", str12.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 30000+ "'", i15.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj18);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test261"); }

    org.apache.ambari.server.api.resources.OperatingSystemResourceDefinition operatingSystemResourceDefinition0 = new org.apache.ambari.server.api.resources.OperatingSystemResourceDefinition();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition1 = operatingSystemResourceDefinition0.getSubResourceDefinitions();
    org.apache.ambari.server.api.resources.ViewInstanceResourceDefinition viewInstanceResourceDefinition2 = new org.apache.ambari.server.api.resources.ViewInstanceResourceDefinition(set_subResourceDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition1);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test262"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyRequest stackConfigurationDependencyRequest5 = new org.apache.ambari.server.controller.StackConfigurationDependencyRequest("HostRoles/cluster_name", "validate_config", "CompatibleRepositoryVersions/stack_name", "include_ambari_identity", "AlertTarget/enabled");
    stackConfigurationDependencyRequest5.setDependencyName("");

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test263"); }

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
    java.lang.String str31 = taskWrapper30.getService();
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
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "widgets.json"+ "'", str31.equals("widgets.json"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test264"); }

    org.apache.ambari.server.stack.MasterHostResolver.Service service0 = org.apache.ambari.server.stack.MasterHostResolver.Service.HBASE;
    org.junit.Assert.assertTrue("'" + service0 + "' != '" + org.apache.ambari.server.stack.MasterHostResolver.Service.HBASE + "'", service0.equals(org.apache.ambari.server.stack.MasterHostResolver.Service.HBASE));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test265"); }

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
    org.apache.ambari.server.state.State state14 = org.apache.ambari.server.state.State.STOPPING;
    org.apache.ambari.server.state.State state15 = org.apache.ambari.server.state.State.UNINSTALLED;
    boolean b16 = org.apache.ambari.server.state.State.isValidStateTransition(state14, state15);
    boolean b17 = clusterResponse13.equals((java.lang.Object)state15);
    java.util.Map<java.lang.String,java.lang.String> map_str_str18 = clusterResponse13.getCredentialStoreServiceProperties();
    java.lang.String str19 = clusterResponse13.getSecurityType();
    org.junit.Assert.assertTrue("'" + state2 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state2.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    org.junit.Assert.assertTrue("'" + state14 + "' != '" + org.apache.ambari.server.state.State.STOPPING + "'", state14.equals(org.apache.ambari.server.state.State.STOPPING));
    org.junit.Assert.assertTrue("'" + state15 + "' != '" + org.apache.ambari.server.state.State.UNINSTALLED + "'", state15.equals(org.apache.ambari.server.state.State.UNINSTALLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "NONE"+ "'", str19.equals("NONE"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test266"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserAuthorizationResourceProvider.AUTHORIZATION_VIEW_INSTANCE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AuthorizationInfo/view_instance_name"+ "'", str0.equals("AuthorizationInfo/view_instance_name"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test267"); }

    org.apache.ambari.server.orm.entities.ServiceDesiredStateEntityPK serviceDesiredStateEntityPK0 = new org.apache.ambari.server.orm.entities.ServiceDesiredStateEntityPK();
    serviceDesiredStateEntityPK0.setServiceName("StackLevelConfigurations/property_depends_on");
    java.lang.String str3 = serviceDesiredStateEntityPK0.getServiceName();
    org.apache.ambari.server.controller.spi.Resource.Type type4 = null;
    org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type5 = org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete;
    org.apache.ambari.server.controller.spi.Request request6 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate7 = null;
    org.apache.ambari.server.controller.internal.ResourceProviderEvent resourceProviderEvent8 = new org.apache.ambari.server.controller.internal.ResourceProviderEvent(type4, type5, request6, predicate7);
    org.apache.ambari.server.controller.spi.Resource.Type type9 = resourceProviderEvent8.getResourceType();
    org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type10 = resourceProviderEvent8.getType();
    boolean b11 = serviceDesiredStateEntityPK0.equals((java.lang.Object)type10);
    java.lang.Long long12 = serviceDesiredStateEntityPK0.getClusterId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StackLevelConfigurations/property_depends_on"+ "'", str3.equals("StackLevelConfigurations/property_depends_on"));
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type5.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type10.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long12);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test268"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.orm.dao.GroupDAO groupDAO4 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO5 = null;
    org.apache.ambari.server.security.authorization.Users users6 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.controller.internal.UserPrivilegeResourceProvider.init(userDAO0, clusterDAO3, groupDAO4, viewInstanceDAO5, users6);
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity8 = null;
    // The following exception was thrown during execution in test generation
    try {
    groupDAO4.remove(groupEntity8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test269"); }

    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED;
    boolean b1 = hostRoleStatus0.isFailedState();
    org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test270"); }

    org.apache.ambari.server.api.query.render.AlertSummaryGroupedRenderer alertSummaryGroupedRenderer0 = new org.apache.ambari.server.api.query.render.AlertSummaryGroupedRenderer();
    org.apache.ambari.server.api.util.TreeNode<org.apache.ambari.server.api.query.QueryInfo> treenode_queryInfo1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.util.TreeNode<java.util.Set<java.lang.String>> treenode_set_str3 = alertSummaryGroupedRenderer0.finalizeProperties(treenode_queryInfo1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test271"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserResourceProvider.USER_ACTIVE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Users/active"+ "'", str0.equals("Users/active"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test272"); }

    org.apache.ambari.server.state.alert.AlertUri alertUri0 = new org.apache.ambari.server.state.alert.AlertUri();
    java.lang.String str1 = alertUri0.getHttpsProperty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test273"); }

    org.apache.ambari.server.orm.dao.TopologyHostGroupDAO topologyHostGroupDAO0 = new org.apache.ambari.server.orm.dao.TopologyHostGroupDAO();
    org.apache.ambari.server.orm.entities.TopologyHostGroupEntity topologyHostGroupEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    topologyHostGroupDAO0.remove(topologyHostGroupEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test274"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck2 = new org.apache.ambari.server.state.stack.PrerequisiteCheck(checkDescription0, "upgrade_suspended");
    java.lang.String[] str_array21 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent24 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str22);
    org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str22;
    prerequisiteCheck2.setFailedOn(linkedhashset_str22);
    java.lang.String str27 = prerequisiteCheck2.getClusterName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "upgrade_suspended"+ "'", str27.equals("upgrade_suspended"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test275"); }

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
    users6.modifyPassword("Alert/cluster_name", "sqlserver", "service");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test276"); }

    org.apache.ambari.server.controller.spi.NoSuchResourceException noSuchResourceException1 = new org.apache.ambari.server.controller.spi.NoSuchResourceException("ServiceInfo/service_name");

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test277"); }

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
    java.util.Map<java.lang.String,java.util.Collection<org.apache.ambari.server.controller.ServiceConfigVersionResponse>> map_str_collection_serviceConfigVersionResponse14 = clusterResponse13.getDesiredServiceConfigVersions();
    java.lang.Integer i15 = clusterResponse13.getTotalHosts();
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
    org.junit.Assert.assertNull(map_str_collection_serviceConfigVersionResponse14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test278"); }

    org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService1 = new org.apache.ambari.server.api.services.RoleAuthorizationService("Clusters/desired_configs");
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = roleAuthorizationService1.getAuthorization(httpHeaders2, uriInfo3, "PermissionInfo/permission_id");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test279"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.PROPERTIES_ATTRIBUTES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "properties_attributes"+ "'", str0.equals("properties_attributes"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test280"); }

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
    org.apache.ambari.server.controller.internal.TemporalInfoImpl temporalInfoImpl39 = new org.apache.ambari.server.controller.internal.TemporalInfoImpl((long)' ', (long)(short)100, (long)(byte)100);
    org.apache.ambari.server.configuration.Configuration configuration40 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str41 = configuration40.getViewsPragmaHTTPResponseHeader();
    boolean b42 = configuration40.validateAgentHostnames();
    boolean b43 = temporalInfoImpl39.equals((java.lang.Object)configuration40);
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey timelineAppMetricCacheKey44 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey((java.util.Set<java.lang.String>)linkedhashset_str19, "keytab_file_is_cachable", "service_component_filter", (org.apache.ambari.server.controller.spi.TemporalInfo)temporalInfoImpl39);
    java.lang.String[] str_array63 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str64 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str64, str_array63);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent66 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str64);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str64;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController68 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider69 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController68);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str70 = ldapSyncEventResourceProvider69.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController71 = null;
    com.google.inject.Injector injector72 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider73 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str64, map_type_str70, ambariManagementController71, injector72);
    org.apache.ambari.server.api.resources.JobResourceDefinition jobResourceDefinition74 = new org.apache.ambari.server.api.resources.JobResourceDefinition();
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer76 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule77 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl78 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule77);
    metricsPaddingRenderer76.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl78);
    org.apache.ambari.server.api.query.QueryImpl queryImpl80 = new org.apache.ambari.server.api.query.QueryImpl(map_type_str70, (org.apache.ambari.server.api.resources.ResourceDefinition)jobResourceDefinition74, (org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl78);
    boolean b81 = temporalInfoImpl39.equals((java.lang.Object)map_type_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "no-cache"+ "'", str41.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test281"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup configGroup0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup();
    java.util.Map<java.lang.String,org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintConfigurations> map_str_blueprintConfigurations1 = configGroup0.getConfigurations();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_blueprintConfigurations1);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test282"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentProcessResourceProvider.HC_PROCESS_CLUSTER_NAME_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostComponentProcess/cluster_name"+ "'", str0.equals("HostComponentProcess/cluster_name"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test283"); }

    java.lang.String str0 = org.apache.ambari.server.topology.TopologyManager.INITIAL_CONFIG_TAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "INITIAL"+ "'", str0.equals("INITIAL"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test284"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider6 = new org.apache.ambari.server.controller.internal.URLStreamProvider(1200, (-1), "ambari.dispatch.snmp.security.priv.passphrase", "OperatingSystems/version_definition_id", "timeline.metrics.cluster.aggregator.minute.ttl");
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration7 = null;
    org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider viewInstanceResourceProvider8 = new org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization9 = viewInstanceResourceProvider8.getRequiredCreateAuthorizations();
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule10 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    viewInstanceResourceProvider8.addObserver((org.apache.ambari.server.controller.internal.ResourceProviderObserver)defaultProviderModule10);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.ganglia.GangliaComponentPropertyProvider gangliaComponentPropertyProvider14 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaComponentPropertyProvider(map_str_map_str_propertyInfo0, uRLStreamProvider6, componentSSLConfiguration7, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule10, "HostComponentProcess/host_name", "operation_level/service_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization9);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test285"); }

    org.apache.ambari.server.state.StackId stackId1 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str6 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse7 = new org.apache.ambari.server.controller.ConfigurationResponse("service", stackId1, "hi!", "ServiceInfo/credential_store_supported", (java.lang.Long)(-1L), map_str_str5, map_str_map_str_str6);
    java.lang.String str8 = configurationResponse7.getClusterName();
    java.util.Map<java.lang.String,java.lang.String> map_str_str9 = configurationResponse7.getConfigs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "service"+ "'", str8.equals("service"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str9);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test286"); }

    java.util.Collection<java.util.Map<java.lang.String,java.lang.Object>> collection_map_str_obj0 = null;
    org.apache.ambari.server.topology.Setting setting1 = org.apache.ambari.server.topology.SettingFactory.getSetting(collection_map_str_obj0);
    java.util.Map<java.lang.String,java.util.Set<java.util.HashMap<java.lang.String,java.lang.String>>> map_str_set_hashmap_str_str2 = setting1.getProperties();
    java.util.Set<java.util.HashMap<java.lang.String,java.lang.String>> set_hashmap_str_str4 = setting1.getSettingValue("Clusters/desired_configs");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(setting1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_set_hashmap_str_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_hashmap_str_str4);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test287"); }

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
    java.util.Set<org.apache.ambari.server.state.Cluster> set_cluster30 = org.apache.ambari.server.utils.RetryHelper.getAffectedClusters();
    org.apache.ambari.server.events.HostsRemovedEvent hostsRemovedEvent31 = new org.apache.ambari.server.events.HostsRemovedEvent((java.util.Set<java.lang.String>)linkedhashset_str19, set_cluster30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_cluster30);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test288"); }

    org.apache.ambari.server.state.AgentVersion agentVersion3 = new org.apache.ambari.server.state.AgentVersion("kerberos_descriptor");
    org.apache.ambari.server.agent.HostInfo hostInfo5 = null;
    org.apache.ambari.server.agent.AgentEnv agentEnv6 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str7 = agentEnv6.getTransparentHugePage();
    org.apache.ambari.server.state.host.HostRegistrationRequestEvent hostRegistrationRequestEvent8 = new org.apache.ambari.server.state.host.HostRegistrationRequestEvent("ACTION_NAME", "600", agentVersion3, (long)(byte)1, hostInfo5, agentEnv6);
    java.lang.Integer i9 = agentEnv6.getUmask();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test289"); }

    org.apache.ambari.server.state.ExtensionId extensionId0 = new org.apache.ambari.server.state.ExtensionId();
    java.lang.String str1 = extensionId0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test290"); }

    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl1 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule0);
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl2 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule0);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test291"); }

    org.apache.ambari.server.state.QuickLinksConfigurationInfo quickLinksConfigurationInfo0 = new org.apache.ambari.server.state.QuickLinksConfigurationInfo();
    java.lang.String str1 = quickLinksConfigurationInfo0.toString();
    java.lang.String str2 = quickLinksConfigurationInfo0.getFileName();
    java.lang.String str3 = quickLinksConfigurationInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"+ "'", str1.equals("QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"+ "'", str3.equals("QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test292"); }

    org.apache.ambari.server.state.alert.AlertUri alertUri0 = new org.apache.ambari.server.state.alert.AlertUri();
    java.lang.String str1 = alertUri0.getHttpUri();
    java.lang.String str2 = alertUri0.getKerberosKeytab();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test293"); }

    org.apache.ambari.server.upgrade.StackUpgradeHelper stackUpgradeHelper0 = new org.apache.ambari.server.upgrade.StackUpgradeHelper();

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test294"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.controller.ivory.Feed feed15 = new org.apache.ambari.server.controller.ivory.Feed("AlertTarget/notification_type", "Stage/command_params", "Alert/host_name", "extensions", "desired_version", "TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", "ERROR", "ViewInstanceInfo/cluster_handle", "", "AlertTarget/notification_type", "Theme", "Stage/host_params", "AlertHistory/id", "Versions/stack-errors", map_str_str14);
    java.lang.String str16 = feed15.getTargetClusterAction();
    java.lang.String str17 = feed15.getTargetClusterEnd();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Versions/stack-errors"+ "'", str16.equals("Versions/stack-errors"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Stage/host_params"+ "'", str17.equals("Stage/host_params"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test295"); }

    org.apache.ambari.server.controller.ivory.Instance instance7 = new org.apache.ambari.server.controller.ivory.Instance("jdbc:derby:memory:myDB/ambari;create=true", "upgrade_suspended", "Actions/target_service", "", "AlertHistory/label", "AuthorizationInfo/cluster_name", "RootService/service_name");
    org.apache.ambari.server.api.predicate.Token.TYPE tYPE8 = org.apache.ambari.server.api.predicate.Token.TYPE.BRACKET_OPEN;
    boolean b9 = instance7.equals((java.lang.Object)tYPE8);
    org.junit.Assert.assertTrue("'" + tYPE8 + "' != '" + org.apache.ambari.server.api.predicate.Token.TYPE.BRACKET_OPEN + "'", tYPE8.equals(org.apache.ambari.server.api.predicate.Token.TYPE.BRACKET_OPEN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test296"); }

    org.apache.ambari.server.upgrade.UpgradeCatalog[] upgradeCatalog_array0 = new org.apache.ambari.server.upgrade.UpgradeCatalog[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog> linkedhashset_upgradeCatalog1 = new java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog1, upgradeCatalog_array0);
    com.google.inject.persist.PersistService persistService3 = null;
    org.apache.ambari.server.orm.DBAccessor dBAccessor4 = null;
    org.apache.ambari.server.configuration.Configuration configuration5 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str6 = configuration5.getViewsPragmaHTTPResponseHeader();
    boolean b7 = configuration5.validateAgentHostnames();
    java.lang.String str8 = configuration5.getRecommendationsArtifactsLifetime();
    org.apache.ambari.server.upgrade.SchemaUpgradeHelper schemaUpgradeHelper9 = new org.apache.ambari.server.upgrade.SchemaUpgradeHelper((java.util.Set<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog1, persistService3, dBAccessor4, configuration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(upgradeCatalog_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "no-cache"+ "'", str6.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1w"+ "'", str8.equals("1w"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test297"); }

    org.apache.ambari.server.orm.entities.HostEntity hostEntity0 = null;
    com.google.gson.Gson gson1 = org.apache.ambari.server.utils.StageUtils.getGson();
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.orm.dao.HostStateDAO hostStateDAO3 = new org.apache.ambari.server.orm.dao.HostStateDAO();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.host.HostImpl hostImpl4 = new org.apache.ambari.server.state.host.HostImpl(hostEntity0, gson1, hostDAO2, hostStateDAO3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gson1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test298"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str3 = valueAttributesInfo0.getIncrementStep();
    valueAttributesInfo0.setDelete("operation");
    java.lang.String str6 = valueAttributesInfo0.getPropertyFileName();
    java.lang.Boolean b7 = valueAttributesInfo0.getEntriesEditable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b7);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test299"); }

    org.apache.ambari.server.api.services.RequestBody requestBody0 = new org.apache.ambari.server.api.services.RequestBody();
    java.util.Set<java.util.Map<java.lang.String,java.lang.Object>> set_map_str_obj1 = requestBody0.getPropertySets();
    org.apache.ambari.server.controller.internal.ScaleClusterRequest scaleClusterRequest2 = new org.apache.ambari.server.controller.internal.ScaleClusterRequest(set_map_str_obj1);
    java.lang.Long long3 = scaleClusterRequest2.getClusterId();
    java.util.Map<java.lang.String,org.apache.ambari.server.topology.HostGroupInfo> map_str_hostGroupInfo4 = scaleClusterRequest2.getHostGroupInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_hostGroupInfo4);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test300"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_RM_HA;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_MAINTENANCE_MODE = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test301"); }

    org.apache.ambari.server.api.resources.AlertHistoryResourceDefinition alertHistoryResourceDefinition0 = new org.apache.ambari.server.api.resources.AlertHistoryResourceDefinition();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition1 = alertHistoryResourceDefinition0.getSubResourceDefinitions();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.query.render.Renderer renderer3 = alertHistoryResourceDefinition0.getRenderer("ViewInstanceInfo/properties");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition1);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test302"); }

    org.apache.ambari.server.controller.utilities.state.HDFSServiceCalculatedState hDFSServiceCalculatedState0 = new org.apache.ambari.server.controller.utilities.state.HDFSServiceCalculatedState();
    org.apache.ambari.server.state.State state3 = hDFSServiceCalculatedState0.getState("Users/old_password", "stack_features");
    org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.apache.ambari.server.state.State.UNKNOWN + "'", state3.equals(org.apache.ambari.server.state.State.UNKNOWN));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test303"); }

    org.apache.ambari.server.state.ServiceInfo.Selection selection0 = org.apache.ambari.server.state.ServiceInfo.Selection.DEPRECATED;
    org.junit.Assert.assertTrue("'" + selection0 + "' != '" + org.apache.ambari.server.state.ServiceInfo.Selection.DEPRECATED + "'", selection0.equals(org.apache.ambari.server.state.ServiceInfo.Selection.DEPRECATED));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test304"); }

    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS0 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus1 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS0);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS2 = resultStatus1.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl3 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS2);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test305"); }

    org.apache.ambari.server.security.encryption.CredentialStoreType credentialStoreType3 = null;
    org.apache.ambari.server.topology.Credential credential4 = new org.apache.ambari.server.topology.Credential("Repositories/latest_base_url", "ViewVersionInfo/parameters", "ERROR", credentialStoreType3);
    java.lang.String str5 = credential4.getAlias();
    java.lang.String str6 = credential4.getAlias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Repositories/latest_base_url"+ "'", str5.equals("Repositories/latest_base_url"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Repositories/latest_base_url"+ "'", str6.equals("Repositories/latest_base_url"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test306"); }

    org.apache.ambari.server.state.AlertState alertState6 = null;
    org.apache.ambari.server.state.Alert alert7 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState6);
    org.apache.ambari.server.events.AlertReceivedEvent alertReceivedEvent8 = new org.apache.ambari.server.events.AlertReceivedEvent(0L, alert7);
    java.lang.String str9 = alertReceivedEvent8.toString();
    org.apache.ambari.server.state.Alert alert10 = alertReceivedEvent8.getAlert();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "AlertReceivedEvent{cluserId=0, alerts=[{cluster=null, state=null, name=Repositories/repository_version_id, service=PrivilegeInfo/privilege_id, component=forceRefreshConfigTagsBeforeExecution, host=type, instance=kerberos_descriptor, text='null'}]}"+ "'", str9.equals("AlertReceivedEvent{cluserId=0, alerts=[{cluster=null, state=null, name=Repositories/repository_version_id, service=PrivilegeInfo/privilege_id, component=forceRefreshConfigTagsBeforeExecution, host=type, instance=kerberos_descriptor, text='null'}]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(alert10);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test307"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.upgrades.FinalizeUpgradeAction.TARGET_STACK_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "target_stack"+ "'", str0.equals("target_stack"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test308"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array3 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter4 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestResourceFilter_array3);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest9 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestOperationLevel6, map_str_str7, false);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel10 = executeActionRequest9.getOperationLevel();
    executeActionRequest9.setExclusive(true);
    executeActionRequest9.setExclusive(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(requestOperationLevel10);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test309"); }

    org.apache.ambari.server.checks.ConfigurationMergeCheck configurationMergeCheck0 = new org.apache.ambari.server.checks.ConfigurationMergeCheck();
    org.apache.ambari.server.checks.CheckDescription checkDescription1 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck3 = new org.apache.ambari.server.state.stack.PrerequisiteCheck(checkDescription1, "upgrade_suspended");
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest4 = null;
    // The following exception was thrown during execution in test generation
    try {
    configurationMergeCheck0.perform(prerequisiteCheck3, prereqCheckRequest4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription1);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test310"); }

    org.apache.ambari.server.api.resources.StackDependencyResourceDefinition stackDependencyResourceDefinition0 = new org.apache.ambari.server.api.resources.StackDependencyResourceDefinition();
    java.lang.String str1 = stackDependencyResourceDefinition0.getPluralName();
    java.lang.String str2 = stackDependencyResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "dependencies"+ "'", str1.equals("dependencies"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "dependencies"+ "'", str2.equals("dependencies"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test311"); }

    org.apache.ambari.server.state.stack.ConfigUpgradePack[] configUpgradePack_array0 = new org.apache.ambari.server.state.stack.ConfigUpgradePack[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack> arraylist_configUpgradePack1 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack>)arraylist_configUpgradePack1, configUpgradePack_array0);
    org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack3 = org.apache.ambari.server.state.stack.ConfigUpgradePack.merge(arraylist_configUpgradePack1);
    java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> list_affectedService4 = configUpgradePack3.services;
    java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> list_affectedService5 = configUpgradePack3.services;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configUpgradePack_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configUpgradePack3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_affectedService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_affectedService5);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test312"); }

    org.apache.ambari.server.controller.HostsMap hostsMap1 = new org.apache.ambari.server.controller.HostsMap("components");
    hostsMap1.setupMap();
    hostsMap1.setupMap();

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test313"); }

    org.apache.ambari.server.api.resources.AlertTargetResourceDefinition alertTargetResourceDefinition0 = new org.apache.ambari.server.api.resources.AlertTargetResourceDefinition();
    java.lang.String str1 = alertTargetResourceDefinition0.getSingularName();
    java.lang.String str2 = alertTargetResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "alert_target"+ "'", str1.equals("alert_target"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "alert_target"+ "'", str2.equals("alert_target"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test314"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.keyPropertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str0);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test315"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getConnectionPoolMaximumAge();
    java.lang.Long long4 = configuration0.getMetricRequestBufferTimeCatchupInterval();
    java.lang.String str5 = configuration0.getServerVersionFilePath();
    java.lang.String str6 = configuration0.getMetricsCacheManagerHeapPercent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L+ "'", long4.equals(300000L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "15%"+ "'", str6.equals("15%"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test316"); }

    org.apache.ambari.server.audit.request.eventcreator.ConfigurationChangeEventCreator configurationChangeEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.ConfigurationChangeEventCreator();

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test317"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getParallelTopologyTaskCreationThreadPoolSize();
    org.apache.ambari.server.configuration.Configuration configuration5 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str6 = configuration5.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file7 = configuration5.getRecommendationsDir();
    org.apache.ambari.server.configuration.Configuration configuration9 = new org.apache.ambari.server.configuration.Configuration();
    int i10 = configuration9.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher11 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration9);
    java.io.File file12 = configuration9.getRecommendationsDir();
    org.apache.ambari.server.security.encryption.CredentialProvider credentialProvider13 = new org.apache.ambari.server.security.encryption.CredentialProvider("operating_systems", file7, true, file12);
    org.apache.ambari.server.configuration.Configuration configuration17 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str18 = configuration17.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file19 = configuration17.getRecommendationsDir();
    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRunner stackAdvisorRunner23 = new org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRunner();
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo24 = null;
    org.apache.ambari.server.api.services.stackadvisor.commands.ComponentLayoutRecommendationCommand componentLayoutRecommendationCommand25 = new org.apache.ambari.server.api.services.stackadvisor.commands.ComponentLayoutRecommendationCommand(file19, "Repositories/stack_name", "Hosts/last_registration_time", (int)'4', stackAdvisorRunner23, ambariMetaInfo24);
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo26 = null;
    org.apache.ambari.server.api.services.stackadvisor.commands.ComponentLayoutRecommendationCommand componentLayoutRecommendationCommand27 = new org.apache.ambari.server.api.services.stackadvisor.commands.ComponentLayoutRecommendationCommand(file12, "ViewUrlInfo/url_name", "Internal Server Error", 1200, stackAdvisorRunner23, ambariMetaInfo26);
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo28 = null;
    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorHelper stackAdvisorHelper29 = new org.apache.ambari.server.api.services.stackadvisor.StackAdvisorHelper(configuration0, stackAdvisorRunner23, ambariMetaInfo28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "nosniff"+ "'", str6.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "nosniff"+ "'", str18.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file19);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test318"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.StackServiceResourceDefinition stackServiceResourceDefinition1 = new org.apache.ambari.server.api.resources.StackServiceResourceDefinition(type0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test319"); }

    org.apache.ambari.server.agent.HostInfo hostInfo0 = new org.apache.ambari.server.agent.HostInfo();
    hostInfo0.setAgentUserId("ViewInstanceInfo/context_path");
    hostInfo0.setUpTimeDays((long)2);
    hostInfo0.setOSRelease("QuickLinkInfo/stack_version");

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test320"); }

    org.apache.ambari.server.orm.PersistenceType persistenceType0 = org.apache.ambari.server.orm.PersistenceType.IN_MEMORY;
    java.lang.String str1 = persistenceType0.getValue();
    org.junit.Assert.assertTrue("'" + persistenceType0 + "' != '" + org.apache.ambari.server.orm.PersistenceType.IN_MEMORY + "'", persistenceType0.equals(org.apache.ambari.server.orm.PersistenceType.IN_MEMORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "in-memory"+ "'", str1.equals("in-memory"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test321"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.SERVICE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/service_name"+ "'", str0.equals("StackConfigurations/service_name"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test322"); }

    org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str1 = agentEnv0.getTransparentHugePage();
    java.lang.String[] str_array2 = agentEnv0.getExistingRepos();
    org.apache.ambari.server.agent.AgentEnv.HostHealth hostHealth3 = agentEnv0.getHostHealth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostHealth3);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test323"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)(-1L), "host_group", "Clusters/cluster_name", "java_version", "yarn.scheduler.capacity.root.queues", batch5, schedule6, "Stage/status", "Credential/key", "StackConfigurations/property_name", "downgrade_from_version", (java.lang.Integer)0);
    java.lang.Integer i13 = requestScheduleResponse12.getAuthenticatedUserId();
    java.lang.Integer i14 = requestScheduleResponse12.getAuthenticatedUserId();
    requestScheduleResponse12.setDescription("cluster.permissioninfo/resource_name.rootservicecomponents/service_name");
    requestScheduleResponse12.setAuthenticatedUserId((java.lang.Integer)30000);
    java.lang.Long long19 = requestScheduleResponse12.getId();
    org.apache.ambari.server.state.scheduler.Schedule schedule20 = null;
    requestScheduleResponse12.setSchedule(schedule20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L)+ "'", long19.equals((-1L)));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test324"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertResourceProvider.ALERT_MAINTENANCE_STATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Alert/maintenance_state"+ "'", str0.equals("Alert/maintenance_state"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test325"); }

    java.util.List<java.lang.String> list_str1 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b2 = org.apache.ambari.server.utils.CustomStringUtils.containsCaseInsensitive("There is an existing {0} from {1} to {2} which has not completed. This {3} must be completed before a new upgrade or downgrade can begin.", list_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test326"); }

    org.apache.ambari.server.state.SecurityType securityType3 = null;
    java.lang.Integer[] i_array9 = new java.lang.Integer[] { 1, 0, 1, 10 };
    java.util.TreeSet<java.lang.Integer> treeset_i10 = new java.util.TreeSet<java.lang.Integer>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i10, i_array9);
    java.util.Set<java.lang.String> set_str12 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i10);
    org.apache.ambari.server.controller.ClusterRequest clusterRequest13 = new org.apache.ambari.server.controller.ClusterRequest((java.lang.Long)1L, "Versions/parent_extension_version", "ViewInstanceInfo/view_name", securityType3, "WidgetLayoutInfo/cluster_name", set_str12);
    java.lang.Long long14 = clusterRequest13.getClusterId();
    java.util.Map<java.lang.String,java.lang.String> map_str_str18 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str19 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest20 = new org.apache.ambari.server.controller.ConfigurationRequest("", "Users/user_name", "CompatibleRepositoryVersions/stack_name", map_str_str18, map_str_map_str_str19);
    java.util.Map<java.lang.String,java.lang.String> map_str_str24 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str25 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest26 = new org.apache.ambari.server.controller.ConfigurationRequest("", "Users/user_name", "CompatibleRepositoryVersions/stack_name", map_str_str24, map_str_map_str_str25);
    java.util.Map<java.lang.String,java.lang.String> map_str_str30 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str31 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest32 = new org.apache.ambari.server.controller.ConfigurationRequest("", "Users/user_name", "CompatibleRepositoryVersions/stack_name", map_str_str30, map_str_map_str_str31);
    org.apache.ambari.server.controller.ConfigurationRequest[] configurationRequest_array33 = new org.apache.ambari.server.controller.ConfigurationRequest[] { configurationRequest20, configurationRequest26, configurationRequest32 };
    java.util.ArrayList<org.apache.ambari.server.controller.ConfigurationRequest> arraylist_configurationRequest34 = new java.util.ArrayList<org.apache.ambari.server.controller.ConfigurationRequest>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ConfigurationRequest>)arraylist_configurationRequest34, configurationRequest_array33);
    clusterRequest13.setDesiredConfig((java.util.List<org.apache.ambari.server.controller.ConfigurationRequest>)arraylist_configurationRequest34);
    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest44 = new org.apache.ambari.server.controller.ServiceConfigVersionRequest("Hosts/os_type", "widgets.json", (java.lang.Long)0L, (java.lang.Long)5000L, (java.lang.Long)100L, "ranger-hbase-plugin-enabled", (java.lang.Boolean)false);
    serviceConfigVersionRequest44.setCreateTime((java.lang.Long)(-1L));
    java.lang.Long long47 = serviceConfigVersionRequest44.getVersion();
    clusterRequest13.setServiceConfigVersionRequest(serviceConfigVersionRequest44);
    clusterRequest13.setClusterId((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L+ "'", long14.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationRequest_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L+ "'", long47.equals(0L));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test327"); }

    java.lang.Short s0 = org.apache.ambari.server.customactions.ActionDefinitionManager.MIN_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + s0 + "' != '" + (short)60+ "'", s0.equals((short)60));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test328"); }

    org.apache.ambari.server.configuration.Configuration configuration2 = new org.apache.ambari.server.configuration.Configuration();
    int i3 = configuration2.getClientThreadPoolSize();
    java.lang.String str4 = configuration2.getMpacksStagingPath();
    java.io.File file5 = configuration2.getBootStrapDir();
    org.apache.ambari.server.configuration.Configuration configuration8 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str9 = configuration8.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file10 = configuration8.getRecommendationsDir();
    org.apache.ambari.server.configuration.Configuration configuration12 = new org.apache.ambari.server.configuration.Configuration();
    int i13 = configuration12.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher14 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration12);
    java.io.File file15 = configuration12.getRecommendationsDir();
    org.apache.ambari.server.security.encryption.CredentialProvider credentialProvider16 = new org.apache.ambari.server.security.encryption.CredentialProvider("operating_systems", file10, true, file15);
    org.apache.ambari.server.security.encryption.CredentialProvider credentialProvider17 = new org.apache.ambari.server.security.encryption.CredentialProvider("StackServices/stack_version", file5, false, file10);
    org.apache.ambari.server.security.encryption.FileBasedCredentialStore fileBasedCredentialStore18 = new org.apache.ambari.server.security.encryption.FileBasedCredentialStore(file10);
    org.apache.ambari.server.configuration.Configuration configuration20 = new org.apache.ambari.server.configuration.Configuration();
    int i21 = configuration20.getClientThreadPoolSize();
    java.lang.String str22 = configuration20.getMpacksStagingPath();
    java.io.File file23 = configuration20.getBootStrapDir();
    java.io.File file24 = configuration20.getRecommendationsDir();
    org.apache.ambari.server.security.encryption.CredentialProvider credentialProvider25 = new org.apache.ambari.server.security.encryption.CredentialProvider("Hosts/os_type", file10, false, file24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "nosniff"+ "'", str9.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file24);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test329"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.MAX_AMBARI_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/max_ambari_version"+ "'", str0.equals("ViewVersionInfo/max_ambari_version"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test330"); }

    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder2 = blueprintExportRequestAuditEventBuilder0.withUserName("StackConfigurations/property_value_attributes");
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder4 = blueprintExportRequestAuditEventBuilder0.withOperation("commands_to_retry");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder4);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test331"); }

    org.apache.ambari.server.controller.internal.DirectoriesTrimmingStrategy directoriesTrimmingStrategy0 = new org.apache.ambari.server.controller.internal.DirectoriesTrimmingStrategy();
    java.lang.String str2 = directoriesTrimmingStrategy0.trim("hbase.coprocessor.regionserver.classes");
    java.lang.String str4 = directoriesTrimmingStrategy0.trim("skip_failure");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hbase.coprocessor.regionserver.classes"+ "'", str2.equals("hbase.coprocessor.regionserver.classes"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "skip_failure"+ "'", str4.equals("skip_failure"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test332"); }

    org.apache.ambari.server.orm.dao.ViewDAO viewDAO0 = new org.apache.ambari.server.orm.dao.ViewDAO();
    org.apache.ambari.server.orm.entities.ViewEntity viewEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    viewDAO0.remove(viewEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test333"); }

    org.apache.ambari.server.controller.logging.LogFileType logFileType0 = org.apache.ambari.server.controller.logging.LogFileType.SERVICE;
    org.junit.Assert.assertTrue("'" + logFileType0 + "' != '" + org.apache.ambari.server.controller.logging.LogFileType.SERVICE + "'", logFileType0.equals(org.apache.ambari.server.controller.logging.LogFileType.SERVICE));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test334"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setHidden("VersionDefinition/stack_name");
    java.lang.Boolean b3 = valueAttributesInfo0.getEditableOnlyAtInstall();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b3);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test335"); }

    java.lang.String str0 = org.apache.ambari.server.state.alert.AlertDefinitionHash.NULL_MD5_HASH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "37a6259cc0c1dae299a7866489dff0bd"+ "'", str0.equals("37a6259cc0c1dae299a7866489dff0bd"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test336"); }

    org.apache.ambari.server.topology.HostGroupInfo hostGroupInfo1 = new org.apache.ambari.server.topology.HostGroupInfo("AMBARI_SECURITY_MASTER_KEY");
    hostGroupInfo1.addHostRackInfo("", "ambari_db_rca_driver");

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test337"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    java.lang.String str3 = mySqlHelper1.quoteObjectName("ambari.dispatch.snmp.community");
    java.lang.String str6 = mySqlHelper1.getDropTableColumnStatement("Credential/alias", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "`ambari.dispatch.snmp.community`"+ "'", str3.equals("`ambari.dispatch.snmp.community`"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ALTER TABLE Credential/alias DROP COLUMN "+ "'", str6.equals("ALTER TABLE Credential/alias DROP COLUMN "));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test338"); }

    org.apache.ambari.server.controller.logging.LogQueryResponse logQueryResponse0 = new org.apache.ambari.server.controller.logging.LogQueryResponse();
    java.lang.String str1 = logQueryResponse0.getResultSize();
    java.lang.String str2 = logQueryResponse0.getQueryTimeMS();
    java.lang.String str3 = logQueryResponse0.getStartIndex();
    logQueryResponse0.setResultSize("configuration");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test339"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.MPACKS_STAGING_DIR_PATH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test340"); }

    org.apache.ambari.server.audit.request.eventcreator.DefaultEventCreator defaultEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.DefaultEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type1 = defaultEventCreator0.getResourceTypes();
    java.util.Set<org.apache.ambari.server.api.services.Request.Type> set_type2 = defaultEventCreator0.getRequestTypes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_type1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type2);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test341"); }

    org.apache.ambari.server.orm.dao.GroupDAO groupDAO0 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity2 = groupDAO0.findGroupByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.entities.GroupEntity[] groupEntity_array3 = new org.apache.ambari.server.orm.entities.GroupEntity[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.orm.entities.GroupEntity> linkedhashset_groupEntity4 = new java.util.LinkedHashSet<org.apache.ambari.server.orm.entities.GroupEntity>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.GroupEntity>)linkedhashset_groupEntity4, groupEntity_array3);
    groupDAO0.remove((java.util.Set<org.apache.ambari.server.orm.entities.GroupEntity>)linkedhashset_groupEntity4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(groupEntity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(groupEntity_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test342"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    java.lang.String str1 = widgetResponse0.getAuthor();
    java.lang.String str2 = widgetResponse0.getDisplayName();
    java.lang.String str3 = widgetResponse0.getClusterName();
    widgetResponse0.setScope("HostComponentProcess/host_name");
    java.lang.String str6 = widgetResponse0.getClusterName();
    java.lang.String str7 = widgetResponse0.getWidgetName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test343"); }

    byte[] byte_array5 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)0, (byte)1 };
    byte[] byte_array10 = new byte[] { (byte)10, (byte)-1, (byte)1, (byte)100 };
    byte[] byte_array12 = new byte[] { (byte)-1 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult13 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array5, byte_array10, byte_array12);
    byte[] byte_array19 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)0, (byte)1 };
    byte[] byte_array24 = new byte[] { (byte)10, (byte)-1, (byte)1, (byte)100 };
    byte[] byte_array26 = new byte[] { (byte)-1 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult27 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array19, byte_array24, byte_array26);
    encryptionResult13.iv = byte_array24;
    byte[] byte_array34 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)0, (byte)1 };
    byte[] byte_array39 = new byte[] { (byte)10, (byte)-1, (byte)1, (byte)100 };
    byte[] byte_array41 = new byte[] { (byte)-1 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult42 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array34, byte_array39, byte_array41);
    byte[] byte_array48 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)0, (byte)1 };
    byte[] byte_array53 = new byte[] { (byte)10, (byte)-1, (byte)1, (byte)100 };
    byte[] byte_array55 = new byte[] { (byte)-1 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult56 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array48, byte_array53, byte_array55);
    byte[] byte_array61 = new byte[] { (byte)1, (byte)100, (byte)1, (byte)10 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult62 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array34, byte_array53, byte_array61);
    encryptionResult13.salt = byte_array34;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test344"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.lang.String str5 = configuration0.getStrictTransportSecurityHTTPResponseHeader();
    boolean b6 = configuration0.getApiSSLAuthentication();
    java.lang.String str7 = configuration0.getCharsetHTTPResponseHeader();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "max-age=31536000"+ "'", str5.equals("max-age=31536000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "utf-8"+ "'", str7.equals("utf-8"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test345"); }

    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor2 = null;
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor3 = null;
    org.apache.ambari.server.collections.Predicate predicate4 = null;
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor5 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor("RootServiceComponents/ciphers", "StackConfigurations/property_value_attributes", kerberosPrincipalDescriptor2, kerberosKeytabDescriptor3, predicate4);
    org.apache.ambari.server.state.CheckHelper checkHelper6 = new org.apache.ambari.server.state.CheckHelper();
    boolean b7 = kerberosIdentityDescriptor5.equals((java.lang.Object)checkHelper6);
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor8 = kerberosIdentityDescriptor5.getKeytabDescriptor();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj9 = kerberosIdentityDescriptor5.toMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(kerberosKeytabDescriptor8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj9);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test346"); }

    org.apache.ambari.server.state.MaintenanceState maintenanceState0 = org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_HOST;
    org.apache.ambari.server.state.Host host2 = null;
    org.apache.ambari.server.events.MaintenanceModeEvent maintenanceModeEvent3 = new org.apache.ambari.server.events.MaintenanceModeEvent(maintenanceState0, (long)(short)100, host2);
    org.apache.ambari.server.state.ServiceComponentHost serviceComponentHost4 = maintenanceModeEvent3.getServiceComponentHost();
    org.junit.Assert.assertTrue("'" + maintenanceState0 + "' != '" + org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_HOST + "'", maintenanceState0.equals(org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_HOST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serviceComponentHost4);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test347"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    java.lang.StringBuilder stringBuilder2 = null;
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.StringBuilder stringBuilder5 = mySqlHelper1.writeColumnRenameString(stringBuilder2, "KerberosDescriptor/cluster_name", dBColumnInfo4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test348"); }

    org.apache.ambari.server.controller.internal.Stack stack2 = null;
    org.apache.ambari.server.controller.internal.Stack stack5 = null;
    org.apache.ambari.server.topology.Component[] component_array6 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component7 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component7, component_array6);
    org.apache.ambari.server.topology.Configuration configuration9 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl11 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack5, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component7, configuration9, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.Stack stack12 = hostGroupImpl11.getStack();
    java.util.Collection<org.apache.ambari.server.topology.Component> collection_component13 = hostGroupImpl11.getComponents();
    org.apache.ambari.server.topology.Configuration configuration14 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl16 = new org.apache.ambari.server.topology.HostGroupImpl("HostRoles/stack_id", "Event/summary/memberships/created", stack2, collection_component13, configuration14, "1.3.6.1.4.1.18060.16.1.1.1.7");
    org.apache.ambari.server.controller.internal.ProvisionAction provisionAction18 = org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = hostGroupImpl16.addComponent("AMBARI.MANAGE_USERS", provisionAction18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stack12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_component13);
    org.junit.Assert.assertTrue("'" + provisionAction18 + "' != '" + org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START + "'", provisionAction18.equals(org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test349"); }

    java.lang.String str0 = org.apache.ambari.server.controller.RootServiceResponseFactory.NOT_APPLICABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "NOT_APPLICABLE"+ "'", str0.equals("NOT_APPLICABLE"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test350"); }

    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport0 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i1 = clusterHealthReport0.getUnhealthyStatusHosts();
    int i2 = clusterHealthReport0.getStaleConfigsHosts();
    int i3 = clusterHealthReport0.getAlertStatusHosts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test351"); }

    org.snmp4j.Snmp snmp0 = null;
    org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher sNMPDispatcher1 = new org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher(snmp0);
    org.apache.ambari.server.notifications.Notification notification2 = null;
    // The following exception was thrown during execution in test generation
    try {
    sNMPDispatcher1.dispatch(notification2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test352"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setSyncGroupMemberReplacePattern("AlertTarget/notification_type");
    ldapServerProperties0.setSyncGroupMemberReplacePattern("ViewInstanceInfo/view_name:type");
    ldapServerProperties0.setSyncUserMemberFilter("METRICS_COLLECTOR");

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test353"); }

    org.apache.ambari.server.controller.RootServiceResponseFactory.Services services0 = org.apache.ambari.server.controller.RootServiceResponseFactory.Services.AMBARI;
    org.junit.Assert.assertTrue("'" + services0 + "' != '" + org.apache.ambari.server.controller.RootServiceResponseFactory.Services.AMBARI + "'", services0.equals(org.apache.ambari.server.controller.RootServiceResponseFactory.Services.AMBARI));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test354"); }

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
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController38 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider39 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController38);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str40 = ldapSyncEventResourceProvider39.getKeyPropertyIds();
    queryImpl35.setKeyValueMap(map_type_str40);
    org.apache.ambari.server.api.query.ProcessingPredicateVisitor processingPredicateVisitor42 = new org.apache.ambari.server.api.query.ProcessingPredicateVisitor(queryImpl35);
    org.apache.ambari.server.api.query.ProcessingPredicateVisitor processingPredicateVisitor43 = new org.apache.ambari.server.api.query.ProcessingPredicateVisitor(queryImpl35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str40);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test355"); }

    org.apache.ambari.server.orm.dao.PermissionDAO permissionDAO0 = null;
    org.apache.ambari.server.orm.dao.ResourceTypeDAO resourceTypeDAO1 = null;
    org.apache.ambari.server.controller.internal.UserAuthorizationResourceProvider.init(permissionDAO0, resourceTypeDAO1);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test356"); }

    org.apache.ambari.server.agent.HeartBeat heartBeat0 = new org.apache.ambari.server.agent.HeartBeat();
    org.apache.ambari.server.controller.HostResponse hostResponse2 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse2.setOsType("Configuration elements must be Maps");
    hostResponse2.setOsType("StackLevelConfigurations/property_name");
    java.util.List<org.apache.ambari.server.agent.DiskInfo> list_diskInfo7 = hostResponse2.getDisksInfo();
    heartBeat0.setMounts(list_diskInfo7);
    heartBeat0.setResponseId((long)20);
    org.apache.ambari.server.agent.HostStatus hostStatus11 = new org.apache.ambari.server.agent.HostStatus();
    org.apache.ambari.server.agent.HostStatus.Status status12 = hostStatus11.getStatus();
    heartBeat0.setNodeStatus(hostStatus11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_diskInfo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status12);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test357"); }

    org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder deleteServiceRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder deleteServiceRequestAuditEventBuilder2 = deleteServiceRequestAuditEventBuilder0.withRemoteIp("");
    org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder deleteServiceRequestAuditEventBuilder4 = deleteServiceRequestAuditEventBuilder2.withOperation("UpgradeChecks/cluster_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteServiceRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteServiceRequestAuditEventBuilder4);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test358"); }

    java.lang.String[] str_array60 = new java.lang.String[] { "security", "alerts.json", "Artifacts/artifact_name", "widgets.json", "ambari.dispatch.snmp.oids.body", "", "type", "alerts.json", "RootServiceComponents/ciphers", "notification.dispatch.alert.script", "AuthorizationInfo/cluster_name", "Users/user_type", "stack_name", "Alert/component_name", "ViewUrlInfo/view_instance_version", "max_duration_for_retries", "javax.net.ssl.trustStore", "AlertGroup/name", "configure-task-key-value-pairs", "RootService/service_name", "StackConfigurations/property_value_attributes", "ambari_db_rca_password", "hi!", "Stage/status", "127.0.0.1", "UpgradeChecks/repository_version", "queues", "UpgradeChecks/repository_version", "ERROR", "desired_version", "_SERVICE_CHECK", "Event/summary/memberships/removed", "AlertTarget/name", "PrivilegeInfo/principal_type", "manage_identities", "ambari-server", "Event/summary/memberships/removed", "Stage/host_params", "max_duration_for_retries", "queues", "cluster-env", "UpgradeChecks/id", "StackConfigurations/property_name", "stack_name", "METRICS_COLLECTOR", "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", "operation_level/service_name", "alerts.json", "stack_name", "ViewVersionInfo/archive", "StackLevelConfigurations/property_value_attributes", "kerberos_descriptor", "Repositories/repository_version_id", "ambari_db_rca_password", "notification.dispatch.alert.script", "ERROR", "AlertNotice/target_id" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str61 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str61, str_array60);
    java.util.Set<java.lang.String> set_str63 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories((java.util.Set<java.lang.String>)linkedhashset_str61);
    org.apache.ambari.server.controller.ExtensionVersionResponse extensionVersionResponse64 = new org.apache.ambari.server.controller.ExtensionVersionResponse("AuthorizationInfo/resource_type", "AlertNotice/target_id", true, (java.util.Collection<java.lang.String>)linkedhashset_str61);
    java.lang.String str65 = extensionVersionResponse64.getExtensionName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test359"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array3 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter4 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestResourceFilter_array3);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest9 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestOperationLevel6, map_str_str7, false);
    java.lang.String str10 = executeActionRequest9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "isCommand :false, action :Tasks/custom_command_name, command :1.3.6.1.4.1.18060.16.1.1.1.7, inputs :{}, resourceFilters: [], exclusive: false, clusterName :MetricsRetrievalService [NEW]"+ "'", str10.equals("isCommand :false, action :Tasks/custom_command_name, command :1.3.6.1.4.1.18060.16.1.1.1.7, inputs :{}, resourceFilters: [], exclusive: false, clusterName :MetricsRetrievalService [NEW]"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test360"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertGroupResourceProvider.ALERT_GROUP_DEFINITIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertGroup/definitions"+ "'", str0.equals("AlertGroup/definitions"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test361"); }

    org.apache.ambari.server.state.State state0 = org.apache.ambari.server.state.State.INIT;
    org.apache.ambari.server.state.State state1 = org.apache.ambari.server.state.State.STOPPING;
    org.apache.ambari.server.state.State state2 = org.apache.ambari.server.state.State.UNINSTALLED;
    boolean b3 = org.apache.ambari.server.state.State.isValidStateTransition(state1, state2);
    boolean b4 = org.apache.ambari.server.state.State.isValidStateTransition(state0, state2);
    org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.apache.ambari.server.state.State.INIT + "'", state0.equals(org.apache.ambari.server.state.State.INIT));
    org.junit.Assert.assertTrue("'" + state1 + "' != '" + org.apache.ambari.server.state.State.STOPPING + "'", state1.equals(org.apache.ambari.server.state.State.STOPPING));
    org.junit.Assert.assertTrue("'" + state2 + "' != '" + org.apache.ambari.server.state.State.UNINSTALLED + "'", state2.equals(org.apache.ambari.server.state.State.UNINSTALLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test362"); }

    org.apache.ambari.server.state.ExtensionId extensionId2 = new org.apache.ambari.server.state.ExtensionId("1.3.6.1.4.1.18060.16", "StackConfigurations/property_name");
    java.lang.String str3 = extensionId2.getExtensionVersion();
    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer transfer4 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer();
    boolean b5 = extensionId2.equals((java.lang.Object)transfer4);
    transfer4.fromKey = "";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StackConfigurations/property_name"+ "'", str3.equals("StackConfigurations/property_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test363"); }

    org.apache.ambari.server.state.theme.TabLayout tabLayout0 = new org.apache.ambari.server.state.theme.TabLayout();
    java.lang.String str1 = tabLayout0.getTabRows();
    org.apache.ambari.server.state.theme.Section[] section_array2 = new org.apache.ambari.server.state.theme.Section[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.theme.Section> arraylist_section3 = new java.util.ArrayList<org.apache.ambari.server.state.theme.Section>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.theme.Section>)arraylist_section3, section_array2);
    tabLayout0.setSections((java.util.List<org.apache.ambari.server.state.theme.Section>)arraylist_section3);
    java.lang.String str6 = tabLayout0.getTabColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(section_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test364"); }

    org.apache.ambari.server.state.stack.ExtensionMetainfoXml extensionMetainfoXml0 = new org.apache.ambari.server.state.stack.ExtensionMetainfoXml();
    boolean b1 = extensionMetainfoXml0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test365"); }

    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.builder();
    org.apache.ambari.server.api.services.Request.Type type1 = null;
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder2 = addBlueprintRequestAuditEventBuilder0.withRequestType(type1);
    org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder4 = addBlueprintRequestAuditEventBuilder2.withUserName("Hosts/host_health_report");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder4);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test366"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    org.apache.ambari.server.orm.entities.ExtensionLinkEntity extensionLinkEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.ExtensionLinkEntity extensionLinkEntity2 = extensionLinkDAO0.merge(extensionLinkEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test367"); }

    org.apache.ambari.server.orm.entities.StageEntityPK stageEntityPK0 = new org.apache.ambari.server.orm.entities.StageEntityPK();
    java.lang.Long long1 = stageEntityPK0.getStageId();
    stageEntityPK0.setRequestId((java.lang.Long)1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test368"); }

    org.apache.ambari.server.controller.RepositoryRequest repositoryRequest4 = new org.apache.ambari.server.controller.RepositoryRequest(".FILTER", "task", "encryption_types", "ranger-hive-plugin-enabled");
    repositoryRequest4.setVerifyBaseUrl(false);
    java.lang.Long long7 = repositoryRequest4.getRepositoryVersionId();
    repositoryRequest4.setVerifyBaseUrl(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long7);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test369"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = hostResponse1.getHostAttributes();
    java.lang.String str5 = hostResponse1.getStatus();
    org.apache.ambari.server.state.HostHealthStatus.HealthStatus healthStatus6 = org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT;
    org.apache.ambari.server.state.HostHealthStatus hostHealthStatus8 = new org.apache.ambari.server.state.HostHealthStatus(healthStatus6, "SECONDARY_NAMENODE_MUST_BE_DELETED");
    org.apache.ambari.server.state.HostHealthStatus hostHealthStatus10 = new org.apache.ambari.server.state.HostHealthStatus(healthStatus6, "slave_type");
    java.lang.String str11 = hostHealthStatus10.getHealthReport();
    hostResponse1.setHealthStatus(hostHealthStatus10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertTrue("'" + healthStatus6 + "' != '" + org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT + "'", healthStatus6.equals(org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slave_type"+ "'", str11.equals("slave_type"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test370"); }

    org.apache.ambari.server.state.AlertState alertState5 = null;
    org.apache.ambari.server.state.Alert alert6 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState5);
    alert6.setLabel("Upgrade/abort_reason");
    java.lang.String str9 = alert6.getName();
    alert6.setHostName("_SERVICE_CHECK");
    java.lang.String str12 = alert6.getInstance();
    alert6.setHostName("Event/summary/users/created");
    alert6.setName("requestschedule");
    java.lang.String str17 = alert6.getService();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Repositories/repository_version_id"+ "'", str9.equals("Repositories/repository_version_id"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "kerberos_descriptor"+ "'", str12.equals("kerberos_descriptor"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "PrivilegeInfo/privilege_id"+ "'", str17.equals("PrivilegeInfo/privilege_id"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test371"); }

    org.apache.ambari.server.stack.ConfigurationInfo.Supports supports0 = org.apache.ambari.server.stack.ConfigurationInfo.Supports.FINAL;
    java.lang.String str1 = supports0.getDefaultValue();
    org.junit.Assert.assertTrue("'" + supports0 + "' != '" + org.apache.ambari.server.stack.ConfigurationInfo.Supports.FINAL + "'", supports0.equals(org.apache.ambari.server.stack.ConfigurationInfo.Supports.FINAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false"+ "'", str1.equals("false"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test372"); }

    org.apache.ambari.server.state.services.AlertNoticeDispatchService alertNoticeDispatchService0 = new org.apache.ambari.server.state.services.AlertNoticeDispatchService();
    com.google.common.util.concurrent.Service service1 = alertNoticeDispatchService0.startAsync();
    com.google.common.util.concurrent.Service.Listener listener2 = null;
    java.util.concurrent.Executor executor3 = null;
    // The following exception was thrown during execution in test generation
    try {
    alertNoticeDispatchService0.addListener(listener2, executor3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(service1);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test373"); }

    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor2 = null;
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor3 = null;
    org.apache.ambari.server.collections.Predicate predicate4 = null;
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor5 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor("RootServiceComponents/ciphers", "StackConfigurations/property_value_attributes", kerberosPrincipalDescriptor2, kerberosKeytabDescriptor3, predicate4);
    org.apache.ambari.server.controller.ActionResponse actionResponse14 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse14.setActionName("");
    actionResponse14.setTargetType("force_toggle_kerberos");
    boolean b19 = kerberosIdentityDescriptor5.equals((java.lang.Object)actionResponse14);
    org.apache.ambari.server.state.kerberos.AbstractKerberosDescriptor abstractKerberosDescriptor20 = kerberosIdentityDescriptor5.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(abstractKerberosDescriptor20);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test374"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyToggleAuthorization("PrivilegeInfo/type", (java.lang.Long)100L);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test375"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.orm.entities.ViewInstanceEntity viewInstanceEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.services.ViewExternalSubResourceService viewExternalSubResourceService2 = new org.apache.ambari.server.api.services.ViewExternalSubResourceService(type0, viewInstanceEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test376"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_REQUEST_STATUS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/request_status"+ "'", str0.equals("Upgrade/request_status"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test377"); }

    org.apache.ambari.server.RoleCommand roleCommand0 = org.apache.ambari.server.RoleCommand.RESTART;
    org.junit.Assert.assertTrue("'" + roleCommand0 + "' != '" + org.apache.ambari.server.RoleCommand.RESTART + "'", roleCommand0.equals(org.apache.ambari.server.RoleCommand.RESTART));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test378"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    org.apache.ambari.server.state.CustomCommandDefinition[] customCommandDefinition_array3 = new org.apache.ambari.server.state.CustomCommandDefinition[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.CustomCommandDefinition> arraylist_customCommandDefinition4 = new java.util.ArrayList<org.apache.ambari.server.state.CustomCommandDefinition>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.CustomCommandDefinition>)arraylist_customCommandDefinition4, customCommandDefinition_array3);
    componentInfo0.setCustomCommands((java.util.List<org.apache.ambari.server.state.CustomCommandDefinition>)arraylist_customCommandDefinition4);
    org.apache.ambari.server.state.BulkCommandDefinition bulkCommandDefinition7 = null;
    componentInfo0.setBulkCommands(bulkCommandDefinition7);
    componentInfo0.setDisplayName("Hosts/last_heartbeat_time");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(customCommandDefinition_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test379"); }

    org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric gangliaMetric0 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric();
    gangliaMetric0.setMetric_name("Tasks/end_time");

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test380"); }

    org.apache.ambari.server.controller.RootServiceResponseFactory rootServiceResponseFactory0 = new org.apache.ambari.server.controller.RootServiceResponseFactory();
    org.apache.ambari.server.controller.RootServiceComponentRequest rootServiceComponentRequest3 = new org.apache.ambari.server.controller.RootServiceComponentRequest("host_group", "hdfs-site");
    java.lang.String str4 = rootServiceComponentRequest3.getServiceName();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.RootServiceComponentResponse> set_rootServiceComponentResponse5 = rootServiceResponseFactory0.getRootServiceComponents(rootServiceComponentRequest3);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.ObjectNotFoundException");
    } catch (org.apache.ambari.server.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "host_group"+ "'", str4.equals("host_group"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test381"); }

    org.apache.ambari.server.orm.dao.RepositoryVersionDAO repositoryVersionDAO0 = new org.apache.ambari.server.orm.dao.RepositoryVersionDAO();
    org.apache.ambari.server.orm.entities.StackEntity stackEntity1 = null;
    org.apache.ambari.server.state.RepositoryType repositoryType5 = org.apache.ambari.server.state.RepositoryType.STANDARD;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity6 = repositoryVersionDAO0.create(stackEntity1, "processes", "upgraded", "RUNNING", repositoryType5);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
    } catch (org.apache.ambari.server.AmbariException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repositoryType5 + "' != '" + org.apache.ambari.server.state.RepositoryType.STANDARD + "'", repositoryType5.equals(org.apache.ambari.server.state.RepositoryType.STANDARD));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test382"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_CPU_COUNT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/cpu_count"+ "'", str0.equals("Hosts/cpu_count"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test383"); }

    org.apache.ambari.server.state.services.MetricsRetrievalService metricsRetrievalService0 = new org.apache.ambari.server.state.services.MetricsRetrievalService();
    com.google.common.util.concurrent.Service.State state1 = metricsRetrievalService0.stopAndWait();
    com.google.common.util.concurrent.Service service2 = metricsRetrievalService0.stopAsync();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(state1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(service2);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test384"); }

    org.apache.ambari.server.controller.ServiceComponentRequest serviceComponentRequest5 = new org.apache.ambari.server.controller.ServiceComponentRequest("", "hi!", "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url");
    serviceComponentRequest5.setComponentCategory("kerberos_descriptor");
    java.lang.String str8 = serviceComponentRequest5.getDesiredState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "WidgetLayoutInfo/section_name"+ "'", str8.equals("WidgetLayoutInfo/section_name"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test385"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.ATLAS_SERVICE_PRESENCE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test386"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_SYNC_GROUP_MEMBER_FILTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test387"); }

    org.apache.ambari.server.events.ServiceComponentUninstalledEvent serviceComponentUninstalledEvent7 = new org.apache.ambari.server.events.ServiceComponentUninstalledEvent((long)(byte)100, "AlertHistory/cluster_name", "WidgetLayoutInfo/section_name", "ambari.dispatch-property.script", "AlertHistory/definition_name", "Clusters/total_hosts", false);
    boolean b8 = serviceComponentUninstalledEvent7.isRecoveryEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test388"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_HOST_STATUS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/host_status"+ "'", str0.equals("Hosts/host_status"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test389"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    stackConfigurationResponse12.setPropertyName("sqlserver");
    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType15 = stackConfigurationResponse12.getPropertyType();
    stackConfigurationResponse12.setStackVersion("Event/summary/users/skipped");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_propertyType15);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test390"); }

    org.apache.ambari.server.serveraction.upgrades.ConfigureAction configureAction0 = new org.apache.ambari.server.serveraction.upgrades.ConfigureAction();

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test391"); }

    org.apache.ambari.server.agent.HostStatus hostStatus0 = new org.apache.ambari.server.agent.HostStatus();
    org.apache.ambari.server.agent.HostStatus.Status status1 = hostStatus0.getStatus();
    org.apache.ambari.server.agent.HostStatus.Status status2 = hostStatus0.getStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(status2);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test392"); }

    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder2 = blueprintExportRequestAuditEventBuilder0.withUserName("StackConfigurations/property_value_attributes");
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder4 = blueprintExportRequestAuditEventBuilder0.withRemoteIp("RootService/service_name");
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder6 = blueprintExportRequestAuditEventBuilder0.withUserName("kerberos_descriptor_reference");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder6);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test393"); }

    org.apache.ambari.server.state.StackId stackId2 = new org.apache.ambari.server.state.StackId("StackConfigurations/final", "downgrade");

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test394"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.Stack stack3 = new org.apache.ambari.server.controller.internal.Stack("fields", "AlertHistory/id", ambariManagementController2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test395"); }

    org.apache.ambari.server.state.theme.Tab tab0 = new org.apache.ambari.server.state.theme.Tab();
    java.lang.String str1 = tab0.getName();
    org.apache.ambari.server.state.theme.TabLayout tabLayout2 = new org.apache.ambari.server.state.theme.TabLayout();
    tab0.setTabLayout(tabLayout2);
    tabLayout2.setTabColumns("/var/lib/ambari-server/tmp");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test396"); }

    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder();
    org.apache.ambari.server.api.services.ResultStatus resultStatus1 = null;
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder2 = deleteViewInstanceRequestAuditEventBuilder0.withResultStatus(resultStatus1);
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder4 = deleteViewInstanceRequestAuditEventBuilder2.withOperation("component");
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder6 = deleteViewInstanceRequestAuditEventBuilder2.withUserName("AMBARI.MANAGE_USERS");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder6);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test397"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceConfigVersionResourceProvider.SERVICE_CONFIG_VERSION_HOSTS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hosts"+ "'", str0.equals("hosts"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test398"); }

    org.apache.ambari.server.view.configuration.ViewConfig viewConfig0 = new org.apache.ambari.server.view.configuration.ViewConfig();
    java.util.List<org.apache.ambari.server.view.configuration.InstanceConfig> list_instanceConfig1 = viewConfig0.getInstances();
    java.lang.String str2 = viewConfig0.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_instanceConfig1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test399"); }

    org.apache.ambari.server.state.alert.AlertDefinition alertDefinition2 = null;
    org.apache.ambari.server.agent.AlertExecutionCommand alertExecutionCommand3 = new org.apache.ambari.server.agent.AlertExecutionCommand("in-memory", "AlertGroup/default", alertDefinition2);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test400"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)(-1L), "host_group", "Clusters/cluster_name", "java_version", "yarn.scheduler.capacity.root.queues", batch5, schedule6, "Stage/status", "Credential/key", "StackConfigurations/property_name", "downgrade_from_version", (java.lang.Integer)0);
    java.lang.Integer i13 = requestScheduleResponse12.getAuthenticatedUserId();
    java.lang.Integer i14 = requestScheduleResponse12.getAuthenticatedUserId();
    requestScheduleResponse12.setDescription("cluster.permissioninfo/resource_name.rootservicecomponents/service_name");
    java.lang.String str17 = requestScheduleResponse12.getClusterName();
    requestScheduleResponse12.setAuthenticatedUserId((java.lang.Integer)8443);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "host_group"+ "'", str17.equals("host_group"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test401"); }

    org.apache.ambari.server.controller.ivory.Cluster.Interface interface3 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("StackConfigurations/property_type", "1.3.6.1.4.1.18060.16.1", "ViewVersionInfo/parameters");

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test402"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.REQUEST_LOGPATH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test403"); }

    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer1 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule2 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl3 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule2);
    metricsPaddingRenderer1.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl3);
    org.apache.ambari.server.controller.spi.Resource.Type type5 = null;
    org.apache.ambari.server.controller.spi.Resource[] resource_array6 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource7 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource7, resource_array6);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl12 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource7, true, false, (int)'#');
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource13 = queryResponseImpl12.getResources();
    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider14 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition15 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider14);
    org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider gSInstallerHostProvider16 = new org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider(clusterDefinition15);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str17 = gSInstallerHostProvider16.getKeyPropertyIds();
    org.apache.ambari.server.controller.spi.Resource resource18 = null;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController19 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider20 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController19);
    org.apache.ambari.server.controller.spi.Request request21 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate22 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus23 = widgetResourceProvider20.deleteResources(request21, predicate22);
    java.lang.String[] str_array26 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request27 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array26);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus28 = widgetResourceProvider20.createResources(request27);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate31 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    gSInstallerHostProvider16.updateProperties(resource18, request27, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate31);
    org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate categoryIsEmptyPredicate34 = new org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate("AlertHistory/definition_name");
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource35 = clusterControllerImpl3.populateResources(type5, set_resource13, request27, (org.apache.ambari.server.controller.spi.Predicate)categoryIsEmptyPredicate34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus28);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test404"); }

    org.apache.ambari.server.stack.StackContext.LatestRepoQueryExecutor latestRepoQueryExecutor0 = new org.apache.ambari.server.stack.StackContext.LatestRepoQueryExecutor();

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test405"); }

    org.apache.ambari.server.controller.ServiceComponentRequest serviceComponentRequest5 = new org.apache.ambari.server.controller.ServiceComponentRequest("", "hi!", "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url");
    java.lang.String str6 = serviceComponentRequest5.getRecoveryEnabled();
    serviceComponentRequest5.setDesiredState("one_dir_per_partition");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Repositories/latest_base_url"+ "'", str6.equals("Repositories/latest_base_url"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test406"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)(-1L), "host_group", "Clusters/cluster_name", "java_version", "yarn.scheduler.capacity.root.queues", batch5, schedule6, "Stage/status", "Credential/key", "StackConfigurations/property_name", "downgrade_from_version", (java.lang.Integer)0);
    org.apache.ambari.server.state.scheduler.Batch batch13 = null;
    requestScheduleResponse12.setBatch(batch13);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test407"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    java.lang.String str5 = configuration0.getAlertTemplateFile();
    java.lang.Integer i6 = configuration0.getAgentApiAcceptors();
    java.lang.String str7 = configuration0.getCacheControlHTTPResponseHeader();
    org.apache.ambari.server.utils.StageUtils.setConfiguration(configuration0);
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "no-store"+ "'", str7.equals("no-store"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test408"); }

    java.lang.String[] str_array57 = new java.lang.String[] { "security", "alerts.json", "Artifacts/artifact_name", "widgets.json", "ambari.dispatch.snmp.oids.body", "", "type", "alerts.json", "RootServiceComponents/ciphers", "notification.dispatch.alert.script", "AuthorizationInfo/cluster_name", "Users/user_type", "stack_name", "Alert/component_name", "ViewUrlInfo/view_instance_version", "max_duration_for_retries", "javax.net.ssl.trustStore", "AlertGroup/name", "configure-task-key-value-pairs", "RootService/service_name", "StackConfigurations/property_value_attributes", "ambari_db_rca_password", "hi!", "Stage/status", "127.0.0.1", "UpgradeChecks/repository_version", "queues", "UpgradeChecks/repository_version", "ERROR", "desired_version", "_SERVICE_CHECK", "Event/summary/memberships/removed", "AlertTarget/name", "PrivilegeInfo/principal_type", "manage_identities", "ambari-server", "Event/summary/memberships/removed", "Stage/host_params", "max_duration_for_retries", "queues", "cluster-env", "UpgradeChecks/id", "StackConfigurations/property_name", "stack_name", "METRICS_COLLECTOR", "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", "operation_level/service_name", "alerts.json", "stack_name", "ViewVersionInfo/archive", "StackLevelConfigurations/property_value_attributes", "kerberos_descriptor", "Repositories/repository_version_id", "ambari_db_rca_password", "notification.dispatch.alert.script", "ERROR", "AlertNotice/target_id" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str58 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str58, str_array57);
    java.util.Set<java.lang.String> set_str60 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories((java.util.Set<java.lang.String>)linkedhashset_str58);
    org.apache.ambari.server.state.Cluster[] cluster_array61 = new org.apache.ambari.server.state.Cluster[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.Cluster> linkedhashset_cluster62 = new java.util.LinkedHashSet<org.apache.ambari.server.state.Cluster>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.Cluster>)linkedhashset_cluster62, cluster_array61);
    org.apache.ambari.server.events.HostsRemovedEvent hostsRemovedEvent64 = new org.apache.ambari.server.events.HostsRemovedEvent((java.util.Set<java.lang.String>)linkedhashset_str58, (java.util.Set<org.apache.ambari.server.state.Cluster>)linkedhashset_cluster62);
    java.lang.String str65 = hostsRemovedEvent64.toString();
    java.lang.String str66 = hostsRemovedEvent64.toString();
    java.lang.String str67 = hostsRemovedEvent64.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cluster_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}"+ "'", str65.equals("HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}"+ "'", str66.equals("HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}"+ "'", str67.equals("HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test409"); }

    org.apache.ambari.server.api.resources.ConfigurationResourceDefinition configurationResourceDefinition0 = new org.apache.ambari.server.api.resources.ConfigurationResourceDefinition();
    java.util.List<org.apache.ambari.server.api.resources.ResourceDefinition.PostProcessor> list_postProcessor1 = configurationResourceDefinition0.getPostProcessors();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_postProcessor1);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test410"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_PACK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/pack"+ "'", str0.equals("Upgrade/pack"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test411"); }

    org.apache.ambari.server.controller.MemberRequest memberRequest2 = new org.apache.ambari.server.controller.MemberRequest("oracle_jdbc_url", "HostRoles/state");
    java.lang.String str3 = memberRequest2.toString();
    java.lang.String str4 = memberRequest2.getUserName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MemberRequest [groupName=oracle_jdbc_url, userName=HostRoles/state]"+ "'", str3.equals("MemberRequest [groupName=oracle_jdbc_url, userName=HostRoles/state]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HostRoles/state"+ "'", str4.equals("HostRoles/state"));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test412"); }

    org.apache.ambari.server.api.services.SettingService settingService0 = new org.apache.ambari.server.api.services.SettingService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = settingService0.updateSetting("privilege", httpHeaders2, uriInfo3, "http");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test413"); }

    org.apache.ambari.server.topology.KerberosDescriptorImpl kerberosDescriptorImpl2 = new org.apache.ambari.server.topology.KerberosDescriptorImpl("baseurl", "recovery_enabled");

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test414"); }

    org.apache.ambari.server.api.services.VersionDefinitionService versionDefinitionService0 = new org.apache.ambari.server.api.services.VersionDefinitionService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = versionDefinitionService0.createVersion("HostRoles/host_name", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test415"); }

    org.apache.ambari.server.api.rest.HealthCheck healthCheck0 = new org.apache.ambari.server.api.rest.HealthCheck();
    java.lang.String str1 = healthCheck0.plainTextCheck();
    java.lang.String str2 = healthCheck0.xmlCheck();
    java.lang.String str3 = healthCheck0.xmlCheck();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RUNNING"+ "'", str1.equals("RUNNING"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<?xml version=\"1.0\"?><status> RUNNING</status>"+ "'", str2.equals("<?xml version=\"1.0\"?><status> RUNNING</status>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\"?><status> RUNNING</status>"+ "'", str3.equals("<?xml version=\"1.0\"?><status> RUNNING</status>"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test416"); }

    org.apache.ambari.server.agent.AgentRequests agentRequests0 = new org.apache.ambari.server.agent.AgentRequests();
    agentRequests0.setExecutionDetailsRequest("1.3.6.1.4.1.18060.16.1.1.1.7", "", "");

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test417"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog250.COMPONENT_VERSION_PK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PK_sc_version"+ "'", str0.equals("PK_sc_version"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test418"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.ambari.server.controller.HostRequest hostRequest3 = new org.apache.ambari.server.controller.HostRequest("Theme", "", map_str_str2);
    java.lang.String str4 = hostRequest3.getRackInfo();
    java.lang.String str5 = hostRequest3.getClusterName();
    java.lang.String str6 = hostRequest3.getClusterName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test419"); }

    org.apache.ambari.server.state.theme.Tab tab0 = new org.apache.ambari.server.state.theme.Tab();
    org.apache.ambari.server.state.theme.TabLayout tabLayout1 = tab0.getTabLayout();
    tab0.setName("Event/summary/memberships/removed");
    org.apache.ambari.server.state.theme.TabLayout tabLayout4 = tab0.getTabLayout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(tabLayout1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(tabLayout4);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test420"); }

    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder2 = privilegeChangeRequestAuditEventBuilder0.withGroup("StackLevelConfigurations/type");
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder4 = privilegeChangeRequestAuditEventBuilder0.withGroup("Tasks/id");
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder6 = privilegeChangeRequestAuditEventBuilder4.withUser("quicklinks");
    org.apache.ambari.server.audit.event.request.PrivilegeChangeRequestAuditEvent.PrivilegeChangeRequestAuditEventBuilder privilegeChangeRequestAuditEventBuilder8 = privilegeChangeRequestAuditEventBuilder6.withUser("SAMEORIGIN");
    
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
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test421"); }

    org.apache.ambari.server.agent.CommandReport commandReport0 = new org.apache.ambari.server.agent.CommandReport();
    commandReport0.setStdOut("ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}");

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test422"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.AMBARI_SERVER_ACTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test423"); }

    org.apache.ambari.server.orm.entities.OperatingSystemEntity operatingSystemEntity0 = new org.apache.ambari.server.orm.entities.OperatingSystemEntity();
    boolean b1 = operatingSystemEntity0.isAmbariManagedRepos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test424"); }

    org.apache.ambari.server.orm.dao.ClusterVersionDAO clusterVersionDAO0 = new org.apache.ambari.server.orm.dao.ClusterVersionDAO();
    org.apache.ambari.server.state.Cluster cluster3 = null;
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType4 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    org.apache.ambari.server.state.stack.upgrade.Direction direction5 = null;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj6 = null;
    org.apache.ambari.server.state.UpgradeContext upgradeContext7 = new org.apache.ambari.server.state.UpgradeContext(cluster3, upgradeType4, direction5, map_str_obj6);
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest8 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType4);
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType9 = prereqCheckRequest8.getUpgradeType();
    org.apache.ambari.server.state.StackId stackId12 = new org.apache.ambari.server.state.StackId("1.3.6.1.4.1.18060.16.1.1.1.1", "StackConfigurations/property_description");
    prereqCheckRequest8.setTargetStackId(stackId12);
    java.lang.String str14 = stackId12.toString();
    java.lang.String str15 = stackId12.getStackId();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.ClusterVersionEntity clusterVersionEntity17 = clusterVersionDAO0.findByClusterAndStackAndVersion("PrivilegeInfo/type", stackId12, "1.3.6.1.4.1.18060.16.1.1.1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + upgradeType4 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType4.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    org.junit.Assert.assertTrue("'" + upgradeType9 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType9.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.1-StackConfigurations/property_description"+ "'", str14.equals("1.3.6.1.4.1.18060.16.1.1.1.1-StackConfigurations/property_description"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.1-StackConfigurations/property_description"+ "'", str15.equals("1.3.6.1.4.1.18060.16.1.1.1.1-StackConfigurations/property_description"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test425"); }

    org.apache.ambari.server.orm.JPATableGenerationStrategy jPATableGenerationStrategy1 = org.apache.ambari.server.orm.JPATableGenerationStrategy.fromString("Alert/cluster_name");
    org.junit.Assert.assertTrue("'" + jPATableGenerationStrategy1 + "' != '" + org.apache.ambari.server.orm.JPATableGenerationStrategy.NONE + "'", jPATableGenerationStrategy1.equals(org.apache.ambari.server.orm.JPATableGenerationStrategy.NONE));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test426"); }

    org.apache.ambari.server.controller.internal.Stack stack2 = null;
    org.apache.ambari.server.controller.internal.Stack stack5 = null;
    org.apache.ambari.server.topology.Component[] component_array6 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component7 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component7, component_array6);
    org.apache.ambari.server.topology.Configuration configuration9 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl11 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack5, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component7, configuration9, "Repositories/latest_base_url");
    org.apache.ambari.server.topology.Configuration configuration12 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl14 = new org.apache.ambari.server.topology.HostGroupImpl("AlertGroup/default", "", stack2, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component7, configuration12, "HostRoles/public_host_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test427"); }

    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS;
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus1 = org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED;
    org.apache.ambari.server.controller.RequestRequest requestRequest4 = new org.apache.ambari.server.controller.RequestRequest("777", (long)(-1));
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus5 = org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS;
    requestRequest4.setStatus(hostRoleStatus5);
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus7 = org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS;
    org.apache.ambari.server.orm.entities.StageEntity[] stageEntity_array8 = new org.apache.ambari.server.orm.entities.StageEntity[] {  };
    java.util.ArrayList<org.apache.ambari.server.orm.entities.StageEntity> arraylist_stageEntity9 = new java.util.ArrayList<org.apache.ambari.server.orm.entities.StageEntity>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.StageEntity>)arraylist_stageEntity9, stageEntity_array8);
    org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus11 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStageEntities((java.util.Collection<org.apache.ambari.server.orm.entities.StageEntity>)arraylist_stageEntity9);
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus12 = calculatedStatus11.getStatus();
    boolean b13 = hostRoleStatus12.isCompletedState();
    org.apache.ambari.server.orm.entities.StageEntity[] stageEntity_array14 = new org.apache.ambari.server.orm.entities.StageEntity[] {  };
    java.util.ArrayList<org.apache.ambari.server.orm.entities.StageEntity> arraylist_stageEntity15 = new java.util.ArrayList<org.apache.ambari.server.orm.entities.StageEntity>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.StageEntity>)arraylist_stageEntity15, stageEntity_array14);
    org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus17 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStageEntities((java.util.Collection<org.apache.ambari.server.orm.entities.StageEntity>)arraylist_stageEntity15);
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus18 = calculatedStatus17.getStatus();
    boolean b19 = hostRoleStatus18.isCompletedState();
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus20 = org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED;
    boolean b21 = hostRoleStatus20.isFailedState();
    org.apache.ambari.server.controller.RequestRequest requestRequest24 = new org.apache.ambari.server.controller.RequestRequest("777", (long)(-1));
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus25 = org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS;
    requestRequest24.setStatus(hostRoleStatus25);
    boolean b27 = hostRoleStatus25.isInProgress();
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus28 = org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED;
    org.apache.ambari.server.controller.RequestRequest requestRequest31 = new org.apache.ambari.server.controller.RequestRequest("777", (long)(-1));
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus32 = org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS;
    requestRequest31.setStatus(hostRoleStatus32);
    org.apache.ambari.server.controller.RequestRequest requestRequest36 = new org.apache.ambari.server.controller.RequestRequest("777", (long)(-1));
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus37 = org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS;
    requestRequest36.setStatus(hostRoleStatus37);
    boolean b39 = hostRoleStatus37.isInProgress();
    org.apache.ambari.server.actionmanager.HostRoleStatus[] hostRoleStatus_array40 = new org.apache.ambari.server.actionmanager.HostRoleStatus[] { hostRoleStatus0, hostRoleStatus1, hostRoleStatus5, hostRoleStatus7, hostRoleStatus12, hostRoleStatus18, hostRoleStatus20, hostRoleStatus25, hostRoleStatus28, hostRoleStatus32, hostRoleStatus37 };
    java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleStatus> arraylist_hostRoleStatus41 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleStatus>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleStatus>)arraylist_hostRoleStatus41, hostRoleStatus_array40);
    java.util.Map<org.apache.ambari.server.actionmanager.HostRoleStatus,java.lang.Integer> map_hostRoleStatus_i43 = org.apache.ambari.server.controller.internal.CalculatedStatus.calculateStatusCounts((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleStatus>)arraylist_hostRoleStatus41);
    org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS));
    org.junit.Assert.assertTrue("'" + hostRoleStatus1 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED + "'", hostRoleStatus1.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED));
    org.junit.Assert.assertTrue("'" + hostRoleStatus5 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS + "'", hostRoleStatus5.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS));
    org.junit.Assert.assertTrue("'" + hostRoleStatus7 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS + "'", hostRoleStatus7.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stageEntity_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(calculatedStatus11);
    org.junit.Assert.assertTrue("'" + hostRoleStatus12 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED + "'", hostRoleStatus12.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stageEntity_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(calculatedStatus17);
    org.junit.Assert.assertTrue("'" + hostRoleStatus18 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED + "'", hostRoleStatus18.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    org.junit.Assert.assertTrue("'" + hostRoleStatus20 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED + "'", hostRoleStatus20.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    org.junit.Assert.assertTrue("'" + hostRoleStatus25 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS + "'", hostRoleStatus25.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    org.junit.Assert.assertTrue("'" + hostRoleStatus28 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED + "'", hostRoleStatus28.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.ABORTED));
    org.junit.Assert.assertTrue("'" + hostRoleStatus32 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS + "'", hostRoleStatus32.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS));
    org.junit.Assert.assertTrue("'" + hostRoleStatus37 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS + "'", hostRoleStatus37.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.IN_PROGRESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleStatus_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_hostRoleStatus_i43);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test428"); }

    org.apache.ambari.server.state.stack.WidgetLayout widgetLayout0 = new org.apache.ambari.server.state.stack.WidgetLayout();
    java.lang.String str1 = widgetLayout0.getSectionName();
    widgetLayout0.setSectionName("hdfs-site");
    widgetLayout0.setLayoutName("operation_level/cluster_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test429"); }

    org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.CONFIGURATION_WARNING;
    org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.CONFIGURATION_WARNING + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.CONFIGURATION_WARNING));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test430"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.lang.String str4 = hostResponse1.getRackInfo();
    org.apache.ambari.server.state.HostHealthStatus.HealthStatus healthStatus5 = org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT;
    org.apache.ambari.server.state.HostHealthStatus hostHealthStatus7 = new org.apache.ambari.server.state.HostHealthStatus(healthStatus5, "SECONDARY_NAMENODE_MUST_BE_DELETED");
    hostResponse1.setHealthStatus(hostHealthStatus7);
    org.apache.ambari.server.state.HostHealthStatus.HealthStatus healthStatus9 = hostHealthStatus7.getHealthStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    org.junit.Assert.assertTrue("'" + healthStatus5 + "' != '" + org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT + "'", healthStatus5.equals(org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT));
    org.junit.Assert.assertTrue("'" + healthStatus9 + "' != '" + org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT + "'", healthStatus9.equals(org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test431"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HOSTS_HEARTBEAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test432"); }

    org.apache.ambari.server.state.action.ActionType actionType1 = new org.apache.ambari.server.state.action.ActionType("RootService/service_name");

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test433"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.AMBARI_PYTHON_WRAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test434"); }

    org.apache.ambari.server.orm.entities.AlertHistoryEntity alertHistoryEntity0 = null;
    org.apache.ambari.server.state.services.AlertNoticeDispatchService.AlertInfo alertInfo1 = new org.apache.ambari.server.state.services.AlertNoticeDispatchService.AlertInfo(alertHistoryEntity0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test435"); }

    org.apache.ambari.server.view.ViewDirectoryWatcher viewDirectoryWatcher0 = new org.apache.ambari.server.view.ViewDirectoryWatcher();
    viewDirectoryWatcher0.start();

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test436"); }

    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder2 = addAlertGroupRequestAuditEventBuilder0.withName("ViewInstanceInfo/view_name");
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder4 = addAlertGroupRequestAuditEventBuilder0.withRemoteIp("alerts.json");
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder6 = addAlertGroupRequestAuditEventBuilder0.withOperation("timeline.metrics.cluster.aggregator.minute.ttl");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder6);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test437"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack1 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack0.mergeProcessing(upgradePack1);
    java.util.List<org.apache.ambari.server.state.stack.UpgradePack.IntermediateStack> list_intermediateStack3 = upgradePack0.getIntermediateStacks();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_intermediateStack3);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test438"); }

    org.apache.ambari.server.state.repository.Release release0 = new org.apache.ambari.server.state.repository.Release();
    java.lang.String str1 = release0.releaseNotes;
    release0.releaseNotes = "blueprint_name";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test439"); }

    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder();
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
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder14 = changeAlertTargetRequestAuditEventBuilder0.withRequestType(type10);
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder16 = changeAlertTargetRequestAuditEventBuilder14.withRemoteIp("");
    
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
    org.junit.Assert.assertNotNull(changeAlertTargetRequestAuditEventBuilder14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertTargetRequestAuditEventBuilder16);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test440"); }

    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_TIMEDOUT;
    org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_TIMEDOUT + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_TIMEDOUT));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test441"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.UserEntity userEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.merge(userEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test442"); }

    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder();
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
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder14 = changeAlertTargetRequestAuditEventBuilder0.withRequestType(type10);
    java.util.List<java.lang.String> list_str15 = null;
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder16 = changeAlertTargetRequestAuditEventBuilder14.withEmailRecipients(list_str15);
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder18 = changeAlertTargetRequestAuditEventBuilder16.withEmailFrom("");
    
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
    org.junit.Assert.assertNotNull(changeAlertTargetRequestAuditEventBuilder14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertTargetRequestAuditEventBuilder16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertTargetRequestAuditEventBuilder18);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test443"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.REGENERATE_ALL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "regenerate_all"+ "'", str0.equals("regenerate_all"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test444"); }

    org.apache.ambari.server.utils.ShellCommandUtil.Result result2 = org.apache.ambari.server.utils.ShellCommandUtil.mkdir("ViewVersionInfo/parameters", false);
    java.lang.String str3 = result2.getStdout();
    java.lang.String str4 = result2.getStderr();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(result2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "The directory already exists, skipping."+ "'", str3.equals("The directory already exists, skipping."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test445"); }

    org.apache.ambari.server.api.resources.PermissionResourceDefinition permissionResourceDefinition0 = new org.apache.ambari.server.api.resources.PermissionResourceDefinition();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition1 = permissionResourceDefinition0.getSubResourceDefinitions();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition2 = permissionResourceDefinition0.getSubResourceDefinitions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition2);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test446"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getProxyHostAndPorts();
    java.lang.String str5 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "*:*"+ "'", str4.equals("*:*"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "nosniff"+ "'", str5.equals("nosniff"));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test447"); }

    java.lang.Number number6 = null;
    java.lang.Number number10 = null;
    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO15 = new org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO((java.lang.Number)400, (java.lang.Number)(short)100, (java.lang.Number)10, (java.lang.Number)(short)0, (java.lang.Number)(byte)10, (java.lang.Number)(byte)10, number6, (java.lang.Number)10L, (java.lang.Number)10.0f, (java.lang.Number)(byte)0, number10, (java.lang.Number)(short)100, (java.lang.Number)0L, (java.lang.Number)(byte)-1, (java.lang.Number)(-1L));
    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO17 = hostRoleCommandStatusSummaryDTO15.pending((int)(byte)0);
    java.util.List<org.apache.ambari.server.actionmanager.HostRoleStatus> list_hostRoleStatus18 = hostRoleCommandStatusSummaryDTO15.getTaskStatuses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommandStatusSummaryDTO17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_hostRoleStatus18);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test448"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array5 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter6 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6, requestResourceFilter_array5);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel8 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str9 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest11 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6, requestOperationLevel8, map_str_str9, false);
    org.apache.ambari.server.controller.ActionExecutionContext actionExecutionContext12 = new org.apache.ambari.server.controller.ActionExecutionContext("", "RootServiceHostComponents/properties", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6);
    java.lang.String str13 = actionExecutionContext12.getActionName();
    actionExecutionContext12.setRetryAllowed(true);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel16 = actionExecutionContext12.getOperationLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "RootServiceHostComponents/properties"+ "'", str13.equals("RootServiceHostComponents/properties"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(requestOperationLevel16);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test449"); }

    org.apache.ambari.server.controller.internal.Stack stack2 = null;
    org.apache.ambari.server.topology.Component[] component_array3 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component4 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, component_array3);
    org.apache.ambari.server.topology.Configuration configuration6 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl8 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack2, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, configuration6, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.Stack stack9 = hostGroupImpl8.getStack();
    java.util.Collection<org.apache.ambari.server.topology.Component> collection_component10 = hostGroupImpl8.getComponents();
    java.util.Collection<java.lang.String> collection_str11 = hostGroupImpl8.getServices();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = hostGroupImpl8.addComponent("777");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stack9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_component10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str11);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test450"); }

    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType0 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING;
    org.junit.Assert.assertTrue("'" + upgradeType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING + "'", upgradeType0.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test451"); }

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
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder16 = addUpgradeRequestAuditEventBuilder0.withOperation("notification.dispatch.alert.script");
    
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
    org.junit.Assert.assertNotNull(addUpgradeRequestAuditEventBuilder16);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test452"); }

    org.apache.ambari.server.controller.RepositoryRequest repositoryRequest4 = new org.apache.ambari.server.controller.RepositoryRequest(".FILTER", "task", "encryption_types", "ranger-hive-plugin-enabled");
    repositoryRequest4.setVerifyBaseUrl(false);
    repositoryRequest4.setBaseUrl("Alert/text");
    repositoryRequest4.setClusterVersionId((java.lang.Long)300000L);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test453"); }

    org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator groupEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS1 = groupEventCreator0.getResultStatuses();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS2 = groupEventCreator0.getResultStatuses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS2);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test454"); }

    org.apache.ambari.server.api.query.render.MinimalRenderer minimalRenderer0 = new org.apache.ambari.server.api.query.render.MinimalRenderer();
    org.apache.ambari.server.api.util.TreeNode<org.apache.ambari.server.api.query.QueryInfo> treenode_queryInfo1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.util.TreeNode<java.util.Set<java.lang.String>> treenode_set_str3 = minimalRenderer0.finalizeProperties(treenode_queryInfo1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test455"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler.KERBEROS_ENV_LDAP_URL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ldap_url"+ "'", str0.equals("ldap_url"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test456"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setGroupMembershipAttr("WidgetInfo/metrics");

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test457"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    boolean b1 = serviceCheckGrouping0.supportsAutoSkipOnFailure;
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler2 = serviceCheckGrouping0.parallelScheduler;
    java.util.Iterator<org.apache.ambari.server.state.stack.upgrade.Grouping> iterator_grouping3 = null;
    // The following exception was thrown during execution in test generation
    try {
    serviceCheckGrouping0.merge(iterator_grouping3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(parallelScheduler2);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test458"); }

    org.apache.ambari.server.api.resources.ComponentResourceDefinition componentResourceDefinition0 = new org.apache.ambari.server.api.resources.ComponentResourceDefinition();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition1 = componentResourceDefinition0.getSubResourceDefinitions();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition2 = componentResourceDefinition0.getSubResourceDefinitions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition2);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test459"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    java.lang.String str3 = configuration0.getRecommendationsArtifactsLifetime();
    java.lang.String str4 = configuration0.getRecoveryDisabledComponents();
    java.lang.String str5 = configuration0.getJCEName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1w"+ "'", str3.equals("1w"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test460"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.Long> singularattribute_hostEntity_long0 = null;
    org.apache.ambari.server.orm.entities.HostEntity_.totalMem = singularattribute_hostEntity_long0;

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test461"); }

    org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str1 = agentEnv0.getTransparentHugePage();
    java.lang.String[] str_array2 = agentEnv0.getExistingRepos();
    org.apache.ambari.server.agent.AgentEnv agentEnv3 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str4 = agentEnv3.getTransparentHugePage();
    java.lang.String[] str_array5 = agentEnv3.getExistingRepos();
    agentEnv0.setExistingRepos(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test462"); }

    org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder2 = deleteUserRequestAuditEventBuilder0.withDeletedUsername("1.3.6.1.4.1.18060.16.1.1.1.2");
    org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder4 = deleteUserRequestAuditEventBuilder0.withRemoteIp("StackConfigurations/final");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteUserRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteUserRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteUserRequestAuditEventBuilder4);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test463"); }

    org.apache.ambari.server.agent.HostInfo hostInfo0 = new org.apache.ambari.server.agent.HostInfo();
    hostInfo0.setAgentUserId("ViewInstanceInfo/context_path");
    java.lang.String str3 = hostInfo0.getKernelMajVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test464"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    org.apache.ambari.server.orm.entities.ExtensionLinkEntity extensionLinkEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    extensionLinkDAO0.create(extensionLinkEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test465"); }

    org.apache.ambari.server.state.State state0 = org.apache.ambari.server.state.State.INSTALL_FAILED;
    org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.apache.ambari.server.state.State.INSTALL_FAILED + "'", state0.equals(org.apache.ambari.server.state.State.INSTALL_FAILED));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test466"); }

    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK configGroupHostMappingEntityPK0 = new org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK();
    java.lang.Long long1 = configGroupHostMappingEntityPK0.getConfigGroupId();
    java.lang.Long long2 = configGroupHostMappingEntityPK0.getConfigGroupId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test467"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.HTTP_X_XSS_PROTECTION_HEADER_VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test468"); }

    org.apache.ambari.server.checks.ConfigurationMergeCheck.MergeDetail mergeDetail0 = new org.apache.ambari.server.checks.ConfigurationMergeCheck.MergeDetail();
    java.lang.String str1 = mergeDetail0.type;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test469"); }

    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = addUserToGroupRequestAuditEventBuilder0.withGroupName("TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}");
    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder4 = addUserToGroupRequestAuditEventBuilder2.withUserName("ambari.dispatch.snmp.security.priv.passphrase");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder4);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test470"); }

    org.apache.ambari.server.state.Cluster cluster0 = null;
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType1 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    org.apache.ambari.server.state.stack.upgrade.Direction direction2 = null;
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj3 = null;
    org.apache.ambari.server.state.UpgradeContext upgradeContext4 = new org.apache.ambari.server.state.UpgradeContext(cluster0, upgradeType1, direction2, map_str_obj3);
    upgradeContext4.setAutoSkipComponentFailures(true);
    org.apache.ambari.server.state.ServiceComponentHost[] serviceComponentHost_array7 = new org.apache.ambari.server.state.ServiceComponentHost[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost> arraylist_serviceComponentHost8 = new java.util.ArrayList<org.apache.ambari.server.state.ServiceComponentHost>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost8, serviceComponentHost_array7);
    upgradeContext4.addUnhealthy((java.util.List<org.apache.ambari.server.state.ServiceComponentHost>)arraylist_serviceComponentHost8);
    org.apache.ambari.server.state.stack.UpgradePack upgradePack11 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack12 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack11.mergeProcessing(upgradePack12);
    upgradeContext4.setUpgradePack(upgradePack12);
    java.util.List<org.apache.ambari.server.state.stack.UpgradePack.IntermediateStack> list_intermediateStack15 = upgradePack12.getIntermediateStacks();
    java.lang.String str16 = upgradePack12.getName();
    org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serviceComponentHost_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_intermediateStack15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test471"); }

    org.apache.ambari.server.utils.ShellCommandUtil.Result result2 = org.apache.ambari.server.utils.ShellCommandUtil.pathExists("Hosts/maintenance_state", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(result2);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test472"); }

    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO0 = org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO.create();
    boolean b1 = hostRoleCommandStatusSummaryDTO0.isStageSkippable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommandStatusSummaryDTO0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test473"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HCAT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test474"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    kerberosComponentDescriptor6.removeIdentity("1.3.6.1.4.1.18060.16.1.1.1.7");
    kerberosComponentDescriptor6.removeIdentity("");
    
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
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test475"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.controller.ivory.Feed feed15 = new org.apache.ambari.server.controller.ivory.Feed("AlertTarget/notification_type", "Stage/command_params", "Alert/host_name", "extensions", "desired_version", "TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", "ERROR", "ViewInstanceInfo/cluster_handle", "", "AlertTarget/notification_type", "Theme", "Stage/host_params", "AlertHistory/id", "Versions/stack-errors", map_str_str14);
    java.lang.String str16 = feed15.getTargetClusterAction();
    java.lang.String str17 = feed15.getTargetClusterLimit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Versions/stack-errors"+ "'", str16.equals("Versions/stack-errors"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "AlertHistory/id"+ "'", str17.equals("AlertHistory/id"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test476"); }

    org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteChecks prerequisiteChecks0 = new org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteChecks();
    org.apache.ambari.server.bootstrap.SshHostInfo sshHostInfo1 = new org.apache.ambari.server.bootstrap.SshHostInfo();
    java.util.List<java.lang.String> list_str2 = org.apache.ambari.server.controller.utilities.PropertyHelper.AGGREGATE_FUNCTION_IDENTIFIERS;
    sshHostInfo1.setHosts(list_str2);
    prerequisiteChecks0.checks = list_str2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test477"); }

    org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder deleteGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder deleteGroupRequestAuditEventBuilder2 = deleteGroupRequestAuditEventBuilder0.withUrl("Repositories/latest_base_url");
    org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder deleteGroupRequestAuditEventBuilder4 = deleteGroupRequestAuditEventBuilder2.withUrl("RootServiceComponents/server_clock");
    org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder deleteGroupRequestAuditEventBuilder6 = deleteGroupRequestAuditEventBuilder4.withUserName("alerts.json");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteGroupRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteGroupRequestAuditEventBuilder6);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test478"); }

    org.apache.ambari.server.orm.dao.KerberosDescriptorDAO kerberosDescriptorDAO0 = new org.apache.ambari.server.orm.dao.KerberosDescriptorDAO();
    org.apache.ambari.server.orm.entities.KerberosDescriptorEntity kerberosDescriptorEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.KerberosDescriptorEntity kerberosDescriptorEntity2 = kerberosDescriptorDAO0.merge(kerberosDescriptorEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test479"); }

    org.apache.ambari.server.orm.dao.AlertDefinitionDAO alertDefinitionDAO0 = new org.apache.ambari.server.orm.dao.AlertDefinitionDAO();
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity2 = alertDefinitionDAO0.merge(alertDefinitionEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test480"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.ZOOKEEPER_QUORUM_SERVICE_CHECK;
    org.apache.ambari.server.Role role1 = org.apache.ambari.server.Role.MAPREDUCE2_SERVICE_CHECK;
    org.apache.ambari.server.RoleCommand roleCommand2 = org.apache.ambari.server.RoleCommand.EXECUTE;
    org.apache.ambari.server.metadata.RoleCommandPair roleCommandPair3 = new org.apache.ambari.server.metadata.RoleCommandPair(role1, roleCommand2);
    org.apache.ambari.server.stageplanner.RoleGraphNode roleGraphNode4 = new org.apache.ambari.server.stageplanner.RoleGraphNode(role0, roleCommand2);
    org.apache.ambari.server.Role role5 = org.apache.ambari.server.Role.ZOOKEEPER_QUORUM_SERVICE_CHECK;
    org.apache.ambari.server.Role role6 = org.apache.ambari.server.Role.MAPREDUCE2_SERVICE_CHECK;
    org.apache.ambari.server.RoleCommand roleCommand7 = org.apache.ambari.server.RoleCommand.EXECUTE;
    org.apache.ambari.server.metadata.RoleCommandPair roleCommandPair8 = new org.apache.ambari.server.metadata.RoleCommandPair(role6, roleCommand7);
    org.apache.ambari.server.stageplanner.RoleGraphNode roleGraphNode9 = new org.apache.ambari.server.stageplanner.RoleGraphNode(role5, roleCommand7);
    roleGraphNode4.addEdge(roleGraphNode9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role1);
    org.junit.Assert.assertTrue("'" + roleCommand2 + "' != '" + org.apache.ambari.server.RoleCommand.EXECUTE + "'", roleCommand2.equals(org.apache.ambari.server.RoleCommand.EXECUTE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role6);
    org.junit.Assert.assertTrue("'" + roleCommand7 + "' != '" + org.apache.ambari.server.RoleCommand.EXECUTE + "'", roleCommand7.equals(org.apache.ambari.server.RoleCommand.EXECUTE));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test481"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.ambari.server.controller.HostRequest hostRequest3 = new org.apache.ambari.server.controller.HostRequest("Stage/host_params", "WidgetLayoutInfo/section_name", map_str_str2);
    hostRequest3.setHostGroupName("Requests/request_schedule/schedule_id");
    java.lang.String str6 = hostRequest3.getHostGroupName();
    java.lang.String str7 = hostRequest3.getMaintenanceState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Requests/request_schedule/schedule_id"+ "'", str6.equals("Requests/request_schedule/schedule_id"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test482"); }

    org.apache.ambari.server.utils.HostAndPort hostAndPort2 = new org.apache.ambari.server.utils.HostAndPort("RUNNING", 2147483647);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test483"); }

    org.apache.ambari.server.orm.entities.AlertGroupEntity alertGroupEntity0 = null;
    boolean b2 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasViewAuthorization(alertGroupEntity0, (java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test484"); }

    org.apache.ambari.server.state.quicklinks.QuickLinks quickLinks0 = new org.apache.ambari.server.state.quicklinks.QuickLinks();
    quickLinks0.setDescription("QuickLinkInfo/stack_version");
    java.lang.String str3 = quickLinks0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test485"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    componentInfo0.setName("service");
    java.util.List<org.apache.ambari.server.state.LogDefinition> list_logDefinition4 = componentInfo0.getLogs();
    java.lang.String str5 = componentInfo0.getReassignAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_logDefinition4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test486"); }

    org.apache.ambari.server.orm.entities.AlertGroupEntity alertGroupEntity0 = null;
    boolean b2 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasViewAuthorization(alertGroupEntity0, (java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test487"); }

    org.apache.ambari.server.state.stack.upgrade.Condition condition0 = new org.apache.ambari.server.state.stack.upgrade.Condition();

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test488"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str14 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.controller.ivory.Feed feed15 = new org.apache.ambari.server.controller.ivory.Feed("AlertTarget/notification_type", "Stage/command_params", "Alert/host_name", "extensions", "desired_version", "TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", "ERROR", "ViewInstanceInfo/cluster_handle", "", "AlertTarget/notification_type", "Theme", "Stage/host_params", "AlertHistory/id", "Versions/stack-errors", map_str_str14);
    java.lang.String str16 = feed15.getTargetClusterAction();
    java.lang.String str17 = feed15.getTargetClusterStart();
    java.lang.String str18 = feed15.getStatus();
    java.lang.String str19 = feed15.getTargetClusterAction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Versions/stack-errors"+ "'", str16.equals("Versions/stack-errors"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Theme"+ "'", str17.equals("Theme"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Alert/host_name"+ "'", str18.equals("Alert/host_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Versions/stack-errors"+ "'", str19.equals("Versions/stack-errors"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test489"); }

    org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder2 = deleteUserRequestAuditEventBuilder0.withDeletedUsername("1.3.6.1.4.1.18060.16.1.1.1.2");
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder3 = org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS4 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus5 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS4);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS6 = resultStatus5.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS7 = resultStatus5.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl8 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus5);
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder9 = clusterPrivilegeChangeRequestAuditEventBuilder3.withResultStatus(resultStatus5);
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder11 = clusterPrivilegeChangeRequestAuditEventBuilder9.withRemoteIp("ACTION_NAME");
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder12 = new org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder13 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder14 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder15 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders16 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody17 = null;
    javax.ws.rs.core.UriInfo uriInfo18 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance19 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest20 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders16, requestBody17, uriInfo18, resourceInstance19);
    int i21 = postRequest20.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type22 = postRequest20.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder23 = addUserToGroupRequestAuditEventBuilder15.withRequestType(type22);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder24 = deleteRepositoryVersionAuditEventBuilder14.withRequestType(type22);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder25 = userPasswordChangeRequestAuditEventBuilder13.withRequestType(type22);
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder26 = addUpgradeRequestAuditEventBuilder12.withRequestType(type22);
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder27 = clusterPrivilegeChangeRequestAuditEventBuilder11.withRequestType(type22);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder28 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder29 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder30 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders31 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody32 = null;
    javax.ws.rs.core.UriInfo uriInfo33 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance34 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest35 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders31, requestBody32, uriInfo33, resourceInstance34);
    int i36 = postRequest35.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type37 = postRequest35.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder38 = addUserToGroupRequestAuditEventBuilder30.withRequestType(type37);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder39 = deleteRepositoryVersionAuditEventBuilder29.withRequestType(type37);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder40 = userPasswordChangeRequestAuditEventBuilder28.withRequestType(type37);
    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder41 = clusterPrivilegeChangeRequestAuditEventBuilder27.withRequestType(type37);
    org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder42 = deleteUserRequestAuditEventBuilder0.withRequestType(type37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteUserRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteUserRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type22.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUpgradeRequestAuditEventBuilder26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    org.junit.Assert.assertTrue("'" + type37 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type37.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterPrivilegeChangeRequestAuditEventBuilder41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteUserRequestAuditEventBuilder42);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test490"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.KSTR_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test491"); }

    org.apache.ambari.server.agent.CommandReport commandReport0 = new org.apache.ambari.server.agent.CommandReport();
    java.lang.String str1 = commandReport0.getRoleCommand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test492"); }

    org.apache.ambari.server.api.predicate.operators.RelationalOperatorFactory relationalOperatorFactory0 = new org.apache.ambari.server.api.predicate.operators.RelationalOperatorFactory();

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test493"); }

    org.apache.ambari.server.controller.internal.TemporalInfoImpl temporalInfoImpl3 = new org.apache.ambari.server.controller.internal.TemporalInfoImpl((long)' ', (long)(short)100, (long)(byte)100);
    org.apache.ambari.server.configuration.Configuration configuration4 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str5 = configuration4.getViewsPragmaHTTPResponseHeader();
    boolean b6 = configuration4.validateAgentHostnames();
    boolean b7 = temporalInfoImpl3.equals((java.lang.Object)configuration4);
    boolean b8 = configuration4.csrfProtectionEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "no-cache"+ "'", str5.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test494"); }

    org.apache.ambari.server.cleanup.ClasspathScannerUtils classpathScannerUtils0 = new org.apache.ambari.server.cleanup.ClasspathScannerUtils();

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test495"); }

    org.apache.ambari.server.state.State state9 = org.apache.ambari.server.state.State.DISABLED;
    org.apache.ambari.server.state.SecurityType securityType10 = null;
    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider11 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition12 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider11);
    java.util.Set<java.lang.String> set_str13 = clusterDefinition12.getHosts();
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport16 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i17 = clusterHealthReport16.getInitStateHosts();
    int i18 = clusterHealthReport16.getHealthyStateHosts();
    int i19 = clusterHealthReport16.getStaleConfigsHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse20 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)10L, "stack_tools", state9, securityType10, set_str13, (java.lang.Integer)10, "_SERVICE_CHECK", clusterHealthReport16);
    org.apache.ambari.server.state.StackId stackId22 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str26 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str27 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse28 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId22, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str26, map_str_map_str_str27);
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask29 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask29.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array32 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask29 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task> arraylist_task33 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task33, task_array32);
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper35 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("widgets.json", "ViewInstanceInfo/view_name", set_str13, map_str_str26, (java.util.List<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task33);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str36 = org.apache.ambari.server.upgrade.SchemaUpgradeUtil.extractProperty("downgrade_from_version", "host_groups", "Configuration format provided in Blueprint is not supported", "MemberRequest [groupName=oracle_jdbc_url, userName=HostRoles/state]", "configurations", map_str_str26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + state9 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state9.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test496"); }

    org.apache.ambari.server.state.AlertState alertState5 = null;
    org.apache.ambari.server.state.Alert alert6 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState5);
    alert6.setLabel("Upgrade/abort_reason");
    java.lang.String str9 = alert6.getName();
    alert6.setHostName("_SERVICE_CHECK");
    java.lang.String str12 = alert6.getInstance();
    org.apache.ambari.server.state.AlertState alertState18 = null;
    org.apache.ambari.server.state.Alert alert19 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState18);
    alert19.setLabel("Upgrade/abort_reason");
    java.lang.String str22 = alert19.getName();
    alert19.setHostName("_SERVICE_CHECK");
    java.lang.String str25 = alert19.getInstance();
    java.lang.String str26 = alert19.getInstance();
    org.apache.ambari.server.state.AlertState alertState33 = null;
    org.apache.ambari.server.state.Alert alert34 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState33);
    org.apache.ambari.server.events.AlertReceivedEvent alertReceivedEvent35 = new org.apache.ambari.server.events.AlertReceivedEvent(0L, alert34);
    java.lang.String str36 = alertReceivedEvent35.toString();
    org.apache.ambari.server.state.Alert alert37 = alertReceivedEvent35.getAlert();
    org.apache.ambari.server.state.Alert[] alert_array38 = new org.apache.ambari.server.state.Alert[] { alert6, alert19, alert37 };
    java.util.ArrayList<org.apache.ambari.server.state.Alert> arraylist_alert39 = new java.util.ArrayList<org.apache.ambari.server.state.Alert>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.Alert>)arraylist_alert39, alert_array38);
    org.apache.ambari.server.events.AlertReceivedEvent alertReceivedEvent41 = new org.apache.ambari.server.events.AlertReceivedEvent((java.util.List<org.apache.ambari.server.state.Alert>)arraylist_alert39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Repositories/repository_version_id"+ "'", str9.equals("Repositories/repository_version_id"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "kerberos_descriptor"+ "'", str12.equals("kerberos_descriptor"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Repositories/repository_version_id"+ "'", str22.equals("Repositories/repository_version_id"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "kerberos_descriptor"+ "'", str25.equals("kerberos_descriptor"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "kerberos_descriptor"+ "'", str26.equals("kerberos_descriptor"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "AlertReceivedEvent{cluserId=0, alerts=[{cluster=null, state=null, name=Repositories/repository_version_id, service=PrivilegeInfo/privilege_id, component=forceRefreshConfigTagsBeforeExecution, host=type, instance=kerberos_descriptor, text='null'}]}"+ "'", str36.equals("AlertReceivedEvent{cluserId=0, alerts=[{cluster=null, state=null, name=Repositories/repository_version_id, service=PrivilegeInfo/privilege_id, component=forceRefreshConfigTagsBeforeExecution, host=type, instance=kerberos_descriptor, text='null'}]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(alert37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(alert_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test497"); }

    org.apache.ambari.server.api.predicate.operators.LessEqualsOperator lessEqualsOperator0 = new org.apache.ambari.server.api.predicate.operators.LessEqualsOperator();

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test498"); }

    org.apache.ambari.server.controller.internal.Stack stack3 = null;
    org.apache.ambari.server.topology.Component[] component_array4 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component5 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component5, component_array4);
    org.apache.ambari.server.topology.Configuration configuration7 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl9 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack3, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component5, configuration7, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.Stack stack10 = hostGroupImpl9.getStack();
    org.apache.ambari.server.controller.internal.Stack stack13 = null;
    org.apache.ambari.server.topology.Component[] component_array14 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component15 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component15, component_array14);
    org.apache.ambari.server.topology.Configuration configuration17 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl19 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack13, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component15, configuration17, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.Stack stack20 = hostGroupImpl19.getStack();
    java.util.Collection<org.apache.ambari.server.topology.Component> collection_component21 = hostGroupImpl19.getComponents();
    org.apache.ambari.server.controller.internal.Stack stack24 = null;
    org.apache.ambari.server.topology.Component[] component_array25 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component26 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component26, component_array25);
    org.apache.ambari.server.topology.Configuration configuration28 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl30 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack24, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component26, configuration28, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.Stack stack31 = hostGroupImpl30.getStack();
    java.util.Collection<org.apache.ambari.server.topology.Component> collection_component32 = hostGroupImpl30.getComponents();
    org.apache.ambari.server.controller.internal.Stack stack35 = null;
    org.apache.ambari.server.topology.Component[] component_array36 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component37 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component37, component_array36);
    org.apache.ambari.server.topology.Configuration configuration39 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl41 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack35, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component37, configuration39, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.Stack stack42 = hostGroupImpl41.getStack();
    java.util.Collection<org.apache.ambari.server.topology.Component> collection_component43 = hostGroupImpl41.getComponents();
    java.util.Collection<java.lang.String> collection_str44 = hostGroupImpl41.getServices();
    org.apache.ambari.server.controller.internal.Stack stack47 = null;
    org.apache.ambari.server.controller.internal.Stack stack50 = null;
    org.apache.ambari.server.topology.Component[] component_array51 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component52 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component52, component_array51);
    org.apache.ambari.server.topology.Configuration configuration54 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl56 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack50, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component52, configuration54, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.Stack stack57 = hostGroupImpl56.getStack();
    java.util.Collection<org.apache.ambari.server.topology.Component> collection_component58 = hostGroupImpl56.getComponents();
    org.apache.ambari.server.topology.Configuration configuration59 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl61 = new org.apache.ambari.server.topology.HostGroupImpl("HostRoles/stack_id", "Event/summary/memberships/created", stack47, collection_component58, configuration59, "1.3.6.1.4.1.18060.16.1.1.1.7");
    org.apache.ambari.server.controller.internal.Stack stack64 = null;
    org.apache.ambari.server.topology.Component[] component_array65 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component66 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component66, component_array65);
    org.apache.ambari.server.topology.Configuration configuration68 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl70 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack64, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component66, configuration68, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.Stack stack71 = hostGroupImpl70.getStack();
    org.apache.ambari.server.topology.HostGroup[] hostGroup_array72 = new org.apache.ambari.server.topology.HostGroup[] { hostGroupImpl9, hostGroupImpl19, hostGroupImpl30, hostGroupImpl41, hostGroupImpl61, hostGroupImpl70 };
    java.util.ArrayList<org.apache.ambari.server.topology.HostGroup> arraylist_hostGroup73 = new java.util.ArrayList<org.apache.ambari.server.topology.HostGroup>();
    boolean b74 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.HostGroup>)arraylist_hostGroup73, hostGroup_array72);
    org.apache.ambari.server.controller.internal.Stack stack75 = null;
    org.apache.ambari.server.topology.Configuration configuration76 = null;
    org.apache.ambari.server.state.SecurityType securityType77 = null;
    org.apache.ambari.server.topology.SecurityConfiguration securityConfiguration78 = new org.apache.ambari.server.topology.SecurityConfiguration(securityType77);
    java.lang.String str79 = securityConfiguration78.getDescriptor();
    org.apache.ambari.server.state.SecurityType securityType80 = securityConfiguration78.getType();
    java.util.Collection<java.util.Map<java.lang.String,java.lang.Object>> collection_map_str_obj81 = null;
    org.apache.ambari.server.topology.Setting setting82 = org.apache.ambari.server.topology.SettingFactory.getSetting(collection_map_str_obj81);
    java.util.Set<java.util.HashMap<java.lang.String,java.lang.String>> set_hashmap_str_str84 = setting82.getSettingValue("ViewInstanceInfo/short_url_name");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.BlueprintImpl blueprintImpl85 = new org.apache.ambari.server.topology.BlueprintImpl("Alert/definition_id", (java.util.Collection<org.apache.ambari.server.topology.HostGroup>)arraylist_hostGroup73, stack75, configuration76, securityConfiguration78, setting82);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stack10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stack20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_component21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stack31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_component32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stack42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_component43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stack57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_component58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stack71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostGroup_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(securityType80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(setting82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_hashmap_str_str84);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test499"); }

    org.apache.ambari.server.api.resources.ExtensionLinkResourceDefinition extensionLinkResourceDefinition0 = new org.apache.ambari.server.api.resources.ExtensionLinkResourceDefinition();
    java.lang.String str1 = extensionLinkResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "links"+ "'", str1.equals("links"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test500"); }

    org.apache.ambari.server.topology.HostGroupInfo hostGroupInfo1 = new org.apache.ambari.server.topology.HostGroupInfo("AMBARI_SECURITY_MASTER_KEY");
    java.util.Collection<java.lang.String> collection_str2 = hostGroupInfo1.getHostNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);

  }

}
