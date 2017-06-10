
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    org.apache.zeppelin.resource.Resource[] resource_array0 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource1 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource1, resource_array0);
    org.apache.zeppelin.helium.HeliumType heliumType3 = null;
    java.lang.String[][] str_array_array8 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = new org.apache.zeppelin.helium.HeliumPackage(heliumType3, "", "", "hi!", "hi!", str_array_array8, "post_exec_dev", "post_exec_dev");
    java.lang.Cloneable[] cloneable_array12 = linkedlist_resource1.toArray((java.lang.Cloneable[])str_array_array8);
    
    // Checks the contract:  equals-hashcode on heliumPackage11 and heliumPackage11
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on heliumPackage11 and heliumPackage11", heliumPackage11.equals(heliumPackage11) ? heliumPackage11.hashCode() == heliumPackage11.hashCode() : true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    org.apache.zeppelin.display.OldInput oldInput2 = new org.apache.zeppelin.display.OldInput("hi!", (java.lang.Object)true);
    
    // Checks the contract:  !oldInput2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldInput2.equals(null)", !oldInput2.equals(null));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    org.apache.zeppelin.resource.ResourcePool resourcePool0 = null;
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader2 = new org.apache.zeppelin.helium.ApplicationLoader(resourcePool0, dependencyResolver1);
    org.apache.zeppelin.helium.HeliumType heliumType3 = null;
    java.lang.String[][] str_array_array8 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = new org.apache.zeppelin.helium.HeliumPackage(heliumType3, "", "", "hi!", "hi!", str_array_array8, "post_exec_dev", "post_exec_dev");
    org.apache.zeppelin.resource.ResourceSet resourceSet14 = applicationLoader2.findRequiredResourceSet(str_array_array8, "_GLOBAL_", "InterpreterGroup_1497134350790_986318210");
    
    // Checks the contract:  equals-hashcode on heliumPackage11 and heliumPackage11
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on heliumPackage11 and heliumPackage11", heliumPackage11.equals(heliumPackage11) ? heliumPackage11.hashCode() == heliumPackage11.hashCode() : true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

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
    org.apache.zeppelin.interpreter.InterpreterResult.Code code12 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array13 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage14 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage14, interpreterResultMessage_array13);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult16 = new org.apache.zeppelin.interpreter.InterpreterResult(code12, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage14);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code17 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array18 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage19 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage19, interpreterResultMessage_array18);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult21 = new org.apache.zeppelin.interpreter.InterpreterResult(code17, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage19);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code22 = interpreterResult21.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage23 = interpreterResult21.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code24 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array25 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage26 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage26, interpreterResultMessage_array25);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult28 = new org.apache.zeppelin.interpreter.InterpreterResult(code24, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage26);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code29 = interpreterResult28.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage30 = interpreterResult28.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code31 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array32 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage33 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage33, interpreterResultMessage_array32);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult35 = new org.apache.zeppelin.interpreter.InterpreterResult(code31, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage33);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code36 = interpreterResult35.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage37 = interpreterResult35.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code38 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array39 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage40 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage40, interpreterResultMessage_array39);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult42 = new org.apache.zeppelin.interpreter.InterpreterResult(code38, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage40);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code43 = interpreterResult42.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage44 = interpreterResult42.message();
    java.util.List[] list_array46 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array47 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array46;
    list_interpreterResultMessage_array47[0] = arraylist_interpreterResultMessage14;
    list_interpreterResultMessage_array47[1] = list_interpreterResultMessage23;
    list_interpreterResultMessage_array47[2] = list_interpreterResultMessage30;
    list_interpreterResultMessage_array47[3] = list_interpreterResultMessage37;
    list_interpreterResultMessage_array47[4] = list_interpreterResultMessage44;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array58 = linkedlist_resource3.toArray(list_interpreterResultMessage_array47);
    org.apache.zeppelin.resource.Resource resource59 = null;
    boolean b60 = linkedlist_resource3.offerFirst(resource59);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource61 = linkedlist_resource3.iterator();
    org.apache.zeppelin.resource.Resource[] resource_array63 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource64 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource64, resource_array63);
    org.apache.zeppelin.resource.Resource[] resource_array66 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource67 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource67, resource_array66);
    boolean b69 = arraylist_resource67.isEmpty();
    boolean b70 = linkedlist_resource64.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource67);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption71 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array72 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption71 };
    org.apache.zeppelin.display.ui.Select select73 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource64, paramOption_array72);
    org.apache.zeppelin.display.ui.Select select74 = new org.apache.zeppelin.display.ui.Select("", (java.lang.Object)iterator_resource61, paramOption_array72);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array75 = null;
    org.apache.zeppelin.display.OldInput oldInput76 = new org.apache.zeppelin.display.OldInput("", (java.lang.Object)"", paramOption_array75);
    
    // Checks the contract:  !oldInput76.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldInput76.equals(null)", !oldInput76.equals(null));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.interpreter.Interpreter.RegisteredInterpreter registeredInterpreter1 = org.apache.zeppelin.interpreter.Interpreter.findRegisteredInterpreterByClassName("_GLOBAL_");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    org.apache.zeppelin.resource.ResourcePool resourcePool0 = null;
    org.apache.zeppelin.dep.DependencyResolver dependencyResolver1 = null;
    org.apache.zeppelin.helium.ApplicationLoader applicationLoader2 = new org.apache.zeppelin.helium.ApplicationLoader(resourcePool0, dependencyResolver1);
    org.apache.zeppelin.helium.HeliumType heliumType3 = null;
    java.lang.String[][] str_array_array8 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = new org.apache.zeppelin.helium.HeliumPackage(heliumType3, "", "", "hi!", "hi!", str_array_array8, "post_exec_dev", "post_exec_dev");
    org.apache.zeppelin.resource.ResourceSet resourceSet14 = applicationLoader2.findRequiredResourceSet(str_array_array8, "InterpreterGroup_1497134350790_986318210", "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>");
    
    // Checks the contract:  equals-hashcode on heliumPackage11 and heliumPackage11
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on heliumPackage11 and heliumPackage11", heliumPackage11.equals(heliumPackage11) ? heliumPackage11.hashCode() == heliumPackage11.hashCode() : true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = new org.apache.zeppelin.user.AuthenticationInfo("anonymous", "org.apache.zeppelin.interpreter.InterpreterException: ");
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj8 = null;
    org.apache.zeppelin.display.GUI gUI9 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener11 = null;
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup12 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry13 = interpreterGroup12.getInterpreterHookRegistry();
    java.lang.String str14 = interpreterGroup12.toString();
    org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry remoteAngularObjectRegistry15 = new org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry("zeppelin.interpreter.port", angularObjectRegistryListener11, interpreterGroup12);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool17 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.resource.Resource resource21 = localResourcePool17.get("hi!", "zeppelin.interpreter.host", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner24 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("InterpreterGroup_1497134353138_86992792", "zeppelin.interpreter.host");
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner27 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("InterpreterGroup_1497134353138_86992792", "zeppelin.interpreter.host");
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner30 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("InterpreterGroup_1497134353138_86992792", "zeppelin.interpreter.host");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array31 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] { remoteInterpreterContextRunner24, remoteInterpreterContextRunner27, remoteInterpreterContextRunner30 };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner32 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner32, interpreterContextRunner_array31);
    org.apache.zeppelin.interpreter.InterpreterOutputListener interpreterOutputListener34 = null;
    org.apache.zeppelin.interpreter.InterpreterOutputChangeListener interpreterOutputChangeListener35 = null;
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput36 = new org.apache.zeppelin.interpreter.InterpreterOutput(interpreterOutputListener34, interpreterOutputChangeListener35);
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController37 = null;
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterEventClient remoteInterpreterEventClient38 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext39 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s rows. Learn more about <strong>%s</strong>", "hi!", "shared", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", authenticationInfo7, map_str_obj8, gUI9, (org.apache.zeppelin.display.AngularObjectRegistry)remoteAngularObjectRegistry15, (org.apache.zeppelin.resource.ResourcePool)localResourcePool17, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner32, interpreterOutput36, remoteWorksController37, remoteInterpreterEventClient38);
    
    // Checks the contract:  equals-hashcode on remoteInterpreterContextRunner27 and remoteInterpreterContextRunner24
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on remoteInterpreterContextRunner27 and remoteInterpreterContextRunner24", remoteInterpreterContextRunner27.equals(remoteInterpreterContextRunner24) ? remoteInterpreterContextRunner27.hashCode() == remoteInterpreterContextRunner24.hashCode() : true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    linkedlist_resource2.clear();
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array10 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] {  };
    org.apache.zeppelin.display.OldInput oldInput11 = new org.apache.zeppelin.display.OldInput("zeppelin.interpreter.port", (java.lang.Object)linkedlist_resource2, paramOption_array10);
    
    // Checks the contract:  !oldInput11.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldInput11.equals(null)", !oldInput11.equals(null));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    org.apache.zeppelin.display.OldInput oldInput0 = new org.apache.zeppelin.display.OldInput();
    
    // Checks the contract:  oldInput0.equals(oldInput0)
    org.junit.Assert.assertTrue("Contract failed: oldInput0.equals(oldInput0)", oldInput0.equals(oldInput0));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.resource.Resource resource9 = null;
    boolean b10 = linkedlist_resource2.add(resource9);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code11 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array12 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage13 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13, interpreterResultMessage_array12);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult15 = new org.apache.zeppelin.interpreter.InterpreterResult(code11, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage13);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code16 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array17 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage18 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage18, interpreterResultMessage_array17);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult20 = new org.apache.zeppelin.interpreter.InterpreterResult(code16, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage18);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code21 = interpreterResult20.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage22 = interpreterResult20.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code23 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array24 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage25 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage25, interpreterResultMessage_array24);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult27 = new org.apache.zeppelin.interpreter.InterpreterResult(code23, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage25);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code28 = interpreterResult27.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage29 = interpreterResult27.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code30 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array31 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage32 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage32, interpreterResultMessage_array31);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult34 = new org.apache.zeppelin.interpreter.InterpreterResult(code30, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage32);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code35 = interpreterResult34.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage36 = interpreterResult34.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code37 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array38 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage39 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage39, interpreterResultMessage_array38);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult41 = new org.apache.zeppelin.interpreter.InterpreterResult(code37, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage39);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code42 = interpreterResult41.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage43 = interpreterResult41.message();
    java.util.List[] list_array45 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array46 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array45;
    list_interpreterResultMessage_array46[0] = arraylist_interpreterResultMessage13;
    list_interpreterResultMessage_array46[1] = list_interpreterResultMessage22;
    list_interpreterResultMessage_array46[2] = list_interpreterResultMessage29;
    list_interpreterResultMessage_array46[3] = list_interpreterResultMessage36;
    list_interpreterResultMessage_array46[4] = list_interpreterResultMessage43;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array57 = linkedlist_resource2.toArray(list_interpreterResultMessage_array46);
    org.apache.zeppelin.tabledata.Row row58 = new org.apache.zeppelin.tabledata.Row((java.lang.Object[])list_interpreterResultMessage_array46);
    org.apache.zeppelin.display.OldInput oldInput59 = new org.apache.zeppelin.display.OldInput("{}", (java.lang.Object)row58);
    
    // Checks the contract:  !oldInput59.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldInput59.equals(null)", !oldInput59.equals(null));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

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
    java.lang.String str47 = heliumPackage46.getArtifact();
    java.lang.String str48 = heliumPackage46.getPublishedDate();
    java.lang.String[][] str_array_array49 = heliumPackage46.getResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet52 = applicationLoader37.findRequiredResourceSet(str_array_array49, "InterpreterGroup_1497134361189_-653890590", "InterpreterGroup_1497134376850_-1874169858");
    
    // Checks the contract:  equals-hashcode on heliumPackage46 and heliumPackage46
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on heliumPackage46 and heliumPackage46", heliumPackage46.equals(heliumPackage46) ? heliumPackage46.hashCode() == heliumPackage46.hashCode() : true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool interpreterContextRunnerPool0 = new org.apache.zeppelin.interpreter.remote.InterpreterContextRunnerPool();
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource8 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource8, resource_array7);
    org.apache.zeppelin.resource.Resource[] resource_array10 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource11 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource11, resource_array10);
    boolean b13 = arraylist_resource11.isEmpty();
    boolean b14 = linkedlist_resource8.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource11);
    org.apache.zeppelin.resource.Resource resource15 = null;
    boolean b16 = linkedlist_resource8.add(resource15);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource17 = linkedlist_resource8.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo18 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i19 = linkedlist_resource8.indexOf((java.lang.Object)authenticationInfo18);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj20 = null;
    org.apache.zeppelin.display.GUI gUI21 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener23 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry24 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener23);
    org.apache.zeppelin.display.AngularObject angularObject29 = angularObjectRegistry24.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool31 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array32 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner33 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner33, interpreterContextRunner_array32);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput35 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController36 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext37 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo18, map_str_obj20, gUI21, angularObjectRegistry24, (org.apache.zeppelin.resource.ResourcePool)localResourcePool31, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner33, interpreterOutput35, remoteWorksController36);
    interpreterContextRunnerPool0.addAll("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner33);
    interpreterContextRunnerPool0.clear("InterpreterGroup_1497134361189_-653890590");
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner44 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("InterpreterGroup_1497134353138_86992792", "zeppelin.interpreter.host");
    java.lang.String str45 = remoteInterpreterContextRunner44.getParagraphId();
    interpreterContextRunnerPool0.add("InterpreterGroup_1497134373781_-855626841", (org.apache.zeppelin.interpreter.InterpreterContextRunner)remoteInterpreterContextRunner44);
    org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner remoteInterpreterContextRunner50 = new org.apache.zeppelin.interpreter.remote.RemoteInterpreterContextRunner("InterpreterGroup_1497134353138_86992792", "zeppelin.interpreter.host");
    java.lang.String str51 = remoteInterpreterContextRunner50.getParagraphId();
    interpreterContextRunnerPool0.add("InterpreterGroup_1497134379014_-1019571993", (org.apache.zeppelin.interpreter.InterpreterContextRunner)remoteInterpreterContextRunner50);
    interpreterContextRunnerPool0.clear("AngularObject{noteId='null', paragraphId='null', object=null, name='null'}");
    
    // Checks the contract:  equals-hashcode on remoteInterpreterContextRunner50 and remoteInterpreterContextRunner44
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on remoteInterpreterContextRunner50 and remoteInterpreterContextRunner44", remoteInterpreterContextRunner50.equals(remoteInterpreterContextRunner44) ? remoteInterpreterContextRunner50.hashCode() == remoteInterpreterContextRunner44.hashCode() : true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    org.apache.zeppelin.resource.ResourceId resourceId0 = null;
    java.lang.Class[] class_array2 = new java.lang.Class[] {  };
    java.lang.String[] str_array4 = org.apache.zeppelin.display.Input.splitPipe("1");
    org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage invokeResourceMethodEventMessage6 = new org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage(resourceId0, "InterpreterGroup_1497134374528_1509866041", class_array2, (java.lang.Object[])str_array4, "<div class=\"result-alert alert-warning\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>%s</div>");
    
    // Checks the contract:  invokeResourceMethodEventMessage6.equals(invokeResourceMethodEventMessage6)
    org.junit.Assert.assertTrue("Contract failed: invokeResourceMethodEventMessage6.equals(invokeResourceMethodEventMessage6)", invokeResourceMethodEventMessage6.equals(invokeResourceMethodEventMessage6));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    org.apache.zeppelin.dep.DependencyContext dependencyContext2 = new org.apache.zeppelin.dep.DependencyContext("1");
    java.util.List<java.io.File> list_file3 = dependencyContext2.getFiles();
    org.apache.zeppelin.dep.Dependency dependency5 = dependencyContext2.load("InterpreterGroup_1497134387892_-1132206419");
    java.util.List<java.lang.String> list_str6 = dependency5.getExclusions();
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup8 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry9 = interpreterGroup8.getInterpreterHookRegistry();
    java.lang.String str10 = interpreterGroup8.toString();
    interpreterGroup8.close();
    org.apache.zeppelin.resource.ResourceSet resourceSet13 = org.apache.zeppelin.resource.ResourcePoolUtils.getAllResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet15 = resourceSet13.filterByClassname("<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>");
    org.apache.zeppelin.resource.ResourceSet resourceSet17 = resourceSet15.filterByClassnameRegex("pre_exec");
    org.apache.zeppelin.interpreter.InterpreterResult.Code code18 = null;
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult19 = new org.apache.zeppelin.interpreter.InterpreterResult(code18);
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage20 = interpreterResult19.message();
    boolean b21 = resourceSet15.removeAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)list_interpreterResultMessage20);
    org.apache.zeppelin.resource.Resource[] resource_array23 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource24 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource24, resource_array23);
    org.apache.zeppelin.resource.Resource[] resource_array26 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource27 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource27, resource_array26);
    boolean b29 = arraylist_resource27.isEmpty();
    boolean b30 = linkedlist_resource24.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource27);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption31 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array32 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption31 };
    org.apache.zeppelin.display.ui.Select select33 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource24, paramOption_array32);
    org.apache.zeppelin.display.ui.Select select34 = new org.apache.zeppelin.display.ui.Select("post_exec_dev", (java.lang.Object)list_interpreterResultMessage20, paramOption_array32);
    org.apache.zeppelin.display.ui.Select select35 = new org.apache.zeppelin.display.ui.Select("_GLOBAL_", (java.lang.Object)interpreterGroup8, paramOption_array32);
    org.apache.zeppelin.display.OldInput.OldCheckBox oldCheckBox36 = new org.apache.zeppelin.display.OldInput.OldCheckBox("existing_process", (java.lang.Object)list_str6, paramOption_array32);
    
    // Checks the contract:  !oldCheckBox36.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldCheckBox36.equals(null)", !oldCheckBox36.equals(null));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = org.apache.zeppelin.helium.HeliumType.INTERPRETER;
    org.apache.zeppelin.helium.HeliumType heliumType5 = null;
    java.lang.String[][] str_array_array10 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage13 = new org.apache.zeppelin.helium.HeliumPackage(heliumType5, "", "", "hi!", "hi!", str_array_array10, "post_exec_dev", "post_exec_dev");
    org.apache.zeppelin.helium.HeliumPackage heliumPackage16 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "InterpreterGroup_1497134379015_-1012113726", "zeppelin.interpreter.host", "InterpreterGroup_1497134369176_-1878842789", "InterpreterGroup_1497134376959_456934766", str_array_array10, "InterpreterGroup_1497134393545_537212119", "InterpreterGroup_1497134378013_-178412288");
    
    // Checks the contract:  equals-hashcode on heliumPackage13 and heliumPackage13
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on heliumPackage13 and heliumPackage13", heliumPackage13.equals(heliumPackage13) ? heliumPackage13.hashCode() == heliumPackage13.hashCode() : true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry2 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("{}");
    interpreterHookRegistry2.addRepl("isolated", "InterpreterGroup_1497134353138_86992792");
    org.apache.zeppelin.resource.Resource[] resource_array9 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource10 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource10, resource_array9);
    org.apache.zeppelin.resource.Resource[] resource_array12 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource13 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource13, resource_array12);
    boolean b15 = arraylist_resource13.isEmpty();
    boolean b16 = linkedlist_resource10.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource13);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption17 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array18 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption17 };
    org.apache.zeppelin.display.ui.Select select19 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource10, paramOption_array18);
    org.apache.zeppelin.display.ui.Select select20 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array18);
    org.apache.zeppelin.display.OldInput.OldCheckBox oldCheckBox21 = new org.apache.zeppelin.display.OldInput.OldCheckBox("InterpreterGroup_1497134406482_218481333", (java.lang.Object)"InterpreterGroup_1497134353138_86992792", paramOption_array18);
    
    // Checks the contract:  !oldCheckBox21.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldCheckBox21.equals(null)", !oldCheckBox21.equals(null));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption12 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array13 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption12 };
    org.apache.zeppelin.display.ui.Select select14 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource5, paramOption_array13);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array15 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] {  };
    org.apache.zeppelin.display.ui.CheckBox checkBox16 = org.apache.zeppelin.display.Input.checkbox("InterpreterGroup_1497134376850_-1874169858", (java.lang.Object[])paramOption_array13, paramOption_array15);
    org.apache.zeppelin.display.OldInput oldInput17 = new org.apache.zeppelin.display.OldInput("InterpreterGroup_1497134377883_708078564", (java.lang.Object)1L, paramOption_array15);
    
    // Checks the contract:  !oldInput17.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldInput17.equals(null)", !oldInput17.equals(null));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

    org.apache.zeppelin.user.Credentials credentials2 = new org.apache.zeppelin.user.Credentials((java.lang.Boolean)true, "zeppelin.interpreter.host");
    org.apache.zeppelin.user.UserCredentials userCredentials4 = credentials2.removeUserCredentials("InterpreterGroup_1497134387892_-1132206419");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = credentials2.removeCredentialEntity("InterpreterGroup_1497134384557_-1299248309", "InterpreterGroup_1497134384557_-1299248309");

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    org.apache.zeppelin.resource.Resource[] resource_array6 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource7 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource7, resource_array6);
    org.apache.zeppelin.resource.Resource[] resource_array9 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource10 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource10, resource_array9);
    boolean b12 = arraylist_resource10.isEmpty();
    boolean b13 = linkedlist_resource7.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource10);
    org.apache.zeppelin.resource.Resource resource14 = null;
    boolean b15 = linkedlist_resource7.add(resource14);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource16 = linkedlist_resource7.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo17 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i18 = linkedlist_resource7.indexOf((java.lang.Object)authenticationInfo17);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj19 = null;
    org.apache.zeppelin.display.GUI gUI20 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener22 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry23 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener22);
    org.apache.zeppelin.display.AngularObject angularObject28 = angularObjectRegistry23.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool30 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array31 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner32 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner32, interpreterContextRunner_array31);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput34 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController35 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext36 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo17, map_str_obj19, gUI20, angularObjectRegistry23, (org.apache.zeppelin.resource.ResourcePool)localResourcePool30, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner32, interpreterOutput34, remoteWorksController35);
    java.lang.Object obj39 = gUI20.textbox("", "zeppelin.interpreter.host");
    gUI20.convertOldInput();
    java.util.LinkedHashMap<java.lang.String,org.apache.zeppelin.display.Input> linkedhashmap_str_input41 = gUI20.getForms();
    org.apache.zeppelin.resource.Resource[] resource_array48 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource49 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource49, resource_array48);
    org.apache.zeppelin.resource.Resource[] resource_array51 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource52 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource52, resource_array51);
    boolean b54 = arraylist_resource52.isEmpty();
    boolean b55 = linkedlist_resource49.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource52);
    org.apache.zeppelin.resource.Resource resource56 = null;
    boolean b57 = linkedlist_resource49.add(resource56);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource58 = linkedlist_resource49.iterator();
    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo59 = org.apache.zeppelin.user.AuthenticationInfo.ANONYMOUS;
    int i60 = linkedlist_resource49.indexOf((java.lang.Object)authenticationInfo59);
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj61 = null;
    org.apache.zeppelin.display.GUI gUI62 = new org.apache.zeppelin.display.GUI();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener64 = null;
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry65 = new org.apache.zeppelin.display.AngularObjectRegistry("post_exec_dev", angularObjectRegistryListener64);
    org.apache.zeppelin.display.AngularObject angularObject70 = angularObjectRegistry65.remove("InterpreterGroup_1497134350938_711831855", "<strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "_GLOBAL_", false);
    org.apache.zeppelin.resource.LocalResourcePool localResourcePool72 = new org.apache.zeppelin.resource.LocalResourcePool("zeppelin.interpreter.port");
    org.apache.zeppelin.interpreter.InterpreterContextRunner[] interpreterContextRunner_array73 = new org.apache.zeppelin.interpreter.InterpreterContextRunner[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner> arraylist_interpreterContextRunner74 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterContextRunner>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner74, interpreterContextRunner_array73);
    org.apache.zeppelin.interpreter.InterpreterOutput interpreterOutput76 = null;
    org.apache.zeppelin.interpreter.RemoteWorksController remoteWorksController77 = null;
    org.apache.zeppelin.interpreter.InterpreterContext interpreterContext78 = new org.apache.zeppelin.interpreter.InterpreterContext("InterpreterGroup_1497134350938_711831855", "InterpreterGroup_1497134353138_86992792", "org.apache.zeppelin.interpreter.InterpreterException: ", "pre_exec_dev", "[null]", authenticationInfo59, map_str_obj61, gUI62, angularObjectRegistry65, (org.apache.zeppelin.resource.ResourcePool)localResourcePool72, (java.util.List<org.apache.zeppelin.interpreter.InterpreterContextRunner>)arraylist_interpreterContextRunner74, interpreterOutput76, remoteWorksController77);
    org.apache.zeppelin.display.AngularObjectRegistry angularObjectRegistry79 = interpreterContext78.getAngularObjectRegistry();
    java.lang.String str80 = interpreterContext78.getParagraphTitle();
    org.apache.zeppelin.display.GUI gUI81 = interpreterContext78.getGui();
    java.lang.String str82 = interpreterContext78.getParagraphText();
    org.apache.zeppelin.resource.Resource[] resource_array84 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource85 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b86 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource85, resource_array84);
    org.apache.zeppelin.resource.Resource[] resource_array87 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource88 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b89 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource88, resource_array87);
    boolean b90 = arraylist_resource88.isEmpty();
    boolean b91 = linkedlist_resource85.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource88);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption92 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array93 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption92 };
    org.apache.zeppelin.display.ui.Select select94 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource85, paramOption_array93);
    org.apache.zeppelin.display.ui.Select select95 = org.apache.zeppelin.display.Input.select("InterpreterGroup_1497134371990_1999798592", (java.lang.Object)str82, paramOption_array93);
    org.apache.zeppelin.display.OldInput.OldCheckBox oldCheckBox96 = new org.apache.zeppelin.display.OldInput.OldCheckBox("[null]", (java.lang.Object)linkedhashmap_str_input41, paramOption_array93);
    
    // Checks the contract:  !oldCheckBox96.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldCheckBox96.equals(null)", !oldCheckBox96.equals(null));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener2 = null;
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener4 = null;
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup5 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry6 = interpreterGroup5.getInterpreterHookRegistry();
    java.lang.String str7 = interpreterGroup5.toString();
    org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry remoteAngularObjectRegistry8 = new org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry("zeppelin.interpreter.port", angularObjectRegistryListener4, interpreterGroup5);
    org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry remoteAngularObjectRegistry9 = new org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry("", angularObjectRegistryListener2, interpreterGroup5);
    remoteAngularObjectRegistry9.removeAllAndNotifyRemoteProcess("_GLOBAL_", "zeppelin.interpreter.port");
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry15 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry((org.apache.zeppelin.display.AngularObjectRegistry)remoteAngularObjectRegistry9, "InterpreterGroup_1497134350790_986318210", "pre_exec");
    org.apache.zeppelin.display.OldInput.OldTextBox oldTextBox16 = new org.apache.zeppelin.display.OldInput.OldTextBox("shared", (java.lang.Object)"pre_exec");
    
    // Checks the contract:  !oldTextBox16.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldTextBox16.equals(null)", !oldTextBox16.equals(null));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }

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
    java.lang.String str43 = heliumPackage42.getArtifact();
    java.lang.String str44 = heliumPackage42.getPublishedDate();
    java.lang.String[][] str_array_array45 = heliumPackage42.getResources();
    org.apache.zeppelin.resource.ResourceSet resourceSet48 = applicationLoader33.findRequiredResourceSet(str_array_array45, "InterpreterGroup_1497134422540_309628923", "localhost");
    
    // Checks the contract:  equals-hashcode on heliumPackage42 and heliumPackage42
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on heliumPackage42 and heliumPackage42", heliumPackage42.equals(heliumPackage42) ? heliumPackage42.hashCode() == heliumPackage42.hashCode() : true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.display.GUI gUI1 = org.apache.zeppelin.display.GUI.fromJson("");

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }

    org.apache.zeppelin.interpreter.InterpreterPropertyBuilder interpreterPropertyBuilder3 = new org.apache.zeppelin.interpreter.InterpreterPropertyBuilder();
    org.apache.zeppelin.interpreter.InterpreterPropertyBuilder interpreterPropertyBuilder9 = interpreterPropertyBuilder3.add("InterpreterGroup_1497134408026_-794939986", "InterpreterGroup_1497134373781_-855626841", "InterpreterGroup_1497134384512_-890338748", "", "{}");
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterProperty> map_str_interpreterProperty10 = interpreterPropertyBuilder9.build();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.interpreter.Interpreter.register("InterpreterGroup_1497134425062_-942800446", "org.apache.zeppelin.tabledata.TableDataException: <strong>Output is truncated</strong> to %s bytes. Learn more about <strong>%s</strong>", "InterpreterGroup_1497134410092_-1974466412", map_str_interpreterProperty10);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }

    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource1 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    java.lang.String str2 = remoteZeppelinServerResource1.getOwnerKey();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type type3 = org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS;
    remoteZeppelinServerResource1.setResourceType(type3);
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource remoteZeppelinServerResource5 = new org.apache.zeppelin.interpreter.RemoteZeppelinServerResource();
    java.lang.String str6 = remoteZeppelinServerResource5.getOwnerKey();
    org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type type7 = org.apache.zeppelin.interpreter.RemoteZeppelinServerResource.Type.PARAGRAPH_RUNNERS;
    remoteZeppelinServerResource5.setResourceType(type7);
    remoteZeppelinServerResource1.setResourceType(type7);
    java.lang.String str10 = remoteZeppelinServerResource1.getOwnerKey();
    org.apache.zeppelin.display.OldInput.OldTextBox oldTextBox11 = new org.apache.zeppelin.display.OldInput.OldTextBox("InterpreterGroup_1497134408397_554648092", (java.lang.Object)remoteZeppelinServerResource1);
    
    // Checks the contract:  !oldTextBox11.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldTextBox11.equals(null)", !oldTextBox11.equals(null));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }

    org.apache.zeppelin.interpreter.InterpreterPropertyBuilder interpreterPropertyBuilder4 = new org.apache.zeppelin.interpreter.InterpreterPropertyBuilder();
    org.apache.zeppelin.interpreter.InterpreterPropertyBuilder interpreterPropertyBuilder10 = interpreterPropertyBuilder4.add("InterpreterGroup_1497134408026_-794939986", "InterpreterGroup_1497134373781_-855626841", "InterpreterGroup_1497134384512_-890338748", "", "{}");
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterProperty> map_str_interpreterProperty11 = interpreterPropertyBuilder10.build();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.interpreter.Interpreter.register("1", "InterpreterGroup_1497134376850_-1874169858", "", true, map_str_interpreterProperty11);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }

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
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource1.offerLast(resource12);
    org.apache.zeppelin.resource.Resource[] resource_array15 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource16 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16, resource_array15);
    org.apache.zeppelin.resource.Resource[] resource_array18 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource19 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19, resource_array18);
    boolean b21 = arraylist_resource19.isEmpty();
    boolean b22 = linkedlist_resource16.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource19);
    org.apache.zeppelin.resource.Resource resource23 = null;
    boolean b24 = linkedlist_resource16.add(resource23);
    boolean b26 = linkedlist_resource16.contains((java.lang.Object)(-1));
    boolean b27 = linkedlist_resource1.addAll(1, (java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource16);
    org.apache.zeppelin.resource.Resource resource28 = null;
    boolean b29 = linkedlist_resource16.offerLast(resource28);
    org.apache.zeppelin.resource.Resource resource30 = linkedlist_resource16.removeLast();
    org.apache.zeppelin.helium.HeliumType heliumType31 = null;
    java.lang.String[][] str_array_array36 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage39 = new org.apache.zeppelin.helium.HeliumPackage(heliumType31, "", "", "hi!", "hi!", str_array_array36, "post_exec_dev", "post_exec_dev");
    java.lang.String str40 = heliumPackage39.getArtifact();
    java.lang.String str41 = heliumPackage39.getGroupId();
    java.lang.String str42 = heliumPackage39.getArtifactId();
    java.util.Map<java.lang.String,java.lang.Object> map_str_obj43 = heliumPackage39.getConfig();
    java.lang.Object obj44 = null;
    boolean b45 = heliumPackage39.equals(obj44);
    java.lang.String str46 = heliumPackage39.getClassName();
    java.lang.String str47 = heliumPackage39.getArtifact();
    boolean b48 = linkedlist_resource16.equals((java.lang.Object)str47);
    
    // Checks the contract:  equals-hashcode on heliumPackage39 and heliumPackage39
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on heliumPackage39 and heliumPackage39", heliumPackage39.equals(heliumPackage39) ? heliumPackage39.hashCode() == heliumPackage39.hashCode() : true);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }

    org.apache.zeppelin.resource.ResourceId resourceId0 = null;
    java.lang.Class[] class_array2 = new java.lang.Class[] {  };
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource5 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource5, resource_array4);
    org.apache.zeppelin.resource.Resource[] resource_array7 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource8 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8, resource_array7);
    boolean b10 = arraylist_resource8.isEmpty();
    boolean b11 = linkedlist_resource5.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource8);
    org.apache.zeppelin.resource.Resource resource12 = null;
    boolean b13 = linkedlist_resource5.add(resource12);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code14 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array15 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage16 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage16, interpreterResultMessage_array15);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult18 = new org.apache.zeppelin.interpreter.InterpreterResult(code14, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage16);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code19 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array20 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage21 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21, interpreterResultMessage_array20);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult23 = new org.apache.zeppelin.interpreter.InterpreterResult(code19, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage21);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code24 = interpreterResult23.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage25 = interpreterResult23.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code26 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array27 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage28 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28, interpreterResultMessage_array27);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult30 = new org.apache.zeppelin.interpreter.InterpreterResult(code26, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage28);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code31 = interpreterResult30.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage32 = interpreterResult30.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code33 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array34 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage35 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage35, interpreterResultMessage_array34);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult37 = new org.apache.zeppelin.interpreter.InterpreterResult(code33, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage35);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code38 = interpreterResult37.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage39 = interpreterResult37.message();
    org.apache.zeppelin.interpreter.InterpreterResult.Code code40 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessage[] interpreterResultMessage_array41 = new org.apache.zeppelin.interpreter.InterpreterResultMessage[] {  };
    java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage> arraylist_interpreterResultMessage42 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterResultMessage>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage42, interpreterResultMessage_array41);
    org.apache.zeppelin.interpreter.InterpreterResult interpreterResult44 = new org.apache.zeppelin.interpreter.InterpreterResult(code40, (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>)arraylist_interpreterResultMessage42);
    org.apache.zeppelin.interpreter.InterpreterResult.Code code45 = interpreterResult44.code();
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage> list_interpreterResultMessage46 = interpreterResult44.message();
    java.util.List[] list_array48 = new java.util.List[ 5 ];
    @SuppressWarnings("unchecked")
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array49 = (java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[])list_array48;
    list_interpreterResultMessage_array49[0] = arraylist_interpreterResultMessage16;
    list_interpreterResultMessage_array49[1] = list_interpreterResultMessage25;
    list_interpreterResultMessage_array49[2] = list_interpreterResultMessage32;
    list_interpreterResultMessage_array49[3] = list_interpreterResultMessage39;
    list_interpreterResultMessage_array49[4] = list_interpreterResultMessage46;
    java.util.List<org.apache.zeppelin.interpreter.InterpreterResultMessage>[] list_interpreterResultMessage_array60 = linkedlist_resource5.toArray(list_interpreterResultMessage_array49);
    org.apache.zeppelin.tabledata.Row row61 = new org.apache.zeppelin.tabledata.Row((java.lang.Object[])list_interpreterResultMessage_array49);
    java.lang.Object[] obj_array62 = row61.get();
    java.lang.Object[] obj_array63 = row61.get();
    org.apache.zeppelin.helium.ApplicationException applicationException65 = new org.apache.zeppelin.helium.ApplicationException();
    org.apache.zeppelin.helium.ApplicationException applicationException66 = new org.apache.zeppelin.helium.ApplicationException((java.lang.Exception)applicationException65);
    org.apache.zeppelin.interpreter.InterpreterException interpreterException67 = new org.apache.zeppelin.interpreter.InterpreterException((java.lang.Throwable)applicationException66);
    org.apache.zeppelin.resource.Resource[] resource_array71 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource72 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource72, resource_array71);
    org.apache.zeppelin.resource.Resource[] resource_array74 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource75 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b76 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource75, resource_array74);
    boolean b77 = arraylist_resource75.isEmpty();
    boolean b78 = linkedlist_resource72.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource75);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption79 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array80 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption79 };
    org.apache.zeppelin.display.ui.Select select81 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource72, paramOption_array80);
    org.apache.zeppelin.display.ui.Select select82 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array80);
    org.apache.zeppelin.display.ui.Select select83 = new org.apache.zeppelin.display.ui.Select("InterpreterGroup_1497134421663_244465960", (java.lang.Object)interpreterException67, paramOption_array80);
    org.apache.zeppelin.display.ui.CheckBox checkBox84 = org.apache.zeppelin.display.Input.checkbox("%svg ", obj_array63, paramOption_array80);
    org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage invokeResourceMethodEventMessage86 = new org.apache.zeppelin.interpreter.remote.InvokeResourceMethodEventMessage(resourceId0, "InterpreterGroup_1497134431967_-148002840", class_array2, (java.lang.Object[])paramOption_array80, "zeppelin.repl.result");
    
    // Checks the contract:  invokeResourceMethodEventMessage86.equals(invokeResourceMethodEventMessage86)
    org.junit.Assert.assertTrue("Contract failed: invokeResourceMethodEventMessage86.equals(invokeResourceMethodEventMessage86)", invokeResourceMethodEventMessage86.equals(invokeResourceMethodEventMessage86));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }

    java.lang.Object obj1 = null;
    org.apache.zeppelin.interpreter.InterpreterResult.Type type3 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutputListener interpreterResultMessageOutputListener4 = null;
    org.apache.zeppelin.interpreter.InterpreterResultMessageOutput interpreterResultMessageOutput5 = new org.apache.zeppelin.interpreter.InterpreterResultMessageOutput(type3, interpreterResultMessageOutputListener4);
    org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage6 = interpreterResultMessageOutput5.toInterpreterResultMessage();
    org.apache.zeppelin.tabledata.InterpreterResultTableData interpreterResultTableData7 = new org.apache.zeppelin.tabledata.InterpreterResultTableData(interpreterResultMessage6);
    org.apache.zeppelin.tabledata.ColumnDef[] columnDef_array8 = interpreterResultTableData7.columns();
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
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array22 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] {  };
    org.apache.zeppelin.display.ui.CheckBox checkBox23 = org.apache.zeppelin.display.Input.checkbox("InterpreterGroup_1497134376850_-1874169858", (java.lang.Object[])paramOption_array20, paramOption_array22);
    org.apache.zeppelin.display.ui.CheckBox checkBox24 = new org.apache.zeppelin.display.ui.CheckBox("InterpreterGroup_1497134385425_-1840284417", (java.lang.Object[])columnDef_array8, paramOption_array22);
    org.apache.zeppelin.display.OldInput.OldSelect oldSelect25 = new org.apache.zeppelin.display.OldInput.OldSelect("pre_exec_dev", obj1, paramOption_array22);
    
    // Checks the contract:  !oldSelect25.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldSelect25.equals(null)", !oldSelect25.equals(null));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }

    org.apache.zeppelin.helium.HeliumType heliumType1 = null;
    java.lang.String[][] str_array_array6 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage9 = new org.apache.zeppelin.helium.HeliumPackage(heliumType1, "", "", "hi!", "hi!", str_array_array6, "post_exec_dev", "post_exec_dev");
    java.lang.String str10 = heliumPackage9.getDescription();
    java.lang.String[][] str_array_array11 = heliumPackage9.getResources();
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
    org.apache.zeppelin.display.ui.Select select27 = new org.apache.zeppelin.display.ui.Select("zeppelin.interpreter.port", (java.lang.Object)(short)0, paramOption_array25);
    java.lang.String str28 = select27.getDisplayName();
    org.apache.zeppelin.resource.Resource[] resource_array30 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource31 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource31, resource_array30);
    org.apache.zeppelin.resource.Resource[] resource_array33 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource34 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource34, resource_array33);
    boolean b36 = arraylist_resource34.isEmpty();
    boolean b37 = linkedlist_resource31.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource34);
    org.apache.zeppelin.resource.Resource resource38 = null;
    boolean b39 = linkedlist_resource31.add(resource38);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource40 = linkedlist_resource31.iterator();
    java.lang.String str41 = linkedlist_resource31.toString();
    java.lang.Object[] obj_array42 = linkedlist_resource31.toArray();
    org.apache.zeppelin.resource.Resource[] resource_array44 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource45 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource45, resource_array44);
    org.apache.zeppelin.resource.Resource[] resource_array47 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource48 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource48, resource_array47);
    boolean b50 = arraylist_resource48.isEmpty();
    boolean b51 = linkedlist_resource45.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource48);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption52 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array53 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption52 };
    org.apache.zeppelin.display.ui.Select select54 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource45, paramOption_array53);
    org.apache.zeppelin.display.ui.CheckBox checkBox55 = new org.apache.zeppelin.display.ui.CheckBox("shared", obj_array42, paramOption_array53);
    org.apache.zeppelin.display.ui.Select select56 = org.apache.zeppelin.display.Input.select("InterpreterGroup_1497134393546_1288425887", (java.lang.Object)str28, paramOption_array53);
    org.apache.zeppelin.display.OldInput.OldCheckBox oldCheckBox57 = new org.apache.zeppelin.display.OldInput.OldCheckBox("InterpreterGroup_1497134376959_456934766", (java.lang.Object)heliumPackage9, paramOption_array53);
    
    // Checks the contract:  !oldCheckBox57.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldCheckBox57.equals(null)", !oldCheckBox57.equals(null));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }

    org.apache.zeppelin.resource.Resource[] resource_array1 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource2 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource2, resource_array1);
    org.apache.zeppelin.resource.Resource[] resource_array4 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource5 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5, resource_array4);
    boolean b7 = arraylist_resource5.isEmpty();
    boolean b8 = linkedlist_resource2.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource5);
    org.apache.zeppelin.resource.Resource resource9 = null;
    boolean b10 = linkedlist_resource2.add(resource9);
    java.util.Iterator<org.apache.zeppelin.resource.Resource> iterator_resource11 = linkedlist_resource2.iterator();
    java.lang.String str12 = linkedlist_resource2.toString();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry14 = new org.apache.zeppelin.interpreter.InterpreterHookRegistry("[null]");
    int i15 = linkedlist_resource2.lastIndexOf((java.lang.Object)interpreterHookRegistry14);
    org.apache.zeppelin.resource.Resource[] resource_array18 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource19 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource19, resource_array18);
    org.apache.zeppelin.resource.Resource[] resource_array21 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource22 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource22, resource_array21);
    boolean b24 = arraylist_resource22.isEmpty();
    boolean b25 = linkedlist_resource19.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource22);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption26 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array27 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption26 };
    org.apache.zeppelin.display.ui.Select select28 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource19, paramOption_array27);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array29 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] {  };
    org.apache.zeppelin.display.ui.CheckBox checkBox30 = org.apache.zeppelin.display.Input.checkbox("InterpreterGroup_1497134376850_-1874169858", (java.lang.Object[])paramOption_array27, paramOption_array29);
    org.apache.zeppelin.display.OldInput.OldSelect oldSelect31 = new org.apache.zeppelin.display.OldInput.OldSelect("InterpreterGroup_1497134428680_1589686249", (java.lang.Object)interpreterHookRegistry14, paramOption_array29);
    
    // Checks the contract:  !oldSelect31.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldSelect31.equals(null)", !oldSelect31.equals(null));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }

    org.apache.zeppelin.user.AuthenticationInfo authenticationInfo2 = new org.apache.zeppelin.user.AuthenticationInfo("pre_exec");
    org.apache.zeppelin.display.OldInput oldInput3 = new org.apache.zeppelin.display.OldInput("InterpreterGroup_1497134350790_986318210", (java.lang.Object)authenticationInfo2);
    
    // Checks the contract:  !oldInput3.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !oldInput3.equals(null)", !oldInput3.equals(null));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }

    org.apache.zeppelin.helium.HeliumType heliumType1 = null;
    java.lang.String[][] str_array_array6 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage9 = new org.apache.zeppelin.helium.HeliumPackage(heliumType1, "", "", "hi!", "hi!", str_array_array6, "post_exec_dev", "post_exec_dev");
    java.lang.String str10 = heliumPackage9.getDescription();
    java.lang.String[][] str_array_array11 = heliumPackage9.getResources();
    org.apache.zeppelin.display.AngularObjectRegistryListener angularObjectRegistryListener14 = null;
    org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup15 = new org.apache.zeppelin.interpreter.InterpreterGroup();
    org.apache.zeppelin.interpreter.InterpreterHookRegistry interpreterHookRegistry16 = interpreterGroup15.getInterpreterHookRegistry();
    java.lang.String str17 = interpreterGroup15.toString();
    org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry remoteAngularObjectRegistry18 = new org.apache.zeppelin.interpreter.remote.RemoteAngularObjectRegistry("zeppelin.interpreter.port", angularObjectRegistryListener14, interpreterGroup15);
    org.apache.zeppelin.display.AngularObject angularObject23 = remoteAngularObjectRegistry18.remove("_GLOBAL_", "post_exec_dev", "_GLOBAL_", false);
    org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry heliumAppAngularObjectRegistry26 = new org.apache.zeppelin.helium.HeliumAppAngularObjectRegistry((org.apache.zeppelin.display.AngularObjectRegistry)remoteAngularObjectRegistry18, "InterpreterGroup_1497134350790_986318210", "InterpreterGroup_1497134367518_-1467696533");
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption29 = new org.apache.zeppelin.interpreter.InterpreterOption(true);
    org.apache.zeppelin.interpreter.InterpreterOption interpreterOption30 = org.apache.zeppelin.interpreter.InterpreterOption.fromInterpreterOption(interpreterOption29);
    interpreterOption30.setHost("[null]");
    interpreterOption30.setExistingProcess(false);
    org.apache.zeppelin.display.AngularObject angularObject35 = heliumAppAngularObjectRegistry26.add("pre_exec_dev", (java.lang.Object)interpreterOption30);
    org.apache.zeppelin.resource.Resource[] resource_array38 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.LinkedList<org.apache.zeppelin.resource.Resource> linkedlist_resource39 = new java.util.LinkedList<org.apache.zeppelin.resource.Resource>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)linkedlist_resource39, resource_array38);
    org.apache.zeppelin.resource.Resource[] resource_array41 = new org.apache.zeppelin.resource.Resource[] {  };
    java.util.ArrayList<org.apache.zeppelin.resource.Resource> arraylist_resource42 = new java.util.ArrayList<org.apache.zeppelin.resource.Resource>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource42, resource_array41);
    boolean b44 = arraylist_resource42.isEmpty();
    boolean b45 = linkedlist_resource39.addAll((java.util.Collection<org.apache.zeppelin.resource.Resource>)arraylist_resource42);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption paramOption46 = null;
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array47 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] { paramOption46 };
    org.apache.zeppelin.display.ui.Select select48 = org.apache.zeppelin.display.Input.select("post_exec_dev", (java.lang.Object)linkedlist_resource39, paramOption_array47);
    org.apache.zeppelin.display.ui.OptionInput.ParamOption[] paramOption_array49 = new org.apache.zeppelin.display.ui.OptionInput.ParamOption[] {  };
    org.apache.zeppelin.display.ui.CheckBox checkBox50 = org.apache.zeppelin.display.Input.checkbox("InterpreterGroup_1497134376850_-1874169858", (java.lang.Object[])paramOption_array47, paramOption_array49);
    org.apache.zeppelin.display.ui.Select select51 = new org.apache.zeppelin.display.ui.Select("InterpreterGroup_1497134419263_1893234849", (java.lang.Object)angularObject35, paramOption_array49);
    org.apache.zeppelin.display.ui.CheckBox checkBox52 = new org.apache.zeppelin.display.ui.CheckBox("InterpreterGroup_1497134425803_-166526896", (java.lang.Object[])str_array_array11, paramOption_array49);
    
    // Checks the contract:  equals-hashcode on heliumPackage9 and heliumPackage9
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on heliumPackage9 and heliumPackage9", heliumPackage9.equals(heliumPackage9) ? heliumPackage9.hashCode() == heliumPackage9.hashCode() : true);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }

    org.apache.zeppelin.helium.HeliumType heliumType0 = null;
    java.lang.String[][] str_array_array5 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = new org.apache.zeppelin.helium.HeliumPackage(heliumType0, "", "", "hi!", "hi!", str_array_array5, "post_exec_dev", "post_exec_dev");
    java.lang.String str9 = heliumPackage8.getArtifactId();
    org.apache.zeppelin.helium.HeliumType heliumType10 = null;
    java.lang.String[][] str_array_array15 = new java.lang.String[][] {  };
    org.apache.zeppelin.helium.HeliumPackage heliumPackage18 = new org.apache.zeppelin.helium.HeliumPackage(heliumType10, "", "", "hi!", "hi!", str_array_array15, "post_exec_dev", "post_exec_dev");
    java.lang.String str19 = heliumPackage18.getDescription();
    java.lang.String[][] str_array_array20 = heliumPackage18.getResources();
    java.lang.String str21 = heliumPackage18.getLicense();
    boolean b22 = heliumPackage8.equals((java.lang.Object)str21);
    
    // Checks the contract:  equals-hashcode on heliumPackage18 and heliumPackage18
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on heliumPackage18 and heliumPackage18", heliumPackage18.equals(heliumPackage18) ? heliumPackage18.hashCode() == heliumPackage18.hashCode() : true);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }

    org.apache.zeppelin.interpreter.InterpreterPropertyBuilder interpreterPropertyBuilder4 = new org.apache.zeppelin.interpreter.InterpreterPropertyBuilder();
    org.apache.zeppelin.interpreter.InterpreterPropertyBuilder interpreterPropertyBuilder10 = interpreterPropertyBuilder4.add("InterpreterGroup_1497134408026_-794939986", "InterpreterGroup_1497134373781_-855626841", "InterpreterGroup_1497134384512_-890338748", "", "{}");
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterProperty> map_str_interpreterProperty11 = interpreterPropertyBuilder10.build();
    java.util.Map<java.lang.String,org.apache.zeppelin.interpreter.InterpreterProperty> map_str_interpreterProperty12 = interpreterPropertyBuilder10.build();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.zeppelin.interpreter.Interpreter.register("InterpreterGroup_1497134419263_1893234849", "InterpreterGroup_1497134431334_-763290912", "", false, map_str_interpreterProperty12);

  }

}
