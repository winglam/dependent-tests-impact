package randoop.crystal;

import junit.framework.*;

public class RandoopTest5 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test1"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    var1.removeAllListeners();
    boolean var7 = var1.isEnabled();
    boolean var8 = var1.isEnabled();
    java.util.Collection var9 = var1.getRelationships();
    java.util.Collection var10 = var1.getRelationships();
    java.util.Collection var11 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var11);
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
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test2"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "hi!", 1L);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test3"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getRelationships();
    java.util.Collection var8 = var0.getLocalStates();
    
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

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test4"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "hi!", "10 ms", 100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test5"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "1 ms", "-1 ms", 10L);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test6"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test7"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    java.lang.String var5 = var4.getGitPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100 ms"+ "'", var5.equals("100 ms"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test8"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "10 ms", "10 ms", 10L);
    java.lang.String var5 = var4.getHgPath();
    var4.setRefresh(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10 ms"+ "'", var5.equals("10 ms"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test9"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setGitPath("1 ms");
    var4.setHgPath("382707 hours 44 min");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var21 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "10 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test11"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setHgPath("100 ms");
    java.util.Collection var11 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    long var13 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10L);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test12"); }


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
    java.util.Collection var18 = var4.getProjectPreference();
    var4.setTempDirectory("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "100 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "100 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test15"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test16"); }


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
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "-1 ms", "100 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test18"); }


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
    crystal.client.ClientPreferences var28 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var28);
    crystal.client.ClientPreferences.savePreferencesToXML(var28, "-1 ms");
    crystal.client.ClientPreferences var36 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var36.setGitPath("10 ms");
    var36.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var36, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var36, "2013-08-28T20-44-41.156-0700");
    long var45 = var36.getRefresh();
    var36.setChanged(false);
    var36.setChanged(false);
    long var50 = var36.getRefresh();
    var36.setGitPath("10 ms");
    java.util.Collection var53 = var36.getProjectPreference();
    boolean var54 = var28.equals((java.lang.Object)var53);
    java.awt.Image var55 = crystal.model.Relationship.getDominant(var53);
    boolean var56 = var4.equals((java.lang.Object)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test19"); }


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
    var4.setHgPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10 ms"+ "'", var20.equals("10 ms"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test20"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test21"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test22"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "100 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test23"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var12 = var4.hasChanged();
    crystal.client.ClientPreferences var17 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var17.setGitPath("10 ms");
    var17.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var17);
    crystal.client.ClientPreferences.savePreferencesToXML(var17, "10 ms");
    var17.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var17);
    java.lang.String var28 = var17.getHgPath();
    var17.setHgPath("0 ms");
    java.lang.String var31 = var17.getTempDirectory();
    boolean var32 = var4.equals((java.lang.Object)var31);
    long var33 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10L);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test24"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test25"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    var0.enable(false);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    java.util.Collection var9 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "-1 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test27"); }


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
    java.util.Collection var20 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    
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
    assertNotNull(var20);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test28"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setChanged(false);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var18 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var18.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test30"); }


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
    java.lang.String var23 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "10 ms"+ "'", var23.equals("10 ms"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "", "10 ms", 1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test32"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
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

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test33"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var10 = var4.hasChanged();
    boolean var11 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test34"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test35"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var10 = var4.getHgPath();
    long var11 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10L);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test36"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "0 ms", "382707 hours 44 min", 100L);
    boolean var5 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test37"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getLocalStates();
    java.util.Collection var6 = var0.getLocalStates();
    var0.removeAllListeners();
    boolean var8 = var0.isEnabled();
    java.util.Collection var9 = var0.getRelationships();
    java.util.Collection var10 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test38"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setRefresh(100L);
    java.lang.String var17 = var4.getHgPath();
    var4.setChanged(false);
    var4.setGitPath("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var17.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test39"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getLocalStates();
    java.util.Collection var6 = var0.getRelationships();
    boolean var7 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test40"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getLocalStates();
    boolean var6 = var0.isEnabled();
    var0.removeAllListeners();
    java.util.Collection var8 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test41"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    var0.enable(false);
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test42"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test43"); }


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
    boolean var24 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test44"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    boolean var6 = var0.isEnabled();
    var0.enable(false);
    boolean var9 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test45"); }


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
    java.lang.String var22 = var4.getGitPath();
    var4.setHgPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "10 ms"+ "'", var22.equals("10 ms"));

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test46"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("100 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test47"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("382707 hours 44 min", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test48"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    var4.setHgPath("0 ms");
    var4.setRefresh(1L);
    boolean var18 = var4.hasChanged();
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
    assertTrue(var18 == true);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test49"); }


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
    crystal.client.ClientPreferences var38 = var23.clone();
    
    // Checks the contract:  equals-hashcode on var23 and var38
    assertTrue("Contract failed: equals-hashcode on var23 and var38", var23.equals(var38) ? var23.hashCode() == var38.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var38 and var23
    assertTrue("Contract failed: equals-hashcode on var38 and var23", var38.equals(var23) ? var38.hashCode() == var23.hashCode() : true);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test50"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var16.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test51"); }


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
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test52"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "-1 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test53"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setTempDirectory("0 ms");
    var4.setTempDirectory("-1 ms");
    var4.setGitPath("1 ms");
    var4.setRefresh(0L);
    crystal.client.ConflictDaemon var15 = crystal.client.ConflictDaemon.getInstance();
    boolean var16 = var15.isEnabled();
    java.util.Collection var17 = var15.getLocalStates();
    var15.removeAllListeners();
    java.util.Collection var19 = var15.getLocalStates();
    boolean var20 = var15.isEnabled();
    var15.removeAllListeners();
    boolean var22 = var4.equals((java.lang.Object)var15);
    var4.setTempDirectory("100 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test54"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    long var9 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10 ms"+ "'", var8.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1L));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test55"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setChanged(false);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setRefresh(0L);
    java.lang.String var20 = var4.getTempDirectory();
    java.lang.String var21 = var4.getHgPath();
    var4.setTempDirectory("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var20.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test56"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "-1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test57"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "10 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test58"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    crystal.client.ConflictDaemon var8 = crystal.client.ConflictDaemon.getInstance();
    boolean var9 = var8.isEnabled();
    java.util.Collection var10 = var8.getLocalStates();
    var8.removeAllListeners();
    java.util.Collection var12 = var8.getRelationships();
    java.awt.Image var13 = crystal.model.Relationship.getDominant(var12);
    java.awt.Image var14 = crystal.model.Relationship.getDominant(var12);
    boolean var15 = var5.equals((java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test59"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var10 = var4.hasChanged();
    java.lang.String var11 = var4.getHgPath();
    var4.setHgPath("382707 hours 44 min");
    var4.setHgPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test60"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test61"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "382707 hours 44 min", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test62"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    java.util.Collection var5 = var0.getRelationships();
    var0.enable(true);
    java.util.Collection var8 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var10 = var0.getLocalStates();
    java.util.Collection var11 = var0.getLocalStates();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test63"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "100 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test64"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "100 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test65"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("382707 hours 44 min", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "10 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test67"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("382707 hours 44 min", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test68"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(10L);
    long var14 = var4.getRefresh();
    java.lang.String var15 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var15.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test69"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "0 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test70"); }


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
    boolean var28 = var4.hasChanged();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test71"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "0 ms", "hi!", 0L);
    var4.setTempDirectory("382707 hours 44 min");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var8 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test72"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test73"); }


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
    boolean var19 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test74"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var10 = var4.getGitPath();
    java.util.Collection var11 = var4.getProjectPreference();
    java.lang.String var12 = var4.getGitPath();
    var4.setGitPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10 ms"+ "'", var10.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10 ms"+ "'", var12.equals("10 ms"));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test75"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test76"); }


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
    crystal.client.ClientPreferences var31 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var31.setTempDirectory("");
    boolean var34 = var15.equals((java.lang.Object)"");
    java.lang.String var35 = var15.getGitPath();
    java.lang.String var36 = var15.getTempDirectory();
    java.lang.String var37 = var15.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "10 ms"+ "'", var35.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "10 ms"+ "'", var37.equals("10 ms"));

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test77"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "-1 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test78"); }


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
    crystal.client.ConflictDaemon var38 = crystal.client.ConflictDaemon.getInstance();
    boolean var39 = var38.isEnabled();
    java.util.Collection var40 = var38.getLocalStates();
    var38.removeAllListeners();
    java.util.Collection var42 = var38.getRelationships();
    boolean var43 = var38.isEnabled();
    var38.removeAllListeners();
    java.util.Collection var45 = var38.getRelationships();
    var38.enable(false);
    java.util.Collection var48 = var38.getLocalStates();
    boolean var49 = var23.equals((java.lang.Object)var48);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test79"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setTempDirectory("1 ms");
    var4.setGitPath("hi!");
    var4.setRefresh(0L);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.lang.String var22 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test80"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setTempDirectory("0 ms");
    var4.setTempDirectory("-1 ms");
    var4.setGitPath("1 ms");
    var4.setRefresh(0L);
    crystal.client.ConflictDaemon var15 = crystal.client.ConflictDaemon.getInstance();
    boolean var16 = var15.isEnabled();
    java.util.Collection var17 = var15.getLocalStates();
    var15.removeAllListeners();
    java.util.Collection var19 = var15.getLocalStates();
    boolean var20 = var15.isEnabled();
    var15.removeAllListeners();
    boolean var22 = var4.equals((java.lang.Object)var15);
    boolean var23 = var15.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test81"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test82"); }


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
    var4.setRefresh(0L);
    var4.setHgPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test83"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "hi!", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test84"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var17 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test85"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    crystal.client.ConflictDaemon var5 = crystal.client.ConflictDaemon.getInstance();
    var5.removeAllListeners();
    var5.enable(true);
    java.util.Collection var9 = var5.getRelationships();
    java.util.Collection var10 = var5.getRelationships();
    boolean var11 = var5.isEnabled();
    boolean var12 = var4.equals((java.lang.Object)var5);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test86"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    crystal.client.ConflictDaemon var5 = crystal.client.ConflictDaemon.getInstance();
    var5.removeAllListeners();
    var5.enable(true);
    java.util.Collection var9 = var5.getRelationships();
    java.util.Collection var10 = var5.getRelationships();
    boolean var11 = var5.isEnabled();
    boolean var12 = var4.equals((java.lang.Object)var5);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test87"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    var4.setRefresh(10L);
    var4.setTempDirectory("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test88"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    var4.setHgPath("0 ms");
    var4.setGitPath("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test89"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("382707 hours 44 min", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test90"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.enable(true);
    java.util.Collection var5 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test91"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "hi!", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test92"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test93"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    java.util.Collection var5 = var0.getRelationships();
    var0.removeAllListeners();
    boolean var7 = var0.isEnabled();
    var0.removeAllListeners();
    java.util.Collection var9 = var0.getRelationships();
    
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
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test94"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    java.util.Collection var17 = var4.getProjectPreference();
    var4.setGitPath("hi!");
    long var20 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100L);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test95"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    long var5 = var4.getRefresh();
    var4.setRefresh(10L);
    var4.setHgPath("0 ms");
    java.lang.String var10 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test96"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test97"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var14 = var4.hasChanged();
    var4.setRefresh(0L);
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
    assertTrue(var14 == true);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test98"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh(1L);
    boolean var14 = var4.hasChanged();
    java.lang.String var15 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10 ms"+ "'", var15.equals("10 ms"));

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test99"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    var5.setGitPath("10 ms");
    var5.setRefresh(1L);
    boolean var12 = var5.hasChanged();
    var5.setGitPath("2013-08-28T20-44-41.156-0700");
    var5.setTempDirectory("100 ms");
    java.util.Collection var17 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test100"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    var0.enable(false);
    java.util.Collection var7 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test101"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    java.lang.String var18 = var4.getHgPath();
    java.lang.String var19 = var4.getTempDirectory();
    java.lang.String var20 = var4.getHgPath();
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var25.setGitPath("10 ms");
    var25.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var25);
    crystal.client.ClientPreferences.savePreferencesToXML(var25, "10 ms");
    var25.setGitPath("2013-08-28T20-44-41.156-0700");
    var25.setGitPath("hi!");
    var25.setTempDirectory("382707 hours 44 min");
    boolean var39 = var25.hasChanged();
    boolean var40 = var4.equals((java.lang.Object)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "382707 hours 44 min"+ "'", var18.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "382707 hours 44 min"+ "'", var20.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test102"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var14 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test103"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "1 ms", "hi!", 100L);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test104"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    long var8 = var4.getRefresh();
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getHgPath();
    boolean var12 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("100 ms");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test105"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.util.Collection var11 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test106"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "-1 ms", "382707 hours 44 min", 1L);
    var4.setRefresh(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test107"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getGitPath();
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    long var14 = var4.getRefresh();
    java.lang.String var15 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var15.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test108"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("-1 ms");
    var4.setChanged(true);
    boolean var19 = var4.hasChanged();
    var4.setHgPath("0 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test109"); }


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
    var4.setTempDirectory("-1 ms");
    
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

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test110"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("382707 hours 44 min");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "");
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

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test111"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(1L);
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setGitPath("10 ms");
    var16.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var16, "100 ms");
    java.lang.String var23 = var16.getHgPath();
    var16.setChanged(false);
    boolean var26 = var4.equals((java.lang.Object)false);
    java.lang.String var27 = var4.getHgPath();
    var4.setGitPath("100 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    long var32 = var4.getRefresh();
    crystal.client.ConflictDaemon var33 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var34 = var33.getRelationships();
    var33.removeAllListeners();
    boolean var36 = var33.isEnabled();
    java.util.Collection var37 = var33.getRelationships();
    boolean var38 = var4.equals((java.lang.Object)var37);
    var4.setHgPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test112"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "2013-08-28T20-44-41.156-0700", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test113"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setRefresh(100L);
    java.lang.String var17 = var4.getHgPath();
    var4.setChanged(false);
    var4.setGitPath("");
    long var22 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var17.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100L);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test114"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var8 = var0.getLocalStates();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test115"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setRefresh(1L);
    var4.setGitPath("1 ms");
    java.util.Collection var20 = var4.getProjectPreference();
    var4.setRefresh((-1L));
    boolean var23 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test116"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "10 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test117"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(1L);
    var4.setChanged(false);
    crystal.client.ClientPreferences var21 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var21
    assertTrue("Contract failed: equals-hashcode on var4 and var21", var4.equals(var21) ? var4.hashCode() == var21.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var21 and var4
    assertTrue("Contract failed: equals-hashcode on var21 and var4", var21.equals(var4) ? var21.hashCode() == var4.hashCode() : true);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test118"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var20 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test119"); }


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
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test120"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getRelationships();
    java.util.Collection var7 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test121"); }


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
    long var29 = var4.getRefresh();
    java.util.Collection var30 = var4.getProjectPreference();
    var4.setHgPath("382707 hours 44 min");
    
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
    assertTrue(var29 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test122"); }


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
    java.util.Collection var24 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test123"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    java.lang.String var20 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test124"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("0 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test125"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setRefresh(100L);
    java.lang.String var17 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var20 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var17.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var20.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test126"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var8 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test127"); }


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
    java.lang.String var31 = var4.getGitPath();
    java.lang.String var32 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "10 ms"+ "'", var31.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "10 ms"+ "'", var32.equals("10 ms"));

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test128"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test129"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("2013-08-28T20-44-41.156-0700");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test130"); }


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
    var4.setRefresh(1L);
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test131"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    org.jdom.Document var9 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var10 = var4.equals((java.lang.Object)var9);
    java.lang.String var11 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test132"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    var0.enable(true);
    java.util.Collection var8 = var0.getLocalStates();
    java.util.Collection var9 = var0.getRelationships();
    java.util.Collection var10 = var0.getLocalStates();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var10);
    
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
    assertNotNull(var10);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test133"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test134"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test135"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    java.lang.String var18 = var4.getHgPath();
    java.lang.String var19 = var4.getTempDirectory();
    java.lang.String var20 = var4.getHgPath();
    long var21 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "382707 hours 44 min"+ "'", var18.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "382707 hours 44 min"+ "'", var20.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test136"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "10 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test137"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    java.lang.String var9 = var4.getHgPath();
    var4.setGitPath("100 ms");
    java.lang.String var12 = var4.getGitPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100 ms"+ "'", var12.equals("100 ms"));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test138"); }


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
    long var29 = var4.getRefresh();
    java.util.Collection var30 = var4.getProjectPreference();
    java.awt.Image var31 = crystal.model.Relationship.getDominant(var30);
    
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
    assertTrue(var29 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test139"); }


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
    var4.setGitPath("");
    
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

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test140"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    boolean var6 = var0.isEnabled();
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getLocalStates();
    java.util.Collection var9 = var0.getLocalStates();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test141"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setTempDirectory("382707 hours 44 min");
    var4.setRefresh(1L);
    var4.setTempDirectory("");
    java.util.Collection var22 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test142"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    long var16 = var4.getRefresh();
    java.lang.String var17 = var4.getTempDirectory();
    var4.setGitPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var17.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test143"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("0 ms");
    var4.setRefresh(1L);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    java.util.Collection var17 = var4.getProjectPreference();
    boolean var18 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test144"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.lang.String var14 = var4.getHgPath();
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test145"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var12 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test146"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test147"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    long var14 = var5.getRefresh();
    long var15 = var5.getRefresh();
    var5.setRefresh(0L);
    java.util.Collection var18 = var5.getProjectPreference();
    java.awt.Image var19 = crystal.model.Relationship.getDominant(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test148"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "0 ms", "-1 ms", 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var6 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test149"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "-1 ms", "-1 ms", 0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test150"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test151"); }


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
    var4.setChanged(false);
    java.lang.String var22 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "0 ms"+ "'", var22.equals("0 ms"));

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test152"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    var4.setHgPath("hi!");
    var4.setGitPath("100 ms");
    long var11 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test153"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var7 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test154"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
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

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test155"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("382707 hours 44 min", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test156"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "382707 hours 44 min", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test157"); }


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
    var4.setHgPath("382707 hours 44 min");
    java.util.Collection var37 = var4.getProjectPreference();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test158"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "hi!", "10 ms", 100L);
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test159"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var10 = var4.getGitPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10 ms"+ "'", var10.equals("10 ms"));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test160"); }


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
    crystal.client.ClientPreferences var19 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var19
    assertTrue("Contract failed: equals-hashcode on var4 and var19", var4.equals(var19) ? var4.hashCode() == var19.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var19 and var4
    assertTrue("Contract failed: equals-hashcode on var19 and var4", var19.equals(var4) ? var19.hashCode() == var4.hashCode() : true);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test161"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "0 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test162"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var16.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test163"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "10 ms", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test164"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setGitPath("-1 ms");
    java.lang.String var18 = var4.getHgPath();
    var4.setChanged(true);
    boolean var21 = var4.hasChanged();
    long var22 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100L);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test165"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    java.util.Collection var15 = var4.getProjectPreference();
    java.awt.Image var16 = crystal.model.Relationship.getDominant(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test166"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setHgPath("1 ms");
    boolean var17 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    java.util.Collection var20 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test167"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("10 ms");
    long var17 = var4.getRefresh();
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test168"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences var10 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var10.setChanged(true);
    var10.setGitPath("10 ms");
    var10.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var10);
    var10.setGitPath("100 ms");
    long var20 = var10.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var10, "2013-08-28T20-44-41.156-0700");
    boolean var23 = var4.equals((java.lang.Object)var10);
    var10.setTempDirectory("100 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var10, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test169"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("1 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test170"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    boolean var4 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test171"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    java.util.Collection var2 = var0.getRelationships();
    java.util.Collection var3 = var0.getLocalStates();
    boolean var4 = var0.isEnabled();
    java.util.Collection var5 = var0.getLocalStates();
    boolean var6 = var0.isEnabled();
    java.util.Collection var7 = var0.getRelationships();
    java.util.Collection var8 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test172"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test173"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    long var5 = var4.getRefresh();
    var4.setRefresh(10L);
    var4.setChanged(false);
    java.util.Collection var10 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test174"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test175"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    java.util.Collection var5 = var1.getRelationships();
    var1.removeAllListeners();
    var1.removeAllListeners();
    var1.enable(false);
    java.util.Collection var10 = var1.getRelationships();
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test176"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var6 = var5.getRefresh();
    var5.setGitPath("-1 ms");
    var5.setGitPath("100 ms");
    java.util.Collection var11 = var5.getProjectPreference();
    java.awt.Image var12 = crystal.model.Relationship.getDominant(var11);
    java.awt.Image var13 = crystal.model.Relationship.getDominant(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test177"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh((-1L));
    var4.setChanged(true);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test178"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "100 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test179"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "2013-08-28T20-44-41.156-0700", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test180"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var3);
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

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test181"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
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

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test182"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setTempDirectory("0 ms");
    boolean var9 = var4.hasChanged();
    crystal.client.ClientPreferences var14 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var14.setGitPath("10 ms");
    var14.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var14);
    crystal.client.ClientPreferences.savePreferencesToXML(var14, "10 ms");
    var14.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var14);
    java.lang.String var25 = var14.getHgPath();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var14);
    boolean var27 = var4.equals((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test183"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    java.lang.String var7 = var4.getGitPath();
    var4.setTempDirectory("hi!");
    var4.setHgPath("382707 hours 44 min");
    long var12 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    var4.setTempDirectory("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10L);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test184"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setTempDirectory("hi!");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("");
    java.util.Collection var19 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test185"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "2013-08-28T20-44-41.156-0700", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test186"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "-1 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test187"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "100 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test188"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    long var5 = var4.getRefresh();
    crystal.client.ClientPreferences var10 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var10);
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setChanged(true);
    var16.setGitPath("10 ms");
    var16.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var16);
    var16.setGitPath("100 ms");
    long var26 = var16.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var16, "2013-08-28T20-44-41.156-0700");
    boolean var29 = var10.equals((java.lang.Object)var16);
    var16.setTempDirectory("100 ms");
    boolean var32 = var4.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test189"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.enable(true);
    boolean var5 = var0.isEnabled();
    var0.enable(true);
    var0.enable(false);
    boolean var10 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test190"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "0 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test191"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getLocalStates();
    var0.enable(true);
    boolean var8 = var0.isEnabled();
    
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
    assertTrue(var8 == true);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test192"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    crystal.client.ClientPreferences var11 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var11.setChanged(true);
    var11.setGitPath("10 ms");
    var11.setRefresh(0L);
    crystal.client.ClientPreferences var22 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var22.setGitPath("10 ms");
    var22.setTempDirectory("");
    var22.setChanged(true);
    var22.setRefresh(100L);
    java.lang.String var31 = var22.getTempDirectory();
    java.lang.String var32 = var22.getGitPath();
    boolean var33 = var11.equals((java.lang.Object)var22);
    crystal.client.ClientPreferences var38 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var38.setTempDirectory("");
    boolean var41 = var22.equals((java.lang.Object)"");
    java.lang.String var42 = var22.getGitPath();
    java.lang.String var43 = var22.getTempDirectory();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var22);
    boolean var45 = var4.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100 ms"+ "'", var6.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "10 ms"+ "'", var32.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "10 ms"+ "'", var42.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test193"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(true);
    java.util.Collection var17 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test194"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.enable(false);
    java.util.Collection var8 = var0.getLocalStates();
    java.util.Collection var9 = var0.getRelationships();
    java.util.Collection var10 = var0.getLocalStates();
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var10);
    
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
    assertNull(var11);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test195"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    java.lang.String var18 = var4.getTempDirectory();
    var4.setGitPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var18.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test196"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    long var16 = var4.getRefresh();
    java.util.Collection var17 = var4.getProjectPreference();
    var4.setGitPath("1 ms");
    java.util.Collection var20 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test197"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setTempDirectory("0 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var10 = var4.getProjectPreference();
    crystal.client.ClientPreferences var11 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var11
    assertTrue("Contract failed: equals-hashcode on var4 and var11", var4.equals(var11) ? var4.hashCode() == var11.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var11 and var4
    assertTrue("Contract failed: equals-hashcode on var11 and var4", var11.equals(var4) ? var11.hashCode() == var4.hashCode() : true);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test198"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var16 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test199"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.removeAllListeners();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    boolean var4 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test200"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test201"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var14 = var4.hasChanged();
    var4.setRefresh(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test202"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.lang.String var14 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var14.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test203"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test204"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "0 ms", 0L);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test205"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "hi!");
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

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test206"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    boolean var6 = var0.isEnabled();
    java.util.Collection var7 = var0.getLocalStates();
    boolean var8 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test207"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
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

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test208"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    java.lang.String var7 = var4.getHgPath();
    crystal.client.ConflictDaemon var8 = crystal.client.ConflictDaemon.getInstance();
    boolean var9 = var8.isEnabled();
    java.util.Collection var10 = var8.getLocalStates();
    var8.removeAllListeners();
    java.util.Collection var12 = var8.getLocalStates();
    java.util.Collection var13 = var8.getRelationships();
    java.util.Collection var14 = var8.getLocalStates();
    java.awt.Image var15 = crystal.model.Relationship.getDominant(var14);
    boolean var16 = var4.equals((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var18 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "382707 hours 44 min"+ "'", var6.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100 ms"+ "'", var7.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test209"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.util.Collection var6 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var8 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var8.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test210"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    long var9 = var4.getRefresh();
    var4.setTempDirectory("0 ms");
    java.lang.String var12 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10 ms"+ "'", var12.equals("10 ms"));

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test211"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "hi!", "-1 ms", 1L);
    java.util.Collection var5 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test212"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("2013-08-28T20-44-41.156-0700");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "-1 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test213"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test214"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test215"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test216"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test217"); }


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
    java.lang.String var23 = var4.getTempDirectory();
    var4.setTempDirectory("1 ms");
    java.util.Collection var26 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var23.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test218"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var15 = var4.getHgPath();
    var4.setHgPath("0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test219"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var10 = var4.getHgPath();
    long var11 = var4.getRefresh();
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setGitPath("10 ms");
    var16.setTempDirectory("");
    var16.setChanged(true);
    var16.setRefresh(100L);
    java.lang.String var25 = var16.getTempDirectory();
    java.lang.String var26 = var16.getGitPath();
    var16.setChanged(true);
    java.util.Collection var29 = var16.getProjectPreference();
    java.lang.String var30 = var16.getHgPath();
    var16.setRefresh((-1L));
    java.util.Collection var33 = var16.getProjectPreference();
    boolean var34 = var4.equals((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "10 ms"+ "'", var26.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test220"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getRelationships();
    
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

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test221"); }


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
    var23.setChanged(true);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test222"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test223"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test224"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var12 = var4.getProjectPreference();
    java.lang.String var13 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100 ms"+ "'", var13.equals("100 ms"));

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test225"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test226"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "0 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test227"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var16 = var4.hasChanged();
    var4.setRefresh(0L);
    long var19 = var4.getRefresh();
    java.util.Collection var20 = var4.getProjectPreference();
    java.lang.String var21 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "10 ms"+ "'", var21.equals("10 ms"));

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test228"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test229"); }


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
    long var37 = var21.getRefresh();
    java.lang.String var38 = var21.getGitPath();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "10 ms"+ "'", var38.equals("10 ms"));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test230"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getLocalStates();
    java.awt.Image var6 = crystal.model.Relationship.getDominant(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var5);
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
    assertNull(var6);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test231"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getRelationships();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test232"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.enable(false);
    var0.removeAllListeners();
    var0.enable(false);
    java.util.Collection var13 = var0.getRelationships();
    
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
    assertNotNull(var13);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test233"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    java.util.Collection var7 = var4.getProjectPreference();
    var4.setGitPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test234"); }


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
    java.lang.String var20 = var4.getGitPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10 ms"+ "'", var20.equals("10 ms"));

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test235"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test236"); }


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
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test237"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test238"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "hi!", "-1 ms", 1L);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test239"); }


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
    var4.setRefresh(100L);
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var25.setGitPath("10 ms");
    var25.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var25, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var25, "2013-08-28T20-44-41.156-0700");
    long var34 = var25.getRefresh();
    var25.setChanged(false);
    var25.setTempDirectory("10 ms");
    var25.setTempDirectory("-1 ms");
    boolean var41 = var4.equals((java.lang.Object)var25);
    var4.setHgPath("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test240"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    boolean var7 = var0.isEnabled();
    boolean var8 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test241"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "2013-08-28T20-44-41.156-0700", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test242"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "0 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test243"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test244"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setTempDirectory("382707 hours 44 min");
    var4.setGitPath("0 ms");

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test245"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    boolean var6 = var0.isEnabled();
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getRelationships();
    java.util.Collection var9 = var0.getRelationships();
    java.util.Collection var10 = var0.getLocalStates();
    java.util.Collection var11 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test246"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "1 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test247"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.lang.String var13 = var4.getTempDirectory();
    crystal.client.ClientPreferences var14 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var14
    assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var14 and var4
    assertTrue("Contract failed: equals-hashcode on var14 and var4", var14.equals(var4) ? var14.hashCode() == var4.hashCode() : true);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test248"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
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

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test249"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setHgPath("100 ms");
    long var11 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10L);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test250"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.enable(false);
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test251"); }


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
    java.lang.String var23 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "10 ms"+ "'", var23.equals("10 ms"));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test252"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    boolean var14 = var4.hasChanged();
    long var15 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var20 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10 ms"+ "'", var20.equals("10 ms"));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test253"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.util.Collection var15 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test254"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    boolean var11 = var4.hasChanged();
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setGitPath("10 ms");
    var16.setTempDirectory("");
    var16.setChanged(true);
    var16.setRefresh(100L);
    java.lang.String var25 = var16.getTempDirectory();
    java.util.Collection var26 = var16.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var16);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var16);
    var16.setGitPath("100 ms");
    var16.setRefresh(100L);
    crystal.client.ClientPreferences var37 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var37.setGitPath("10 ms");
    var37.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var37, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var37, "2013-08-28T20-44-41.156-0700");
    long var46 = var37.getRefresh();
    var37.setChanged(false);
    var37.setTempDirectory("10 ms");
    var37.setTempDirectory("-1 ms");
    boolean var53 = var16.equals((java.lang.Object)var37);
    boolean var54 = var4.equals((java.lang.Object)var37);
    crystal.client.ClientPreferences var59 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var59.setGitPath("10 ms");
    var59.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var59, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var59, "2013-08-28T20-44-41.156-0700");
    java.lang.String var68 = var59.getGitPath();
    java.util.Collection var69 = var59.getProjectPreference();
    java.lang.String var70 = var59.getGitPath();
    boolean var71 = var4.equals((java.lang.Object)var59);
    long var72 = var59.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "10 ms"+ "'", var68.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "10 ms"+ "'", var70.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 100L);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test255"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(1L);
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setGitPath("10 ms");
    var16.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var16, "100 ms");
    java.lang.String var23 = var16.getHgPath();
    var16.setChanged(false);
    boolean var26 = var4.equals((java.lang.Object)false);
    java.lang.String var27 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var29 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test256"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "2013-08-28T20-44-41.156-0700", "-1 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test257"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setTempDirectory("382707 hours 44 min");
    var4.setRefresh(1L);
    var4.setTempDirectory("");
    java.util.Collection var22 = var4.getProjectPreference();
    boolean var23 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test258"); }


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
    java.lang.String var19 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test259"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var5 = var0.getRelationships();
    var0.enable(true);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test260"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test261"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test262"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setHgPath("382707 hours 44 min");
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

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test263"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("100 ms");
    java.util.Collection var21 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test264"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var5 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var8 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test265"); }


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
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test266"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var11 = crystal.util.XMLTools.writeXMLDocument(var1, "100 ms");
    boolean var13 = crystal.util.XMLTools.writeXMLDocument(var1, "-1 ms");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test267"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var4 = var0.isEnabled();
    java.util.Collection var5 = var0.getLocalStates();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getLocalStates();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test268"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    java.lang.String var7 = var4.getGitPath();
    var4.setTempDirectory("hi!");
    var4.setHgPath("382707 hours 44 min");
    long var12 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10L);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test269"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var9 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test270"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    java.lang.String var9 = var4.getGitPath();
    java.lang.String var10 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10 ms"+ "'", var8.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var9.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test271"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test272"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("10 ms");
    long var17 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test273"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setRefresh(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test274"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    boolean var11 = var4.hasChanged();
    long var12 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10L);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test275"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "100 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test276"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "", "100 ms", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test277"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.lang.String var14 = var4.getHgPath();
    long var15 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100L);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test278"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "1 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test279"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    java.util.Collection var6 = var0.getRelationships();
    java.util.Collection var7 = var0.getLocalStates();
    boolean var8 = var0.isEnabled();
    boolean var9 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test280"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test281"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setRefresh(0L);
    var4.setChanged(true);
    java.lang.String var13 = var4.getTempDirectory();
    var4.setRefresh(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test282"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh((-1L));
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var17 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test283"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("382707 hours 44 min");
    java.util.Collection var12 = var4.getProjectPreference();
    var4.setRefresh(10L);
    var4.setChanged(false);
    java.lang.String var17 = var4.getTempDirectory();
    java.lang.String var18 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test284"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    java.lang.String var7 = var5.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    var5.setChanged(false);
    java.util.Collection var11 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test285"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var16 = var4.getHgPath();
    var4.setHgPath("100 ms");
    java.lang.String var19 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "100 ms"+ "'", var19.equals("100 ms"));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test286"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
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

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test287"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test288"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "0 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test289"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getLocalStates();
    java.util.Collection var6 = var0.getLocalStates();
    var0.enable(true);
    java.util.Collection var9 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test290"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    var0.enable(true);
    boolean var6 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test291"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setGitPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test292"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    long var18 = var4.getRefresh();
    java.lang.String var19 = var4.getGitPath();
    var4.setHgPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10 ms"+ "'", var19.equals("10 ms"));

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test293"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.enable(false);
    boolean var8 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test294"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.enable(true);
    java.util.Collection var5 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test295"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    boolean var14 = var4.hasChanged();
    long var15 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var18 = var4.getGitPath();
    var4.setHgPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10 ms"+ "'", var18.equals("10 ms"));

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test296"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "-1 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test297"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "1 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test298"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test299"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setHgPath("100 ms");
    java.util.Collection var11 = var4.getProjectPreference();
    var4.setTempDirectory("-1 ms");
    var4.setHgPath("1 ms");
    long var16 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test300"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "0 ms", "hi!", 1L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1L);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test301"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    var4.setRefresh(100L);
    var4.setTempDirectory("0 ms");
    java.lang.String var21 = var4.getHgPath();
    java.util.Collection var22 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test302"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    boolean var8 = var0.isEnabled();
    java.util.Collection var9 = var0.getLocalStates();
    java.util.Collection var10 = var0.getRelationships();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test303"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "10 ms", "0 ms", 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test304"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(1L);
    java.util.Collection var19 = var4.getProjectPreference();
    java.awt.Image var20 = crystal.model.Relationship.getDominant(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test305"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var11 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var11.setGitPath("10 ms");
    var11.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var11);
    crystal.client.ClientPreferences.savePreferencesToXML(var11, "10 ms");
    boolean var19 = var4.equals((java.lang.Object)var11);
    var11.setGitPath("1 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test306"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("10 ms");
    long var17 = var4.getRefresh();
    var4.setChanged(true);
    java.lang.String var20 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var20.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test307"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setRefresh(0L);
    java.util.Collection var17 = var4.getProjectPreference();
    var4.setHgPath("10 ms");
    boolean var20 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test308"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("382707 hours 44 min");
    long var18 = var4.getRefresh();
    long var19 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test309"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
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

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test310"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "-1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test311"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.enable(false);
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test312"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    long var17 = var4.getRefresh();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test313"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    java.util.Collection var2 = var0.getRelationships();
    java.util.Collection var3 = var0.getLocalStates();
    boolean var4 = var0.isEnabled();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test314"); }


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
    java.lang.String var25 = var4.getGitPath();
    java.util.Collection var26 = var4.getProjectPreference();
    java.lang.String var27 = var4.getGitPath();
    java.util.Collection var28 = var4.getProjectPreference();
    var4.setGitPath("0 ms");
    java.util.Collection var31 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "0 ms"+ "'", var25.equals("0 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "0 ms"+ "'", var27.equals("0 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test315"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.lang.String var16 = var4.getHgPath();
    long var17 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test316"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "-1 ms", "0 ms", 1L);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test317"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getHgPath();
    var4.setHgPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test318"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test319"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(true);
    java.util.Collection var17 = var4.getProjectPreference();
    var4.setGitPath("1 ms");
    boolean var20 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test320"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "0 ms", "", 1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test321"); }


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
    var4.setTempDirectory("0 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test322"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getHgPath();
    long var7 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var9 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10L);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test323"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test324"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "1 ms", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test325"); }


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
    var16.setChanged(false);
    java.lang.String var25 = var16.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test326"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setTempDirectory("hi!");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var18 = var4.getProjectPreference();
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
    assertNotNull(var18);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test327"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "100 ms");
    boolean var11 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test328"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test329"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    long var5 = var4.getRefresh();
    crystal.client.ClientPreferences var10 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var10.setGitPath("10 ms");
    var10.setTempDirectory("");
    var10.setChanged(true);
    var10.setRefresh(100L);
    java.lang.String var19 = var10.getTempDirectory();
    java.util.Collection var20 = var10.getProjectPreference();
    java.util.Collection var21 = var10.getProjectPreference();
    var10.setGitPath("-1 ms");
    var10.setTempDirectory("10 ms");
    java.lang.String var26 = var10.getGitPath();
    boolean var27 = var4.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "-1 ms"+ "'", var26.equals("-1 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test330"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test331"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getLocalStates();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test332"); }


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
    java.lang.String var23 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test333"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setRefresh(100L);
    java.lang.String var17 = var4.getHgPath();
    var4.setRefresh(1L);
    long var20 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var17.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1L);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test334"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "-1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test335"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    long var15 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    java.lang.String var18 = var4.getHgPath();
    var4.setRefresh(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test336"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    crystal.client.ClientPreferences var22 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var22.setChanged(true);
    var22.setGitPath("10 ms");
    boolean var27 = var4.equals((java.lang.Object)"10 ms");
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test337"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    var0.enable(true);
    java.util.Collection var8 = var0.getLocalStates();
    java.util.Collection var9 = var0.getLocalStates();
    java.awt.Image var10 = crystal.model.Relationship.getDominant(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test338"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getRelationships();
    
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

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test339"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("0 ms");
    long var13 = var4.getRefresh();
    java.lang.String var14 = var4.getTempDirectory();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test340"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test341"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setRefresh(100L);
    java.lang.String var17 = var4.getHgPath();
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var17.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test342"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    java.util.Collection var7 = var4.getProjectPreference();
    var4.setHgPath("0 ms");
    boolean var10 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test343"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    java.lang.String var5 = var4.getHgPath();
    var4.setChanged(false);
    var4.setRefresh((-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10 ms"+ "'", var5.equals("10 ms"));

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test344"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("0 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test345"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setHgPath("100 ms");
    java.util.Collection var11 = var4.getProjectPreference();
    var4.setGitPath("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test346"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "hi!", "1 ms", 1L);
    var4.setTempDirectory("0 ms");
    crystal.client.ClientPreferences var7 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var7
    assertTrue("Contract failed: equals-hashcode on var4 and var7", var4.equals(var7) ? var4.hashCode() == var7.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var7 and var4
    assertTrue("Contract failed: equals-hashcode on var7 and var4", var7.equals(var4) ? var7.hashCode() == var4.hashCode() : true);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test347"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "2013-08-28T20-44-41.156-0700", "", 0L);
    java.lang.String var5 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test348"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "hi!", "hi!", 1L);
    crystal.client.ConflictDaemon var5 = crystal.client.ConflictDaemon.getInstance();
    var5.enable(true);
    var5.removeAllListeners();
    java.util.Collection var9 = var5.getRelationships();
    boolean var10 = var5.isEnabled();
    boolean var11 = var4.equals((java.lang.Object)var5);
    java.util.Collection var12 = var5.getLocalStates();
    var5.enable(true);
    var5.enable(true);
    var5.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test349"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test350"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("10 ms");
    java.util.Collection var12 = var4.getProjectPreference();
    java.lang.String var13 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test351"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test352"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    boolean var8 = var0.isEnabled();
    java.util.Collection var9 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test353"); }


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
    var4.setGitPath("1 ms");
    crystal.client.ClientPreferences var23 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var23
    assertTrue("Contract failed: equals-hashcode on var4 and var23", var4.equals(var23) ? var4.hashCode() == var23.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var23 and var4
    assertTrue("Contract failed: equals-hashcode on var23 and var4", var23.equals(var4) ? var23.hashCode() == var4.hashCode() : true);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test354"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    var4.setRefresh(100L);
    var4.setRefresh(100L);
    java.util.Collection var21 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    var4.setChanged(true);
    java.lang.String var26 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test355"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    var4.setGitPath("100 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test356"); }


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
    var4.setRefresh(100L);
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var25.setGitPath("10 ms");
    var25.setTempDirectory("");
    var25.setChanged(true);
    var25.setRefresh(100L);
    java.util.Collection var34 = var25.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var25);
    crystal.client.ClientPreferences.savePreferencesToXML(var25, "-1 ms");
    var25.setRefresh(100L);
    boolean var40 = var4.equals((java.lang.Object)100L);
    
    // Checks the contract:  equals-hashcode on var4 and var25
    assertTrue("Contract failed: equals-hashcode on var4 and var25", var4.equals(var25) ? var4.hashCode() == var25.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var25 and var4
    assertTrue("Contract failed: equals-hashcode on var25 and var4", var25.equals(var4) ? var25.hashCode() == var4.hashCode() : true);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test357"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.lang.String var15 = var4.getGitPath();
    java.util.Collection var16 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10 ms"+ "'", var15.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test358"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    java.util.Collection var5 = var0.getRelationships();
    var0.removeAllListeners();
    boolean var7 = var0.isEnabled();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var11 = var0.getLocalStates();
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test359"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    java.util.Collection var6 = var0.getRelationships();
    java.util.Collection var7 = var0.getLocalStates();
    java.util.Collection var8 = var0.getLocalStates();
    java.awt.Image var9 = crystal.model.Relationship.getDominant(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test360"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    var0.enable(true);
    var0.enable(true);
    boolean var8 = var0.isEnabled();
    java.util.Collection var9 = var0.getRelationships();
    boolean var10 = var0.isEnabled();
    java.util.Collection var11 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test361"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    var4.setTempDirectory("1 ms");
    long var7 = var4.getRefresh();
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1L);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test362"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    boolean var6 = var0.isEnabled();
    var0.removeAllListeners();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test363"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    var4.setTempDirectory("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test364"); }


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
    long var21 = var4.getRefresh();
    var4.setHgPath("");
    crystal.client.ConflictDaemon var24 = crystal.client.ConflictDaemon.getInstance();
    boolean var25 = var24.isEnabled();
    var24.removeAllListeners();
    var24.removeAllListeners();
    java.util.Collection var28 = var24.getRelationships();
    boolean var29 = var4.equals((java.lang.Object)var28);
    
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
    assertTrue(var21 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test365"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "2013-08-28T20-44-41.156-0700", "", 0L);
    var4.setRefresh(10L);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test366"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    var4.setChanged(false);
    java.lang.String var20 = var4.getHgPath();
    java.util.Collection var21 = var4.getProjectPreference();
    java.util.Collection var22 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test367"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var11 = var4.getHgPath();
    var4.setChanged(true);
    var4.setGitPath("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test368"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("1 ms");
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

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test369"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    long var14 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var17 = var4.getRefresh();
    var4.setGitPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test370"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    java.lang.String var8 = var4.getGitPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "382707 hours 44 min"+ "'", var8.equals("382707 hours 44 min"));

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test371"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test372"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    var0.enable(false);
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getRelationships();
    java.util.Collection var9 = var0.getLocalStates();
    var0.enable(false);
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test373"); }


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
    boolean var20 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test374"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    java.util.Collection var17 = var4.getProjectPreference();
    var4.setHgPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test375"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("10 ms");
    long var17 = var4.getRefresh();
    java.lang.String var18 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10 ms"+ "'", var18.equals("10 ms"));

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test376"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    var4.setChanged(false);
    java.lang.String var20 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var22 = var4.getProjectPreferences("hi!");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test377"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test378"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    boolean var14 = var4.hasChanged();
    long var15 = var4.getRefresh();
    java.lang.String var16 = var4.getTempDirectory();
    long var17 = var4.getRefresh();
    var4.setChanged(false);
    java.lang.String var20 = var4.getHgPath();
    java.util.Collection var21 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var16.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var20.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test379"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    java.util.Collection var7 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test380"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    boolean var11 = var4.hasChanged();
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setGitPath("10 ms");
    var16.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var16, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var16, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var25 = var16.getProjectPreference();
    java.util.Collection var26 = var16.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var16, "100 ms");
    boolean var29 = var4.equals((java.lang.Object)var16);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    crystal.client.ClientPreferences var36 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var36.setChanged(true);
    var36.setGitPath("10 ms");
    var36.setRefresh(1L);
    boolean var43 = var36.hasChanged();
    boolean var44 = var4.equals((java.lang.Object)var43);
    java.lang.String var45 = var4.getHgPath();
    crystal.client.ClientPreferences var46 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var46
    assertTrue("Contract failed: equals-hashcode on var4 and var46", var4.equals(var46) ? var4.hashCode() == var46.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var46 and var4
    assertTrue("Contract failed: equals-hashcode on var46 and var4", var46.equals(var4) ? var46.hashCode() == var4.hashCode() : true);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test381"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "-1 ms", "hi!", 10L);
    java.lang.String var5 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test382"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "hi!", "hi!", 1L);
    crystal.client.ConflictDaemon var5 = crystal.client.ConflictDaemon.getInstance();
    var5.enable(true);
    var5.removeAllListeners();
    java.util.Collection var9 = var5.getRelationships();
    boolean var10 = var5.isEnabled();
    boolean var11 = var4.equals((java.lang.Object)var5);
    java.util.Collection var12 = var4.getProjectPreference();
    boolean var13 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test383"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(true);
    var4.setGitPath("100 ms");
    var4.setTempDirectory("");
    boolean var20 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test384"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test385"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "10 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test386"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(true);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var17 = var4.hasChanged();
    java.lang.String var18 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var18.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test387"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences var24 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var24.setGitPath("10 ms");
    var24.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var24, "382707 hours 44 min");
    java.lang.String var31 = var24.getGitPath();
    boolean var32 = var4.equals((java.lang.Object)var24);
    var24.setTempDirectory("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "10 ms"+ "'", var31.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test388"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    var4.setTempDirectory("hi!");
    var4.setGitPath("10 ms");
    java.lang.String var17 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test389"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    var4.setRefresh((-1L));
    java.util.Collection var15 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test390"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test391"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    boolean var6 = var0.isEnabled();
    java.util.Collection var7 = var0.getLocalStates();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test392"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
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

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test393"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    boolean var11 = var4.hasChanged();
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setGitPath("10 ms");
    var16.setTempDirectory("");
    var16.setChanged(true);
    var16.setRefresh(100L);
    java.lang.String var25 = var16.getTempDirectory();
    java.util.Collection var26 = var16.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var16);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var16);
    var16.setGitPath("100 ms");
    var16.setRefresh(100L);
    crystal.client.ClientPreferences var37 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var37.setGitPath("10 ms");
    var37.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var37, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var37, "2013-08-28T20-44-41.156-0700");
    long var46 = var37.getRefresh();
    var37.setChanged(false);
    var37.setTempDirectory("10 ms");
    var37.setTempDirectory("-1 ms");
    boolean var53 = var16.equals((java.lang.Object)var37);
    boolean var54 = var4.equals((java.lang.Object)var37);
    java.lang.String var55 = var4.getGitPath();
    long var56 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 10L);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test394"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    crystal.client.ConflictDaemon var5 = crystal.client.ConflictDaemon.getInstance();
    var5.removeAllListeners();
    var5.enable(true);
    java.util.Collection var9 = var5.getRelationships();
    java.util.Collection var10 = var5.getRelationships();
    boolean var11 = var5.isEnabled();
    boolean var12 = var4.equals((java.lang.Object)var5);
    java.util.Collection var13 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test395"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var15 = var4.getHgPath();
    long var16 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test396"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    var4.setHgPath("10 ms");
    var4.setGitPath("0 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"0 ms");

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test397"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(true);
    java.util.Collection var17 = var4.getProjectPreference();
    java.util.Collection var18 = var4.getProjectPreference();
    var4.setHgPath("hi!");
    long var21 = var4.getRefresh();
    java.lang.String var22 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test398"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    var0.enable(false);
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test399"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "-1 ms", "0 ms", 1L);
    var4.setGitPath("100 ms");

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test400"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    java.util.Collection var7 = var4.getProjectPreference();
    var4.setHgPath("0 ms");
    var4.setGitPath("100 ms");
    long var12 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    var4.setRefresh((-1L));
    crystal.client.ClientPreferences var21 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var21);
    java.lang.String var23 = var21.getGitPath();
    boolean var24 = var4.equals((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "382707 hours 44 min"+ "'", var23.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test401"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("-1 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test402"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.lang.String var14 = var4.getHgPath();
    var4.setTempDirectory("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences var18 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test403"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var7 = var1.getLocalStates();
    java.awt.Image var8 = crystal.model.Relationship.getDominant(var7);
    java.awt.Image var9 = crystal.model.Relationship.getDominant(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var7);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test404"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "hi!", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test405"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    java.util.Collection var2 = var0.getRelationships();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var5 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test406"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.removeAllListeners();
    java.util.Collection var4 = var1.getRelationships();
    java.util.Collection var5 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var5);
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

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test407"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "10 ms", "hi!", 0L);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test408"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "382707 hours 44 min", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test409"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setChanged(false);
    java.util.Collection var18 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test410"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("100 ms", "382707 hours 44 min", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test411"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    var4.setRefresh(100L);
    var4.setRefresh(100L);
    java.lang.String var21 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test412"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    var0.enable(true);
    java.util.Collection var9 = var0.getRelationships();
    java.util.Collection var10 = var0.getLocalStates();
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test413"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setTempDirectory("382707 hours 44 min");
    boolean var18 = var4.hasChanged();
    java.lang.String var19 = var4.getTempDirectory();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "382707 hours 44 min"+ "'", var19.equals("382707 hours 44 min"));

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test414"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var18 = var4.getTempDirectory();
    boolean var19 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var18.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test415"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setTempDirectory("0 ms");
    var4.setTempDirectory("1 ms");
    var4.setHgPath("");

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test416"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "382707 hours 44 min", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test417"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setChanged(true);
    java.util.Collection var18 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test418"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    var1.removeAllListeners();
    var1.removeAllListeners();
    boolean var5 = var1.isEnabled();
    var1.removeAllListeners();
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
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test419"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setTempDirectory("");
    java.lang.String var24 = var4.getHgPath();
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "382707 hours 44 min"+ "'", var24.equals("382707 hours 44 min"));

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test420"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test421"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "0 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test422"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test423"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "hi!", "1 ms", 100L);
    var4.setChanged(false);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test424"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    java.lang.String var7 = var4.getGitPath();
    var4.setTempDirectory("hi!");
    java.lang.String var10 = var4.getTempDirectory();
    var4.setChanged(false);
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test425"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var12 = var4.getProjectPreference();
    boolean var13 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test426"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    java.lang.String var15 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var17 = var4.getTempDirectory();
    var4.setGitPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var17.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test427"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1L);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test428"); }


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
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test429"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test430"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("382707 hours 44 min");
    var4.setHgPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test431"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    boolean var11 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test432"); }


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
    var23.setHgPath("0 ms");
    
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

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test433"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
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

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test434"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var15 = var4.getHgPath();
    var4.setHgPath("0 ms");
    java.lang.String var18 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var20 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test435"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "0 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test436"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test437"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var18 = var4.getTempDirectory();
    var4.setChanged(false);
    java.lang.String var21 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var18.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var21.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test438"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var4 = var0.isEnabled();
    java.util.Collection var5 = var0.getLocalStates();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test439"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("1 ms", "0 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test440"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(false);
    java.util.Collection var10 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test441"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setChanged(false);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var18 = var4.getHgPath();
    java.lang.String var19 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test442"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "-1 ms", "1 ms", 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test443"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    var4.setTempDirectory("hi!");

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test444"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setChanged(false);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setRefresh(0L);
    java.lang.String var20 = var4.getTempDirectory();
    crystal.client.ClientPreferences var21 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var21
    assertTrue("Contract failed: equals-hashcode on var4 and var21", var4.equals(var21) ? var4.hashCode() == var21.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var21 and var4
    assertTrue("Contract failed: equals-hashcode on var21 and var4", var21.equals(var4) ? var21.hashCode() == var4.hashCode() : true);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test445"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    boolean var11 = var4.hasChanged();
    var4.setGitPath("382707 hours 44 min");
    java.lang.String var14 = var4.getGitPath();
    java.lang.String var15 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "382707 hours 44 min"+ "'", var14.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "382707 hours 44 min"+ "'", var15.equals("382707 hours 44 min"));

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test446"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test447"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    java.lang.String var14 = var4.getTempDirectory();
    crystal.client.ClientPreferences var19 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var19.setGitPath("10 ms");
    var19.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var19, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var19, "2013-08-28T20-44-41.156-0700");
    long var28 = var19.getRefresh();
    var19.setChanged(false);
    var19.setHgPath("382707 hours 44 min");
    java.lang.String var33 = var19.getHgPath();
    boolean var34 = var4.equals((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var14.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "382707 hours 44 min"+ "'", var33.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test448"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "0 ms", "hi!", 10L);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test449"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh((-1L));
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("100 ms");
    var4.setHgPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test450"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    long var8 = var4.getRefresh();
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getHgPath();
    java.lang.String var12 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test451"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    var0.enable(true);
    java.util.Collection var7 = var0.getLocalStates();
    java.util.Collection var8 = var0.getLocalStates();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test452"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setChanged(false);
    boolean var18 = var4.hasChanged();
    crystal.client.ClientPreferences var19 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var19
    assertTrue("Contract failed: equals-hashcode on var4 and var19", var4.equals(var19) ? var4.hashCode() == var19.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var19 and var4
    assertTrue("Contract failed: equals-hashcode on var19 and var4", var19.equals(var4) ? var19.hashCode() == var4.hashCode() : true);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test453"); }


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
    java.lang.String var11 = crystal.util.TimeUtility.formatLSMRDate(var1);
    java.lang.String var12 = crystal.util.TimeUtility.formatLSMRDate(var1);
    java.lang.String var13 = crystal.util.TimeUtility.formatLSMRDate(var1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var11.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var12.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test454"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getGitPath();
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test455"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test456"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var10 = var0.getRelationships();
    java.util.Collection var11 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test457"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setGitPath("1 ms");
    var4.setRefresh(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test458"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setChanged(true);
    var4.setRefresh(100L);
    var4.setGitPath("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test459"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    boolean var16 = var4.hasChanged();
    var4.setRefresh((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test460"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var11 = var4.getHgPath();
    var4.setChanged(false);
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    boolean var17 = var4.hasChanged();
    var4.setRefresh(1L);
    long var20 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1L);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test461"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var18 = var4.getRefresh();
    long var19 = var4.getRefresh();
    var4.setGitPath("hi!");
    var4.setGitPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test462"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(true);
    boolean var8 = var0.isEnabled();
    java.util.Collection var9 = var0.getRelationships();
    java.util.Collection var10 = var0.getRelationships();
    boolean var11 = var0.isEnabled();
    java.util.Collection var12 = var0.getLocalStates();
    java.util.Collection var13 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test463"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.util.Collection var6 = var4.getProjectPreference();
    var4.setGitPath("0 ms");
    java.lang.String var9 = var4.getTempDirectory();
    var4.setRefresh(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var9.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test464"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    java.lang.String var7 = var5.getHgPath();
    java.util.Collection var8 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test465"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    java.util.Collection var8 = var0.getLocalStates();
    java.util.Collection var9 = var0.getRelationships();
    java.util.Collection var10 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test466"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    long var20 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1L);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test467"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "10 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test468"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var8 = var0.getRelationships();
    java.util.Collection var9 = var0.getRelationships();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test469"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "1 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test470"); }


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
    java.lang.String var25 = var4.getGitPath();
    java.util.Collection var26 = var4.getProjectPreference();
    java.lang.String var27 = var4.getGitPath();
    var4.setHgPath("0 ms");
    var4.setGitPath("0 ms");
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "0 ms"+ "'", var25.equals("0 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "0 ms"+ "'", var27.equals("0 ms"));

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test471"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var15 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var15.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test472"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("0 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test473"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.removeAllListeners();
    java.util.Collection var5 = var0.getRelationships();
    var0.enable(true);
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test474"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    var0.enable(false);
    java.util.Collection var9 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test475"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "0 ms", "10 ms", 100L);
    var4.setChanged(true);
    crystal.client.ConflictDaemon var7 = crystal.client.ConflictDaemon.getInstance();
    var7.removeAllListeners();
    var7.enable(true);
    boolean var11 = var7.isEnabled();
    var7.enable(true);
    boolean var14 = var7.isEnabled();
    boolean var15 = var4.equals((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test476"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    var4.setRefresh(100L);
    var4.setRefresh(100L);
    java.util.Collection var21 = var4.getProjectPreference();
    long var22 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100L);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test477"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("0 ms");
    var4.setRefresh(1L);
    java.util.Collection var15 = var4.getProjectPreference();
    long var16 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1L);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test478"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    java.util.Collection var15 = var4.getProjectPreference();
    java.lang.String var16 = var4.getGitPath();
    var4.setGitPath("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10 ms"+ "'", var16.equals("10 ms"));

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test479"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var16 = var4.getProjectPreference();
    boolean var17 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test480"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test481"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getRelationships();
    java.util.Collection var5 = var1.getRelationships();
    var1.enable(false);
    boolean var8 = var1.isEnabled();
    java.util.Collection var9 = var1.getRelationships();
    java.util.Collection var10 = var1.getLocalStates();
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var10);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test482"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setHgPath("100 ms");
    java.lang.String var11 = var4.getHgPath();
    long var12 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100 ms"+ "'", var11.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10L);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test483"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setHgPath("1 ms");
    boolean var17 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test484"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    var0.removeAllListeners();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test485"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.util.Collection var6 = var4.getProjectPreference();
    java.awt.Image var7 = crystal.model.Relationship.getDominant(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test486"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    org.jdom.Document var9 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var10 = var4.equals((java.lang.Object)var9);
    boolean var12 = crystal.util.XMLTools.writeXMLDocument(var9, "0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = crystal.util.XMLTools.writeXMLDocument(var9, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test487"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getHgPath();
    var4.setHgPath("0 ms");
    var4.setTempDirectory("-1 ms");
    var4.setChanged(true);
    java.lang.String var20 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "-1 ms"+ "'", var20.equals("-1 ms"));

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test488"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    java.util.Collection var5 = var0.getRelationships();
    var0.removeAllListeners();
    boolean var7 = var0.isEnabled();
    var0.enable(true);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test489"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test490"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.util.Collection var8 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test491"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setTempDirectory("hi!");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
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

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test492"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("0 ms");
    var4.setRefresh(1L);
    java.util.Collection var15 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test493"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("2013-08-28T20-44-41.156-0700");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var9);
    
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

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test494"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var19 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "382707 hours 44 min"+ "'", var19.equals("382707 hours 44 min"));

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test495"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    long var14 = var4.getRefresh();
    long var15 = var4.getRefresh();
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test496"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    crystal.client.ConflictDaemon var7 = crystal.client.ConflictDaemon.getInstance();
    boolean var8 = var7.isEnabled();
    java.util.Collection var9 = var7.getLocalStates();
    var7.removeAllListeners();
    java.util.Collection var11 = var7.getRelationships();
    java.awt.Image var12 = crystal.model.Relationship.getDominant(var11);
    java.awt.Image var13 = crystal.model.Relationship.getDominant(var11);
    boolean var14 = var4.equals((java.lang.Object)var11);
    java.lang.String var15 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test497"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    var0.removeAllListeners();
    java.util.Collection var9 = var0.getRelationships();
    
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
    assertNotNull(var9);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test498"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    long var12 = var4.getRefresh();
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1L);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test499"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "-1 ms", "0 ms", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test500"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    java.util.Collection var8 = var0.getLocalStates();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
