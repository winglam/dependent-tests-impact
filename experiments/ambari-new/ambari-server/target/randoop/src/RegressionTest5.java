
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test001"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup configGroup0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup();
    java.util.List<java.lang.String> list_str1 = configGroup0.getHosts();
    java.util.Map<java.lang.String,org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintConfigurations> map_str_blueprintConfigurations2 = configGroup0.getConfigurations();
    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup configGroup3 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup();
    java.util.List<java.lang.String> list_str4 = configGroup3.getHosts();
    java.util.Map<java.lang.String,org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintConfigurations> map_str_blueprintConfigurations5 = configGroup3.getConfigurations();
    configGroup0.setConfigurations(map_str_blueprintConfigurations5);
    java.util.Map<java.lang.String,org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintConfigurations> map_str_blueprintConfigurations7 = configGroup0.getConfigurations();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_blueprintConfigurations2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_blueprintConfigurations5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_blueprintConfigurations7);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test002"); }

    org.apache.ambari.server.bootstrap.SshHostInfo sshHostInfo0 = new org.apache.ambari.server.bootstrap.SshHostInfo();
    java.util.List<java.lang.String> list_str1 = org.apache.ambari.server.controller.utilities.PropertyHelper.AGGREGATE_FUNCTION_IDENTIFIERS;
    sshHostInfo0.setHosts(list_str1);
    sshHostInfo0.setPassword("ambari.dispatch.snmp.security.auth.passphrase");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str1);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test003"); }

    org.apache.ambari.server.utils.RetryHelper retryHelper0 = new org.apache.ambari.server.utils.RetryHelper();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test004"); }

    org.apache.ambari.server.audit.event.request.DeleteBlueprintRequestAuditEvent.DeleteBlueprintRequestAuditEventBuilder deleteBlueprintRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteBlueprintRequestAuditEvent.DeleteBlueprintRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.DeleteBlueprintRequestAuditEvent.DeleteBlueprintRequestAuditEventBuilder deleteBlueprintRequestAuditEventBuilder2 = deleteBlueprintRequestAuditEventBuilder0.withUserName("Upgrade/pack");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteBlueprintRequestAuditEventBuilder2);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test005"); }

    org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType stackAdvisorCommandType0 = org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_CONFIGURATIONS;
    org.junit.Assert.assertTrue("'" + stackAdvisorCommandType0 + "' != '" + org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_CONFIGURATIONS + "'", stackAdvisorCommandType0.equals(org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_CONFIGURATIONS));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test006"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.VersionDefinitionResourceProvider.VERSION_DEF_BASE64_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "version_base64"+ "'", str0.equals("version_base64"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test007"); }

    org.apache.ambari.server.orm.entities.HostRoleCommandEntity hostRoleCommandEntity5 = null;
    org.apache.ambari.server.controller.internal.UpgradeSummary upgradeSummary6 = new org.apache.ambari.server.controller.internal.UpgradeSummary("desired_version", (java.lang.Long)0L, (java.lang.Long)900L, (java.lang.Long)0L, "Upgrade/abort_reason", hostRoleCommandEntity5);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test008"); }

    org.apache.ambari.server.serveraction.users.PostUserCreationHookServerAction postUserCreationHookServerAction0 = new org.apache.ambari.server.serveraction.users.PostUserCreationHookServerAction();
    java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Object> concurrentmap_str_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.CommandReport commandReport2 = postUserCreationHookServerAction0.execute(concurrentmap_str_obj1);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
    } catch (org.apache.ambari.server.AmbariException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test009"); }

    org.apache.ambari.server.state.alert.SourceType sourceType0 = org.apache.ambari.server.state.alert.SourceType.PERCENT;
    org.junit.Assert.assertTrue("'" + sourceType0 + "' != '" + org.apache.ambari.server.state.alert.SourceType.PERCENT + "'", sourceType0.equals(org.apache.ambari.server.state.alert.SourceType.PERCENT));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test010"); }

    org.apache.ambari.server.controller.ServiceComponentRequest serviceComponentRequest5 = new org.apache.ambari.server.controller.ServiceComponentRequest("", "hi!", "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url");
    serviceComponentRequest5.setServiceName("ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}");
    java.lang.String str8 = serviceComponentRequest5.getRecoveryEnabled();
    java.lang.String str9 = serviceComponentRequest5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Repositories/latest_base_url"+ "'", str8.equals("Repositories/latest_base_url"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[clusterName=, serviceName=ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}, componentName=, desiredState=WidgetLayoutInfo/section_name, recoveryEnabled=Repositories/latest_base_url, componentCategory=null]"+ "'", str9.equals("[clusterName=, serviceName=ServiceInstalledEvent{cluserId=0, stackName=alerts.json, stackVersion=alerts.json, serviceName=}, componentName=, desiredState=WidgetLayoutInfo/section_name, recoveryEnabled=Repositories/latest_base_url, componentCategory=null]"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test011"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_CHECK_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/check_type"+ "'", str0.equals("UpgradeChecks/check_type"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test012"); }

    org.apache.ambari.server.api.rest.KdcServerReachabilityCheck kdcServerReachabilityCheck0 = new org.apache.ambari.server.api.rest.KdcServerReachabilityCheck();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = kdcServerReachabilityCheck0.xmlCheck(httpHeaders1, uriInfo2, "timeline.metrics.cluster.aggregator.minute.ttl");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test013"); }

    org.apache.ambari.server.state.PropertyStackUpgradeBehavior propertyStackUpgradeBehavior1 = new org.apache.ambari.server.state.PropertyStackUpgradeBehavior(false);
    boolean b2 = propertyStackUpgradeBehavior1.isMerge();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test014"); }

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
    org.apache.ambari.server.audit.event.request.ChangeRepositoryVersionRequestAuditEvent.ChangeRepositoryVersionAuditEventBuilder changeRepositoryVersionAuditEventBuilder32 = changeRepositoryVersionAuditEventBuilder28.withDisplayName("ExtensionLink/link_id");
    
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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test015"); }

    org.apache.ambari.server.api.services.AmbariPrivilegeService ambariPrivilegeService0 = new org.apache.ambari.server.api.services.AmbariPrivilegeService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = ambariPrivilegeService0.updatePrivileges("jdbc:derby:memory:myDB/ambari;create=true", httpHeaders2, uriInfo3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test016"); }

    org.apache.ambari.server.state.kerberos.KerberosPrincipalType kerberosPrincipalType1 = org.apache.ambari.server.state.kerberos.KerberosPrincipalType.USER;
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor4 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor("Versions/parent_extension_version", kerberosPrincipalType1, "hdfs-site", "AlertGroup/name");
    java.lang.String str5 = kerberosPrincipalDescriptor4.getConfiguration();
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor6 = null;
    kerberosPrincipalDescriptor4.update(kerberosPrincipalDescriptor6);
    org.junit.Assert.assertTrue("'" + kerberosPrincipalType1 + "' != '" + org.apache.ambari.server.state.kerberos.KerberosPrincipalType.USER + "'", kerberosPrincipalType1.equals(org.apache.ambari.server.state.kerberos.KerberosPrincipalType.USER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hdfs-site"+ "'", str5.equals("hdfs-site"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test017"); }

    org.apache.ambari.server.state.AlertState alertState5 = org.apache.ambari.server.state.AlertState.WARNING;
    org.apache.ambari.server.state.Alert alert6 = new org.apache.ambari.server.state.Alert("false", "principal_type", "Repositories/base_url", "mysql_jdbc_url", "AlertTarget/notification_type", alertState5);
    java.lang.String str7 = alert6.toString();
    org.junit.Assert.assertTrue("'" + alertState5 + "' != '" + org.apache.ambari.server.state.AlertState.WARNING + "'", alertState5.equals(org.apache.ambari.server.state.AlertState.WARNING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{cluster=null, state=WARNING, name=false, service=Repositories/base_url, component=mysql_jdbc_url, host=AlertTarget/notification_type, instance=principal_type, text='null'}"+ "'", str7.equals("{cluster=null, state=WARNING, name=false, service=Repositories/base_url, component=mysql_jdbc_url, host=AlertTarget/notification_type, instance=principal_type, text='null'}"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test018"); }

    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler.DEFAULT_MAX_DEGREE_OF_PARALLELISM = 1;

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test019"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog220.UPGRADE_TYPE_COL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "upgrade_type"+ "'", str0.equals("upgrade_type"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test020"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer transfer0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer();
    java.lang.String str1 = transfer0.defaultValue;
    transfer0.defaultValue = "ViewInstanceInfo/view_name:type";
    transfer0.preserveEdits = true;
    transfer0.deleteKey = "http";
    java.lang.String str8 = transfer0.deleteKey;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "http"+ "'", str8.equals("http"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test021"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    componentInfo0.setCategory("principal_type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test022"); }

    int i0 = org.apache.ambari.server.security.SecurePasswordHelper.DEFAULT_SECURE_PASSWORD_MIN_PUNCTUATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test023"); }

    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator0 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression1 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator0);
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression2 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator0);
    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator3 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression4 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator3);
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression5 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator3);
    relationalExpression5.setLeftOperand("*:*");
    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator8 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression9 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator8);
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression10 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator8);
    java.util.List<org.apache.ambari.server.api.predicate.expressions.Expression> list_expression12 = relationalExpression2.merge((org.apache.ambari.server.api.predicate.expressions.Expression)relationalExpression5, (org.apache.ambari.server.api.predicate.expressions.Expression)relationalExpression10, (int)'#');
    java.lang.String str13 = relationalExpression10.getRightOperand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_expression12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test024"); }

    org.apache.ambari.server.serveraction.kerberos.KDCType kDCType0 = org.apache.ambari.server.serveraction.kerberos.KDCType.ACTIVE_DIRECTORY;
    org.junit.Assert.assertTrue("'" + kDCType0 + "' != '" + org.apache.ambari.server.serveraction.kerberos.KDCType.ACTIVE_DIRECTORY + "'", kDCType0.equals(org.apache.ambari.server.serveraction.kerberos.KDCType.ACTIVE_DIRECTORY));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test025"); }

    org.apache.ambari.server.notifications.Recipient recipient0 = new org.apache.ambari.server.notifications.Recipient();
    java.lang.String str1 = recipient0.Identifier;
    java.lang.String str2 = recipient0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test026"); }

    org.apache.ambari.server.orm.dao.RemoteAmbariClusterDAO remoteAmbariClusterDAO0 = new org.apache.ambari.server.orm.dao.RemoteAmbariClusterDAO();

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test027"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.stack.OsFamily osFamily6 = new org.apache.ambari.server.state.stack.OsFamily(properties5);
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
  public void test028() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest5.test028"); }

    // org.apache.ambari.server.checks.RangerAuditDbCheck rangerAuditDbCheck0 = new org.apache.ambari.server.checks.RangerAuditDbCheck();
    // org.apache.ambari.server.checks.HostsRepositoryVersionCheck hostsRepositoryVersionCheck1 = new org.apache.ambari.server.checks.HostsRepositoryVersionCheck();
    // org.apache.ambari.server.state.Cluster cluster3 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType4 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction5 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj6 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext7 = new org.apache.ambari.server.state.UpgradeContext(cluster3, upgradeType4, direction5, map_str_obj6);
    // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest8 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType4);
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType9 = prereqCheckRequest8.getUpgradeType();
    // boolean b10 = hostsRepositoryVersionCheck1.isApplicable(prereqCheckRequest8);
    // // The following exception was thrown during execution in test generation
    // try {
    // boolean b11 = rangerAuditDbCheck0.isApplicable(prereqCheckRequest8);
    //   org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    // } catch (java.lang.NullPointerException e) {
    //   // Expected exception.
    // }
    
    // org.junit.Assert.assertTrue("'" + upgradeType4 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType4.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    // org.junit.Assert.assertTrue("'" + upgradeType9 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType9.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test029"); }

    org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType6 = org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE;
    org.apache.ambari.server.state.PropertyInfo.PropertyType[] propertyType_array7 = new org.apache.ambari.server.state.PropertyInfo.PropertyType[] { propertyType6 };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyInfo.PropertyType> linkedhashset_propertyType8 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyInfo.PropertyType>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo.PropertyType>)linkedhashset_propertyType8, propertyType_array7);
    org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType15 = org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE;
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface25 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array26 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface25 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface27 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface27, interface_array26);
    org.apache.ambari.server.controller.ivory.Cluster.Location location31 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array32 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location31 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location33 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location33, location_array32);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array35 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo36 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo36, propertyInfo_array35);
    java.util.Map<java.lang.String,java.lang.String> map_str_str38 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo39 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo36, map_str_str38);
    org.apache.ambari.server.controller.ivory.Cluster cluster40 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface27, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location33, map_str_str38);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str41 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest42 = new org.apache.ambari.server.controller.ConfigurationRequest("service_component_filter", "yarn.scheduler.capacity.root.queues", "GreaterEqualsOperator", map_str_str38, map_str_map_str_str41);
    org.apache.ambari.server.checks.CheckDescription checkDescription43 = new org.apache.ambari.server.checks.CheckDescription("max_duration_for_retries", prereqCheckType15, "ambari_db_rca_username", map_str_str38);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse44 = new org.apache.ambari.server.controller.StackConfigurationResponse("Versions/stack_version", "Upgrade/abort_reason", "Artifacts/service_name", "Stage/cluster_host_info", map_str_str38);
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo45 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo45.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str48 = valueAttributesInfo45.getIncrementStep();
    valueAttributesInfo45.setDelete("operation");
    valueAttributesInfo45.setSelectionCardinality("Credential/key");
    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType59 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str60 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo61 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array62 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo63 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo63, propertyDependencyInfo_array62);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse65 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType59, map_str_str60, valueAttributesInfo61, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo63);
    stackConfigurationResponse65.setPropertyName("sqlserver");
    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType68 = stackConfigurationResponse65.getPropertyType();
    java.lang.String str69 = stackConfigurationResponse65.getPropertyValue();
    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType76 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str77 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo78 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array79 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo80 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo80, propertyDependencyInfo_array79);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse82 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType76, map_str_str77, valueAttributesInfo78, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo80);
    java.lang.String str83 = stackConfigurationResponse82.getPropertyDescription();
    java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo> set_propertyDependencyInfo84 = stackConfigurationResponse82.getDependsOnProperties();
    stackConfigurationResponse65.setDependsOnProperties(set_propertyDependencyInfo84);
    org.apache.ambari.server.controller.StackLevelConfigurationResponse stackLevelConfigurationResponse86 = new org.apache.ambari.server.controller.StackLevelConfigurationResponse("Users/password", "StackLevelConfigurations/property_value_attributes", "AlertGroup/targets", "PrivilegeInfo/principal_name", "1.3.6.1.4.1.18060.16.1.1.1.2", (java.lang.Boolean)true, (java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType>)linkedhashset_propertyType8, map_str_str38, valueAttributesInfo45, set_propertyDependencyInfo84);
    java.lang.String str87 = stackLevelConfigurationResponse86.getType();
    org.junit.Assert.assertTrue("'" + propertyType6 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE + "'", propertyType6.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyType_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    org.junit.Assert.assertTrue("'" + prereqCheckType15 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE + "'", prereqCheckType15.equals(org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_propertyType68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "ERROR"+ "'", str69.equals("ERROR"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "Hosts/last_registration_time"+ "'", str83.equals("Hosts/last_registration_time"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_propertyDependencyInfo84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.2"+ "'", str87.equals("1.3.6.1.4.1.18060.16.1.1.1.2"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test030"); }

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
    org.apache.ambari.server.controller.internal.ConfigurationTopologyException configurationTopologyException32 = new org.apache.ambari.server.controller.internal.ConfigurationTopologyException((java.util.Collection<java.lang.String>)linkedhashset_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str26);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test031"); }

    org.apache.ambari.server.state.theme.TabLayout tabLayout0 = new org.apache.ambari.server.state.theme.TabLayout();
    java.lang.String str1 = tabLayout0.getTabRows();
    tabLayout0.setTabColumns("hostRoleCommandStatusCacheExpiryDurationMins");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test032"); }

    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyViewAuthorization(alertDefinitionEntity0);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test033"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostOpSucceededEvent serviceComponentHostOpSucceededEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostOpSucceededEvent("WidgetLayoutInfo/widgets", "Upgrade", (long)(short)0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test034"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    java.lang.String str6 = configuration0.getViewsXXSSProtectionHTTPResponseHeader();
    
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1; mode=block"+ "'", str6.equals("1; mode=block"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test035"); }

    org.apache.ambari.server.api.services.ClusterKerberosDescriptorService clusterKerberosDescriptorService1 = new org.apache.ambari.server.api.services.ClusterKerberosDescriptorService("StackLevelConfigurations/type");
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = clusterKerberosDescriptorService1.getKerberosDescriptor(httpHeaders2, uriInfo3, "target_stack");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test036"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    org.apache.ambari.server.metadata.ActionMetadata actionMetadata2 = new org.apache.ambari.server.metadata.ActionMetadata();
    java.util.List<java.lang.String> list_str4 = actionMetadata2.getActions("evaluate_when");
    componentInfo0.setConfigDependencies(list_str4);
    java.lang.String str6 = componentInfo0.getCardinality();
    org.apache.ambari.server.state.ComponentInfo componentInfo7 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule8 = new org.apache.ambari.server.stack.ComponentModule(componentInfo7);
    org.apache.ambari.server.metadata.ActionMetadata actionMetadata9 = new org.apache.ambari.server.metadata.ActionMetadata();
    java.util.List<java.lang.String> list_str11 = actionMetadata9.getActions("evaluate_when");
    componentInfo7.setConfigDependencies(list_str11);
    componentInfo0.setConfigDependencies(list_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str11);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test037"); }

    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder2 = viewPrivilegeChangeRequestAuditEventBuilder0.withVersion("Artifacts/service_name");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder4 = viewPrivilegeChangeRequestAuditEventBuilder0.withRemoteIp("downgrade");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder6 = viewPrivilegeChangeRequestAuditEventBuilder0.withOperation("yarn.scheduler.capacity.root");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder6);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test038"); }

    org.apache.ambari.server.controller.ExtensionLinkRequest extensionLinkRequest5 = new org.apache.ambari.server.controller.ExtensionLinkRequest("ambari-server", "recovery_enabled", "regenerate_keytabs", "StackLevelConfigurations/property_description", "HostRoles/desired_state");

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test039"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse8.setActionName("");
    java.lang.String str11 = actionResponse8.getTargetService();
    java.lang.String str12 = actionResponse8.getInputs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "configure-task-key-value-pairs"+ "'", str11.equals("configure-task-key-value-pairs"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ViewUrlInfo/view_instance_version"+ "'", str12.equals("ViewUrlInfo/view_instance_version"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test040"); }

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
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder16 = addUpgradeRequestAuditEventBuilder0.withRepositoryVersion("HostRoles/cluster_name");
    
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
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test041"); }

    org.apache.ambari.server.state.theme.ConfigPlacement configPlacement0 = new org.apache.ambari.server.state.theme.ConfigPlacement();
    configPlacement0.setSubsectionTabName("StackConfigurationDependency/dependency_name");
    java.lang.String str3 = configPlacement0.getSubsectionName();
    org.apache.ambari.server.state.theme.ConfigPlacement configPlacement4 = new org.apache.ambari.server.state.theme.ConfigPlacement();
    java.lang.String str5 = configPlacement4.getSubsectionName();
    configPlacement0.mergeWithParent(configPlacement4);
    java.util.List<org.apache.ambari.server.state.theme.ConfigCondition> list_configCondition7 = configPlacement0.getDependsOn();
    org.apache.ambari.server.state.theme.ConfigPlacement configPlacement8 = new org.apache.ambari.server.state.theme.ConfigPlacement();
    java.lang.String str9 = configPlacement8.getSubsectionName();
    configPlacement8.setSubsectionName("RootServiceComponents/service_name");
    configPlacement0.mergeWithParent(configPlacement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_configCondition7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test042"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyResponse stackConfigurationDependencyResponse2 = new org.apache.ambari.server.controller.StackConfigurationDependencyResponse("widgets.json", "widgets.json");
    stackConfigurationDependencyResponse2.setDependencyName("java.security.auth.login.config");
    stackConfigurationDependencyResponse2.setPropertyName("Artifacts/service_name");

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test043"); }

    org.apache.ambari.server.bootstrap.BootStrapStatus bootStrapStatus0 = new org.apache.ambari.server.bootstrap.BootStrapStatus();
    bootStrapStatus0.setLog("RepositoryVersions/release/compatible_with");
    org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat bSStat3 = org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.SUCCESS;
    bootStrapStatus0.setStatus(bSStat3);
    org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat bSStat5 = bootStrapStatus0.getStatus();
    org.junit.Assert.assertTrue("'" + bSStat3 + "' != '" + org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.SUCCESS + "'", bSStat3.equals(org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.SUCCESS));
    org.junit.Assert.assertTrue("'" + bSStat5 + "' != '" + org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.SUCCESS + "'", bSStat5.equals(org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.SUCCESS));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test044"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.keyPropertyIds;
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor1 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor(map_type_str0);
    org.apache.ambari.server.state.kerberos.KerberosPrincipalType kerberosPrincipalType2 = kerberosPrincipalDescriptor1.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(kerberosPrincipalType2);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test045"); }

    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    org.apache.ambari.server.metadata.ActionMetadata actionMetadata1 = new org.apache.ambari.server.metadata.ActionMetadata();
    java.util.List<java.lang.String> list_str3 = actionMetadata1.getActions("evaluate_when");
    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder4 = addUserToGroupRequestAuditEventBuilder0.withUserNameList(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder4);

  }

  @Test
  public void test046() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest5.test046"); }

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
    // java.lang.String str15 = upgradeContext4.getComponentDisplay("cluster_id", "cardinality");
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array7);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b9 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue("'" + str15 + "' != '" + "cardinality"+ "'", str15.equals("cardinality"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test047"); }

    org.apache.ambari.server.topology.BlueprintFactory blueprintFactory0 = null;
    org.apache.ambari.server.controller.internal.BaseClusterRequest.init(blueprintFactory0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test048"); }

    java.lang.Number number6 = null;
    java.lang.Number number10 = null;
    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO15 = new org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO((java.lang.Number)400, (java.lang.Number)(short)100, (java.lang.Number)10, (java.lang.Number)(short)0, (java.lang.Number)(byte)10, (java.lang.Number)(byte)10, number6, (java.lang.Number)10L, (java.lang.Number)10.0f, (java.lang.Number)(byte)0, number10, (java.lang.Number)(short)100, (java.lang.Number)0L, (java.lang.Number)(byte)-1, (java.lang.Number)(-1L));
    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO17 = hostRoleCommandStatusSummaryDTO15.timedout(1);
    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO19 = hostRoleCommandStatusSummaryDTO17.completed((int)(short)0);
    java.lang.Long long20 = hostRoleCommandStatusSummaryDTO17.getEndTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommandStatusSummaryDTO17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommandStatusSummaryDTO19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test049"); }

    org.apache.ambari.server.state.services.AlertNoticeDispatchService alertNoticeDispatchService0 = new org.apache.ambari.server.state.services.AlertNoticeDispatchService();
    com.google.common.util.concurrent.ListenableFuture<com.google.common.util.concurrent.Service.State> listenablefuture_state1 = alertNoticeDispatchService0.start();
    com.google.common.util.concurrent.ListenableFuture<com.google.common.util.concurrent.Service.State> listenablefuture_state2 = alertNoticeDispatchService0.start();
    com.google.common.util.concurrent.ListenableFuture<com.google.common.util.concurrent.Service.State> listenablefuture_state3 = alertNoticeDispatchService0.start();
    com.google.common.util.concurrent.ListenableFuture<com.google.common.util.concurrent.Service.State> listenablefuture_state4 = alertNoticeDispatchService0.start();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listenablefuture_state1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listenablefuture_state2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listenablefuture_state3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listenablefuture_state4);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test050"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.EVENT_STATUS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/status"+ "'", str0.equals("Event/status"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test051"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_NAMENODE_TRUNCATE;
    org.apache.ambari.server.checks.CheckDescription.CONFIG_MERGE = checkDescription0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test052"); }

    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS1 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus2 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS1);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = resultStatus2.getStatus();
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder4 = addHostRequestAuditEventBuilder0.withResultStatus(resultStatus2);
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder6 = addHostRequestAuditEventBuilder4.withRemoteIp("5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addHostRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addHostRequestAuditEventBuilder6);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test053"); }

    org.apache.ambari.server.state.alert.AlertDefinitionHash alertDefinitionHash0 = new org.apache.ambari.server.state.alert.AlertDefinitionHash();
    alertDefinitionHash0.invalidate("", "Tasks/command");
    org.apache.ambari.server.state.alert.AlertDefinition alertDefinition4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.lang.String> set_str5 = alertDefinitionHash0.invalidateHosts(alertDefinition4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test054"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_STORM_ROLLING_WARNING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test055"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)(-1L), "host_group", "Clusters/cluster_name", "java_version", "yarn.scheduler.capacity.root.queues", batch5, schedule6, "Stage/status", "Credential/key", "StackConfigurations/property_name", "downgrade_from_version", (java.lang.Integer)0);
    java.lang.Integer i13 = requestScheduleResponse12.getAuthenticatedUserId();
    java.lang.Integer i14 = requestScheduleResponse12.getAuthenticatedUserId();
    requestScheduleResponse12.setDescription("cluster.permissioninfo/resource_name.rootservicecomponents/service_name");
    requestScheduleResponse12.setStatus("ambari_db_rca_password");
    requestScheduleResponse12.setId((java.lang.Long)900L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test056"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = configuration0.getPreviousDatabaseConnectorNames();
    org.apache.ambari.server.utils.StageUtils.setConfiguration(configuration0);
    java.util.Properties properties5 = configuration0.getDatabaseCustomProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nosniff"+ "'", str1.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties5);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test057"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    widgetResponse0.setWidgetType("Hosts/last_registration_time");
    java.lang.String str3 = widgetResponse0.getClusterName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test058"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog222.CLUSTER_SECOND_TABLE_TTL_PROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "timeline.metrics.cluster.aggregator.second.ttl"+ "'", str0.equals("timeline.metrics.cluster.aggregator.second.ttl"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test059"); }

    org.apache.ambari.server.state.alert.ScriptSource scriptSource0 = new org.apache.ambari.server.state.alert.ScriptSource();
    java.lang.String str1 = scriptSource0.getPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test060"); }

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
    org.apache.ambari.server.upgrade.UpgradeCatalog[] upgradeCatalog_array16 = new org.apache.ambari.server.upgrade.UpgradeCatalog[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog> linkedhashset_upgradeCatalog17 = new java.util.LinkedHashSet<org.apache.ambari.server.upgrade.UpgradeCatalog>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog17, upgradeCatalog_array16);
    com.google.inject.persist.PersistService persistService19 = null;
    org.apache.ambari.server.orm.DBAccessor dBAccessor20 = null;
    org.apache.ambari.server.configuration.Configuration configuration21 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str22 = configuration21.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file23 = configuration21.getRecommendationsDir();
    java.lang.String str24 = configuration21.getHostsMapFile();
    java.lang.Integer i25 = configuration21.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties26 = configuration21.getPersistenceCustomProperties();
    long long27 = configuration21.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str28 = configuration21.getWebAppDir();
    java.lang.String str29 = configuration21.isAgentStackRetryOnInstallEnabled();
    org.apache.ambari.server.upgrade.SchemaUpgradeHelper schemaUpgradeHelper30 = new org.apache.ambari.server.upgrade.SchemaUpgradeHelper((java.util.Set<org.apache.ambari.server.upgrade.UpgradeCatalog>)linkedhashset_upgradeCatalog17, persistService19, dBAccessor20, configuration21);
    org.apache.ambari.server.audit.AuditLoggerDefaultImpl auditLoggerDefaultImpl31 = new org.apache.ambari.server.audit.AuditLoggerDefaultImpl(configuration21);
    org.apache.ambari.server.audit.request.eventcreator.ComponentEventCreator componentEventCreator32 = new org.apache.ambari.server.audit.request.eventcreator.ComponentEventCreator();
    org.apache.ambari.server.audit.request.eventcreator.BlueprintExportEventCreator blueprintExportEventCreator33 = new org.apache.ambari.server.audit.request.eventcreator.BlueprintExportEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type34 = blueprintExportEventCreator33.getResourceTypes();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS35 = blueprintExportEventCreator33.getResultStatuses();
    org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator privilegeEventCreator36 = new org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type37 = privilegeEventCreator36.getResourceTypes();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type38 = privilegeEventCreator36.getResourceTypes();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS39 = privilegeEventCreator36.getResultStatuses();
    org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator groupEventCreator40 = new org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator();
    org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator privilegeEventCreator41 = new org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type42 = privilegeEventCreator41.getResourceTypes();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type43 = privilegeEventCreator41.getResourceTypes();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS44 = privilegeEventCreator41.getResultStatuses();
    org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator privilegeEventCreator45 = new org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type46 = privilegeEventCreator45.getResourceTypes();
    org.apache.ambari.server.audit.request.eventcreator.UserEventCreator userEventCreator47 = new org.apache.ambari.server.audit.request.eventcreator.UserEventCreator();
    org.apache.ambari.server.audit.request.eventcreator.ComponentEventCreator componentEventCreator48 = new org.apache.ambari.server.audit.request.eventcreator.ComponentEventCreator();
    org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator groupEventCreator49 = new org.apache.ambari.server.audit.request.eventcreator.GroupEventCreator();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS50 = groupEventCreator49.getResultStatuses();
    org.apache.ambari.server.audit.request.eventcreator.UserEventCreator userEventCreator51 = new org.apache.ambari.server.audit.request.eventcreator.UserEventCreator();
    org.apache.ambari.server.audit.request.eventcreator.BlueprintExportEventCreator blueprintExportEventCreator52 = new org.apache.ambari.server.audit.request.eventcreator.BlueprintExportEventCreator();
    java.util.Set<org.apache.ambari.server.controller.spi.Resource.Type> set_type53 = blueprintExportEventCreator52.getResourceTypes();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS54 = blueprintExportEventCreator52.getResultStatuses();
    org.apache.ambari.server.audit.request.eventcreator.UpgradeItemEventCreator upgradeItemEventCreator55 = new org.apache.ambari.server.audit.request.eventcreator.UpgradeItemEventCreator();
    org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreator[] requestAuditEventCreator_array56 = new org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreator[] { componentEventCreator32, blueprintExportEventCreator33, privilegeEventCreator36, groupEventCreator40, privilegeEventCreator41, privilegeEventCreator45, userEventCreator47, componentEventCreator48, groupEventCreator49, userEventCreator51, blueprintExportEventCreator52, upgradeItemEventCreator55 };
    java.util.LinkedHashSet<org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreator> linkedhashset_requestAuditEventCreator57 = new java.util.LinkedHashSet<org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreator>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreator>)linkedhashset_requestAuditEventCreator57, requestAuditEventCreator_array56);
    org.apache.ambari.server.audit.request.RequestAuditLoggerImpl requestAuditLoggerImpl59 = new org.apache.ambari.server.audit.request.RequestAuditLoggerImpl((org.apache.ambari.server.audit.AuditLogger)auditLoggerDefaultImpl31, (java.util.Set<org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreator>)linkedhashset_requestAuditEventCreator57);
    org.apache.ambari.server.audit.request.RequestAuditLoggerImpl requestAuditLoggerImpl60 = new org.apache.ambari.server.audit.request.RequestAuditLoggerImpl((org.apache.ambari.server.audit.AuditLogger)auditLoggerDefaultImpl15, (java.util.Set<org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreator>)linkedhashset_requestAuditEventCreator57);
    
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
    org.junit.Assert.assertNotNull(upgradeCatalog_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "nosniff"+ "'", str22.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 30000+ "'", i25.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 5000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "false"+ "'", str29.equals("false"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestAuditEventCreator_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test061"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.lang.String str4 = hostResponse1.getRackInfo();
    java.lang.String str5 = hostResponse1.getRackInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test062"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str3 = valueAttributesInfo0.getCopy();
    valueAttributesInfo0.setReadOnly((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test063"); }

    org.apache.ambari.server.api.services.HostComponentService hostComponentService2 = new org.apache.ambari.server.api.services.HostComponentService("manage_identities", "service_name");
    javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = hostComponentService2.getProcesses(httpHeaders3, uriInfo4, "RepositoryVersions/display_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test064"); }

    org.apache.ambari.server.controller.AlertDefinitionResponse alertDefinitionResponse0 = new org.apache.ambari.server.controller.AlertDefinitionResponse();
    alertDefinitionResponse0.setComponentName("stack_versions");

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test065"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider.REPOSITORY_UPGRADES_SUPPORTED_TYPES_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CompatibleRepositoryVersions/upgrade_types"+ "'", str0.equals("CompatibleRepositoryVersions/upgrade_types"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test066"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array3 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter4 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestResourceFilter_array3);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest9 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter4, requestOperationLevel6, map_str_str7, false);
    java.lang.String str10 = executeActionRequest9.getActionName();
    java.lang.String str11 = executeActionRequest9.toString();
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel12 = executeActionRequest9.getOperationLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Tasks/custom_command_name"+ "'", str10.equals("Tasks/custom_command_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "isCommand :false, action :Tasks/custom_command_name, command :1.3.6.1.4.1.18060.16.1.1.1.7, inputs :{}, resourceFilters: [], exclusive: false, clusterName :MetricsRetrievalService [NEW]"+ "'", str11.equals("isCommand :false, action :Tasks/custom_command_name, command :1.3.6.1.4.1.18060.16.1.1.1.7, inputs :{}, resourceFilters: [], exclusive: false, clusterName :MetricsRetrievalService [NEW]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(requestOperationLevel12);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test067"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider6 = new org.apache.ambari.server.controller.internal.URLStreamProvider(1200, (-1), "ambari.dispatch.snmp.security.priv.passphrase", "OperatingSystems/version_definition_id", "timeline.metrics.cluster.aggregator.minute.ttl");
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration7 = null;
    org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider viewInstanceResourceProvider8 = new org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization9 = viewInstanceResourceProvider8.getRequiredCreateAuthorizations();
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule10 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    viewInstanceResourceProvider8.addObserver((org.apache.ambari.server.controller.internal.ResourceProviderObserver)defaultProviderModule10);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.ganglia.GangliaReportPropertyProvider gangliaReportPropertyProvider13 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaReportPropertyProvider(map_str_map_str_propertyInfo0, (org.apache.ambari.server.controller.utilities.StreamProvider)uRLStreamProvider6, componentSSLConfiguration7, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule10, "params/padding");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization9);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test068"); }

    java.util.Map<java.lang.Long,org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO> map_long_hostRoleCommandStatusSummaryDTO0 = null;
    java.lang.Long[] long_array6 = new java.lang.Long[] { 0L, 100L, (-1L), 300000L, 1L };
    java.util.LinkedHashSet<java.lang.Long> linkedhashset_long7 = new java.util.LinkedHashSet<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)linkedhashset_long7, long_array6);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map<org.apache.ambari.server.actionmanager.HostRoleStatus,java.lang.Integer> map_hostRoleStatus_i9 = org.apache.ambari.server.controller.internal.CalculatedStatus.calculateTaskStatusCounts(map_long_hostRoleCommandStatusSummaryDTO0, (java.util.Set<java.lang.Long>)linkedhashset_long7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test069"); }

    org.apache.ambari.server.state.theme.ThemeConfiguration themeConfiguration0 = new org.apache.ambari.server.state.theme.ThemeConfiguration();

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test070"); }

    org.apache.ambari.server.api.services.RequestBody requestBody0 = new org.apache.ambari.server.api.services.RequestBody();
    java.util.Set<java.util.Map<java.lang.String,java.lang.Object>> set_map_str_obj1 = requestBody0.getPropertySets();
    org.apache.ambari.server.api.services.NamedPropertySet namedPropertySet2 = null;
    requestBody0.addPropertySet(namedPropertySet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_map_str_obj1);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test071"); }

    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport0 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i1 = clusterHealthReport0.getStaleConfigsHosts();
    clusterHealthReport0.setHeartbeatLostStateHosts(20000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test072"); }

    org.apache.ambari.server.orm.entities.ViewInstancePropertyEntityPK viewInstancePropertyEntityPK0 = new org.apache.ambari.server.orm.entities.ViewInstancePropertyEntityPK();
    viewInstancePropertyEntityPK0.setViewName("AlertNotice/notification_state");

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test073"); }

    org.apache.ambari.server.checks.ConfigurationMergeCheck.MergeDetail mergeDetail0 = new org.apache.ambari.server.checks.ConfigurationMergeCheck.MergeDetail();
    mergeDetail0.result_value = "ViewVersionInfo/min_ambari_version";
    java.lang.String str3 = mergeDetail0.property;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test074"); }

    org.apache.ambari.server.orm.dao.WidgetLayoutDAO widgetLayoutDAO0 = new org.apache.ambari.server.orm.dao.WidgetLayoutDAO();
    org.apache.ambari.server.orm.entities.WidgetLayoutEntity widgetLayoutEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    widgetLayoutDAO0.refresh(widgetLayoutEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test075"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.endTime = singularattribute_hostRoleCommandEntity_long0;

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test076"); }

    java.lang.String str1 = org.apache.ambari.server.serveraction.upgrades.FixLzoCodecPath.fixLzoJarPath("StackConfigurationDependency/dependency_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "StackConfigurationDependency/dependency_name"+ "'", str1.equals("StackConfigurationDependency/dependency_name"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test077"); }

    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse7 = new org.apache.ambari.server.controller.RepositoryResponse("Actions/target_service", "1.3.6.1.4.1.18060.16", "PermissionInfo/permission_name", "Versions/valid", "StackConfigurations/property_name", "QuickLinkInfo/default", "RUNNING");
    boolean b8 = repositoryResponse7.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test078"); }

    org.apache.ambari.server.controller.logging.LogQueryResponse logQueryResponse0 = new org.apache.ambari.server.controller.logging.LogQueryResponse();
    java.lang.String str1 = logQueryResponse0.getResultSize();
    java.lang.String str2 = logQueryResponse0.getQueryTimeMS();
    logQueryResponse0.setStartIndex("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test079"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.PROPERTY_PROVIDER_THREADPOOL_COMPLETION_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_long0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test080"); }

    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.AccessUnauthorizedAuditEventBuilder accessUnauthorizedAuditEventBuilder0 = org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.builder();
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent accessUnauthorizedAuditEvent1 = accessUnauthorizedAuditEventBuilder0.build();
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.AccessUnauthorizedAuditEventBuilder accessUnauthorizedAuditEventBuilder3 = accessUnauthorizedAuditEventBuilder0.withRemoteIp("AlertTarget/notification_type");
    org.apache.ambari.server.audit.event.AccessUnauthorizedAuditEvent.AccessUnauthorizedAuditEventBuilder accessUnauthorizedAuditEventBuilder5 = accessUnauthorizedAuditEventBuilder0.withRemoteIp("validate_config");
    
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
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test081"); }

    boolean b1 = org.apache.ambari.server.controller.utilities.PropertyHelper.hasAggregateFunctionSuffix("HTTP_ONLY");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test082"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.COMMAND_EXECUTION_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test083"); }

    org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent.StartOperationAuditEventBuilder startOperationAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent.StartOperationAuditEventBuilder startOperationAuditEventBuilder2 = startOperationAuditEventBuilder0.withReasonOfFailure("UpgradeItem/group_id");
    org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent startOperationRequestAuditEvent3 = startOperationAuditEventBuilder2.build();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(startOperationAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(startOperationAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(startOperationRequestAuditEvent3);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test084"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.ambari.server.controller.HostRequest hostRequest3 = new org.apache.ambari.server.controller.HostRequest("Stage/host_params", "WidgetLayoutInfo/section_name", map_str_str2);
    hostRequest3.setHostGroupName("cluster.permissioninfo/resource_name.rootservicecomponents/service_name");
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
    hostRequest3.setHostAttributes(map_str_str24);
    
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
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test085"); }

    org.apache.ambari.server.orm.entities.RepositoryEntity repositoryEntity0 = new org.apache.ambari.server.orm.entities.RepositoryEntity();
    boolean b1 = repositoryEntity0.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test086"); }

    org.apache.ambari.server.controller.RequestRequest requestRequest2 = new org.apache.ambari.server.controller.RequestRequest("777", (long)(-1));
    org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus3 = requestRequest2.getStatus();
    java.lang.String str4 = requestRequest2.getAbortReason();
    java.lang.String str5 = requestRequest2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hostRoleStatus3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "RequestRequest{clusterName='777', requestId=-1, status=null, abortReason='null'}"+ "'", str5.equals("RequestRequest{clusterName='777', requestId=-1, status=null, abortReason='null'}"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test087"); }

    org.apache.ambari.server.api.resources.TargetClusterResourceDefinition targetClusterResourceDefinition0 = new org.apache.ambari.server.api.resources.TargetClusterResourceDefinition();
    java.lang.String str1 = targetClusterResourceDefinition0.getSingularName();
    java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition2 = targetClusterResourceDefinition0.getSubResourceDefinitions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "target"+ "'", str1.equals("target"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_subResourceDefinition2);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test088"); }

    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse7 = new org.apache.ambari.server.controller.RepositoryResponse("PermissionInfo/resource_name", "Users/old_password", "Actions/default_timeout", "metrics_descriptor", "AlertGroup/cluster_name", "AuthorizationInfo/user_name", "PrivilegeInfo/principal_name");
    java.lang.String str8 = repositoryResponse7.getStackName();
    java.lang.String str9 = repositoryResponse7.getOsType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Users/old_password"+ "'", str9.equals("Users/old_password"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test089"); }

    org.apache.ambari.server.api.resources.TaskResourceDefinition taskResourceDefinition0 = new org.apache.ambari.server.api.resources.TaskResourceDefinition();
    java.lang.String str1 = taskResourceDefinition0.getSingularName();
    boolean b2 = taskResourceDefinition0.isCreatable();
    java.lang.String str3 = taskResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "task"+ "'", str1.equals("task"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "task"+ "'", str3.equals("task"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test090"); }

    org.apache.ambari.server.state.action.ActionType actionType1 = null;
    org.apache.ambari.server.state.action.ActionId actionId2 = new org.apache.ambari.server.state.action.ActionId((long)5, actionType1);
    org.apache.ambari.server.state.action.ActionImpl actionImpl4 = new org.apache.ambari.server.state.action.ActionImpl(actionId2, 10L);
    org.apache.ambari.server.state.action.ActionInitEvent actionInitEvent6 = new org.apache.ambari.server.state.action.ActionInitEvent(actionId2, (long)500);
    org.apache.ambari.server.state.action.ActionProgressUpdateEvent actionProgressUpdateEvent8 = new org.apache.ambari.server.state.action.ActionProgressUpdateEvent(actionId2, (long)'4');
    long long9 = actionProgressUpdateEvent8.getProgressUpdateTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 52L);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test091"); }

    org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler mITKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.MITKerberosOperationHandler();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType1 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    java.lang.String str2 = mITKerberosOperationHandler0.getDefaultRealm();
    java.util.Set<org.apache.directory.shared.kerberos.codec.types.EncryptionType> set_encryptionType3 = mITKerberosOperationHandler0.getKeyEncryptionTypes();
    org.apache.ambari.server.security.credential.PrincipalKeyCredential principalKeyCredential4 = mITKerberosOperationHandler0.getAdministratorCredential();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_encryptionType3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(principalKeyCredential4);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test092"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setSyncGroupMemberReplacePattern("AlertTarget/notification_type");
    ldapServerProperties0.setAnonymousBind(true);
    ldapServerProperties0.setGroupBase("ExtensionLink/stack_name");

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test093"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.WIDGETLAYOUT_DISPLAY_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/display_name"+ "'", str0.equals("WidgetLayoutInfo/display_name"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test094"); }

    org.apache.ambari.server.view.configuration.ViewConfig viewConfig0 = new org.apache.ambari.server.view.configuration.ViewConfig();
    java.lang.String str1 = viewConfig0.getMasker();
    java.lang.String str2 = viewConfig0.getBuild();
    java.lang.String str3 = viewConfig0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test095"); }

    org.apache.ambari.server.api.resources.DetachedHostResourceDefinition detachedHostResourceDefinition0 = new org.apache.ambari.server.api.resources.DetachedHostResourceDefinition();
    java.lang.String str1 = detachedHostResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hosts"+ "'", str1.equals("hosts"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test096"); }

    org.apache.ambari.server.controller.internal.PropertyInfo propertyInfo3 = new org.apache.ambari.server.controller.internal.PropertyInfo("blueprint_name", true, true);
    java.lang.String str4 = propertyInfo3.getAmsId();
    java.lang.String str5 = propertyInfo3.getAmsId();
    boolean b6 = propertyInfo3.isTemporal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test097"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.PROPERTY_DISPLAY_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/property_display_name"+ "'", str0.equals("StackConfigurations/property_display_name"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test098"); }

    org.apache.ambari.server.topology.SecurityConfigurationFactory securityConfigurationFactory0 = new org.apache.ambari.server.topology.SecurityConfigurationFactory();

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test099"); }

    org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.AddRequestAuditEventBuilder addRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddRequestRequestAuditEvent.builder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addRequestAuditEventBuilder0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test100"); }

    com.google.inject.Injector injector0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.upgrade.UpgradeCatalog222 upgradeCatalog2221 = new org.apache.ambari.server.upgrade.UpgradeCatalog222(injector0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test101"); }

    org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.RemoveUserFromGroupRequestAuditEvent.builder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test102"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.HARDCODED_STACK_VERSION_PROPERTIES_CHECK;
    org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck2 = new org.apache.ambari.server.state.stack.PrerequisiteCheck(checkDescription0, "upgrade_suspended");
    java.lang.String str3 = prerequisiteCheck2.getId();
    prerequisiteCheck2.setFailReason("RootServiceHostComponents/component_version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "HARDCODED_STACK_VERSION_PROPERTIES_CHECK"+ "'", str3.equals("HARDCODED_STACK_VERSION_PROPERTIES_CHECK"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test103"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    componentInfo0.setDeleted(true);
    org.apache.ambari.server.api.services.TargetClusterService targetClusterService5 = new org.apache.ambari.server.api.services.TargetClusterService();
    boolean b6 = componentInfo0.equals((java.lang.Object)targetClusterService5);
    javax.ws.rs.core.HttpHeaders httpHeaders8 = null;
    javax.ws.rs.core.UriInfo uriInfo9 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response11 = targetClusterService5.getTargetCluster("recovery_settings", httpHeaders8, uriInfo9, "1; mode=block");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test104"); }

    org.apache.ambari.server.controller.RepositoryRequest repositoryRequest4 = new org.apache.ambari.server.controller.RepositoryRequest("Groups/group_type", "notification.dispatch.alert.script", "host_predicate", "Alert/maintenance_state");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test105"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    java.lang.String str1 = ldapServerProperties0.getSyncGroupMemberReplacePattern();
    java.lang.String str2 = ldapServerProperties0.getAdminGroupMappingMemberAttr();
    java.lang.String str3 = ldapServerProperties0.getGroupBase();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test106"); }

    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider0);
    java.util.Set<java.lang.String> set_str2 = clusterDefinition1.getHosts();
    java.lang.String str4 = clusterDefinition1.getHostState("Internal Server Error");
    java.util.Set<java.lang.String> set_str6 = clusterDefinition1.getComponents("Body");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HEALTHY"+ "'", str4.equals("HEALTHY"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_str6);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test107"); }

    org.apache.ambari.server.audit.event.request.DeleteAlertTargetRequestAuditEvent.DeleteAlertTargetRequestAuditEventBuilder deleteAlertTargetRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteAlertTargetRequestAuditEvent.DeleteAlertTargetRequestAuditEventBuilder();

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test108"); }

    org.apache.ambari.server.api.services.ExtensionsService extensionsService0 = new org.apache.ambari.server.api.services.ExtensionsService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = extensionsService0.getExtension("type", httpHeaders2, uriInfo3, "ranger-hive-plugin-enabled");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test109() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest5.test109"); }

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
    // java.lang.Long[] long_array66 = new java.lang.Long[] { 5000L, 100L, 52L, 0L, 900L, 1L, (-1L), 0L, 0L, 52L, 100L };
    // java.util.ArrayList<java.lang.Long> arraylist_long67 = new java.util.ArrayList<java.lang.Long>();
    // boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long67, long_array66);
    // configurationResponse54.setServiceConfigVersions((java.util.List<java.lang.Long>)arraylist_long67);
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
    // org.junit.Assert.assertNotNull(long_array66);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test110"); }

    org.apache.ambari.server.configuration.Configuration configuration1 = new org.apache.ambari.server.configuration.Configuration();
    int i2 = configuration1.getClientThreadPoolSize();
    java.lang.String str3 = configuration1.getMpacksStagingPath();
    java.io.File file4 = configuration1.getBootStrapDir();
    org.apache.ambari.server.configuration.Configuration configuration7 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str8 = configuration7.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file9 = configuration7.getRecommendationsDir();
    org.apache.ambari.server.configuration.Configuration configuration11 = new org.apache.ambari.server.configuration.Configuration();
    int i12 = configuration11.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher13 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration11);
    java.io.File file14 = configuration11.getRecommendationsDir();
    org.apache.ambari.server.security.encryption.CredentialProvider credentialProvider15 = new org.apache.ambari.server.security.encryption.CredentialProvider("operating_systems", file9, true, file14);
    org.apache.ambari.server.security.encryption.CredentialProvider credentialProvider16 = new org.apache.ambari.server.security.encryption.CredentialProvider("StackServices/stack_version", file4, false, file9);
    org.apache.ambari.server.security.encryption.FileBasedCredentialStore fileBasedCredentialStore17 = new org.apache.ambari.server.security.encryption.FileBasedCredentialStore(file9);
    org.apache.ambari.server.stack.QuickLinksConfigurationModule quickLinksConfigurationModule18 = new org.apache.ambari.server.stack.QuickLinksConfigurationModule(file9);
    quickLinksConfigurationModule18.finalizeModule();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "nosniff"+ "'", str8.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file14);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test111"); }

    org.apache.ambari.server.stack.RepoUtil repoUtil0 = new org.apache.ambari.server.stack.RepoUtil();

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test112"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    org.apache.ambari.server.agent.ActionQueue actionQueue9 = null;
    org.apache.ambari.server.actionmanager.ActionManager actionManager10 = null;
    com.google.inject.Injector injector12 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.HeartbeatMonitor heartbeatMonitor13 = new org.apache.ambari.server.agent.HeartbeatMonitor((org.apache.ambari.server.state.Clusters)clustersImpl4, actionQueue9, actionManager10, (int)(short)1, injector12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test113"); }

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
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo17 = null;
    stackConfigurationResponse12.setPropertyValueAttributes(valueAttributesInfo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Hosts/last_registration_time"+ "'", str13.equals("Hosts/last_registration_time"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_str14);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test114"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.lang.String str4 = hostResponse1.getHostname();
    java.util.Map<java.lang.String,org.apache.ambari.server.state.DesiredConfig> map_str_desiredConfig5 = hostResponse1.getDesiredConfigs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "RequestBodyInfo"+ "'", str4.equals("RequestBodyInfo"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_desiredConfig5);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test115"); }

    org.apache.ambari.server.controller.ivory.Cluster.Interface interface3 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("Versions/extension_name", "ambari_db_rca_password", "HostRoles/cluster_name");

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test116"); }

    org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteProperty prerequisiteProperty0 = new org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteProperty();

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test117"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.ambari.server.state.ConfigHelper.fileNameToConfigType("AlertTarget/notification_type");
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test118"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    stackConfigurationResponse12.setPropertyName("sqlserver");
    java.lang.String str15 = stackConfigurationResponse12.getServiceName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test119"); }

    org.apache.ambari.server.controller.internal.PropertyInfo propertyInfo3 = new org.apache.ambari.server.controller.internal.PropertyInfo("blueprint_name", true, true);
    boolean b4 = propertyInfo3.isPointInTime();
    boolean b5 = propertyInfo3.isTemporal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test120"); }

    org.apache.ambari.server.api.services.ViewPrivilegeService viewPrivilegeService3 = new org.apache.ambari.server.api.services.ViewPrivilegeService("downgrade_from_version", "AlertTarget/name", "WidgetLayoutInfo/section_name");
    javax.ws.rs.core.HttpHeaders httpHeaders5 = null;
    javax.ws.rs.core.UriInfo uriInfo6 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = viewPrivilegeService3.updatePrivilege("", httpHeaders5, uriInfo6, "ViewInstanceInfo/context_path");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test121"); }

    org.apache.ambari.server.api.services.PermissionService permissionService0 = new org.apache.ambari.server.api.services.PermissionService();
    javax.ws.rs.core.Request request1 = null;
    org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService3 = permissionService0.getRoleAuthorizations(request1, "");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = permissionService0.getPermission(httpHeaders4, uriInfo5, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorizationService3);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test122"); }

    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule1 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule0);
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl2 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl((org.apache.ambari.server.controller.spi.ProviderModule)viewProviderModule1);
    org.apache.ambari.server.controller.spi.Resource.Type type3 = null;
    org.apache.ambari.server.controller.spi.Resource[] resource_array4 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource5 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource5, resource_array4);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl10 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource5, true, false, (int)'#');
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl11 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource5);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController12 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider13 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController12);
    java.lang.String[] str_array16 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request17 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array16);
    org.apache.ambari.server.controller.spi.Request request18 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array16);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate21 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate22 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array23 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate22 };
    org.apache.ambari.server.controller.spi.Predicate predicate24 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array23);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate25 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array23);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate28 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate31 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array32 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate21, andPredicate25, filterPredicate28, filterPredicate31 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate33 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array32);
    org.apache.ambari.server.actionmanager.ActionType actionType35 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType40 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array42 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization43 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization43, roleAuthorization_array42);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition45 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType35, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType40, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization43);
    boolean b46 = andPredicate33.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate47 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj48 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor49 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj48);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate47, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor49);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate51 = null;
    extendedResourcePredicateVisitor49.acceptUnaryPredicate(unaryPredicate51);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate33, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor49);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource54 = compatibleRepositoryVersionResourceProvider13.getResources(request18, (org.apache.ambari.server.controller.spi.Predicate)andPredicate33);
    org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate categoryIsEmptyPredicate56 = new org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate("SECONDARY_NAMENODE_MUST_BE_DELETED");
    org.apache.ambari.server.controller.spi.PageRequest.StartingPoint startingPoint57 = null;
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate62 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate63 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array64 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate63 };
    org.apache.ambari.server.controller.spi.Predicate predicate65 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array64);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate66 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array64);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate69 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate72 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array73 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate62, andPredicate66, filterPredicate69, filterPredicate72 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate74 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array73);
    org.apache.ambari.server.actionmanager.ActionType actionType76 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType81 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array83 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization84 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b85 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization84, roleAuthorization_array83);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition86 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType76, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType81, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization84);
    boolean b87 = andPredicate74.equals((java.lang.Object)(short)100);
    java.util.Set<java.lang.String> set_str88 = org.apache.ambari.server.controller.utilities.PredicateHelper.getPropertyIds((org.apache.ambari.server.controller.spi.Predicate)andPredicate74);
    java.util.Comparator<org.apache.ambari.server.controller.spi.Resource> comparator_resource89 = null;
    org.apache.ambari.server.controller.internal.PageRequestImpl pageRequestImpl90 = new org.apache.ambari.server.controller.internal.PageRequestImpl(startingPoint57, 8441, 500, (org.apache.ambari.server.controller.spi.Predicate)andPredicate74, comparator_resource89);
    org.apache.ambari.server.controller.spi.SortRequestProperty[] sortRequestProperty_array91 = new org.apache.ambari.server.controller.spi.SortRequestProperty[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.spi.SortRequestProperty> arraylist_sortRequestProperty92 = new java.util.ArrayList<org.apache.ambari.server.controller.spi.SortRequestProperty>();
    boolean b93 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.SortRequestProperty>)arraylist_sortRequestProperty92, sortRequestProperty_array91);
    org.apache.ambari.server.controller.internal.SortRequestImpl sortRequestImpl94 = new org.apache.ambari.server.controller.internal.SortRequestImpl((java.util.List<org.apache.ambari.server.controller.spi.SortRequestProperty>)arraylist_sortRequestProperty92);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Iterable<org.apache.ambari.server.controller.spi.Resource> iterable_resource95 = clusterControllerImpl2.getIterable(type3, (org.apache.ambari.server.controller.spi.QueryResponse)queryResponseImpl11, request18, (org.apache.ambari.server.controller.spi.Predicate)categoryIsEmptyPredicate56, (org.apache.ambari.server.controller.spi.PageRequest)pageRequestImpl90, (org.apache.ambari.server.controller.spi.SortRequest)sortRequestImpl94);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortRequestProperty_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test123"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.String> singularattribute_hostRoleCommandEntity_str0 = null;
    org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.customCommandName = singularattribute_hostRoleCommandEntity_str0;

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test124"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    java.lang.String str3 = configuration0.getRecommendationsArtifactsLifetime();
    int i4 = configuration0.getAgentPackageParallelCommandsLimit();
    int i5 = configuration0.getTaskIdListLimit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1w"+ "'", str3.equals("1w"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 999);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test125"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_REPO_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/repository_version"+ "'", str0.equals("Clusters/repository_version"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test126"); }

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
    java.lang.String str15 = clusterResponse13.toString();
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{ clusterName=stack_tools, clusterId=10, provisioningState=DISABLED, desiredStackVersion=_SERVICE_CHECK, totalHosts=10, hosts=[ip-10-190-97-104.ec2.internal,ip-10-140-16-157.ec2.internal,ip-10-68-150-107.ec2.internal,ip-10-191-122-198.ec2.internal,ip-10-8-113-183.ec2.internal], clusterHealthReport= ClusterHealthReport{staleConfigsHosts=0, maintenanceStateHosts=0, healthyStateHosts=0, unhealthyStateHosts=0, heartbeatLostStateHosts=0, initStateHosts=0, healthyStatusHosts=0, unhealthyStatusHosts=0, unknownStatusHosts=0, alertStatusHosts=0}}"+ "'", str15.equals("{ clusterName=stack_tools, clusterId=10, provisioningState=DISABLED, desiredStackVersion=_SERVICE_CHECK, totalHosts=10, hosts=[ip-10-190-97-104.ec2.internal,ip-10-140-16-157.ec2.internal,ip-10-68-150-107.ec2.internal,ip-10-191-122-198.ec2.internal,ip-10-8-113-183.ec2.internal], clusterHealthReport= ClusterHealthReport{staleConfigsHosts=0, maintenanceStateHosts=0, healthyStateHosts=0, unhealthyStateHosts=0, heartbeatLostStateHosts=0, initStateHosts=0, healthyStatusHosts=0, unhealthyStatusHosts=0, unknownStatusHosts=0, alertStatusHosts=0}}"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test127"); }

    org.apache.ambari.server.api.predicate.operators.GreaterEqualsOperator greaterEqualsOperator0 = new org.apache.ambari.server.api.predicate.operators.GreaterEqualsOperator();
    java.lang.String str1 = greaterEqualsOperator0.toString();
    org.apache.ambari.server.api.predicate.operators.Operator.TYPE tYPE2 = greaterEqualsOperator0.getType();
    java.lang.String str3 = greaterEqualsOperator0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "GreaterEqualsOperator"+ "'", str1.equals("GreaterEqualsOperator"));
    org.junit.Assert.assertTrue("'" + tYPE2 + "' != '" + org.apache.ambari.server.api.predicate.operators.Operator.TYPE.GREATER_EQUAL + "'", tYPE2.equals(org.apache.ambari.server.api.predicate.operators.Operator.TYPE.GREATER_EQUAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GreaterEqualsOperator"+ "'", str3.equals("GreaterEqualsOperator"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test128"); }

    org.apache.ambari.server.state.stack.upgrade.PropertyKeyState propertyKeyState0 = org.apache.ambari.server.state.stack.upgrade.PropertyKeyState.ABSENT;
    org.junit.Assert.assertTrue("'" + propertyKeyState0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.PropertyKeyState.ABSENT + "'", propertyKeyState0.equals(org.apache.ambari.server.state.stack.upgrade.PropertyKeyState.ABSENT));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test129"); }

    java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog240.REMOTE_AMBARI_CLUSTER_SERVICE_TABLE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "remoteambariclusterservice"+ "'", str0.equals("remoteambariclusterservice"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test130"); }

    org.apache.ambari.server.state.SecurityState securityState0 = org.apache.ambari.server.state.SecurityState.SECURED_KERBEROS;
    boolean b1 = securityState0.isEndpoint();
    org.junit.Assert.assertTrue("'" + securityState0 + "' != '" + org.apache.ambari.server.state.SecurityState.SECURED_KERBEROS + "'", securityState0.equals(org.apache.ambari.server.state.SecurityState.SECURED_KERBEROS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test131"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.checks.DatabaseConsistencyChecker.CheckHelperControllerModule checkHelperControllerModule0 = new org.apache.ambari.server.checks.DatabaseConsistencyChecker.CheckHelperControllerModule();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test132"); }

    org.apache.ambari.server.stack.ConfigurationInfo.Supports supports0 = org.apache.ambari.server.stack.ConfigurationInfo.Supports.DO_NOT_EXTEND;
    org.junit.Assert.assertTrue("'" + supports0 + "' != '" + org.apache.ambari.server.stack.ConfigurationInfo.Supports.DO_NOT_EXTEND + "'", supports0.equals(org.apache.ambari.server.stack.ConfigurationInfo.Supports.DO_NOT_EXTEND));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test133"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostStartEvent serviceComponentHostStartEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostStartEvent("ThemeInfo/stack_version", "ExtensionLink/extension_version", (long)500);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test134"); }

    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse7 = new org.apache.ambari.server.controller.RepositoryResponse("Actions/target_service", "1.3.6.1.4.1.18060.16", "PermissionInfo/permission_name", "Versions/valid", "StackConfigurations/property_name", "QuickLinkInfo/default", "RUNNING");
    java.lang.String str8 = repositoryResponse7.getDefaultBaseUrl();
    repositoryResponse7.setRepoId("Tasks/custom_command_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "QuickLinkInfo/default"+ "'", str8.equals("QuickLinkInfo/default"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test135"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj7 = kerberosComponentDescriptor6.toMap();
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor8 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor(map_str_obj7);
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder9 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders10 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody11 = null;
    javax.ws.rs.core.UriInfo uriInfo12 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance13 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest14 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders10, requestBody11, uriInfo12, resourceInstance13);
    int i15 = postRequest14.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type16 = postRequest14.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder17 = addUserToGroupRequestAuditEventBuilder9.withRequestType(type16);
    boolean b18 = kerberosIdentityDescriptor8.equals((java.lang.Object)addUserToGroupRequestAuditEventBuilder17);
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder20 = addUserToGroupRequestAuditEventBuilder17.withUrl("StackLevelConfigurations/property_value_attributes");
    
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
    org.junit.Assert.assertTrue(i15 == 1);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type16.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder20);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test136"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_REQUEST_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/request_id"+ "'", str0.equals("Tasks/request_id"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test137"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_REQUEST_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/request_id"+ "'", str0.equals("Upgrade/request_id"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test138"); }

    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider0);
    java.util.Set<java.lang.String> set_str2 = clusterDefinition1.getHosts();
    java.lang.String str4 = clusterDefinition1.getHostState("Internal Server Error");
    java.lang.String str6 = clusterDefinition1.getServiceState("command_retry_enabled");
    java.lang.String str9 = clusterDefinition1.getComponentState("`ambari.dispatch.snmp.community`", "Versions/max_jdk");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HEALTHY"+ "'", str4.equals("HEALTHY"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "STARTED"+ "'", str6.equals("STARTED"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "STARTED"+ "'", str9.equals("STARTED"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test139"); }

    org.apache.ambari.server.orm.entities.OperatingSystemEntity operatingSystemEntity0 = new org.apache.ambari.server.orm.entities.OperatingSystemEntity();
    java.util.List<org.apache.ambari.server.orm.entities.RepositoryEntity> list_repositoryEntity1 = operatingSystemEntity0.getRepositories();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_repositoryEntity1);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test140"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider1 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController0);
    java.lang.String[] str_array4 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request5 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array4);
    org.apache.ambari.server.controller.spi.Request request6 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array4);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate9 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate10 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array11 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate10 };
    org.apache.ambari.server.controller.spi.Predicate predicate12 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array11);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate13 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array11);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate16 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate19 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array20 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate9, andPredicate13, filterPredicate16, filterPredicate19 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate21 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array20);
    org.apache.ambari.server.actionmanager.ActionType actionType23 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType28 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array30 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization31 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization31, roleAuthorization_array30);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition33 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType23, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType28, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization31);
    boolean b34 = andPredicate21.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate35 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj36 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor37 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj36);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate35, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor37);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate39 = null;
    extendedResourcePredicateVisitor37.acceptUnaryPredicate(unaryPredicate39);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate21, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor37);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource42 = compatibleRepositoryVersionResourceProvider1.getResources(request6, (org.apache.ambari.server.controller.spi.Predicate)andPredicate21);
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
    org.apache.ambari.server.controller.spi.Predicate predicate71 = compatibleRepositoryVersionResourceProvider1.amendPredicate((org.apache.ambari.server.controller.spi.Predicate)andPredicate57);
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array72 = andPredicate57.getPredicates();
    org.apache.ambari.server.controller.spi.Predicate predicate73 = org.apache.ambari.server.controller.predicate.OrPredicate.instance(predicate_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource42);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate73);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test141"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array5 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter6 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6, requestResourceFilter_array5);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel8 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str9 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest11 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6, requestOperationLevel8, map_str_str9, false);
    org.apache.ambari.server.controller.ActionExecutionContext actionExecutionContext12 = new org.apache.ambari.server.controller.ActionExecutionContext("", "RootServiceHostComponents/properties", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter6);
    java.lang.String str13 = actionExecutionContext12.getActionName();
    actionExecutionContext12.setRetryAllowed(true);
    java.lang.String str16 = actionExecutionContext12.getActionName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "RootServiceHostComponents/properties"+ "'", str13.equals("RootServiceHostComponents/properties"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "RootServiceHostComponents/properties"+ "'", str16.equals("RootServiceHostComponents/properties"));

  }

    /*  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test142"); }

    org.apache.ambari.server.state.CheckHelper checkHelper0 = new org.apache.ambari.server.state.CheckHelper();
    org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest2 = new org.apache.ambari.server.controller.PrereqCheckRequest("server.jdbc.properties.");
    org.apache.ambari.server.checks.SecondaryNamenodeDeletedCheck secondaryNamenodeDeletedCheck3 = new org.apache.ambari.server.checks.SecondaryNamenodeDeletedCheck();
    org.apache.ambari.server.checks.StormShutdownWarning stormShutdownWarning4 = new org.apache.ambari.server.checks.StormShutdownWarning();
    org.apache.ambari.server.checks.InstallPackagesCheck installPackagesCheck5 = new org.apache.ambari.server.checks.InstallPackagesCheck();
    org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType6 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.NON_ROLLING;
    boolean b7 = installPackagesCheck5.isRequired(upgradeType6);
    org.apache.ambari.server.checks.AbstractCheckDescriptor[] abstractCheckDescriptor_array8 = new org.apache.ambari.server.checks.AbstractCheckDescriptor[] { secondaryNamenodeDeletedCheck3, stormShutdownWarning4, installPackagesCheck5 };
    java.util.ArrayList<org.apache.ambari.server.checks.AbstractCheckDescriptor> arraylist_abstractCheckDescriptor9 = new java.util.ArrayList<org.apache.ambari.server.checks.AbstractCheckDescriptor>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.checks.AbstractCheckDescriptor>)arraylist_abstractCheckDescriptor9, abstractCheckDescriptor_array8);
    java.util.List<org.apache.ambari.server.state.DescriptorPreCheck> list_descriptorPreCheck11 = checkHelper0.getApplicablePrerequisiteChecks(prereqCheckRequest2, (java.util.List<org.apache.ambari.server.checks.AbstractCheckDescriptor>)arraylist_abstractCheckDescriptor9);
    org.junit.Assert.assertTrue("'" + upgradeType6 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.NON_ROLLING + "'", upgradeType6.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.NON_ROLLING));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractCheckDescriptor_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_descriptorPreCheck11);

    }*/

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test143"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.upgrades.UpdateDesiredStackAction.COMMAND_PARAM_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "version"+ "'", str0.equals("version"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test144"); }

    org.apache.ambari.server.serveraction.kerberos.PrepareDisableKerberosServerAction prepareDisableKerberosServerAction0 = new org.apache.ambari.server.serveraction.kerberos.PrepareDisableKerberosServerAction();
    org.apache.ambari.server.agent.ExecutionCommand executionCommand1 = null;
    prepareDisableKerberosServerAction0.setExecutionCommand(executionCommand1);
    org.apache.ambari.server.actionmanager.HostRoleCommand hostRoleCommand3 = null;
    prepareDisableKerberosServerAction0.setHostRoleCommand(hostRoleCommand3);
    org.apache.ambari.server.agent.ExecutionCommand executionCommand5 = prepareDisableKerberosServerAction0.getExecutionCommand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(executionCommand5);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test145"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController6 = null;
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider activeWidgetLayoutResourceProvider7 = new org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider(ambariManagementController6);
    java.util.Set<java.lang.String> set_str8 = activeWidgetLayoutResourceProvider7.getCategoryIds();
    org.apache.ambari.server.controller.ExtensionLinkResponse extensionLinkResponse9 = new org.apache.ambari.server.controller.ExtensionLinkResponse("service", "Clusters/total_hosts", "Repositories/latest_base_url", "Request_Info/asc_order", "_SERVICE_CHECK", false, (java.util.Collection<java.lang.String>)set_str8);
    extensionLinkResponse9.setValid(false);
    java.lang.String str12 = extensionLinkResponse9.getExtensionVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "_SERVICE_CHECK"+ "'", str12.equals("_SERVICE_CHECK"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test146"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str3 = valueAttributesInfo0.getIncrementStep();
    valueAttributesInfo0.setDelete("operation");
    valueAttributesInfo0.setSelectionCardinality("Credential/key");
    java.lang.String str8 = valueAttributesInfo0.getMaximum();
    java.lang.String str9 = valueAttributesInfo0.getType();
    java.lang.String str10 = valueAttributesInfo0.getCopy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test147"); }

    org.apache.ambari.server.state.stack.Metric metric0 = new org.apache.ambari.server.state.stack.Metric();
    java.lang.String str1 = metric0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Metric{metric='null', pointInTime=false, temporal=false, amsHostMetric=false, unit='unitless'}"+ "'", str1.equals("Metric{metric='null', pointInTime=false, temporal=false, amsHostMetric=false, unit='unitless'}"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test148"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity1 = null;
    org.apache.ambari.server.orm.entities.UserEntity userEntity2 = userDAO0.findUserByPrincipal(principalEntity1);
    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO3 = null;
    org.apache.ambari.server.orm.dao.GroupDAO groupDAO4 = new org.apache.ambari.server.orm.dao.GroupDAO();
    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO5 = null;
    org.apache.ambari.server.security.authorization.Users users6 = new org.apache.ambari.server.security.authorization.Users();
    org.apache.ambari.server.controller.internal.UserPrivilegeResourceProvider.init(userDAO0, clusterDAO3, groupDAO4, viewInstanceDAO5, users6);
    org.apache.ambari.server.orm.entities.UserEntity userEntity8 = null;
    java.util.Collection<org.apache.ambari.server.orm.entities.PrivilegeEntity> collection_privilegeEntity9 = users6.getUserPrivileges(userEntity8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_privilegeEntity9);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test149"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.UpgradeSummaryResourceProvider upgradeSummaryResourceProvider1 = new org.apache.ambari.server.controller.internal.UpgradeSummaryResourceProvider(ambariManagementController0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test150"); }

    org.apache.ambari.server.agent.HeartBeat heartBeat0 = new org.apache.ambari.server.agent.HeartBeat();
    long long1 = heartBeat0.getTimestamp();
    java.util.List<org.apache.ambari.server.agent.ComponentStatus> list_componentStatus2 = heartBeat0.getComponentStatus();
    java.util.List<org.apache.ambari.server.agent.ComponentStatus> list_componentStatus3 = heartBeat0.getComponentStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_componentStatus2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_componentStatus3);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test151"); }

    org.apache.ambari.server.orm.dao.RequestScheduleBatchRequestDAO requestScheduleBatchRequestDAO0 = new org.apache.ambari.server.orm.dao.RequestScheduleBatchRequestDAO();

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test152"); }

    org.snmp4j.Snmp snmp0 = null;
    org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher sNMPDispatcher1 = new org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher(snmp0);
    java.lang.Integer i2 = sNMPDispatcher1.getPort();
    java.lang.String str3 = sNMPDispatcher1.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "SNMP"+ "'", str3.equals("SNMP"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test153"); }

    org.apache.ambari.server.api.predicate.operators.InOperator inOperator0 = new org.apache.ambari.server.api.predicate.operators.InOperator();
    org.apache.ambari.server.api.predicate.operators.Operator.TYPE tYPE1 = inOperator0.getType();
    org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.ambari.server.api.predicate.operators.Operator.TYPE.IN + "'", tYPE1.equals(org.apache.ambari.server.api.predicate.operators.Operator.TYPE.IN));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test154"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = hostResponse1.getHostAttributes();
    java.util.Map<java.lang.String,java.lang.String> map_str_str5 = hostResponse1.getHostAttributes();
    long long6 = hostResponse1.getAvailableMemBytes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test155"); }

    org.apache.ambari.server.state.alert.PortSource portSource0 = new org.apache.ambari.server.state.alert.PortSource();
    java.lang.String str1 = portSource0.getUri();
    org.apache.ambari.server.state.alert.Reporting reporting2 = null;
    portSource0.setReporting(reporting2);
    org.apache.ambari.server.controller.ActionResponse actionResponse12 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse12.setInputs("ViewUrlInfo/view_instance_version");
    boolean b15 = portSource0.equals((java.lang.Object)"ViewUrlInfo/view_instance_version");
    java.lang.String str16 = portSource0.getUri();
    org.apache.ambari.server.state.alert.SourceType sourceType17 = portSource0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sourceType17);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test156"); }

    org.apache.ambari.server.serveraction.upgrades.KerberosKeytabsAction kerberosKeytabsAction0 = new org.apache.ambari.server.serveraction.upgrades.KerberosKeytabsAction();
    org.apache.ambari.server.agent.ExecutionCommand executionCommand1 = kerberosKeytabsAction0.getExecutionCommand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(executionCommand1);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test157"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.METRIC_RETRIEVAL_SERVICE_THREADPOOL_CORE_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test158"); }

    org.apache.ambari.server.api.services.parsers.BodyParseException bodyParseException1 = new org.apache.ambari.server.api.services.parsers.BodyParseException("global");

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test159"); }

    org.apache.ambari.server.notifications.dispatchers.EmailDispatcher emailDispatcher0 = new org.apache.ambari.server.notifications.dispatchers.EmailDispatcher();
    org.apache.ambari.server.configuration.Configuration configuration1 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str2 = configuration1.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file3 = configuration1.getRecommendationsDir();
    java.lang.String str4 = configuration1.getHostsMapFile();
    java.lang.Integer i5 = configuration1.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties6 = configuration1.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor7 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties6);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj8 = kerberosComponentDescriptor7.toMap();
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor9 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor(map_str_obj8);
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor10 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_str_obj8);
    org.apache.ambari.server.notifications.TargetConfigurationResult targetConfigurationResult11 = emailDispatcher0.validateTargetConfig(map_str_obj8);
    org.apache.ambari.server.notifications.TargetConfigurationResult.Status status12 = targetConfigurationResult11.getStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "nosniff"+ "'", str2.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 30000+ "'", i5.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(targetConfigurationResult11);
    org.junit.Assert.assertTrue("'" + status12 + "' != '" + org.apache.ambari.server.notifications.TargetConfigurationResult.Status.INVALID + "'", status12.equals(org.apache.ambari.server.notifications.TargetConfigurationResult.Status.INVALID));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test160"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler1 = null;
    serviceCheckGrouping0.parallelScheduler = parallelScheduler1;
    serviceCheckGrouping0.name = "notification.dispatch.alert.script";
    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping.ServiceCheckBuilder serviceCheckBuilder5 = serviceCheckGrouping0.getBuilder();
    serviceCheckGrouping0.name = "StackConfigurations/property_type";
    java.util.Iterator<org.apache.ambari.server.state.stack.upgrade.Grouping> iterator_grouping8 = null;
    // The following exception was thrown during execution in test generation
    try {
    serviceCheckGrouping0.merge(iterator_grouping8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serviceCheckBuilder5);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test161"); }

    org.apache.ambari.server.api.resources.VersionDefinitionResourceDefinition versionDefinitionResourceDefinition0 = new org.apache.ambari.server.api.resources.VersionDefinitionResourceDefinition();

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test162"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider1 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController0);
    java.lang.String[] str_array4 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request5 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array4);
    org.apache.ambari.server.controller.spi.Request request6 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array4);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate9 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate10 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array11 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate10 };
    org.apache.ambari.server.controller.spi.Predicate predicate12 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array11);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate13 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array11);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate16 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate19 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array20 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate9, andPredicate13, filterPredicate16, filterPredicate19 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate21 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array20);
    org.apache.ambari.server.actionmanager.ActionType actionType23 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType28 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array30 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization31 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization31, roleAuthorization_array30);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition33 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType23, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType28, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization31);
    boolean b34 = andPredicate21.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate35 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj36 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor37 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj36);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate35, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor37);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate39 = null;
    extendedResourcePredicateVisitor37.acceptUnaryPredicate(unaryPredicate39);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate21, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor37);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource42 = compatibleRepositoryVersionResourceProvider1.getResources(request6, (org.apache.ambari.server.controller.spi.Predicate)andPredicate21);
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
    org.apache.ambari.server.controller.spi.Predicate predicate71 = compatibleRepositoryVersionResourceProvider1.amendPredicate((org.apache.ambari.server.controller.spi.Predicate)andPredicate57);
    java.lang.String str72 = andPredicate57.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource42);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Event/summary/memberships/removed.FILTER(service_type) AND (null) AND Credential/key.FILTER(Credential/key) AND Credential/key.FILTER(Credential/key)"+ "'", str72.equals("Event/summary/memberships/removed.FILTER(service_type) AND (null) AND Credential/key.FILTER(Credential/key) AND Credential/key.FILTER(Credential/key)"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test163"); }

    org.apache.ambari.server.state.ClientConfigFileDefinition clientConfigFileDefinition0 = new org.apache.ambari.server.state.ClientConfigFileDefinition();
    java.lang.Object obj1 = null;
    boolean b2 = clientConfigFileDefinition0.equals(obj1);
    java.lang.String str3 = clientConfigFileDefinition0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test164"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.Extension extension3 = new org.apache.ambari.server.controller.internal.Extension("configure-task-key-value-pairs", "", ambariManagementController2);
    java.lang.String str5 = extension3.getExternalComponentConfig("ViewInstanceInfo/icon64_path");
    org.apache.ambari.server.state.ComponentInfo componentInfo7 = extension3.getComponentInfo("jdk_location");
    java.lang.String str9 = extension3.getServiceForComponent("Clusters/version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentInfo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test165"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_DESIRED_CONFIGS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/desired_configs"+ "'", str0.equals("Hosts/desired_configs"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test166"); }

    org.apache.ambari.server.audit.request.eventcreator.BlueprintEventCreator blueprintEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.BlueprintEventCreator();

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test167"); }

    org.apache.ambari.server.state.action.ActionState actionState0 = org.apache.ambari.server.state.action.ActionState.INIT;
    org.junit.Assert.assertTrue("'" + actionState0 + "' != '" + org.apache.ambari.server.state.action.ActionState.INIT + "'", actionState0.equals(org.apache.ambari.server.state.action.ActionState.INIT));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test168"); }

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
    org.apache.ambari.server.controller.internal.ProvisionAction provisionAction17 = org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START;
    java.util.Collection<java.lang.String> collection_str18 = hostGroupImpl16.getComponentNames(provisionAction17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stack12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_component13);
    org.junit.Assert.assertTrue("'" + provisionAction17 + "' != '" + org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START + "'", provisionAction17.equals(org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str18);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test169"); }

    org.apache.ambari.server.audit.event.request.AddAlertTargetRequestAuditEvent.AddAlertTargetRequestAuditEventBuilder addAlertTargetRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddAlertTargetRequestAuditEvent.AddAlertTargetRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddAlertTargetRequestAuditEvent.AddAlertTargetRequestAuditEventBuilder addAlertTargetRequestAuditEventBuilder2 = addAlertTargetRequestAuditEventBuilder0.withUserName("Repositories/stack_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertTargetRequestAuditEventBuilder2);

  }

  @Test
  public void test170() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest5.test170"); }

    // org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    // org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    // org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    // org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    // org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    // org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    // org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    // org.apache.ambari.server.state.Cluster cluster11 = null;
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType12 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED;
    // org.apache.ambari.server.state.stack.upgrade.Direction direction13 = null;
    // java.util.Map<java.lang.String,java.lang.Object> map_str_obj14 = null;
    // org.apache.ambari.server.state.UpgradeContext upgradeContext15 = new org.apache.ambari.server.state.UpgradeContext(cluster11, upgradeType12, direction13, map_str_obj14);
    // org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest16 = new org.apache.ambari.server.controller.PrereqCheckRequest("extensions", upgradeType12);
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType17 = prereqCheckRequest16.getUpgradeType();
    // org.apache.ambari.server.state.StackId stackId20 = new org.apache.ambari.server.state.StackId("1.3.6.1.4.1.18060.16.1.1.1.1", "StackConfigurations/property_description");
    // prereqCheckRequest16.setTargetStackId(stackId20);
    // java.lang.String str22 = stackId20.toString();
    // // The following exception was thrown during execution in test generation
    // try {
    // clustersImpl4.setCurrentStackVersion("ExtensionLink/extension_version", stackId20);
    //   org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.ClusterNotFoundException");
    // } catch (org.apache.ambari.server.ClusterNotFoundException e) {
    //   // Expected exception.
    // }
    
    // org.junit.Assert.assertTrue("'" + upgradeType12 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType12.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    // org.junit.Assert.assertTrue("'" + upgradeType17 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType17.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue("'" + str22 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.1-StackConfigurations/property_description"+ "'", str22.equals("1.3.6.1.4.1.18060.16.1.1.1.1-StackConfigurations/property_description"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test171"); }

    org.apache.ambari.server.state.HostConfig hostConfig0 = new org.apache.ambari.server.state.HostConfig();
    hostConfig0.setDefaultVersionTag("CompatibleRepositoryVersions/display_name");
    java.util.Map<java.lang.Long,java.lang.String> map_long_str3 = hostConfig0.getConfigGroupOverrides();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_long_str3);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test172"); }

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
    schemaUpgradeHelper14.cleanUpRCATables();
    
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

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test173"); }

    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder2 = viewPrivilegeChangeRequestAuditEventBuilder0.withVersion("Artifacts/service_name");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder4 = viewPrivilegeChangeRequestAuditEventBuilder0.withRemoteIp("downgrade");
    org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder viewPrivilegeChangeRequestAuditEventBuilder6 = viewPrivilegeChangeRequestAuditEventBuilder4.withName("host_predicate");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewPrivilegeChangeRequestAuditEventBuilder6);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test174"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertNoticeEntity,org.apache.ambari.server.orm.entities.AlertTargetEntity> singularattribute_alertNoticeEntity_alertTargetEntity0 = null;
    org.apache.ambari.server.orm.entities.AlertNoticeEntity_.alertTarget = singularattribute_alertNoticeEntity_alertTargetEntity0;

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test175"); }

    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.builder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS1 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus2 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS1);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = resultStatus2.getStatus();
    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder4 = addComponentToHostRequestAuditEventBuilder0.withResultStatus(resultStatus2);
    org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder6 = addComponentToHostRequestAuditEventBuilder4.withUserName("AMBARI_METRICS");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder6);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test176"); }

    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate2 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    java.lang.String str3 = filterPredicate2.getPropertyId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Credential/key"+ "'", str3.equals("Credential/key"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test177"); }

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
    org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY pADDING_STRATEGY18 = org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY.NONE;
    boolean b19 = clusterResponse13.equals((java.lang.Object)pADDING_STRATEGY18);
    java.lang.String str20 = clusterResponse13.getProvisioningState();
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type21 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION;
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface28 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array29 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface28 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface30 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface30, interface_array29);
    org.apache.ambari.server.controller.ivory.Cluster.Location location34 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array35 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location34 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location36 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location36, location_array35);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array38 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo39 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo39, propertyInfo_array38);
    java.util.Map<java.lang.String,java.lang.String> map_str_str41 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo42 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo39, map_str_str41);
    org.apache.ambari.server.controller.ivory.Cluster cluster43 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface30, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location36, map_str_str41);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type44 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper46 = null;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] taskWrapper_array47 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] { taskWrapper46 };
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper48 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type44, "WidgetLayoutInfo/section_name", taskWrapper_array47);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper49 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type21, "StackConfigurationDependency/property_name", map_str_str41, taskWrapper_array47);
    clusterResponse13.setCredentialStoreServiceProperties(map_str_str41);
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
    org.junit.Assert.assertTrue("'" + pADDING_STRATEGY18 + "' != '" + org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY.NONE + "'", pADDING_STRATEGY18.equals(org.apache.ambari.server.controller.metrics.MetricsPaddingMethod.PADDING_STRATEGY.NONE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "DISABLED"+ "'", str20.equals("DISABLED"));
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION + "'", type21.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.SERVER_SIDE_ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str41);
    org.junit.Assert.assertTrue("'" + type44 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP + "'", type44.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(taskWrapper_array47);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test178"); }

    org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric.TemporalMetric temporalMetric2 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric.TemporalMetric("Versions/extension_name", (java.lang.Number)100.0d);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test179"); }

    org.apache.ambari.server.configuration.Configuration configuration1 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str2 = configuration1.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file3 = configuration1.getRecommendationsDir();
    org.apache.ambari.server.configuration.Configuration configuration5 = new org.apache.ambari.server.configuration.Configuration();
    int i6 = configuration5.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher7 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration5);
    java.io.File file8 = configuration5.getRecommendationsDir();
    org.apache.ambari.server.security.encryption.CredentialProvider credentialProvider9 = new org.apache.ambari.server.security.encryption.CredentialProvider("operating_systems", file3, true, file8);
    org.apache.ambari.server.state.QuickLinksConfigurationInfo quickLinksConfigurationInfo10 = new org.apache.ambari.server.state.QuickLinksConfigurationInfo();
    java.lang.String str11 = quickLinksConfigurationInfo10.toString();
    java.lang.String str12 = quickLinksConfigurationInfo10.getFileName();
    org.apache.ambari.server.stack.QuickLinksConfigurationModule quickLinksConfigurationModule13 = new org.apache.ambari.server.stack.QuickLinksConfigurationModule(file3, quickLinksConfigurationInfo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "nosniff"+ "'", str2.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"+ "'", str11.equals("QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test180"); }

    org.apache.ambari.server.state.ThemeInfo themeInfo0 = null;
    org.apache.ambari.server.stack.ThemeModule themeModule1 = new org.apache.ambari.server.stack.ThemeModule(themeInfo0);
    org.apache.ambari.server.state.ThemeInfo themeInfo2 = null;
    org.apache.ambari.server.stack.ThemeModule themeModule3 = new org.apache.ambari.server.stack.ThemeModule(themeInfo2);
    boolean b4 = themeModule3.isValid();
    org.apache.ambari.server.state.ThemeInfo themeInfo5 = null;
    org.apache.ambari.server.stack.ThemeModule themeModule6 = new org.apache.ambari.server.stack.ThemeModule(themeInfo5);
    boolean b7 = themeModule6.isValid();
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.StackModule> map_str_stackModule8 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ServiceModule> map_str_serviceModule9 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ExtensionModule> map_str_extensionModule10 = null;
    themeModule3.resolve(themeModule6, map_str_stackModule8, map_str_serviceModule9, map_str_extensionModule10);
    org.apache.ambari.server.state.ThemeInfo themeInfo12 = null;
    org.apache.ambari.server.stack.ThemeModule themeModule13 = new org.apache.ambari.server.stack.ThemeModule(themeInfo12);
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.StackModule> map_str_stackModule14 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ServiceModule> map_str_serviceModule15 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ExtensionModule> map_str_extensionModule16 = null;
    themeModule6.resolve(themeModule13, map_str_stackModule14, map_str_serviceModule15, map_str_extensionModule16);
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.StackModule> map_str_stackModule18 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ServiceModule> map_str_serviceModule19 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.stack.ExtensionModule> map_str_extensionModule20 = null;
    themeModule1.resolve(themeModule6, map_str_stackModule18, map_str_serviceModule19, map_str_extensionModule20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test181"); }

    org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO0 = null;
    org.apache.ambari.server.metadata.ActionMetadata actionMetadata1 = new org.apache.ambari.server.metadata.ActionMetadata();
    org.apache.ambari.server.state.stack.OsFamily osFamily2 = null;
    org.apache.ambari.server.stack.StackContext stackContext3 = new org.apache.ambari.server.stack.StackContext(metainfoDAO0, actionMetadata1, osFamily2);
    stackContext3.executeRepoTasks();
    boolean b5 = stackContext3.haveAllRepoTasksCompleted();
    stackContext3.executeRepoTasks();
    org.apache.ambari.server.stack.StackModule stackModule8 = null;
    // The following exception was thrown during execution in test generation
    try {
    stackContext3.registerRepoUpdateTask("AlertTarget/groups", stackModule8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test182"); }

    java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFile.KEYTAB_FILE_PATH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "keytab_file_path"+ "'", str0.equals("keytab_file_path"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test183"); }

    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO0 = org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO.create();
    org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO2 = hostRoleCommandStatusSummaryDTO0.inProgress(1200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommandStatusSummaryDTO0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommandStatusSummaryDTO2);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test184"); }

    org.apache.ambari.server.serveraction.upgrades.RangerConfigCalculation rangerConfigCalculation0 = new org.apache.ambari.server.serveraction.upgrades.RangerConfigCalculation();

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test185"); }

    org.apache.ambari.server.controller.ActionRequest actionRequest8 = new org.apache.ambari.server.controller.ActionRequest("VersionDefinition/stack_name", "ViewInstanceInfo/properties", "nosniff", "CompatibleRepositoryVersions/stack_name", "evaluate_when", "ambari.dispatch-property.script", "Stage/display_status", "");
    java.lang.String str9 = actionRequest8.getActionType();
    java.lang.String str10 = actionRequest8.getActionName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ViewInstanceInfo/properties"+ "'", str9.equals("ViewInstanceInfo/properties"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "VersionDefinition/stack_name"+ "'", str10.equals("VersionDefinition/stack_name"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test186"); }

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
    clusterHealthReport61.setStaleConfigsHosts(0);
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

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test187"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.AGENT_API_GZIP_COMPRESSION_ENABLED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test188"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.SERVER_HRC_STATUS_SUMMARY_CACHE_SIZE;
    java.lang.Long long1 = configurationproperty_long0.getDefaultValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_long0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10000L+ "'", long1.equals(10000L));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test189"); }

    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule1 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule0);
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl2 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl((org.apache.ambari.server.controller.spi.ProviderModule)viewProviderModule1);
    org.apache.ambari.server.controller.spi.Resource.Type type3 = null;
    org.apache.ambari.server.controller.spi.Resource resource4 = null;
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource5 = null;
    org.apache.ambari.server.controller.internal.RequestStatusImpl requestStatusImpl6 = new org.apache.ambari.server.controller.internal.RequestStatusImpl(resource4, set_resource5);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource7 = requestStatusImpl6.getAssociatedResources();
    java.util.Set<java.lang.String> set_str8 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str9 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str8);
    org.apache.ambari.server.controller.spi.Request request10 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str8);
    org.apache.ambari.server.api.predicate.operators.LessOperator lessOperator11 = new org.apache.ambari.server.api.predicate.operators.LessOperator();
    org.apache.ambari.server.controller.spi.Predicate predicate14 = lessOperator11.toPredicate("principal_type", "ACTION_USER_NAME");
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource15 = clusterControllerImpl2.populateResources(type3, set_resource7, request10, predicate14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate14);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test190"); }

    org.apache.ambari.server.controller.StackConfigurationRequest stackConfigurationRequest4 = new org.apache.ambari.server.controller.StackConfigurationRequest("forceRefreshConfigTagsBeforeExecution", "forceRefreshConfigTagsBeforeExecution", "forceRefreshConfigTagsBeforeExecution", "hi!");
    java.lang.String str5 = stackConfigurationRequest4.getPropertyName();
    stackConfigurationRequest4.setServiceName("Clusters/desired_service_config_versions");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test191"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.ALERTS_CACHE_FLUSH_INTERVAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test192"); }

    org.apache.ambari.server.bootstrap.BootStrapStatus bootStrapStatus0 = new org.apache.ambari.server.bootstrap.BootStrapStatus();
    bootStrapStatus0.setLog("properties_attributes");

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test193"); }

    org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException kerberosMissingAdminCredentialsException5 = new org.apache.ambari.server.serveraction.kerberos.KerberosMissingAdminCredentialsException();
    org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException kerberosPrincipalAlreadyExistsException6 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalAlreadyExistsException("blueprint_name", (java.lang.Throwable)kerberosMissingAdminCredentialsException5);
    org.apache.ambari.server.view.IllegalClusterException illegalClusterException7 = new org.apache.ambari.server.view.IllegalClusterException((java.lang.Throwable)kerberosPrincipalAlreadyExistsException6);
    org.apache.ambari.server.AmbariException ambariException8 = new org.apache.ambari.server.AmbariException("StackConfigurations/final", (java.lang.Throwable)illegalClusterException7);
    org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException kerberosAdminAuthenticationException9 = new org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException("HostRoles/state", (java.lang.Throwable)ambariException8);
    org.apache.ambari.server.controller.spi.NoSuchResourceException noSuchResourceException10 = new org.apache.ambari.server.controller.spi.NoSuchResourceException("AlertGroup/cluster_name", (java.lang.Throwable)kerberosAdminAuthenticationException9);
    org.apache.ambari.server.serveraction.kerberos.KerberosRealmException kerberosRealmException11 = new org.apache.ambari.server.serveraction.kerberos.KerberosRealmException("Stage/log_info", (java.lang.Throwable)kerberosAdminAuthenticationException9);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test194"); }

    org.apache.ambari.server.events.ClusterConfigChangedEvent clusterConfigChangedEvent4 = new org.apache.ambari.server.events.ClusterConfigChangedEvent("TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", "ambari-server", "600", (java.lang.Long)10L);
    java.lang.String str5 = clusterConfigChangedEvent4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ClusterConfigChangedEvent{clusterName=TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}, configType=ambari-server, versionTag=600, version=10}"+ "'", str5.equals("ClusterConfigChangedEvent{clusterName=TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}, configType=ambari-server, versionTag=600, version=10}"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test195"); }

    org.apache.ambari.server.state.stack.upgrade.Direction direction0 = org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE;
    java.lang.String str2 = direction0.getVerb(true);
    org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE + "'", direction0.equals(org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Upgrading"+ "'", str2.equals("Upgrading"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test196"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition configUpgradeChangeDefinition0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition();
    java.util.List<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer> list_transfer1 = configUpgradeChangeDefinition0.getTransfers();
    java.lang.String str2 = configUpgradeChangeDefinition0.summary;
    java.util.List<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.ConfigurationKeyValue> list_configurationKeyValue3 = configUpgradeChangeDefinition0.getKeyValuePairs();
    java.util.List<org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.ConfigurationKeyValue> list_configurationKeyValue4 = configUpgradeChangeDefinition0.getKeyValuePairs();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_transfer1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_configurationKeyValue3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_configurationKeyValue4);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test197"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.lang.String str5 = configuration0.getStrictTransportSecurityHTTPResponseHeader();
    boolean b6 = configuration0.useMetricsCacheCustomSizingEngine();
    java.lang.String str7 = configuration0.getStackAdvisorScript();
    java.lang.String str8 = configuration0.getSrvrDisabledProtocols();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test198"); }

    java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str0);
    org.apache.ambari.server.controller.spi.Request request2 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request2);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test199"); }

    org.apache.ambari.server.state.theme.TabLayout tabLayout0 = new org.apache.ambari.server.state.theme.TabLayout();
    java.lang.String str1 = tabLayout0.getTabRows();
    java.lang.String str2 = tabLayout0.getTabColumns();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test200"); }

    org.apache.ambari.server.controller.internal.Stack stack2 = null;
    org.apache.ambari.server.topology.Component[] component_array3 = new org.apache.ambari.server.topology.Component[] {  };
    java.util.ArrayList<org.apache.ambari.server.topology.Component> arraylist_component4 = new java.util.ArrayList<org.apache.ambari.server.topology.Component>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, component_array3);
    org.apache.ambari.server.topology.Configuration configuration6 = null;
    org.apache.ambari.server.topology.HostGroupImpl hostGroupImpl8 = new org.apache.ambari.server.topology.HostGroupImpl("ambari-server", "", stack2, (java.util.Collection<org.apache.ambari.server.topology.Component>)arraylist_component4, configuration6, "Repositories/latest_base_url");
    org.apache.ambari.server.controller.internal.Stack stack9 = hostGroupImpl8.getStack();
    java.util.Collection<org.apache.ambari.server.topology.Component> collection_component10 = hostGroupImpl8.getComponents();
    java.util.Collection<java.lang.String> collection_str11 = hostGroupImpl8.getServices();
    org.apache.ambari.server.controller.internal.ConfigurationTopologyException configurationTopologyException12 = new org.apache.ambari.server.controller.internal.ConfigurationTopologyException(collection_str11);
    
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
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test201"); }

    org.apache.ambari.server.topology.NoSuchBlueprintException noSuchBlueprintException1 = new org.apache.ambari.server.topology.NoSuchBlueprintException("");

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test202"); }

    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str7 = null;
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo8 = null;
    org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array9 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo10 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10, propertyDependencyInfo_array9);
    org.apache.ambari.server.controller.StackConfigurationResponse stackConfigurationResponse12 = new org.apache.ambari.server.controller.StackConfigurationResponse("Users/user_type", "ERROR", "Hosts/last_registration_time", "StackConfigurations/type", "alerts.json", (java.lang.Boolean)true, set_propertyType6, map_str_str7, valueAttributesInfo8, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>)linkedhashset_propertyDependencyInfo10);
    stackConfigurationResponse12.setStackVersion("cardinality");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test203"); }

    org.apache.ambari.server.serveraction.upgrades.ComponentVersionCheckAction componentVersionCheckAction0 = new org.apache.ambari.server.serveraction.upgrades.ComponentVersionCheckAction();
    java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Object> concurrentmap_str_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.agent.CommandReport commandReport2 = componentVersionCheckAction0.execute(concurrentmap_str_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test204"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.String> singularattribute_alertHistoryEntity_str0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertInstance;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_str0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test205"); }

    org.apache.ambari.server.actionmanager.ActionType actionType0 = org.apache.ambari.server.actionmanager.ActionType.SYSTEM_REQUIRES_ADMIN;
    org.junit.Assert.assertTrue("'" + actionType0 + "' != '" + org.apache.ambari.server.actionmanager.ActionType.SYSTEM_REQUIRES_ADMIN + "'", actionType0.equals(org.apache.ambari.server.actionmanager.ActionType.SYSTEM_REQUIRES_ADMIN));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test206"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.METRIC_RETRIEVAL_SERVICE_CACHE_TIMEOUT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test207"); }

    org.apache.ambari.server.state.UpgradeState upgradeState0 = org.apache.ambari.server.state.UpgradeState.COMPLETE;
    org.junit.Assert.assertTrue("'" + upgradeState0 + "' != '" + org.apache.ambari.server.state.UpgradeState.COMPLETE + "'", upgradeState0.equals(org.apache.ambari.server.state.UpgradeState.COMPLETE));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test208"); }

    org.apache.ambari.server.metrics.system.impl.MetricsConfiguration metricsConfiguration0 = org.apache.ambari.server.metrics.system.impl.MetricsConfiguration.getMetricsConfiguration();
    java.lang.String str2 = metricsConfiguration0.getProperty("FilterOperator");
    org.apache.ambari.server.metrics.system.impl.MetricsConfiguration metricsConfiguration4 = org.apache.ambari.server.metrics.system.impl.MetricsConfiguration.getSubsetConfiguration(metricsConfiguration0, "AuthorizationInfo/view_instance_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(metricsConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(metricsConfiguration4);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test209"); }

    org.apache.ambari.server.topology.Component component1 = new org.apache.ambari.server.topology.Component("configure-task-key-value-pairs");
    org.apache.ambari.server.controller.internal.ProvisionAction provisionAction2 = component1.getProvisionAction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(provisionAction2);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test210"); }

    org.apache.ambari.server.controller.AlertCurrentRequest alertCurrentRequest0 = new org.apache.ambari.server.controller.AlertCurrentRequest();
    org.apache.ambari.server.controller.spi.Predicate predicate1 = alertCurrentRequest0.Predicate;
    org.apache.ambari.server.controller.spi.PageRequest pageRequest2 = null;
    alertCurrentRequest0.Pagination = pageRequest2;
    org.apache.ambari.server.controller.spi.PageRequest pageRequest4 = alertCurrentRequest0.Pagination;
    org.apache.ambari.server.controller.spi.Predicate predicate5 = alertCurrentRequest0.Predicate;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(pageRequest4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate5);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test211"); }

    org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler aDKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.ADKerberosOperationHandler();
    aDKerberosOperationHandler0.close();
    java.lang.String str2 = aDKerberosOperationHandler0.getDefaultRealm();
    aDKerberosOperationHandler0.close();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = aDKerberosOperationHandler0.principalExists("PermissionInfo/sort_order");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosOperationException");
    } catch (org.apache.ambari.server.serveraction.kerberos.KerberosOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test212"); }

    org.apache.ambari.server.agent.CancelCommand cancelCommand0 = new org.apache.ambari.server.agent.CancelCommand();
    long long1 = cancelCommand0.getTargetTaskId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test213"); }

    org.apache.ambari.server.orm.dao.ClusterStateDAO clusterStateDAO0 = new org.apache.ambari.server.orm.dao.ClusterStateDAO();
    org.apache.ambari.server.orm.entities.ClusterStateEntity clusterStateEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    clusterStateDAO0.create(clusterStateEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test214"); }

    org.apache.ambari.server.metrics.system.SingleMetric singleMetric3 = new org.apache.ambari.server.metrics.system.SingleMetric("AlertNotice/target_id", (double)10, (long)(short)-1);
    java.lang.String str4 = singleMetric3.getMetricName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AlertNotice/target_id"+ "'", str4.equals("AlertNotice/target_id"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test215"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    java.util.Collection<java.lang.String> collection_str2 = componentModule1.getErrors();
    boolean b3 = componentModule1.isDeleted();
    org.apache.ambari.server.state.ComponentInfo componentInfo4 = componentModule1.getModuleInfo();
    componentInfo4.setCardinality("blueprint");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentInfo4);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test216"); }

    org.apache.ambari.server.utils.ShellCommandUtil.logOpenSslExitCode("ambari_db_rca_username", 30);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test217"); }

    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider0 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    org.apache.ambari.server.controller.spi.Predicate predicate1 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate2 = groupPrivilegeResourceProvider0.amendPredicate(predicate1);
    java.util.Set<java.lang.String> set_str3 = groupPrivilegeResourceProvider0.getCategoryIds();
    org.apache.ambari.server.controller.spi.Request request4 = null;
    org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate categoryIsEmptyPredicate6 = new org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate("AlertHistory/definition_name");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus7 = groupPrivilegeResourceProvider0.updateResources(request4, (org.apache.ambari.server.controller.spi.Predicate)categoryIsEmptyPredicate6);
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.controller.spi.SystemException");
    } catch (org.apache.ambari.server.controller.spi.SystemException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str3);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test218"); }

    org.apache.ambari.server.api.resources.ConfigurationResourceDefinition configurationResourceDefinition0 = new org.apache.ambari.server.api.resources.ConfigurationResourceDefinition();
    java.lang.String str1 = configurationResourceDefinition0.getPluralName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "configurations"+ "'", str1.equals("configurations"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test219"); }

    org.apache.ambari.server.notifications.TargetConfigurationResult targetConfigurationResult0 = org.apache.ambari.server.notifications.TargetConfigurationResult.valid();
    org.apache.ambari.server.notifications.TargetConfigurationResult.Status status1 = targetConfigurationResult0.getStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(targetConfigurationResult0);
    org.junit.Assert.assertTrue("'" + status1 + "' != '" + org.apache.ambari.server.notifications.TargetConfigurationResult.Status.VALID + "'", status1.equals(org.apache.ambari.server.notifications.TargetConfigurationResult.Status.VALID));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test220"); }

    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider0);
    org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider gSInstallerHostProvider2 = new org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider(clusterDefinition1);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController3 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider4 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController3);
    org.apache.ambari.server.controller.spi.Request request5 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate6 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus7 = widgetResourceProvider4.deleteResources(request5, predicate6);
    java.lang.String[] str_array10 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request11 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array10);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus12 = widgetResourceProvider4.createResources(request11);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController13 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider14 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController13);
    java.lang.String[] str_array17 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request18 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array17);
    org.apache.ambari.server.controller.spi.Request request19 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array17);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate22 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate23 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array24 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate23 };
    org.apache.ambari.server.controller.spi.Predicate predicate25 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array24);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate26 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array24);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate29 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate32 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array33 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate22, andPredicate26, filterPredicate29, filterPredicate32 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate34 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array33);
    org.apache.ambari.server.actionmanager.ActionType actionType36 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType41 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array43 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization44 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization44, roleAuthorization_array43);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition46 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType36, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType41, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization44);
    boolean b47 = andPredicate34.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate48 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj49 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor50 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj49);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate48, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor50);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate52 = null;
    extendedResourcePredicateVisitor50.acceptUnaryPredicate(unaryPredicate52);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate34, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor50);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource55 = compatibleRepositoryVersionResourceProvider14.getResources(request19, (org.apache.ambari.server.controller.spi.Predicate)andPredicate34);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate58 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate59 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array60 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate59 };
    org.apache.ambari.server.controller.spi.Predicate predicate61 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array60);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate62 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array60);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate65 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate68 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array69 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate58, andPredicate62, filterPredicate65, filterPredicate68 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate70 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array69);
    org.apache.ambari.server.actionmanager.ActionType actionType72 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType77 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array79 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization80 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization80, roleAuthorization_array79);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition82 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType72, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType77, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization80);
    boolean b83 = andPredicate70.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate84 = compatibleRepositoryVersionResourceProvider14.amendPredicate((org.apache.ambari.server.controller.spi.Predicate)andPredicate70);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource85 = gSInstallerHostProvider2.getResources(request11, (org.apache.ambari.server.controller.spi.Predicate)andPredicate70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource85);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test221"); }

    org.apache.ambari.server.controller.StackServiceComponentRequest stackServiceComponentRequest4 = new org.apache.ambari.server.controller.StackServiceComponentRequest("config_recommendation_strategy", "RootService/service_name", "recovery_retry_interval", "RequestBodyInfo");
    stackServiceComponentRequest4.setCredentialStoreEnabled("ServiceInfo/credential_store_supported");
    java.lang.String str7 = stackServiceComponentRequest4.getStackVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "RootService/service_name"+ "'", str7.equals("RootService/service_name"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test222"); }

    java.util.Set<java.lang.String> set_str2 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.propertyIds;
    org.apache.ambari.server.configuration.Configuration configuration3 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str4 = configuration3.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file5 = configuration3.getRecommendationsDir();
    java.lang.String str6 = configuration3.getHostsMapFile();
    java.lang.Integer i7 = configuration3.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties8 = configuration3.getPersistenceCustomProperties();
    long long9 = configuration3.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str10 = configuration3.getWebAppDir();
    int i11 = configuration3.getClientSSLApiPort();
    java.util.Map<java.lang.String,java.lang.String> map_str_str12 = configuration3.getAmbariProperties();
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask13 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask13.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type16 = executeTask13.getStageWrapperType();
    org.apache.ambari.server.state.stack.upgrade.ConfigureFunction configureFunction17 = new org.apache.ambari.server.state.stack.upgrade.ConfigureFunction();
    configureFunction17.isSequential = false;
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask20 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask20.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type23 = executeTask20.getStageWrapperType();
    executeTask20.isSequential = true;
    org.apache.ambari.server.state.stack.upgrade.ManualTask manualTask26 = new org.apache.ambari.server.state.stack.upgrade.ManualTask();
    java.lang.String str27 = manualTask26.getActionVerb();
    java.util.List<java.lang.String> list_str28 = manualTask26.messages;
    org.apache.ambari.server.state.stack.upgrade.ExecuteTask executeTask29 = new org.apache.ambari.server.state.stack.upgrade.ExecuteTask();
    executeTask29.function = "Artifacts/artifact_name";
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type32 = executeTask29.getStageWrapperType();
    java.lang.String str33 = executeTask29.getActionVerb();
    org.apache.ambari.server.state.stack.upgrade.Task[] task_array34 = new org.apache.ambari.server.state.stack.upgrade.Task[] { executeTask13, configureFunction17, executeTask20, manualTask26, executeTask29 };
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper35 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("", "INITIAL", set_str2, map_str_str12, task_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "nosniff"+ "'", str4.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 30000+ "'", i7.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 5000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 8443);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str12);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS + "'", type16.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS));
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS + "'", type23.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Executing"+ "'", str27.equals("Executing"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS + "'", type32.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.RU_TASKS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Executing"+ "'", str33.equals("Executing"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(task_array34);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test223"); }

    org.apache.ambari.server.controller.RepositoryRequest repositoryRequest4 = new org.apache.ambari.server.controller.RepositoryRequest(".FILTER", "task", "encryption_types", "ranger-hive-plugin-enabled");
    java.lang.String str5 = repositoryRequest4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "RepositoryRequest [repoId=ranger-hive-plugin-enabled, baseUrl=null, verify=true, getOsType()=encryption_types, getRepositoryVersionId()=null, getStackVersion()=task, getStackName()=.FILTER]"+ "'", str5.equals("RepositoryRequest [repoId=ranger-hive-plugin-enabled, baseUrl=null, verify=true, getOsType()=encryption_types, getRepositoryVersionId()=null, getStackVersion()=task, getStackName()=.FILTER]"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test224"); }

    org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity0 = null;
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider1 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    org.apache.ambari.server.controller.spi.Predicate predicate2 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate3 = groupPrivilegeResourceProvider1.amendPredicate(predicate2);
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization4 = groupPrivilegeResourceProvider1.getRequiredDeleteAuthorizations();
    org.apache.ambari.server.actionmanager.ActionType actionType6 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType11 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array13 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization14 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization14, roleAuthorization_array13);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition16 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType6, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType11, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization14);
    org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider groupPrivilegeResourceProvider19 = new org.apache.ambari.server.controller.internal.GroupPrivilegeResourceProvider();
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization20 = groupPrivilegeResourceProvider19.getRequiredCreateAuthorizations();
    org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization21 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array22 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] { roleAuthorization21 };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization23 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization23, roleAuthorization_array22);
    boolean b25 = org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.hasAuthorization("RepositoryVersions/display_name", (java.lang.Long)10L, set_roleAuthorization20, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization23);
    actionDefinition16.setPermissions((java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization23);
    groupPrivilegeResourceProvider1.setRequiredDeleteAuthorizations((java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization23);
    org.apache.ambari.server.actionmanager.ActionType actionType29 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType34 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array36 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization37 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization37, roleAuthorization_array36);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition39 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType29, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType34, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization37);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyAuthorization(alertDefinitionEntity0, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization23, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization37, "cluster");
      org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
    } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization20);
    org.junit.Assert.assertTrue("'" + roleAuthorization21 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS + "'", roleAuthorization21.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MODIFY_CONFIGS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test225"); }

    org.apache.ambari.server.api.resources.WidgetResourceDefinition widgetResourceDefinition0 = new org.apache.ambari.server.api.resources.WidgetResourceDefinition();
    java.lang.String str1 = widgetResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "widget"+ "'", str1.equals("widget"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test226"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_NAMENODE_HA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test227"); }

    org.apache.ambari.server.controller.ServiceComponentRequest serviceComponentRequest5 = new org.apache.ambari.server.controller.ServiceComponentRequest("", "ACTION_USER_NAME", "stack_features", "RequestBodyInfo", "StackConfigurations/property_name");
    java.lang.String str6 = serviceComponentRequest5.getDesiredState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "RequestBodyInfo"+ "'", str6.equals("RequestBodyInfo"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test228"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array2 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter3 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter3, requestResourceFilter_array2);
    org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType6 = org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE;
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface16 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array17 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface16 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface18 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface18, interface_array17);
    org.apache.ambari.server.controller.ivory.Cluster.Location location22 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array23 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location22 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location24 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location24, location_array23);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array26 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo27 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo27, propertyInfo_array26);
    java.util.Map<java.lang.String,java.lang.String> map_str_str29 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo30 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo27, map_str_str29);
    org.apache.ambari.server.controller.ivory.Cluster cluster31 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface18, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location24, map_str_str29);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str32 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest33 = new org.apache.ambari.server.controller.ConfigurationRequest("service_component_filter", "yarn.scheduler.capacity.root.queues", "GreaterEqualsOperator", map_str_str29, map_str_map_str_str32);
    org.apache.ambari.server.checks.CheckDescription checkDescription34 = new org.apache.ambari.server.checks.CheckDescription("max_duration_for_retries", prereqCheckType6, "ambari_db_rca_username", map_str_str29);
    org.apache.ambari.server.controller.ActionExecutionContext actionExecutionContext35 = new org.apache.ambari.server.controller.ActionExecutionContext("Hosts/maintenance_state", "", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter3, map_str_str29);
    actionExecutionContext35.setMaintenanceModeHostExcluded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    org.junit.Assert.assertTrue("'" + prereqCheckType6 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE + "'", prereqCheckType6.equals(org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str29);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test229"); }

    org.apache.ambari.server.state.ValueEntryInfo valueEntryInfo0 = new org.apache.ambari.server.state.ValueEntryInfo();
    valueEntryInfo0.setDescription("HostRoles/state");
    java.lang.String str3 = valueEntryInfo0.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test230"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_MIRRORS_LIST_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/mirrors_list"+ "'", str0.equals("Repositories/mirrors_list"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test231"); }

    org.apache.ambari.server.audit.event.request.ClientConfigDownloadRequestAuditEvent.ClientConfigDownloadRequestAuditEventBuilder clientConfigDownloadRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.ClientConfigDownloadRequestAuditEvent.ClientConfigDownloadRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.ClientConfigDownloadRequestAuditEvent.ClientConfigDownloadRequestAuditEventBuilder clientConfigDownloadRequestAuditEventBuilder2 = clientConfigDownloadRequestAuditEventBuilder0.withUrl("");
    org.apache.ambari.server.audit.event.request.ClientConfigDownloadRequestAuditEvent.ClientConfigDownloadRequestAuditEventBuilder clientConfigDownloadRequestAuditEventBuilder4 = clientConfigDownloadRequestAuditEventBuilder0.withUrl("HTTP_ONLY");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientConfigDownloadRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clientConfigDownloadRequestAuditEventBuilder4);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test232"); }

    org.apache.ambari.server.orm.dao.UserDAO userDAO0 = new org.apache.ambari.server.orm.dao.UserDAO();
    org.apache.ambari.server.orm.entities.UserEntity[] userEntity_array1 = new org.apache.ambari.server.orm.entities.UserEntity[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.orm.entities.UserEntity> linkedhashset_userEntity2 = new java.util.LinkedHashSet<org.apache.ambari.server.orm.entities.UserEntity>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.UserEntity>)linkedhashset_userEntity2, userEntity_array1);
    userDAO0.create((java.util.Set<org.apache.ambari.server.orm.entities.UserEntity>)linkedhashset_userEntity2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userEntity_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test233"); }

    org.apache.ambari.server.state.HostState hostState0 = org.apache.ambari.server.state.HostState.HEARTBEAT_LOST;
    org.junit.Assert.assertTrue("'" + hostState0 + "' != '" + org.apache.ambari.server.state.HostState.HEARTBEAT_LOST + "'", hostState0.equals(org.apache.ambari.server.state.HostState.HEARTBEAT_LOST));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test234"); }

    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping6 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<org.apache.ambari.server.state.alert.AlertDefinition> list_alertDefinition8 = aggregateDefinitionMapping6.getAggregateDefinitions((long)(short)1);
    org.apache.ambari.server.agent.AlertDefinitionCommand alertDefinitionCommand9 = new org.apache.ambari.server.agent.AlertDefinitionCommand("", "Hosts/last_registration_time", "${ambariVersion}", list_alertDefinition8);
    org.apache.ambari.server.agent.AlertDefinitionCommand alertDefinitionCommand10 = new org.apache.ambari.server.agent.AlertDefinitionCommand("AMBARI.MANAGE_USERS", "Actions/target_service", "yarn.scheduler.capacity.root", list_alertDefinition8);
    org.apache.ambari.server.agent.AgentCommand.AgentCommandType agentCommandType11 = alertDefinitionCommand10.getCommandType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_alertDefinition8);
    org.junit.Assert.assertTrue("'" + agentCommandType11 + "' != '" + org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_DEFINITION_COMMAND + "'", agentCommandType11.equals(org.apache.ambari.server.agent.AgentCommand.AgentCommandType.ALERT_DEFINITION_COMMAND));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test235"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.JWT_AUTH_PROVIDER_URL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test236"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.state.LogDefinition logDefinition1 = componentInfo0.getPrimaryLog();
    boolean b2 = componentInfo0.isVersionAdvertised();
    java.util.List<java.lang.String> list_str3 = componentInfo0.getClientsToUpdateConfigs();
    componentInfo0.setReassignAllowed("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(logDefinition1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_str3);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test237"); }

    org.apache.ambari.server.agent.AgentEnv.Alternative alternative0 = new org.apache.ambari.server.agent.AgentEnv.Alternative();
    alternative0.setTarget("1.3.6.1.4.1.18060.16.1.1.1.1");
    java.lang.String str3 = alternative0.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.1"+ "'", str3.equals("1.3.6.1.4.1.18060.16.1.1.1.1"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test238"); }

    org.apache.ambari.server.controller.ServiceConfigVersionRequest serviceConfigVersionRequest0 = new org.apache.ambari.server.controller.ServiceConfigVersionRequest();
    serviceConfigVersionRequest0.setNote("common-services");
    java.lang.String str3 = serviceConfigVersionRequest0.getNote();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "common-services"+ "'", str3.equals("common-services"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test239"); }

    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider0);
    java.util.Set<java.lang.String> set_str2 = clusterDefinition1.getServices();
    org.apache.ambari.server.controller.RequestsByStatusesRequest requestsByStatusesRequest3 = new org.apache.ambari.server.controller.RequestsByStatusesRequest(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test240"); }

    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array2 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter3 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter3, requestResourceFilter_array2);
    org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType6 = org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE;
    org.apache.ambari.server.controller.ivory.Cluster.Interface interface16 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "", "timeline.metrics.host.aggregator.ttl");
    org.apache.ambari.server.controller.ivory.Cluster.Interface[] interface_array17 = new org.apache.ambari.server.controller.ivory.Cluster.Interface[] { interface16 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface> linkedhashset_interface18 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Interface>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface18, interface_array17);
    org.apache.ambari.server.controller.ivory.Cluster.Location location22 = new org.apache.ambari.server.controller.ivory.Cluster.Location("AlertTarget/name", "org.apache.derby.jdbc.EmbeddedDriver");
    org.apache.ambari.server.controller.ivory.Cluster.Location[] location_array23 = new org.apache.ambari.server.controller.ivory.Cluster.Location[] { location22 };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location> linkedhashset_location24 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.ivory.Cluster.Location>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location24, location_array23);
    org.apache.ambari.server.state.PropertyInfo[] propertyInfo_array26 = new org.apache.ambari.server.state.PropertyInfo[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo> arraylist_propertyInfo27 = new java.util.ArrayList<org.apache.ambari.server.state.PropertyInfo>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo27, propertyInfo_array26);
    java.util.Map<java.lang.String,java.lang.String> map_str_str29 = org.apache.ambari.server.utils.StageUtils.getComponentToClusterInfoKeyMap();
    org.apache.ambari.server.stack.ConfigurationInfo configurationInfo30 = new org.apache.ambari.server.stack.ConfigurationInfo((java.util.Collection<org.apache.ambari.server.state.PropertyInfo>)arraylist_propertyInfo27, map_str_str29);
    org.apache.ambari.server.controller.ivory.Cluster cluster31 = new org.apache.ambari.server.controller.ivory.Cluster("configure-task-key-value-pairs", "hostRoleCommandStatusCacheExpiryDurationMins", (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Interface>)linkedhashset_interface18, (java.util.Set<org.apache.ambari.server.controller.ivory.Cluster.Location>)linkedhashset_location24, map_str_str29);
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.String>> map_str_map_str_str32 = null;
    org.apache.ambari.server.controller.ConfigurationRequest configurationRequest33 = new org.apache.ambari.server.controller.ConfigurationRequest("service_component_filter", "yarn.scheduler.capacity.root.queues", "GreaterEqualsOperator", map_str_str29, map_str_map_str_str32);
    org.apache.ambari.server.checks.CheckDescription checkDescription34 = new org.apache.ambari.server.checks.CheckDescription("max_duration_for_retries", prereqCheckType6, "ambari_db_rca_username", map_str_str29);
    org.apache.ambari.server.controller.ActionExecutionContext actionExecutionContext35 = new org.apache.ambari.server.controller.ActionExecutionContext("Hosts/maintenance_state", "", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter3, map_str_str29);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel36 = new org.apache.ambari.server.controller.internal.RequestOperationLevel(map_str_str29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    org.junit.Assert.assertTrue("'" + prereqCheckType6 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE + "'", prereqCheckType6.equals(org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interface_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(location_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyInfo_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str29);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test241"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_HOST_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/host_name"+ "'", str0.equals("Tasks/host_name"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test242"); }

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
    userDAO0.create(userEntity8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userEntity2);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test243"); }

    org.apache.ambari.server.serveraction.kerberos.CreatePrincipalsServerAction.CreatePrincipalResult createPrincipalResult3 = new org.apache.ambari.server.serveraction.kerberos.CreatePrincipalsServerAction.CreatePrincipalResult("agent_stack_retry_on_unavailability", "hbase-site", (java.lang.Integer)999);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test244"); }

    org.apache.ambari.server.controller.StackRequest stackRequest1 = new org.apache.ambari.server.controller.StackRequest("RootServiceComponents/component_version");

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test245"); }

    org.apache.ambari.server.api.services.PersistKeyValueImpl persistKeyValueImpl0 = new org.apache.ambari.server.api.services.PersistKeyValueImpl();
    java.util.Collection<java.lang.String> collection_str2 = persistKeyValueImpl0.generateKeys((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str2);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test246"); }

    org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent.StartOperationAuditEventBuilder startOperationAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent.StartOperationAuditEventBuilder startOperationAuditEventBuilder2 = startOperationAuditEventBuilder0.withReasonOfFailure("UpgradeItem/group_id");
    org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent.StartOperationAuditEventBuilder startOperationAuditEventBuilder4 = startOperationAuditEventBuilder0.withOperation("Versions/stack-errors");
    org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent.StartOperationAuditEventBuilder startOperationAuditEventBuilder6 = startOperationAuditEventBuilder4.withOperation("ServiceInfo/state");
    org.apache.ambari.server.audit.event.request.StartOperationRequestAuditEvent.StartOperationAuditEventBuilder startOperationAuditEventBuilder8 = startOperationAuditEventBuilder4.withUserName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(startOperationAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(startOperationAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(startOperationAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(startOperationAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(startOperationAuditEventBuilder8);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test247"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.PACKAGE_VERSION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "package_version"+ "'", str0.equals("package_version"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test248"); }

    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider6 = new org.apache.ambari.server.controller.internal.URLStreamProvider(1200, (-1), "ambari.dispatch.snmp.security.priv.passphrase", "OperatingSystems/version_definition_id", "timeline.metrics.cluster.aggregator.minute.ttl");
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration7 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider timelineMetricCacheProvider8 = null;
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule9 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule10 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule9);
    java.lang.String str14 = defaultProviderModule9.getJMXRpcMetricTag("ViewVersionInfo/description", "QuickLinkInfo/stack_version", "StackServices/stack_version");
    org.apache.ambari.server.events.ClusterConfigChangedEvent clusterConfigChangedEvent19 = new org.apache.ambari.server.events.ClusterConfigChangedEvent("TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", "ambari-server", "600", (java.lang.Long)10L);
    defaultProviderModule9.onConfigurationChangedEvent(clusterConfigChangedEvent19);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.timeline.AMSHostPropertyProvider aMSHostPropertyProvider23 = new org.apache.ambari.server.controller.metrics.timeline.AMSHostPropertyProvider(map_str_map_str_propertyInfo0, uRLStreamProvider6, componentSSLConfiguration7, timelineMetricCacheProvider8, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule9, "service_name", "jdbc:derby:memory:myDB/ambari;create=true");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test249"); }

    org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder deleteServiceRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder deleteServiceRequestAuditEventBuilder2 = deleteServiceRequestAuditEventBuilder0.withRemoteIp("");
    org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder deleteServiceRequestAuditEventBuilder4 = deleteServiceRequestAuditEventBuilder0.withUserName("component");
    org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder deleteServiceRequestAuditEventBuilder6 = deleteServiceRequestAuditEventBuilder0.withService("ViewInstanceInfo/visible");
    org.apache.ambari.server.audit.event.request.DeleteServiceRequestAuditEvent.DeleteServiceRequestAuditEventBuilder deleteServiceRequestAuditEventBuilder8 = deleteServiceRequestAuditEventBuilder6.withService("CompatibleRepositoryVersions/repository_version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteServiceRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteServiceRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteServiceRequestAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteServiceRequestAuditEventBuilder8);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test250"); }

    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS1 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus2 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS1);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = resultStatus2.getStatus();
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder4 = addHostRequestAuditEventBuilder0.withResultStatus(resultStatus2);
    org.apache.ambari.server.audit.event.request.AddHostRequestAuditEvent.AddHostRequestAuditEventBuilder addHostRequestAuditEventBuilder6 = addHostRequestAuditEventBuilder4.withOperation("Hosts/last_registration_time");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addHostRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addHostRequestAuditEventBuilder6);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test251"); }

    java.util.Map<java.lang.String,java.lang.String> map_str_str2 = null;
    org.apache.ambari.server.controller.HostRequest hostRequest3 = new org.apache.ambari.server.controller.HostRequest("Stage/host_params", "WidgetLayoutInfo/section_name", map_str_str2);
    hostRequest3.setHostGroupName("Requests/request_schedule/schedule_id");
    java.util.Map<java.lang.String,java.lang.String> map_str_str6 = org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper.masterToSlaveMappingForDecom;
    hostRequest3.setHostAttributes(map_str_str6);
    hostRequest3.setMaintenanceState("RootServiceComponents/server_clock");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str6);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test252"); }

    org.apache.ambari.server.state.alert.PortSource portSource0 = new org.apache.ambari.server.state.alert.PortSource();
    java.util.Collection<java.util.Map<java.lang.String,java.lang.Object>> collection_map_str_obj1 = null;
    org.apache.ambari.server.topology.Setting setting2 = org.apache.ambari.server.topology.SettingFactory.getSetting(collection_map_str_obj1);
    java.util.Set<java.util.HashMap<java.lang.String,java.lang.String>> set_hashmap_str_str4 = setting2.getSettingValue("ViewInstanceInfo/short_url_name");
    boolean b5 = portSource0.equals((java.lang.Object)"ViewInstanceInfo/short_url_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(setting2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_hashmap_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test253"); }

    org.apache.ambari.server.orm.dao.WidgetDAO widgetDAO0 = new org.apache.ambari.server.orm.dao.WidgetDAO();
    org.apache.ambari.server.orm.entities.WidgetEntity widgetEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    widgetDAO0.refresh(widgetEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test254"); }

    org.apache.ambari.server.controller.ServiceResponse serviceResponse7 = new org.apache.ambari.server.controller.ServiceResponse((java.lang.Long)(-1L), "name", "stack_features", "Tasks/custom_command_name", "RepositoryVersions/display_name", true, true);
    serviceResponse7.setCredentialStoreEnabled(false);
    serviceResponse7.setMaintenanceState("Requests/request_schedule/schedule_id");
    boolean b12 = serviceResponse7.isCredentialStoreEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test255"); }

    org.apache.ambari.server.state.stack.StackMetainfoXml stackMetainfoXml0 = new org.apache.ambari.server.state.stack.StackMetainfoXml();
    java.util.Collection<java.lang.String> collection_str1 = stackMetainfoXml0.getErrors();
    java.lang.String str2 = stackMetainfoXml0.getExtends();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test256"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController6 = null;
    org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider activeWidgetLayoutResourceProvider7 = new org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider(ambariManagementController6);
    java.util.Set<java.lang.String> set_str8 = activeWidgetLayoutResourceProvider7.getCategoryIds();
    org.apache.ambari.server.controller.ExtensionLinkResponse extensionLinkResponse9 = new org.apache.ambari.server.controller.ExtensionLinkResponse("service", "Clusters/total_hosts", "Repositories/latest_base_url", "Request_Info/asc_order", "_SERVICE_CHECK", false, (java.util.Collection<java.lang.String>)set_str8);
    extensionLinkResponse9.setValid(false);
    boolean b12 = extensionLinkResponse9.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test257"); }

    org.apache.ambari.server.audit.event.request.DeleteBlueprintRequestAuditEvent.DeleteBlueprintRequestAuditEventBuilder deleteBlueprintRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteBlueprintRequestAuditEvent.DeleteBlueprintRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.DeleteBlueprintRequestAuditEvent.DeleteBlueprintRequestAuditEventBuilder deleteBlueprintRequestAuditEventBuilder2 = deleteBlueprintRequestAuditEventBuilder0.withUrl("Event/summary/memberships/removed");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteBlueprintRequestAuditEventBuilder2);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test258"); }

    org.apache.ambari.server.ServiceComponentNotFoundException serviceComponentNotFoundException3 = new org.apache.ambari.server.ServiceComponentNotFoundException("blueprint", "Repositories/version_definition_id", "Event/summary/groups/created");

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test259"); }

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
    java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization> set_roleAuthorization91 = memberResourceProvider90.getRequiredUpdateAuthorizations();
    org.apache.ambari.server.controller.internal.SimplifyingPredicateVisitor simplifyingPredicateVisitor92 = new org.apache.ambari.server.controller.internal.SimplifyingPredicateVisitor((org.apache.ambari.server.controller.spi.ResourceProvider)memberResourceProvider90);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_roleAuthorization91);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test260"); }

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
    org.apache.ambari.server.controller.spi.PageRequest pageRequest37 = null;
    queryImpl36.setPageRequest(pageRequest37);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController39 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider40 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController39);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str41 = ldapSyncEventResourceProvider40.getKeyPropertyIds();
    queryImpl36.setKeyValueMap(map_type_str41);
    org.apache.ambari.server.api.query.ProcessingPredicateVisitor processingPredicateVisitor43 = new org.apache.ambari.server.api.query.ProcessingPredicateVisitor(queryImpl36);
    java.util.Set<java.lang.String> set_str44 = processingPredicateVisitor43.getSubResourceProperties();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController45 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider46 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController45);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str47 = ldapSyncEventResourceProvider46.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController48 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.ResourceProvider resourceProvider49 = org.apache.ambari.server.controller.internal.AbstractControllerResourceProvider.getResourceProvider(type0, set_str44, map_type_str47, ambariManagementController48);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str47);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test261"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.ALERTS_SNMP_DISPATCH_UDP_PORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test262"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.METRIC_RETRIEVAL_SERVICE_THREADPOOL_MAX_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_i0);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test263"); }

    org.apache.ambari.server.state.State state7 = org.apache.ambari.server.state.State.STOPPING;
    org.apache.ambari.server.state.State state8 = org.apache.ambari.server.state.State.UNINSTALLED;
    boolean b9 = org.apache.ambari.server.state.State.isValidStateTransition(state7, state8);
    org.apache.ambari.server.state.SecurityType securityType10 = null;
    org.apache.ambari.server.controller.ivory.IvoryService ivoryService11 = null;
    java.lang.String[] str_array30 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str31 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str31, str_array30);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent33 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str31);
    java.lang.String[] str_array52 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str53 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str53, str_array52);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent55 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str53);
    org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = linkedhashset_str53;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController57 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider58 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController57);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str59 = ldapSyncEventResourceProvider58.getKeyPropertyIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController60 = null;
    com.google.inject.Injector injector61 = null;
    org.apache.ambari.server.controller.internal.HostComponentResourceProvider hostComponentResourceProvider62 = new org.apache.ambari.server.controller.internal.HostComponentResourceProvider((java.util.Set<java.lang.String>)linkedhashset_str53, map_type_str59, ambariManagementController60, injector61);
    org.apache.ambari.server.controller.internal.TargetClusterResourceProvider targetClusterResourceProvider63 = new org.apache.ambari.server.controller.internal.TargetClusterResourceProvider(ivoryService11, (java.util.Set<java.lang.String>)linkedhashset_str31, map_type_str59);
    org.apache.ambari.server.state.ClusterHealthReport clusterHealthReport66 = new org.apache.ambari.server.state.ClusterHealthReport();
    int i67 = clusterHealthReport66.getInitStateHosts();
    org.apache.ambari.server.controller.ClusterResponse clusterResponse68 = new org.apache.ambari.server.controller.ClusterResponse((java.lang.Long)5000L, "Stage/status", state8, securityType10, (java.util.Set<java.lang.String>)linkedhashset_str31, (java.lang.Integer)400, "ViewUrlInfo/view_instance_name", clusterHealthReport66);
    java.util.Map<java.lang.String,org.apache.ambari.server.state.Config> map_str_config69 = null;
    org.apache.ambari.server.controller.ConfigGroupRequest configGroupRequest70 = new org.apache.ambari.server.controller.ConfigGroupRequest((java.lang.Long)100L, "Executing", "TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}", "ViewInstanceInfo/icon64_path", "servicecomponent_version", (java.util.Set<java.lang.String>)linkedhashset_str31, map_str_config69);
    java.lang.String str71 = configGroupRequest70.getGroupName();
    java.lang.String str72 = configGroupRequest70.getDescription();
    configGroupRequest70.setDescription("");
    org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.apache.ambari.server.state.State.STOPPING + "'", state7.equals(org.apache.ambari.server.state.State.STOPPING));
    org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.apache.ambari.server.state.State.UNINSTALLED + "'", state8.equals(org.apache.ambari.server.state.State.UNINSTALLED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}"+ "'", str71.equals("TimelineAppMetricCacheKey{metricNames=[UpgradeChecks/id, widgets.json, ViewVersionInfo/min_ambari_version, Request_Info/asc_order, downgrade_from_version, RepositoryVersions/display_name, , kerberos_descriptor, Requests/request_schedule/schedule_id, hi!, alerts.json, StackConfigurations/property_value_attributes, AlertTarget/notification_type], appId='Tasks/id', hostNames=null, spec='null'}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "servicecomponent_version"+ "'", str72.equals("servicecomponent_version"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test264"); }

    org.apache.ambari.server.controller.RootServiceComponentRequest rootServiceComponentRequest2 = new org.apache.ambari.server.controller.RootServiceComponentRequest("STARTED", "HostRoles/desired_state");

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test265"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_HEALTH_REPORT_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/health_report"+ "'", str0.equals("Clusters/health_report"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test266"); }

    org.apache.ambari.server.api.predicate.operators.NotEqualsOperator notEqualsOperator0 = new org.apache.ambari.server.api.predicate.operators.NotEqualsOperator();
    org.apache.ambari.server.controller.spi.Predicate predicate3 = notEqualsOperator0.toPredicate("PrivilegeInfo/type", "ViewVersionInfo/system");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate3);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test267"); }

    org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK configGroupHostMappingEntityPK0 = new org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntityPK();
    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse8 = new org.apache.ambari.server.controller.RepositoryResponse("Actions/target_service", "1.3.6.1.4.1.18060.16", "PermissionInfo/permission_name", "Versions/valid", "StackConfigurations/property_name", "QuickLinkInfo/default", "RUNNING");
    boolean b9 = configGroupHostMappingEntityPK0.equals((java.lang.Object)"StackConfigurations/property_name");
    configGroupHostMappingEntityPK0.setHostId((java.lang.Long)1L);
    java.lang.Long long12 = configGroupHostMappingEntityPK0.getHostId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L+ "'", long12.equals(1L));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test268"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.Extension extension3 = new org.apache.ambari.server.controller.internal.Extension("configure-task-key-value-pairs", "", ambariManagementController2);
    java.lang.String str4 = extension3.getVersion();
    org.apache.ambari.server.topology.Cardinality cardinality6 = extension3.getCardinality("host_group");
    java.util.Map<java.lang.String,java.util.Collection<java.lang.String>> map_str_collection_str7 = extension3.getComponents();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor8 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_str_collection_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cardinality6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_collection_str7);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test269"); }

    org.apache.ambari.server.controller.logging.LogQueryResponse logQueryResponse0 = new org.apache.ambari.server.controller.logging.LogQueryResponse();
    java.lang.String str1 = logQueryResponse0.getResultSize();
    java.lang.String str2 = logQueryResponse0.getQueryTimeMS();
    java.lang.String str3 = logQueryResponse0.getStartIndex();
    java.lang.String str4 = logQueryResponse0.getQueryTimeMS();
    java.lang.String str5 = logQueryResponse0.getResultSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test270"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    java.lang.String str3 = mySqlHelper1.quoteObjectName("ambari.dispatch.snmp.community");
    java.lang.String str5 = mySqlHelper1.quoteObjectName("StackConfigurations/type");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "`ambari.dispatch.snmp.community`"+ "'", str3.equals("`ambari.dispatch.snmp.community`"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "`StackConfigurations/type`"+ "'", str5.equals("`StackConfigurations/type`"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test271"); }

    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder();
    org.apache.ambari.server.api.services.ResultStatus resultStatus1 = null;
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder2 = deleteViewInstanceRequestAuditEventBuilder0.withResultStatus(resultStatus1);
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder4 = deleteViewInstanceRequestAuditEventBuilder2.withOperation("Tasks/end_time");
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder5 = new org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder6 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder7 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder8 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders9 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody10 = null;
    javax.ws.rs.core.UriInfo uriInfo11 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance12 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest13 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders9, requestBody10, uriInfo11, resourceInstance12);
    int i14 = postRequest13.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type15 = postRequest13.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder16 = addUserToGroupRequestAuditEventBuilder8.withRequestType(type15);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder17 = deleteRepositoryVersionAuditEventBuilder7.withRequestType(type15);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder18 = userPasswordChangeRequestAuditEventBuilder6.withRequestType(type15);
    org.apache.ambari.server.audit.event.request.AddUpgradeRequestAuditEvent.AddUpgradeRequestAuditEventBuilder addUpgradeRequestAuditEventBuilder19 = addUpgradeRequestAuditEventBuilder5.withRequestType(type15);
    org.apache.ambari.server.audit.event.request.DeleteViewInstanceRequestAuditEvent.DeleteViewInstanceRequestAuditEventBuilder deleteViewInstanceRequestAuditEventBuilder20 = deleteViewInstanceRequestAuditEventBuilder2.withRequestType(type15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type15.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUpgradeRequestAuditEventBuilder19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteViewInstanceRequestAuditEventBuilder20);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test272"); }

    org.apache.ambari.server.state.alert.AlertDefinitionHash alertDefinitionHash0 = new org.apache.ambari.server.state.alert.AlertDefinitionHash();
    boolean b3 = alertDefinitionHash0.isHashCached("regenerate_all", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test273"); }

    org.apache.ambari.server.security.CertificateManager certificateManager0 = new org.apache.ambari.server.security.CertificateManager();
    org.apache.ambari.server.security.unsecured.rest.CertificateDownload.init(certificateManager0);
    org.apache.ambari.server.security.unsecured.rest.CertificateDownload.init(certificateManager0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test274"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.PermissionResourceProvider.PERMISSION_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PermissionInfo/permission_name"+ "'", str0.equals("PermissionInfo/permission_name"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test275"); }

    org.apache.ambari.server.controller.AmbariSessionManager ambariSessionManager0 = new org.apache.ambari.server.controller.AmbariSessionManager();

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test276"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RoleAuthorizationResourceProvider.PERMISSION_ID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AuthorizationInfo/permission_id"+ "'", str0.equals("AuthorizationInfo/permission_id"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test277"); }

    java.util.Map<java.lang.String,java.util.List<? extends javax.persistence.metamodel.SingularAttribute<?,?>>> map_str_list_wildcard0 = org.apache.ambari.server.orm.entities.AlertCurrentEntity_.getPredicateMapping();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_wildcard0);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test278"); }

    org.apache.ambari.server.api.services.LdapSyncEventService ldapSyncEventService0 = new org.apache.ambari.server.api.services.LdapSyncEventService();
    javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = ldapSyncEventService0.updateEvent("RepositoryVersions/stack_services", httpHeaders2, uriInfo3, "127.0.0.1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test279"); }

    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider0);
    org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider gSInstallerHostProvider2 = new org.apache.ambari.server.controller.gsinstaller.GSInstallerHostProvider(clusterDefinition1);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str3 = gSInstallerHostProvider2.getKeyPropertyIds();
    org.apache.ambari.server.controller.spi.Resource resource4 = null;
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController5 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider6 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController5);
    org.apache.ambari.server.controller.spi.Request request7 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate8 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus9 = widgetResourceProvider6.deleteResources(request7, predicate8);
    java.lang.String[] str_array12 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request13 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array12);
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus14 = widgetResourceProvider6.createResources(request13);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate17 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    gSInstallerHostProvider2.updateProperties(resource4, request13, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate17);
    java.lang.String str19 = filterPredicate17.getPropertyId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Event/summary/memberships/removed"+ "'", str19.equals("Event/summary/memberships/removed"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test280"); }

    org.apache.ambari.server.state.action.ActionType actionType1 = null;
    org.apache.ambari.server.state.action.ActionId actionId2 = new org.apache.ambari.server.state.action.ActionId((long)5, actionType1);
    org.apache.ambari.server.state.action.ActionImpl actionImpl4 = new org.apache.ambari.server.state.action.ActionImpl(actionId2, 10L);
    long long5 = actionImpl4.getCompletionTime();
    long long6 = actionImpl4.getCompletionTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test281"); }

    org.apache.ambari.server.configuration.Configuration configuration14 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str15 = configuration14.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file16 = configuration14.getRecommendationsDir();
    java.util.Map<java.lang.String,java.lang.String> map_str_str17 = configuration14.getPreviousDatabaseConnectorNames();
    org.apache.ambari.server.controller.ivory.Feed feed18 = new org.apache.ambari.server.controller.ivory.Feed("UpgradeChecks/repository_version", "", "operating_systems", "service_settings", "", "recovery_retry_interval", "RootServiceComponents/ciphers", "Event/summary/users/created", "AlertHistory/label", "Stage/command_params", "Hosts/host_name", "Upgrade/abort_reason", "RootServiceHostComponents/properties", "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", map_str_str17);
    java.lang.String str19 = feed18.getSourceClusterName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "nosniff"+ "'", str15.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test282"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse8.setDefaultTimeout("forceRefreshConfigTagsBeforeExecution");
    actionResponse8.setInputs("RUNNING");

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test283"); }

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
    stackConfigurationResponse12.setPropertyDescription("kdc_create_attributes");
    org.apache.ambari.server.state.theme.Widget widget35 = new org.apache.ambari.server.state.theme.Widget();
    org.apache.ambari.server.state.theme.Unit[] unit_array36 = new org.apache.ambari.server.state.theme.Unit[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.theme.Unit> arraylist_unit37 = new java.util.ArrayList<org.apache.ambari.server.state.theme.Unit>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.theme.Unit>)arraylist_unit37, unit_array36);
    widget35.setUnits((java.util.List<org.apache.ambari.server.state.theme.Unit>)arraylist_unit37);
    widget35.setType("ConfigGroup/desired_configs");
    org.apache.ambari.server.configuration.Configuration configuration42 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str43 = configuration42.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file44 = configuration42.getRecommendationsDir();
    java.lang.String str45 = configuration42.getHostsMapFile();
    java.lang.Integer i46 = configuration42.getExecutionSchedulerStartDelay();
    java.util.Map<java.lang.String,java.lang.String> map_str_str47 = configuration42.getAgentConfigsMap();
    widget35.setRequiredProperties(map_str_str47);
    stackConfigurationResponse12.setPropertyAttributes(map_str_str47);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unit_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "nosniff"+ "'", str43.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 120+ "'", i46.equals(120));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str47);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test284"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("no-store", "config", "The directory already exists, skipping.", "CompatibleRepositoryVersions/display_name", "configuration", "ranger-hbase-plugin-enabled", "kdc_create_attributes", "instances");

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test285"); }

    org.apache.ambari.server.orm.entities.HostComponentStateEntity[] hostComponentStateEntity_array0 = new org.apache.ambari.server.orm.entities.HostComponentStateEntity[] {  };
    java.util.ArrayList<org.apache.ambari.server.orm.entities.HostComponentStateEntity> arraylist_hostComponentStateEntity1 = new java.util.ArrayList<org.apache.ambari.server.orm.entities.HostComponentStateEntity>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.HostComponentStateEntity>)arraylist_hostComponentStateEntity1, hostComponentStateEntity_array0);
    boolean b3 = org.apache.ambari.server.state.svccomphost.ServiceComponentHostSummary.noComponentVersionMismatches((java.util.Collection<org.apache.ambari.server.orm.entities.HostComponentStateEntity>)arraylist_hostComponentStateEntity1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostComponentStateEntity_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test286"); }

    org.apache.ambari.server.state.services.MetricsRetrievalService metricsRetrievalService0 = new org.apache.ambari.server.state.services.MetricsRetrievalService();
    java.lang.String str1 = metricsRetrievalService0.toString();
    com.google.common.util.concurrent.Service service2 = metricsRetrievalService0.startAsync();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "MetricsRetrievalService [NEW]"+ "'", str1.equals("MetricsRetrievalService [NEW]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(service2);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test287"); }

    org.apache.ambari.server.security.encryption.CredentialStoreType credentialStoreType3 = null;
    org.apache.ambari.server.topology.Credential credential4 = new org.apache.ambari.server.topology.Credential("Repositories/latest_base_url", "ViewVersionInfo/parameters", "ERROR", credentialStoreType3);
    java.lang.String str5 = credential4.getAlias();
    org.apache.ambari.server.security.encryption.CredentialStoreType credentialStoreType6 = credential4.getType();
    java.lang.String str7 = credential4.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Repositories/latest_base_url"+ "'", str5.equals("Repositories/latest_base_url"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(credentialStoreType6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ERROR"+ "'", str7.equals("ERROR"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test288"); }

    org.apache.ambari.server.controller.ActionRequest actionRequest8 = new org.apache.ambari.server.controller.ActionRequest("VersionDefinition/stack_name", "ViewInstanceInfo/properties", "nosniff", "CompatibleRepositoryVersions/stack_name", "evaluate_when", "ambari.dispatch-property.script", "Stage/display_status", "");
    actionRequest8.setTargetService("default_realm");
    actionRequest8.setActionType("yarn.scheduler.capacity.root.queues");
    java.lang.String str13 = actionRequest8.getActionType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "yarn.scheduler.capacity.root.queues"+ "'", str13.equals("yarn.scheduler.capacity.root.queues"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test289"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.COMPONENTS_INSTALLATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test290"); }

    org.apache.ambari.server.state.stack.upgrade.TransferOperation transferOperation0 = org.apache.ambari.server.state.stack.upgrade.TransferOperation.COPY;
    org.junit.Assert.assertTrue("'" + transferOperation0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.TransferOperation.COPY + "'", transferOperation0.equals(org.apache.ambari.server.state.stack.upgrade.TransferOperation.COPY));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test291"); }

    org.apache.ambari.server.state.scheduler.Batch batch5 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule6 = null;
    org.apache.ambari.server.controller.RequestScheduleResponse requestScheduleResponse12 = new org.apache.ambari.server.controller.RequestScheduleResponse((java.lang.Long)(-1L), "host_group", "Clusters/cluster_name", "java_version", "yarn.scheduler.capacity.root.queues", batch5, schedule6, "Stage/status", "Credential/key", "StackConfigurations/property_name", "downgrade_from_version", (java.lang.Integer)0);
    java.lang.Integer i13 = requestScheduleResponse12.getAuthenticatedUserId();
    java.lang.Integer i14 = requestScheduleResponse12.getAuthenticatedUserId();
    requestScheduleResponse12.setDescription("cluster.permissioninfo/resource_name.rootservicecomponents/service_name");
    requestScheduleResponse12.setStatus("ambari_db_rca_password");
    org.apache.ambari.server.state.scheduler.Schedule schedule19 = requestScheduleResponse12.getSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(schedule19);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test292"); }

    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider0);
    java.util.Set<java.lang.String> set_str2 = clusterDefinition1.getServices();
    org.apache.ambari.server.controller.gsinstaller.GSInstallerComponentProvider gSInstallerComponentProvider3 = new org.apache.ambari.server.controller.gsinstaller.GSInstallerComponentProvider(clusterDefinition1);
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController4 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider5 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController4);
    java.lang.String[] str_array8 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request9 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array8);
    org.apache.ambari.server.controller.spi.Request request10 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array8);
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
    org.apache.ambari.server.controller.spi.Predicate predicate39 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj40 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor41 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj40);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate39, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor41);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate43 = null;
    extendedResourcePredicateVisitor41.acceptUnaryPredicate(unaryPredicate43);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate25, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor41);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource46 = compatibleRepositoryVersionResourceProvider5.getResources(request10, (org.apache.ambari.server.controller.spi.Predicate)andPredicate25);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate49 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS50 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus51 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS50);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS52 = resultStatus51.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS53 = resultStatus51.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl54 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus51);
    boolean b55 = filterPredicate49.equals((java.lang.Object)resultStatus51);
    java.lang.String str56 = filterPredicate49.toString();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus57 = gSInstallerComponentProvider3.updateResources(request10, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate49);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Event/summary/memberships/removed.FILTER(service_type)"+ "'", str56.equals("Event/summary/memberships/removed.FILTER(service_type)"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test293"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.USERS_REMOVED_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/summary/users/removed"+ "'", str0.equals("Event/summary/users/removed"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test294"); }

    org.apache.ambari.server.controller.internal.Stack.ConfigProperty configProperty3 = new org.apache.ambari.server.controller.internal.Stack.ConfigProperty("ambari-server", "RootServiceComponents/service_name", "hostComponents");
    configProperty3.setValue("<html> <title>Status</title><body><h1>RUNNING</body></h1></html> ");
    java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType> set_propertyType6 = configProperty3.getPropertyTypes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_propertyType6);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test295"); }

    org.apache.ambari.server.actionmanager.HostRoleCommand[] hostRoleCommand_array0 = new org.apache.ambari.server.actionmanager.HostRoleCommand[] {  };
    java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand> arraylist_hostRoleCommand1 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleCommand>)arraylist_hostRoleCommand1, hostRoleCommand_array0);
    java.util.Map<java.lang.Long,org.apache.ambari.server.actionmanager.HostRoleCommand> map_long_hostRoleCommand3 = org.apache.ambari.server.utils.CommandUtils.convertToTaskIdCommandMap((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleCommand>)arraylist_hostRoleCommand1);
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor4 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor(map_long_hostRoleCommand3);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj5 = kerberosPrincipalDescriptor4.toMap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hostRoleCommand_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_long_hostRoleCommand3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj5);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test296"); }

    org.apache.ambari.server.api.resources.ClusterResourceDefinition clusterResourceDefinition0 = new org.apache.ambari.server.api.resources.ClusterResourceDefinition();
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type1 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP;
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = null;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] taskWrapper_array4 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.TaskWrapper> arraylist_taskWrapper5 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>)arraylist_taskWrapper5, taskWrapper_array4);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper7 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type1, "ranger-hbase-plugin-enabled", map_str_str3, (java.util.List<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>)arraylist_taskWrapper5);
    java.util.Set<java.lang.String> set_str8 = stageWrapper7.getHosts();
    org.apache.ambari.server.api.query.QueryInfo queryInfo9 = new org.apache.ambari.server.api.query.QueryInfo((org.apache.ambari.server.api.resources.ResourceDefinition)clusterResourceDefinition0, set_str8);
    org.apache.ambari.server.api.resources.ResourceDefinition resourceDefinition10 = queryInfo9.getResource();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP + "'", type1.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(taskWrapper_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceDefinition10);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test297"); }

    org.apache.ambari.server.state.ValueEntryInfo valueEntryInfo0 = new org.apache.ambari.server.state.ValueEntryInfo();
    valueEntryInfo0.setDescription("HostRoles/state");
    valueEntryInfo0.setDescription("OperatingSystems/version_definition_id");
    java.lang.String str5 = valueEntryInfo0.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test298"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getAlertEventPublisherPoolSize();
    org.apache.ambari.server.KdcServerConnectionVerification kdcServerConnectionVerification4 = new org.apache.ambari.server.KdcServerConnectionVerification(configuration0);
    java.lang.String str5 = configuration0.getCommonServicesPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test299"); }

    org.apache.ambari.server.agent.RecoveryReport recoveryReport0 = new org.apache.ambari.server.agent.RecoveryReport();
    org.apache.ambari.server.agent.ComponentRecoveryReport[] componentRecoveryReport_array1 = new org.apache.ambari.server.agent.ComponentRecoveryReport[] {  };
    java.util.ArrayList<org.apache.ambari.server.agent.ComponentRecoveryReport> arraylist_componentRecoveryReport2 = new java.util.ArrayList<org.apache.ambari.server.agent.ComponentRecoveryReport>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.agent.ComponentRecoveryReport>)arraylist_componentRecoveryReport2, componentRecoveryReport_array1);
    recoveryReport0.setComponentReports((java.util.List<org.apache.ambari.server.agent.ComponentRecoveryReport>)arraylist_componentRecoveryReport2);
    java.util.List<org.apache.ambari.server.agent.ComponentRecoveryReport> list_componentRecoveryReport5 = recoveryReport0.getComponentReports();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentRecoveryReport_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_componentRecoveryReport5);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test300"); }

    org.apache.ambari.server.bootstrap.SshHostInfo sshHostInfo0 = new org.apache.ambari.server.bootstrap.SshHostInfo();
    boolean b1 = sshHostInfo0.isVerbose();
    sshHostInfo0.setSshPort("QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test301"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition configurationCondition0 = new org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition();
    configurationCondition0.returnValueIfConfigMissing = false;

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test302"); }

    org.apache.ambari.server.customactions.ActionDefinitionSpec actionDefinitionSpec0 = new org.apache.ambari.server.customactions.ActionDefinitionSpec();

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test303"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    long long6 = configuration0.getPropertyProvidersCompletionServiceTimeout();
    java.lang.String str7 = configuration0.getWebAppDir();
    int i8 = configuration0.getClientSSLApiPort();
    java.util.Map<java.lang.String,java.lang.String> map_str_str9 = configuration0.getAmbariProperties();
    int i10 = configuration0.getViewRequestThreadPoolMaxSize();
    
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
    org.junit.Assert.assertTrue(i8 == 8443);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test304"); }

    org.apache.ambari.server.api.services.GroupService groupService0 = new org.apache.ambari.server.api.services.GroupService();
    org.apache.ambari.server.api.services.MemberService memberService2 = groupService0.getMemberHandler("");
    javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response6 = groupService0.deleteGroup(httpHeaders3, uriInfo4, "ViewInstanceInfo/version");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(memberService2);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test305"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher0 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener alertLifecycleListener1 = new org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener(ambariEventPublisher0);
    org.apache.ambari.server.events.AlertDefinitionRegistrationEvent alertDefinitionRegistrationEvent2 = null;
    // The following exception was thrown during execution in test generation
    try {
    alertLifecycleListener1.onAmbariEvent(alertDefinitionRegistrationEvent2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test306"); }

    org.apache.ambari.server.agent.CommandReport commandReport0 = new org.apache.ambari.server.agent.CommandReport();
    java.lang.String str1 = commandReport0.getStdErr();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test307"); }

    org.apache.ambari.server.state.action.ActionType actionType1 = null;
    org.apache.ambari.server.state.action.ActionId actionId2 = new org.apache.ambari.server.state.action.ActionId((long)5, actionType1);
    org.apache.ambari.server.state.action.ActionImpl actionImpl4 = new org.apache.ambari.server.state.action.ActionImpl(actionId2, 10L);
    org.apache.ambari.server.state.action.ActionInitEvent actionInitEvent6 = new org.apache.ambari.server.state.action.ActionInitEvent(actionId2, (long)500);
    org.apache.ambari.server.state.action.ActionProgressUpdateEvent actionProgressUpdateEvent8 = new org.apache.ambari.server.state.action.ActionProgressUpdateEvent(actionId2, (long)'4');
    org.apache.ambari.server.state.action.ActionEventType actionEventType9 = actionProgressUpdateEvent8.getType();
    org.junit.Assert.assertTrue("'" + actionEventType9 + "' != '" + org.apache.ambari.server.state.action.ActionEventType.ACTION_IN_PROGRESS + "'", actionEventType9.equals(org.apache.ambari.server.state.action.ActionEventType.ACTION_IN_PROGRESS));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test308"); }

    boolean b1 = org.apache.ambari.server.security.credential.PrincipalKeyCredential.isValidValue("Artifacts/stack_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test309"); }

    org.apache.ambari.server.api.services.RemoteClustersService remoteClustersService0 = new org.apache.ambari.server.api.services.RemoteClustersService();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = remoteClustersService0.getRemoteClusters(httpHeaders1, uriInfo2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test310"); }

    org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent serviceComponentHostUninstallEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent("host_groups", "value", (long)(byte)100);
    org.apache.ambari.server.actionmanager.ServiceComponentHostEventWrapper serviceComponentHostEventWrapper4 = new org.apache.ambari.server.actionmanager.ServiceComponentHostEventWrapper((org.apache.ambari.server.state.ServiceComponentHostEvent)serviceComponentHostUninstallEvent3);
    java.lang.String str5 = serviceComponentHostEventWrapper4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EventType: HOST_SVCCOMP_UNINSTALL"+ "'", str5.equals("EventType: HOST_SVCCOMP_UNINSTALL"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test311"); }

    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer transfer0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer();
    java.lang.String str1 = transfer0.defaultValue;
    transfer0.toKey = "Theme";
    org.apache.ambari.server.state.stack.upgrade.TransferOperation transferOperation4 = org.apache.ambari.server.state.stack.upgrade.TransferOperation.DELETE;
    transfer0.operation = transferOperation4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    org.junit.Assert.assertTrue("'" + transferOperation4 + "' != '" + org.apache.ambari.server.state.stack.upgrade.TransferOperation.DELETE + "'", transferOperation4.equals(org.apache.ambari.server.state.stack.upgrade.TransferOperation.DELETE));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test312"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties5);
    kerberosComponentDescriptor6.removeIdentity("1.3.6.1.4.1.18060.16.1.1.1.7");
    java.util.Collection<? extends org.apache.ambari.server.state.kerberos.AbstractKerberosDescriptorContainer> collection_wildcard9 = kerberosComponentDescriptor6.getChildContainers();
    org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type type10 = org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP;
    java.util.Map<java.lang.String,java.lang.String> map_str_str12 = null;
    org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] taskWrapper_array13 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.TaskWrapper> arraylist_taskWrapper14 = new java.util.ArrayList<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>)arraylist_taskWrapper14, taskWrapper_array13);
    org.apache.ambari.server.state.stack.upgrade.StageWrapper stageWrapper16 = new org.apache.ambari.server.state.stack.upgrade.StageWrapper(type10, "ranger-hbase-plugin-enabled", map_str_str12, (java.util.List<org.apache.ambari.server.state.stack.upgrade.TaskWrapper>)arraylist_taskWrapper14);
    java.util.Set<java.lang.String> set_str17 = stageWrapper16.getHosts();
    kerberosComponentDescriptor6.setAuthToLocalProperties(set_str17);
    
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
    org.junit.Assert.assertNull(collection_wildcard9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP + "'", type10.equals(org.apache.ambari.server.state.stack.upgrade.StageWrapper.Type.STOP));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(taskWrapper_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str17);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test313"); }

    org.apache.ambari.server.agent.HeartBeat heartBeat0 = new org.apache.ambari.server.agent.HeartBeat();
    java.lang.String str1 = heartBeat0.getHostname();
    org.apache.ambari.server.agent.HostStatus hostStatus2 = heartBeat0.getNodeStatus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hostStatus2);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test314"); }

    org.apache.ambari.server.stack.HostsType hostsType0 = new org.apache.ambari.server.stack.HostsType();
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str1 = hostsType0.hosts;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashset_str1);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test315"); }

    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator0 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression1 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator0);
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression2 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator0);
    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator3 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression4 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator3);
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression5 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator3);
    relationalExpression5.setLeftOperand("*:*");
    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator8 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression9 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator8);
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression10 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator8);
    java.util.List<org.apache.ambari.server.api.predicate.expressions.Expression> list_expression12 = relationalExpression2.merge((org.apache.ambari.server.api.predicate.expressions.Expression)relationalExpression5, (org.apache.ambari.server.api.predicate.expressions.Expression)relationalExpression10, (int)'#');
    java.lang.String str13 = relationalExpression2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_expression12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "RelationalExpression{ property='null', value='null', op=IsEmptyOperator }"+ "'", str13.equals("RelationalExpression{ property='null', value='null', op=IsEmptyOperator }"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test316"); }

    org.apache.ambari.server.controller.ShortTaskStatus shortTaskStatus9 = new org.apache.ambari.server.controller.ShortTaskStatus((int)(byte)0, (long)'a', "extensions", "metrics.properties", "PrivilegeInfo/principal_type", "ViewVersionInfo/max_ambari_version", "Tasks/custom_command_name", "TOPOLOGY_RESOLVED", "version_base64");

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test317"); }

    org.apache.ambari.server.audit.event.request.ClusterNameChangeRequestAuditEvent.ClusterNameChangeRequestAuditEventBuilder clusterNameChangeRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.ClusterNameChangeRequestAuditEvent.ClusterNameChangeRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.ClusterNameChangeRequestAuditEvent.ClusterNameChangeRequestAuditEventBuilder clusterNameChangeRequestAuditEventBuilder2 = clusterNameChangeRequestAuditEventBuilder0.withUrl("_internal_ambari");
    org.apache.ambari.server.audit.event.request.ClusterNameChangeRequestAuditEvent.ClusterNameChangeRequestAuditEventBuilder clusterNameChangeRequestAuditEventBuilder4 = clusterNameChangeRequestAuditEventBuilder0.withRemoteIp("version1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterNameChangeRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clusterNameChangeRequestAuditEventBuilder4);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test318"); }

    org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
    java.lang.String str1 = agentEnv0.getTransparentHugePage();
    java.lang.String[] str_array2 = agentEnv0.getExistingRepos();
    agentEnv0.setFirewallName("WidgetInfo/values");
    agentEnv0.setTransparentHugePage("ambari.dispatch.snmp.security.auth.passphrase");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test319"); }

    org.apache.ambari.server.notifications.dispatchers.EmailDispatcher emailDispatcher1 = new org.apache.ambari.server.notifications.dispatchers.EmailDispatcher();
    org.apache.ambari.server.configuration.Configuration configuration2 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str3 = configuration2.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file4 = configuration2.getRecommendationsDir();
    java.lang.String str5 = configuration2.getHostsMapFile();
    java.lang.Integer i6 = configuration2.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties7 = configuration2.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor8 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties7);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj9 = kerberosComponentDescriptor8.toMap();
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor10 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor(map_str_obj9);
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor11 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_str_obj9);
    org.apache.ambari.server.notifications.TargetConfigurationResult targetConfigurationResult12 = emailDispatcher1.validateTargetConfig(map_str_obj9);
    java.util.List<org.apache.ambari.server.controller.ConfigurationRequest> list_configurationRequest13 = org.apache.ambari.server.controller.internal.AbstractResourceProvider.getConfigurationRequests("Versions/extension-errors", map_str_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "nosniff"+ "'", str3.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 30000+ "'", i6.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(targetConfigurationResult12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_configurationRequest13);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test320"); }

    org.apache.ambari.server.orm.entities.HostGroupConfigEntityPK hostGroupConfigEntityPK0 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntityPK();
    boolean b2 = hostGroupConfigEntityPK0.equals((java.lang.Object)"Upgrade/abort_reason");
    hostGroupConfigEntityPK0.setHostGroupName("ViewInstanceInfo/view_name:type");
    java.lang.String str5 = hostGroupConfigEntityPK0.getHostGroupName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ViewInstanceInfo/view_name:type"+ "'", str5.equals("ViewInstanceInfo/view_name:type"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test321"); }

    org.apache.ambari.server.serveraction.ActionLog actionLog0 = new org.apache.ambari.server.serveraction.ActionLog();
    java.lang.String str1 = actionLog0.getStdErr();
    java.lang.String str2 = actionLog0.getStdOut();
    java.lang.String str3 = actionLog0.getStdErr();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test322"); }

    org.apache.ambari.server.actionmanager.Stage[] stage_array1 = new org.apache.ambari.server.actionmanager.Stage[] {  };
    java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage> arraylist_stage2 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>)arraylist_stage2, stage_array1);
    org.apache.ambari.server.actionmanager.RequestFactory requestFactory4 = null;
    org.apache.ambari.server.actionmanager.ActionManager actionManager5 = null;
    org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array9 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {  };
    java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter10 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter10, requestResourceFilter_array9);
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel12 = null;
    java.util.Map<java.lang.String,java.lang.String> map_str_str13 = null;
    org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest15 = new org.apache.ambari.server.controller.ExecuteActionRequest("MetricsRetrievalService [NEW]", "1.3.6.1.4.1.18060.16.1.1.1.7", "Tasks/custom_command_name", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>)arraylist_requestResourceFilter10, requestOperationLevel12, map_str_str13, false);
    java.lang.String str16 = executeActionRequest15.getActionName();
    java.lang.String str17 = executeActionRequest15.toString();
    java.lang.String str18 = executeActionRequest15.getClusterName();
    org.apache.ambari.server.controller.internal.RequestStageContainer requestStageContainer19 = new org.apache.ambari.server.controller.internal.RequestStageContainer((java.lang.Long)1L, (java.util.List<org.apache.ambari.server.actionmanager.Stage>)arraylist_stage2, requestFactory4, actionManager5, executeActionRequest15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stage_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestResourceFilter_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Tasks/custom_command_name"+ "'", str16.equals("Tasks/custom_command_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "isCommand :false, action :Tasks/custom_command_name, command :1.3.6.1.4.1.18060.16.1.1.1.7, inputs :{}, resourceFilters: [], exclusive: false, clusterName :MetricsRetrievalService [NEW]"+ "'", str17.equals("isCommand :false, action :Tasks/custom_command_name, command :1.3.6.1.4.1.18060.16.1.1.1.7, inputs :{}, resourceFilters: [], exclusive: false, clusterName :MetricsRetrievalService [NEW]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "MetricsRetrievalService [NEW]"+ "'", str18.equals("MetricsRetrievalService [NEW]"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test323"); }

    org.apache.ambari.server.controller.logging.LogFileDefinitionInfo logFileDefinitionInfo0 = new org.apache.ambari.server.controller.logging.LogFileDefinitionInfo();

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test324"); }

    java.lang.String str0 = org.apache.ambari.server.agent.RecoveryConfigHelper.RECOVERY_TYPE_DEFAULT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AUTO_START"+ "'", str0.equals("AUTO_START"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test325"); }

    org.apache.ambari.server.audit.event.TaskStatusAuditEvent.TaskStatusAuditEventBuilder taskStatusAuditEventBuilder0 = org.apache.ambari.server.audit.event.TaskStatusAuditEvent.builder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(taskStatusAuditEventBuilder0);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test326"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.STACK_SERVICE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ThemeInfo/service_name"+ "'", str0.equals("ThemeInfo/service_name"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test327"); }

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
    java.util.LinkedHashSet<java.util.Map<java.lang.String,java.lang.Object>> linkedhashset_map_str_obj11 = new java.util.LinkedHashSet<java.util.Map<java.lang.String,java.lang.Object>>();
    boolean b12 = linkedhashset_map_str_obj11.add(map_str_obj7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.internal.ScaleClusterRequest scaleClusterRequest13 = new org.apache.ambari.server.controller.internal.ScaleClusterRequest((java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>)linkedhashset_map_str_obj11);
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
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test328"); }

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
    stackConfigurationResponse12.setPropertyDescription("ERROR");
    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo19 = null;
    stackConfigurationResponse12.setPropertyValueAttributes(valueAttributesInfo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyDependencyInfo_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_propertyType15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ERROR"+ "'", str16.equals("ERROR"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test329"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity,java.lang.String> singularattribute_alertDefinitionEntity_str0 = null;
    org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.label = singularattribute_alertDefinitionEntity_str0;

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test330"); }

    org.apache.ambari.server.topology.AmbariContext ambariContext0 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody1 = new org.apache.ambari.server.api.services.RequestBody();
    java.util.Set<java.util.Map<java.lang.String,java.lang.Object>> set_map_str_obj2 = requestBody1.getPropertySets();
    org.apache.ambari.server.controller.internal.ScaleClusterRequest scaleClusterRequest3 = new org.apache.ambari.server.controller.internal.ScaleClusterRequest(set_map_str_obj2);
    java.lang.Long long4 = scaleClusterRequest3.getClusterId();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.topology.ClusterTopologyImpl clusterTopologyImpl5 = new org.apache.ambari.server.topology.ClusterTopologyImpl(ambariContext0, (org.apache.ambari.server.topology.TopologyRequest)scaleClusterRequest3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_map_str_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long4);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test331"); }

    org.apache.ambari.server.controller.StackRequest stackRequest1 = new org.apache.ambari.server.controller.StackRequest("alerts.json");

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test332"); }

    org.apache.ambari.server.security.SignCertResponse signCertResponse0 = new org.apache.ambari.server.security.SignCertResponse();

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test333"); }

    org.apache.ambari.server.checks.YarnTimelineServerStatePreservingCheck yarnTimelineServerStatePreservingCheck0 = new org.apache.ambari.server.checks.YarnTimelineServerStatePreservingCheck();

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test334"); }

    org.apache.ambari.server.state.stack.WidgetLayout widgetLayout0 = new org.apache.ambari.server.state.stack.WidgetLayout();
    java.lang.String str1 = widgetLayout0.getSectionName();
    widgetLayout0.setLayoutName("stack_versions");
    java.lang.String str4 = widgetLayout0.getLayoutName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "stack_versions"+ "'", str4.equals("stack_versions"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test335"); }

    org.apache.ambari.server.api.predicate.operators.IsEmptyOperator isEmptyOperator0 = new org.apache.ambari.server.api.predicate.operators.IsEmptyOperator();
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression1 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)isEmptyOperator0);
    java.lang.String str2 = relationalExpression1.getRightOperand();
    java.lang.String str3 = relationalExpression1.getLeftOperand();
    java.lang.String str4 = relationalExpression1.getRightOperand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test336"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.WidgetResourceProvider widgetResourceProvider1 = new org.apache.ambari.server.controller.internal.WidgetResourceProvider(ambariManagementController0);
    org.apache.ambari.server.controller.spi.Request request2 = null;
    org.apache.ambari.server.controller.spi.Predicate predicate3 = null;
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus4 = widgetResourceProvider1.deleteResources(request2, predicate3);
    org.apache.ambari.server.controller.internal.SimplifyingPredicateVisitor simplifyingPredicateVisitor5 = new org.apache.ambari.server.controller.internal.SimplifyingPredicateVisitor((org.apache.ambari.server.controller.spi.ResourceProvider)widgetResourceProvider1);
    org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate categoryIsEmptyPredicate7 = new org.apache.ambari.server.controller.predicate.CategoryIsEmptyPredicate("AlertHistory/definition_name");
    simplifyingPredicateVisitor5.acceptCategoryPredicate((org.apache.ambari.server.controller.predicate.CategoryPredicate)categoryIsEmptyPredicate7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(requestStatus4);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test337"); }

    org.apache.ambari.server.hooks.users.PostUserCreationHookContext postUserCreationHookContext1 = new org.apache.ambari.server.hooks.users.PostUserCreationHookContext("RepositoryVersions/display_name");
    java.util.Map<java.lang.String,java.util.Set<java.lang.String>> map_str_set_str2 = postUserCreationHookContext1.getUserGroups();
    org.apache.ambari.server.hooks.users.UserCreatedEvent userCreatedEvent3 = new org.apache.ambari.server.hooks.users.UserCreatedEvent((org.apache.ambari.server.hooks.HookContext)postUserCreationHookContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_set_str2);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test338"); }

    org.apache.ambari.server.controller.ActionRequest actionRequest8 = new org.apache.ambari.server.controller.ActionRequest("VersionDefinition/stack_name", "ViewInstanceInfo/properties", "nosniff", "CompatibleRepositoryVersions/stack_name", "evaluate_when", "ambari.dispatch-property.script", "Stage/display_status", "");
    actionRequest8.setTargetService("default_realm");
    actionRequest8.setActionType("yarn.scheduler.capacity.root.queues");
    actionRequest8.setTargetService("max_duration_for_retries");

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test339"); }

    org.apache.ambari.server.orm.dao.StackDAO stackDAO0 = new org.apache.ambari.server.orm.dao.StackDAO();
    org.apache.ambari.server.orm.entities.StackEntity stackEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    stackDAO0.create(stackEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test340"); }

    org.apache.ambari.server.api.query.render.AlertSummaryGroupedRenderer alertSummaryGroupedRenderer0 = new org.apache.ambari.server.api.query.render.AlertSummaryGroupedRenderer();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS1 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus2 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS1);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = resultStatus2.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS4 = resultStatus2.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl5 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus2);
    org.apache.ambari.server.api.services.ResultMetadata resultMetadata6 = null;
    resultImpl5.setResultMetadata(resultMetadata6);
    org.apache.ambari.server.api.services.Result result8 = alertSummaryGroupedRenderer0.finalizeResult((org.apache.ambari.server.api.services.Result)resultImpl5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(result8);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test341"); }

    org.apache.ambari.server.notifications.dispatchers.EmailDispatcher emailDispatcher0 = new org.apache.ambari.server.notifications.dispatchers.EmailDispatcher();
    java.lang.String str1 = emailDispatcher0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "EMAIL"+ "'", str1.equals("EMAIL"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test342"); }

    org.apache.ambari.server.state.ExtensionId extensionId2 = new org.apache.ambari.server.state.ExtensionId("1.3.6.1.4.1.18060.16", "StackConfigurations/property_name");
    java.lang.String str3 = extensionId2.getExtensionVersion();
    org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer transfer4 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Transfer();
    boolean b5 = extensionId2.equals((java.lang.Object)transfer4);
    java.lang.String str6 = transfer4.ifKey;
    transfer4.defaultValue = "Clusters/cluster_name";
    org.apache.ambari.server.state.stack.upgrade.TransferCoercionType transferCoercionType9 = null;
    transfer4.coerceTo = transferCoercionType9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StackConfigurations/property_name"+ "'", str3.equals("StackConfigurations/property_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test343"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CREDENTIALS_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "credentials"+ "'", str0.equals("credentials"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test344"); }

    org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteCheckConfig prerequisiteCheckConfig0 = new org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteCheckConfig();

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test345"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity,java.lang.Long> singularattribute_hostEntity_long0 = org.apache.ambari.server.orm.entities.HostEntity_.lastRegistrationTime;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostEntity_long0);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test346"); }

    org.apache.ambari.server.api.predicate.QueryParser queryParser0 = new org.apache.ambari.server.api.predicate.QueryParser();

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test347"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    actionResponse8.setInputs("ViewUrlInfo/view_instance_version");
    actionResponse8.setActionType("StackLevelConfigurations/property_depends_on");

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test348"); }

    org.apache.ambari.server.audit.event.LoginAuditEvent.LoginAuditEventBuilder loginAuditEventBuilder0 = org.apache.ambari.server.audit.event.LoginAuditEvent.builder();
    org.apache.ambari.server.audit.event.LoginAuditEvent.LoginAuditEventBuilder loginAuditEventBuilder2 = loginAuditEventBuilder0.withRemoteIp("ACTION_NAME");
    org.apache.ambari.server.audit.event.LoginAuditEvent.LoginAuditEventBuilder loginAuditEventBuilder4 = loginAuditEventBuilder0.withReasonOfFailure("stack_tools");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(loginAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(loginAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(loginAuditEventBuilder4);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test349"); }

    org.apache.ambari.server.controller.utilities.LoginContextHelper loginContextHelper0 = new org.apache.ambari.server.controller.utilities.LoginContextHelper();
    javax.security.auth.callback.CallbackHandler callbackHandler2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.security.auth.login.LoginContext loginContext3 = loginContextHelper0.createLoginContext("blueprint_setting", callbackHandler2);
      org.junit.Assert.fail("Expected exception of type javax.security.auth.login.LoginException");
    } catch (javax.security.auth.login.LoginException e) {
      // Expected exception.
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test350"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.security.ClientSecurityType clientSecurityType7 = org.apache.ambari.server.security.ClientSecurityType.fromString("UpgradeChecks/id");
    configuration0.setClientSecurityType(clientSecurityType7);
    java.lang.String str9 = configuration0.getNodeRecoveryLifetimeMaxCount();
    java.lang.String str10 = configuration0.getDatabasePassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "bigdata"+ "'", str10.equals("bigdata"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test351"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.INSTANCE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/instance_name"+ "'", str0.equals("ViewInstanceInfo/instance_name"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test352"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    org.apache.ambari.server.utils.RetryHelper.init((org.apache.ambari.server.state.Clusters)clustersImpl4, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = clustersImpl4.checkPermission("AlertHistory/cluster_name", false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test353"); }

    org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.ActivateUserRequestAuditEventBuilder activateUserRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder1 = org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder3 = addAlertGroupRequestAuditEventBuilder1.withName("ViewInstanceInfo/view_name");
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder5 = addAlertGroupRequestAuditEventBuilder1.withRemoteIp("alerts.json");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS6 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus7 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS6);
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder8 = addAlertGroupRequestAuditEventBuilder5.withResultStatus(resultStatus7);
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder9 = new org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder10 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder11 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder12 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
    javax.ws.rs.core.HttpHeaders httpHeaders13 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody14 = null;
    javax.ws.rs.core.UriInfo uriInfo15 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance16 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest17 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders13, requestBody14, uriInfo15, resourceInstance16);
    int i18 = postRequest17.getAPIVersion();
    org.apache.ambari.server.api.services.Request.Type type19 = postRequest17.getRequestType();
    org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder20 = addUserToGroupRequestAuditEventBuilder12.withRequestType(type19);
    org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder21 = deleteRepositoryVersionAuditEventBuilder11.withRequestType(type19);
    org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder22 = userPasswordChangeRequestAuditEventBuilder10.withRequestType(type19);
    org.apache.ambari.server.audit.event.request.ChangeAlertTargetRequestAuditEvent.ChangeAlertTargetRequestAuditEventBuilder changeAlertTargetRequestAuditEventBuilder23 = changeAlertTargetRequestAuditEventBuilder9.withRequestType(type19);
    org.apache.ambari.server.audit.event.request.AddAlertGroupRequestAuditEvent.AddAlertGroupRequestAuditEventBuilder addAlertGroupRequestAuditEventBuilder24 = addAlertGroupRequestAuditEventBuilder5.withRequestType(type19);
    org.apache.ambari.server.audit.event.request.ActivateUserRequestAuditEvent.ActivateUserRequestAuditEventBuilder activateUserRequestAuditEventBuilder25 = activateUserRequestAuditEventBuilder0.withRequestType(type19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(activateUserRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.ambari.server.api.services.Request.Type.POST + "'", type19.equals(org.apache.ambari.server.api.services.Request.Type.POST));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeAlertTargetRequestAuditEventBuilder23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addAlertGroupRequestAuditEventBuilder24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(activateUserRequestAuditEventBuilder25);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test354"); }

    org.apache.ambari.server.state.stack.UpgradePack.ProcessingService processingService0 = new org.apache.ambari.server.state.stack.UpgradePack.ProcessingService();
    java.lang.String str1 = processingService0.name;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test355"); }

    org.apache.ambari.server.state.alert.PortSource portSource0 = new org.apache.ambari.server.state.alert.PortSource();
    java.lang.String str1 = portSource0.getUri();
    org.apache.ambari.server.state.alert.Reporting reporting2 = null;
    portSource0.setReporting(reporting2);
    org.apache.ambari.server.state.alert.Reporting reporting4 = portSource0.getReporting();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reporting4);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test356"); }

    org.apache.ambari.server.controller.WidgetResponse widgetResponse0 = new org.apache.ambari.server.controller.WidgetResponse();
    java.lang.String str1 = widgetResponse0.getAuthor();
    java.lang.String str2 = widgetResponse0.getDisplayName();
    java.lang.String str3 = widgetResponse0.getClusterName();
    widgetResponse0.setScope("HostComponentProcess/host_name");
    java.lang.String str6 = widgetResponse0.getClusterName();
    widgetResponse0.setTimeCreated((java.lang.Long)300000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test357"); }

    org.apache.ambari.server.agent.HostInfo hostInfo0 = new org.apache.ambari.server.agent.HostInfo();
    hostInfo0.setOS("clusterHostInfo");
    java.lang.String str3 = hostInfo0.getDomain();
    java.lang.String str4 = hostInfo0.getAgentUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test358"); }

    org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric gangliaMetric0 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric();
    java.lang.Number[] number_array1 = new java.lang.Number[] {  };
    java.lang.Number[] number_array2 = new java.lang.Number[] {  };
    java.lang.Number[] number_array3 = new java.lang.Number[] {  };
    java.lang.Number[] number_array4 = new java.lang.Number[] {  };
    java.lang.Number[] number_array5 = new java.lang.Number[] {  };
    java.lang.Number[][] number_array_array6 = new java.lang.Number[][] { number_array1, number_array2, number_array3, number_array4, number_array5 };
    gangliaMetric0.setDatapoints(number_array_array6);
    org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric gangliaMetric8 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric();
    java.lang.Number[] number_array9 = new java.lang.Number[] {  };
    java.lang.Number[] number_array10 = new java.lang.Number[] {  };
    java.lang.Number[] number_array11 = new java.lang.Number[] {  };
    java.lang.Number[] number_array12 = new java.lang.Number[] {  };
    java.lang.Number[] number_array13 = new java.lang.Number[] {  };
    java.lang.Number[][] number_array_array14 = new java.lang.Number[][] { number_array9, number_array10, number_array11, number_array12, number_array13 };
    gangliaMetric8.setDatapoints(number_array_array14);
    gangliaMetric0.setDatapoints(number_array_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(number_array_array14);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test359"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_SERVICE_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/service_name"+ "'", str0.equals("HostRoles/service_name"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test360"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel5 = new org.apache.ambari.server.controller.internal.RequestOperationLevel(type0, "PermissionInfo/permission_id", "StackConfigurations/stack_version", "Transfer{operation=null, fromType='null', fromKey='null', toKey='null', deleteKey='null', preserveEdits=false, defaultValue='null', coerceTo=null, ifKey='null', ifType='null', ifValue='null', ifKeyState='null', keepKeys=[]}", ".FILTER");

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test361"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CHECK_REMOTE_MOUNTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test362"); }

    org.apache.ambari.server.state.stack.upgrade.ClusterGrouping.ExecuteStage executeStage0 = new org.apache.ambari.server.state.stack.upgrade.ClusterGrouping.ExecuteStage();
    java.lang.String str1 = executeStage0.service;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test363"); }

    org.apache.ambari.server.controller.StackServiceComponentRequest stackServiceComponentRequest4 = new org.apache.ambari.server.controller.StackServiceComponentRequest("StackConfigurations/property_name", "privilege", "phoenix.query.keepAliveMs", "common-services");

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test364"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse recommendationResponse0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse();
    recommendationResponse0.setId(1200);
    java.lang.String[] str_array21 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent24 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str22);
    org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str22;
    org.apache.ambari.server.controller.spi.Request request26 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest((java.util.Set<java.lang.String>)linkedhashset_str22);
    recommendationResponse0.setServices((java.util.Set<java.lang.String>)linkedhashset_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request26);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test365"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    boolean b2 = configuration0.validateAgentHostnames();
    java.util.Map<java.lang.String,java.lang.String> map_str_str3 = configuration0.getDatabaseConnectorNames();
    int i4 = configuration0.getViewRequestThreadPoolTimeout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2000);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test366"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_CREDENTIAL_STORE_PROPERTIES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/credential_store_properties"+ "'", str0.equals("Clusters/credential_store_properties"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test367"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.HOOKS_FOLDER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hooks_folder"+ "'", str0.equals("hooks_folder"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test368"); }

    org.apache.ambari.server.api.predicate.operators.FilterOperator filterOperator0 = new org.apache.ambari.server.api.predicate.operators.FilterOperator();
    org.apache.ambari.server.controller.spi.Predicate predicate3 = filterOperator0.toPredicate("StackLevelConfigurations/final", "RootServiceHostComponents/component_version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate3);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test369"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
    org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider ldapSyncEventResourceProvider1 = new org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider(ambariManagementController0);
    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str2 = ldapSyncEventResourceProvider1.getKeyPropertyIds();
    org.apache.ambari.server.api.services.RepositoryVersionService repositoryVersionService3 = new org.apache.ambari.server.api.services.RepositoryVersionService(map_type_str2);
    javax.ws.rs.core.HttpHeaders httpHeaders5 = null;
    javax.ws.rs.core.UriInfo uriInfo6 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response7 = repositoryVersionService3.createRepositoryVersion("authenticated_user_name", httpHeaders5, uriInfo6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str2);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test370"); }

    org.apache.ambari.server.controller.ExtensionLinkRequest extensionLinkRequest5 = new org.apache.ambari.server.controller.ExtensionLinkRequest("QuickLinkInfo/default", "EqualsOperator", "timeline.metrics.cluster.aggregator.minute.ttl", "ambari.dispatch.snmp.security.auth.passphrase", "upgrade_type");

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test371"); }

    java.lang.String str0 = org.apache.ambari.server.controller.AmbariServer.VIEWS_URL_PATTERN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/api/v1/views/*"+ "'", str0.equals("/api/v1/views/*"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test372"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsPragmaHTTPResponseHeader();
    int i2 = configuration0.getVersionDefinitionConnectTimeout();
    java.lang.String str3 = configuration0.getViewsXXSSProtectionHTTPResponseHeader();
    boolean b4 = configuration0.isLdapAlternateUserSearchEnabled();
    java.util.List<java.lang.String> list_str5 = configuration0.getStackUpgradeAutoRetryCustomCommandNamesToIgnore();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no-cache"+ "'", str1.equals("no-cache"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1; mode=block"+ "'", str3.equals("1; mode=block"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test373"); }

    org.apache.ambari.server.api.resources.ViewVersionResourceDefinition viewVersionResourceDefinition0 = new org.apache.ambari.server.api.resources.ViewVersionResourceDefinition();
    java.lang.String str1 = viewVersionResourceDefinition0.getSingularName();
    java.lang.String str2 = viewVersionResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "version"+ "'", str1.equals("version"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "version"+ "'", str2.equals("version"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test374"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionVersionResourceProvider.EXTENSION_VALID_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/valid"+ "'", str0.equals("Versions/valid"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test375"); }

    org.apache.ambari.server.state.ComponentInfo componentInfo0 = new org.apache.ambari.server.state.ComponentInfo();
    org.apache.ambari.server.stack.ComponentModule componentModule1 = new org.apache.ambari.server.stack.ComponentModule(componentInfo0);
    boolean b2 = componentInfo0.isRecoveryEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test376"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.BOOTSTRAP_SCRIPT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test377"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.SUBRESOURCE_REPOSITORIES_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "repositories"+ "'", str0.equals("repositories"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test378"); }

    org.apache.ambari.server.api.services.PersistKeyValueService persistKeyValueService0 = new org.apache.ambari.server.api.services.PersistKeyValueService();
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response2 = persistKeyValueService0.update("StackConfigurations/property_type");
      org.junit.Assert.fail("Expected exception of type org.codehaus.jackson.JsonParseException");
    } catch (org.codehaus.jackson.JsonParseException e) {
      // Expected exception.
    }

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test379"); }

    org.apache.ambari.server.orm.entities.RoleSuccessCriteriaEntityPK roleSuccessCriteriaEntityPK0 = new org.apache.ambari.server.orm.entities.RoleSuccessCriteriaEntityPK();
    roleSuccessCriteriaEntityPK0.setRequestId((java.lang.Long)10000L);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test380"); }

    org.apache.ambari.server.controller.StackServiceRequest stackServiceRequest3 = new org.apache.ambari.server.controller.StackServiceRequest("Request_Info/asc_order", "Request_Info/asc_order", "stack_name");
    stackServiceRequest3.setStackName("Artifacts/artifact_name");
    stackServiceRequest3.setCredentialStoreEnabled("Transfer{operation=null, fromType='null', fromKey='null', toKey='null', deleteKey='null', preserveEdits=false, defaultValue='null', coerceTo=null, ifKey='null', ifType='null', ifValue='null', ifKeyState='null', keepKeys=[]}");

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test381"); }

    org.apache.ambari.server.api.services.HostKerberosIdentityService hostKerberosIdentityService2 = new org.apache.ambari.server.api.services.HostKerberosIdentityService("Upgrade/abort_reason", "ThemeInfo/stack_version");
    javax.ws.rs.core.HttpHeaders httpHeaders4 = null;
    javax.ws.rs.core.UriInfo uriInfo5 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response8 = hostKerberosIdentityService2.getKerberosIdentity("", httpHeaders4, uriInfo5, "HostRoles/hdp_version", "EventType: HOST_SVCCOMP_UNINSTALL");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test382"); }

    org.apache.ambari.server.orm.dao.PermissionDAO permissionDAO0 = null;
    org.apache.ambari.server.controller.internal.PermissionResourceProvider.init(permissionDAO0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test383"); }

    org.apache.ambari.server.controller.ActionRequest actionRequest8 = new org.apache.ambari.server.controller.ActionRequest("VersionDefinition/stack_name", "ViewInstanceInfo/properties", "nosniff", "CompatibleRepositoryVersions/stack_name", "evaluate_when", "ambari.dispatch-property.script", "Stage/display_status", "");
    java.lang.String str9 = actionRequest8.getActionType();
    java.lang.String str10 = actionRequest8.getTargetService();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ViewInstanceInfo/properties"+ "'", str9.equals("ViewInstanceInfo/properties"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "CompatibleRepositoryVersions/stack_name"+ "'", str10.equals("CompatibleRepositoryVersions/stack_name"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test384"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity,java.lang.String> singularattribute_hostRoleCommandEntity_str0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.status;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_str0);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test385"); }

    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder();
    org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder2 = blueprintExportRequestAuditEventBuilder0.withOperation("Clusters/version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder2);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test386"); }

    org.apache.ambari.server.audit.event.kerberos.ChangeSecurityStateKerberosAuditEvent.ChangeSecurityStateKerberosAuditEventBuilder changeSecurityStateKerberosAuditEventBuilder0 = org.apache.ambari.server.audit.event.kerberos.ChangeSecurityStateKerberosAuditEvent.builder();
    org.apache.ambari.server.audit.event.kerberos.ChangeSecurityStateKerberosAuditEvent.ChangeSecurityStateKerberosAuditEventBuilder changeSecurityStateKerberosAuditEventBuilder2 = changeSecurityStateKerberosAuditEventBuilder0.withHostName("ambari.dispatch.snmp.community");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeSecurityStateKerberosAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(changeSecurityStateKerberosAuditEventBuilder2);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test387"); }

    org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo1 = null;
    org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider7 = new org.apache.ambari.server.controller.internal.URLStreamProvider(1200, (-1), "ambari.dispatch.snmp.security.priv.passphrase", "OperatingSystems/version_definition_id", "timeline.metrics.cluster.aggregator.minute.ttl");
    org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration8 = null;
    org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider timelineMetricCacheProvider9 = null;
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule10 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.controller.internal.ClusterControllerImpl clusterControllerImpl11 = new org.apache.ambari.server.controller.internal.ClusterControllerImpl((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule10);
    org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule12 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
    org.apache.ambari.server.view.ViewProviderModule viewProviderModule13 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule((org.apache.ambari.server.controller.spi.ProviderModule)defaultProviderModule12);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.metrics.MetricsPropertyProviderProxy metricsPropertyProviderProxy17 = org.apache.ambari.server.controller.metrics.MetricsPropertyProvider.createInstance(type0, map_str_map_str_propertyInfo1, uRLStreamProvider7, componentSSLConfiguration8, timelineMetricCacheProvider9, (org.apache.ambari.server.controller.metrics.MetricHostProvider)defaultProviderModule10, (org.apache.ambari.server.controller.metrics.MetricsServiceProvider)defaultProviderModule12, "ViewVersionInfo/archive", "processes", "HostRoles/hdp_version");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(viewProviderModule13);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test388"); }

    org.snmp4j.Snmp snmp0 = null;
    org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher sNMPDispatcher1 = new org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher(snmp0);
    boolean b2 = sNMPDispatcher1.isNotificationContentGenerationRequired();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test389"); }

    java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ServiceCheckTask.actionVerb;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Running"+ "'", str0.equals("Running"));

  }

  @Test
  public void test390() throws Throwable {

    // if (debug) { System.out.format("%n%s%n","RegressionTest5.test390"); }

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
    // upgradeContext4.setComponentDisplay("ambari_db_rca_driver", "hdfs-site", "configurations");
    // org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo15 = null;
    // upgradeContext4.setAmbariMetaInfo(ambariMetaInfo15);
    // org.apache.ambari.server.stack.MasterHostResolver masterHostResolver17 = upgradeContext4.getResolver();
    // org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType18 = upgradeContext4.getType();
    // org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNotNull(serviceComponentHost_array7);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertTrue(b9 == false);
    
    // // Regression assertion (captures the current behavior of the code)
    // org.junit.Assert.assertNull(masterHostResolver17);
    // org.junit.Assert.assertTrue("'" + upgradeType18 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED + "'", upgradeType18.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.HOST_ORDERED));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test391"); }

    org.apache.ambari.server.controller.StackLevelConfigurationRequest stackLevelConfigurationRequest3 = new org.apache.ambari.server.controller.StackLevelConfigurationRequest("evaluate_when", "hostComponent", "hdfs-site");

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test392"); }

    org.apache.ambari.server.actionmanager.ActionType actionType1 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType6 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array8 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization9 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9, roleAuthorization_array8);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition11 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType1, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType6, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization9);
    actionDefinition11.setTargetService("AlertTarget/notification_type");
    actionDefinition11.setDefaultTimeout((java.lang.Short)(short)0);
    actionDefinition11.setTargetComponent("ViewInstanceInfo/icon64_path");
    java.lang.String str18 = actionDefinition11.getActionName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "forceRefreshConfigTagsBeforeExecution"+ "'", str18.equals("forceRefreshConfigTagsBeforeExecution"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test393"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str3 = valueAttributesInfo0.getIncrementStep();
    valueAttributesInfo0.setDelete("operation");
    valueAttributesInfo0.setSelectionCardinality("Credential/key");
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)false);
    valueAttributesInfo0.setOverridable((java.lang.Boolean)false);
    valueAttributesInfo0.setMaximum("Requests/request_schedule");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test394"); }

    org.apache.ambari.server.controller.spi.Resource[] resource_array0 = new org.apache.ambari.server.controller.spi.Resource[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource1 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1, resource_array0);
    org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl6 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>)linkedhashset_resource1, true, false, (int)'#');
    boolean b7 = queryResponseImpl6.isSortedResponse();
    boolean b8 = queryResponseImpl6.isPagedResponse();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test395"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = null;
    org.apache.ambari.server.api.services.RepositoryService repositoryService1 = new org.apache.ambari.server.api.services.RepositoryService(map_type_str0);
    javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
    javax.ws.rs.core.UriInfo uriInfo4 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response5 = repositoryService1.createRepository("1.3.6.1.4.1.18060.16.1.1.1.2", httpHeaders3, uriInfo4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test396"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyResponse stackConfigurationDependencyResponse2 = new org.apache.ambari.server.controller.StackConfigurationDependencyResponse("widgets.json", "widgets.json");
    stackConfigurationDependencyResponse2.setDependencyName("java.security.auth.login.config");
    stackConfigurationDependencyResponse2.setDependencyName("EMAIL");

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test397"); }

    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup configGroup0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup();
    java.util.List<java.lang.String> list_str1 = configGroup0.getHosts();
    java.util.Map<java.lang.String,org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintConfigurations> map_str_blueprintConfigurations2 = configGroup0.getConfigurations();
    org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup configGroup3 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup();
    java.util.List<java.lang.String> list_str4 = configGroup3.getHosts();
    java.util.Map<java.lang.String,org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintConfigurations> map_str_blueprintConfigurations5 = configGroup3.getConfigurations();
    configGroup0.setConfigurations(map_str_blueprintConfigurations5);
    java.util.List<java.lang.String> list_str7 = org.apache.ambari.server.controller.utilities.PropertyHelper.AGGREGATE_FUNCTION_IDENTIFIERS;
    configGroup0.setHosts(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_blueprintConfigurations2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_blueprintConfigurations5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test398"); }

    org.apache.ambari.server.topology.HostGroupInfo hostGroupInfo1 = new org.apache.ambari.server.topology.HostGroupInfo("1.3.6.1.4.1.18060.16.1.1.1.8");

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test399"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setSyncGroupMemberReplacePattern("AlertTarget/notification_type");
    java.util.List<java.lang.String> list_str3 = ldapServerProperties0.getLdapUrls();
    org.apache.ambari.server.controller.spi.Resource.Type type4 = null;
    org.apache.ambari.server.api.resources.OperatingSystemResourceDefinition operatingSystemResourceDefinition5 = new org.apache.ambari.server.api.resources.OperatingSystemResourceDefinition(type4);
    boolean b6 = ldapServerProperties0.equals((java.lang.Object)operatingSystemResourceDefinition5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test400"); }

    org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.MembershipChangeRequestAuditEvent.builder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test401"); }

    org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider viewPermissionResourceProvider0 = new org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider();
    java.util.Set<java.lang.String> set_str1 = viewPermissionResourceProvider0.getCategoryIds();
    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider3 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController2);
    java.lang.String[] str_array6 = new java.lang.String[] { "host_group", "queues" };
    org.apache.ambari.server.controller.spi.Request request7 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array6);
    org.apache.ambari.server.controller.spi.Request request8 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(str_array6);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate11 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.controller.spi.Predicate predicate12 = null;
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array13 = new org.apache.ambari.server.controller.spi.Predicate[] { predicate12 };
    org.apache.ambari.server.controller.spi.Predicate predicate14 = org.apache.ambari.server.controller.predicate.AndPredicate.instance(predicate_array13);
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate15 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array13);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate18 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate21 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    org.apache.ambari.server.controller.spi.Predicate[] predicate_array22 = new org.apache.ambari.server.controller.spi.Predicate[] { filterPredicate11, andPredicate15, filterPredicate18, filterPredicate21 };
    org.apache.ambari.server.controller.predicate.AndPredicate andPredicate23 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array22);
    org.apache.ambari.server.actionmanager.ActionType actionType25 = null;
    org.apache.ambari.server.actionmanager.TargetHostType targetHostType30 = null;
    org.apache.ambari.server.security.authorization.RoleAuthorization[] roleAuthorization_array32 = new org.apache.ambari.server.security.authorization.RoleAuthorization[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization> linkedhashset_roleAuthorization33 = new java.util.LinkedHashSet<org.apache.ambari.server.security.authorization.RoleAuthorization>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization33, roleAuthorization_array32);
    org.apache.ambari.server.customactions.ActionDefinition actionDefinition35 = new org.apache.ambari.server.customactions.ActionDefinition("forceRefreshConfigTagsBeforeExecution", actionType25, "PrivilegeInfo/privilege_id", "WidgetLayoutInfo/section_name", "Repositories/latest_base_url", "stack_name", targetHostType30, (java.lang.Short)(short)100, (java.util.Set<org.apache.ambari.server.security.authorization.RoleAuthorization>)linkedhashset_roleAuthorization33);
    boolean b36 = andPredicate23.equals((java.lang.Object)(short)100);
    org.apache.ambari.server.controller.spi.Predicate predicate37 = null;
    java.util.Map<org.apache.ambari.server.controller.spi.Resource,java.util.Set<java.util.Map<java.lang.String,java.lang.Object>>> map_resource_set_map_str_obj38 = null;
    org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor39 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj38);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit(predicate37, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor39);
    org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate41 = null;
    extendedResourcePredicateVisitor39.acceptUnaryPredicate(unaryPredicate41);
    org.apache.ambari.server.controller.utilities.PredicateHelper.visit((org.apache.ambari.server.controller.spi.Predicate)andPredicate23, (org.apache.ambari.server.controller.predicate.PredicateVisitor)extendedResourcePredicateVisitor39);
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource44 = compatibleRepositoryVersionResourceProvider3.getResources(request8, (org.apache.ambari.server.controller.spi.Predicate)andPredicate23);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate47 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Credential/key", "Credential/key");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.controller.spi.RequestStatus requestStatus48 = viewPermissionResourceProvider0.updateResources(request8, (org.apache.ambari.server.controller.spi.Predicate)filterPredicate47);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(predicate14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(predicate_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(roleAuthorization_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_resource44);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test402"); }

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
    java.lang.String str15 = configuration5.getNodeRecoveryWindowInMin();
    int i16 = configuration5.getViewExtractionThreadPoolMaxSize();
    
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
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 20);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test403"); }

    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse7 = new org.apache.ambari.server.controller.RepositoryResponse("Actions/target_service", "1.3.6.1.4.1.18060.16", "PermissionInfo/permission_name", "Versions/valid", "StackConfigurations/property_name", "QuickLinkInfo/default", "RUNNING");
    java.lang.String str8 = repositoryResponse7.getDefaultBaseUrl();
    java.lang.String str9 = repositoryResponse7.getRepoName();
    repositoryResponse7.setBaseUrl("stack_tools");
    java.lang.Long long12 = repositoryResponse7.getRepositoryVersionId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "QuickLinkInfo/default"+ "'", str8.equals("QuickLinkInfo/default"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Versions/valid"+ "'", str9.equals("Versions/valid"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long12);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test404"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getMetricsServiceThreadPriority();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 5);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test405"); }

    org.apache.ambari.server.state.scheduler.Batch batch4 = null;
    org.apache.ambari.server.state.scheduler.Schedule schedule5 = null;
    org.apache.ambari.server.controller.RequestScheduleRequest requestScheduleRequest6 = new org.apache.ambari.server.controller.RequestScheduleRequest((java.lang.Long)5000L, "target_stack", "Extensions/extension_name", "Tasks/end_time", batch4, schedule5);
    org.apache.ambari.server.state.scheduler.Schedule schedule7 = requestScheduleRequest6.getSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(schedule7);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test406"); }

    java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.REPO_VERSION_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "repository_version_id"+ "'", str0.equals("repository_version_id"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test407"); }

    org.apache.ambari.server.controller.internal.ProvisionAction provisionAction1 = org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START;
    org.apache.ambari.server.topology.Component component2 = new org.apache.ambari.server.topology.Component("kdc_type", provisionAction1);
    org.junit.Assert.assertTrue("'" + provisionAction1 + "' != '" + org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START + "'", provisionAction1.equals(org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test408"); }

    org.apache.ambari.server.api.resources.RequestScheduleResourceDefinition requestScheduleResourceDefinition0 = new org.apache.ambari.server.api.resources.RequestScheduleResourceDefinition();
    java.lang.String str1 = requestScheduleResourceDefinition0.getPluralName();
    java.lang.String str2 = requestScheduleResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "request_schedules"+ "'", str1.equals("request_schedules"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "request_schedule"+ "'", str2.equals("request_schedule"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test409"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    java.lang.String str2 = configuration0.getMpacksStagingPath();
    java.io.File file3 = configuration0.getBootStrapDir();
    java.lang.String str4 = configuration0.getXXSSProtectionHTTPResponseHeader();
    boolean b5 = configuration0.isExperimentalConcurrentStageProcessingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1; mode=block"+ "'", str4.equals("1; mode=block"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test410"); }

    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder2 = createUserRequestAuditEventBuilder0.withCreatedUsername("hdfs-site");
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder4 = createUserRequestAuditEventBuilder0.withUserName("Users/user_type");
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder6 = createUserRequestAuditEventBuilder4.withActive(false);
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder8 = createUserRequestAuditEventBuilder6.withAdmin(false);
    
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
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test411"); }

    org.apache.ambari.server.api.resources.HostKerberosIdentityResourceDefinition hostKerberosIdentityResourceDefinition0 = new org.apache.ambari.server.api.resources.HostKerberosIdentityResourceDefinition();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.api.query.render.Renderer renderer2 = hostKerberosIdentityResourceDefinition0.getRenderer("version_definition.xsd");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test412"); }

    org.apache.ambari.server.api.query.render.AlertSummaryRenderer alertSummaryRenderer0 = new org.apache.ambari.server.api.query.render.AlertSummaryRenderer();

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test413"); }

    java.lang.String[] str_array57 = new java.lang.String[] { "security", "alerts.json", "Artifacts/artifact_name", "widgets.json", "ambari.dispatch.snmp.oids.body", "", "type", "alerts.json", "RootServiceComponents/ciphers", "notification.dispatch.alert.script", "AuthorizationInfo/cluster_name", "Users/user_type", "stack_name", "Alert/component_name", "ViewUrlInfo/view_instance_version", "max_duration_for_retries", "javax.net.ssl.trustStore", "AlertGroup/name", "configure-task-key-value-pairs", "RootService/service_name", "StackConfigurations/property_value_attributes", "ambari_db_rca_password", "hi!", "Stage/status", "127.0.0.1", "UpgradeChecks/repository_version", "queues", "UpgradeChecks/repository_version", "ERROR", "desired_version", "_SERVICE_CHECK", "Event/summary/memberships/removed", "AlertTarget/name", "PrivilegeInfo/principal_type", "manage_identities", "ambari-server", "Event/summary/memberships/removed", "Stage/host_params", "max_duration_for_retries", "queues", "cluster-env", "UpgradeChecks/id", "StackConfigurations/property_name", "stack_name", "METRICS_COLLECTOR", "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}", "operation_level/service_name", "alerts.json", "stack_name", "ViewVersionInfo/archive", "StackLevelConfigurations/property_value_attributes", "kerberos_descriptor", "Repositories/repository_version_id", "ambari_db_rca_password", "notification.dispatch.alert.script", "ERROR", "AlertNotice/target_id" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str58 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str58, str_array57);
    java.util.Set<java.lang.String> set_str60 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories((java.util.Set<java.lang.String>)linkedhashset_str58);
    org.apache.ambari.server.state.Cluster[] cluster_array61 = new org.apache.ambari.server.state.Cluster[] {  };
    java.util.LinkedHashSet<org.apache.ambari.server.state.Cluster> linkedhashset_cluster62 = new java.util.LinkedHashSet<org.apache.ambari.server.state.Cluster>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.Cluster>)linkedhashset_cluster62, cluster_array61);
    org.apache.ambari.server.events.HostsRemovedEvent hostsRemovedEvent64 = new org.apache.ambari.server.events.HostsRemovedEvent((java.util.Set<java.lang.String>)linkedhashset_str58, (java.util.Set<org.apache.ambari.server.state.Cluster>)linkedhashset_cluster62);
    java.lang.String str65 = hostsRemovedEvent64.toString();
    java.util.Set<java.lang.String> set_str66 = hostsRemovedEvent64.getHostNames();
    
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
    org.junit.Assert.assertNotNull(set_str66);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test414"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str1 = configuration0.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file2 = configuration0.getRecommendationsDir();
    java.lang.String str3 = configuration0.getHostsMapFile();
    java.lang.Integer i4 = configuration0.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties5 = configuration0.getPersistenceCustomProperties();
    org.apache.ambari.server.security.ClientSecurityType clientSecurityType7 = org.apache.ambari.server.security.ClientSecurityType.fromString("UpgradeChecks/id");
    configuration0.setClientSecurityType(clientSecurityType7);
    org.apache.ambari.server.security.authorization.jwt.JwtAuthenticationProperties jwtAuthenticationProperties9 = configuration0.getJwtProperties();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jwtAuthenticationProperties9);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test415"); }

    org.apache.ambari.server.utils.JaxbMapKeyListAdapter jaxbMapKeyListAdapter0 = new org.apache.ambari.server.utils.JaxbMapKeyListAdapter();
    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping2 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<java.lang.String> list_str4 = aggregateDefinitionMapping2.getAlertsWithAggregates((long)(-1));
    org.apache.ambari.server.utils.JaxbMapKeyList jaxbMapKeyList5 = new org.apache.ambari.server.utils.JaxbMapKeyList("Users/user_name", list_str4);
    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping7 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<java.lang.String> list_str9 = aggregateDefinitionMapping7.getAlertsWithAggregates((long)(-1));
    org.apache.ambari.server.utils.JaxbMapKeyList jaxbMapKeyList10 = new org.apache.ambari.server.utils.JaxbMapKeyList("Users/user_name", list_str9);
    org.apache.ambari.server.state.alert.AggregateDefinitionMapping aggregateDefinitionMapping12 = new org.apache.ambari.server.state.alert.AggregateDefinitionMapping();
    java.util.List<java.lang.String> list_str14 = aggregateDefinitionMapping12.getAlertsWithAggregates((long)(-1));
    org.apache.ambari.server.utils.JaxbMapKeyList jaxbMapKeyList15 = new org.apache.ambari.server.utils.JaxbMapKeyList("Users/user_name", list_str14);
    org.apache.ambari.server.utils.JaxbMapKeyList[] jaxbMapKeyList_array16 = new org.apache.ambari.server.utils.JaxbMapKeyList[] { jaxbMapKeyList5, jaxbMapKeyList10, jaxbMapKeyList15 };
    java.util.Map<java.lang.String,java.util.List<java.lang.String>> map_str_list_str17 = jaxbMapKeyListAdapter0.unmarshal(jaxbMapKeyList_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jaxbMapKeyList_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_list_str17);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test416"); }

    org.apache.ambari.server.state.alert.PercentSource.MetricFractionPart metricFractionPart0 = new org.apache.ambari.server.state.alert.PercentSource.MetricFractionPart();

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test417"); }

    org.apache.ambari.server.api.services.ExtensionLinksService extensionLinksService0 = new org.apache.ambari.server.api.services.ExtensionLinksService();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response4 = extensionLinksService0.deleteExtensionLink(httpHeaders1, uriInfo2, "ViewInstanceInfo/view_name");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test418"); }

    org.apache.ambari.server.state.PropertyInfo propertyInfo0 = new org.apache.ambari.server.state.PropertyInfo();
    propertyInfo0.setDeleted(true);
    java.lang.String str3 = propertyInfo0.toString();
    propertyInfo0.setDeleted(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PropertyInfo{name='null', value='null', description='null', filename='null', deleted=true, requireInput=false, propertyTypes=[], propertyAttributes=[], propertyValueAttributes=ValueAttributesInfo{entries=null, type='null', maximum='null', minimum='null', unit='null', delete='null', emptyValueValid='null', visible='null', readOnly='null', editableOnlyAtInstall='null', overridable='null', showPropertyName='null', uiOnlyProperty='null', incrementStep='null', entriesEditable=null, selectionCardinality='null', propertyFileName='null', propertyFileType='null', copy='null'}, dependsOnProperties=[], dependedByProperties=[]}"+ "'", str3.equals("PropertyInfo{name='null', value='null', description='null', filename='null', deleted=true, requireInput=false, propertyTypes=[], propertyAttributes=[], propertyValueAttributes=ValueAttributesInfo{entries=null, type='null', maximum='null', minimum='null', unit='null', delete='null', emptyValueValid='null', visible='null', readOnly='null', editableOnlyAtInstall='null', overridable='null', showPropertyName='null', uiOnlyProperty='null', incrementStep='null', entriesEditable=null, selectionCardinality='null', propertyFileName='null', propertyFileType='null', copy='null'}, dependsOnProperties=[], dependedByProperties=[]}"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test419"); }

    org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo0 = new org.apache.ambari.server.state.ValueAttributesInfo();
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)true);
    java.lang.String str3 = valueAttributesInfo0.getIncrementStep();
    valueAttributesInfo0.setDelete("operation");
    valueAttributesInfo0.setSelectionCardinality("Credential/key");
    valueAttributesInfo0.setEditableOnlyAtInstall((java.lang.Boolean)false);
    valueAttributesInfo0.setOverridable((java.lang.Boolean)false);
    java.lang.String str12 = valueAttributesInfo0.getMinimum();
    java.lang.Boolean b13 = valueAttributesInfo0.getUiOnlyProperty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b13);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test420"); }

    org.apache.ambari.server.audit.request.eventcreator.ValidationIgnoreEventCreator validationIgnoreEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.ValidationIgnoreEventCreator();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    org.apache.ambari.server.api.services.RequestBody requestBody2 = null;
    javax.ws.rs.core.UriInfo uriInfo3 = null;
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance4 = null;
    org.apache.ambari.server.api.services.PostRequest postRequest5 = new org.apache.ambari.server.api.services.PostRequest(httpHeaders1, requestBody2, uriInfo3, resourceInstance4);
    int i6 = postRequest5.getAPIVersion();
    org.apache.ambari.server.api.services.RequestBody requestBody7 = postRequest5.getBody();
    org.apache.ambari.server.api.resources.ResourceInstance resourceInstance8 = postRequest5.getResource();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS9 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus10 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS9);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS11 = resultStatus10.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS12 = resultStatus10.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl13 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus10);
    org.apache.ambari.server.api.services.ResultMetadata resultMetadata14 = null;
    resultImpl13.setResultMetadata(resultMetadata14);
    org.apache.ambari.server.audit.event.AuditEvent auditEvent16 = validationIgnoreEventCreator0.createAuditEvent((org.apache.ambari.server.api.services.Request)postRequest5, (org.apache.ambari.server.api.services.Result)resultImpl13);
    org.apache.ambari.server.api.services.RequestBody requestBody17 = postRequest5.getBody();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(requestBody7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourceInstance8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(auditEvent16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(requestBody17);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test421"); }

    org.apache.ambari.server.controller.ServiceComponentHostRequest serviceComponentHostRequest5 = new org.apache.ambari.server.controller.ServiceComponentHostRequest("\"Hosts/maintenance_state\"", "SAMEORIGIN", "QuickLinksConfiguration", "StackLevelConfigurations/final", "CompatibleRepositoryVersions/stack_name");
    java.lang.String str6 = serviceComponentHostRequest5.getComponentName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "QuickLinksConfiguration"+ "'", str6.equals("QuickLinksConfiguration"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test422"); }

    org.apache.ambari.server.configuration.Configuration configuration1 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str2 = configuration1.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file3 = configuration1.getRecommendationsDir();
    java.lang.String str4 = configuration1.getHostsMapFile();
    java.lang.String str5 = configuration1.getProxyHostAndPorts();
    java.util.List<java.lang.String> list_str6 = configuration1.getRollingUpgradeSkipPackagesPrefixes();
    org.apache.ambari.server.utils.JaxbMapKeyList jaxbMapKeyList7 = new org.apache.ambari.server.utils.JaxbMapKeyList("Clusters/health_report", list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "nosniff"+ "'", str2.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "*:*"+ "'", str5.equals("*:*"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test423"); }

    org.apache.ambari.server.state.QuickLinksConfigurationInfo quickLinksConfigurationInfo0 = new org.apache.ambari.server.state.QuickLinksConfigurationInfo();
    java.lang.String str1 = quickLinksConfigurationInfo0.toString();
    java.lang.Boolean b2 = quickLinksConfigurationInfo0.getIsDefault();
    java.lang.Boolean b3 = quickLinksConfigurationInfo0.isDeleted();
    java.util.Map<java.lang.String,org.apache.ambari.server.state.quicklinks.QuickLinks> map_str_quickLinks4 = null;
    quickLinksConfigurationInfo0.setQuickLinksConfigurationMap(map_str_quickLinks4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"+ "'", str1.equals("QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b2 + "' != '" + false+ "'", b2.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b3 + "' != '" + false+ "'", b3.equals(false));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test424"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.WIDGETLAYOUT_LAYOUT_NAME_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/layout_name"+ "'", str0.equals("WidgetLayoutInfo/layout_name"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test425"); }

    org.apache.ambari.server.api.resources.ExtensionVersionResourceDefinition extensionVersionResourceDefinition0 = new org.apache.ambari.server.api.resources.ExtensionVersionResourceDefinition();

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test426"); }

    org.apache.ambari.server.controller.utilities.state.FlumeServiceCalculatedState flumeServiceCalculatedState0 = new org.apache.ambari.server.controller.utilities.state.FlumeServiceCalculatedState();

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test427"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str22, str_array21);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent24 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str22);
    java.util.Set<java.lang.String> set_str25 = hostsAddedEvent24.getHostNames();
    org.apache.ambari.server.controller.ExtensionVersionResponse extensionVersionResponse26 = new org.apache.ambari.server.controller.ExtensionVersionResponse("/var/lib/ambari-server/resources/custom_action_definitions", "/api/v1/views/*", true, (java.util.Collection<java.lang.String>)set_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str25);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test428"); }

    org.apache.ambari.server.state.UpgradeState upgradeState0 = org.apache.ambari.server.state.UpgradeState.FAILED;
    org.junit.Assert.assertTrue("'" + upgradeState0 + "' != '" + org.apache.ambari.server.state.UpgradeState.FAILED + "'", upgradeState0.equals(org.apache.ambari.server.state.UpgradeState.FAILED));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test429"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher0 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener alertLifecycleListener1 = new org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener(ambariEventPublisher0);
    org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener alertMaintenanceModeListener2 = new org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener(ambariEventPublisher0);
    org.apache.ambari.server.agent.RecoveryConfigHelper recoveryConfigHelper3 = new org.apache.ambari.server.agent.RecoveryConfigHelper(ambariEventPublisher0);
    org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener alertMaintenanceModeListener4 = new org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener(ambariEventPublisher0);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test430"); }

    org.apache.ambari.server.api.resources.HostKerberosIdentityResourceDefinition hostKerberosIdentityResourceDefinition0 = new org.apache.ambari.server.api.resources.HostKerberosIdentityResourceDefinition();
    java.util.List<org.apache.ambari.server.api.resources.ResourceDefinition.PostProcessor> list_postProcessor1 = hostKerberosIdentityResourceDefinition0.getPostProcessors();
    java.lang.String str2 = hostKerberosIdentityResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_postProcessor1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "kerberos_identity"+ "'", str2.equals("kerberos_identity"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test431"); }

    org.apache.ambari.server.controller.jmx.JMXMetricHolder jMXMetricHolder0 = new org.apache.ambari.server.controller.jmx.JMXMetricHolder();
    org.apache.ambari.server.notifications.dispatchers.EmailDispatcher emailDispatcher1 = new org.apache.ambari.server.notifications.dispatchers.EmailDispatcher();
    org.apache.ambari.server.configuration.Configuration configuration2 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str3 = configuration2.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file4 = configuration2.getRecommendationsDir();
    java.lang.String str5 = configuration2.getHostsMapFile();
    java.lang.Integer i6 = configuration2.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties7 = configuration2.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor8 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties7);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj9 = kerberosComponentDescriptor8.toMap();
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor10 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor(map_str_obj9);
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor11 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_str_obj9);
    org.apache.ambari.server.notifications.TargetConfigurationResult targetConfigurationResult12 = emailDispatcher1.validateTargetConfig(map_str_obj9);
    java.util.ArrayList<java.util.Map<java.lang.String,java.lang.Object>> arraylist_map_str_obj13 = new java.util.ArrayList<java.util.Map<java.lang.String,java.lang.Object>>();
    boolean b14 = arraylist_map_str_obj13.add(map_str_obj9);
    jMXMetricHolder0.setBeans((java.util.List<java.util.Map<java.lang.String,java.lang.Object>>)arraylist_map_str_obj13);
    org.apache.ambari.server.topology.Setting setting16 = org.apache.ambari.server.topology.SettingFactory.getSetting((java.util.Collection<java.util.Map<java.lang.String,java.lang.Object>>)arraylist_map_str_obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "nosniff"+ "'", str3.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 30000+ "'", i6.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(targetConfigurationResult12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(setting16);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test432"); }

    org.apache.ambari.server.orm.dao.MemberDAO memberDAO0 = new org.apache.ambari.server.orm.dao.MemberDAO();

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test433"); }

    org.apache.ambari.server.events.publishers.VersionEventPublisher versionEventPublisher0 = new org.apache.ambari.server.events.publishers.VersionEventPublisher();
    org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor3 = null;
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor4 = null;
    org.apache.ambari.server.collections.Predicate predicate5 = null;
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor6 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor("RootServiceComponents/ciphers", "StackConfigurations/property_value_attributes", kerberosPrincipalDescriptor3, kerberosKeytabDescriptor4, predicate5);
    org.apache.ambari.server.state.CheckHelper checkHelper7 = new org.apache.ambari.server.state.CheckHelper();
    boolean b8 = kerberosIdentityDescriptor6.equals((java.lang.Object)checkHelper7);
    org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor9 = kerberosIdentityDescriptor6.getKeytabDescriptor();
    java.lang.String[] str_array28 = new java.lang.String[] { "UpgradeChecks/id", "widgets.json", "ViewVersionInfo/min_ambari_version", "Request_Info/asc_order", "downgrade_from_version", "RepositoryVersions/display_name", "", "ViewVersionInfo/min_ambari_version", "downgrade_from_version", "kerberos_descriptor", "Requests/request_schedule/schedule_id", "ViewVersionInfo/min_ambari_version", "hi!", "widgets.json", "alerts.json", "StackConfigurations/property_value_attributes", "AlertTarget/notification_type" };
    java.util.LinkedHashSet<java.lang.String> linkedhashset_str29 = new java.util.LinkedHashSet<java.lang.String>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)linkedhashset_str29, str_array28);
    org.apache.ambari.server.events.HostsAddedEvent hostsAddedEvent31 = new org.apache.ambari.server.events.HostsAddedEvent((long)(short)0, (java.util.Set<java.lang.String>)linkedhashset_str29);
    org.apache.ambari.server.events.AmbariEvent.AmbariEventType ambariEventType32 = hostsAddedEvent31.getType();
    org.apache.ambari.server.events.ClusterEvent clusterEvent34 = new org.apache.ambari.server.events.ClusterEvent(ambariEventType32, (long)(short)10);
    boolean b35 = kerberosIdentityDescriptor6.equals((java.lang.Object)clusterEvent34);
    versionEventPublisher0.publish(clusterEvent34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(kerberosKeytabDescriptor9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    org.junit.Assert.assertTrue("'" + ambariEventType32 + "' != '" + org.apache.ambari.server.events.AmbariEvent.AmbariEventType.HOST_ADDED + "'", ambariEventType32.equals(org.apache.ambari.server.events.AmbariEvent.AmbariEventType.HOST_ADDED));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test434"); }

    org.apache.ambari.server.events.ServiceComponentUninstalledEvent serviceComponentUninstalledEvent7 = new org.apache.ambari.server.events.ServiceComponentUninstalledEvent((long)(byte)100, "AlertHistory/cluster_name", "WidgetLayoutInfo/section_name", "ambari.dispatch-property.script", "AlertHistory/definition_name", "Clusters/total_hosts", false);
    java.lang.String str8 = serviceComponentUninstalledEvent7.getComponentName();
    java.lang.String str9 = serviceComponentUninstalledEvent7.getStackName();
    java.lang.String str10 = serviceComponentUninstalledEvent7.getComponentName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AlertHistory/definition_name"+ "'", str8.equals("AlertHistory/definition_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "AlertHistory/cluster_name"+ "'", str9.equals("AlertHistory/cluster_name"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "AlertHistory/definition_name"+ "'", str10.equals("AlertHistory/definition_name"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test435"); }

    org.apache.ambari.server.controller.RepositoryResponse repositoryResponse7 = new org.apache.ambari.server.controller.RepositoryResponse("PermissionInfo/resource_name", "Users/old_password", "Actions/default_timeout", "metrics_descriptor", "AlertGroup/cluster_name", "AuthorizationInfo/user_name", "PrivilegeInfo/principal_name");
    repositoryResponse7.setVersionDefinitionId("ServiceInfo/credential_store_supported");
    repositoryResponse7.setUnique(false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test436"); }

    org.apache.ambari.server.controller.MemberRequest memberRequest2 = new org.apache.ambari.server.controller.MemberRequest("Executing", "hive-site");
    java.lang.String str3 = memberRequest2.getGroupName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Executing"+ "'", str3.equals("Executing"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test437"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    java.lang.String str2 = configuration0.getMpacksStagingPath();
    int i3 = configuration0.getConnectionPoolMaximumIdle();
    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRunner stackAdvisorRunner4 = new org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRunner();
    org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo5 = null;
    org.apache.ambari.server.api.services.stackadvisor.StackAdvisorHelper stackAdvisorHelper6 = new org.apache.ambari.server.api.services.stackadvisor.StackAdvisorHelper(configuration0, stackAdvisorRunner4, ambariMetaInfo5);
    java.lang.String str7 = configuration0.getRcaDatabasePassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 14400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "mapred"+ "'", str7.equals("mapred"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test438"); }

    java.sql.Connection connection0 = null;
    org.apache.ambari.server.orm.helpers.ScriptRunner scriptRunner3 = new org.apache.ambari.server.orm.helpers.ScriptRunner(connection0, true, true);
    scriptRunner3.setDelimiter("HostRoles/service_name", false);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test439"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider.COMPONENT_STATE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceHostComponents/component_state"+ "'", str0.equals("RootServiceHostComponents/component_state"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test440"); }

    org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
    org.apache.ambari.server.controller.internal.Extension extension3 = new org.apache.ambari.server.controller.internal.Extension("configure-task-key-value-pairs", "", ambariManagementController2);
    java.lang.String str4 = extension3.getVersion();
    org.apache.ambari.server.topology.Cardinality cardinality6 = extension3.getCardinality("host_group");
    java.util.Map<java.lang.String,java.util.Collection<java.lang.String>> map_str_collection_str7 = extension3.getComponents();
    java.util.Collection<org.apache.ambari.server.state.DependencyInfo> collection_dependencyInfo9 = extension3.getDependenciesForComponent("version");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cardinality6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_collection_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_dependencyInfo9);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test441"); }

    org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping serviceCheckGrouping0 = new org.apache.ambari.server.state.stack.upgrade.ServiceCheckGrouping();
    org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler1 = null;
    serviceCheckGrouping0.parallelScheduler = parallelScheduler1;
    org.apache.ambari.server.state.stack.upgrade.Direction direction3 = org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE;
    java.lang.String str5 = direction3.getText(true);
    java.lang.String str7 = direction3.getPast(true);
    java.lang.String str9 = direction3.getPast(false);
    serviceCheckGrouping0.intendedDirection = direction3;
    org.junit.Assert.assertTrue("'" + direction3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE + "'", direction3.equals(org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Upgrade"+ "'", str5.equals("Upgrade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Upgraded"+ "'", str7.equals("Upgraded"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "upgraded"+ "'", str9.equals("upgraded"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test442"); }

    org.apache.ambari.server.orm.entities.ViewInstancePropertyEntityPK viewInstancePropertyEntityPK0 = new org.apache.ambari.server.orm.entities.ViewInstancePropertyEntityPK();
    viewInstancePropertyEntityPK0.setViewName("ViewUrlInfo/view_instance_version");
    org.apache.ambari.server.utils.ShellCommandUtil.Result result6 = new org.apache.ambari.server.utils.ShellCommandUtil.Result((int)(byte)-1, "rack_info", "value");
    boolean b7 = viewInstancePropertyEntityPK0.equals((java.lang.Object)(byte)-1);
    viewInstancePropertyEntityPK0.setViewInstanceName("{cluster=null, state=WARNING, name=false, service=Repositories/base_url, component=mysql_jdbc_url, host=AlertTarget/notification_type, instance=principal_type, text='null'}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test443"); }

    org.apache.ambari.server.api.resources.ViewPermissionResourceDefinition viewPermissionResourceDefinition0 = new org.apache.ambari.server.api.resources.ViewPermissionResourceDefinition();
    java.util.Collection<java.lang.String> collection_str1 = viewPermissionResourceDefinition0.getCreateDirectives();
    java.lang.String str2 = viewPermissionResourceDefinition0.getSingularName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "permission"+ "'", str2.equals("permission"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test444"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    java.lang.String str2 = configuration0.getMpacksStagingPath();
    java.io.File file3 = configuration0.getBootStrapDir();
    java.io.File file4 = configuration0.getRecommendationsDir();
    java.lang.Integer i5 = configuration0.getExternalScriptThreadPoolSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 4+ "'", i5.equals(4));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test445"); }

    org.apache.ambari.server.controller.gsinstaller.GSInstallerStateProvider gSInstallerStateProvider0 = null;
    org.apache.ambari.server.controller.gsinstaller.ClusterDefinition clusterDefinition1 = new org.apache.ambari.server.controller.gsinstaller.ClusterDefinition(gSInstallerStateProvider0);
    java.util.Set<java.lang.String> set_str4 = clusterDefinition1.getHostComponents("WidgetInfo/values", "RootServiceHostComponents/host_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str4);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test446"); }

    org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
    org.apache.ambari.server.orm.helpers.dbms.MySqlHelper mySqlHelper1 = new org.apache.ambari.server.orm.helpers.dbms.MySqlHelper(databasePlatform0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = mySqlHelper1.getDropFKConstraintStatement("original_stack", "commands_to_retry");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test447"); }

    org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher0 = new org.apache.ambari.server.events.publishers.AmbariEventPublisher();
    org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener alertLifecycleListener1 = new org.apache.ambari.server.events.listeners.alerts.AlertLifecycleListener(ambariEventPublisher0);
    org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener alertMaintenanceModeListener2 = new org.apache.ambari.server.events.listeners.alerts.AlertMaintenanceModeListener(ambariEventPublisher0);
    org.apache.ambari.server.agent.RecoveryConfigHelper recoveryConfigHelper3 = new org.apache.ambari.server.agent.RecoveryConfigHelper(ambariEventPublisher0);
    org.apache.ambari.server.events.listeners.upgrade.DistributeRepositoriesActionListener distributeRepositoriesActionListener4 = new org.apache.ambari.server.events.listeners.upgrade.DistributeRepositoriesActionListener(ambariEventPublisher0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test448"); }

    org.apache.ambari.server.controller.logging.LogLevelQueryResponse logLevelQueryResponse0 = new org.apache.ambari.server.controller.logging.LogLevelQueryResponse();
    org.apache.ambari.server.controller.logging.NameValuePair nameValuePair3 = new org.apache.ambari.server.controller.logging.NameValuePair("tag", "tag");
    java.lang.String str4 = nameValuePair3.getValue();
    org.apache.ambari.server.controller.logging.NameValuePair nameValuePair7 = new org.apache.ambari.server.controller.logging.NameValuePair("tag", "tag");
    org.apache.ambari.server.controller.logging.NameValuePair[] nameValuePair_array8 = new org.apache.ambari.server.controller.logging.NameValuePair[] { nameValuePair3, nameValuePair7 };
    java.util.ArrayList<org.apache.ambari.server.controller.logging.NameValuePair> arraylist_nameValuePair9 = new java.util.ArrayList<org.apache.ambari.server.controller.logging.NameValuePair>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.logging.NameValuePair>)arraylist_nameValuePair9, nameValuePair_array8);
    logLevelQueryResponse0.setNameValueList((java.util.List<org.apache.ambari.server.controller.logging.NameValuePair>)arraylist_nameValuePair9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tag"+ "'", str4.equals("tag"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nameValuePair_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test449"); }

    org.apache.ambari.server.controller.AlertNoticeRequest alertNoticeRequest0 = new org.apache.ambari.server.controller.AlertNoticeRequest();
    org.apache.ambari.server.controller.spi.Predicate predicate1 = null;
    alertNoticeRequest0.Predicate = predicate1;
    org.apache.ambari.server.controller.spi.PageRequest pageRequest3 = alertNoticeRequest0.Pagination;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(pageRequest3);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test450"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CLIENT_SECURITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test451"); }

    org.apache.ambari.server.controller.ServiceResponse serviceResponse7 = new org.apache.ambari.server.controller.ServiceResponse((java.lang.Long)(-1L), "name", "stack_features", "Tasks/custom_command_name", "RepositoryVersions/display_name", true, true);
    serviceResponse7.setCredentialStoreEnabled(false);
    serviceResponse7.setMaintenanceState("Requests/request_schedule/schedule_id");
    serviceResponse7.setServiceName("fqdn");
    serviceResponse7.setDesiredStackVersion("ViewInfo/view_name");
    java.lang.String str16 = serviceResponse7.getDesiredStackVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ViewInfo/view_name"+ "'", str16.equals("ViewInfo/view_name"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test452"); }

    org.apache.ambari.server.bootstrap.FifoLinkedHashMap<org.apache.ambari.server.controller.internal.ActionResourceProvider,org.apache.ambari.server.audit.request.RequestAuditEvent.RequestAuditEventBuilder<org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent,org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder>> fifolinkedhashmap_actionResourceProvider_requestauditeventbuilder_viewPrivilegeChangeRequestAuditEvent_viewPrivilegeChangeRequestAuditEventBuilder0 = new org.apache.ambari.server.bootstrap.FifoLinkedHashMap<org.apache.ambari.server.controller.internal.ActionResourceProvider,org.apache.ambari.server.audit.request.RequestAuditEvent.RequestAuditEventBuilder<org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent,org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder>>();
    java.util.Collection<org.apache.ambari.server.audit.request.RequestAuditEvent.RequestAuditEventBuilder<org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent,org.apache.ambari.server.audit.event.request.ViewPrivilegeChangeRequestAuditEvent.ViewPrivilegeChangeRequestAuditEventBuilder>> collection_requestauditeventbuilder_viewPrivilegeChangeRequestAuditEvent_viewPrivilegeChangeRequestAuditEventBuilder1 = fifolinkedhashmap_actionResourceProvider_requestauditeventbuilder_viewPrivilegeChangeRequestAuditEvent_viewPrivilegeChangeRequestAuditEventBuilder0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_requestauditeventbuilder_viewPrivilegeChangeRequestAuditEvent_viewPrivilegeChangeRequestAuditEventBuilder1);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test453"); }

    org.apache.ambari.server.state.theme.Widget widget0 = new org.apache.ambari.server.state.theme.Widget();
    java.util.List<org.apache.ambari.server.state.theme.Unit> list_unit1 = widget0.getUnits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_unit1);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test454"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.lang.String str4 = hostResponse1.getRackInfo();
    org.apache.ambari.server.state.HostHealthStatus.HealthStatus healthStatus5 = org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT;
    org.apache.ambari.server.state.HostHealthStatus hostHealthStatus7 = new org.apache.ambari.server.state.HostHealthStatus(healthStatus5, "SECONDARY_NAMENODE_MUST_BE_DELETED");
    hostResponse1.setHealthStatus(hostHealthStatus7);
    java.lang.String str9 = hostResponse1.getPublicHostName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    org.junit.Assert.assertTrue("'" + healthStatus5 + "' != '" + org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT + "'", healthStatus5.equals(org.apache.ambari.server.state.HostHealthStatus.HealthStatus.ALERT));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test455"); }

    org.apache.ambari.server.controller.jmx.JMXMetricHolder jMXMetricHolder0 = new org.apache.ambari.server.controller.jmx.JMXMetricHolder();
    org.apache.ambari.server.notifications.dispatchers.EmailDispatcher emailDispatcher1 = new org.apache.ambari.server.notifications.dispatchers.EmailDispatcher();
    org.apache.ambari.server.configuration.Configuration configuration2 = new org.apache.ambari.server.configuration.Configuration();
    java.lang.String str3 = configuration2.getViewsXContentTypeHTTPResponseHeader();
    java.io.File file4 = configuration2.getRecommendationsDir();
    java.lang.String str5 = configuration2.getHostsMapFile();
    java.lang.Integer i6 = configuration2.getViewAmbariRequestConnectTimeout();
    java.util.Properties properties7 = configuration2.getPersistenceCustomProperties();
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor8 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor((java.util.Map<java.lang.Object,java.lang.Object>)properties7);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj9 = kerberosComponentDescriptor8.toMap();
    org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor10 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor(map_str_obj9);
    org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor11 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_str_obj9);
    org.apache.ambari.server.notifications.TargetConfigurationResult targetConfigurationResult12 = emailDispatcher1.validateTargetConfig(map_str_obj9);
    java.util.ArrayList<java.util.Map<java.lang.String,java.lang.Object>> arraylist_map_str_obj13 = new java.util.ArrayList<java.util.Map<java.lang.String,java.lang.Object>>();
    boolean b14 = arraylist_map_str_obj13.add(map_str_obj9);
    jMXMetricHolder0.setBeans((java.util.List<java.util.Map<java.lang.String,java.lang.Object>>)arraylist_map_str_obj13);
    java.util.List<java.util.Map<java.lang.String,java.lang.Object>> list_map_str_obj16 = jMXMetricHolder0.getBeans();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "nosniff"+ "'", str3.equals("nosniff"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 30000+ "'", i6.equals(30000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(targetConfigurationResult12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_map_str_obj16);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test456"); }

    org.apache.ambari.server.orm.dao.ViewInstanceDAO viewInstanceDAO0 = new org.apache.ambari.server.orm.dao.ViewInstanceDAO();
    org.apache.ambari.server.orm.entities.ViewInstanceDataEntity viewInstanceDataEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    viewInstanceDAO0.removeData(viewInstanceDataEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test457"); }

    org.apache.ambari.server.controller.StackServiceRequest stackServiceRequest5 = new org.apache.ambari.server.controller.StackServiceRequest("include_ambari_identity", "timeline.metrics.host.aggregator.ttl", "value", "CompatibleRepositoryVersions/stack_name", "AlertNotice/service_name");
    java.lang.String str6 = stackServiceRequest5.getStackName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "include_ambari_identity"+ "'", str6.equals("include_ambari_identity"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test458"); }

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
    java.util.Set<java.lang.String> set_str41 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.propertyIds;
    java.util.Set<java.lang.String> set_str42 = org.apache.ambari.server.controller.utilities.PropertyHelper.getCategories(set_str41);
    org.apache.ambari.server.controller.spi.Request request43 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str41);
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
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource87 = loggingResourceProvider40.getResources(request43, (org.apache.ambari.server.controller.spi.Predicate)andPredicate65);
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
    org.junit.Assert.assertNotNull(set_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request43);
    
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

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test459"); }

    org.apache.ambari.server.configuration.Configuration configuration0 = new org.apache.ambari.server.configuration.Configuration();
    int i1 = configuration0.getClientThreadPoolSize();
    org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher2 = new org.apache.ambari.server.events.publishers.AlertEventPublisher(configuration0);
    int i3 = configuration0.getConnectionPoolMaximumAge();
    java.util.Properties properties4 = configuration0.getPersistenceCustomProperties();
    int i5 = configuration0.getMetricCacheTTLSeconds();
    java.lang.String str6 = configuration0.getCustomActionDefinitionPath();
    org.apache.ambari.server.orm.dao.AlertsDAO alertsDAO7 = new org.apache.ambari.server.orm.dao.AlertsDAO(configuration0);
    org.apache.ambari.server.controller.predicate.FilterPredicate filterPredicate10 = new org.apache.ambari.server.controller.predicate.FilterPredicate("Event/summary/memberships/removed", "service_type");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS11 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus12 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS11);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS13 = resultStatus12.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS14 = resultStatus12.getStatus();
    org.apache.ambari.server.api.services.ResultImpl resultImpl15 = new org.apache.ambari.server.api.services.ResultImpl(resultStatus12);
    boolean b16 = filterPredicate10.equals((java.lang.Object)resultStatus12);
    int i17 = alertsDAO7.getCount((org.apache.ambari.server.controller.spi.Predicate)filterPredicate10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/var/lib/ambari-server/resources/custom_action_definitions"+ "'", str6.equals("/var/lib/ambari-server/resources/custom_action_definitions"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test460"); }

    org.apache.ambari.server.events.MetricsCollectorHostDownEvent metricsCollectorHostDownEvent2 = new org.apache.ambari.server.events.MetricsCollectorHostDownEvent("service_type", "HostRoles/state");
    org.apache.ambari.server.events.AmbariEvent.AmbariEventType ambariEventType3 = metricsCollectorHostDownEvent2.getType();
    org.junit.Assert.assertTrue("'" + ambariEventType3 + "' != '" + org.apache.ambari.server.events.AmbariEvent.AmbariEventType.METRICS_COLLECTOR_HOST_DOWN + "'", ambariEventType3.equals(org.apache.ambari.server.events.AmbariEvent.AmbariEventType.METRICS_COLLECTOR_HOST_DOWN));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test461"); }

    org.apache.ambari.server.state.stack.upgrade.Direction direction0 = org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE;
    java.lang.String str2 = direction0.getPlural(false);
    org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE + "'", direction0.equals(org.apache.ambari.server.state.stack.upgrade.Direction.UPGRADE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "upgrades"+ "'", str2.equals("upgrades"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test462"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    ldapServerProperties0.setSyncGroupMemberReplacePattern("AlertTarget/notification_type");
    ldapServerProperties0.setSyncGroupMemberReplacePattern("ViewInstanceInfo/view_name:type");
    org.apache.ambari.server.Role role5 = org.apache.ambari.server.Role.HIVE_METASTORE;
    boolean b6 = ldapServerProperties0.equals((java.lang.Object)role5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test463"); }

    java.sql.Connection connection0 = null;
    org.apache.ambari.server.orm.helpers.ScriptRunner scriptRunner3 = new org.apache.ambari.server.orm.helpers.ScriptRunner(connection0, true, true);
    java.io.PrintWriter printWriter4 = null;
    scriptRunner3.setLogWriter(printWriter4);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test464"); }

    org.apache.ambari.server.hooks.users.UserHookParams userHookParams0 = org.apache.ambari.server.hooks.users.UserHookParams.CLUSTER_SECURITY_TYPE;
    org.junit.Assert.assertTrue("'" + userHookParams0 + "' != '" + org.apache.ambari.server.hooks.users.UserHookParams.CLUSTER_SECURITY_TYPE + "'", userHookParams0.equals(org.apache.ambari.server.hooks.users.UserHookParams.CLUSTER_SECURITY_TYPE));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test465"); }

    javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity,java.lang.Long> singularattribute_alertHistoryEntity_long0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_long0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test466"); }

    org.apache.ambari.server.state.stack.RepositoryXml repositoryXml0 = new org.apache.ambari.server.state.stack.RepositoryXml();
    java.lang.String str1 = repositoryXml0.getLatestURI();
    repositoryXml0.setValid(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test467"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = hostResponse1.getHostAttributes();
    java.lang.String str5 = hostResponse1.getStatus();
    hostResponse1.setLastRegistrationTime((long)' ');
    org.apache.ambari.server.state.MaintenanceState maintenanceState8 = hostResponse1.getMaintenanceState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(maintenanceState8);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test468"); }

    org.apache.ambari.server.orm.PersistenceType persistenceType0 = org.apache.ambari.server.orm.PersistenceType.LOCAL;
    org.junit.Assert.assertTrue("'" + persistenceType0 + "' != '" + org.apache.ambari.server.orm.PersistenceType.LOCAL + "'", persistenceType0.equals(org.apache.ambari.server.orm.PersistenceType.LOCAL));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test469"); }

    org.apache.ambari.server.agent.HeartBeat heartBeat0 = new org.apache.ambari.server.agent.HeartBeat();
    long long1 = heartBeat0.getTimestamp();
    java.util.List<org.apache.ambari.server.state.Alert> list_alert2 = heartBeat0.getAlerts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_alert2);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test470"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.OperatingSystemResourceProvider.OPERATING_SYSTEM_OS_TYPE_PROPERTY_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OperatingSystems/os_type"+ "'", str0.equals("OperatingSystems/os_type"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test471"); }

    org.apache.ambari.server.state.stack.upgrade.ManualTask manualTask0 = new org.apache.ambari.server.state.stack.upgrade.ManualTask();
    java.lang.String str1 = manualTask0.getActionVerb();
    boolean b2 = manualTask0.isSequential;
    org.apache.ambari.server.state.stack.upgrade.Task.Type type3 = manualTask0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Executing"+ "'", str1.equals("Executing"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.Task.Type.MANUAL + "'", type3.equals(org.apache.ambari.server.state.stack.upgrade.Task.Type.MANUAL));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test472"); }

    org.apache.ambari.server.state.stack.WidgetLayoutInfo widgetLayoutInfo0 = new org.apache.ambari.server.state.stack.WidgetLayoutInfo();

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test473"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.LOGSEARCH_SERVER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test474"); }

    org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO0 = null;
    org.apache.ambari.server.state.cluster.ClusterFactory clusterFactory1 = null;
    org.apache.ambari.server.orm.dao.HostDAO hostDAO2 = null;
    org.apache.ambari.server.state.host.HostFactory hostFactory3 = null;
    org.apache.ambari.server.state.cluster.ClustersImpl clustersImpl4 = new org.apache.ambari.server.state.cluster.ClustersImpl(clusterDAO0, clusterFactory1, hostDAO2, hostFactory3);
    org.apache.ambari.server.state.StackInfo stackInfo5 = null;
    org.apache.ambari.server.state.ExtensionInfo extensionInfo6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.stack.ExtensionHelper.validateDeleteLink((org.apache.ambari.server.state.Clusters)clustersImpl4, stackInfo5, extensionInfo6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test475"); }

    org.apache.ambari.server.audit.request.eventcreator.AlertTargetEventCreator alertTargetEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.AlertTargetEventCreator();
    java.util.Set<org.apache.ambari.server.api.services.ResultStatus.STATUS> set_sTATUS1 = alertTargetEventCreator0.getResultStatuses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_sTATUS1);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test476"); }

    org.apache.ambari.server.api.services.GroupService groupService0 = new org.apache.ambari.server.api.services.GroupService();
    javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
    javax.ws.rs.core.UriInfo uriInfo2 = null;
    // The following exception was thrown during execution in test generation
    try {
    javax.ws.rs.core.Response response3 = groupService0.getGroups(httpHeaders1, uriInfo2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test477"); }

    org.apache.ambari.server.api.predicate.operators.NotEqualsOperator notEqualsOperator0 = new org.apache.ambari.server.api.predicate.operators.NotEqualsOperator();
    java.lang.String str1 = notEqualsOperator0.getName();
    org.apache.ambari.server.api.predicate.expressions.RelationalExpression relationalExpression2 = new org.apache.ambari.server.api.predicate.expressions.RelationalExpression((org.apache.ambari.server.api.predicate.operators.RelationalOperator)notEqualsOperator0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "NotEqualsOperator"+ "'", str1.equals("NotEqualsOperator"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test478"); }

    org.apache.ambari.server.state.SecurityType securityType3 = org.apache.ambari.server.state.SecurityType.KERBEROS;
    java.util.Set<java.lang.String> set_str5 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.propertyIds;
    org.apache.ambari.server.controller.ClusterRequest clusterRequest6 = new org.apache.ambari.server.controller.ClusterRequest((java.lang.Long)1000L, "timeline.metrics.host.aggregator.ttl", "Users/user_type", securityType3, "HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}", set_str5);
    java.util.Set<java.lang.String> set_str7 = clusterRequest6.getHostNames();
    org.apache.ambari.server.state.SecurityType securityType8 = org.apache.ambari.server.state.SecurityType.NONE;
    clusterRequest6.setSecurityType(securityType8);
    java.lang.String str10 = clusterRequest6.getStackVersion();
    org.junit.Assert.assertTrue("'" + securityType3 + "' != '" + org.apache.ambari.server.state.SecurityType.KERBEROS + "'", securityType3.equals(org.apache.ambari.server.state.SecurityType.KERBEROS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str7);
    org.junit.Assert.assertTrue("'" + securityType8 + "' != '" + org.apache.ambari.server.state.SecurityType.NONE + "'", securityType8.equals(org.apache.ambari.server.state.SecurityType.NONE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}"+ "'", str10.equals("HostsRemovedEvent{m_clusters=[], m_hosts=[security, alerts.json, Artifacts/artifact_name, widgets.json, ambari.dispatch.snmp.oids.body, , type, RootServiceComponents/ciphers, notification.dispatch.alert.script, AuthorizationInfo/cluster_name, Users/user_type, stack_name, Alert/component_name, ViewUrlInfo/view_instance_version, max_duration_for_retries, javax.net.ssl.trustStore, AlertGroup/name, configure-task-key-value-pairs, RootService/service_name, StackConfigurations/property_value_attributes, ambari_db_rca_password, hi!, Stage/status, 127.0.0.1, UpgradeChecks/repository_version, queues, ERROR, desired_version, _SERVICE_CHECK, Event/summary/memberships/removed, AlertTarget/name, PrivilegeInfo/principal_type, manage_identities, ambari-server, Stage/host_params, cluster-env, UpgradeChecks/id, StackConfigurations/property_name, METRICS_COLLECTOR, QuickLinksConfigurationInfo{deleted=false, fileName='null', isDefault=false, quickLinksConfigurationMap=null}, operation_level/service_name, ViewVersionInfo/archive, StackLevelConfigurations/property_value_attributes, kerberos_descriptor, Repositories/repository_version_id, AlertNotice/target_id]}"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test479"); }

    org.apache.ambari.server.orm.dao.ClusterVersionDAO clusterVersionDAO0 = new org.apache.ambari.server.orm.dao.ClusterVersionDAO();
    org.apache.ambari.server.orm.entities.ClusterVersionEntity clusterVersionEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    clusterVersionDAO0.create(clusterVersionEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test480"); }

    org.apache.ambari.server.stack.ModuleState moduleState0 = org.apache.ambari.server.stack.ModuleState.RESOLVED;
    org.junit.Assert.assertTrue("'" + moduleState0 + "' != '" + org.apache.ambari.server.stack.ModuleState.RESOLVED + "'", moduleState0.equals(org.apache.ambari.server.stack.ModuleState.RESOLVED));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test481"); }

    org.apache.ambari.server.api.services.RequestBody requestBody0 = new org.apache.ambari.server.api.services.RequestBody();
    java.util.Set<java.util.Map<java.lang.String,java.lang.Object>> set_map_str_obj1 = requestBody0.getPropertySets();
    org.apache.ambari.server.controller.internal.ScaleClusterRequest scaleClusterRequest2 = new org.apache.ambari.server.controller.internal.ScaleClusterRequest(set_map_str_obj1);
    org.apache.ambari.server.controller.internal.ProvisionAction provisionAction3 = scaleClusterRequest2.getProvisionAction();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_map_str_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(provisionAction3);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test482"); }

    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder2 = createUserRequestAuditEventBuilder0.withOperation("nosniff");
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS3 = null;
    org.apache.ambari.server.api.services.ResultStatus resultStatus4 = new org.apache.ambari.server.api.services.ResultStatus(sTATUS3);
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS5 = resultStatus4.getStatus();
    org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS6 = resultStatus4.getStatus();
    org.apache.ambari.server.audit.event.request.CreateUserRequestAuditEvent.CreateUserRequestAuditEventBuilder createUserRequestAuditEventBuilder7 = createUserRequestAuditEventBuilder2.withResultStatus(resultStatus4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(sTATUS6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(createUserRequestAuditEventBuilder7);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test483"); }

    java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type,java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.keyPropertyIds;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_type_str0);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test484"); }

    org.apache.ambari.server.view.configuration.ViewConfig viewConfig0 = new org.apache.ambari.server.view.configuration.ViewConfig();
    java.lang.String str1 = viewConfig0.getClusterConfigOptions();
    java.lang.String str2 = viewConfig0.getMaxAmbariVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test485"); }

    org.apache.ambari.server.controller.HostResponse hostResponse1 = new org.apache.ambari.server.controller.HostResponse("RequestBodyInfo");
    hostResponse1.setOsType("Configuration elements must be Maps");
    java.util.Map<java.lang.String,java.lang.String> map_str_str4 = hostResponse1.getHostAttributes();
    java.lang.String str5 = hostResponse1.getStatus();
    int i6 = hostResponse1.getCpuCount();
    java.util.List<org.apache.ambari.server.agent.DiskInfo> list_diskInfo7 = hostResponse1.getDisksInfo();
    org.apache.ambari.server.state.MaintenanceState maintenanceState8 = org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_SERVICE;
    hostResponse1.setMaintenanceState(maintenanceState8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_diskInfo7);
    org.junit.Assert.assertTrue("'" + maintenanceState8 + "' != '" + org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_SERVICE + "'", maintenanceState8.equals(org.apache.ambari.server.state.MaintenanceState.IMPLIED_FROM_SERVICE));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test486"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.state.kerberos.KerberosPrincipalType kerberosPrincipalType1 = org.apache.ambari.server.state.kerberos.KerberosPrincipalType.translate("queues");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test487"); }

    org.apache.ambari.server.audit.event.request.UpdateRepositoryRequestAuditEvent.UpdateRepositoryRequestAuditEventBuilder updateRepositoryRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.UpdateRepositoryRequestAuditEvent.builder();
    org.apache.ambari.server.audit.event.request.UpdateRepositoryRequestAuditEvent.UpdateRepositoryRequestAuditEventBuilder updateRepositoryRequestAuditEventBuilder2 = updateRepositoryRequestAuditEventBuilder0.withRemoteIp("PermissionInfo/permission_name");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(updateRepositoryRequestAuditEventBuilder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(updateRepositoryRequestAuditEventBuilder2);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test488"); }

    org.apache.ambari.server.state.quicklinks.Link link0 = new org.apache.ambari.server.state.quicklinks.Link();
    link0.setUrl("AlertHistory/definition_name");
    java.lang.String str3 = link0.getLabel();
    org.apache.ambari.server.state.quicklinks.Link link4 = new org.apache.ambari.server.state.quicklinks.Link();
    link4.setUrl("AlertHistory/definition_name");
    org.apache.ambari.server.state.quicklinks.Protocol protocol7 = new org.apache.ambari.server.state.quicklinks.Protocol();
    org.apache.ambari.server.state.quicklinks.Check[] check_array8 = new org.apache.ambari.server.state.quicklinks.Check[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check> arraylist_check9 = new java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check9, check_array8);
    protocol7.setChecks((java.util.List<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check9);
    link4.setProtocol(protocol7);
    org.apache.ambari.server.state.quicklinks.Protocol protocol13 = new org.apache.ambari.server.state.quicklinks.Protocol();
    org.apache.ambari.server.state.quicklinks.Check[] check_array14 = new org.apache.ambari.server.state.quicklinks.Check[] {  };
    java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check> arraylist_check15 = new java.util.ArrayList<org.apache.ambari.server.state.quicklinks.Check>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check15, check_array14);
    protocol13.setChecks((java.util.List<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check15);
    protocol7.setChecks((java.util.List<org.apache.ambari.server.state.quicklinks.Check>)arraylist_check15);
    link0.setProtocol(protocol7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(check_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(check_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test489"); }

    org.apache.ambari.server.controller.ActionResponse actionResponse8 = new org.apache.ambari.server.controller.ActionResponse("Users/user_type", "Hosts/rack_info", "ViewUrlInfo/view_instance_version", "configure-task-key-value-pairs", "manage_identities", "HostRoles/state", "AlertTarget/notification_type", "alerts.json");
    java.lang.String str9 = actionResponse8.getTargetType();
    actionResponse8.setTargetType("sqlserver");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "AlertTarget/notification_type"+ "'", str9.equals("AlertTarget/notification_type"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test490"); }

    org.apache.ambari.server.state.alert.RecoverySource recoverySource0 = new org.apache.ambari.server.state.alert.RecoverySource();

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test491"); }

    org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_TIMELINE_ST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkDescription0);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test492"); }

    org.apache.ambari.server.orm.dao.WidgetDAO widgetDAO0 = new org.apache.ambari.server.orm.dao.WidgetDAO();
    org.apache.ambari.server.orm.entities.WidgetEntity widgetEntity1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.ambari.server.orm.entities.WidgetEntity widgetEntity2 = widgetDAO0.merge(widgetEntity1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test493"); }

    org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.LDAP_SYNC_USER_MEMBER_FILTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configurationproperty_str0);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test494"); }

    org.apache.ambari.server.controller.StackConfigurationDependencyResponse stackConfigurationDependencyResponse2 = new org.apache.ambari.server.controller.StackConfigurationDependencyResponse("mysql_jdbc_url", "Tasks/id");

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test495"); }

    org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.NODEMANAGER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(role0);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test496"); }

    org.apache.ambari.server.hooks.users.PostUserCreationHookContext postUserCreationHookContext1 = new org.apache.ambari.server.hooks.users.PostUserCreationHookContext("RepositoryVersions/display_name");
    java.lang.String str2 = postUserCreationHookContext1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BatchUserHookContext{userGroups={RepositoryVersions/display_name=[]}}"+ "'", str2.equals("BatchUserHookContext{userGroups={RepositoryVersions/display_name=[]}}"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test497"); }

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
    logLineResult31.setMessageMD5("downgrade_from_version");
    java.lang.String str35 = logLineResult31.getSourceFileLineNumber();
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
    org.junit.Assert.assertNull(str35);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test498"); }

    java.util.Set<java.lang.String> set_str0 = null;
    java.util.Map<java.lang.String,org.apache.ambari.server.controller.spi.TemporalInfo> map_str_temporalInfo1 = null;
    org.apache.ambari.server.controller.spi.Request request2 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str0, map_str_temporalInfo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(request2);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test499"); }

    java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_DIRECTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/direction"+ "'", str0.equals("Upgrade/direction"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test500"); }

    org.apache.ambari.server.security.authorization.LdapServerProperties ldapServerProperties0 = new org.apache.ambari.server.security.authorization.LdapServerProperties();
    java.lang.String str1 = ldapServerProperties0.getManagerPassword();
    java.lang.String str2 = ldapServerProperties0.getAdminGroupMappingRules();
    ldapServerProperties0.setGroupMembershipAttr("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

}