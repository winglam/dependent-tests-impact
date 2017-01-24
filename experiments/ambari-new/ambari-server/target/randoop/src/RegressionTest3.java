
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }

    org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY pADDING_STRATEGY0 = org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY.NONE;
    org.apache.ambari.server.controller.metrics.MetricsPaddingMethod metricsPaddingMethod1 = new org.apache.ambari.server.controller.metrics.MetricsPaddingMethod(pADDING_STRATEGY0);
    org.junit.Assert.assertTrue("'" + pADDING_STRATEGY0 + "' != '" + org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY.NONE + "'", pADDING_STRATEGY0.equals(org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY.NONE));

  }

  @Test
  public void test002() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }

    // org.apache.ambari.server.checks.HostsRepositoryVersionCheck hostsRepositoryVersionCheck0 = new org.apache.ambari.server.checks.HostsRepositoryVersionCheck();
    // org.apache.ambari.server.state.Cluster cluster2 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType3 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction4 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj5 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext6 = new org.apache.ambari.server.state.UpgradeContext(cluster2, upgradeType3, direction4, map_str_obj5);
    // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest7 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType3);
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType8 = prereqCheckRequest7.getUpgradeType();
    // boolean b9 = hostsRepositoryVersionCheck0.isApplicable(prereqCheckRequest7);
    // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest11 = new org.apache.ambari.server.controller.PrereqCheckRequest("server.jdbc.properties.");
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType12 = prereqCheckRequest11.getUpgradeType();
    // boolean b13 = hostsRepositoryVersionCheck0.isApplicable(prereqCheckRequest11);
    // org.junit.Assert.assertTrue("'" + upgradeType3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType3.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    // org.junit.Assert.assertTrue("'" + upgradeType8 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType8.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b9 == false);
    // org.junit.Assert.assertTrue("'" + upgradeType12 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING + "'", upgradeType12.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }

    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS0 = org.apache.ambari.server.api.services.ResultStatus.STATUS.ACCEPTED;
    org.junit.Assert.assertTrue("'" + sTATUS0 + "' != '" + org.apache.ambari.server.api.services.ResultStatus.STATUS.ACCEPTED + "'", sTATUS0.equals(org.apache.ambari.server.api.services.ResultStatus.STATUS.ACCEPTED));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }

    org.apache.ambari.server.orm.dao.ClusterStateDAO clusterStateDAO0 = new org.apache.ambari.server.orm.dao.ClusterStateDAO();
    org.apache.ambari.server.orm.entities.ClusterStateEntity clusterStateEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    clusterStateDAO0.refresh(clusterStateEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }

    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.AccessUnauthorizedAuditEventBuilder accessUnauthorizedAuditEventBuilder0 = org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.builder();
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent accessUnauthorizedAuditEvent1 = accessUnauthorizedAuditEventBuilder0.build();
    java.lang.Long long2 = accessUnauthorizedAuditEvent1.getTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessUnauthorizedAuditEvent1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }

    org.apache.ambari.server.api.predicate.operators.FilterOperator filterOperator0 = new org.apache.ambari.server.api.predicate.operators.FilterOperator();
    java.lang.String str1 = filterOperator0.getName();
    java.lang.String str2 = filterOperator0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FilterOperator"+ "'", str1.equals("FilterOperator"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FilterOperator"+ "'", str2.equals("FilterOperator"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str3 = valueAttributesInfo0.getIncrementStep();
    valueAttributesInfo0.setDelete("operation");
    java.lang.String str6 = valueAttributesInfo0.getPropertyFileName();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }

    org.apache.ambari.server.orm.JPATableGenerationStrategy jPATableGenerationStrategy0 = org.apache.ambari.server.orm.JPATableGenerationStrategy.NONE;
    org.junit.Assert.assertTrue("'" + jPATableGenerationStrategy0 + "' != '" + org.apache.ambari.server.orm.JPATableGenerationStrategy.NONE + "'", jPATableGenerationStrategy0.equals(org.apache.ambari.server.orm.JPATableGenerationStrategy.NONE));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }

    org.apache.ambari.server.bootstrap.BootStrapPostStatus bootStrapPostStatus0 = new org.apache.ambari.server.bootstrap.BootStrapPostStatus();
    bootStrapPostStatus0.setLog("ambari_db_rca_driver");

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }

    org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager metricsCollectorHAManager0 = new org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager();
    boolean b1 = metricsCollectorHAManager0.isEmpty();
    java.lang.String str3 = metricsCollectorHAManager0.getCollectorHost("hostRoleCommandStatusCacheExpiryDurationMins");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }

    org.apache.ambari.server.controller.ExtensionRequest extensionRequest1 = new org.apache.ambari.server.controller.ExtensionRequest("Artifacts/artifact_name");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }

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
    org.apache.ambari.server.audit.AuditLoggerDefaultImpl auditLoggerDefaultImpl15 = new org.apache.ambari.server.audit.AuditLoggerDefaultImpl(configuration5);
    int i16 = configuration5.getTwoWayAuthPort();
    
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
    org.junit.Assert.assertTrue(i16 == 8441);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }

    org.apache.ambari.server.controller.StackRequest stackRequest1 = new org.apache.ambari.server.controller.StackRequest("service_advisor.py");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo0 = new org.apache.ambari.server.state.ChangedConfigInfo();
    changedConfigInfo0.setOldValue("component_category");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }

    org.apache.ambari.server.controller.logging.LogQueryResponse logQueryResponse0 = new org.apache.ambari.server.controller.logging.LogQueryResponse();
    java.lang.String str1 = logQueryResponse0.getResultSize();
    java.lang.String str2 = logQueryResponse0.getQueryTimeMS();
    java.lang.String str3 = logQueryResponse0.getStartIndex();
    logQueryResponse0.setQueryTimeMS("upgrade_direction");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }

    org.apache.ambari.server.state.CredentialStoreInfo credentialStoreInfo0 = new org.apache.ambari.server.state.CredentialStoreInfo();

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }

    org.apache.ambari.server.api.services.ClusterKerberosDescriptorService clusterKerberosDescriptorService1 = new org.apache.ambari.server.api.services.ClusterKerberosDescriptorService("StackLevelConfigurations/type");
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = clusterKerberosDescriptorService1.getKerberosDescriptors(httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }

    org.apache.hadoop.metrics2.sink.timeline.TimelineMetric timelineMetric0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.MetricsDownsamplingMethod metricsDownsamplingMethod1 = org.apache.ambari.server.controller.metrics.MetricsDownsamplingMethodFactory.detectDownsamplingMethod(timelineMetric0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }

    org.apache.ambari.server.audit.request.eventcreator.UpgradeItemEventCreator upgradeItemEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.UpgradeItemEventCreator();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance4 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest5 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders1, requestBody2, uriInfo3, resourceInstance4);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS6 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus7 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS6);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS8 = resultStatus7.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS9 = resultStatus7.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl10 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.audit.event.AuditEvent auditEvent11 = upgradeItemEventCreator0.createAuditEvent((org.apache.ambari.server.api.services.Request)postRequest5, (org.apache.ambari.server.api.services.Result)resultImpl10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS9);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }

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
    users6.setUserActive("ThemeInfo/default", true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }

    org.springframework.security.core.Authentication authentication0 = null;
    org.apache.ambari.server.security.authorization.ResourceType resourceType1 = org.apache.ambari.server.security.authorization.ResourceType.CLUSTER;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization3 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_ALERTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization4 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array5 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization3, roleAuthorization4 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization6 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization6, roleAuthorization_array5);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.authorization.AuthorizationHelper.verifyAuthorization(authentication0, resourceType1, (java.lang.Long)100L, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization6);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + resourceType1 + "' != '" + org.apache.ambari.server.security.authorization.ResourceType.CLUSTER + "'", resourceType1.equals(org.apache.ambari.server.security.authorization.ResourceType.CLUSTER));
    org.junit.Assert.assertTrue("'" + roleAuthorization3 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_ALERTS + "'", roleAuthorization3.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_ALERTS));
    org.junit.Assert.assertTrue("'" + roleAuthorization4 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE + "'", roleAuthorization4.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.SCHEMA_IS_NOT_SUPPORTED_MESSAGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Configuration format provided in Blueprint is not supported"+ "'", str0.equals("Configuration format provided in Blueprint is not supported"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController6 = null;
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider activeWidgetLayoutResourceProvider7 = new org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider(ambariManagementController6);
    java.util.Set<java.lang.String> set_str8 = activeWidgetLayoutResourceProvider7.getCategoryIds();
    org.apache.ambari.server.controller.ExtensionLinkResponse extensionLinkResponse9 = new org.apache.ambari.server.controller.ExtensionLinkResponse("service", "Clusters/total_hosts", "Repositories/latest_base_url", "Request_Info/asc_order", "_SERVICE_CHECK", false, (java.util.Collection<java.lang.String>)set_str8);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController10 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider11 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController10);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str12 = ldapSyncEventResourceProvider11.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController13 = null;
    org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider rootServiceHostComponentResourceProvider14 = new org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider(set_str8, map_type_str12, ambariManagementController13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str12);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }

    org.apache.ambari.server.controller.logging.LogSearchDataRetrievalService logSearchDataRetrievalService0 = new org.apache.ambari.server.controller.logging.LogSearchDataRetrievalService();
    boolean b1 = logSearchDataRetrievalService0.isRunning();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }

    org.apache.ambari.server.state.Cluster cluster0 = null;
    org.apache.ambari.server.utils.RetryHelper.addAffectedCluster(cluster0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.MASTER_KEYSTORE_FILENAME_DEFAULT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "credentials.jceks"+ "'", str0.equals("credentials.jceks"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }

    com.google.gson.JsonParser jsonParser0 = org.apache.ambari.server.utils.JsonUtils.jsonParser;
    org.apache.ambari.server.utils.JsonUtils.jsonParser = jsonParser0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jsonParser0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }

    org.apache.ambari.server.controller.internal.UpgradeResourceProvider.ConfigurationPackBuilder configurationPackBuilder0 = new org.apache.ambari.server.controller.internal.UpgradeResourceProvider.ConfigurationPackBuilder();

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }

    org.apache.ambari.server.state.CredentialStoreInfo credentialStoreInfo2 = new org.apache.ambari.server.state.CredentialStoreInfo((java.lang.Boolean)false, (java.lang.Boolean)false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.lang.String str4 = hostResponse1.getRackInfo();
    int i5 = hostResponse1.getCpuCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyResponse stackConfigurationDependencyResponse1 = new org.apache.ambari.server.controller.StackConfigurationDependencyResponse("forceRefreshConfigTagsBeforeExecution");
    java.lang.String str2 = stackConfigurationDependencyResponse1.getStackName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }

    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder2 = viewPrivilegeChangeRequestAuditEventBuilder0.withVersion("Artifacts/service_name");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder4 = viewPrivilegeChangeRequestAuditEventBuilder0.withVersion("WidgetInfo/metrics");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder6 = viewPrivilegeChangeRequestAuditEventBuilder0.withOperation("timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder8 = viewPrivilegeChangeRequestAuditEventBuilder6.withRemoteIp("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder8);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }

    org.apache.ambari.server.orm.entities.BlueprintEntity blueprintEntity0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.BlueprintImpl blueprintImpl1 = new org.apache.ambari.server.topology.BlueprintImpl(blueprintEntity0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }

    org.apache.ambari.server.serveraction.users.PostUserCreationHookServerAction postUserCreationHookServerAction0 = new org.apache.ambari.server.serveraction.users.PostUserCreationHookServerAction();
    org.apache.ambari.server.agent.ExecutionCommand executionCommand1 = postUserCreationHookServerAction0.getExecutionCommand();
    java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Object> concurrentmap_str_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.CommandReport commandReport3 = postUserCreationHookServerAction0.execute(concurrentmap_str_obj2);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
    } catch (org.apache.ambari.server.AmbariException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(executionCommand1);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.SYSTEM_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/system"+ "'", str0.equals("ViewVersionInfo/system"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }

    org.apache.ambari.server.serveraction.kerberos.FinalizeKerberosServerAction finalizeKerberosServerAction0 = new org.apache.ambari.server.serveraction.kerberos.FinalizeKerberosServerAction();
    java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Object> concurrentmap_str_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.CommandReport commandReport2 = finalizeKerberosServerAction0.execute(concurrentmap_str_obj1);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
    } catch (org.apache.ambari.server.AmbariException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }

    org.apache.ambari.server.view.ViewRegistry viewRegistry0 = null;
    org.apache.ambari.server.view.ViewDataMigrationUtility viewDataMigrationUtility1 = new org.apache.ambari.server.view.ViewDataMigrationUtility(viewRegistry0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }

    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor2 = null;
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor3 = null;
    org.apache.ambari.server.collections.Predicate predicate4 = null;
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor5 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor("RootServiceComponents/ciphers", "StackConfigurations/property_value_attributes", kerberosPrincipalDescriptor2, kerberosKeytabDescriptor3, predicate4);
    org.apache.ambari.server.state.CheckHelper checkHelper6 = new org.apache.ambari.server.state.CheckHelper();
    boolean b7 = kerberosIdentityDescriptor5.equals((java.lang.Object)checkHelper6);
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor8 = kerberosIdentityDescriptor5.getKeytabDescriptor();
    java.lang.String str9 = kerberosIdentityDescriptor5.getName();
    kerberosIdentityDescriptor5.setReference("${ambariVersion}");
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor12 = kerberosIdentityDescriptor5.getKeytabDescriptor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(kerberosKeytabDescriptor8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "RootServiceComponents/ciphers"+ "'", str9.equals("RootServiceComponents/ciphers"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(kerberosKeytabDescriptor12);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity,java.lang.Long> singularattribute_alertTargetEntity_long0 = null;
    org.apache.ambari.server.orm.entities.AlertTargetEntity_.targetId = singularattribute_alertTargetEntity_long0;

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }

    org.apache.ambari.server.utils.JaxbMapKeyVal jaxbMapKeyVal2 = new org.apache.ambari.server.utils.JaxbMapKeyVal("type", "max-age=31536000");
    jaxbMapKeyVal2.value = "Event/summary/memberships/removed";
    jaxbMapKeyVal2.key = "recovery_lifetime_max_count";

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.EXECUTION_SCHEDULER_CONNECTIONS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }

    org.apache.ambari.server.api.services.ExtensionLinksService extensionLinksService0 = new org.apache.ambari.server.api.services.ExtensionLinksService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = extensionLinksService0.updateExtensionLink("service_advisor.py", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.PAM_CONFIGURATION_FILE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }

    org.apache.ambari.server.state.AlertState alertState6 = null;
    org.apache.ambari.server.state.Alert alert7 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState6);
    org.apache.ambari.server.events.AlertReceivedEvent alertReceivedEvent8 = new org.apache.ambari.server.events.AlertReceivedEvent(0L, alert7);
    alert7.setCluster("RecoveryReport{summary='DISABLED', component_reports='[]'}");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }

    org.apache.ambari.server.audit.request.eventcreator.CredentialEventCreator credentialEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.CredentialEventCreator();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.SETTING_NAME_COL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "setting_name"+ "'", str0.equals("setting_name"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.Long> singularattribute_alertHistoryEntity_long0 = null;
    org.apache.ambari.server.orm.entities.AlertHistoryEntity_.clusterId = singularattribute_alertHistoryEntity_long0;

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_CONNECTION_POOL_IDLE_TEST_INTERVAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionLinkResourceProvider.STACK_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ExtensionLink/stack_name"+ "'", str0.equals("ExtensionLink/stack_name"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = null;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_HIVE_ROLLING_WARNING = checkDescription0;

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }

    org.apache.ambari.server.api.services.TaskService taskService3 = new org.apache.ambari.server.api.services.TaskService("common-services", "Versions/active", "AlertNotice/service_name");

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }

    org.apache.ambari.server.api.predicate.PredicateCompiler predicateCompiler0 = new org.apache.ambari.server.api.predicate.PredicateCompiler();

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.RootServiceHostComponentResourceDefinition rootServiceHostComponentResourceDefinition1 = new org.apache.ambari.server.api.resources.RootServiceHostComponentResourceDefinition(type0);
    java.lang.String str2 = rootServiceHostComponentResourceDefinition1.getPluralName();
    java.util.List<org.apache.ambari.server.api.resources.ResourceDefinition.PostProcessor> list_postProcessor3 = rootServiceHostComponentResourceDefinition1.getPostProcessors();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hostComponents"+ "'", str2.equals("hostComponents"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_postProcessor3);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.VIEWS_HTTP_X_FRAME_OPTIONS_HEADER_VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }

    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = addUserToGroupRequestAuditEventBuilder0.withUrl("Upgrade");
    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder4 = addUserToGroupRequestAuditEventBuilder0.withUrl("recovery_type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder4);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }

    org.apache.ambari.server.view.configuration.PermissionConfig permissionConfig0 = new org.apache.ambari.server.view.configuration.PermissionConfig();
    java.lang.String str1 = permissionConfig0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test057() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }

    // java.lang.String[] str_array18 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    // java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
    // boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str19, str_array18);
    // org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent21 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str19);
    // org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str19;
    // org.apache.ambari.server.controller.AmbariManagementController ambariManagementController23 = null;
    // org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider24 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController23);
    // java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str25 = ldapSyncEventResourceProvider24.getKeyPropertyIds();
    // org.apache.ambari.server.controller.AmbariManagementController ambariManagementController26 = null;
    // com.google.inject.Injector injector27 = null;
    // org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider28 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str19, map_type_str25, ambariManagementController26, injector27);
    // org.apache.ambari.server.api.resources.JobResourceDefinition jobResourceDefinition29 = new org.apache.ambari.server.api.resources.JobResourceDefinition();
    // org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer31 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    // org.apache.ambari.server.controller.spi.ProviderModule providerModule32 = null;
    // org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl33 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule32);
    // metricsPaddingRenderer31.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl33);
    // org.apache.ambari.server.api.query.QueryImpl queryImpl35 = new org.apache.ambari.server.api.query.QueryImpl(map_type_str25, (org.apache.ambari.server.api.resources.ResourceDefinition)jobResourceDefinition29, (org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl33);
    // org.apache.ambari.server.controller.spi.PageRequest pageRequest36 = null;
    // queryImpl35.setPageRequest(pageRequest36);
    // org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer39 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    // queryImpl35.setRenderer((org.apache.ambari.server.api.query.render.Renderer)metricsPaddingRenderer39);
    // queryImpl35.addLocalProperty("yarn.scheduler.capacity.root.queues");
    // java.util.Set<java.lang.String> set_str43 = queryImpl35.getProperties();
    // org.apache.ambari.server.state.Cluster cluster44 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType45 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction46 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj47 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext48 = new org.apache.ambari.server.state.UpgradeContext(cluster44, upgradeType45, direction46, map_str_obj47);
    // boolean b49 = queryImpl35.equals((java.lang.Object)direction46);
    // java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str50 = queryImpl35.getKeyValueMap();
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(str_array18);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b20 == true);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(map_type_str25);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(set_str43);
    // org.junit.Assert.assertTrue("'" + upgradeType45 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType45.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b49 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(map_type_str50);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }

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
    java.util.List<org.apache.ambari.server.upgrade.UpgradeCatalog> list_upgradeCatalog15 = null;
    schemaUpgradeHelper14.executePreDMLUpdates(list_upgradeCatalog15);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = schemaUpgradeHelper14.readSourceVersion();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }

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
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = cluster20.getProperties();
    java.lang.String str22 = cluster20.getColo();
    
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
    org.junit.Assert.assertNotNull(map_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hostRoleCommandStatusCacheExpiryDurationMins"+ "'", str22.equals("hostRoleCommandStatusCacheExpiryDurationMins"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.OracleHelper oracleHelper1 = new org.apache.ambari.server.orm.helpers.dbms.OracleHelper(databasePlatform0);
    boolean b2 = oracleHelper1.supportsColumnTypeChange();
    java.lang.String[] str_array10 = new java.lang.String[] { "blueprint_setting", "privilege", "AlertHistory/id", "config" };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = oracleHelper1.getCreateIndexStatement("ViewVersionInfo/min_ambari_version", "StackLevelConfigurations/property_description", true, str_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler.KERBEROS_ENV_PRINCIPAL_CONTAINER_DN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "container_dn"+ "'", str0.equals("container_dn"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UserAuthorizationResourceProvider.USERNAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AuthorizationInfo/user_name"+ "'", str0.equals("AuthorizationInfo/user_name"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    int i5 = postRequest4.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type6 = postRequest4.getRequestType();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.SortRequest sortRequest7 = postRequest4.getSortRequest();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type6.equals(org.apache.ambari.server.api.services.Request.Type.POST));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }

    org.apache.ambari.server.state.stack.UpgradePack.IntermediateStack intermediateStack0 = new org.apache.ambari.server.state.stack.UpgradePack.IntermediateStack();
    java.lang.String str1 = intermediateStack0.version;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentProcessResourceProvider.HC_PROCESS_STATUS_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostComponentProcess/status"+ "'", str0.equals("HostComponentProcess/status"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }

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
    java.util.Map<java.lang.String,java.lang.String> map_str_str42 = queryImpl35.getRequestInfoProps();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.Predicate predicate43 = queryImpl35.getPredicate();
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
    org.junit.Assert.assertNotNull(map_type_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str42);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.Stack stack3 = new org.apache.ambari.server.controller.internal.Stack("provision_action", "", ambariManagementController2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer transfer0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer();
    java.lang.String str1 = transfer0.toString();
    org.apache.ambari.server.state.stack.upgrade.TransferCoercionType transferCoercionType2 = transfer0.coerceTo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Transfer{operation=null, fromType='null', fromKey='null', toKey='null', deleteKey='null', preserveEdits=false, defaultValue='null', coerceTo=null, ifKey='null', ifType='null', ifValue='null', ifKeyState='null', keepKeys=[]}"+ "'", str1.equals("Transfer{operation=null, fromType='null', fromKey='null', toKey='null', deleteKey='null', preserveEdits=false, defaultValue='null', coerceTo=null, ifKey='null', ifType='null', ifValue='null', ifKeyState='null', keepKeys=[]}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferCoercionType2);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }

    org.apache.ambari.server.view.configuration.AutoInstanceConfig autoInstanceConfig0 = new org.apache.ambari.server.view.configuration.AutoInstanceConfig();
    java.lang.String str1 = autoInstanceConfig0.getDescription();
    java.lang.String str2 = autoInstanceConfig0.getIcon();
    java.util.Set<java.lang.String> set_str3 = autoInstanceConfig0.getRoles();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_str3);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }

    java.util.List<org.apache.ambari.server.state.RepositoryInfo> list_repositoryInfo0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.apache.ambari.server.controller.RepositoryResponse> list_repositoryResponse4 = org.apache.ambari.server.stack.RepoUtil.asResponses(list_repositoryInfo0, "Clusters/desired_configs", "AlertGroup/id", "AMBARI_SECURITY_MASTER_KEY");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.orm.dao.GroupDAO groupDAO4 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO5 = null;
    org.apache.ambari.server.security.authorization.Users users6 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.controller.internal.UserPrivilegeResourceProvider.init(userDAO0, clusterDAO3, groupDAO4, viewInstanceDAO5, users6);
    org.apache.ambari.server.orm.entities.UserEntity userEntity8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = users6.isUserCanBeRemoved(userEntity8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider.REPOSITORY_VERSION_STACK_SERVICES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CompatibleRepositoryVersions/stack_services"+ "'", str0.equals("CompatibleRepositoryVersions/stack_services"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.ONE_DIR_PER_PARITION_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "one_dir_per_partition"+ "'", str0.equals("one_dir_per_partition"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }

    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule1 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule0);
    org.apache.ambari.server.controller.spi.Resource.Type type2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.ResourceProvider resourceProvider3 = viewProviderModule1.getResourceProvider(type2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule1);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }

    int i0 = org.apache.ambari.server.configuration.Configuration.PROCESSOR_BASED_THREADPOOL_CORE_SIZE_DEFAULT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 16);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }

    org.apache.ambari.server.api.services.UserService userService0 = new org.apache.ambari.server.api.services.UserService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = userService0.createUser("", httpHeaders2, uriInfo3, "instances");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }

    org.apache.ambari.server.metrics.system.impl.MetricsConfiguration metricsConfiguration0 = org.apache.ambari.server.metrics.system.impl.MetricsConfiguration.getMetricsConfiguration();
    java.lang.String str2 = metricsConfiguration0.getProperty("Repositories/latest_base_url");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(metricsConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.VIEW_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/version"+ "'", str0.equals("ViewInstanceInfo/version"));

  }

  @Test
  public void test079() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }

    // org.apache.ambari.server.state.Cluster cluster0 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType1 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction2 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj3 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext4 = new org.apache.ambari.server.state.UpgradeContext(cluster0, upgradeType1, direction2, map_str_obj3);
    // java.lang.String str6 = upgradeContext4.getServiceDisplay("");
    // upgradeContext4.setServiceDisplay("", "Users/user_type");
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }

    java.util.regex.Pattern pattern2 = org.apache.ambari.server.checks.HardcodedStackVersionPropertiesCheck.getHardcodeSearchPattern("cluster_id");
    boolean b3 = org.apache.ambari.server.checks.HardcodedStackVersionPropertiesCheck.stringContainsVersionHardcode("StackLevelConfigurations/property_depends_on", pattern2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pattern2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }

    org.apache.ambari.server.topology.PersistedStateImpl persistedStateImpl0 = new org.apache.ambari.server.topology.PersistedStateImpl();
    org.apache.ambari.server.state.Host host1 = null;
    // The following exception was thrown during execution in test generation
    try {
    persistedStateImpl0.registerInTopologyHostInfo(host1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PermissionResourceProvider.PERMISSION_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PermissionInfo/permission_id"+ "'", str0.equals("PermissionInfo/permission_id"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.AGENT_TASK_TIMEOUT;
    java.lang.Long long1 = configurationproperty_long0.getDefaultValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_long0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 900L+ "'", long1.equals(900L));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }

    org.apache.ambari.server.controller.spi.Resource resource0 = null;
    org.apache.ambari.server.controller.spi.Resource[] resource_array1 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource2 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource2, resource_array1);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl7 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource2, true, false, (int)'#');
    org.apache.ambari.server.controller.spi.RequestStatusMetaData requestStatusMetaData8 = null;
    org.apache.ambari.server.controller.internal.RequestStatusImpl requestStatusImpl9 = new org.apache.ambari.server.controller.internal.RequestStatusImpl(resource0, (java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource2, requestStatusMetaData8);
    org.apache.ambari.server.controller.spi.Resource resource11 = null;
    org.apache.ambari.server.controller.spi.Resource resource12 = null;
    org.apache.ambari.server.controller.internal.PageResponseImpl pageResponseImpl14 = new org.apache.ambari.server.controller.internal.PageResponseImpl((java.lang.Iterable<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource2, 20000, resource11, resource12, (java.lang.Integer)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }

    org.apache.ambari.server.orm.dao.ViewDAO viewDAO0 = new org.apache.ambari.server.orm.dao.ViewDAO();
    org.apache.ambari.server.orm.entities.ViewEntity viewEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    viewDAO0.refresh(viewEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }

    org.apache.ambari.server.api.handlers.DeleteHandler deleteHandler0 = new org.apache.ambari.server.api.handlers.DeleteHandler();

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType3 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = mITKerberosOperationHandler0.principalExists("Stage/status");
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }

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
    stackConfigurationResponse12.setRequired((java.lang.Boolean)true);
    
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
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.VIEWS_VALIDATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test090() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }

    // org.apache.ambari.server.state.UpgradeHelper upgradeHelper0 = new org.apache.ambari.server.state.UpgradeHelper();
    // java.util.Map<org.apache.ambari.server.state.Service,java.util.Set<org.apache.ambari.server.state.ServiceComponent>> map_service_set_serviceComponent2 = null;
    // // The following exception was thrown during execution in test generation
    // try {
    // upgradeHelper0.putComponentsToUpgradingState("ViewInstanceInfo/version", map_service_set_serviceComponent2);
    //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // } catch (java.lang.NullPointerException e) {
    //   // Expected exception.
    // }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }

    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider5 = new org.apache.ambari.server.controller.internal.URLStreamProvider(1200, (-1), "ambari.dispatch.snmp.security.priv.passphrase", "OperatingSystems/version_definition_id", "timeline.metrics.cluster.aggregator.minute.ttl");
    byte[] byte_array13 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)0, (byte)1 };
    byte[] byte_array18 = new byte[] { (byte)10, (byte)-1, (byte)1, (byte)100 };
    byte[] byte_array20 = new byte[] { (byte)-1 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult21 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array13, byte_array18, byte_array20);
    byte[] byte_array27 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)0, (byte)1 };
    byte[] byte_array32 = new byte[] { (byte)10, (byte)-1, (byte)1, (byte)100 };
    byte[] byte_array34 = new byte[] { (byte)-1 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult35 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array27, byte_array32, byte_array34);
    byte[] byte_array40 = new byte[] { (byte)1, (byte)100, (byte)1, (byte)10 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult41 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array13, byte_array32, byte_array40);
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str42 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.net.HttpURLConnection httpURLConnection43 = uRLStreamProvider5.processURL("UpgradeChecks/cluster_name", "blueprint_name", byte_array32, map_str_list_str42);
      org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.GroupResourceProvider.GROUP_GROUPTYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Groups/group_type"+ "'", str0.equals("Groups/group_type"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.SERVER_STALE_CONFIG_CACHE_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.state.Cluster cluster5 = null;
    // The following exception was thrown during execution in test generation
    try {
    clustersImpl4.invalidate(cluster5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }

    org.apache.ambari.server.state.ConfigMergeHelper.ThreeWayValue threeWayValue0 = new org.apache.ambari.server.state.ConfigMergeHelper.ThreeWayValue();
    threeWayValue0.oldStackValue = "security";
    threeWayValue0.oldStackValue = "600";
    threeWayValue0.savedValue = "Alert/text";

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    java.util.Collection<java.lang.String> collection_str2 = componentModule1.getErrors();
    boolean b3 = componentModule1.isDeleted();
    org.apache.ambari.server.state.ComponentInfo componentInfo4 = componentModule1.getModuleInfo();
    java.util.List<org.apache.ambari.server.state.DependencyInfo> list_dependencyInfo5 = componentInfo4.getDependencies();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentInfo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_dependencyInfo5);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }

    org.apache.ambari.server.state.ExtensionInfo extensionInfo0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.ExtensionId extensionId1 = new org.apache.ambari.server.state.ExtensionId(extensionInfo0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.propertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_str0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/upgrade_type"+ "'", str0.equals("Upgrade/upgrade_type"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }

    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse7 = new org.apache.ambari.server.controller.RepositoryResponse("Actions/target_service", "1.3.6.1.4.1.18060.16", "PermissionInfo/permission_name", "Versions/valid", "StackConfigurations/property_name", "QuickLinkInfo/default", "RUNNING");
    java.lang.String str8 = repositoryResponse7.getOsType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.3.6.1.4.1.18060.16"+ "'", str8.equals("1.3.6.1.4.1.18060.16"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider1 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController0);
    org.apache.ambari.server.controller.spi.Request request2 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate3 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus4 = widgetResourceProvider1.deleteResources(request2, predicate3);
    org.apache.ambari.server.controller.internal.SimplifyingPredicateVisitor simplifyingPredicateVisitor5 = new org.apache.ambari.server.controller.internal.SimplifyingPredicateVisitor((org.apache.ambari.server.controller.spi.ResourceProvider)widgetResourceProvider1);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController6 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider7 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController6);
    org.apache.ambari.server.controller.spi.Request request8 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate9 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus10 = widgetResourceProvider7.deleteResources(request8, predicate9);
    java.lang.String[] str_array13 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request14 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array13);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus15 = widgetResourceProvider7.createResources(request14);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController16 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider17 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController16);
    java.lang.String[] str_array20 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request21 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array20);
    org.apache.ambari.server.controller.spi.Request request22 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array20);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate25 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate26 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array27 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate26 };
    org.apache.ambari.server.controller.spi.Predicate predicate28 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array27);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate29 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array27);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate32 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate35 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array36 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate25, andPredicate29, filterPredicate32, filterPredicate35 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate37 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array36);
    org.apache.ambari.server.actionmanager.ActionType actionType39 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType44 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array46 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization47 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization47, roleAuthorization_array46);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition49 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType39, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType44, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization47);
    boolean b50 = andPredicate37.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate51 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj52 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor53 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj52);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate51, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor53);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate55 = null;
    extendedResourcePredicateVisitor53.acceptUnaryPredicate(unaryPredicate55);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate37, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor53);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource58 = compatibleRepositoryVersionResourceProvider17.getResources(request22, (org.apache.ambari.server.controller.spi.Predicate)andPredicate37);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource59 = widgetResourceProvider1.getResources(request14, (org.apache.ambari.server.controller.spi.Predicate)andPredicate37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource58);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostUpgradeEvent serviceComponentHostUpgradeEvent4 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostUpgradeEvent("Artifacts/service_name", "keytab_file_is_cachable", 300000L, "StackLevelConfigurations/property_depends_on");

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }

    org.apache.ambari.server.view.ViewRegistry viewRegistry0 = org.apache.ambari.server.view.ViewRegistry.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(viewRegistry0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterKerberosDescriptorResourceProvider.CLUSTER_KERBEROS_DESCRIPTOR_CLUSTER_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "KerberosDescriptor/cluster_name"+ "'", str0.equals("KerberosDescriptor/cluster_name"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.REMOTE_AMBARI_CLUSTER_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "remoteambaricluster"+ "'", str0.equals("remoteambaricluster"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_CLUSTER_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/cluster_name"+ "'", str0.equals("HostRoles/cluster_name"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getPropertyIds(map_str_map_str_propertyInfo0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }

    org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType syncType0 = org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.SPECIFIC;
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    org.apache.ambari.server.controller.LdapSyncRequest ldapSyncRequest2 = new org.apache.ambari.server.controller.LdapSyncRequest(syncType0, set_str1);
    org.junit.Assert.assertTrue("'" + syncType0 + "' != '" + org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.SPECIFIC + "'", syncType0.equals(org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.SPECIFIC));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str3 = valueAttributesInfo0.getIncrementStep();
    valueAttributesInfo0.setDelete("operation");
    valueAttributesInfo0.setSelectionCardinality("Credential/key");
    java.lang.String str8 = valueAttributesInfo0.getMaximum();
    java.lang.String str9 = valueAttributesInfo0.getCopy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    java.lang.StringBuilder stringBuilder2 = null;
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.StringBuilder stringBuilder4 = mySqlHelper1.writeColumnType(stringBuilder2, dBColumnInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.agent.ActionQueue actionQueue5 = null;
    org.apache.ambari.server.actionmanager.ActionManager actionManager6 = null;
    com.google.inject.Injector injector8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.HeartbeatMonitor heartbeatMonitor9 = new org.apache.ambari.server.agent.HeartbeatMonitor((org.apache.ambari.server.state.Clusters)clustersImpl4, actionQueue5, actionManager6, (int)'a', injector8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }

    org.apache.ambari.server.view.ViewArchiveUtility viewArchiveUtility0 = new org.apache.ambari.server.view.ViewArchiveUtility();
    java.io.File file2 = viewArchiveUtility0.getFile("Versions/active");
    javax.xml.validation.Validator validator3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.StackManager.validateAllPropertyXmlsInFolderRecursively(file2, validator3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }

    org.apache.ambari.server.api.services.ResultImpl resultImpl1 = new org.apache.ambari.server.api.services.ResultImpl(false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_CONNECTION_POOL_MAX_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.keyPropertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }

    org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator privilegeEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type1 = privilegeEventCreator0.getResourceTypes();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type2 = privilegeEventCreator0.getResourceTypes();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS3 = privilegeEventCreator0.getResultStatuses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS3);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }

    org.apache.ambari.server.ParentObjectNotFoundException parentObjectNotFoundException2 = new org.apache.ambari.server.ParentObjectNotFoundException("cluster_id");
    org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException kerberosAdminAuthenticationException3 = new org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException("Tasks/status", (java.lang.Throwable)parentObjectNotFoundException2);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }

    org.apache.ambari.server.state.host.HostStatusUpdatesReceivedEvent hostStatusUpdatesReceivedEvent2 = new org.apache.ambari.server.state.host.HostStatusUpdatesReceivedEvent("AMBARI_SECURITY_MASTER_KEY", 0L);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertGroupResourceProvider.ALERT_GROUP_TARGETS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertGroup/targets"+ "'", str0.equals("AlertGroup/targets"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }

    org.apache.ambari.server.utils.HostAndPort hostAndPort2 = new org.apache.ambari.server.utils.HostAndPort("privilege", (int)' ');
    hostAndPort2.port = 16;

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }

    org.apache.ambari.server.state.quicklinks.Protocol protocol0 = new org.apache.ambari.server.state.quicklinks.Protocol();
    org.apache.ambari.server.state.quicklinks.Protocol protocol1 = new org.apache.ambari.server.state.quicklinks.Protocol();
    org.apache.ambari.server.state.quicklinks.Check[] check_array2 = new org.apache.ambari.server.state.quicklinks.Check[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check> arraylist_check3 = new java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check3, check_array2);
    protocol1.setChecks((java.util.List<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check3);
    protocol0.setChecks((java.util.List<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(check_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }

    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array0 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo1 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo1, propertyInfo_array0);
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo4 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo1, map_str_str3);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str5 = configurationInfo4.getAttributes();
    java.util.Set<java.lang.String> set_str6 = org.apache.ambari.server.controller.metrics.ThreadPoolEnabledPropertyProvider.healthyStates;
    configurationInfo4.addErrors((java.util.Collection<java.lang.String>)set_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_map_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str6);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }

    org.apache.ambari.server.state.stack.StackMetainfoXml stackMetainfoXml0 = new org.apache.ambari.server.state.stack.StackMetainfoXml();
    java.lang.String[] str_array58 = new java.lang.String[] { "security", "alerts.json", "Artifacts/artifact_name", "widgets.json", "ambari.dispatch.snmp.oids.body", "", "type", "alerts.json", "RootServiceComponents/ciphers", "notification.dispatch.alert.script", "AuthorizationInfo/cluster_name", "Users/user_type", "stack_name", "Alert/component_name", "ViewUrlInfo/view_instance_version", "max_duration_for_retries", "javax.net.ssl.trustStore", "AlertGroup/name", "configure-task-key-value-pairs", "RootService/service_name", "StackConfigurations/property_value_attributes", "ambari_db_rca_password", "hi!", "Stage/status", "127.0.0.1", "UpgradeChecks/repository_version", "queues", "UpgradeChecks/repository_version", "ERROR", "desired_version", "_SERVICE_CHECK", "Event/summary/memberships/removed", "AlertTarget/name", "PrivilegeInfo/principal_type", "manage_identities", "ambari-server", "Event/summary/memberships/removed", "Stage/host_params", "max_duration_for_retries", "queues", "cluster-env", "UpgradeChecks/id", "StackConfigurations/property_name", "stack_name", "METRICS_COLLECTOR", "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", "operation_level/service_name", "alerts.json", "stack_name", "ViewVersionInfo/archive", "StackLevelConfigurations/property_value_attributes", "kerberos_descriptor", "Repositories/repository_version_id", "ambari_db_rca_password", "notification.dispatch.alert.script", "ERROR", "AlertNotice/target_id" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str59 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str59, str_array58);
    java.util.Set<java.lang.String> set_str61 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories((java.util.Set<java.lang.String>)linkedhashset_str59);
    org.apache.ambari.server.state.Cluster[] cluster_array62 = new org.apache.ambari.server.state.Cluster[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.Cluster> linkedhashset_cluster63 = new java.util.LinkedHashSet<org.apache.ambari.server.state.Cluster>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.Cluster>)linkedhashset_cluster63, cluster_array62);
    org.apache.ambari.server.events.HostsRemovedEvent hostsRemovedEvent65 = new org.apache.ambari.server.events.HostsRemovedEvent((java.util.Set<java.lang.String>)linkedhashset_str59, (java.util.Set<org.apache.ambari.server.state.Cluster>)linkedhashset_cluster63);
    stackMetainfoXml0.addErrors((java.util.Collection<java.lang.String>)linkedhashset_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cluster_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }

    org.apache.ambari.server.state.stack.upgrade.UpdateStackGrouping updateStackGrouping0 = new org.apache.ambari.server.state.stack.upgrade.UpdateStackGrouping();
    org.apache.ambari.server.state.stack.upgrade.ClusterGrouping.ClusterBuilder clusterBuilder1 = updateStackGrouping0.getBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterBuilder1);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }

    org.apache.ambari.server.state.StackInfo stackInfo0 = null;
    org.apache.ambari.server.state.ExtensionInfo extensionInfo1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.ExtensionHelper.validateCreateLink(stackInfo0, extensionInfo1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }

    org.apache.ambari.server.api.services.ViewUrlsService viewUrlsService0 = new org.apache.ambari.server.api.services.ViewUrlsService();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = viewUrlsService0.getViewUrls(httpHeaders1, uriInfo2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.WEBHCAT_SERVICE_CHECK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }

    org.apache.ambari.server.state.HostState hostState0 = org.apache.ambari.server.state.HostState.INIT;
    org.junit.Assert.assertTrue("'" + hostState0 + "' != '" + org.apache.ambari.server.state.HostState.INIT + "'", hostState0.equals(org.apache.ambari.server.state.HostState.INIT));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HEALTH;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_MR2_JOBHISTORY_ST = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.lang.String str5 = configuration0.getStrictTransportSecurityHTTPResponseHeader();
    boolean b6 = configuration0.useMetricsCacheCustomSizingEngine();
    java.lang.String str7 = configuration0.getStackAdvisorScript();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = configuration0.getDatabaseSchema();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "max-age=31536000"+ "'", str5.equals("max-age=31536000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/var/lib/ambari-server/resources/scripts/stack_advisor.py"+ "'", str7.equals("/var/lib/ambari-server/resources/scripts/stack_advisor.py"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.GLOBAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "global"+ "'", str0.equals("global"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }

    org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType syncType0 = org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.EXISTING;
    org.junit.Assert.assertTrue("'" + syncType0 + "' != '" + org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.EXISTING + "'", syncType0.equals(org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.EXISTING));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    java.lang.String str13 = stackConfigurationResponse12.getPropertyDescription();
    java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo> set_propertyDependencyInfo14 = stackConfigurationResponse12.getDependsOnProperties();
    java.lang.String str15 = stackConfigurationResponse12.getStackName();
    stackConfigurationResponse12.setServiceName("Tasks/output_log");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Hosts/last_registration_time"+ "'", str13.equals("Hosts/last_registration_time"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_propertyDependencyInfo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }

    java.lang.String str1 = org.apache.ambari.server.utils.ShellCommandUtil.hideOpenSslPassword("AlertGroup");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AlertGroup"+ "'", str1.equals("AlertGroup"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackVersionResourceProvider.STACK_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/stack_version"+ "'", str0.equals("Versions/stack_version"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewResourceProvider.VIEW_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInfo/view_name"+ "'", str0.equals("ViewInfo/view_name"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }

    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport0 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i1 = clusterHealthReport0.getUnhealthyStatusHosts();
    int i2 = clusterHealthReport0.getStaleConfigsHosts();
    int i3 = clusterHealthReport0.getUnhealthyStatusHosts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }

    org.apache.ambari.server.state.Cluster cluster0 = null;
    org.apache.ambari.server.orm.entities.ConfigGroupEntity configGroupEntity1 = null;
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO2 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory3 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO4 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory5 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl6 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO2, clusterFactory3, hostDAO4, hostFactory5);
    org.apache.ambari.server.state.ConfigFactory configFactory7 = null;
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO8 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO9 = null;
    org.apache.ambari.server.orm.dao.ConfigGroupDAO configGroupDAO10 = null;
    org.apache.ambari.server.orm.dao.ConfigGroupConfigMappingDAO configGroupConfigMappingDAO11 = null;
    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO12 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.controller.internal.TemporalInfoImpl temporalInfoImpl16 = new org.apache.ambari.server.controller.internal.TemporalInfoImpl((long)' ', (long)(short)100, (long)(byte)100);
    org.apache.ambari.server.configuration.Configuration configuration17 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str18 = configuration17.getViewsPragmaHTTPResponseHeader();
    boolean b19 = configuration17.validateAgentHostnames();
    boolean b20 = temporalInfoImpl16.equals((java.lang.Object)configuration17);
    org.apache.ambari.server.logging.LockFactory lockFactory21 = new org.apache.ambari.server.logging.LockFactory(configuration17);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.configgroup.ConfigGroupImpl configGroupImpl22 = new org.apache.ambari.server.state.configgroup.ConfigGroupImpl(cluster0, configGroupEntity1, (org.apache.ambari.server.state.Clusters)clustersImpl6, configFactory7, clusterDAO8, hostDAO9, configGroupDAO10, configGroupConfigMappingDAO11, configGroupHostMappingDAO12, lockFactory21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "no-cache"+ "'", str18.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,org.apache.ambari.server.orm.entities.ClusterEntity> singularattribute_alertDefinitionEntity_clusterEntity0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.clusterEntity;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_clusterEntity0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }

    org.apache.ambari.server.state.StackId stackId1 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str6 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse7 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId1, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str5, map_str_map_str_str6);
    org.apache.ambari.server.state.stack.PrereqCheckStatus prereqCheckStatus8 = org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL;
    boolean b9 = configurationResponse7.equals((java.lang.Object)prereqCheckStatus8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str5);
    org.junit.Assert.assertTrue("'" + prereqCheckStatus8 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL + "'", prereqCheckStatus8.equals(org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }

    org.apache.ambari.server.resources.api.rest.GetResource getResource0 = new org.apache.ambari.server.resources.api.rest.GetResource();

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo3 = new org.apache.ambari.server.state.ChangedConfigInfo("Credential/cluster_name", "service", "RootServiceComponents/service_name");

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertCurrentEntity,org.apache.ambari.server.orm.entities.AlertDefinitionEntity> singularattribute_alertCurrentEntity_alertDefinitionEntity0 = null;
    org.apache.ambari.server.orm.entities.AlertCurrentEntity_.alertDefinition = singularattribute_alertCurrentEntity_alertDefinitionEntity0;

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }

    org.apache.ambari.server.security.SecurePasswordHelper securePasswordHelper0 = new org.apache.ambari.server.security.SecurePasswordHelper();

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str19, str_array18);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent21 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str19);
    java.util.Set<java.lang.String> set_str22 = hostsAddedEvent21.getHostNames();
    org.apache.ambari.server.controller.spi.TemporalInfo temporalInfo24 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey timelineAppMetricCacheKey25 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey(set_str22, "Tasks/id", temporalInfo24);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController26 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider27 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController26);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str28 = ldapSyncEventResourceProvider27.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController29 = null;
    org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider30 = new org.apache.ambari.server.controller.internal.ActionResourceProvider(set_str22, map_type_str28, ambariManagementController29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str28);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }

    org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager metricsCollectorHAManager0 = new org.apache.ambari.server.controller.metrics.MetricsCollectorHAManager();
    boolean b2 = metricsCollectorHAManager0.isCollectorHostLive("WidgetLayoutInfo/user_name");
    boolean b4 = metricsCollectorHAManager0.isCollectorComponentLive("Clusters/security_type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }

    int i0 = org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler.DEFAULT_PASSWORD_CHAT_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider.REPOSITORY_VERSION_DISPLAY_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CompatibleRepositoryVersions/display_name"+ "'", str0.equals("CompatibleRepositoryVersions/display_name"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.endTime;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_long0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }

    org.apache.ambari.server.state.stack.RepositoryXml repositoryXml0 = new org.apache.ambari.server.state.stack.RepositoryXml();
    repositoryXml0.setValid(false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }

    java.lang.String str0 = org.apache.ambari.server.api.predicate.QueryLexer.QUERY_FROM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "from"+ "'", str0.equals("from"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }

    org.apache.ambari.server.state.theme.ConfigPlacement configPlacement0 = new org.apache.ambari.server.state.theme.ConfigPlacement();
    java.lang.String str1 = configPlacement0.getConfig();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }

    java.lang.String str0 = org.apache.ambari.server.api.predicate.QueryLexer.QUERY_SORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sortBy"+ "'", str0.equals("sortBy"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array3 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter4 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestResourceFilter_array3);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest9 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestOperationLevel6, map_str_str7, false);
    boolean b10 = executeActionRequest9.isExclusive();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }

    org.apache.ambari.server.orm.dao.ResourceDAO resourceDAO0 = new org.apache.ambari.server.orm.dao.ResourceDAO();
    org.apache.ambari.server.orm.entities.ResourceEntity resourceEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.ResourceEntity resourceEntity2 = resourceDAO0.merge(resourceEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    java.io.File file3 = configuration0.getRecommendationsDir();
    int i4 = configuration0.getPropertyProvidersWorkerQueueSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2147483647);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }

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
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str42 = queryImpl35.getKeyValueMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str42);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }

    org.apache.ambari.server.state.alert.AlertDefinitionHash alertDefinitionHash0 = new org.apache.ambari.server.state.alert.AlertDefinitionHash();
    alertDefinitionHash0.invalidate("", "Tasks/command");
    boolean b6 = alertDefinitionHash0.isHashCached("hi!", "HostRoles/state");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }

    org.apache.ambari.server.serveraction.kerberos.CreatePrincipalsServerAction.CreatePrincipalResult createPrincipalResult3 = new org.apache.ambari.server.serveraction.kerberos.CreatePrincipalsServerAction.CreatePrincipalResult("PermissionInfo/permission_name", "RootServiceHostComponents/service_name", (java.lang.Integer)1);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }

    org.apache.ambari.server.controller.RootServiceResponse rootServiceResponse1 = new org.apache.ambari.server.controller.RootServiceResponse("Hosts/rack_info");
    boolean b3 = rootServiceResponse1.equals((java.lang.Object)"Versions/active");
    java.lang.String str4 = rootServiceResponse1.getServiceName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Hosts/rack_info"+ "'", str4.equals("Hosts/rack_info"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }

    org.apache.ambari.server.api.services.RequestService requestService0 = new org.apache.ambari.server.api.services.RequestService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = requestService0.getRequest("UpgradeChecks/failed_on", httpHeaders2, uriInfo3, "requestschedule");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }

    org.apache.ambari.server.serveraction.kerberos.PrepareEnableKerberosServerAction prepareEnableKerberosServerAction0 = new org.apache.ambari.server.serveraction.kerberos.PrepareEnableKerberosServerAction();

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }

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
    java.util.Map<java.lang.String,java.lang.String> map_str_str21 = cluster20.getProperties();
    org.apache.ambari.server.actionmanager.ActionType actionType23 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType28 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array30 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization31 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization31, roleAuthorization_array30);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition33 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType23, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType28, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization31);
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider36 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization37 = groupPrivilegeResourceProvider36.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization38 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array39 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization38 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization40 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization40, roleAuthorization_array39);
    boolean b42 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization37, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization40);
    actionDefinition33.setPermissions((java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization40);
    actionDefinition33.setInputs("Stage/command_params");
    actionDefinition33.setDefaultTimeout((java.lang.Short)(short)1);
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider50 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization51 = groupPrivilegeResourceProvider50.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization52 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array53 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization52 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization54 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization54, roleAuthorization_array53);
    boolean b56 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization51, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization54);
    actionDefinition33.setPermissions(set_roleAuthorization51);
    boolean b58 = cluster20.equals((java.lang.Object)set_roleAuthorization51);
    
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
    org.junit.Assert.assertNotNull(map_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization37);
    org.junit.Assert.assertTrue("'" + roleAuthorization38 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization38.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization51);
    org.junit.Assert.assertTrue("'" + roleAuthorization52 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization52.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }

    org.apache.ambari.server.orm.dao.RequestScheduleDAO requestScheduleDAO0 = new org.apache.ambari.server.orm.dao.RequestScheduleDAO();
    org.apache.ambari.server.orm.entities.RequestScheduleEntity requestScheduleEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    requestScheduleDAO0.refresh(requestScheduleEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test165() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }

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
    // java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.UpgradePack.ProcessingComponent>> map_str_map_str_processingComponent15 = upgradePack12.getTasks();
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array7);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b9 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNull(map_str_map_str_processingComponent15);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }

    org.apache.ambari.server.api.predicate.operators.GreaterEqualsOperator greaterEqualsOperator0 = new org.apache.ambari.server.api.predicate.operators.GreaterEqualsOperator();
    java.lang.String str1 = greaterEqualsOperator0.toString();
    org.apache.ambari.server.controller.spi.Predicate predicate4 = greaterEqualsOperator0.toPredicate("ThemeInfo/default", "ranger-hbase-plugin-enabled");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "GreaterEqualsOperator"+ "'", str1.equals("GreaterEqualsOperator"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate4);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.AMBARI_METRICS_HTTPS_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }

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
    org.apache.ambari.server.controller.spi.Predicate predicate43 = processingPredicateVisitor42.getProcessedPredicate();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController44 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider45 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController44);
    java.lang.String[] str_array48 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request49 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array48);
    org.apache.ambari.server.controller.spi.Request request50 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array48);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate53 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate54 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array55 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate54 };
    org.apache.ambari.server.controller.spi.Predicate predicate56 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array55);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate57 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array55);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate60 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate63 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array64 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate53, andPredicate57, filterPredicate60, filterPredicate63 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate65 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array64);
    org.apache.ambari.server.actionmanager.ActionType actionType67 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType72 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array74 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization75 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b76 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization75, roleAuthorization_array74);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition77 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType67, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType72, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization75);
    boolean b78 = andPredicate65.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate79 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj80 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor81 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj80);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate79, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor81);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate83 = null;
    extendedResourcePredicateVisitor81.acceptUnaryPredicate(unaryPredicate83);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate65, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor81);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource86 = compatibleRepositoryVersionResourceProvider45.getResources(request50, (org.apache.ambari.server.controller.spi.Predicate)andPredicate65);
    processingPredicateVisitor42.acceptArrayPredicate((org.apache.ambari.server.controller.predicate.ArrayPredicate)andPredicate65);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate90 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    java.lang.String str91 = filterPredicate90.getOperator();
    java.lang.String str92 = filterPredicate90.getPropertyId();
    processingPredicateVisitor42.acceptComparisonPredicate((org.apache.ambari.server.controller.predicate.ComparisonPredicate)filterPredicate90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + ".FILTER"+ "'", str91.equals(".FILTER"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str92 + "' != '" + "Event/summary/memberships/removed"+ "'", str92.equals("Event/summary/memberships/removed"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test169"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.SERVER_EC_CACHE_SIZE;
    org.apache.ambari.server.state.quicklinks.Link link1 = new org.apache.ambari.server.state.quicklinks.Link();
    link1.setUrl("AlertHistory/definition_name");
    java.lang.String str4 = link1.getLabel();
    link1.setRequiresUserName("\"Hosts/maintenance_state\"");
    boolean b7 = configurationproperty_long0.equals((java.lang.Object)"\"Hosts/maintenance_state\"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_long0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test170"); }

    org.apache.ambari.server.utils.ShellCommandUtil.Result result3 = new org.apache.ambari.server.utils.ShellCommandUtil.Result((int)(byte)-1, "rack_info", "value");
    java.lang.String str4 = result3.getStdout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "rack_info"+ "'", str4.equals("rack_info"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test171"); }

    org.apache.ambari.server.serveraction.ActionLog actionLog0 = new org.apache.ambari.server.serveraction.ActionLog();
    java.lang.String str1 = actionLog0.getStdErr();
    java.lang.String str2 = actionLog0.getStdErr();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test172"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.OperatingSystemResourceProvider.OPERATING_SYSTEM_STACK_VERSION_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OperatingSystems/stack_version"+ "'", str0.equals("OperatingSystems/stack_version"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test173"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    boolean b3 = mITKerberosOperationHandler0.isOpen();
    mITKerberosOperationHandler0.setDefaultRealm("sortBy");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test174"); }

    org.apache.ambari.server.orm.dao.TopologyHostInfoDAO topologyHostInfoDAO0 = new org.apache.ambari.server.orm.dao.TopologyHostInfoDAO();
    org.apache.ambari.server.orm.entities.HostEntity hostEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    topologyHostInfoDAO0.removeByHost(hostEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test175"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.FIRST_VERSION_TAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "version1"+ "'", str0.equals("version1"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test176"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.String> singularattribute_hostEntity_str0 = org.apache.ambari.server.orm.entities.HostEntity_.hostAttributes;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_str0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test177"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigImpl.GENERATED_TAG_PREFIX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "generatedTag_"+ "'", str0.equals("generatedTag_"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test178"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_MANAGER_PASSWORD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test179"); }

    javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest4 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    int i5 = postRequest4.getAPIVersion();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str6 = postRequest4.getHttpHeaders();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test180"); }

    org.apache.ambari.server.topology.NoSuchHostGroupException noSuchHostGroupException2 = new org.apache.ambari.server.topology.NoSuchHostGroupException("tag", "not_managed_hdfs_path_list");

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test181"); }

    org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_WIPEOUT;
    org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_WIPEOUT + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_WIPEOUT));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test182"); }

    org.apache.ambari.server.agent.HostStatus.Status status0 = org.apache.ambari.server.agent.HostStatus.Status.HEALTHY;
    org.apache.ambari.server.agent.HostStatus hostStatus2 = new org.apache.ambari.server.agent.HostStatus(status0, "Clusters/security_type");
    org.apache.ambari.server.agent.HostStatus hostStatus4 = new org.apache.ambari.server.agent.HostStatus(status0, "blueprint");
    org.apache.ambari.server.agent.HostStatus.Status status5 = org.apache.ambari.server.agent.HostStatus.Status.HEALTHY;
    org.apache.ambari.server.agent.HostStatus hostStatus7 = new org.apache.ambari.server.agent.HostStatus(status5, "Clusters/security_type");
    hostStatus4.setStatus(status5);
    org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.ambari.server.agent.HostStatus.Status.HEALTHY + "'", status0.equals(org.apache.ambari.server.agent.HostStatus.Status.HEALTHY));
    org.junit.Assert.assertTrue("'" + status5 + "' != '" + org.apache.ambari.server.agent.HostStatus.Status.HEALTHY + "'", status5.equals(org.apache.ambari.server.agent.HostStatus.Status.HEALTHY));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test183"); }

    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport0 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i1 = clusterHealthReport0.getInitStateHosts();
    int i2 = clusterHealthReport0.getHealthyStateHosts();
    int i3 = clusterHealthReport0.getStaleConfigsHosts();
    int i4 = clusterHealthReport0.getHealthyStateHosts();
    int i5 = clusterHealthReport0.getStaleConfigsHosts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test184"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    org.apache.ambari.server.state.kerberos.AbstractKerberosDescriptorContainer abstractKerberosDescriptorContainer8 = kerberosComponentDescriptor6.getChildContainer("blueprint_setting");
    
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
    org.junit.Assert.assertNull(abstractKerberosDescriptorContainer8);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test185"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.OperatingSystemResourceProvider.OPERATING_SYSTEM_STACK_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OperatingSystems/stack_name"+ "'", str0.equals("OperatingSystems/stack_name"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test186"); }

    java.util.regex.Pattern pattern1 = org.apache.ambari.server.state.kerberos.AbstractKerberosDescriptorContainer.AUTH_TO_LOCAL_PROPERTY_SPECIFICATION_PATTERN;
    boolean b2 = org.apache.ambari.server.checks.HardcodedStackVersionPropertiesCheck.stringContainsVersionHardcode("package_list", pattern1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pattern1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test187"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_HIVE_DYNAMIC_SERVICE_DISCOVERY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test188"); }

    org.apache.ambari.server.state.StackInfo stackInfo0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.repository.VersionDefinitionXml versionDefinitionXml1 = org.apache.ambari.server.state.repository.VersionDefinitionXml.build(stackInfo0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test189"); }

    org.apache.ambari.server.notifications.TargetConfigurationResult.Status status0 = org.apache.ambari.server.notifications.TargetConfigurationResult.Status.VALID;
    org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.ambari.server.notifications.TargetConfigurationResult.Status.VALID + "'", status0.equals(org.apache.ambari.server.notifications.TargetConfigurationResult.Status.VALID));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test190"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider.HOST_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceHostComponents/host_name"+ "'", str0.equals("RootServiceHostComponents/host_name"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test191"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    java.io.File file3 = configuration0.getRecommendationsDir();
    java.lang.Integer i4 = configuration0.getExternalScriptTimeout();
    java.lang.String str5 = configuration0.getServerOsType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 5000+ "'", i4.equals(5000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test192"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CredentialResourceProvider.CREDENTIAL_ALIAS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Credential/alias"+ "'", str0.equals("Credential/alias"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test193"); }

    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder2 = blueprintExportRequestAuditEventBuilder0.withUserName("StackConfigurations/property_value_attributes");
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder4 = blueprintExportRequestAuditEventBuilder0.withRemoteIp("RootService/service_name");
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder6 = blueprintExportRequestAuditEventBuilder0.withUrl("ViewVersionInfo/parameters");
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder7 = org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder9 = addAlertGroupRequestAuditEventBuilder7.withName("ViewInstanceInfo/view_name");
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder11 = addAlertGroupRequestAuditEventBuilder7.withRemoteIp("alerts.json");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS12 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus13 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS12);
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder14 = addAlertGroupRequestAuditEventBuilder11.withResultStatus(resultStatus13);
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder15 = blueprintExportRequestAuditEventBuilder0.withResultStatus(resultStatus13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder15);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test194"); }

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
    org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate categoryIsEmptyPredicate44 = new org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate("AlertHistory/definition_name");
    processingPredicateVisitor42.acceptCategoryPredicate((org.apache.ambari.server.controller.predicate.CategoryPredicate)categoryIsEmptyPredicate44);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate48 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate49 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array50 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate49 };
    org.apache.ambari.server.controller.spi.Predicate predicate51 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array50);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate52 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array50);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate55 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate58 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array59 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate48, andPredicate52, filterPredicate55, filterPredicate58 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate60 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array59);
    org.apache.ambari.server.actionmanager.ActionType actionType62 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType67 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array69 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization70 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization70, roleAuthorization_array69);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition72 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType62, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType67, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization70);
    boolean b73 = andPredicate60.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate74 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj75 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor76 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj75);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate74, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor76);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate78 = null;
    extendedResourcePredicateVisitor76.acceptUnaryPredicate(unaryPredicate78);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate60, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor76);
    categoryIsEmptyPredicate44.accept((org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test195"); }

    org.apache.ambari.server.orm.entities.ClusterEntity clusterEntity0 = null;
    com.google.inject.Injector injector1 = null;
    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher2 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener alertLifecycleListener3 = new org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener(ambariEventPublisher2);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.cluster.ClusterImpl clusterImpl4 = new org.apache.ambari.server.state.cluster.ClusterImpl(clusterEntity0, injector1, ambariEventPublisher2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test196"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.AbstractUpgradeCatalog.PROPERTY_RANGER_HIVE_PLUGIN_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ranger-hive-plugin-enabled"+ "'", str0.equals("ranger-hive-plugin-enabled"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test197"); }

    org.apache.ambari.server.controller.internal.Stack stack2 = null;
    org.apache.ambari.server.topology.Component component4 = new org.apache.ambari.server.topology.Component("configure-task-key-value-pairs");
    org.apache.ambari.server.topology.Component[] component_array5 = new org.apache.ambari.server.topology.Component[] { component4 };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component6 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component6, component_array5);
    org.apache.ambari.server.topology.Configuration configuration8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl10 = new org.apache.ambari.server.topology.HostGroupImpl("ClusterInfo/url", "RUNNING", stack2, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component6, configuration8, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test198"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getPropertyIds(type0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test199"); }

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
    java.lang.Long long37 = clusterRequest13.getClusterId();
    
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
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L+ "'", long37.equals(1L));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test200"); }

    org.apache.ambari.server.metadata.ActionMetadata actionMetadata0 = new org.apache.ambari.server.metadata.ActionMetadata();
    java.lang.String str2 = actionMetadata0.getServiceCheckAction("upgrade_direction");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test201"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BindingHostGroup bindingHostGroup0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BindingHostGroup();
    java.lang.String str1 = bindingHostGroup0.getName();
    bindingHostGroup0.setName("WidgetLayoutInfo/section_name");
    bindingHostGroup0.setName("<html> <title>Status</title><body><h1>RUNNING</body></h1></html> ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test202"); }

    boolean b0 = org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.ifErrorsFound();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test203"); }

    org.apache.ambari.server.stageplanner.RoleGraph roleGraph0 = new org.apache.ambari.server.stageplanner.RoleGraph();

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test204"); }

    org.apache.ambari.server.api.resources.LdapSyncEventResourceDefinition ldapSyncEventResourceDefinition0 = new org.apache.ambari.server.api.resources.LdapSyncEventResourceDefinition();

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test205"); }

    org.apache.ambari.server.view.configuration.AutoInstanceConfig autoInstanceConfig0 = new org.apache.ambari.server.view.configuration.AutoInstanceConfig();
    java.lang.String str1 = autoInstanceConfig0.getDescription();
    java.util.List<org.apache.ambari.server.view.configuration.PropertyConfig> list_propertyConfig2 = autoInstanceConfig0.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_propertyConfig2);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test206"); }

    org.apache.ambari.server.serveraction.users.CsvFilePersisterService csvFilePersisterService1 = new org.apache.ambari.server.serveraction.users.CsvFilePersisterService("Alert/cluster_name");

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test207"); }

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
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController53 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider54 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController53);
    org.apache.ambari.server.controller.spi.Request request55 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate56 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus57 = widgetResourceProvider54.deleteResources(request55, predicate56);
    java.lang.String[] str_array60 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request61 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array60);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus62 = widgetResourceProvider54.createResources(request61);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate65 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    java.lang.String str66 = filterPredicate65.getOperator();
    java.lang.String str67 = filterPredicate65.getPropertyId();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource68 = targetClusterResourceProvider52.getResources(request61, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate65);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + ".FILTER"+ "'", str66.equals(".FILTER"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "Event/summary/memberships/removed"+ "'", str67.equals("Event/summary/memberships/removed"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test208"); }

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
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate14 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    java.lang.String str15 = filterPredicate14.getOperator();
    java.lang.String str16 = filterPredicate14.getPropertyId();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource17 = clusterKerberosDescriptorResourceProvider1.getResources(request10, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate14);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ".FILTER"+ "'", str15.equals(".FILTER"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Event/summary/memberships/removed"+ "'", str16.equals("Event/summary/memberships/removed"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test209"); }

    org.apache.ambari.server.state.ExtensionId extensionId2 = new org.apache.ambari.server.state.ExtensionId("upgrade_direction", "AMBARI_METRICS");

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test210"); }

    org.apache.ambari.server.state.State state7 = org.apache.ambari.server.state.State.DISABLED;
    org.apache.ambari.server.state.SecurityType securityType8 = null;
    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider9 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition10 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider9);
    java.util.Set<java.lang.String> set_str11 = clusterDefinition10.getHosts();
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport14 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i15 = clusterHealthReport14.getInitStateHosts();
    int i16 = clusterHealthReport14.getHealthyStateHosts();
    int i17 = clusterHealthReport14.getStaleConfigsHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse18 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)10L, "stack_tools", state7, securityType8, set_str11, (java.lang.Integer)10, "_SERVICE_CHECK", clusterHealthReport14);
    org.apache.ambari.server.state.StackId stackId20 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str24 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str25 = null;
    org.apache.ambari.server.controller.ConfigurationResponse configurationResponse26 = new org.apache.ambari.server.controller.ConfigurationResponse("quicklinks", stackId20, "AuthorizationInfo/cluster_name", "nosniff", (java.lang.Long)1L, map_str_str24, map_str_map_str_str25);
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask27 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask27.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array30 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask27 };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task> arraylist_task31 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.Task>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task31, task_array30);
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper33 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("widgets.json", "ViewInstanceInfo/view_name", set_str11, map_str_str24, (java.util.List<org.apache.ambari.server.state.stack.upgrade.Task>)arraylist_task31);
    org.apache.ambari.server.controller.ExtensionVersionResponse extensionVersionResponse34 = new org.apache.ambari.server.controller.ExtensionVersionResponse("ViewInstanceInfo/properties", "ConfigGroup/desired_configs", false, (java.util.Collection<java.lang.String>)set_str11);
    extensionVersionResponse34.setExtensionVersion("_SERVICE_CHECK");
    org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.apache.ambari.server.state.State.DISABLED + "'", state7.equals(org.apache.ambari.server.state.State.DISABLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test211"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    int i5 = configuration0.getConnectionMaxIdleTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 30000+ "'", i4.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 900000);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test212"); }

    org.apache.ambari.server.api.services.ConfigGroupService configGroupService1 = new org.apache.ambari.server.api.services.ConfigGroupService("ThemeInfo/default");

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test213"); }

    org.apache.ambari.server.state.quicklinks.Link link0 = new org.apache.ambari.server.state.quicklinks.Link();
    java.lang.String str1 = link0.getComponentName();
    java.lang.String str2 = link0.getComponentName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test214"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.PARAMETER_CONFIG_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configure-task-config-type"+ "'", str0.equals("configure-task-config-type"));

  }

  @Test
  public void test215() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test215"); }

    // org.apache.ambari.server.state.Cluster cluster0 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType1 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction2 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj3 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext4 = new org.apache.ambari.server.state.UpgradeContext(cluster0, upgradeType1, direction2, map_str_obj3);
    // upgradeContext4.setAutoSkipComponentFailures(true);
    // org.apache.ambari.server.state.StackId stackId7 = upgradeContext4.getOriginalStackId();
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNull(stackId7);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test216"); }

    org.apache.ambari.server.security.authorization.AuthorizationException authorizationException1 = new org.apache.ambari.server.security.authorization.AuthorizationException("recovery_retry_interval");

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test217"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CLIENT_API_SSL_PORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test218"); }

    org.apache.ambari.server.events.AggregateAlertRecalculateEvent aggregateAlertRecalculateEvent1 = new org.apache.ambari.server.events.AggregateAlertRecalculateEvent((long)100);
    java.util.List<org.apache.ambari.server.state.Alert> list_alert2 = aggregateAlertRecalculateEvent1.getAlerts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alert2);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test219"); }

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
    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType23 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str24 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo25 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array26 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo27 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo27, propertyDependencyInfo_array26);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse29 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType23, map_str_str24, valueAttributesInfo25, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo27);
    java.lang.String str30 = stackConfigurationResponse29.getPropertyDescription();
    java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo> set_propertyDependencyInfo31 = stackConfigurationResponse29.getDependsOnProperties();
    stackConfigurationResponse12.setDependsOnProperties(set_propertyDependencyInfo31);
    stackConfigurationResponse12.setServiceName("CompatibleRepositoryVersions/stack_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_propertyType15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR"+ "'", str16.equals("ERROR"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Hosts/last_registration_time"+ "'", str30.equals("Hosts/last_registration_time"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_propertyDependencyInfo31);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test220"); }

    org.apache.ambari.server.state.stack.upgrade.ManualTask manualTask0 = new org.apache.ambari.server.state.stack.upgrade.ManualTask();
    java.lang.String str1 = manualTask0.getActionVerb();
    java.util.List<java.lang.String> list_str2 = manualTask0.messages;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Executing"+ "'", str1.equals("Executing"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test221"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigureTask.actionVerb;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Configuring"+ "'", str0.equals("Configuring"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test222"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.AMBARI_ALERT_DEFINITION_NAME_OID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.2"+ "'", str0.equals("1.3.6.1.4.1.18060.16.1.1.1.2"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test223"); }

    org.apache.ambari.server.state.Alert alert0 = new org.apache.ambari.server.state.Alert();

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test224"); }

    org.apache.ambari.server.topology.ConfigRecommendationStrategy configRecommendationStrategy0 = org.apache.ambari.server.topology.ConfigRecommendationStrategy.ALWAYS_APPLY;
    org.junit.Assert.assertTrue("'" + configRecommendationStrategy0 + "' != '" + org.apache.ambari.server.topology.ConfigRecommendationStrategy.ALWAYS_APPLY + "'", configRecommendationStrategy0.equals(org.apache.ambari.server.topology.ConfigRecommendationStrategy.ALWAYS_APPLY));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test225"); }

    org.apache.ambari.server.api.resources.RootServiceComponentResourceDefinition rootServiceComponentResourceDefinition0 = new org.apache.ambari.server.api.resources.RootServiceComponentResourceDefinition();

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test226"); }

    org.apache.ambari.server.topology.TopologyRequest topologyRequest1 = null;
    org.apache.ambari.server.topology.ClusterTopology clusterTopology2 = null;
    org.apache.ambari.server.orm.entities.TopologyLogicalRequestEntity topologyLogicalRequestEntity3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.LogicalRequest logicalRequest4 = new org.apache.ambari.server.topology.LogicalRequest((java.lang.Long)1L, topologyRequest1, clusterTopology2, topologyLogicalRequestEntity3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test227"); }

    org.apache.ambari.server.controller.RootServiceComponentRequest rootServiceComponentRequest2 = new org.apache.ambari.server.controller.RootServiceComponentRequest("HostComponentProcess/host_name", "phoenix.query.keepAliveMs");

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test228"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_UNIQUE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/unique"+ "'", str0.equals("Repositories/unique"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test229"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler1 = null;
    serviceCheckGrouping0.parallelScheduler = parallelScheduler1;
    serviceCheckGrouping0.name = "notification.dispatch.alert.script";
    serviceCheckGrouping0.allowRetry = false;
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler7 = null;
    serviceCheckGrouping0.parallelScheduler = parallelScheduler7;
    java.util.Set<java.lang.String> set_str9 = serviceCheckGrouping0.getExcluded();
    java.util.Iterator<org.apache.ambari.server.state.stack.upgrade.Grouping> iterator_grouping10 = null;
    // The following exception was thrown during execution in test generation
    try {
    serviceCheckGrouping0.merge(iterator_grouping10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str9);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test230"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.CONFIG_MERGE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test231"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    componentInfo0.setName("service");
    java.util.List<org.apache.ambari.server.state.LogDefinition> list_logDefinition4 = componentInfo0.getLogs();
    java.lang.String str5 = componentInfo0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_logDefinition4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "service"+ "'", str5.equals("service"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test232"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.keyPropertyIds;
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor1 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor(map_type_str0);
    kerberosPrincipalDescriptor1.setValue("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str0);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test233"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.HostGroup hostGroup0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.HostGroup();
    hostGroup0.setName("config_recommendation_strategy");

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test234"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.EXECUTION_SCHEDULER_WAIT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_long0);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test235"); }

    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder2 = changeAlertGroupRequestAuditEventBuilder0.withOperation("configure-task-transfers");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus4 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS3);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS5 = resultStatus4.getStatus();
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder6 = changeAlertGroupRequestAuditEventBuilder0.withResultStatus(resultStatus4);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent changeAlertGroupRequestAuditEvent7 = changeAlertGroupRequestAuditEventBuilder0.build();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder6);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test236"); }

    org.apache.ambari.server.api.resources.TaskResourceDefinition taskResourceDefinition0 = new org.apache.ambari.server.api.resources.TaskResourceDefinition();
    java.lang.String str1 = taskResourceDefinition0.getSingularName();
    java.lang.String str2 = taskResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "task"+ "'", str1.equals("task"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "task"+ "'", str2.equals("task"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test237"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher.SECURITY_AUTH_PASSPHRASE_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch.snmp.security.auth.passphrase"+ "'", str0.equals("ambari.dispatch.snmp.security.auth.passphrase"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test238"); }

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
    schemaUpgradeHelper14.stopPersistenceService();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test239"); }

    org.apache.ambari.server.ObjectNotFoundException objectNotFoundException1 = new org.apache.ambari.server.ObjectNotFoundException("ExtensionLink/stack_name");

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test240"); }

    org.apache.ambari.server.api.query.render.HostKerberosIdentityCsvRenderer hostKerberosIdentityCsvRenderer0 = new org.apache.ambari.server.api.query.render.HostKerberosIdentityCsvRenderer();

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test241"); }

    java.lang.String str0 = org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.ZERO_PADDING_PARAM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "params/padding"+ "'", str0.equals("params/padding"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test242"); }

    org.apache.ambari.server.api.resources.StackDependencyResourceDefinition stackDependencyResourceDefinition0 = new org.apache.ambari.server.api.resources.StackDependencyResourceDefinition();
    java.lang.String str1 = stackDependencyResourceDefinition0.getPluralName();
    java.lang.String str2 = stackDependencyResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "dependencies"+ "'", str1.equals("dependencies"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "dependency"+ "'", str2.equals("dependency"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test243"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.PIG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test244"); }

    java.lang.String str0 = org.apache.ambari.server.topology.ClusterConfigurationRequest.CLUSTER_HOST_INFO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "clusterHostInfo"+ "'", str0.equals("clusterHostInfo"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test245"); }

    org.apache.ambari.server.state.stack.upgrade.StartGrouping startGrouping0 = new org.apache.ambari.server.state.stack.upgrade.StartGrouping();
    startGrouping0.supportsAutoSkipOnFailure = false;
    org.apache.ambari.server.state.stack.upgrade.UpgradeScope upgradeScope3 = startGrouping0.scope;
    boolean b4 = startGrouping0.skippable;
    org.junit.Assert.assertTrue("'" + upgradeScope3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeScope.ANY + "'", upgradeScope3.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeScope.ANY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test246"); }

    org.apache.ambari.server.audit.request.eventcreator.BlueprintExportEventCreator blueprintExportEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.BlueprintExportEventCreator();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS1 = blueprintExportEventCreator0.getResultStatuses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS1);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test247"); }

    org.apache.ambari.server.agent.AgentEnv.ExistingUser existingUser0 = new org.apache.ambari.server.agent.AgentEnv.ExistingUser();
    java.lang.String str1 = existingUser0.getUserHomeDir();
    java.lang.String str2 = existingUser0.getUserName();
    java.lang.String str3 = existingUser0.getUserHomeDir();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test248"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.JDBC_UNIT_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari-server"+ "'", str0.equals("ambari-server"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test249"); }

    java.util.Map<java.lang.String,java.util.List<? extends javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,?>>> map_str_list_wildcard0 = org.apache.ambari.server.orm.entities.StageEntity_.getPredicateMapping();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_wildcard0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test250"); }

    org.apache.ambari.server.controller.UserResponse userResponse4 = new org.apache.ambari.server.controller.UserResponse("Tasks/id", false, false, true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test251"); }

    org.apache.ambari.server.topology.AmbariContext ambariContext0 = null;
    org.apache.ambari.server.topology.Blueprint blueprint2 = null;
    org.apache.ambari.server.topology.Configuration configuration3 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.topology.HostGroupInfo> map_str_hostGroupInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.ClusterTopologyImpl clusterTopologyImpl5 = new org.apache.ambari.server.topology.ClusterTopologyImpl(ambariContext0, (java.lang.Long)1000L, blueprint2, configuration3, map_str_hostGroupInfo4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test252"); }

    org.apache.ambari.server.view.ViewArchiveUtility viewArchiveUtility0 = new org.apache.ambari.server.view.ViewArchiveUtility();
    java.io.File file2 = viewArchiveUtility0.getFile("Versions/active");
    java.io.File file4 = viewArchiveUtility0.getFile("nosniff");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file4);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test253"); }

    org.apache.ambari.server.controller.ExtensionLinkRequest extensionLinkRequest5 = new org.apache.ambari.server.controller.ExtensionLinkRequest("HostRoles/state", "configure-task-transfers", "HostRoles/stale_configs", "ConfigGroup/desired_configs", "##");
    java.lang.String str6 = extensionLinkRequest5.getStackVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HostRoles/stale_configs"+ "'", str6.equals("HostRoles/stale_configs"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test254"); }

    org.apache.ambari.server.state.alert.AlertDefinitionFactory alertDefinitionFactory0 = new org.apache.ambari.server.state.alert.AlertDefinitionFactory();
    org.apache.ambari.server.configuration.Configuration configuration1 = new org.apache.ambari.server.configuration.Configuration();
    int i2 = configuration1.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher3 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration1);
    java.io.File file4 = configuration1.getRecommendationsDir();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.state.alert.AlertDefinition> set_alertDefinition6 = alertDefinitionFactory0.getAlertDefinitions(file4, "Credential/key");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
    } catch (org.apache.ambari.server.AmbariException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file4);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test255"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    java.lang.String str2 = componentInfo0.getTimelineAppid();
    java.util.List<java.lang.String> list_str3 = componentInfo0.getClientsToUpdateConfigs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_str3);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test256"); }

    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder2 = deleteRepositoryVersionAuditEventBuilder0.withStackVersion("StackServices/stack_version");
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder4 = deleteRepositoryVersionAuditEventBuilder2.withOperation("Artifacts/stack_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder4);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test257"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_MAINTENANCE_MODE;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_RM_HA = checkDescription0;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_HIVE_ROLLING_WARNING = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test258"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertGroupResourceProvider.ALERT_GROUP_DEFAULT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertGroup/default"+ "'", str0.equals("AlertGroup/default"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test259"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_REFERRAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test260"); }

    org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType0 = org.apache.ambari.server.state.stack.PrereqCheckType.HOST;
    org.junit.Assert.assertTrue("'" + prereqCheckType0 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.HOST + "'", prereqCheckType0.equals(org.apache.ambari.server.state.stack.PrereqCheckType.HOST));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test261"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.Extension extension3 = new org.apache.ambari.server.controller.internal.Extension("configure-task-key-value-pairs", "", ambariManagementController2);
    java.lang.String str4 = extension3.getVersion();
    java.lang.String str5 = extension3.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test262"); }

    org.apache.ambari.server.audit.event.kerberos.DestroyPrincipalKerberosAuditEvent.DestroyPrincipalKerberosAuditEventBuilder destroyPrincipalKerberosAuditEventBuilder0 = org.apache.ambari.server.audit.event.kerberos.DestroyPrincipalKerberosAuditEvent.builder();
    org.apache.ambari.server.audit.event.kerberos.DestroyPrincipalKerberosAuditEvent destroyPrincipalKerberosAuditEvent1 = destroyPrincipalKerberosAuditEventBuilder0.build();
    boolean b3 = destroyPrincipalKerberosAuditEvent1.equals((java.lang.Object)"AlertTarget/notification_type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(destroyPrincipalKerberosAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(destroyPrincipalKerberosAuditEvent1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test263"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    org.apache.ambari.server.state.CustomCommandDefinition[] customCommandDefinition_array3 = new org.apache.ambari.server.state.CustomCommandDefinition[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.CustomCommandDefinition> arraylist_customCommandDefinition4 = new java.util.ArrayList<org.apache.ambari.server.state.CustomCommandDefinition>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.CustomCommandDefinition>)arraylist_customCommandDefinition4, customCommandDefinition_array3);
    componentInfo0.setCustomCommands((java.util.List<org.apache.ambari.server.state.CustomCommandDefinition>)arraylist_customCommandDefinition4);
    java.util.List<org.apache.ambari.server.state.CustomCommandDefinition> list_customCommandDefinition7 = componentInfo0.getCustomCommands();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(customCommandDefinition_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_customCommandDefinition7);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test264"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    java.lang.StringBuilder stringBuilder2 = null;
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.StringBuilder stringBuilder4 = mySqlHelper1.writeColumnModifyString(stringBuilder2, dBColumnInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test265"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType concatenationType1 = org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.translate("HostRoles/maintenance_state");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test266"); }

    org.apache.ambari.server.agent.AgentEnv.JavaProc javaProc0 = new org.apache.ambari.server.agent.AgentEnv.JavaProc();
    int i1 = javaProc0.getPid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test267"); }

    org.apache.ambari.server.controller.spi.Resource resource0 = null;
    org.apache.ambari.server.controller.spi.Resource[] resource_array1 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource2 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource2, resource_array1);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl7 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource2, true, false, (int)'#');
    org.apache.ambari.server.controller.spi.RequestStatusMetaData requestStatusMetaData8 = null;
    org.apache.ambari.server.controller.internal.RequestStatusImpl requestStatusImpl9 = new org.apache.ambari.server.controller.internal.RequestStatusImpl(resource0, (java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource2, requestStatusMetaData8);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource10 = requestStatusImpl9.getAssociatedResources();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource10);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test268"); }

    org.apache.ambari.server.HostNotFoundException hostNotFoundException2 = new org.apache.ambari.server.HostNotFoundException("UpgradeItem/group_id", "PermissionInfo/resource_name");

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test269"); }

    org.apache.ambari.server.state.quicklinks.Link link0 = new org.apache.ambari.server.state.quicklinks.Link();
    link0.setUrl("AlertHistory/definition_name");
    java.lang.String str3 = link0.getUrl();
    org.apache.ambari.server.state.quicklinks.Link link4 = new org.apache.ambari.server.state.quicklinks.Link();
    link4.setUrl("AlertHistory/definition_name");
    org.apache.ambari.server.state.quicklinks.Protocol protocol7 = new org.apache.ambari.server.state.quicklinks.Protocol();
    org.apache.ambari.server.state.quicklinks.Check[] check_array8 = new org.apache.ambari.server.state.quicklinks.Check[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check> arraylist_check9 = new java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check9, check_array8);
    protocol7.setChecks((java.util.List<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check9);
    link4.setProtocol(protocol7);
    link0.setProtocol(protocol7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AlertHistory/definition_name"+ "'", str3.equals("AlertHistory/definition_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(check_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test270"); }

    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.SKIPPED_FAILED;
    org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.SKIPPED_FAILED + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.SKIPPED_FAILED));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test271"); }

    org.apache.ambari.server.metadata.ActionMetadata actionMetadata0 = new org.apache.ambari.server.metadata.ActionMetadata();
    java.util.List<java.lang.String> list_str2 = actionMetadata0.getActions("evaluate_when");
    java.util.List<java.lang.String> list_str4 = actionMetadata0.getActions("server.jdbc.properties.");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test272"); }

    org.apache.ambari.server.controller.StackVersionRequest stackVersionRequest2 = new org.apache.ambari.server.controller.StackVersionRequest("Tasks/end_time", "Versions/valid");

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test273"); }

    java.lang.String[] str_array76 = new java.lang.String[] { "Hosts/last_registration_time", "ERROR", "notification.dispatch.alert.script", "AlertTarget/name", "Upgrade/abort_reason", "Event/summary/memberships/removed", "timeline.metrics.host.aggregator.ttl", "stack_name", "StackLevelConfigurations/type", "javax.net.ssl.trustStore", "configure-task-key-value-pairs", "ambari.dispatch.snmp.oids.body", "ambari_db_rca_password", "ViewInstanceInfo/cluster_handle", "ViewInstanceInfo/view_name", "hi!", "Repositories/latest_base_url", "Users/user_name", "RootServiceComponents/service_name", "recovery_settings", "StackLevelConfigurations/property_value_attributes", "RootServiceComponents/service_name", "AlertNotice/target_id", "RepositoryVersions/display_name", "Hosts/maintenance_state", "RootServiceComponents/service_name", "StackConfigurations/property_value_attributes", "ambari_db_rca_password", "Actions/target_service", "AlertHistory/definition_name", "Request_Info/asc_order", "jdbc:derby:memory:myDB/ambari;create=true", "yarn.scheduler.capacity.root", "java_version", "ViewInstanceInfo/cluster_handle", "alerts.json", "ambari.dispatch.snmp.oids.body", "ViewVersionInfo/min_ambari_version", "notification.dispatch.alert.script", "type", "yarn.scheduler.capacity.root.queues", "ViewInstanceInfo/icon64_path", "StackLevelConfigurations/property_value_attributes", "PrivilegeInfo/principal_type", "desired_version", "Executing", "org.apache.derby.jdbc.EmbeddedDriver", "alerts.json", "recovery_settings", "UpgradeChecks/id", "PrivilegeInfo/principal_type", "RepositoryVersions/display_name", "Alert/component_name", "Users/user_type", "WidgetLayoutInfo/section_name", "Hosts/rack_info", "cluster-env", "blueprint_name", "ambari.dispatch.snmp.oids.body", "Tasks/id", "configure-task-key-value-pairs", "FALCON_SERVICE_CHECK", "host_predicate", "ViewUrlInfo/url_name", "max_duration_for_retries", "RootServiceHostComponents/service_name", "Users/user_name", "Requests/request_schedule/schedule_id", "Executing", "javax.net.ssl.trustStore", "UpgradeChecks/id", "max_duration_for_retries", "org.apache.derby.jdbc.EmbeddedDriver", "VersionDefinition/stack_name", "ambari-server", "manage_identities" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str77 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str77, str_array76);
    org.apache.ambari.server.controller.RequestsByStatusesRequest requestsByStatusesRequest79 = new org.apache.ambari.server.controller.RequestsByStatusesRequest((java.util.Set<java.lang.String>)linkedhashset_str77);
    java.util.Set<java.lang.String> set_str80 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds;
    requestsByStatusesRequest79.setStatuses(set_str80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str80);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test274"); }

    java.lang.Integer[] i_array6 = new java.lang.Integer[] { 1, 0, 1, 10 };
    java.util.TreeSet<java.lang.Integer> treeset_i7 = new java.util.TreeSet<java.lang.Integer>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i7, i_array6);
    java.util.Set<java.lang.String> set_str9 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i7);
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask10 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    org.apache.ambari.server.state.stack.upgrade.ConfigureFunction configureFunction11 = new org.apache.ambari.server.state.stack.upgrade.ConfigureFunction();
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array12 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask10, configureFunction11 };
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper13 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("ambari_db_rca_username", "WidgetLayoutInfo/widgets", set_str9, task_array12);
    boolean b14 = taskWrapper13.isAnyTaskSequential();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test275() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test275"); }

    // org.apache.ambari.server.checks.HostsMasterMaintenanceCheck hostsMasterMaintenanceCheck0 = new org.apache.ambari.server.checks.HostsMasterMaintenanceCheck();
    // org.apache.ambari.server.checks.CheckDescription checkDescription1 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    // org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck3 = new org.apache.ambari.server.state.stack.PrerequisiteCheck(checkDescription1, "upgrade_suspended");
    // org.apache.ambari.server.state.stack.PrereqCheckStatus prereqCheckStatus4 = org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL;
    // prerequisiteCheck3.setStatus(prereqCheckStatus4);
    // org.apache.ambari.server.checks.HostsRepositoryVersionCheck hostsRepositoryVersionCheck6 = new org.apache.ambari.server.checks.HostsRepositoryVersionCheck();
    // org.apache.ambari.server.state.Cluster cluster8 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType9 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction10 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj11 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext12 = new org.apache.ambari.server.state.UpgradeContext(cluster8, upgradeType9, direction10, map_str_obj11);
    // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest13 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType9);
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType14 = prereqCheckRequest13.getUpgradeType();
    // boolean b15 = hostsRepositoryVersionCheck6.isApplicable(prereqCheckRequest13);
    // // The following exception was thrown during execution in test generation
    // try {
    // hostsMasterMaintenanceCheck0.perform(prerequisiteCheck3, prereqCheckRequest13);
    //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // } catch (java.lang.NullPointerException e) {
    //   // Expected exception.
    // }
    
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(checkDescription1);
    // org.junit.Assert.assertTrue("'" + prereqCheckStatus4 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL + "'", prereqCheckStatus4.equals(org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL));
    // org.junit.Assert.assertTrue("'" + upgradeType9 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType9.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    // org.junit.Assert.assertTrue("'" + upgradeType14 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType14.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test276"); }

    org.apache.ambari.server.state.SecurityState securityState0 = org.apache.ambari.server.state.SecurityState.ERROR;
    org.junit.Assert.assertTrue("'" + securityState0 + "' != '" + org.apache.ambari.server.state.SecurityState.ERROR + "'", securityState0.equals(org.apache.ambari.server.state.SecurityState.ERROR));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test277"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack1 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack0.mergeProcessing(upgradePack1);
    upgradePack0.setName("timelineMetricCacheManager");
    java.util.List<org.apache.ambari.server.state.stack.UpgradePack.IntermediateStack> list_intermediateStack5 = upgradePack0.getIntermediateStacks();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_intermediateStack5);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test278"); }

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
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder15 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder16 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder17 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders18 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody19 = null;
    javax.ws.rs.core.UriInfo uriInfo20 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance21 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest22 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders18, requestBody19, uriInfo20, resourceInstance21);
    int i23 = postRequest22.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type24 = postRequest22.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder25 = addUserToGroupRequestAuditEventBuilder17.withRequestType(type24);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder26 = deleteRepositoryVersionAuditEventBuilder16.withRequestType(type24);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder27 = userPasswordChangeRequestAuditEventBuilder15.withRequestType(type24);
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder28 = changeRepositoryVersionAuditEventBuilder14.withRequestType(type24);
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder30 = changeRepositoryVersionAuditEventBuilder28.withOperation("");
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder32 = changeRepositoryVersionAuditEventBuilder28.withRemoteIp("notification.dispatch.alert.script");
    
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
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type24.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder32);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test279"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.AmbariMetaInfo.REPOSITORY_XML_PROPERTY_MIRRORSLIST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mirrorslist"+ "'", str0.equals("mirrorslist"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test280"); }

    org.apache.ambari.server.api.services.HostService hostService1 = new org.apache.ambari.server.api.services.HostService("ambari.dispatch.snmp.security.priv.passphrase");
    javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = hostService1.updateHost("PermissionInfo/permission_name", httpHeaders3, uriInfo4, "manage_identities");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test281"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    int i4 = configuration0.getConnectionPoolMaximumIdle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 14400);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test282"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    componentInfo0.setCardinality("RootServiceComponents/ciphers");
    java.lang.String str5 = componentInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test283"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setSyncGroupMemberReplacePattern("AlertTarget/notification_type");
    java.util.List<java.lang.String> list_str3 = ldapServerProperties0.getLdapUrls();
    java.lang.String str4 = ldapServerProperties0.getGroupNamingAttr();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test284"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog210 upgradeCatalog2101 = new org.apache.ambari.server.upgrade.UpgradeCatalog210(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test285"); }

    java.lang.String str1 = org.apache.ambari.server.security.authorization.AuthorizationHelper.getAuthenticatedName("CompatibleRepositoryVersions/stack_services");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CompatibleRepositoryVersions/stack_services"+ "'", str1.equals("CompatibleRepositoryVersions/stack_services"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test286"); }

    org.apache.ambari.server.serveraction.upgrades.RangerKmsProxyConfig rangerKmsProxyConfig0 = new org.apache.ambari.server.serveraction.upgrades.RangerKmsProxyConfig();
    org.apache.ambari.server.actionmanager.HostRoleCommand hostRoleCommand1 = null;
    rangerKmsProxyConfig0.setHostRoleCommand(hostRoleCommand1);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test287"); }

    org.apache.ambari.server.topology.ConfigRecommendationStrategy configRecommendationStrategy0 = org.apache.ambari.server.topology.ConfigRecommendationStrategy.NEVER_APPLY;
    org.junit.Assert.assertTrue("'" + configRecommendationStrategy0 + "' != '" + org.apache.ambari.server.topology.ConfigRecommendationStrategy.NEVER_APPLY + "'", configRecommendationStrategy0.equals(org.apache.ambari.server.topology.ConfigRecommendationStrategy.NEVER_APPLY));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test288"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    java.lang.String str5 = configuration0.getAlertTemplateFile();
    java.lang.Integer i6 = configuration0.getAgentApiAcceptors();
    int i7 = configuration0.getPropertyProvidersWorkerQueueSize();
    
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
    org.junit.Assert.assertTrue(i7 == 2147483647);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test289"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_CHECK_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/check"+ "'", str0.equals("UpgradeChecks/check"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test290"); }

    org.apache.ambari.server.topology.HostGroupInfo hostGroupInfo1 = new org.apache.ambari.server.topology.HostGroupInfo("AMBARI_SECURITY_MASTER_KEY");
    org.apache.ambari.server.topology.Configuration configuration2 = null;
    hostGroupInfo1.setConfiguration(configuration2);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test291"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.checks.CheckDescription.SERVICE_PRESENCE_CHECK = checkDescription0;
    org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_RM_HA = checkDescription0;
    org.apache.ambari.server.checks.CheckDescription.SERVICE_PRESENCE_CHECK = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test292"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher.PORT_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch.snmp.port"+ "'", str0.equals("ambari.dispatch.snmp.port"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test293"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array3 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter4 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestResourceFilter_array3);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest9 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestOperationLevel6, map_str_str7, false);
    java.lang.String str10 = executeActionRequest9.getActionName();
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel11 = executeActionRequest9.getOperationLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Tasks/custom_command_name"+ "'", str10.equals("Tasks/custom_command_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(requestOperationLevel11);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test294"); }

    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder2 = addRequestAuditEventBuilder0.withUrl("mark_draining_only");
    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder4 = addRequestAuditEventBuilder0.withUserName("PermissionInfo/version");
    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder6 = addRequestAuditEventBuilder4.withRemoteIp("1.3.6.1.4.1.18060.16.1.1.1.2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addRequestAuditEventBuilder6);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test295"); }

    org.apache.ambari.server.api.services.UserService userService0 = new org.apache.ambari.server.api.services.UserService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = userService0.getUser("hosts", httpHeaders2, uriInfo3, "UpgradeChecks/failed_on");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test296"); }

    org.apache.ambari.server.serveraction.users.CsvFilePersisterService csvFilePersisterService1 = new org.apache.ambari.server.serveraction.users.CsvFilePersisterService("timelineMetricCacheManager");

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test297"); }

    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer1 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.SchemaFactory schemaFactory2 = null;
    metricsPaddingRenderer1.init(schemaFactory2);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test298"); }

    org.apache.ambari.server.topology.KerberosDescriptorFactory kerberosDescriptorFactory0 = new org.apache.ambari.server.topology.KerberosDescriptorFactory();
    org.apache.ambari.server.topology.KerberosDescriptor kerberosDescriptor3 = kerberosDescriptorFactory0.createKerberosDescriptor("Event/summary/users/created", "StackConfigurations/property_description");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(kerberosDescriptor3);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test299"); }

    org.apache.ambari.server.hooks.users.UserHookParams userHookParams0 = org.apache.ambari.server.hooks.users.UserHookParams.CMD_HDFS_KEYTAB;
    org.junit.Assert.assertTrue("'" + userHookParams0 + "' != '" + org.apache.ambari.server.hooks.users.UserHookParams.CMD_HDFS_KEYTAB + "'", userHookParams0.equals(org.apache.ambari.server.hooks.users.UserHookParams.CMD_HDFS_KEYTAB));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test300"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    org.apache.ambari.server.state.CustomCommandDefinition[] customCommandDefinition_array3 = new org.apache.ambari.server.state.CustomCommandDefinition[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.CustomCommandDefinition> arraylist_customCommandDefinition4 = new java.util.ArrayList<org.apache.ambari.server.state.CustomCommandDefinition>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.CustomCommandDefinition>)arraylist_customCommandDefinition4, customCommandDefinition_array3);
    componentInfo0.setCustomCommands((java.util.List<org.apache.ambari.server.state.CustomCommandDefinition>)arraylist_customCommandDefinition4);
    org.apache.ambari.server.state.CustomCommandDefinition customCommandDefinition8 = componentInfo0.getCustomCommandByName("encryption_types");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(customCommandDefinition_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(customCommandDefinition8);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test301"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    java.lang.String str3 = configuration0.getRecommendationsArtifactsLifetime();
    java.lang.String str4 = configuration0.getRecoveryDisabledComponents();
    org.apache.ambari.server.logging.LockFactory lockFactory5 = new org.apache.ambari.server.logging.LockFactory(configuration0);
    java.util.concurrent.locks.Lock lock7 = lockFactory5.newLock("1; mode=block");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1w"+ "'", str3.equals("1w"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lock7);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test302"); }

    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator0 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.Predicate predicate3 = isEmptyOperator0.toPredicate("skip_failure", "servicecomponent_version");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.api.predicate.InvalidQueryException");
    } catch (org.apache.ambari.server.api.predicate.InvalidQueryException e) {
      // Expected exception.
    }

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test303"); }

    org.apache.ambari.server.ParentObjectNotFoundException parentObjectNotFoundException2 = new org.apache.ambari.server.ParentObjectNotFoundException("ambari.dispatch.snmp.oids.body");
    org.apache.ambari.server.ParentObjectNotFoundException parentObjectNotFoundException3 = new org.apache.ambari.server.ParentObjectNotFoundException("timelineMetricCacheManager", (org.apache.ambari.server.ObjectNotFoundException)parentObjectNotFoundException2);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test304"); }

    org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator privilegeEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator();
    java.util.Set<org.apache.ambari.server.api.services.Request.Type> set_type1 = privilegeEventCreator0.getRequestTypes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type1);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test305"); }

    org.apache.ambari.server.state.NotificationState notificationState0 = org.apache.ambari.server.state.NotificationState.FAILED;
    org.junit.Assert.assertTrue("'" + notificationState0 + "' != '" + org.apache.ambari.server.state.NotificationState.FAILED + "'", notificationState0.equals(org.apache.ambari.server.state.NotificationState.FAILED));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test306"); }

    org.apache.ambari.server.orm.PersistenceType persistenceType0 = org.apache.ambari.server.orm.PersistenceType.REMOTE;
    org.junit.Assert.assertTrue("'" + persistenceType0 + "' != '" + org.apache.ambari.server.orm.PersistenceType.REMOTE + "'", persistenceType0.equals(org.apache.ambari.server.orm.PersistenceType.REMOTE));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test307"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.StopTask.actionVerb;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stopping"+ "'", str0.equals("Stopping"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test308"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    java.util.Collection<? extends org.apache.ambari.server.state.kerberos.AbstractKerberosDescriptorContainer> collection_wildcard7 = kerberosComponentDescriptor6.getChildContainers();
    org.apache.ambari.server.state.kerberos.KerberosConfigurationDescriptor kerberosConfigurationDescriptor8 = null;
    kerberosComponentDescriptor6.putConfiguration(kerberosConfigurationDescriptor8);
    
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
    org.junit.Assert.assertNull(collection_wildcard7);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test309"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_DESIRED_SERVICE_CONFIG_VERSIONS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/desired_service_config_versions"+ "'", str0.equals("Clusters/desired_service_config_versions"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test310"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = configuration0.getPreviousDatabaseConnectorNames();
    org.apache.ambari.server.utils.StageUtils.setConfiguration(configuration0);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.configuration.Configuration.DatabaseType databaseType5 = configuration0.getDatabaseType();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test311"); }

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
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder15 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder16 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder17 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders18 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody19 = null;
    javax.ws.rs.core.UriInfo uriInfo20 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance21 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest22 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders18, requestBody19, uriInfo20, resourceInstance21);
    int i23 = postRequest22.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type24 = postRequest22.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder25 = addUserToGroupRequestAuditEventBuilder17.withRequestType(type24);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder26 = deleteRepositoryVersionAuditEventBuilder16.withRequestType(type24);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder27 = userPasswordChangeRequestAuditEventBuilder15.withRequestType(type24);
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder28 = changeRepositoryVersionAuditEventBuilder14.withRequestType(type24);
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder30 = changeRepositoryVersionAuditEventBuilder28.withOperation("");
    java.util.SortedMap<java.lang.String,java.util.List<java.util.Map<java.lang.String,java.lang.String>>> sortedmap_str_list_map_str_str31 = null;
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder32 = changeRepositoryVersionAuditEventBuilder30.withRepos(sortedmap_str_list_map_str_str31);
    
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
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type24.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeRepositoryVersionAuditEventBuilder32);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test312"); }

    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask0 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask0.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type3 = executeTask0.getStageWrapperType();
    executeTask0.isSequential = true;
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS + "'", type3.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test313"); }

    org.apache.ambari.server.api.resources.HostComponentResourceDefinition hostComponentResourceDefinition0 = new org.apache.ambari.server.api.resources.HostComponentResourceDefinition();

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test314"); }

    org.apache.ambari.server.api.services.ConfigGroupService configGroupService1 = new org.apache.ambari.server.api.services.ConfigGroupService("Blueprints/stack_name");

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test315"); }

    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping3 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition5 = aggregateDefinitionMapping3.getAggregateDefinitions((long)(short)1);
    org.apache.ambari.server.agent.AlertDefinitionCommand alertDefinitionCommand6 = new org.apache.ambari.server.agent.AlertDefinitionCommand("", "Hosts/last_registration_time", "${ambariVersion}", list_alertDefinition5);
    java.lang.String str7 = alertDefinitionCommand6.getHash();
    java.lang.String str8 = alertDefinitionCommand6.getClusterName();
    org.apache.ambari.server.agent.AgentCommand.AgentCommandType agentCommandType9 = alertDefinitionCommand6.getCommandType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "${ambariVersion}"+ "'", str7.equals("${ambariVersion}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    org.junit.Assert.assertTrue("'" + agentCommandType9 + "' != '" + org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_DEFINITION_COMMAND + "'", agentCommandType9.equals(org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_DEFINITION_COMMAND));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test316"); }

    org.apache.ambari.server.state.alert.AlertDefinition alertDefinition2 = null;
    org.apache.ambari.server.agent.AlertExecutionCommand alertExecutionCommand3 = new org.apache.ambari.server.agent.AlertExecutionCommand("AlertTarget/notification_type", "", alertDefinition2);
    org.apache.ambari.server.agent.AgentCommand.AgentCommandType agentCommandType4 = alertExecutionCommand3.getCommandType();
    java.lang.String str5 = alertExecutionCommand3.toString();
    org.junit.Assert.assertTrue("'" + agentCommandType4 + "' != '" + org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_EXECUTION_COMMAND + "'", agentCommandType4.equals(org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_EXECUTION_COMMAND));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "AgentCommand{commandType=ALERT_EXECUTION_COMMAND}"+ "'", str5.equals("AgentCommand{commandType=ALERT_EXECUTION_COMMAND}"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test317"); }

    java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.HOSTNAME_MACRO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "{hostname}"+ "'", str0.equals("{hostname}"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test318"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ServerSideActionTask.actionVerb;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Executing"+ "'", str0.equals("Executing"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test319"); }

    org.apache.ambari.server.state.quicklinks.QuickLinksConfiguration quickLinksConfiguration0 = new org.apache.ambari.server.state.quicklinks.QuickLinksConfiguration();
    org.apache.ambari.server.state.quicklinks.Protocol protocol1 = new org.apache.ambari.server.state.quicklinks.Protocol();
    org.apache.ambari.server.state.quicklinks.Check[] check_array2 = new org.apache.ambari.server.state.quicklinks.Check[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check> arraylist_check3 = new java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check3, check_array2);
    protocol1.setChecks((java.util.List<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check3);
    quickLinksConfiguration0.setProtocol(protocol1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(check_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test320"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ConfigGroupResourceProvider.CONFIGGROUP_HOSTS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ConfigGroup/hosts"+ "'", str0.equals("ConfigGroup/hosts"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test321"); }

    org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler aDKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler();
    aDKerberosOperationHandler0.close();
    java.lang.String str2 = aDKerberosOperationHandler0.getDefaultRealm();
    aDKerberosOperationHandler0.close();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = aDKerberosOperationHandler0.testAdministratorCredentials();
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosOperationException");
    } catch (org.apache.ambari.server.serveraction.kerberos.KerberosOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test322"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.String> singularattribute_alertDefinitionEntity_str0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.helpURL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_str0);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test323"); }

    byte[] byte_array0 = null;
    byte[] byte_array3 = new byte[] { (byte)-1, (byte)100 };
    byte[] byte_array6 = new byte[] { (byte)0, (byte)10 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult7 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array0, byte_array3, byte_array6);
    byte[] byte_array8 = null;
    byte[] byte_array11 = new byte[] { (byte)-1, (byte)100 };
    byte[] byte_array14 = new byte[] { (byte)0, (byte)10 };
    org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult15 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array8, byte_array11, byte_array14);
    encryptionResult7.cipher = byte_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test324"); }

    java.lang.String str0 = org.apache.ambari.server.api.services.AmbariMetaInfo.REPOSITORY_XML_PROPERTY_BASEURL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "baseurl"+ "'", str0.equals("baseurl"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test325"); }

    org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO0 = new org.apache.ambari.server.orm.dao.ExtensionLinkDAO();
    org.apache.ambari.server.orm.entities.ExtensionLinkEntity extensionLinkEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    extensionLinkDAO0.createOrUpdate(extensionLinkEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test326"); }

    org.apache.ambari.server.checks.HiveDynamicServiceDiscoveryCheck hiveDynamicServiceDiscoveryCheck0 = new org.apache.ambari.server.checks.HiveDynamicServiceDiscoveryCheck();

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test327"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    int i4 = configuration0.getConnectionPoolMinimumSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = configuration0.getLocalDatabaseUrl();
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
    org.junit.Assert.assertTrue(i4 == 5);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test328"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.VIEW_REQUEST_THREADPOOL_MAX_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test329"); }

    java.lang.String str2 = org.apache.ambari.server.security.encryption.CredentialStoreServiceImpl.canonicalizeAlias("hostRoleCommandStatusCacheExpiryDurationMins", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test330"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    java.lang.String str3 = configuration0.getRecommendationsArtifactsLifetime();
    java.lang.String str4 = configuration0.getRecoveryDisabledComponents();
    org.apache.ambari.server.logging.LockFactory lockFactory5 = new org.apache.ambari.server.logging.LockFactory(configuration0);
    java.util.concurrent.locks.Lock lock6 = lockFactory5.newLock();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1w"+ "'", str3.equals("1w"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lock6);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test331"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<java.lang.String,org.apache.ambari.server.state.Host> map_str_host8 = clustersImpl4.getHostsForCluster("FALCON_SERVICE_CHECK");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test332"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    java.lang.String str5 = configuration0.getAlertTemplateFile();
    int i6 = configuration0.getAgentPackageParallelCommandsLimit();
    
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
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test333"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    java.io.File file3 = configuration0.getRecommendationsDir();
    boolean b4 = configuration0.isMetricsCacheDisabled();
    java.lang.String str5 = configuration0.getJDKName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test334"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type1 = org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete;
    org.apache.ambari.server.controller.spi.Request request2 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate3 = null;
    org.apache.ambari.server.controller.internal.ResourceProviderEvent resourceProviderEvent4 = new org.apache.ambari.server.controller.internal.ResourceProviderEvent(type0, type1, request2, predicate3);
    org.apache.ambari.server.controller.spi.Resource.Type type5 = resourceProviderEvent4.getResourceType();
    org.apache.ambari.server.controller.spi.Request request6 = resourceProviderEvent4.getRequest();
    org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type7 = resourceProviderEvent4.getType();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type1.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(request6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type7.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test335"); }

    org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder clusterPrivilegeChangeRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.ClusterPrivilegeChangeRequestAuditEvent.ClusterPrivilegeChangeRequestAuditEventBuilder();

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test336"); }

    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder2 = changeAlertGroupRequestAuditEventBuilder0.withOperation("configure-task-transfers");
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder4 = changeAlertGroupRequestAuditEventBuilder2.withUrl("WidgetLayoutInfo/user_name");
    org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder6 = changeAlertGroupRequestAuditEventBuilder4.withRemoteIp("Internal Server Error");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder6);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test337"); }

    org.apache.ambari.server.checks.VersionMismatchCheck versionMismatchCheck0 = new org.apache.ambari.server.checks.VersionMismatchCheck();

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test338"); }

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
    org.apache.ambari.server.controller.predicate.AlwaysPredicate alwaysPredicate32 = null;
    simplifyingPredicateVisitor29.acceptAlwaysPredicate(alwaysPredicate32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test339"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.COMMAND_RETRY_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "command_retry_enabled"+ "'", str0.equals("command_retry_enabled"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test340"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = configuration0.getPreviousDatabaseConnectorNames();
    java.lang.Integer i4 = configuration0.getClientApiAcceptors();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test341"); }

    org.apache.ambari.server.bootstrap.BootStrapPostStatus bootStrapPostStatus0 = new org.apache.ambari.server.bootstrap.BootStrapPostStatus();
    java.lang.String str1 = bootStrapPostStatus0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test342"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    org.apache.ambari.server.metadata.ActionMetadata actionMetadata2 = new org.apache.ambari.server.metadata.ActionMetadata();
    java.util.List<java.lang.String> list_str4 = actionMetadata2.getActions("evaluate_when");
    componentInfo0.setConfigDependencies(list_str4);
    java.lang.String str6 = componentInfo0.getDecommissionAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test343"); }

    org.apache.ambari.server.ServiceComponentHostNotFoundException serviceComponentHostNotFoundException4 = new org.apache.ambari.server.ServiceComponentHostNotFoundException("processes", "command_retry_enabled", "authenticated_user_name", "Versions/extension-errors");

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test344"); }

    org.apache.ambari.server.controller.internal.Stack stack2 = null;
    org.apache.ambari.server.topology.Component[] component_array3 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component4 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, component_array3);
    org.apache.ambari.server.topology.Configuration configuration6 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl8 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack2, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, configuration6, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.ProvisionAction provisionAction10 = org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = hostGroupImpl8.addComponent("false", provisionAction10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    org.junit.Assert.assertTrue("'" + provisionAction10 + "' != '" + org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START + "'", provisionAction10.equals(org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test345"); }

    org.apache.ambari.server.controller.ServiceResponse serviceResponse7 = new org.apache.ambari.server.controller.ServiceResponse((java.lang.Long)(-1L), "name", "stack_features", "Tasks/custom_command_name", "RepositoryVersions/display_name", true, true);
    serviceResponse7.setCredentialStoreEnabled(false);
    serviceResponse7.setServiceName("RootServiceHostComponents/host_name");

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test346"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.HBASE_SITE_HBASE_COPROCESSOR_REGION_CLASSES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hbase.coprocessor.region.classes"+ "'", str0.equals("hbase.coprocessor.region.classes"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test347"); }

    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder2 = createUserRequestAuditEventBuilder0.withCreatedUsername("hdfs-site");
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder4 = createUserRequestAuditEventBuilder0.withUserName("Users/user_type");
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder6 = createUserRequestAuditEventBuilder4.withUrl("ViewInstanceInfo/view_name");
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder8 = createUserRequestAuditEventBuilder4.withUserName("ViewInstanceInfo/cluster_handle");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder8);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test348"); }

    org.apache.ambari.server.controller.ActionRequest actionRequest8 = new org.apache.ambari.server.controller.ActionRequest("VersionDefinition/stack_name", "ViewInstanceInfo/properties", "nosniff", "CompatibleRepositoryVersions/stack_name", "evaluate_when", "ambari.dispatch-property.script", "Stage/display_status", "");
    java.lang.String str9 = actionRequest8.getInputs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "nosniff"+ "'", str9.equals("nosniff"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test349"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    java.io.File file3 = configuration0.getRecommendationsDir();
    java.lang.String str4 = configuration0.getViewsCacheControlHTTPResponseHeader();
    int i5 = configuration0.getViewExtractionThreadPoolMaxSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no-store"+ "'", str4.equals("no-store"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 20);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test350"); }

    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder();

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test351"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_VIEW_STATUS_INFO;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_VIEW_STATUS_INFO + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_VIEW_STATUS_INFO));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test352"); }

    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS0 = org.apache.ambari.server.api.services.ResultStatus.STATUS.CONFLICT;
    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException3 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException();
    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException4 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("blueprint_name", (java.lang.Throwable)kerberosMissingAdminCredentialsException3);
    org.apache.ambari.server.view.IllegalClusterException illegalClusterException5 = new org.apache.ambari.server.view.IllegalClusterException((java.lang.Throwable)kerberosPrincipalAlreadyExistsException4);
    org.apache.ambari.server.AmbariException ambariException6 = new org.apache.ambari.server.AmbariException("StackConfigurations/final", (java.lang.Throwable)illegalClusterException5);
    org.apache.ambari.server.api.services.ResultStatus resultStatus7 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS0, (java.lang.Exception)ambariException6);
    java.lang.Exception exception8 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.services.ResultStatus resultStatus9 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS0, exception8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + sTATUS0 + "' != '" + org.apache.ambari.server.api.services.ResultStatus.STATUS.CONFLICT + "'", sTATUS0.equals(org.apache.ambari.server.api.services.ResultStatus.STATUS.CONFLICT));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test353"); }

    org.apache.ambari.server.api.services.TargetClusterService targetClusterService0 = new org.apache.ambari.server.api.services.TargetClusterService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = targetClusterService0.getTargetClusters("AlertTarget/notification_type", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test354"); }

    org.apache.ambari.server.bootstrap.BSResponse.BSRunStat bSRunStat0 = org.apache.ambari.server.bootstrap.BSResponse.BSRunStat.OK;
    org.junit.Assert.assertTrue("'" + bSRunStat0 + "' != '" + org.apache.ambari.server.bootstrap.BSResponse.BSRunStat.OK + "'", bSRunStat0.equals(org.apache.ambari.server.bootstrap.BSResponse.BSRunStat.OK));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test355"); }

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
    queryImpl35.addLocalProperty("yarn.scheduler.capacity.root.queues");
    org.apache.ambari.server.api.predicate.operators.GreaterEqualsOperator greaterEqualsOperator43 = new org.apache.ambari.server.api.predicate.operators.GreaterEqualsOperator();
    boolean b44 = queryImpl35.equals((java.lang.Object)greaterEqualsOperator43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test356"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType concatenationType1 = org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.translate("Versions/extension-errors");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test357"); }

    org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider viewInstanceResourceProvider0 = new org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider();
    java.lang.String[] str_array3 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request4 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array3);
    org.apache.ambari.server.controller.spi.Request request5 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array3);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate8 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate9 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array10 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate9 };
    org.apache.ambari.server.controller.spi.Predicate predicate11 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array10);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate12 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array10);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate15 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate18 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array19 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate8, andPredicate12, filterPredicate15, filterPredicate18 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate20 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array19);
    org.apache.ambari.server.actionmanager.ActionType actionType22 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType27 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array29 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization30 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization30, roleAuthorization_array29);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition32 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType22, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType27, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization30);
    boolean b33 = andPredicate20.equals((java.lang.Object)(short)100);
    java.util.Set<java.lang.String> set_str34 = org.apache.ambari.server.controller.utilities.PredicateHelper.getPropertyIds((org.apache.ambari.server.controller.spi.Predicate)andPredicate20);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource35 = viewInstanceResourceProvider0.getResources(request5, (org.apache.ambari.server.controller.spi.Predicate)andPredicate20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str34);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test358"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = kerberosComponentDescriptor6.toMap();
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor8 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor(map_str_obj7);
    java.util.LinkedHashSet<java.util.Map<java.lang.String,java.lang.Object>> linkedhashset_map_str_obj9 = new java.util.LinkedHashSet<java.util.Map<java.lang.String,java.lang.Object>>();
    boolean b10 = linkedhashset_map_str_obj9.add(map_str_obj7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.ScaleClusterRequest scaleClusterRequest11 = new org.apache.ambari.server.controller.internal.ScaleClusterRequest((java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>)linkedhashset_map_str_obj9);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.topology.InvalidTopologyTemplateException");
    } catch (org.apache.ambari.server.topology.InvalidTopologyTemplateException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test359"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    // The following exception was thrown during execution in test generation
    try {
    userDAO0.removeByPK((java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test360"); }

    org.apache.ambari.server.api.resources.ClientConfigResourceDefinition clientConfigResourceDefinition0 = new org.apache.ambari.server.api.resources.ClientConfigResourceDefinition();
    java.lang.String str1 = clientConfigResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "configurations"+ "'", str1.equals("configurations"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test361"); }

    org.apache.ambari.server.actionmanager.TargetHostType targetHostType0 = org.apache.ambari.server.actionmanager.TargetHostType.MAJORITY;
    org.junit.Assert.assertTrue("'" + targetHostType0 + "' != '" + org.apache.ambari.server.actionmanager.TargetHostType.MAJORITY + "'", targetHostType0.equals(org.apache.ambari.server.actionmanager.TargetHostType.MAJORITY));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test362"); }

    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_ADD_DELETE_SERVICES;
    org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_ADD_DELETE_SERVICES + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_ADD_DELETE_SERVICES));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test363"); }

    org.springframework.security.core.Authentication authentication0 = org.apache.ambari.server.security.authorization.AuthorizationHelper.getAuthentication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(authentication0);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test364"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    java.lang.String str5 = configuration0.getAlertTemplateFile();
    java.lang.Integer i6 = configuration0.getAgentApiAcceptors();
    java.lang.String str7 = configuration0.getCacheControlHTTPResponseHeader();
    org.apache.ambari.server.orm.PersistenceType persistenceType8 = configuration0.getPersistenceType();
    
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
    org.junit.Assert.assertTrue("'" + persistenceType8 + "' != '" + org.apache.ambari.server.orm.PersistenceType.LOCAL + "'", persistenceType8.equals(org.apache.ambari.server.orm.PersistenceType.LOCAL));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test365"); }

    org.apache.ambari.server.api.resources.TargetClusterResourceDefinition targetClusterResourceDefinition0 = new org.apache.ambari.server.api.resources.TargetClusterResourceDefinition();
    java.lang.String str1 = targetClusterResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "targets"+ "'", str1.equals("targets"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test366"); }

    org.apache.ambari.server.controller.GroupRequest groupRequest1 = new org.apache.ambari.server.controller.GroupRequest("");
    java.lang.String str2 = groupRequest1.getGroupName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test367"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.VISIBLE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/visible"+ "'", str0.equals("ViewInstanceInfo/visible"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test368"); }

    java.lang.String str0 = org.apache.ambari.server.topology.SecurityConfigurationFactory.TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "type"+ "'", str0.equals("type"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test369"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    int i2 = configuration0.getVersionDefinitionConnectTimeout();
    java.lang.String str3 = configuration0.getViewsXXSSProtectionHTTPResponseHeader();
    java.lang.Integer i4 = configuration0.getAgentApiAcceptors();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1; mode=block"+ "'", str3.equals("1; mode=block"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test370"); }

    org.apache.ambari.server.events.ServiceInstalledEvent serviceInstalledEvent4 = new org.apache.ambari.server.events.ServiceInstalledEvent((long)(short)0, "alerts.json", "alerts.json", "");
    java.lang.String str5 = serviceInstalledEvent4.toString();
    org.apache.ambari.server.events.AmbariEvent.AmbariEventType ambariEventType6 = serviceInstalledEvent4.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}"+ "'", str5.equals("ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}"));
    org.junit.Assert.assertTrue("'" + ambariEventType6 + "' != '" + org.apache.ambari.server.events.AmbariEvent.AmbariEventType.SERVICE_INSTALL_SUCCESS + "'", ambariEventType6.equals(org.apache.ambari.server.events.AmbariEvent.AmbariEventType.SERVICE_INSTALL_SUCCESS));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test371"); }

    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity0 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization1 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization2 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization3 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization4 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_ADD_DELETE_SERVICES;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization5 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS;
    java.lang.String str6 = roleAuthorization5.getId();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization7 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_HOSTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization8 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization9 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization10 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization11 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization12 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization13 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization14 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_TOGGLE_ALERTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization15 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_VIEW_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization16 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization17 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization18 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization19 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization20 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization21 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization22 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_HOSTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization23 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization24 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization25 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STACK_DETAILS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization26 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization27 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array28 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization1, roleAuthorization2, roleAuthorization3, roleAuthorization4, roleAuthorization5, roleAuthorization7, roleAuthorization8, roleAuthorization9, roleAuthorization10, roleAuthorization11, roleAuthorization12, roleAuthorization13, roleAuthorization14, roleAuthorization15, roleAuthorization16, roleAuthorization17, roleAuthorization18, roleAuthorization19, roleAuthorization20, roleAuthorization21, roleAuthorization22, roleAuthorization23, roleAuthorization24, roleAuthorization25, roleAuthorization26, roleAuthorization27 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization29 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization29, roleAuthorization_array28);
    org.apache.ambari.server.actionmanager.ActionType actionType32 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType37 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array39 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization40 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization40, roleAuthorization_array39);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition42 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType32, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType37, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization40);
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider45 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization46 = groupPrivilegeResourceProvider45.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization47 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array48 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization47 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization49 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization49, roleAuthorization_array48);
    boolean b51 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization46, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization49);
    actionDefinition42.setPermissions((java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization49);
    actionDefinition42.setInputs("Stage/command_params");
    actionDefinition42.setDefaultTimeout((java.lang.Short)(short)1);
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider59 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization60 = groupPrivilegeResourceProvider59.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization61 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array62 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization61 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization63 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization63, roleAuthorization_array62);
    boolean b65 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization60, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization63);
    actionDefinition42.setPermissions(set_roleAuthorization60);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyAuthorization(alertDefinitionEntity0, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization29, set_roleAuthorization60, "AuthorizationInfo/authorization_name");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + roleAuthorization1 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE + "'", roleAuthorization1.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE));
    org.junit.Assert.assertTrue("'" + roleAuthorization2 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization2.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    org.junit.Assert.assertTrue("'" + roleAuthorization3 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization3.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));
    org.junit.Assert.assertTrue("'" + roleAuthorization4 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_ADD_DELETE_SERVICES + "'", roleAuthorization4.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_ADD_DELETE_SERVICES));
    org.junit.Assert.assertTrue("'" + roleAuthorization5 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS + "'", roleAuthorization5.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AMBARI.MANAGE_USERS"+ "'", str6.equals("AMBARI.MANAGE_USERS"));
    org.junit.Assert.assertTrue("'" + roleAuthorization7 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_HOSTS + "'", roleAuthorization7.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_HOSTS));
    org.junit.Assert.assertTrue("'" + roleAuthorization8 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS + "'", roleAuthorization8.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS));
    org.junit.Assert.assertTrue("'" + roleAuthorization9 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS + "'", roleAuthorization9.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS));
    org.junit.Assert.assertTrue("'" + roleAuthorization10 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS + "'", roleAuthorization10.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_USERS));
    org.junit.Assert.assertTrue("'" + roleAuthorization11 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization11.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));
    org.junit.Assert.assertTrue("'" + roleAuthorization12 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE + "'", roleAuthorization12.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_TOGGLE_MAINTENANCE));
    org.junit.Assert.assertTrue("'" + roleAuthorization13 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization13.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    org.junit.Assert.assertTrue("'" + roleAuthorization14 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_TOGGLE_ALERTS + "'", roleAuthorization14.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_TOGGLE_ALERTS));
    org.junit.Assert.assertTrue("'" + roleAuthorization15 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_VIEW_CONFIGS + "'", roleAuthorization15.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_VIEW_CONFIGS));
    org.junit.Assert.assertTrue("'" + roleAuthorization16 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS + "'", roleAuthorization16.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS));
    org.junit.Assert.assertTrue("'" + roleAuthorization17 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS + "'", roleAuthorization17.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS));
    org.junit.Assert.assertTrue("'" + roleAuthorization18 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS + "'", roleAuthorization18.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS));
    org.junit.Assert.assertTrue("'" + roleAuthorization19 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS + "'", roleAuthorization19.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_EDIT_STACK_REPOS));
    org.junit.Assert.assertTrue("'" + roleAuthorization20 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization20.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));
    org.junit.Assert.assertTrue("'" + roleAuthorization21 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization21.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));
    org.junit.Assert.assertTrue("'" + roleAuthorization22 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_HOSTS + "'", roleAuthorization22.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_HOSTS));
    org.junit.Assert.assertTrue("'" + roleAuthorization23 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS + "'", roleAuthorization23.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS));
    org.junit.Assert.assertTrue("'" + roleAuthorization24 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization24.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));
    org.junit.Assert.assertTrue("'" + roleAuthorization25 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STACK_DETAILS + "'", roleAuthorization25.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STACK_DETAILS));
    org.junit.Assert.assertTrue("'" + roleAuthorization26 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS + "'", roleAuthorization26.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS));
    org.junit.Assert.assertTrue("'" + roleAuthorization27 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS + "'", roleAuthorization27.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CONFIG_GROUPS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization46);
    org.junit.Assert.assertTrue("'" + roleAuthorization47 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization47.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization60);
    org.junit.Assert.assertTrue("'" + roleAuthorization61 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization61.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test372"); }

    java.lang.Throwable throwable1 = null;
    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorException stackAdvisorException2 = new org.apache.ambari.server.api.services.stackadvisor.StackAdvisorException("yarn.scheduler.capacity.root.queues", throwable1);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test373"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.RECOMMENDATIONS_ARTIFACTS_ROLLOVER_MAX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test374"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity,byte[]> singularattribute_stageEntity_byte_array0 = org.apache.ambari.server.orm.entities.StageEntity_.commandParamsStage;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_stageEntity_byte_array0);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test375"); }

    org.apache.ambari.server.HostNotFoundException hostNotFoundException2 = new org.apache.ambari.server.HostNotFoundException("AgentCommand{commandType=ALERT_EXECUTION_COMMAND}", "host_group");

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test376"); }

    org.apache.ambari.server.orm.dao.GroupDAO groupDAO0 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity2 = groupDAO0.findGroupByPrincipal(principalEntity1);
    org.apache.ambari.server.security.authorization.GroupType groupType4 = org.apache.ambari.server.security.authorization.GroupType.LOCAL;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.GroupEntity groupEntity5 = groupDAO0.findGroupByNameAndType("Tasks/custom_command_name", groupType4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(groupEntity2);
    org.junit.Assert.assertTrue("'" + groupType4 + "' != '" + org.apache.ambari.server.security.authorization.GroupType.LOCAL + "'", groupType4.equals(org.apache.ambari.server.security.authorization.GroupType.LOCAL));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test377"); }

    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping0 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<java.lang.String> list_str2 = aggregateDefinitionMapping0.getAlertsWithAggregates((long)(-1));
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition4 = aggregateDefinitionMapping0.getAggregateDefinitions(10L);
    java.util.List<java.lang.String> list_str6 = aggregateDefinitionMapping0.getAlertsWithAggregates((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test378"); }

    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder();
    org.apache.ambari.server.api.services.ResultStatus resultStatus1 = null;
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder2 = deleteViewInstanceRequestAuditEventBuilder0.withResultStatus(resultStatus1);
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder4 = deleteViewInstanceRequestAuditEventBuilder2.withName("Configuration format provided in Blueprint is not supported");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder4);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test379"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "version"+ "'", str0.equals("version"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test380"); }

    org.apache.ambari.server.view.validation.ValidationException validationException1 = new org.apache.ambari.server.view.validation.ValidationException("AlertHistory/label");

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test381"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.KERBEROSTAB_CACHE_DIR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test382"); }

    org.apache.ambari.server.state.quicklinks.Protocol protocol0 = new org.apache.ambari.server.state.quicklinks.Protocol();
    org.apache.ambari.server.state.quicklinks.Check[] check_array1 = new org.apache.ambari.server.state.quicklinks.Check[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check> arraylist_check2 = new java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check2, check_array1);
    protocol0.setChecks((java.util.List<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check2);
    org.apache.ambari.server.state.quicklinks.Check[] check_array5 = new org.apache.ambari.server.state.quicklinks.Check[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check> arraylist_check6 = new java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check6, check_array5);
    protocol0.setChecks((java.util.List<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(check_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(check_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test383"); }

    org.apache.ambari.server.notifications.DispatchCredentials dispatchCredentials0 = new org.apache.ambari.server.notifications.DispatchCredentials();
    java.lang.String str1 = dispatchCredentials0.UserName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test384"); }

    org.apache.ambari.server.state.ClientConfigFileDefinition clientConfigFileDefinition0 = new org.apache.ambari.server.state.ClientConfigFileDefinition();
    java.lang.String str1 = clientConfigFileDefinition0.getDictionaryName();
    clientConfigFileDefinition0.setDictionaryName("Transfer{operation=null, fromType='null', fromKey='null', toKey='null', deleteKey='null', preserveEdits=false, defaultValue='null', coerceTo=null, ifKey='null', ifType='null', ifValue='null', ifKeyState='null', keepKeys=[]}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test385"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigureFunction configureFunction0 = new org.apache.ambari.server.state.stack.upgrade.ConfigureFunction();
    org.apache.ambari.server.state.stack.upgrade.Task.Type type1 = configureFunction0.getType();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.Task.Type.CONFIGURE_FUNCTION + "'", type1.equals(org.apache.ambari.server.state.stack.upgrade.Task.Type.CONFIGURE_FUNCTION));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test386"); }

    java.lang.String str0 = org.apache.ambari.server.topology.Setting.SETTING_NAME_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "name"+ "'", str0.equals("name"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test387"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.TIMELINE_METRICS_CACHE_IDLE_TIME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test388"); }

    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS0 = org.apache.ambari.server.api.services.ResultStatus.STATUS.SERVER_ERROR;
    org.apache.ambari.server.api.services.ResultStatus resultStatus1 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS0);
    org.junit.Assert.assertTrue("'" + sTATUS0 + "' != '" + org.apache.ambari.server.api.services.ResultStatus.STATUS.SERVER_ERROR + "'", sTATUS0.equals(org.apache.ambari.server.api.services.ResultStatus.STATUS.SERVER_ERROR));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test389"); }

    org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str1 = agentEnv0.getTransparentHugePage();
    java.lang.String[] str_array2 = agentEnv0.getExistingRepos();
    agentEnv0.setFirewallName("RootServiceHostComponents/properties");
    agentEnv0.setFirewallRunning((java.lang.Boolean)true);
    java.lang.String[] str_array7 = agentEnv0.getExistingRepos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test390"); }

    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule1 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule0);
    org.apache.ambari.server.controller.metrics.MetricsServiceProvider.MetricsService metricsService3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = defaultProviderModule0.getCollectorHostName("RootServiceHostComponents/properties", metricsService3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule1);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test391"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    java.util.Collection<java.lang.String> collection_str2 = componentModule1.getErrors();
    java.lang.String str3 = componentModule1.toString();
    boolean b4 = componentModule1.isDeleted();
    java.util.Collection<java.lang.String> collection_str5 = componentModule1.getErrors();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str5);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test392"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.SERVER_HRC_STATUS_SUMMARY_CACHE_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_b0);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test393"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,org.apache.ambari.server.orm.entities.ClusterEntity> singularattribute_alertDefinitionEntity_clusterEntity0 = null;
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.clusterEntity = singularattribute_alertDefinitionEntity_clusterEntity0;

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test394"); }

    org.apache.ambari.server.orm.entities.ViewEntity viewEntity0 = null;
    org.apache.ambari.server.view.configuration.ResourceConfig resourceConfig1 = new org.apache.ambari.server.view.configuration.ResourceConfig();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.view.ViewSubResourceDefinition viewSubResourceDefinition2 = new org.apache.ambari.server.view.ViewSubResourceDefinition(viewEntity0, resourceConfig1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test395"); }

    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer1 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("Hosts/os_type");

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test396"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.String> singularattribute_alertHistoryEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertHistoryEntity_.hostName = singularattribute_alertHistoryEntity_str0;

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test397"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse8.setActionName("keytab_file_group_access");

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test398"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.WIDGETLAYOUT_USERNAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/user_name"+ "'", str0.equals("WidgetLayoutInfo/user_name"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test399"); }

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
    org.apache.ambari.server.audit.AuditLoggerDefaultImpl auditLoggerDefaultImpl15 = new org.apache.ambari.server.audit.AuditLoggerDefaultImpl(configuration5);
    boolean b16 = auditLoggerDefaultImpl15.isEnabled();
    
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
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test400() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test400"); }

    // // org.apache.ambari.server.state.stack.upgrade.RepositoryVersionHelper repositoryVersionHelper0 = new org.apache.ambari.server.state.stack.upgrade.RepositoryVersionHelper();
    // // org.apache.ambari.server.state.Cluster cluster5 = null;
    // // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType6 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // // org.apache.ambari.server.state.stack.upgrade.Direction direction7 = null;
    // // java.util.Map<java.lang.String,java.lang.Object> map_str_obj8 = null;
    // // org.apache.ambari.server.state.UpgradeContext upgradeContext9 = new org.apache.ambari.server.state.UpgradeContext(cluster5, upgradeType6, direction7, map_str_obj8);
    // // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest10 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType6);
    // // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType11 = prereqCheckRequest10.getUpgradeType();
    // // // The following exception was thrown during execution in test generation
    // // try {
    // // java.lang.String str12 = repositoryVersionHelper0.getUpgradePackageName("StackConfigurations/property_value_attributes", "service_settings", "service_settings", upgradeType11);
    // //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // // } catch (java.lang.NullPointerException e) {
    // //   // Expected exception.
    // // }
    
    // // org.junit.Assert.assertTrue("'" + upgradeType6 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType6.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    // // org.junit.Assert.assertTrue("'" + upgradeType11 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType11.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test401"); }

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
    users6.revokeAdminPrivilege((java.lang.Integer)5000);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test402"); }

    org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService affectedService0 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService();
    java.lang.String str1 = affectedService0.name;
    java.lang.String str2 = affectedService0.name;
    java.lang.String str3 = affectedService0.name;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test403"); }

    org.apache.ambari.server.metrics.system.MetricsSink metricsSink0 = org.apache.ambari.server.metrics.system.impl.MetricsServiceImpl.getSink();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(metricsSink0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test404"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog200 upgradeCatalog2001 = new org.apache.ambari.server.upgrade.UpgradeCatalog200(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test405"); }

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
    clusterRequest13.setClusterId((java.lang.Long)10L);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj50 = clusterRequest13.getSessionAttributes();
    
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
    org.junit.Assert.assertNull(map_str_obj50);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test406"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.METRICS_MONITOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test407"); }

    org.apache.ambari.server.api.resources.OperatingSystemResourceDefinition operatingSystemResourceDefinition0 = new org.apache.ambari.server.api.resources.OperatingSystemResourceDefinition();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition1 = operatingSystemResourceDefinition0.getSubResourceDefinitions();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition2 = operatingSystemResourceDefinition0.getSubResourceDefinitions();
    org.apache.ambari.server.api.resources.ViewInstanceResourceDefinition viewInstanceResourceDefinition3 = new org.apache.ambari.server.api.resources.ViewInstanceResourceDefinition(set_subResourceDefinition2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition2);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test408"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo1 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider7 = new org.apache.ambari.server.controller.internal.URLStreamProvider(1200, (-1), "ambari.dispatch.snmp.security.priv.passphrase", "OperatingSystems/version_definition_id", "timeline.metrics.cluster.aggregator.minute.ttl");
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration8 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider timelineMetricCacheProvider9 = null;
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule10 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule11 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl12 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule11);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.MetricsPropertyProviderProxy metricsPropertyProviderProxy16 = org.apache.ambari.server.controller.metrics.MetricsPropertyProvider.createInstance(type0, map_str_map_str_propertyInfo1, uRLStreamProvider7, componentSSLConfiguration8, timelineMetricCacheProvider9, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule10, (org.apache.ambari.server.controller.metrics.MetricsServiceProvider)defaultProviderModule11, "QuickLinkInfo/stack_version", "/var/lib/ambari-agent/data", "GreaterEqualsOperator");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test409"); }

    org.apache.ambari.server.api.resources.ClientConfigResourceDefinition clientConfigResourceDefinition0 = new org.apache.ambari.server.api.resources.ClientConfigResourceDefinition();
    java.lang.String str1 = clientConfigResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "configuration"+ "'", str1.equals("configuration"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test410"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.WIDGETLAYOUT_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/id"+ "'", str0.equals("WidgetLayoutInfo/id"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test411"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.CommonServiceDirectory commonServiceDirectory1 = new org.apache.ambari.server.stack.CommonServiceDirectory("agent_stack_retry_on_unavailability");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
    } catch (org.apache.ambari.server.AmbariException e) {
      // Expected exception.
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test412"); }

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
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate13 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    java.lang.String str14 = filterPredicate13.getOperator();
    java.lang.String str15 = filterPredicate13.getPropertyId();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus16 = viewPermissionResourceProvider0.updateResources(request9, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate13);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".FILTER"+ "'", str14.equals(".FILTER"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Event/summary/memberships/removed"+ "'", str15.equals("Event/summary/memberships/removed"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test413"); }

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
    org.apache.ambari.server.api.services.CompatibleRepositoryVersionService compatibleRepositoryVersionService53 = new org.apache.ambari.server.api.services.CompatibleRepositoryVersionService(map_type_str48);
    
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
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test414"); }

    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder2 = viewPrivilegeChangeRequestAuditEventBuilder0.withVersion("Artifacts/service_name");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder4 = viewPrivilegeChangeRequestAuditEventBuilder0.withVersion("WidgetInfo/metrics");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder6 = viewPrivilegeChangeRequestAuditEventBuilder0.withOperation("timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder8 = viewPrivilegeChangeRequestAuditEventBuilder0.withVersion("Clusters/version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder8);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test415"); }

    org.apache.ambari.server.orm.dao.RoleSuccessCriteriaDAO roleSuccessCriteriaDAO0 = new org.apache.ambari.server.orm.dao.RoleSuccessCriteriaDAO();
    org.apache.ambari.server.orm.entities.RoleSuccessCriteriaEntityPK roleSuccessCriteriaEntityPK1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.RoleSuccessCriteriaEntity roleSuccessCriteriaEntity2 = roleSuccessCriteriaDAO0.findByPK(roleSuccessCriteriaEntityPK1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test416"); }

    org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO0 = new org.apache.ambari.server.orm.dao.MetainfoDAO();
    org.apache.ambari.server.orm.entities.MetainfoEntity metainfoEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    metainfoDAO0.refresh(metainfoEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test417"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    java.lang.String str5 = configuration0.getAlertTemplateFile();
    java.lang.Integer i6 = configuration0.getAgentApiAcceptors();
    java.lang.String str7 = configuration0.getCacheControlHTTPResponseHeader();
    java.lang.String str8 = configuration0.getRcaDatabaseUser();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "mapred"+ "'", str8.equals("mapred"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test418"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.lang.String str5 = configuration0.getStrictTransportSecurityHTTPResponseHeader();
    java.lang.String str6 = configuration0.getCharsetHTTPResponseHeader();
    java.lang.String str7 = configuration0.getViewsXFrameOptionsHTTPResponseHeader();
    
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "utf-8"+ "'", str6.equals("utf-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SAMEORIGIN"+ "'", str7.equals("SAMEORIGIN"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test419"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceResourceProvider.SERVICE_SERVICE_STATE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ServiceInfo/state"+ "'", str0.equals("ServiceInfo/state"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test420"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setHidden("VersionDefinition/stack_name");
    valueAttributesInfo0.setIncrementStep("nosniff");

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test421"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.LOGSEARCH_PORTAL_READ_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test422"); }

    java.lang.String str0 = org.apache.ambari.server.topology.TopologyManager.TOPOLOGY_RESOLVED_TAG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TOPOLOGY_RESOLVED"+ "'", str0.equals("TOPOLOGY_RESOLVED"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test423"); }

    org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType1 = org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE;
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface11 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array12 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface11 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface13 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface13, interface_array12);
    org.apache.ambari.server.controller.ivory.Cluster.Location location17 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array18 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location17 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location19 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location19, location_array18);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array21 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo22 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo22, propertyInfo_array21);
    java.util.Map<java.lang.String,java.lang.String> map_str_str24 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo25 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo22, map_str_str24);
    org.apache.ambari.server.controller.ivory.Cluster cluster26 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface13, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location19, map_str_str24);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str27 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest28 = new org.apache.ambari.server.controller.ConfigurationRequest("service_component_filter", "yarn.scheduler.capacity.root.queues", "GreaterEqualsOperator", map_str_str24, map_str_map_str_str27);
    org.apache.ambari.server.checks.CheckDescription checkDescription29 = new org.apache.ambari.server.checks.CheckDescription("max_duration_for_retries", prereqCheckType1, "ambari_db_rca_username", map_str_str24);
    org.apache.ambari.server.checks.CheckDescription.SERVICES_MAINTENANCE_MODE = checkDescription29;
    org.junit.Assert.assertTrue("'" + prereqCheckType1 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE + "'", prereqCheckType1.equals(org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str24);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test424"); }

    org.apache.ambari.server.utils.JaxbMapKeyVal jaxbMapKeyVal2 = null;
    org.apache.ambari.server.utils.JaxbMapKeyVal[] jaxbMapKeyVal_array3 = new org.apache.ambari.server.utils.JaxbMapKeyVal[] { jaxbMapKeyVal2 };
    org.apache.ambari.server.utils.JaxbMapKeyMap jaxbMapKeyMap4 = new org.apache.ambari.server.utils.JaxbMapKeyMap("UpgradeChecks/upgrade_pack", jaxbMapKeyVal_array3);
    java.lang.String str5 = jaxbMapKeyMap4.key;
    jaxbMapKeyMap4.key = "HostRoles/maintenance_state";
    org.apache.ambari.server.utils.JaxbMapKeyVal jaxbMapKeyVal9 = null;
    org.apache.ambari.server.utils.JaxbMapKeyVal[] jaxbMapKeyVal_array10 = new org.apache.ambari.server.utils.JaxbMapKeyVal[] { jaxbMapKeyVal9 };
    org.apache.ambari.server.utils.JaxbMapKeyMap jaxbMapKeyMap11 = new org.apache.ambari.server.utils.JaxbMapKeyMap("UpgradeChecks/upgrade_pack", jaxbMapKeyVal_array10);
    jaxbMapKeyMap4.value = jaxbMapKeyVal_array10;
    org.apache.ambari.server.utils.JaxbMapKeyMap jaxbMapKeyMap13 = new org.apache.ambari.server.utils.JaxbMapKeyMap("AuthorizationInfo/cluster_name", jaxbMapKeyVal_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jaxbMapKeyVal_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UpgradeChecks/upgrade_pack"+ "'", str5.equals("UpgradeChecks/upgrade_pack"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jaxbMapKeyVal_array10);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test425"); }

    org.apache.ambari.server.api.query.render.AlertSummaryGroupedRenderer.AlertDefinitionSummary alertDefinitionSummary0 = new org.apache.ambari.server.api.query.render.AlertSummaryGroupedRenderer.AlertDefinitionSummary();

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test426"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    java.lang.String str1 = ldapServerProperties0.getManagerPassword();
    java.lang.String str2 = ldapServerProperties0.getDnAttribute();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test427"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentProcessResourceProvider.HC_PROCESS_NAME_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostComponentProcess/name"+ "'", str0.equals("HostComponentProcess/name"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test428"); }

    org.apache.ambari.server.controller.ControllerResponse controllerResponse1 = new org.apache.ambari.server.controller.ControllerResponse("hosts");

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test429"); }

    org.apache.ambari.server.controller.ivory.Instance instance7 = new org.apache.ambari.server.controller.ivory.Instance("jdbc:derby:memory:myDB/ambari;create=true", "upgrade_suspended", "Actions/target_service", "", "AlertHistory/label", "AuthorizationInfo/cluster_name", "RootService/service_name");
    java.lang.String str8 = instance7.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "upgrade_suspended"+ "'", str8.equals("upgrade_suspended"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test430"); }

    java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.YARN_SITE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "yarn-site"+ "'", str0.equals("yarn-site"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test431"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionLinkResourceProvider.LINK_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ExtensionLink/link_id"+ "'", str0.equals("ExtensionLink/link_id"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test432"); }

    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRequest.StackAdvisorRequestType stackAdvisorRequestType0 = org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRequest.StackAdvisorRequestType.CONFIGURATIONS;
    org.junit.Assert.assertTrue("'" + stackAdvisorRequestType0 + "' != '" + org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRequest.StackAdvisorRequestType.CONFIGURATIONS + "'", stackAdvisorRequestType0.equals(org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRequest.StackAdvisorRequestType.CONFIGURATIONS));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test433"); }

    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask0 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask0.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type3 = executeTask0.getStageWrapperType();
    java.lang.String str4 = executeTask0.getActionVerb();
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS + "'", type3.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Executing"+ "'", str4.equals("Executing"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test434"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.METRICS_DESCRIPTOR_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "metrics_descriptor"+ "'", str0.equals("metrics_descriptor"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test435"); }

    org.apache.ambari.server.api.resources.ExtensionResourceDefinition extensionResourceDefinition0 = new org.apache.ambari.server.api.resources.ExtensionResourceDefinition();
    java.lang.String str1 = extensionResourceDefinition0.getPluralName();
    java.lang.String str2 = extensionResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "extensions"+ "'", str1.equals("extensions"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "extension"+ "'", str2.equals("extension"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test436"); }

    org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder addRepositoryRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.builder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addRepositoryRequestAuditEventBuilder0);

  }

  @Test
  public void test437() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test437"); }

    // org.apache.ambari.server.checks.SecondaryNamenodeDeletedCheck secondaryNamenodeDeletedCheck0 = new org.apache.ambari.server.checks.SecondaryNamenodeDeletedCheck();
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
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType35 = prereqCheckRequest34.getUpgradeType();
    // org.apache.ambari.server.state.StackId stackId36 = null;
    // prereqCheckRequest34.setSourceStackId(stackId36);
    // // The following exception was thrown during execution in test generation
    // try {
    // secondaryNamenodeDeletedCheck0.perform(prerequisiteCheck3, prereqCheckRequest34);
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
    // org.junit.Assert.assertTrue("'" + upgradeType35 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType35.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test438"); }

    org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper ambariCustomCommandExecutionHelper0 = new org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper();
    org.apache.ambari.server.state.Cluster cluster1 = null;
    org.apache.ambari.server.state.Host host2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = ambariCustomCommandExecutionHelper0.getRepoInfo(cluster1, host2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test439"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity,java.lang.Long> singularattribute_alertTargetEntity_long0 = org.apache.ambari.server.orm.entities.AlertTargetEntity_.targetId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertTargetEntity_long0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test440"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.LOG_OUTPUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "log_output"+ "'", str0.equals("log_output"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test441"); }

    org.apache.ambari.server.serveraction.upgrades.OozieConfigCalculation oozieConfigCalculation0 = new org.apache.ambari.server.serveraction.upgrades.OozieConfigCalculation();

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test442"); }

    org.apache.ambari.server.agent.AgentEnv.JavaProc javaProc0 = new org.apache.ambari.server.agent.AgentEnv.JavaProc();
    java.lang.String str1 = javaProc0.getCommand();
    javaProc0.setPid(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test443"); }

    org.apache.ambari.server.controller.AuthToLocalBuilder authToLocalBuilder3 = new org.apache.ambari.server.controller.AuthToLocalBuilder("ViewUrlInfo/url_name", "hdfs-site", false);
    org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType concatenationType4 = org.apache.ambari.server.controller.AuthToLocalBuilder.DEFAULT_CONCATENATION_TYPE;
    java.lang.String str5 = authToLocalBuilder3.generate(concatenationType4);
    org.junit.Assert.assertTrue("'" + concatenationType4 + "' != '" + org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.NEW_LINES + "'", concatenationType4.equals(org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.NEW_LINES));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test444"); }

    org.apache.ambari.server.controller.ivory.Cluster.Location location2 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    java.lang.String str3 = location2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AlertTarget/name"+ "'", str3.equals("AlertTarget/name"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test445"); }

    java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.AMBARI_ALERT_SERVICE_NAME_OID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.8"+ "'", str0.equals("1.3.6.1.4.1.18060.16.1.1.1.8"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test446"); }

    org.apache.ambari.server.controller.logging.LogQueryResponse logQueryResponse0 = new org.apache.ambari.server.controller.logging.LogQueryResponse();
    logQueryResponse0.setPageSize("");

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test447"); }

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
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str24 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest25 = new org.apache.ambari.server.controller.ConfigurationRequest("service_component_filter", "yarn.scheduler.capacity.root.queues", "GreaterEqualsOperator", map_str_str21, map_str_map_str_str24);
    boolean b26 = configurationRequest25.includeProperties();
    java.lang.String str27 = configurationRequest25.getVersionTag();
    
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
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "GreaterEqualsOperator"+ "'", str27.equals("GreaterEqualsOperator"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test448"); }

    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse7 = new org.apache.ambari.server.controller.RepositoryResponse("Actions/target_service", "1.3.6.1.4.1.18060.16", "PermissionInfo/permission_name", "Versions/valid", "StackConfigurations/property_name", "QuickLinkInfo/default", "RUNNING");
    java.lang.String str8 = repositoryResponse7.getDefaultBaseUrl();
    boolean b9 = repositoryResponse7.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "QuickLinkInfo/default"+ "'", str8.equals("QuickLinkInfo/default"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test449"); }

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
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController30 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider31 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController30);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str32 = ldapSyncEventResourceProvider31.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController33 = null;
    com.google.inject.Injector injector34 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider35 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str26, map_type_str32, ambariManagementController33, injector34);
    org.apache.ambari.server.api.resources.JobResourceDefinition jobResourceDefinition36 = new org.apache.ambari.server.api.resources.JobResourceDefinition();
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer38 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule39 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl40 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule39);
    metricsPaddingRenderer38.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl40);
    org.apache.ambari.server.api.query.QueryImpl queryImpl42 = new org.apache.ambari.server.api.query.QueryImpl(map_type_str32, (org.apache.ambari.server.api.resources.ResourceDefinition)jobResourceDefinition36, (org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl40);
    org.apache.ambari.server.controller.spi.PageRequest pageRequest43 = null;
    queryImpl42.setPageRequest(pageRequest43);
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer46 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    queryImpl42.setRenderer((org.apache.ambari.server.api.query.render.Renderer)metricsPaddingRenderer46);
    queryImpl42.addLocalProperty("yarn.scheduler.capacity.root.queues");
    java.util.Set<java.lang.String> set_str50 = queryImpl42.getProperties();
    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder51 = addComponentToHostRequestAuditEventBuilder6.withComponents(set_str50);
    
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
    org.junit.Assert.assertNotNull(map_type_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder51);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test450"); }

    java.io.Closeable closeable0 = null;
    org.apache.ambari.server.utils.Closeables.closeLoggingExceptions(closeable0);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test451"); }

    org.apache.ambari.server.controller.OperatingSystemResponse operatingSystemResponse1 = new org.apache.ambari.server.controller.OperatingSystemResponse("AlertGroup");
    java.lang.String str2 = operatingSystemResponse1.getOsType();
    operatingSystemResponse1.setAmbariManagedRepos(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AlertGroup"+ "'", str2.equals("AlertGroup"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test452"); }

    org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo0 = new org.apache.ambari.server.state.ChangedConfigInfo();
    boolean b2 = changedConfigInfo0.equals((java.lang.Object)"UpgradeChecks/repository_version");
    org.apache.ambari.server.cleanup.TimeBasedCleanupPolicy timeBasedCleanupPolicy5 = new org.apache.ambari.server.cleanup.TimeBasedCleanupPolicy("AuthorizationInfo/cluster_name", (java.lang.Long)0L);
    boolean b6 = changedConfigInfo0.equals((java.lang.Object)timeBasedCleanupPolicy5);
    java.lang.String str7 = timeBasedCleanupPolicy5.getClusterName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "AuthorizationInfo/cluster_name"+ "'", str7.equals("AuthorizationInfo/cluster_name"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test453"); }

    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider0 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController1 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider2 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController1);
    java.lang.String[] str_array5 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request6 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array5);
    org.apache.ambari.server.controller.spi.Request request7 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array5);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate10 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate11 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array12 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate11 };
    org.apache.ambari.server.controller.spi.Predicate predicate13 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array12);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate14 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array12);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate17 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate20 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array21 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate10, andPredicate14, filterPredicate17, filterPredicate20 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate22 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array21);
    org.apache.ambari.server.actionmanager.ActionType actionType24 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType29 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array31 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization32 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization32, roleAuthorization_array31);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition34 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType24, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType29, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization32);
    boolean b35 = andPredicate22.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate36 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj37 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor38 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj37);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate36, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor38);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate40 = null;
    extendedResourcePredicateVisitor38.acceptUnaryPredicate(unaryPredicate40);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate22, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor38);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource43 = compatibleRepositoryVersionResourceProvider2.getResources(request7, (org.apache.ambari.server.controller.spi.Predicate)andPredicate22);
    org.apache.ambari.server.controller.spi.Predicate predicate44 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj45 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor46 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj45);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate44, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor46);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate50 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    extendedResourcePredicateVisitor46.acceptComparisonPredicate((org.apache.ambari.server.controller.predicate.ComparisonPredicate)filterPredicate50);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource52 = groupPrivilegeResourceProvider0.getResources(request7, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate50);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource43);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test454"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.DATANODE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test455"); }

    org.apache.ambari.server.orm.entities.HostRoleCommandEntity[] hostRoleCommandEntity_array0 = new org.apache.ambari.server.orm.entities.HostRoleCommandEntity[] {  };
    java.util.ArrayList<org.apache.ambari.server.orm.entities.HostRoleCommandEntity> arraylist_hostRoleCommandEntity1 = new java.util.ArrayList<org.apache.ambari.server.orm.entities.HostRoleCommandEntity>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.HostRoleCommandEntity>)arraylist_hostRoleCommandEntity1, hostRoleCommandEntity_array0);
    org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus4 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromTaskEntities((java.util.Collection<org.apache.ambari.server.orm.entities.HostRoleCommandEntity>)arraylist_hostRoleCommandEntity1, false);
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus5 = calculatedStatus4.getDisplayStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommandEntity_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(calculatedStatus4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hostRoleStatus5);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test456"); }

    org.springframework.security.core.Authentication authentication0 = null;
    org.apache.ambari.server.security.authorization.ResourceType resourceType1 = org.apache.ambari.server.security.authorization.ResourceType.CLUSTER;
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider5 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization6 = groupPrivilegeResourceProvider5.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization7 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array8 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization7 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization9 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9, roleAuthorization_array8);
    boolean b11 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization6, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.authorization.AuthorizationHelper.verifyAuthorization(authentication0, resourceType1, (java.lang.Long)300000L, set_roleAuthorization6);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + resourceType1 + "' != '" + org.apache.ambari.server.security.authorization.ResourceType.CLUSTER + "'", resourceType1.equals(org.apache.ambari.server.security.authorization.ResourceType.CLUSTER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization6);
    org.junit.Assert.assertTrue("'" + roleAuthorization7 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization7.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test457"); }

    org.apache.ambari.server.api.services.ViewPermissionService viewPermissionService2 = new org.apache.ambari.server.api.services.ViewPermissionService("kerberos_descriptor", "UpgradeChecks/id");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = viewPermissionService2.createPermission("not_managed_hdfs_path_list", httpHeaders4, uriInfo5, "Users/admin");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test458"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostOpRestartedEvent serviceComponentHostOpRestartedEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostOpRestartedEvent("RecoveryReport{summary='DISABLED', component_reports='[]'}", "ViewInstanceInfo/cluster_handle", (long)(short)1);
    java.lang.String str4 = serviceComponentHostOpRestartedEvent3.getHostName();
    java.lang.String str5 = serviceComponentHostOpRestartedEvent3.getStackId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ViewInstanceInfo/cluster_handle"+ "'", str4.equals("ViewInstanceInfo/cluster_handle"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test459"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = org.apache.ambari.server.controller.internal.HostStatusHelper.isHostLive(ambariManagementController0, "AMBARI.MANAGE_USERS", "yarn.scheduler.capacity.root");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test460"); }

    org.springframework.security.core.Authentication authentication0 = null;
    org.apache.ambari.server.security.authorization.ResourceType resourceType1 = null;
    org.apache.ambari.server.controller.spi.Resource.Type type3 = null;
    java.util.Set<java.lang.String> set_str4 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str5 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str4);
    org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException6 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type3, set_str5);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str7 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.keyPropertyIds;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController8 = null;
    org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider9 = new org.apache.ambari.server.controller.internal.ActionResourceProvider(set_str5, map_type_str7, ambariManagementController8);
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization10 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization11 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization12 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization13 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization14 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK;
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization15 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array16 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization10, roleAuthorization11, roleAuthorization12, roleAuthorization13, roleAuthorization14, roleAuthorization15 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization17 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization17, roleAuthorization_array16);
    actionResourceProvider9.setRequiredUpdateAuthorizations((java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization17);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.security.authorization.AuthorizationHelper.verifyAuthorization(authentication0, resourceType1, (java.lang.Long)100L, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization17);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str7);
    org.junit.Assert.assertTrue("'" + roleAuthorization10 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK + "'", roleAuthorization10.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK));
    org.junit.Assert.assertTrue("'" + roleAuthorization11 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS + "'", roleAuthorization11.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_ALERTS));
    org.junit.Assert.assertTrue("'" + roleAuthorization12 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS + "'", roleAuthorization12.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_CREDENTIALS));
    org.junit.Assert.assertTrue("'" + roleAuthorization13 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS + "'", roleAuthorization13.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_TOGGLE_KERBEROS));
    org.junit.Assert.assertTrue("'" + roleAuthorization14 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK + "'", roleAuthorization14.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_UPGRADE_DOWNGRADE_STACK));
    org.junit.Assert.assertTrue("'" + roleAuthorization15 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA + "'", roleAuthorization15.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MANAGE_USER_PERSISTED_DATA));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test461"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack1 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack0.mergeProcessing(upgradePack1);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.UpgradePack.ProcessingComponent>> map_str_map_str_processingComponent3 = upgradePack0.getTasks();
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.state.stack.UpgradePack.ProcessingComponent>> map_str_map_str_processingComponent4 = upgradePack0.getTasks();
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType5 = upgradePack0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_map_str_processingComponent3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_map_str_processingComponent4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(upgradeType5);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test462"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    boolean b4 = componentInfo0.isCustomCommand("UpgradeChecks/id");
    org.apache.ambari.server.state.AutoDeployInfo autoDeployInfo5 = componentInfo0.getAutoDeploy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(autoDeployInfo5);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test463"); }

    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider0);
    org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider gSInstallerHostProvider2 = new org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider(clusterDefinition1);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str3 = gSInstallerHostProvider2.getKeyPropertyIds();
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.keyPropertyIds = map_type_str3;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str3);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test464"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController6 = null;
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider activeWidgetLayoutResourceProvider7 = new org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider(ambariManagementController6);
    java.util.Set<java.lang.String> set_str8 = activeWidgetLayoutResourceProvider7.getCategoryIds();
    org.apache.ambari.server.controller.ExtensionLinkResponse extensionLinkResponse9 = new org.apache.ambari.server.controller.ExtensionLinkResponse("service", "Clusters/total_hosts", "Repositories/latest_base_url", "Request_Info/asc_order", "_SERVICE_CHECK", false, (java.util.Collection<java.lang.String>)set_str8);
    java.lang.String str10 = extensionLinkResponse9.getStackVersion();
    java.lang.String str11 = extensionLinkResponse9.getLinkId();
    java.util.Collection<java.lang.String> collection_str12 = extensionLinkResponse9.getErrors();
    java.lang.String str13 = extensionLinkResponse9.getStackVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Repositories/latest_base_url"+ "'", str10.equals("Repositories/latest_base_url"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "service"+ "'", str11.equals("service"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Repositories/latest_base_url"+ "'", str13.equals("Repositories/latest_base_url"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test465"); }

    org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO();
    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK configGroupHostMappingEntityPK1 = null;
    // The following exception was thrown during execution in test generation
    try {
    configGroupHostMappingDAO0.removeByPK(configGroupHostMappingEntityPK1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test466"); }

    org.apache.ambari.server.actionmanager.ActionType actionType1 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType6 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array8 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization9 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9, roleAuthorization_array8);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition11 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType1, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType6, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9);
    actionDefinition11.setTargetService("AlertTarget/notification_type");
    java.lang.String str14 = actionDefinition11.getTargetComponent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Repositories/latest_base_url"+ "'", str14.equals("Repositories/latest_base_url"));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test467"); }

    org.apache.ambari.server.state.AlertState alertState6 = null;
    org.apache.ambari.server.state.Alert alert7 = new org.apache.ambari.server.state.Alert("Repositories/repository_version_id", "kerberos_descriptor", "PrivilegeInfo/privilege_id", "forceRefreshConfigTagsBeforeExecution", "type", alertState6);
    org.apache.ambari.server.events.AlertReceivedEvent alertReceivedEvent8 = new org.apache.ambari.server.events.AlertReceivedEvent(0L, alert7);
    org.apache.ambari.server.state.Alert alert9 = alertReceivedEvent8.getAlert();
    long long10 = alertReceivedEvent8.getClusterId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(alert9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test468"); }

    org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType0 = org.apache.ambari.server.state.PropertyInfo.PropertyType.USER;
    org.junit.Assert.assertTrue("'" + propertyType0 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.USER + "'", propertyType0.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.USER));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test469"); }

    org.apache.ambari.server.audit.request.eventcreator.ServiceConfigDownloadEventCreator serviceConfigDownloadEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.ServiceConfigDownloadEventCreator();

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test470"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer transfer0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer();
    java.lang.String str1 = transfer0.defaultValue;
    transfer0.ifValue = "QuickLinkInfo/file_name";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test471() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest3.test471"); }

    // org.apache.ambari.server.state.Cluster cluster0 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType1 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction2 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj3 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext4 = new org.apache.ambari.server.state.UpgradeContext(cluster0, upgradeType1, direction2, map_str_obj3);
    // java.lang.String str6 = upgradeContext4.getServiceDisplay("");
    // boolean b7 = upgradeContext4.isManualVerificationAutoSkipped();
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test472"); }

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
    java.lang.String[] str_array40 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request41 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array40);
    org.apache.ambari.server.controller.spi.Request request42 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array40);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate45 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate46 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array47 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate46 };
    org.apache.ambari.server.controller.spi.Predicate predicate48 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array47);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate49 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array47);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate52 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate55 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array56 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate45, andPredicate49, filterPredicate52, filterPredicate55 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate57 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array56);
    org.apache.ambari.server.actionmanager.ActionType actionType59 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType64 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array66 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization67 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization67, roleAuthorization_array66);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition69 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType59, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType64, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization67);
    boolean b70 = andPredicate57.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate71 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj72 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor73 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj72);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate71, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor73);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate75 = null;
    extendedResourcePredicateVisitor73.acceptUnaryPredicate(unaryPredicate75);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate57, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor73);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus78 = clusterControllerImpl33.updateResources(type37, request42, (org.apache.ambari.server.controller.spi.Predicate)andPredicate57);
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
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test473"); }

    org.apache.ambari.server.configuration.Configuration configuration1 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str2 = configuration1.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file3 = configuration1.getRecommendationsDir();
    org.apache.ambari.server.configuration.Configuration configuration5 = new org.apache.ambari.server.configuration.Configuration();
    int i6 = configuration5.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher7 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration5);
    java.io.File file8 = configuration5.getRecommendationsDir();
    org.apache.ambari.server.security.encryption.CredentialProvider credentialProvider9 = new org.apache.ambari.server.security.encryption.CredentialProvider("operating_systems", file3, true, file8);
    // The following exception was thrown during execution in test generation
    try {
    credentialProvider9.generateAliasWithPassword("");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "nosniff"+ "'", str2.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file8);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test474"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = org.apache.ambari.server.topology.AmbariContext.getController();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(ambariManagementController0);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test475"); }

    org.apache.ambari.server.orm.dao.RequestScheduleDAO requestScheduleDAO0 = new org.apache.ambari.server.orm.dao.RequestScheduleDAO();
    org.apache.ambari.server.orm.entities.RequestScheduleEntity requestScheduleEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    requestScheduleDAO0.create(requestScheduleEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test476"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException2 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException();
    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException3 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("blueprint_name", (java.lang.Throwable)kerberosMissingAdminCredentialsException2);
    org.apache.ambari.server.view.IllegalClusterException illegalClusterException4 = new org.apache.ambari.server.view.IllegalClusterException((java.lang.Throwable)kerberosPrincipalAlreadyExistsException3);
    org.apache.ambari.server.serveraction.kerberos.KerberosLDAPContainerException kerberosLDAPContainerException5 = new org.apache.ambari.server.serveraction.kerberos.KerberosLDAPContainerException("service_type", (java.lang.Throwable)illegalClusterException4);
    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException6 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException((java.lang.Throwable)kerberosLDAPContainerException5);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test477"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigureFunction configureFunction0 = new org.apache.ambari.server.state.stack.upgrade.ConfigureFunction();
    configureFunction0.isSequential = false;
    java.lang.String str3 = configureFunction0.getActionVerb();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Configuring"+ "'", str3.equals("Configuring"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test478"); }

    org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator groupEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance4 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest5 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders1, requestBody2, uriInfo3, resourceInstance4);
    int i6 = postRequest5.getAPIVersion();
    java.lang.String str7 = postRequest5.getRemoteAddress();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS8 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus9 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS8);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS10 = resultStatus9.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS11 = resultStatus9.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl12 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus9);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.audit.event.AuditEvent auditEvent13 = groupEventCreator0.createAuditEvent((org.apache.ambari.server.api.services.Request)postRequest5, (org.apache.ambari.server.api.services.Result)resultImpl12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS11);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test479"); }

    org.apache.ambari.server.controller.StackServiceComponentRequest stackServiceComponentRequest4 = new org.apache.ambari.server.controller.StackServiceComponentRequest("config_recommendation_strategy", "RootService/service_name", "recovery_retry_interval", "RequestBodyInfo");
    java.lang.String str5 = stackServiceComponentRequest4.getServiceName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "recovery_retry_interval"+ "'", str5.equals("recovery_retry_interval"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test480"); }

    java.lang.String str0 = org.apache.ambari.server.stack.StackManager.METAINFO_FILE_NAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "metainfo.xml"+ "'", str0.equals("metainfo.xml"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test481"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    long long6 = configuration0.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str7 = configuration0.getWebAppDir();
    java.lang.String str8 = configuration0.isAgentStackRetryOnInstallEnabled();
    org.apache.ambari.server.controller.HostsMap hostsMap9 = new org.apache.ambari.server.controller.HostsMap(configuration0);
    
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
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test482"); }

    org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
    org.apache.ambari.server.state.stack.UpgradePack upgradePack1 = new org.apache.ambari.server.state.stack.UpgradePack();
    upgradePack0.mergeProcessing(upgradePack1);
    java.lang.String str3 = upgradePack1.getTarget();
    java.util.List<org.apache.ambari.server.state.stack.UpgradePack.IntermediateStack> list_intermediateStack4 = upgradePack1.getIntermediateStacks();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_intermediateStack4);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test483"); }

    org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider viewInstanceResourceProvider0 = new org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider();
    org.apache.ambari.server.controller.spi.Request request1 = null;
    java.lang.String[] str_array20 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str21, str_array20);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent23 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str21);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str21;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController25 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider26 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController25);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str27 = ldapSyncEventResourceProvider26.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController28 = null;
    com.google.inject.Injector injector29 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider30 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str21, map_type_str27, ambariManagementController28, injector29);
    org.apache.ambari.server.api.resources.JobResourceDefinition jobResourceDefinition31 = new org.apache.ambari.server.api.resources.JobResourceDefinition();
    org.apache.ambari.server.api.query.render.MetricsPaddingRenderer metricsPaddingRenderer33 = new org.apache.ambari.server.api.query.render.MetricsPaddingRenderer("RepositoryVersions/display_name");
    org.apache.ambari.server.controller.spi.ProviderModule providerModule34 = null;
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl35 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl(providerModule34);
    metricsPaddingRenderer33.init((org.apache.ambari.server.controller.spi.SchemaFactory)clusterControllerImpl35);
    org.apache.ambari.server.api.query.QueryImpl queryImpl37 = new org.apache.ambari.server.api.query.QueryImpl(map_type_str27, (org.apache.ambari.server.api.resources.ResourceDefinition)jobResourceDefinition31, (org.apache.ambari.server.controller.spi.ClusterController)clusterControllerImpl35);
    org.apache.ambari.server.controller.spi.PageRequest pageRequest38 = null;
    queryImpl37.setPageRequest(pageRequest38);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController40 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider41 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController40);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str42 = ldapSyncEventResourceProvider41.getKeyPropertyIds();
    queryImpl37.setKeyValueMap(map_type_str42);
    org.apache.ambari.server.api.query.ProcessingPredicateVisitor processingPredicateVisitor44 = new org.apache.ambari.server.api.query.ProcessingPredicateVisitor(queryImpl37);
    org.apache.ambari.server.controller.spi.Predicate predicate45 = processingPredicateVisitor44.getProcessedPredicate();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController46 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider47 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController46);
    java.lang.String[] str_array50 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request51 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array50);
    org.apache.ambari.server.controller.spi.Request request52 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array50);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate55 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate56 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array57 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate56 };
    org.apache.ambari.server.controller.spi.Predicate predicate58 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array57);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate59 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array57);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate62 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate65 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array66 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate55, andPredicate59, filterPredicate62, filterPredicate65 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate67 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array66);
    org.apache.ambari.server.actionmanager.ActionType actionType69 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType74 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array76 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization77 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization77, roleAuthorization_array76);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition79 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType69, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType74, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization77);
    boolean b80 = andPredicate67.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate81 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj82 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor83 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj82);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate81, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor83);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate85 = null;
    extendedResourcePredicateVisitor83.acceptUnaryPredicate(unaryPredicate85);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate67, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor83);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource88 = compatibleRepositoryVersionResourceProvider47.getResources(request52, (org.apache.ambari.server.controller.spi.Predicate)andPredicate67);
    processingPredicateVisitor44.acceptArrayPredicate((org.apache.ambari.server.controller.predicate.ArrayPredicate)andPredicate67);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource90 = viewInstanceResourceProvider0.getResources(request1, (org.apache.ambari.server.controller.spi.Predicate)andPredicate67);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource88);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test484"); }

    org.apache.ambari.server.orm.dao.RoleAuthorizationDAO roleAuthorizationDAO0 = new org.apache.ambari.server.orm.dao.RoleAuthorizationDAO();
    org.apache.ambari.server.orm.entities.RoleAuthorizationEntity roleAuthorizationEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.RoleAuthorizationEntity roleAuthorizationEntity2 = roleAuthorizationDAO0.merge(roleAuthorizationEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test485"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getAlertEventPublisherPoolSize();
    java.lang.Integer i4 = configuration0.getDefaultServerTaskTimeout();
    java.lang.Long long5 = configuration0.getExecutionSchedulerWait();
    java.lang.String str6 = configuration0.getExecutionSchedulerConnections();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 1200+ "'", i4.equals(1200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1000L+ "'", long5.equals(1000L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5"+ "'", str6.equals("5"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test486"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse recommendationResponse0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse();
    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.Recommendation recommendation1 = null;
    recommendationResponse0.setRecommendations(recommendation1);
    org.apache.ambari.server.state.SecurityType securityType6 = null;
    java.lang.Integer[] i_array12 = new java.lang.Integer[] { 1, 0, 1, 10 };
    java.util.TreeSet<java.lang.Integer> treeset_i13 = new java.util.TreeSet<java.lang.Integer>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>)treeset_i13, i_array12);
    java.util.Set<java.lang.String> set_str15 = org.apache.ambari.server.utils.StageUtils.replaceRanges((java.util.SortedSet<java.lang.Integer>)treeset_i13);
    org.apache.ambari.server.controller.ClusterRequest clusterRequest16 = new org.apache.ambari.server.controller.ClusterRequest((java.lang.Long)1L, "Versions/parent_extension_version", "ViewInstanceInfo/view_name", securityType6, "WidgetLayoutInfo/cluster_name", set_str15);
    java.lang.Long long17 = clusterRequest16.getClusterId();
    org.apache.ambari.server.state.repository.AvailableServiceReference availableServiceReference18 = new org.apache.ambari.server.state.repository.AvailableServiceReference();
    java.lang.String[] str_array37 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str38 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str38, str_array37);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent40 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str38);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str38;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController42 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider43 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController42);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str44 = ldapSyncEventResourceProvider43.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController45 = null;
    com.google.inject.Injector injector46 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider47 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str38, map_type_str44, ambariManagementController45, injector46);
    org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str38;
    availableServiceReference18.components = linkedhashset_str38;
    clusterRequest16.setHostNames((java.util.Set<java.lang.String>)linkedhashset_str38);
    recommendationResponse0.setHosts((java.util.Set<java.lang.String>)linkedhashset_str38);
    int i52 = recommendationResponse0.getId();
    java.util.Set<java.lang.String> set_str53 = recommendationResponse0.getServices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L+ "'", long17.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_str53);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test487"); }

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
    actionDefinition11.setDefaultTimeout((java.lang.Short)(short)1);
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider28 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization29 = groupPrivilegeResourceProvider28.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization30 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array31 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization30 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization32 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization32, roleAuthorization_array31);
    boolean b34 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization29, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization32);
    actionDefinition11.setPermissions(set_roleAuthorization29);
    actionDefinition11.setTargetComponent("downgrade");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization29);
    org.junit.Assert.assertTrue("'" + roleAuthorization30 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization30.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test488"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.String str4 = configuration0.getNodeRecoveryType();
    java.lang.String str5 = configuration0.getAlertTemplateFile();
    java.lang.Integer i6 = configuration0.getAgentApiAcceptors();
    int i7 = configuration0.getAlertEventPublisherPoolSize();
    
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
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test489"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    org.apache.ambari.server.state.QuickLinksConfigurationInfo quickLinksConfigurationInfo3 = new org.apache.ambari.server.state.QuickLinksConfigurationInfo();
    java.lang.String str4 = quickLinksConfigurationInfo3.toString();
    java.lang.Boolean b5 = quickLinksConfigurationInfo3.getIsDefault();
    java.lang.Boolean b6 = quickLinksConfigurationInfo3.isDeleted();
    org.apache.ambari.server.stack.QuickLinksConfigurationModule quickLinksConfigurationModule7 = new org.apache.ambari.server.stack.QuickLinksConfigurationModule(file2, quickLinksConfigurationInfo3);
    quickLinksConfigurationModule7.addError("hosts");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"+ "'", str4.equals("QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b5 + "' != '" + false+ "'", b5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + false+ "'", b6.equals(false));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test490"); }

    org.apache.ambari.server.controller.logging.LogQueryResponse logQueryResponse0 = new org.apache.ambari.server.controller.logging.LogQueryResponse();
    java.lang.String str1 = logQueryResponse0.getResultSize();
    java.lang.String str2 = logQueryResponse0.getPageSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test491"); }

    java.lang.Number number6 = null;
    java.lang.Number number10 = null;
    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO15 = new org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO((java.lang.Number)400, (java.lang.Number)(short)100, (java.lang.Number)10, (java.lang.Number)(short)0, (java.lang.Number)(byte)10, (java.lang.Number)(byte)10, number6, (java.lang.Number)10L, (java.lang.Number)10.0f, (java.lang.Number)(byte)0, number10, (java.lang.Number)(short)100, (java.lang.Number)0L, (java.lang.Number)(byte)-1, (java.lang.Number)(-1L));
    int i16 = hostRoleCommandStatusSummaryDTO15.getTaskTotal();
    boolean b17 = hostRoleCommandStatusSummaryDTO15.isStageSkippable();
    java.lang.Long long18 = hostRoleCommandStatusSummaryDTO15.getEndTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test492"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.OracleHelper oracleHelper1 = new org.apache.ambari.server.orm.helpers.dbms.OracleHelper(databasePlatform0);
    java.lang.StringBuilder stringBuilder2 = null;
    org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.StringBuilder stringBuilder5 = oracleHelper1.writeColumnRenameString(stringBuilder2, "isCommand :false, action :Tasks/custom_command_name, command :1.3.6.1.4.1.18060.16.1.1.1.7, inputs :{}, resourceFilters: [], exclusive: false, clusterName :MetricsRetrievalService [NEW]", dBColumnInfo4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test493"); }

    java.lang.String str5 = org.apache.ambari.server.api.services.AmbariMetaInfo.generateRepoMetaKey("stack_name", "", "Users/admin", "jce_name", "ViewInstanceInfo/validation_result");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "repo:/stack_name//Users/admin/jce_name:ViewInstanceInfo/validation_result"+ "'", str5.equals("repo:/stack_name//Users/admin/jce_name:ViewInstanceInfo/validation_result"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test494"); }

    java.lang.String str1 = org.apache.ambari.server.utils.ShellCommandUtil.getUnixFilePermissions("Executing");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test495"); }

    org.apache.ambari.server.state.SecurityState securityState0 = org.apache.ambari.server.state.SecurityState.SECURING;
    org.junit.Assert.assertTrue("'" + securityState0 + "' != '" + org.apache.ambari.server.state.SecurityState.SECURING + "'", securityState0.equals(org.apache.ambari.server.state.SecurityState.SECURING));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test496"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setHidden("VersionDefinition/stack_name");
    java.lang.String str3 = valueAttributesInfo0.getMinimum();
    valueAttributesInfo0.setEmptyValueValid((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test497"); }

    org.apache.ambari.server.StackAccessException stackAccessException1 = new org.apache.ambari.server.StackAccessException("type");

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test498"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.api.resources.RootServiceHostComponentResourceDefinition rootServiceHostComponentResourceDefinition1 = new org.apache.ambari.server.api.resources.RootServiceHostComponentResourceDefinition(type0);
    java.lang.String str2 = rootServiceHostComponentResourceDefinition1.getPluralName();
    java.lang.String str3 = rootServiceHostComponentResourceDefinition1.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hostComponents"+ "'", str2.equals("hostComponents"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hostComponent"+ "'", str3.equals("hostComponent"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test499"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setSyncGroupMemberReplacePattern("AlertTarget/notification_type");
    java.util.List<java.lang.String> list_str3 = ldapServerProperties0.getLdapUrls();
    ldapServerProperties0.setUseSsl(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test500"); }

    org.apache.ambari.server.actionmanager.Stage[] stage_array0 = new org.apache.ambari.server.actionmanager.Stage[] {  };
    java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage> arraylist_stage1 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>)arraylist_stage1, stage_array0);
    org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus3 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStages((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>)arraylist_stage1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stage_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(calculatedStatus3);

  }

}