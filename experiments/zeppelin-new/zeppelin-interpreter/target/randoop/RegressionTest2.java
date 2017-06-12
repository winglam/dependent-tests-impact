
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage4 = new org.apache.zeppelin.interpreter.InterpreterResultMessage(type0, "[null]");
    java.lang.String str5 = interpreterResultMessage4.getData();
    java.lang.String str6 = interpreterResultMessage4.getData();
    java.lang.String str7 = interpreterResultMessage4.toString();
    java.lang.String str8 = interpreterResultMessage4.toString();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[null]"+ "'", str5.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[null]"+ "'", str6.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "%angular [null]"+ "'", str7.equals("%angular [null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "%angular [null]"+ "'", str8.equals("%angular [null]"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }

    org.sonatype.aether.RepositorySystem repositorySystem0 = org.apache.zeppelin.dep.RepositorySystemFactory.newRepositorySystem();
    org.sonatype.aether.RepositorySystemSession repositorySystemSession2 = org.apache.zeppelin.dep.Booter.newRepositorySystemSession(repositorySystem0, "InterpreterGroup_1497134408397_554648092");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(repositorySystem0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(repositorySystemSession2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry5 = interpreterGroup0.getAngularObjectRegistry();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener8 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry9 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener8);
    org.apache.zeppelin.resource.Resource[] resource_array11 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource12 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource12, resource_array11);
    org.apache.zeppelin.resource.Resource[] resource_array14 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource15 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15, resource_array14);
    boolean b17 = arraylist_resource15.isEmpty();
    boolean b18 = linkedlist_resource12.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15);
    linkedlist_resource12.clear();
    org.apache.zeppelin.display.AngularObject angularObject23 = angularObjectRegistry9.add("_GLOBAL_", (java.lang.Object)linkedlist_resource12, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup24 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry25 = interpreterGroup24.getInterpreterHookRegistry();
    java.lang.String str26 = interpreterGroup24.toString();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup28 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str29 = interpreterGroup28.getId();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array31 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter32 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter32, interpreter_array31);
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter34 = interpreterGroup28.putIfAbsent("pre_exec_dev", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter32);
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array35 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter36 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter36, interpreter_array35);
    boolean b38 = interpreterGroup24.replace("InterpreterGroup_1497134350790_986318210", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter32, (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter36);
    boolean b39 = linkedlist_resource12.containsAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter32);
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter40 = interpreterGroup0.put("org.apache.zeppelin.helium.ApplicationException: InterpreterGroup_1497134410556_1275540258", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}"+ "'", str26.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "InterpreterGroup_1497134435223_-449132903"+ "'", str29.equals("InterpreterGroup_1497134435223_-449132903"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter40);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.display.GUI gUI38 = interpreterContext35.getGui();
    java.lang.String str39 = interpreterContext35.getParagraphText();
    org.apache.zeppelin.interpreter.remote.RemoteEventClientWrapper remoteEventClientWrapper40 = interpreterContext35.getClient();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gUI38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[null]"+ "'", str39.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEventClientWrapper40);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }

    org.apache.zeppelin.resource.Resource resource0 = null;
    org.apache.zeppelin.tabledata.TableDataProxy tableDataProxy1 = new org.apache.zeppelin.tabledata.TableDataProxy(resource0);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Iterator<org.apache.zeppelin.tabledata.Row> iterator_row2 = tableDataProxy1.rows();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = org.apache.zeppelin.interpreter.InterpreterResult.Code.KEEP_PREVIOUS_RESULT;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult2 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "existing_process");
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult3 = new org.apache.zeppelin.interpreter.InterpreterResult(code0);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener4 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput5 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener4);
    interpreterOutput5.flush();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code7 = org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE;
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup8 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry9 = interpreterGroup8.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array10 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource11 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource11, resource_array10);
    org.apache.zeppelin.resource.Resource[] resource_array13 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource14 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource14, resource_array13);
    boolean b16 = arraylist_resource14.isEmpty();
    boolean b17 = linkedlist_resource11.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource14);
    linkedlist_resource11.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter19 = interpreterGroup8.get((java.lang.Object)linkedlist_resource11);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type20 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter21 = interpreterGroup8.get((java.lang.Object)type20);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult23 = new org.apache.zeppelin.interpreter.InterpreterResult(code7, type20, "shared");
    org.apache.zeppelin.interpreter.InterpreterResult.Code code24 = org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE;
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup25 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry26 = interpreterGroup25.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array27 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource28 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource28, resource_array27);
    org.apache.zeppelin.resource.Resource[] resource_array30 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource31 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource31, resource_array30);
    boolean b33 = arraylist_resource31.isEmpty();
    boolean b34 = linkedlist_resource28.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource31);
    linkedlist_resource28.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter36 = interpreterGroup25.get((java.lang.Object)linkedlist_resource28);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type37 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter38 = interpreterGroup25.get((java.lang.Object)type37);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult40 = new org.apache.zeppelin.interpreter.InterpreterResult(code24, type37, "shared");
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult42 = new org.apache.zeppelin.interpreter.InterpreterResult(code7, type37, "InterpreterGroup_1497134367518_-1467696533");
    interpreterOutput5.setType(type37);
    interpreterResult3.add(type37, "scoped");
    org.apache.zeppelin.interpreter.InterpreterResult.Code code46 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array47 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage48 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage48, interpreterResultMessage_array47);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult50 = new org.apache.zeppelin.interpreter.InterpreterResult(code46, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage48);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code51 = interpreterResult50.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage52 = interpreterResult50.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type53 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener54 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput55 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type53, interpreterResultMessageOutputListener54);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage57 = new org.apache.zeppelin.interpreter.InterpreterResultMessage(type53, "[null]");
    java.lang.String str58 = interpreterResultMessage57.getData();
    org.apache.zeppelin.tabledata.InterpreterResultTableData interpreterResultTableData59 = new org.apache.zeppelin.tabledata.InterpreterResultTableData(interpreterResultMessage57);
    interpreterResult50.add(interpreterResultMessage57);
    interpreterResult3.add(interpreterResultMessage57);
    org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.KEEP_PREVIOUS_RESULT + "'", code0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.KEEP_PREVIOUS_RESULT));
    org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE + "'", code7.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter19);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type20.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter21);
    org.junit.Assert.assertTrue("'" + code24 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE + "'", code24.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.INCOMPLETE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter36);
    org.junit.Assert.assertTrue("'" + type37 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type37.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage52);
    org.junit.Assert.assertTrue("'" + type53 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type53.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[null]"+ "'", str58.equals("[null]"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.display.GUI gUI38 = interpreterContext35.getGui();
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController39 = null;
    interpreterContext35.setRemoteWorksController(remoteWorksController39);
    java.lang.String str41 = interpreterContext35.getParagraphId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gUI38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "InterpreterGroup_1497134353138_86992792"+ "'", str41.equals("InterpreterGroup_1497134353138_86992792"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("InterpreterGroup_1497134376971_-1963975868");
    dependencyResolver1.addRepo("1", "1", false);
    org.sonatype.aether.repository.RemoteRepository remoteRepository7 = dependencyResolver1.delRepo("InterpreterGroup_1497134374528_1509866041");
    java.util.List<java.io.File> list_file9 = dependencyResolver1.load("InterpreterGroup_1497134408853_-1621173162");
    org.apache.zeppelin.resource.ResourceSet resourceSet11 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet13 = resourceSet11.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet15 = resourceSet13.filterByClassnameRegex("pre_exec");
    java.lang.String[] str_array36 = new java.lang.String[] { "anonymous", "hi!", "zeppelin.interpreter.port", "InterpreterGroup_1497134350790_986318210", "post_exec_dev", "_GLOBAL_", "existing_process", "existing_process", "zeppelin.interpreter.host", "pre_exec_dev", "InterpreterGroup_1497134350790_986318210", "pre_exec_dev", "pre_exec", "pre_exec_dev", "isolated", "pre_exec", "shared", "_GLOBAL_", "[null]", "existing_process" };
    java.util.ArrayList<java.lang.String> arraylist_str37 = new java.util.ArrayList<java.lang.String>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str37, str_array36);
    boolean b39 = resourceSet15.removeAll((java.util.Collection<java.lang.String>)arraylist_str37);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.sonatype.aether.resolution.ArtifactResult> list_artifactResult40 = dependencyResolver1.getArtifactsWithDep("InterpreterGroup_1497134421473_1415416272", (java.util.Collection<java.lang.String>)arraylist_str37);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteRepository7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }

    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeWatcher interpreterOutputChangeWatcher1 = new org.apache.zeppelin.interpreter.InterpreterOutputChangeWatcher(interpreterOutputChangeListener0);
    java.io.File file2 = null;
    // The following exception was thrown during execution in test generation
    try {
    interpreterOutputChangeWatcher1.watch(file2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }

    org.apache.zeppelin.tabledata.TableDataException tableDataException1 = new org.apache.zeppelin.tabledata.TableDataException("InterpreterGroup_1497134435045_-1316082174");

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getArtifactId();
    java.lang.String str10 = heliumPackage8.getPublishedDate();
    java.lang.String str11 = heliumPackage8.getArtifactId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener14 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry15 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener14);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry18 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry15, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject20 = heliumAppAngularObjectRegistry18.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput21 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext22 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry18, interpreterOutput21);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener23 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener24 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput25 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener23, interpreterOutputChangeListener24);
    org.apache.zeppelin.helium.ApplicationContext applicationContext26 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry18, interpreterOutput25);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput27 = applicationContext26.out;
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener28 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput29 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener28);
    interpreterOutput29.flush();
    interpreterOutput29.write((int)(short)-1);
    int i33 = interpreterOutput29.size();
    java.net.URL uRL34 = null;
    interpreterOutput29.write(uRL34);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener36 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput37 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener36);
    interpreterOutput37.addResourceSearchPath("isolated");
    byte[] byte_array40 = interpreterOutput37.toByteArray();
    interpreterOutput29.write(byte_array40, (int)'#', (int)(byte)0);
    interpreterOutput27.write(byte_array40, (int)(short)1, (int)(byte)0);
    int i47 = resourceSet4.indexOf((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    linkedlist_resource1.addLast(resource8);
    java.util.ListIterator<org.apache.zeppelin.resource.Resource> listiterator_resource10 = linkedlist_resource1.listIterator();
    org.apache.zeppelin.resource.Resource resource11 = linkedlist_resource1.remove();
    org.apache.zeppelin.resource.Resource resource12 = linkedlist_resource1.peekLast();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource12);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.shutdown();
    java.lang.String str16 = interpreterGroup0.getId();
    java.util.Set<java.util.Map.Entry<java.lang.String,java.util.List<org.apache.zeppelin.interpreter.Interpreter>>> set_entry_str_list_interpreter17 = interpreterGroup0.entrySet();
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry18 = interpreterGroup0.getAngularObjectRegistry();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup20 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry21 = interpreterGroup20.getInterpreterHookRegistry();
    java.lang.String str22 = interpreterGroup20.toString();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup24 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str25 = interpreterGroup24.getId();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array27 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter28 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter28, interpreter_array27);
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter30 = interpreterGroup24.putIfAbsent("pre_exec_dev", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter28);
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array31 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter32 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter32, interpreter_array31);
    boolean b34 = interpreterGroup20.replace("InterpreterGroup_1497134350790_986318210", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter28, (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter32);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup35 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    java.lang.String str36 = interpreterGroup35.getId();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array38 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter39 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter39, interpreter_array38);
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter41 = interpreterGroup35.putIfAbsent("pre_exec_dev", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter39);
    boolean b42 = interpreterGroup0.replace("anonymous", (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter28, (java.util.List<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "InterpreterGroup_1497134435898_-379328342"+ "'", str16.equals("InterpreterGroup_1497134435898_-379328342"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_str_list_interpreter17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}"+ "'", str22.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "InterpreterGroup_1497134435900_428536048"+ "'", str25.equals("InterpreterGroup_1497134435900_428536048"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "InterpreterGroup_1497134435900_-1580344285"+ "'", str36.equals("InterpreterGroup_1497134435900_-1580344285"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }

    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory2 = new org.apache.zeppelin.interpreter.remote.ClientFactory("", 59683);
    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory5 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client6 = null;
    clientFactory5.passivateObject(pooledobject_client6);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client8 = null;
    clientFactory5.passivateObject(pooledobject_client8);
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client10 = null;
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client11 = clientFactory5.wrap(client10);
    clientFactory2.destroyObject(pooledobject_client11);
    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory15 = new org.apache.zeppelin.interpreter.remote.ClientFactory("", 59683);
    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory18 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client19 = null;
    clientFactory18.passivateObject(pooledobject_client19);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client21 = null;
    clientFactory18.passivateObject(pooledobject_client21);
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client23 = null;
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client24 = clientFactory18.wrap(client23);
    clientFactory15.destroyObject(pooledobject_client24);
    clientFactory2.activateObject(pooledobject_client24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pooledobject_client11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pooledobject_client24);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterGroup> map_str_interpreterGroup5 = null;
    interpreterGroup0.close(map_str_interpreterGroup5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "zeppelin.interpreter.port");
    java.util.Set<java.lang.String> set_str9 = interpreterGroup0.keySet();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup10 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool11 = interpreterGroup10.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry13 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup10.setInterpreterHookRegistry(interpreterHookRegistry13);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption16 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption17 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption16);
    boolean b18 = interpreterGroup10.contains((java.lang.Object)interpreterOption16);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup19 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool20 = interpreterGroup19.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry22 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup19.setInterpreterHookRegistry(interpreterHookRegistry22);
    interpreterGroup10.setInterpreterHookRegistry(interpreterHookRegistry22);
    interpreterGroup10.shutdown();
    interpreterGroup0.putAll((java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.interpreter.Interpreter>>)interpreterGroup10);
    org.apache.zeppelin.resource.Resource[] resource_array28 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource29 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource29, resource_array28);
    org.apache.zeppelin.resource.Resource[] resource_array31 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource32 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource32, resource_array31);
    boolean b34 = arraylist_resource32.isEmpty();
    boolean b35 = linkedlist_resource29.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource32);
    org.apache.zeppelin.resource.Resource resource36 = null;
    boolean b37 = linkedlist_resource29.add(resource36);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource38 = linkedlist_resource29.iterator();
    java.lang.String str39 = linkedlist_resource29.toString();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry41 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    int i42 = linkedlist_resource29.lastIndexOf((java.lang.Object)interpreterHookRegistry41);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption43 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array44 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption43 };
    org.apache.zeppelin.display.ui.Select select45 = new org.apache.zeppelin.display.ui.Select("", (java.lang.Object)interpreterHookRegistry41, paramOption_array44);
    java.lang.String str49 = interpreterHookRegistry41.get("org.apache.zeppelin.interpreter.InterpreterException: ", "", "InterpreterGroup_1497134371990_1999798592");
    interpreterHookRegistry41.addRepl("InterpreterGroup_1497134408853_-1621173162", "pre_exec_dev");
    interpreterGroup10.setInterpreterHookRegistry(interpreterHookRegistry41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[null]"+ "'", str39.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }

    org.apache.zeppelin.user.UsernamePassword usernamePassword2 = new org.apache.zeppelin.user.UsernamePassword("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    usernamePassword2.setPassword("post_exec_dev");
    java.lang.String str5 = usernamePassword2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "post_exec_dev"+ "'", str5.equals("post_exec_dev"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }

    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource0 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    java.lang.String str1 = remoteZeppelinServerResource0.getOwnerKey();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type type2 = org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS;
    remoteZeppelinServerResource0.setResourceType(type2);
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource4 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    java.lang.String str5 = remoteZeppelinServerResource4.getOwnerKey();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type type6 = org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS;
    remoteZeppelinServerResource4.setResourceType(type6);
    remoteZeppelinServerResource0.setResourceType(type6);
    java.lang.String str9 = remoteZeppelinServerResource0.getOwnerKey();
    java.lang.Object obj10 = remoteZeppelinServerResource0.getData();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource11 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource12 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    java.lang.String str13 = remoteZeppelinServerResource12.getOwnerKey();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type type14 = org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS;
    remoteZeppelinServerResource12.setResourceType(type14);
    remoteZeppelinServerResource11.setResourceType(type14);
    remoteZeppelinServerResource0.setResourceType(type14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS + "'", type2.equals(org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS + "'", type6.equals(org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS + "'", type14.equals(org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption2.setHost("[null]");
    interpreterOption2.setPerNote("InterpreterGroup_1497134350938_711831855");
    interpreterOption2.setPerUser("InterpreterGroup_1497134384557_-1299248309");
    interpreterOption2.setPerNote("InterpreterGroup_1497134425803_-166526896");
    boolean b11 = interpreterOption2.isSession();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    select11.setDisplayName("[null]");
    java.lang.String str14 = select11.getArgument();
    select11.setArgument("InterpreterGroup_1497134350790_986318210");
    select11.setArgument("InterpreterGroup_1497134367518_-1467696533");
    select11.setDisplayName("InterpreterGroup_1497134409064_585101077");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener7 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry8 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener7);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry11 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry8, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject13 = heliumAppAngularObjectRegistry11.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput14 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext15 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry11, interpreterOutput14);
    org.apache.zeppelin.display.AngularObject angularObject17 = heliumAppAngularObjectRegistry11.remove("InterpreterGroup_1497134353138_86992792");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener25 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry26 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener25);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry29 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry26, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject31 = heliumAppAngularObjectRegistry29.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput32 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext33 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry29, interpreterOutput32);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener34 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener35 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput36 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener34, interpreterOutputChangeListener35);
    org.apache.zeppelin.helium.ApplicationContext applicationContext37 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry29, interpreterOutput36);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput38 = applicationContext37.out;
    org.apache.zeppelin.helium.ApplicationContext applicationContext39 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134374771_373499119", "InterpreterGroup_1497134367518_-1467696533", "isolated", heliumAppAngularObjectRegistry11, interpreterOutput38);
    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream40 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type41 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener42 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput43 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type41, interpreterResultMessageOutputListener42);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type44 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput43.setType(type44);
    angularobject_outputStream40.set((java.io.OutputStream)interpreterResultMessageOutput43);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type47 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener48 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput49 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type47, interpreterResultMessageOutputListener48);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage50 = interpreterResultMessageOutput49.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage51 = interpreterResultMessageOutput49.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup52 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry53 = interpreterGroup52.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array54 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource55 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource55, resource_array54);
    org.apache.zeppelin.resource.Resource[] resource_array57 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource58 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource58, resource_array57);
    boolean b60 = arraylist_resource58.isEmpty();
    boolean b61 = linkedlist_resource55.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource58);
    linkedlist_resource55.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter63 = interpreterGroup52.get((java.lang.Object)linkedlist_resource55);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type64 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter65 = interpreterGroup52.get((java.lang.Object)type64);
    interpreterResultMessageOutput49.setType(type64);
    interpreterResultMessageOutput43.setType(type64);
    org.slf4j.Logger logger68 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream69 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger68);
    byte[] byte_array73 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream69.write(byte_array73, (int)'a', 3);
    interpreterResultMessageOutput43.write(byte_array73, (int)'#', 2);
    interpreterOutput38.write(byte_array73);
    interpreterOutput38.writeResource("InterpreterGroup_1497134376922_-128746751");
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage83 = interpreterOutput38.toInterpreterResultMessage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput38);
    org.junit.Assert.assertTrue("'" + type44 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type44.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter63);
    org.junit.Assert.assertTrue("'" + type64 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type64.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage83);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("pre_exec");
    java.util.List<java.io.File> list_file2 = dependencyContext1.getFiles();
    dependencyContext1.reset();
    org.apache.zeppelin.dep.Dependency dependency5 = dependencyContext1.load("InterpreterGroup_1497134387007_1195822394");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency5);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory0 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService3 = executorFactory0.createOrGet("scoped", 2);
    java.util.concurrent.ExecutorService executorService5 = executorFactory0.createOrGet("post_exec_dev");
    java.util.concurrent.ExecutorService executorService6 = executorFactory0.getDefaultExecutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService6);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    boolean b3 = interpreterOption2.perNoteShared();
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption4 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption2);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption5 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption4);
    java.util.List<java.lang.String> list_str6 = interpreterOption5.getUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    org.apache.zeppelin.display.GUI gUI5 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input6 = gUI5.getForms();
    java.lang.Object obj9 = gUI5.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    boolean b10 = interpreterProperty4.equals(obj9);
    java.lang.String str11 = interpreterProperty4.getPropertyName();
    interpreterProperty4.setDefaultValue("InterpreterGroup_1497134374771_373499119");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "1"+ "'", obj9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"+ "'", str11.equals("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("InterpreterGroup_1497134376971_-1963975868");
    dependencyResolver1.addRepo("1", "1", false);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup7 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool8 = interpreterGroup7.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry10 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup7.setInterpreterHookRegistry(interpreterHookRegistry10);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption13 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption14 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption13);
    boolean b15 = interpreterGroup7.contains((java.lang.Object)interpreterOption13);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup16 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool17 = interpreterGroup16.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry19 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup16.setInterpreterHookRegistry(interpreterHookRegistry19);
    interpreterGroup7.setInterpreterHookRegistry(interpreterHookRegistry19);
    java.lang.String str22 = interpreterGroup7.toString();
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterGroup> map_str_interpreterGroup23 = null;
    interpreterGroup7.close(map_str_interpreterGroup23, "{}", "InterpreterGroup_1497134350938_711831855");
    java.util.Set<java.lang.String> set_str27 = interpreterGroup7.keySet();
    java.util.List<java.io.File> list_file28 = dependencyResolver1.load("InterpreterGroup_1497134369176_-1878842789", (java.util.Collection<java.lang.String>)set_str27);
    org.sonatype.aether.repository.RemoteRepository remoteRepository30 = dependencyResolver1.delRepo("InterpreterGroup_1497134350938_711831855");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}"+ "'", str22.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteRepository30);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    java.lang.String str37 = interpreterContext35.getReplName();
    java.lang.String str38 = interpreterContext35.getReplName();
    java.lang.String str39 = interpreterContext35.getParagraphId();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo40 = interpreterContext35.getAuthenticationInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str37.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str38.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "InterpreterGroup_1497134353138_86992792"+ "'", str39.equals("InterpreterGroup_1497134353138_86992792"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo40);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet5 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet7 = resourceSet5.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet9 = resourceSet7.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet11 = resourceSet9.filterByName("InterpreterGroup_1497134350938_711831855");
    boolean b12 = resourceSet2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)resourceSet11);
    org.apache.zeppelin.resource.Resource resource13 = resourceSet11.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource13);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }

    org.apache.zeppelin.resource.ResourcePoolConnector resourcePoolConnector1 = null;
    org.apache.zeppelin.resource.DistributedResourcePool distributedResourcePool2 = new org.apache.zeppelin.resource.DistributedResourcePool("InterpreterGroup_1497134410556_1275540258", resourcePoolConnector1);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource7 = distributedResourcePool2.get("post_exec_dev", "InterpreterGroup_1497134410098_-512670828", "InterpreterGroup_1497134429570_1552317239", true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.addResourceSearchPath("isolated");
    byte[] byte_array4 = interpreterOutput1.toByteArray();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener5 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput6 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener5);
    interpreterOutput6.flush();
    interpreterOutput6.write((int)(short)-1);
    int i10 = interpreterOutput6.size();
    java.net.URL uRL11 = null;
    interpreterOutput6.write(uRL11);
    org.slf4j.Logger logger13 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream14 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger13);
    byte[] byte_array18 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream14.write(byte_array18, (int)'a', 3);
    interpreterOutput6.write(byte_array18);
    interpreterOutput1.write(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code10 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array11 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage12 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12, interpreterResultMessage_array11);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult14 = new org.apache.zeppelin.interpreter.InterpreterResult(code10, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage12);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code15 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array16 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage17 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17, interpreterResultMessage_array16);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code15, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage17);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code20 = interpreterResult19.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage21 = interpreterResult19.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code22 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array23 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage24 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage24, interpreterResultMessage_array23);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult26 = new org.apache.zeppelin.interpreter.InterpreterResult(code22, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage24);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code27 = interpreterResult26.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage28 = interpreterResult26.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code29 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array30 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage31, interpreterResultMessage_array30);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult33 = new org.apache.zeppelin.interpreter.InterpreterResult(code29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage31);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code34 = interpreterResult33.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage35 = interpreterResult33.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code36 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array37 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage38 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage38, interpreterResultMessage_array37);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult40 = new org.apache.zeppelin.interpreter.InterpreterResult(code36, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage38);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code41 = interpreterResult40.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage42 = interpreterResult40.message();
    java.util.List[] list_array44 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array45 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array44;
    list_interpreterResultMessage_array45[0] = arraylist_interpreterResultMessage12;
    list_interpreterResultMessage_array45[1] = list_interpreterResultMessage21;
    list_interpreterResultMessage_array45[2] = list_interpreterResultMessage28;
    list_interpreterResultMessage_array45[3] = list_interpreterResultMessage35;
    list_interpreterResultMessage_array45[4] = list_interpreterResultMessage42;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array56 = linkedlist_resource1.toArray(list_interpreterResultMessage_array45);
    org.apache.zeppelin.resource.Resource resource57 = null;
    boolean b58 = linkedlist_resource1.offerFirst(resource57);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource59 = linkedlist_resource1.iterator();
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource60 = linkedlist_resource1.descendingIterator();
    org.apache.zeppelin.resource.Resource resource61 = linkedlist_resource1.peekFirst();
    org.apache.zeppelin.resource.Resource resource62 = null;
    boolean b63 = linkedlist_resource1.add(resource62);
    int i64 = linkedlist_resource1.size();
    org.apache.zeppelin.resource.Resource resource65 = linkedlist_resource1.element();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource65);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.Object obj38 = gUI19.textbox("", "zeppelin.interpreter.host");
    org.apache.zeppelin.resource.Resource[] resource_array45 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource46 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource46, resource_array45);
    org.apache.zeppelin.resource.Resource[] resource_array48 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource49 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource49, resource_array48);
    boolean b51 = arraylist_resource49.isEmpty();
    boolean b52 = linkedlist_resource46.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource49);
    org.apache.zeppelin.resource.Resource resource53 = null;
    boolean b54 = linkedlist_resource46.add(resource53);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource55 = linkedlist_resource46.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo56 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i57 = linkedlist_resource46.indexOf((java.lang.Object)authenticationInfo56);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj58 = null;
    org.apache.zeppelin.display.GUI gUI59 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener61 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry62 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener61);
    org.apache.zeppelin.display.AngularObject angularObject67 = angularObjectRegistry62.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool69 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array70 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner71 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b72 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner71, interpreterContextRunner_array70);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput73 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController74 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext75 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo56, map_str_obj58, gUI59, angularObjectRegistry62, (org.apache.zeppelin.resource.ResourcePool)localResourcePool69, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner71, interpreterOutput73, remoteWorksController74);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext75);
    java.lang.String str77 = interpreterContext75.getReplName();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo78 = interpreterContext75.getAuthenticationInfo();
    java.lang.Object obj79 = gUI19.input("InterpreterGroup_1497134353138_86992792", (java.lang.Object)interpreterContext75);
    java.lang.String str80 = gUI19.toJson();
    gUI19.convertOldInput();
    java.lang.Object obj83 = gUI19.textbox("[]");
    java.lang.String str84 = gUI19.toJson();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "zeppelin.interpreter.host"+ "'", obj38.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str77.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj83 + "' != '" + ""+ "'", obj83.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array1 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage2 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage2, interpreterResultMessage_array1);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult4 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage2);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type5 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    interpreterResult4.add(type5, "InterpreterGroup_1497134353138_86992792");
    java.lang.String str8 = interpreterResult4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type5.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "%angular InterpreterGroup_1497134353138_86992792"+ "'", str8.equals("%angular InterpreterGroup_1497134353138_86992792"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption2.setHost("[null]");
    interpreterOption2.setPerNote("InterpreterGroup_1497134350938_711831855");
    interpreterOption2.setPerUser("InterpreterGroup_1497134384557_-1299248309");
    boolean b9 = interpreterOption2.permissionIsSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver36 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader37 = new org.apache.zeppelin.helium.ApplicationLoader((org.apache.zeppelin.resource.ResourcePool)localResourcePool29, dependencyResolver36);
    org.apache.zeppelin.helium.HeliumType heliumType38 = null;
    java.lang.String[][] str_array_array43 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage46 = new org.apache.zeppelin.helium.HeliumPackage(heliumType38, "", "", "hi!", "hi!", str_array_array43, "post_exec_dev", "post_exec_dev");
    java.lang.String str47 = heliumPackage46.getDescription();
    org.apache.zeppelin.helium.SpellPackageInfo spellPackageInfo48 = heliumPackage46.getSpellInfo();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener56 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry57 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener56);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry60 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry57, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject62 = heliumAppAngularObjectRegistry60.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput63 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext64 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry60, interpreterOutput63);
    org.apache.zeppelin.display.AngularObject angularObject66 = heliumAppAngularObjectRegistry60.remove("InterpreterGroup_1497134353138_86992792");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener74 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry75 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener74);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry78 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry75, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject80 = heliumAppAngularObjectRegistry78.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput81 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext82 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry78, interpreterOutput81);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener83 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener84 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput85 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener83, interpreterOutputChangeListener84);
    org.apache.zeppelin.helium.ApplicationContext applicationContext86 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry78, interpreterOutput85);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput87 = applicationContext86.out;
    org.apache.zeppelin.helium.ApplicationContext applicationContext88 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134374771_373499119", "InterpreterGroup_1497134367518_-1467696533", "isolated", heliumAppAngularObjectRegistry60, interpreterOutput87);
    java.lang.String str89 = applicationContext88.getParagraphId();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.Application application90 = applicationLoader37.load(heliumPackage46, applicationContext88);
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.helium.ApplicationException");
    } catch (org.apache.zeppelin.helium.ApplicationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(spellPackageInfo48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + "InterpreterGroup_1497134367518_-1467696533"+ "'", str89.equals("InterpreterGroup_1497134367518_-1467696533"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("scoped", 2);
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory5 = org.apache.zeppelin.scheduler.SchedulerFactory.singleton();
    org.apache.zeppelin.scheduler.ParallelScheduler parallelScheduler7 = new org.apache.zeppelin.scheduler.ParallelScheduler("post_exec_dev", executorService4, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory5, (int)(byte)10);
    org.apache.zeppelin.scheduler.Job job9 = parallelScheduler7.removeFromWaitingQueue("InterpreterGroup_1497134376922_-128746751");
    parallelScheduler7.setMaxConcurrency(3);
    org.apache.zeppelin.scheduler.Job job12 = null;
    // The following exception was thrown during execution in test generation
    try {
    parallelScheduler7.submit(job12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerFactory5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job9);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.perNoteShared();
    boolean b3 = interpreterOption1.permissionIsSet();
    interpreterOption1.setHost("InterpreterGroup_1497134367518_-1467696533");
    interpreterOption1.setUserImpersonate(true);
    java.lang.String str8 = interpreterOption1.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "InterpreterGroup_1497134367518_-1467696533"+ "'", str8.equals("InterpreterGroup_1497134367518_-1467696533"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }

    org.apache.zeppelin.resource.Resource[] resource_array10 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource11 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource11, resource_array10);
    org.apache.zeppelin.resource.Resource[] resource_array13 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource14 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource14, resource_array13);
    boolean b16 = arraylist_resource14.isEmpty();
    boolean b17 = linkedlist_resource11.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource14);
    org.apache.zeppelin.resource.Resource resource18 = null;
    boolean b19 = linkedlist_resource11.add(resource18);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource20 = linkedlist_resource11.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo21 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i22 = linkedlist_resource11.indexOf((java.lang.Object)authenticationInfo21);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj23 = null;
    org.apache.zeppelin.display.GUI gUI24 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener26 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry27 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener26);
    org.apache.zeppelin.display.AngularObject angularObject32 = angularObjectRegistry27.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool34 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array35 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner36 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner36, interpreterContextRunner_array35);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput38 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController39 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext40 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo21, map_str_obj23, gUI24, angularObjectRegistry27, (org.apache.zeppelin.resource.ResourcePool)localResourcePool34, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner36, interpreterOutput38, remoteWorksController39);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry41 = interpreterContext40.getAngularObjectRegistry();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo42 = interpreterContext40.getAuthenticationInfo();
    org.apache.zeppelin.display.GUI gUI43 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input44 = gUI43.getForms();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj45 = gUI43.getParams();
    org.apache.zeppelin.display.GUI gUI46 = new org.apache.zeppelin.display.GUI();
    java.lang.Object obj48 = gUI46.textbox("{\"params\":{},\"forms\":{\"InterpreterGroup_1497134350790_986318210\":{\"type\":\"TextBox\",\"name\":\"InterpreterGroup_1497134350790_986318210\",\"displayName\":\"InterpreterGroup_1497134350790_986318210\",\"defaultValue\":\"1\",\"hidden\":false}}}");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener50 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry51 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener50);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry54 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry51, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject58 = angularObjectRegistry51.remove("pre_exec_dev", "{}", "{}");
    java.util.List<org.apache.zeppelin.display.AngularObject> list_angularObject61 = angularObjectRegistry51.getAll("InterpreterGroup_1497134377636_1315933403", "InterpreterGroup_1497134371990_1999798592");
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool63 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.Resource resource65 = localResourcePool63.remove("InterpreterGroup_1497134350790_986318210");
    java.lang.String str66 = localResourcePool63.id();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner> list_interpreterContextRunner67 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener68 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput69 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener68);
    interpreterOutput69.flush();
    interpreterOutput69.write((int)(short)-1);
    int i73 = interpreterOutput69.size();
    java.net.URL uRL74 = null;
    interpreterOutput69.write(uRL74);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener76 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput77 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener76);
    interpreterOutput77.addResourceSearchPath("isolated");
    byte[] byte_array80 = interpreterOutput77.toByteArray();
    interpreterOutput69.write(byte_array80, (int)'#', (int)(byte)0);
    java.net.URL uRL84 = null;
    interpreterOutput69.write(uRL84);
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController86 = null;
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventClient remoteInterpreterEventClient87 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext88 = new org.apache.zeppelin.interpreter.InterpreterContext("org.apache.zeppelin.interpreter.InterpreterException: InterpreterGroup_1497134377064_955397632", "InterpreterGroup_1497134409064_585101077", "InterpreterGroup_1497134435045_-1316082174", "", "{AngularObject{noteId='null', paragraphId='null', object=null, name='null'}=[]}", authenticationInfo42, map_str_obj45, gUI46, angularObjectRegistry51, (org.apache.zeppelin.resource.ResourcePool)localResourcePool63, list_interpreterContextRunner67, interpreterOutput69, remoteWorksController86, remoteInterpreterEventClient87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj48 + "' != '" + ""+ "'", obj48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_angularObject61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "zeppelin.interpreter.port"+ "'", str66.equals("zeppelin.interpreter.port"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array80);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener8 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry9 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener8);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry12 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry9, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject14 = heliumAppAngularObjectRegistry12.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput15 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext16 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry12, interpreterOutput15);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener17 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener18 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput19 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener17, interpreterOutputChangeListener18);
    org.apache.zeppelin.helium.ApplicationContext applicationContext20 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry12, interpreterOutput19);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput21 = applicationContext20.out;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput22 = interpreterOutput21.getCurrentOutput();
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput23 = interpreterOutput21.getCurrentOutput();
    org.apache.zeppelin.resource.Resource[] resource_array27 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource28 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource28, resource_array27);
    org.apache.zeppelin.resource.Resource[] resource_array30 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource31 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource31, resource_array30);
    boolean b33 = arraylist_resource31.isEmpty();
    boolean b34 = linkedlist_resource28.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource31);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption35 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array36 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption35 };
    org.apache.zeppelin.display.ui.Select select37 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource28, paramOption_array36);
    org.apache.zeppelin.display.ui.Select select38 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array36);
    org.apache.zeppelin.display.ui.Select select39 = new org.apache.zeppelin.display.ui.Select("InterpreterGroup_1497134404865_16666424", (java.lang.Object)interpreterResultMessageOutput23, paramOption_array36);
    org.apache.zeppelin.tabledata.Row row40 = new org.apache.zeppelin.tabledata.Row((java.lang.Object[])paramOption_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterResultMessageOutput22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterResultMessageOutput23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select37);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }

    org.apache.zeppelin.resource.WellKnownResourceName wellKnownResourceName0 = org.apache.zeppelin.resource.WellKnownResourceName.ZeppelinReplResult;
    java.lang.String str1 = wellKnownResourceName0.toString();
    java.lang.String str2 = wellKnownResourceName0.toString();
    java.lang.String str3 = wellKnownResourceName0.toString();
    org.junit.Assert.assertTrue("'" + wellKnownResourceName0 + "' != '" + org.apache.zeppelin.resource.WellKnownResourceName.ZeppelinReplResult + "'", wellKnownResourceName0.equals(org.apache.zeppelin.resource.WellKnownResourceName.ZeppelinReplResult));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "zeppelin.repl.result"+ "'", str1.equals("zeppelin.repl.result"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "zeppelin.repl.result"+ "'", str2.equals("zeppelin.repl.result"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "zeppelin.repl.result"+ "'", str3.equals("zeppelin.repl.result"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }

    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage2 = org.apache.zeppelin.interpreter.ResultMessages.getExceedsLimitSizeMessage((int)(short)-1, "InterpreterGroup_1497134387851_-94093795");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage2);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener2 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput3 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type1, interpreterResultMessageOutputListener2);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput3.setType(type4);
    angularobject_outputStream0.set((java.io.OutputStream)interpreterResultMessageOutput3);
    boolean b8 = angularobject_outputStream0.equals((java.lang.Object)102400);
    java.lang.String str9 = angularobject_outputStream0.toString();
    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream10 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener12 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry13 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener12);
    org.apache.zeppelin.resource.Resource[] resource_array15 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource16 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16, resource_array15);
    org.apache.zeppelin.resource.Resource[] resource_array18 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource19 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19, resource_array18);
    boolean b21 = arraylist_resource19.isEmpty();
    boolean b22 = linkedlist_resource16.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19);
    linkedlist_resource16.clear();
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry13.add("_GLOBAL_", (java.lang.Object)linkedlist_resource16, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.display.AngularObjectWatcher angularObjectWatcher28 = null;
    angularObject27.removeWatcher(angularObjectWatcher28);
    java.lang.String str30 = angularObject27.getNoteId();
    java.lang.Object obj31 = angularObject27.get();
    org.apache.zeppelin.display.AngularObjectListener angularObjectListener32 = angularObject27.getListener();
    angularobject_outputStream10.setListener(angularObjectListener32);
    angularobject_outputStream0.setListener(angularObjectListener32);
    angularobject_outputStream0.clearAllWatchers();
    java.lang.String str36 = angularobject_outputStream0.getNoteId();
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type4.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}"+ "'", str9.equals("AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"+ "'", str30.equals("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectListener32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.resource.Resource resource39 = localResourcePool29.get("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", "org.apache.zeppelin.interpreter.InterpreterException: ", "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.dep.RepositoryListener repositoryListener43 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent44 = null;
    repositoryListener43.metadataDownloading(repositoryEvent44);
    org.sonatype.aether.RepositoryEvent repositoryEvent46 = null;
    repositoryListener43.metadataDownloaded(repositoryEvent46);
    localResourcePool29.put("InterpreterGroup_1497134361094_1261121192", "InterpreterGroup_1497134419879_18384985", "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", (java.lang.Object)repositoryListener43);
    org.sonatype.aether.RepositoryEvent repositoryEvent49 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener43.artifactResolved(repositoryEvent49);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource39);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getDescription();
    java.lang.String[][] str_array_array10 = heliumPackage8.getResources();
    java.lang.String str11 = heliumPackage8.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "post_exec_dev"+ "'", str11.equals("post_exec_dev"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    linkedlist_resource5.clear();
    org.apache.zeppelin.display.AngularObject angularObject16 = angularObjectRegistry2.add("_GLOBAL_", (java.lang.Object)linkedlist_resource5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener17 = angularObjectRegistry2.getListener();
    java.util.List<org.apache.zeppelin.display.AngularObject> list_angularObject20 = angularObjectRegistry2.getAll("%angular [null]", "InterpreterGroup_1497134431801_1749375222");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistryListener17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_angularObject20);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    linkedlist_resource5.clear();
    org.apache.zeppelin.display.AngularObject angularObject16 = angularObjectRegistry2.add("_GLOBAL_", (java.lang.Object)linkedlist_resource5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    angularObject16.clearAllWatchers();
    java.lang.String str18 = angularObject16.getParagraphId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "pre_exec"+ "'", str18.equals("pre_exec"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = org.apache.zeppelin.interpreter.InterpreterResult.Code.ERROR;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult1 = new org.apache.zeppelin.interpreter.InterpreterResult(code0);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult3 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "InterpreterGroup_1497134361189_-653890590");
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener5 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput6 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type4, interpreterResultMessageOutputListener5);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage7 = interpreterResultMessageOutput6.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage8 = interpreterResultMessageOutput6.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage9 = interpreterResultMessageOutput6.toInterpreterResultMessage();
    interpreterResult3.add(interpreterResultMessage9);
    org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Code.ERROR + "'", code0.equals(org.apache.zeppelin.interpreter.InterpreterResult.Code.ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage9);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.display.AngularObject angularObject7 = angularObjectRegistry2.remove("InterpreterGroup_1497134412057_-886896671", "AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}", "InterpreterGroup_1497134410397_-259667388", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject7);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty2 = new org.apache.zeppelin.interpreter.InterpreterProperty("{\"params\":{},\"forms\":{}}", "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>");
    java.lang.String str3 = interpreterProperty2.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>"+ "'", str3.equals("<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    java.lang.String str1 = angularobject_outputStream0.getNoteId();
    angularobject_outputStream0.setParagraphId("isolated");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener5 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry6 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource9 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource9, resource_array8);
    org.apache.zeppelin.resource.Resource[] resource_array11 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource12 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource12, resource_array11);
    boolean b14 = arraylist_resource12.isEmpty();
    boolean b15 = linkedlist_resource9.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource12);
    linkedlist_resource9.clear();
    org.apache.zeppelin.display.AngularObject angularObject20 = angularObjectRegistry6.add("_GLOBAL_", (java.lang.Object)linkedlist_resource9, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.display.AngularObjectListener angularObjectListener21 = angularObject20.getListener();
    angularobject_outputStream0.setListener(angularObjectListener21);
    java.lang.String str23 = angularobject_outputStream0.getNoteId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectListener21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.addResourceSearchPath("isolated");
    byte[] byte_array4 = interpreterOutput1.toByteArray();
    interpreterOutput1.write((int)(byte)1);
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput7 = interpreterOutput1.getCurrentOutput();
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput8 = interpreterOutput1.getCurrentOutput();
    java.io.File file9 = null;
    interpreterResultMessageOutput8.write(file9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessageOutput7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessageOutput8);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterGroup> map_str_interpreterGroup5 = null;
    interpreterGroup0.close(map_str_interpreterGroup5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "zeppelin.interpreter.port");
    java.util.Set<java.lang.String> set_str9 = interpreterGroup0.keySet();
    java.util.Enumeration<java.util.List<org.apache.zeppelin.interpreter.Interpreter>> enumeration_list_interpreter10 = interpreterGroup0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_list_interpreter10);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener1 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry2 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    linkedlist_resource5.clear();
    org.apache.zeppelin.display.AngularObject angularObject16 = angularObjectRegistry2.add("_GLOBAL_", (java.lang.Object)linkedlist_resource5, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    java.lang.String str17 = angularObject16.toString();
    angularObject16.emit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "AngularObject{noteId='<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>', paragraphId='pre_exec', object=[], name='_GLOBAL_'}"+ "'", str17.equals("AngularObject{noteId='<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>', paragraphId='pre_exec', object=[], name='_GLOBAL_'}"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet1 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet3 = resourceSet1.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet5 = resourceSet3.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.interpreter.InterpreterResult.Code code6 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult7 = new org.apache.zeppelin.interpreter.InterpreterResult(code6);
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage8 = interpreterResult7.message();
    boolean b9 = resourceSet3.removeAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)list_interpreterResultMessage8);
    org.apache.zeppelin.resource.Resource[] resource_array11 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource12 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource12, resource_array11);
    org.apache.zeppelin.resource.Resource[] resource_array14 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource15 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15, resource_array14);
    boolean b17 = arraylist_resource15.isEmpty();
    boolean b18 = linkedlist_resource12.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption19 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array20 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption19 };
    org.apache.zeppelin.display.ui.Select select21 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource12, paramOption_array20);
    org.apache.zeppelin.display.ui.Select select22 = new org.apache.zeppelin.display.ui.Select("post_exec_dev", (java.lang.Object)list_interpreterResultMessage8, paramOption_array20);
    java.lang.String str23 = select22.getArgument();
    java.lang.String str24 = select22.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption2.setHost("[null]");
    interpreterOption2.setPort(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    java.util.Set<java.lang.String> set_str15 = interpreterGroup0.keySet();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener17 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry18 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener17);
    org.apache.zeppelin.display.AngularObject angularObject23 = angularObjectRegistry18.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    boolean b24 = interpreterGroup0.equals((java.lang.Object)"InterpreterGroup_1497134350938_711831855");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver36 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader37 = new org.apache.zeppelin.helium.ApplicationLoader((org.apache.zeppelin.resource.ResourcePool)localResourcePool29, dependencyResolver36);
    java.lang.String[] str_array38 = new java.lang.String[] {  };
    java.lang.String[][] str_array_array39 = new java.lang.String[][] { str_array38 };
    org.apache.zeppelin.resource.ResourceSet resourceSet42 = applicationLoader37.findRequiredResourceSet(str_array_array39, "{envName=zeppelin.interpreter.port, propertyName=<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>, defaultValue={}, description=           anonymous}", "InterpreterGroup_1497134387892_-1132206419");
    org.apache.zeppelin.resource.Resource resource43 = resourceSet42.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource43);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    interpreterProperty4.setDescription("{\"params\":{},\"forms\":{\"InterpreterGroup_1497134350790_986318210\":{\"type\":\"TextBox\",\"name\":\"InterpreterGroup_1497134350790_986318210\",\"displayName\":\"InterpreterGroup_1497134350790_986318210\",\"defaultValue\":\"1\",\"hidden\":false}}}");
    interpreterProperty4.setEnvName("InterpreterGroup_1497134377636_1315933403");
    interpreterProperty4.setDescription("");
    interpreterProperty4.setDefaultValue("InterpreterGroup_1497134374771_373499119");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }

    org.apache.zeppelin.interpreter.InterpreterException interpreterException1 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.interpreter.InterpreterException interpreterException3 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.helium.ApplicationException applicationException4 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)interpreterException3);
    interpreterException1.addSuppressed((java.lang.Throwable)interpreterException3);
    org.apache.zeppelin.interpreter.InterpreterException interpreterException7 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.helium.ApplicationException applicationException8 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)interpreterException7);
    interpreterException3.addSuppressed((java.lang.Throwable)interpreterException7);
    java.lang.String str10 = org.apache.zeppelin.interpreter.InterpreterUtils.getMostRelevantMessage((java.lang.Exception)interpreterException7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    java.lang.String str37 = interpreterContext35.getParagraphId();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput38 = interpreterContext35.out();
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    org.apache.zeppelin.resource.ResourcePool resourcePool40 = interpreterContext35.getResourcePool();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "InterpreterGroup_1497134353138_86992792"+ "'", str37.equals("InterpreterGroup_1497134353138_86992792"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourcePool40);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("1");
    java.util.List<java.io.File> list_file2 = dependencyContext1.getFiles();
    org.apache.zeppelin.dep.Dependency dependency4 = dependencyContext1.load("InterpreterGroup_1497134387892_-1132206419");
    java.util.List<java.lang.String> list_str5 = dependency4.getExclusions();
    org.apache.zeppelin.dep.Dependency dependency6 = dependency4.excludeAll();
    java.util.List<java.lang.String> list_str7 = dependency6.getExclusions();
    java.lang.String str8 = dependency6.getGroupArtifactVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "InterpreterGroup_1497134387892_-1132206419"+ "'", str8.equals("InterpreterGroup_1497134387892_-1132206419"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }

    org.apache.zeppelin.resource.Resource[] resource_array2 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource3 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource3, resource_array2);
    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource6 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource6, resource_array5);
    boolean b8 = arraylist_resource6.isEmpty();
    boolean b9 = linkedlist_resource3.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource6);
    org.apache.zeppelin.resource.Resource resource10 = null;
    boolean b11 = linkedlist_resource3.add(resource10);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource12 = linkedlist_resource3.iterator();
    java.lang.String str13 = linkedlist_resource3.toString();
    java.lang.Object[] obj_array14 = linkedlist_resource3.toArray();
    org.apache.zeppelin.resource.Resource[] resource_array16 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource17 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource17, resource_array16);
    org.apache.zeppelin.resource.Resource[] resource_array19 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource20 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource20, resource_array19);
    boolean b22 = arraylist_resource20.isEmpty();
    boolean b23 = linkedlist_resource17.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource20);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption24 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array25 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption24 };
    org.apache.zeppelin.display.ui.Select select26 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource17, paramOption_array25);
    org.apache.zeppelin.display.ui.CheckBox checkBox27 = new org.apache.zeppelin.display.ui.CheckBox("shared", obj_array14, paramOption_array25);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array28 = checkBox27.getOptions();
    org.apache.zeppelin.resource.Resource[] resource_array33 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource34 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource34, resource_array33);
    org.apache.zeppelin.resource.Resource[] resource_array36 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource37 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource37, resource_array36);
    boolean b39 = arraylist_resource37.isEmpty();
    boolean b40 = linkedlist_resource34.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource37);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption41 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array42 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption41 };
    org.apache.zeppelin.display.ui.Select select43 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource34, paramOption_array42);
    org.apache.zeppelin.display.ui.Select select44 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array42);
    java.lang.String str45 = select44.getDisplayName();
    org.apache.zeppelin.resource.Resource[] resource_array47 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource48 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource48, resource_array47);
    org.apache.zeppelin.resource.Resource[] resource_array50 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource51 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource51, resource_array50);
    boolean b53 = arraylist_resource51.isEmpty();
    boolean b54 = linkedlist_resource48.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource51);
    org.apache.zeppelin.resource.Resource resource55 = null;
    boolean b56 = linkedlist_resource48.add(resource55);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource57 = linkedlist_resource48.iterator();
    java.lang.String str58 = linkedlist_resource48.toString();
    java.lang.Object[] obj_array59 = linkedlist_resource48.toArray();
    org.apache.zeppelin.resource.Resource[] resource_array61 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource62 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource62, resource_array61);
    org.apache.zeppelin.resource.Resource[] resource_array64 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource65 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource65, resource_array64);
    boolean b67 = arraylist_resource65.isEmpty();
    boolean b68 = linkedlist_resource62.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource65);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption69 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array70 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption69 };
    org.apache.zeppelin.display.ui.Select select71 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource62, paramOption_array70);
    org.apache.zeppelin.display.ui.CheckBox checkBox72 = new org.apache.zeppelin.display.ui.CheckBox("shared", obj_array59, paramOption_array70);
    org.apache.zeppelin.display.ui.Select select73 = org.apache.zeppelin.display.Input.select("InterpreterGroup_1497134393546_1288425887", (java.lang.Object)str45, paramOption_array70);
    org.apache.zeppelin.display.ui.CheckBox checkBox74 = org.apache.zeppelin.display.Input.checkbox("InterpreterGroup_1497134421473_1415416272", (java.lang.Object[])paramOption_array28, paramOption_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]"+ "'", str13.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "zeppelin.interpreter.port"+ "'", str45.equals("zeppelin.interpreter.port"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[null]"+ "'", str58.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkBox74);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    org.apache.zeppelin.display.GUI gUI5 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input6 = gUI5.getForms();
    java.lang.Object obj9 = gUI5.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    boolean b10 = interpreterProperty4.equals(obj9);
    java.lang.String str11 = interpreterProperty4.getDefaultValue();
    interpreterProperty4.setDefaultValue("InterpreterGroup_1497134377636_1315933403");
    java.lang.String str14 = interpreterProperty4.getPropertyName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "1"+ "'", obj9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}"+ "'", str11.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"+ "'", str14.equals("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult2 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "");
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = null;
    interpreterResult2.add(interpreterResultMessage3);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code5 = interpreterResult2.code();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code5);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.resource.Resource resource39 = localResourcePool29.get("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", "org.apache.zeppelin.interpreter.InterpreterException: ", "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.dep.RepositoryListener repositoryListener43 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent44 = null;
    repositoryListener43.metadataDownloading(repositoryEvent44);
    org.sonatype.aether.RepositoryEvent repositoryEvent46 = null;
    repositoryListener43.metadataDownloaded(repositoryEvent46);
    localResourcePool29.put("InterpreterGroup_1497134361094_1261121192", "InterpreterGroup_1497134419879_18384985", "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", (java.lang.Object)repositoryListener43);
    org.sonatype.aether.RepositoryEvent repositoryEvent49 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener43.artifactInstalled(repositoryEvent49);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource39);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }

    org.apache.zeppelin.display.ui.Select select0 = new org.apache.zeppelin.display.ui.Select();
    java.lang.String str1 = select0.getDisplayName();
    java.lang.String str2 = select0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }

    org.apache.zeppelin.display.GUI gUI0 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input1 = gUI0.getForms();
    java.lang.Object obj4 = gUI0.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    java.lang.String str5 = gUI0.toJson();
    org.apache.zeppelin.resource.Resource[] resource_array11 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource12 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource12, resource_array11);
    org.apache.zeppelin.resource.Resource[] resource_array14 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource15 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15, resource_array14);
    boolean b17 = arraylist_resource15.isEmpty();
    boolean b18 = linkedlist_resource12.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15);
    org.apache.zeppelin.resource.Resource resource19 = null;
    boolean b20 = linkedlist_resource12.add(resource19);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource21 = linkedlist_resource12.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo22 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i23 = linkedlist_resource12.indexOf((java.lang.Object)authenticationInfo22);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj24 = null;
    org.apache.zeppelin.display.GUI gUI25 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener27 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry28 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener27);
    org.apache.zeppelin.display.AngularObject angularObject33 = angularObjectRegistry28.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool35 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array36 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner37 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner37, interpreterContextRunner_array36);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput39 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController40 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext41 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo22, map_str_obj24, gUI25, angularObjectRegistry28, (org.apache.zeppelin.resource.ResourcePool)localResourcePool35, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner37, interpreterOutput39, remoteWorksController40);
    java.lang.Object obj44 = gUI25.textbox("", "zeppelin.interpreter.host");
    gUI25.convertOldInput();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj46 = gUI25.getParams();
    gUI0.setParams(map_str_obj46);
    gUI0.clear();
    gUI0.clear();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input51 = org.apache.zeppelin.display.Input.extractSimpleQueryForm("[]");
    gUI0.setForms(linkedhashmap_str_input51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "1"+ "'", obj4.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{\"params\":{},\"forms\":{\"InterpreterGroup_1497134350790_986318210\":{\"type\":\"TextBox\",\"name\":\"InterpreterGroup_1497134350790_986318210\",\"displayName\":\"InterpreterGroup_1497134350790_986318210\",\"defaultValue\":\"1\",\"hidden\":false}}}"+ "'", str5.equals("{\"params\":{},\"forms\":{\"InterpreterGroup_1497134350790_986318210\":{\"type\":\"TextBox\",\"name\":\"InterpreterGroup_1497134350790_986318210\",\"displayName\":\"InterpreterGroup_1497134350790_986318210\",\"defaultValue\":\"1\",\"hidden\":false}}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "zeppelin.interpreter.host"+ "'", obj44.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input51);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = interpreterGroup0.getInterpreterHookRegistry();
    org.apache.zeppelin.resource.Resource[] resource_array2 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource3 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource3, resource_array2);
    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource6 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource6, resource_array5);
    boolean b8 = arraylist_resource6.isEmpty();
    boolean b9 = linkedlist_resource3.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource6);
    linkedlist_resource3.clear();
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter11 = interpreterGroup0.get((java.lang.Object)linkedlist_resource3);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type12 = org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL;
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> list_interpreter13 = interpreterGroup0.get((java.lang.Object)type12);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess14 = null;
    interpreterGroup0.setRemoteInterpreterProcess(remoteInterpreterProcess14);
    java.lang.String str16 = interpreterGroup0.getId();
    interpreterGroup0.close("AngularObject{noteId='null', paragraphId='null', object=null, name='null'}");
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool20 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.Resource resource22 = localResourcePool20.remove("InterpreterGroup_1497134350790_986318210");
    java.lang.String str23 = localResourcePool20.id();
    interpreterGroup0.setResourcePool((org.apache.zeppelin.resource.ResourcePool)localResourcePool20);
    org.apache.zeppelin.resource.Resource resource26 = localResourcePool20.get("InterpreterGroup_1497134410739_-1534144333");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter11);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL + "'", type12.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.NULL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_interpreter13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "InterpreterGroup_1497134440215_119564148"+ "'", str16.equals("InterpreterGroup_1497134440215_119564148"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "zeppelin.interpreter.port"+ "'", str23.equals("zeppelin.interpreter.port"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource26);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    boolean b2 = interpreterOption1.perNoteShared();
    interpreterOption1.setPerNote("pre_exec");
    interpreterOption1.setPort(0);
    boolean b7 = interpreterOption1.isUserImpersonate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.resource.Resource resource39 = localResourcePool29.get("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", "org.apache.zeppelin.interpreter.InterpreterException: ", "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver41 = new org.apache.zeppelin.dep.DependencyResolver("InterpreterGroup_1497134376971_-1963975868");
    org.sonatype.aether.repository.Authentication authentication45 = null;
    org.sonatype.aether.repository.Proxy proxy46 = null;
    dependencyResolver41.addRepo("InterpreterGroup_1497134379014_-1019571993", "InterpreterGroup_1497134428426_2089555113", true, authentication45, proxy46);
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader48 = new org.apache.zeppelin.helium.ApplicationLoader((org.apache.zeppelin.resource.ResourcePool)localResourcePool29, dependencyResolver41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource39);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }

    org.apache.zeppelin.resource.LocalResourcePool localResourcePool1 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.Resource resource3 = localResourcePool1.remove("InterpreterGroup_1497134393545_537212119");
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver5 = new org.apache.zeppelin.dep.DependencyResolver("InterpreterGroup_1497134376971_-1963975868");
    dependencyResolver5.addRepo("1", "1", false);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup11 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool12 = interpreterGroup11.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry14 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup11.setInterpreterHookRegistry(interpreterHookRegistry14);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption17 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption18 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption17);
    boolean b19 = interpreterGroup11.contains((java.lang.Object)interpreterOption17);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup20 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool21 = interpreterGroup20.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry23 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup20.setInterpreterHookRegistry(interpreterHookRegistry23);
    interpreterGroup11.setInterpreterHookRegistry(interpreterHookRegistry23);
    java.lang.String str26 = interpreterGroup11.toString();
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterGroup> map_str_interpreterGroup27 = null;
    interpreterGroup11.close(map_str_interpreterGroup27, "{}", "InterpreterGroup_1497134350938_711831855");
    java.util.Set<java.lang.String> set_str31 = interpreterGroup11.keySet();
    java.util.List<java.io.File> list_file32 = dependencyResolver5.load("InterpreterGroup_1497134369176_-1878842789", (java.util.Collection<java.lang.String>)set_str31);
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader33 = new org.apache.zeppelin.helium.ApplicationLoader((org.apache.zeppelin.resource.ResourcePool)localResourcePool1, dependencyResolver5);
    org.apache.zeppelin.helium.HeliumType heliumType34 = null;
    java.lang.String[][] str_array_array39 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage42 = new org.apache.zeppelin.helium.HeliumPackage(heliumType34, "", "", "hi!", "hi!", str_array_array39, "post_exec_dev", "post_exec_dev");
    java.lang.String str43 = heliumPackage42.getLicense();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener51 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry52 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener51);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry55 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry52, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject57 = heliumAppAngularObjectRegistry55.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput58 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext59 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry55, interpreterOutput58);
    org.apache.zeppelin.display.AngularObject angularObject61 = heliumAppAngularObjectRegistry55.remove("InterpreterGroup_1497134353138_86992792");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener69 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry70 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener69);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry73 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry70, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject75 = heliumAppAngularObjectRegistry73.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput76 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext77 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry73, interpreterOutput76);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener78 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener79 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput80 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener78, interpreterOutputChangeListener79);
    org.apache.zeppelin.helium.ApplicationContext applicationContext81 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry73, interpreterOutput80);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput82 = applicationContext81.out;
    org.apache.zeppelin.helium.ApplicationContext applicationContext83 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134374771_373499119", "InterpreterGroup_1497134367518_-1467696533", "isolated", heliumAppAngularObjectRegistry55, interpreterOutput82);
    java.lang.String str84 = applicationContext83.getParagraphId();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.helium.Application application85 = applicationLoader33.load(heliumPackage42, applicationContext83);
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.helium.ApplicationException");
    } catch (org.apache.zeppelin.helium.ApplicationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}"+ "'", str26.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "post_exec_dev"+ "'", str43.equals("post_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "InterpreterGroup_1497134367518_-1467696533"+ "'", str84.equals("InterpreterGroup_1497134367518_-1467696533"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }

    org.apache.zeppelin.interpreter.InterpreterException interpreterException1 = new org.apache.zeppelin.interpreter.InterpreterException("");
    org.apache.zeppelin.helium.ApplicationException applicationException2 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)interpreterException1);
    java.lang.Throwable[] throwable_array3 = applicationException2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }

    java.lang.String[] str_array3 = org.apache.zeppelin.display.Input.split("scoped", 'a');
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource9 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource9, resource_array8);
    org.apache.zeppelin.resource.Resource[] resource_array11 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource12 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource12, resource_array11);
    boolean b14 = arraylist_resource12.isEmpty();
    boolean b15 = linkedlist_resource9.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource12);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption16 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array17 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption16 };
    org.apache.zeppelin.display.ui.Select select18 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource9, paramOption_array17);
    org.apache.zeppelin.display.ui.Select select19 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array17);
    java.lang.String str20 = select19.getDisplayName();
    org.apache.zeppelin.resource.Resource[] resource_array22 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource23 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource23, resource_array22);
    org.apache.zeppelin.resource.Resource[] resource_array25 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource26 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource26, resource_array25);
    boolean b28 = arraylist_resource26.isEmpty();
    boolean b29 = linkedlist_resource23.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource26);
    org.apache.zeppelin.resource.Resource resource30 = null;
    boolean b31 = linkedlist_resource23.add(resource30);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource32 = linkedlist_resource23.iterator();
    java.lang.String str33 = linkedlist_resource23.toString();
    java.lang.Object[] obj_array34 = linkedlist_resource23.toArray();
    org.apache.zeppelin.resource.Resource[] resource_array36 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource37 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource37, resource_array36);
    org.apache.zeppelin.resource.Resource[] resource_array39 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource40 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource40, resource_array39);
    boolean b42 = arraylist_resource40.isEmpty();
    boolean b43 = linkedlist_resource37.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource40);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption44 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array45 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption44 };
    org.apache.zeppelin.display.ui.Select select46 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource37, paramOption_array45);
    org.apache.zeppelin.display.ui.CheckBox checkBox47 = new org.apache.zeppelin.display.ui.CheckBox("shared", obj_array34, paramOption_array45);
    org.apache.zeppelin.display.ui.Select select48 = org.apache.zeppelin.display.Input.select("InterpreterGroup_1497134393546_1288425887", (java.lang.Object)str20, paramOption_array45);
    org.apache.zeppelin.display.ui.CheckBox checkBox49 = org.apache.zeppelin.display.Input.checkbox("InterpreterGroup_1497134426040_648051627", (java.lang.Object[])str_array3, paramOption_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "zeppelin.interpreter.port"+ "'", str20.equals("zeppelin.interpreter.port"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[null]"+ "'", str33.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(checkBox49);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.shutdown();
    java.lang.String str16 = interpreterGroup0.getId();
    java.util.Set<java.util.Map.Entry<java.lang.String,java.util.List<org.apache.zeppelin.interpreter.Interpreter>>> set_entry_str_list_interpreter17 = interpreterGroup0.entrySet();
    interpreterGroup0.shutdown();
    interpreterGroup0.clear();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup20 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool21 = interpreterGroup20.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry23 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup20.setInterpreterHookRegistry(interpreterHookRegistry23);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption26 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption27 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption26);
    boolean b28 = interpreterGroup20.contains((java.lang.Object)interpreterOption26);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup29 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool30 = interpreterGroup29.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry32 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup29.setInterpreterHookRegistry(interpreterHookRegistry32);
    interpreterGroup20.setInterpreterHookRegistry(interpreterHookRegistry32);
    java.lang.String str35 = interpreterGroup20.toString();
    boolean b36 = interpreterGroup20.isEmpty();
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry37 = interpreterGroup20.getAngularObjectRegistry();
    interpreterGroup0.putAll((java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.interpreter.Interpreter>>)interpreterGroup20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "InterpreterGroup_1497134440658_-1426828948"+ "'", str16.equals("InterpreterGroup_1497134440658_-1426828948"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_str_list_interpreter17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}"+ "'", str35.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObjectRegistry37);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }

    org.apache.zeppelin.display.Input<java.util.Map<java.lang.String,org.apache.zeppelin.display.Input>> input_map_str_input0 = new org.apache.zeppelin.display.Input<java.util.Map<java.lang.String,org.apache.zeppelin.display.Input>>();

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener7 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry8 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener7);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry11 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry8, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject13 = heliumAppAngularObjectRegistry11.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput14 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext15 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry11, interpreterOutput14);
    org.apache.zeppelin.display.AngularObject angularObject17 = heliumAppAngularObjectRegistry11.remove("InterpreterGroup_1497134353138_86992792");
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener18 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput19 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener18);
    interpreterOutput19.flush();
    interpreterOutput19.write((int)(short)-1);
    int i23 = interpreterOutput19.size();
    org.apache.zeppelin.helium.ApplicationContext applicationContext24 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134410556_1275540258", "InterpreterGroup_1497134377883_708078564", "InterpreterGroup_1497134410931_1661555730", heliumAppAngularObjectRegistry11, interpreterOutput19);
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage25 = interpreterOutput19.toInterpreterResultMessage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterResultMessage25);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }

    org.apache.zeppelin.user.Credentials credentials2 = new org.apache.zeppelin.user.Credentials((java.lang.Boolean)false, "1");
    org.apache.zeppelin.user.UserCredentials userCredentials4 = credentials2.getUserCredentials("InterpreterGroup_1497134384934_2010942845");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(userCredentials4);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }

    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory2 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client3 = null;
    clientFactory2.passivateObject(pooledobject_client3);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client5 = null;
    clientFactory2.passivateObject(pooledobject_client5);
    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory9 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client10 = null;
    clientFactory9.passivateObject(pooledobject_client10);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client12 = null;
    clientFactory9.passivateObject(pooledobject_client12);
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client14 = null;
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client15 = clientFactory9.wrap(client14);
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client16 = null;
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client17 = clientFactory9.wrap(client16);
    clientFactory2.passivateObject(pooledobject_client17);
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client19 = null;
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client20 = clientFactory2.wrap(client19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pooledobject_client15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pooledobject_client17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pooledobject_client20);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    linkedlist_resource1.addLast(resource8);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource10 = linkedlist_resource1.descendingIterator();
    org.apache.zeppelin.resource.Resource[] resource_array16 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource17 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource17, resource_array16);
    org.apache.zeppelin.resource.Resource[] resource_array19 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource20 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource20, resource_array19);
    boolean b22 = arraylist_resource20.isEmpty();
    boolean b23 = linkedlist_resource17.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource20);
    org.apache.zeppelin.resource.Resource resource24 = null;
    boolean b25 = linkedlist_resource17.add(resource24);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource26 = linkedlist_resource17.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo27 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i28 = linkedlist_resource17.indexOf((java.lang.Object)authenticationInfo27);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj29 = null;
    org.apache.zeppelin.display.GUI gUI30 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener32 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry33 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener32);
    org.apache.zeppelin.display.AngularObject angularObject38 = angularObjectRegistry33.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool40 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array41 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner42 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner42, interpreterContextRunner_array41);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput44 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController45 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext46 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo27, map_str_obj29, gUI30, angularObjectRegistry33, (org.apache.zeppelin.resource.ResourcePool)localResourcePool40, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner42, interpreterOutput44, remoteWorksController45);
    java.lang.String str47 = authenticationInfo27.getTicket();
    org.apache.zeppelin.user.UserCredentials userCredentials48 = authenticationInfo27.getUserCredentials();
    authenticationInfo27.setUser("{envName=InterpreterGroup_1497134367518_-1467696533, propertyName=AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}, defaultValue=pre_exec, description=InterpreterGroup_1497134393145_-2056563636}");
    boolean b51 = linkedlist_resource1.removeFirstOccurrence((java.lang.Object)"{envName=InterpreterGroup_1497134367518_-1467696533, propertyName=AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}, defaultValue=pre_exec, description=InterpreterGroup_1497134393145_-2056563636}");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "InterpreterGroup_1497134419879_-322357118"+ "'", str47.equals("InterpreterGroup_1497134419879_-322357118"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(userCredentials48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }

    org.apache.zeppelin.resource.ResourcePoolUtils.removeResourcesBelongsToNote("InterpreterGroup_1497134435898_-379328342");

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }

    org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner0 = new org.apache.zeppelin.interpreter.InterpreterRunner();
    java.lang.String str1 = interpreterRunner0.getPath();
    java.lang.String str2 = interpreterRunner0.getPath();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }

    org.apache.zeppelin.dep.TransferListener transferListener0 = new org.apache.zeppelin.dep.TransferListener();
    org.sonatype.aether.transfer.TransferEvent transferEvent1 = null;
    transferListener0.transferStarted(transferEvent1);
    org.sonatype.aether.transfer.TransferEvent transferEvent3 = null;
    // The following exception was thrown during execution in test generation
    try {
    transferListener0.transferFailed(transferEvent3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption2.setHost("[null]");
    interpreterOption2.setPerNote("InterpreterGroup_1497134350938_711831855");
    interpreterOption2.setPerUser("InterpreterGroup_1497134384557_-1299248309");
    java.util.List<java.lang.String> list_str9 = interpreterOption2.getUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }

    org.apache.zeppelin.display.ui.TextBox textBox2 = new org.apache.zeppelin.display.ui.TextBox("InterpreterGroup_1497134350790_986318210", "pre_exec_dev");
    java.lang.String str3 = textBox2.getDefaultValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "pre_exec_dev"+ "'", str3.equals("pre_exec_dev"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult1 = new org.apache.zeppelin.interpreter.InterpreterResult(code0);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code2 = interpreterResult1.code();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(code2);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup1 = new org.apache.zeppelin.interpreter.InterpreterGroup("org.apache.zeppelin.interpreter.InterpreterException: InterpreterGroup_1497134377064_955397632");

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("pre_exec");
    java.util.List<java.io.File> list_file2 = dependencyContext1.getFiles();
    dependencyContext1.reset();
    org.apache.zeppelin.dep.Dependency dependency5 = dependencyContext1.load("InterpreterGroup_1497134410025_-620513103");
    java.util.List<java.io.File> list_file6 = dependencyContext1.getFiles();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file6);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }

    org.apache.zeppelin.resource.Resource resource0 = null;
    org.apache.zeppelin.tabledata.ProxyRowIterator proxyRowIterator1 = new org.apache.zeppelin.tabledata.ProxyRowIterator(resource0);
    proxyRowIterator1.remove();
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = proxyRowIterator1.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("1");
    dependencyContext1.reset();
    org.apache.zeppelin.dep.Repository repository4 = dependencyContext1.addRepo("InterpreterGroup_1497134431249_1562367217");
    org.apache.zeppelin.dep.Dependency dependency6 = dependencyContext1.load("pre_exec");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(repository4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency6);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver36 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader37 = new org.apache.zeppelin.helium.ApplicationLoader((org.apache.zeppelin.resource.ResourcePool)localResourcePool29, dependencyResolver36);
    java.lang.String[] str_array43 = new java.lang.String[] { "InterpreterGroup_1497134369176_-1878842789", "org.apache.zeppelin.interpreter.InterpreterException: InterpreterGroup_1497134377064_955397632", "_GLOBAL_", "InterpreterGroup_1497134429570_1552317239", "InterpreterGroup_1497134406482_218481333" };
    java.lang.String[] str_array49 = new java.lang.String[] { "InterpreterGroup_1497134369176_-1878842789", "org.apache.zeppelin.interpreter.InterpreterException: InterpreterGroup_1497134377064_955397632", "_GLOBAL_", "InterpreterGroup_1497134429570_1552317239", "InterpreterGroup_1497134406482_218481333" };
    java.lang.String[][] str_array_array50 = new java.lang.String[][] { str_array43, str_array49 };
    org.apache.zeppelin.resource.ResourceSet resourceSet53 = applicationLoader37.findRequiredResourceSet(str_array_array50, "InterpreterGroup_1497134413118_579211358", "org.apache.zeppelin.interpreter.InterpreterException: InterpreterGroup_1497134377064_955397632");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourceSet53);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("1");
    java.util.List<java.io.File> list_file2 = dependencyContext1.getFiles();
    org.apache.zeppelin.dep.Dependency dependency4 = dependencyContext1.load("InterpreterGroup_1497134387892_-1132206419");
    java.util.List<java.lang.String> list_str5 = dependency4.getExclusions();
    org.apache.zeppelin.dep.Dependency dependency6 = dependency4.local();
    boolean b7 = dependency4.isLocalFsArtifact();
    org.apache.zeppelin.dep.Dependency dependency8 = dependency4.excludeAll();
    org.apache.zeppelin.dep.Dependency dependency9 = dependency8.local();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency9);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.resource.Resource resource39 = localResourcePool29.get("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", "org.apache.zeppelin.interpreter.InterpreterException: ", "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.dep.RepositoryListener repositoryListener43 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent44 = null;
    repositoryListener43.metadataDownloading(repositoryEvent44);
    org.sonatype.aether.RepositoryEvent repositoryEvent46 = null;
    repositoryListener43.metadataDownloaded(repositoryEvent46);
    localResourcePool29.put("InterpreterGroup_1497134361094_1261121192", "InterpreterGroup_1497134419879_18384985", "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", (java.lang.Object)repositoryListener43);
    org.sonatype.aether.RepositoryEvent repositoryEvent49 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener43.artifactInstalling(repositoryEvent49);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource39);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }

    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory2 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client3 = null;
    clientFactory2.activateObject(pooledobject_client3);
    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory7 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client8 = null;
    clientFactory7.passivateObject(pooledobject_client8);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client10 = null;
    clientFactory7.passivateObject(pooledobject_client10);
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client12 = null;
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client13 = clientFactory7.wrap(client12);
    clientFactory2.destroyObject(pooledobject_client13);
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client15 = null;
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client16 = clientFactory2.wrap(client15);
    org.apache.zeppelin.interpreter.remote.ClientFactory clientFactory19 = new org.apache.zeppelin.interpreter.remote.ClientFactory("post_exec_dev", (int)(short)1);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client20 = null;
    clientFactory19.passivateObject(pooledobject_client20);
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client22 = null;
    clientFactory19.passivateObject(pooledobject_client22);
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client24 = null;
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client25 = clientFactory19.wrap(client24);
    org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client client26 = null;
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client27 = clientFactory19.wrap(client26);
    clientFactory2.activateObject(pooledobject_client27);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.commons.pool2.PooledObject<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterService.Client> pooledobject_client29 = clientFactory2.makeObject();
      org.junit.Assert.fail("Expected exception of type org.apache.zeppelin.interpreter.InterpreterException");
    } catch (org.apache.zeppelin.interpreter.InterpreterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pooledobject_client13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pooledobject_client16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pooledobject_client25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pooledobject_client27);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    boolean b10 = interpreterGroup0.contains((java.lang.Object)"<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    interpreterGroup0.close("InterpreterGroup_1497134367518_-1467696533");
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup13 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry14 = interpreterGroup13.getInterpreterHookRegistry();
    java.lang.String str15 = interpreterGroup13.toString();
    interpreterGroup0.putAll((java.util.Map<java.lang.String,java.util.List<org.apache.zeppelin.interpreter.Interpreter>>)interpreterGroup13);
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterGroup> map_str_interpreterGroup17 = null;
    interpreterGroup0.close(map_str_interpreterGroup17, "{AngularObject{noteId='null', paragraphId='null', object=null, name='null'}=[]}", "InterpreterGroup_1497134371990_1999798592");
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess21 = null;
    interpreterGroup0.setRemoteInterpreterProcess(remoteInterpreterProcess21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterHookRegistry14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}"+ "'", str15.equals("{}"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("1");
    java.util.List<java.io.File> list_file2 = dependencyContext1.getFiles();
    org.apache.zeppelin.dep.Dependency dependency4 = dependencyContext1.load("InterpreterGroup_1497134387892_-1132206419");
    java.util.List<java.lang.String> list_str5 = dependency4.getExclusions();
    org.apache.zeppelin.dep.Dependency dependency6 = dependency4.excludeAll();
    java.util.List<java.lang.String> list_str7 = dependency6.getExclusions();
    java.util.List<java.lang.String> list_str8 = dependency6.getExclusions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory2 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory2.createOrGet("hi!");
    java.util.concurrent.ExecutorService executorService6 = executorFactory2.createOrGet("zeppelin.repl.result");
    java.util.concurrent.ExecutorService executorService8 = null;
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess10 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory11 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.Scheduler scheduler13 = schedulerFactory11.createOrGetFIFOScheduler("[]");
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler15 = new org.apache.zeppelin.scheduler.RemoteScheduler("hi!", executorService8, "InterpreterGroup_1497134368135_304166951", remoteInterpreterProcess10, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory11, 0);
    org.apache.zeppelin.scheduler.ParallelScheduler parallelScheduler17 = new org.apache.zeppelin.scheduler.ParallelScheduler("InterpreterGroup_1497134429035_-1128988804", executorService6, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory11, (int)(short)10);
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener18 = null;
    org.apache.zeppelin.scheduler.ParallelScheduler parallelScheduler20 = new org.apache.zeppelin.scheduler.ParallelScheduler("InterpreterGroup_1497134384596_204399223", executorService6, schedulerListener18, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler13);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    java.lang.String str1 = angularobject_outputStream0.getNoteId();
    angularobject_outputStream0.setParagraphId("isolated");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener5 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry6 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource9 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource9, resource_array8);
    org.apache.zeppelin.resource.Resource[] resource_array11 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource12 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource12, resource_array11);
    boolean b14 = arraylist_resource12.isEmpty();
    boolean b15 = linkedlist_resource9.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource12);
    linkedlist_resource9.clear();
    org.apache.zeppelin.display.AngularObject angularObject20 = angularObjectRegistry6.add("_GLOBAL_", (java.lang.Object)linkedlist_resource9, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.display.AngularObjectListener angularObjectListener21 = angularObject20.getListener();
    angularobject_outputStream0.setListener(angularObjectListener21);
    java.lang.String str23 = angularobject_outputStream0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectListener21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }

    org.apache.zeppelin.resource.ResourceId resourceId0 = null;
    java.lang.Class class2 = null;
    java.lang.Class[] class_array3 = new java.lang.Class[] { class2 };
    org.apache.zeppelin.helium.ApplicationException applicationException5 = new org.apache.zeppelin.helium.ApplicationException();
    org.apache.zeppelin.helium.ApplicationException applicationException6 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)applicationException5);
    org.apache.zeppelin.interpreter.InterpreterException interpreterException7 = new org.apache.zeppelin.interpreter.InterpreterException((java.lang.Throwable)applicationException6);
    org.apache.zeppelin.resource.Resource[] resource_array11 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource12 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource12, resource_array11);
    org.apache.zeppelin.resource.Resource[] resource_array14 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource15 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15, resource_array14);
    boolean b17 = arraylist_resource15.isEmpty();
    boolean b18 = linkedlist_resource12.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource15);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption19 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array20 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption19 };
    org.apache.zeppelin.display.ui.Select select21 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource12, paramOption_array20);
    org.apache.zeppelin.display.ui.Select select22 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array20);
    org.apache.zeppelin.display.ui.Select select23 = new org.apache.zeppelin.display.ui.Select("InterpreterGroup_1497134421663_244465960", (java.lang.Object)interpreterException7, paramOption_array20);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage invokeResourceMethodEventMessage25 = new org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage(resourceId0, "InterpreterGroup_1497134376958_1758884347", class_array3, (java.lang.Object[])paramOption_array20, "[]");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(class_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select21);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.flush();
    interpreterOutput1.flush();

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getArtifactId();
    java.lang.String str10 = heliumPackage8.getPublishedDate();
    java.lang.String str11 = heliumPackage8.getClassName();
    org.apache.zeppelin.helium.SpellPackageInfo spellPackageInfo12 = heliumPackage8.getSpellInfo();
    java.lang.String str13 = heliumPackage8.getArtifact();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(spellPackageInfo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener4 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry5 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener4);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry8 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry5, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject10 = heliumAppAngularObjectRegistry8.get("pre_exec");
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener18 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry19 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener18);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry22 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry19, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject24 = heliumAppAngularObjectRegistry22.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput25 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext26 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry22, interpreterOutput25);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener27 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener28 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput29 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener27, interpreterOutputChangeListener28);
    org.apache.zeppelin.helium.ApplicationContext applicationContext30 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry22, interpreterOutput29);
    interpreterOutput29.clear();
    org.apache.zeppelin.helium.ApplicationContext applicationContext32 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134429753_1594996240", "{envName=zeppelin.interpreter.port, propertyName=<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>, defaultValue={}, description=           anonymous}", "InterpreterGroup_1497134410739_-1534144333", heliumAppAngularObjectRegistry8, interpreterOutput29);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = applicationContext32.out;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput33);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput38 = interpreterContext35.out;
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo39 = interpreterContext35.getAuthenticationInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo39);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }

    org.apache.zeppelin.resource.Resource[] resource_array2 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource3 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource3, resource_array2);
    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource6 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource6, resource_array5);
    boolean b8 = arraylist_resource6.isEmpty();
    boolean b9 = linkedlist_resource3.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource6);
    org.apache.zeppelin.resource.Resource resource10 = null;
    boolean b11 = linkedlist_resource3.add(resource10);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource12 = linkedlist_resource3.iterator();
    java.lang.String str13 = linkedlist_resource3.toString();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry15 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    int i16 = linkedlist_resource3.lastIndexOf((java.lang.Object)interpreterHookRegistry15);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption17 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array18 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption17 };
    org.apache.zeppelin.display.ui.Select select19 = new org.apache.zeppelin.display.ui.Select("", (java.lang.Object)interpreterHookRegistry15, paramOption_array18);
    org.apache.zeppelin.resource.Resource[] resource_array21 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource22 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource22, resource_array21);
    org.apache.zeppelin.resource.Resource[] resource_array24 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource25 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource25, resource_array24);
    boolean b27 = arraylist_resource25.isEmpty();
    boolean b28 = linkedlist_resource22.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource25);
    org.apache.zeppelin.resource.Resource resource29 = null;
    boolean b30 = linkedlist_resource22.add(resource29);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource31 = linkedlist_resource22.iterator();
    java.lang.String str32 = linkedlist_resource22.toString();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry34 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    int i35 = linkedlist_resource22.lastIndexOf((java.lang.Object)interpreterHookRegistry34);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption36 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array37 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption36 };
    org.apache.zeppelin.display.ui.Select select38 = new org.apache.zeppelin.display.ui.Select("", (java.lang.Object)interpreterHookRegistry34, paramOption_array37);
    org.apache.zeppelin.display.ui.CheckBox checkBox39 = new org.apache.zeppelin.display.ui.CheckBox("InterpreterGroup_1497134434934_11930346", (java.lang.Object[])paramOption_array18, paramOption_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[null]"+ "'", str13.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[null]"+ "'", str32.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array37);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }

    org.apache.zeppelin.resource.ResourcePoolConnector resourcePoolConnector1 = null;
    org.apache.zeppelin.resource.DistributedResourcePool distributedResourcePool2 = new org.apache.zeppelin.resource.DistributedResourcePool("UsernamePassword{username='hi!', password='pre_exec_dev'}", resourcePoolConnector1);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }

    java.lang.String[] str_array2 = org.apache.zeppelin.display.Input.splitPipe("InterpreterGroup_1497134374771_373499119");
    java.lang.String[] str_array4 = org.apache.zeppelin.display.Input.split("InterpreterGroup_1497134429772_87627380", str_array2, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet0.filterByNameRegex("AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource5 = resourceSet0.removeLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }

    org.apache.zeppelin.dep.Repository repository1 = new org.apache.zeppelin.dep.Repository("InterpreterGroup_1497134425803_-166526896");

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption0 = new org.apache.zeppelin.interpreter.InterpreterOption();
    boolean b1 = interpreterOption0.permissionIsSet();
    interpreterOption0.setUserPermission(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }

    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory0 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.Scheduler scheduler3 = schedulerFactory0.createOrGetParallelScheduler("shared", (int)(short)0);
    java.util.Collection<org.apache.zeppelin.scheduler.Scheduler> collection_scheduler5 = schedulerFactory0.listScheduler("InterpreterGroup_1497134350938_711831855");
    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory7 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService10 = executorFactory7.createOrGet("scoped", 2);
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory11 = org.apache.zeppelin.scheduler.SchedulerFactory.singleton();
    org.apache.zeppelin.scheduler.ParallelScheduler parallelScheduler13 = new org.apache.zeppelin.scheduler.ParallelScheduler("post_exec_dev", executorService10, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory11, (int)(byte)10);
    org.apache.zeppelin.scheduler.Job job15 = parallelScheduler13.removeFromWaitingQueue("InterpreterGroup_1497134376922_-128746751");
    parallelScheduler13.setMaxConcurrency(3);
    org.apache.zeppelin.scheduler.Job job18 = null;
    // The following exception was thrown during execution in test generation
    try {
    schedulerFactory0.jobFinished((org.apache.zeppelin.scheduler.Scheduler)parallelScheduler13, job18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_scheduler5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(schedulerFactory11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job15);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet0.filterByNoteId("_GLOBAL_");
    org.apache.zeppelin.resource.Resource resource5 = null;
    boolean b6 = resourceSet4.offerLast(resource5);
    org.apache.zeppelin.resource.Resource resource7 = resourceSet4.peek();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup8 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool9 = interpreterGroup8.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry11 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup8.setInterpreterHookRegistry(interpreterHookRegistry11);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption14 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption15 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption14);
    boolean b16 = interpreterGroup8.contains((java.lang.Object)interpreterOption14);
    int i17 = resourceSet4.lastIndexOf((java.lang.Object)interpreterOption14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }

    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry1 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("{}");
    interpreterHookRegistry1.addRepl("isolated", "InterpreterGroup_1497134353138_86992792");
    interpreterHookRegistry1.addRepl("scoped", "InterpreterGroup_1497134376850_-1874169858");
    interpreterHookRegistry1.addRepl("", "InterpreterGroup_1497134409064_585101077");

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    java.lang.String[] str_array5 = new java.lang.String[] { "zeppelin.interpreter.port", "_GLOBAL_" };
    java.util.ArrayList<java.lang.String> arraylist_str6 = new java.util.ArrayList<java.lang.String>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str6, str_array5);
    interpreterResultMessageOutput2.setResourceSearchPaths((java.util.List<java.lang.String>)arraylist_str6);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage9 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type10 = org.apache.zeppelin.interpreter.InterpreterResult.Type.TABLE;
    interpreterResultMessageOutput2.setType(type10);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type12 = interpreterResultMessageOutput2.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.TABLE + "'", type10.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.TABLE));
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.TABLE + "'", type12.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.TABLE));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry36 = interpreterContext35.getAngularObjectRegistry();
    java.lang.String str37 = interpreterContext35.getParagraphTitle();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput38 = interpreterContext35.out;
    org.apache.zeppelin.interpreter.remote.RemoteEventClientWrapper remoteEventClientWrapper39 = interpreterContext35.getClient();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput40 = interpreterContext35.out;
    java.lang.String str41 = interpreterContext35.getParagraphId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectRegistry36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "pre_exec_dev"+ "'", str37.equals("pre_exec_dev"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(remoteEventClientWrapper39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "InterpreterGroup_1497134353138_86992792"+ "'", str41.equals("InterpreterGroup_1497134353138_86992792"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Code code0 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult2 = new org.apache.zeppelin.interpreter.InterpreterResult(code0, "");
    org.apache.zeppelin.interpreter.InterpreterResult.Type type3 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener4 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput5 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type3, interpreterResultMessageOutputListener4);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage6 = interpreterResultMessageOutput5.toInterpreterResultMessage();
    java.lang.String str7 = interpreterResultMessage6.getData();
    interpreterResult2.add(interpreterResultMessage6);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = interpreterResult2.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.resource.ResourceSet resourceSet6 = resourceSet4.filterByName("InterpreterGroup_1497134350938_711831855");
    org.apache.zeppelin.resource.ResourceSet resourceSet8 = resourceSet6.filterByParagraphId("InterpreterGroup_1497134369176_-1878842789");
    org.apache.zeppelin.resource.ResourceSet resourceSet10 = resourceSet6.filterByClassnameRegex("{\"params\":{},\"forms\":{\"InterpreterGroup_1497134350790_986318210\":{\"type\":\"TextBox\",\"name\":\"InterpreterGroup_1497134350790_986318210\",\"displayName\":\"InterpreterGroup_1497134350790_986318210\",\"defaultValue\":\"1\",\"hidden\":false}}}");
    java.lang.Object obj11 = resourceSet10.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }

    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcessListener remoteInterpreterProcessListener0 = null;
    org.apache.zeppelin.interpreter.remote.AppendOutputRunner appendOutputRunner1 = new org.apache.zeppelin.interpreter.remote.AppendOutputRunner(remoteInterpreterProcessListener0);
    appendOutputRunner1.appendBuffer("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec_dev", 102400, "");
    appendOutputRunner1.appendBuffer("{AngularObject{noteId='null', paragraphId='null', object=null, name='null'}=[]}", "org.apache.zeppelin.tabledata.TableDataException: <strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", 59683, "InterpreterGroup_1497134376971_-1963975868");

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory0 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService2 = executorFactory0.createOrGet("hi!");
    java.util.concurrent.ExecutorService executorService4 = executorFactory0.createOrGet("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    executorFactory0.shutdown("InterpreterGroup_1497134441581_-209343784");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    boolean b3 = interpreterOption1.perUserShared();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("hi!");
    dependencyResolver1.addRepo("InterpreterGroup_1497134393646_-2053954492", "InterpreterGroup_1497134369176_-1878842789", true);
    org.sonatype.aether.repository.Authentication authentication9 = null;
    org.sonatype.aether.repository.Proxy proxy10 = null;
    dependencyResolver1.addRepo("{\"params\"", "InterpreterGroup_1497134377883_708078564", true, authentication9, proxy10);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }

    org.apache.zeppelin.resource.ResourcePoolConnector resourcePoolConnector1 = null;
    org.apache.zeppelin.resource.DistributedResourcePool distributedResourcePool2 = new org.apache.zeppelin.resource.DistributedResourcePool("<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", resourcePoolConnector1);
    org.apache.zeppelin.resource.Resource resource5 = distributedResourcePool2.get("InterpreterGroup_1497134412057_-886896671", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource5);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }

    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption2 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption1);
    interpreterOption2.setHost("[null]");
    interpreterOption2.setExistingProcess(false);
    boolean b7 = interpreterOption2.isSession();
    boolean b8 = interpreterOption2.isExistingProcess();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }

    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource4 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource4, resource_array3);
    org.apache.zeppelin.resource.Resource[] resource_array6 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource7 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource7, resource_array6);
    boolean b9 = arraylist_resource7.isEmpty();
    boolean b10 = linkedlist_resource4.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource7);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption11 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array12 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption11 };
    org.apache.zeppelin.display.ui.Select select13 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource4, paramOption_array12);
    org.apache.zeppelin.display.ui.Select select14 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array12);
    java.lang.String str15 = select14.getDisplayName();
    java.lang.String str16 = select14.getArgument();
    boolean b17 = select14.isHidden();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "zeppelin.interpreter.port"+ "'", str15.equals("zeppelin.interpreter.port"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("1");
    java.util.List<java.io.File> list_file2 = dependencyContext1.getFiles();
    org.apache.zeppelin.dep.Dependency dependency4 = dependencyContext1.load("InterpreterGroup_1497134387892_-1132206419");
    java.util.List<java.lang.String> list_str5 = dependency4.getExclusions();
    org.apache.zeppelin.dep.Dependency dependency6 = dependency4.local();
    boolean b7 = dependency4.isLocalFsArtifact();
    boolean b8 = dependency4.isDist();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("zeppelin.interpreter.port", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "{}", "anonymous");
    org.apache.zeppelin.display.GUI gUI5 = new org.apache.zeppelin.display.GUI();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input6 = gUI5.getForms();
    java.lang.Object obj9 = gUI5.input("InterpreterGroup_1497134350790_986318210", (java.lang.Object)(byte)1);
    boolean b10 = interpreterProperty4.equals(obj9);
    java.lang.String str11 = interpreterProperty4.getDefaultValue();
    java.lang.String str12 = interpreterProperty4.getDescription();
    interpreterProperty4.setPropertyName("<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>");
    java.lang.String str15 = interpreterProperty4.getDefaultValue();
    java.lang.String str16 = interpreterProperty4.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(linkedhashmap_str_input6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "1"+ "'", obj9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}"+ "'", str11.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "anonymous"+ "'", str12.equals("anonymous"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}"+ "'", str15.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}"+ "'", str16.equals("{}"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext1 = new org.apache.zeppelin.dep.DependencyContext("1");
    java.util.List<java.io.File> list_file2 = dependencyContext1.getFiles();
    org.apache.zeppelin.dep.Dependency dependency4 = dependencyContext1.load("InterpreterGroup_1497134387892_-1132206419");
    org.apache.zeppelin.dep.Dependency dependency6 = dependencyContext1.load("InterpreterGroup_1497134393545_537212119");
    org.apache.zeppelin.dep.Repository repository8 = dependencyContext1.addRepo("InterpreterGroup_1497134377636_1315933403");
    org.apache.zeppelin.dep.Repository repository11 = repository8.credentials("InterpreterGroup_1497134379014_-1019571993", "InterpreterGroup_1497134419879_-322357118");
    org.sonatype.aether.repository.Authentication authentication12 = repository11.getAuthentication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_file2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dependency6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(repository8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(repository11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authentication12);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption9 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption9 };
    org.apache.zeppelin.display.ui.Select select11 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    select11.setDisplayName("[null]");
    java.lang.String str14 = select11.getArgument();
    select11.setArgument("InterpreterGroup_1497134350790_986318210");
    select11.setArgument("InterpreterGroup_1497134367518_-1467696533");
    java.lang.String str19 = select11.getDisplayName();
    select11.setDisplayName("InterpreterGroup_1497134408026_-794939986");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paramOption_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(select11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[null]"+ "'", str19.equals("[null]"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }

    java.util.concurrent.ExecutorService executorService1 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener2 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler3 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService1, schedulerListener2);
    fIFOScheduler3.stop();
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job5 = fIFOScheduler3.getJobsRunning();
    org.apache.zeppelin.scheduler.Job job7 = fIFOScheduler3.removeFromWaitingQueue("InterpreterGroup_1497134376971_-1963975868");
    org.apache.zeppelin.scheduler.Job job9 = fIFOScheduler3.removeFromWaitingQueue("InterpreterGroup_1497134373781_-855626841");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job9);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    boolean b11 = linkedlist_resource1.contains((java.lang.Object)(-1));
    java.lang.Object obj12 = linkedlist_resource1.clone();
    org.apache.zeppelin.interpreter.Interpreter[] interpreter_array13 = new org.apache.zeppelin.interpreter.Interpreter[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter> arraylist_interpreter14 = new java.util.ArrayList<org.apache.zeppelin.interpreter.Interpreter>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter14, interpreter_array13);
    boolean b16 = linkedlist_resource1.removeAll((java.util.Collection<org.apache.zeppelin.interpreter.Interpreter>)arraylist_interpreter14);
    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory18 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService21 = executorFactory18.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess23 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory24 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler26 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService21, "pre_exec_dev", remoteInterpreterProcess23, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory24, (int)(short)1);
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job27 = remoteScheduler26.getJobsRunning();
    remoteScheduler26.stop();
    int i29 = linkedlist_resource1.indexOf((java.lang.Object)remoteScheduler26);
    java.lang.String str30 = remoteScheduler26.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreter_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "zeppelin.interpreter.host"+ "'", str30.equals("zeppelin.interpreter.host"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    java.lang.Object obj38 = gUI19.textbox("", "zeppelin.interpreter.host");
    org.apache.zeppelin.resource.Resource[] resource_array45 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource46 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource46, resource_array45);
    org.apache.zeppelin.resource.Resource[] resource_array48 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource49 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource49, resource_array48);
    boolean b51 = arraylist_resource49.isEmpty();
    boolean b52 = linkedlist_resource46.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource49);
    org.apache.zeppelin.resource.Resource resource53 = null;
    boolean b54 = linkedlist_resource46.add(resource53);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource55 = linkedlist_resource46.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo56 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i57 = linkedlist_resource46.indexOf((java.lang.Object)authenticationInfo56);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj58 = null;
    org.apache.zeppelin.display.GUI gUI59 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener61 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry62 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener61);
    org.apache.zeppelin.display.AngularObject angularObject67 = angularObjectRegistry62.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool69 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array70 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner71 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b72 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner71, interpreterContextRunner_array70);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput73 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController74 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext75 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo56, map_str_obj58, gUI59, angularObjectRegistry62, (org.apache.zeppelin.resource.ResourcePool)localResourcePool69, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner71, interpreterOutput73, remoteWorksController74);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext75);
    java.lang.String str77 = interpreterContext75.getReplName();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo78 = interpreterContext75.getAuthenticationInfo();
    java.lang.Object obj79 = gUI19.input("InterpreterGroup_1497134353138_86992792", (java.lang.Object)interpreterContext75);
    java.lang.String str80 = gUI19.toJson();
    java.lang.Object obj83 = gUI19.textbox("InterpreterGroup_1497134419879_-322357118", "InterpreterGroup_1497134419879_-322357118");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "zeppelin.interpreter.host"+ "'", obj38.equals("zeppelin.interpreter.host"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str77.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj83 + "' != '" + "InterpreterGroup_1497134419879_-322357118"+ "'", obj83.equals("InterpreterGroup_1497134419879_-322357118"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }

    org.apache.zeppelin.resource.ResourceSet resourceSet0 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = resourceSet0.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet4 = resourceSet2.filterByClassnameRegex("pre_exec");
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource5 = resourceSet4.iterator();
    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory7 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService10 = executorFactory7.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess12 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory13 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler15 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService10, "pre_exec_dev", remoteInterpreterProcess12, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory13, (int)(short)1);
    remoteScheduler15.stop();
    boolean b17 = resourceSet4.remove((java.lang.Object)remoteScheduler15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }

    org.apache.zeppelin.resource.ResourcePoolConnector resourcePoolConnector1 = null;
    org.apache.zeppelin.resource.DistributedResourcePool distributedResourcePool2 = new org.apache.zeppelin.resource.DistributedResourcePool("", resourcePoolConnector1);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }

    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource0 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource1 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    java.lang.String str2 = remoteZeppelinServerResource1.getOwnerKey();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type type3 = org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS;
    remoteZeppelinServerResource1.setResourceType(type3);
    remoteZeppelinServerResource0.setResourceType(type3);
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener13 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry14 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener13);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry17 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry14, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject19 = heliumAppAngularObjectRegistry17.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput20 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext21 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry17, interpreterOutput20);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener22 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener23 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput24 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener22, interpreterOutputChangeListener23);
    org.apache.zeppelin.helium.ApplicationContext applicationContext25 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry17, interpreterOutput24);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry26 = applicationContext25.getAngularObjectRegistry();
    remoteZeppelinServerResource0.setData((java.lang.Object)heliumAppAngularObjectRegistry26);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption29 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption30 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption29);
    boolean b31 = interpreterOption30.perNoteShared();
    java.lang.String str32 = interpreterOption30.getHost();
    boolean b33 = interpreterOption30.isProcess();
    remoteZeppelinServerResource0.setData((java.lang.Object)b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS + "'", type3.equals(org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(heliumAppAngularObjectRegistry26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }

    org.slf4j.Logger logger0 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream1 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger0);
    byte[] byte_array5 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream1.write(byte_array5, (int)'a', 3);
    interpreterOutputStream1.ignoreLeadingNewLinesFromScalaReporter();
    interpreterOutputStream1.ignoreLeadingNewLinesFromScalaReporter();
    interpreterOutputStream1.flush();
    interpreterOutputStream1.ignoreLeadingNewLinesFromScalaReporter();
    int i13 = interpreterOutputStream1.getMessageLevel();
    int i14 = interpreterOutputStream1.getMessageLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 999);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory1 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService4 = executorFactory1.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess6 = null;
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory7 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.RemoteScheduler remoteScheduler9 = new org.apache.zeppelin.scheduler.RemoteScheduler("zeppelin.interpreter.host", executorService4, "pre_exec_dev", remoteInterpreterProcess6, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory7, (int)(short)1);
    remoteScheduler9.stop();
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job11 = remoteScheduler9.getJobsRunning();
    org.apache.zeppelin.scheduler.Job job13 = remoteScheduler9.removeFromWaitingQueue("InterpreterGroup_1497134408987_-733609207");
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job14 = remoteScheduler9.getJobsRunning();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job14);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener2 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry3 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener2);
    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    linkedlist_resource6.clear();
    org.apache.zeppelin.display.AngularObject angularObject17 = angularObjectRegistry3.add("_GLOBAL_", (java.lang.Object)linkedlist_resource6, "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "pre_exec", false);
    org.apache.zeppelin.display.AngularObjectWatcher angularObjectWatcher18 = null;
    angularObject17.removeWatcher(angularObjectWatcher18);
    java.lang.String str20 = angularObject17.getNoteId();
    java.lang.Object obj21 = angularObject17.get();
    org.apache.zeppelin.display.AngularObjectListener angularObjectListener22 = angularObject17.getListener();
    angularobject_outputStream0.setListener(angularObjectListener22);
    org.apache.zeppelin.display.AngularObjectWatcher angularObjectWatcher24 = null;
    angularobject_outputStream0.removeWatcher(angularObjectWatcher24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObject17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"+ "'", str20.equals("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(angularObjectListener22);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    linkedlist_resource1.clear();
    java.lang.Object obj9 = linkedlist_resource1.clone();
    java.util.concurrent.ExecutorService executorService11 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener12 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler13 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService11, schedulerListener12);
    fIFOScheduler13.stop();
    boolean b15 = linkedlist_resource1.removeFirstOccurrence((java.lang.Object)fIFOScheduler13);
    fIFOScheduler13.run();
    fIFOScheduler13.run();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }

    org.apache.zeppelin.interpreter.InterpreterPropertyBuilder interpreterPropertyBuilder0 = new org.apache.zeppelin.interpreter.InterpreterPropertyBuilder();
    org.apache.zeppelin.interpreter.InterpreterPropertyBuilder interpreterPropertyBuilder6 = interpreterPropertyBuilder0.add("InterpreterGroup_1497134408026_-794939986", "InterpreterGroup_1497134373781_-855626841", "InterpreterGroup_1497134384512_-890338748", "", "{}");
    org.apache.zeppelin.interpreter.InterpreterPropertyBuilder interpreterPropertyBuilder12 = interpreterPropertyBuilder0.add("InterpreterGroup_1497134408379_1574252163", "InterpreterGroup_1497134361189_-653890590", "existing_process", "InterpreterGroup_1497134385425_-1840284417", "InterpreterGroup_1497134410092_-1974466412");
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterProperty> map_str_interpreterProperty13 = interpreterPropertyBuilder0.build();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterPropertyBuilder6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterPropertyBuilder12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_interpreterProperty13);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener2 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput3 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type1, interpreterResultMessageOutputListener2);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type4 = org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG;
    interpreterResultMessageOutput3.setType(type4);
    angularobject_outputStream0.set((java.io.OutputStream)interpreterResultMessageOutput3);
    boolean b8 = angularobject_outputStream0.equals((java.lang.Object)102400);
    org.apache.zeppelin.display.AngularObjectWatcher angularObjectWatcher9 = null;
    angularobject_outputStream0.addWatcher(angularObjectWatcher9);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG + "'", type4.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.SVG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }

    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory3 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService6 = executorFactory3.createOrGet("pre_exec_dev", 0);
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory7 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.Scheduler scheduler9 = schedulerFactory7.createOrGetFIFOScheduler("InterpreterGroup_1497134361189_-653890590");
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler10 = new org.apache.zeppelin.scheduler.FIFOScheduler("hi!", executorService6, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory7);
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory11 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler12 = new org.apache.zeppelin.scheduler.FIFOScheduler("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", executorService6, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory11);
    org.apache.zeppelin.scheduler.ExecutorFactory executorFactory14 = org.apache.zeppelin.scheduler.ExecutorFactory.singleton();
    java.util.concurrent.ExecutorService executorService16 = executorFactory14.createOrGet("hi!");
    java.util.concurrent.ExecutorService executorService18 = executorFactory14.createOrGet("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.scheduler.SchedulerFactory schedulerFactory19 = new org.apache.zeppelin.scheduler.SchedulerFactory();
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler20 = new org.apache.zeppelin.scheduler.FIFOScheduler("InterpreterGroup_1497134374771_373499119", executorService18, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory19);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterProcess remoteInterpreterProcess23 = null;
    org.apache.zeppelin.scheduler.Scheduler scheduler25 = schedulerFactory19.createOrGetRemoteScheduler("InterpreterGroup_1497134368135_304166951", "hi!", remoteInterpreterProcess23, (int)(byte)10);
    org.apache.zeppelin.scheduler.Scheduler scheduler27 = schedulerFactory19.removeScheduler("InterpreterGroup_1497134384931_-1968252549");
    org.apache.zeppelin.scheduler.ParallelScheduler parallelScheduler29 = new org.apache.zeppelin.scheduler.ParallelScheduler("pre_exec_dev", executorService6, (org.apache.zeppelin.scheduler.SchedulerListener)schedulerFactory19, (int)(byte)100);
    parallelScheduler29.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorFactory14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(executorService18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduler25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scheduler27);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener7 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry8 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener7);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry11 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry(angularObjectRegistry8, "zeppelin.interpreter.port", "zeppelin.interpreter.port");
    org.apache.zeppelin.display.AngularObject angularObject13 = heliumAppAngularObjectRegistry11.get("_GLOBAL_");
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput14 = null;
    org.apache.zeppelin.helium.ApplicationContext applicationContext15 = new org.apache.zeppelin.helium.ApplicationContext("InterpreterGroup_1497134353138_86992792", "post_exec_dev", "pre_exec_dev", heliumAppAngularObjectRegistry11, interpreterOutput14);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener16 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener17 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput18 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener16, interpreterOutputChangeListener17);
    org.apache.zeppelin.helium.ApplicationContext applicationContext19 = new org.apache.zeppelin.helium.ApplicationContext("", "InterpreterGroup_1497134350938_711831855", "{}", heliumAppAngularObjectRegistry11, interpreterOutput18);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput20 = applicationContext19.out;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput21 = interpreterOutput20.getCurrentOutput();
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener23 = interpreterOutput20.createInterpreterResultMessageOutputListener((int)(byte)0);
    interpreterOutput20.write(3);
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput26 = interpreterOutput20.getCurrentOutput();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener27 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput28 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener27);
    interpreterOutput28.flush();
    interpreterOutput28.write((int)(short)-1);
    int i32 = interpreterOutput28.size();
    java.net.URL uRL33 = null;
    interpreterOutput28.write(uRL33);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener35 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput36 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener35);
    interpreterOutput36.addResourceSearchPath("isolated");
    byte[] byte_array39 = interpreterOutput36.toByteArray();
    interpreterOutput28.write(byte_array39, (int)'#', (int)(byte)0);
    interpreterResultMessageOutput26.write(byte_array39);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup44 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool45 = interpreterGroup44.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry47 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup44.setInterpreterHookRegistry(interpreterHookRegistry47);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption50 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption51 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption50);
    boolean b52 = interpreterGroup44.contains((java.lang.Object)interpreterOption50);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup53 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool54 = interpreterGroup53.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry56 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup53.setInterpreterHookRegistry(interpreterHookRegistry56);
    interpreterGroup44.setInterpreterHookRegistry(interpreterHookRegistry56);
    interpreterGroup44.shutdown();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type60 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener61 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput62 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type60, interpreterResultMessageOutputListener61);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage63 = interpreterResultMessageOutput62.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage64 = interpreterResultMessageOutput62.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener65 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput66 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener65);
    interpreterOutput66.addResourceSearchPath("isolated");
    byte[] byte_array69 = interpreterOutput66.toByteArray();
    interpreterResultMessageOutput62.write(byte_array69);
    boolean b71 = interpreterGroup44.contains((java.lang.Object)interpreterResultMessageOutput62);
    org.slf4j.Logger logger72 = null;
    org.apache.zeppelin.interpreter.util.InterpreterOutputStream interpreterOutputStream73 = new org.apache.zeppelin.interpreter.util.InterpreterOutputStream(logger72);
    byte[] byte_array77 = new byte[] { (byte)10, (byte)-1, (byte)100 };
    interpreterOutputStream73.write(byte_array77, (int)'a', 3);
    interpreterResultMessageOutput62.write(byte_array77, (int)(short)100, 100);
    interpreterResultMessageOutput26.write(byte_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOutput20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterResultMessageOutput21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessageOutputListener23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessageOutput26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array77);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    repositoryListener0.metadataDownloaded(repositoryEvent3);
    org.sonatype.aether.RepositoryEvent repositoryEvent5 = null;
    repositoryListener0.metadataDownloading(repositoryEvent5);
    org.sonatype.aether.RepositoryEvent repositoryEvent7 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactInstalled(repositoryEvent7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.shutdown();
    org.apache.zeppelin.interpreter.InterpreterResult.Type type16 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener17 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput18 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type16, interpreterResultMessageOutputListener17);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage19 = interpreterResultMessageOutput18.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage20 = interpreterResultMessageOutput18.toInterpreterResultMessage();
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener21 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput22 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener21);
    interpreterOutput22.addResourceSearchPath("isolated");
    byte[] byte_array25 = interpreterOutput22.toByteArray();
    interpreterResultMessageOutput18.write(byte_array25);
    boolean b27 = interpreterGroup0.contains((java.lang.Object)interpreterResultMessageOutput18);
    java.util.Properties properties28 = interpreterGroup0.getProperty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(properties28);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.resource.Resource[] resource_array3 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource4 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4, resource_array3);
    boolean b6 = arraylist_resource4.isEmpty();
    boolean b7 = linkedlist_resource1.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource4);
    org.apache.zeppelin.resource.Resource resource8 = null;
    boolean b9 = linkedlist_resource1.add(resource8);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource10 = linkedlist_resource1.iterator();
    java.lang.String str11 = linkedlist_resource1.toString();
    org.apache.zeppelin.resource.Resource resource12 = linkedlist_resource1.remove();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.resource.Resource resource13 = linkedlist_resource1.getLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[null]"+ "'", str11.equals("[null]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resource12);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getArtifactId();
    java.lang.String str10 = heliumPackage8.getPublishedDate();
    java.lang.String[][] str_array_array11 = heliumPackage8.getResources();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array11);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }

    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener0 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput1 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener0);
    interpreterOutput1.flush();
    interpreterOutput1.close();
    interpreterOutput1.write((int)'#');
    java.io.File file6 = null;
    interpreterOutput1.write(file6);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput9 = interpreterOutput1.getOutputAt(999);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }

    org.apache.zeppelin.interpreter.InterpreterResult.Type type0 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener1 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput2 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type0, interpreterResultMessageOutputListener1);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage3 = interpreterResultMessageOutput2.toInterpreterResultMessage();
    org.apache.zeppelin.tabledata.InterpreterResultTableData interpreterResultTableData4 = new org.apache.zeppelin.tabledata.InterpreterResultTableData(interpreterResultMessage3);
    java.lang.String str5 = interpreterResultMessage3.getData();
    org.apache.zeppelin.tabledata.InterpreterResultTableData interpreterResultTableData6 = new org.apache.zeppelin.tabledata.InterpreterResultTableData(interpreterResultMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }

    org.apache.zeppelin.display.AngularObject<java.io.OutputStream> angularobject_outputStream0 = new org.apache.zeppelin.display.AngularObject<java.io.OutputStream>();
    java.lang.String str1 = angularobject_outputStream0.getParagraphId();
    java.lang.Object obj2 = angularobject_outputStream0.get();
    org.apache.zeppelin.display.AngularObjectWatcher angularObjectWatcher3 = null;
    angularobject_outputStream0.addWatcher(angularObjectWatcher3);
    org.apache.zeppelin.interpreter.InterpreterResult.Type type5 = org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener6 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput7 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type5, interpreterResultMessageOutputListener6);
    java.net.URL uRL8 = null;
    interpreterResultMessageOutput7.write(uRL8);
    java.io.File file10 = null;
    interpreterResultMessageOutput7.write(file10);
    angularobject_outputStream0.set((java.io.OutputStream)interpreterResultMessageOutput7);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage13 = interpreterResultMessageOutput7.toInterpreterResultMessage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR + "'", type5.equals(org.apache.zeppelin.interpreter.InterpreterResult.Type.ANGULAR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterResultMessage13);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }

    java.util.concurrent.ExecutorService executorService1 = null;
    org.apache.zeppelin.scheduler.SchedulerListener schedulerListener2 = null;
    org.apache.zeppelin.scheduler.FIFOScheduler fIFOScheduler3 = new org.apache.zeppelin.scheduler.FIFOScheduler("org.apache.zeppelin.interpreter.InterpreterException: ", executorService1, schedulerListener2);
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job4 = fIFOScheduler3.getJobsRunning();
    java.util.Collection<org.apache.zeppelin.scheduler.Job> collection_job5 = fIFOScheduler3.getJobsRunning();
    org.apache.zeppelin.scheduler.Job job7 = fIFOScheduler3.removeFromWaitingQueue("InterpreterGroup_1497134429035_-1128988804");
    org.apache.zeppelin.scheduler.Job job8 = null;
    // The following exception was thrown during execution in test generation
    try {
    fIFOScheduler3.submit(job8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_job5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(job7);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    repositoryListener0.metadataDownloading(repositoryEvent3);
    org.sonatype.aether.RepositoryEvent repositoryEvent5 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.artifactDescriptorInvalid(repositoryEvent5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }

    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = new org.apache.zeppelin.dep.DependencyResolver("{\"params\":{},\"forms\":{\"InterpreterGroup_1497134350790_986318210\":{\"type\":\"TextBox\",\"name\":\"InterpreterGroup_1497134350790_986318210\",\"displayName\":\"InterpreterGroup_1497134350790_986318210\",\"defaultValue\":\"1\",\"hidden\":false}}}");

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }

    org.apache.zeppelin.interpreter.InterpreterProperty interpreterProperty4 = new org.apache.zeppelin.interpreter.InterpreterProperty("InterpreterGroup_1497134367518_-1467696533", "AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}", "pre_exec", "InterpreterGroup_1497134393145_-2056563636");
    java.lang.String str5 = interpreterProperty4.toString();
    interpreterProperty4.setDefaultValue("InterpreterGroup_1497134432396_1967072818");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{envName=InterpreterGroup_1497134367518_-1467696533, propertyName=AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}, defaultValue=pre_exec, description=InterpreterGroup_1497134393145_-2056563636}"+ "'", str5.equals("{envName=InterpreterGroup_1497134367518_-1467696533, propertyName=AngularObject{noteId='null', paragraphId='null', object=%svg , name='null'}, defaultValue=pre_exec, description=InterpreterGroup_1497134393145_-2056563636}"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }

    org.apache.zeppelin.dep.RepositoryListener repositoryListener0 = new org.apache.zeppelin.dep.RepositoryListener();
    org.sonatype.aether.RepositoryEvent repositoryEvent1 = null;
    repositoryListener0.metadataDownloading(repositoryEvent1);
    org.sonatype.aether.RepositoryEvent repositoryEvent3 = null;
    repositoryListener0.metadataDownloading(repositoryEvent3);
    org.sonatype.aether.RepositoryEvent repositoryEvent5 = null;
    // The following exception was thrown during execution in test generation
    try {
    repositoryListener0.metadataDeploying(repositoryEvent5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }

    org.apache.zeppelin.resource.Resource[] resource_array5 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource6 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource6, resource_array5);
    org.apache.zeppelin.resource.Resource[] resource_array8 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource9 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9, resource_array8);
    boolean b11 = arraylist_resource9.isEmpty();
    boolean b12 = linkedlist_resource6.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource9);
    org.apache.zeppelin.resource.Resource resource13 = null;
    boolean b14 = linkedlist_resource6.add(resource13);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource15 = linkedlist_resource6.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i17 = linkedlist_resource6.indexOf((java.lang.Object)authenticationInfo16);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj18 = null;
    org.apache.zeppelin.display.GUI gUI19 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener21 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry22 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener21);
    org.apache.zeppelin.display.AngularObject angularObject27 = angularObjectRegistry22.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool29 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array30 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner31 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterContextRunner_array30);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput33 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController34 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext35 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo16, map_str_obj18, gUI19, angularObjectRegistry22, (org.apache.zeppelin.resource.ResourcePool)localResourcePool29, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner31, interpreterOutput33, remoteWorksController34);
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    java.lang.String str37 = interpreterContext35.getReplName();
    org.apache.zeppelin.resource.ResourcePool resourcePool38 = interpreterContext35.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput39 = interpreterContext35.out();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner> list_interpreterContextRunner40 = interpreterContext35.getRunners();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj41 = interpreterContext35.getConfig();
    org.apache.zeppelin.interpreter.InterpreterContext.set(interpreterContext35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resource_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_resource15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(authenticationInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(angularObject27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterContextRunner_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "org.apache.zeppelin.interpreter.InterpreterException: "+ "'", str37.equals("org.apache.zeppelin.interpreter.InterpreterException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourcePool38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(interpreterOutput39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_interpreterContextRunner40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(map_str_obj41);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }

    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup0 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool1 = interpreterGroup0.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry3 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry3);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption6 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption7 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption6);
    boolean b8 = interpreterGroup0.contains((java.lang.Object)interpreterOption6);
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup9 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.resource.ResourcePool resourcePool10 = interpreterGroup9.getResourcePool();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry12 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    interpreterGroup9.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.setInterpreterHookRegistry(interpreterHookRegistry12);
    interpreterGroup0.close("InterpreterGroup_1497134367518_-1467696533");
    boolean b17 = interpreterGroup0.isAngularRegistryPushed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interpreterOption7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(resourcePool10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }

    org.apache.zeppelin.resource.LocalResourcePool localResourcePool1 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.ResourceSet resourceSet2 = localResourcePool1.getAll();
    resourceSet2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(resourceSet2);

  }
}
