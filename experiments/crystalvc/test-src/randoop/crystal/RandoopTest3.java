package randoop.crystal;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test1"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("100 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test2"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test3"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    var4.setChanged(true);
    long var21 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("hi!", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "hi!", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test7"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test8"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setGitPath("1 ms");
    java.lang.String var16 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var16.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test9"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    long var18 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var25.setChanged(true);
    var25.setHgPath("10 ms");
    boolean var30 = var4.equals((java.lang.Object)"10 ms");
    boolean var31 = var4.hasChanged();
    boolean var32 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test10"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setHgPath("10 ms");
    var4.setGitPath("-1 ms");
    boolean var11 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test11"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var8 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test12"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setTempDirectory("0 ms");
    var4.setTempDirectory("-1 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    crystal.client.ClientPreferences var13 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var13
    assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var13 and var4
    assertTrue("Contract failed: equals-hashcode on var13 and var4", var13.equals(var4) ? var13.hashCode() == var4.hashCode() : true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test13"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    long var18 = var4.getRefresh();
    crystal.client.ConflictDaemon var19 = crystal.client.ConflictDaemon.getInstance();
    var19.removeAllListeners();
    var19.enable(true);
    var19.enable(true);
    var19.enable(true);
    boolean var27 = var4.equals((java.lang.Object)true);
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "10 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test15"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test16"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setRefresh(0L);
    var4.setTempDirectory("");
    var4.setHgPath("382707 hours 44 min");
    boolean var21 = var4.hasChanged();
    var4.setTempDirectory("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test17"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.enable(false);
    var0.enable(false);
    java.util.Collection var10 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test18"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "-1 ms", "-1 ms", 0L);
    java.lang.String var5 = var4.getTempDirectory();
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var5.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test19"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    java.util.Collection var6 = var0.getRelationships();
    java.util.Collection var7 = var0.getLocalStates();
    boolean var8 = var0.isEnabled();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test20"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    long var8 = var5.getRefresh();
    java.util.Collection var9 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "hi!", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test22"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("100 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test23"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    long var14 = var4.getRefresh();
    java.lang.String var15 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100 ms"+ "'", var15.equals("100 ms"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test24"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("0 ms");
    crystal.client.ClientPreferences var17 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var17.setGitPath("10 ms");
    var17.setTempDirectory("");
    var17.setChanged(true);
    var17.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var17, "382707 hours 44 min");
    var17.setHgPath("100 ms");
    boolean var30 = var4.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test25"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    crystal.client.ClientPreferences var21 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var21.setChanged(true);
    var21.setGitPath("10 ms");
    var21.setRefresh(1L);
    var21.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var30 = var21.getHgPath();
    var21.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var21, "382707 hours 44 min");
    long var35 = var21.getRefresh();
    java.util.Collection var36 = var21.getProjectPreference();
    boolean var37 = var4.equals((java.lang.Object)var36);
    long var38 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var30.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 100L);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test26"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var15 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var15.setGitPath("10 ms");
    var15.setTempDirectory("");
    var15.setChanged(true);
    var15.setRefresh(100L);
    java.lang.String var24 = var15.getTempDirectory();
    java.lang.String var25 = var15.getGitPath();
    boolean var26 = var4.equals((java.lang.Object)var15);
    var4.setGitPath("382707 hours 44 min");
    java.lang.String var29 = var4.getHgPath();
    var4.setRefresh(100L);
    crystal.client.ClientPreferences var36 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var36.setGitPath("10 ms");
    var36.setTempDirectory("");
    var36.setChanged(true);
    var36.setRefresh(100L);
    java.lang.String var45 = var36.getTempDirectory();
    java.util.Collection var46 = var36.getProjectPreference();
    var36.setGitPath("100 ms");
    boolean var49 = var4.equals((java.lang.Object)"100 ms");
    
    // Checks the contract:  equals-hashcode on var15 and var36
    assertTrue("Contract failed: equals-hashcode on var15 and var36", var15.equals(var36) ? var15.hashCode() == var36.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var36 and var15
    assertTrue("Contract failed: equals-hashcode on var36 and var15", var36.equals(var15) ? var36.hashCode() == var15.hashCode() : true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test27"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    boolean var6 = var0.isEnabled();
    boolean var7 = var0.isEnabled();
    boolean var8 = var0.isEnabled();
    java.util.Collection var9 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test28"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    java.util.Collection var9 = var4.getProjectPreference();
    crystal.client.ClientPreferences var14 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var14.setChanged(true);
    var14.setGitPath("10 ms");
    var14.setRefresh(1L);
    var14.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var23 = var14.hasChanged();
    var14.setChanged(true);
    var14.setHgPath("-1 ms");
    long var28 = var14.getRefresh();
    var14.setHgPath("382707 hours 44 min");
    boolean var31 = var4.equals((java.lang.Object)"382707 hours 44 min");
    var4.setChanged(false);
    var4.setGitPath("hi!");
    java.lang.String var36 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10 ms"+ "'", var8.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "100 ms"+ "'", var36.equals("100 ms"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test29"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getRelationships();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test30"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setHgPath("10 ms");
    java.lang.String var9 = var4.getTempDirectory();
    var4.setTempDirectory("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var9.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test31"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    long var17 = var4.getRefresh();
    long var18 = var4.getRefresh();
    var4.setGitPath("382707 hours 44 min");
    var4.setRefresh(100L);
    boolean var23 = var4.hasChanged();
    java.lang.String var24 = var4.getGitPath();
    java.lang.String var25 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "382707 hours 44 min"+ "'", var24.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "10 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test33"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    long var17 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1L);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test34"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test35"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getRelationships();
    java.util.Collection var8 = var0.getRelationships();
    java.awt.Image var9 = crystal.model.Relationship.getDominant(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test36"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    var0.removeAllListeners();
    boolean var9 = var0.isEnabled();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test37"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "hi!", "2013-08-28T20-44-41.156-0700", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test38"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setTempDirectory("hi!");
    java.lang.String var16 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test39"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "10 ms", "382707 hours 44 min", 100L);
    java.lang.String var5 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0 ms"+ "'", var5.equals("0 ms"));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test40"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    var4.setRefresh(1L);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test41"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setTempDirectory("hi!");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("10 ms");
    java.lang.String var19 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test42"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    var4.setRefresh(1L);
    long var18 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test43"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "0 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test44"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test45"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setGitPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test46"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test47"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "hi!", "1 ms", 1L);
    var4.setRefresh(10L);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test48"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "0 ms", "hi!", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test49"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(true);
    java.util.Collection var17 = var4.getProjectPreference();
    java.lang.String var18 = var4.getHgPath();
    var4.setRefresh((-1L));
    java.util.Collection var21 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ConflictDaemon var23 = crystal.client.ConflictDaemon.getInstance();
    boolean var24 = var23.isEnabled();
    java.util.Collection var25 = var23.getLocalStates();
    var23.removeAllListeners();
    java.util.Collection var27 = var23.getRelationships();
    boolean var28 = var23.isEnabled();
    java.util.Collection var29 = var23.getLocalStates();
    boolean var30 = var23.isEnabled();
    var23.removeAllListeners();
    java.util.Collection var32 = var23.getLocalStates();
    var23.removeAllListeners();
    boolean var34 = var4.equals((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test50"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("382707 hours 44 min");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test51"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    java.lang.String var9 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test52"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var15 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var15.setGitPath("10 ms");
    var15.setTempDirectory("");
    var15.setChanged(true);
    var15.setRefresh(100L);
    java.lang.String var24 = var15.getTempDirectory();
    java.lang.String var25 = var15.getGitPath();
    boolean var26 = var4.equals((java.lang.Object)var15);
    java.lang.String var27 = var4.getTempDirectory();
    var4.setRefresh(1L);
    java.lang.String var30 = var4.getTempDirectory();
    java.util.Collection var31 = var4.getProjectPreference();
    var4.setRefresh((-1L));
    java.lang.String var34 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var27.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var30.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test53"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setTempDirectory("hi!");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test54"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getRelationships();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test55"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    long var18 = var4.getRefresh();
    java.util.Collection var19 = var4.getProjectPreference();
    crystal.client.ClientPreferences var24 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var24.setChanged(true);
    var24.setGitPath("10 ms");
    var24.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var24);
    boolean var32 = var4.equals((java.lang.Object)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var34 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test56"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test57"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "100 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test58"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getGitPath();
    var4.setHgPath("");
    java.lang.String var16 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test59"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    crystal.client.ConflictDaemon var15 = crystal.client.ConflictDaemon.getInstance();
    var15.enable(true);
    java.util.Collection var18 = var15.getLocalStates();
    java.util.Collection var19 = var15.getLocalStates();
    boolean var20 = var4.equals((java.lang.Object)var19);
    var4.setHgPath("hi!");
    crystal.client.ClientPreferences var27 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var27.setGitPath("10 ms");
    var27.setTempDirectory("");
    var27.setChanged(true);
    var27.setRefresh(100L);
    java.lang.String var36 = var27.getTempDirectory();
    java.util.Collection var37 = var27.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var27);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var27);
    var27.setGitPath("100 ms");
    crystal.client.ClientPreferences var46 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var46.setGitPath("10 ms");
    var46.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var46, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var46, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var55 = var46.getProjectPreference();
    java.util.Collection var56 = var46.getProjectPreference();
    java.lang.String var57 = var46.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var46);
    boolean var59 = var46.hasChanged();
    boolean var60 = var27.equals((java.lang.Object)var46);
    boolean var61 = var4.equals((java.lang.Object)var27);
    
    // Checks the contract:  equals-hashcode on var4 and var27
    assertTrue("Contract failed: equals-hashcode on var4 and var27", var4.equals(var27) ? var4.hashCode() == var27.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var27 and var4
    assertTrue("Contract failed: equals-hashcode on var27 and var4", var27.equals(var4) ? var27.hashCode() == var4.hashCode() : true);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test60"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test61"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "10 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test62"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "0 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test63"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "", "-1 ms", 1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test64"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var12 = var4.getHgPath();
    java.util.Collection var13 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test65"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test66"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    var1.enable(true);
    var1.enable(false);
    var1.removeAllListeners();
    var1.removeAllListeners();
    java.util.Collection var11 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test67"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    boolean var7 = var0.isEnabled();
    boolean var8 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test68"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "0 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test69"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    long var18 = var4.getRefresh();
    long var19 = var4.getRefresh();
    var4.setGitPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1L);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test70"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test71"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getHgPath();
    var4.setHgPath("0 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test72"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    var4.setGitPath("100 ms");
    crystal.client.ClientPreferences var23 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var23.setGitPath("10 ms");
    var23.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var23, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var23, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var32 = var23.getProjectPreference();
    java.util.Collection var33 = var23.getProjectPreference();
    java.lang.String var34 = var23.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var23);
    boolean var36 = var23.hasChanged();
    boolean var37 = var4.equals((java.lang.Object)var23);
    crystal.client.ClientPreferences var42 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var42.setGitPath("10 ms");
    var42.setTempDirectory("");
    var42.setChanged(true);
    var42.setRefresh(100L);
    java.lang.String var51 = var42.getTempDirectory();
    var42.setRefresh(10L);
    boolean var54 = var4.equals((java.lang.Object)var42);
    var42.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test73"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    java.lang.String var11 = var4.getGitPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var13 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test74"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test75"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    long var18 = var4.getRefresh();
    java.util.Collection var19 = var4.getProjectPreference();
    crystal.client.ClientPreferences var24 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var24.setChanged(true);
    var24.setGitPath("10 ms");
    var24.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var24);
    boolean var32 = var4.equals((java.lang.Object)var24);
    crystal.client.ConflictDaemon var33 = crystal.client.ConflictDaemon.getInstance();
    var33.removeAllListeners();
    var33.enable(true);
    var33.removeAllListeners();
    java.util.Collection var38 = var33.getRelationships();
    boolean var39 = var4.equals((java.lang.Object)var33);
    java.util.Collection var40 = var33.getRelationships();
    java.awt.Image var41 = crystal.model.Relationship.getDominant(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test76"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "-1 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test77"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    java.util.Collection var9 = var4.getProjectPreference();
    crystal.client.ClientPreferences var14 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var14.setChanged(true);
    var14.setGitPath("10 ms");
    var14.setRefresh(1L);
    var14.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var23 = var14.hasChanged();
    var14.setChanged(true);
    var14.setHgPath("-1 ms");
    long var28 = var14.getRefresh();
    var14.setHgPath("382707 hours 44 min");
    boolean var31 = var4.equals((java.lang.Object)"382707 hours 44 min");
    var4.setChanged(false);
    var4.setGitPath("hi!");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10 ms"+ "'", var8.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test78"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "100 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test79"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setChanged(false);
    java.lang.String var16 = var4.getHgPath();
    crystal.client.ClientPreferences var17 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var17
    assertTrue("Contract failed: equals-hashcode on var4 and var17", var4.equals(var17) ? var4.hashCode() == var17.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var17 and var4
    assertTrue("Contract failed: equals-hashcode on var17 and var4", var17.equals(var4) ? var17.hashCode() == var4.hashCode() : true);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test80"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "0 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test81"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "0 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test82"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test83"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "100 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test84"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    java.util.Collection var6 = var0.getRelationships();
    boolean var7 = var0.isEnabled();
    var0.removeAllListeners();
    boolean var9 = var0.isEnabled();
    java.util.Collection var10 = var0.getLocalStates();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var14 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test85"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.lang.String var14 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var14.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test86"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getGitPath();
    crystal.client.ClientPreferences var15 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var15.setGitPath("10 ms");
    var15.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var15, "2013-08-28T20-44-41.156-0700");
    long var22 = var15.getRefresh();
    boolean var23 = var4.equals((java.lang.Object)var22);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test87"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    java.lang.String var7 = var4.getGitPath();
    var4.setTempDirectory("hi!");
    java.lang.String var10 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test88"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    long var14 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10L);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test89"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getRelationships();
    boolean var6 = var1.isEnabled();
    java.util.Collection var7 = var1.getLocalStates();
    boolean var8 = var1.isEnabled();
    var1.removeAllListeners();
    java.util.Collection var10 = var1.getLocalStates();
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test90"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.lang.String var8 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    long var10 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10L);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test91"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    java.util.Collection var5 = var1.getRelationships();
    java.util.Collection var6 = var1.getLocalStates();
    java.util.Collection var7 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test92"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.lang.String var16 = var4.getHgPath();
    var4.setGitPath("0 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test93"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences var12 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var12
    assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var12 and var4
    assertTrue("Contract failed: equals-hashcode on var12 and var4", var12.equals(var4) ? var12.hashCode() == var4.hashCode() : true);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test94"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "382707 hours 44 min", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test95"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getRelationships();
    java.util.Collection var7 = var0.getLocalStates();
    java.util.Collection var8 = var0.getLocalStates();
    java.util.Collection var9 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test96"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "hi!", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test97"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test98"); }


    crystal.server.GitLogParser var0 = new crystal.server.GitLogParser();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test99"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    var4.setChanged(true);
    var4.setHgPath("hi!");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test100"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setRefresh(1L);
    var4.setGitPath("1 ms");
    var4.setChanged(false);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test101"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    java.lang.String var18 = var4.getHgPath();
    var4.setHgPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "382707 hours 44 min"+ "'", var18.equals("382707 hours 44 min"));

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test102"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    java.util.Collection var5 = var1.getRelationships();
    java.util.Collection var6 = var1.getRelationships();
    java.util.Collection var7 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test103"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "382707 hours 44 min", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test104"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test105"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    boolean var6 = var0.isEnabled();
    var0.enable(true);
    java.util.Collection var9 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test106"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "382707 hours 44 min", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test107"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test108"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getGitPath();
    var4.setGitPath("hi!");
    java.util.Collection var14 = var4.getProjectPreference();
    boolean var15 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test109"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "10 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test110"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test111"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    long var14 = var5.getRefresh();
    var5.setChanged(false);
    var5.setTempDirectory("10 ms");
    long var19 = var5.getRefresh();
    var5.setChanged(true);
    long var22 = var5.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    java.util.Collection var24 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test112"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "10 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test113"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var9 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test114"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    var5.setRefresh(10L);
    java.util.Collection var17 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test115"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test116"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setTempDirectory("1 ms");
    var4.setGitPath("hi!");
    java.lang.String var19 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "1 ms"+ "'", var19.equals("1 ms"));

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test117"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getLocalStates();
    boolean var8 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test118"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    java.lang.String var13 = var4.getTempDirectory();
    boolean var14 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test119"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("1 ms", "1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test120"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("382707 hours 44 min");
    java.util.Collection var12 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var12);
    java.awt.Image var14 = crystal.model.Relationship.getDominant(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test121"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences var13 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var13.setGitPath("10 ms");
    var13.setTempDirectory("");
    var13.setChanged(true);
    var13.setRefresh(100L);
    java.util.Collection var22 = var13.getProjectPreference();
    java.util.Collection var23 = var13.getProjectPreference();
    java.util.Collection var24 = var13.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var13);
    boolean var26 = var4.equals((java.lang.Object)var13);
    var13.setTempDirectory("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences var29 = var13.clone();
    
    // Checks the contract:  equals-hashcode on var13 and var29
    assertTrue("Contract failed: equals-hashcode on var13 and var29", var13.equals(var29) ? var13.hashCode() == var29.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var29 and var13
    assertTrue("Contract failed: equals-hashcode on var29 and var13", var29.equals(var13) ? var29.hashCode() == var13.hashCode() : true);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test122"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    java.lang.String var20 = var4.getGitPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10 ms"+ "'", var20.equals("10 ms"));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test123"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "", "hi!", 100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test124"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "-1 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setHgPath("0 ms");

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test125"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    long var8 = var4.getRefresh();
    var4.setRefresh(1L);
    crystal.client.ConflictDaemon var11 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var12 = var11.getRelationships();
    var11.removeAllListeners();
    java.util.Collection var14 = var11.getLocalStates();
    var11.enable(true);
    var11.removeAllListeners();
    var11.removeAllListeners();
    boolean var19 = var4.equals((java.lang.Object)var11);
    java.util.Collection var20 = var11.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test126"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var4 = var0.isEnabled();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test127"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ConflictDaemon var14 = crystal.client.ConflictDaemon.getInstance();
    var14.removeAllListeners();
    var14.enable(true);
    java.util.Collection var18 = var14.getRelationships();
    boolean var19 = var4.equals((java.lang.Object)var14);
    java.util.Collection var20 = var14.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test128"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test129"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("382707 hours 44 min", var2, "1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test130"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test131"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "10 ms", "382707 hours 44 min", 10L);
    var4.setGitPath("");

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test132"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "382707 hours 44 min", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test133"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    var5.setGitPath("10 ms");
    var5.setRefresh(1L);
    var5.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var14 = var5.getHgPath();
    var5.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "382707 hours 44 min");
    long var19 = var5.getRefresh();
    java.util.Collection var20 = var5.getProjectPreference();
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var25.setChanged(true);
    var25.setGitPath("10 ms");
    var25.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var25);
    boolean var33 = var5.equals((java.lang.Object)var25);
    crystal.client.ConflictDaemon var34 = crystal.client.ConflictDaemon.getInstance();
    var34.removeAllListeners();
    var34.enable(true);
    var34.removeAllListeners();
    java.util.Collection var39 = var34.getRelationships();
    boolean var40 = var5.equals((java.lang.Object)var34);
    java.util.Collection var41 = var34.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var41);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var14.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test134"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test135"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("100 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test136"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("100 ms", "-1 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test137"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test138"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test139"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var5 = var0.getRelationships();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test140"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    java.util.Collection var2 = var0.getRelationships();
    java.util.Collection var3 = var0.getLocalStates();
    boolean var4 = var0.isEnabled();
    java.util.Collection var5 = var0.getLocalStates();
    boolean var6 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test141"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    long var7 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10L);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test142"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("");

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test143"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    boolean var11 = var4.hasChanged();
    var4.setGitPath("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test144"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test145"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "hi!", "0 ms", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test146"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    long var18 = var4.getRefresh();
    crystal.client.ConflictDaemon var19 = crystal.client.ConflictDaemon.getInstance();
    var19.removeAllListeners();
    var19.enable(true);
    var19.enable(true);
    var19.enable(true);
    boolean var27 = var4.equals((java.lang.Object)true);
    var4.setGitPath("10 ms");
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test147"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    java.util.Collection var7 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test148"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    boolean var7 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test149"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    var4.setGitPath("");
    java.lang.String var26 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var26.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test150"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    long var11 = var4.getRefresh();
    var4.setRefresh(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10L);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test151"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "0 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test152"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var15 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var15.setGitPath("10 ms");
    var15.setTempDirectory("");
    var15.setChanged(true);
    var15.setRefresh(100L);
    java.lang.String var24 = var15.getTempDirectory();
    java.lang.String var25 = var15.getGitPath();
    boolean var26 = var4.equals((java.lang.Object)var15);
    var4.setGitPath("382707 hours 44 min");
    boolean var29 = var4.hasChanged();
    var4.setChanged(true);
    var4.setRefresh(0L);
    java.lang.String var34 = var4.getHgPath();
    var4.setRefresh((-1L));
    var4.setRefresh((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test153"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test154"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var9 = var4.getHgPath();
    var4.setGitPath("-1 ms");
    boolean var12 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test155"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("0 ms");
    long var13 = var4.getRefresh();
    java.lang.String var14 = var4.getTempDirectory();
    var4.setGitPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test156"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setTempDirectory("hi!");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var18 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test157"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    var4.setGitPath("100 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test158"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setChanged(true);
    long var7 = var4.getRefresh();
    crystal.client.ConflictDaemon var8 = crystal.client.ConflictDaemon.getInstance();
    var8.removeAllListeners();
    var8.enable(true);
    var8.removeAllListeners();
    boolean var13 = var8.isEnabled();
    java.util.Collection var14 = var8.getLocalStates();
    var8.enable(true);
    boolean var17 = var4.equals((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test159"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    var1.removeAllListeners();
    boolean var5 = var1.isEnabled();
    java.util.Collection var6 = var1.getLocalStates();
    java.util.Collection var7 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test160"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test161"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.lang.String var8 = var4.getHgPath();
    var4.setRefresh(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test162"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test163"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "-1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test164"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("-1 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test165"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(1L);
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setChanged(true);
    java.lang.String var19 = var16.getHgPath();
    var16.setGitPath("-1 ms");
    boolean var22 = var4.equals((java.lang.Object)var16);
    long var23 = var16.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10L);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test166"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    long var16 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100L);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test167"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    java.util.Collection var9 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var9);
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test168"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(true);
    boolean var8 = var0.isEnabled();
    java.util.Collection var9 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var11 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test169"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    long var18 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var25.setChanged(true);
    var25.setHgPath("10 ms");
    boolean var30 = var4.equals((java.lang.Object)"10 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test170"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "0 ms", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test171"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    boolean var6 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test172"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "hi!", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test173"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "hi!", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test174"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    crystal.client.ClientPreferences var21 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var21.setChanged(true);
    var21.setGitPath("10 ms");
    var21.setRefresh(1L);
    var21.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var30 = var21.getHgPath();
    var21.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var21, "382707 hours 44 min");
    long var35 = var21.getRefresh();
    boolean var36 = var4.equals((java.lang.Object)var21);
    var4.setTempDirectory("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var30.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test175"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    crystal.client.ConflictDaemon var14 = crystal.client.ConflictDaemon.getInstance();
    var14.enable(true);
    java.util.Collection var17 = var14.getRelationships();
    java.util.Collection var18 = var14.getRelationships();
    boolean var19 = var4.equals((java.lang.Object)var18);
    java.lang.String var20 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var20.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test176"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test177"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    var0.removeAllListeners();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test178"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var15 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var15.setGitPath("10 ms");
    var15.setTempDirectory("");
    var15.setChanged(true);
    var15.setRefresh(100L);
    java.lang.String var24 = var15.getTempDirectory();
    java.lang.String var25 = var15.getGitPath();
    boolean var26 = var4.equals((java.lang.Object)var15);
    var4.setGitPath("382707 hours 44 min");
    boolean var29 = var4.hasChanged();
    boolean var30 = var4.hasChanged();
    java.lang.String var31 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var33 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var31.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test179"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test180"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "2013-08-28T20-44-41.156-0700", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test181"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test182"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var16 = var4.hasChanged();
    var4.setHgPath("100 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test183"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.lang.String var14 = var4.getGitPath();
    var4.setHgPath("");
    java.lang.String var17 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test184"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "10 ms", "0 ms", 0L);
    java.util.Collection var5 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test185"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    java.lang.String var5 = var4.getHgPath();
    long var6 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100 ms"+ "'", var5.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1L);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test186"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    long var18 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    java.lang.String var21 = var4.getTempDirectory();
    crystal.client.ClientPreferences var26 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var26.setGitPath("10 ms");
    var26.setTempDirectory("");
    var26.setChanged(true);
    var26.setRefresh(100L);
    long var35 = var26.getRefresh();
    long var36 = var26.getRefresh();
    var26.setChanged(false);
    long var39 = var26.getRefresh();
    java.util.Collection var40 = var26.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var40);
    java.awt.Image var42 = crystal.model.Relationship.getDominant(var40);
    boolean var43 = var4.equals((java.lang.Object)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var21.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test187"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "382707 hours 44 min", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test188"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test189"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test190"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    java.lang.String var15 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var15.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test191"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    java.lang.String var9 = var4.getGitPath();
    java.lang.String var10 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10 ms"+ "'", var8.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var9.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100 ms"+ "'", var10.equals("100 ms"));

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test192"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    boolean var9 = var4.hasChanged();
    java.util.Collection var10 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var12 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test193"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "-1 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test194"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    var4.setChanged(true);
    java.lang.String var9 = var4.getHgPath();
    var4.setGitPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test195"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    java.lang.String var7 = var4.getHgPath();
    crystal.client.ClientPreferences var12 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var12.setChanged(true);
    var12.setGitPath("10 ms");
    var12.setRefresh(1L);
    var12.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var21 = var12.hasChanged();
    var12.setChanged(true);
    var12.setHgPath("-1 ms");
    long var26 = var12.getRefresh();
    crystal.client.ClientPreferences var31 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var31.setGitPath("10 ms");
    var31.setTempDirectory("");
    var31.setChanged(true);
    var31.setRefresh(100L);
    java.lang.String var40 = var31.getTempDirectory();
    java.util.Collection var41 = var31.getProjectPreference();
    boolean var42 = var12.equals((java.lang.Object)var41);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var12);
    boolean var44 = var4.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "382707 hours 44 min"+ "'", var6.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100 ms"+ "'", var7.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test196"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("382707 hours 44 min");
    java.util.Collection var12 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test197"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test198"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(true);
    java.util.Collection var17 = var4.getProjectPreference();
    java.awt.Image var18 = crystal.model.Relationship.getDominant(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test199"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test200"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setGitPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test201"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test202"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    java.util.Collection var5 = var1.getRelationships();
    java.util.Collection var6 = var1.getRelationships();
    java.util.Collection var7 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test203"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("2013-08-28T20-44-41.156-0700", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test204"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "0 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test205"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    java.lang.String var20 = var4.getGitPath();
    var4.setRefresh(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10 ms"+ "'", var20.equals("10 ms"));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test206"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("2013-08-28T20-44-41.156-0700");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test207"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    boolean var17 = var4.equals((java.lang.Object)0L);
    boolean var18 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test208"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test209"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "hi!", "-1 ms", 100L);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test210"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getRelationships();
    java.awt.Image var7 = crystal.model.Relationship.getDominant(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test211"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "100 ms", "0 ms", 0L);
    java.lang.String var5 = var4.getGitPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0 ms"+ "'", var5.equals("0 ms"));

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test212"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    long var14 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var16 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test213"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    boolean var7 = var4.hasChanged();
    var4.setRefresh((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test214"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    var4.setHgPath("10 ms");
    long var19 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1L);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test215"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "hi!", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test216"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setGitPath("hi!");
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setHgPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test217"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    var4.setRefresh(10L);
    java.util.Collection var16 = var4.getProjectPreference();
    java.lang.String var17 = var4.getGitPath();
    java.util.Collection var18 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10 ms"+ "'", var17.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test218"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "hi!", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test219"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    long var14 = var4.getRefresh();
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1L);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test220"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var16 = var4.getProjectPreference();
    long var17 = var4.getRefresh();
    var4.setGitPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test221"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "0 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test222"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    java.lang.String var15 = var4.getHgPath();
    java.lang.String var16 = var4.getTempDirectory();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var18 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var16.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test223"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.lang.String var16 = var4.getHgPath();
    var4.setGitPath("0 ms");
    java.util.Collection var19 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test224"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getLocalStates();
    java.util.Collection var8 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test225"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var16 = var4.getHgPath();
    boolean var17 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test226"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    var0.removeAllListeners();
    java.util.Collection var9 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test227"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "0 ms", "10 ms", 100L);
    var4.setChanged(true);
    boolean var7 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test228"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test229"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    var1.enable(true);
    var1.enable(false);
    var1.removeAllListeners();
    var1.removeAllListeners();
    java.util.Collection var11 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test230"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "10 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test231"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getLocalStates();
    java.util.Collection var6 = var0.getRelationships();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    java.util.Collection var8 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test232"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences var19 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var19.setGitPath("10 ms");
    var19.setTempDirectory("");
    var19.setChanged(true);
    var19.setRefresh(100L);
    boolean var28 = var4.equals((java.lang.Object)100L);
    java.util.Collection var29 = var4.getProjectPreference();
    java.lang.String var30 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var30.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test233"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ConflictDaemon var16 = crystal.client.ConflictDaemon.getInstance();
    boolean var17 = var16.isEnabled();
    java.util.Collection var18 = var16.getLocalStates();
    java.awt.Image var19 = crystal.model.Relationship.getDominant(var18);
    java.awt.Image var20 = crystal.model.Relationship.getDominant(var18);
    boolean var21 = var4.equals((java.lang.Object)var18);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test234"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    org.jdom.Document var9 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var10 = var4.equals((java.lang.Object)var9);
    boolean var12 = crystal.util.XMLTools.writeXMLDocument(var9, "0 ms");
    boolean var14 = crystal.util.XMLTools.writeXMLDocument(var9, "382707 hours 44 min");
    boolean var16 = crystal.util.XMLTools.writeXMLDocument(var9, "0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test235"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    long var12 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1L);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test236"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    long var18 = var4.getRefresh();
    java.util.Collection var19 = var4.getProjectPreference();
    java.lang.String var20 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var20.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test237"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    java.util.Collection var8 = var4.getProjectPreference();
    var4.setTempDirectory("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test238"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var2 = var1.getRelationships();
    var1.removeAllListeners();
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("1 ms", var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test239"); }


    java.util.Date var1 = crystal.util.TimeUtility.parseLSMRDate("2013-08-28T20-44-41.156-0700");
    java.lang.String var2 = crystal.util.TimeUtility.formatLSMRDate(var1);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var1);
    java.lang.String var4 = crystal.util.TimeUtility.formatLSMRDate(var1);
    java.lang.String var5 = crystal.util.TimeUtility.formatLSMRDate(var1);
    java.lang.String var6 = crystal.util.TimeUtility.formatLSMRDate(var1);
    java.lang.String var7 = crystal.util.TimeUtility.formatLSMRDate(var1);
    java.lang.String var8 = crystal.util.TimeUtility.formatLSMRDate(var1);
    java.lang.String var9 = crystal.util.TimeUtility.formatLSMRDate(var1);
    java.lang.String var10 = crystal.util.TimeUtility.formatLSMRDate(var1);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var2.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var4.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var5.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var7.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var8.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var9.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test240"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    var4.setHgPath("100 ms");
    java.lang.String var17 = var4.getTempDirectory();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test241"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test242"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    var4.setHgPath("382707 hours 44 min");
    var4.setTempDirectory("1 ms");
    var4.setGitPath("0 ms");
    var4.setHgPath("100 ms");
    java.lang.String var26 = var4.getHgPath();
    boolean var27 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "100 ms"+ "'", var26.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test243"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    var5.setChanged(true);
    java.util.Collection var14 = var5.getProjectPreference();
    java.awt.Image var15 = crystal.model.Relationship.getDominant(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test244"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    long var14 = var5.getRefresh();
    var5.setHgPath("382707 hours 44 min");
    crystal.client.ConflictDaemon var17 = crystal.client.ConflictDaemon.getInstance();
    boolean var18 = var17.isEnabled();
    java.util.Collection var19 = var17.getLocalStates();
    java.awt.Image var20 = crystal.model.Relationship.getDominant(var19);
    java.awt.Image var21 = crystal.model.Relationship.getDominant(var19);
    boolean var22 = var5.equals((java.lang.Object)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test245"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "0 ms", "hi!", 10L);
    var4.setChanged(false);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test246"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    var4.setChanged(false);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    var4.setHgPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test247"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test248"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    var4.setChanged(true);
    long var21 = var4.getRefresh();
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    var4.setChanged(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test249"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var15 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var15.setGitPath("10 ms");
    var15.setTempDirectory("");
    var15.setChanged(true);
    var15.setRefresh(100L);
    java.lang.String var24 = var15.getTempDirectory();
    java.lang.String var25 = var15.getGitPath();
    boolean var26 = var4.equals((java.lang.Object)var15);
    java.lang.String var27 = var4.getTempDirectory();
    var4.setRefresh(1L);
    java.lang.String var30 = var4.getTempDirectory();
    java.util.Collection var31 = var4.getProjectPreference();
    java.util.Locale var32 = javax.swing.JComponent.getDefaultLocale();
    boolean var33 = var4.equals((java.lang.Object)var32);
    javax.swing.JComponent.setDefaultLocale(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var27.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var30.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test250"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("100 ms", "0 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test251"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getGitPath();
    var4.setGitPath("hi!");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test252"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("1 ms", "", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test253"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "-1 ms", "-1 ms", 10L);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test254"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "2013-08-28T20-44-41.156-0700", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test255"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    crystal.client.ConflictDaemon var19 = crystal.client.ConflictDaemon.getInstance();
    var19.enable(true);
    java.util.Collection var22 = var19.getRelationships();
    java.util.Collection var23 = var19.getRelationships();
    var19.enable(false);
    boolean var26 = var4.equals((java.lang.Object)false);
    java.util.Collection var27 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test256"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("10 ms", "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test257"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test258"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    var4.setGitPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test259"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.util.Collection var11 = var4.getProjectPreference();
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test260"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "382707 hours 44 min", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test261"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "1 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test262"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    var1.enable(true);
    var1.enable(false);
    var1.removeAllListeners();
    java.util.Collection var10 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test263"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    boolean var11 = var4.hasChanged();
    org.jdom.Document var13 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var15 = crystal.util.XMLTools.writeXMLDocument(var13, "2013-08-28T20-44-41.156-0700");
    boolean var17 = crystal.util.XMLTools.writeXMLDocument(var13, "0 ms");
    boolean var19 = crystal.util.XMLTools.writeXMLDocument(var13, "0 ms");
    boolean var21 = crystal.util.XMLTools.writeXMLDocument(var13, "0 ms");
    boolean var22 = var4.equals((java.lang.Object)"0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test264"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var7 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test265"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "2013-08-28T20-44-41.156-0700", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test266"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "2013-08-28T20-44-41.156-0700", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test267"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "100 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test268"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "2013-08-28T20-44-41.156-0700", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test269"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    boolean var6 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    crystal.client.ConflictDaemon var9 = crystal.client.ConflictDaemon.getInstance();
    boolean var10 = var9.isEnabled();
    java.util.Collection var11 = var9.getLocalStates();
    var9.removeAllListeners();
    java.util.Collection var13 = var9.getLocalStates();
    boolean var14 = var9.isEnabled();
    var9.removeAllListeners();
    boolean var16 = var4.equals((java.lang.Object)var9);
    java.util.Collection var17 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test270"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("10 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test271"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "100 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test272"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    long var16 = var4.getRefresh();
    java.util.Collection var17 = var4.getProjectPreference();
    java.lang.String var18 = var4.getGitPath();
    boolean var19 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test273"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    var4.setHgPath("10 ms");
    var4.setGitPath("0 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test274"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setHgPath("100 ms");
    java.util.Collection var11 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    var4.setRefresh(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test275"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getGitPath();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test276"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "hi!", "10 ms", 100L);
    long var5 = var4.getRefresh();
    var4.setHgPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100L);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test277"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh((-1L));
    var4.setGitPath("");
    java.lang.String var16 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test278"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    long var17 = var4.getRefresh();
    java.util.Collection var18 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test279"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    crystal.client.ClientPreferences var12 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var12
    assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var12 and var4
    assertTrue("Contract failed: equals-hashcode on var12 and var4", var12.equals(var4) ? var12.hashCode() == var4.hashCode() : true);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test280"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "2013-08-28T20-44-41.156-0700", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ConflictDaemon var6 = crystal.client.ConflictDaemon.getInstance();
    var6.enable(true);
    var6.removeAllListeners();
    java.util.Collection var10 = var6.getRelationships();
    java.util.Collection var11 = var6.getLocalStates();
    boolean var12 = var4.equals((java.lang.Object)var11);
    crystal.util.SetOperations var13 = new crystal.util.SetOperations();
    boolean var14 = var4.equals((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test281"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    long var18 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var25.setChanged(true);
    var25.setHgPath("10 ms");
    boolean var30 = var4.equals((java.lang.Object)"10 ms");
    java.lang.String var31 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var33 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test282"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    java.util.Collection var9 = var4.getProjectPreference();
    crystal.client.ClientPreferences var14 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var14.setChanged(true);
    var14.setGitPath("10 ms");
    var14.setRefresh(1L);
    var14.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var23 = var14.hasChanged();
    var14.setChanged(true);
    var14.setHgPath("-1 ms");
    long var28 = var14.getRefresh();
    var14.setHgPath("382707 hours 44 min");
    boolean var31 = var4.equals((java.lang.Object)"382707 hours 44 min");
    java.lang.String var32 = var4.getHgPath();
    java.util.Collection var33 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10 ms"+ "'", var8.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "10 ms"+ "'", var32.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test283"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    long var17 = var4.getRefresh();
    long var18 = var4.getRefresh();
    java.lang.String var19 = var4.getGitPath();
    java.lang.String var20 = var4.getTempDirectory();
    boolean var22 = var4.equals((java.lang.Object)(byte)(-1));
    var4.setRefresh(100L);
    var4.setGitPath("0 ms");
    java.lang.String var27 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10 ms"+ "'", var19.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test284"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.util.Collection var14 = var5.getProjectPreference();
    java.util.Collection var15 = var5.getProjectPreference();
    java.util.Collection var16 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test285"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test286"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh((-1L));
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test287"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "2013-08-28T20-44-41.156-0700", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ConflictDaemon var6 = crystal.client.ConflictDaemon.getInstance();
    var6.enable(true);
    var6.removeAllListeners();
    java.util.Collection var10 = var6.getRelationships();
    java.util.Collection var11 = var6.getLocalStates();
    boolean var12 = var4.equals((java.lang.Object)var11);
    long var13 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var15 = var4.getProjectPreferences("1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10L);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test288"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var15 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var15.setGitPath("10 ms");
    var15.setTempDirectory("");
    var15.setChanged(true);
    var15.setRefresh(100L);
    java.lang.String var24 = var15.getTempDirectory();
    java.lang.String var25 = var15.getGitPath();
    boolean var26 = var4.equals((java.lang.Object)var15);
    java.lang.String var27 = var4.getTempDirectory();
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var27.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test289"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test290"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var16 = var4.hasChanged();
    var4.setHgPath("100 ms");
    long var19 = var4.getRefresh();
    var4.setChanged(true);
    var4.setTempDirectory("100 ms");
    java.lang.String var24 = var4.getGitPath();
    crystal.client.ClientPreferences var25 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var25
    assertTrue("Contract failed: equals-hashcode on var4 and var25", var4.equals(var25) ? var4.hashCode() == var25.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var25 and var4
    assertTrue("Contract failed: equals-hashcode on var25 and var4", var25.equals(var4) ? var25.hashCode() == var4.hashCode() : true);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test291"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    java.lang.String var9 = var4.getGitPath();
    var4.setRefresh(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10 ms"+ "'", var8.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var9.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test292"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test293"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    java.util.Collection var7 = var0.getRelationships();
    var0.enable(true);
    java.util.Collection var10 = var0.getRelationships();
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var10);
    java.awt.Image var12 = crystal.model.Relationship.getDominant(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test294"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test295"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "100 ms", "", 100L);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test296"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    java.lang.String var5 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var5.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test297"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "0 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test298"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test299"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences var17 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var18 = var17.getRefresh();
    var17.setTempDirectory("10 ms");
    boolean var21 = var4.equals((java.lang.Object)"10 ms");
    boolean var22 = var4.hasChanged();
    boolean var23 = var4.hasChanged();
    var4.setHgPath("");
    java.lang.String var26 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var26.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test300"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    long var18 = var4.getRefresh();
    var4.setGitPath("10 ms");
    java.lang.String var21 = var4.getGitPath();
    var4.setRefresh((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "10 ms"+ "'", var21.equals("10 ms"));

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test301"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    var0.removeAllListeners();
    java.util.Collection var9 = var0.getLocalStates();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var9);
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test302"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test303"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test304"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setChanged(false);
    var4.setTempDirectory("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test305"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var19 = var4.getTempDirectory();
    org.jdom.Document var21 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var23 = crystal.util.XMLTools.writeXMLDocument(var21, "10 ms");
    boolean var25 = crystal.util.XMLTools.writeXMLDocument(var21, "2013-08-28T20-44-41.156-0700");
    boolean var26 = var4.equals((java.lang.Object)"2013-08-28T20-44-41.156-0700");
    var4.setRefresh(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test306"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "100 ms", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test307"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("382707 hours 44 min");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "100 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test308"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "100 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test309"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    crystal.client.ClientPreferences var16 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var16
    assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var16 and var4
    assertTrue("Contract failed: equals-hashcode on var16 and var4", var16.equals(var4) ? var16.hashCode() == var4.hashCode() : true);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test310"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test311"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ConflictDaemon var19 = crystal.client.ConflictDaemon.getInstance();
    var19.enable(true);
    java.util.Collection var22 = var19.getRelationships();
    java.util.Collection var23 = var19.getRelationships();
    java.util.Collection var24 = var19.getRelationships();
    var19.enable(true);
    var19.removeAllListeners();
    boolean var28 = var4.equals((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test312"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test313"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    crystal.client.ClientPreferences var9 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var9.setChanged(true);
    var9.setGitPath("10 ms");
    var9.setRefresh(1L);
    var9.setRefresh(100L);
    crystal.client.ConflictDaemon var18 = crystal.client.ConflictDaemon.getInstance();
    var18.removeAllListeners();
    var18.enable(true);
    var18.enable(true);
    var18.enable(true);
    boolean var26 = var18.isEnabled();
    java.util.Collection var27 = var18.getRelationships();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var27);
    boolean var29 = var9.equals((java.lang.Object)var27);
    boolean var30 = var4.equals((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test314"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    java.util.Collection var6 = var0.getRelationships();
    var0.enable(false);
    java.util.Collection var9 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test315"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test316"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("10 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test317"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    boolean var9 = var4.hasChanged();
    java.util.Collection var10 = var4.getProjectPreference();
    long var11 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10L);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test318"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.util.Collection var16 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test319"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test320"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test321"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setRefresh(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test322"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var9 = var4.getHgPath();
    java.lang.String var10 = var4.getTempDirectory();
    java.lang.String var11 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test323"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test324"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("");
    java.lang.String var18 = var4.getHgPath();
    crystal.client.ClientPreferences var23 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var23.setChanged(true);
    var23.setGitPath("10 ms");
    var23.setRefresh(1L);
    var23.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var23);
    crystal.client.ConflictDaemon var33 = crystal.client.ConflictDaemon.getInstance();
    var33.removeAllListeners();
    var33.enable(true);
    java.util.Collection var37 = var33.getRelationships();
    boolean var38 = var23.equals((java.lang.Object)var33);
    java.lang.String var39 = var23.getTempDirectory();
    boolean var40 = var4.equals((java.lang.Object)var23);
    java.util.Collection var41 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var39.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test325"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    java.lang.String var9 = var4.getHgPath();
    crystal.client.ClientPreferences var14 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var14.setChanged(true);
    var14.setGitPath("10 ms");
    var14.setRefresh(1L);
    var14.setHgPath("2013-08-28T20-44-41.156-0700");
    var14.setChanged(true);
    var14.setHgPath("2013-08-28T20-44-41.156-0700");
    long var27 = var14.getRefresh();
    var14.setRefresh(0L);
    boolean var30 = var4.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test326"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    java.lang.String var15 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences var24 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var24.setRefresh((-1L));
    var24.setTempDirectory("0 ms");
    var24.setTempDirectory("-1 ms");
    boolean var31 = var4.equals((java.lang.Object)var24);
    var4.setTempDirectory("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test327"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("382707 hours 44 min", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test328"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test329"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    java.lang.String var7 = var4.getGitPath();
    var4.setGitPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "382707 hours 44 min"+ "'", var6.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "382707 hours 44 min"+ "'", var7.equals("382707 hours 44 min"));

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test330"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var12 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test331"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    long var16 = var4.getRefresh();
    boolean var17 = var4.hasChanged();
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setHgPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test332"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setChanged(false);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test333"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "hi!", "1 ms", 1L);
    java.lang.String var5 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "1 ms"+ "'", var5.equals("1 ms"));

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test334"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getTempDirectory();
    var4.setHgPath("0 ms");
    boolean var11 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100 ms"+ "'", var8.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test335"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "-1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test336"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var5 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test337"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    java.util.Collection var17 = var4.getProjectPreference();
    java.lang.String var18 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test338"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "2013-08-28T20-44-41.156-0700", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test339"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setHgPath("hi!");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var19 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test340"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    java.util.Collection var7 = var4.getProjectPreference();
    var4.setHgPath("0 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test341"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var5.setRefresh((-1L));
    var5.setTempDirectory("0 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var5);
    java.util.Collection var11 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test342"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("-1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test343"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    var4.setTempDirectory("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test344"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    var0.enable(true);
    var0.enable(true);
    boolean var8 = var0.isEnabled();
    boolean var9 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test345"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var9 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test346"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("100 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test347"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "hi!", "1 ms", 1L);
    java.lang.String var5 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test348"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test349"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences var13 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var13
    assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var13 and var4
    assertTrue("Contract failed: equals-hashcode on var13 and var4", var13.equals(var4) ? var13.hashCode() == var4.hashCode() : true);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test350"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getLocalStates();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test351"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("-1 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test352"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    java.util.Collection var7 = var4.getProjectPreference();
    var4.setHgPath("0 ms");
    var4.setGitPath("100 ms");
    long var12 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    java.lang.String var17 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "0 ms"+ "'", var17.equals("0 ms"));

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test353"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getGitPath();
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    java.util.Collection var14 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test354"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var15 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var15.setGitPath("10 ms");
    var15.setTempDirectory("");
    var15.setChanged(true);
    var15.setRefresh(100L);
    java.lang.String var24 = var15.getTempDirectory();
    java.lang.String var25 = var15.getGitPath();
    boolean var26 = var4.equals((java.lang.Object)var15);
    java.util.Collection var27 = var4.getProjectPreference();
    java.awt.Image var28 = crystal.model.Relationship.getDominant(var27);
    java.awt.Image var29 = crystal.model.Relationship.getDominant(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test355"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test356"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "100 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test357"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test358"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    crystal.client.ConflictDaemon var19 = crystal.client.ConflictDaemon.getInstance();
    var19.enable(true);
    java.util.Collection var22 = var19.getRelationships();
    java.util.Collection var23 = var19.getRelationships();
    var19.enable(false);
    boolean var26 = var4.equals((java.lang.Object)false);
    var4.setChanged(false);
    var4.setGitPath("");
    var4.setHgPath("382707 hours 44 min");
    var4.setGitPath("hi!");
    crystal.client.ClientPreferences var35 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var35
    assertTrue("Contract failed: equals-hashcode on var4 and var35", var4.equals(var35) ? var4.hashCode() == var35.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var35 and var4
    assertTrue("Contract failed: equals-hashcode on var35 and var4", var35.equals(var4) ? var35.hashCode() == var4.hashCode() : true);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test359"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    var4.setChanged(false);
    boolean var19 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test360"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ConflictDaemon var14 = crystal.client.ConflictDaemon.getInstance();
    var14.removeAllListeners();
    var14.enable(true);
    java.util.Collection var18 = var14.getRelationships();
    boolean var19 = var4.equals((java.lang.Object)var14);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("10 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test361"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    var4.setRefresh(1L);
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test362"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    var4.setChanged(true);
    java.lang.String var19 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "100 ms"+ "'", var19.equals("100 ms"));

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test363"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("-1 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test364"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    boolean var5 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test365"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    java.lang.String var12 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var12.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test366"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setChanged(true);
    java.lang.String var16 = var4.getHgPath();
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "-1 ms", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test368"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var17 = var4.getHgPath();
    var4.setChanged(true);
    var4.setHgPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test369"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "hi!", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test370"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    org.jdom.Document var9 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var10 = var4.equals((java.lang.Object)var9);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test371"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "10 ms", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test372"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.enable(false);
    java.util.Collection var8 = var0.getLocalStates();
    java.util.Collection var9 = var0.getRelationships();
    java.util.Collection var10 = var0.getLocalStates();
    boolean var11 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test373"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var15 = var4.getProjectPreferences("hi!");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1L);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test374"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "hi!", "1 ms", 100L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var7 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test375"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.lang.String var15 = var4.getGitPath();
    java.util.Collection var16 = var4.getProjectPreference();
    java.lang.String var17 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10 ms"+ "'", var15.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test376"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "-1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test377"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(false);
    var4.setRefresh(0L);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test378"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getRelationships();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test379"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    var4.setChanged(true);
    long var21 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test380"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test381"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getLocalStates();
    boolean var6 = var1.isEnabled();
    java.util.Collection var7 = var1.getLocalStates();
    java.util.Collection var8 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test382"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setHgPath("hi!");
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test383"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    long var9 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10L);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test384"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    var0.enable(true);
    java.util.Collection var8 = var0.getLocalStates();
    java.util.Collection var9 = var0.getRelationships();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var9);
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test385"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    long var18 = var4.getRefresh();
    var4.setHgPath("382707 hours 44 min");
    var4.setRefresh(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test386"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(true);
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "382707 hours 44 min"+ "'", var6.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100 ms"+ "'", var7.equals("100 ms"));

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test387"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("382707 hours 44 min", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test388"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    long var8 = var4.getRefresh();
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var13 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test389"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    long var16 = var4.getRefresh();
    var4.setGitPath("hi!");
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100L);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test390"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "10 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test391"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "hi!", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test392"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("-1 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test393"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setTempDirectory("0 ms");
    java.util.Collection var9 = var4.getProjectPreference();
    long var10 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1L));

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test394"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test395"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    long var8 = var4.getRefresh();
    var4.setRefresh(1L);
    crystal.client.ConflictDaemon var11 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var12 = var11.getRelationships();
    var11.removeAllListeners();
    java.util.Collection var14 = var11.getLocalStates();
    var11.enable(true);
    var11.removeAllListeners();
    var11.removeAllListeners();
    boolean var19 = var4.equals((java.lang.Object)var11);
    java.util.Collection var20 = var11.getRelationships();
    java.awt.Image var21 = crystal.model.Relationship.getDominant(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test396"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test397"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setRefresh(100L);
    var4.setHgPath("0 ms");
    boolean var20 = var4.hasChanged();
    java.lang.String var21 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test398"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.lang.String var8 = var4.getHgPath();
    long var9 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10L);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test399"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ConflictDaemon var14 = crystal.client.ConflictDaemon.getInstance();
    var14.removeAllListeners();
    var14.enable(true);
    java.util.Collection var18 = var14.getRelationships();
    boolean var19 = var4.equals((java.lang.Object)var14);
    java.util.Collection var20 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test400"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "10 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test401"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test402"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var10 = var0.getRelationships();
    java.util.Collection var11 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test403"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "382707 hours 44 min", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test404"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    boolean var8 = var0.isEnabled();
    java.util.Collection var9 = var0.getLocalStates();
    boolean var10 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test405"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test406"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test407"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var17 = var4.getHgPath();
    var4.setRefresh(1L);
    java.lang.String var20 = var4.getHgPath();
    var4.setGitPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test408"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test409"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    long var18 = var4.getRefresh();
    java.util.Collection var19 = var4.getProjectPreference();
    crystal.client.ClientPreferences var24 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var24.setChanged(true);
    var24.setGitPath("10 ms");
    var24.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var24);
    boolean var32 = var4.equals((java.lang.Object)var24);
    crystal.client.ConflictDaemon var33 = crystal.client.ConflictDaemon.getInstance();
    var33.removeAllListeners();
    var33.enable(true);
    var33.removeAllListeners();
    java.util.Collection var38 = var33.getRelationships();
    boolean var39 = var4.equals((java.lang.Object)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var41 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test410"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    java.lang.String var7 = var4.getGitPath();
    var4.setTempDirectory("hi!");
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences var12 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var12
    assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var12 and var4
    assertTrue("Contract failed: equals-hashcode on var12 and var4", var12.equals(var4) ? var12.hashCode() == var4.hashCode() : true);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test411"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    long var15 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    java.lang.String var18 = var4.getTempDirectory();
    var4.setRefresh(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test412"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    long var18 = var4.getRefresh();
    var4.setGitPath("10 ms");
    java.util.Collection var21 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("0 ms");
    var4.setTempDirectory("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test413"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "hi!", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test414"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("1 ms", "2013-08-28T20-44-41.156-0700", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test415"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    java.lang.String var5 = var4.getHgPath();
    boolean var6 = var4.hasChanged();
    java.util.Collection var7 = var4.getProjectPreference();
    var4.setRefresh((-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var11 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100 ms"+ "'", var5.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test416"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    boolean var11 = var4.hasChanged();
    var4.setGitPath("382707 hours 44 min");
    crystal.client.ClientPreferences var18 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var18.setGitPath("10 ms");
    var18.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var18, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var18, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var27 = var18.getProjectPreference();
    java.util.Collection var28 = var18.getProjectPreference();
    java.lang.String var29 = var18.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var18);
    var18.setGitPath("100 ms");
    boolean var33 = var4.equals((java.lang.Object)var18);
    var18.setTempDirectory("");
    var18.setHgPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test417"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("0 ms");
    var4.setRefresh(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test418"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    var4.setHgPath("100 ms");

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test419"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    java.lang.String var15 = var4.getTempDirectory();
    long var16 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100L);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test420"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test421"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    var4.setChanged(false);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test422"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    long var14 = var5.getRefresh();
    long var15 = var5.getRefresh();
    crystal.client.ConflictDaemon var16 = crystal.client.ConflictDaemon.getInstance();
    var16.enable(true);
    java.util.Collection var19 = var16.getLocalStates();
    java.util.Collection var20 = var16.getLocalStates();
    boolean var21 = var5.equals((java.lang.Object)var20);
    java.awt.Image var22 = crystal.model.Relationship.getDominant(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test423"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "10 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test424"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.lang.String var14 = var4.getGitPath();
    var4.setHgPath("");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test425"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    java.lang.String var15 = var4.getHgPath();
    java.lang.String var16 = var4.getTempDirectory();
    var4.setHgPath("hi!");
    long var19 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var16.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test426"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    var4.setChanged(false);
    java.lang.String var12 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100 ms"+ "'", var12.equals("100 ms"));

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test427"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.awt.Image var6 = crystal.model.Relationship.getDominant(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test428"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test429"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("");
    java.lang.String var18 = var4.getHgPath();
    crystal.client.ClientPreferences var23 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var23.setChanged(true);
    var23.setGitPath("10 ms");
    var23.setRefresh(1L);
    var23.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var23);
    crystal.client.ConflictDaemon var33 = crystal.client.ConflictDaemon.getInstance();
    var33.removeAllListeners();
    var33.enable(true);
    java.util.Collection var37 = var33.getRelationships();
    boolean var38 = var23.equals((java.lang.Object)var33);
    java.lang.String var39 = var23.getTempDirectory();
    boolean var40 = var4.equals((java.lang.Object)var23);
    java.lang.String var41 = var23.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var39.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var41.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test430"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test431"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "hi!", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test432"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "382707 hours 44 min", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test433"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "100 ms");
    java.lang.String var12 = var5.getHgPath();
    var5.setChanged(false);
    java.util.Collection var15 = var5.getProjectPreference();
    java.awt.Image var16 = crystal.model.Relationship.getDominant(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test434"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(1L);
    var4.setGitPath("100 ms");
    crystal.client.ClientPreferences var18 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var18.setGitPath("10 ms");
    var18.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var18, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var18, "2013-08-28T20-44-41.156-0700");
    long var27 = var18.getRefresh();
    java.util.Collection var28 = var18.getProjectPreference();
    crystal.client.ClientPreferences var33 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var33.setGitPath("10 ms");
    var33.setTempDirectory("");
    var33.setChanged(true);
    var33.setRefresh(100L);
    boolean var42 = var18.equals((java.lang.Object)100L);
    var18.setRefresh((-1L));
    boolean var45 = var4.equals((java.lang.Object)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test435"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "0 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test436"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test437"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getRelationships();
    java.util.Collection var5 = var1.getRelationships();
    var1.enable(false);
    java.util.Collection var8 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("1 ms", var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test438"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "2013-08-28T20-44-41.156-0700", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test439"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "382707 hours 44 min", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test440"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    java.util.Collection var3 = var1.getRelationships();
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    java.util.Collection var6 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test441"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    long var18 = var4.getRefresh();
    java.lang.String var19 = var4.getTempDirectory();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(100L);
    var4.setRefresh(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test442"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    java.lang.String var15 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var17 = var4.hasChanged();
    java.lang.String var18 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var18.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test443"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test444"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "10 ms", "10 ms", 10L);
    var4.setGitPath("");

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test445"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    long var17 = var4.getRefresh();
    long var18 = var4.getRefresh();
    var4.setGitPath("382707 hours 44 min");
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var25.setRefresh((-1L));
    java.lang.String var28 = var25.getHgPath();
    long var29 = var25.getRefresh();
    var25.setHgPath("1 ms");
    crystal.client.ConflictDaemon var32 = crystal.client.ConflictDaemon.getInstance();
    var32.removeAllListeners();
    var32.enable(true);
    java.util.Collection var36 = var32.getRelationships();
    var32.removeAllListeners();
    var32.removeAllListeners();
    boolean var39 = var32.isEnabled();
    boolean var40 = var32.isEnabled();
    boolean var41 = var32.isEnabled();
    boolean var42 = var25.equals((java.lang.Object)var41);
    boolean var43 = var4.equals((java.lang.Object)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "10 ms"+ "'", var28.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test446"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "1 ms", "", 100L);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test447"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var4 = var0.isEnabled();
    java.util.Collection var5 = var0.getLocalStates();
    java.util.Collection var6 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test448"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "100 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test449"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test450"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    boolean var6 = var0.isEnabled();
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getLocalStates();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test451"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh(1L);
    boolean var14 = var4.hasChanged();
    var4.setTempDirectory("10 ms");
    var4.setHgPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test452"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(1L);
    java.lang.String var19 = var4.getGitPath();
    java.lang.String var20 = var4.getHgPath();
    java.lang.String var21 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10 ms"+ "'", var19.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test453"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    var4.setHgPath("0 ms");
    java.lang.String var13 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "0 ms"+ "'", var13.equals("0 ms"));

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test454"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test455"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "-1 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test456"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "hi!", "10 ms", 100L);
    var4.setChanged(true);
    long var7 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100L);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test457"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getLocalStates();
    java.awt.Image var9 = crystal.model.Relationship.getDominant(var8);
    java.awt.Image var10 = crystal.model.Relationship.getDominant(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test458"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "382707 hours 44 min", "100 ms", 1L);
    var4.setTempDirectory("1 ms");

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test459"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    var0.enable(false);
    boolean var9 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test460"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "10 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences var5 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var5
    assertTrue("Contract failed: equals-hashcode on var4 and var5", var4.equals(var5) ? var4.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var4
    assertTrue("Contract failed: equals-hashcode on var5 and var4", var5.equals(var4) ? var5.hashCode() == var4.hashCode() : true);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test461"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test462"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test463"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    java.util.Collection var2 = var0.getRelationships();
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test464"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "1 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test465"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "0 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test466"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    var0.removeAllListeners();
    java.util.Collection var9 = var0.getLocalStates();
    java.awt.Image var10 = crystal.model.Relationship.getDominant(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test467"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test468"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "-1 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test469"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test470"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    var0.enable(false);
    var0.removeAllListeners();
    boolean var8 = var0.isEnabled();
    boolean var9 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test471"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "10 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test472"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getRelationships();
    java.awt.Image var7 = crystal.model.Relationship.getDominant(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test473"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var16 = var4.getProjectPreference();
    var4.setGitPath("");
    java.lang.String var19 = var4.getGitPath();
    var4.setTempDirectory("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test474"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    boolean var14 = var4.hasChanged();
    long var15 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var17 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1L);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test475"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var10 = var4.getGitPath();
    java.util.Collection var11 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    var4.setHgPath("382707 hours 44 min");
    long var16 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10 ms"+ "'", var10.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test476"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setTempDirectory("382707 hours 44 min");
    boolean var18 = var4.hasChanged();
    java.util.Collection var19 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test477"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "0 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test478"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test479"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test480"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "382707 hours 44 min", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test481"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    long var8 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100 ms"+ "'", var6.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10L);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test482"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "1 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test483"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "382707 hours 44 min", "hi!", 10L);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"2013-08-28T20-44-41.156-0700");

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test484"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    long var18 = var4.getRefresh();
    java.util.Collection var19 = var4.getProjectPreference();
    var4.setHgPath("10 ms");
    crystal.client.ClientPreferences var22 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var22
    assertTrue("Contract failed: equals-hashcode on var4 and var22", var4.equals(var22) ? var4.hashCode() == var22.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var22 and var4
    assertTrue("Contract failed: equals-hashcode on var22 and var4", var22.equals(var4) ? var22.hashCode() == var4.hashCode() : true);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test485"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    var4.setChanged(false);
    java.lang.String var12 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100 ms"+ "'", var12.equals("100 ms"));

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test486"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test487"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setRefresh(0L);
    var4.setTempDirectory("");
    java.util.Collection var19 = var4.getProjectPreference();
    crystal.client.ConflictDaemon var20 = crystal.client.ConflictDaemon.getInstance();
    var20.enable(true);
    var20.removeAllListeners();
    java.util.Collection var24 = var20.getRelationships();
    java.util.Collection var25 = var20.getLocalStates();
    boolean var26 = var20.isEnabled();
    var20.removeAllListeners();
    boolean var28 = var4.equals((java.lang.Object)var20);
    var4.setGitPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test488"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test489"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    var4.setGitPath("");
    long var15 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10L);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test490"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    boolean var7 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test491"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "2013-08-28T20-44-41.156-0700", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test492"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    var0.enable(false);
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test493"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences var13 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var13.setGitPath("10 ms");
    var13.setTempDirectory("");
    var13.setChanged(true);
    var13.setRefresh(100L);
    java.util.Collection var22 = var13.getProjectPreference();
    java.util.Collection var23 = var13.getProjectPreference();
    java.util.Collection var24 = var13.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var13);
    boolean var26 = var4.equals((java.lang.Object)var13);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var13);
    var13.setHgPath("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test494"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var16 = var4.hasChanged();
    var4.setHgPath("100 ms");
    long var19 = var4.getRefresh();
    var4.setChanged(true);
    var4.setTempDirectory("100 ms");
    java.lang.String var24 = var4.getGitPath();
    java.lang.String var25 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "10 ms"+ "'", var24.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test495"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getRelationships();
    var0.enable(false);
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test496"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test497"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    long var14 = var5.getRefresh();
    var5.setChanged(false);
    var5.setTempDirectory("10 ms");
    long var19 = var5.getRefresh();
    var5.setChanged(true);
    long var22 = var5.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    java.util.Collection var24 = var5.getProjectPreference();
    java.awt.Image var25 = crystal.model.Relationship.getDominant(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test498"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setHgPath("hi!");
    var4.setRefresh((-1L));
    crystal.client.ClientPreferences var20 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var20
    assertTrue("Contract failed: equals-hashcode on var4 and var20", var4.equals(var20) ? var4.hashCode() == var20.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var20 and var4
    assertTrue("Contract failed: equals-hashcode on var20 and var4", var20.equals(var4) ? var20.hashCode() == var4.hashCode() : true);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test499"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    java.util.Collection var8 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test500"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

}
