package randoop.crystal;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    crystal.model.RevisionHistory.Ease var0 = crystal.server.GuidanceChecker.getEase();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var1 = crystal.util.TimeUtility.parseLSMRDate("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.HashMap var1 = crystal.server.GitLogParser.parseLog("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    boolean var1 = crystal.util.ValidInputChecker.checkUrl("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadable(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10 ms"+ "'", var1.equals("10 ms"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = crystal.util.RunIt.getExecutable("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "hi!", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "hi!", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    crystal.server.GitStateChecker var0 = new crystal.server.GitStateChecker();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "10 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var0 = crystal.client.ClientPreferences.loadPreferencesFromDefaultXML();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    crystal.util.LSMRLogger.startLog4J(false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    crystal.util.ValidInputChecker.checkValidStringInput("10 ms");

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    boolean var1 = crystal.util.ValidInputChecker.checkDirectoryPath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    crystal.util.XMLTools var0 = new crystal.util.XMLTools();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "10 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String var0 = crystal.util.TimeUtility.getCurrentLSMRDateString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var0.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    crystal.util.LSMRLogger.startLog4J(true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    boolean var1 = crystal.util.ValidInputChecker.checkUrl("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "10 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("10 ms", "hi!", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    boolean var1 = crystal.util.ValidInputChecker.checkDirectoryPath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    boolean var1 = crystal.util.ValidInputChecker.checkUrl("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    crystal.util.ValidInputChecker.checkValidStringInput("hi!");

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    crystal.util.LSMRLogger.startLog4J();

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    crystal.util.SpringLayoutUtility var0 = new crystal.util.SpringLayoutUtility();

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("hi!", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    crystal.server.HgLogParser var0 = new crystal.server.HgLogParser();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("10 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    crystal.util.RunIt var0 = new crystal.util.RunIt();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidDirectoryPath("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences var9 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var9
    assertTrue("Contract failed: equals-hashcode on var4 and var9", var4.equals(var9) ? var4.hashCode() == var9.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var9 and var4
    assertTrue("Contract failed: equals-hashcode on var9 and var4", var9.equals(var4) ? var9.hashCode() == var4.hashCode() : true);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    java.lang.Object var0 = new java.lang.Object();
    crystal.util.ValidInputChecker.checkNullInput(var0);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences var5 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var5
    assertTrue("Contract failed: equals-hashcode on var4 and var5", var4.equals(var5) ? var4.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var4
    assertTrue("Contract failed: equals-hashcode on var5 and var4", var5.equals(var4) ? var5.hashCode() == var4.hashCode() : true);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("2013-08-28T20-44-41.156-0700", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    org.jdom.Document var0 = crystal.util.XMLTools.newXMLDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = crystal.util.XMLTools.writeXMLDocument(var0, "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var10 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    java.lang.String var1 = crystal.util.RunIt.getExecutable("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10 ms"+ "'", var1.equals("10 ms"));

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("", "10 ms");
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    crystal.server.GuidanceChecker var0 = new crystal.server.GuidanceChecker();

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "10 ms", "hi!", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadable(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100 ms"+ "'", var1.equals("100 ms"));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadableDelta(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "382707 hours 44 min"+ "'", var1.equals("382707 hours 44 min"));

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadableDelta((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "382707 hours 44 min"+ "'", var1.equals("382707 hours 44 min"));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    crystal.Constants var0 = new crystal.Constants();

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    java.util.HashMap var1 = crystal.server.GitLogParser.parseLog("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var11 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "hi!", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "382707 hours 44 min", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    java.util.HashMap var1 = crystal.server.GitLogParser.parseLog("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("382707 hours 44 min", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("382707 hours 44 min", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
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

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    java.util.HashMap var1 = crystal.server.GitLogParser.parseLog("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    java.lang.String var1 = crystal.util.RunIt.getExecutable("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    java.util.HashMap var1 = crystal.server.HgLogParser.parseLog("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "2013-08-28T20-44-41.156-0700", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    crystal.util.ValidInputChecker.checkNonNegativeNumberInput(0);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    boolean var1 = crystal.util.ValidInputChecker.checkCommand("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var3);
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

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    java.awt.Image var4 = crystal.model.Relationship.getDominant(var3);
    java.awt.Image var5 = crystal.model.Relationship.getDominant(var3);
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
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadable(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0 ms"+ "'", var1.equals("0 ms"));

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "10 ms", "10 ms", 10L);
    crystal.client.ClientPreferences var5 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var5
    assertTrue("Contract failed: equals-hashcode on var4 and var5", var4.equals(var5) ? var4.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var4
    assertTrue("Contract failed: equals-hashcode on var5 and var4", var5.equals(var4) ? var5.hashCode() == var4.hashCode() : true);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    boolean var1 = crystal.util.ValidInputChecker.checkUrl("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    boolean var1 = crystal.util.ValidInputChecker.checkStringToLong("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "100 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("hi!", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
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

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidDirectoryPath("100 ms");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("100 ms", var2, "100 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "382707 hours 44 min", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    boolean var1 = crystal.util.ValidInputChecker.checkDirectoryPath("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    java.lang.String var1 = crystal.util.RunIt.getExecutable("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidFilePath("382707 hours 44 min");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "0 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidDirectoryPath("10 ms");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("382707 hours 44 min", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    crystal.util.LSMRLogger var0 = new crystal.util.LSMRLogger();

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var15 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    crystal.util.ValidInputChecker.checkNonNegativeNumberInput(10);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "2013-08-28T20-44-41.156-0700", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    boolean var1 = crystal.util.ValidInputChecker.checkCommand("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "100 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    java.util.Date var1 = crystal.util.TimeUtility.parseLSMRDate("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    crystal.util.ValidInputChecker.checkValidFilePath("100 ms");

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "", "2013-08-28T20-44-41.156-0700", 0L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    boolean var1 = crystal.util.ValidInputChecker.checkDirectoryPath("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "100 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "100 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    boolean var1 = crystal.util.ValidInputChecker.checkCommand("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
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

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    java.util.HashMap var1 = crystal.server.HgLogParser.parseLog("382707 hours 44 min");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    java.util.HashMap var1 = crystal.server.HgLogParser.parseLog("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadableDelta(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "382707 hours 44 min"+ "'", var1.equals("382707 hours 44 min"));

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    crystal.util.ValidInputChecker.checkValidFilePath("10 ms");

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
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

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidDirectoryPath("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setChanged(true);
    var5.setGitPath("10 ms");
    var5.setRefresh(1L);
    var5.setRefresh(10L);
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

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    java.util.Date var1 = crystal.util.TimeUtility.parseLSMRDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var15 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    java.awt.Image var4 = crystal.model.Relationship.getDominant(var3);
    java.awt.Image var5 = crystal.model.Relationship.getDominant(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("100 ms", var3);
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

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    boolean var1 = crystal.util.ValidInputChecker.checkStringToLong("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    crystal.server.HgStateChecker var0 = new crystal.server.HgStateChecker();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var0);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
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

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("0 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    java.util.HashMap var1 = crystal.server.HgLogParser.parseLog("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    boolean var1 = crystal.util.ValidInputChecker.checkCommand("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidStringInput("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)(byte)(-1));

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    crystal.util.ValidInputChecker.checkValidStringInput("0 ms");

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("", "382707 hours 44 min");
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var17 = var4.getProjectPreferences("hi!");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    crystal.util.ValidInputChecker.checkNonNegativeNumberInput(1);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "10 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    boolean var1 = crystal.util.ValidInputChecker.checkStringToLong("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
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

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    crystal.util.ValidInputChecker.checkNonNegativeNumberInput(100);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("2013-08-28T20-44-41.156-0700", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "0 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var8 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    var4.setTempDirectory("0 ms");

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    java.awt.Image var4 = crystal.model.Relationship.getDominant(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var3);
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

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "", "2013-08-28T20-44-41.156-0700", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    java.lang.String var1 = crystal.util.RunIt.getExecutable("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0 ms"+ "'", var1.equals("0 ms"));

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    var4.setChanged(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "hi!", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "10 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("382707 hours 44 min", "", "hi!", 100L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadableDelta(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "382707 hours 44 min"+ "'", var1.equals("382707 hours 44 min"));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "100 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    java.lang.String var1 = crystal.util.RunIt.getExecutable("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var1.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    java.util.HashMap var1 = crystal.server.GitLogParser.parseLog("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    java.util.Collection var3 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    java.util.Date var1 = crystal.util.TimeUtility.parseLSMRDate("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    boolean var1 = crystal.util.ValidInputChecker.checkStringToLong("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "0 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getRelationships();
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
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    long var18 = var4.getRefresh();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    boolean var1 = crystal.util.ValidInputChecker.checkUrl("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "382707 hours 44 min", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
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
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "10 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("100 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidFilePath("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    java.util.Date var1 = crystal.util.TimeUtility.parseLSMRDate("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
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

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    crystal.util.ValidInputChecker.checkValidStringInput("100 ms");

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    java.lang.String var13 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var13.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("100 ms", "hi!", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    boolean var1 = crystal.util.ValidInputChecker.checkStringToLong("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences var12 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var12
    assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var12 and var4
    assertTrue("Contract failed: equals-hashcode on var12 and var4", var12.equals(var4) ? var12.hashCode() == var4.hashCode() : true);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    boolean var1 = crystal.util.ValidInputChecker.checkCommand("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidFilePath("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
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

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    boolean var1 = crystal.util.ValidInputChecker.checkDirectoryPath("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "10 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
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

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    org.jdom.Document var0 = crystal.util.XMLTools.newXMLDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = crystal.util.XMLTools.writeXMLDocument(var0, "10 ms");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("0 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    java.lang.String var1 = crystal.util.RunIt.getExecutable("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100 ms"+ "'", var1.equals("100 ms"));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "382707 hours 44 min", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "10 ms", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    java.util.Date var1 = crystal.util.TimeUtility.parseLSMRDate("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadable((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1 ms"+ "'", var1.equals("-1 ms"));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
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
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "2013-08-28T20-44-41.156-0700", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidDirectoryPath("-1 ms");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var9 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
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

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("2013-08-28T20-44-41.156-0700", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    boolean var1 = crystal.util.ValidInputChecker.checkUrl("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "10 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("", "hi!");
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "10 ms", "0 ms", 0L);
    crystal.client.ClientPreferences var5 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var5
    assertTrue("Contract failed: equals-hashcode on var4 and var5", var4.equals(var5) ? var4.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var4
    assertTrue("Contract failed: equals-hashcode on var5 and var4", var5.equals(var4) ? var5.hashCode() == var4.hashCode() : true);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    crystal.util.ValidInputChecker.checkValidStringInput("-1 ms");

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "382707 hours 44 min", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getRelationships();
    java.util.Collection var5 = var1.getRelationships();
    java.awt.Image var6 = crystal.model.Relationship.getDominant(var5);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(false);
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var7);
    
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

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidDirectoryPath("382707 hours 44 min");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(10L);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)10L);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    boolean var7 = var4.hasChanged();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    boolean var1 = crystal.util.ValidInputChecker.checkDirectoryPath("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "382707 hours 44 min", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("-1 ms", "2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    java.awt.Image var4 = crystal.model.Relationship.getDominant(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var3);
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
    assertNull(var4);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.util.Collection var13 = var4.getProjectPreference();
    java.lang.String var14 = var4.getHgPath();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "hi!", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    boolean var1 = crystal.util.ValidInputChecker.checkCommand("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    java.lang.String var15 = var4.getGitPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10 ms"+ "'", var15.equals("10 ms"));

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "2013-08-28T20-44-41.156-0700", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getHgPath();
    crystal.client.ClientPreferences var18 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var18.setGitPath("10 ms");
    var18.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var18, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var18, "2013-08-28T20-44-41.156-0700");
    long var27 = var18.getRefresh();
    var18.setChanged(false);
    boolean var30 = var4.equals((java.lang.Object)false);
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "100 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    long var16 = var4.getRefresh();
    java.util.Collection var17 = var4.getProjectPreference();
    java.awt.Image var18 = crystal.model.Relationship.getDominant(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("10 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var12 = var4.getProjectPreferences("-1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("100 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


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
      crystal.client.ProjectPreferences var21 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
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

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("100 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("-1 ms", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    crystal.util.ValidInputChecker.checkValidFilePath("2013-08-28T20-44-41.156-0700");

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getRelationships();
    java.util.Collection var5 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var5);
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

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
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

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    java.lang.String var15 = var5.getGitPath();
    var5.setChanged(true);
    java.util.Collection var18 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var18);
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

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
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

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    long var16 = var4.getRefresh();
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
    assertTrue(var16 == 10L);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
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

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    var4.setRefresh(10L);
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

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(true);
    java.util.Collection var17 = var4.getProjectPreference();
    crystal.client.ClientPreferences var18 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var7 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "382707 hours 44 min", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "hi!", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("hi!", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidDirectoryPath("0 ms");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "hi!", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "hi!", "hi!", 1L);
    java.lang.String var5 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10 ms"+ "'", var5.equals("10 ms"));

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "hi!", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    crystal.util.ValidInputChecker.checkValidStringInput("382707 hours 44 min");

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "10 ms", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadableDelta(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "382707 hours 44 min"+ "'", var1.equals("382707 hours 44 min"));

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
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

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "", "", 1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("10 ms", "hi!", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences var18 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var18
    assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var18 and var4
    assertTrue("Contract failed: equals-hashcode on var18 and var4", var18.equals(var4) ? var18.hashCode() == var4.hashCode() : true);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var19);
    
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

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "382707 hours 44 min", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    boolean var1 = crystal.util.ValidInputChecker.checkCommand("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
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

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
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
    assertTrue(var14 == 100L);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "382707 hours 44 min", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    java.util.HashMap var1 = crystal.server.HgLogParser.parseLog("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "100 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("100 ms", "hi!", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("100 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "2013-08-28T20-44-41.156-0700", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    crystal.util.ValidInputChecker.checkValidStringInput("2013-08-28T20-44-41.156-0700");

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("382707 hours 44 min", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setTempDirectory("0 ms");
    crystal.client.ClientPreferences var13 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var13
    assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var13 and var4
    assertTrue("Contract failed: equals-hashcode on var13 and var4", var13.equals(var4) ? var13.hashCode() == var4.hashCode() : true);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("hi!");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "10 ms");
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

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
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

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setGitPath("hi!");
    crystal.client.ClientPreferences var13 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var13
    assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var13 and var4
    assertTrue("Contract failed: equals-hashcode on var13 and var4", var13.equals(var4) ? var13.hashCode() == var4.hashCode() : true);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "0 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


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
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var22);
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

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
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

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "100 ms", "0 ms", 1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "", "10 ms", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    var4.setRefresh(10L);
    java.lang.String var16 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    java.lang.String var9 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"2013-08-28T20-44-41.156-0700");

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("0 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    crystal.util.ValidInputChecker.checkValidFilePath("0 ms");

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    java.util.HashMap var1 = crystal.server.GitLogParser.parseLog("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "100 ms", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getGitPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var12 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "10 ms", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("10 ms", "-1 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


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
    crystal.client.ClientPreferences var20 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var20
    assertTrue("Contract failed: equals-hashcode on var4 and var20", var4.equals(var20) ? var4.hashCode() == var20.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var20 and var4
    assertTrue("Contract failed: equals-hashcode on var20 and var4", var20.equals(var4) ? var20.hashCode() == var4.hashCode() : true);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    long var16 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10L);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("2013-08-28T20-44-41.156-0700", "", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "100 ms", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    boolean var7 = var4.hasChanged();
    var4.setTempDirectory("100 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var11 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "10 ms", "0 ms", 0L);
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"10 ms");

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.removeAllListeners();
    boolean var5 = var0.isEnabled();
    boolean var6 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("2013-08-28T20-44-41.156-0700", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    crystal.util.ValidInputChecker.checkValidFilePath("-1 ms");

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
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

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    var4.setChanged(true);
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

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "", "2013-08-28T20-44-41.156-0700", 0L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setHgPath("10 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var10 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    var4.setRefresh(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var12 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "hi!", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.enable(false);
    java.util.Collection var6 = var0.getLocalStates();
    boolean var7 = var0.isEnabled();
    boolean var8 = var0.isEnabled();
    
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
    assertTrue(var8 == false);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("2013-08-28T20-44-41.156-0700", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setHgPath("10 ms");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.removeAllListeners();
    var0.enable(true);
    var0.enable(true);
    boolean var6 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    crystal.client.ClientPreferences var9 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var9
    assertTrue("Contract failed: equals-hashcode on var4 and var9", var4.equals(var9) ? var4.hashCode() == var9.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var9 and var4
    assertTrue("Contract failed: equals-hashcode on var9 and var4", var9.equals(var4) ? var9.hashCode() == var4.hashCode() : true);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    java.util.HashMap var1 = crystal.server.HgLogParser.parseLog("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "10 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    java.util.Collection var12 = var5.getProjectPreference();
    java.awt.Image var13 = crystal.model.Relationship.getDominant(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("hi!", var2, "", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "382707 hours 44 min", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)10.0d);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "10 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("382707 hours 44 min", "hi!", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setRefresh((-1L));
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
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


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
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"382707 hours 44 min");

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("10 ms", "0 ms", "382707 hours 44 min", 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "hi!", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


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
    var4.setRefresh((-1L));
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

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("100 ms", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setTempDirectory("0 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


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
    java.lang.String var28 = var4.getTempDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("10 ms", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    boolean var11 = var4.hasChanged();
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    boolean var1 = crystal.util.ValidInputChecker.checkStringToLong("382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("382707 hours 44 min", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var12 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("hi!");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var12.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("-1 ms", var2, "-1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "100 ms", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    java.awt.Image var15 = crystal.model.Relationship.getDominant(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("382707 hours 44 min", "10 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


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
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setGitPath("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var17 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "-1 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    boolean var1 = crystal.util.ValidInputChecker.checkUrl("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)(byte)100);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG((-1.0d), "382707 hours 44 min", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var2 = crystal.util.RunIt.tryCommand("hi!", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("", "2013-08-28T20-44-41.156-0700", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(10.0d, "", "-1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var16 = var4.getProjectPreference();
    java.awt.Image var17 = crystal.model.Relationship.getDominant(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setHgPath("382707 hours 44 min");
    long var18 = var4.getRefresh();
    crystal.client.ClientPreferences var19 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var19
    assertTrue("Contract failed: equals-hashcode on var4 and var19", var4.equals(var19) ? var4.hashCode() == var19.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var19 and var4
    assertTrue("Contract failed: equals-hashcode on var19 and var4", var19.equals(var4) ? var19.hashCode() == var4.hashCode() : true);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getHgPath();
    java.lang.String var14 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var16 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
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

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("", var2, "0 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    crystal.client.ClientPreferences var11 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var11
    assertTrue("Contract failed: equals-hashcode on var4 and var11", var4.equals(var11) ? var4.hashCode() == var11.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var11 and var4
    assertTrue("Contract failed: equals-hashcode on var11 and var4", var11.equals(var4) ? var11.hashCode() == var4.hashCode() : true);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var7 = var1.getLocalStates();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    var0.enable(true);
    java.util.Collection var3 = var0.getLocalStates();
    java.util.Collection var4 = var0.getLocalStates();
    var0.removeAllListeners();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
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

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "hi!", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "", "100 ms", 0L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.lang.String var14 = var4.getGitPath();
    var4.setChanged(true);
    var4.setRefresh((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10 ms"+ "'", var14.equals("10 ms"));

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    var4.setChanged(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var16 = var4.getProjectPreferences("hi!");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    java.lang.String var18 = var4.getTempDirectory();
    crystal.client.ClientPreferences var19 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var19
    assertTrue("Contract failed: equals-hashcode on var4 and var19", var4.equals(var19) ? var4.hashCode() == var19.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var19 and var4
    assertTrue("Contract failed: equals-hashcode on var19 and var4", var19.equals(var4) ? var19.hashCode() == var4.hashCode() : true);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    org.jdom.Document var1 = crystal.util.XMLTools.newXMLErrorDocument("");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    boolean var5 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
    boolean var7 = crystal.util.XMLTools.writeXMLDocument(var1, "0 ms");
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

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
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

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "100 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    long var16 = var4.getRefresh();
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "382707 hours 44 min");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100L);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var20 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
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

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "-1 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("100 ms", var2, "100 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


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
    assertTrue(var18 == 100L);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    crystal.util.ValidInputChecker.checkValidDirectoryPath("hi!");

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


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

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    java.lang.String var1 = crystal.util.TimeUtility.msToHumanReadable(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1 ms"+ "'", var1.equals("1 ms"));

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    java.util.HashMap var1 = crystal.server.GitLogParser.parseLog("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    crystal.util.ValidInputChecker.checkValidFilePath("1 ms");

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "100 ms");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "hi!", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setChanged(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var19 = var4.getProjectPreferences("2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("0 ms", "382707 hours 44 min", "382707 hours 44 min");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


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
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var19.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("hi!", "hi!", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
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

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    var4.setRefresh(10L);
    boolean var16 = var4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setChanged(false);
    java.lang.String var10 = var4.getGitPath();
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
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    var4.setRefresh(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var8 = var4.getProjectPreferences("");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    java.lang.String[] var2 = new java.lang.String[] { "2013-08-28T20-44-41.156-0700"};
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

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("hi!", "hi!", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setTempDirectory("0 ms");
    boolean var9 = var4.hasChanged();
    crystal.client.ClientPreferences var10 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var10
    assertTrue("Contract failed: equals-hashcode on var4 and var10", var4.equals(var10) ? var4.hashCode() == var10.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var10 and var4
    assertTrue("Contract failed: equals-hashcode on var10 and var4", var10.equals(var4) ? var10.hashCode() == var4.hashCode() : true);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "-1 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    long var12 = var4.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10L);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    crystal.client.ClientPreferences var14 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var14
    assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var14 and var4
    assertTrue("Contract failed: equals-hashcode on var14 and var4", var14.equals(var4) ? var14.hashCode() == var4.hashCode() : true);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("10 ms", "", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.lang.String var15 = var4.getGitPath();
    crystal.client.ClientPreferences var16 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var16
    assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var16 and var4
    assertTrue("Contract failed: equals-hashcode on var16 and var4", var16.equals(var4) ? var16.hashCode() == var4.hashCode() : true);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


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
      crystal.util.ValidInputChecker.checkStringInSet("", var22);
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

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "10 ms", (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getLocalStates();
    java.util.Collection var5 = var1.getRelationships();
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    java.lang.String[] var2 = new java.lang.String[] { "100 ms"};
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

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    boolean var1 = crystal.util.ValidInputChecker.checkStringToLong("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "10 ms", "2013-08-28T20-44-41.156-0700", 0L);
    var4.setRefresh((-1L));
    var4.setHgPath("-1 ms");
    boolean var9 = var4.hasChanged();
    crystal.client.ClientPreferences var14 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var15 = var14.getRefresh();
    java.lang.String var16 = var14.getTempDirectory();
    var14.setGitPath("hi!");
    var14.setRefresh(0L);
    var14.setChanged(true);
    boolean var23 = var4.equals((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var16.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var28 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    boolean var1 = var0.isEnabled();
    java.util.Collection var2 = var0.getLocalStates();
    var0.removeAllListeners();
    java.util.Collection var4 = var0.getRelationships();
    boolean var5 = var0.isEnabled();
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
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var5.setGitPath("10 ms");
    var5.setTempDirectory("");
    var5.setChanged(true);
    var5.setRefresh(100L);
    java.lang.String var14 = var5.getTempDirectory();
    java.util.Collection var15 = var5.getProjectPreference();
    java.util.Collection var16 = var5.getProjectPreference();
    java.awt.Image var17 = crystal.model.Relationship.getDominant(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("0 ms", var16);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    var4.setRefresh(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100L);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "-1 ms", "");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "100 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    java.lang.String var16 = var4.getTempDirectory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var18 = var4.getProjectPreferences("1 ms");
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

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


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
    var4.setChanged(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var34 = var4.getProjectPreferences("382707 hours 44 min");
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

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("1 ms", var19);
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

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "1 ms", "382707 hours 44 min");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    boolean var1 = crystal.util.ValidInputChecker.checkCommand("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


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
      var4.removeProjectPreferencesAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(1);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var20.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    java.util.Date var1 = crystal.util.TimeUtility.parseLSMRDate("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    java.lang.String var6 = var4.getTempDirectory();
    var4.setGitPath("hi!");
    java.lang.String var9 = var4.getHgPath();
    var4.setChanged(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var6.equals("2013-08-28T20-44-41.156-0700"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "-1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "1 ms", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


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
    var4.setTempDirectory("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(10.0d, "10 ms", "100 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
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

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "0 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    var4.setGitPath("2013-08-28T20-44-41.156-0700");
    var4.setRefresh((-1L));

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    long var16 = var4.getRefresh();
    var4.setGitPath("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var20 = var4.getProjectPreferences("10 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100L);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.GitStateChecker.isGitRepository("2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700", "2013-08-28T20-44-41.156-0700");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    boolean var1 = crystal.util.ValidInputChecker.checkDirectoryPath("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    java.lang.String var7 = var5.getHgPath();
    java.util.Collection var8 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    org.jdom.Document var1 = crystal.util.XMLTools.readXMLDocument("0 ms");
    boolean var3 = crystal.util.XMLTools.writeXMLDocument(var1, "2013-08-28T20-44-41.156-0700");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(100.0d, "1 ms", "100 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    java.lang.String var7 = var5.getHgPath();
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "", "10 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
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

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(100.0d, "hi!", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    boolean var1 = crystal.util.ValidInputChecker.checkStringToLong("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setRefresh(100L);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "2013-08-28T20-44-41.156-0700");
    long var13 = var4.getRefresh();
    var4.setChanged(false);
    var4.setTempDirectory("10 ms");
    long var18 = var4.getRefresh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences.savePreferencesToXML(var4, "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "", "1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    boolean var2 = var1.isEnabled();
    java.util.Collection var3 = var1.getLocalStates();
    var1.removeAllListeners();
    java.util.Collection var5 = var1.getRelationships();
    boolean var6 = var1.isEnabled();
    java.util.Collection var7 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var7);
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

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    java.lang.String[] var2 = new java.lang.String[] { "-1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.executeTwice("10 ms", var2, "10 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    var4.setHgPath("382707 hours 44 min");
    java.util.Collection var12 = var4.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var14 = var4.getProjectPreferences("0 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    java.lang.String[] var2 = new java.lang.String[] { ""};
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

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    java.util.HashMap var1 = crystal.server.GitLogParser.parseLog("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("100 ms", "hi!", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    boolean var1 = crystal.util.ValidInputChecker.checkStringToLong("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    var4.setHgPath("2013-08-28T20-44-41.156-0700");
    boolean var13 = var4.hasChanged();
    var4.setChanged(true);
    var4.setHgPath("-1 ms");
    java.lang.String var18 = var4.getTempDirectory();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "2013-08-28T20-44-41.156-0700"+ "'", var18.equals("2013-08-28T20-44-41.156-0700"));

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    crystal.client.ClientPreferences var5 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var5);
    java.lang.String var7 = var5.getHgPath();
    java.util.Collection var8 = var5.getProjectPreference();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("2013-08-28T20-44-41.156-0700", var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    java.util.HashMap var1 = crystal.server.HgLogParser.parseLog("0 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.enable(true);
    java.util.Collection var4 = var1.getRelationships();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(0L);
    var4.setTempDirectory("100 ms");
    java.lang.String var13 = var4.getGitPath();
    java.util.Collection var14 = var4.getProjectPreference();
    var4.setGitPath("-1 ms");
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)"-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10 ms"+ "'", var13.equals("10 ms"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    java.util.Collection var15 = var4.getProjectPreference();
    var4.setHgPath("hi!");
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
    assertTrue(var14 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


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
    java.awt.Image var21 = crystal.model.Relationship.getDominant(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("382707 hours 44 min", var19);
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
    assertNull(var21);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    boolean var1 = crystal.util.ValidInputChecker.checkDirectoryPath("10 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    long var5 = var4.getRefresh();
    boolean var6 = var4.hasChanged();
    crystal.client.ClientPreferences var7 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var7
    assertTrue("Contract failed: equals-hashcode on var4 and var7", var4.equals(var7) ? var4.hashCode() == var7.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var7 and var4
    assertTrue("Contract failed: equals-hashcode on var7 and var4", var7.equals(var4) ? var7.hashCode() == var4.hashCode() : true);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "382707 hours 44 min", "", 10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    boolean var1 = crystal.util.ValidInputChecker.checkUrl("1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    crystal.client.ConflictDaemon var0 = crystal.client.ConflictDaemon.getInstance();
    java.util.Collection var1 = var0.getRelationships();
    var0.removeAllListeners();
    java.util.Collection var3 = var0.getLocalStates();
    var0.enable(true);
    var0.removeAllListeners();
    var0.removeAllListeners();
    var0.removeAllListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    var1.removeAllListeners();
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
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


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
    crystal.client.ClientPreferences var32 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var32
    assertTrue("Contract failed: equals-hashcode on var4 and var32", var4.equals(var32) ? var4.hashCode() == var32.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var32 and var4
    assertTrue("Contract failed: equals-hashcode on var32 and var4", var32.equals(var4) ? var32.hashCode() == var4.hashCode() : true);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var22 = var4.getProjectPreferences("1 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("100 ms", "100 ms", "100 ms", 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeProjectPreferencesAtIndex(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
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

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("0 ms", "382707 hours 44 min", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit((-1.0d), "100 ms", "10 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(0.0d, "382707 hours 44 min", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    java.lang.String[] var2 = new java.lang.String[] { "0 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("0 ms", var2, "382707 hours 44 min", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("", "100 ms", "100 ms", 0L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var6 = var4.getHgPath();
    var4.setChanged(true);
    java.lang.String var9 = var4.getHgPath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var11 = var4.getProjectPreferences("382707 hours 44 min");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("1 ms", "100 ms", "hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    java.lang.String var7 = var4.getHgPath();
    var4.setGitPath("-1 ms");
    crystal.client.ClientPreferences var10 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var10
    assertTrue("Contract failed: equals-hashcode on var4 and var10", var4.equals(var10) ? var4.hashCode() == var10.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var10 and var4
    assertTrue("Contract failed: equals-hashcode on var10 and var4", var10.equals(var4) ? var10.hashCode() == var4.hashCode() : true);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    java.util.Collection var3 = var1.getRelationships();
    java.util.Collection var4 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("1 ms", var4);
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

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    crystal.client.ClientPreferences.savePreferencesToXML(var4, "10 ms");
    java.lang.String var12 = var4.getHgPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    boolean var15 = var4.equals((java.lang.Object)(byte)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.client.ProjectPreferences var17 = var4.getProjectPreferences("100 ms");
      fail("Expected exception of type crystal.client.ClientPreferences.NonexistentProjectException");
    } catch (crystal.client.ClientPreferences.NonexistentProjectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "-1 ms", "hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    java.lang.String[] var2 = new java.lang.String[] { "1 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "hi!", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.server.HgStateChecker.isHgRepository("", "0 ms", "0 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


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
    crystal.client.ClientPreferences var42 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var42
    assertTrue("Contract failed: equals-hashcode on var4 and var42", var4.equals(var42) ? var4.hashCode() == var42.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var42 and var4
    assertTrue("Contract failed: equals-hashcode on var42 and var4", var42.equals(var4) ? var42.hashCode() == var4.hashCode() : true);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "2013-08-28T20-44-41.156-0700", "-1 ms");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


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
      crystal.util.ValidInputChecker.checkStringInSet("hi!", var22);
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

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    java.lang.String[] var2 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "2013-08-28T20-44-41.156-0700", true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validHG(1.0d, "2013-08-28T20-44-41.156-0700", "");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(1.0d, "100 ms", "0 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    java.lang.String[] var2 = new java.lang.String[] { "10 ms"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("10 ms", var2, "-1 ms", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    long var13 = var4.getRefresh();
    long var14 = var4.getRefresh();
    var4.setChanged(false);
    crystal.client.ClientPreferences var17 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var17
    assertTrue("Contract failed: equals-hashcode on var4 and var17", var4.equals(var17) ? var4.hashCode() == var17.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var17 and var4
    assertTrue("Contract failed: equals-hashcode on var17 and var4", var17.equals(var4) ? var17.hashCode() == var4.hashCode() : true);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setChanged(true);
    var4.setGitPath("10 ms");
    var4.setRefresh(1L);
    boolean var11 = var4.hasChanged();
    var4.setRefresh(1L);
    var4.setTempDirectory("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    var4.setChanged(true);
    var4.setRefresh(100L);
    java.lang.String var13 = var4.getTempDirectory();
    java.util.Collection var14 = var4.getProjectPreference();
    crystal.util.ValidInputChecker.checkNullInput((java.lang.Object)var4);
    java.util.Collection var16 = var4.getProjectPreference();
    var4.setHgPath("-1 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


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
    var4.setTempDirectory("100 ms");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100L);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    crystal.client.ClientPreferences var4 = new crystal.client.ClientPreferences("2013-08-28T20-44-41.156-0700", "hi!", "", 10L);
    var4.setGitPath("10 ms");
    var4.setTempDirectory("");
    crystal.client.ClientPreferences.savePreferencesToDefaultXML(var4);
    java.lang.String var10 = var4.getGitPath();
    java.util.Collection var11 = var4.getProjectPreference();
    crystal.client.ClientPreferences var12 = var4.clone();
    
    // Checks the contract:  equals-hashcode on var4 and var12
    assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var12 and var4
    assertTrue("Contract failed: equals-hashcode on var12 and var4", var12.equals(var4) ? var12.hashCode() == var4.hashCode() : true);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = crystal.util.RunIt.validGit(0.0d, "0 ms", "1 ms");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    java.lang.String[] var2 = new java.lang.String[] { "382707 hours 44 min"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.RunIt.Output var5 = crystal.util.RunIt.execute("", var2, "2013-08-28T20-44-41.156-0700", false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    crystal.client.ConflictDaemon var1 = crystal.client.ConflictDaemon.getInstance();
    var1.removeAllListeners();
    var1.enable(true);
    var1.enable(true);
    var1.enable(false);
    java.util.Collection var9 = var1.getLocalStates();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkStringInSet("10 ms", var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      crystal.util.ValidInputChecker.checkValidDirectoryPath("1 ms");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
