package randoop.crystal;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "-1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "1 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    java.awt.Image var4 = crystal.model.Relationship.getDominant(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "-1 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    long var9 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100L);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.lang.String var8 = var4.getGitPath();
    java.lang.String var9 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "0 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    var5.setGitPath("10 ms");
    var5.setRefresh(1L);
    boolean var12 = var5.hasChanged();
    java.util.Collection var13 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    boolean var2 = var0.isEnabled();
    boolean var3 = var0.isEnabled();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    java.util.Collection var14 = var4.getProjectPreference();
    java.awt.Image var15 = crystal.model.Relationship.getDominant(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("2013-08-28T20-44-41.156-0700");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    java.util.Collection var5 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var6 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    java.util.Collection var9 = var4.getProjectPreference();
    boolean var10 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "hi!", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    boolean var1 = crystal.util.ValidInputChecker.checkCommand("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "0 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("", "-1 ms");
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    crystal.client.ConflictDaemon var13 = crystal.client.ConflictDaemon.getInstance();
    var13.removeAllListeners();
    var13.enable(true);
    var13.enable(true);
    var13.enable(true);
    boolean var21 = var13.isEnabled();
    java.util.Collection var22 = var13.getRelationships();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var22);
    boolean var24 = var4.equals((java.lang.Object)var22);
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
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "2013-08-28T20-44-41.156-0700", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkNonNegativeNumberInput((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


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

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.util.Collection var14 = var5.getProjectPreference();
    java.awt.Image var15 = crystal.model.Relationship.getDominant(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("1 ms", var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "0 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    long var14 = var5.getRefresh();
    long var15 = var5.getRefresh();
    var5.setChanged(false);
    long var18 = var5.getRefresh();
    long var19 = var5.getRefresh();
    java.lang.String var20 = var5.getGitPath();
    java.lang.String var21 = var5.getTempDirectory();
    java.util.Collection var22 = var5.getProjectPreference();
    java.awt.Image var23 = crystal.model.Relationship.getDominant(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10 ms"+ "'", var20.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var12 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "10 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


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
    java.util.Collection var21 = var4.getProjectPreference();
    var4.setRefresh(100L);
    
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
    assertNotNull(var21);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
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

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    java.util.HashMap var1 = crystal.server.HgLogParser.parseLog("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    boolean var8 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "10 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    java.lang.String var17 = var4.getGitPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10 ms"+ "'", var17.equals("10 ms"));

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    java.util.Collection var15 = var5.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var5);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var5);
    var5.setGitPath("100 ms");
    java.util.Collection var20 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    java.util.Collection var17 = var4.getProjectPreference();
    crystal.client.ClientPreferences var18 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    java.lang.String var5 = var4.getHgPath();
    crystal.client.ClientPreferences var6 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var6
    assertTrue("Contract failed: equals-hashcode on var4 and var6", var4.equals(var6) ? var4.hashCode() == var6.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var6 and var4
    assertTrue("Contract failed: equals-hashcode on var6 and var4", var6.equals(var4) ? var6.hashCode() == var4.hashCode() : true);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "10 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.enable(true);
    boolean var6 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    boolean var1 = crystal.util.ValidInputChecker.checkDirectoryPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "", "2013-08-28T20-44-41.156-0700", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    java.lang.String var8 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    java.awt.Image var4 = crystal.model.Relationship.getDominant(var3);
    java.awt.Image var5 = crystal.model.Relationship.getDominant(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var3);
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
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "0 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "0 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    var5.setRefresh(10L);
    java.util.Collection var17 = var5.getProjectPreference();
    java.awt.Image var18 = crystal.model.Relationship.getDominant(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getRelationships();
    java.util.Collection var5 = var1.getRelationships();
    boolean var6 = var1.isEnabled();
    java.util.Collection var7 = var1.getLocalStates();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    var4.setHgPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "382707 hours 44 min"+ "'", var6.equals("382707 hours 44 min"));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "-1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "0 ms", "10 ms", 100L);
    crystal.client.ClientPreferences var5 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var5
    assertTrue("Contract failed: equals-hashcode on var4 and var5", var4.equals(var5) ? var4.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var4
    assertTrue("Contract failed: equals-hashcode on var5 and var4", var5.equals(var4) ? var5.hashCode() == var4.hashCode() : true);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "0 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.util.Collection var14 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "0 ms", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.lang.String var15 = var4.getGitPath();
    var4.setGitPath("-1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
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

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "-1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("382707 hours 44 min", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    java.lang.String var7 = var4.getGitPath();
    var4.setTempDirectory("hi!");
    java.lang.String var10 = var4.getTempDirectory();
    var4.setTempDirectory("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    java.util.Date var1 = crystal.util.TimeUtility.parseLSMRDate("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    org.jdom.Document var9 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var10 = var4.equals((java.lang.Object)var9);
    boolean var11 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(true);
    java.util.Collection var17 = var4.getProjectPreference();
    boolean var18 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    java.util.Collection var14 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var16 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    long var12 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1L);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
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

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var31 = var4.getProjectPreferences("hi!");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
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

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
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

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("382707 hours 44 min");
    java.util.Collection var12 = var4.getProjectPreference();
    java.lang.String var13 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    boolean var1 = crystal.util.ValidInputChecker.checkUrl("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "2013-08-28T20-44-41.156-0700", 10L);
    java.lang.String var5 = var4.getHgPath();
    java.lang.String var6 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0 ms"+ "'", var5.equals("0 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10 ms"+ "'", var6.equals("10 ms"));

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


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
    crystal.client.ClientPreferences var20 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var20
    assertTrue("Contract failed: equals-hashcode on var4 and var20", var4.equals(var20) ? var4.hashCode() == var20.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var20 and var4
    assertTrue("Contract failed: equals-hashcode on var20 and var4", var20.equals(var4) ? var20.hashCode() == var4.hashCode() : true);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("10 ms", "", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    java.lang.String var15 = var4.getHgPath();
    java.lang.String var16 = var4.getTempDirectory();
    crystal.client.ClientPreferences var17 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var17
    assertTrue("Contract failed: equals-hashcode on var4 and var17", var4.equals(var17) ? var4.hashCode() == var17.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var17 and var4
    assertTrue("Contract failed: equals-hashcode on var17 and var4", var17.equals(var4) ? var17.hashCode() == var4.hashCode() : true);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "1 ms", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    long var18 = var4.getRefresh();
    java.lang.String var19 = var4.getTempDirectory();
    var4.setHgPath("");
    long var22 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1L);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "hi!", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getGitPath();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


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
    java.lang.String var20 = var4.getTempDirectory();
    crystal.client.ClientPreferences var21 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var21
    assertTrue("Contract failed: equals-hashcode on var4 and var21", var4.equals(var21) ? var4.hashCode() == var21.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var21 and var4
    assertTrue("Contract failed: equals-hashcode on var21 and var4", var21.equals(var4) ? var21.hashCode() == var4.hashCode() : true);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("0 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    java.lang.String var15 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var15.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("382707 hours 44 min", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "10 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "100 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "hi!", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    crystal.util.TimeUtility var0 = new crystal.util.TimeUtility();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var5.setRefresh((-1L));
    var5.setHgPath("-1 ms");
    boolean var10 = var5.hasChanged();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var5);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var5);
    java.util.Collection var13 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
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

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    java.util.Collection var12 = var4.getProjectPreference();
    var4.setRefresh((-1L));
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700", 0L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setTempDirectory("hi!");
    crystal.client.ClientPreferences var16 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var16
    assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var16 and var4
    assertTrue("Contract failed: equals-hashcode on var16 and var4", var16.equals(var4) ? var16.hashCode() == var4.hashCode() : true);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("1 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("10 ms");
    java.lang.String var12 = var4.getGitPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10 ms"+ "'", var12.equals("10 ms"));

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "-1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    java.lang.String var17 = var4.getGitPath();
    crystal.client.ClientPreferences var18 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "0 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    java.lang.String var1 = crystal.util.RunIt.getExecutable("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1 ms"+ "'", var1.equals("1 ms"));

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


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
    crystal.client.ClientPreferences var23 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var23.setChanged(true);
    var23.setGitPath("10 ms");
    var23.setRefresh(1L);
    var23.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var32 = var23.hasChanged();
    var23.setChanged(true);
    var23.setHgPath("-1 ms");
    var23.setHgPath("382707 hours 44 min");
    var23.setTempDirectory("1 ms");
    boolean var41 = var4.equals((java.lang.Object)"1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("hi!", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


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
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    java.util.Collection var15 = var5.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var5);
    java.util.Collection var17 = var5.getProjectPreference();
    long var18 = var5.getRefresh();
    java.util.Collection var19 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.util.Collection var11 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences var13 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var13
    assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var13 and var4
    assertTrue("Contract failed: equals-hashcode on var13 and var4", var13.equals(var4) ? var13.hashCode() == var4.hashCode() : true);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(false);
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getRelationships();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "10 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.awt.Image var14 = crystal.model.Relationship.getDominant(var13);
    java.awt.Image var15 = crystal.model.Relationship.getDominant(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.removeAllListeners();
    boolean var3 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "-1 ms", "-1 ms", 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var6 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    java.lang.String var1 = crystal.util.RunIt.getExecutable("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1 ms"+ "'", var1.equals("-1 ms"));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    boolean var8 = var5.hasChanged();
    var5.setTempDirectory("100 ms");
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
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("382707 hours 44 min");
    java.util.Collection var12 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    java.lang.String var17 = var4.getTempDirectory();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var12 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var12.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


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
    var4.setRefresh(10L);
    
    // Checks the contract:  equals-hashcode on var4 and var16
    assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var16 and var4
    assertTrue("Contract failed: equals-hashcode on var16 and var4", var16.equals(var4) ? var16.hashCode() == var4.hashCode() : true);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setTempDirectory("0 ms");
    boolean var9 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var6 = var5.getRefresh();
    var5.setTempDirectory("10 ms");
    java.util.Collection var9 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setRefresh(10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var9 = var4.getProjectPreferences("1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    long var14 = var5.getRefresh();
    java.util.Collection var15 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    boolean var7 = var4.hasChanged();
    var4.setTempDirectory("100 ms");
    java.util.Collection var10 = var4.getProjectPreference();
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "100 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "2013-08-28T20-44-41.156-0700", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "-1 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "0 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    long var5 = var4.getRefresh();
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

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "0 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "0 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    var0.enable(false);
    var0.removeAllListeners();
    java.util.Collection var8 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "hi!", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    crystal.client.ClientPreferences var20 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var21 = var20.getRefresh();
    var20.setTempDirectory("10 ms");
    java.lang.String var24 = var20.getGitPath();
    boolean var25 = var4.equals((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setRefresh(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh((-1L));
    var4.setChanged(true);
    boolean var16 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "100 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("100 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getLocalStates();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var6);
    
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

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("382707 hours 44 min");
    java.util.Collection var12 = var4.getProjectPreference();
    java.awt.Image var13 = crystal.model.Relationship.getDominant(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "10 ms", "382707 hours 44 min", 100L);
    var4.setGitPath("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setHgPath("1 ms");
    boolean var17 = var4.hasChanged();
    var4.setHgPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "100 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
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

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var10 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10 ms"+ "'", var8.equals("10 ms"));

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("10 ms", "382707 hours 44 min", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "382707 hours 44 min", "10 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


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
    java.awt.Image var22 = crystal.model.Relationship.getDominant(var18);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("382707 hours 44 min", var2, "-1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    long var18 = var4.getRefresh();
    crystal.client.ClientPreferences var23 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var23.setGitPath("10 ms");
    var23.setTempDirectory("");
    var23.setChanged(true);
    var23.setRefresh(100L);
    java.lang.String var32 = var23.getTempDirectory();
    java.util.Collection var33 = var23.getProjectPreference();
    boolean var34 = var4.equals((java.lang.Object)var33);
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
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
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

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var33 = var4.getProjectPreferences("10 ms");
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

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    crystal.client.ClientPreferences var7 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var7
    assertTrue("Contract failed: equals-hashcode on var4 and var7", var4.equals(var7) ? var4.hashCode() == var7.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var7 and var4
    assertTrue("Contract failed: equals-hashcode on var7 and var4", var7.equals(var4) ? var7.hashCode() == var4.hashCode() : true);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "100 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    crystal.client.ClientPreferences var18 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setTempDirectory("100 ms");
    java.lang.String var16 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("100 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
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

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    java.lang.String var6 = var5.getHgPath();
    boolean var7 = var5.hasChanged();
    java.util.Collection var8 = var5.getProjectPreference();
    java.awt.Image var9 = crystal.model.Relationship.getDominant(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100 ms"+ "'", var6.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "hi!", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    var1.enable(true);
    var1.enable(true);
    boolean var9 = var1.isEnabled();
    java.util.Collection var10 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    boolean var11 = var4.hasChanged();
    java.lang.String var12 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10 ms"+ "'", var12.equals("10 ms"));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "10 ms", "10 ms", 10L);
    java.lang.String var5 = var4.getHgPath();
    crystal.client.ClientPreferences var6 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var6
    assertTrue("Contract failed: equals-hashcode on var4 and var6", var4.equals(var6) ? var4.hashCode() == var6.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var6 and var4
    assertTrue("Contract failed: equals-hashcode on var6 and var4", var6.equals(var4) ? var6.hashCode() == var4.hashCode() : true);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "1 ms", "382707 hours 44 min", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "10 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getHgPath();
    java.util.Collection var9 = var4.getProjectPreference();
    crystal.client.ClientPreferences var10 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var10
    assertTrue("Contract failed: equals-hashcode on var4 and var10", var4.equals(var10) ? var4.hashCode() == var10.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var10 and var4
    assertTrue("Contract failed: equals-hashcode on var10 and var4", var10.equals(var4) ? var10.hashCode() == var4.hashCode() : true);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


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
    java.lang.String var31 = var4.getGitPath();
    
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
    assertTrue("'" + var31 + "' != '" + "10 ms"+ "'", var31.equals("10 ms"));

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    long var12 = var4.getRefresh();
    var4.setGitPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1L);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var4 = var0.isEnabled();
    java.util.Collection var5 = var0.getLocalStates();
    boolean var6 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    boolean var3 = var0.isEnabled();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var15 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var6 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    java.util.Collection var6 = var0.getRelationships();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


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
    crystal.client.ClientPreferences var29 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var29
    assertTrue("Contract failed: equals-hashcode on var4 and var29", var4.equals(var29) ? var4.hashCode() == var29.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var29 and var4
    assertTrue("Contract failed: equals-hashcode on var29 and var4", var29.equals(var4) ? var29.hashCode() == var4.hashCode() : true);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    java.awt.Image var7 = crystal.model.Relationship.getDominant(var6);
    
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
    assertNull(var7);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    var4.setHgPath("10 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var8 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    java.util.Collection var7 = var0.getRelationships();
    boolean var8 = var0.isEnabled();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "2013-08-28T20-44-41.156-0700", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setTempDirectory("");
    var4.setTempDirectory("1 ms");
    crystal.client.ClientPreferences var9 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var9
    assertTrue("Contract failed: equals-hashcode on var4 and var9", var4.equals(var9) ? var4.hashCode() == var9.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var9 and var4
    assertTrue("Contract failed: equals-hashcode on var9 and var4", var9.equals(var4) ? var9.hashCode() == var4.hashCode() : true);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getRelationships();
    java.util.Collection var5 = var1.getRelationships();
    java.util.Collection var6 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("1 ms", var6);
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
    assertNotNull(var6);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "2013-08-28T20-44-41.156-0700", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    java.util.Collection var6 = var0.getRelationships();
    java.util.Collection var7 = var0.getLocalStates();
    java.awt.Image var8 = crystal.model.Relationship.getDominant(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


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
    var4.setRefresh((-1L));
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    boolean var2 = var0.isEnabled();
    boolean var3 = var0.isEnabled();
    java.util.Collection var4 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "10 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    java.lang.String var5 = var4.getHgPath();
    java.lang.String var6 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10 ms"+ "'", var5.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10 ms"+ "'", var6.equals("10 ms"));

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "10 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "382707 hours 44 min", "1 ms", 100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    java.util.Collection var3 = var1.getRelationships();
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var5);
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

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


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
    java.lang.String var30 = var16.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


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
    var23.setGitPath("10 ms");
    var23.setTempDirectory("");
    var23.setChanged(true);
    var23.setRefresh(100L);
    java.lang.String var32 = var23.getTempDirectory();
    java.lang.String var33 = var23.getGitPath();
    var23.setChanged(true);
    java.lang.String var36 = var23.getTempDirectory();
    boolean var37 = var4.equals((java.lang.Object)var23);
    
    // Checks the contract:  equals-hashcode on var4 and var23
    assertTrue("Contract failed: equals-hashcode on var4 and var23", var4.equals(var23) ? var4.hashCode() == var23.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var23 and var4
    assertTrue("Contract failed: equals-hashcode on var23 and var4", var23.equals(var4) ? var23.hashCode() == var4.hashCode() : true);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    long var7 = var4.getRefresh();
    java.util.Collection var8 = var4.getProjectPreference();
    java.awt.Image var9 = crystal.model.Relationship.getDominant(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    long var14 = var5.getRefresh();
    long var15 = var5.getRefresh();
    var5.setChanged(false);
    long var18 = var5.getRefresh();
    long var19 = var5.getRefresh();
    java.lang.String var20 = var5.getGitPath();
    java.lang.String var21 = var5.getTempDirectory();
    java.util.Collection var22 = var5.getProjectPreference();
    java.awt.Image var23 = crystal.model.Relationship.getDominant(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10 ms"+ "'", var20.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    boolean var7 = var4.hasChanged();
    var4.setTempDirectory("100 ms");
    java.lang.String var10 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var7 = var1.getLocalStates();
    java.util.Collection var8 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var8);
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
    assertNotNull(var8);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "0 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "382707 hours 44 min", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "", "1 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("-1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    long var16 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var18 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100L);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


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
    var4.setGitPath("1 ms");
    java.lang.String var30 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "1 ms", "-1 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "1 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("382707 hours 44 min", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.util.Collection var11 = var4.getProjectPreference();
    java.lang.String var12 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10 ms"+ "'", var12.equals("10 ms"));

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    java.util.Collection var15 = var5.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var5);
    boolean var17 = var5.hasChanged();
    java.util.Collection var18 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    java.util.Collection var7 = var4.getProjectPreference();
    var4.setHgPath("0 ms");
    crystal.client.ClientPreferences var10 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var10
    assertTrue("Contract failed: equals-hashcode on var4 and var10", var4.equals(var10) ? var4.hashCode() == var10.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var10 and var4
    assertTrue("Contract failed: equals-hashcode on var10 and var4", var10.equals(var4) ? var10.hashCode() == var4.hashCode() : true);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "hi!", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "hi!", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.enable(true);
    boolean var5 = var0.isEnabled();
    boolean var6 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "hi!", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "1 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "hi!", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    java.util.HashMap var1 = crystal.server.GitLogParser.parseLog("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "0 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setChanged(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "2013-08-28T20-44-41.156-0700", "100 ms", 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var6 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setHgPath("10 ms");
    crystal.client.ClientPreferences var9 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var9
    assertTrue("Contract failed: equals-hashcode on var4 and var9", var4.equals(var9) ? var4.hashCode() == var9.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var9 and var4
    assertTrue("Contract failed: equals-hashcode on var9 and var4", var9.equals(var4) ? var9.hashCode() == var4.hashCode() : true);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
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

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setChanged(true);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "hi!", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    long var5 = var4.getRefresh();
    var4.setRefresh(10L);
    var4.setHgPath("0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    java.util.Collection var15 = var4.getProjectPreference();
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
    assertNotNull(var15);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    crystal.client.ConflictDaemon var13 = crystal.client.ConflictDaemon.getInstance();
    var13.removeAllListeners();
    var13.enable(true);
    var13.enable(true);
    var13.enable(true);
    boolean var21 = var13.isEnabled();
    java.util.Collection var22 = var13.getRelationships();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var22);
    boolean var24 = var4.equals((java.lang.Object)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var26 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    java.lang.String var14 = var5.getTempDirectory();
    java.util.Collection var15 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var14.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "1 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    var5.setGitPath("10 ms");
    var5.setRefresh(1L);
    var5.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var14 = var5.hasChanged();
    var5.setChanged(true);
    var5.setHgPath("-1 ms");
    long var19 = var5.getRefresh();
    java.util.Collection var20 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "382707 hours 44 min", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "2013-08-28T20-44-41.156-0700", 10L);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(false);
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getRelationships();
    java.awt.Image var9 = crystal.model.Relationship.getDominant(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "0 ms", "2013-08-28T20-44-41.156-0700", 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getRelationships();
    boolean var6 = var1.isEnabled();
    java.util.Collection var7 = var1.getLocalStates();
    boolean var8 = var1.isEnabled();
    java.util.Collection var9 = var1.getLocalStates();
    java.awt.Image var10 = crystal.model.Relationship.getDominant(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var9);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "-1 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setRefresh(0L);
    java.util.Collection var17 = var4.getProjectPreference();
    var4.setRefresh(0L);
    long var20 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "hi!", "", 10L);
    var4.setTempDirectory("1 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "10 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("100 ms");
    java.lang.String var18 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var18.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "2013-08-28T20-44-41.156-0700", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


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
    java.awt.Image var21 = crystal.model.Relationship.getDominant(var19);
    java.awt.Image var22 = crystal.model.Relationship.getDominant(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "-1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "10 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


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
    var4.setTempDirectory("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "0 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var16 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var12 = var4.getProjectPreference();
    java.awt.Image var13 = crystal.model.Relationship.getDominant(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "-1 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "2013-08-28T20-44-41.156-0700", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "-1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("10 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "-1 ms", "0 ms", 0L);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "382707 hours 44 min", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var14 = var4.getTempDirectory();
    var4.setRefresh(1L);
    var4.setGitPath("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var14.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("-1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    crystal.client.ClientPreferences var11 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var11
    assertTrue("Contract failed: equals-hashcode on var4 and var11", var4.equals(var11) ? var4.hashCode() == var11.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var11 and var4
    assertTrue("Contract failed: equals-hashcode on var11 and var4", var11.equals(var4) ? var11.hashCode() == var4.hashCode() : true);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


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
    java.lang.String var42 = var25.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "-1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


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
    java.lang.String var23 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "10 ms"+ "'", var23.equals("10 ms"));

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("0 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    boolean var2 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "382707 hours 44 min", 0L);
    crystal.client.ClientPreferences var5 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var5
    assertTrue("Contract failed: equals-hashcode on var4 and var5", var4.equals(var5) ? var4.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var4
    assertTrue("Contract failed: equals-hashcode on var5 and var4", var5.equals(var4) ? var5.hashCode() == var4.hashCode() : true);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "382707 hours 44 min", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    long var18 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var20 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    boolean var17 = var4.equals((java.lang.Object)0L);
    crystal.client.ClientPreferences var18 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("10 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    java.util.Collection var2 = var0.getLocalStates();
    java.awt.Image var3 = crystal.model.Relationship.getDominant(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    long var18 = var4.getRefresh();
    java.lang.String var19 = var4.getGitPath();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10 ms"+ "'", var19.equals("10 ms"));

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    org.jdom.Document var9 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var10 = var4.equals((java.lang.Object)var9);
    boolean var12 = crystal.util.XMLTools.writeXMLDocument(var9, "0 ms");
    boolean var14 = crystal.util.XMLTools.writeXMLDocument(var9, "382707 hours 44 min");
    boolean var16 = crystal.util.XMLTools.writeXMLDocument(var9, "-1 ms");
    
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

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "2013-08-28T20-44-41.156-0700", "0 ms", 100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("hi!", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    long var8 = var4.getRefresh();
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getHgPath();
    java.lang.String var12 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var12.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }


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
    crystal.client.ClientPreferences var23 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var23
    assertTrue("Contract failed: equals-hashcode on var4 and var23", var4.equals(var23) ? var4.hashCode() == var23.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var23 and var4
    assertTrue("Contract failed: equals-hashcode on var23 and var4", var23.equals(var4) ? var23.hashCode() == var4.hashCode() : true);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "0 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }


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
    java.util.Collection var30 = var4.getProjectPreference();
    java.lang.String var31 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var31.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    java.lang.String var17 = var4.getTempDirectory();
    java.util.Collection var18 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var20 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    org.jdom.Document var9 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var10 = var4.equals((java.lang.Object)var9);
    boolean var12 = crystal.util.XMLTools.writeXMLDocument(var9, "0 ms");
    boolean var14 = crystal.util.XMLTools.writeXMLDocument(var9, "-1 ms");
    boolean var16 = crystal.util.XMLTools.writeXMLDocument(var9, "10 ms");
    boolean var18 = crystal.util.XMLTools.writeXMLDocument(var9, "2013-08-28T20-44-41.156-0700");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("1 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    long var18 = var4.getRefresh();
    crystal.client.ClientPreferences var23 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var23.setGitPath("10 ms");
    var23.setTempDirectory("");
    var23.setChanged(true);
    var23.setRefresh(100L);
    java.lang.String var32 = var23.getTempDirectory();
    java.util.Collection var33 = var23.getProjectPreference();
    boolean var34 = var4.equals((java.lang.Object)var33);
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setRefresh(100L);
    crystal.client.ClientPreferences var17 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var17
    assertTrue("Contract failed: equals-hashcode on var4 and var17", var4.equals(var17) ? var4.hashCode() == var17.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var17 and var4
    assertTrue("Contract failed: equals-hashcode on var17 and var4", var17.equals(var4) ? var17.hashCode() == var4.hashCode() : true);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "10 ms", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("100 ms");
    java.lang.String var18 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10 ms"+ "'", var18.equals("10 ms"));

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var12 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var6 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "2013-08-28T20-44-41.156-0700", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var10 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var17 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var17.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "2013-08-28T20-44-41.156-0700", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }


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
    crystal.client.ClientPreferences var20 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var20
    assertTrue("Contract failed: equals-hashcode on var4 and var20", var4.equals(var20) ? var4.hashCode() == var20.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var20 and var4
    assertTrue("Contract failed: equals-hashcode on var20 and var4", var20.equals(var4) ? var20.hashCode() == var4.hashCode() : true);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getRelationships();
    java.util.Collection var6 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var6);
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

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }


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
    java.util.Collection var19 = var4.getProjectPreference();
    crystal.client.ClientPreferences var20 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var20
    assertTrue("Contract failed: equals-hashcode on var4 and var20", var4.equals(var20) ? var4.hashCode() == var20.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var20 and var4
    assertTrue("Contract failed: equals-hashcode on var20 and var4", var20.equals(var4) ? var20.hashCode() == var4.hashCode() : true);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    long var12 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.lang.String var15 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10 ms"+ "'", var15.equals("10 ms"));

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("", "100 ms");
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }


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
    crystal.client.ClientPreferences var30 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var30
    assertTrue("Contract failed: equals-hashcode on var4 and var30", var4.equals(var30) ? var4.hashCode() == var30.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var30 and var4
    assertTrue("Contract failed: equals-hashcode on var30 and var4", var30.equals(var4) ? var30.hashCode() == var4.hashCode() : true);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    var4.setHgPath("10 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
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

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var16 = var4.hasChanged();
    java.util.Collection var17 = var4.getProjectPreference();
    var4.setHgPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    crystal.client.ClientPreferences var18 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var18.setGitPath("10 ms");
    var18.setTempDirectory("");
    var18.setChanged(true);
    var18.setRefresh(100L);
    java.util.Collection var27 = var18.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var18);
    boolean var29 = var4.equals((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "382707 hours 44 min", "382707 hours 44 min", 0L);
    long var5 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "10 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    boolean var11 = var4.hasChanged();
    crystal.client.ClientPreferences var12 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var12
    assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var12 and var4
    assertTrue("Contract failed: equals-hashcode on var12 and var4", var12.equals(var4) ? var12.hashCode() == var4.hashCode() : true);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "2013-08-28T20-44-41.156-0700", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    java.util.Collection var7 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test368"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "10 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test369"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test370"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getRelationships();
    java.awt.Image var5 = crystal.model.Relationship.getDominant(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test371"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    java.util.Collection var5 = var1.getRelationships();
    boolean var6 = var1.isEnabled();
    java.util.Collection var7 = var1.getLocalStates();
    java.awt.Image var8 = crystal.model.Relationship.getDominant(var7);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test372"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test373"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test374"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    boolean var9 = var4.hasChanged();
    java.lang.String var10 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10 ms"+ "'", var10.equals("10 ms"));

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test375"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "100 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test376"); }


    crystal.util.ValidInputChecker.checkValidStringInput("1 ms");

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test377"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "-1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test378"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    org.jdom.Document var9 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var10 = var4.equals((java.lang.Object)var9);
    java.util.Collection var11 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test379"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "0 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test380"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test381"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test382"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    long var14 = var5.getRefresh();
    java.util.Collection var15 = var5.getProjectPreference();
    crystal.client.ClientPreferences var20 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var20.setGitPath("10 ms");
    var20.setTempDirectory("");
    var20.setChanged(true);
    var20.setRefresh(100L);
    boolean var29 = var5.equals((java.lang.Object)100L);
    java.util.Collection var30 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test383"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test384"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "hi!", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test385"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "382707 hours 44 min", "100 ms", 1L);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test386"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "100 ms", "10 ms", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test387"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("382707 hours 44 min", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test388"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setChanged(false);
    crystal.client.ClientPreferences var16 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var16
    assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var16 and var4
    assertTrue("Contract failed: equals-hashcode on var16 and var4", var16.equals(var4) ? var16.hashCode() == var4.hashCode() : true);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test389"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test390"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test391"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getGitPath();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test392"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "2013-08-28T20-44-41.156-0700", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test393"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test394"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test395"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test396"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
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

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test397"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var33);
    
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

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test398"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("", var2, "1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test399"); }


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
    var4.setGitPath("382707 hours 44 min");
    
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

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test400"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setRefresh((-1L));
    long var9 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1L));

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test401"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "-1 ms", "-1 ms", 1L);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test402"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test403"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "0 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test404"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test405"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test406"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "-1 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test407"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    var4.setTempDirectory("382707 hours 44 min");

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test408"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var22 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test409"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "100 ms", "0 ms", 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test410"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test411"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "382707 hours 44 min", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test412"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "10 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test413"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "2013-08-28T20-44-41.156-0700", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test414"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "382707 hours 44 min", "2013-08-28T20-44-41.156-0700", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test415"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    crystal.client.ClientPreferences var19 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var19
    assertTrue("Contract failed: equals-hashcode on var4 and var19", var4.equals(var19) ? var4.hashCode() == var19.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var19 and var4
    assertTrue("Contract failed: equals-hashcode on var19 and var4", var19.equals(var4) ? var19.hashCode() == var4.hashCode() : true);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test416"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test417"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("10 ms");
    long var17 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test418"); }


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
    boolean var26 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test419"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var10 = var4.getGitPath();
    crystal.client.ClientPreferences var15 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var15.setRefresh(0L);
    crystal.client.ClientPreferences var22 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var22.setGitPath("10 ms");
    var22.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var22);
    crystal.client.ClientPreferences.savePreferencesToXML(var22, "10 ms");
    boolean var30 = var15.equals((java.lang.Object)var22);
    var22.setGitPath("1 ms");
    java.lang.String var33 = var22.getTempDirectory();
    boolean var34 = var4.equals((java.lang.Object)var33);
    
    // Checks the contract:  equals-hashcode on var4 and var22
    assertTrue("Contract failed: equals-hashcode on var4 and var22", var4.equals(var22) ? var4.hashCode() == var22.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var22 and var4
    assertTrue("Contract failed: equals-hashcode on var22 and var4", var22.equals(var4) ? var22.hashCode() == var4.hashCode() : true);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test420"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    boolean var6 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test421"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
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

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test422"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test423"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test424"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test425"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setHgPath("382707 hours 44 min");
    var4.setChanged(false);
    java.lang.String var18 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var18.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test426"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test427"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "1 ms", "10 ms", 100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test428"); }


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
    var4.setTempDirectory("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test429"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test430"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getHgPath();
    java.lang.String var15 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("hi!");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test431"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setHgPath("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test432"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test433"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test434"); }


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
    var4.setTempDirectory("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test435"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test436"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "hi!", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test437"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "382707 hours 44 min", "382707 hours 44 min", 0L);
    var4.setHgPath("hi!");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test438"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "10 ms", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test439"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var39 = var23.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
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

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test440"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "0 ms", "2013-08-28T20-44-41.156-0700", 100L);
    java.util.Collection var5 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test441"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "-1 ms", "-1 ms", 0L);
    long var5 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test442"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    java.lang.String var18 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var20 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test443"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    crystal.client.ClientPreferences var11 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var11
    assertTrue("Contract failed: equals-hashcode on var4 and var11", var4.equals(var11) ? var4.hashCode() == var11.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var11 and var4
    assertTrue("Contract failed: equals-hashcode on var11 and var4", var11.equals(var4) ? var11.hashCode() == var4.hashCode() : true);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test444"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test445"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    boolean var4 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test446"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test447"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test448"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test449"); }


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
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test450"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test451"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    boolean var11 = var4.hasChanged();
    var4.setGitPath("382707 hours 44 min");
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setTempDirectory("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test452"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("382707 hours 44 min");
    java.lang.String var18 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test453"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    long var14 = var5.getRefresh();
    java.util.Collection var15 = var5.getProjectPreference();
    crystal.client.ClientPreferences var20 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var20.setGitPath("10 ms");
    var20.setTempDirectory("");
    var20.setChanged(true);
    var20.setRefresh(100L);
    boolean var29 = var5.equals((java.lang.Object)100L);
    java.util.Collection var30 = var5.getProjectPreference();
    java.util.Collection var31 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test454"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var14 = var4.getTempDirectory();
    var4.setRefresh(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var18 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var14.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test455"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test456"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("10 ms");
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

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test457"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("0 ms");
    long var13 = var4.getRefresh();
    var4.setTempDirectory("1 ms");
    java.util.Collection var16 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test458"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    var4.setChanged(true);
    java.lang.String var9 = var4.getHgPath();
    var4.setChanged(false);
    java.util.Collection var12 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test459"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test460"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("-1 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test461"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getGitPath();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    boolean var13 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test462"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setGitPath("1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var17 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test463"); }


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
    var0.enable(false);
    
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

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test464"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    crystal.client.ConflictDaemon var13 = crystal.client.ConflictDaemon.getInstance();
    var13.removeAllListeners();
    var13.enable(true);
    var13.enable(true);
    var13.enable(true);
    boolean var21 = var13.isEnabled();
    java.util.Collection var22 = var13.getRelationships();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var22);
    boolean var24 = var4.equals((java.lang.Object)var22);
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test465"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test466"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "0 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test467"); }


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
    boolean var32 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test468"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    var4.setRefresh(10L);
    boolean var20 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test469"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test470"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "10 ms", "382707 hours 44 min", 100L);
    var4.setGitPath("");
    java.util.Collection var7 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test471"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var7 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test472"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    java.util.Collection var2 = var0.getRelationships();
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    java.util.Collection var5 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test473"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("382707 hours 44 min", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test474"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getRelationships();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test475"); }


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
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ConflictDaemon var28 = crystal.client.ConflictDaemon.getInstance();
    var28.enable(true);
    var28.removeAllListeners();
    boolean var32 = var28.isEnabled();
    var28.removeAllListeners();
    boolean var34 = var4.equals((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test476"); }


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
    long var20 = var4.getRefresh();
    crystal.client.ClientPreferences var21 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var21
    assertTrue("Contract failed: equals-hashcode on var4 and var21", var4.equals(var21) ? var4.hashCode() == var21.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var21 and var4
    assertTrue("Contract failed: equals-hashcode on var21 and var4", var21.equals(var4) ? var21.hashCode() == var4.hashCode() : true);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test477"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "100 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test478"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "-1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test479"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setRefresh(100L);
    crystal.client.ClientPreferences var18 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test480"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    crystal.client.ClientPreferences var18 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var18.setGitPath("10 ms");
    var18.setTempDirectory("");
    var18.setChanged(true);
    var18.setRefresh(100L);
    java.lang.String var27 = var18.getTempDirectory();
    boolean var29 = var18.equals((java.lang.Object)(byte)10);
    java.lang.String var30 = var18.getTempDirectory();
    crystal.client.ClientPreferences var35 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var35.setChanged(true);
    var35.setGitPath("10 ms");
    var35.setRefresh(1L);
    var35.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var44 = var35.getHgPath();
    var35.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var35, "382707 hours 44 min");
    long var49 = var35.getRefresh();
    boolean var50 = var18.equals((java.lang.Object)var35);
    boolean var51 = var4.equals((java.lang.Object)var50);
    
    // Checks the contract:  equals-hashcode on var4 and var35
    assertTrue("Contract failed: equals-hashcode on var4 and var35", var4.equals(var35) ? var4.hashCode() == var35.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var35 and var4
    assertTrue("Contract failed: equals-hashcode on var35 and var4", var35.equals(var4) ? var35.hashCode() == var4.hashCode() : true);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test481"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var6 = var5.getRefresh();
    java.lang.String var7 = var5.getTempDirectory();
    var5.setGitPath("hi!");
    var5.setHgPath("100 ms");
    java.util.Collection var12 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var7.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test482"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "100 ms", "0 ms", 0L);
    java.lang.String var5 = var4.getGitPath();
    crystal.client.ClientPreferences var6 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var6
    assertTrue("Contract failed: equals-hashcode on var4 and var6", var4.equals(var6) ? var4.hashCode() == var6.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var6 and var4
    assertTrue("Contract failed: equals-hashcode on var6 and var4", var6.equals(var4) ? var6.hashCode() == var4.hashCode() : true);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test483"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "1 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test484"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("10 ms", "2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test485"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "10 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test486"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test487"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("-1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test488"); }


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
    boolean var32 = var4.hasChanged();
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test489"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test490"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "hi!", "-1 ms", 10L);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test491"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test492"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    boolean var11 = var4.hasChanged();
    var4.setGitPath("382707 hours 44 min");
    java.util.Collection var14 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
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
    assertNotNull(var14);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test493"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
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

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test494"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "hi!", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test495"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "382707 hours 44 min", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test496"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("1 ms");
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

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test497"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "2013-08-28T20-44-41.156-0700", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test498"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test499"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("10 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test500"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("100 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

}
