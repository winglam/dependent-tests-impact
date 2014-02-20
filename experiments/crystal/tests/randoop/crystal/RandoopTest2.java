package randoop.crystal;

import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "10 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test2"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(0L);
    java.lang.String var33 = var4.getHgPath();
    crystal.client.ClientPreferences var34 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var34
    assertTrue("Contract failed: equals-hashcode on var4 and var34", var4.equals(var34) ? var4.hashCode() == var34.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var34 and var4
    assertTrue("Contract failed: equals-hashcode on var34 and var4", var34.equals(var4) ? var34.hashCode() == var4.hashCode() : true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test3"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
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

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test4"); }


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
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test5"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(10L);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test6"); }


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
    long var27 = var15.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 100L);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test7"); }


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
    java.lang.String var21 = var4.getGitPath();
    
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
    assertTrue("'" + var21 + "' != '" + "10 ms"+ "'", var21.equals("10 ms"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test8"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
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

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "-1 ms", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test10"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    boolean var11 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var13 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test11"); }


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
    var21.setGitPath("0 ms");
    
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

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test12"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    boolean var2 = var0.isEnabled();
    boolean var3 = var0.isEnabled();
    boolean var4 = var0.isEnabled();
    boolean var5 = var0.isEnabled();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test13"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getRelationships();
    var0.enable(false);
    
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

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test15"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    crystal.client.ClientPreferences var17 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var17
    assertTrue("Contract failed: equals-hashcode on var4 and var17", var4.equals(var17) ? var4.hashCode() == var17.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var17 and var4
    assertTrue("Contract failed: equals-hashcode on var17 and var4", var17.equals(var4) ? var17.hashCode() == var4.hashCode() : true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test16"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "-1 ms", "2013-08-28T20-44-41.156-0700", 1L);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test17"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(10L);
    java.lang.String var14 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test18"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    var4.setChanged(true);
    java.lang.String var9 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "hi!", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test20"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "-1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test21"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    long var14 = var5.getRefresh();
    var5.setChanged(false);
    var5.setChanged(false);
    long var19 = var5.getRefresh();
    var5.setGitPath("10 ms");
    java.util.Collection var22 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "100 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "10 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test24"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var11 = var4.getHgPath();
    var4.setChanged(false);
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setRefresh(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test25"); }


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
    crystal.client.ClientPreferences.savePreferencesToXML(var18, "100 ms");
    
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

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test26"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
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

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test28"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences var20 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var20
    assertTrue("Contract failed: equals-hashcode on var4 and var20", var4.equals(var20) ? var4.hashCode() == var20.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var20 and var4
    assertTrue("Contract failed: equals-hashcode on var20 and var4", var20.equals(var4) ? var20.hashCode() == var4.hashCode() : true);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test29"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    boolean var17 = var4.equals((java.lang.Object)0L);
    var4.setTempDirectory("hi!");
    crystal.client.ClientPreferences var20 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var20
    assertTrue("Contract failed: equals-hashcode on var4 and var20", var4.equals(var20) ? var4.hashCode() == var20.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var20 and var4
    assertTrue("Contract failed: equals-hashcode on var20 and var4", var20.equals(var4) ? var20.hashCode() == var4.hashCode() : true);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test30"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setChanged(false);
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

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test31"); }


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
    var4.setRefresh(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10 ms"+ "'", var19.equals("10 ms"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test32"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test33"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var11 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var11.setGitPath("10 ms");
    var11.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var11);
    crystal.client.ClientPreferences.savePreferencesToXML(var11, "10 ms");
    boolean var19 = var4.equals((java.lang.Object)var11);
    var11.setGitPath("1 ms");
    java.lang.String var22 = var11.getTempDirectory();
    java.lang.String var23 = var11.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "1 ms"+ "'", var23.equals("1 ms"));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test34"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "2013-08-28T20-44-41.156-0700", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test35"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var10 = var4.hasChanged();
    long var11 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10L);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test36"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var6 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test37"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getGitPath();
    var4.setGitPath("hi!");
    var4.setHgPath("0 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test38"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test39"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test40"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    boolean var9 = var4.hasChanged();
    long var10 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10L);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test41"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "hi!", "hi!", 1L);
    java.lang.String var5 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test42"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    boolean var7 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var9 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "382707 hours 44 min"+ "'", var6.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test43"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    boolean var5 = var0.isEnabled();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test44"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test45"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    java.util.Collection var5 = var4.getProjectPreference();
    boolean var6 = var4.hasChanged();
    java.util.Collection var7 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test46"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "382707 hours 44 min", "0 ms", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test47"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test48"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setRefresh(0L);
    var4.setChanged(true);
    java.lang.String var13 = var4.getTempDirectory();
    var4.setChanged(false);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test49"); }


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
    java.awt.Image var32 = crystal.model.Relationship.getDominant(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var31);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test50"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "-1 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test51"); }


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
    boolean var22 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test52"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "-1 ms", "-1 ms", 0L);
    java.lang.String var5 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-1 ms"+ "'", var5.equals("-1 ms"));

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test53"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var23);
    
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

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test54"); }


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
    assertNotNull(var14);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test55"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test56"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var18 = var4.getRefresh();
    var4.setRefresh(0L);
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test57"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    java.lang.String var7 = var4.getGitPath();
    var4.setTempDirectory("hi!");
    boolean var10 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test58"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("100 ms", "hi!", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test59"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    boolean var6 = var0.isEnabled();
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getRelationships();
    java.awt.Image var9 = crystal.model.Relationship.getDominant(var8);
    
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
    assertNull(var9);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test60"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test61"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test62"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    java.util.Collection var12 = var4.getProjectPreference();
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences var15 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var15
    assertTrue("Contract failed: equals-hashcode on var4 and var15", var4.equals(var15) ? var4.hashCode() == var15.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var15 and var4
    assertTrue("Contract failed: equals-hashcode on var15 and var4", var15.equals(var4) ? var15.hashCode() == var4.hashCode() : true);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test63"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    long var11 = var4.getRefresh();
    java.lang.String var12 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test64"); }


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
    var21.setChanged(true);
    
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

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test65"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "100 ms", "", 1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test66"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "hi!", "2013-08-28T20-44-41.156-0700", 1L);
    java.lang.String var5 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var7 = var4.getProjectPreferences("hi!");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100 ms"+ "'", var5.equals("100 ms"));

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test67"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences var13 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var13.setRefresh((-1L));
    var13.setHgPath("-1 ms");
    boolean var18 = var13.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(var13, "-1 ms");
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    boolean var26 = var13.equals((java.lang.Object)0L);
    boolean var27 = var4.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test68"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
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

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test69"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var22 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "10 ms"+ "'", var22.equals("10 ms"));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test70"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "1 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test71"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test72"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    java.lang.String var8 = var4.getTempDirectory();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100 ms"+ "'", var8.equals("100 ms"));

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test73"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "382707 hours 44 min", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test74"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    boolean var7 = var4.hasChanged();
    boolean var8 = var4.hasChanged();
    java.lang.String var9 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var9.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test75"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    long var8 = var4.getRefresh();
    var4.setRefresh(1L);
    crystal.client.ClientPreferences var11 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var11
    assertTrue("Contract failed: equals-hashcode on var4 and var11", var4.equals(var11) ? var4.hashCode() == var11.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var11 and var4
    assertTrue("Contract failed: equals-hashcode on var11 and var4", var11.equals(var4) ? var11.hashCode() == var4.hashCode() : true);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test76"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    var4.setChanged(false);
    java.lang.String var12 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100 ms"+ "'", var12.equals("100 ms"));

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test77"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test78"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.lang.String var15 = var4.getGitPath();
    var4.setTempDirectory("382707 hours 44 min");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("hi!");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10 ms"+ "'", var15.equals("10 ms"));

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test79"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    var0.removeAllListeners();
    boolean var9 = var0.isEnabled();
    boolean var10 = var0.isEnabled();
    
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
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test80"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    crystal.client.ClientPreferences var12 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var12.setGitPath("10 ms");
    var12.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var12, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var12, "2013-08-28T20-44-41.156-0700");
    long var21 = var12.getRefresh();
    var12.setChanged(false);
    var12.setChanged(false);
    long var26 = var12.getRefresh();
    var12.setGitPath("10 ms");
    java.util.Collection var29 = var12.getProjectPreference();
    boolean var30 = var4.equals((java.lang.Object)var29);
    java.lang.String var31 = var4.getHgPath();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test81"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "1 ms", "2013-08-28T20-44-41.156-0700", 10L);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test82"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test83"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setTempDirectory("");
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test84"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "1 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test85"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    java.util.Collection var5 = var4.getProjectPreference();
    boolean var6 = var4.hasChanged();
    var4.setGitPath("100 ms");
    crystal.client.ClientPreferences var9 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var9
    assertTrue("Contract failed: equals-hashcode on var4 and var9", var4.equals(var9) ? var4.hashCode() == var9.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var9 and var4
    assertTrue("Contract failed: equals-hashcode on var9 and var4", var9.equals(var4) ? var9.hashCode() == var4.hashCode() : true);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test86"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    boolean var4 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test87"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getLocalStates();
    var0.enable(true);
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
    assertNotNull(var9);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test88"); }


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
    java.lang.String var27 = var15.getHgPath();
    crystal.client.ClientPreferences var32 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var32.setGitPath("10 ms");
    var32.setTempDirectory("");
    var32.setChanged(true);
    var32.setRefresh(100L);
    java.lang.String var41 = var32.getTempDirectory();
    java.lang.String var42 = var32.getGitPath();
    var32.setChanged(true);
    java.util.Collection var45 = var32.getProjectPreference();
    java.util.Collection var46 = var32.getProjectPreference();
    boolean var47 = var15.equals((java.lang.Object)var46);
    
    // Checks the contract:  equals-hashcode on var15 and var32
    assertTrue("Contract failed: equals-hashcode on var15 and var32", var15.equals(var32) ? var15.hashCode() == var32.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var32 and var15
    assertTrue("Contract failed: equals-hashcode on var32 and var15", var32.equals(var15) ? var32.hashCode() == var15.hashCode() : true);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "hi!", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test90"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test91"); }


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
    boolean var11 = var0.isEnabled();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test92"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "0 ms", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test93"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setGitPath("hi!");
    var4.setGitPath("382707 hours 44 min");

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test94"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test95"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "2013-08-28T20-44-41.156-0700", 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var6 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test96"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    crystal.client.ConflictDaemon var6 = crystal.client.ConflictDaemon.getInstance();
    var6.removeAllListeners();
    java.util.Collection var8 = var6.getRelationships();
    java.util.Collection var9 = var6.getLocalStates();
    boolean var10 = var6.isEnabled();
    boolean var11 = var4.equals((java.lang.Object)var10);
    var4.setTempDirectory("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test97"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getRelationships();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test98"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var11 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var11.setGitPath("10 ms");
    var11.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var11);
    crystal.client.ClientPreferences.savePreferencesToXML(var11, "10 ms");
    boolean var19 = var4.equals((java.lang.Object)var11);
    var11.setGitPath("1 ms");
    java.lang.String var22 = var11.getTempDirectory();
    java.lang.String var23 = var11.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test99"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "10 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test100"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test101"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var14 = var5.getProjectPreference();
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

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test102"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var5, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var14 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test103"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    var1.enable(true);
    java.util.Collection var7 = var1.getRelationships();
    java.awt.Image var8 = crystal.model.Relationship.getDominant(var7);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test104"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "-1 ms", "1 ms", 1L);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test105"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "-1 ms", "100 ms", 10L);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test106"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "hi!", "-1 ms", 1L);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test107"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test108"); }


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
    crystal.client.ClientPreferences var25 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var25.setGitPath("10 ms");
    var25.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var25, "2013-08-28T20-44-41.156-0700");
    var25.setChanged(true);
    java.util.Collection var34 = var25.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var25);
    boolean var36 = var4.equals((java.lang.Object)var25);
    
    // Checks the contract:  equals-hashcode on var4 and var25
    assertTrue("Contract failed: equals-hashcode on var4 and var25", var4.equals(var25) ? var4.hashCode() == var25.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var25 and var4
    assertTrue("Contract failed: equals-hashcode on var25 and var4", var25.equals(var4) ? var25.hashCode() == var4.hashCode() : true);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test109"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
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

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test110"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("382707 hours 44 min");
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

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test111"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var22 = var4.getProjectPreferences("100 ms");
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

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test112"); }


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
    java.lang.String var32 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test113"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "1 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test114"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("10 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test115"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "0 ms", "10 ms", 10L);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test116"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
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

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test117"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
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

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test118"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    boolean var6 = var0.isEnabled();
    var0.enable(false);
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test119"); }


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
    java.lang.String var22 = var4.getTempDirectory();
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var22.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test120"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
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

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test121"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("382707 hours 44 min", var2, "382707 hours 44 min", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test122"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var5);
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

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test123"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "-1 ms");
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

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test124"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    java.lang.String var7 = var4.getHgPath();
    long var8 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "382707 hours 44 min"+ "'", var6.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100 ms"+ "'", var7.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100L);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test125"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "-1 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test126"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "-1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test127"); }


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
    crystal.client.ClientPreferences var31 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var31.setGitPath("10 ms");
    var31.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var31, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var31, "2013-08-28T20-44-41.156-0700");
    long var40 = var31.getRefresh();
    var31.setChanged(false);
    var31.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToXML(var31, "0 ms");
    var31.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToXML(var31, "382707 hours 44 min");
    boolean var51 = var4.equals((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test128"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test129"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    var0.enable(true);
    java.util.Collection var7 = var0.getLocalStates();
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

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test130"); }


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
    long var38 = var23.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var23, "382707 hours 44 min");
    
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
    assertTrue(var38 == 100L);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test131"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "1 ms", "0 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test132"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "10 ms", "0 ms", 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var6 = var4.getProjectPreferences("1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test133"); }


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
    crystal.client.ClientPreferences var26 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var26
    assertTrue("Contract failed: equals-hashcode on var4 and var26", var4.equals(var26) ? var4.hashCode() == var26.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var26 and var4
    assertTrue("Contract failed: equals-hashcode on var26 and var4", var26.equals(var4) ? var26.hashCode() == var4.hashCode() : true);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test134"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "10 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test135"); }


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
    long var29 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 100L);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test136"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test137"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    var4.setChanged(true);
    java.lang.String var9 = var4.getHgPath();
    var4.setChanged(false);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setTempDirectory("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test138"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    var5.setGitPath("10 ms");
    java.util.Collection var10 = var5.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test139"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "382707 hours 44 min", "2013-08-28T20-44-41.156-0700", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test140"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "1 ms", "", 0L);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test141"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "0 ms", "hi!", 0L);
    var4.setHgPath("hi!");

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test142"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getLocalStates();
    boolean var6 = var0.isEnabled();
    boolean var7 = var0.isEnabled();
    
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

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test143"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test144"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    long var7 = var4.getRefresh();
    java.lang.String var8 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test145"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "100 ms", "0 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test146"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var10 = var4.getGitPath();
    java.util.Collection var11 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var13 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10 ms"+ "'", var10.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test147"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "2013-08-28T20-44-41.156-0700", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test148"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    long var14 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var17 = var4.getRefresh();
    var4.setRefresh(0L);
    var4.setTempDirectory("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test149"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    java.lang.String var7 = var4.getTempDirectory();
    long var8 = var4.getRefresh();
    var4.setRefresh(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var7.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10L);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test150"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    long var9 = var4.getRefresh();
    java.lang.String var10 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test151"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    java.awt.Image var4 = crystal.model.Relationship.getDominant(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test152"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setTempDirectory("0 ms");
    var4.setTempDirectory("1 ms");
    java.util.Collection var15 = var4.getProjectPreference();
    java.lang.String var16 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "1 ms"+ "'", var16.equals("1 ms"));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test153"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "10 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test154"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "382707 hours 44 min", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test155"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "2013-08-28T20-44-41.156-0700", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test156"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test157"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    long var16 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test158"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    long var17 = var4.getRefresh();
    crystal.client.ClientPreferences var22 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var22.setChanged(true);
    var22.setGitPath("10 ms");
    var22.setRefresh(1L);
    var22.setHgPath("2013-08-28T20-44-41.156-0700");
    long var31 = var22.getRefresh();
    boolean var32 = var4.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test159"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test160"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    var4.setHgPath("0 ms");
    java.lang.String var16 = var4.getTempDirectory();
    java.util.Collection var17 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test161"); }


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
    var4.setTempDirectory("-1 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test162"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test163"); }


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
    boolean var31 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test164"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test165"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test166"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test167"); }


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
    java.awt.Image var32 = crystal.model.Relationship.getDominant(var31);
    
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
    assertNull(var32);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test168"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test169"); }


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
    var4.setGitPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test170"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "2013-08-28T20-44-41.156-0700", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test171"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "-1 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test172"); }


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
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test173"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "hi!", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test174"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(1L);
    long var19 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1L);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test175"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "382707 hours 44 min", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test176"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    java.lang.String var11 = var5.getGitPath();
    java.util.Collection var12 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test177"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getGitPath();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var17 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test178"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var7 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var7);
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

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test179"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "hi!", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test180"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    boolean var9 = var4.hasChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var11 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test181"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    var4.setHgPath("hi!");
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

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test182"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("10 ms");
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setChanged(true);
    var16.setGitPath("10 ms");
    var16.setRefresh(1L);
    var16.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var25 = var16.getHgPath();
    var16.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToXML(var16, "382707 hours 44 min");
    boolean var30 = var4.equals((java.lang.Object)"382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var25.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test183"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "10 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test184"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "hi!", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test185"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "-1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test186"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "hi!");
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

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test187"); }


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
    boolean var20 = var4.hasChanged();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test188"); }


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
    java.awt.Image var19 = crystal.model.Relationship.getDominant(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test189"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "0 ms", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test190"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    java.lang.String var15 = var5.getGitPath();
    var5.setChanged(true);
    java.util.Collection var18 = var5.getProjectPreference();
    java.util.Collection var19 = var5.getProjectPreference();
    java.awt.Image var20 = crystal.model.Relationship.getDominant(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10 ms"+ "'", var15.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test191"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("100 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
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

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test192"); }


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
    crystal.client.ClientPreferences var23 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var23
    assertTrue("Contract failed: equals-hashcode on var4 and var23", var4.equals(var23) ? var4.hashCode() == var23.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var23 and var4
    assertTrue("Contract failed: equals-hashcode on var23 and var4", var23.equals(var4) ? var23.hashCode() == var4.hashCode() : true);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test193"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    java.lang.String var7 = var4.getGitPath();
    var4.setTempDirectory("hi!");
    java.lang.String var10 = var4.getTempDirectory();
    var4.setChanged(false);
    crystal.client.ClientPreferences var13 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var13
    assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var13 and var4
    assertTrue("Contract failed: equals-hashcode on var13 and var4", var13.equals(var4) ? var13.hashCode() == var4.hashCode() : true);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test194"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "1 ms", "hi!", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test195"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var5.setRefresh((-1L));
    var5.setTempDirectory("0 ms");
    java.util.Collection var10 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test196"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setTempDirectory("10 ms");
    var4.setChanged(true);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test197"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "hi!", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test198"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    var1.removeAllListeners();
    var1.enable(false);
    var1.enable(false);
    java.util.Collection var9 = var1.getLocalStates();
    java.awt.Image var10 = crystal.model.Relationship.getDominant(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("1 ms", var9);
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test199"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test200"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "-1 ms", "10 ms", 100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test201"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var5 = var0.isEnabled();
    java.util.Collection var6 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test202"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test203"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test204"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    java.util.Collection var15 = var5.getProjectPreference();
    var5.setGitPath("100 ms");
    java.util.Collection var18 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test205"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test206"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getGitPath();
    var4.setHgPath("");
    java.lang.String var16 = var4.getTempDirectory();
    crystal.client.ClientPreferences var17 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var17
    assertTrue("Contract failed: equals-hashcode on var4 and var17", var4.equals(var17) ? var4.hashCode() == var17.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var17 and var4
    assertTrue("Contract failed: equals-hashcode on var17 and var4", var17.equals(var4) ? var17.hashCode() == var4.hashCode() : true);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test207"); }


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
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test208"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("382707 hours 44 min", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test209"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "hi!", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test210"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
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

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test211"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(false);
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    var0.enable(false);
    java.util.Collection var10 = var0.getRelationships();
    var0.removeAllListeners();
    
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
    assertNotNull(var10);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test212"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "0 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test213"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getLocalStates();
    java.util.Collection var7 = var0.getLocalStates();
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

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test214"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test215"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setTempDirectory("");
    var4.setTempDirectory("1 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var10 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test216"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "2013-08-28T20-44-41.156-0700", 10L);
    java.lang.String var5 = var4.getHgPath();
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences var8 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var8
    assertTrue("Contract failed: equals-hashcode on var4 and var8", var4.equals(var8) ? var4.hashCode() == var8.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var8 and var4
    assertTrue("Contract failed: equals-hashcode on var8 and var4", var8.equals(var4) ? var8.hashCode() == var4.hashCode() : true);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test217"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var16 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test218"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.util.Collection var8 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test219"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "10 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test220"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    java.util.Collection var5 = var1.getRelationships();
    boolean var6 = var1.isEnabled();
    java.util.Collection var7 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var7);
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

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test221"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("382707 hours 44 min", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test222"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("hi!", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test223"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setHgPath("10 ms");
    long var9 = var4.getRefresh();
    crystal.client.ClientPreferences var10 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var10
    assertTrue("Contract failed: equals-hashcode on var4 and var10", var4.equals(var10) ? var4.hashCode() == var10.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var10 and var4
    assertTrue("Contract failed: equals-hashcode on var10 and var4", var10.equals(var4) ? var10.hashCode() == var4.hashCode() : true);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test224"); }


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
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test225"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "1 ms", "2013-08-28T20-44-41.156-0700", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test226"); }


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
    var4.setHgPath("0 ms");
    
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

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test227"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test228"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    var4.setHgPath("382707 hours 44 min");
    var4.setHgPath("1 ms");

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test229"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    var4.setTempDirectory("hi!");
    java.lang.String var15 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10 ms"+ "'", var15.equals("10 ms"));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test230"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    java.lang.String var17 = var4.getGitPath();
    java.lang.String var18 = var4.getTempDirectory();
    boolean var19 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10 ms"+ "'", var17.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test231"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    long var16 = var4.getRefresh();
    crystal.client.ClientPreferences var17 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var17
    assertTrue("Contract failed: equals-hashcode on var4 and var17", var4.equals(var17) ? var4.hashCode() == var17.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var17 and var4
    assertTrue("Contract failed: equals-hashcode on var17 and var4", var17.equals(var4) ? var17.hashCode() == var4.hashCode() : true);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test232"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "382707 hours 44 min", "382707 hours 44 min", 0L);
    boolean var5 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test233"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    var4.setHgPath("10 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test234"); }


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
    boolean var20 = var4.hasChanged();
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test235"); }


    org.jdom.Document var0 = crystal.util.XMLTools.newXMLDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = crystal.util.XMLTools.writeXMLDocument(var0, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test236"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    var1.removeAllListeners();
    java.util.Collection var6 = var1.getRelationships();
    java.util.Collection var7 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test237"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    long var8 = var4.getRefresh();
    var4.setHgPath("1 ms");
    var4.setRefresh(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1L));

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test238"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test239"); }


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
    java.lang.String var25 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var25.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test240"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    java.lang.String var7 = var4.getTempDirectory();
    var4.setChanged(true);
    java.lang.String var10 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var7.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test241"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("0 ms", var2, "382707 hours 44 min", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test242"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    java.util.Collection var14 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test243"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    java.util.Collection var7 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test244"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test245"); }


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
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test246"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var21 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10 ms"+ "'", var19.equals("10 ms"));

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test247"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    crystal.client.ClientPreferences var11 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var11.setGitPath("10 ms");
    var11.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var11);
    crystal.client.ClientPreferences.savePreferencesToXML(var11, "10 ms");
    boolean var19 = var4.equals((java.lang.Object)var11);
    var11.setGitPath("1 ms");
    long var22 = var11.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10L);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test248"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test249"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.lang.String var8 = var4.getGitPath();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    boolean var11 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test250"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    var4.setHgPath("10 ms");
    var4.setRefresh(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test251"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh((-1L));
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var19 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10 ms"+ "'", var19.equals("10 ms"));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test252"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(0L);
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test253"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test254"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    java.util.Collection var15 = var5.getProjectPreference();
    java.util.Collection var16 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("1 ms", var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test255"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "382707 hours 44 min", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test256"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    var4.setTempDirectory("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test257"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test258"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var5);
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

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test259"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "0 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test260"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test261"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    var0.enable(false);
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var10 = var0.getRelationships();
    java.awt.Image var11 = crystal.model.Relationship.getDominant(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test262"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    boolean var11 = var4.hasChanged();
    crystal.client.ClientPreferences var12 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var12
    assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var12 and var4
    assertTrue("Contract failed: equals-hashcode on var12 and var4", var12.equals(var4) ? var12.hashCode() == var4.hashCode() : true);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test263"); }


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
    crystal.client.ClientPreferences var21 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var21
    assertTrue("Contract failed: equals-hashcode on var4 and var21", var4.equals(var21) ? var4.hashCode() == var21.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var21 and var4
    assertTrue("Contract failed: equals-hashcode on var21 and var4", var21.equals(var4) ? var21.hashCode() == var4.hashCode() : true);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test264"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test265"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "2013-08-28T20-44-41.156-0700", "10 ms", 0L);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test266"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("0 ms");
    crystal.client.ClientPreferences var13 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var13
    assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var13 and var4
    assertTrue("Contract failed: equals-hashcode on var13 and var4", var13.equals(var4) ? var13.hashCode() == var4.hashCode() : true);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test267"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(false);
    boolean var6 = var0.isEnabled();
    var0.enable(false);
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test268"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var26 = var16.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test269"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    long var8 = var4.getRefresh();
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var12 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1L));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test270"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    long var14 = var5.getRefresh();
    long var15 = var5.getRefresh();
    java.util.Collection var16 = var5.getProjectPreference();
    java.awt.Image var17 = crystal.model.Relationship.getDominant(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var16);
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
    assertNull(var17);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test271"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "1 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test272"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "-1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test273"); }


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
      crystal.util.ValidInputChecker.checkStringInSet("1 ms", var41);
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

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test274"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test275"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    java.util.Collection var17 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test276"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "1 ms", "1 ms", 10L);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test277"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("382707 hours 44 min");
    var4.setGitPath("10 ms");

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test278"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    java.lang.String var5 = var4.getHgPath();
    var4.setHgPath("hi!");
    var4.setRefresh((-1L));
    java.lang.String var10 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10 ms"+ "'", var5.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test279"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setTempDirectory("0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test280"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test281"); }


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
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    
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

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test282"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = crystal.util.XMLTools.writeXMLDocument(var1, "");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test283"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("-1 ms");
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

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test284"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    var0.enable(false);
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getRelationships();
    var0.removeAllListeners();
    
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

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test285"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 10L);
    java.lang.String var5 = var4.getHgPath();
    var4.setHgPath("hi!");
    var4.setGitPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10 ms"+ "'", var5.equals("10 ms"));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test286"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test287"); }


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
    java.awt.Image var35 = crystal.model.Relationship.getDominant(var33);
    java.awt.Image var36 = crystal.model.Relationship.getDominant(var33);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test288"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "2013-08-28T20-44-41.156-0700", 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var6 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test289"); }


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
    var4.setTempDirectory("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1L);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test290"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "382707 hours 44 min", "10 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test291"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(false);
    java.util.Collection var11 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test292"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test293"); }


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
    var4.setHgPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "10 ms"+ "'", var25.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test294"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    java.util.Collection var7 = var4.getProjectPreference();
    var4.setHgPath("0 ms");
    var4.setGitPath("100 ms");
    long var12 = var4.getRefresh();
    var4.setGitPath("-1 ms");
    var4.setRefresh((-1L));
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

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test295"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test296"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setRefresh(1L);
    var4.setGitPath("1 ms");
    crystal.client.ConflictDaemon var20 = crystal.client.ConflictDaemon.getInstance();
    var20.removeAllListeners();
    var20.enable(true);
    var20.enable(false);
    java.util.Collection var26 = var20.getRelationships();
    boolean var27 = var20.isEnabled();
    var20.removeAllListeners();
    boolean var29 = var20.isEnabled();
    java.util.Collection var30 = var20.getLocalStates();
    boolean var31 = var4.equals((java.lang.Object)var20);
    var20.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test297"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "0 ms", "0 ms", 1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test298"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "1 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test299"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
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

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test300"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    java.util.Collection var16 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var18 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test301"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "382707 hours 44 min");
    
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

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test302"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(true);
    java.util.Collection var17 = var4.getProjectPreference();
    java.lang.String var18 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test303"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.util.Collection var8 = var4.getProjectPreference();
    java.lang.String var9 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test304"); }


    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"100 ms");

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test305"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
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

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test306"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setGitPath("hi!");
    java.util.Collection var14 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("-1 ms", var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test307"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "-1 ms", "382707 hours 44 min", 1L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test308"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    var1.enable(false);
    java.util.Collection var7 = var1.getRelationships();
    boolean var8 = var1.isEnabled();
    var1.removeAllListeners();
    boolean var10 = var1.isEnabled();
    java.util.Collection var11 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("", var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test309"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "10 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test310"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
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

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test311"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "0 ms", "-1 ms", 10L);
    java.lang.String var5 = var4.getHgPath();
    java.lang.String var6 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0 ms"+ "'", var5.equals("0 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "0 ms"+ "'", var6.equals("0 ms"));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test312"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("100 ms", "382707 hours 44 min", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test313"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "382707 hours 44 min", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test314"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "100 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test315"); }


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
    var18.setRefresh(1L);
    
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

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test316"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    long var16 = var4.getRefresh();
    java.util.Collection var17 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var20 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test317"); }


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
    java.util.Collection var25 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test318"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("382707 hours 44 min", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test319"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "100 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test320"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "10 ms", "10 ms", 10L);
    var4.setGitPath("382707 hours 44 min");
    boolean var7 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test321"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getLocalStates();
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

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test322"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.awt.Image var6 = crystal.model.Relationship.getDominant(var4);
    
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
    assertNull(var6);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test323"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "-1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test324"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "0 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test325"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test326"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "1 ms", "-1 ms", 1L);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test327"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "-1 ms", "2013-08-28T20-44-41.156-0700", 1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test328"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test329"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "1 ms", "2013-08-28T20-44-41.156-0700", 100L);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test330"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences var17 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var18 = var17.getRefresh();
    var17.setTempDirectory("10 ms");
    boolean var21 = var4.equals((java.lang.Object)"10 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var23 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test331"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "2013-08-28T20-44-41.156-0700", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ConflictDaemon var6 = crystal.client.ConflictDaemon.getInstance();
    var6.enable(true);
    var6.removeAllListeners();
    java.util.Collection var10 = var6.getRelationships();
    java.util.Collection var11 = var6.getLocalStates();
    boolean var12 = var4.equals((java.lang.Object)var11);
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test332"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "0 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test333"); }


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
    org.jdom.Document var39 = crystal.util.XMLTools.newXMLErrorDocument("0 ms");
    boolean var41 = crystal.util.XMLTools.writeXMLDocument(var39, "0 ms");
    boolean var42 = var23.equals((java.lang.Object)"0 ms");
    var23.setRefresh(1L);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test334"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "100 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test335"); }


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
    var10.setChanged(false);
    crystal.client.ConflictDaemon var26 = crystal.client.ConflictDaemon.getInstance();
    var26.enable(true);
    var26.enable(true);
    boolean var31 = var26.isEnabled();
    boolean var32 = var10.equals((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test336"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    long var16 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test337"); }


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
    var23.setTempDirectory("2013-08-28T20-44-41.156-0700");
    
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

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test338"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("0 ms", "hi!", "hi!", 1L);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test339"); }


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
    java.lang.String var20 = var4.getTempDirectory();
    java.lang.String var21 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test340"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    var4.setHgPath("hi!");
    var4.setGitPath("100 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test341"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("", "");
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test342"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var6 = var5.getRefresh();
    java.lang.String var7 = var5.getTempDirectory();
    var5.setGitPath("hi!");
    var5.setHgPath("100 ms");
    java.util.Collection var12 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var12);
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

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test343"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    java.lang.String var11 = var4.getGitPath();
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");
    var4.setRefresh(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test344"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "0 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test345"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test346"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
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

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test347"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test348"); }


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
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var17);
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

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test349"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    long var15 = var4.getRefresh();
    var4.setRefresh(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100L);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test350"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("100 ms", "hi!", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test351"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "100 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test352"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
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

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test353"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test354"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("1 ms", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test355"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("10 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test356"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test357"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    boolean var19 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test358"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getRelationships();
    java.awt.Image var6 = crystal.model.Relationship.getDominant(var5);
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test359"); }


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
    var14.enable(false);
    boolean var22 = var14.isEnabled();
    var14.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test360"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "100 ms", 1L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test361"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    var4.setHgPath("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var24 = var4.getProjectPreferences("100 ms");
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

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test362"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var24);
    var24.setTempDirectory("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test363"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "0 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test364"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test365"); }


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
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var20);
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

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test366"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "", "382707 hours 44 min", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test367"); }


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
    java.util.Collection var22 = var4.getProjectPreference();
    java.util.Collection var23 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test368"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getRelationships();
    java.util.Collection var7 = var0.getLocalStates();
    boolean var8 = var0.isEnabled();
    
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
    assertTrue(var8 == true);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test369"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "0 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test370"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setHgPath("100 ms");
    java.lang.String var11 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var13 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100 ms"+ "'", var11.equals("100 ms"));

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test371"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "100 ms", "382707 hours 44 min", 100L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getGitPath();
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(true);
    java.lang.String var10 = var4.getGitPath();
    boolean var11 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "382707 hours 44 min"+ "'", var6.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100 ms"+ "'", var7.equals("100 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "382707 hours 44 min"+ "'", var10.equals("382707 hours 44 min"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test372"); }


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
    crystal.client.ClientPreferences var26 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var26
    assertTrue("Contract failed: equals-hashcode on var4 and var26", var4.equals(var26) ? var4.hashCode() == var26.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var26 and var4
    assertTrue("Contract failed: equals-hashcode on var26 and var4", var26.equals(var4) ? var26.hashCode() == var4.hashCode() : true);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test373"); }


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
    long var32 = var4.getRefresh();
    
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
    assertTrue(var32 == 100L);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test374"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "10 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test375"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    boolean var4 = var0.isEnabled();
    var0.enable(true);
    java.util.Collection var7 = var0.getLocalStates();
    java.util.Collection var8 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test376"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getTempDirectory();
    boolean var11 = var4.hasChanged();
    var4.setGitPath("382707 hours 44 min");
    java.lang.String var14 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var10.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var14.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test377"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "1 ms", "-1 ms", 1L);
    crystal.client.ClientPreferences var5 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var5
    assertTrue("Contract failed: equals-hashcode on var4 and var5", var4.equals(var5) ? var4.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var4
    assertTrue("Contract failed: equals-hashcode on var5 and var4", var5.equals(var4) ? var5.hashCode() == var4.hashCode() : true);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test378"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "1 ms", "hi!", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test379"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test380"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    java.util.Collection var3 = var0.getLocalStates();
    var0.enable(true);
    boolean var6 = var0.isEnabled();
    boolean var7 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test381"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("1 ms", "-1 ms", "0 ms", 10L);
    var4.setTempDirectory("2013-08-28T20-44-41.156-0700");

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test382"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var21.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test383"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    java.util.Collection var7 = var4.getProjectPreference();
    var4.setHgPath("0 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var11 = var4.getHgPath();
    java.util.Collection var12 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "0 ms"+ "'", var11.equals("0 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test384"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    long var14 = var4.getRefresh();
    java.lang.String var15 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var15.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test385"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setGitPath("100 ms");
    java.lang.String var14 = var4.getHgPath();
    boolean var15 = var4.hasChanged();
    long var16 = var4.getRefresh();
    var4.setGitPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test386"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var6 = var5.getRefresh();
    var5.setGitPath("-1 ms");
    var5.setGitPath("100 ms");
    java.util.Collection var11 = var5.getProjectPreference();
    java.awt.Image var12 = crystal.model.Relationship.getDominant(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var11);
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

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test387"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "382707 hours 44 min", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test388"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "100 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test389"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "1 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test390"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "-1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test391"); }


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
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100L);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test392"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test393"); }


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
    crystal.client.ClientPreferences var21 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var21
    assertTrue("Contract failed: equals-hashcode on var4 and var21", var4.equals(var21) ? var4.hashCode() == var21.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var21 and var4
    assertTrue("Contract failed: equals-hashcode on var21 and var4", var21.equals(var4) ? var21.hashCode() == var4.hashCode() : true);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test394"); }


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
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test395"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test396"); }


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
    java.lang.String var26 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "0 ms"+ "'", var25.equals("0 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var26.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test397"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "1 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test398"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    var4.setChanged(true);
    var4.setRefresh((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test399"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test400"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "382707 hours 44 min", "0 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test401"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getRelationships();
    java.awt.Image var4 = crystal.model.Relationship.getDominant(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test402"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var11 = var4.getHgPath();
    long var12 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10L);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test403"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setRefresh(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test404"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setTempDirectory("0 ms");
    var4.setTempDirectory("1 ms");
    var4.setTempDirectory("0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test405"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var18 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test406"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getGitPath();
    var4.setHgPath("");
    java.lang.String var16 = var4.getTempDirectory();
    crystal.client.ConflictDaemon var17 = crystal.client.ConflictDaemon.getInstance();
    boolean var18 = var17.isEnabled();
    java.util.Collection var19 = var17.getLocalStates();
    java.util.Collection var20 = var17.getLocalStates();
    boolean var21 = var4.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var16.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test407"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "2013-08-28T20-44-41.156-0700", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test408"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "0 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test409"); }


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
    var4.setRefresh(100L);
    var4.setTempDirectory("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test410"); }


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
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1L);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test411"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(false);
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    java.util.Collection var8 = var0.getRelationships();
    java.util.Collection var9 = var0.getRelationships();
    java.awt.Image var10 = crystal.model.Relationship.getDominant(var9);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test412"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setRefresh(1L);
    var4.setChanged(false);
    java.lang.String var14 = var4.getTempDirectory();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test413"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getGitPath();
    boolean var11 = var4.hasChanged();
    crystal.client.ClientPreferences var12 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var12
    assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var12 and var4
    assertTrue("Contract failed: equals-hashcode on var12 and var4", var12.equals(var4) ? var12.hashCode() == var4.hashCode() : true);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test414"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    java.util.Collection var6 = var0.getLocalStates();
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

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test415"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "1 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test416"); }


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

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test417"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getGitPath();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var16 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var16.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test418"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.enable(true);
    var0.removeAllListeners();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test419"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    java.awt.Image var5 = crystal.model.Relationship.getDominant(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test420"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setRefresh(0L);
    var4.setChanged(true);
    crystal.client.ClientPreferences var17 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var17.setGitPath("10 ms");
    var17.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var17, "100 ms");
    java.lang.String var24 = var17.getHgPath();
    var17.setChanged(false);
    java.util.Collection var27 = var17.getProjectPreference();
    boolean var28 = var4.equals((java.lang.Object)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var30 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test421"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("382707 hours 44 min", var2, "10 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test422"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "100 ms", "", 100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test423"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.util.ValidInputChecker var15 = new crystal.util.ValidInputChecker();
    boolean var16 = var4.equals((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test424"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "0 ms", "10 ms", 100L);
    var4.setChanged(true);
    boolean var7 = var4.hasChanged();
    var4.setHgPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test425"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var11 = var4.getHgPath();
    var4.setChanged(false);
    var4.setChanged(true);
    crystal.client.ClientPreferences var20 = new crystal.client.ClientPreferences("-1 ms", "hi!", "", 10L);
    boolean var21 = var4.equals((java.lang.Object)"-1 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test426"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test427"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    java.util.Collection var15 = var5.getProjectPreference();
    var5.setGitPath("100 ms");
    java.util.Collection var18 = var5.getProjectPreference();
    java.awt.Image var19 = crystal.model.Relationship.getDominant(var18);
    java.awt.Image var20 = crystal.model.Relationship.getDominant(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test428"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test429"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setTempDirectory("0 ms");
    var4.setChanged(true);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test430"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "382707 hours 44 min", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test431"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "hi!", "1 ms", 1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test432"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "-1 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test433"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("100 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    
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

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test434"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("1 ms", var2, "100 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test435"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("100 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "1 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var9 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    
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

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test436"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    long var15 = var4.getRefresh();
    var4.setHgPath("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100L);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test437"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var10 = var4.getGitPath();
    java.lang.String var11 = var4.getGitPath();
    java.lang.String var12 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10 ms"+ "'", var10.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10 ms"+ "'", var11.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test438"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "100 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test439"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "-1 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test440"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    java.util.Collection var2 = var0.getRelationships();
    java.util.Collection var3 = var0.getRelationships();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test441"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setTempDirectory("10 ms");
    java.util.Collection var8 = var4.getProjectPreference();
    var4.setRefresh(10L);
    crystal.client.ConflictDaemon var11 = crystal.client.ConflictDaemon.getInstance();
    boolean var12 = var11.isEnabled();
    java.util.Collection var13 = var11.getLocalStates();
    var11.removeAllListeners();
    var11.enable(false);
    java.util.Collection var17 = var11.getLocalStates();
    boolean var18 = var11.isEnabled();
    java.util.Collection var19 = var11.getRelationships();
    boolean var20 = var4.equals((java.lang.Object)var11);
    var4.setRefresh(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test442"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "-1 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test443"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "1 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test444"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("10 ms");
    java.lang.String var12 = var4.getHgPath();
    java.lang.String var13 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10 ms"+ "'", var12.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test445"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var6 = var0.getRelationships();
    boolean var7 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test446"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.util.Collection var13 = var4.getProjectPreference();
    java.util.Collection var14 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var16 = var4.getProjectPreferences("1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test447"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    var5.setGitPath("10 ms");
    var5.setRefresh(1L);
    var5.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var14 = var5.getHgPath();
    crystal.client.ConflictDaemon var15 = crystal.client.ConflictDaemon.getInstance();
    var15.enable(true);
    java.util.Collection var18 = var15.getRelationships();
    java.util.Collection var19 = var15.getRelationships();
    boolean var20 = var5.equals((java.lang.Object)var19);
    java.util.Collection var21 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var14.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test448"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "0 ms", "", 1L);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test449"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test450"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test451"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(false);
    var0.enable(false);
    var0.enable(true);
    java.util.Collection var10 = var0.getLocalStates();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test452"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    java.lang.String var17 = var4.getTempDirectory();
    var4.setGitPath("");
    long var20 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100L);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test453"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "-1 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test454"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("1 ms", "-1 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test455"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    var5.setGitPath("10 ms");
    var5.setRefresh(0L);
    crystal.client.ClientPreferences var16 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var16.setGitPath("10 ms");
    var16.setTempDirectory("");
    var16.setChanged(true);
    var16.setRefresh(100L);
    java.lang.String var25 = var16.getTempDirectory();
    java.lang.String var26 = var16.getGitPath();
    boolean var27 = var5.equals((java.lang.Object)var16);
    java.util.Collection var28 = var5.getProjectPreference();
    java.awt.Image var29 = crystal.model.Relationship.getDominant(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "10 ms"+ "'", var26.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test456"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    var4.setGitPath("");
    var4.setGitPath("hi!");

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test457"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    var4.setRefresh((-1L));
    java.lang.String var15 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test458"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test459"); }


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
    java.util.Collection var23 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test460"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setTempDirectory("0 ms");
    var4.setTempDirectory("1 ms");
    var4.setTempDirectory("0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test461"); }


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
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "0 ms"+ "'", var25.equals("0 ms"));

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test462"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "382707 hours 44 min", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test463"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    java.lang.String var11 = var4.getHgPath();
    long var12 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10L);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test464"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("10 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test465"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("100 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var1);
    boolean var4 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test466"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    boolean var9 = var4.hasChanged();
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

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test467"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var10 = var4.hasChanged();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    boolean var13 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test468"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("382707 hours 44 min");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
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

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test469"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test470"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    boolean var14 = var4.hasChanged();
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test471"); }


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
    var4.setTempDirectory("100 ms");
    var4.setHgPath("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test472"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test473"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var28 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
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

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test474"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("10 ms", "-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test475"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("hi!", "1 ms", "", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test476"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    java.lang.String var7 = var4.getHgPath();
    long var8 = var4.getRefresh();
    var4.setHgPath("1 ms");
    crystal.client.ConflictDaemon var11 = crystal.client.ConflictDaemon.getInstance();
    var11.removeAllListeners();
    var11.enable(true);
    java.util.Collection var15 = var11.getRelationships();
    var11.removeAllListeners();
    var11.removeAllListeners();
    boolean var18 = var11.isEnabled();
    boolean var19 = var11.isEnabled();
    boolean var20 = var11.isEnabled();
    boolean var21 = var4.equals((java.lang.Object)var20);
    var4.setGitPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10 ms"+ "'", var7.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test477"); }


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
    org.jdom.Document var39 = crystal.util.XMLTools.newXMLErrorDocument("0 ms");
    boolean var41 = crystal.util.XMLTools.writeXMLDocument(var39, "0 ms");
    boolean var42 = var23.equals((java.lang.Object)"0 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var23, "2013-08-28T20-44-41.156-0700");
    java.lang.String var45 = var23.getGitPath();
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "10 ms"+ "'", var45.equals("10 ms"));

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test478"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "-1 ms", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test479"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("-1 ms", "0 ms", "hi!", 100L);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test480"); }


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
    java.awt.Image var30 = crystal.model.Relationship.getDominant(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test481"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    crystal.client.ClientPreferences var16 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var16
    assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var16 and var4
    assertTrue("Contract failed: equals-hashcode on var16 and var4", var16.equals(var4) ? var16.hashCode() == var4.hashCode() : true);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test482"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    boolean var7 = var4.hasChanged();
    boolean var8 = var4.hasChanged();
    boolean var9 = var4.hasChanged();
    var4.setGitPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test483"); }


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
    var4.setHgPath("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test484"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    boolean var6 = var4.hasChanged();
    java.lang.String var7 = var4.getTempDirectory();
    java.lang.String var8 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var7.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test485"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    org.jdom.Document var9 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var10 = var4.equals((java.lang.Object)var9);
    boolean var12 = crystal.util.XMLTools.writeXMLDocument(var9, "0 ms");
    boolean var14 = crystal.util.XMLTools.writeXMLDocument(var9, "-1 ms");
    boolean var16 = crystal.util.XMLTools.writeXMLDocument(var9, "10 ms");
    boolean var18 = crystal.util.XMLTools.writeXMLDocument(var9, "382707 hours 44 min");
    
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

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test486"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "382707 hours 44 min", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test487"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "382707 hours 44 min", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test488"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "0 ms");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "1 ms");
    crystal.client.ClientPreferences var22 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var22
    assertTrue("Contract failed: equals-hashcode on var4 and var22", var4.equals(var22) ? var4.hashCode() == var22.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var22 and var4
    assertTrue("Contract failed: equals-hashcode on var22 and var4", var22.equals(var4) ? var22.hashCode() == var4.hashCode() : true);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test489"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("1 ms", "hi!", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test490"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setGitPath("hi!");
    java.lang.String var13 = var4.getTempDirectory();
    var4.setHgPath("");
    java.util.Collection var16 = var4.getProjectPreference();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test491"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("0 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test492"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "382707 hours 44 min", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test493"); }


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
    boolean var20 = var4.hasChanged();
    java.util.Collection var21 = var4.getProjectPreference();
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test494"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("-1 ms", "", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test495"); }


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
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test496"); }


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
    java.awt.Image var31 = crystal.model.Relationship.getDominant(var30);
    java.awt.Image var32 = crystal.model.Relationship.getDominant(var30);
    
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
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test497"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test498"); }


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
    var4.setGitPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "382707 hours 44 min"+ "'", var19.equals("382707 hours 44 min"));

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test499"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
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

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test500"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getRelationships();
    java.util.Collection var4 = var0.getRelationships();
    java.util.Collection var5 = var0.getRelationships();
    var0.enable(true);
    boolean var8 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

}
